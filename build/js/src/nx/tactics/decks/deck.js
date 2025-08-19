'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_decks_burden from "../../../nx/tactics/decks/burden.js"
import nx_tactics_decks_conflict from "../../../nx/tactics/decks/conflict.js"
import nx_tactics_decks_data from "../../../nx/tactics/decks/data.js"
import nx_tactics_decks_disorder from "../../../nx/tactics/decks/disorder.js"
import nx_tactics_decks_reference from "../../../nx/tactics/decks/reference.js"
import nx_tactics_decks_rule from "../../../nx/tactics/decks/rule.js"
import nx_tactics_decks_scene_murintrail from "../../../nx/tactics/decks/scene-murintrail.js"
import nx_tactics_decks_scene_nightonthetown from "../../../nx/tactics/decks/scene-nightonthetown.js"
import nx_tactics_decks_scene_ontherun from "../../../nx/tactics/decks/scene-ontherun.js"
import nx_tactics_decks_scene_starter from "../../../nx/tactics/decks/scene-starter.js"
import nx_tactics_decks_starter from "../../../nx/tactics/decks/starter.js"
import nx_tactics_decks_trauma from "../../../nx/tactics/decks/trauma.js"
import nx_tactics_decks_vehicle from "../../../nx/tactics/decks/vehicle.js"
import nx_tactics_decks_wound from "../../../nx/tactics/decks/wound.js"


export default class nx_tactics_decks_deck {

  /**
   * @function card_clock
   * @param  {tactics} tactics
   * @param  {int} num
   * @return {card}
   */
  static t_card_clock = {
    vx_type: vx_core.t_type
  }
  static e_card_clock = {
    vx_type: nx_tactics_decks_deck.t_card_clock
  }

