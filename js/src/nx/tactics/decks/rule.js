'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_type from "../../../vx/type.js"


export default class nx_tactics_decks_rule {

  /**
   * @function card_action_fight
   * @return {card}
   */
  static t_card_action_fight = {
    vx_type: vx_core.t_type
  }
  static e_card_action_fight = {
    vx_type: nx_tactics_decks_rule.t_card_action_fight
  }

  // (func card-action-fight)
  static f_card_action_fight() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "action-fight",
      ":name",
      "Fight Action",
      ":summary",
      "* Target a unit with a damaging Skill/Power.\n* Each player chooses a Fate card from their hand or a random Fate from Shared Fate.\n* Fate Cards are compared like Rock/Paper/Scissors.\n* Fight Speed: Defend/Evade/Counter > Attack > Focus > Defend/Evade/Counter\n* If both play Attack or Focus then compare by rank (lower is faster).\n* Order: AJQK2-10\n* If Tied, there is no result.\n* If one player Wins, then resolve their result and apply Damage. If the target wins, they do no Damage unless they spend an Action.\n* Discard all card used (except Keep)"
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
    vx_type: nx_tactics_decks_rule.t_card_action_move
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
      "* Action: Move straight up to your [Move] stat.\n* Double Move (2 Actions): Move straight your [Move]x2.\n* Sprint (2 Actions): If you took a Double Move or Sprint last turn, you may [Move]x3 straight this turn.\n* Leftover Move: After moving, if there is an adjacent space that you cannot afford to enter and you have partial Move left, you may take note of it and carry it over to subsequent turns.\n* Change Facing: During your Move Action, you may Turn or Drift up to 2 times.\n* Turn: Turn your unit's facing 45 degrees to the left or right.\n* Drift: Instead of moving straight, move diagonally to the left or right while maintaining facing."
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
    vx_type: nx_tactics_decks_rule.t_card_action_recover
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
    vx_type: nx_tactics_decks_rule.t_card_action_skill
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
      "* Action: Assign your Unit's Skill card to the target.\n* Stat: The Skill test has a target Body, Mind, Will, or Move.\n* Resolve: Resolve the Skill as if it was Combat.\n* Damage: Any stat reductions are added to the Skill card instead of the target.\n* Success: If the stat is reduced to 0, the Skill succeeds.\n* Fail: If the user abandons the test or has any stat reduced to 0, the Skill fails and the Skill card is returned losing all reductions.\n* Extended: The user may continue this test on different turns until a Success or Fail."
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
    vx_type: nx_tactics_decks_rule.t_card_areaeffect
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
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "beast",
      ":name",
      "Beast",
      ":summary",
      "* The Beast\n* Beast Unleashed: The Beast is now in control of this unit. Set Conscience = Will; set Will = Beast stat; and set Beast=blank"
    )
    return output
  }

  /**
   * @function card_characters
   * @return {card}
   */
  static t_card_characters = {
    vx_type: vx_core.t_type
  }
  static e_card_characters = {
    vx_type: nx_tactics_decks_rule.t_card_characters
  }

  // (func card-characters)
  static f_card_characters() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "characters",
      ":name",
      "Characters"
    )
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
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "conscience",
      ":name",
      "Conscience",
      ":summary",
      "* Conscience"
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
    vx_type: nx_tactics_decks_rule.t_card_damageguide
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
   * @function card_defenselayers
   * @return {card}
   */
  static t_card_defenselayers = {
    vx_type: vx_core.t_type
  }
  static e_card_defenselayers = {
    vx_type: nx_tactics_decks_rule.t_card_defenselayers
  }

  // (func card-defenselayers)
  static f_card_defenselayers() {
    let output = nx_tactics_base.e_card
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "defenselayers",
      ":name",
      "Defense Layers",
      ":summary",
      "* Obstacles\n* Shields\n* Armor\n* Toughness\n* Body"
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
    vx_type: nx_tactics_decks_rule.t_card_free_action
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
      "* Free Actions are like normal actions but do not use any of your 2 Actions each turn.\n* Move Out: Take a [Fatigue] to [Move]:1. You may Turn or Drift once during this Move.\n* Push Your Luck: Take a [Stun] to reduce a Double Action to an Action.\n* Grit Your Teeth: Take a [Stress] to ignore the effect of all of your negative statuses this turn.\n* Final Sprint: Take a [Slow] to [Move].\n* Opportunity Combat: If a Target moves from one adjacent space of a Unit to another, that Unit may take a [Stun] to take a free [Combat Action]."
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
    vx_type: nx_tactics_decks_rule.t_card_gameguide
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
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "leveling",
      ":name",
      "Leveling",
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
    vx_type: nx_tactics_decks_rule.t_card_lineofsight
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
    vx_type: nx_tactics_decks_rule.t_card_mapscale_1
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
    vx_type: nx_tactics_decks_rule.t_card_mapscale_2
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
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "card-move",
      ":name",
      "Move",
      ":summary",
      "* Special*: Each Move penalty is -25% rounded up. Simplified using the following chart starting from the original Move stat:\n10-8-5-3-0\n9-7-5-3-0\n8-6-4-2-0\n7-6-4-2-0\n6-5-3-2-0\n5-4-3-2-0\n4-3-2-1-0\n3-3-2-1-0\n2-2-1-1-0\n1-1-1-1-0"
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
    vx_type: nx_tactics_decks_rule.t_card_reach
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
    vx_type: nx_tactics_decks_rule.t_card_scale
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
    vx_type: nx_tactics_decks_rule.t_card_scaled
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
    vx_type: nx_tactics_decks_rule.t_card_setupguide
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
      "* Choose a Scenario and sort it in numerical order.\n* Each [Player] chooses or creates the [Units] they will use.\n* Each [Player] chooses a colored Starter Deck.\n* All Player [Initiative] cards are shuffled together to create an [Initiative] deck.\n* Reveal the top card in the Scenario deck and follow its instructions."
    )
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
    output = vx_core.f_new(
      nx_tactics_base.t_card,
      ":id",
      "shadow",
      ":name",
      "Shadow",
      ":summary",
      "* The Shadow\n* Shadow Triumphant: The Shadow is now in control of this unit. Set Conscience = Will; set Will = Shadow stat; and set Shadow=blank"
    )
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
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const cardlist = vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_rule.f_card_gameguide(),
          nx_tactics_decks_rule.f_card_setupguide(),
          nx_tactics_decks_rule.f_card_action_move(),
          nx_tactics_decks_rule.f_card_action_fight(),
          nx_tactics_decks_rule.f_card_action_skill(),
          nx_tactics_decks_rule.f_card_action_recover(),
          nx_tactics_decks_rule.f_card_free_action(),
          nx_tactics_decks_rule.f_card_lineofsight(),
          nx_tactics_decks_rule.f_card_damageguide(),
          nx_tactics_decks_rule.f_card_defenselayers(),
          nx_tactics_decks_rule.f_card_characters(),
          nx_tactics_decks_rule.f_card_move(),
          nx_tactics_decks_rule.f_card_beast(),
          nx_tactics_decks_rule.f_card_shadow(),
          nx_tactics_decks_rule.f_card_conscience(),
          nx_tactics_decks_rule.f_card_leveling(),
          nx_tactics_decks_rule.f_card_scale(),
          nx_tactics_decks_rule.f_card_scaled(),
          nx_tactics_decks_rule.f_card_mapscale_1(),
          nx_tactics_decks_rule.f_card_mapscale_2(),
          nx_tactics_decks_rule.f_card_areaeffect(),
          nx_tactics_decks_rule.f_card_reach()
        )
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(cardlist)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":id",
          "deckrules",
          ":name",
          "Rules",
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
      "card-action-fight": nx_tactics_decks_rule.e_card_action_fight,
      "card-action-move": nx_tactics_decks_rule.e_card_action_move,
      "card-action-recover": nx_tactics_decks_rule.e_card_action_recover,
      "card-action-skill": nx_tactics_decks_rule.e_card_action_skill,
      "card-areaeffect": nx_tactics_decks_rule.e_card_areaeffect,
      "card-beast": nx_tactics_decks_rule.e_card_beast,
      "card-characters": nx_tactics_decks_rule.e_card_characters,
      "card-conscience": nx_tactics_decks_rule.e_card_conscience,
      "card-damageguide": nx_tactics_decks_rule.e_card_damageguide,
      "card-defenselayers": nx_tactics_decks_rule.e_card_defenselayers,
      "card-free-action": nx_tactics_decks_rule.e_card_free_action,
      "card-gameguide": nx_tactics_decks_rule.e_card_gameguide,
      "card-leveling": nx_tactics_decks_rule.e_card_leveling,
      "card-lineofsight": nx_tactics_decks_rule.e_card_lineofsight,
      "card-mapscale-1": nx_tactics_decks_rule.e_card_mapscale_1,
      "card-mapscale-2": nx_tactics_decks_rule.e_card_mapscale_2,
      "card-move": nx_tactics_decks_rule.e_card_move,
      "card-reach": nx_tactics_decks_rule.e_card_reach,
      "card-scale": nx_tactics_decks_rule.e_card_scale,
      "card-scaled": nx_tactics_decks_rule.e_card_scaled,
      "card-setupguide": nx_tactics_decks_rule.e_card_setupguide,
      "card-shadow": nx_tactics_decks_rule.e_card_shadow,
      "deck-rules": nx_tactics_decks_rule.e_deck_rules
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "card-action-fight": nx_tactics_decks_rule.t_card_action_fight,
      "card-action-move": nx_tactics_decks_rule.t_card_action_move,
      "card-action-recover": nx_tactics_decks_rule.t_card_action_recover,
      "card-action-skill": nx_tactics_decks_rule.t_card_action_skill,
      "card-areaeffect": nx_tactics_decks_rule.t_card_areaeffect,
      "card-beast": nx_tactics_decks_rule.t_card_beast,
      "card-characters": nx_tactics_decks_rule.t_card_characters,
      "card-conscience": nx_tactics_decks_rule.t_card_conscience,
      "card-damageguide": nx_tactics_decks_rule.t_card_damageguide,
      "card-defenselayers": nx_tactics_decks_rule.t_card_defenselayers,
      "card-free-action": nx_tactics_decks_rule.t_card_free_action,
      "card-gameguide": nx_tactics_decks_rule.t_card_gameguide,
      "card-leveling": nx_tactics_decks_rule.t_card_leveling,
      "card-lineofsight": nx_tactics_decks_rule.t_card_lineofsight,
      "card-mapscale-1": nx_tactics_decks_rule.t_card_mapscale_1,
      "card-mapscale-2": nx_tactics_decks_rule.t_card_mapscale_2,
      "card-move": nx_tactics_decks_rule.t_card_move,
      "card-reach": nx_tactics_decks_rule.t_card_reach,
      "card-scale": nx_tactics_decks_rule.t_card_scale,
      "card-scaled": nx_tactics_decks_rule.t_card_scaled,
      "card-setupguide": nx_tactics_decks_rule.t_card_setupguide,
      "card-shadow": nx_tactics_decks_rule.t_card_shadow,
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

    // (func card-action-fight)
    nx_tactics_decks_rule.t_card_action_fight['vx_value'] = {
      name          : "card-action-fight",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_action_fight
    }

    // (func card-action-move)
    nx_tactics_decks_rule.t_card_action_move['vx_value'] = {
      name          : "card-action-move",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_action_move
    }

    // (func card-action-recover)
    nx_tactics_decks_rule.t_card_action_recover['vx_value'] = {
      name          : "card-action-recover",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_action_recover
    }

    // (func card-action-skill)
    nx_tactics_decks_rule.t_card_action_skill['vx_value'] = {
      name          : "card-action-skill",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_action_skill
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
      traits        : [],
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_rule.f_card_beast
    }

    // (func card-characters)
    nx_tactics_decks_rule.t_card_characters['vx_value'] = {
      name          : "card-characters",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_characters
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_rule.f_card_conscience
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_rule.f_card_damageguide
    }

    // (func card-defenselayers)
    nx_tactics_decks_rule.t_card_defenselayers['vx_value'] = {
      name          : "card-defenselayers",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_defenselayers
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_rule.f_card_free_action
    }

    // (func card-gameguide)
    nx_tactics_decks_rule.t_card_gameguide['vx_value'] = {
      name          : "card-gameguide",
      pkgname       : "nx/tactics/decks/rule",
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
      fn            : nx_tactics_decks_rule.f_card_gameguide
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
      traits        : [],
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
      traits        : [],
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
      traits        : [],
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_rule.f_card_mapscale_2
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
      traits        : [],
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_rule.f_card_reach
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
      traits        : [],
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_rule.f_card_scaled
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
      traits        : [],
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_rule.f_card_shadow
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
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_rule.f_deck_rules
    }

  }
}
