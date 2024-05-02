'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_type from "../../../vx/type.js"


export default class nx_tactics_decks_starter {

  /**
   * @function card_action_combat
   * @return {card}
   */
  static t_card_action_combat = {
    vx_type: vx_core.t_type
  }
  static e_card_action_combat = {
    vx_type: nx_tactics_decks_starter.t_card_action_combat
  }

  // (func card-action-combat)
  static f_card_action_combat() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "action-combat",
      ":name",
      "Combat Action",
      ":summary",
      "* Target a unit with a damaging Skill/Power.\n* Each player chooses a Fate card from their hand or a random Fate from Shared Fate.\n* Fate Cards are compared like Rock/Paper/Scissors.\n* Combat Speed: Defend/Evade/Counter > Attack > Focus > Defend/Evade/Counter\n* If both play Attack or Focus then compare by rank (lower is faster).\n* Order: AJQK2-10\n* If Tied, there is no result.\n* If one player Wins, then resolve their result and apply Damage. If the target wins, they do no Damage unless they spend an Action.\n* Discard all card used (except Keep)"
    )
    return output
  }

  /**
   * @function card_action_move
   * @return {card}
   */
  static t_card_action_move = {
    vx_type: vx_core.t_type
  }
  static e_card_action_move = {
    vx_type: nx_tactics_decks_starter.t_card_action_move
  }

  // (func card-action-move)
  static f_card_action_move() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "action-move",
      ":name",
      "Move Action",
      ":summary",
      "* Action: Move up to your [Move] stat.\n* Facing: During your Move, change your facing up to 2 times the entire Turn.\n* Full Move (2 Actions): Move your [Move]x2.\n* Sprint (2 Actions): If you moved at Full Speed last turn, you may [Move]x3 this turn.\n* Leftover Move: After moving, if there is an adjacent space that you cannot afford to enter and you have partial Move left, you may take note of it and carry it over to subsequent turns."
    )
    return output
  }

  /**
   * @function card_action_recover
   * @return {card}
   */
  static t_card_action_recover = {
    vx_type: vx_core.t_type
  }
  static e_card_action_recover = {
    vx_type: nx_tactics_decks_starter.t_card_action_recover
  }

  // (func card-action-recover)
  static f_card_action_recover() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "action-recover",
      ":name",
      "Recover Action",
      ":summary",
      "* Action: Discard a [Fatigue], [Stun], [Stress], or [Slow]\n* Bind Wounds (2 Actions): Discard a [Bleeding] from yourself or an adjacent unit."
    )
    return output
  }

  /**
   * @function card_action_skill
   * @return {card}
   */
  static t_card_action_skill = {
    vx_type: vx_core.t_type
  }
  static e_card_action_skill = {
    vx_type: nx_tactics_decks_starter.t_card_action_skill
  }

  // (func card-action-skill)
  static f_card_action_skill() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "action-skill",
      ":name",
      "Skill Action",
      ":summary",
      "* Action: "
    )
    return output
  }

  /**
   * @function card_areaeffect
   * @return {card}
   */
  static t_card_areaeffect = {
    vx_type: vx_core.t_type
  }
  static e_card_areaeffect = {
    vx_type: nx_tactics_decks_starter.t_card_areaeffect
  }

  // (func card-areaeffect)
  static f_card_areaeffect() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "areaeffect",
      ":name",
      "Area Effect",
      ":image",
      "images/card-areaeffect.svg",
      ":summary",
      "* Some powers can attack in a large area.\n* Reduce your Skill or Intensity by 1 to get an Area Effect Card. Each additional reduction doubles the number of cards.\n* Place a card next to your unit and arrange the rest in any stable shape. Examples below."
    )
    return output
  }

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
      "Combat Damage",
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
   * @function card_free_action
   * @return {card}
   */
  static t_card_free_action = {
    vx_type: vx_core.t_type
  }
  static e_card_free_action = {
    vx_type: nx_tactics_decks_starter.t_card_free_action
  }

  // (func card-free-action)
  static f_card_free_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "free-action",
      ":name",
      "Free Action",
      ":summary",
      "* Free Actions are like normal actions but do not use any of your 2 Actions each turn.\n* Move Out: Take a [Fatigue] to [Move]:1.\n* Push Your Luck: Take a [Stun] to reduce a Double Action to an Action.\n* Grit Your Teeth: Take a [Stress] to ignore the effect of all of your negative statuses this turn.\n* Final Sprint: Take a [Slow] to [Move].\n* Opportunity Combat: If a Target moves from one adjacent space of a Unit to another, that Unit may take a [Stun] to take a free [Combat Action]."
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
      "* Create [Characters] or [Factions] to play [Scenarios].\n* Each [Scenario] contains various [Threats] and [Goals]\n* Find them and use your [Skills] / [Powers] to complete them for [Rewards]\n* Some [Rewards] are items, others are Skill Points or Ability Points that allow you to increase the level of your [Skills], [Powers], [Abilities], or [Specialties]."
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
      "Leveling Guide",
      ":summary",
      "* Major Achievement: Completion gains a Skill Point.\n* Minor Achievement: Completion gains an Ability Point.\n* Skill Points: May be exchanged for a Skill Level one below your level or a new Level 1 Power (if allowed).\n* Ability Points: May be exchanged for an Ability, Specialty, or a Power Intensity increase."
    )
    return output
  }

  /**
   * @function card_lineofsight
   * @return {card}
   */
  static t_card_lineofsight = {
    vx_type: vx_core.t_type
  }
  static e_card_lineofsight = {
    vx_type: nx_tactics_decks_starter.t_card_lineofsight
  }

  // (func card-lineofsight)
  static f_card_lineofsight() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "lineofsight",
      ":name",
      "Line of Sight",
      ":summary",
      "* Most distance effects require line of sight to the target.\n* Determine Line of Sight: Starting from your location point, use a straight edge to touch every part of the target (in 1 space).\n* If nothing is between you, then you have full line of sight. Resolve normally.\n* If something is between you, guess at the amount of Cover provided and resolve with the following penalties:\n** 25% Cover: Speed:-1.\n** 50% Cover: Speed:-2.\n** 75% Cover: Speed:-3.\n** 100% Cover: Speed-4.\n* If successful, assign each 25% to whatever is giving cover (this can include fog, smoke, tables, walls, etc). Assign each a suit and draw [Shared Fate]. If an assigned suit is drawn, the Cover is struck first. Resolve below based on the type of Cover.\n** Insubstantial: Resolve damage normally.\n** Item: Damage the item first. If it is destroyed, resolve any remaining damage on the original target.\n** Unit: That unit is the new target. Resolve a new Combat with it instead."
    )
    return output
  }

  /**
   * @function card_mapscale_1
   * @return {card}
   */
  static t_card_mapscale_1 = {
    vx_type: vx_core.t_type
  }
  static e_card_mapscale_1 = {
    vx_type: nx_tactics_decks_starter.t_card_mapscale_1
  }

  // (func card-mapscale-1)
  static f_card_mapscale_1() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "card-mapscale-1"
      ),
      ":name",
      "Map Scale:1",
      ":summary",
      "* Human Scale\n* Space Size: 1m\n* Turn Length: 2sec\n* Human: Max speed 3x1 = 30kph/18mph. Walk speed = 6kph/3.5mph/1.6mps. 2sec move = ~3 spaces (3.2m).\n* Car: Max speed 2x2 = 200kph/125mph. Slow speed = 40kph/25mph/11mps. 2sec move = ~20 spaces.(22m)"
    )
    return output
  }

  /**
   * @function card_mapscale_2
   * @return {card}
   */
  static t_card_mapscale_2 = {
    vx_type: vx_core.t_type
  }
  static e_card_mapscale_2 = {
    vx_type: nx_tactics_decks_starter.t_card_mapscale_2
  }

  // (func card-mapscale-2)
  static f_card_mapscale_2() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "card-mapscale-2"
      ),
      ":name",
      "Map Scale:2",
      ":summary",
      "* Vehicle Scale\n* Space Size: 3m\n* Turn Length: 1sec\n* Note: Car (max speed 2x2 = 200kph/125mph) slow at 40kph/25mph/11mps. 1sec move = 4 spaces (11m)."
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
        "card-player-blue-",
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
        "card-player-green-",
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
        "card-player-red-",
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
        "card-player-yellow-",
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
   * @function card_reach
   * @return {card}
   */
  static t_card_reach = {
    vx_type: vx_core.t_type
  }
  static e_card_reach = {
    vx_type: nx_tactics_decks_starter.t_card_reach
  }

  // (func card-reach)
  static f_card_reach() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "card-reach",
      ":name",
      "Reach",
      ":summary",
      "* Can target one additional dot away [Scaled]"
    )
    return output
  }

  /**
   * @function card_scale
   * @return {card}
   */
  static t_card_scale = {
    vx_type: vx_core.t_type
  }
  static e_card_scale = {
    vx_type: nx_tactics_decks_starter.t_card_scale
  }

  // (func card-scale)
  static f_card_scale() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "card-scale",
      ":name",
      "Scale",
      ":summary",
      "* Each stat/skill/power has a number after the letter 'x'.\n* This is the scale of that ability.\n* The number represents the number of zeroes. E.g. 5x3 translates to 5000.\n* x1 denotes human scale. E.g. 1x1=10kg, 10iq+50, 10will, 10kph"
    )
    return output
  }

  /**
   * @function card_scaled
   * @return {card}
   */
  static t_card_scaled = {
    vx_type: vx_core.t_type
  }
  static e_card_scaled = {
    vx_type: nx_tactics_decks_starter.t_card_scaled
  }

  // (func card-scaled)
  static f_card_scaled() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "card-scaled",
      ":name",
      "Scaled",
      ":summary",
      "* Scaled refers to the comparison between the Scale of a stat/ability/map to another.\n* If the scales are the same, no change is required.\n* If the scales are different, multiple or divide the Level by 10 for each difference in scale.\n* E.g. On an x1 map a Move:3x2 would move 30 spaces instead of 3."
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
   * @function card_skill_blue
   * @param  {int} num
   * @return {card}
   */
  static t_card_skill_blue = {
    vx_type: vx_core.t_type
  }
  static e_card_skill_blue = {
    vx_type: nx_tactics_decks_starter.t_card_skill_blue
  }

  // (func card-skill-blue)
  static f_card_skill_blue(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "skill-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Skill ",
        num
      ),
      ":image",
      "images/card-blue.svg"
    )
    return output
  }

  /**
   * @function card_skill_green
   * @param  {int} num
   * @return {card}
   */
  static t_card_skill_green = {
    vx_type: vx_core.t_type
  }
  static e_card_skill_green = {
    vx_type: nx_tactics_decks_starter.t_card_skill_green
  }

  // (func card-skill-green)
  static f_card_skill_green(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "skill-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Skill ",
        num
      ),
      ":image",
      "images/card-green.svg"
    )
    return output
  }

  /**
   * @function card_skill_red
   * @param  {int} num
   * @return {card}
   */
  static t_card_skill_red = {
    vx_type: vx_core.t_type
  }
  static e_card_skill_red = {
    vx_type: nx_tactics_decks_starter.t_card_skill_red
  }

  // (func card-skill-red)
  static f_card_skill_red(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "skill-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Skill ",
        num
      ),
      ":image",
      "images/card-red.svg"
    )
    return output
  }

  /**
   * @function card_skill_yellow
   * @param  {int} num
   * @return {card}
   */
  static t_card_skill_yellow = {
    vx_type: vx_core.t_type
  }
  static e_card_skill_yellow = {
    vx_type: nx_tactics_decks_starter.t_card_skill_yellow
  }

  // (func card-skill-yellow)
  static f_card_skill_yellow(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      vx_core.f_new(
        vx_core.t_string,
        "skill-",
        num
      ),
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        "Skill ",
        num
      ),
      ":image",
      "images/card-yellow.svg"
    )
    return output
  }

  /**
   * @function card_turn_order
   * @return {card}
   */
  static t_card_turn_order = {
    vx_type: vx_core.t_type
  }
  static e_card_turn_order = {
    vx_type: nx_tactics_decks_starter.t_card_turn_order
  }

  // (func card-turn-order)
  static f_card_turn_order() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "turn-order",
      ":name",
      "Turn: Order",
      ":summary",
      "* Reveal: Flip each card of [Turn Order] deck to form a row. This is the [Player] order this turn.\n* Action1: Each [Player] chooses a Unit to activate along with their first [Action] and target(s).\n* Change1: In order, each [Player] may change their decision.\n* Resolve1: If a player was the target of an Action, they must wait for that action to resolve. Otherwise, all players performs their Action simultaneously. Note: lower order Units cannot be blocked by the movement of higher order Units.\n* Action2: Each [Player] chooses their second [Action] and targets.\n* Change2: Same as Change1.\n* Resolve2: Same as Resolve1."
    )
    return output
  }

  /**
   * @function card_turn_order
   * @return {card}
   */
  static t_card_turn_order_1 = {
    vx_type: vx_core.t_type
  }
  static e_card_turn_order_1 = {
    vx_type: nx_tactics_decks_starter.t_card_turn_order_1
  }

  // (func card-turn-order)
  static f_card_turn_order_1() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "turn-order",
      ":name",
      "Turn Order"
    )
    return output
  }

  /**
   * @function card_turn_player
   * @return {card}
   */
  static t_card_turn_player = {
    vx_type: vx_core.t_type
  }
  static e_card_turn_player = {
    vx_type: nx_tactics_decks_starter.t_card_turn_player
  }

  // (func card-turn-player)
  static f_card_turn_player() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "turn-player",
      ":name",
      "Turn: Player"
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
          nx_tactics_decks_starter.f_card_turn_order(),
          nx_tactics_decks_starter.f_card_turn_player(),
          nx_tactics_decks_starter.f_card_action_move(),
          nx_tactics_decks_starter.f_card_action_combat(),
          nx_tactics_decks_starter.f_card_damageguide(),
          nx_tactics_decks_starter.f_card_action_skill(),
          nx_tactics_decks_starter.f_card_action_recover(),
          nx_tactics_decks_starter.f_card_free_action(),
          nx_tactics_decks_starter.f_card_characterguide(),
          nx_tactics_decks_starter.f_card_levelingguide(),
          nx_tactics_decks_starter.f_card_turn_order(),
          nx_tactics_decks_starter.f_card_scale(),
          nx_tactics_decks_starter.f_card_scaled(),
          nx_tactics_decks_starter.f_card_mapscale_1(),
          nx_tactics_decks_starter.f_card_mapscale_2(),
          nx_tactics_decks_starter.f_card_fateupper(),
          nx_tactics_decks_starter.f_card_fatelower(),
          nx_tactics_decks_starter.f_card_areaeffect(),
          nx_tactics_decks_starter.f_card_reach()
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
          nx_tactics_decks_starter.f_card_skill_blue(1),
          nx_tactics_decks_starter.f_card_skill_blue(2),
          nx_tactics_decks_starter.f_card_skill_blue(3),
          nx_tactics_decks_starter.f_card_skill_blue(4),
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
          nx_tactics_decks_starter.f_card_skill_green(1),
          nx_tactics_decks_starter.f_card_skill_green(2),
          nx_tactics_decks_starter.f_card_skill_green(3),
          nx_tactics_decks_starter.f_card_skill_green(4),
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
          nx_tactics_decks_starter.f_card_skill_red(1),
          nx_tactics_decks_starter.f_card_skill_red(2),
          nx_tactics_decks_starter.f_card_skill_red(3),
          nx_tactics_decks_starter.f_card_skill_red(4),
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
          nx_tactics_decks_starter.f_card_skill_yellow(1),
          nx_tactics_decks_starter.f_card_skill_yellow(2),
          nx_tactics_decks_starter.f_card_skill_yellow(3),
          nx_tactics_decks_starter.f_card_skill_yellow(4),
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
      "card-action-combat": nx_tactics_decks_starter.e_card_action_combat,
      "card-action-move": nx_tactics_decks_starter.e_card_action_move,
      "card-action-recover": nx_tactics_decks_starter.e_card_action_recover,
      "card-action-skill": nx_tactics_decks_starter.e_card_action_skill,
      "card-areaeffect": nx_tactics_decks_starter.e_card_areaeffect,
      "card-characterguide": nx_tactics_decks_starter.e_card_characterguide,
      "card-damageguide": nx_tactics_decks_starter.e_card_damageguide,
      "card-fatelower": nx_tactics_decks_starter.e_card_fatelower,
      "card-fateupper": nx_tactics_decks_starter.e_card_fateupper,
      "card-free-action": nx_tactics_decks_starter.e_card_free_action,
      "card-gameguide": nx_tactics_decks_starter.e_card_gameguide,
      "card-levelingguide": nx_tactics_decks_starter.e_card_levelingguide,
      "card-lineofsight": nx_tactics_decks_starter.e_card_lineofsight,
      "card-mapscale-1": nx_tactics_decks_starter.e_card_mapscale_1,
      "card-mapscale-2": nx_tactics_decks_starter.e_card_mapscale_2,
      "card-player-blue": nx_tactics_decks_starter.e_card_player_blue,
      "card-player-green": nx_tactics_decks_starter.e_card_player_green,
      "card-player-red": nx_tactics_decks_starter.e_card_player_red,
      "card-player-yellow": nx_tactics_decks_starter.e_card_player_yellow,
      "card-reach": nx_tactics_decks_starter.e_card_reach,
      "card-scale": nx_tactics_decks_starter.e_card_scale,
      "card-scaled": nx_tactics_decks_starter.e_card_scaled,
      "card-setupguide": nx_tactics_decks_starter.e_card_setupguide,
      "card-skill-blue": nx_tactics_decks_starter.e_card_skill_blue,
      "card-skill-green": nx_tactics_decks_starter.e_card_skill_green,
      "card-skill-red": nx_tactics_decks_starter.e_card_skill_red,
      "card-skill-yellow": nx_tactics_decks_starter.e_card_skill_yellow,
      "card-turn-order": nx_tactics_decks_starter.e_card_turn_order,
      "card-turn-order_1": nx_tactics_decks_starter.e_card_turn_order_1,
      "card-turn-player": nx_tactics_decks_starter.e_card_turn_player,
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
      "card-action-combat": nx_tactics_decks_starter.t_card_action_combat,
      "card-action-move": nx_tactics_decks_starter.t_card_action_move,
      "card-action-recover": nx_tactics_decks_starter.t_card_action_recover,
      "card-action-skill": nx_tactics_decks_starter.t_card_action_skill,
      "card-areaeffect": nx_tactics_decks_starter.t_card_areaeffect,
      "card-characterguide": nx_tactics_decks_starter.t_card_characterguide,
      "card-damageguide": nx_tactics_decks_starter.t_card_damageguide,
      "card-fatelower": nx_tactics_decks_starter.t_card_fatelower,
      "card-fateupper": nx_tactics_decks_starter.t_card_fateupper,
      "card-free-action": nx_tactics_decks_starter.t_card_free_action,
      "card-gameguide": nx_tactics_decks_starter.t_card_gameguide,
      "card-levelingguide": nx_tactics_decks_starter.t_card_levelingguide,
      "card-lineofsight": nx_tactics_decks_starter.t_card_lineofsight,
      "card-mapscale-1": nx_tactics_decks_starter.t_card_mapscale_1,
      "card-mapscale-2": nx_tactics_decks_starter.t_card_mapscale_2,
      "card-player-blue": nx_tactics_decks_starter.t_card_player_blue,
      "card-player-green": nx_tactics_decks_starter.t_card_player_green,
      "card-player-red": nx_tactics_decks_starter.t_card_player_red,
      "card-player-yellow": nx_tactics_decks_starter.t_card_player_yellow,
      "card-reach": nx_tactics_decks_starter.t_card_reach,
      "card-scale": nx_tactics_decks_starter.t_card_scale,
      "card-scaled": nx_tactics_decks_starter.t_card_scaled,
      "card-setupguide": nx_tactics_decks_starter.t_card_setupguide,
      "card-skill-blue": nx_tactics_decks_starter.t_card_skill_blue,
      "card-skill-green": nx_tactics_decks_starter.t_card_skill_green,
      "card-skill-red": nx_tactics_decks_starter.t_card_skill_red,
      "card-skill-yellow": nx_tactics_decks_starter.t_card_skill_yellow,
      "card-turn-order": nx_tactics_decks_starter.t_card_turn_order,
      "card-turn-order_1": nx_tactics_decks_starter.t_card_turn_order_1,
      "card-turn-player": nx_tactics_decks_starter.t_card_turn_player,
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

    // (func card-action-combat)
    nx_tactics_decks_starter.t_card_action_combat['vx_value'] = {
      name          : "card-action-combat",
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
      fn            : nx_tactics_decks_starter.f_card_action_combat
    }

    // (func card-action-move)
    nx_tactics_decks_starter.t_card_action_move['vx_value'] = {
      name          : "card-action-move",
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
      fn            : nx_tactics_decks_starter.f_card_action_move
    }

    // (func card-action-recover)
    nx_tactics_decks_starter.t_card_action_recover['vx_value'] = {
      name          : "card-action-recover",
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
      fn            : nx_tactics_decks_starter.f_card_action_recover
    }

    // (func card-action-skill)
    nx_tactics_decks_starter.t_card_action_skill['vx_value'] = {
      name          : "card-action-skill",
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
      fn            : nx_tactics_decks_starter.f_card_action_skill
    }

    // (func card-areaeffect)
    nx_tactics_decks_starter.t_card_areaeffect['vx_value'] = {
      name          : "card-areaeffect",
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
      fn            : nx_tactics_decks_starter.f_card_areaeffect
    }

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

    // (func card-free-action)
    nx_tactics_decks_starter.t_card_free_action['vx_value'] = {
      name          : "card-free-action",
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
      fn            : nx_tactics_decks_starter.f_card_free_action
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

    // (func card-lineofsight)
    nx_tactics_decks_starter.t_card_lineofsight['vx_value'] = {
      name          : "card-lineofsight",
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
      fn            : nx_tactics_decks_starter.f_card_lineofsight
    }

    // (func card-mapscale-1)
    nx_tactics_decks_starter.t_card_mapscale_1['vx_value'] = {
      name          : "card-mapscale-1",
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
      fn            : nx_tactics_decks_starter.f_card_mapscale_1
    }

    // (func card-mapscale-2)
    nx_tactics_decks_starter.t_card_mapscale_2['vx_value'] = {
      name          : "card-mapscale-2",
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
      fn            : nx_tactics_decks_starter.f_card_mapscale_2
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

    // (func card-reach)
    nx_tactics_decks_starter.t_card_reach['vx_value'] = {
      name          : "card-reach",
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
      fn            : nx_tactics_decks_starter.f_card_reach
    }

    // (func card-scale)
    nx_tactics_decks_starter.t_card_scale['vx_value'] = {
      name          : "card-scale",
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
      fn            : nx_tactics_decks_starter.f_card_scale
    }

    // (func card-scaled)
    nx_tactics_decks_starter.t_card_scaled['vx_value'] = {
      name          : "card-scaled",
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
      fn            : nx_tactics_decks_starter.f_card_scaled
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

    // (func card-skill-blue)
    nx_tactics_decks_starter.t_card_skill_blue['vx_value'] = {
      name          : "card-skill-blue",
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
      fn            : nx_tactics_decks_starter.f_card_skill_blue
    }

    // (func card-skill-green)
    nx_tactics_decks_starter.t_card_skill_green['vx_value'] = {
      name          : "card-skill-green",
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
      fn            : nx_tactics_decks_starter.f_card_skill_green
    }

    // (func card-skill-red)
    nx_tactics_decks_starter.t_card_skill_red['vx_value'] = {
      name          : "card-skill-red",
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
      fn            : nx_tactics_decks_starter.f_card_skill_red
    }

    // (func card-skill-yellow)
    nx_tactics_decks_starter.t_card_skill_yellow['vx_value'] = {
      name          : "card-skill-yellow",
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
      fn            : nx_tactics_decks_starter.f_card_skill_yellow
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

    // (func card-turn-order)
    nx_tactics_decks_starter.t_card_turn_order_1['vx_value'] = {
      name          : "card-turn-order",
      pkgname       : "nx/tactics/decks/starter",
      extends       : ":func",
      idx           : 1,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_starter.f_card_turn_order_1
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
