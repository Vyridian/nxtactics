'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_type from "../../../vx/type.js"


export default class nx_tactics_decks_starter {

  /**
   * @function card_characterguide
   * @return {card}
   */
  static t_card_characterguide = {
    vx_type: vx_core.t_type
  }
  static e_card_characterguide = {
    vx_type: nx_tactics_decks_starter.t_card_characterguide
  }

  // (func card-characterguide)
  static f_card_characterguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "characterguide",
      ":name",
      "Character Guide"
    )
    return output
  }

  /**
   * @function card_combatguide
   * @return {card}
   */
  static t_card_combatguide = {
    vx_type: vx_core.t_type
  }
  static e_card_combatguide = {
    vx_type: nx_tactics_decks_starter.t_card_combatguide
  }

  // (func card-combatguide)
  static f_card_combatguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "combatguide",
      ":name",
      "Combat Guide",
      ":summary",
      "* When a unit targets another with a damaging Skill/Power, then Combat begins.\n* Each player chooses a Fate card from their hand or a random Fate from Shared Fate.\n* Fate Cards are compared like Rock/Paper/Scissors.\n* Order: Attack > Focus > Defend/Evade/Counter > Attack\n* If both play Attack or Focus then compare by rank (lower is faster).\n* Order: AJQK2-10\n* If Tied, there is no result.\n* If one player Wins, then resolve their result and apply Damage.\n* Discard all card used (except Keep)"
    )
    return output
  }

  /**
   * @function card_damageguide
   * @return {card}
   */
  static t_card_damageguide = {
    vx_type: vx_core.t_type
  }
  static e_card_damageguide = {
    vx_type: nx_tactics_decks_starter.t_card_damageguide
  }

  // (func card-damageguide)
  static f_card_damageguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "damageguide",
      ":name",
      "Damage Guide",
      ":summary",
      "* Damage Types: Determine the [Damage Types] of the weapon.\n* Reveal Damage: Reveal cards equal to [Hits].\n* Separate Damage: Separate them into 2 piles: Those that match the [Damage Types] (Damage) and those that don't (Fatigue).\n* Hit Location: The top card from the matching pile is the Hit Location (or the mismatch pile if no matches). Move it aside and flip the Fatigue pile to its facedown side.\n* Armor: Check [Armor] in the [Hit Location] and then the target reduces the Damage or Fatigue for each point of armor. The Hit Location can only be removed last.\n* Fatigue: The target may take the Fatigue cards as long they have Body. Any remaining Fatigue are flipped faceup and added to the Damage pile.\n* Damage: Count the Damage pile and apply the effect on the Hit Location card to the target.\n* Cleanup: Discard other cards. Shuffle if a Wild was revealed."
    )
    return output
  }

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
      "Fate Lower",
      ":image",
      "images/card-fate-lower.svg"
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
      "Fate Uppper",
      ":image",
      "images/card-fate-upper.svg"
    )
    return output
  }

  /**
   * @function card_gameguide
   * @return {card}
   */
  static t_card_gameguide = {
    vx_type: vx_core.t_type
  }
  static e_card_gameguide = {
    vx_type: nx_tactics_decks_starter.t_card_gameguide
  }

  // (func card-gameguide)
  static f_card_gameguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "gameguide",
      ":name",
      "Game Guide",
      ":summary",
      "* Create [Characters] or [Factions] to play [Scenarios].\n* Each [Scenario] contains various [Threats] and [Goals]\n* Find them and use your [Skills] / [Powers] to complete them for [Rewards]\n* Some [Rewards] are items, others allow you to increase your [Skills], [Powers], [Abilities], or [Specialties]"
    )
    return output
  }

  /**
   * @function card_levelingguide
   * @return {card}
   */
  static t_card_levelingguide = {
    vx_type: vx_core.t_type
  }
  static e_card_levelingguide = {
    vx_type: nx_tactics_decks_starter.t_card_levelingguide
  }

  // (func card-levelingguide)
  static f_card_levelingguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "levelingguide",
      ":name",
      "Leveling Guide"
    )
    return output
  }

  /**
   * @function card_player_blue
   * @param  {int} num
   * @return {card}
   */
  static t_card_player_blue = {
    vx_type: vx_core.t_type
  }
  static e_card_player_blue = {
    vx_type: nx_tactics_decks_starter.t_card_player_blue
  }

  // (func card-player-blue)
  static f_card_player_blue(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "player-blue-",
        num
      ),
      ":name",
      "Player",
      ":image",
      "images/card-blue.svg"
    )
    return output
  }

  /**
   * @function card_player_green
   * @param  {int} num
   * @return {card}
   */
  static t_card_player_green = {
    vx_type: vx_core.t_type
  }
  static e_card_player_green = {
    vx_type: nx_tactics_decks_starter.t_card_player_green
  }

  // (func card-player-green)
  static f_card_player_green(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "player-green-",
        num
      ),
      ":name",
      "Player",
      ":image",
      "images/card-green.svg"
    )
    return output
  }

  /**
   * @function card_player_red
   * @param  {int} num
   * @return {card}
   */
  static t_card_player_red = {
    vx_type: vx_core.t_type
  }
  static e_card_player_red = {
    vx_type: nx_tactics_decks_starter.t_card_player_red
  }

  // (func card-player-red)
  static f_card_player_red(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "player-red-",
        num
      ),
      ":name",
      "Player",
      ":image",
      "images/card-red.svg"
    )
    return output
  }

  /**
   * @function card_player_yellow
   * @param  {int} num
   * @return {card}
   */
  static t_card_player_yellow = {
    vx_type: vx_core.t_type
  }
  static e_card_player_yellow = {
    vx_type: nx_tactics_decks_starter.t_card_player_yellow
  }

  // (func card-player-yellow)
  static f_card_player_yellow(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "player-yellow-",
        num
      ),
      ":name",
      "Player",
      ":image",
      "images/card-yellow.svg"
    )
    return output
  }

  /**
   * @function card_setupguide
   * @return {card}
   */
  static t_card_setupguide = {
    vx_type: vx_core.t_type
  }
  static e_card_setupguide = {
    vx_type: nx_tactics_decks_starter.t_card_setupguide
  }

  // (func card-setupguide)
  static f_card_setupguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "setupguide",
      ":name",
      "Setup Guide",
      ":summary",
      "* Choose a Scenario and sort it in numerical order.\n* Each [Player] chooses or creates the [Units] they will use.\n* Each [Player] chooses a colored Starter Deck.\n* Player [Turn Order] cards are shuffled together to create a [Turn Order] deck.\n* Reveal the top card in the Scenario deck and follow its instructions."
    )
    return output
  }

  /**
   * @function card_skillguide
   * @return {card}
   */
  static t_card_skillguide = {
    vx_type: vx_core.t_type
  }
  static e_card_skillguide = {
    vx_type: nx_tactics_decks_starter.t_card_skillguide
  }

  // (func card-skillguide)
  static f_card_skillguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "skillguide",
      ":name",
      "Skill Guide"
    )
    return output
  }

  /**
   * @function card_turnguide
   * @return {card}
   */
  static t_card_turnguide = {
    vx_type: vx_core.t_type
  }
  static e_card_turnguide = {
    vx_type: nx_tactics_decks_starter.t_card_turnguide
  }

  // (func card-turnguide)
  static f_card_turnguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "turnguide",
      ":name",
      "Turn Guide",
      ":summary",
      "* Reveal: Reveal the top card from the [Turn Order] deck to determine the next active Player.\n* Activate and Target: That [Player] chooses a Unit to Activate and announces a target.\n* Reveal Again: Reveal the next card from the [Turn Order] deck. If none, got to Take Actions\n* Activate and Target: The next Player MAY choose a Unit to Activate and announce a target that is not currently an active Player or a target. If so, repeat the Reveal Again step.\n* Wait: OR the next player may Wait for the previous [Player] to finish.\n* Take Actions: If a player Waited or there are no [Turn Order] cards remaining, the active Players may simultaneous Take Actions."
    )
    return output
  }

  /**
   * @function card_turnorder
   * @return {card}
   */
  static t_card_turnorder = {
    vx_type: vx_core.t_type
  }
  static e_card_turnorder = {
    vx_type: nx_tactics_decks_starter.t_card_turnorder
  }

  // (func card-turnorder)
  static f_card_turnorder() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "turnorder",
      ":name",
      "Turn Order"
    )
    return output
  }

  /**
   * @function card_unit_blue
   * @param  {int} num
   * @return {card}
   */
  static t_card_unit_blue = {
    vx_type: vx_core.t_type
  }
  static e_card_unit_blue = {
    vx_type: nx_tactics_decks_starter.t_card_unit_blue
  }

  // (func card-unit-blue)
  static f_card_unit_blue(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "unit-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Unit ",
        num
      ),
      ":image",
      "images/card-blue.svg"
    )
    return output
  }

  /**
   * @function card_unit_green
   * @param  {int} num
   * @return {card}
   */
  static t_card_unit_green = {
    vx_type: vx_core.t_type
  }
  static e_card_unit_green = {
    vx_type: nx_tactics_decks_starter.t_card_unit_green
  }

  // (func card-unit-green)
  static f_card_unit_green(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "unit-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Unit ",
        num
      ),
      ":image",
      "images/card-green.svg"
    )
    return output
  }

  /**
   * @function card_unit_red
   * @param  {int} num
   * @return {card}
   */
  static t_card_unit_red = {
    vx_type: vx_core.t_type
  }
  static e_card_unit_red = {
    vx_type: nx_tactics_decks_starter.t_card_unit_red
  }

  // (func card-unit-red)
  static f_card_unit_red(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "unit-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Unit ",
        num
      ),
      ":image",
      "images/card-red.svg"
    )
    return output
  }

  /**
   * @function card_unit_yellow
   * @param  {int} num
   * @return {card}
   */
  static t_card_unit_yellow = {
    vx_type: vx_core.t_type
  }
  static e_card_unit_yellow = {
    vx_type: nx_tactics_decks_starter.t_card_unit_yellow
  }

  // (func card-unit-yellow)
  static f_card_unit_yellow(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "unit-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Unit ",
        num
      ),
      ":image",
      "images/card-yellow.svg"
    )
    return output
  }

  /**
   * @function deck_player
   * @return {deck}
   */
  static t_deck_player = {
    vx_type: vx_core.t_type
  }
  static e_deck_player = {
    vx_type: nx_tactics_decks_starter.t_deck_player
  }

  // (func deck-player)
  static f_deck_player() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_starter.f_card_gameguide(),
          nx_tactics_decks_starter.f_card_setupguide(),
          nx_tactics_decks_starter.f_card_turnguide(),
          nx_tactics_decks_starter.f_card_combatguide(),
          nx_tactics_decks_starter.f_card_damageguide(),
          nx_tactics_decks_starter.f_card_skillguide(),
          nx_tactics_decks_starter.f_card_characterguide(),
          nx_tactics_decks_starter.f_card_levelingguide(),
          nx_tactics_decks_starter.f_card_turnorder(),
          nx_tactics_decks_starter.f_card_fateupper(),
          nx_tactics_decks_starter.f_card_fatelower()
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":id",
          "player",
          ":name",
          "Player",
          ":cardmap",
          cardmap
        )
      })
    )
    return output
  }

  /**
   * @function deck_player_blue
   * @return {deck}
   */
  static t_deck_player_blue = {
    vx_type: vx_core.t_type
  }
  static e_deck_player_blue = {
    vx_type: nx_tactics_decks_starter.t_deck_player_blue
  }

  // (func deck-player-blue)
  static f_deck_player_blue() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_starter.f_card_player_blue(1),
          nx_tactics_decks_starter.f_card_player_blue(2),
          nx_tactics_decks_starter.f_card_player_blue(3),
          nx_tactics_decks_starter.f_card_player_blue(4),
          nx_tactics_decks_starter.f_card_player_blue(5),
          nx_tactics_decks_starter.f_card_unit_blue(1),
          nx_tactics_decks_starter.f_card_unit_blue(2),
          nx_tactics_decks_starter.f_card_unit_blue(3),
          nx_tactics_decks_starter.f_card_unit_blue(4)
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":id",
          "player-blue",
          ":name",
          "Player Blue",
          ":cardmap",
          cardmap
        )
      })
    )
    return output
  }

  /**
   * @function deck_player_green
   * @return {deck}
   */
  static t_deck_player_green = {
    vx_type: vx_core.t_type
  }
  static e_deck_player_green = {
    vx_type: nx_tactics_decks_starter.t_deck_player_green
  }

  // (func deck-player-green)
  static f_deck_player_green() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_starter.f_card_player_green(1),
          nx_tactics_decks_starter.f_card_player_green(2),
          nx_tactics_decks_starter.f_card_player_green(3),
          nx_tactics_decks_starter.f_card_player_green(4),
          nx_tactics_decks_starter.f_card_player_green(5),
          nx_tactics_decks_starter.f_card_unit_green(1),
          nx_tactics_decks_starter.f_card_unit_green(2),
          nx_tactics_decks_starter.f_card_unit_green(3),
          nx_tactics_decks_starter.f_card_unit_green(4)
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":id",
          "player-green",
          ":name",
          "Player Green",
          ":cardmap",
          cardmap
        )
      })
    )
    return output
  }

  /**
   * @function deck_player_red
   * @return {deck}
   */
  static t_deck_player_red = {
    vx_type: vx_core.t_type
  }
  static e_deck_player_red = {
    vx_type: nx_tactics_decks_starter.t_deck_player_red
  }

  // (func deck-player-red)
  static f_deck_player_red() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_starter.f_card_player_red(1),
          nx_tactics_decks_starter.f_card_player_red(2),
          nx_tactics_decks_starter.f_card_player_red(3),
          nx_tactics_decks_starter.f_card_player_red(4),
          nx_tactics_decks_starter.f_card_player_red(5),
          nx_tactics_decks_starter.f_card_unit_red(1),
          nx_tactics_decks_starter.f_card_unit_red(2),
          nx_tactics_decks_starter.f_card_unit_red(3),
          nx_tactics_decks_starter.f_card_unit_red(4)
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":id",
          "player-red",
          ":name",
          "Player Red",
          ":cardmap",
          cardmap
        )
      })
    )
    return output
  }

  /**
   * @function deck_player_yellow
   * @return {deck}
   */
  static t_deck_player_yellow = {
    vx_type: vx_core.t_type
  }
  static e_deck_player_yellow = {
    vx_type: nx_tactics_decks_starter.t_deck_player_yellow
  }

  // (func deck-player-yellow)
  static f_deck_player_yellow() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_starter.f_card_player_yellow(1),
          nx_tactics_decks_starter.f_card_player_yellow(2),
          nx_tactics_decks_starter.f_card_player_yellow(3),
          nx_tactics_decks_starter.f_card_player_yellow(4),
          nx_tactics_decks_starter.f_card_player_yellow(5),
          nx_tactics_decks_starter.f_card_unit_yellow(1),
          nx_tactics_decks_starter.f_card_unit_yellow(2),
          nx_tactics_decks_starter.f_card_unit_yellow(3),
          nx_tactics_decks_starter.f_card_unit_yellow(4)
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":id",
          "player-yellow",
          ":name",
          "Player Yellow",
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
      "card-characterguide": nx_tactics_decks_starter.e_card_characterguide,
      "card-combatguide": nx_tactics_decks_starter.e_card_combatguide,
      "card-damageguide": nx_tactics_decks_starter.e_card_damageguide,
      "card-fatelower": nx_tactics_decks_starter.e_card_fatelower,
      "card-fateupper": nx_tactics_decks_starter.e_card_fateupper,
      "card-gameguide": nx_tactics_decks_starter.e_card_gameguide,
      "card-levelingguide": nx_tactics_decks_starter.e_card_levelingguide,
      "card-player-blue": nx_tactics_decks_starter.e_card_player_blue,
      "card-player-green": nx_tactics_decks_starter.e_card_player_green,
      "card-player-red": nx_tactics_decks_starter.e_card_player_red,
      "card-player-yellow": nx_tactics_decks_starter.e_card_player_yellow,
      "card-setupguide": nx_tactics_decks_starter.e_card_setupguide,
      "card-skillguide": nx_tactics_decks_starter.e_card_skillguide,
      "card-turnguide": nx_tactics_decks_starter.e_card_turnguide,
      "card-turnorder": nx_tactics_decks_starter.e_card_turnorder,
      "card-unit-blue": nx_tactics_decks_starter.e_card_unit_blue,
      "card-unit-green": nx_tactics_decks_starter.e_card_unit_green,
      "card-unit-red": nx_tactics_decks_starter.e_card_unit_red,
      "card-unit-yellow": nx_tactics_decks_starter.e_card_unit_yellow,
      "deck-player": nx_tactics_decks_starter.e_deck_player,
      "deck-player-blue": nx_tactics_decks_starter.e_deck_player_blue,
      "deck-player-green": nx_tactics_decks_starter.e_deck_player_green,
      "deck-player-red": nx_tactics_decks_starter.e_deck_player_red,
      "deck-player-yellow": nx_tactics_decks_starter.e_deck_player_yellow
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "card-characterguide": nx_tactics_decks_starter.t_card_characterguide,
      "card-combatguide": nx_tactics_decks_starter.t_card_combatguide,
      "card-damageguide": nx_tactics_decks_starter.t_card_damageguide,
      "card-fatelower": nx_tactics_decks_starter.t_card_fatelower,
      "card-fateupper": nx_tactics_decks_starter.t_card_fateupper,
      "card-gameguide": nx_tactics_decks_starter.t_card_gameguide,
      "card-levelingguide": nx_tactics_decks_starter.t_card_levelingguide,
      "card-player-blue": nx_tactics_decks_starter.t_card_player_blue,
      "card-player-green": nx_tactics_decks_starter.t_card_player_green,
      "card-player-red": nx_tactics_decks_starter.t_card_player_red,
      "card-player-yellow": nx_tactics_decks_starter.t_card_player_yellow,
      "card-setupguide": nx_tactics_decks_starter.t_card_setupguide,
      "card-skillguide": nx_tactics_decks_starter.t_card_skillguide,
      "card-turnguide": nx_tactics_decks_starter.t_card_turnguide,
      "card-turnorder": nx_tactics_decks_starter.t_card_turnorder,
      "card-unit-blue": nx_tactics_decks_starter.t_card_unit_blue,
      "card-unit-green": nx_tactics_decks_starter.t_card_unit_green,
      "card-unit-red": nx_tactics_decks_starter.t_card_unit_red,
      "card-unit-yellow": nx_tactics_decks_starter.t_card_unit_yellow,
      "deck-player": nx_tactics_decks_starter.t_deck_player,
      "deck-player-blue": nx_tactics_decks_starter.t_deck_player_blue,
      "deck-player-green": nx_tactics_decks_starter.t_deck_player_green,
      "deck-player-red": nx_tactics_decks_starter.t_deck_player_red,
      "deck-player-yellow": nx_tactics_decks_starter.t_deck_player_yellow
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

    // (func card-characterguide)
    nx_tactics_decks_starter.t_card_characterguide['vx_value'] = {
      name          : "card-characterguide",
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
      fn            : nx_tactics_decks_starter.f_card_characterguide
    }

    // (func card-combatguide)
    nx_tactics_decks_starter.t_card_combatguide['vx_value'] = {
      name          : "card-combatguide",
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
      fn            : nx_tactics_decks_starter.f_card_combatguide
    }

    // (func card-damageguide)
    nx_tactics_decks_starter.t_card_damageguide['vx_value'] = {
      name          : "card-damageguide",
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
      fn            : nx_tactics_decks_starter.f_card_damageguide
    }

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

    // (func card-gameguide)
    nx_tactics_decks_starter.t_card_gameguide['vx_value'] = {
      name          : "card-gameguide",
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
      fn            : nx_tactics_decks_starter.f_card_gameguide
    }

    // (func card-levelingguide)
    nx_tactics_decks_starter.t_card_levelingguide['vx_value'] = {
      name          : "card-levelingguide",
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
      fn            : nx_tactics_decks_starter.f_card_levelingguide
    }

    // (func card-player-blue)
    nx_tactics_decks_starter.t_card_player_blue['vx_value'] = {
      name          : "card-player-blue",
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
      fn            : nx_tactics_decks_starter.f_card_player_blue
    }

    // (func card-player-green)
    nx_tactics_decks_starter.t_card_player_green['vx_value'] = {
      name          : "card-player-green",
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
      fn            : nx_tactics_decks_starter.f_card_player_green
    }

    // (func card-player-red)
    nx_tactics_decks_starter.t_card_player_red['vx_value'] = {
      name          : "card-player-red",
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
      fn            : nx_tactics_decks_starter.f_card_player_red
    }

    // (func card-player-yellow)
    nx_tactics_decks_starter.t_card_player_yellow['vx_value'] = {
      name          : "card-player-yellow",
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
      fn            : nx_tactics_decks_starter.f_card_player_yellow
    }

    // (func card-setupguide)
    nx_tactics_decks_starter.t_card_setupguide['vx_value'] = {
      name          : "card-setupguide",
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
      fn            : nx_tactics_decks_starter.f_card_setupguide
    }

    // (func card-skillguide)
    nx_tactics_decks_starter.t_card_skillguide['vx_value'] = {
      name          : "card-skillguide",
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
      fn            : nx_tactics_decks_starter.f_card_skillguide
    }

    // (func card-turnguide)
    nx_tactics_decks_starter.t_card_turnguide['vx_value'] = {
      name          : "card-turnguide",
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
      fn            : nx_tactics_decks_starter.f_card_turnguide
    }

    // (func card-turnorder)
    nx_tactics_decks_starter.t_card_turnorder['vx_value'] = {
      name          : "card-turnorder",
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
      fn            : nx_tactics_decks_starter.f_card_turnorder
    }

    // (func card-unit-blue)
    nx_tactics_decks_starter.t_card_unit_blue['vx_value'] = {
      name          : "card-unit-blue",
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
      fn            : nx_tactics_decks_starter.f_card_unit_blue
    }

    // (func card-unit-green)
    nx_tactics_decks_starter.t_card_unit_green['vx_value'] = {
      name          : "card-unit-green",
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
      fn            : nx_tactics_decks_starter.f_card_unit_green
    }

    // (func card-unit-red)
    nx_tactics_decks_starter.t_card_unit_red['vx_value'] = {
      name          : "card-unit-red",
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
      fn            : nx_tactics_decks_starter.f_card_unit_red
    }

    // (func card-unit-yellow)
    nx_tactics_decks_starter.t_card_unit_yellow['vx_value'] = {
      name          : "card-unit-yellow",
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
      fn            : nx_tactics_decks_starter.f_card_unit_yellow
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

    // (func deck-player-blue)
    nx_tactics_decks_starter.t_deck_player_blue['vx_value'] = {
      name          : "deck-player-blue",
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
      fn            : nx_tactics_decks_starter.f_deck_player_blue
    }

    // (func deck-player-green)
    nx_tactics_decks_starter.t_deck_player_green['vx_value'] = {
      name          : "deck-player-green",
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
      fn            : nx_tactics_decks_starter.f_deck_player_green
    }

    // (func deck-player-red)
    nx_tactics_decks_starter.t_deck_player_red['vx_value'] = {
      name          : "deck-player-red",
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
      fn            : nx_tactics_decks_starter.f_deck_player_red
    }

    // (func deck-player-yellow)
    nx_tactics_decks_starter.t_deck_player_yellow['vx_value'] = {
      name          : "deck-player-yellow",
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
      fn            : nx_tactics_decks_starter.f_deck_player_yellow
    }

  }
}
