'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scene {

  /**
   * @function scenemap_tactics
   * Returns the base scenemap
   * @param  {tactics} tactics
   * @return {scenemap}
   */
  static t_scenemap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_scenemap_tactics = {
    vx_type: nx_tactics_decks_scene.t_scenemap_tactics
  }

  // (func scenemap-tactics)
  static f_scenemap_tactics(tactics) {
    let output = nx_tactics_base.e_scenemap
    output = nx_tactics_base.f_scenemap_from_scenelist(
      vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "scene1")
    )
    return output
  }

  /**
   * @function tactics_scenemap_from_tactics
   * Returns a tactics updated with scenemap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_scenemap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_scenemap_from_tactics = {
    vx_type: nx_tactics_decks_scene.t_tactics_scenemap_from_tactics
  }

  // (func tactics-scenemap<-tactics)
  static f_tactics_scenemap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const scenemap = nx_tactics_decks_scene.f_scenemap_tactics(tactics)
        return vx_core.f_copy(tactics, ":scenemap", scenemap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "scenemap-tactics": nx_tactics_decks_scene.e_scenemap_tactics,
      "tactics-scenemap<-tactics": nx_tactics_decks_scene.e_tactics_scenemap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "scenemap-tactics": nx_tactics_decks_scene.t_scenemap_tactics,
      "tactics-scenemap<-tactics": nx_tactics_decks_scene.t_tactics_scenemap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scene",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func scenemap-tactics)
    nx_tactics_decks_scene.t_scenemap_tactics['vx_value'] = {
      name          : "scenemap-tactics",
      pkgname       : "nx/tactics/decks/scene",
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
      fn            : nx_tactics_decks_scene.f_scenemap_tactics
    }

    // (func tactics-scenemap<-tactics)
    nx_tactics_decks_scene.t_tactics_scenemap_from_tactics['vx_value'] = {
      name          : "tactics-scenemap<-tactics",
      pkgname       : "nx/tactics/decks/scene",
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
      fn            : nx_tactics_decks_scene.f_tactics_scenemap_from_tactics
    }

  }
}