  // (func card-clock)
  static f_card_clock(tactics, num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_card},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const rule = nx_tactics_base.f_rule_from_tactics_key(tactics, "Clock")
        return vx_core.f_copy(
          rule,
          ":id",
          vx_core.f_new({"any-1": vx_core.t_string}, "clock-", num),
          ":image",
          vx_core.f_new({"any-1": vx_core.t_string}, "images/rule-clock-", num, ".svg")
        )
      })
    )
    return output
  }

  /**
   * @function deck_abilities
   * Ability Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_abilities = {
    vx_type: vx_core.t_type
  }
  static e_deck_abilities = {
    vx_type: nx_tactics_decks_deck.t_deck_abilities
  }

  // (func deck-abilities)
  static f_deck_abilities(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const abilitymap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":abilitymap"
        )
        const cardmap = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_ability, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_abilitymap}, abilitymap)
        return vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":name", "Abilities", ":cardmap", cardmap)
      })
    )
    return output
  }

  /**
   * @function deck_books
   * Deck of books
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_books = {
    vx_type: vx_core.t_type
  }
  static e_deck_books = {
    vx_type: nx_tactics_decks_deck.t_deck_books
  }

  // (func deck-books)
  static f_deck_books(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Books",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_bookmap(
        vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_bookmap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":bookmap"
        )
      )
    )
    return output
  }

  /**
   * @function deck_clock
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_clock = {
    vx_type: vx_core.t_type
  }
  static e_deck_clock = {
    vx_type: nx_tactics_decks_deck.t_deck_clock
  }

  // (func deck-clock)
  static f_deck_clock(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Clock Deck",
      ":image",
      "images/rule-clock-deck.svg",
      ":layout",
      nx_tactics_base.c_cardlayout_imageonly,
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        nx_tactics_decks_deck.f_card_clock(tactics, 1),
        nx_tactics_decks_deck.f_card_clock(tactics, 2),
        nx_tactics_decks_deck.f_card_clock(tactics, 3),
        nx_tactics_decks_deck.f_card_clock(tactics, 4),
        nx_tactics_decks_deck.f_card_clock(tactics, 5),
        nx_tactics_decks_deck.f_card_clock(tactics, 6),
        nx_tactics_decks_deck.f_card_clock(tactics, 7),
        nx_tactics_decks_deck.f_card_clock(tactics, 8),
        nx_tactics_decks_deck.f_card_clock(tactics, 9),
        nx_tactics_decks_deck.f_card_clock(tactics, 10),
        nx_tactics_decks_deck.f_card_clock(tactics, 11),
        nx_tactics_decks_deck.f_card_clock(tactics, 12),
        nx_tactics_decks_deck.f_card_clock(tactics, 13),
        nx_tactics_decks_deck.f_card_clock(tactics, 14),
        nx_tactics_decks_deck.f_card_clock(tactics, 15),
        nx_tactics_decks_deck.f_card_clock(tactics, 16),
        nx_tactics_decks_deck.f_card_clock(tactics, 17),
        nx_tactics_decks_deck.f_card_clock(tactics, 18),
        nx_tactics_decks_deck.f_card_clock(tactics, 19),
        nx_tactics_decks_deck.f_card_clock(tactics, 20)
      )
    )
    return output
  }

  /**
   * @function deck_decks
   * Setup Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_decks = {
    vx_type: vx_core.t_type
  }
  static e_deck_decks = {
    vx_type: nx_tactics_decks_deck.t_deck_decks
  }

  // (func deck-decks)
  static f_deck_decks(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Decks",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_decks_starter.f_deck_player(tactics, "blue"),
          nx_tactics_decks_starter.f_deck_player(tactics, "green"),
          nx_tactics_decks_starter.f_deck_player(tactics, "red"),
          nx_tactics_decks_starter.f_deck_player(tactics, "yellow"),
          nx_tactics_decks_conflict.f_deck_conflict(),
          nx_tactics_decks_wound.f_deck_wound(),
          nx_tactics_decks_disorder.f_deck_disorder(),
          nx_tactics_decks_trauma.f_deck_trauma(),
          nx_tactics_decks_burden.f_deck_burden(),
          nx_tactics_decks_vehicle.f_deck_vehicle(),
          nx_tactics_decks_reference.f_deck_reference(tactics),
          nx_tactics_decks_deck.f_deck_clock(tactics)
        )
      )
    )
    return output
  }

  /**
   * @function deck_home
   * @return {deck}
   */
  static t_deck_home = {
    vx_type: vx_core.t_type
  }
  static e_deck_home = {
    vx_type: nx_tactics_decks_deck.t_deck_home
  }

  // (func deck-home)
  static f_deck_home() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const tactics =   nx_tactics_decks_data.c_tactics_all
        return vx_core.f_new(
          {"any-1": nx_tactics_base.t_deck},
          ":name",
          "Home",
          ":cardmap",
          nx_tactics_base.f_cardmap_from_cardlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_cardlist},
              nx_tactics_decks_rule.f_deck_rules(tactics),
              nx_tactics_decks_deck.f_deck_decks(tactics),
              nx_tactics_decks_deck.f_deck_scenes(tactics),
              nx_tactics_decks_deck.f_deck_books(tactics),
              nx_tactics_decks_deck.f_deck_places(tactics),
              nx_tactics_decks_deck.f_deck_units(tactics),
              nx_tactics_decks_deck.f_deck_items(tactics),
              nx_tactics_decks_deck.f_deck_skills(tactics),
              nx_tactics_decks_deck.f_deck_powers(tactics),
              nx_tactics_decks_deck.f_deck_abilities(tactics),
              nx_tactics_decks_deck.f_deck_specialties(tactics)
            )
          )
        )
      })
    )
    return output
  }

  /**
   * @function deck_items
   * Items Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_items = {
    vx_type: vx_core.t_type
  }
  static e_deck_items = {
    vx_type: nx_tactics_decks_deck.t_deck_items
  }

  // (func deck-items)
  static f_deck_items(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const itemmap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_itemmap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":itemmap"
        )
        const cardmap = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_item, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_itemmap}, itemmap)
        return vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":name", "Items", ":cardmap", cardmap)
      })
    )
    return output
  }

  /**
   * @function deck_places
   * Places Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_places = {
    vx_type: vx_core.t_type
  }
  static e_deck_places = {
    vx_type: nx_tactics_decks_deck.t_deck_places
  }

  // (func deck-places)
  static f_deck_places(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const placemap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_placemap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":placemap"
        )
        const cardmap = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_place, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_placemap}, placemap)
        return vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":name", "Places", ":cardmap", cardmap)
      })
    )
    return output
  }

  /**
   * @function deck_powers
   * Powers Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_powers = {
    vx_type: vx_core.t_type
  }
  static e_deck_powers = {
    vx_type: nx_tactics_decks_deck.t_deck_powers
  }

  // (func deck-powers)
  static f_deck_powers(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const powermap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_powermap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":powermap"
        )
        const cardmap = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_power, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_powermap}, powermap)
        return vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":name", "Powers", ":cardmap", cardmap)
      })
    )
    return output
  }

  /**
   * @function deck_scenes
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_scenes = {
    vx_type: vx_core.t_type
  }
  static e_deck_scenes = {
    vx_type: nx_tactics_decks_deck.t_deck_scenes
  }

  // (func deck-scenes)
  static f_deck_scenes(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Scenes",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_decks_scene_starter.f_deck_starter(tactics),
          nx_tactics_decks_scene_murintrail.f_deck_murintrail(tactics),
          nx_tactics_decks_scene_nightonthetown.f_deck_nightonthetown(tactics),
          nx_tactics_decks_scene_ontherun.f_deck_ontherun(tactics)
        )
      )
    )
    return output
  }

  /**
   * @function deck_skills
   * Skills Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_skills = {
    vx_type: vx_core.t_type
  }
  static e_deck_skills = {
    vx_type: nx_tactics_decks_deck.t_deck_skills
  }

  // (func deck-skills)
  static f_deck_skills(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const skillmap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_skillmap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":skillmap"
        )
        const cardmap = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_skill, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_skillmap}, skillmap)
        return vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":name", "Skills", ":cardmap", cardmap)
      })
    )
    return output
  }

  /**
   * @function deck_specialties
   * Specialty Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_specialties = {
    vx_type: vx_core.t_type
  }
  static e_deck_specialties = {
    vx_type: nx_tactics_decks_deck.t_deck_specialties
  }

  // (func deck-specialties)
  static f_deck_specialties(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const specialtymap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":specialtymap"
        )
        const cardmap = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_specialty, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_specialtymap}, specialtymap)
        return vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":name", "Specialties", ":cardmap", cardmap)
      })
    )
    return output
  }

  /**
   * @function deck_units
   * Units Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_units = {
    vx_type: vx_core.t_type
  }
  static e_deck_units = {
    vx_type: nx_tactics_decks_deck.t_deck_units
  }

  // (func deck-units)
  static f_deck_units(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const unitmap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_unitmap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":unitmap"
        )
        const cardmap = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_unit, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_unitmap}, unitmap)
        return vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":name", "Units", ":cardmap", cardmap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "card-clock": nx_tactics_decks_deck.e_card_clock,
      "deck-abilities": nx_tactics_decks_deck.e_deck_abilities,
      "deck-books": nx_tactics_decks_deck.e_deck_books,
      "deck-clock": nx_tactics_decks_deck.e_deck_clock,
      "deck-decks": nx_tactics_decks_deck.e_deck_decks,
      "deck-home": nx_tactics_decks_deck.e_deck_home,
      "deck-items": nx_tactics_decks_deck.e_deck_items,
      "deck-places": nx_tactics_decks_deck.e_deck_places,
      "deck-powers": nx_tactics_decks_deck.e_deck_powers,
      "deck-scenes": nx_tactics_decks_deck.e_deck_scenes,
      "deck-skills": nx_tactics_decks_deck.e_deck_skills,
      "deck-specialties": nx_tactics_decks_deck.e_deck_specialties,
      "deck-units": nx_tactics_decks_deck.e_deck_units
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "card-clock": nx_tactics_decks_deck.t_card_clock,
      "deck-abilities": nx_tactics_decks_deck.t_deck_abilities,
      "deck-books": nx_tactics_decks_deck.t_deck_books,
      "deck-clock": nx_tactics_decks_deck.t_deck_clock,
      "deck-decks": nx_tactics_decks_deck.t_deck_decks,
      "deck-home": nx_tactics_decks_deck.t_deck_home,
      "deck-items": nx_tactics_decks_deck.t_deck_items,
      "deck-places": nx_tactics_decks_deck.t_deck_places,
      "deck-powers": nx_tactics_decks_deck.t_deck_powers,
      "deck-scenes": nx_tactics_decks_deck.t_deck_scenes,
      "deck-skills": nx_tactics_decks_deck.t_deck_skills,
      "deck-specialties": nx_tactics_decks_deck.t_deck_specialties,
      "deck-units": nx_tactics_decks_deck.t_deck_units
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/deck",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func card-clock)
    nx_tactics_decks_deck.t_card_clock['vx_value'] = {
      name          : "card-clock",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_card_clock
    }

    // (func deck-abilities)
    nx_tactics_decks_deck.t_deck_abilities['vx_value'] = {
      name          : "deck-abilities",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_abilities
    }

    // (func deck-books)
    nx_tactics_decks_deck.t_deck_books['vx_value'] = {
      name          : "deck-books",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_books
    }

    // (func deck-clock)
    nx_tactics_decks_deck.t_deck_clock['vx_value'] = {
      name          : "deck-clock",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_clock
    }

    // (func deck-decks)
    nx_tactics_decks_deck.t_deck_decks['vx_value'] = {
      name          : "deck-decks",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_decks
    }

    // (func deck-home)
    nx_tactics_decks_deck.t_deck_home['vx_value'] = {
      name          : "deck-home",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_home
    }

    // (func deck-items)
    nx_tactics_decks_deck.t_deck_items['vx_value'] = {
      name          : "deck-items",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_items
    }

    // (func deck-places)
    nx_tactics_decks_deck.t_deck_places['vx_value'] = {
      name          : "deck-places",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_places
    }

    // (func deck-powers)
    nx_tactics_decks_deck.t_deck_powers['vx_value'] = {
      name          : "deck-powers",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_powers
    }

    // (func deck-scenes)
    nx_tactics_decks_deck.t_deck_scenes['vx_value'] = {
      name          : "deck-scenes",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_scenes
    }

    // (func deck-skills)
    nx_tactics_decks_deck.t_deck_skills['vx_value'] = {
      name          : "deck-skills",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_skills
    }

    // (func deck-specialties)
    nx_tactics_decks_deck.t_deck_specialties['vx_value'] = {
      name          : "deck-specialties",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_specialties
    }

    // (func deck-units)
    nx_tactics_decks_deck.t_deck_units['vx_value'] = {
      name          : "deck-units",
      pkgname       : "nx/tactics/decks/deck",
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
      fn            : nx_tactics_decks_deck.f_deck_units
    }

  }
}
