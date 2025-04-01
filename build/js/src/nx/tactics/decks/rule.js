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
   * @function card_clock_num
   * @param  {int} num
   * @return {card}
   */
  static t_card_clock_num = {
    vx_type: vx_core.t_type
  }
  static e_card_clock_num = {
    vx_type: nx_tactics_decks_rule.t_card_clock_num
  }

  // (func card-clock-num)
  static f_card_clock_num(num) {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_card},
      ":id",
      vx_core.f_new({"any-1": vx_core.t_string}, "clock-", num),
      ":name",
      vx_core.f_new({"any-1": vx_core.t_string}, "Clock #", num),
      ":summary",
      "* Represents the current time on the Clock.\n* The [scene] determines how many rounds there are and whether they count up or down.\n* scene Start: Stack the cards in order with Round#1 on top or bottom depending on the [scene].\n* Round End: Discard the top Round#.\n** IF one or more [Encounter] cards are revealed THEN resolve them.\n** IF there are no remaining Round# cards THEN the [scene] immediately ends for time."
    )
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
   * @function deck_rules
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_rules = {
    vx_type: vx_core.t_type
  }
  static e_deck_rules = {
    vx_type: nx_tactics_decks_rule.t_deck_rules
  }

  // (func deck-rules)
  static f_deck_rules(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          vx_core.f_list_from_list(
            {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_rule, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_rulelist},
            nx_tactics_base.f_rulelist_from_tactics_keys(tactics, "Game", "Setup Guide", "Damage Guide", "Round", "Move", "Action", "Fight", "Skill", "Power", "Interact", "Recover", "Equip", "Reload", "Search", "Free Action", "Line of Sight", "Initiative", "Damage Guide", "Effect", "Crits", "Mitigation", "Cover", "Character", "Body", "Mind", "Will", "Speed", "Beast", "Shadow", "Conscience", "Leveling", "Map: Exploration", "Map: Personal", "Map: Vehicle", "Scale", "Scaled", "Advantage", "Disadvantage", "Area Effect", "Reach", "Flanking", "Surrounded", "Exposed", "Surprise", "Unskilled", "Unfamiliar Item")
          ),
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_cardlist},
            nx_tactics_decks_rule.f_card_clock_num(1),
            nx_tactics_decks_rule.f_card_clock_num(2),
            nx_tactics_decks_rule.f_card_clock_num(3),
            nx_tactics_decks_rule.f_card_clock_num(4),
            nx_tactics_decks_rule.f_card_clock_num(5),
            nx_tactics_decks_rule.f_card_clock_num(6),
            nx_tactics_decks_rule.f_card_clock_num(7),
            nx_tactics_decks_rule.f_card_clock_num(8),
            nx_tactics_decks_rule.f_card_clock_num(9),
            nx_tactics_decks_rule.f_card_clock_num(10),
            nx_tactics_decks_rule.f_card_clock_num(11),
            nx_tactics_decks_rule.f_card_clock_num(12),
            nx_tactics_decks_rule.f_card_clock_num(13),
            nx_tactics_decks_rule.f_card_clock_num(14),
            nx_tactics_decks_rule.f_card_clock_num(15),
            nx_tactics_decks_rule.f_card_clock_num(16),
            nx_tactics_decks_rule.f_card_clock_num(17),
            nx_tactics_decks_rule.f_card_clock_num(18),
            nx_tactics_decks_rule.f_card_clock_num(19),
            nx_tactics_decks_rule.f_card_clock_num(20),
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
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new({"any-1": nx_tactics_base.t_deck}, ":id", "deckrules", ":name", "Rules", ":cardmap", cardmap)
      })
    )
    return output
  }

  /**
   * @function rulemap_tactics
   * @param  {tactics} tactics
   * @return {rulemap}
   */
  static t_rulemap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_rulemap_tactics = {
    vx_type: nx_tactics_decks_rule.t_rulemap_tactics
  }

  // (func rulemap-tactics)
  static f_rulemap_tactics(tactics) {
    let output = nx_tactics_base.e_rulemap
    output = nx_tactics_base.f_rulemap_from_rulelist(
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action", ":summary", "* Each [Turn] a Unit will get 2 Actions. These are [Move], [Fight], [Skill], [Recover], [Search], [Equip], and [Reload], and [Wait]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Advantage", ":summary", "* [Reveal]: Reveal another Conflict. You may use this card instead."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Area Effect", ":image", "images/card-areaeffect.svg", ":summary", "* Some powers can attack in a large area.\n* Reduce your Skill or Intensity by 1 to get an Area Effect Card. Each additional reduction doubles the number of cards.\n* Place a card next to your unit and arrange the rest in any stable shape. Examples below."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Beast", ":summary", "* The Beast\n* Beast Unleashed: The Beast is now in control of this unit. Set Conscience = Will; set Will = Beast stat; and set Beast=blank"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Body", ":summary", "* Body is the measure of a unit's mass and durability.\n* A unit with Body:0 is incapacitated.\n* It is derived from the mass in kg. E.g. 300kg = 3x10^2 = 3x2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Character"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conscience", ":summary", "* Conscience"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cover", ":summary", "* Cover makes it harder to hit a target and can absorb damage if struck. Opponents and Allies can provide cover too. Even smoke provides Cover.\n* If something is between you and your opponent, guess at the amount of Cover provided and resolve with the following penalties:\n** 25% Cover: Initiative:-1.\n** 50% Cover: Initiative:-2.\n** 75% Cover: Initiative:-3.\n** 100% Cover: Initiative:-4.\n* If successful, assign each 25% to whatever is providing cover (this can include fog, smoke, tables, walls, other opponents, allies, etc). Assign each a suit and draw [Shared Conflict]. If an assigned suit is drawn, the Cover is struck first. Resolve below based on the type of Cover.\n** Insubstantial: Resolve damage normally.\n** Item: Damage the item first. If it is destroyed, resolve any remaining damage on the original target.\n** Unit: That unit is the new target. Resolve a new Combat with it instead."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Crits", ":summary", "* Crits are face-up [Damage] cards.\n* 10 [Hits] = 1 Crit"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Damage Guide", ":summary", "* Damage Types: Determine the [Damage Types] of the weapon.\n* Reveal Damage: Reveal cards equal to [Hits].\n* Separate Damage: Separate them into 2 piles: Those that match the [Damage Types] (Damage) and those that don't (Fatigue).\n* Hit Location: The top card from the matching pile is the Hit Location (or the mismatch pile if no matches). Move it aside and flip the Fatigue pile to its facedown side.\n* Armor: Check [Armor] in the [Hit Location] and then the target reduces the Damage or Fatigue for each point of armor. The Hit Location can only be removed last.\n* Fatigue: The target may take the Fatigue cards as long they have Body. Any remaining Fatigue are flipped faceup and added to the Damage pile.\n* Damage: Count the Damage pile and apply the effect on the Hit Location card to the target.\n* Cleanup: Discard other cards. Shuffle if a Wild was revealed."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Disadvantage", ":summary", "* [Reveal]: Reveal another Conflict. IF it is worse THEN use it instead."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Effect", ":summary", "*"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Equip", ":summary", "* [Action]: Drop an item in one or more hands and equip another that is readily available in a holster, sheath, belt OR return an item in hand to a readily available spot.\n* [Action]: Give or receive an item from an adjacent willing unit.\n* [Double Action]: Drop an item in one or more hands and equip another that is in an inconvenient spot like a large bag, backpack, on your back, on another person, etc. OR return an item in hand to an inconvenient spot."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Exposed", ":summary", "* Your [Normal] [Block] cards always lose."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Exposure", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Fight", ":summary", "* Target a unit with a damaging Skill/Power.\n* Each player chooses a Conflict card from their hand or a random card from Shared Conflict.\n* Conflict Cards are compared like Rock/Paper/Scissors.\n* Fight Speed: Block/Counter > Fast > Evade > Strong > Block/Counter\n* If both play Fast or Strong then compare by rank (lower is faster).\n* Order: AJQK2-10\n* If Tied, there is no result.\n* If one player Wins, then resolve their result and apply Damage. If the target wins, they do no Damage unless they spend an Action.\n* Discard all card used (except Keep)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Flanking", ":summary", "* Flanks: IF a unit attacks an opponent from anywhere behind THEN [Initiative]:+1\n* Blindspot: IF a unit attacks an opponent and is in a straight line directly behind an opponent THEN the opponent is [Exposed] for this attack."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Free Action", ":summary", "* Free Actions are like normal actions but do not use any of your 2 Actions each turn.\n* Move Out: [Fatigue]:+1 to [Move]:1. You may Turn or Drift once during this Move.\n* Double Down: [Stun]:+1 to reduce a Double Action to an Action.\n* Grit Your Teeth: [Stress]:+1 to ignore the effect of all of your negative statuses this turn.\n* Final Sprint: [Slow]:+1 to [Move].\n* Opportunity Combat: IF a Target moves from one adjacent space of a Unit to another THEN that Unit may take a [Stun] to take a free [Fight] against it."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Game", ":summary", "* Create [Characters] or [Factions] to play [Scenes].\n* Each [Scene] contains various [Threats] and [Goals].\n* Try to complete them using your [Skills] and [Powers] for [Rewards].\n* Some [Rewards] are items, others are Skill Points or Ability Points that allow you to increase the level of your [Skills], [Powers], [Abilities], or [Specialties].\n* A Game is broken up into Rounds.\n* Each Round every Player takes a Turn.\n* Each Turn each Player takes 2 Actions."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hunger", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Initiative", ":summary", "* Lower is Better: IF you and your opponent both play [Normal] [Fast] or you both play [Normal] [Strong] THEN the lower [Rank] of the cards wins.\n* Skill Difference: The difference between your and your opponent's [Skill] is a Bonus or Penalty.\n* Bonus (+X): Initiative bonus is SUBTRACTED before comparing.\n* Penalty (-X): Initiative penalty is ADDED before comparing."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Interact", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Leveling", ":summary", "* Major Achievement: Completion gains a Skill Point with level equal to your 2nd highest Skill.\n* Minor Achievement: Completion gains an [Ability Point]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Line of Sight", ":summary", "* Most distance effects require line of sight to the target.\n* Determine Line of Sight: Starting from your location point, use a straight edge to touch every part of the target (in 1 space).\n* If nothing is between you, then you have full line of sight. Resolve normally."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Exploration", ":summary", "* Human Scale\n* Space Size: 1m\n* Turn Length: 2sec\n* Human: Max speed 3x1 = 30kph/18mph. Walk speed = 6kph/3.5mph/1.6mps. 2sec move = ~3 spaces (3.2m).\n* Car: Max speed 2x2 = 200kph/125mph. Slow speed = 40kph/25mph/11mps. 2sec move = ~20 spaces.(22m)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Personal", ":summary", "* Human Scale\n* Space Size: 1m\n* Turn Length: 2sec\n* Human: Max speed 3x1 = 30kph/18mph. Walk speed = 6kph/3.5mph/1.6mps. 2sec move = ~3 spaces (3.2m).\n* Car: Max speed 2x2 = 200kph/125mph. Slow speed = 40kph/25mph/11mps. 2sec move = ~20 spaces.(22m)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Vehicle", ":summary", "* Vehicle Map\n* Space Size: 3m\n* Turn Length: 1sec\n* Note: Car (max speed 2x2 = 200kph/125mph) slow at 40kph/25mph/11mps. 1sec move = 4 spaces (11m)."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mind", ":summary", "* Mind is the measure of a unit's intellect and problem solving ability.\n* A unit with Mind:0 is delirious.\n* It is lossly derived from the IQ-50. E.g. 100IQ = 5x10^1 = 5x1, 140IQ = 9x10^1 = 9x1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mitigation", ":summary", "* Obstacles\n* Cover\n* Shields\n* Armor\n* Toughness\n* Body"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Move", ":summary", "* [Action]: Move straight up to your [Speed] stat.\n* Double Move (2 Actions): Move straight your [Speed]x2.\n* Sprint (2 Actions): If you took a Double Move or Sprint last turn, you may move [Speed]x3 straight this turn.\n* Leftover Speed: After moving, if there is an adjacent space that you cannot afford to enter and you have partial Speed left, you may take note of it and carry it over to subsequent turns.\n* Change Facing: During your Move Action, you may Turn or Drift up to 2 times.\n* Turn: Turn your unit's facing 45 degrees to the left or right.\n* Drift: Instead of moving straight, move diagonally to the left or right while maintaining facing."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Poisoned", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Power", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Reach", ":summary", "* Can target one additional dot away [Scaled]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Recover", ":summary", "* Action: Discard a [Fatigue], [Stun], [Stress], or [Slow]\n* Bind Wounds (2 Actions): Discard a [Bleeding] from yourself or an adjacent unit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Reload", ":summary", "* [Double Action]: Change a clip, nock an arrow.\n* 4 Actions: Reload a revolver, a mortar, a machinegun or a crossbow."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round", ":summary", "* Each [Round], each [Unit] will get a [Turn] based on [Turn Order].\n* Turn Start: Draw from your [Conflict] deck. [Recover].\n* Take 2 Actions: These are [Move], [Fight], [Skill], [Recover], [Search] and [Wait]. You may perform the same Action twice.\n* Turn End: The next unit in Turn Order performs their turn until the Round Ends."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scale", ":summary", "* Each stat/skill/power has a number after the letter 'x'.\n* This is the scale of that ability.\n* The number represents the number of zeroes. E.g. 5x3 translates to 5000.\n* x1 denotes human scale. E.g. 1x1=10kg, 10iq+50, 10will, 10kph"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scaled", ":summary", "* Scaled refers to the comparison between the Scale of a stat/ability/map to another.\n* If the scales are the same, no change is required.\n* If the scales are different, multiple or divide the Level by 10 for each difference in scale.\n* E.g. On an x1 map a Speed:3x2 would move 30 spaces instead of 3."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Search", ":summary", "* [Double Action]: Test [Investigate] vs. [Conflict] to search the [Place] you occupy. If you succeed, you may find something."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Setup Guide", ":summary", "* Choose a scene and sort it in numerical order.\n* Each [Player] chooses or creates the [Units] they will use.\n* Each [Player] chooses a colored Starter Deck.\n* All Player [Initiative] cards are shuffled together to create an [Initiative] deck.\n* Reveal the top card in the scene deck and follow its instructions."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Shadow", ":summary", "* The Shadow\n* Shadow Triumphant: The Shadow is now in control of this unit. Set Conscience = Will; set Will = Shadow stat; and set Shadow=blank"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skill", ":summary", "* Action: Assign your Unit's Target card to the target.\n* Stat: The Skill test has a target Stat.\n* Resolve: Resolve the Skill as if it was Combat.\n* Damage: Any stat reductions are added to the Skill card instead of the target.\n* Success: If the stat is reduced to 0, the Skill succeeds.\n* Fail: If the user abandons the test or has any stat reduced to 0, the Skill fails and the Skill card is returned losing all reductions.\n* Simple: Some Tests only require a single success or failure.\n* Extended: The user may continue this test on different turns until a Success or Fail.\n* See Also: [Unskilled] [Unfamiliar Item]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Speed", ":summary", "* Special*: IF Speed over 5 THEN penalty is Speed:-2."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surprise", ":summary", "* IF a unit suddenly appears adjacent or on a unit.\n* THEN\n** Reveal [Conflict]. Unit takes temporary damage based on the [Suit].\n** [Wands] = [Fatigue]\n** [Coins] = [Stun]\n** [Cups] = [Stress]\n** [Swords] = [Slow]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surrounded", ":summary", "* IF a unit is adjacent to more than 1 opponent THEN all [Skill]:-1 for each additional opponent."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Thirst", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unfamiliar Item", ":summary", "* If a unit attempts to use an Item that is not on its character sheet, they may usually attempt it at Initiative:-2 and [Disadvantage]. Note: This is cumulative with [Unskilled]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unskilled", ":summary", "* If a unit lacks a Skill needed, but wants to perform it anyway, they may usually attempt it at Initiative:-2 and [Disadvantage]. Note: This is cumulative with [Unfamiliar Item]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Temperature", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Clouds", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Humidity", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Wind", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":id", "will", ":name", "Will", ":summary", "* Will is the measure of a unit's grit, determination and psychological stability.\n* A unit with Will:0 is panicked.\n* It is lossly derived from an average person having a 100 score. E.g. 100 = 5x10^1 = 5x1, 140 = 9x10^1 = 9x1")
    )
    return output
  }

  /**
   * @function tactics_rulemap_from_tactics
   * Returns a tactics updated with rulemap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_rulemap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_rulemap_from_tactics = {
    vx_type: nx_tactics_decks_rule.t_tactics_rulemap_from_tactics
  }

  // (func tactics-rulemap<-tactics)
  static f_tactics_rulemap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const rulemap = nx_tactics_decks_rule.f_rulemap_tactics(tactics)
        return vx_core.f_copy(tactics, ":rulemap", rulemap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "card-abilitypoint": nx_tactics_decks_rule.e_card_abilitypoint,
      "card-clock-num": nx_tactics_decks_rule.e_card_clock_num,
      "card-skillpoint": nx_tactics_decks_rule.e_card_skillpoint,
      "deck-rules": nx_tactics_decks_rule.e_deck_rules,
      "rulemap-tactics": nx_tactics_decks_rule.e_rulemap_tactics,
      "tactics-rulemap<-tactics": nx_tactics_decks_rule.e_tactics_rulemap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "card-abilitypoint": nx_tactics_decks_rule.t_card_abilitypoint,
      "card-clock-num": nx_tactics_decks_rule.t_card_clock_num,
      "card-skillpoint": nx_tactics_decks_rule.t_card_skillpoint,
      "deck-rules": nx_tactics_decks_rule.t_deck_rules,
      "rulemap-tactics": nx_tactics_decks_rule.t_rulemap_tactics,
      "tactics-rulemap<-tactics": nx_tactics_decks_rule.t_tactics_rulemap_from_tactics
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

    // (func card-clock-num)
    nx_tactics_decks_rule.t_card_clock_num['vx_value'] = {
      name          : "card-clock-num",
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
      fn            : nx_tactics_decks_rule.f_card_clock_num
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

    // (func rulemap-tactics)
    nx_tactics_decks_rule.t_rulemap_tactics['vx_value'] = {
      name          : "rulemap-tactics",
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
      fn            : nx_tactics_decks_rule.f_rulemap_tactics
    }

    // (func tactics-rulemap<-tactics)
    nx_tactics_decks_rule.t_tactics_rulemap_from_tactics['vx_value'] = {
      name          : "tactics-rulemap<-tactics",
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
      fn            : nx_tactics_decks_rule.f_tactics_rulemap_from_tactics
    }

  }
}
