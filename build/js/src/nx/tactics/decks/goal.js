'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_goal {

  /**
   * @function goalmap_tactics
   * Returns the base goalmap
   * @param  {tactics} tactics
   * @return {goalmap}
   */
  static t_goalmap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_goalmap_tactics = {
    vx_type: nx_tactics_decks_goal.t_goalmap_tactics
  }

  // (func goalmap-tactics)
  static f_goalmap_tactics(tactics) {
    let output = nx_tactics_base.e_goalmap
    output = nx_tactics_base.f_goalmap_from_goallist(
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_goallist},
        vx_core.f_new({"any-1": nx_tactics_base.t_goal}, ":name", "Research")
      )
    )
    return output
  }

  /**
   * @function tactics_goalmap_from_tactics
   * Returns a tactics updated with goalmap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_goalmap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_goalmap_from_tactics = {
    vx_type: nx_tactics_decks_goal.t_tactics_goalmap_from_tactics
  }

  // (func tactics-goalmap<-tactics)
  static f_tactics_goalmap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const goalmap = nx_tactics_decks_goal.f_goalmap_tactics(tactics)
        return vx_core.f_copy(tactics, ":goalmap", goalmap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "goalmap-tactics": nx_tactics_decks_goal.e_goalmap_tactics,
      "tactics-goalmap<-tactics": nx_tactics_decks_goal.e_tactics_goalmap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "goalmap-tactics": nx_tactics_decks_goal.t_goalmap_tactics,
      "tactics-goalmap<-tactics": nx_tactics_decks_goal.t_tactics_goalmap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/goal",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func goalmap-tactics)
    nx_tactics_decks_goal.t_goalmap_tactics['vx_value'] = {
      name          : "goalmap-tactics",
      pkgname       : "nx/tactics/decks/goal",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_goal.f_goalmap_tactics
    }

    // (func tactics-goalmap<-tactics)
    nx_tactics_decks_goal.t_tactics_goalmap_from_tactics['vx_value'] = {
      name          : "tactics-goalmap<-tactics",
      pkgname       : "nx/tactics/decks/goal",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_goal.f_tactics_goalmap_from_tactics
    }

  }
}
