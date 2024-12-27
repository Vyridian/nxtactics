'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_item {

  /**
   * @function itemmap_tactics
   * Returns the base itemmap
   * @param  {tactics} tactics
   * @return {itemmap}
   */
  static t_itemmap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_itemmap_tactics = {
    vx_type: nx_tactics_decks_item.t_itemmap_tactics
  }

  // (func itemmap-tactics)
  static f_itemmap_tactics(tactics) {
    let output = nx_tactics_base.e_itemmap
    output = nx_tactics_base.f_itemmap_from_itemlist(
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "item1")
    )
    return output
  }

  /**
   * @function tactics_itemmap_from_tactics
   * Returns a tactics updated with itemmap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_itemmap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_itemmap_from_tactics = {
    vx_type: nx_tactics_decks_item.t_tactics_itemmap_from_tactics
  }

  // (func tactics-itemmap<-tactics)
  static f_tactics_itemmap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const itemmap = nx_tactics_decks_item.f_itemmap_tactics(tactics)
        return vx_core.f_copy(tactics, ":itemmap", itemmap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "itemmap-tactics": nx_tactics_decks_item.e_itemmap_tactics,
      "tactics-itemmap<-tactics": nx_tactics_decks_item.e_tactics_itemmap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "itemmap-tactics": nx_tactics_decks_item.t_itemmap_tactics,
      "tactics-itemmap<-tactics": nx_tactics_decks_item.t_tactics_itemmap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/item",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func itemmap-tactics)
    nx_tactics_decks_item.t_itemmap_tactics['vx_value'] = {
      name          : "itemmap-tactics",
      pkgname       : "nx/tactics/decks/item",
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
      fn            : nx_tactics_decks_item.f_itemmap_tactics
    }

    // (func tactics-itemmap<-tactics)
    nx_tactics_decks_item.t_tactics_itemmap_from_tactics['vx_value'] = {
      name          : "tactics-itemmap<-tactics",
      pkgname       : "nx/tactics/decks/item",
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
      fn            : nx_tactics_decks_item.f_tactics_itemmap_from_tactics
    }

  }
}
