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
        "Skill#",
        num
      ),
      ":image",
      vx_core.f_new(
        vx_core.t_string,
        "images/card-",
        color,
        ".svg"
      )
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
        "Turn Order: Unit#",
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
      "* Reveal: Flip each card of [Turn Order] deck to form a row. This is the [Player] order this turn.\n* Action1: Each [Player] chooses a Unit to activate along with their first [Action] and target(s).\n* Change1: In order, each [Player] may change their decision.\n* Resolve1: If a player was the target of an Action, they must wait for that action to resolve. Otherwise, all players performs their Action simultaneously. Note: lower order Units cannot be blocked by the movement of higher order Units.\n* Action2: Each [Player] chooses their second [Action] and targets.\n* Change2: Same as Change1.\n* Resolve2: Same as Resolve1."
    )
    return output
  }

  /**
   * @function card_turn_player
   * @param  {string} color
   * @return {card}
   */
  static t_card_turn_player = {
    vx_type: vx_core.t_type
  }
  static e_card_turn_player = {
    vx_type: nx_tactics_decks_starter.t_card_turn_player
  }

  // (func card-turn-player)
  static f_card_turn_player(color) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "turn-player-",
        color
      ),
      ":name",
      "Turn: Player"
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
        "Unit#",
        num
      ),
      ":image",
      vx_core.f_new(
        vx_core.t_string,
        "images/card-",
        color,
        ".svg"
      )
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



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "card-fatelower": nx_tactics_decks_starter.e_card_fatelower,
      "card-fateupper": nx_tactics_decks_starter.e_card_fateupper,
      "card-player": nx_tactics_decks_starter.e_card_player,
      "card-skill": nx_tactics_decks_starter.e_card_skill,
      "card-turn-order": nx_tactics_decks_starter.e_card_turn_order,
      "card-turn-player": nx_tactics_decks_starter.e_card_turn_player,
      "card-unit": nx_tactics_decks_starter.e_card_unit,
      "deck-player": nx_tactics_decks_starter.e_deck_player
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "card-fatelower": nx_tactics_decks_starter.t_card_fatelower,
      "card-fateupper": nx_tactics_decks_starter.t_card_fateupper,
      "card-player": nx_tactics_decks_starter.t_card_player,
      "card-skill": nx_tactics_decks_starter.t_card_skill,
      "card-turn-order": nx_tactics_decks_starter.t_card_turn_order,
      "card-turn-player": nx_tactics_decks_starter.t_card_turn_player,
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

    // (func card-turn-player)
    nx_tactics_decks_starter.t_card_turn_player['vx_value'] = {
      name          : "card-turn-player",
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
      fn            : nx_tactics_decks_starter.f_card_turn_player
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

  }
}
