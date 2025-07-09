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
            nx_tactics_base.f_rulelist_from_tactics_keys(tactics, "Drawn to Destiny", "Disclaimer", "How to Play", "Description", "Features", "Golden Rules", "Terms", "Unit: Sample", "Unit: Guide", "Item: Sample", "Item: Guide", "Stat", "How to Play", "Setup", "Setup: Players", "Scene", "Scene: Map#1", "Scene: Map#2", "Scene: Minis", "Scene: Units", "Scene: Events", "Round: Start", "Move", "Movement", "Action", "Action: Free", "Action: Interact", "Arc", "Range", "Line of Sight", "Conflict", "Conflict: Chart", "Conflict: Sample", "Hits", "Hits: Sample", "Crits", "Crits: Rating", "Crits: Damage", "Crits: Types", "Crits: Person", "Crits: Vehicle", "Resolution", "Round: End", "Conclusion", "Advancement")
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
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Ability"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Ability Point", ":summary", "* [Minor Achievment]: Gain an Ability Point. You may also convert 1 of your existing Abilities into an Ability Point.\n* An Ability Point may be exchanged for an Ability, Specialty, or a Power Rating increase.\n* Ability Points may be saved."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Action",
        ":image",
        "images/rule-action.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Action: Interact",
        ":image",
        "images/rule-action-interact.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Action: Free",
        ":image",
        "images/rule-action-free.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Advancement",
        ":image",
        "images/rule-advancement.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Advantage", ":summary", "* [Reveal]: IF both play the same [Suit] THEN you may flip to the other [Approach]\n* IF you have Advantage and rival has [Disadvantage] and both play the same Color THEN you may flip to the other [Approach]"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Arc",
        ":image",
        "images/rule-arc.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Area Effect", ":image", "images/card-areaeffect.svg", ":summary", "* Powers can attack in an area.\n* Level:-1 or Rating:-1 to get an Area Effect. Extra reductions double the cards.\n* Arrange cards into a shape starting from the unit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Beast", ":summary", "* The Beast\n* Beast Unleashed: The Beast is now in control of this unit. Set Conscience = Will; set Will = Beast stat; and set Beast=blank"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Body", ":summary", "* Body is the measure of a unit's mass and durability.\n* A unit with Body:0 is incapacitated.\n* It is derived from the mass in kg. E.g. 300kg = 3x10^2 = 3x2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Broken", ":summary", "* A broken [Item] can only be used as an [Improvised Weapon]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Character", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Item", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Unit", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Vehicle", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Character"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Choking", ":summary", "* This includes any obstruction of airways such as smoke, water, sand, fungus, disease, physical choking, etc. It also includes damage to filters and other aspiration/ventilation systems on machines.\n* Will:-1\n* Event: IF a Unit breathes < 1 minute/2 minutes THEN Choking:+1 ELSE Choking:-1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Clock", ":image", "images/rule-clock.svg", ":summary", "Represents the current Clock time.\n* Scene Start: Order with Clock#1 on top or bottom based on [Scene]\n* Round End: Discard the top Clock\n** Resolve any revealed [Event]\n** IF no Clocks THEN resolve according to the [Scene]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Combat", ":summary", "* Target a unit with a damaging Skill/Power.\n* Each player chooses a Conflict card from their hand or a random card from Shared Conflict.\n* Conflict Cards are compared like Rock/Paper/Scissors.\n* Fight Speed: Block/Counter > Fast > Evade > Strong > Block/Counter\n* If both play Fast or Strong then compare by Rank (lower is faster).\n* Order: AJQK2-10\n* If Tied, there is no result.\n* If one player Wins, then resolve their result and apply Damage. If the target wins, they do no Damage unless they spend an Action.\n* Discard used cards (except Keep)"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conclusion",
        ":image",
        "images/rule-conclusion.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict",
        ":image",
        "images/rule-conflict.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "*Conflict: Approach",
        ":image",
        "images/rule-conflict-approach.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "*Conflict: Compare",
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
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "*Conflict: Clash", ":summary", "A Clash occurs when two [Fast] or two [Strong] face each other.\n* A - Win: any\n* J - Win: 2-10, Q, K\n* Q - Win: 2-10, K\n* K - Win: 2-10\n* 2-10 - Lower number Wins (after modifiers)\n** Reduce Higher Skill's Rank by Higher Skill - Lower Skill (min 1)\n** Compare Ranks. Lower Rank Wins.\n** IF Still Tied THEN Both Win."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict: Sample",
        ":image",
        "images/rule-conflict-sample.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "*Conflict: Rank",
        ":image",
        "images/rule-conflict-rank.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "*Conflict: Suit", ":summary", "Each Suit represents a Stat and has 2 Approaches to choose from:\n* Wands - Body. Strong and Block\n* Coins - Mind. Strong and Counter\n* Cups - Will. Fast and Block\n* Swords - Speed. Fast and Evade\nNote: Suit generally doesn't matter, but it may trigger Abilities."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conscience", ":summary", "* Conscience"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cover", ":summary", "* Cover makes it harder to hit a target and can absorb damage if struck. Opponents and Allies can provide cover too. Even smoke provides Cover.\n* If something is between you and your opponent, guess at the amount of Cover provided and resolve with the following penalties:\n** 25% Cover: Skill:-1.\n** 50% Cover: Skill:-2.\n** 75% Cover: Skill:-3.\n** 100% Cover: Skill:-4.\n* If successful, assign each 25% to whatever is providing cover (this can include fog, smoke, tables, walls, other opponents, allies, etc). Assign each a suit and draw [Shared Conflict]. If an assigned suit is drawn, the Cover is struck first. Resolve below based on the type of Cover.\n** Insubstantial: Resolve damage normally.\n** Item: Damage the item first. If it is destroyed, resolve any remaining damage on the original target.\n** Unit: That unit is the new target. Resolve a new Combat with it instead."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Crits",
        ":image",
        "images/rule-crits.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Crits: Damage",
        ":image",
        "images/rule-crits-damage.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Crits: Person",
        ":image",
        "images/rule-crits-person.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Crits: Rating",
        ":image",
        "images/rule-crits-rating.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Crits: Types",
        ":image",
        "images/rule-crits-types.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Crits: Vehicle",
        ":image",
        "images/rule-crits-vehicle.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Description",
        ":image",
        "images/rule-description.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Disadvantage", ":summary", "* [Reveal]: IF both play the same [Suit] THEN your Rival may rotate yours to the opposite [Approach]"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Disclaimer",
        ":image",
        "images/rule-disclaimer.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Drawn to Destiny",
        ":image",
        "images/rule-drawntodestiny.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Damaged", ":summary", "* [Body]:-1\n* When using a damaged item or body part take [Skill]:-1/Damaged.\n* An item with no [Body] remaining is [Broken]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Erosion: Mental", ":summary", "* A gradual loss of memory."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Erosion: Physical", ":summary", "* A gradual whithering of physical abilities."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Erosion: Spiritual", ":summary", "* A gradual loss of personality and individualality."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Exposure", ":summary", "* Move:-1\n* Event: IF a Unit has shelter < 6 hours/day THEN Exposure:+1 ELSE Exposure:-1."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Features",
        ":image",
        "images/rule-features.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Flanking",
        ":image",
        "images/rule-flanking.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Golden Rules",
        ":image",
        "images/rule-goldenrules.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Hits",
        ":image",
        "images/rule-hits.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Hits: Sample",
        ":image",
        "images/rule-hits-sample.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "How to Play",
        ":image",
        "images/rule-howtoplay.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hunger", ":summary", "* Body:-1\n* Event: IF a Unit eats < 4 days/week THEN Hunger:+1 ELSE Hunger:-1"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Item: Guide",
        ":image",
        "images/rule-item-guide.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Item: Sample",
        ":image",
        "images/rule-item-sample.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Leveling", ":summary", "* Major Achievement: Completion gains a [Skill Point] with level equal to your 2nd highest Skill.\n* Minor Achievement: Completion gains an [Ability Point]."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Line of Sight",
        ":image",
        "images/rule-lineofsight.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Exploration", ":summary", "* Human Scale\n* Space Size: 1m\n* Turn Length: 2sec\n* Human: Max speed 3x1 = 30kph/18mph. Walk speed = 6kph/3.5mph/1.6mps. 2sec move = ~3 spaces (3.2m).\n* Car: Max speed 2x2 = 200kph/125mph. Slow speed = 40kph/25mph/11mps. 2sec move = ~20 spaces.(22m)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Personal", ":summary", "* Human Scale\n* Space Size: 1m\n* Turn Length: 2sec\n* Human: Max speed 3x1 = 30kph/18mph. Walk speed = 6kph/3.5mph/1.6mps. 2sec move = ~3 spaces (3.2m).\n* Car: Max speed 2x2 = 200kph/125mph. Slow speed = 40kph/25mph/11mps. 2sec move = ~20 spaces.(22m)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Vehicle", ":summary", "* Vehicle Map\n* Space Size: 3m\n* Turn Length: 1sec\n* Note: Car (max speed 2x2 = 200kph/125mph) slow at 40kph/25mph/11mps. 1sec move = 4 spaces (11m)."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mind", ":summary", "* Mind is the measure of a unit's intellect and problem solving ability.\n* A unit with Mind:0 is delirious.\n* It is lossly derived from the IQ-50. E.g. 100IQ = 5x10^1 = 5x1, 140IQ = 9x10^1 = 9x1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mitigation", ":summary", "* Obstacles\n* Cover\n* Shields\n* Armor\n* Toughness\n* Body"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Move",
        ":image",
        "images/rule-move.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Movement",
        ":image",
        "images/rule-movement.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Off-handed", ":reference", "I admit it. You are better than I am. Then why are you smiling? Because I know something you don't know...I am not left handed...There's something I ought to tell you...I am not left handed either. - Princess Bride", ":summary", "* [Action]: IF an [Ability] is used in the incorrect hand or using fewer hands than normal THEN [Skill]:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Place"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Player", ":summary", "* [Setup]: Gather your Units and assign a [Unit#] card to each. Arrange each Unit's equipped items like a paper doll.\n* [Round End]: [Draw]:1 and [Recover]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Poisoned", ":summary", "* Body:-1\n* Event: Reveal Conflict. IF Ace THEN Poisoned:-1. IF 2 THEN Poisoned:+1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Power"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Range",
        ":image",
        "images/rule-range.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rank", ":summary", "* The number on a card or the part of a Value before the x."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Reach", ":summary", "* Can target one additional Space away [Scaled]"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Resolution",
        ":image",
        "images/rule-resolution.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Ritual", ":summary", "A magical effect that must be performed during Downtime. It can be a form of magical trap that can be triggered by an event."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role: Attacker", ":summary", "Attacker Units usually do the following:\n* Target weak points in the enemy from lines\n* Move into Range\n* Attack"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role: Blaster", ":summary", "Blaster Units usually do the following:\n* Target groups of enemies\n* Move into Range\n* Attack to maximize enemy losses\n* Move to safety"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role: Defender", ":summary", "Defender Units usually do the following:\n* Target an enemy threatening a nearby vulnerable ally\n* Move into Range protecting the ally\n* Attack"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role: Disrupter", ":summary", "Disrupter Units usually do the following:\n* Target groups of enemies\n* Move into Range\n* Attack to maximize enemy disruption\n* Move to safety"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role: Skirmisher", ":summary", "Skirmisher Units usually do the following:\n* Target the closest enemy\n* Move into Range\n* Attack\n* Move to safety"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role: Sniper", ":summary", "Sniper Units usually do the following:\n* Target a vulnerable or important enemy\n* Move into Range\n* Attack\n* Move to safety"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role: Supporter", ":summary", "Supporter Units usually do the following:\n* Target ally(s) to assist\n* Move into Range\n* Aid the ally(s)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role: Taunter", ":summary", "Taunter Units usually do the following:\n* Target a dangerous enemy\n* Move into Range\n* Attack and attempt to draw attention"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Roles", ":summary", "A Role describes a Unit's loose goals\n* Attacker - Engage enemies\n* Blaster - Reduce enemy numbers\n* Defender - Protect allies\n* Disrupter - Disrupt enemy abilities\n* Skirmisher - Maintain Range and Strike\n* Sniper - Eliminate big threats\n* Supporter - Helps allies\n* Taunter - Draw enemy attention"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rotated Cards", ":summary", "* [Between Games]: Rotate this card 90 degrees and place it on top of all rotated card.\n\n* [Game Start]: Rotate this card 90 degrees with all cards under it and then remove this card to return the rotated cards to their correct orientation."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Round: End",
        ":image",
        "images/rule-round-end.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Round: Start",
        ":image",
        "images/rule-round-start.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rule"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scale", ":summary", "* Each stat/skill/power has a number after the letter 'x'.\n* This is the scale of that ability.\n* The number represents the number of zeroes. E.g. 5x3 translates to 5000.\n* x1 denotes human scale. E.g. 2x1=20kg, 20IQ+50, 20Will, 20kph"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scaled", ":summary", "* Scaled refers to the comparison between the Scale of a stat/ability/map to another.\n* If the scales are the same, no change is required.\n* If the scales are different, multiple or divide the Level by 10 for each difference in scale.\n* E.g. On an x1 map a Speed:3x2 would move 30 spaces instead of 3."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Scene",
        ":image",
        "images/rule-scene.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Scene: Events",
        ":image",
        "images/rule-scene-events.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Scene: Minis",
        ":image",
        "images/rule-scene-minis.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Scene: Map#1",
        ":image",
        "images/rule-scene-map-1.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Scene: Map#2",
        ":image",
        "images/rule-scene-map-2.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Scene: Units",
        ":image",
        "images/rule-scene-units.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Setup",
        ":image",
        "images/rule-setup.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Setup: Players",
        ":image",
        "images/rule-setup-players.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skill"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skill Point", ":summary", "* [Major Achievement]: Gain a Skill Point equal to your 2nd highest Skill level. You may also reduce 1 of your existing Skill levels by 1 to gain a Skill Point equal to the reduced level.\n* A Skill Point may be spent on a [Skill] of equal level to raise that skill by 1.\n* Skill Points may be saved.\n* A Skill Point may be exchanged for 2 Skill Points of 1 lesser level.\n* 2 Skill Points of equal level may be exchanged for 1 Skill Point of 1 higher level."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Space", ":summary", "A point on the map"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Space: Inner"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Space: Outer"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Specialty", ":summary", "A field of specialization\n* Setup - When you prepare Abilities, for each Specialty you may prepare an additional Ability under the Specialty\n* Advancement - When you gain an Ability under a Specialty, you may gain another one for free"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Shadow", ":titles", "Darkness, Darkside, Pedophile, Sadist, Serial Killer, Sociopath, Yin", ":reference", "* Hello darkness, my old friend. I've come to talk to you again. - Simon and Garfunkle, Sound of Silence\n* Anyone who fights with monsters should take care that he does not in the process become a monster. And if you gaze for long into an abyss, the abyss gazes also into you. - Friedrich Nietzsche, Beyond Good and Evil\n* Hannibal Lecter\n* Even if I wanted to go, my schedule wouldn't allow it. 4:00, wallow in self pity; 4:30, stare into the abyss; 5:00, solve world hunger, tell no one; 5:30, jazzercize; 6:30, dinner with me - I can't cancel that again; 7:00, wrestle with my self-loathing... I'm booked. Of course, if I bump the loathing to 9, I could still be done in time to lay in bed, stare at the ceiling and slip slowly into madness. But what would I wear? - Grinch, The Gringe Who Stole Christmas\n* If once you start down the dark path, forever will it dominate your destiny - Yoda, Star Wars: The Empire Strikes Back\n* A farmer comes home one day to find ... everything that he loved, taken from him. His children. One can only 	imagine the pit of despair, the hours of Job-like lamentations, the burden of existence. He makes a promise to 	himself in those dark hours. A life's work erupts from his knotted mind... Years go by... The farmer, who is no longer a farmer, sees the wreckage that he has left in his wake. It is now he who burns. It is he who slaughters, ... and he knows in his heart, he must pay. - Red Reddington, The Blacklist\n* No one escapes their shadow. - Zed, Runeterra\n* When I find out someone murdered an innocent person, or sold somebody heroin, or did some graffiti, and I kill that person with my bare hands, their eyeballs popping out of their skulls... You think THAT gives ME pleasure?... Well, it does!... What separates us from the other killers, is we only kill bad people. Usually... Unless there's a mistake. Now, do I sound like a fucking maniac? - Vigilante, Peacemaker", ":summary", "* Lurking Shadow - The Shadow is a devious, sociopathic, latent personality. It is normally powerless, surpressed by the [Will] in civilized men. It can, however, gain power and even dominance in those with weak wills or those who cultivate it such as from [Corruption], [Darkness], [Fleshcraft], [Intimidation], or [Necromancy].\n* Cruel and Unusual - The Shadow silently observes all that the person experiences. It has nothing but contempt for others as well as the [Will] that keeps it contained. As the manifestation of the unit's dark dreams, twisted desires, and bizarre megalomania, the Shadow reinforces its own superiority by exerting power over others. Manipulating, dominating, and causing physical or emotional pain is a siren's call that the Shadow cannot\nrefuse.\n* Consumed by Shadow - Whenever a unit's [Will] is lowered to 0 or below its Shadow rating, test Shadow vs. [Will]. If the Shadow wins, it gains control of the unit until [Will] exceeds Shadow again (if ever). Set Conscience = Will; set Will = Shadow stat; and set Shadow=blank.\n* Rising Shadow - While the Shadow is dominant, the person always uses its Shadow rating instead of [Will]. The Shadow will always act toward its, usually immediate, self interest. It will usually not aid its allies in any way. Because the Shadow is self absorbed, all [Retreats] against it are doubled, but failure feeds its insecurities, so retreat is emotionally devastating and can lead to the [Will] taking charge again."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skill", ":summary", "* Action: Assign your Unit's Target card to the target.\n* Difficulty: The Skill test has a target Stat or number.\n* Resolve: Resolve the Skill as if it was Combat.\n* Damage: Any stat reductions are added to the Skill card instead of the target.\n* Success: If the stat is reduced to 0, the Skill succeeds.\n* Fail: If the user abandons the test or has any stat reduced to 0, the Skill fails and the Skill card is returned losing all reductions.\n* Test: Some Tests only require a single success or failure.\n* Extended: The user may continue this test on different turns until a Success or Fail.\n* See Also: [Unskilled] [Unfamiliar Item]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Sleep Deprived", ":summary", "* Mind:-1\n* Event: IF a Unit sleeps < 6 hours/day THEN Sleep Deprived:+1 ELSE Sleep Deprived:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Speed", ":summary", "* Special: IF Speed over 5 THEN penalty is Speed:-2."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Stat",
        ":image",
        "images/rule-stat.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surprise", ":summary", "* IF a unit suddenly appears adjacent or upon a unit.\n* THEN\n** Lose half of starting [Move].\n** Reveal [Conflict]. Unit takes [Light Damage] based on the [Suit].\n** [Wands] = [Fatigue]\n** [Coins] = [Stun]\n** [Cups] = [Stress]\n** [Swords] = [Slow]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surrounded", ":summary", "* IF a unit is adjacent to more than 1 opponent THEN all [Skill]:-1 for each additional opponent."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Target#", ":image", "images/rule-target-num.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Terms",
        ":image",
        "images/rule-terms.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Thirst", ":summary", "* Mind:-1\n* Event: IF a Unit drinks < 1 liter/day THEN Thirst:+1 ELSE Thirst:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unfamiliar Item", ":summary", "* If a unit attempts to use an Item that is not on its character sheet, they may usually attempt it at [Level]:-2 and [Disadvantage]. Note: This is cumulative with [Unskilled]."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Unit: Guide",
        ":image",
        "images/rule-unit-guide.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Unit: Sample",
        ":image",
        "images/rule-unit-sample.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unit#", ":image", "images/rule-unit-num.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unskilled", ":summary", "* If a unit lacks a Skill needed, but wants to perform it anyway, they may usually attempt it at Level:-2 and [Disadvantage]. Note: This is cumulative with [Unfamiliar Item]."),
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
