'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_decks_conflict from "../../../nx/tactics/decks/conflict.js"
import nx_tactics_decks_data from "../../../nx/tactics/decks/data.js"
import nx_tactics_decks_disorder from "../../../nx/tactics/decks/disorder.js"
import nx_tactics_decks_restraint from "../../../nx/tactics/decks/restraint.js"
import nx_tactics_decks_rule from "../../../nx/tactics/decks/rule.js"
import nx_tactics_decks_scenario_murintrail from "../../../nx/tactics/decks/scenario-murintrail.js"
import nx_tactics_decks_scenario_nightonthetown from "../../../nx/tactics/decks/scenario-nightonthetown.js"
import nx_tactics_decks_starter from "../../../nx/tactics/decks/starter.js"
import nx_tactics_decks_tarot from "../../../nx/tactics/decks/tarot.js"
import nx_tactics_decks_trauma from "../../../nx/tactics/decks/trauma.js"
import nx_tactics_decks_wound from "../../../nx/tactics/decks/wound.js"


export default class nx_tactics_decks_deck {

  /**
   * @function deck_books
   * Deck of books
   * @return {deck}
   */
  static t_deck_books = {
    vx_type: vx_core.t_type
  }
  static e_deck_books = {
    vx_type: nx_tactics_decks_deck.t_deck_books
  }

  // (func deck-books)
  static f_deck_books() {
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
   * @function deck_encounters
   * @return {deck}
   */
  static t_deck_encounters = {
    vx_type: vx_core.t_type
  }
  static e_deck_encounters = {
    vx_type: nx_tactics_decks_deck.t_deck_encounters
  }

  // (func deck-encounters)
  static f_deck_encounters() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":name", "Encounters")
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
              nx_tactics_decks_deck.f_deck_books(),
              nx_tactics_decks_rule.f_deck_rules(),
              nx_tactics_decks_deck.f_deck_setup(),
              nx_tactics_decks_deck.f_deck_scenarios(tactics),
              nx_tactics_decks_deck.f_deck_encounters(),
              nx_tactics_decks_deck.f_deck_places(),
              nx_tactics_decks_deck.f_deck_units(),
              nx_tactics_decks_deck.f_deck_items(),
              nx_tactics_decks_deck.f_deck_skills(),
              nx_tactics_decks_deck.f_deck_powers()
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
   * @return {deck}
   */
  static t_deck_items = {
    vx_type: vx_core.t_type
  }
  static e_deck_items = {
    vx_type: nx_tactics_decks_deck.t_deck_items
  }

  // (func deck-items)
  static f_deck_items() {
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
   * @return {deck}
   */
  static t_deck_places = {
    vx_type: vx_core.t_type
  }
  static e_deck_places = {
    vx_type: nx_tactics_decks_deck.t_deck_places
  }

  // (func deck-places)
  static f_deck_places() {
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
   * @return {deck}
   */
  static t_deck_powers = {
    vx_type: vx_core.t_type
  }
  static e_deck_powers = {
    vx_type: nx_tactics_decks_deck.t_deck_powers
  }

  // (func deck-powers)
  static f_deck_powers() {
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
   * @function deck_scenarios
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_scenarios = {
    vx_type: vx_core.t_type
  }
  static e_deck_scenarios = {
    vx_type: nx_tactics_decks_deck.t_deck_scenarios
  }

  // (func deck-scenarios)
  static f_deck_scenarios(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Scenarios",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_decks_scenario_murintrail.f_deck_murintrail(tactics),
          nx_tactics_decks_scenario_nightonthetown.f_deck_nightonthetown(tactics)
        )
      )
    )
    return output
  }

  /**
   * @function deck_setup
   * Setup Deck
   * @return {deck}
   */
  static t_deck_setup = {
    vx_type: vx_core.t_type
  }
  static e_deck_setup = {
    vx_type: nx_tactics_decks_deck.t_deck_setup
  }

