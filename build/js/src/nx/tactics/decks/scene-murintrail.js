'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scene_murintrail {

  /**
   * @function deck_murintrail
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_murintrail = {
    vx_type: vx_core.t_type
  }
  static e_deck_murintrail = {
    vx_type: nx_tactics_decks_scene_murintrail.t_deck_murintrail
  }

  // (func deck-murintrail)
  static f_deck_murintrail(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Murin Trail",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_base.f_cardlist_images_from_tactics_units(tactics, "Flint (Early)", "Jes Aveer", "Jon Aveer", "Xeib Hanower", "Wilm Ducon", "Lili Ducon", "Brunhil Virden", "Goblin Scout", "Bandit", "Bruiser", "Guardsman", "Herbalist", "Innkeeper", "Pilgrim", "Urchin", "Waif", "Cat", "Chicken", "Dog", "Dog: Wild", "Duck", "Goat", "Goose", "Pig", "Donkey", "Sheep", "Horse", "Ox", "Cart: Wooden", "Plough"),
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_skill, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_skilllist},
            nx_tactics_base.f_skilllist_from_tactics_keys(tactics, "Close Combat", "Melee", "Stealth", "Business", "Tradeskill")
          ),
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_ability, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_abilitylist},
            nx_tactics_base.f_abilitylist_from_tactics_keys(tactics, "Ambush", "Bargain", "Sneak", "Zombified")
          ),
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_item, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_itemlist},
            nx_tactics_base.f_itemlist_from_tactics_keys(tactics, "Bare Handed", "Knife:Dagger", "Sword:Long", "Sword:Short", "Hammer", "Axe: Hand", "Axe: Wood", "Spear", "Spear: Short", "Bow:Short", "Quiver: Arrows", "Shield:Buckler", "Shield:Heater", "Armor:Leather Cuirass", "Coins:Copper", "Coins:Silver", "Coins:Gold", "Coins:Platinum", "Salve: Healing", "Cloak: Fine Woodland", "Rations", "Waterskin")
          ),
          nx_tactics_base.f_cardlist_images_from_tactics_places(tactics, "Sandalstad", "Field", "Forest", "Mountain", "Blacksmith", "Campsite", "Cave", "Guardpost", "Hall: Wooden", "House: Farm", "Mill", "Path: Dirt", "Road: Gravel", "Road: Stone", "Shop: General", "Shop: Herbalist", "Shrine", "Stables", "Stairs", "Tavern", "Tavern Bar", "Tavern Bedroom", "Tavern Common", "Tavern Dining", "Temple", "Trading Post")
        )
      )
    )
    return output
  }

  /**
   * @function scene_murintrail
   * @param  {tactics} tactics
   * @return {scene}
   */
  static t_scene_murintrail = {
    vx_type: vx_core.t_type
  }
  static e_scene_murintrail = {
    vx_type: nx_tactics_decks_scene_murintrail.t_scene_murintrail
  }

  // (func scene-murintrail)
  static f_scene_murintrail(tactics) {
    let output = nx_tactics_base.e_scene
    output = vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Murin Trail Scene", ":secrets", "* The local lord is a young man (Damyen Brushaus) has recently inherited his title, preoccupied with person interests and largely ignores the town.\n* The town watch is a small militia run by a veteran sergeant (Brunhil Virden).\n* Brunhil runs a tight ship, and is not popular in town or among the watch.\n* The area is mostly safe except for numerous venomous snakes.\n* The local inn/pub is basically a large house. There are outdoor tables for food and drink.\n* The innkeeper/cook (Hamal) runs the place with his 12 year old daughter (Rena).\n* The land is mountainous and rocky, but the weather is fair and crops are reasonable.\n* A small religious group is staying in the city until they move on. They locals don't care for them.\n* A priest (Xeib) in town makes and sells anti-venom.\n* Xeib is travelling to Murintown, but he does not want to travel unguarded.")
    return output
  }

  /**
   * @function scene_zurakthal
   * @param  {tactics} tactics
   * @return {scene}
   */
  static t_scene_zurakthal = {
    vx_type: vx_core.t_type
  }
  static e_scene_zurakthal = {
    vx_type: nx_tactics_decks_scene_murintrail.t_scene_zurakthal
  }

  // (func scene-zurakthal)
  static f_scene_zurakthal(tactics) {
    let output = nx_tactics_base.e_scene
    output = vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Zurak'Thal Scene", ":titles", "Coiling Depths", ":secrets", "* Zurak'Thal (Coiling Depths) - The city of serpents.\n* Dvergholt (Dwarven Forest hold) - The abandoned dwarven outpost\n* Sandvagr (Sand Place) - The human settlement with fragrant sandalwood.\n* Wolfshafen (Wolf's Haven) - The human town\n* Stahlgrim (Steel Fortress) - The distant dwarven city")
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-murintrail": nx_tactics_decks_scene_murintrail.e_deck_murintrail,
      "scene-murintrail": nx_tactics_decks_scene_murintrail.e_scene_murintrail,
      "scene-zurakthal": nx_tactics_decks_scene_murintrail.e_scene_zurakthal
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-murintrail": nx_tactics_decks_scene_murintrail.t_deck_murintrail,
      "scene-murintrail": nx_tactics_decks_scene_murintrail.t_scene_murintrail,
      "scene-zurakthal": nx_tactics_decks_scene_murintrail.t_scene_zurakthal
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scene-murintrail",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-murintrail)
    nx_tactics_decks_scene_murintrail.t_deck_murintrail['vx_value'] = {
      name          : "deck-murintrail",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_deck_murintrail
    }

    // (func scene-murintrail)
    nx_tactics_decks_scene_murintrail.t_scene_murintrail['vx_value'] = {
      name          : "scene-murintrail",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_scene_murintrail
    }

    // (func scene-zurakthal)
    nx_tactics_decks_scene_murintrail.t_scene_zurakthal['vx_value'] = {
      name          : "scene-zurakthal",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_scene_zurakthal
    }

  }
}
