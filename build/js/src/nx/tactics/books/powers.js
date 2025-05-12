'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_powers {

  /**
   * @function chapter_equipment_powers
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_equipment_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_equipment_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_equipment_powers
  }

  // (func chapter-equipment-powers)
  static f_chapter_equipment_powers(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Equipment Powers",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Item Powers",
          ":powermap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_powermap},
            "Quality Item",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Quality Item",
              ":summary",
              "* An item with this skill is of particularly high quality and possesses unusual abilities.\n* The level of quality effects the number of abilities as usual.\n* Each level of quality doubles the original price of the item.",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Fine Workmanship",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fine Workmanship", ":summary", "* This item possesses fine details that are particularly attractive to collectors."),
                "Resist: Fire",
                nx_tactics_base.f_ability_from_tactics_key(tactics, "Resist: Fire"),
                "High Durability",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "High Durability", ":summary", "* This item is exceptionally well constructed and can withstand a suprising amount of punishment compared to a normal item of its type.")
              )
            ),
            "Quality Weapon",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Quality Weapon",
              ":summary",
              "* A weapon with this skill is of particularly high quality and possesses unusual abilities.\n* The level of quality effects the number of abilities as usual.\n* Each level of quality doubles the original price of the item.",
              ":abilitymap",
              nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Balanced for Throwing")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Vehicular Systems",
          ":summary",
          "** Atmospheric Engine\n** Sub-light Drive\n** FTL Drive\n\n* Science Lab w/Sensors\n* Air Locks\n** Magnetic Mooring Lines\n** Vacc Suits\n* Weapons Locker\n* Drop Chamber w/Drop Pods\n* Cloaking Device\n* Shields",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Cabin", "Cargo", "Combine", "Equipment", "Hanger", "Engine", "Factory", "Laboratory", "Life Support", "Transform"),
          ":sectionmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_sectionmap},
            "Weapon Bay",
            vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Weapon Bay", ":summary", "* Main Turrets\n* Point Defense\n** Antiaircraft\n* Grenade Launcher\n* Laser\n* Mass Driver\n* Missiles\n** Micro-missiles\n** Mini-missiles\n** Heavy missiles\n* Particle Beam\n* Plasma Lance\n* Spinfuser\n* Taser\n* Payloads\n** Acid\n** Antimatter\n** Bioweaponry\n** Chemical\n** Explosive\n** Fusion\n** Incendiary\n** Nuclear\n** Nuclear Waste\n* Missile Bay\n* Torpedo Bay\n** Nuclear\n** Fusion\n** Antimatter\n** Planet Buster")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_alteration_powers
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_alteration_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_alteration_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_alteration_powers
  }

  // (func chapter_alteration_powers)
  static f_chapter_alteration_powers(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Alteration Powers",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Material Control",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Atomic Control", "Density", "Transfiguration", "Transmutation")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Power Manipulation",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Power Copy", "Power Disruption", "Power Drain", "Power Feedback", "Power Fluctuation", "Power Reflection", "Power Theft", "Power Vampire")
        )
      )
    )
    return output
  }

  /**
   * @function chapter_body_powers
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_body_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_body_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_body_powers
  }

  // (func chapter_body_powers)
  static f_chapter_body_powers(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Body Powers",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Alteration Powers",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Acidic", "Adaptation", "Altered Skin", "Animalism", "Diseases", "Explosive", "Flexible", "Invisibility", "Longevity", "Lycanthropy", "Phasing", "Reality Warping", "Shape Shift", "Size", "Spawning", "Toxins", "Transformation", "Vampirism")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Cybernetics",
          ":reference",
          "* Metal is perfection. - Viktor, Runeterra\n* Better than mortal: metal. - Mechanized Mimic, Runeterra",
          ":summary",
          "* Faux Flesh (Faux Skin) - The great breakthrough in cybernetics was not in machinery but in synthetic flesh. Faux Flesh is a foam that hardens into soft, realistic flesh that will not be rejected by user's immune system. Faux Flesh can be injected between machine parts and is used at all interface points between living tissue and cyberware. It seals wounds like chalking and is a staple of medical kits.",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Artificial: Arms", "Artificial: Hearing", "Artificial: Implants", "Artificial: Interface", "Artificial: Legs", "Artificial: Vision", "Netrunning")
        )
      )
    )
    return output
  }

  /**
   * @function chapter_energy_and_forces
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_energy_and_forces = {
    vx_type: vx_core.t_type
  }
  static e_chapter_energy_and_forces = {
    vx_type: nx_tactics_books_powers.t_chapter_energy_and_forces
  }

  // (func chapter_energy_and_forces)
  static f_chapter_energy_and_forces(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Energy and Forces",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Elements",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Air", "Cold", "Earth", "Electricity", "Fire", "Water", "Weather")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Energy and Forces",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Dimensional", "Energy Manipulation", "Explosive", "Forces", "Gravity", "Heat", "Inertia", "Light", "Magnetism", "Radiation", "Sound", "Time", "Vibration")
        )
      )
    )
    return output
  }

  /**
   * @function chapter_godlike_powers
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_godlike_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_godlike_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_godlike_powers
  }

  // (func chapter_godlike_powers)
  static f_chapter_godlike_powers(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Godlike Powers",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Primal Powers",
          ":titles",
          "Primal Order",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Primus")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Projectiles",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Bonds")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Miscellaneous",
          ":powermap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_powermap},
            "Computer Control",
            vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Computer Control", ":summary", "Gives ability to control computers like Computer Science.")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_mental_powers
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_mental_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_mental_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_mental_powers
  }

  // (func chapter_mental_powers)
  static f_chapter_mental_powers(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Mental Powers",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Mental Powers",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Charm", "Domination", "Empathy", "Illusion", "Intuition", "Madness", "Mental Combat", "Mental Connection", "Mental Fortitude", "Mind Over Matter", "Presence", "Psychic Power")
        )
      )
    )
    return output
  }

  /**
   * @function chapter_movement_powers
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_movement_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_movement_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_movement_powers
  }

  // (func chapter_movement_powers)
  static f_chapter_movement_powers(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Movement Powers",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Travel",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Digging", "Dimensional", "Flight", "Movement: Ground", "Movement: Interstellar", "Movement: Space", "Movement: Water", "Teleportation", "Time Travel")
        )
      )
    )
    return output
  }

  /**
   * @function chapter_physical_powers
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_physical_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_physical_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_physical_powers
  }

  // (func chapter_physical_powers)
  static f_chapter_physical_powers(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Physical Powers",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Physical Powers",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Agility", "Appearance", "Armored", "Healing", "Movement", "Natural Weaponry", "Quickness", "Senses", "Shielding", "Strength", "Toughness")
        )
      )
    )
    return output
  }

  /**
   * @function chapter_powers_overview
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_powers_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_powers_overview = {
    vx_type: nx_tactics_books_powers.t_chapter_powers_overview
  }

  // (func chapter_powers_overview)
  static f_chapter_powers_overview(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Powers Overview",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Why Tactics: Powers?")
      )
    )
    return output
  }

  /**
   * @function chapter_special_modifiers
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_special_modifiers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_special_modifiers = {
    vx_type: nx_tactics_books_powers.t_chapter_special_modifiers
  }

  // (func chapter_special_modifiers)
  static f_chapter_special_modifiers(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Special Modifiers",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Buffs",
          ":modifiermap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_modifiermap},
            "Anti-Armor",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Anti-Armor", ":summary", "* Specifically designed to tear apart armor to leave target open to further attacks."),
            "Anti-Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Anti-Missile", ":summary", "* Specifically designed to intercept high speed targets moving in a straight line."),
            "Anti-Personnel",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Anti-Personnel", ":summary", "* Specifically designed to attack man-sized targets."),
            "Anti-Shield",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Anti-Shield", ":summary", "* Specifically designed to reduced [Shielding]."),
            "AP",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "AP", ":titles", "Armor-Piercing", ":summary", "* Specifically designed to target armored units."),
            "Aura",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Aura", ":summary", "* Radial effect encompassing the current space and continuing for Level Range."),
            "Autofire",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Autofire", ":summary", "* Cannot Combo. Shots:-10. A Normal Success automatically creates a Combo with All lower numbers. E.g. Rank 7 would add 6, 5, 4, 3, and 2."),
            "Beam",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Beam", ":summary", "* Rectangular shaped effect 1 space wide.\n* [-1 Skill] for each 2 Spaces of Range"),
            "Burstfire",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Burstfire", ":summary", "* Cannot Combo. Shots:-3. A Normal Success automatically creates a Combo with the 2 lower numbers. E.g. Rank 7 would add 6 and 5."),
            "Chain Reaction",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Chain Reaction"),
            "Cloud",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Cloud"),
            "Cluster",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Cluster"),
            "Column",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Column", ":summary", "* Rectangular shaped effect starting at 1 space wide and widening to 3 spaces.\n* [Action]: [-2 Skill] for each Space of Range"),
            "Cone",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Cone", ":summary", "* Triangle shaped effect starting at 1 space wide and widening by 1 additional space for every 2 spaces of range.\n* [Action]: [-2 Skill] for each Space of Range"),
            "Fork",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Fork"),
            "Haywire",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Haywire", ":summary", "* Attack that damages electrical systems."),
            "HE",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "HE", ":titles", "High-Explosive", ":summary", "* [Targetting]: Target a space.  All units in that space and surrounding spaces are attacked.\n* [Damage]: All target's are [+2 Armor] against this attack.\n* [Damage]: Units surrounding the space are attacked at -1 Damage for each space distant.\n\nAdvanced:\n* Instead of standard [High Explosive (HE)] rules the following may be used to more accurately simulate the damage exponential decrease in energy of explosives.\n* [Targetting]: Target a space. All units in that space and surrounding spaces are attacked.\n* [Damage]: All target's are [+2 Armor] against this attack.\n* [Damage]: Units surrounding the space are attacked by dividing the energy (in Joules, or tons of TNT) using the following reduction pattern for each space distant: 1/1, 1/3, 1/10, 1/30, 1/100, 1/300, 1/1000, etc. Then look up the new damage based on the new energy level."),
            "HEAT",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "HEAT", ":titles", "High Explosive Anti-Tank", ":summary", "* A shaped charge designed for maximum penentration with little exterior damage."),
            "Hidden Effect",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Hidden Effect", ":summary", "Effect cannot be detected through normal means."),
            "Homing",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Homing", ":titles", "Guided, Seeking"),
            "Indirect",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Indirect", ":summary", "* May use [Indirect Fire] ability to attack without [Line of Sight]."),
            "Pushing the Limits",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Pushing the Limits", ":summary", "Powers may be increased temporarily, but this runs a risk of damaging or permanently altering the subject or his powers in some way. This may even increase the power but may create [Aberrations]."),
            "Ring",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Ring", ":titles", "Circle"),
            ":Sphere",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Sphere", ":summary", "* Radial effect encompassing the current space.\n* [Action]: [-3 Skill] for each Space of Range"),
            ":Spray",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Spray"),
            ":Swarm",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Swarm"),
            ":Touch",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Touch", ":summary", "* [Requires]: Target must be within 1 space and be able to be touched."),
            ":Wall",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Wall", ":summary", "* Walls start on the edge of a space and spread outward one space in each direction on each of this unit's turns until the unit ceases concentration or the maximum size is reached. Maximum Size is one square space per level."),
            ":Wave",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Wave")
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Power Weaknesses",
          ":modifiermap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_modifiermap},
            ":Activation",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Activation", ":summary", "* Activating the ability requires more than just desire"),
            "Always On",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Always On", ":summary", "* Ability may not be turned off"),
            ":Annoying",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Annoying", ":summary", "* Tiny things that make using the ability frustrating."),
            "Communications Broadcast Only",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Communications Broadcast Only"),
            "Communications None",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Communications None"),
            "Communications Receive Only",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Communications Receive Only"),
            "Conditional Use",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Conditional Use", ":summary", "* Ability may only be used under specific circumstances"),
            "Energy Discharge",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Energy Discharge", ":summary", "Cannot completely contain own energies and must allow them to leak out regularly. At low levels this just draws attention, but at higher levels becomes dangerous."),
            "Focus Item",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Focus Item"),
            "Glider Only",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Glider Only"),
            ":Inefficient",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Inefficient", ":summary", "* Uses excessive energy."),
            ":Internalize",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Internalize"),
            "Large Sensor Profile",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Large Sensor Profile"),
            "Limited Uses",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Limited Uses"),
            ":Overheats",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Overheats"),
            ":Overloads",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Overloads"),
            "Poor Climb Angle",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Poor Climb Angle"),
            "Poor Ceiling",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Poor Ceiling"),
            "Poor Towing Capacity",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Poor Towing Capacity"),
            "Power Fluxuation",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Power Fluxuation", ":summary", "Cannot completely control power level. At random, power use may be higher or lower than expected. High level powers may not be able to be turned off or may not turn on when needed."),
            "Power Hungry",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Power Hungry", ":summary", "* Requires extra turns of inactivity to use."),
            "Power Manifestation",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Power Manifestation", ":summary", "When powers are used, a visual or audible manifestation appears. The higher the power level the more obvious the manifestation."),
            "Requires Airstrip",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Requires Airstrip"),
            "Sensor Dependent",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Sensor Dependent", ":summary", "* Blind without Sensors"),
            "Traceable Emmissions",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Traceable Emmissions")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_strength_and_weaknesses
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_strength_and_weaknesses = {
    vx_type: vx_core.t_type
  }
  static e_chapter_strength_and_weaknesses = {
    vx_type: nx_tactics_books_powers.t_chapter_strength_and_weaknesses
  }

  // (func chapter_strength_and_weaknesses)
  static f_chapter_strength_and_weaknesses(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Strength and Weaknesses",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Special Skills",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Special Ability")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Weaknesses",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Weakness: Cursed", "Weakness: Mental", "Weakness: Physical", "Weakness: Social")
        )
      )
    )
    return output
  }

  /**
   * @function tacticsbook
   * @param  {tactics} tactics
   * @return {book}
   */
  static t_tacticsbook = {
    vx_type: vx_core.t_type
  }
  static e_tacticsbook = {
    vx_type: nx_tactics_books_powers.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Powers",
      ":image",
      "Powers.jpg",
      ":chaptermap",
      nx_tactics_base.f_chaptermap_from_chapterlist(
        nx_tactics_books_powers.f_chapter_powers_overview(tactics),
        nx_tactics_books_powers.f_chapter_special_modifiers(tactics),
        nx_tactics_books_powers.f_chapter_equipment_powers(tactics),
        nx_tactics_books_powers.f_chapter_strength_and_weaknesses(tactics),
        nx_tactics_books_powers.f_chapter_mental_powers(tactics),
        nx_tactics_books_powers.f_chapter_movement_powers(tactics),
        nx_tactics_books_powers.f_chapter_physical_powers(tactics),
        nx_tactics_books_powers.f_chapter_body_powers(tactics),
        nx_tactics_books_powers.f_chapter_energy_and_forces(tactics),
        nx_tactics_books_powers.f_chapter_alteration_powers(tactics),
        nx_tactics_books_powers.f_chapter_godlike_powers(tactics)
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter-equipment-powers": nx_tactics_books_powers.e_chapter_equipment_powers,
      "chapter_alteration_powers": nx_tactics_books_powers.e_chapter_alteration_powers,
      "chapter_body_powers": nx_tactics_books_powers.e_chapter_body_powers,
      "chapter_energy_and_forces": nx_tactics_books_powers.e_chapter_energy_and_forces,
      "chapter_godlike_powers": nx_tactics_books_powers.e_chapter_godlike_powers,
      "chapter_mental_powers": nx_tactics_books_powers.e_chapter_mental_powers,
      "chapter_movement_powers": nx_tactics_books_powers.e_chapter_movement_powers,
      "chapter_physical_powers": nx_tactics_books_powers.e_chapter_physical_powers,
      "chapter_powers_overview": nx_tactics_books_powers.e_chapter_powers_overview,
      "chapter_special_modifiers": nx_tactics_books_powers.e_chapter_special_modifiers,
      "chapter_strength_and_weaknesses": nx_tactics_books_powers.e_chapter_strength_and_weaknesses,
      "tacticsbook": nx_tactics_books_powers.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter-equipment-powers": nx_tactics_books_powers.t_chapter_equipment_powers,
      "chapter_alteration_powers": nx_tactics_books_powers.t_chapter_alteration_powers,
      "chapter_body_powers": nx_tactics_books_powers.t_chapter_body_powers,
      "chapter_energy_and_forces": nx_tactics_books_powers.t_chapter_energy_and_forces,
      "chapter_godlike_powers": nx_tactics_books_powers.t_chapter_godlike_powers,
      "chapter_mental_powers": nx_tactics_books_powers.t_chapter_mental_powers,
      "chapter_movement_powers": nx_tactics_books_powers.t_chapter_movement_powers,
      "chapter_physical_powers": nx_tactics_books_powers.t_chapter_physical_powers,
      "chapter_powers_overview": nx_tactics_books_powers.t_chapter_powers_overview,
      "chapter_special_modifiers": nx_tactics_books_powers.t_chapter_special_modifiers,
      "chapter_strength_and_weaknesses": nx_tactics_books_powers.t_chapter_strength_and_weaknesses,
      "tacticsbook": nx_tactics_books_powers.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/powers",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter-equipment-powers)
    nx_tactics_books_powers.t_chapter_equipment_powers['vx_value'] = {
      name          : "chapter-equipment-powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_equipment_powers
    }

    // (func chapter_alteration_powers)
    nx_tactics_books_powers.t_chapter_alteration_powers['vx_value'] = {
      name          : "chapter_alteration_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_alteration_powers
    }

    // (func chapter_body_powers)
    nx_tactics_books_powers.t_chapter_body_powers['vx_value'] = {
      name          : "chapter_body_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_body_powers
    }

    // (func chapter_energy_and_forces)
    nx_tactics_books_powers.t_chapter_energy_and_forces['vx_value'] = {
      name          : "chapter_energy_and_forces",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_energy_and_forces
    }

    // (func chapter_godlike_powers)
    nx_tactics_books_powers.t_chapter_godlike_powers['vx_value'] = {
      name          : "chapter_godlike_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_godlike_powers
    }

    // (func chapter_mental_powers)
    nx_tactics_books_powers.t_chapter_mental_powers['vx_value'] = {
      name          : "chapter_mental_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_mental_powers
    }

    // (func chapter_movement_powers)
    nx_tactics_books_powers.t_chapter_movement_powers['vx_value'] = {
      name          : "chapter_movement_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_movement_powers
    }

    // (func chapter_physical_powers)
    nx_tactics_books_powers.t_chapter_physical_powers['vx_value'] = {
      name          : "chapter_physical_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_physical_powers
    }

    // (func chapter_powers_overview)
    nx_tactics_books_powers.t_chapter_powers_overview['vx_value'] = {
      name          : "chapter_powers_overview",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_powers_overview
    }

    // (func chapter_special_modifiers)
    nx_tactics_books_powers.t_chapter_special_modifiers['vx_value'] = {
      name          : "chapter_special_modifiers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_special_modifiers
    }

    // (func chapter_strength_and_weaknesses)
    nx_tactics_books_powers.t_chapter_strength_and_weaknesses['vx_value'] = {
      name          : "chapter_strength_and_weaknesses",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_strength_and_weaknesses
    }

    // (func tacticsbook)
    nx_tactics_books_powers.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_tacticsbook
    }

  }
}
