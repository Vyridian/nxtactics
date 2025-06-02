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
            nx_tactics_base.f_rulelist_from_tactics_keys(tactics, "Drawn to Destiny", "Overview", "Features", "Warning", "Terms", "Stat", "Unit: Sample", "Unit", "Item: Sample", "Item", "How to Play", "Setup: Players", "Setup: Decks", "Setup: Tokens", "Scene: Overview", "Scene: Introduction", "Scene: Map", "Scene: Factions", "Scene: Units", "Scene: Status Bar", "Scene: Rounds", "Scene: Events", "Scene: Conclusion", "Scene: Rewards", "Scene: Advancement", "Scene: Sample", "Round: Overview", "Round: Start", "Round: Targets", "Round: Groups", "Round: Moves", "Round: Actions", "Round: End", "Move: Overview", "Move: Facing", "Move: Moving", "Action: Free", "Action: Equip", "Action: Notice", "Action: Recover", "Action: Search", "Action: Attack", "Action: Interact", "Arc", "Range", "Line of Sight", "Task: Overview", "Task: Test", "Task: Extended", "Task: Damaging", "Conflict: Overview", "Conflict: Suit", "Conflict: Approach", "Conflict: Rank", "Conflict: Reveal", "Conflict: Compare", "Conflict: Chart", "Hits: Overview", "Hits: Combo", "Hits: Rank", "Hits: Item/Weapon", "Damage: Overview", "Damage: Decks", "Damage: Location", "Damage: Location - Vehicle", "Damage: Mitigation", "Damage: Crits", "Character", "Body", "Mind", "Will", "Speed", "Beast", "Shadow", "Conscience", "Leveling", "Skill", "Power", "Ability", "Specialty", "Place", "Scene", "Map: Exploration", "Map: Personal", "Map: Vehicle", "Scale", "Scaled", "Advantage", "Disadvantage", "Area Effect", "Reach", "Flanking", "Surrounded", "Surprise", "Unskilled", "Unfamiliar Item", "Choking", "Hunger", "Thirst", "Exposure", "Weather: Clouds", "Weather: Humidity", "Weather: Temperature", "Weather: Wind", "Build: Unit", "Build: Character", "Build: Item", "Build: Vehicle")
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
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Ability"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Ability Point", ":summary", "* [Minor Achievment]: Gain an Ability Point. You may also convert 1 of your existing Abilities into an Ability Point.\n* An Ability Point may be exchanged for an Ability, Specialty, or a Power Intensity increase.\n* Ability Points may be saved."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action: Attack", ":summary", "Move:-[Action Cost]\nIncludes combat, communication, investigation, flipping switches, opening/closing doors:\n* Interrupt - Pause the Countdown\n* Skill/Power - Choose a Skill or Power\n* Item - Choose an item/weapon. Spend Uses, if any\n* Verify - Verify Target is in Arc, Range, Line of Sight.\n* Target Action - Target must also choose a logical Skill/Power and may spend an Action, IF not they gain no benefits if they Succeed\n* Task - Perform a Task:Damaging\n* Resume - Resume the Countdown"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action: Equip", ":summary", "Move:-1 to do one of the following:\n* Pickup/Put Down an Item\n* Move an Item from one hand to another\n* Move an Item from hands to storage\n* Reload an Item with one shot/clip/quickloader from another hand or a bandolier/quiver.\n* Give or take an Item from a willing Unit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action: Interact", ":summary", "Move:-[Action Cost]\nIncludes combat, communication, investigation, flipping switches, opening/closing doors:\n* Interrupt - Pause the Countdown\n* Skill/Power - Choose a Skill or Power\n* Item - Choose a item. Spend Uses, if any\n* Verify - Verify Target is in Arc, Range, Line of Sight.\n* Target Action - Target must also choose a logical Skill/Power and may spend an Action, IF not they gain no benefits if they Succeed\n* Task - Perform an appropriate Task\n* Resume - Resume the Countdown"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action: Free", ":summary", "Actions without normal Action cost:\n* Skip - Discard Move or Turn tokens.\n* Drop - Drop an item in front of you.\n* Equip - Move:-1 to move/pickup/trade/reload an item\n* Notice - Stun:+1 to attempt to detect hidden things.\n* Push the Limit - Fatigue:+1 to gain Skill:+1 this Round.\n* State of Mind - Stun:+1 to remove Fatigue, Stress, or Slow.\n* Grit Your Teeth - Stress:+1 to ignore Penalties this Round.\n* Burst of Speed - Slow:+1 to Move:+1 AND Turn:+1\n* Heroic Feat - Character Point:-1 to Effect:+1 or -1. (e.g. Damage)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action: Notice", ":summary", "Stun:+1 to attempt to detect hidden things:\n* Sight - IF a Hidden Unit in Range:Mindx2 enters your Arc:Forward [Task: Test] Mind vs Body to notice them.\n* Hearing - IF a Hidden Unit enters Range:Mindx1 THEN [Task: Test] Mind vs Body to notice them."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action: Recover", ":summary", "Move:-[Action Cost]\n* Remove a [Fatigue], [Stun], [Stress], or [Slow]\n\nOR\n\nMove:-[Action Cost]\n* Ready an [Ability] in [Cooldown]\n    \nOR\n\nMove:-[Action Cost]x2\n* Bind Wound - Remove a [Bleeding] from yourself or an adjacent unit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action: Search", ":summary", "Move:-[Action Cost]x2\n    * Test [Investigate] vs [Conflict] to search the [Place] you occupy. IF you Win THEN you find something for each [Effect]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Advantage", ":summary", "* [Reveal]: IF both play the same [Suit] THEN you may flip yours to the other [Approach]."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Arc",
        ":image",
        "images/rule-arc.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Area Effect", ":image", "images/card-areaeffect.svg", ":summary", "* Powers can attack in an area.\n* Skill:-1 or Intensity:-1 to get an Area Effect. Extra reductions double the cards.\n* Arrange cards into a shape starting from the unit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Beast", ":summary", "* The Beast\n* Beast Unleashed: The Beast is now in control of this unit. Set Conscience = Will; set Will = Beast stat; and set Beast=blank"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Body", ":summary", "* Body is the measure of a unit's mass and durability.\n* A unit with Body:0 is incapacitated.\n* It is derived from the mass in kg. E.g. 300kg = 3x10^2 = 3x2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Broken", ":summary", "* A broken [Item] can only be used as an [Improvised Weapon]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Character", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Item", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Unit", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Vehicle", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Character"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Choking", ":summary", "* This includes any obstruction of airways such as smoke, water, sand, fungus, disease, physical choking, etc. It also includes damage to filters and other aspiration/ventilation systems on machines.\n* Will:-1\n* Event: IF a Unit breathes < 1 minute/2 minutes THEN Choking:+1 ELSE Choking:-1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Clock", ":summary", "* Represents the current Clock time.\n* The [scene] determines how many rounds there are and whether they count up or down.\n* scene Start: Stack the cards in order with Round#1 on top or bottom depending on the [scene].\n* Round End: Discard the top Round#.\n** IF one or more [Encounter] cards are revealed THEN resolve them.\n** IF there are no remaining Round# cards THEN the [scene] immediately ends for time."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Combat", ":summary", "* Target a unit with a damaging Skill/Power.\n* Each player chooses a Conflict card from their hand or a random card from Shared Conflict.\n* Conflict Cards are compared like Rock/Paper/Scissors.\n* Fight Speed: Block/Counter > Fast > Evade > Strong > Block/Counter\n* If both play Fast or Strong then compare by Rank (lower is faster).\n* Order: AJQK2-10\n* If Tied, there is no result.\n* If one player Wins, then resolve their result and apply Damage. If the target wins, they do no Damage unless they spend an Action.\n* Discard used cards (except Keep)"),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conflict: Clash", ":summary", "A Clash occurs when two [Fast] or two [Strong] face each other.\n* A - Win: any\n* J - Win: 2-10, Q, K\n* Q - Win: 2-10, K\n* K - Win: 2-10\n* 2-10 - Lower number Wins (after modifiers)\n** Reduce Higher Skill's Rank by Higher Skill - Lower Skill (min 1)\n** Compare Ranks. Lower Rank Wins.\n** IF Still Tied THEN Both Win."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conflict: Overview", ":summary", "Conflict is how tests are resolved (similar to To Hit/Saving Throws). Each card is effectively a pre-rolled die that you choose when to use\n1) Choose - Each Player chooses a card from hand\n2) Reveal - Both are revealed at once\n3) Compare - Compare Approaches to determines who Wins. IF both Fast or both Strong THEN use Rank"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict: Reveal",
        ":image",
        "images/rule-conflict-reveal.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conflict: Resolution", ":summary", "Discard used Conflict cards and resolve one of the following:\nAction - IF the Winner did not spend an Action during this Conflict THEN there is no further resolution.\nEvade - IF the Winner played an Evade THEN they regain the Move spent on the Action.\nTest - The Conflict resolved with one side victorious. Effect determines how much it passed or failed.\nTask\nProgress - IF you Win THEN move Task Tokens (top) to Progress (bottom) equal to the Effect. IF no Task remains then the Task is complete.\nTask - IF you Fail THEN remove Progress Tokens (bottom) equal to the number of your Rival’s Effect. IF no Progress remains then the Task ends in failure.\nFight - Go to Damage.\n"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict: Rank",
        ":image",
        "images/rule-conflict-rank.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conflict: Suit", ":summary", "Each Suit represents a Stat and has 2 Approaches to choose from:\n* Wands - Body. Strong and Block\n* Coins - Mind. Strong and Counter\n* Cups - Will. Fast and Block\n* Swords - Speed. Fast and Evade\nNote: Suit generally doesn't matter, but it may trigger Abilities."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conscience", ":summary", "* Conscience"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cover", ":summary", "* Cover makes it harder to hit a target and can absorb damage if struck. Opponents and Allies can provide cover too. Even smoke provides Cover.\n* If something is between you and your opponent, guess at the amount of Cover provided and resolve with the following penalties:\n** 25% Cover: Skill:-1.\n** 50% Cover: Skill:-2.\n** 75% Cover: Skill:-3.\n** 100% Cover: Skill:-4.\n* If successful, assign each 25% to whatever is providing cover (this can include fog, smoke, tables, walls, other opponents, allies, etc). Assign each a suit and draw [Shared Conflict]. If an assigned suit is drawn, the Cover is struck first. Resolve below based on the type of Cover.\n** Insubstantial: Resolve damage normally.\n** Item: Damage the item first. If it is destroyed, resolve any remaining damage on the original target.\n** Unit: That unit is the new target. Resolve a new Combat with it instead."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Damage: Crits", ":summary", "* Crits are face-up [Damage] cards.\n* 10 [Hits] = 1 Crit"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Damage: Location",
        ":image",
        "images/rule-damage-location.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Damage: Location Vehicle",
        ":image",
        "images/rule-damage-location-vehicle.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Damage: Mitigation", ":summary", "* Shielding - \n* Armor - "),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Damage: Overview", ":summary", "1) Damage Types - Determine the [Damage Types] of the weapon.\n2) Reveal Damage - Reveal cards equal to [Hits].\n3) Separate Damage - Separate them into 2 piles: Those that match the [Damage Types] (Damage) and those that don't (Fatigue).\n4) Hit Location - The top card from the matching pile is the Hit Location (or the mismatch pile if no matches). Move it aside and flip the Fatigue pile to its facedown side.\n5) Armor - Check [Armor] in the [Hit Location] and then the target reduces the Damage or Fatigue for each point of armor. The Hit Location can only be removed last.\n6) Fatigue - The target may take the Fatigue cards as long they have Body. Any remaining Fatigue are flipped faceup and added to the Damage pile.\n7) Damage - Count the Damage pile and apply the effect on the Hit Location card to the target.\n8) Cleanup - Discard other cards. Shuffle if a Wild was revealed."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Disadvantage", ":summary", "* [Reveal]: IF both play the same Suit THEN your Rival may flip yours to the other [Approach]."),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit: Combo", ":summary", "Optional. Winner may discard cards make a Set to increase Effect. Allowed Sets:\n* Royal - QQ, KK, KKK, AA, AAA, AAAA\n* Common - 3+ card Straight. Bonus:Gain any card from Discard for each card over 2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit: Item/Weapon", ":summary", "* Compare item Effect/Damage to Difficulty\n-- IF Level > Difficulty THEN Hits:+1\n-- IF Scale <> Difficulty Scale THEN Hits:+-Scale Difference"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit: Overview", ":summary", "Hits are the degree of success\n* Combo - Optional. Discard cards to increase Hits\n* Rank - Each card may increase Hits\n* Item/Weapon - Item/Weapon may increase Hits"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit: Rank", ":summary", "For each card check Rank:\n* IF 10, J, Q, K, A THEN Hits:+1\n* IF 2-9 AND Rank > Difficulty THEN Hits:+1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Exposure", ":summary", "* Move:-1\n* Event: IF a Unit has shelter < 6 hours/day THEN Exposure:+1 ELSE Exposure:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Features", ":summary", "* Tactical Card, War, Board, Roleplaying Game\n* Supports any genre at any scale\n* Based in physics\n* Everything is a card - Designed to stay compact and modular\n* Simultaneously Play - Max Uptime\n* Agency - Players choose their 'rolls'\n* Detailed Damage / Hit Location\n* Mental and Emotional Trauma\n* Detailed combat including Martial Arts and Grappling\n* Vast Magic and Superpowers\n* Encourage Broad vs Vertical Investment"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Flanking",
        ":image",
        "images/rule-flanking.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Game", ":summary", "* Create [Characters] or [Factions] to play [Scenes].\n* Each [Scene] contains various [Threats] and [Goals].\n* Try to complete them using your [Skills] and [Powers] for [Rewards].\n* Some [Rewards] are items, others are [Skill Point]s or [Ability Point]s that allow you to increase the level of your [Skills], [Powers], [Abilities], or [Specialties].\n* A Game is broken up into Rounds.\n* Each Round every Player takes a Turn.\n* Each Turn each Player takes 2 Actions."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "How to Play", ":summary", "This is an overview of the game steps:\n* Setup - Shuffle Decks. Place Tokens\n* Scene - Layout a Scene to play\n* Rounds - Players act simultaneously\n* Round Start - Place Move Tokens\n* Move - Spend Move to move a Unit\n* Action - Spend 1/2 of starting Move to perform an Action\n* Conflict - Skill Checks use opposed cards from Conflict decks\n* Resolution - The results of a Conflict including Damage\n* Round End - Draw a Card, Recover, and resolve Events\n* Rewards - Gain any rewards\n* Advancement - Improve Abilities\n* Conclusion - Downtime after a Scene"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hunger", ":summary", "* Body:-1\n* Event: IF a Unit eats < 4 days/week THEN Hunger:+1 ELSE Hunger:-1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Item", ":image", "images/rule-item.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Item: Sample", ":image", "images/rule-item-sample.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Leveling", ":summary", "* Major Achievement: Completion gains a [Skill Point] with level equal to your 2nd highest Skill.\n* Minor Achievement: Completion gains an [Ability Point]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Line of Sight", ":summary", "Line of Sight - Most distance effects require line of sight to the target.\n* Use a straight edge from center of your space to center of target space. IF no obstacle THEN Line of Sight\n\nCover - Cover makes it harder to hit and absorbs damage. Opponents, Allies, and even smoke provide Cover\n1) Find the leftmost and rightmost Spaces surrounding the Target\n2) Sweep the edge between these Spaces.\n3) Cover:+25% AND Skill:-1 for each occupied Space"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Exploration", ":summary", "* Human Scale\n* Space Size: 1m\n* Turn Length: 2sec\n* Human: Max speed 3x1 = 30kph/18mph. Walk speed = 6kph/3.5mph/1.6mps. 2sec move = ~3 spaces (3.2m).\n* Car: Max speed 2x2 = 200kph/125mph. Slow speed = 40kph/25mph/11mps. 2sec move = ~20 spaces.(22m)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Personal", ":summary", "* Human Scale\n* Space Size: 1m\n* Turn Length: 2sec\n* Human: Max speed 3x1 = 30kph/18mph. Walk speed = 6kph/3.5mph/1.6mps. 2sec move = ~3 spaces (3.2m).\n* Car: Max speed 2x2 = 200kph/125mph. Slow speed = 40kph/25mph/11mps. 2sec move = ~20 spaces.(22m)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map: Vehicle", ":summary", "* Vehicle Map\n* Space Size: 3m\n* Turn Length: 1sec\n* Note: Car (max speed 2x2 = 200kph/125mph) slow at 40kph/25mph/11mps. 1sec move = 4 spaces (11m)."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mind", ":summary", "* Mind is the measure of a unit's intellect and problem solving ability.\n* A unit with Mind:0 is delirious.\n* It is lossly derived from the IQ-50. E.g. 100IQ = 5x10^1 = 5x1, 140IQ = 9x10^1 = 9x1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mitigation", ":summary", "* Obstacles\n* Cover\n* Shields\n* Armor\n* Toughness\n* Body"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Move: Facing",
        ":image",
        "images/rule-move-facing.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Move: Moving",
        ":image",
        "images/rule-move-moving.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Move: Overview", ":summary", "At the beginning of the Round, each Unit set their [Action Cost] and gained [Move]=]Speed] and [Turn]=2 tokens. Now it may spend them to Move, Turn, or take Actions:\n* Facing - Units must always be facing a compass heading\n* Moving - Move:-1 to move the Unit 1 space. Turn:-1 to turn the Unit 45 degrees.\n* Action - Spend Move equal to [Action Cost] to take an Action. Therefore, 2 Actions per Round are possible."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Off-handed", ":reference", "I admit it. You are better than I am. Then why are you smiling? Because I know something you don't know...I am not left handed...There's something I ought to tell you...I am not left handed either. - Princess Bride", ":summary", "* [Action]: IF an [Ability] is used in the incorrect hand or using fewer hands than normal THEN [Skill]:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Overview", ":summary", "* Drawn to Destiny (D2D) is a free, print-and-play game for tactical mini board/war/role-playing\n* It is Classless and Skill-based with GM optional rules\n* It is a crunchy AND rules-light tabletop game for any genre\n* It is 'batteries-included' with reusable minies, maps, and terrain\n* Magic the Gathering and Arkham Horror TCG are the models for cards as the perfect platform for compact and modular rules\n* Car Wars, Tales from the Red Dragon Inn, and X-Wing minis are the models for tactical movement and powers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Place"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Player"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Poisoned", ":summary", "* Body:-1\n* Event: Reveal Conflict. IF Ace THEN Poisoned:-1. IF 2 THEN Poisoned:+1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Power"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Range", ":summary", "Count the Spaces to the Target to determine Range\n* Close Combat - Range:0 or 1\n* Melee - Range:0 or 1. IF 0 THEN Skill:-1\n* Reach - Range:1 or 2. IF 0 THEN Disadvantage\n* Other - Range:Depends on Item/Skill. IF 0 or 1 THEN Disadvantage"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rank", ":summary", "* The number on a card or the first part of a value."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Reach", ":summary", "* Can target one additional Space away [Scaled]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Actions", ":summary", "Generally, you spend half your starting Move to take an Action. Therefore, up to 2 Actions a Round.\n* Free - Actions with no Move cost\n* Attack - Initiate or react to Combat\n* Interact - Interact with Unit or Item\n* Recover - Remove a Fatigue, Stun, Stress, or Slow OR Ready an Ability in Cooldown\n* Equip - Swap, Reload, Trade Items\n* Search - Search the area"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: End", ":summary", "Any triggered events happen here.\n* Draw - Each Player draws a card\n* Recover - Each Unit may remove a Fatigue, Stun, Stress, or Slow OR Ready an Ability in Cooldown\n* Power Events - Continuous and Area Effect are resolved here.\n* Triggered Events - Any events that triggered during the Round happen here. E.g. If a door was opened, it resolves now.\n* Clock Ticks - Discard the top card of the Clock and resolve any Clock Events.\n* Task Clock - Tasks get Progress:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Groups", ":summary", "Split Units into Groups by Target.\n* Simultaneous - Each group resolves their Round separately then waits until all Groups are finished before doing Events.\n* NPCs - Players in each Group perform the actions of any NPCs in their Group. This should be done in good faith or can use a High Card if an Action is not obvious."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Moves", ":summary", "Each Group will separately count down from 10 with each Unit choosing to Move, take an Action, or Wait. This continues until the count is 0 or no one can act:\n* Wait - Do nothing. Anyone with Move >= Count must discard until below Count.\n* Move - Pay a Move to move a Space\n* Action - Pay the [Action Cost] to take an Action"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Round: Overview",
        ":image",
        "images/rule-round-overview.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Start", ":summary", "Refresh Status Bar - Place tokens on each Unit# card:\n* Action Cost:Speed/2 (rounded down)\n* Move:Speed\n* Turn:2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Round: Targets", ":summary", "Each Round, place Target cards:\n* Choose Targets - Choose a Target (if any) for each Unit and place the Target# card on their target on the Status Bar.\n* Change Targets - Players can change after others reveal. IF in conflict THEN use High Card."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rule"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scale", ":summary", "* Each stat/skill/power has a number after the letter 'x'.\n* This is the scale of that ability.\n* The number represents the number of zeroes. E.g. 5x3 translates to 5000.\n* x1 denotes human scale. E.g. 1x1=10kg, 10iq+50, 10will, 10kph"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scaled", ":summary", "* Scaled refers to the comparison between the Scale of a stat/ability/map to another.\n* If the scales are the same, no change is required.\n* If the scales are different, multiple or divide the Level by 10 for each difference in scale.\n* E.g. On an x1 map a Speed:3x2 would move 30 spaces instead of 3."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Advancement", ":summary", "Skill Points (SP)\n* Respec - Take Skill:-1 on ONE Skill for SP:+(lower Skill level)\n* 2 Week - Train/Research and spend SP:-(current Skill Level) for Skill:+1.\nAbility Points (AP)\n* Respec - Remove 1 Ability for AP:+1\n* 1 Week - Train/Research and AP:-1 for an Ability, Specialty, or Item in a Skill OR Intensity:+0x1 to a Power.\n* Specialty - IF you gain an Ability in your Specialty THEN every third Ability costs 0 AP."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Conclusion", ":summary", "* Epilogue - Read the Epilogue of the Scene.\n* Rewards - Gather and allocate any rewards.\n* Advancement - Players spend Character Points, Skill Points, and Ability Points.\n* Downtime - Players declare intentions before the next Scene.\n* Intentions - Players declare desires for the next Scene."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Events", ":summary", "A Scene may have a number of events that happen over time.\n* Timed Events - May be placed in the Clock Deck to be revealed when that Clock strikes\n* Location Events - May be placed under a location on the Map to be revealed when searched or explored.\n* Fog of War Events - May be face down locations or events that are revealed when entering that location."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Factions", ":summary", "Factions represent groups with differing goals.\n* Goal - The Goal of the faction\n* Players - Choose their Faction\n* Units - Allocate Units within the Faction among those Players."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Introduction", ":summary", "Some Scenes have backstory or exposition. Note: IF you have Narrators THEN they should control these steps.\n* Reveal - Reveal the top card in the scene deck and follow its instructions.\n* Backstory - Previous events that affect the situation.\n* Description - Description of the current situation, Unit placement, and goals.\n* Meetup - Events leading to the party coming together."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Map", ":summary", "A Map includes a number of items:\n* Scale - The Map Scale to use\n* Boards - A Board is a page-sized map depicting some type of terrain (e.g. Dirt, Forest, Ocean, Sky, Space). Lay the Boards on the table as described by the Scene.\n* Places - A Place is a Card that depicts a location (e.g. Rock, Tavern, Tunnel, Mountain). Lay the Places on the table as described by the Scene.\n* Units - eploy Units on the map as described by the Scene. They must be placed on a valid Space (dot) with a valid Facing."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Overview", ":summary", "Scene describes a location and situation:\n* Introduction - Intro and instructions\n* Map - The location and its layout\n* Factions - Groups with differing goals\n* Units - The Units within each Faction\n* Status Bar - Display of Units and statuses\n* Rounds - Game play over a number of Rounds\n* Events - Things that could happen\n* Rewards - Treasure, Experience, Status, Favor.\n* Advancement - Increase Abilities\n* Conclusion - Epilogue and rewards\n* Sample - A sample Scene"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Rewards", ":summary", "Completing Milestones typically give some reward.\n* Treasure - You can gain currency and other useful items\n* Status - You can gain or lose status among different Factions\n* Favor - You can gain or lose favor among different individuals\n* Experience\n-- Character Points (CP) - CP:+1 IF significant Character event\n-- Skill Points (SP) - SP:+1 IF Major Milestone (e.g. Chapter End)\n-- Ability Points (AP) - AP:+1 IF Minor Milestone (e.g. Significant Event)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Rounds", ":summary", "Scenes take place over a number of Rounds.\n* Time - Round length is determined by the Map Scale. 6 sec for Personal Scale, 6 min for Travel Scale, 6 hours for Exploration Scale, etc.\n* Groups - During a Round, Units are divided into the Groups based on who they Target. Each Group can resolve separately until Round End.\n* Moves - Within a Group, Units move and act simultaneously by gradually spending their Move tokens.\n* Actions - Units may take an Action by spending half of their starting Move tokens, so they can take up to 2 Actions."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Sample"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Status Bar", ":summary", "* Place each Unit card on the Status Bar with a Unit# card above it."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scene: Units", ":summary", "Gather and layout your Unit cards\n* Unit - Unit stat and mini cards\n* Skills - Skill cards on the Unit\n* Abilities - Ability cards on the Unit\n* Specialties - Specialty cards\n* Items - Item cards on the Unit. Arrange these like a paper doll to show what you are wearing or holding."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Setup: Decks", ":summary", "* Damage Decks - Shuffle the Wound, Disorder, Trauma, and Burden decks\n* Fate Deck - Shuffle an extra Conflict Deck to be the Fate Deck. Anyone may use this instead of cards from hand\n* Resource Deck - Keep this deck sorted for easy access\n* Clock Deck - Set out the Clock Deck (sorted numerically)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Setup: Players", ":summary", "Some Players may be designated Narrators (Game Masters). All Players get the following:\n* Colored Player Deck\n* Conflict Deck for Skill Checks - Shuffle and draw 5 cards\n\nOptional:\nA Character Deck of their personal character cards"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Setup: Tokens", ":summary", "Some abilities require Tokens. Any kind of small coin-sized token will do."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skill"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skill Point", ":summary", "* [Major Achievement]: Gain a Skill Point equal to your 2nd highest Skill level. You may also reduce 1 of your existing Skill levels by 1 to gain a Skill Point equal to the reduced level.\n* A Skill Point may be spent on a [Skill] of equal level to raise that skill by 1.\n* Skill Points may be saved.\n* A Skill Point may be exchanged for 2 Skill Points of 1 lesser level.\n* 2 Skill Points of equal level may be exchanged for 1 Skill Point of 1 higher level."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Space"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Specialty"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Shadow", ":summary", "* The Shadow\n* Shadow Triumphant: The Shadow is now in control of this unit. Set Conscience = Will; set Will = Shadow stat; and set Shadow=blank"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skill", ":summary", "* Action: Assign your Unit's Target card to the target.\n* Difficulty: The Skill test has a target Stat or number.\n* Resolve: Resolve the Skill as if it was Combat.\n* Damage: Any stat reductions are added to the Skill card instead of the target.\n* Success: If the stat is reduced to 0, the Skill succeeds.\n* Fail: If the user abandons the test or has any stat reduced to 0, the Skill fails and the Skill card is returned losing all reductions.\n* Test: Some Tests only require a single success or failure.\n* Extended: The user may continue this test on different turns until a Success or Fail.\n* See Also: [Unskilled] [Unfamiliar Item]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Sleep Deprived", ":summary", "* Mind:-1\n* Event: IF a Unit sleeps < 6 hours/day THEN Sleep Deprived:+1 ELSE Sleep Deprived:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Speed", ":summary", "* Special: IF Speed over 5 THEN penalty is Speed:-2."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Stat", ":image", "images/rule-stat.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surprise", ":summary", "* IF a unit suddenly appears adjacent or upon a unit.\n* THEN\n** Lose half of starting [Move].\n** Reveal [Conflict]. Unit takes temporary damage based on the [Suit].\n** [Wands] = [Fatigue]\n** [Coins] = [Stun]\n** [Cups] = [Stress]\n** [Swords] = [Slow]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surrounded", ":summary", "* IF a unit is adjacent to more than 1 opponent THEN all [Skill]:-1 for each additional opponent."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Target#", ":summary", "* [Round: Targets]: Place this card above a Unit.\n* [Damage] and [Target] cards are placed near this card.\n\n\n* [Action Cost]:[Speed]/2 round down\n\n\n* [Move]:[Speed]\n\n\n* [Turn]:2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Task: Damaging", ":summary", "A damaging attack. The degree of Success determines wound severity\n* Conflict - Perform a Conflict\n* Effect - Determine Effect for the Winner\n* Success - Challenge:-Effect"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Task: Overview", ":summary", "Any skill/ability/power/stat test is called a Task. There are 3 types:\n* Test - A quick test. Any success will pass the test\n* Extended - An extended task over multiple Rounds\n* Damaging - A damaging attack. The degree of success determines wound severity"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Task: Extended", ":summary", "An extended task over multiple Rounds\n* Task Start - Determine the Difficulty. Place Tokens on the upper (Progress) and lower (Challenge) part of of this card each equal to the Difficulty\n* Conflict - Perform a Conflict\n* Effect - Determine Effect\n* Success - Challenge:-Effect\n* Failure - Progress:-Effect\n* Round End: Progress:-1\n* IF Challenge = 0 THEN the Task Ends in Success\n* IF Progress = 0 THEN the Task Ends in Failure\n* Task End - Discard the tokens and Task card."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Task: Test", ":summary", "A quick test. Any success will pass the test\n* Difficulty - Determine the Difficulty. This is usually a Stat like the target's Body.\n* Conflict - Perform a Conflict. Reveal and Compare cards.\n* Success - Pass the Test. Effect describes the degree of Success"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Team"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Terms", ":summary", "* Scene - An short scenario\n* Place - A map or location\n* Item - A thing to interact with\n* Skill - A capability a Unit has learned\n* Power - A superhuman Skill\n* Ability - A specific ability / feat\n* Specialty - A style or focus area\n* Ready - An upright card\n* Inverted - An upsidedown card\n* Cooldown - A sideways card\n* Narrator - The host / game master(s)\n* Space - A dot on the Map\n* Requires - A requirement to use\n* Uses - # of uses before reload\n* [Key]:Value - Key refers to another Card. Value is the value/modifier.\n* Level Bonus - Higher level gains a bonus equal to difference"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Thirst", ":summary", "* Mind:-1\n* Event: IF a Unit drinks < 1 liter/day THEN Thirst:+1 ELSE Thirst:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unfamiliar Item", ":summary", "* If a unit attempts to use an Item that is not on its character sheet, they may usually attempt it at [Level]:-2 and [Disadvantage]. Note: This is cumulative with [Unskilled]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unit", ":image", "images/rule-unit.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unit: Sample", ":image", "images/rule-unit-sample.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unit#", ":summary", "* [Setup]: Place this card above a Unit on the Status Bar.\n* [Damage] and [Target] cards are placed near this card.\n\n\n* [Action Cost]:[Speed]/2 round down\n\n\n* [Move]:[Speed]\n\n\n* [Turn]:2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unskilled", ":summary", "* If a unit lacks a Skill needed, but wants to perform it anyway, they may usually attempt it at Level:-2 and [Disadvantage]. Note: This is cumulative with [Unfamiliar Item]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Warning", ":summary", "* This game attempts to bring more reality and popular fiction into games. For this reason, it includes physical, mental, and emotional trauma. I know little of the realities of these serious concepts, so I apologize in advance for any inaccuracies or clumsy representations.\n* I am not an artist, and AI art is fast and convenient. No art here is original.\n* This project has no intention of monetization or ownership. References to other copyrighted material is provided as examples and inspiration and are not intended to imply any ownership."),
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
