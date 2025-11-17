'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scene_nightonthetown {

  /**
   * @function deck_nightonthetown
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_nightonthetown = {
    vx_type: vx_core.t_type
  }
  static e_deck_nightonthetown = {
    vx_type: nx_tactics_decks_scene_nightonthetown.t_deck_nightonthetown
  }

  // (func deck-nightonthetown)
  static f_deck_nightonthetown(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Night on the Town",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_base.f_cardlist_images_from_tactics_units(tactics, "The Professor", "Zombie: Crawler", "Zombie: Dog", "Zombie: Runner", "Zombie: Walker"),
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_ability, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_abilitylist},
            nx_tactics_base.f_abilitylist_from_tactics_keys(tactics, "Bite", "Detail Oriented", "Grab", "Zombified")
          ),
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_item, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_itemlist},
            nx_tactics_base.f_itemlist_from_tactics_keys(tactics, "Ammo:Revolver", "Ammo:Rifle", "Ammo:Shotgun", "Axe:Fire", "Bare Handed", "Bottle:Liquor", "Bottle:Molotov Cocktail", "Bow:Short", "Jerry Can", "Keys", "Knife", "Accessory: Monocle", "Paper: Lock Combination", "Pistol:.45 Revolver", "Rifle", "Shotgun", "Spear")
          ),
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_place, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_placelist},
            nx_tactics_base.f_placelist_from_tactics_keys(tactics, "Clinic", "Gas Station", "Police Station", "Road: Asphalt", "Road: Intersection", "Store: Convenience", "Store: Gun")
          )
        )
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-nightonthetown": nx_tactics_decks_scene_nightonthetown.e_deck_nightonthetown
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-nightonthetown": nx_tactics_decks_scene_nightonthetown.t_deck_nightonthetown
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scene-nightonthetown",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-nightonthetown)
    nx_tactics_decks_scene_nightonthetown.t_deck_nightonthetown['vx_value'] = {
      name          : "deck-nightonthetown",
      pkgname       : "nx/tactics/decks/scene-nightonthetown",
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
      fn            : nx_tactics_decks_scene_nightonthetown.f_deck_nightonthetown
    }

  }
}
