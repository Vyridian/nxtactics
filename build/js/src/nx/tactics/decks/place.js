'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_place {

  /**
   * @function placemap_tactics
   * Returns the base placemap
   * @param  {tactics} tactics
   * @return {placemap}
   */
  static t_placemap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_placemap_tactics = {
    vx_type: nx_tactics_decks_place.t_placemap_tactics
  }

  // (func placemap-tactics)
  static f_placemap_tactics(tactics) {
    let output = nx_tactics_base.e_placemap
    output = nx_tactics_base.f_placemap_from_placelist(
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "place1")
    )
    return output
  }

  /**
   * @function tactics_placemap_from_tactics
   * Returns a tactics updated with placemap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_placemap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_placemap_from_tactics = {
    vx_type: nx_tactics_decks_place.t_tactics_placemap_from_tactics
  }

  // (func tactics-placemap<-tactics)
  static f_tactics_placemap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const placemap = nx_tactics_decks_place.f_placemap_tactics(tactics)
        return vx_core.f_copy(tactics, ":placemap", placemap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "placemap-tactics": nx_tactics_decks_place.e_placemap_tactics,
      "tactics-placemap<-tactics": nx_tactics_decks_place.e_tactics_placemap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "placemap-tactics": nx_tactics_decks_place.t_placemap_tactics,
      "tactics-placemap<-tactics": nx_tactics_decks_place.t_tactics_placemap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/place",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func placemap-tactics)
    nx_tactics_decks_place.t_placemap_tactics['vx_value'] = {
      name          : "placemap-tactics",
      pkgname       : "nx/tactics/decks/place",
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
      fn            : nx_tactics_decks_place.f_placemap_tactics
    }

    // (func tactics-placemap<-tactics)
    nx_tactics_decks_place.t_tactics_placemap_from_tactics['vx_value'] = {
      name          : "tactics-placemap<-tactics",
      pkgname       : "nx/tactics/decks/place",
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
      fn            : nx_tactics_decks_place.f_tactics_placemap_from_tactics
    }

  }
}
