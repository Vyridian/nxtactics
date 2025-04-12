'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_type from "../../../vx/type.js"


export default class nx_tactics_decks_starter {

  /**
   * @function card_conflictlower
   * @return {card}
   */
  static t_card_conflictlower = {
    vx_type: vx_core.t_type
  }
  static e_card_conflictlower = {
    vx_type: nx_tactics_decks_starter.t_card_conflictlower
  }

  // (func card-conflictlower)
  static f_card_conflictlower() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "conflictlower", ":name", "Conflict: Lower", ":image", "images/card-conflict-lower.svg", ":summary", "Conflict: Play this when playing a Conflict card to indicate that the lower choice on the card is being used (i.e. the side facing toward you).")
    return output
  }

  /**
   * @function card_conflictupper
   * @return {card}
   */
  static t_card_conflictupper = {
    vx_type: vx_core.t_type
  }
  static e_card_conflictupper = {
    vx_type: nx_tactics_decks_starter.t_card_conflictupper
  }

  // (func card-conflictupper)
  static f_card_conflictupper() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "conflictupper", ":name", "Conflict: Upper", ":image", "images/card-conflict-upper.svg", ":summary", "Conflict: Play this when playing a Conflict card to indicate that the upper choice on the card is being used (i.e. the side facing away from you).")
    return output
  }

  /**
   * @function card_player
   * @param  {string} color
   * @param  {int} num
   * @return {card}
   */
  static t_card_player = {
    vx_type: vx_core.t_type
  }
  static e_card_player = {
    vx_type: nx_tactics_decks_starter.t_card_player
  }

  // (func card-player)
  static f_card_player(color, num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "card-player-", color, "-", num),
      ":name",
      "Player",
      ":image",
      vx_core.f_new({"any-1": vx_core.t_string}, "images/card-", color, ".svg"),
      ":summary",
      "* [Game Start]: Place your Units on the [Status Bar] with a Unit# card. Arrange your other Unit cards in front of you.\n* [Round End]: [Draw]:1 and [Recover]."
    )
    return output
  }

  /**
   * @function card_rotated
   * @param  {string} color
   * @param  {int} num
   * @return {card}
   */
  static t_card_rotated = {
    vx_type: vx_core.t_type
  }
  static e_card_rotated = {
    vx_type: nx_tactics_decks_starter.t_card_rotated
  }

  // (func card-rotated)
  static f_card_rotated(color, num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "card-rotated-", color, "-", num),
      ":name",
      "Rotated Cards",
      ":image",
      vx_core.f_new({"any-1": vx_core.t_string}, "images/card-", color, ".svg"),
      ":summary",
      "* [Between Games]: Rotate this card 90 degrees and place it on top of all rotated card.\n* [Game Start]: Rotate this card 90 degrees with all cards under it and then remove this card to return the rotated cards to their correct orientation."
    )
    return output
  }

  /**
   * @function card_target
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
  static f_card_target(color, num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "card-target-", color, "-", num),
      ":name",
      vx_core.f_new({"any-1": vx_core.t_string}, "Target #", num),
      ":image",
      vx_core.f_new({"any-1": vx_core.t_string}, "images/card-", color, ".svg"),
      ":summary",
      "* [Round Start]: Place this card on your [Target] for the [Round]."
    )
    return output
  }

  /**
   * @function card_unit
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
  static f_card_unit(color, num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "unit-", color, "-", num),
      ":name",
      vx_core.f_new({"any-1": vx_core.t_string}, "Unit #", num),
      ":image",
      vx_core.f_new({"any-1": vx_core.t_string}, "images/card-", color, ".svg"),
      ":summary",
      "* Place this card above a Unit.\n* [Damage] and [Target] cards are placed near this card.\n* [Round Start]: Set [Move]:[Speed] and [Turn]:2"
    )
    return output
  }

  /**
   * @function deck_player
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
  static f_deck_player(color) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_decks_starter.f_card_player(color, 1),
          nx_tactics_decks_starter.f_card_rotated(color, 1),
          nx_tactics_decks_starter.f_card_unit(color, 1),
          nx_tactics_decks_starter.f_card_unit(color, 2),
          nx_tactics_decks_starter.f_card_unit(color, 3),
          nx_tactics_decks_starter.f_card_unit(color, 4),
          nx_tactics_decks_starter.f_card_unit(color, 5),
          nx_tactics_decks_starter.f_card_target(color, 1),
          nx_tactics_decks_starter.f_card_target(color, 2),
          nx_tactics_decks_starter.f_card_target(color, 3),
          nx_tactics_decks_starter.f_card_target(color, 4),
          nx_tactics_decks_starter.f_card_target(color, 5)
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new(
          {"any-1": nx_tactics_base.t_deck},
          ":id",
          vx_core.f_new({"any-1": vx_core.t_string}, "deck-player-", color),
          ":name",
          "Player Deck",
          ":image",
          vx_core.f_new({"any-1": vx_core.t_string}, "images/card-", color, ".svg"),
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
      "card-conflictlower": nx_tactics_decks_starter.e_card_conflictlower,
      "card-conflictupper": nx_tactics_decks_starter.e_card_conflictupper,
      "card-player": nx_tactics_decks_starter.e_card_player,
      "card-rotated": nx_tactics_decks_starter.e_card_rotated,
      "card-target": nx_tactics_decks_starter.e_card_target,
      "card-unit": nx_tactics_decks_starter.e_card_unit,
      "deck-player": nx_tactics_decks_starter.e_deck_player
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "card-conflictlower": nx_tactics_decks_starter.t_card_conflictlower,
      "card-conflictupper": nx_tactics_decks_starter.t_card_conflictupper,
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

    // (func card-conflictlower)
    nx_tactics_decks_starter.t_card_conflictlower['vx_value'] = {
      name          : "card-conflictlower",
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
      fn            : nx_tactics_decks_starter.f_card_conflictlower
    }

    // (func card-conflictupper)
    nx_tactics_decks_starter.t_card_conflictupper['vx_value'] = {
      name          : "card-conflictupper",
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
      fn            : nx_tactics_decks_starter.f_card_conflictupper
    }

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
