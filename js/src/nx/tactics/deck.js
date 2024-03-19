'strict mode'

import vx_core from "../../vx/core.js"
import nx_tactics_base from "../../nx/tactics/base.js"
import nx_tactics_damage from "../../nx/tactics/damage.js"
import nx_tactics_decks_fate from "../../nx/tactics/decks/fate.js"
import nx_tactics_decks_starter from "../../nx/tactics/decks/starter.js"
import nx_tactics_decks_tarot from "../../nx/tactics/decks/tarot.js"
import nx_tactics_books_advanced_rules from "../../nx/tactics/books/advanced_rules.js"
import nx_tactics_books_age_of_sail from "../../nx/tactics/books/age_of_sail.js"
import nx_tactics_books_age_of_steam from "../../nx/tactics/books/age_of_steam.js"
import nx_tactics_books_bestiary from "../../nx/tactics/books/bestiary.js"
import nx_tactics_books_characters from "../../nx/tactics/books/characters.js"
import nx_tactics_books_combat from "../../nx/tactics/books/combat.js"
import nx_tactics_books_core_rules from "../../nx/tactics/books/core_rules.js"
import nx_tactics_books_fantasy from "../../nx/tactics/books/fantasy.js"
import nx_tactics_books_gear from "../../nx/tactics/books/gear.js"
import nx_tactics_books_giant_monsters from "../../nx/tactics/books/giant_monsters.js"
import nx_tactics_books_high_technology from "../../nx/tactics/books/high_technology.js"
import nx_tactics_books_horror from "../../nx/tactics/books/horror.js"
import nx_tactics_books_land_sea_and_air from "../../nx/tactics/books/land_sea_and_air.js"
import nx_tactics_books_magic from "../../nx/tactics/books/magic.js"
import nx_tactics_books_medieval from "../../nx/tactics/books/medieval.js"
import nx_tactics_books_modern from "../../nx/tactics/books/modern.js"
import nx_tactics_books_modern_fantasy from "../../nx/tactics/books/modern_fantasy.js"
import nx_tactics_books_powers from "../../nx/tactics/books/powers.js"
import nx_tactics_books_prehistory from "../../nx/tactics/books/prehistory.js"
import nx_tactics_books_pulp_fiction from "../../nx/tactics/books/pulp_fiction.js"
import nx_tactics_books_science_fiction from "../../nx/tactics/books/science_fiction.js"
import nx_tactics_books_skills from "../../nx/tactics/books/skills.js"
import nx_tactics_books_space_and_time from "../../nx/tactics/books/space_and_time.js"
import nx_tactics_books_superheroes from "../../nx/tactics/books/superheroes.js"
import nx_tactics_books_world_wars from "../../nx/tactics/books/world_wars.js"


export default class nx_tactics_deck {

  /**
   * Constant: tactics-all
   * All tactics cards
   * {tactics}
   */
  static c_tactics_all = {vx_type: nx_tactics_base.t_tactics, vx_constdef: {pkgname: 'nx/tactics/deck', name: 'tactics-all'}}

  /**
   * @function booklist_all
   * All books
   * @return {booklist}
   */
  static t_booklist_all = {
    vx_type: vx_core.t_type
  }
  static e_booklist_all = {
    vx_type: nx_tactics_deck.t_booklist_all
  }

