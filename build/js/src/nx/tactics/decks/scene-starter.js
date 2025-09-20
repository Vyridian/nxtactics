'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scene_starter {

  /**
   * @function deck_starter
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_starter = {
    vx_type: vx_core.t_type
  }
  static e_deck_starter = {
    vx_type: nx_tactics_decks_scene_starter.t_deck_starter
  }

  // (func deck-starter)
  static f_deck_starter(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Starter",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_base.f_cardlist_images_from_tactics_units(tactics, "Goblin Raider", "Goblin Scout"),
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_skill, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_skilllist},
            nx_tactics_base.f_skilllist_from_tactics_keys(tactics, "Close Combat", "Melee", "Stealth")
          ),
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_ability, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_abilitylist},
            nx_tactics_base.f_abilitylist_from_tactics_keys(tactics, "Ambush", "Sneak")
          ),
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_item, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_itemlist},
            nx_tactics_base.f_itemlist_from_tactics_keys(tactics, "Knife:Dagger", "Sword:Long", "Armor:Leather Cuirass", "Armor:Leather Helmet", "Shield:Round", "Campfire")
          ),
          nx_tactics_base.f_cardlist_images_from_tactics_places(tactics, "Rock")
        )
      )
    )
    return output
  }

  /**
   * @function scene_starter
   * @param  {tactics} tactics
   * @return {scene}
   */
  static t_scene_starter = {
    vx_type: vx_core.t_type
  }
  static e_scene_starter = {
    vx_type: nx_tactics_decks_scene_starter.t_scene_starter
  }

  // (func scene-starter)
  static f_scene_starter(tactics) {
    let output = nx_tactics_base.e_scene
    output = vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Starter Scene")
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-starter": nx_tactics_decks_scene_starter.e_deck_starter,
      "scene-starter": nx_tactics_decks_scene_starter.e_scene_starter
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-starter": nx_tactics_decks_scene_starter.t_deck_starter,
      "scene-starter": nx_tactics_decks_scene_starter.t_scene_starter
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scene-starter",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-starter)
    nx_tactics_decks_scene_starter.t_deck_starter['vx_value'] = {
      name          : "deck-starter",
      pkgname       : "nx/tactics/decks/scene-starter",
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
      fn            : nx_tactics_decks_scene_starter.f_deck_starter
    }

    // (func scene-starter)
    nx_tactics_decks_scene_starter.t_scene_starter['vx_value'] = {
      name          : "scene-starter",
      pkgname       : "nx/tactics/decks/scene-starter",
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
      fn            : nx_tactics_decks_scene_starter.f_scene_starter
    }

  }
}
