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
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bedroll of Restful Sleep", ":summary", "Providest the [Restful Sleep] ability."),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hand Axe", ":image", "images/cards/item-axehand.svg", ":summary", "* Melee: [Hack] [Slash]\n* Hit: [Body]\n* Location: [1-hand]", ":body", "9x-1", ":mass", "900g/2lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lock Combination", ":image", "images/cards/item-lockcombination.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Jerry Can", ":image", "images/cards/item-jerrycan.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Keys", ":image", "images/cards/item-keys.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Knife", ":image", "images/cards/item-knife.svg", ":summary", "* [Fight]: [Close Combat]\n* [Damage]: [Body]-1 [Pierce] [Slash]\n* [Location]: [1-hand]", ":body", "5x-1", ":mass", "500g/1lb", ":length", "25cm/10in"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Liquor Bottle", ":image", "images/cards/item-liquorbottle.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Molotov Cocktail", ":image", "images/cards/item-molotovcocktail.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Revolver", ":image", "images/cards/item-revolver.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Revolver Ammo", ":image", "images/cards/item-revolverammo.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rifle", ":image", "images/cards/item-rifle.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rifle Ammo", ":image", "images/cards/item-rifleammo.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Safe", ":image", "images/cards/item-safe.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shotgun", ":image", "images/cards/item-shotgun.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shotgun Ammo", ":image", "images/cards/item-shotgunammo.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spear", ":image", "images/cards/item-spear.svg", ":summary", "* [Fight]: [Melee] [Reach]\n* [Damage]: [Body]+3 [Pierce] [Slash]\n* [Location]: [2-hand]\n* [Armor]:1x1", ":body", "3x0", ":mass", "3kg/6lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Fire Axe", ":image", "images/cards/item-woodaxe.svg", ":summary", "* [Fight]: [Melee]\n* [Initiative]:-1\n* [Damage]: [Body]+3 [Hack] [Slash]\n* [Location]: [2-hand]\n* [Armor]:1x1", ":body", "3x0", ":mass", "3.1kg/7lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Monocle", ":image", "images/cards/item-monocle.svg", ":summary", "* [Passive]: IF examining small objects THEN [Investigation]:+1", ":body", "2x-2", ":mass", "20g/.05lb")
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