  // (func booklist-all)
  static f_booklist_all() {
    let output = nx_tactics_base.e_booklist
    output = vx_core.f_new(
      nx_tactics_base.t_booklist,
      nx_tactics_books_core_rules.f_tacticsbook(),
      nx_tactics_books_combat.f_tacticsbook(),
      nx_tactics_books_skills.f_tacticsbook(),
      nx_tactics_books_magic.f_tacticsbook(),
      nx_tactics_books_powers.f_tacticsbook(),
      nx_tactics_books_gear.f_tacticsbook(),
      nx_tactics_books_advanced_rules.f_tacticsbook(),
      nx_tactics_books_characters.f_tacticsbook(),
      nx_tactics_books_bestiary.f_tacticsbook(),
      nx_tactics_books_land_sea_and_air.f_tacticsbook(),
      nx_tactics_books_fantasy.f_tacticsbook(),
      nx_tactics_books_giant_monsters.f_tacticsbook(),
      nx_tactics_books_prehistory.f_tacticsbook(),
      nx_tactics_books_medieval.f_tacticsbook(),
      nx_tactics_books_age_of_sail.f_tacticsbook(),
      nx_tactics_books_age_of_steam.f_tacticsbook(),
      nx_tactics_books_pulp_fiction.f_tacticsbook(),
      nx_tactics_books_world_wars.f_tacticsbook(),
      nx_tactics_books_horror.f_tacticsbook(),
      nx_tactics_books_modern.f_tacticsbook(),
      nx_tactics_books_modern_fantasy.f_tacticsbook(),
      nx_tactics_books_superheroes.f_tacticsbook(),
      nx_tactics_books_high_technology.f_tacticsbook(),
      nx_tactics_books_science_fiction.f_tacticsbook(),
      nx_tactics_books_space_and_time.f_tacticsbook()
    )
    return output
  }

  /**
   * @function deck_books
   * Deck of books
   * @return {deck}
   */
  static t_deck_books = {
    vx_type: vx_core.t_type
  }
  static e_deck_books = {
    vx_type: nx_tactics_deck.t_deck_books
  }

