'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_type from "../../../vx/type.js"


export default class nx_tactics_decks_rule {

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
            nx_tactics_base.f_rulelist_from_tactics_keys(tactics, "Drawn to Destiny", "Features", "Terminology", "How to Play", "Scene", "Setup", "Round", "Round: Start", "Round: Targets", "Round: Groups", "Round: Moves", "Round: Actions", "Round: End", "Conclusion", "Move", "Free Action", "Action", "Combat", "Conflict", "Conflict: Approach", "Conflict: Rank", "Conflict: Reveal", "Conflict: Compare", "Conflict: Chart", "Conflict: Effect", "Conflict: Resolution", "Hit Location", "Hit Location: Vehicle", "Damage Decks", "Damage Guide", "Interact", "Recover", "Equip", "Reload", "Search", "Line of Sight", "Effect", "Crits", "Mitigation", "Cover", "Task", "Value", "Unit", "Item", "Skill", "Power", "Character", "Body", "Mind", "Will", "Speed", "Beast", "Shadow", "Conscience", "Leveling", "Map: Exploration", "Map: Personal", "Map: Vehicle", "Scale", "Scaled", "Advantage", "Disadvantage", "Area Effect", "Reach", "Flanking", "Surrounded", "Surprise", "Unskilled", "Unfamiliar Item", "Choking", "Hunger", "Thirst", "Exposure", "Weather: Clouds", "Weather: Humidity", "Weather: Temperature", "Weather: Wind")
          ),
          nx_tactics_base.f_cardlist_copy_from_tactics_rulekey_count_isnum(
            tactics,
            "Clock",
            20,
            true
          ),
          nx_tactics_base.f_cardlist_copy_from_tactics_rulekey_count_isnum(
            tactics,
            "Skill Point",
            5,
            true
          ),
          nx_tactics_base.f_cardlist_copy_from_tactics_rulekey_count_isnum(
            tactics,
            "Ability Point",
            5,
            true
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
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Ability Point", ":summary", "* [Minor Achievment]: Gain an Ability Point. You may also convert 1 of your existing Abilities into an Ability Point.\n* An Ability Point may be exchanged for an Ability, Specialty, or a Power Intensity increase.\n* Ability Points may be saved."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action", ":image", "images/rule-action.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Advantage", ":summary", "* Your [Common] [Block] cards always Succeed against [Common] [Strong]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Area Effect", ":image", "images/card-areaeffect.svg", ":summary", "* Powers can attack in an area.\n* Skill:-1 or Intensity:-1 to get an Area Effect. Extra reductions double the cards.\n* Arrange cards into a shape starting from the unit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Beast", ":summary", "* The Beast\n* Beast Unleashed: The Beast is now in control of this unit. Set Conscience = Will; set Will = Beast stat; and set Beast=blank"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Body", ":summary", "* Body is the measure of a unit's mass and durability.\n* A unit with Body:0 is incapacitated.\n* It is derived from the mass in kg. E.g. 300kg = 3x10^2 = 3x2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Broken", ":summary", "* A broken [Item] can only be used as an [Improvised Weapon]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Character"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Choking", ":summary", "* This includes any obstruction of airways such as smoke, water, sand, fungus, disease, physical choking, etc. It also includes damage to filters and other aspiration/ventilation systems on machines.\n* Will:-1\n* Event: IF a Unit breathes < 1 minute/2 minutes THEN Choking:+1 ELSE Choking:-1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Clock", ":summary", "* Represents the current Clock time.\n* The [scene] determines how many rounds there are and whether they count up or down.\n* scene Start: Stack the cards in order with Round#1 on top or bottom depending on the [scene].\n* Round End: Discard the top Round#.\n** IF one or more [Encounter] cards are revealed THEN resolve them.\n** IF there are no remaining Round# cards THEN the [scene] immediately ends for time."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Combat", ":summary", "* Target a unit with a damaging Skill/Power.\n* Each player chooses a Conflict card from their hand or a random card from Shared Conflict.\n* Conflict Cards are compared like Rock/Paper/Scissors.\n* Fight Speed: Block/Counter > Fast > Evade > Strong > Block/Counter\n* If both play Fast or Strong then compare by rank (lower is faster).\n* Order: AJQK2-10\n* If Tied, there is no result.\n* If one player Wins, then resolve their result and apply Damage. If the target wins, they do no Damage unless they spend an Action.\n* Discard all card used (except Keep)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conclusion", ":summary", "* Downtime\n* Rewards\n* Advancement"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conflict", ":summary", "1) Choose Approach / Rank\n2) Reveal\n3) Compare\n4) Effect\n5) Resolution"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict: Approach",
        ":image",
        "images/rule-conflict-approach.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict: Compare",
        ":image",
        "images/rule-conflict-compare.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict: Chart",
        ":image",
        "images/rule-conflict-chart.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conflict: Clash", ":summary", "A Clash occurs when two [Fast] or two [Strong] face each other.\n* A - Win: any\n* J - Win: 2-10, Q, K\n* Q - Win: 2-10, K\n* K - Win: 2-10\n* 2-10 - Lower number Wins (after modifiers)\n** Modifier = Higher Skill Level - Lower Skill Level\n** Add Modifier to Lower Skill Rank.\n** Compare Ranks. Lower Rank Wins.\n** IF Still Tied THEN Both Win."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conflict: Effect", ":summary", "* Effect"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict: Reveal",
        ":image",
        "images/rule-conflict-reveal.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conflict: Resolution"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict: Rank",
        ":image",
        "images/rule-conflict-rank.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conscience", ":summary", "* Conscience"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cover", ":summary", "* Cover makes it harder to hit a target and can absorb damage if struck. Opponents and Allies can provide cover too. Even smoke provides Cover.\n* If something is between you and your opponent, guess at the amount of Cover provided and resolve with the following penalties:\n** 25% Cover: Skill:-1.\n** 50% Cover: Skill:-2.\n** 75% Cover: Skill:-3.\n** 100% Cover: Skill:-4.\n* If successful, assign each 25% to whatever is providing cover (this can include fog, smoke, tables, walls, other opponents, allies, etc). Assign each a suit and draw [Shared Conflict]. If an assigned suit is drawn, the Cover is struck first. Resolve below based on the type of Cover.\n** Insubstantial: Resolve damage normally.\n** Item: Damage the item first. If it is destroyed, resolve any remaining damage on the original target.\n** Unit: That unit is the new target. Resolve a new Combat with it instead."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Crits", ":summary", "* Crits are face-up [Damage] cards.\n* 10 [Hits] = 1 Crit"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Damage Guide", ":summary", "* Damage Types: Determine the [Damage Types] of the weapon.\n* Reveal Damage: Reveal cards equal to [Hits].\n* Separate Damage: Separate them into 2 piles: Those that match the [Damage Types] (Damage) and those that don't (Fatigue).\n* Hit Location: The top card from the matching pile is the Hit Location (or the mismatch pile if no matches). Move it aside and flip the Fatigue pile to its facedown side.\n* Armor: Check [Armor] in the [Hit Location] and then the target reduces the Damage or Fatigue for each point of armor. The Hit Location can only be removed last.\n* Fatigue: The target may take the Fatigue cards as long they have Body. Any remaining Fatigue are flipped faceup and added to the Damage pile.\n* Damage: Count the Damage pile and apply the effect on the Hit Location card to the target.\n* Cleanup: Discard other cards. Shuffle if a Wild was revealed."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Disadvantage", ":summary", "* Your [Common] [Block] cards Fail against [Fast]."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Drawn to Destiny",
        ":image",
        "images/rule-drawntodestiny.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Effect", ":summary", "*"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Equip", ":summary", "* [Action]: Drop an item in one or more hands and equip another that is readily available in a holster, sheath, belt OR return an item in hand to a readily available spot.\n* [Action]: Give or receive an item from an adjacent willing unit.\n* [Double Action]: Drop an item in one or more hands and equip another that is in an inconvenient spot like a large bag, backpack, on your back, on another person, etc. OR return an item in hand to an inconvenient spot."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Damaged", ":summary", "* [Body]:-1\n* When using a damaged item or body part take [Skill]:-1/Damaged.\n* An item with no [Body] remaining is [Broken]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Exposure", ":summary", "* Move:-1\n* Event: IF a Unit has shelter < 6 hours/day THEN Exposure:+1 ELSE Exposure:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Features", ":summary", "* Tactical Card, War, Board, Roleplaying Game\n* Supports any genre at any scale\n* Based in physics\n* Everything is a card - Designed to stay compact and modular\n* Simultaneously Play - Max Uptime\n* Agency - Players choose their 'rolls'\n* Detailed Damage / Hit Location\n* Mental and Emotional Trauma\n* Focus on Martial Arts\n* Vast Magic and Superpowers\n* Broad vs Vertical Investment"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Flanking", ":summary", "* Flanks: IF a unit attacks an opponent from anywhere behind THEN [Skill]:+1\n* Blindspot: IF a unit attacks an opponent and is in a straight line directly behind an opponent THEN the opponent has [Disadvantage] for this attack."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Free Action", ":image", "images/rule-freeaction.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Game", ":summary", "* Create [Characters] or [Factions] to play [Scenes].\n* Each [Scene] contains various [Threats] and [Goals].\n* Try to complete them using your [Skills] and [Powers] for [Rewards].\n* Some [Rewards] are items, others are [Skill Point]s or [Ability Point]s that allow you to increase the level of your [Skills], [Powers], [Abilities], or [Specialties].\n* A Game is broken up into Rounds.\n* Each Round every Player takes a Turn.\n* Each Turn each Player takes 2 Actions."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Hit Location",
        ":image",
        "images/rule-hitlocation.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Hit Location: Vehicle",
        ":image",
        "images/rule-hitlocation-vehicle.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "How to Play", ":summary", "* Scene - Choose a Scene to play\n* Setup - Place Decks, Places, and Units according to the Scene\n* Rounds - Multiple Rounds when Players act simultaneously\n* Round Start - \n* Move - \n* Action - \n* Conflict - Combat, Interactions and Skills are decided with opposed cards from the Conflict decks\n* Resolution - After a Conflict the results are decided including Damage\n* Round End - Draw a Card, Recover, and resolve Events\n* Conclusion - Downtime after a Scene include rewards and advancement"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hunger", ":summary", "* Body:-1\n* Event: IF a Unit eats < 4 days/week THEN Hunger:+1 ELSE Hunger:-1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Interact", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Leveling", ":summary", "* Major Achievement: Completion gains a [Skill Point] with level equal to your 2nd highest Skill.\n* Minor Achievement: Completion gains an [Ability Point]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Line of Sight", ":summary", "* Most distance effects require line of sight to the target.\n* Determine Line of Sight: Starting from your location point, use a straight edge to touch every part of the target (in 1 space).\n* If nothing is between you, then you have full line of sight. Resolve normally."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Exploration", ":summary", "* Human Scale\n* Space Size: 1m\n* Turn Length: 2sec\n* Human: Max speed 3x1 = 30kph/18mph. Walk speed = 6kph/3.5mph/1.6mps. 2sec move = ~3 spaces (3.2m).\n* Car: Max speed 2x2 = 200kph/125mph. Slow speed = 40kph/25mph/11mps. 2sec move = ~20 spaces.(22m)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Personal", ":summary", "* Human Scale\n* Space Size: 1m\n* Turn Length: 2sec\n* Human: Max speed 3x1 = 30kph/18mph. Walk speed = 6kph/3.5mph/1.6mps. 2sec move = ~3 spaces (3.2m).\n* Car: Max speed 2x2 = 200kph/125mph. Slow speed = 40kph/25mph/11mps. 2sec move = ~20 spaces.(22m)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Vehicle", ":summary", "* Vehicle Map\n* Space Size: 3m\n* Turn Length: 1sec\n* Note: Car (max speed 2x2 = 200kph/125mph) slow at 40kph/25mph/11mps. 1sec move = 4 spaces (11m)."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mind", ":summary", "* Mind is the measure of a unit's intellect and problem solving ability.\n* A unit with Mind:0 is delirious.\n* It is lossly derived from the IQ-50. E.g. 100IQ = 5x10^1 = 5x1, 140IQ = 9x10^1 = 9x1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mitigation", ":summary", "* Obstacles\n* Cover\n* Shields\n* Armor\n* Toughness\n* Body"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Move", ":summary", "* [Action]: Move straight up to your [Speed] stat.\n* Double Move (2 Actions): Move straight your [Speed]x2.\n* Sprint (2 Actions): If you took a Double Move or Sprint last turn, you may move [Speed]x3 straight this turn.\n* Leftover Speed: After moving, if there is an adjacent space that you cannot afford to enter and you have partial Speed left, you may take note of it and carry it over to subsequent turns.\n* Change Facing: During your Move Action, you may Turn or Drift up to 2 times.\n* Turn: Turn your unit's facing 45 degrees to the left or right.\n* Drift: Instead of moving straight, move diagonally to the left or right while maintaining facing."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Off-handed", ":reference", "I admit it. You are better than I am. Then why are you smiling? Because I know something you don't know...I am not left handed...There's something I ought to tell you...I am not left handed either. - Princess Bride", ":summary", "* [Action]: IF an [Ability] is used in the incorrect hand or using fewer hands than normal THEN [Skill]:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Player"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Poisoned", ":summary", "* Body:-1\n* Event: Reveal Conflict. IF Ace THEN Poisoned:-1. IF 2 THEN Poisoned:+1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Power", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rank", ":summary", "* The number on a card or the first part of a value."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Reach", ":summary", "* Can target one additional dot away [Scaled]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Recover", ":summary", "* Action: Discard a [Fatigue], [Stun], [Stress], or [Slow]\n* Bind Wounds (2 Actions): Discard a [Bleeding] from yourself or an adjacent unit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Reload", ":summary", "* [Double Action]: Change a clip, nock an arrow.\n* 4 Actions: Reload a revolver, a mortar, a machinegun or a crossbow."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Round",
        ":image",
        "images/rule-round.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Actions"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: End"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Groups"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Moves"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Start"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Targets"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rule"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scale", ":summary", "* Each stat/skill/power has a number after the letter 'x'.\n* This is the scale of that ability.\n* The number represents the number of zeroes. E.g. 5x3 translates to 5000.\n* x1 denotes human scale. E.g. 1x1=10kg, 10iq+50, 10will, 10kph"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scaled", ":summary", "* Scaled refers to the comparison between the Scale of a stat/ability/map to another.\n* If the scales are the same, no change is required.\n* If the scales are different, multiple or divide the Level by 10 for each difference in scale.\n* E.g. On an x1 map a Speed:3x2 would move 30 spaces instead of 3."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Search", ":summary", "* [Double Action]: Test [Investigate] vs. [Conflict] to search the [Place] you occupy. If you succeed, you may find something."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scattershot", ":titles", "Glaser, Shot", ":summary", "* [Conflict]: 2 random Units adjacent to the Target are also attacked.\n* [Hit Location]: IF multiple valid Hit Locations are revealed THEN separate them into separate Hit Locations. Crits are only applied to the primary location."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Setup", ":summary", "* Choose a scene and sort it in numerical order.\n* Each [Player] chooses or creates the [Units] they will use.\n* Each [Player] chooses a colored Starter Deck.\n* Place each Unit card on the Status Bar with a Unit# card about it.\n* Reveal the top card in the scene deck and follow its instructions."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skill Point", ":summary", "* [Major Achievement]: Gain a Skill Point equal to your 2nd highest Skill level. You may also reduce 1 of your existing Skill levels by 1 to gain a Skill Point equal to the reduced level.\n* A Skill Point may be spent on a [Skill] of equal level to raise that skill by 1.\n* Skill Points may be saved.\n* A Skill Point may be exchanged for 2 Skill Points of 1 lesser level.\n* 2 Skill Points of equal level may be exchanged for 1 Skill Point of 1 higher level."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Space"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Shadow", ":summary", "* The Shadow\n* Shadow Triumphant: The Shadow is now in control of this unit. Set Conscience = Will; set Will = Shadow stat; and set Shadow=blank"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skill", ":summary", "* Action: Assign your Unit's Target card to the target.\n* Stat: The Skill test has a target Stat.\n* Resolve: Resolve the Skill as if it was Combat.\n* Damage: Any stat reductions are added to the Skill card instead of the target.\n* Success: If the stat is reduced to 0, the Skill succeeds.\n* Fail: If the user abandons the test or has any stat reduced to 0, the Skill fails and the Skill card is returned losing all reductions.\n* Simple: Some Tests only require a single success or failure.\n* Extended: The user may continue this test on different turns until a Success or Fail.\n* See Also: [Unskilled] [Unfamiliar Item]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Sleep Deprived", ":summary", "* Mind:-1\n* Event: IF a Unit sleeps < 6 hours/day THEN Sleep Deprived:+1 ELSE Sleep Deprived:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Speed", ":summary", "* Special: IF Speed over 5 THEN penalty is Speed:-2."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surprise", ":summary", "* IF a unit suddenly appears adjacent or upon a unit.\n* THEN\n** Lose half of starting [Move].\n** Reveal [Conflict]. Unit takes temporary damage based on the [Suit].\n** [Wands] = [Fatigue]\n** [Coins] = [Stun]\n** [Cups] = [Stress]\n** [Swords] = [Slow]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surrounded", ":summary", "* IF a unit is adjacent to more than 1 opponent THEN all [Skill]:-1 for each additional opponent."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Task", ":summary", "* Tasks are skill test that may take multiple Actions to perform.\n* Place Task Tokens on the upper part of this card and Progress Tokens on the bottom of this card each equal to the [Difficulty].\n* [Success]: Task:-1 for each [Effect]\n* [Fail]: Progress:-1 for each [Effect]\n* [Clock]: Progress:-1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Team"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Terminology", ":summary", "* Value - A Value has Level and Scale\n-- Level - # normally used\n-- Scale - # of zeroes after Level\n* Scene - An short scenario\n* Place - A map or location\n* Unit - A person, creature or vehicle\n* Item - A thing to interact with\n* Skill - A capability a Unit has learned\n* Power - A superhuman Skill\n* Ability - A specific ability / feat\n* Specialty - A style or focus area"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Thirst", ":summary", "* Mind:-1\n* Event: IF a Unit drinks < 1 liter/day THEN Thirst:+1 ELSE Thirst:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unfamiliar Item", ":summary", "* If a unit attempts to use an Item that is not on its character sheet, they may usually attempt it at [Skill]:-2 and [Disadvantage]. Note: This is cumulative with [Unskilled]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unit"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unit #", ":summary", "* Place this card above a Unit.\n* [Damage] and [Target] cards are placed near this card.\n\n\n* [Action Cost]:[Speed]/2 round down\n\n\n* [Move]:[Speed]\n\n\n* [Turn]:2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unskilled", ":summary", "* If a unit lacks a Skill needed, but wants to perform it anyway, they may usually attempt it at Initiative:-2 and [Disadvantage]. Note: This is cumulative with [Unfamiliar Item]."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weather: Clouds",
        ":image",
        "images/cards/rule-weather-clouds.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Downpour"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weather: Humidity",
        ":image",
        "images/cards/rule-weather-humidity.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Hurricane"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Rain", ":summary", "* Dew\n* Dizzle\n* Rain\n* Downpour"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Snow", ":summary", "* Sleet\n* Snowy\n* Snowstorm\n* Blizzard"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weather: Temperature",
        ":image",
        "images/cards/rule-weather-temperature.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Tornado"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather: Thunderstorm", ":image", "images/cards/rule-weather-thunderstorm.svg", ":summary", "* Conditions: Stormy Humid+ Windy+\n* [Event]: Every 6 hours, [Reveal Fate].\n** IF a Black Wild THEN a nearby lightning strike\n** IF a Red Wild THEN a direct lightning strike\n** Effects - A lightning bolt holds 5 GigaJoules or 5x9 damage for a direct strike, but most lightning strikes go through smaller feelers or are splashes. Even a direct strike is survivable because it usually travels across the surface of the skin instead of through the body."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weather: Wind",
        ":image",
        "images/cards/rule-weather-wind.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Will", ":reference", "* R:Your father failed to act. B:The man had a gun. R:Would that stop you? B:I've had training. R:The training is nothing! Will is everything! The will to act. - Bruce Wayne and Ra's al Ghul, Batman Begins", ":summary", "* Will is the measure of a unit's grit, determination and psychological stability.\n* A unit with Will:0 is panicked.\n* It is lossly derived from an average person having a 100 score. E.g. 100 = 5x10^1 = 5x1, 140 = 9x10^1 = 9x1")
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
      "deck-rules": nx_tactics_decks_rule.e_deck_rules,
      "rulemap-tactics": nx_tactics_decks_rule.e_rulemap_tactics,
      "tactics-rulemap<-tactics": nx_tactics_decks_rule.e_tactics_rulemap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
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
