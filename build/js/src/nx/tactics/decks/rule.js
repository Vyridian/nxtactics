'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_type from "../../../vx/type.js"


export default class nx_tactics_decks_rule {

  /**
   * @function card_abilitypoint
   * @param  {int} num
   * @return {card}
   */
  static t_card_abilitypoint = {
    vx_type: vx_core.t_type
  }
  static e_card_abilitypoint = {
    vx_type: nx_tactics_decks_rule.t_card_abilitypoint
  }

  // (func card-abilitypoint)
  static f_card_abilitypoint(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "abilitypoint-", num),
      ":name",
      vx_core.f_new({"any-1": vx_core.t_string}, "Ability Point"),
      ":summary",
      "* [Minor Achievment]: Gain an Ability Point. You may also convert 1 of your existing Abilities into an Ability Point.\n* An Ability Point may be exchanged for an Ability, Specialty, or a Power Intensity increase.\n* Ability Points may be saved."
    )
    return output
  }

  /**
   * @function card_action
   * @return {card}
   */
  static t_card_action = {
    vx_type: vx_core.t_type
  }
  static e_card_action = {
    vx_type: nx_tactics_decks_rule.t_card_action
  }

  // (func card-action)
  static f_card_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "action", ":name", "Action", ":summary", "* Each [Turn] a Unit will get 2 Actions. These are [Move], [Fight], [Skill], [Recover], [Search], [Equip], and [Reload], and [Wait].")
    return output
  }

  /**
   * @function card_advantage
   * @return {card}
   */
  static t_card_advantage = {
    vx_type: vx_core.t_type
  }
  static e_card_advantage = {
    vx_type: nx_tactics_decks_rule.t_card_advantage
  }

  // (func card-advantage)
  static f_card_advantage() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-advantage", ":name", "Advantage", ":summary", "* [Reveal Fate]: Reveal another Fate. You may use this Fate card instead.")
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
    vx_type: nx_tactics_decks_rule.t_card_areaeffect
  }

  // (func card-areaeffect)
  static f_card_areaeffect() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "areaeffect", ":name", "Area Effect", ":image", "images/card-areaeffect.svg", ":summary", "* Some powers can attack in a large area.\n* Reduce your Skill or Intensity by 1 to get an Area Effect Card. Each additional reduction doubles the number of cards.\n* Place a card next to your unit and arrange the rest in any stable shape. Examples below.")
    return output
  }

  /**
   * @function card_beast
   * @return {card}
   */
  static t_card_beast = {
    vx_type: vx_core.t_type
  }
  static e_card_beast = {
    vx_type: nx_tactics_decks_rule.t_card_beast
  }

  // (func card-beast)
  static f_card_beast() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "beast", ":name", "Beast", ":summary", "* The Beast\n* Beast Unleashed: The Beast is now in control of this unit. Set Conscience = Will; set Will = Beast stat; and set Beast=blank")
    return output
  }

  /**
   * @function card_body
   * @return {card}
   */
  static t_card_body = {
    vx_type: vx_core.t_type
  }
  static e_card_body = {
    vx_type: nx_tactics_decks_rule.t_card_body
  }

  // (func card-body)
  static f_card_body() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "body", ":name", "Body", ":summary", "* Body is the measure of a unit's mass and durability.\n* A unit with Body:0 is incapacitated.\n* It is derived from the mass in kg. E.g. 300kg = 3x10^2 = 3x2")
    return output
  }

  /**
   * @function card_character
   * @return {card}
   */
  static t_card_character = {
    vx_type: vx_core.t_type
  }
  static e_card_character = {
    vx_type: nx_tactics_decks_rule.t_card_character
  }

  // (func card-character)
  static f_card_character() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "character", ":name", "Character")
    return output
  }

  /**
   * @function card_conscience
   * @return {card}
   */
  static t_card_conscience = {
    vx_type: vx_core.t_type
  }
  static e_card_conscience = {
    vx_type: nx_tactics_decks_rule.t_card_conscience
  }

  // (func card-conscience)
  static f_card_conscience() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "conscience", ":name", "Conscience", ":summary", "* Conscience")
    return output
  }

  /**
   * @function card_cover
   * @return {card}
   */
  static t_card_cover = {
    vx_type: vx_core.t_type
  }
  static e_card_cover = {
    vx_type: nx_tactics_decks_rule.t_card_cover
  }

  // (func card-cover)
  static f_card_cover() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "cover", ":name", "Cover", ":summary", "* Cover makes it harder to hit a target and can absorb damage if struck. Opponents and Allies can provide cover too. Even smoke provides Cover.\n* If something is between you and your opponent, guess at the amount of Cover provided and resolve with the following penalties:\n** 25% Cover: Initiative:-1.\n** 50% Cover: Initiative:-2.\n** 75% Cover: Initiative:-3.\n** 100% Cover: Initiative:-4.\n* If successful, assign each 25% to whatever is providing cover (this can include fog, smoke, tables, walls, other opponents, allies, etc). Assign each a suit and draw [Shared Fate]. If an assigned suit is drawn, the Cover is struck first. Resolve below based on the type of Cover.\n** Insubstantial: Resolve damage normally.\n** Item: Damage the item first. If it is destroyed, resolve any remaining damage on the original target.\n** Unit: That unit is the new target. Resolve a new Combat with it instead.")
    return output
  }

  /**
   * @function card_crits
   * @return {card}
   */
  static t_card_crits = {
    vx_type: vx_core.t_type
  }
  static e_card_crits = {
    vx_type: nx_tactics_decks_rule.t_card_crits
  }

  // (func card-crits)
  static f_card_crits() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "crits", ":name", "Crits", ":summary", "* Crits are face-up [Damage] cards.\n* 10 [Hits] = 1 Crit")
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
    vx_type: nx_tactics_decks_rule.t_card_damageguide
  }

  // (func card-damageguide)
  static f_card_damageguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "damageguide", ":name", "Combat Damage", ":summary", "* Damage Types: Determine the [Damage Types] of the weapon.\n* Reveal Damage: Reveal cards equal to [Hits].\n* Separate Damage: Separate them into 2 piles: Those that match the [Damage Types] (Damage) and those that don't (Fatigue).\n* Hit Location: The top card from the matching pile is the Hit Location (or the mismatch pile if no matches). Move it aside and flip the Fatigue pile to its facedown side.\n* Armor: Check [Armor] in the [Hit Location] and then the target reduces the Damage or Fatigue for each point of armor. The Hit Location can only be removed last.\n* Fatigue: The target may take the Fatigue cards as long they have Body. Any remaining Fatigue are flipped faceup and added to the Damage pile.\n* Damage: Count the Damage pile and apply the effect on the Hit Location card to the target.\n* Cleanup: Discard other cards. Shuffle if a Wild was revealed.")
    return output
  }

  /**
   * @function card_damagereduction
   * @return {card}
   */
  static t_card_damagereduction = {
    vx_type: vx_core.t_type
  }
  static e_card_damagereduction = {
    vx_type: nx_tactics_decks_rule.t_card_damagereduction
  }

  // (func card-damagereduction)
  static f_card_damagereduction() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "damagereduction", ":name", "Damage Reduction", ":summary", "* Obstacles\n* Cover\n* Shields\n* Armor\n* Toughness\n* Body")
    return output
  }

  /**
   * @function card_disadvantage
   * @return {card}
   */
  static t_card_disadvantage = {
    vx_type: vx_core.t_type
  }
  static e_card_disadvantage = {
    vx_type: nx_tactics_decks_rule.t_card_disadvantage
  }

  // (func card-disadvantage)
  static f_card_disadvantage() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-disadvantage", ":name", "Disadvantage", ":summary", "* [Reveal Fate]: Reveal another Fate. IF it is worse THEN use it instead.")
    return output
  }

  /**
   * @function card_equip_action
   * @return {card}
   */
  static t_card_equip_action = {
    vx_type: vx_core.t_type
  }
  static e_card_equip_action = {
    vx_type: nx_tactics_decks_rule.t_card_equip_action
  }

  // (func card-equip-action)
  static f_card_equip_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "equip-action", ":name", "Equip", ":summary", "* [Action]: Drop an item in one or more hands and equip another that is readily available in a holster, sheath, belt OR return an item in hand to a readily available spot.\n* [Action]: Give or receive an item from an adjacent willing unit.\n* [Double Action]: Drop an item in one or more hands and equip another that is in an inconvenient spot like a large bag, backpack, on your back, on another person, etc. OR return an item in hand to an inconvenient spot.")
    return output
  }

  /**
   * @function card_exposed
   * @return {card}
   */
  static t_card_exposed = {
    vx_type: vx_core.t_type
  }
  static e_card_exposed = {
    vx_type: nx_tactics_decks_rule.t_card_exposed
  }

  // (func card-exposed)
  static f_card_exposed() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-exposed", ":name", "Exposed", ":summary", "* Your [Normal] [Defend] cards can't win.")
    return output
  }

  /**
   * @function card_fight_action
   * @return {card}
   */
  static t_card_fight_action = {
    vx_type: vx_core.t_type
  }
  static e_card_fight_action = {
    vx_type: nx_tactics_decks_rule.t_card_fight_action
  }

  // (func card-fight-action)
  static f_card_fight_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "fight-action", ":name", "Fight", ":summary", "* Target a unit with a damaging Skill/Power.\n* Each player chooses a Fate card from their hand or a random Fate from Shared Fate.\n* Fate Cards are compared like Rock/Paper/Scissors.\n* Fight Speed: Defend/Evade/Counter > Attack > Focus > Defend/Evade/Counter\n* If both play Attack or Focus then compare by rank (lower is faster).\n* Order: AJQK2-10\n* If Tied, there is no result.\n* If one player Wins, then resolve their result and apply Damage. If the target wins, they do no Damage unless they spend an Action.\n* Discard all card used (except Keep)")
    return output
  }

  /**
   * @function card_flanking
   * @return {card}
   */
  static t_card_flanking = {
    vx_type: vx_core.t_type
  }
  static e_card_flanking = {
    vx_type: nx_tactics_decks_rule.t_card_flanking
  }

  // (func card-flanking)
  static f_card_flanking() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-flanking", ":name", "Flanking", ":summary", "* Flanks: IF a unit attacks an opponent from anywhere behind THEN [Initiative]:+1\n* Blindspot: IF a unit attacks an opponent and is in a straight line directly behind an opponent THEN the opponent is [Exposed] for this attack. ")
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
    vx_type: nx_tactics_decks_rule.t_card_free_action
  }

  // (func card-free-action)
  static f_card_free_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "free-action", ":name", "Free Action", ":summary", "* Free Actions are like normal actions but do not use any of your 2 Actions each turn.\n* Move Out: [Fatigue]:+1 to [Move]:1. You may Turn or Drift once during this Move.\n* Double Down: [Stun]:+1 to reduce a Double Action to an Action.\n* Grit Your Teeth: [Stress]:+1 to ignore the effect of all of your negative statuses this turn.\n* Final Sprint: [Slow]:+1 to [Move].\n* Opportunity Combat: IF a Target moves from one adjacent space of a Unit to another THEN that Unit may take a [Stun] to take a free [Fight] against it.")
    return output
  }

  /**
   * @function card_game
   * @return {card}
   */
  static t_card_game = {
    vx_type: vx_core.t_type
  }
  static e_card_game = {
    vx_type: nx_tactics_decks_rule.t_card_game
  }

  // (func card-game)
  static f_card_game() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "game", ":name", "Game", ":summary", "* Create [Characters] or [Factions] to play [Scenarios].\n* Each [Scenario] contains various [Threats] and [Goals].\n* Try to complete them using your [Skills] and [Powers] for [Rewards].\n* Some [Rewards] are items, others are Skill Points or Ability Points that allow you to increase the level of your [Skills], [Powers], [Abilities], or [Specialties].\n* A Game is broken up into Rounds.\n* Each Round every Player takes a Turn.\n* Each Turn each Player takes 2 Actions.")
    return output
  }

  /**
   * @function card_hits
   * @return {card}
   */
  static t_card_hits = {
    vx_type: vx_core.t_type
  }
  static e_card_hits = {
    vx_type: nx_tactics_decks_rule.t_card_hits
  }

  // (func card-hits)
  static f_card_hits() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "hits", ":name", "Hits", ":summary", "*")
    return output
  }

  /**
   * @function card_initiative
   * @return {card}
   */
  static t_card_initiative = {
    vx_type: vx_core.t_type
  }
  static e_card_initiative = {
    vx_type: nx_tactics_decks_rule.t_card_initiative
  }

  // (func card-initiative)
  static f_card_initiative() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-initiative", ":name", "Initiative", ":summary", "* Lower is Better: IF you and your opponent both play [Normal] [Attack] or you both play [Normal] [Focus] THEN the lower [Rank] of the cards wins.\n* Skill Difference: The difference between your and your opponent's [Skill] is a Bonus or Penalty.\n* Bonus (+X): Initiative bonus is SUBTRACTED before comparing.\n* Penalty (-X): Initiative penalty is ADDED before comparing.")
    return output
  }

  /**
   * @function card_leveling
   * @return {card}
   */
  static t_card_leveling = {
    vx_type: vx_core.t_type
  }
  static e_card_leveling = {
    vx_type: nx_tactics_decks_rule.t_card_leveling
  }

  // (func card-leveling)
  static f_card_leveling() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "leveling", ":name", "Leveling", ":summary", "* Major Achievement: Completion gains a Skill Point with level equal to your 2nd highest Skill.\n* Minor Achievement: Completion gains an [Ability Point].")
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
    vx_type: nx_tactics_decks_rule.t_card_lineofsight
  }

  // (func card-lineofsight)
  static f_card_lineofsight() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "lineofsight", ":name", "Line of Sight", ":summary", "* Most distance effects require line of sight to the target.\n* Determine Line of Sight: Starting from your location point, use a straight edge to touch every part of the target (in 1 space).\n* If nothing is between you, then you have full line of sight. Resolve normally.")
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
    vx_type: nx_tactics_decks_rule.t_card_mapscale_1
  }

  // (func card-mapscale-1)
  static f_card_mapscale_1() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "card-mapscale-1"),
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
    vx_type: nx_tactics_decks_rule.t_card_mapscale_2
  }

  // (func card-mapscale-2)
  static f_card_mapscale_2() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "card-mapscale-2"),
      ":name",
      "Map Scale:2",
      ":summary",
      "* Vehicle Scale\n* Space Size: 3m\n* Turn Length: 1sec\n* Note: Car (max speed 2x2 = 200kph/125mph) slow at 40kph/25mph/11mps. 1sec move = 4 spaces (11m)."
    )
    return output
  }

  /**
   * @function card_mind
   * @return {card}
   */
  static t_card_mind = {
    vx_type: vx_core.t_type
  }
  static e_card_mind = {
    vx_type: nx_tactics_decks_rule.t_card_mind
  }

  // (func card-mind)
  static f_card_mind() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "mind", ":name", "Mind", ":summary", "* Mind is the measure of a unit's intellect and problem solving ability.\n* A unit with Mind:0 is delirious.\n* It is lossly derived from the IQ-50. E.g. 100IQ = 5x10^1 = 5x1, 140IQ = 9x10^1 = 9x1")
    return output
  }

  /**
   * @function card_move
   * @return {card}
   */
  static t_card_move = {
    vx_type: vx_core.t_type
  }
  static e_card_move = {
    vx_type: nx_tactics_decks_rule.t_card_move
  }

  // (func card-move)
  static f_card_move() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "move-action", ":name", "Move", ":summary", "* [Action]: Move straight up to your [Speed] stat.\n* Double Move (2 Actions): Move straight your [Speed]x2.\n* Sprint (2 Actions): If you took a Double Move or Sprint last turn, you may move [Speed]x3 straight this turn.\n* Leftover Speed: After moving, if there is an adjacent space that you cannot afford to enter and you have partial Speed left, you may take note of it and carry it over to subsequent turns.\n* Change Facing: During your Move Action, you may Turn or Drift up to 2 times.\n* Turn: Turn your unit's facing 45 degrees to the left or right.\n* Drift: Instead of moving straight, move diagonally to the left or right while maintaining facing.")
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
    vx_type: nx_tactics_decks_rule.t_card_reach
  }

  // (func card-reach)
  static f_card_reach() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-reach", ":name", "Reach", ":summary", "* Can target one additional dot away [Scaled]")
    return output
  }

  /**
   * @function card_recover_action
   * @return {card}
   */
  static t_card_recover_action = {
    vx_type: vx_core.t_type
  }
  static e_card_recover_action = {
    vx_type: nx_tactics_decks_rule.t_card_recover_action
  }

  // (func card-recover-action)
  static f_card_recover_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "recover-action", ":name", "Recover", ":summary", "* Action: Discard a [Fatigue], [Stun], [Stress], or [Slow]\n* Bind Wounds (2 Actions): Discard a [Bleeding] from yourself or an adjacent unit.")
    return output
  }

  /**
   * @function card_reload_action
   * @return {card}
   */
  static t_card_reload_action = {
    vx_type: vx_core.t_type
  }
  static e_card_reload_action = {
    vx_type: nx_tactics_decks_rule.t_card_reload_action
  }

  // (func card-reload-action)
  static f_card_reload_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "reload-action", ":name", "Reload", ":summary", "* [Double Action]: Change a clip, nock an arrow.\n* 4 Actions: Reload a revolver, a mortar, a machinegun or a crossbow.")
    return output
  }

  /**
   * @function card_round
   * @return {card}
   */
  static t_card_round = {
    vx_type: vx_core.t_type
  }
  static e_card_round = {
    vx_type: nx_tactics_decks_rule.t_card_round
  }

  // (func card-round)
  static f_card_round() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "round", ":name", "Round", ":summary", "* A Round represents a unit of time passing.\n* Turns: During a Round, each Unit will get a [Turn].\n* Round Endt: Discard the top Round# card.")
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
    vx_type: nx_tactics_decks_rule.t_card_round_num
  }

  // (func card-round-num)
  static f_card_round_num(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "round-", num),
      ":name",
      vx_core.f_new({"any-1": vx_core.t_string}, "Round #", num),
      ":summary",
      "* Represents the current Round number.\n* The [Scenario] determines how many rounds there are and whether they count up or down.\n* Scenario Start: Stack the cards in order with Round#1 on top or bottom depending on the [Scenario].\n* Round End: Discard the top Round#.\n** IF one or more [Encounter] cards are revealed THEN resolve them.\n** IF there are no remaining Round# cards THEN the [Scenario] immediately ends for time."
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
    vx_type: nx_tactics_decks_rule.t_card_scale
  }

  // (func card-scale)
  static f_card_scale() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-scale", ":name", "Scale", ":summary", "* Each stat/skill/power has a number after the letter 'x'.\n* This is the scale of that ability.\n* The number represents the number of zeroes. E.g. 5x3 translates to 5000.\n* x1 denotes human scale. E.g. 1x1=10kg, 10iq+50, 10will, 10kph")
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
    vx_type: nx_tactics_decks_rule.t_card_scaled
  }

  // (func card-scaled)
  static f_card_scaled() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-scaled", ":name", "Scaled", ":summary", "* Scaled refers to the comparison between the Scale of a stat/ability/map to another.\n* If the scales are the same, no change is required.\n* If the scales are different, multiple or divide the Level by 10 for each difference in scale.\n* E.g. On an x1 map a Speed:3x2 would move 30 spaces instead of 3.")
    return output
  }

  /**
   * @function card_search_action
   * @return {card}
   */
  static t_card_search_action = {
    vx_type: vx_core.t_type
  }
  static e_card_search_action = {
    vx_type: nx_tactics_decks_rule.t_card_search_action
  }

  // (func card-search-action)
  static f_card_search_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "search-action", ":name", "Search", ":summary", "* [Double Action]: Test [Investigate] vs. [Fate] to search the [Place] you occupy. If you succeed, you may find something.")
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
    vx_type: nx_tactics_decks_rule.t_card_setupguide
  }

  // (func card-setupguide)
  static f_card_setupguide() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "setupguide", ":name", "Setup Guide", ":summary", "* Choose a Scenario and sort it in numerical order.\n* Each [Player] chooses or creates the [Units] they will use.\n* Each [Player] chooses a colored Starter Deck.\n* All Player [Initiative] cards are shuffled together to create an [Initiative] deck.\n* Reveal the top card in the Scenario deck and follow its instructions.")
    return output
  }

  /**
   * @function card_shadow
   * @return {card}
   */
  static t_card_shadow = {
    vx_type: vx_core.t_type
  }
  static e_card_shadow = {
    vx_type: nx_tactics_decks_rule.t_card_shadow
  }

  // (func card-shadow)
  static f_card_shadow() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "shadow", ":name", "Shadow", ":summary", "* The Shadow\n* Shadow Triumphant: The Shadow is now in control of this unit. Set Conscience = Will; set Will = Shadow stat; and set Shadow=blank")
    return output
  }

  /**
   * @function card_skillpoint
   * @param  {int} num
   * @return {card}
   */
  static t_card_skillpoint = {
    vx_type: vx_core.t_type
  }
  static e_card_skillpoint = {
    vx_type: nx_tactics_decks_rule.t_card_skillpoint
  }

  // (func card-skillpoint)
  static f_card_skillpoint(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "skillpoint-", num),
      ":name",
      vx_core.f_new({"any-1": vx_core.t_string}, "Skill Point#", num),
      ":summary",
      "* [Major Achievement]: Gain a Skill Point equal to your 2nd highest Skill level. You may also reduce 1 of your existing Skill levels by 1 to gain a Skill Point equal to the reduced level.\n* A Skill Point may be spent on a [Skill] of equal level to raise that skill by 1.\n* Skill Points may be saved.\n* A Skill Point may be exchanged for 2 Skill Points of 1 lesser level.\n* 2 Skill Points of equal level may be exchanged for 1 Skill Point of 1 higher level."
    )
    return output
  }

  /**
   * @function card_sklll_action
   * @return {card}
   */
  static t_card_sklll_action = {
    vx_type: vx_core.t_type
  }
  static e_card_sklll_action = {
    vx_type: nx_tactics_decks_rule.t_card_sklll_action
  }

  // (func card-sklll-action)
  static f_card_sklll_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "sklll-action", ":name", "Skill", ":summary", "* Action: Assign your Unit's Target card to the target.\n* Stat: The Skill test has a target Stat.\n* Resolve: Resolve the Skill as if it was Combat.\n* Damage: Any stat reductions are added to the Skill card instead of the target.\n* Success: If the stat is reduced to 0, the Skill succeeds.\n* Fail: If the user abandons the test or has any stat reduced to 0, the Skill fails and the Skill card is returned losing all reductions.\n* Simple: Some Tests only require a single success or failure.\n* Extended: The user may continue this test on different turns until a Success or Fail.\n* See Also: [Unskilled] [Unfamiliar Item].")
    return output
  }

  /**
   * @function card_speed
   * @return {card}
   */
  static t_card_speed = {
    vx_type: vx_core.t_type
  }
  static e_card_speed = {
    vx_type: nx_tactics_decks_rule.t_card_speed
  }

  // (func card-speed)
  static f_card_speed() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-speed", ":name", "Speed", ":summary", "* Special*: Each Speed penalty is -25% rounded up. Simplified using the following chart starting from the original Speed stat:\n10-8-5-3-0\n9-7-5-3-0\n8-6-4-2-0\n7-6-4-2-0\n6-5-3-2-0\n5-4-3-2-0\n4-3-2-1-0\n3-3-2-1-0\n2-2-1-1-0\n1-1-1-1-0")
    return output
  }

  /**
   * @function card_surprise
   * @return {card}
   */
  static t_card_surprise = {
    vx_type: vx_core.t_type
  }
  static e_card_surprise = {
    vx_type: nx_tactics_decks_rule.t_card_surprise
  }

  // (func card-surprise)
  static f_card_surprise() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-surprise", ":name", "Surprise", ":summary", "* When:\n** A unit suddenly appears adjacent or on a unit.\n* Then:\n** Reveal [Fate]. Unit takes temporary damage based on the [Suit].\n** [Wands] = [Fatigue]\n** [Coins] = [Stun]\n** [Cups] = [Stress]\n** [Swords] = [Slow]")
    return output
  }

  /**
   * @function card_surrounded
   * @return {card}
   */
  static t_card_surrounded = {
    vx_type: vx_core.t_type
  }
  static e_card_surrounded = {
    vx_type: nx_tactics_decks_rule.t_card_surrounded
  }

  // (func card-surrounded)
  static f_card_surrounded() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-surrounded", ":name", "Surrounded", ":summary", "* IF a unit is adjacent to more than 1 opponent THEN all [Skill]:-1 for each additional opponent.")
    return output
  }

  /**
   * @function card_turn
   * @return {card}
   */
  static t_card_turn = {
    vx_type: vx_core.t_type
  }
  static e_card_turn = {
    vx_type: nx_tactics_decks_rule.t_card_turn
  }

  // (func card-turn)
  static f_card_turn() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "turn", ":name", "Turn", ":summary", "* Each [Round], each [Unit] will get a [Turn] based on [Turn Order].\n* Turn Start: Draw from your [Fate] deck. [Recover].\n* Take 2 Actions: These are [Move], [Fight], [Skill], [Recover], [Search] and [Wait]. You may perform the same Action twice.\n* Turn End: The next unit in Turn Order performs their turn until the Round Ends.")
    return output
  }

  /**
   * @function card_unfamiliaritem
   * @return {card}
   */
  static t_card_unfamiliaritem = {
    vx_type: vx_core.t_type
  }
  static e_card_unfamiliaritem = {
    vx_type: nx_tactics_decks_rule.t_card_unfamiliaritem
  }

  // (func card-unfamiliaritem)
  static f_card_unfamiliaritem() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-unfamiliaritem", ":name", "Unfamiliar Item", ":summary", "* If a unit attempts to use an Item that is not on its character sheet, they may usually attempt it at Initiative:-2 and [Disadvantage]. Note: This is cumulative with [Unskilled].")
    return output
  }

  /**
   * @function card_unskilled
   * @return {card}
   */
  static t_card_unskilled = {
    vx_type: vx_core.t_type
  }
  static e_card_unskilled = {
    vx_type: nx_tactics_decks_rule.t_card_unskilled
  }

  // (func card-unskilled)
  static f_card_unskilled() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "card-unskilled", ":name", "Unskilled", ":summary", "* If a unit lacks a Skill needed, but wants to perform it anyway, they may usually attempt it at Initiative:-2 and [Disadvantage]. Note: This is cumulative with [Unfamiliar Item].")
    return output
  }

  /**
   * @function card_wait_action
   * @return {card}
   */
  static t_card_wait_action = {
    vx_type: vx_core.t_type
  }
  static e_card_wait_action = {
    vx_type: nx_tactics_decks_rule.t_card_wait_action
  }

  // (func card-wait-action)
  static f_card_wait_action() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "wait-action", ":name", "Wait", ":summary", "* [Action]: End your [Turn]. You may interrupt another unit's [Action] to take your second Action.")
    return output
  }

  /**
   * @function card_will
   * @return {card}
   */
  static t_card_will = {
    vx_type: vx_core.t_type
  }
  static e_card_will = {
    vx_type: nx_tactics_decks_rule.t_card_will
  }

  // (func card-will)
  static f_card_will() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "will", ":name", "Will", ":summary", "* Will is the measure of a unit's grit, determination and psychological stability.\n* A unit with Will:0 is panicked.\n* It is lossly derived from an average person having a 100 score. E.g. 100 = 5x10^1 = 5x1, 140 = 9x10^1 = 9x1")
    return output
  }

  /**
   * @function deck_rules
   * @return {deck}
   */
  static t_deck_rules = {
    vx_type: vx_core.t_type
  }
  static e_deck_rules = {
    vx_type: nx_tactics_decks_rule.t_deck_rules
  }

  // (func deck-rules)
  static f_deck_rules() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_decks_rule.f_card_game(),
          nx_tactics_decks_rule.f_card_setupguide(),
          nx_tactics_decks_rule.f_card_round(),
          nx_tactics_decks_rule.f_card_turn(),
          nx_tactics_decks_rule.f_card_action(),
          nx_tactics_decks_rule.f_card_move(),
          nx_tactics_decks_rule.f_card_fight_action(),
          nx_tactics_decks_rule.f_card_sklll_action(),
          nx_tactics_decks_rule.f_card_recover_action(),
          nx_tactics_decks_rule.f_card_equip_action(),
          nx_tactics_decks_rule.f_card_reload_action(),
          nx_tactics_decks_rule.f_card_search_action(),
          nx_tactics_decks_rule.f_card_wait_action(),
          nx_tactics_decks_rule.f_card_free_action(),
          nx_tactics_decks_rule.f_card_lineofsight(),
          nx_tactics_decks_rule.f_card_initiative(),
          nx_tactics_decks_rule.f_card_damageguide(),
          nx_tactics_decks_rule.f_card_hits(),
          nx_tactics_decks_rule.f_card_crits(),
          nx_tactics_decks_rule.f_card_damagereduction(),
          nx_tactics_decks_rule.f_card_cover(),
          nx_tactics_decks_rule.f_card_character(),
          nx_tactics_decks_rule.f_card_body(),
          nx_tactics_decks_rule.f_card_mind(),
          nx_tactics_decks_rule.f_card_will(),
          nx_tactics_decks_rule.f_card_speed(),
          nx_tactics_decks_rule.f_card_beast(),
          nx_tactics_decks_rule.f_card_shadow(),
          nx_tactics_decks_rule.f_card_conscience(),
          nx_tactics_decks_rule.f_card_scale(),
          nx_tactics_decks_rule.f_card_scaled(),
          nx_tactics_decks_rule.f_card_mapscale_1(),
          nx_tactics_decks_rule.f_card_mapscale_2(),
          nx_tactics_decks_rule.f_card_advantage(),
          nx_tactics_decks_rule.f_card_disadvantage(),
          nx_tactics_decks_rule.f_card_areaeffect(),
          nx_tactics_decks_rule.f_card_reach(),
          nx_tactics_decks_rule.f_card_flanking(),
          nx_tactics_decks_rule.f_card_surrounded(),
          nx_tactics_decks_rule.f_card_exposed(),
          nx_tactics_decks_rule.f_card_surprise(),
          nx_tactics_decks_rule.f_card_unskilled(),
          nx_tactics_decks_rule.f_card_unfamiliaritem(),
          nx_tactics_decks_rule.f_card_round_num(1),
          nx_tactics_decks_rule.f_card_round_num(2),
          nx_tactics_decks_rule.f_card_round_num(3),
          nx_tactics_decks_rule.f_card_round_num(4),
          nx_tactics_decks_rule.f_card_round_num(5),
          nx_tactics_decks_rule.f_card_round_num(6),
          nx_tactics_decks_rule.f_card_round_num(7),
          nx_tactics_decks_rule.f_card_round_num(8),
          nx_tactics_decks_rule.f_card_round_num(9),
          nx_tactics_decks_rule.f_card_round_num(10),
          nx_tactics_decks_rule.f_card_round_num(11),
          nx_tactics_decks_rule.f_card_round_num(12),
          nx_tactics_decks_rule.f_card_round_num(13),
          nx_tactics_decks_rule.f_card_round_num(14),
          nx_tactics_decks_rule.f_card_round_num(15),
          nx_tactics_decks_rule.f_card_round_num(16),
          nx_tactics_decks_rule.f_card_round_num(17),
          nx_tactics_decks_rule.f_card_round_num(18),
          nx_tactics_decks_rule.f_card_round_num(19),
          nx_tactics_decks_rule.f_card_round_num(20),
          nx_tactics_decks_rule.f_card_leveling(),
          nx_tactics_decks_rule.f_card_skillpoint(1),
          nx_tactics_decks_rule.f_card_skillpoint(2),
          nx_tactics_decks_rule.f_card_skillpoint(3),
          nx_tactics_decks_rule.f_card_skillpoint(4),
          nx_tactics_decks_rule.f_card_skillpoint(5),
          nx_tactics_decks_rule.f_card_abilitypoint(1),
          nx_tactics_decks_rule.f_card_abilitypoint(2),
          nx_tactics_decks_rule.f_card_abilitypoint(3),
          nx_tactics_decks_rule.f_card_abilitypoint(4),
          nx_tactics_decks_rule.f_card_abilitypoint(5)
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":id", "deckrules", ":name", "Rules", ":cardmap", cardmap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "card-abilitypoint": nx_tactics_decks_rule.e_card_abilitypoint,
      "card-action": nx_tactics_decks_rule.e_card_action,
      "card-advantage": nx_tactics_decks_rule.e_card_advantage,
      "card-areaeffect": nx_tactics_decks_rule.e_card_areaeffect,
      "card-beast": nx_tactics_decks_rule.e_card_beast,
      "card-body": nx_tactics_decks_rule.e_card_body,
      "card-character": nx_tactics_decks_rule.e_card_character,
      "card-conscience": nx_tactics_decks_rule.e_card_conscience,
      "card-cover": nx_tactics_decks_rule.e_card_cover,
      "card-crits": nx_tactics_decks_rule.e_card_crits,
      "card-damageguide": nx_tactics_decks_rule.e_card_damageguide,
      "card-damagereduction": nx_tactics_decks_rule.e_card_damagereduction,
      "card-disadvantage": nx_tactics_decks_rule.e_card_disadvantage,
      "card-equip-action": nx_tactics_decks_rule.e_card_equip_action,
      "card-exposed": nx_tactics_decks_rule.e_card_exposed,
      "card-fight-action": nx_tactics_decks_rule.e_card_fight_action,
      "card-flanking": nx_tactics_decks_rule.e_card_flanking,
      "card-free-action": nx_tactics_decks_rule.e_card_free_action,
      "card-game": nx_tactics_decks_rule.e_card_game,
      "card-hits": nx_tactics_decks_rule.e_card_hits,
      "card-initiative": nx_tactics_decks_rule.e_card_initiative,
      "card-leveling": nx_tactics_decks_rule.e_card_leveling,
      "card-lineofsight": nx_tactics_decks_rule.e_card_lineofsight,
      "card-mapscale-1": nx_tactics_decks_rule.e_card_mapscale_1,
      "card-mapscale-2": nx_tactics_decks_rule.e_card_mapscale_2,
      "card-mind": nx_tactics_decks_rule.e_card_mind,
      "card-move": nx_tactics_decks_rule.e_card_move,
      "card-reach": nx_tactics_decks_rule.e_card_reach,
      "card-recover-action": nx_tactics_decks_rule.e_card_recover_action,
      "card-reload-action": nx_tactics_decks_rule.e_card_reload_action,
      "card-round": nx_tactics_decks_rule.e_card_round,
      "card-round-num": nx_tactics_decks_rule.e_card_round_num,
      "card-scale": nx_tactics_decks_rule.e_card_scale,
      "card-scaled": nx_tactics_decks_rule.e_card_scaled,
      "card-search-action": nx_tactics_decks_rule.e_card_search_action,
      "card-setupguide": nx_tactics_decks_rule.e_card_setupguide,
      "card-shadow": nx_tactics_decks_rule.e_card_shadow,
      "card-skillpoint": nx_tactics_decks_rule.e_card_skillpoint,
      "card-sklll-action": nx_tactics_decks_rule.e_card_sklll_action,
      "card-speed": nx_tactics_decks_rule.e_card_speed,
      "card-surprise": nx_tactics_decks_rule.e_card_surprise,
      "card-surrounded": nx_tactics_decks_rule.e_card_surrounded,
      "card-turn": nx_tactics_decks_rule.e_card_turn,
      "card-unfamiliaritem": nx_tactics_decks_rule.e_card_unfamiliaritem,
      "card-unskilled": nx_tactics_decks_rule.e_card_unskilled,
      "card-wait-action": nx_tactics_decks_rule.e_card_wait_action,
      "card-will": nx_tactics_decks_rule.e_card_will,
      "deck-rules": nx_tactics_decks_rule.e_deck_rules
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "card-abilitypoint": nx_tactics_decks_rule.t_card_abilitypoint,
      "card-action": nx_tactics_decks_rule.t_card_action,
      "card-advantage": nx_tactics_decks_rule.t_card_advantage,
      "card-areaeffect": nx_tactics_decks_rule.t_card_areaeffect,
      "card-beast": nx_tactics_decks_rule.t_card_beast,
      "card-body": nx_tactics_decks_rule.t_card_body,
      "card-character": nx_tactics_decks_rule.t_card_character,
      "card-conscience": nx_tactics_decks_rule.t_card_conscience,
      "card-cover": nx_tactics_decks_rule.t_card_cover,
      "card-crits": nx_tactics_decks_rule.t_card_crits,
      "card-damageguide": nx_tactics_decks_rule.t_card_damageguide,
      "card-damagereduction": nx_tactics_decks_rule.t_card_damagereduction,
      "card-disadvantage": nx_tactics_decks_rule.t_card_disadvantage,
      "card-equip-action": nx_tactics_decks_rule.t_card_equip_action,
      "card-exposed": nx_tactics_decks_rule.t_card_exposed,
      "card-fight-action": nx_tactics_decks_rule.t_card_fight_action,
      "card-flanking": nx_tactics_decks_rule.t_card_flanking,
      "card-free-action": nx_tactics_decks_rule.t_card_free_action,
      "card-game": nx_tactics_decks_rule.t_card_game,
      "card-hits": nx_tactics_decks_rule.t_card_hits,
      "card-initiative": nx_tactics_decks_rule.t_card_initiative,
      "card-leveling": nx_tactics_decks_rule.t_card_leveling,
      "card-lineofsight": nx_tactics_decks_rule.t_card_lineofsight,
      "card-mapscale-1": nx_tactics_decks_rule.t_card_mapscale_1,
      "card-mapscale-2": nx_tactics_decks_rule.t_card_mapscale_2,
      "card-mind": nx_tactics_decks_rule.t_card_mind,
      "card-move": nx_tactics_decks_rule.t_card_move,
      "card-reach": nx_tactics_decks_rule.t_card_reach,
      "card-recover-action": nx_tactics_decks_rule.t_card_recover_action,
      "card-reload-action": nx_tactics_decks_rule.t_card_reload_action,
      "card-round": nx_tactics_decks_rule.t_card_round,
      "card-round-num": nx_tactics_decks_rule.t_card_round_num,
      "card-scale": nx_tactics_decks_rule.t_card_scale,
      "card-scaled": nx_tactics_decks_rule.t_card_scaled,
      "card-search-action": nx_tactics_decks_rule.t_card_search_action,
      "card-setupguide": nx_tactics_decks_rule.t_card_setupguide,
      "card-shadow": nx_tactics_decks_rule.t_card_shadow,
      "card-skillpoint": nx_tactics_decks_rule.t_card_skillpoint,
      "card-sklll-action": nx_tactics_decks_rule.t_card_sklll_action,
      "card-speed": nx_tactics_decks_rule.t_card_speed,
      "card-surprise": nx_tactics_decks_rule.t_card_surprise,
      "card-surrounded": nx_tactics_decks_rule.t_card_surrounded,
      "card-turn": nx_tactics_decks_rule.t_card_turn,
      "card-unfamiliaritem": nx_tactics_decks_rule.t_card_unfamiliaritem,
      "card-unskilled": nx_tactics_decks_rule.t_card_unskilled,
      "card-wait-action": nx_tactics_decks_rule.t_card_wait_action,
      "card-will": nx_tactics_decks_rule.t_card_will,
      "deck-rules": nx_tactics_decks_rule.t_deck_rules
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/rule",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func card-abilitypoint)
    nx_tactics_decks_rule.t_card_abilitypoint['vx_value'] = {
      name          : "card-abilitypoint",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_abilitypoint
    }

    // (func card-action)
    nx_tactics_decks_rule.t_card_action['vx_value'] = {
      name          : "card-action",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_action
    }

    // (func card-advantage)
    nx_tactics_decks_rule.t_card_advantage['vx_value'] = {
      name          : "card-advantage",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_advantage
    }

    // (func card-areaeffect)
    nx_tactics_decks_rule.t_card_areaeffect['vx_value'] = {
      name          : "card-areaeffect",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_areaeffect
    }

    // (func card-beast)
    nx_tactics_decks_rule.t_card_beast['vx_value'] = {
      name          : "card-beast",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_beast
    }

    // (func card-body)
    nx_tactics_decks_rule.t_card_body['vx_value'] = {
      name          : "card-body",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_body
    }

    // (func card-character)
    nx_tactics_decks_rule.t_card_character['vx_value'] = {
      name          : "card-character",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_character
    }

    // (func card-conscience)
    nx_tactics_decks_rule.t_card_conscience['vx_value'] = {
      name          : "card-conscience",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_conscience
    }

    // (func card-cover)
    nx_tactics_decks_rule.t_card_cover['vx_value'] = {
      name          : "card-cover",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_cover
    }

    // (func card-crits)
    nx_tactics_decks_rule.t_card_crits['vx_value'] = {
      name          : "card-crits",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_crits
    }

    // (func card-damageguide)
    nx_tactics_decks_rule.t_card_damageguide['vx_value'] = {
      name          : "card-damageguide",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_damageguide
    }

    // (func card-damagereduction)
    nx_tactics_decks_rule.t_card_damagereduction['vx_value'] = {
      name          : "card-damagereduction",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_damagereduction
    }

    // (func card-disadvantage)
    nx_tactics_decks_rule.t_card_disadvantage['vx_value'] = {
      name          : "card-disadvantage",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_disadvantage
    }

    // (func card-equip-action)
    nx_tactics_decks_rule.t_card_equip_action['vx_value'] = {
      name          : "card-equip-action",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_equip_action
    }

    // (func card-exposed)
    nx_tactics_decks_rule.t_card_exposed['vx_value'] = {
      name          : "card-exposed",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_exposed
    }

    // (func card-fight-action)
    nx_tactics_decks_rule.t_card_fight_action['vx_value'] = {
      name          : "card-fight-action",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_fight_action
    }

    // (func card-flanking)
    nx_tactics_decks_rule.t_card_flanking['vx_value'] = {
      name          : "card-flanking",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_flanking
    }

    // (func card-free-action)
    nx_tactics_decks_rule.t_card_free_action['vx_value'] = {
      name          : "card-free-action",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_free_action
    }

    // (func card-game)
    nx_tactics_decks_rule.t_card_game['vx_value'] = {
      name          : "card-game",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_game
    }

    // (func card-hits)
    nx_tactics_decks_rule.t_card_hits['vx_value'] = {
      name          : "card-hits",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_hits
    }

    // (func card-initiative)
    nx_tactics_decks_rule.t_card_initiative['vx_value'] = {
      name          : "card-initiative",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_initiative
    }

    // (func card-leveling)
    nx_tactics_decks_rule.t_card_leveling['vx_value'] = {
      name          : "card-leveling",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_leveling
    }

    // (func card-lineofsight)
    nx_tactics_decks_rule.t_card_lineofsight['vx_value'] = {
      name          : "card-lineofsight",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_lineofsight
    }

    // (func card-mapscale-1)
    nx_tactics_decks_rule.t_card_mapscale_1['vx_value'] = {
      name          : "card-mapscale-1",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_mapscale_1
    }

    // (func card-mapscale-2)
    nx_tactics_decks_rule.t_card_mapscale_2['vx_value'] = {
      name          : "card-mapscale-2",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_mapscale_2
    }

    // (func card-mind)
    nx_tactics_decks_rule.t_card_mind['vx_value'] = {
      name          : "card-mind",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_mind
    }

    // (func card-move)
    nx_tactics_decks_rule.t_card_move['vx_value'] = {
      name          : "card-move",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_move
    }

    // (func card-reach)
    nx_tactics_decks_rule.t_card_reach['vx_value'] = {
      name          : "card-reach",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_reach
    }

    // (func card-recover-action)
    nx_tactics_decks_rule.t_card_recover_action['vx_value'] = {
      name          : "card-recover-action",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_recover_action
    }

    // (func card-reload-action)
    nx_tactics_decks_rule.t_card_reload_action['vx_value'] = {
      name          : "card-reload-action",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_reload_action
    }

    // (func card-round)
    nx_tactics_decks_rule.t_card_round['vx_value'] = {
      name          : "card-round",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_round
    }

    // (func card-round-num)
    nx_tactics_decks_rule.t_card_round_num['vx_value'] = {
      name          : "card-round-num",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_round_num
    }

    // (func card-scale)
    nx_tactics_decks_rule.t_card_scale['vx_value'] = {
      name          : "card-scale",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_scale
    }

    // (func card-scaled)
    nx_tactics_decks_rule.t_card_scaled['vx_value'] = {
      name          : "card-scaled",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_scaled
    }

    // (func card-search-action)
    nx_tactics_decks_rule.t_card_search_action['vx_value'] = {
      name          : "card-search-action",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_search_action
    }

    // (func card-setupguide)
    nx_tactics_decks_rule.t_card_setupguide['vx_value'] = {
      name          : "card-setupguide",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_setupguide
    }

    // (func card-shadow)
    nx_tactics_decks_rule.t_card_shadow['vx_value'] = {
      name          : "card-shadow",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_shadow
    }

    // (func card-skillpoint)
    nx_tactics_decks_rule.t_card_skillpoint['vx_value'] = {
      name          : "card-skillpoint",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_skillpoint
    }

    // (func card-sklll-action)
    nx_tactics_decks_rule.t_card_sklll_action['vx_value'] = {
      name          : "card-sklll-action",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_sklll_action
    }

    // (func card-speed)
    nx_tactics_decks_rule.t_card_speed['vx_value'] = {
      name          : "card-speed",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_speed
    }

    // (func card-surprise)
    nx_tactics_decks_rule.t_card_surprise['vx_value'] = {
      name          : "card-surprise",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_surprise
    }

    // (func card-surrounded)
    nx_tactics_decks_rule.t_card_surrounded['vx_value'] = {
      name          : "card-surrounded",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_surrounded
    }

    // (func card-turn)
    nx_tactics_decks_rule.t_card_turn['vx_value'] = {
      name          : "card-turn",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_turn
    }

    // (func card-unfamiliaritem)
    nx_tactics_decks_rule.t_card_unfamiliaritem['vx_value'] = {
      name          : "card-unfamiliaritem",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_unfamiliaritem
    }

    // (func card-unskilled)
    nx_tactics_decks_rule.t_card_unskilled['vx_value'] = {
      name          : "card-unskilled",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_unskilled
    }

    // (func card-wait-action)
    nx_tactics_decks_rule.t_card_wait_action['vx_value'] = {
      name          : "card-wait-action",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_wait_action
    }

    // (func card-will)
    nx_tactics_decks_rule.t_card_will['vx_value'] = {
      name          : "card-will",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_will
    }

    // (func deck-rules)
    nx_tactics_decks_rule.t_deck_rules['vx_value'] = {
      name          : "deck-rules",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_deck_rules
    }

  }
}