  // (func deck-books)
  static f_deck_books() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Books",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_bookmap(
        vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_bookmap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_deck.c_tactics_all,
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
    vx_type: nx_tactics_deck.t_deck_encounters
  }

  // (func deck-encounters)
  static f_deck_encounters() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Encounters"
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
    vx_type: nx_tactics_deck.t_deck_home
  }

  // (func deck-home)
  static f_deck_home() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Home",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_deck.f_deck_books(),
          nx_tactics_deck.f_deck_setup(),
          nx_tactics_deck.f_deck_scenarios(),
          nx_tactics_deck.f_deck_encounters(),
          nx_tactics_deck.f_deck_places(),
          nx_tactics_deck.f_deck_units(),
          nx_tactics_deck.f_deck_items(),
          nx_tactics_deck.f_deck_skills(),
          nx_tactics_deck.f_deck_powers()
        )
      )
    )
    return output
  }

  /**
   * @function deck_items
   * @return {deck}
   */
  static t_deck_items = {
    vx_type: vx_core.t_type
  }
  static e_deck_items = {
    vx_type: nx_tactics_deck.t_deck_items
  }

  // (func deck-items)
  static f_deck_items() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Items"
    )
    return output
  }

  /**
   * @function deck_places
   * @return {deck}
   */
  static t_deck_places = {
    vx_type: vx_core.t_type
  }
  static e_deck_places = {
    vx_type: nx_tactics_deck.t_deck_places
  }

  // (func deck-places)
  static f_deck_places() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Places"
    )
    return output
  }

  /**
   * @function deck_powers
   * @return {deck}
   */
  static t_deck_powers = {
    vx_type: vx_core.t_type
  }
  static e_deck_powers = {
    vx_type: nx_tactics_deck.t_deck_powers
  }

  // (func deck-powers)
  static f_deck_powers() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Powers"
    )
    return output
  }

  /**
   * @function deck_scenarios
   * @return {deck}
   */
  static t_deck_scenarios = {
    vx_type: vx_core.t_type
  }
  static e_deck_scenarios = {
    vx_type: nx_tactics_deck.t_deck_scenarios
  }

  // (func deck-scenarios)
  static f_deck_scenarios() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Scenarios"
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
    vx_type: nx_tactics_deck.t_deck_setup
  }

  // (func deck-setup)
  static f_deck_setup() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Setup",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_starter.t_deck_starter,
          nx_tactics_decks_fate.f_deck_fate(),
          nx_tactics_decks_tarot.f_deck_tarot(),
          nx_tactics_damage.c_deck_wound,
          nx_tactics_damage.c_deck_disorder,
          nx_tactics_damage.c_deck_trauma
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
    vx_type: nx_tactics_deck.t_deck_skills
  }

  // (func deck-skills)
  static f_deck_skills() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const skillmap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_skillmap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_deck.c_tactics_all,
          ":skillmap"
        )
        const cardmap = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_skill, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_skillmap}, skillmap)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":name",
          "Skills",
          ":cardmap",
          cardmap
        )
      })
    )
    return output
  }

  /**
   * @function deck_units
   * @return {deck}
   */
  static t_deck_units = {
    vx_type: vx_core.t_type
  }
  static e_deck_units = {
    vx_type: nx_tactics_deck.t_deck_units
  }

  // (func deck-units)
  static f_deck_units() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Units"
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "tactics-all": nx_tactics_deck.c_tactics_all
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "booklist-all": nx_tactics_deck.e_booklist_all,
      "deck-books": nx_tactics_deck.e_deck_books,
      "deck-encounters": nx_tactics_deck.e_deck_encounters,
      "deck-home": nx_tactics_deck.e_deck_home,
      "deck-items": nx_tactics_deck.e_deck_items,
      "deck-places": nx_tactics_deck.e_deck_places,
      "deck-powers": nx_tactics_deck.e_deck_powers,
      "deck-scenarios": nx_tactics_deck.e_deck_scenarios,
      "deck-setup": nx_tactics_deck.e_deck_setup,
      "deck-skills": nx_tactics_deck.e_deck_skills,
      "deck-units": nx_tactics_deck.e_deck_units
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "booklist-all": nx_tactics_deck.t_booklist_all,
      "deck-books": nx_tactics_deck.t_deck_books,
      "deck-encounters": nx_tactics_deck.t_deck_encounters,
      "deck-home": nx_tactics_deck.t_deck_home,
      "deck-items": nx_tactics_deck.t_deck_items,
      "deck-places": nx_tactics_deck.t_deck_places,
      "deck-powers": nx_tactics_deck.t_deck_powers,
      "deck-scenarios": nx_tactics_deck.t_deck_scenarios,
      "deck-setup": nx_tactics_deck.t_deck_setup,
      "deck-skills": nx_tactics_deck.t_deck_skills,
      "deck-units": nx_tactics_deck.t_deck_units
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/deck",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func booklist-all)
    nx_tactics_deck.t_booklist_all['vx_value'] = {
      name          : "booklist-all",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_booklist_all
    }

    // (func deck-books)
    nx_tactics_deck.t_deck_books['vx_value'] = {
      name          : "deck-books",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_books
    }

    // (func deck-encounters)
    nx_tactics_deck.t_deck_encounters['vx_value'] = {
      name          : "deck-encounters",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_encounters
    }

    // (func deck-home)
    nx_tactics_deck.t_deck_home['vx_value'] = {
      name          : "deck-home",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_home
    }

    // (func deck-items)
    nx_tactics_deck.t_deck_items['vx_value'] = {
      name          : "deck-items",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_items
    }

    // (func deck-places)
    nx_tactics_deck.t_deck_places['vx_value'] = {
      name          : "deck-places",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_places
    }

    // (func deck-powers)
    nx_tactics_deck.t_deck_powers['vx_value'] = {
      name          : "deck-powers",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_powers
    }

    // (func deck-scenarios)
    nx_tactics_deck.t_deck_scenarios['vx_value'] = {
      name          : "deck-scenarios",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_scenarios
    }

    // (func deck-setup)
    nx_tactics_deck.t_deck_setup['vx_value'] = {
      name          : "deck-setup",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_setup
    }

    // (func deck-skills)
    nx_tactics_deck.t_deck_skills['vx_value'] = {
      name          : "deck-skills",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_skills
    }

    // (func deck-units)
    nx_tactics_deck.t_deck_units['vx_value'] = {
      name          : "deck-units",
      pkgname       : "nx/tactics/deck",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_deck.f_deck_units
    }

    // (const tactics-all)
    Object.assign(nx_tactics_deck.c_tactics_all, vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const booklist = nx_tactics_deck.f_booklist_all()
        return nx_tactics_base.f_tactics_from_booklist(booklist)
      })
    ))

  }
}
