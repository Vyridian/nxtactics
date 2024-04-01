'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scenario {

  /**
   * @function deck_murintrail
   * @return {deck}
   */
  static t_deck_murintrail = {
    vx_type: vx_core.t_type
  }
  static e_deck_murintrail = {
    vx_type: nx_tactics_decks_scenario.t_deck_murintrail
  }

  // (func deck-murintrail)
  static f_deck_murintrail() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const goblinscout = nx_tactics_decks_scenario.f_unit_goblinscout()
        const goblinscout_i = nx_tactics_base.f_cardimage_from_card(goblinscout)
        const horse = nx_tactics_decks_scenario.f_unit_horse()
        const horse_i = nx_tactics_base.f_cardimage_from_card(horse)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":name",
          "Murin Trail",
          ":cardmap",
          nx_tactics_base.f_cardmap_from_cardlist(
            vx_core.f_new(
              nx_tactics_base.t_cardlist,
              goblinscout,
              horse,
              nx_tactics_decks_scenario.f_unit_wilddog(),
              nx_tactics_decks_scenario.f_unit_woodencart(),
              nx_tactics_decks_scenario.f_place_forest(),
              nx_tactics_decks_scenario.f_place_guardpost(),
              nx_tactics_decks_scenario.f_place_mountain(),
              nx_tactics_decks_scenario.f_place_stoneroad()
            )
          )
        )
      })
    )
    return output
  }

  /**
   * @function place_forest
   * @return {location}
   */
  static t_place_forest = {
    vx_type: vx_core.t_type
  }
  static e_place_forest = {
    vx_type: nx_tactics_decks_scenario.t_place_forest
  }

  // (func place-forest)
  static f_place_forest() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Forest",
      ":image",
      "images/cards/place-forest.png"
    )
    return output
  }

  /**
   * @function place_guardpost
   * @return {location}
   */
  static t_place_guardpost = {
    vx_type: vx_core.t_type
  }
  static e_place_guardpost = {
    vx_type: nx_tactics_decks_scenario.t_place_guardpost
  }

  // (func place-guardpost)
  static f_place_guardpost() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Guardpost",
      ":image",
      "images/cards/place-guardpost.png"
    )
    return output
  }

  /**
   * @function place_mountain
   * @return {location}
   */
  static t_place_mountain = {
    vx_type: vx_core.t_type
  }
  static e_place_mountain = {
    vx_type: nx_tactics_decks_scenario.t_place_mountain
  }

  // (func place-mountain)
  static f_place_mountain() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Mountain",
      ":image",
      "images/cards/place-mountain.png"
    )
    return output
  }

  /**
   * @function place_stoneroad
   * @return {location}
   */
  static t_place_stoneroad = {
    vx_type: vx_core.t_type
  }
  static e_place_stoneroad = {
    vx_type: nx_tactics_decks_scenario.t_place_stoneroad
  }

  // (func place-stoneroad)
  static f_place_stoneroad() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Stone Road",
      ":image",
      "images/cards/place-stoneroad.png"
    )
    return output
  }

  /**
   * @function unit_goblinscout
   * @return {unit}
   */
  static t_unit_goblinscout = {
    vx_type: vx_core.t_type
  }
  static e_unit_goblinscout = {
    vx_type: nx_tactics_decks_scenario.t_unit_goblinscout
  }

  // (func unit-goblinscout)
  static f_unit_goblinscout() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Goblin Scout",
      ":image",
      "images/cards/unit-goblinscout.png"
    )
    return output
  }

  /**
   * @function unit_horse
   * @return {unit}
   */
  static t_unit_horse = {
    vx_type: vx_core.t_type
  }
  static e_unit_horse = {
    vx_type: nx_tactics_decks_scenario.t_unit_horse
  }

  // (func unit-horse)
  static f_unit_horse() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Horse",
      ":image",
      "images/cards/unit-horse.png"
    )
    return output
  }

  /**
   * @function unit_wilddog
   * @return {unit}
   */
  static t_unit_wilddog = {
    vx_type: vx_core.t_type
  }
  static e_unit_wilddog = {
    vx_type: nx_tactics_decks_scenario.t_unit_wilddog
  }

  // (func unit-wilddog)
  static f_unit_wilddog() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Wild Dog",
      ":image",
      "images/cards/unit-wilddog.png"
    )
    return output
  }

  /**
   * @function unit_woodencart
   * @return {unit}
   */
  static t_unit_woodencart = {
    vx_type: vx_core.t_type
  }
  static e_unit_woodencart = {
    vx_type: nx_tactics_decks_scenario.t_unit_woodencart
  }

  // (func unit-woodencart)
  static f_unit_woodencart() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Wooden Cart",
      ":image",
      "images/cards/unit-woodencart.png"
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-murintrail": nx_tactics_decks_scenario.e_deck_murintrail,
      "place-forest": nx_tactics_decks_scenario.e_place_forest,
      "place-guardpost": nx_tactics_decks_scenario.e_place_guardpost,
      "place-mountain": nx_tactics_decks_scenario.e_place_mountain,
      "place-stoneroad": nx_tactics_decks_scenario.e_place_stoneroad,
      "unit-goblinscout": nx_tactics_decks_scenario.e_unit_goblinscout,
      "unit-horse": nx_tactics_decks_scenario.e_unit_horse,
      "unit-wilddog": nx_tactics_decks_scenario.e_unit_wilddog,
      "unit-woodencart": nx_tactics_decks_scenario.e_unit_woodencart
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-murintrail": nx_tactics_decks_scenario.t_deck_murintrail,
      "place-forest": nx_tactics_decks_scenario.t_place_forest,
      "place-guardpost": nx_tactics_decks_scenario.t_place_guardpost,
      "place-mountain": nx_tactics_decks_scenario.t_place_mountain,
      "place-stoneroad": nx_tactics_decks_scenario.t_place_stoneroad,
      "unit-goblinscout": nx_tactics_decks_scenario.t_unit_goblinscout,
      "unit-horse": nx_tactics_decks_scenario.t_unit_horse,
      "unit-wilddog": nx_tactics_decks_scenario.t_unit_wilddog,
      "unit-woodencart": nx_tactics_decks_scenario.t_unit_woodencart
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scenario",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-murintrail)
    nx_tactics_decks_scenario.t_deck_murintrail['vx_value'] = {
      name          : "deck-murintrail",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_deck_murintrail
    }

    // (func place-forest)
    nx_tactics_decks_scenario.t_place_forest['vx_value'] = {
      name          : "place-forest",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_forest
    }

    // (func place-guardpost)
    nx_tactics_decks_scenario.t_place_guardpost['vx_value'] = {
      name          : "place-guardpost",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_guardpost
    }

    // (func place-mountain)
    nx_tactics_decks_scenario.t_place_mountain['vx_value'] = {
      name          : "place-mountain",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_mountain
    }

    // (func place-stoneroad)
    nx_tactics_decks_scenario.t_place_stoneroad['vx_value'] = {
      name          : "place-stoneroad",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_stoneroad
    }

    // (func unit-goblinscout)
    nx_tactics_decks_scenario.t_unit_goblinscout['vx_value'] = {
      name          : "unit-goblinscout",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_goblinscout
    }

    // (func unit-horse)
    nx_tactics_decks_scenario.t_unit_horse['vx_value'] = {
      name          : "unit-horse",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_horse
    }

    // (func unit-wilddog)
    nx_tactics_decks_scenario.t_unit_wilddog['vx_value'] = {
      name          : "unit-wilddog",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_wilddog
    }

    // (func unit-woodencart)
    nx_tactics_decks_scenario.t_unit_woodencart['vx_value'] = {
      name          : "unit-woodencart",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_woodencart
    }

  }
}
