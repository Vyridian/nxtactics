'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_type from "../../../vx/type.js"


export default class nx_tactics_decks_starter {

  /**
   * @function card_fatelower
   * @return {card}
   */
  static t_card_fatelower = {
    vx_type: vx_core.t_type
  }
  static e_card_fatelower = {
    vx_type: nx_tactics_decks_starter.t_card_fatelower
  }

  // (func card-fatelower)
  static f_card_fatelower() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "fatelower",
      ":name",
      "Fate: Inverted",
      ":image",
      "images/card-fate-lower.svg",
      ":summary",
      "Fate: Play this when playing a Fate card to indicate that the lower choice on the Fate is being used (i.e. the side facing toward you)."
    )
    return output
  }

  /**
   * @function card_fateupper
   * @return {card}
   */
  static t_card_fateupper = {
    vx_type: vx_core.t_type
  }
  static e_card_fateupper = {
    vx_type: nx_tactics_decks_starter.t_card_fateupper
  }

  // (func card-fateupper)
  static f_card_fateupper() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "fateupper",
      ":name",
      "Fate: Dignified",
      ":image",
      "images/card-fate-upper.svg",
      ":summary",
      "Fate: Play this when playing a Fate card to indicate that the upper choice on the Fate is being used (i.e. the side facing away from you)."
    )
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
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "card-player-",
        color,
        "-",
        num
      ),
      ":name",
      "Player",
      ":image",
      vx_core.f_new(
        vx_core.t_string,
        "images/card-",
        color,
        ".svg"
      ),
      ":summary",
      "* Used as a cover for this player's cards."
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
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "card-rotated-",
        color,
        "-",
        num
      ),
      ":name",
      "Rotated Cards",
      ":image",
      vx_core.f_new(
        vx_core.t_string,
        "images/card-",
        color,
        ".svg"
      ),
      ":summary",
      "* This Card is used to keep the orientation of cards when stored between games.\n* Between Games: Rotate this card 90 degrees and place it on top of all rotated card.\n* When Starting a game: Rotate this card 90 degrees with all cards under it and then remove this card to return the rotated cards to their correct orientation."
    )
    return output
  }

  /**
   * @function card_round_num
   * @param  {int} num
   * @return {card}
   */
  static t_card_round_num = {
    vx_type: vx_core.t_type
  }
  static e_card_round_num = {
    vx_type: nx_tactics_decks_starter.t_card_round_num
  }

  // (func card-round-num)
  static f_card_round_num(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "card-round-num-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Round #: ",
        num
      )
    )
    return output
  }

  /**
   * @function card_skill
   * @param  {string} color
   * @param  {int} num
   * @return {card}
   */
  static t_card_skill = {
    vx_type: vx_core.t_type
  }
  static e_card_skill = {
    vx_type: nx_tactics_decks_starter.t_card_skill
  }

  // (func card-skill)
  static f_card_skill(color, num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "card-skill-",
        color,
        "-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Skill #",
        num
      ),
      ":image",
      vx_core.f_new(
        vx_core.t_string,
        "images/card-",
        color,
        ".svg"
      ),
      ":summary",
      "* Used when a [Skill] needs a [Target].\n* Place the Skill# card on the active Skill card and the matching Target# on the target."
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
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "card-target-",
        color,
        "-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Target #",
        num
      ),
      ":image",
      vx_core.f_new(
        vx_core.t_string,
        "images/card-",
        color,
        ".svg"
      ),
      ":summary",
      "* Used when a [Skill] needs a [Target].\n* Place the Skill# card on the active Skill card and the matching Target# on the target."
    )
    return output
  }

  /**
   * @function card_turn_order
   * @param  {string} color
   * @param  {int} num
   * @return {card}
   */
  static t_card_turn_order = {
    vx_type: vx_core.t_type
  }
  static e_card_turn_order = {
    vx_type: nx_tactics_decks_starter.t_card_turn_order
  }

  // (func card-turn-order)
  static f_card_turn_order(color, num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "turn-order-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Turn Order: Unit #",
        num
      ),
      ":image",
      vx_core.f_new(
        vx_core.t_string,
        "images/card-",
        color,
        ".svg"
      ),
      ":summary",
      "* Reveal: Flip each card of [Turn Order] deck to form a row.\n* Action 1: Simultaneously, each unit's controller chooses a target (or none) for this Round and places their Target card on that Turn Order card.\n* Change 1: In order, each Unit may change their decision.\n* Resolve 1: All Units act simultaneously. IF a Unit was targeted by a Unit with a lower Turn Order THEN they must wait for the targeting Unit to resolve. Note: lower order Units cannot be blocked by the movement of higher order Units.\n* Action 2: Each unit's controller simulataneously chooses and resolves their second Action."
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
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "unit-",
        color,
        "-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Unit #",
        num
      ),
      ":image",
      vx_core.f_new(
        vx_core.t_string,
        "images/card-",
        color,
        ".svg"
      ),
      ":summary",
      "* Represents a particular unit.\n* Place this card above the matching Unit. All [Damage] and [Target] cards are placed on this card."
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
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_starter.f_card_player(color, 1),
          nx_tactics_decks_starter.f_card_rotated(color, 1),
          nx_tactics_decks_starter.f_card_turn_order(color, 1),
          nx_tactics_decks_starter.f_card_turn_order(color, 2),
          nx_tactics_decks_starter.f_card_turn_order(color, 3),
          nx_tactics_decks_starter.f_card_turn_order(color, 4),
          nx_tactics_decks_starter.f_card_turn_order(color, 5),
          nx_tactics_decks_starter.f_card_unit(color, 1),
          nx_tactics_decks_starter.f_card_unit(color, 2),
          nx_tactics_decks_starter.f_card_unit(color, 3),
          nx_tactics_decks_starter.f_card_unit(color, 4),
          nx_tactics_decks_starter.f_card_unit(color, 5),
          nx_tactics_decks_starter.f_card_target(color, 1),
          nx_tactics_decks_starter.f_card_target(color, 2),
          nx_tactics_decks_starter.f_card_target(color, 3),
          nx_tactics_decks_starter.f_card_target(color, 4),
          nx_tactics_decks_starter.f_card_target(color, 5),
          nx_tactics_decks_starter.f_card_skill(color, 1),
          nx_tactics_decks_starter.f_card_skill(color, 2),
          nx_tactics_decks_starter.f_card_skill(color, 3),
          nx_tactics_decks_starter.f_card_skill(color, 4),
          nx_tactics_decks_starter.f_card_skill(color, 5)
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":id",
          vx_core.f_new(
            vx_core.t_string,
            "deck-player-",
            color
          ),
          ":name",
          "Player Deck",
          ":image",
          vx_core.f_new(
            vx_core.t_string,
            "images/card-",
            color,
            ".svg"
          ),
          ":cardmap",
          cardmap
        )
      })
    )
    return output
  }

  /**
   * @function deck_round
   * @return {deck}
   */
  static t_deck_round = {
    vx_type: vx_core.t_type
  }
  static e_deck_round = {
    vx_type: nx_tactics_decks_starter.t_deck_round
  }

  // (func deck-round)
  static f_deck_round() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "deck-round"
      ),
      ":name",
      "Round Deck",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        nx_tactics_decks_starter.f_card_round_num(1),
        nx_tactics_decks_starter.f_card_round_num(2),
        nx_tactics_decks_starter.f_card_round_num(3),
        nx_tactics_decks_starter.f_card_round_num(4),
        nx_tactics_decks_starter.f_card_round_num(5),
        nx_tactics_decks_starter.f_card_round_num(6),
        nx_tactics_decks_starter.f_card_round_num(7),
        nx_tactics_decks_starter.f_card_round_num(8),
        nx_tactics_decks_starter.f_card_round_num(9),
        nx_tactics_decks_starter.f_card_round_num(10),
        nx_tactics_decks_starter.f_card_round_num(11),
        nx_tactics_decks_starter.f_card_round_num(12),
        nx_tactics_decks_starter.f_card_round_num(13),
        nx_tactics_decks_starter.f_card_round_num(14),
        nx_tactics_decks_starter.f_card_round_num(15),
        nx_tactics_decks_starter.f_card_round_num(16),
        nx_tactics_decks_starter.f_card_round_num(17),
        nx_tactics_decks_starter.f_card_round_num(18),
        nx_tactics_decks_starter.f_card_round_num(19),
        nx_tactics_decks_starter.f_card_round_num(20)
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "card-fatelower": nx_tactics_decks_starter.e_card_fatelower,
      "card-fateupper": nx_tactics_decks_starter.e_card_fateupper,
      "card-player": nx_tactics_decks_starter.e_card_player,
      "card-rotated": nx_tactics_decks_starter.e_card_rotated,
      "card-round-num": nx_tactics_decks_starter.e_card_round_num,
      "card-skill": nx_tactics_decks_starter.e_card_skill,
      "card-target": nx_tactics_decks_starter.e_card_target,
      "card-turn-order": nx_tactics_decks_starter.e_card_turn_order,
      "card-unit": nx_tactics_decks_starter.e_card_unit,
      "deck-player": nx_tactics_decks_starter.e_deck_player,
      "deck-round": nx_tactics_decks_starter.e_deck_round
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "card-fatelower": nx_tactics_decks_starter.t_card_fatelower,
      "card-fateupper": nx_tactics_decks_starter.t_card_fateupper,
      "card-player": nx_tactics_decks_starter.t_card_player,
      "card-rotated": nx_tactics_decks_starter.t_card_rotated,
      "card-round-num": nx_tactics_decks_starter.t_card_round_num,
      "card-skill": nx_tactics_decks_starter.t_card_skill,
      "card-target": nx_tactics_decks_starter.t_card_target,
      "card-turn-order": nx_tactics_decks_starter.t_card_turn_order,
      "card-unit": nx_tactics_decks_starter.t_card_unit,
      "deck-player": nx_tactics_decks_starter.t_deck_player,
      "deck-round": nx_tactics_decks_starter.t_deck_round
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

    // (func card-fatelower)
    nx_tactics_decks_starter.t_card_fatelower['vx_value'] = {
      name          : "card-fatelower",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_card_fatelower
    }

    // (func card-fateupper)
    nx_tactics_decks_starter.t_card_fateupper['vx_value'] = {
      name          : "card-fateupper",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_card_fateupper
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
      traits        : [],
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_starter.f_card_rotated
    }

    // (func card-round-num)
    nx_tactics_decks_starter.t_card_round_num['vx_value'] = {
      name          : "card-round-num",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_card_round_num
    }

    // (func card-skill)
    nx_tactics_decks_starter.t_card_skill['vx_value'] = {
      name          : "card-skill",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_card_skill
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_starter.f_card_target
    }

    // (func card-turn-order)
    nx_tactics_decks_starter.t_card_turn_order['vx_value'] = {
      name          : "card-turn-order",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_card_turn_order
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
      traits        : [],
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_starter.f_deck_player
    }

    // (func deck-round)
    nx_tactics_decks_starter.t_deck_round['vx_value'] = {
      name          : "deck-round",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_deck_round
    }

  }
}