  // (func deck-setup)
  static f_deck_setup() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Setup",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_decks_conflict.f_deck_conflict(),
          nx_tactics_decks_conflict.f_deck_conflict_back(),
          nx_tactics_decks_wound.f_deck_wound(),
          nx_tactics_decks_wound.f_deck_woundback(),
          nx_tactics_decks_disorder.f_deck_disorder(),
          nx_tactics_decks_disorder.f_deck_disorderback(),
          nx_tactics_decks_trauma.f_deck_trauma(),
          nx_tactics_decks_trauma.f_deck_traumaback(),
          nx_tactics_decks_restraint.f_deck_restraint(),
          nx_tactics_decks_restraint.f_deck_restraintback(),
          nx_tactics_decks_wound.f_deck_bleeding(),
          nx_tactics_decks_wound.f_deck_bloodloss(),
          nx_tactics_decks_starter.f_deck_round(),
          nx_tactics_decks_starter.f_deck_player("blue"),
          nx_tactics_decks_starter.f_deck_player("green"),
          nx_tactics_decks_starter.f_deck_player("red"),
          nx_tactics_decks_starter.f_deck_player("yellow"),
          nx_tactics_decks_tarot.f_deck_tarot()
        )
      )
    )
    return output
  }

  /**
   * @function deck_skills
   * Skills Deck
   * @return {deck}
   */
  static t_deck_skills = {
    vx_type: vx_core.t_type
  }
  static e_deck_skills = {
    vx_type: nx_tactics_decks_deck.t_deck_skills
  }

  // (func deck-skills)
  static f_deck_skills() {
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
   * @function deck_units
   * Units Deck
   * @return {deck}
   */
  static t_deck_units = {
    vx_type: vx_core.t_type
  }
  static e_deck_units = {
    vx_type: nx_tactics_decks_deck.t_deck_units
  }

  // (func deck-units)
  static f_deck_units() {
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
      "deck-books": nx_tactics_decks_deck.e_deck_books,
      "deck-encounters": nx_tactics_decks_deck.e_deck_encounters,
      "deck-home": nx_tactics_decks_deck.e_deck_home,
      "deck-items": nx_tactics_decks_deck.e_deck_items,
      "deck-places": nx_tactics_decks_deck.e_deck_places,
      "deck-powers": nx_tactics_decks_deck.e_deck_powers,
      "deck-scenarios": nx_tactics_decks_deck.e_deck_scenarios,
      "deck-setup": nx_tactics_decks_deck.e_deck_setup,
      "deck-skills": nx_tactics_decks_deck.e_deck_skills,
      "deck-units": nx_tactics_decks_deck.e_deck_units
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-books": nx_tactics_decks_deck.t_deck_books,
      "deck-encounters": nx_tactics_decks_deck.t_deck_encounters,
      "deck-home": nx_tactics_decks_deck.t_deck_home,
      "deck-items": nx_tactics_decks_deck.t_deck_items,
      "deck-places": nx_tactics_decks_deck.t_deck_places,
      "deck-powers": nx_tactics_decks_deck.t_deck_powers,
      "deck-scenarios": nx_tactics_decks_deck.t_deck_scenarios,
      "deck-setup": nx_tactics_decks_deck.t_deck_setup,
      "deck-skills": nx_tactics_decks_deck.t_deck_skills,
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

    // (func deck-encounters)
    nx_tactics_decks_deck.t_deck_encounters['vx_value'] = {
      name          : "deck-encounters",
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
      fn            : nx_tactics_decks_deck.f_deck_encounters
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

    // (func deck-scenarios)
    nx_tactics_decks_deck.t_deck_scenarios['vx_value'] = {
      name          : "deck-scenarios",
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
      fn            : nx_tactics_decks_deck.f_deck_scenarios
    }

    // (func deck-setup)
    nx_tactics_decks_deck.t_deck_setup['vx_value'] = {
      name          : "deck-setup",
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
      fn            : nx_tactics_decks_deck.f_deck_setup
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
