'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scene_ontherun {

  /**
   * @function deck_ontherun
   * On the Run Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_ontherun = {
    vx_type: vx_core.t_type
  }
  static e_deck_ontherun = {
    vx_type: nx_tactics_decks_scene_ontherun.t_deck_ontherun
  }

  // (func deck-ontherun)
  static f_deck_ontherun(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "On The Run",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        nx_tactics_base.f_cardlist_images_from_tactics_units(tactics, "Flint (Early)", "Hidden", "Fish: Small", "Hare", "Pheasant", "Pig: Wild Boar", "Snake: Emerald Viper", "Turkey"),
        vx_core.f_list_from_list(
          {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_skill, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_skilllist},
          nx_tactics_base.f_skilllist_from_tactics_keys(tactics, "Close Combat", "Stealth")
        ),
        vx_core.f_list_from_list(
          {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_ability, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_abilitylist},
          nx_tactics_base.f_abilitylist_from_tactics_keys(tactics, "Ambush", "Camouflage", "Poison Bite", "Sneak")
        ),
        vx_core.f_list_from_list(
          {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_item, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_itemlist},
          nx_tactics_base.f_itemlist_from_tactics_keys(tactics, "Bare Handed", "Knife: Dagger", "Mushrooms", "Onions: Wild", "Raspberries", "Stone: Flint", "Torch", "Water: Pond", "Yams: Wild")
        ),
        vx_core.f_list_from_list(
          {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_power, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_powerlist},
          nx_tactics_base.f_powerlist_from_tactics_keys(tactics, "Toxins")
        ),
        vx_core.f_list_from_list(
          {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_rule, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_rulelist},
          nx_tactics_base.f_rulelist_from_tactics_keys(tactics, "Task", "Weather: Temperature", "Weather: Clouds", "Weather: Humidity", "Weather: Wind", "Exposure", "Hunger", "Thirst", "Poisoned")
        ),
        vx_core.f_list_from_list(
          {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_place, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_placelist},
          nx_tactics_base.f_placelist_from_tactics_keys(tactics, "Brambles", "Chasm", "Cliff", "Marsh", "Mudslide", "Pit", "Pond", "River", "Rock", "Rockslide", "Stream")
        )
      )
    )
    return output
  }

  /**
   * @function scene_ontherun
   * @param  {tactics} tactics
   * @return {scene}
   */
  static t_scene_ontherun = {
    vx_type: vx_core.t_type
  }
  static e_scene_ontherun = {
    vx_type: nx_tactics_decks_scene_ontherun.t_scene_ontherun
  }

  // (func scene-ontherun)
  static f_scene_ontherun(tactics) {
    let output = nx_tactics_base.e_scene
    output = vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "On The Run Scene", ":secrets", "")
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-ontherun": nx_tactics_decks_scene_ontherun.e_deck_ontherun,
      "scene-ontherun": nx_tactics_decks_scene_ontherun.e_scene_ontherun
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-ontherun": nx_tactics_decks_scene_ontherun.t_deck_ontherun,
      "scene-ontherun": nx_tactics_decks_scene_ontherun.t_scene_ontherun
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scene-ontherun",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-ontherun)
    nx_tactics_decks_scene_ontherun.t_deck_ontherun['vx_value'] = {
      name          : "deck-ontherun",
      pkgname       : "nx/tactics/decks/scene-ontherun",
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
      fn            : nx_tactics_decks_scene_ontherun.f_deck_ontherun
    }

    // (func scene-ontherun)
    nx_tactics_decks_scene_ontherun.t_scene_ontherun['vx_value'] = {
      name          : "scene-ontherun",
      pkgname       : "nx/tactics/decks/scene-ontherun",
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
      fn            : nx_tactics_decks_scene_ontherun.f_scene_ontherun
    }

  }
}
