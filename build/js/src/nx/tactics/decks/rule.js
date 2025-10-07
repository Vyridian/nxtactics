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
            nx_tactics_base.f_rulelist_from_tactics_keys(tactics, "Drawn to Destiny", "Disclaimer", "How to Play", "Description", "Features", "Golden Rules", "Terms", "Unit: Sample", "Unit: Guide", "Item:Sample", "Item:Guide", "Stat", "How to Play", "Setup", "Setup: Players", "Scene", "Scene: Map#1", "Scene: Map#2", "Scene: Minis", "Scene: Units", "Scene: Events", "Round: Start", "Move", "Movement", "Action", "Action: Free", "Action: Interact", "Arc", "Range", "Line of Sight", "Conflict", "Conflict: Chart", "Conflict: Sample", "Hits", "Hits: Sample", "Crits", "Crits: Rating", "Crits: Damage", "Crits: Types", "Crits: Person", "Crits: Vehicle", "Resolution", "Round: End", "Conclusion", "Advancement")
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Ability",
        ":image",
        "images/rule-ability.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Ability Point",
        ":image",
        "images/rule-ability-point.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Advantage",
        ":image",
        "images/rule-advantage.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Arc",
        ":image",
        "images/rule-arc.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Area Effect",
        ":image",
        "images/rule-areaeffect.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Beast",
        ":image",
        "images/rule-beast.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":reference",
        "Dr. Jekyll and Mr. Hyde",
        ":summary",
        "The Beast represents our raw, primitive mind buried beneath reason and morality. It knows only rage, fear, hunger, and instinct. Pain and fear can release the Beast. Bold or desperate people might harness its power.\n* Unleashed - The Beast gains control. It cannot use Mind Skills and will only fight or flee.\n* Beast:X - IF Beast > Will THEN test Will vs Beast or gain Unleashed\n* Soothed - IF Unleashed Unit is in a peaceful situation and Will > Beast THEN test Will vs Beast to remove Unleashed"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Blast",
        ":image",
        "images/rule-blast.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Blatant", ":titles", "Overt", ":summary", "* Blatant Abilities are obviously linked to the user.\n* [Blatant] is the opposite of [Subtle]\n* Blatant Magic is harder to use and has [Disadvantage]"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Bleeding",
        ":image",
        "images/rule-bleeding.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Blind",
        ":image",
        "images/rule-blind.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Blind represents the inability to see\nPartial - Disadvantage at Range\nTotal - Cannot use Abilities at Range"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Blood Loss",
        ":image",
        "images/rule-bloodloss.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Body",
        ":image",
        "images/rule-body.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Bound",
        ":image",
        "images/rule-bound.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Bound represents binding or entanglement. Add this to related Damage\nMinor - Snagged\nMajor - Snared. Impaired\nCritical - Tangled. Stress:1 Impaired\nExtreme - Trapped. Stress:2 Immobilized\n* Head - Choking:3 Dying\nDamage - Each Damage dealt to Binder reduces Severity by 1\nEscape - IF out of Binder reach"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Broken",
        ":image",
        "images/rule-broken.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Broken represents a broken limb or Item. Add this to related Damage\nLimb - Cannot use Ability/Item with that limb\nItem - Can only be used as Weapon:Improvised"
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Character", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Item", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Unit", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Build: Vehicle", ":summary", ""),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Burning",
        ":image",
        "images/rule-burning.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "An open bleeding wound. For Vehicles this can be an energy leak\n* Bind Wound - Action x2 to remove a Bleeding\n* Round End - Slow:1 for each Bleeding. IF Speed:0 THEN Blood Loss:1 instead"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Called Shot",
        ":image",
        "images/rule-calledshot.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Called Shot allows you to target particular body parts\n    * Conflict - Before Reveal, announce a Skill:X penalty to take. IF you win THEN after Hit:Location, eveal X additional Damage. You may replace Hit:Location with 1 that matches one of your Damage Types"
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Campaign", ":summary", "* Starting a New Campaign\n* Creating Player Characters\n* Creating Plots\n* Conflict\n* Creating Scenes\n* Continuing a Campaign"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Campaign: New", ":summary", "* The Elevator Pitch\n* Theme\n* Character Creation\n* Character Development\n* Maps\n* The Hook\n* The Finale"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Casualty", ":summary", "Casualty represent crew and equipment loss on a vehicle.\nDetermine - Draw Fate for each crew or equipment\n* 25% - Cups represents a Casualty\n* 50% - Red represents a Casualty\n* 75% - Any but Cups represents a Casualty\nEffect - Useless. Of those:\n* Crew - Killed:25% Missing:25% Critcal Damage:25% Major Damage:25%\n* Equipment - Irreparable:25% Missing:25% Broken:25% Damaged:25%"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Character"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Character Point",
        ":image",
        "images/rule-character-point.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Choking",
        ":image",
        "images/rule-choking.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Clock",
        ":image",
        "images/rule-clock.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Collision",
        ":image",
        "images/rule-collision.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Collision:Angle",
        ":image",
        "images/rule-collision-angle.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Collision:Headon",
        ":image",
        "images/rule-collision-headon.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
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
        "Conflict: Chart",
        ":image",
        "images/rule-conflict-chart.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Conflict: Sample",
        ":image",
        "images/rule-conflict-sample.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conscience", ":summary", "* Conscience"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Constriction",
        ":image",
        "images/rule-constriction.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Constriction represents squeezing pressure. Add this to related Damage\nMinor - Squeeze\nMajor - Compress. Impaired\nCritical - Crush. Fatigue:1 Impaired\nExtreme - Collapse. Fatigue:2 Immobilized\n* Arm, Leg, Hand, Foot - Useless. Broken\n* Head, Chest, Abdomen - Choking:3 Dying\nDamage - Each Damage dealt to Constrictor reduces Severity by 1\nEscape - IF out of Constrictor reach"
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cover", ":summary", "* Cover makes it harder to hit a target and can absorb damage if struck. Opponents and Allies can provide cover too. Even smoke provides Cover.\n* If something is between you and your opponent, guess at the amount of Cover provided and resolve with the following penalties:\n** 25% Cover: Skill:-1.\n** 50% Cover: Skill:-2.\n** 75% Cover: Skill:-3.\n** 100% Cover: Skill:-4.\n* If successful, assign each 25% to whatever is providing cover (this can include fog, smoke, tables, walls, other opponents, allies, etc). Assign each a suit and draw [Shared Conflict]. If an assigned suit is drawn, the Cover is struck first. Resolve below based on the type of Cover.\n** Insubstantial: Resolve damage normally.\n** Item:Damage the item first. If it is destroyed, resolve any remaining damage on the original target.\n** Unit: That unit is the new target. Resolve a new Combat with it instead."),
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
        "Damaged",
        ":image",
        "images/rule-damaged.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Deaf",
        ":image",
        "images/rule-deaf.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Deaf represents the inability to hear\nPartial - Disadvantage to communicate or perceive by hearing\nTotal - Unable to communicate or perceive by hearing"
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Disabled",
        ":image",
        "images/rule-disabled.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Disabled represents joint holds and locks. Add this to related Damage\nMinor - Joint Twist\nMajor - Joint Lock. Impaired\nCritical - Joint Bar. Stun:1 Impaired\nExtreme - Dislocation. Stun:2 Immobilized\n* Arm, Leg, Hand, Foot - Dislocated. Useless\n* Head - Strangle Hold. Choking:3 Dying\n* Shoulders - Shoulder Dislocated. Useless\n* Vitals - Hip Dislocated. Useless\nDamage - Each Damage dealt to Disabler reduces Severity by 1\nEscape - IF out of Disabler reach"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Disadvantage",
        ":image",
        "images/rule-disadvantage.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
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
        "Diseased",
        ":image",
        "images/rule-diseased.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Drag", ":summary", "Move Target 1 Space adjacent to or on to you\n* Movement - IF your Body >= Target Body THEN you may spend Move:+1 to Move:1 the Target with you"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Drawn to Destiny",
        ":image",
        "images/rule-drawntodestiny.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Drop", ":summary", "Drop Items from anywhere on the body\n* Drop:X - Drop X Items from hand, arms, then body starting with most logical\n* Drop:All - Drop every Item being carried\n* Free - Drop item from hands or arms\n* Move:-1 - Drop item after moving to hands"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Dying",
        ":image",
        "images/rule-dying.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Electrified",
        ":image",
        "images/rule-electrified.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Electrified represents a continuous electrification. Add this to related Damage\nMinor - Shocked\nMajor - Jolted. Impaired\nCritical - Fried. Stun:1 Impaired\nExtreme - Electrocuted. Stun:2 Immobilized\n* Head, Chest - Dying\nDamage - Each Damage dealt to Electrifier reduces Severity by 1\nEscape - IF out of Electrifier reach"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Elevation",
        ":image",
        "images/rule-elevation.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Erosion: Mental", ":summary", "* A gradual loss of memory."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Erosion: Physical", ":summary", "* A gradual whithering of physical abilities."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Erosion: Spiritual", ":summary", "* A gradual loss of personality and individualality."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Exposure",
        ":image",
        "images/rule-exposure.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Falling",
        ":image",
        "images/rule-falling.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
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
        "Freezing",
        ":image",
        "images/rule-freezing.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Freezing represents extreme cold. Add this to related Damage\nMinor - Chill\nMajor - Frost Caked. Exposure:1\nCritical - Ice Caked. Exposure:2\nExtreme - Frozen. Exposure:3 Frostbite\n* Arm, Leg, Hand, Foot - Useless\n* Head, Chest - Choking:3 Dying\n* Other Parts - Dying\nAction - Use heat to reduce Severity by 1"
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
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Haywire", ":image", "images/rule-haywire.svg", ":summary", "System acts randomly\n* Round Start - Reveal Fate IF Coins/Cups THEN\n** Steering - Spend Turn:-1 to Turn:Left/Right\n** Thrust - Spend to Accelerate:1/Decelerate:1\n** Item/Ability - Exhaust with no effect\n** Lift - Spend to Elevation:+1/-1"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Held",
        ":image",
        "images/rule-held.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Unit is held by a Unit or Item\n* Conflict - Disadvantage vs Holder\n* Move - IF Holder Body > Held Body THEN Held Move:+1 cost\n* Damage - Each Damage dealt to Holder reduces Severity by 1\n* Escape - IF out of Holder reach"
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Hunger",
        ":image",
        "images/rule-hunger.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Immobilized",
        ":image",
        "images/rule-immobilized.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Impaired",
        ":image",
        "images/rule-impaired.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Isolation",
        ":image",
        "images/rule-isolation.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":reference",
        "* Their sharing a drink they call loneliness. It's better than drinking alone. - Billy Joel, Piano Man"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Item:Guide",
        ":image",
        "images/rule-item-guide.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Item:Sample",
        ":image",
        "images/rule-item-sample.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Knockdown", ":summary", "Target is knocked down Elevation:-X\n* Surface - IF it hits something it takes Fatigue:X Stun:X and is Prone"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Line of Sight",
        ":image",
        "images/rule-lineofsight.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Magic", ":summary", "Magic is indirect. It allows one to do the unlikely, not the impossible. Magic must always have a grounded source, so creating things from nothing is the hardest form of magic."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Magic List",
        ":image",
        "images/rule-magic-list.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Arcane\n* Abjuration\n* Alchemy\n* Artifice\n* Artistry\n* Astrology\n* Chronomancy\n* Conjuration\n* Sorcery\n* Thaumaturgy\n* Wizardry\nElemental\n* Aeromancy\n* Cryomancy\n* Electromancy\n* Geomancy\n* Pyromancy\n* Stormcraft\nNature\n* Animalism\n* Beastial\n* Herbalism\n* Naturalism\nBlack\n* Bloodcraft\n* Chaos\n* Corruption\n* Darkness\n* Demonic\n* Fleshcraft\n* Necromancy\nSpiritualism\n* Divination\n* Dreaming\n* Enchantment\n* Hexcraft\n* Mysticism\n* Shamanism\nThergy\n* Blessing\n* Conviction\n* Invocation\n* Life\n* Primordial\n* Purity\n* Radiant"
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Map"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Car Chase",
        ":image",
        "images/rule-map-car-chase.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Dogfight",
        ":image",
        "images/rule-map-dogfight.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Exploration",
        ":image",
        "images/rule-map-exploration.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Galactic",
        ":image",
        "images/rule-map-galactic.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Global",
        ":image",
        "images/rule-map-global.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Narrative",
        ":image",
        "images/rule-map-narrative.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Naval",
        ":image",
        "images/rule-map-naval.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Orbital",
        ":image",
        "images/rule-map-orbital.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Personal",
        ":image",
        "images/rule-map-personal.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Planetary",
        ":image",
        "images/rule-map-planetary.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Regional",
        ":image",
        "images/rule-map-regional.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Road Trip",
        ":image",
        "images/rule-map-road-trip.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Starship",
        ":image",
        "images/rule-map-starship.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Map:Stellar",
        ":image",
        "images/rule-map-stellar.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Mind",
        ":image",
        "images/rule-mind.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Paralyzed",
        ":image",
        "images/rule-paralyzed.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Paralyzed represents losing the ability to move. Add this to related Damage\nMinor - Weakened\nMajor - Feeble. Impaired\nCritical - Disabled. Stress:1 Impaired\nExtreme - Paralyzed. Stress:2 Immobilized\n* Arm, Leg, Hand, Foot - Useless\n* Head - Paralyzed from neck down\n* Shoulders/Vitals - Arms/Legs paralyzed\n* Chest - Paralyzed from chest down\n* Abdomen - Paralyzed from waist down\nDamage - Each Damage dealt to Paralyzer reduces Severity by 1\nEscape - IF out of Paralyzer reach"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Petrified",
        ":image",
        "images/rule-petrified.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Petrified represents being turned to stone. Add this to related Damage\nMinor - Encrusted\nMajor - Confined. Impaired\nCritical - Enveloped. Stress:1 Impaired\nExtreme - Entombed. Stress:2 Immobilized\n* Arm, Leg, Hand, Foot - Useless\n* Head, Chest - Choking:3 Dying\n* Other Parts - Dying\nDamage - Each Damage dealt to Petrifier reduces Severity by 1\nEscape - IF out of Petrifier reach\nDead - A Unit that dies by Petrified instead is preserved and transforms to stone"
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Place"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Player",
        ":image",
        "images/rule-player.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "* [Setup]: Gather your Units and assign a [Unit#] card to each. Arrange each Unit's equipped items like a paper doll.\n* [Round End]: [Draw]:1 and [Recover]."
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Poisoned",
        ":image",
        "images/rule-poisoned.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Power",
        ":image",
        "images/rule-power.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Power List 1",
        ":image",
        "images/rule-power-list-1.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Physical\n* Acidic\n* Agility\n* Armor\n* Bonds\n* Diseases\n* Implants\n* Longevity\n* Quickness\n* Senses\n* Size\n* Strength\n* Toughness\n* Toxins\n* Weapon\n* Wealth\nVehicle\n* Cabin\n* Cargo\n* Equipment\n* Factory\n* Hanger\n* Laboratory\n* Life Support\nAlteration\n* Adaptation\n* Combine\n* Flexible\n* Healing\n* Invisibility\n* Lycanthropy\n* Metamorphose\n* Mutate\n* Shapeshift\n* Spawning\n* Special Ability\n* Transform\n* Transmutation\n* Vampirism\nElements\n* Air\n* Cold\n* Earth\n* Electricity\n* Fire\n* Heat\n* Water\n* Weather"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Power List 2",
        ":image",
        "images/rule-power-list-2.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Energies\n* Density\n* Energy Control\n* Explosive\n* Forces\n* Gravity\n* Inertia\n* Light\n* Magnetism\n* Phasing\n* Power Control\n* Radiation\n* Reality\n* Shielding\n* Sound\n* Time\n* Vibration\nWeakness\n* Weakness:Physical\n* Weakness:Mental\n* Weakness:Social\nMental\n* Charm\n* Computer Control\n* Domination\n* Empathy\n* Intuition\n* Madness\n* Mental Combat\n* Mentalism\n* Mind Over Matter\n* Presence\n* Psychic Combat\nTravel\n* Digging\n* Dimensional\n* Flight\n* Move:Ground\n* Move:Space\n* Move:Stellar\n* Move:Water\n* Teleportation\n* Time Travel"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Prone",
        ":image",
        "images/rule-prone.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Unit is lying flat and is 1 Elevation lower\n* Cover - Usually offers additional cover\n* Elevation - Note Elevation modifiers"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Pull/Push",
        ":image",
        "images/rule-pull-push.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rating", ":summary", ""),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role:Attacker", ":summary", "Attacker Units usually do the following:\n* Target weak points in the enemy from lines\n* Move into Range\n* Attack"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role:Blaster", ":summary", "Blaster Units usually do the following:\n* Target groups of enemies\n* Move into Range\n* Attack to maximize enemy losses\n* Move to safety"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role:Defender", ":summary", "Defender Units usually do the following:\n* Target an enemy threatening a nearby vulnerable ally\n* Move into Range protecting the ally\n* Attack"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role:Disrupter", ":summary", "Disrupter Units usually do the following:\n* Target groups of enemies\n* Move into Range\n* Attack to maximize enemy disruption\n* Move to safety"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role:Skirmisher", ":summary", "Skirmisher Units usually do the following:\n* Target the closest enemy\n* Move into Range\n* Attack\n* Move to safety"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role:Sniper", ":summary", "Sniper Units usually do the following:\n* Target a vulnerable or important enemy\n* Move into Range\n* Attack\n* Move to safety"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role:Supporter", ":summary", "Supporter Units usually do the following:\n* Target ally(s) to assist\n* Move into Range\n* Aid the ally(s)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Role:Taunter", ":summary", "Taunter Units usually do the following:\n* Target a dangerous enemy\n* Move into Range\n* Attack and attempt to draw attention"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Roles", ":summary", "A Role describes a Unit's loose goals\n* Attacker - Engage enemies\n* Blaster - Reduce enemy numbers\n* Defender - Protect allies\n* Disrupter - Disrupt enemy abilities\n* Skirmisher - Maintain Range and Strike\n* Sniper - Eliminate big threats\n* Supporter - Helps allies\n* Taunter - Draw enemy attention"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Rotated Cards",
        ":image",
        "images/rule-rotated.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "* [Between Games]: Rotate this card 90 degrees and place it on top of all rotated card.\n\n* [Game Start]: Rotate this card 90 degrees with all cards under it and then remove this card to return the rotated cards to their correct orientation."
      ),
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Shadow",
        ":titles",
        "Darkness, Darkside, Pedophile, Sadist, Serial Killer, Sociopath, Yin",
        ":image",
        "images/rule-shadow.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":reference",
        "* Hello darkness, my old friend. I've come to talk to you again. - Simon and Garfunkle, Sound of Silence\n* Anyone who fights with monsters should take care that he does not in the process become a monster. And if you gaze for long into an abyss, the abyss gazes also into you. - Friedrich Nietzsche, Beyond Good and Evil\n* Hannibal Lecter\n* Even if I wanted to go, my schedule wouldn't allow it. 4:00, wallow in self pity; 4:30, stare into the abyss; 5:00, solve world hunger, tell no one; 5:30, jazzercize; 6:30, dinner with me - I can't cancel that again; 7:00, wrestle with my self-loathing... I'm booked. Of course, if I bump the loathing to 9, I could still be done in time to lay in bed, stare at the ceiling and slip slowly into madness. But what would I wear? - Grinch, The Gringe Who Stole Christmas\n* If once you start down the dark path, forever will it dominate your destiny - Yoda, Star Wars: The Empire Strikes Back\n* A farmer comes home one day to find ... everything that he loved, taken from him... He makes a promise to himself in those dark hours. A life's work erupts from his knotted mind... Years go by... The farmer, who is no longer a farmer, sees the wreckage that he has left in his wake. It is now he who burns. It is he who slaughters, ... and he knows in his heart, he must pay. - Red Reddington, The Blacklist\n* When I find out someone murdered an innocent person, or sold somebody heroin, or did some graffiti, and I kill that person with my bare hands, their eyeballs popping out of their skulls... You think THAT gives ME pleasure?... Well, it does!... What separates us from the other killers, is we only kill bad people. Usually... Unless there's a mistake. Now, do I sound like a fucking maniac? - Vigilante, Peacemaker",
        ":summary",
        "The Shadow represents our repressed, selfish, and cruel desires. It is normally powerless, frustrated, and suppressed, but it can gain dominance in those whose Will falters or those who cultivate it.\n* Triumphant - The Shadow gains control. If uses Shadow instead of Will for tests. It acts in its immediate self interest and rarely aids anyone.\n* Shadow:X - IF Shadow > Will THEN test Will vs Shadow or gain Triumphant\n* Bitter Defeat - Because the Shadow is self absorbed, failure is devastating. IF Shadow is defeated THEN Shadow:-1. IF Will > Shadow THEN test Will vs Shadow to remove Triumphant."
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Sinking",
        ":image",
        "images/rule-sinking.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "A Sinking Unit is rapidly losing Elevation\n* Round End - Elevation:-1 for each Sinking:1"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Skill",
        ":image",
        "images/rule-skill.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Skill List",
        ":image",
        "images/rule-skill-list.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Combat\n* Close Combat\n* Melee\n* Defense\n* Evasion\n* Ranged\n* Firearm\n* Gunnery\n* Explosives\nBody\n* Animals\n* Assassination\n* Athletics\n* Crime\n* Driving\n* Hunting\n* Mechanics\n* Military\n* Seamanship\n* Stealth\n* Survival\n* Tradeskill\nMind\n* Business\n* Computers\n* Electronics\n* Intellect\n* Investigation\n* Knowledge\n* Law\n* Medicine\n* Piloting\n* Science:Life\n* Science:Physical\n* Science:Social\nWill\n* Art\n* Communication\n* Deception\n* Espionage\n* Influence\n* Intimidation\n* Leadership\n* Performance\n* Persuasion\n* Religion"
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Skill Point",
        ":image",
        "images/rule-skill-point.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Sleep Deprived", ":summary", "* Mind:-1\n* Event: IF a Unit sleeps < 6 hours/day THEN Sleep Deprived:+1 ELSE Sleep Deprived:-1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Space", ":summary", "A point on the map"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Space: Inner"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Space: Outer"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Specialty",
        ":titles",
        "Class",
        ":image",
        "images/rule-specialty.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Speed",
        ":image",
        "images/rule-speed.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Stat",
        ":image",
        "images/rule-stat.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Stat:0",
        ":image",
        "images/rule-stat-0.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Stat:Add",
        ":image",
        "images/rule-stat-add.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Stat:Multiply",
        ":image",
        "images/rule-stat-multiply.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Stasis",
        ":image",
        "images/rule-stasis.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Stasis represents a time freeze effect. Add this to related Damage\nMinor - Skipping\nMajor - Stuck. Impaired\nCritical - Anchored. Slow:1 Impaired\nExtreme - Stopped. Slow:2 Immobilized\n* Head, Chest, Abdomen - Choking:3 Dying\nAction - Each Damage dealt to Binder reduces Severity by 1\nEscape - IF out of reach\nDead - A Unit that dies by Stasis instead is perfectly preserved until released"
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Subtle", ":summary", "* Subtle Abilities are not obviously linked to the user.\n* [Blatant] is the opposite of [Subtle]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Suit", ":summary", "Each Suit represents a Stat:\n* Wands - Power. Body\n* Coins - Planning. Mind\n* Cups - Perseverance. Will\n* Swords - Skill. Speed"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Surprise",
        ":image",
        "images/rule-surprise.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Surrounded",
        ":image",
        "images/rule-surrounded.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Target#",
        ":image",
        "images/rule-target-num.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Task",
        ":image",
        "images/rule-task.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Terms",
        ":image",
        "images/rule-terms.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Touch"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Thirst",
        ":image",
        "images/rule-thirst.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Time: Afternoon"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Time: Evening"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Time: Morning"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Time: Night"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Transformed",
        ":image",
        "images/rule-transformed.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":summary",
        "Transformed represents body transformation. Add this to related Damage\nMinor - Altered\nMajor - Turning. Impaired\nCritical - Mutating. Stress:1 Immobilized\nExtreme - Remade. Stress:2\nDamage - Each Damage dealt to Transformer reduces Severity by 1\nEscape - IF out of Transformer reach"
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Transport", ":titles", "Mount, Vehicle", ":summary", "Anything you can ride is a Transport\neg Horses, Cars, Planes\n* Driver - Spend an Action each Round to control\n* Passenger - IF unstable or in Combat THEN Spend an Action to remain stable"),
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Unit#",
        ":image",
        "images/rule-unit-num.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Unskilled",
        ":image",
        "images/rule-unskilled.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Velocity", ":image", "images/rule-velocity.svg", ":summary", "Velocity represents the speed and momentum of fast Units. It replaces normal movement\nRound Start\n Velocity - Starts at 0\n Momentum = Velocity\nCountdown - When Count is called, MAY spend Momentum:-1 instead of Move:-1 to move straight or Drift Forward\n IF Count >= Momentum THEN not optional\nFree Actions\n Accelerate:X - Spend Move:X to gain Velocity:+1 (Min=2)\n Brake:X - Spend Move:X to lose Velocity:-1 (Min=1)"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weapon:Barehanded",
        ":image",
        "images/rule-weapon-barehanded.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weapon:Improvised",
        ":image",
        "images/rule-weapon-improvised.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weather",
        ":image",
        "images/rule-weather.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weather:Clouds",
        ":image",
        "images/rule-weather-clouds.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather:Downpour"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weather:Humidity",
        ":image",
        "images/rule-weather-humidity.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather:Hurricane"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather:Rain", ":summary", "* Dew\n* Dizzle\n* Rain\n* Downpour"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather:Snow", ":summary", "* Sleet\n* Snowy\n* Snowstorm\n* Blizzard"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weather:Temperature",
        ":image",
        "images/rule-weather-temperature.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather:Tornado"),
      vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weather:Thunderstorm", ":image", "images/rule-weather-thunderstorm.svg", ":summary", "* Conditions: Stormy Humid+ Windy+\n* [Event]: Every 6 hours, [Reveal Fate].\n** IF a Black Wild THEN a nearby lightning strike\n** IF a Red Wild THEN a direct lightning strike\n** Effects - A lightning bolt holds 5 GigaJoules or 5x9 damage for a direct strike, but most lightning strikes go through smaller feelers or are splashes. Even a direct strike is survivable because it usually travels across the surface of the skin instead of through the body."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Weather:Wind",
        ":image",
        "images/rule-weather-wind.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Will",
        ":image",
        "images/rule-will.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly,
        ":titles",
        "Chi, Confidence, Determination, Ego, Emotion, Faith, Grit, Guts, Heart, Instinct, Ki, Mana, Perseverence, Resolve, Spirit, Spiritualism, Will, Willpower",
        ":reference",
        "* I think, therefore I am. - Descartes, Cogito Ergo Sum\n* The nature of existence is subjective. I have experience and thoughts in this precise moment, beyond that I can prove nothing. Does time actually pass as I understand it? Is anything else but me real? Am I living in a dream/hallucination/simulation? Am I just insane? Our experience is the only thing we can be sure of. Therefore, we may as well choose to live as we see fit. No amount of evidence can definitively prove otherwise."
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rule},
        ":name",
        "Withdraw",
        ":image",
        "images/rule-withdraw.svg",
        ":layout",
        nx_tactics_base.c_cardlayout_imageonly
      )
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
