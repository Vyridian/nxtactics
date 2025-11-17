'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_core_rules {

  /**
   * @function chapter_common_rules
   * @return {chapter}
   */
  static t_chapter_common_rules = {
    vx_type: vx_core.t_type
  }
  static e_chapter_common_rules = {
    vx_type: nx_tactics_books_core_rules.t_chapter_common_rules
  }

  // (func chapter_common_rules)
  static f_chapter_common_rules() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Common Rules",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Anatomy of a Unit",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Anatomy of a Unit",
          ":summary",
          "Scale:\nRatings:\n* Attribute and Skill Rating - Each unit is rated at a certain level in a number of attributes and skills. Attributes rate the power, resistance, and damage capacity in the following areas: Body, Mind, and Spirit. Value is an overall rating of the cost of the unit to aquire or recruit. Skills rate the varied abilities in which this unit is proficient.\n* LevelxScale - Each Rating has two parts: Level and a Scale. The Level is a number from 2 to 10, and the Scale is the number of zeroes added after that number. E.g. 5000 becomes 5x3 (Level 5 x Scale 3).\n* Level/Rating - \n** No Rating - Challenged. Everyday tasks are difficult.\n** Level 1x0 - Everyday. Most people get by with this rating.\n** Level 2x0 - Everyday. Most people get by with this rating.\n** Level 3x0 - Competent. Most healthy adults have some attributes and skills in this range.\n** Level 4x0 - Competent. Most healthy adults have some attributes and skills in this range.\n** Level 5x0 - Veteran. Well trained and highly experienced. Veteran Marines, Commandoes, Paratroopers, SS.\n** Rating 6x0 - Elite. Highest level of training and experience. Special Forces, SAS, Delta Force, Navy SEALs, Airborne Rangers, Green Berets.\n** Rating 7x0 - World Class. Highest training and natural ability. Olympic Athletes, Nobel-winning scientists, Top martial artists.\n** Rating 8x0 - World Class. Highest training and natural ability. Olympic Athletes, Nobel-winning scientists, Top martial artists.\n** Rating 9x0 - Legendary. Realistic Human maximum. Einstein, James Bond.\n** Rating 10x0+ - Superhuman.\n* Scale/Severity - The second part of an attribute or skill Rating is it's scale. Each scale represents a power of 10 greater than the last. The observable universe has a diameter of 9x10^26m or 9:26m, a mass of 1.5x10^53kg or 1.5x52g, and has 1x10^82 atoms. The Planck Length is 10^-35m or 1x-35m. The Tegmark theoretical distance to an identical universe to ours is 10^118m or 1x118m.\n** Scale -2 - Insect Scale. Distance/Size=1cm(.3in), Speed=1cm/s(.3in/s), Mass=100g(~.2lb), Energy=1J, Force=1N(100g lifted 1m), Current=1W\n** Scale -1 - Game Scale. Distance/Size=10cm(3.5in), Speed=10cm/s(3.5in/s, .3kph, .2mph), Mass=1kg(~2.2lb), Energy=10J, Force=10N(1kg lifted 1m), Current=10W(LED Light Bulb, Human energy use/s)\n** Scale 0 - Human Scale. Distance/Size=1m(3ft), Speed=1m/s(3ft/s, 3.5kph, 2mph), Mass=10kg(~22lb), Energy=100J, Force=100N(10kg lifted 1m), Current=100W(Incandesent Light Bulb, Human energy use/s)\n** Scale 1 - Vehicle/Giant Scale. Distance/Size=10m(33ft), Speed=10m/s(30ft/s, 35kph, 20mph), Mass=100kg(~220lb), Energy=1kJ, Force=1kN(100kg lifted 1m), Current=1kW.\n** Scale 2 - Flight Scale. Distance/Size=100m(330ft, Football field), Speed=100m/s(330ft/s, 350kph, 200mph), Mass=1ton, Energy=10kJ, Force=10kN(1ton lifted 1m), Current=10kW.\n** Scale 3 - Super Sonic Scale. Distance/Size=1km(3300ft, 0.6miles), Speed=1km/s(3300ft/s, 3500kph, 2000mph, Mach3), Mass=10ton, Energy=100kJ, Force=100kN(10ton lifted 1m), Current=100kW.",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Body",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Body", ":image", "Tokens/BodyToken.png", ":titles", "Build, Constitution, Endurance, Physique, Size, Stamina, Strength, Toughness", ":reference", "* The nature of existence is obvious. The things I can see and touch are real.", ":summary", "* Physical - The physical resistance of the unit. This is equal to the unit's highest Physical skill. Units with low Body are easily killed.\n* Body is determined by Mass. Fit human male: 8:1 (80kg/175lb). Fit human female: 6:1 (60kg/132lb)."),
            ":Mind",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mind", ":image", "Tokens/MindToken.png", ":reference", "* You're that smart? Let me put it this way. Have you ever heard of Plato, Aristotle, Socrates? Yes. Morons. - Princess Bride\n* The nature of existence is misleading. The atoms of our bodies are 99.99% empty space. The actual particles making up every human alive could be compressed to the size of a sugar cube. We are walking, talking electromagnetic fields.", ":summary", "* Mental - The mental strength of the unit. This is equal to the unit's highest Mental skill. Units with low Mind are easily fooled.\n* Mind is vaguely defined by IQ. IQ=Mind+50. Typical human Mind: 5:1 (100IQ). Brilliant human: 10:1 (150IQ).", ":titles", "Intelligence, Mental Clarity, Mental Strength, Perception, Problem Solving, Learning, Reason, Wits"),
            ":Level",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Level", ":image", "Tokens/CoinToken.png", ":summary", "* The overall power of the unit as well as its cost to purchase or develop.\n* Level is calcuated as follows:\n** List each [Skill] level and [Power] level ordered by descending level.\n** For each [Weakness], go down the list reducing top level by 1.\n** Repeat the following until only 2 skills remain:\n    *** Take the bottom 2 level numbers and replace them with the higher number + 1. E.g. 4 and 2 become 5, 4 and 4 become 5.\n** When 2 skills remain the Level is the highest of the 2. E.g. 5 and 3 become Level 5.", ":titles", "Cost, Level, Value"),
            "Skills, Powers, Abilities, and Specialties",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Skills, Powers, Abilities, and Specialties", ":summary", "* Skills - Skills describe the different skillsets that the unit possesses including combat skills.\n** Examples - Melee, Mechanics, Physics, Medicine, and Military are Skills.\n** Advancement - Raising Skill Levels becomes progressively harder the higher the level.\n* Powers - Powers are similar to skills, but normal humans cannot normally have powers. Powers include Magic and Superpowers as well. Creatures, vehicles and equipment may have powers.\n** Examples - Wizardry, Fire, and Flight are Powers.\n** Advancement - Raising Power Levels does not become progressively harder unlike Skill Levels.\n* Abilities - Abilities are perks that can be activated when the related Skill or Power is used.\n** Examples - Roundhouse Kick is an Ability under the Close Combat Skill.\n** Advancement - Gaining additional Abilities and Specialties is relatively easy.\n* Specialties - Specialties are similar to abilities, but instead of giving perks, specialties make it easier to gain abilities within that specialty.\n** Examples - Swords is a Specialty under the Melee Skill.\n** Advancement - Gaining additional Abilities and Specialties is relatively easy."),
            ":Weaknesses",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Weaknesses", ":summary", "* Weaknesses are optional. They provide character flavor and reduce the [Level] of the unit/item."),
            "Flavor Text",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Flavor Text", ":summary", "Whenever possible, interesting quotes or facts are included with the unit to help establish a mood.")
          )
        ),
        "Core Movement",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Core Movement",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Movement - Infantry",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Movement - Infantry", ":image", "Rules/MoveInfantry.png", ":summary", "* [Move]: [-1 Speed] to move 1 Space in any direction. The [Unit] may change [Facing] to any side before or after moving.")
          )
        ),
        "Core Actions",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Core Actions",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Attack",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Attack", ":summary", "* Find the [Attack Rating] and the [Defense Rating].\n* Draw two hands for each number and compare them.\n* Number cards 1-5 are Misses.  Discard these.\n* Number cards 6-10 are Hits.  Discard an equal number of these from both hands.  It doesn't matter which numbers.\n* Face cards are Critical Hits."),
            "Targeting: Close Combat",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Targeting: Close Combat", ":image", "Rules/TargetingCloseCombat.png"),
            "Targeting: Melee",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Targeting: Melee", ":image", "Rules/TargetingMelee.png"),
            "Targeting: Reach",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Targeting: Reach", ":image", "Rules/TargetingReach.png", ":summary", "* Reach"),
            "Targeting: Ranged",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Targeting: Ranged", ":image", "Rules/TargetingRanged.png", ":summary", "* Point Blank - Any attack with a [Weapon:Ranged] at 10ft (3m) or less.\n+1 [Attack] with pistols, +1 [Defense] with other [Weapon:Ranged].\n* Effective Range - [Weapon:Ranged] have a normal attack within this range. About 30m for pistols. 90m for submachine guns. 300m+ for rifles.\n* Long Range - Attacks can be made beyond the normal range, but their accuracy drops off quickly. +1 [Defense] for each 10% more than effective range.")
          )
        ),
        ":Reactions",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Reactions",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Opportunity Action",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Opportunity Action")
          )
        ),
        "Combat Effects",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Combat Effects",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Aerial Maneuver",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Aerial Maneuver"),
            ":Combination",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Combination"),
            "Crouching Maneuver",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Crouching Maneuver"),
            ":Knockback",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Knockback"),
            ":Knockdown",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Knockdown")
          )
        ),
        "Core Situational Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Core Situational Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Altitude",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Altitude", ":image", "Tokens/AltitudeToken.png", ":reference", "It's over Anakin....I have the HIGH ground. - Obi-Wan Kenobi, Star Wars III", ":summary", "* [Move]: Flying units may gain an Altitude Token by spending [2 Move].\n* [Move]: Flying units may discard any number of Altitude Tokens at any time.  It gets [+1 Move] for each lost\nAltitude until the end of the [Turn].\n* [Action]: +1 [Attack] vs. [Unit] at lower Altitude\n* [Defense]: +1 [Defense] vs [Unit] at lower Altitude"),
            "Dug In",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Dug In", ":summary", "* [Action]: Any ground unit may use an [Action] to 'dig in', gaining [+1 Defense] until it moves from the space\n(even involuntarily).\n* Note: Dug In benefit is cumulative with [Stand Your Ground]."),
            ":Facing",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Facing", ":image", "Maps/Facing.png", ":summary", "* 1 - Fixed Forward.\n* 2 - Left Forward.\n* 3 - Right Forward.\n* Note: When necessary to determine direction randomly, roll a die and use the chart to choose direction."),
            ":Flanking",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Flanking", ":image", "Maps/Flanking.png", ":summary", "* 4 - Left Flank: [+1 Attack]\n* 5 - Right Flank: [+1 Attack]\n* 6 - Blind Spot: [+2 Attack]"),
            ":Hazard",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hazard"),
            ":Prone",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Prone"),
            "Stand Your Ground",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Stand Your Ground", ":summary", "* [Action]: [+1 Action] if you do not move this turn."),
            ":Surrounded",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surrounded", ":image", "Maps/Surrounded.png", ":titles", "Outnumbered"),
            ":Terrain",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Terrain"),
            "Terrain Hazard",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Terrain Hazard")
          )
        ),
        "Core Terms",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Core Terms",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Action",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Action", ":summary", "* The [Unit] may spend half of its [Speed] to use any [Ability] on its [Card].  Note: if the [Unit] is only able to move 1 space this turn, it may still take an Action."),
            ":Card",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Card"),
            ":Collision",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Collision", ":summary", "* When 2 units collide, they each Roll [Body]+[Speed] vs. [Armor] against each other.\n* Either, both, or neither may take damage."),
            ":Difficulty",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Difficulty", ":summary", "* Easy - Quick Game with Basic Rules\n* Medium\n* Difficult\n* Epic - Maximum complexity (and detail).  Often long play or part of a [Campaign].")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_core_maps
   * @return {chapter}
   */
  static t_chapter_core_maps = {
    vx_type: vx_core.t_type
  }
  static e_chapter_core_maps = {
    vx_type: nx_tactics_books_core_rules.t_chapter_core_maps
  }

  // (func chapter_core_maps)
  static f_chapter_core_maps() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Core Maps",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Core Scales",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Core Scales",
          ":summary",
          "* 10^-35m - Plank Scale. Any smaller than this and space seems to have no meaning.\n* 10^-20m - Particle Scale. The smallest particles exist at roughly this scale.\n* 10^-5m - Cell Scale. Bacterium and other cells exist at this scale.\n* 10^10m - Planetary Scale. Planets and moons exist at this scale.\n* 10^25m - Hubble Scale. The entire observable universe is at this scale.\n* ? - Universal Scale. The actual size of the universe, whatever that means.\n* ? - Multiversal Scale. The size of the multiverse, whatever that means.",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Personal Scale",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Personal Scale", ":summary", "Wars are fought at larger scales, but individual interaction is best done at this scale.\n* Round:2s\n* Space:2m (6 ft)\n* 24 x 20 map = 48m x 40m\n* 1 Space/Turn = 1m/s\n* The world record for 100m dash is 10 seconds = 22mph = 36kph = 10m/s = 10 spaces\n* The highest average speed for Marathon: 12mph = 20kph = 5m/s = 5 spaces\n* An average brisk walk: 4mph = 7kph = 2m/s = 2 spaces\n* Light Infantry: A normal person with only light gear: 18mph = 29kph = 8m/s = 8 spaces\n* Medium Infantry: A normal person with medium gear: 13mph = 21kph = 6m/s = 6 spaces\n* Heavy Infantry: A normal person with heavy gear: 9mph = 14kph = 4m/s = 4 spaces\n* Race Car: Takes 3x1 spaces: 100mph = 160kph = 45m/s = 45 spaces\n* Sherman Tank: 6m takes 3x2 spaces: 25mph = 38kph = 10m/s = 10 spaces\n* SBD Dauntless: 10mx12m takes 5x6 spaces: 250mph = 400kph = 110m/s = 110 spaces\n* B-24 Liberator: 20mx33m takes 10x17 spaces:  300mph = 470kph = 130m/s = 130 spaces\n* PT-109: 24m takes 12x4 space: 76kph = 21m/s = 21 spaces\n* USS Enterprise: 240m takes 120x40 spaces: 37mph = 60kph = 17m/s = 17 spaces"),
            "Standard Scale",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Standard Scale", ":summary", "* 1 Turn = 4 seconds\n* 1 Space = 4m (12 ft)\n* 24 x 20 map = 96m x 80m\n1 Round = 2 seconds\n1 Space = 4m\nLight Infantry: 10 man Squad with only light gear: 18mph = 29kph = 8m/s = 4 spaces\nMedium Infantry: A normal person with medium gear: 13mph = 21kph = 6m/s = 3 spaces\nHeavy Infantry: A normal person with heavy gear: 9mph = 14kph = 4m/s = 2 spaces\nRace Car: Takes 2x1 spaces: 100mph = 160kph = 45m/s = 22 spaces\nSherman Tank: 6m takes 2x1 spaces: 25mph = 38kph = 10m/s = 5 spaces\nSBD Dauntless: 10mx12m takes 5x6 spaces: 250mph = 400kph = 110m/s = 55 spaces\nB-24 Liberator: 20mx33m takes 10x17 spaces:  300mph = 470kph = 130m/s = 65 spaces\nPT-109: 24m takes 12x4 space: 76kph = 21m/s = 10 spaces\nUSS Enterprise: 240m takes 120x40 spaces: 37mph = 60kph = 17m/s = 8 spaces"),
            "Large Scale",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Large Scale", ":summary", "* 1 Turn = 15 seconds\n* 1 Space = 15m (50 ft)\n* 24 x 20 map = 360m x 300m"),
            "Modern Naval Scale",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Modern Naval Scale", ":summary", "* Naval Combat - World War II was the turning point of Naval Warfare when air power made traditional naval combat obsolete. Even submarines and torpedoes were insignificant compared to the effect of air power. Map scale is therefore based primarily on aircraft speed.\n* 1 Turn = 5 seconds\n* 1 Space = 80m\n* Infantry: 100 man Company with only light gear: 18mph = 29kph = 8m/s = 40m/turn = 1/2 space (1 space assuming trucks)\n* Race Car: 10 cars in 1 space: 100mph = 160kph = 45m/s = 225m/turn = 3 spaces\n* Sherman Tank: 5 tanks in 1 space: 25mph = 38kph = 10m/s = 50m/turn = 1 space\n* SBD Dauntless: 5 plane Flight in 1 space: 250mph = 400kph = 110m/s = 550 m/turn = 7 spaces\n* B-24 Liberator: 1 plane take 1 space:  300mph = 470kph = 130m/s = 650 m/turn = 8 spaces\n* PT-109: 24m takes 1 space: 76kph = 21m/s = 105m/turn = 1.5 spaces\n* USS Enterprise: 240m takes 3x1 spaces: 37mph = 60kph = 17m/s = 85 m/turn = 1 space"),
            "Tactical Scale",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Tactical Scale", ":summary", "* 1 Turn = 1 hour\n* 1 Space = 50km\n* 24 x 20 map = ?\n* Infantry: 100 man Company with only light gear: 18mph = 29kph = 3/5 space (1 space assuming trucks)\n* Race Car: 10 cars in 1 space: 100mph = 160kph = 3 spaces\n* Sherman Tank: 5 tanks in 1 space: 25mph = 38kph = 4/5 space\n* SBD Dauntless: 5 plane Flight in 1 space: 250mph = 400kph = 8 spaces\n* B-24 Liberator: 1 plane take 1 space:  300mph = 470kph = 9 spaces\n* PT-109: 24m takes 1 space: 76kph = 1.5 spaces\n* USS Enterprise: 240m takes 3x1 spaces: 37mph = 60kph = 1 space"),
            "Strategic Scale",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Strategic Scale", ":summary", "* Infantry to tank ratio: 1000 to 1.\n* 1 Turn = ?\n* 1 Space = ?\n* 24 x 20 map = ?"),
            "Global Scale",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Global Scale", ":summary", "* The World Wars were indeed the first wars to be waged worldwide. The logical scale for modern global events is the world itself.\n* 1 Turn = 3 days\n* 1 Space = 1600km = 1000miles.\n* 24 x 20 map = ?\nThe Earth's circumference is 40,000km.\n* Infantry: 2,000 man Division with trucks: 18mph = 29kph = 3/5 space (1 space assuming trucks)\n* M3 Halftrack: 200 trucks have a range of 280km which it can reach in 4 hours.  At 4 trips/day, it can carry infantry 2 spaces/turn.\n* Sherman Tank: 100 tanks has a range of 120mi = 190km which it can reach in 6 hours.  At 2.5 trips/day, it can move 1 space/turn.\n* SBD Dauntless: 100 planes with a range of 773mi = 1243km which it can reach in 4 hours.  At 3 flights/day, it can move 7 spaces/turn if it can land and refuel in each space.\n* B-24 Liberator: 20 bombers with a range of 3700mi = 6000km which it can reach in 8 hours.  At 2 flights/day, it can move 22 spaces/turn if it can land and refuel every 4 spaces.\n* PT-109: 20 boats have only a 12 hour endurance so is entirely dependent on support ships for long range travel.\n* USS Enterprise: 1 capital ship, 2 light cruiser, and 3 destroyer escorts can cruise at 17mph = 28kph = 672km/day.  It can move 672km * 3 days = 2016km/turn = 1 space/turn.")
          )
        ),
        "Core Maps",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Core Maps",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "City Map",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "City Map"),
            "Land Map",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Land Map"),
            "Town Map",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Town Map")
          )
        ),
        "Core Terrain",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Core Terrain",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Building",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Building", ":image", "Maps/Building.png", ":summary", "* [Move]: Impassable by Vehicles\n* [Defense]: [+1 Defense], Gains [Armor] based on building material and thickness"),
            ":Cliff",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cliff", ":image", "Maps/Cliff.png", ":summary", "* [Move]: Impassable along the cliff edge\n* [Elevation]:+1"),
            ":Hill",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hill", ":image", "Maps/Hills.png", ":summary", "* [Move]:-1\n* [Attack]: [+1 Elevation]\n* [Defense]: [+1 Elevation], Blocks [Line of Sight] to units behind the hill, but not units on the hill."),
            ":Road",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Road", ":image", "Maps/Road.png", ":summary", "-1 [Speed] for each 2 spaces moved (rounded up)", ":titles", "Cobblestones, Dirt Road, Gravel, Highway, Racetrack, Sidewalk, Street"),
            ":Water",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Water", ":image", "Maps/Water.png", ":summary", "* Impassable\n* Depth", ":titles", "Lake, Oasis, Ocean, Pond, Pool, River, Stream, Underwater")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_core_overview
   * @return {chapter}
   */
  static t_chapter_core_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_core_overview = {
    vx_type: nx_tactics_books_core_rules.t_chapter_core_overview
  }

  // (func chapter_core_overview)
  static f_chapter_core_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Core Overview",
      ":summary",
      "* Round - Each Unit takes their turn. When all Units have taken their turn or passed, the Round ends.\n* Turn - Each Unit takes a Turn during a Round.\n** Turn Order - Units take turns in order of the highest [Body] to lowest. The largest units are the most predictable and must activate first.\n** Facing - At any time during your turn, you may change your facing by 45 degrees to any adjacent direction of the 8 compass directions. You may change your facing a maximum of 2 times (a total of 90 degrees) during your turn regardless of how many Move actions you take.\n** Actions - The current may take up to 2 Actions during its Turn.\n*** Move\n**** Simple Move - \n**** Accelerate -\n**** Brake - \n**** Drift - \n** Interrupt - During the Unit's Move, any smaller Unit may interrupt the current Unit and take its Turn immediately. When it has finished its Turn, the interrupted Unit continues. Multiple chained interrupts are possible this way.\n\n** Abilities - Each [Unit] may use up to 2 [Abilities] each [Turn].\nThere are 3 types of [Ability]: [Move], [Attack], and [Action] abilities.  They may be performed in any order but there may only be one [Move] or [Attack] [Ability] used in a turn.  So the following are the allowed combinations: Move/Attack, Attack/Move, Move/Action, Action/Move, Attack/Action, Action/Attack, Action/Action.\n\nDamage Cards:\n\nAmmo Damaged\n\nArmor Rupture\n* Armor Breach\n\nCargo Damage\n* Individual - Lost ammo, water, food\n* Team - Lost ammo, water, food\n* Vehicle - Lost fuel, ammo, water, food, reaction mass\n* Ship - Lost fuel, ammo, water, food (submarine: air)\n* Starship - Lost fuel, ammo, propellant, air, water, food\n\nCrew Damage\n\nCommand Failure\n* Command Control Failure - Commands may not be issued to teams outside command.\n* Helm Control Failure - Cannot change speed or heading until rerouted.\n* Navigation Control Failure - Cannot plot courses or use maps until rerouted.\n* Communication Control Failure - Cannot use communications until rerouted.\n* Sensor Control Failure - Cannot use sensors until rerouted.\n* Weapon Targetting Control Failure - May only fire at current target with current weapon.\n\nCommunication Failure\n\nSensor\n\nControl Failure\n* Throttle Failure - Cannot increase speed.\n* Throttle Failure - Cannot maintain speed. Must increase or decrease speed.\n* Throttle Failure - Cannot reduce speed.\n* Steering Failure - Cannot turn left.\n* Steering Failure - Cannot maintain course. Must turn.\n* Sterring Failure - Cannot turn right.\n* Steering Failure - Cannot ascend.\n* Steering Failure - Cannot maintain altitude. Must ascend or descend.\n* Sterring Failure - Cannot descend.\n* Navigation Failure - Cannot plot a course or use maps.\n* Unstable Controls - Must drift each turn if able.\n\nPower Plant Damage\n* Engine Overheat - -1 Max Power generation\n* Electrical Short - -1 Max Power generation and chance of fire.\n* Electrical Overload - 1 Random System loses power until reset.\n\nEquipment Failure\n\nFire\n* Individual - Clothes or hair catches fire\n* Team\n* Vehicle - Engine Fire\n\nLife Support Failure\n* Vehicle -\n* Ship - Air (submarine: heat, pressure)\n* Starship - Air, heat, pressure\n\nMovement Failure\n* Individual - Leg or Foot Damage\n* Team - Some members can't move without help.\n* Vehicle - Flat tire, slipped tread\n* Ship -\n* Starship -\n\nReduced Visibility\n* Individual - Temporay Blindness (Sweat, dust, blood, smoke)\n* Team - Temporay Blindness (dust, smoke)\n* Vehicle - (dirt on windshield, smoke)\n* Ship - Smoke, Sensor Failure\n* Starship - Sensor Failure\n\nStructural Damage\n* Bulkhead Breach\n* Hull Breach\n\nWeapon Damage",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Why Tactics: Core Rules?",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Why Tactics: Core Rules?", ":summary", "* Tactics is a tactical combat system designed to be played as a board game, a tactical combat game, or as a replacement for the combat portion of a Role Playing Game.  The design goal of Tactics is to simplify the elements of tactical combat while allowing the addition of modules that provide different levels of detail to allow each game to simulate just the aspects the players are interested in.\n       * Tactics: Core Rules is designed to get players started with the Tactics system and allow any number of players to play Tactics as a pickup game.\n       * Setup, gameplay, and winning conditions are all designed to keep things moving.\n       * So why are you still reading this?  Start playing!"),
        "Tactics Design Foundation",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Tactics Design Foundation", ":summary", "* Simple Core Rules\n* Any Scale\n* Any Genre - Ant Colonies to Elves to the Iraq War to Galactic Empires, Realism, History, Fantasy, Sci-Fi, Movies, Anime, and Pulp Fiction in any combination.\n* Any scene - Any scene with any number of players\n* Level of Detail - Selective Realism, Modular\n* Asymmetrical Sides\n* Reenactments\n* Army Building\n* Consistent mechanics - I don't like rule books or tables. I like detail, but not when I have to look it up.\n* Simple math - The general rule is each modifier can add or subtract 1 from an ability. Where possible, keep it simple.\n* Six-sided dice - Square dice have perfect symmetry, are well known, and are common.\n* Many dice - Rolling lots of dice is satisfying. The more dice rolled the more predictable the result on a bell curve. This allows low level abilities to have a realistic chance of rolling a high number while offering high level abilities increasing consistency.\n* Opposed rolls - Rolling dice against other dice allows for both sides to take part in each conflict. Even when there is no opponent there is still fickle fate to vex you.\n* Open-ended rolls - Open-ended dice allows even the most outmatched opponent a chance at victory (e.g. David and Goliath).\n* Critical Hits - Critical Hits keeps the game from becoming too predictable. Unlike open-ended rolls, however, Criticals provide an opportunity to allow flavor and choice into the game.\n* Skills - It is tough to raise skills. Surviving through many situations teach you how to survive again.\n* Terrain and Situation - Taking advantage of the situation is the great equalizer. Outflanking, High Ground, Surrounding are critical advantages in combat.\n* Equipment - Equipment makes a difference, but a suit of armor on an unskilled opponent is not much of a challenge."),
        "How does Tactics compare to other games?",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "How does Tactics compare to other games?", ":summary", "* Vs. Board Games\n* Board games successfully capture the essence of reality while providing very simple mechanics to allow games to progress quickly and smoothly. The problem with board games is that each game targets only one view of a situation and generally cannot be expanded or modified without breaking the core premise of the game. Generally this leads to numerous different games that describe the same material (e.g. Star Wars). Each game focuses on a different aspect of the material with varying degrees of success and almost no overlap. Once the scenes of the game are exhausted, the game loses public interest. Tactics seeks to create a system that can absorb new genres and new material and even allow units from different genres to battle one another. It also seeks to allow the elegant game play that board games offer by keeping the core rules simple and expandable.\n\n* Vs. Collectible Games\n* Collectible Games reinvented the classic board game. Instead of fixed rules, the rules were changeable. These changes can take 2 forms: a new expansion set can introduce new rules and environments, and each card may introduce modifications to existing rules. This approach is brilliant when applied correctly. Each expansion can be a standalone game or a supplement to the original game depending on what is agreed upon before play begins. The problems, however, are numerous. Because Collectible Games are extremely profitable, they tend to create unbalanced, 'power' cards that drive up sales but destabilize the game. I suspect that most of the manufacturers are aware of this problem, but because they are profit driven they are unable to avoid this trap. Another brilliant component of Collectible Games is the notion of a player 'building a deck' that is uniquely constructed using the build rules appropriate to the game. This idea allows each match to be entirely unique and variation is only limited by the imagination of the players. The downside of this is again associated with profits. Constructed decks are very expensive. Casual players lack the patience and resources to construct competitive decks, so games heavily favors the richest, most obsessed player instead of the most skilled player. Tactics seeks to avoid these problems by being free, by keeping deck construction rules simple, and by offering a number of preconstructed scenes. This allows casual players to jump right into the action while allowing hard core players to enjoy themselves by increasing the level of detail instead of increasing the power level.\n\n* Vs. Tactical Games\n* Tactical games have a good understanding of unit tactics, but often do not functionally support individual characters and often over-complicate modifiers and oversimplify rolls and damage. Tactical games are almost universally inappropriate for individual character combat.\n\n* Vs. Role-playing Games\n* RPG games have a strong tactical combat element to them, but they simultaneously over-complicate individual actions while largely ignoring the tactical elements of small unit combat. Tactics attempts to bridge this gap and connect tactical combat with the RPG.")
      )
    )
    return output
  }

  /**
   * @function chapter_core_scenes
   * @return {chapter}
   */
  static t_chapter_core_scenes = {
    vx_type: vx_core.t_type
  }
  static e_chapter_core_scenes = {
    vx_type: nx_tactics_books_core_rules.t_chapter_core_scenes
  }

  // (func chapter_core_scenes)
  static f_chapter_core_scenes() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Core Scenes",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Sample Scenes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Sample Scenes",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            ":Alamo",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Alamo", ":summary", "* One team defends a strong tactical position, from a superior invading army."),
            ":Bandits",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Bandits", ":summary", "* One team carries an unconcealed treasure across the map while the other team tries to steal it."),
            ":Blockade",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Blockade", ":summary", "* One team must successfully cross the map with half of their units. The other team must stop them."),
            "Capture the Flag",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Capture the Flag", ":summary", "* Each team protects their battle standard.  The other team tries to take it."),
            ":Conquest",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Conquest", ":reference", "* Crush your enemies, drive them before you, and hear the lamenting of the women. That is what is best in life. - Conan the Barbarian"),
            "High Score",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "High Score", ":summary", "* Each team tries to score points.  High score wins."),
            "King of the Hill",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "King of the Hill", ":summary", "* Each team attempts to hold a single objective until the clock runs out."),
            "Treasure Hunt",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Treasure Hunt", ":summary", "* Place treasures randomly.  Each team tries to get more than half of them off the map at their starting location.")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_lets_play
   * @return {chapter}
   */
  static t_chapter_lets_play = {
    vx_type: vx_core.t_type
  }
  static e_chapter_lets_play = {
    vx_type: nx_tactics_books_core_rules.t_chapter_lets_play
  }

  // (func chapter_lets_play)
  static f_chapter_lets_play() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Let's Play",
      ":summary",
      "All games start with Setup, consists of a series of Rounds where each unit gets to move and act, and ends when someone achieves Victory.",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Choose a Scene",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Choose a Scene", ":summary", "* Choose a [Scene], generate a [Scene] or pick one randomly from the [Scenes] section of this or any other Tactics book.\n* [Scene Difficulty] - Each [Scene] has a [Difficulty] rating. For the first game, choose Easy.\n* [Victory Conditions] - Each [Scene] defines its own objectives.\n* [Special Rules] - If the [Scene] has [Special Rules], then these rules should be used for this [Scene].\n* [Optional Rules] - If the [Scene] has [Optional Rules], then you may choose to use any or all of them. Remember that more [Rules] tends to increase game time and complexity.  For the first game, ignore [Optional Rules].\n* Gather the required number of [Unit] tokens for this [Scene].\n* Gather one of each of the [Unit] cards, [Terrain] cards, and [Rule] cards in use for this [Scene].\n* If the [Scene] has a number of [Rounds], then set the [Round Clock] to this number."),
        "Choose Teams",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Choose Teams", ":summary", "* Each [Scene] describes a number of [Teams]. Any number of [Players] may be on a [Team].\n* Determine which [Players] are on each [Team] in any way you choose.\n* [Players] should sit with their [Team], preferably facing their opponents. For the first game, determine [Teams] randomly.\n* One [Team] on the [Scene] is marked with a *.  This [Team] has the [Initiative] and goes first."),
        ":Setup",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Setup", ":summary", "* Choose the [Map] described in the [Scene] and lay it out like this: [image:MapDeploy.png].\n* Look at the [Deploy] section of the [Scene].\n* Starting with the [Team] with [Initiative], alternate placing [Terrain] on the Map until all [Terrain] has been placed.\n* Starting with the [Team] with [Initiative], alternate placing their [Units] on the [Map]."),
        "Game Start",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Game Start", ":summary", "Before starting remember the following Golden Rules:\n* Trump - Any special rules in a scene override the standard rules.\n* Rounding - All fractions are ignored."),
        "Game Over",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Game Over", ":summary", "The game ends when any of the following occur:\n* Last Round Ends\n* No Enemy Units Remain\n* Complete Victory condition achieved by any team\n\n* Winning - Each [Team] that acheived a [Complete Victory] condition wins.  If no [Team] acheived a\n[Complete Victory], then each [Team] that acheived a [Partial Victory] condition wins.  Winners gain the [Rewards] for the scene, if any.\n* Ties - Ties are allowed, though any [Rewards] gained are divided by the number of winners.")
      )
    )
    return output
  }

  /**
   * @function chapter_tokens
   * @return {chapter}
   */
  static t_chapter_tokens = {
    vx_type: vx_core.t_type
  }
  static e_chapter_tokens = {
    vx_type: nx_tactics_books_core_rules.t_chapter_tokens
  }

  // (func chapter_tokens)
  static f_chapter_tokens() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Tokens",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "White Tokens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "White Tokens",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Duration",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Duration", ":summary", "* Duration tokens are placed on an ability card when it is activated.\n* When the ability no longer has any duration tokens, it is removed.")
          )
        ),
        "Black Tokens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Black Tokens",
          ":summary",
          "* Permanent Effects that will not normally be removed during a battle such as Damage.",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Treating Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Treating Damage", ":summary", "* Blood Loss, if present, should usually be treated first. This is because Blood Loss can cause death in as little as 4 minutes from a single wound.\n* Shock, if present, should be treated next. It can kill in as little as 30 minutes.\n* Eventually fatal wounds, if any, should be treated next. These wounds become progressively worse kill in from 1 hour to 9 days.\n* Lastly, the wound itself should be treated. Untreated wounds take twice as long to heal on their own."),
            "Healing Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Healing Damage"),
            "Burn Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Burn Damage", ":summary", "* Burn Damage is characterized by shallow wounds with great surface damage. Fire, Acid, Cold, Abrasions, and Radiation all produce Burn Damage."),
            "Concussive Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Concussive Damage", ":summary", "* Concussive Damage affects the entire target at once in a Shockwave. Explosions, Sonic, Vibrations, sudden decelerations like falling and crashes all produce concussive damage."),
            "Impact Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Impact Damage", ":summary", "* Impact Damage is characterized by a generalized blunt trauma in a relatively small area."),
            "Nerve Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Nerve Damage"),
            "Puncture Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Puncture Damage", ":summary", "* Puncture Damage is characterized by a deep wound with little surface damage."),
            "Shock Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Shock Damage", ":summary", "* Shock is a life-threatening medical condition as a result of insufficient blood flow throughout the body. Shock often accompanies severe injury or illness. Medical shock is a medical emergency and can lead to other conditions such as lack of oxygen in the body's tissues (hypoxia), heart attack (cardiac arrest) or organ damage. It requires immediate treatment as symptoms can worsen rapidly.\n            * Types of Shock:\n            ** Septic shock is caused by bacteria. It is treated with antibiotics and fluids.\n            ** Anaphylactic shock is caused by hypersensitivity or allergic reaction. If is treated with diphenhydramine (Benadryl), epinephrine (an \"Epi-pen\"), and steroid medications (solumedrol).\n            ** Cardiogenic shock is from heart damage. It is treated by identifying and treating the underlying cause.\n            ** Hypovolemic shock is from blood or fluid loss. It is treated with fluids (saline) in minor cases, and blood transfusions in severe cases.\n            ** Neurogenic shock is from spinal cord trauma. It is the most difficult to treat as spinal cord damage is often irreversible. Immobilization, anti-inflammatories such as steroids and surgery are the main treatments."),
            "Sickness Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Sickness Damage", ":summary", "* Sickness Damage is characterized by physical and mental weakness. Poison, Disease, and Radiation can all cause Sickness."),
            "Slash Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Slash Damage", ":summary", "* Slash Damage is characterized by long surface wounds of varying depth. If the wounds are sufficiently deep they may remove entire extremities.")
          )
        ),
        ":Status",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Status",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Death",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Death", ":reference", "* Tomorrow is a hope, never a promise. - Kindred (Lamb), Runeterra")
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
    vx_type: nx_tactics_books_core_rules.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Core Rules",
      ":image",
      "warrior_msleal_full.jpg",
      ":chaptermap",
      nx_tactics_base.f_chaptermap_from_chapterlist(
        nx_tactics_books_core_rules.f_chapter_core_overview(),
        nx_tactics_books_core_rules.f_chapter_lets_play(),
        nx_tactics_books_core_rules.f_chapter_common_rules(),
        nx_tactics_books_core_rules.f_chapter_tokens(),
        nx_tactics_books_core_rules.f_chapter_core_scenes(),
        nx_tactics_books_core_rules.f_chapter_core_maps()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_common_rules": nx_tactics_books_core_rules.e_chapter_common_rules,
      "chapter_core_maps": nx_tactics_books_core_rules.e_chapter_core_maps,
      "chapter_core_overview": nx_tactics_books_core_rules.e_chapter_core_overview,
      "chapter_core_scenes": nx_tactics_books_core_rules.e_chapter_core_scenes,
      "chapter_lets_play": nx_tactics_books_core_rules.e_chapter_lets_play,
      "chapter_tokens": nx_tactics_books_core_rules.e_chapter_tokens,
      "tacticsbook": nx_tactics_books_core_rules.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_common_rules": nx_tactics_books_core_rules.t_chapter_common_rules,
      "chapter_core_maps": nx_tactics_books_core_rules.t_chapter_core_maps,
      "chapter_core_overview": nx_tactics_books_core_rules.t_chapter_core_overview,
      "chapter_core_scenes": nx_tactics_books_core_rules.t_chapter_core_scenes,
      "chapter_lets_play": nx_tactics_books_core_rules.t_chapter_lets_play,
      "chapter_tokens": nx_tactics_books_core_rules.t_chapter_tokens,
      "tacticsbook": nx_tactics_books_core_rules.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/core_rules",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_common_rules)
    nx_tactics_books_core_rules.t_chapter_common_rules['vx_value'] = {
      name          : "chapter_common_rules",
      pkgname       : "nx/tactics/books/core_rules",
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
      fn            : nx_tactics_books_core_rules.f_chapter_common_rules
    }

    // (func chapter_core_maps)
    nx_tactics_books_core_rules.t_chapter_core_maps['vx_value'] = {
      name          : "chapter_core_maps",
      pkgname       : "nx/tactics/books/core_rules",
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
      fn            : nx_tactics_books_core_rules.f_chapter_core_maps
    }

    // (func chapter_core_overview)
    nx_tactics_books_core_rules.t_chapter_core_overview['vx_value'] = {
      name          : "chapter_core_overview",
      pkgname       : "nx/tactics/books/core_rules",
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
      fn            : nx_tactics_books_core_rules.f_chapter_core_overview
    }

    // (func chapter_core_scenes)
    nx_tactics_books_core_rules.t_chapter_core_scenes['vx_value'] = {
      name          : "chapter_core_scenes",
      pkgname       : "nx/tactics/books/core_rules",
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
      fn            : nx_tactics_books_core_rules.f_chapter_core_scenes
    }

    // (func chapter_lets_play)
    nx_tactics_books_core_rules.t_chapter_lets_play['vx_value'] = {
      name          : "chapter_lets_play",
      pkgname       : "nx/tactics/books/core_rules",
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
      fn            : nx_tactics_books_core_rules.f_chapter_lets_play
    }

    // (func chapter_tokens)
    nx_tactics_books_core_rules.t_chapter_tokens['vx_value'] = {
      name          : "chapter_tokens",
      pkgname       : "nx/tactics/books/core_rules",
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
      fn            : nx_tactics_books_core_rules.f_chapter_tokens
    }

    // (func tacticsbook)
    nx_tactics_books_core_rules.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/core_rules",
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
      fn            : nx_tactics_books_core_rules.f_tacticsbook
    }

  }
}
