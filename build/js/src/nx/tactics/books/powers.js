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
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_powermap},
            ":Hanger",
            vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Hanger", ":summary", "* A special ability of vehicles to carry other vehicles.\n* A unit may carry 1 small unit (1 space) per space it takes up.\n* Action: Move 1 unit into or out of the hanger. The unit may not Move or take any Action the turn it moves into or out of the hanger.\n* Ship's Boat\n* Air Raft\n* Starfighter\n* Starbomber\n* Repair Drones\n* Mobile Armor", ":titles", "Vehicle Bay"),
            "Mission Section",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Mission Section",
              ":summary",
              "* Determine the total hull size and then divide it as desired by the following abilities.",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Air Locks",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Air Locks"),
                "Boarding Equipment",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Boarding Equipment", ":titles", "Grapple Launchers, Magnetic Mooring Lines"),
                "Cargo Hold",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cargo Hold"),
                "Catapult Launcher",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Catapult Launcher", ":summary", "*"),
                "Catapult Hook Capture",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Catapult Hook Capture"),
                "Cloaking System",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cloaking System"),
                "Cryogenic Chamber",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cryogenic Chamber", ":summary", "* Special ability of space craft to carry passengers in cryonic suspension."),
                "Captain's Quarters",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Captain's Quarters"),
                "Centrifuge Chamber",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Centrifuge Chamber"),
                "Climbing Apparatus",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Climbing Apparatus"),
                "Diving Wings",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Diving Wings", ":summary", "+1 when pulling out of a dive"),
                "Easy to Modify",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Easy to Modify"),
                ":ECM",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "ECM", ":titles", "Electronic Countermeasures, Jamming"),
                ":ECCM",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "ECCM", ":titles", "Electronic Counter-Countermeasures"),
                "Ejection System",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ejection System"),
                "Escape Pods",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Escape Pods"),
                ":Factory",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Factory"),
                "Fuel Scoop",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fuel Scoop"),
                ":Glider",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Glider", ":summary", "* Can glide without using power and may gain altitude when flying over hot air currents."),
                "Gun Ports",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Gun Ports", ":summary", "Allows crew to use small arms fire without sacrificing armor protection."),
                "Missile Decoys",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Missile Decoys", ":titles", "Chaff Dispenser, Flares"),
                "Launch Catapult",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Launch Catapult", ":summary", "* Launching vehicle may begin move at up to full speed without using fuel."),
                "Living Quarters",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Living Quarters", ":summary", "* Long range and luxury vessels offer more than the minimum crew quarters. This includes private rooms, mess, recreation areas, etc.\n* The larger the living space, the higher quality clientele may be brought aboard and the longer the ships range before shore leave is needed.\n* Includes Mess and Lounges"),
                "Luxury Facilities",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Luxury Facilities"),
                "Marine Ready Room",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Marine Ready Room"),
                "Marine Drop Pods",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Marine Drop Pods"),
                "Medical Facilities",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Medical Facilities", ":titles", "Sick Bay"),
                ":Minelayer",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Minelayer"),
                ":Minesweeper",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Minesweeper"),
                "Mining Facilities",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mining Facilities"),
                "Passenger Seating",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Passenger Seating"),
                "Prison Facilities",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prison Facilities", ":titles", "Brig"),
                "Ram Plate",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ram Plate"),
                ":Refinery",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Refinery"),
                "Science Lab",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Science Lab"),
                "Atmospheric Sensors",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Atmospheric Sensors"),
                "Biological Sensors",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Biological Sensors"),
                "Geological Sensors",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Geological Sensors"),
                "Stealth Equipment",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Stealth Equipment"),
                "Storm Chamber",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Storm Chamber", ":summary", "Specially shielded chamber designed to be a safe room for particularly dangerous events including radiation flares and decompression."),
                "Tanker Hold",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tanker Hold", ":summary", "The hold is equipped to hold large amounts of liquids or gases at appropriate environments.  This can be used for long range vessels to carry their own fuel or act as a fuel tanker."),
                "Towing Capacity",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Towing Capacity"),
                "Training Facilities",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Training Facilities"),
                "Weapons Locker",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Weapons Locker")
              ),
              ":specialtymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_specialtymap},
                ":Battleship",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Battleship", ":summary", "* A large (3 space) ship dedicated to being a battleship may carry a Spinal Mount weapon.\n* Spinal Mount"),
                "Colony Vessel",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Colony Vessel", ":summary", "* Cryogenic Chamber"),
                "Cargo Vessel",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Cargo Vessel", ":summary", "* Cargo Hold\n* Tanker Hold"),
                "Factory Vessel",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Factory Vessel", ":summary", "* Factory\n* Refinery\n* Tanker Hold"),
                "Heavy Bomber",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Heavy Bomber"),
                "Heavy Carrier",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Heavy Carrier", ":summary", "* A large (3 space) ship dedicated to being a carrier can carry 1 extra unit (4 units) in its Hanger.\n* Hanger\n* Launch Catapult"),
                "Luxury Vessel",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Luxury Vessel", ":summary", "* Living Quarters\n* Luxury Facilities"),
                "Prison Vessel",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Prison Vessel"),
                "Science Vessel",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Science Vessel", ":summary", "* Science Lab\n* Sensor Arrays"),
                "Search and Rescue Vessel",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Search and Rescue Vessel", ":summary", "* Wide array of sensors\n* Multipurpse rescue vehicles\n* Heavy construction equipment\n* Emergency medical facilities\n* Space for evacuation and emergency supplies"),
                "Stealth Vessel",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Stealth Vessel", ":summary", "* Cloaking Device\n* ECM\n* Stealth Equipment"),
                "Transport Vessel",
                vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Transport Vessel", ":summary", "* Living Quarters")
              )
            ),
            "Electronics",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Electronics"),
            "Engine",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Engine"),
            "Factory",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Factory"),
            "Laboratory",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Laboratory"),
            "Life Support",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Life Support"),
            "Vehicle Systems",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Vehicle Systems")
          ),
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
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Air", "Cold", "Earth", "Elecricity", "Fire", "Water", "Weather")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Energy and Forces",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Dimensional", "Energy Manipulation", "Explosive", "Forces", "Gravity", "Heat", "Inertia", "Light", "Magnetism", "Radiation", "Sound", "Temporal", "Vibration")
        )
      )
    )
    return output
  }

  /**
   * @function chapter_enhancement_powers
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_enhancement_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_enhancement_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_enhancement_powers
  }

  // (func chapter_enhancement_powers)
  static f_chapter_enhancement_powers(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Enhancement Powers",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Physical Enhancement"),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Mental Enhancement",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Genius")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Psychic Enhancement",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Charm", "Psychic Power")
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
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Primal Force")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Projectiles",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Ropes")
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
   * @function chapter_mental_powers_and_weaknesses
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_mental_powers_and_weaknesses = {
    vx_type: vx_core.t_type
  }
  static e_chapter_mental_powers_and_weaknesses = {
    vx_type: nx_tactics_books_powers.t_chapter_mental_powers_and_weaknesses
  }

  // (func chapter_mental_powers_and_weaknesses)
  static f_chapter_mental_powers_and_weaknesses(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Mental Powers and Weaknesses",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Mental Powers",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Domination", "Empathy", "Illusion", "Intuition", "Madness", "Mastermind", "Mental Combat", "Mental Connection", "Mental Fortitude", "Mental Weakness", "Mind Over Matter")
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
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Movement: Dig", "Movement: Dimensional", "Movement: Flight", "Movement: Ground", "Movement: Interstellar", "Movement: Space", "Movement: Teleportation", "Movement: Time", "Movement: Water")
        )
      )
    )
    return output
  }

  /**
   * @function chapter_physical_powers_and_weaknesses
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_physical_powers_and_weaknesses = {
    vx_type: vx_core.t_type
  }
  static e_chapter_physical_powers_and_weaknesses = {
    vx_type: nx_tactics_books_powers.t_chapter_physical_powers_and_weaknesses
  }

  // (func chapter_physical_powers_and_weaknesses)
  static f_chapter_physical_powers_and_weaknesses(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Physical Powers and Weaknesses",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Physical Powers",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Agility", "Appearance", "Armored", "Fortitude", "Healing", "Movement", "Natural Weaponry", "Quickness", "Senses", "Shielding", "Strength")
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
            "Armor-Piercing (AP)",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Armor-Piercing (AP)", ":summary", "* Specifically designed to target armored units."),
            ":Anti-Armor",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Anti-Armor", ":summary", "* Specifically designed to tear apart armor to leave target open to further attacks."),
            ":Anti-Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Anti-Missile", ":summary", "* Specifically designed to intercept high speed targets moving in a straight line."),
            ":Anti-Personnel",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Anti-Personnel", ":summary", "* Specifically designed to attack man-sized targets."),
            ":Anti-Shield",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Anti-Shield", ":summary", "* Specifically designed to reduced [Shielding]."),
            ":Aura",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Aura", ":summary", "* Radial effect encompassing the current space and continuing for Level Range."),
            ":Beam",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Beam", ":summary", "* Rectangular shaped effect 1 space wide.\n* [-1 Skill] for each 2 Spaces of Range"),
            "Chain Reaction",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Chain Reaction"),
            ":Cloud",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Cloud"),
            ":Cluster",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Cluster"),
            ":Column",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Column", ":summary", "* Rectangular shaped effect starting at 1 space wide and widening to 3 spaces.\n* [Action]: [-2 Skill] for each Space of Range"),
            ":Cone",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Cone", ":summary", "* Triangle shaped effect starting at 1 space wide and widening by 1 additional space for every 2 spaces of range.\n* [Action]: [-2 Skill] for each Space of Range"),
            ":Fork",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Fork"),
            ":Haywire",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Haywire", ":summary", "* Attack that damages electrical systems."),
            "Hidden Effect",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Hidden Effect", ":summary", "Effect cannot be detected through normal means."),
            "High-Explosive (HE)",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "High-Explosive (HE)", ":summary", "* [Targetting]: Target a space.  All units in that space and surrounding spaces are attacked.\n* [Damage]: All target's are [+2 Armor] against this attack.\n* [Damage]: Units surrounding the space are attacked at -1 Damage for each space distant.\n\nAdvanced:\n* Instead of standard [High Explosive (HE)] rules the following may be used to more accurately simulate the damage exponential decrease in energy of explosives.\n* [Targetting]: Target a space. All units in that space and surrounding spaces are attacked.\n* [Damage]: All target's are [+2 Armor] against this attack.\n* [Damage]: Units surrounding the space are attacked by dividing the energy (in Joules, or tons of TNT) using the following reduction pattern for each space distant: 1/1, 1/3, 1/10, 1/30, 1/100, 1/300, 1/1000, etc. Then look up the new damage based on the new energy level."),
            ":Homing",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Homing", ":titles", "Guided, Seeking"),
            ":Indirect",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Indirect", ":summary", "* May use [Indirect Fire] ability to attack without [Line of Sight]."),
            "Pushing the Limits",
            vx_core.f_new({"any-1": nx_tactics_base.t_modifier}, ":name", "Pushing the Limits", ":summary", "Powers may be increased temporarily, but this runs a risk of damaging or permanently altering the subject or his powers in some way. This may even increase the power but may create [Aberrations]."),
            ":Ring",
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
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_powermap},
            "Special Ability",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Special Ability",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                ":Cannibal",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cannibal", ":summary", "* [Requires]: Close Combat\n* [Attack]: Each [Critical Hit] may remove a [Damage Token] from this unit."),
                ":Chaotic",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Chaotic"),
                ":Corrupted",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Corrupted"),
                ":Ethereal",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ethereal"),
                "Feeding Frenzy",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Feeding Frenzy"),
                ":Giant",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Giant"),
                ":Huge",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Huge"),
                "Lernaean Poison",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Lernaean Poison"),
                ":Mindless",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mindless", ":summary", "* 0 [Mind]\n* Cannot use any Mind Abilities\n* Immune to Abilities that target [Mind]."),
                ":Monstrous",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Monstrous"),
                "Nemean Invulnerability",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Nemean Invulnerability"),
                "Rapid Metabolism",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Rapid Metabolism"),
                ":Savage",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Savage", ":summary", "* Must Attack if able.\n* Ignores Fear, Despair, and Morale"),
                ":Skeletal",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Skeletal", ":summary", "* +1 Body\n* Ignores [Bleeding], [Poison], and [Disease]"),
                ":Soulless",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulless", ":summary", "* A soulless unit is not truly alive.  It may not use or gain Spirit skills."),
                ":Tainted",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tainted")
              )
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Weaknesses",
          ":powermap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_powermap},
            "Physical Weakness",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Physical Weakness",
              ":summary",
              "A being that has a great deal of power becomes increasingly inhuman as power increases. Physical powers become harder to conceal growing increasingly monstrous and mentality leans more toward megalomania, messiah complex, or detached alien.",
              ":titles",
              "Aberrations, Inhumanity, The Price of Power, Taint",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                ":Allergy",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Allergy", ":summary", "Affected by substances or energies that have little or no effect on normal people."),
                ":Asthma",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Asthma"),
                ":Atrophy",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Atrophy", ":summary", "* One or more limbs has limited mobility"),
                ":Blind",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blind"),
                ":Brittle",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Brittle"),
                ":Child",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Child", ":summary", "* You are still a child and have difficulty getting others to take you seriously. This is usually taken with [Short]."),
                "Cold Blooded",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cold Blooded"),
                "Color Blindness",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Color Blindness"),
                ":Contagious",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Contagious", ":summary", "Spreads disease."),
                ":Clumsy",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Clumsy"),
                ":Deaf",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Deaf"),
                ":Deformity",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Deformity", ":summary", "* Reduces Social Skills and some Physical Skills."),
                ":Disfigured",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Disfigured", ":summary", "* Reduces Social Skills dramatically."),
                "Extra Body Parts",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Extra Body Parts"),
                "Hard of Hearing",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hard of Hearing"),
                ":Lame",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Lame", ":summary", "* Reduces Speed"),
                ":Leprosy",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Leprosy"),
                "Missing Body Parts",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Missing Body Parts"),
                ":Mute",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mute"),
                ":Obvious",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Obvious", ":summary", "* Easy to detect and target", ":titles", "Large Profile"),
                "Obvious Signature",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Obvious Signature", ":summary", "* Easy to identify and track", ":titles", "Energy Signature, Heat Signature"),
                ":Numb",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Numb"),
                ":Old",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Old"),
                ":Paralyzed",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paralyzed"),
                "Parasitic Infection",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Parasitic Infection"),
                "Peeling Skin",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Peeling Skin"),
                "Poor Vision",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poor Vision"),
                ":Short",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Short", ":summary", "* This minor weakness reduces vision over objects and movement speed.\n* It can, however, provide benefits to [Stealth]."),
                ":Sterile",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sterile", ":summary", "* May not produce offspring"),
                ":Tasteless",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tasteless"),
                "Temperature Control Problem",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Temperature Control Problem", ":summary", "* Cannot regulate temperature correctly"),
                "Terminal Condition",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Terminal Condition"),
                "Unusual Appearance",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Unusual Appearance"),
                "Unusual Diet",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Unusual Diet", ":summary", "* Minor: Eat wood, garbage, hair, etc.\n* Major: Eat metal, energy\n* Extreme: Eat blood, human flesh, plutonium"),
                "Unusual Eyes",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Unusual Eyes", ":summary", "* Minor: Strange colored\n* Major: Animal-like, or glowing eyes\n* Extreme: Bug-eyes, or no eyes"),
                "Unusual Limbs",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Unusual Limbs", ":summary", "Gnarled, segmented, snake-like, eloganted or other bizarre looking limbs"),
                "Unusual Musculature",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Unusual Musculature", ":summary", "Bulging muscles or wasted looking"),
                "Unusual Skin",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Unusual Skin", ":summary", "* Minor: Strange colored\n* Major: Furry, Striped, Glowing\n* Extreme: Translucent, Reptilian, Rock-like, Exoskeleton, Oozing"),
                "Unusual Vulnerability",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Unusual Vulnerability", ":reference", "Kryptonite, Severe Allergies", ":summary", "* Take damage from things that are not dangerous to ordinary people."),
                ":Vulnerability",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vulnerability", ":summary", "* Take additional damage from certain effects"),
                "Vulnerable to Bleeding",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vulnerable to Bleeding"),
                "Vulnerable to Electricity",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vulnerable to Electricity"),
                "Vulnerable to Fire",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vulnerable to Fire"),
                "Vulnerable to Heat",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vulnerable to Heat"),
                "Vulnerable to Impact",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vulnerable to Impact"),
                "Vulnerable to Piercing",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vulnerable to Piercing"),
                "Vulnerable to Radiation",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vulnerable to Radiation"),
                "Vulnerable to Slashing",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vulnerable to Slashing"),
                ":Wasting",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Wasting")
              )
            ),
            "Social Weakness",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Social Weakness",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                ":Awkward",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Awkward"),
                ":Hideous",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hideous"),
                ":Hunted",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hunted"),
                ":Naive",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Naive"),
                ":Nemesis",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Nemesis"),
                ":Noble",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Noble"),
                ":Notorious",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Notorious"),
                "Speech Impediment",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Speech Impediment"),
                ":Strangeness",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Strangeness"),
                ":Terrifying",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Terrifying"),
                ":Timid",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Timid"),
                ":Ugly",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ugly"),
                "Unnatural Presense",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Unnatural Presense", ":summary", "* Subtly disturbing, homely, or too perfect and inspires negative attention from others."),
                ":Ward",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ward", ":summary", "* You are devoted to taking care of another (who happens to get into trouble a lot).")
              )
            ),
            "Weakness: Cursed",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Weakness: Cursed"),
            "Weakness: Dark Fate",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Weakness: Dark Fate"),
            "Weakness: Haunted",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Weakness: Haunted")
          )
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
        nx_tactics_books_powers.f_chapter_mental_powers_and_weaknesses(tactics),
        nx_tactics_books_powers.f_chapter_movement_powers(tactics),
        nx_tactics_books_powers.f_chapter_physical_powers_and_weaknesses(tactics),
        nx_tactics_books_powers.f_chapter_body_powers(tactics),
        nx_tactics_books_powers.f_chapter_energy_and_forces(tactics),
        nx_tactics_books_powers.f_chapter_enhancement_powers(tactics),
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
      "chapter_enhancement_powers": nx_tactics_books_powers.e_chapter_enhancement_powers,
      "chapter_godlike_powers": nx_tactics_books_powers.e_chapter_godlike_powers,
      "chapter_mental_powers_and_weaknesses": nx_tactics_books_powers.e_chapter_mental_powers_and_weaknesses,
      "chapter_movement_powers": nx_tactics_books_powers.e_chapter_movement_powers,
      "chapter_physical_powers_and_weaknesses": nx_tactics_books_powers.e_chapter_physical_powers_and_weaknesses,
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
      "chapter_enhancement_powers": nx_tactics_books_powers.t_chapter_enhancement_powers,
      "chapter_godlike_powers": nx_tactics_books_powers.t_chapter_godlike_powers,
      "chapter_mental_powers_and_weaknesses": nx_tactics_books_powers.t_chapter_mental_powers_and_weaknesses,
      "chapter_movement_powers": nx_tactics_books_powers.t_chapter_movement_powers,
      "chapter_physical_powers_and_weaknesses": nx_tactics_books_powers.t_chapter_physical_powers_and_weaknesses,
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

    // (func chapter_enhancement_powers)
    nx_tactics_books_powers.t_chapter_enhancement_powers['vx_value'] = {
      name          : "chapter_enhancement_powers",
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
      fn            : nx_tactics_books_powers.f_chapter_enhancement_powers
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

    // (func chapter_mental_powers_and_weaknesses)
    nx_tactics_books_powers.t_chapter_mental_powers_and_weaknesses['vx_value'] = {
      name          : "chapter_mental_powers_and_weaknesses",
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
      fn            : nx_tactics_books_powers.f_chapter_mental_powers_and_weaknesses
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

    // (func chapter_physical_powers_and_weaknesses)
    nx_tactics_books_powers.t_chapter_physical_powers_and_weaknesses['vx_value'] = {
      name          : "chapter_physical_powers_and_weaknesses",
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
      fn            : nx_tactics_books_powers.f_chapter_physical_powers_and_weaknesses
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
