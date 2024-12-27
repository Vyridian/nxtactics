'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_skill {

  /**
   * @function skillmap_tactics
   * Returns the base skillmap
   * @param  {tactics} tactics
   * @return {skillmap}
   */
  static t_skillmap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_skillmap_tactics = {
    vx_type: nx_tactics_decks_skill.t_skillmap_tactics
  }

  // (func skillmap-tactics)
  static f_skillmap_tactics(tactics) {
    let output = nx_tactics_base.e_skillmap
    output = nx_tactics_base.f_skillmap_from_skilllist(
      vx_core.f_new({"any-1": nx_tactics_base.t_skill}, ":name", "Skill1")
    )
    return output
  }

  /**
   * @function tactics_skillmap_from_tactics
   * Returns a tactics updated with skillmap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_skillmap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_skillmap_from_tactics = {
    vx_type: nx_tactics_decks_skill.t_tactics_skillmap_from_tactics
  }

  // (func tactics-skillmap<-tactics)
  static f_tactics_skillmap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const skillmap = nx_tactics_decks_skill.f_skillmap_tactics(tactics)
        return vx_core.f_copy(tactics, ":skillmap", skillmap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "skillmap-tactics": nx_tactics_decks_skill.e_skillmap_tactics,
      "tactics-skillmap<-tactics": nx_tactics_decks_skill.e_tactics_skillmap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "skillmap-tactics": nx_tactics_decks_skill.t_skillmap_tactics,
      "tactics-skillmap<-tactics": nx_tactics_decks_skill.t_tactics_skillmap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/skill",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func skillmap-tactics)
    nx_tactics_decks_skill.t_skillmap_tactics['vx_value'] = {
      name          : "skillmap-tactics",
      pkgname       : "nx/tactics/decks/skill",
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
      fn            : nx_tactics_decks_skill.f_skillmap_tactics
    }

    // (func tactics-skillmap<-tactics)
    nx_tactics_decks_skill.t_tactics_skillmap_from_tactics['vx_value'] = {
      name          : "tactics-skillmap<-tactics",
      pkgname       : "nx/tactics/decks/skill",
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
      fn            : nx_tactics_decks_skill.f_tactics_skillmap_from_tactics
    }

  }
}
