'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_type from "../../../vx/type.js"


export default class nx_tactics_decks_starter {

  /**
   * @function card_player
   * @param  {tactics} tactics
   * @param  {string} color
   * @return {card}
   */
  static t_card_player = {
    vx_type: vx_core.t_type
  }
  static e_card_player = {
    vx_type: nx_tactics_decks_starter.t_card_player
  }

  // (func card-player)
  static f_card_player(tactics, color) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_card},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const rule = nx_tactics_base.f_rule_from_tactics_key(tactics, "Player")
        return vx_core.f_copy(
          rule,
          ":id",
          vx_core.f_new({"any-1": vx_core.t_string}, "player-", color),
          ":image",
          vx_core.f_new({"any-1": vx_core.t_string}, "images/rule-player-", color, ".svg")
        )
      })
    )
    return output
  }

  /**
   * @function card_rotated
   * @param  {tactics} tactics
   * @param  {string} color
   * @return {card}
   */
  static t_card_rotated = {
    vx_type: vx_core.t_type
  }
  static e_card_rotated = {
    vx_type: nx_tactics_decks_starter.t_card_rotated
  }

  // (func card-rotated)
  static f_card_rotated(tactics, color) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_card},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const rule = nx_tactics_base.f_rule_from_tactics_key(tactics, "Rotated Cards")
        return vx_core.f_copy(
          rule,
          ":id",
          vx_core.f_new({"any-1": vx_core.t_string}, "rotatedcards-", color),
          ":image",
          vx_core.f_new({"any-1": vx_core.t_string}, "images/rule-player-", color, ".svg")
        )
      })
    )
    return output
  }

  /**
   * @function card_target
   * @param  {tactics} tactics
   * @param  {string} color
   * @param  {int} num
   * @return {card}
   */
  static t_card_target = {
    vx_type: vx_core.t_type
  }
  static e_card_target = {
    vx_type: nx_tactics_decks_starter.t_card_target
  }

  // (func card-target)
  static f_card_target(tactics, color, num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_card},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const rule = nx_tactics_base.f_rule_from_tactics_key(tactics, "Target#")
        return vx_core.f_copy(
          rule,
          ":id",
          vx_core.f_new({"any-1": vx_core.t_string}, "target-", color, "-", num),
          ":name",
          vx_core.f_new({"any-1": vx_core.t_string}, "Target#", num),
          ":image",
          vx_core.f_new({"any-1": vx_core.t_string}, "images/rule-player-", color, ".svg")
        )
      })
    )
    return output
  }

  /**
   * @function card_unit
   * @param  {tactics} tactics
   * @param  {string} color
   * @param  {int} num
   * @return {card}
   */
  static t_card_unit = {
    vx_type: vx_core.t_type
  }
  static e_card_unit = {
    vx_type: nx_tactics_decks_starter.t_card_unit
  }

  // (func card-unit)
  static f_card_unit(tactics, color, num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_card},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const rule = nx_tactics_base.f_rule_from_tactics_key(tactics, "Unit#")
        return vx_core.f_copy(
          rule,
          ":id",
          vx_core.f_new({"any-1": vx_core.t_string}, "unit-", color, "-", num),
          ":name",
          vx_core.f_new({"any-1": vx_core.t_string}, "Unit#", num),
          ":image",
          vx_core.f_new({"any-1": vx_core.t_string}, "images/rule-player-", color, ".svg")
        )
      })
    )
    return output
  }

  /**
   * @function deck_player
   * @param  {tactics} tactics
   * @param  {string} color
   * @return {deck}
   */
  static t_deck_player = {
    vx_type: vx_core.t_type
  }
  static e_deck_player = {
    vx_type: nx_tactics_decks_starter.t_deck_player
  }

  // (func deck-player)
  static f_deck_player(tactics, color) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_decks_starter.f_card_player(tactics, color),
          nx_tactics_decks_starter.f_card_rotated(tactics, color),
          nx_tactics_decks_starter.f_card_unit(tactics, color, 1),
          nx_tactics_decks_starter.f_card_unit(tactics, color, 2),
          nx_tactics_decks_starter.f_card_unit(tactics, color, 3),
          nx_tactics_decks_starter.f_card_unit(tactics, color, 4),
          nx_tactics_decks_starter.f_card_unit(tactics, color, 5),
          nx_tactics_decks_starter.f_card_target(tactics, color, 1),
          nx_tactics_decks_starter.f_card_target(tactics, color, 2),
          nx_tactics_decks_starter.f_card_target(tactics, color, 3),
          nx_tactics_decks_starter.f_card_target(tactics, color, 4),
          nx_tactics_decks_starter.f_card_target(tactics, color, 5)
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new(
          {"any-1": nx_tactics_base.t_deck},
          ":id",
          vx_core.f_new({"any-1": vx_core.t_string}, "deck-player-", color),
          ":name",
          "Player Deck",
          ":image",
          vx_core.f_new({"any-1": vx_core.t_string}, "images/rule-player-", color, "-deck.svg"),
          ":layout",
          nx_tactics_base.c_cardlayout_imageonly,
          ":cardmap",
          cardmap
        )
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "card-player": nx_tactics_decks_starter.e_card_player,
      "card-rotated": nx_tactics_decks_starter.e_card_rotated,
      "card-target": nx_tactics_decks_starter.e_card_target,
      "card-unit": nx_tactics_decks_starter.e_card_unit,
      "deck-player": nx_tactics_decks_starter.e_deck_player
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "card-player": nx_tactics_decks_starter.t_card_player,
      "card-rotated": nx_tactics_decks_starter.t_card_rotated,
      "card-target": nx_tactics_decks_starter.t_card_target,
      "card-unit": nx_tactics_decks_starter.t_card_unit,
      "deck-player": nx_tactics_decks_starter.t_deck_player
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/starter",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func card-player)
    nx_tactics_decks_starter.t_card_player['vx_value'] = {
      name          : "card-player",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_card_player
    }

    // (func card-rotated)
    nx_tactics_decks_starter.t_card_rotated['vx_value'] = {
      name          : "card-rotated",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_card_rotated
    }

    // (func card-target)
    nx_tactics_decks_starter.t_card_target['vx_value'] = {
      name          : "card-target",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_card_target
    }

    // (func card-unit)
    nx_tactics_decks_starter.t_card_unit['vx_value'] = {
      name          : "card-unit",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_card_unit
    }

    // (func deck-player)
    nx_tactics_decks_starter.t_deck_player['vx_value'] = {
      name          : "deck-player",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_deck_player
    }

  }
}
