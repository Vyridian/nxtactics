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
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Arrow Quiver", ":image", "images/cards/item-arrowquiver.svg", ":summary", "* Holds up to 20 arrows\n* [Location]: [Shoulders] Back", ":body", "10x-1", ":mass", "1kg/2.2lb", ":length", "6cm/2ft"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bedroll", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bedroll of Restful Sleep", ":summary", "Providest the [Restful Sleep] ability."),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Buckler Shield", ":image", "images/cards/item-shieldbuckler.svg", ":summary", "* [Armor]: 1x1\n* [Location]: [1-hand]", ":body", "10x-1", ":mass", "1kg/2lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cloak"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Copper Coins", ":image", "images/cards/item-coppercoins.svg", ":summary", "* A few (~5=$5) coins.\n* A pauper's wealth.\n* 10 Copper = 1 Silver\n* Cheap meal, 2 cheap drinks, night in a common room, a nice tip.", ":body", "5x-2", ":mass", "50g/.1lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Dagger", ":image", "images/cards/item-dagger.svg", ":summary", "* [Combat]: [Close Combat] or [Melee]\n* [Damage]: [Body] [Pierce] [Slash]\n* [Location]: [1-hand]", ":body", "5x-1", ":mass", "500g/1lb", ":energy", "50J", ":length", "25cm/10in"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Fine Woodland Cloak", ":image", "images/cards/item-finewoodlandcloak.svg", ":summary", "* [Passive]: [Stealth]:+1 in [Forest]\n* [Passive]: Discard the first [Fatigue] you receive from [Weather] each [Turn].", ":body", "2x0", ":mass", "2kg/4.4lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Fire Axe", ":image", "images/cards/item-woodaxe.svg", ":summary", "* [Combat]: [Melee]\n* [Initiative]:-1\n* [Damage]: [Body]+3 [Hack] [Slash]\n* [Location]: [2-hand]\n* [Armor]:1x1", ":body", "3x0", ":mass", "3.1kg/7lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Gold Coins", ":image", "images/cards/item-goldcoins.svg", ":summary", "* A few (~5=$500) coins.\n* A tidy sum.\n* 10 Silver = 1 Gold\n* 10 Gold = 1 Platinum\n* A piece of quality gear.", ":body", "10x-2", ":mass", "150g/.3lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hammer", ":image", "images/cards/item-hammer.svg", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]+2 [Bash]\n* [Location]: [1-hand]", ":body", "2x0", ":mass", "2kg/4.4lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hand Axe", ":image", "images/cards/item-axehand.svg", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body] [Hack] [Slash]\n* [Location]: [1-hand]", ":body", "9x-1", ":mass", "900g/2lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Healing Salve", ":image", "images/cards/item-healingsalve.svg", ":summary", "* [Uses]: 3\n* [Double Action] Use:1: Reduce a Major Wound to a Minor Wound.", ":body", "5x-1", ":mass", "500g/1.1lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Heater Shield", ":image", "images/cards/item-shieldheater.svg", ":summary", "* [Armor]: 2x1 [Hardened vs Hack]\n* [Location]: [1-hand]", ":body", "3x0", ":mass", "3.2kg/7lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Jerry Can", ":image", "images/cards/item-jerrycan.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Keys", ":image", "images/cards/item-keys.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Knife", ":image", "images/cards/item-knife.svg", ":summary", "* [Combat]: [Close Combat]\n* [Damage]: [Body]-1 [Pierce] [Slash]\n* [Location]: [1-hand]", ":body", "5x-1", ":mass", "500g/1lb", ":length", "25cm/10in"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Leather Cuirass", ":titles", "Leather Body Armor", ":image", "images/cards/item-armor-leathercuirass.svg", ":summary", "* [Armor]: 1x1 [Hardened vs Slash]\n* [Location]: [Shoulders] [Chest] [Abdomen] [Vitals]", ":body", "7x0", ":mass", "7kg/15lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Liquor Bottle", ":image", "images/cards/item-liquorbottle.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lock Combination", ":image", "images/cards/item-lockcombination.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lockpicks", ":summary", "* [Success]: IF picking a lock and Succeed with Evade THEN Success:+1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Longsword", ":image", "images/cards/item-longsword.svg", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]+1 [Pierce] [Slash]\n* [Location]: [1-hand]\n* [Armor]: 1x1", ":body", "10x-1", ":mass", "1.25kg/3lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Molotov Cocktail", ":image", "images/cards/item-molotovcocktail.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Monocle", ":image", "images/cards/item-monocle.svg", ":summary", "* [Passive]: IF examining small objects THEN [Investigation]:+1", ":body", "2x-2", ":mass", "20g/.05lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Platinum Coins", ":image", "images/cards/item-platinumcoins.svg", ":summary", "* A few (~5=$5000) coins.\n* A small fortune.\n* 10 Gold = 1 Platinum\n* A piece of extremely high quality or magical gear.", ":body", "10x-2", ":mass", "150g/.3lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rations", ":image", "images/cards/item-rations.svg", ":summary", "* Enough Food for 7-10 days.\n* Cost: [Silver Coins]\n* An assortment of jerky, dried fruits, hardtack, hardrolls, dried cheese, potatoes, turnips and nuts.\n* Water is heavy, so these are mostly dry. If consumed without water, the unit will be [Dehydrated] after 7 days.", ":body", "4x0", ":mass", "4kg/9lbs"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Revolver", ":image", "images/cards/item-revolver.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Revolver Ammo", ":image", "images/cards/item-revolverammo.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rifle", ":image", "images/cards/item-rifle.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rifle Ammo", ":image", "images/cards/item-rifleammo.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Round Shield", ":image", "images/cards/item-shieldround.svg", ":summary", "* [Armor]: 2x1 [Hardened vs Pierce]\n* [Location]: [1-hand]", ":body", "5x0", ":mass", "5kg/11lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Safe", ":image", "images/cards/item-safe.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Short Spear", ":image", "images/cards/item-shortspear.svg", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]+1 [Pierce] [Slash]\n* [Location]: [1-hand]\n* [Armor]: 1x1", ":body", "10x-1", ":mass", "1.5kg/4lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shortsword", ":image", "images/cards/item-shortsword.svg", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]+1 [Pierce] [Slash]\n* [Location]: [1-hand]\n* [Armor]: 1x1", ":body", "10x-1", ":mass", "1kg/2.2lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shotgun", ":image", "images/cards/item-shotgun.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shotgun Ammo", ":image", "images/cards/item-shotgunammo.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Silver Coins", ":image", "images/cards/item-silvercoins.svg", ":summary", "* A few (~5=$50) coins.\n* Spending money.\n* 10 Copper = 1 Silver\n* 10 Silver = 1 Gold\n* 2 nice meals, 3 bottles wine, round of drinks, a private room, week supplies, cheap gear.", ":body", "10x-2", ":mass", "100g/.2lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spear", ":image", "images/cards/item-spear.svg", ":summary", "* [Combat]: [Melee] [Reach]\n* [Damage]: [Body]+3 [Pierce] [Slash]\n* [Location]: [2-hand]\n* [Armor]: 1x1", ":body", "3x0", ":mass", "3kg/6lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spear", ":image", "images/cards/item-spear.svg", ":summary", "* [Combat]: [Melee] [Reach]\n* [Damage]: [Body]+3 [Pierce] [Slash]\n* [Location]: [2-hand]\n* [Armor]:1x1", ":body", "3x0", ":mass", "3kg/6lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Waterskin", ":image", "images/cards/item-waterskin.svg", ":summary", "* 2 liters/.5 gallon. Enough Water for 2 days.\n* Cost: [Copper Coins]. Can be refilled from any clean water source.", ":body", "2x0", ":mass", "2kg/4.4lbs"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Wood Axe", ":titles", "Splitting Maul", ":image", "images/cards/item-woodaxe.svg", ":summary", "* [Combat]: [Melee]-1\n* [Damage]: [Body]+3 [Hack] [Slash]\n* [Location]: [2-hand]\n* [Armor]: 1x1", ":body", "3x0", ":mass", "3.1kg/7lb")
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
