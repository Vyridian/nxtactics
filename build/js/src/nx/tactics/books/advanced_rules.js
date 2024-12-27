'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_advanced_rules {

  /**
   * @function chapter_advanced_rules
   * @return {chapter}
   */
  static t_chapter_advanced_rules = {
    vx_type: vx_core.t_type
  }
  static e_chapter_advanced_rules = {
    vx_type: nx_tactics_books_advanced_rules.t_chapter_advanced_rules
  }

  // (func chapter_advanced_rules)
  static f_chapter_advanced_rules() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Advanced Rules",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Advanced Setup Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Advanced Setup Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Campaigns",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Campaigns", ":summary", "* Starting a New Campaign\n* Creating Player Characters\n* Creating Plots\n* Conflict\n* Creating Scenarios\n* Continuing a Campaign"),
            "Randomized Scenarios",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Randomized Scenarios", ":summary", "* Choose a Map - Any map, indoor or outdoor, square or hex map may be used. The scale must be approximately 1 inch=1.5 meters (5 feet).\n* Choose Starting Positions - Each side rolls 2d6.  From highest to lowest, each side chooses one of the starting positions (usually corners) of the map to start.\n* Deploy Teams - In the same order from highest to lowest each player deploys their teams up to 5 hexes from the edges of the map."),
            "Recruit Teams",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Recruit Teams", ":summary", "* Choose Recruitment Points for each Side.\n* Recruit units by spending these points using the [Double Down] rule.\n* Usually, only units from a single Faction may be purchased.")
          )
        ),
        ":Goals",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Goals",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Experience",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Experience", ":summary", "* Experience allows a unit to gain permanent ability increases.\n* Something major must be on the line, such that if the character fails he will incur a significant loss (e.g. a valuable item, his life). This is why characters seek out high stakes gambles and are not satisfied unless a great deal is on the line.\n* The character must face an opponent or difficulty no more than 1 level below his own or he must declare he is using the [Honor System].\n    * Minor Achievement - Gain an [Latent Ability] 2 levels below your highest level (minimum 1).\n    * Major Achievement - Gain a [Latent Skill] 2 levels below your highest level (minimum 1)."),
            "Latent Skill/Ability",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Latent Skill/Ability", ":summary", "* Latent Skills and Abilities represent potential capabilities that have not yet expressed.\n* Like Skills, they have levels and may be combined and split."),
            "Gain a Skill/Power, Ability/Specialty",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Gain a Skill/Power, Ability/Specialty", ":summary", "* In order to gain a new ability, a user must perform research, practice, and experimentation.\n* Each week of practice and experimentation, the user may draw a Fate card.\n    ** If the Fate is a critical it is successful and may do EITHER of the following:\n    *** Gaining a Skill/Power - The user may convert a [Latent Skill] to a Skill or Power (if\n    allowed) of equal level.\n    *** Gaining an Ability/Specialty - The user may convert or [Latent Ability] into an\n    actual Ability or Specialty on an equal level.\n* Training Area/Laboratory - +1 Die if a dedicated training area with\nappropriate resources is available.\n* Assistants - Assistants reduce the difficulty of a task as well as allowing\nthem to learn on the job. See [Followers].\n* Mentor - +1 Die if a mentor is available.\n* Experimentation - Trial and error can produce some fascinating or useless random results.\n* Invention - Permanent Devices and Enchantments can be created over time.\n** Cost - Great care and cost must be expended to obtain or create an item of\nsufficient quality to hold an enchantment.\n** Difficulty - Inventions may be created instead of acquiring a new ability.\n** Time"),
            "Honor System",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Honor System", ":summary", "* Normally a character cannot gain experience from a foe more than 1 level\nbelow his own. If a character wants to gain experience against such a lower\nlevel foe, he must declare that he wants to compete 'On His Honor' using the\nHonor System.\n* The Honor System basically allows a character to metaphorically (or\nliterally) fight an opponent with one hand tied behind his back.\n* The character must challenge the opponent to a 'fair fight'. The challenge\nmakes the fight formal to any observers and places the character's honor\nsquarely on the line.\n* The character must offer some special incentive if the opponent wins (e.g.\na special treasure, his daughter's hand in marriage, safe passage for his\nopponents, not invading the Earth, his own head on a pike, etc.)\n* For the duration of the challenge, others must not interfere.\n* For the duration of the challenge, the character must refrain from using\nany skills that are more than 1 level higher than the opponent's defense.\nFurther he must limit his own defense rolls to 1 more than the opponents\nskill.\n* If the opponent or his allies breaks these terms, the challenge is void.\n* If the character or his allies breaks these terms, it is a serious blow to\nthe honor of the character and he immediately loses one level from one of his\nhighest skills.\n* If the character wins the competition, he may gain experience normally\nagainst this opponent."),
            ":Study",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Study", ":summary", "* Books\n* Instruction\n* Time"),
            ":Rewards",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rewards", ":summary", "* Survival\n* Experience\n** +1 [Experience] for total or partial victory in the adventure.\n** +1 [Experience] for surviving life or death.\n** +1 [Experience] for the exceptional role playing and maintaining character concept.\n** +1 [Experience] for particularly heroic or infamous public actions (i.e. fame spread).\n** +1 [Experience] point toward a specific skill for training under a master 3 or more levels over your own.\n** +1 [Experience] point toward a specific skill after 1 month of experimentation. Experimentation requires\nexpense commensurate with the level of the skill.\n* Treasure\n* Knowledge\n* Favor\n* Allies\n* Influence\n* Prestige\n* Patronage"),
            ":Treasure",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Treasure", ":summary", "A Treasure Roll is made when a random treasure is needed.")
          )
        ),
        "Turn Sequence Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Turn Sequence Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Take the Initiative",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Take the Initiative"),
            "Simultaneous Movement",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Simultaneous Movement", ":summary", "* After initiative is determined, each player chooses a unit or formation to activate. Each unit is compared to determine the one with the highest movement. This number is the number of phases in this turn. Each unit may choose to move or act on any phase of the turn with their chosen unit. They may also choose to react with any other unit, but a reacting unit may only move or use an action not both.")
          )
        ),
        "Action Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Action Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Dramatic Clinch",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Dramatic Clinch", ":summary", "* During Melee or Close Combat, if the [Defense Roll] exactly cancelled the [Attack Roll], the [Units]\nmay enter a Clinch where they may speak to one another briefly without anyone overhearing."),
            "Dramatic Effect",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Dramatic Effect", ":summary", "* At the discretion of the other players, [Critical Hits] may be spent to describe a dramatic display\nof skill.  This has no game effect but add great flavor to the game."),
            ":Formation",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Formation", ":summary", "* [Move]: Use half [Speed] to add a formation token of the appropriate type.\n* [Damage]: If a unit takes 2 [Retreats], remove its formation token.\n* Note: A unit only have 1 formation at a time."),
            "Limited Dice",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Limited Dice", ":summary", "* Note: Limited and Synergy dice cancel each other in equals numbers so no roll may have both Synergy and Limited dice.\n* 1, 2, 3, 4, 5 = No Effect\n* 6 = Hit and roll a Critical Die"),
            "Multiple Actions",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Multiple Actions", ":summary", "If the [Unit] has multiple [Crew] members, then each member may use a DIFFERENT [Ability] this turn."),
            "Synergy Dice",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Synergy Dice", ":summary", "* Abilities that work together should be a benefit without breaking game balance.  Synergies allow skills and equipment to work together without unbalancing the game or requiring specific combinations of abilities to be effective.\n* Note: Limited and Synergy dice cancel each other in equals numbers so no roll may have both Synergy and Limited dice.\n* 1, 2, 3 = No Effect\n* 4, 5 = Hit\n* 6 = Hit and roll 2 Critical Dice")
          )
        ),
        "Advanced Situational Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Advanced Situational Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Off Handed",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Off Handed", ":reference", "I admit it.  You are better than I am.  Then why are you smiling?  Because I know something you don't know...I am\nnot left handed...There's something I ought to tell you...I am not left handed either. - Princess Bride", ":summary", "* [Action]: -1 If an ability normally requires 2 hands to perform and only one hand is available."),
            ":Surprised",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Surprised", ":summary", "If one or more units are Surprised, they lose their [Action] this [Turn] and lose half of their [Speed].")
          )
        ),
        "Effect Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Effect Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Cold",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cold", ":summary", "* [Critical Hits] may be used for [Slow Tokens]"),
            ":Electricity",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Electricity", ":summary", "* [Critical Hits] may be used to place 2 [Stun] each (or 2 [Damage] each if the target is [Mechanical])", ":titles", "Electric Shock, Lightning"),
            ":Flame",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Flame", ":summary", "* [Critical Hits] may be used for [Fire Tokens]"),
            ":Infection",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Infection"),
            "Internal Bleeding",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Internal Bleeding"),
            "Permanent Disability",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Permanent Disability", ":titles", "Aneurysm, Brain Damage, Crippling, Nerve Damage, Paralysis, Stroke"),
            ":Piercing",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Piercing", ":summary", "* [Damage]: [Critical Hits] may be used to roll 2 more [Damage] dice each."),
            ":Slashing",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Slashing", ":summary", "* [Damage]: [Critical Hits] may be used for [Bleeding Tokens]."),
            ":Smoke",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Smoke"),
            ":Resistant",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Resistant", ":summary", "* Armor rolls are doubled on a [Unit] that is stuck by an attack to which it is resistant.  Minimum: 2 dice."),
            "System Shock",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "System Shock", ":summary", "* When the body sustains a significant amount of damage, the body goes into shock.")
          )
        ),
        "Hit Location Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Hit Location Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Hit Location",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location", ":summary", "* People and machines are durable but complex and are generally easier to disable than destroy completely.\n* A player may choose any number of [Critical Hits] to spend on special effects based on [Hit Location].\n* Roll once on the following table for each [Critical Hits] spent:\n** 6 - Attacker Chooses Hit Location\n** 5 - [Hit Location - Head] or [Hit Location - Command]\n** 4 - [Hit Location - Arms] or [Hit Location - Weapons]\n** 3 - [Hit Location - Chest] or [Hit Location - Mission]\n** 2 - [Hit Location - Vitals] or [Hit Location - Special Systems]\n** 1 - [Hit Location - Legs] or [Hit Location - Movement]\n\n** 6 - Head\n** 5 - Far Arm (including shoulder)\n** 4 - Near Arm (including shoulder)\n** 3 - Vitals\n** 2 - Near Leg (including hip)\n** 1 - Far Leg (including hip)"),
            "Hit Location - Head",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Head"),
            "Hit Location - Command",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Command", ":summary", "* 6 - Command: Unit skips its next turn.\n* 5 - Crew: Half of crew in space killed\n* 4 - Passengers: Half of Passengers in space killed.\n* 3 - Life Support System: 1 Life support or climate control system is Reduced by 1/2.\n* 2 - Safety System: 1 Safety or escape system is disabled.  A second hit destroys it.\n* 1 - Electronics: 1 Sensor, computer, or communication system is disabled.  A second hit destroys it."),
            "Hit Location - Arms",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Arms"),
            "Hit Location - Weapons",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Weapons", ":summary", "* 5-6 - Weapon: 1 Weapon damage is reduced by 1.\n* 3-4 - Arc of Fire: 1 weapon loses 1 arc of fire.\n* 1-2 - Magazine: 1 Weapon rolls Damage against own unit with 1/2 Armor Defense"),
            "Hit Location - Chest",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Chest"),
            "Hit Location - Mission",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Mission", ":summary", "* 4-6 - Armor: Armor Facing is reduced by 1.\n* 1-3 - Cargo: Half of Cargo in space destroyed."),
            "Hit Location - Vitals",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Vitals"),
            "Hit Location - Special Systems",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Special Systems", ":summary", "* 4-6 - Special Equipment: 1 special system is disabled.  A second hit destroyes it.\n* 1-3 - Fire: Fire Token"),
            "Hit Location - Legs",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Legs"),
            "Hit Location - Movement",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hit Location - Movement", ":summary", "* 6 - Engine: Acc and recharging reduced by 1/4.\n* 5 - Movement: Acc and Max Speed for 1 movement system reduced by 1/4 (minimum 1).  If it loses all Movement in the currently used Movement type, it will crash or sink as applicable.\n* 4 - Manueverability: -1 Facing changes per turn\n* 1-3 - Fuel/Reaction Mass: Range reduced by 1/4")
          )
        ),
        "Damage Cards",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Damage Cards",
          ":damagemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_damagemap},
            "Air Reserve Loss",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Air Reserve Loss"),
            "Air Circulation Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Air Circulation Failure"),
            "Air Purification Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Air Purification Failure"),
            "Attitude Control Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Attitude Control Malfunction"),
            "Cargo Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Cargo Damage"),
            "Cargo Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Cargo Fire"),
            "Cargo Loss",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Cargo Loss"),
            "Crew Casualties",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Crew Casualties"),
            "Crew Quarters Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Crew Quarters Fire"),
            "Fire Suppression Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Fire Suppression Failure"),
            "Movement Impaired",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Movement Impaired", ":summary", "* Effect: -25% [Move]\n* Duration: Permanent until unit spends an entire turn repairing."),
            "Movement Crippled",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Movement Crippled", ":summary", "* Effect: -25% [Move]\n* Duration: Permanent until healed."),
            "Movement Control Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Movement Control Failure", ":summary", "* Unit must move at full speed until repaired."),
            "Artificial Gravity Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Artificial Gravity Malfunction"),
            "Bridge Damaged",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Bridge Damaged"),
            "Bridge Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Bridge Explosion"),
            "Bridge Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Bridge Fire"),
            "Bulkhead Collapse",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Bulkhead Collapse"),
            "Cargo Hold Damaged",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Cargo Hold Damaged"),
            "Cargo Hold Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Cargo Hold Explosion"),
            "Cargo Hold Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Cargo Hold Fire"),
            "Central Computer Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Central Computer Malfunction"),
            "Central Computer Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Central Computer Explosion"),
            "Central Computer Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Central Computer Fire"),
            "Command and Control Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Command and Control Failure"),
            "Communications Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Communications Failure", ":summary", "* Unit cannot communicate with other units.\n* In Game: Player may not speak. He/she may write rules questions to game master or opponents."),
            "Crew Quarters Damaged",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Crew Quarters Damaged"),
            "Damage Control Damaged",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Damage Control Damaged"),
            "Engineering Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Engineering Damage"),
            "Fire Control System Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Fire Control System Malfunction"),
            "Flag Bridge Damaged",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Flag Bridge Damaged", ":summary", "* The Flag Bridge is used by senior executive officers to coordinate a fleet."),
            "Food Stock Damaged",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Food Stock Damaged"),
            "Fuel Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Fuel Explosion"),
            "Fuel Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Fuel Fire"),
            "Fuel Loss",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Fuel Loss"),
            "Helm Control Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Helm Control Malfunction"),
            "Helm Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Helm Fire"),
            "Hydroponics Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Hydroponics Damage"),
            "Inertial Dampener Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Inertial Dampener Malfunction"),
            "Intercommunications Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Intercommunications Failure", ":summary", "* Unit cannot communicate within the vehicle except person to person. On large vehicles, this can be a localized failure."),
            "Life Support Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Life Support Malfunction"),
            "Medical Bay Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Medical Bay Damage"),
            "Medical Bay Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Medical Bay Explosion"),
            "Medical Bay Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Medical Bay Fire"),
            "Missile Launcher Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Missile Launcher Explosion"),
            "Missile Launcher Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Missile Launcher Malfunction"),
            "Missile Magazine Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Missile Magazine Explosion"),
            "Missile Magazine Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Missile Magazine Fire"),
            "Movement Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Movement Malfunction"),
            "Navigation Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Navigation Failure"),
            "Navigation Light Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Navigation Light Failure", ":summary", "* The vehicles navigation/landing lights are not working across all spectrums. In combat, these lights are normally off anyway, but they make any landing or docking manuever much more perilous."),
            "Passenger Quarters Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Passenger Quarters Explosion"),
            "Passenger Quarters Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Passenger Quarters Fire"),
            "Power Control Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Power Control Failure"),
            "Power Plant Coolant Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Power Plant Coolant Failure"),
            "Power Plant Damage",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Power Plant Damage"),
            "Power Plant Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Power Plant Explosion"),
            "Power Plant Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Power Plant Fire"),
            "Power Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Power Failure"),
            "Propellent Loss",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Propellent Loss"),
            "Remote Systems Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Remote Systems Malfunction", ":summary", "* Command over drones is lost."),
            "Secondary Bridge Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Secondary Bridge Explosion"),
            "Secondary Bridge Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Secondary Bridge Fire"),
            "Secondary Bridge Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Secondary Bridge Malfunction"),
            "Sensor (Short Range) Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Sensor (Short Range) Malfunction"),
            "Sensor (Long Range) Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Sensor (Long Range) Malfunction"),
            "Shield Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Shield Malfunction"),
            "Spine Cracks",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Spine Cracks"),
            "Steering Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Steering Malfunction", ":summary", "* Unit can only perform 1 change in direction during a Move."),
            "Structural Collapse",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Structural Collapse"),
            "Target Aquisition Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Target Aquisition Failure"),
            "Temperature Control Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Temperature Control Failure"),
            "Turning Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Turning Malfunction", ":summary", "* Unit cannot turn toward one side."),
            "Transponder Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Transponder Failure", ":summary", "* The vehicle no longer identifies as friend of foe, so it appears as a potential enemy vehicle. In a heated exchange it may take friendly fire.\n* This can be as simple as a fallen flag on old navy ships.", ":titles", "IFF Damage, Not Running Colors"),
            "Water Reserve Loss",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Water Reserve Loss"),
            "Weapon Magazine Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Weapon Magazine Explosion"),
            "Weapon Magazine Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Weapon Magazine Fire"),
            "Weapon Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Weapon Malfunction"),
            "Weapon Explosion",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Weapon Explosion"),
            "Weapon Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Weapon Fire"),
            "Weapon Power Failure",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Weapon Power Failure"),
            "Weapon Traverse Malfunction",
            vx_core.f_new({"any-1": nx_tactics_base.t_damage}, ":name", "Weapon Traverse Malfunction")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_advanced_rules_overview
   * @return {chapter}
   */
  static t_chapter_advanced_rules_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_advanced_rules_overview = {
    vx_type: nx_tactics_books_advanced_rules.t_chapter_advanced_rules_overview
  }

  // (func chapter_advanced_rules_overview)
  static f_chapter_advanced_rules_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Advanced Rules Overview",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Why Tactics: Advanced Rules?",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Why Tactics: Advanced Rules?", ":summary", "The Tactics:Basic Rules are sufficient for running a board game, but they lack detail when simulating a specific genre. The Tactics system is designed to allow different sets of rules to be plugged into the basic rules on an ala carte basis. This Advanced Rule book provides many of the optional rules necessary to increase realism or pseudo-realism. The other genre-based rule books will add rules that are specific to each genre."),
        "Advanced Rules Strategies",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Advanced Rules Strategies", ":summary", "* Strike First - Units are immediately penalized for damage taken, so do unto others before they do unto you.\n* Maintain a Threat - The battlefield changes with each unit's move, so use pawns to control the map while saving powerful and valuable units until later in the Round.  If you are not careful your opponent will surround and eliminate your units that have already acted.\n* Hold the Line - Opportunity and Hold Off abilities are deadly and allow you to protect weaker units.\n* Use the Terrain - Cover and abilities linked to cover offer an outstanding defense that layers with normal defense. The difference is most pronounced with lesser units. Effective use of terrain will determine the victor in most battles.")
      )
    )
    return output
  }

  /**
   * @function chapter_advanced_tokens
   * @return {chapter}
   */
  static t_chapter_advanced_tokens = {
    vx_type: vx_core.t_type
  }
  static e_chapter_advanced_tokens = {
    vx_type: nx_tactics_books_advanced_rules.t_chapter_advanced_tokens
  }

  // (func chapter_advanced_tokens)
  static f_chapter_advanced_tokens() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Advanced Tokens",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Advanced White Tokens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Advanced White Tokens",
          ":summary",
          "White tokens represent temporary conditions that will pass quickly.\n* [Activate]: Remove one White token.",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Faith",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Faith", ":image", "Tokens/FaithToken.png"),
            ":Rage",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rage", ":image", "Tokens/RageToken.png", ":summary", "+1 Attack\n-1 Defense\n-1 All other Abilities that are not Attacks\n* Ignore 1 Retreat for each Rage")
          )
        ),
        "Advanced Black Tokens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Advanced Black Tokens",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Aging",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Aging", ":summary", "* Reduces all Abilites and Life Span."),
            ":Blindness",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Blindness"),
            ":Crippled",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Crippled", ":image", "Tokens/CrippledToken.png", ":summary", "-1 [Speed]", ":classification", "Black Token"),
            ":Curse",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Curse", ":summary", "* [Anytime]: When unit gains a [Red Token] or a [Black Token], roll for each Curse Token.\n* For each [Hit], replace a Curse Token with a Token of any type just gained."),
            ":Depression",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Depression"),
            ":Insanity",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Insanity"),
            ":Petrified",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Petrified"),
            ":Radiation",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Radiation", ":image", "Tokens/RadiationToken.png"),
            ":Shapeshift",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Shapeshift")
          )
        ),
        "Advanced Red Tokens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Advanced Red Tokens",
          ":summary",
          "* Red tokens represent conditions that can rapidly grow out of control.\n* [Activate]: Add one Stun token.",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Acid",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Acid", ":summary", "* May use a [Move] to remove an Acid Token.\n* [End of Turn] - Roll Acid Tokens.  Hits do Damage.  Remove an Acid Token.")
          )
        ),
        "Green Tokens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Green Tokens",
          ":summary",
          "* Green Tokens represent conditions that generally grow worse over time.",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Disease",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Disease", ":image", "Tokens/DiseaseToken.png", ":summary", "Spreading, slow damage over time", ":titles", "Diseased, Infected, Rabid, Sickly"),
            ":Envy",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Envy"),
            ":Fatigue",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Fatigue", ":summary", "-1 [Abilities]\n* Removed with rest"),
            ":Greed",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Greed"),
            ":Hunger",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hunger", ":summary", "-1 [Abilities] per week without food\n* Removed after eating"),
            ":Love",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Love"),
            ":Lust",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Lust"),
            ":Poison",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Poison", ":image", "Tokens/PoisonToken.png"),
            ":Suffocation",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Suffocation", ":summary", "-1 [Abilities]\n+1 Suffocation per minute without air\n* Each Suffocation after 2 also add [Damage]\n* Remove 1 Suffocation each 10 minutes of breathing"),
            ":Thrist",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Thrist", ":summary", "-1 [Abilities]\n+1 Thirst per day without drink\n* Remove 1 Thirst each day with ample drinking")
          )
        ),
        "Advanced Purple Tokens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Advanced Purple Tokens",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Ace",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Ace", ":image", "Tokens/AceToken.png", ":summary", "* [Action]: [+1 Skill]\n* [Defense]: [+1 Defense]", ":titles", "Elite", ":classification", "Purple Token"),
            ":Apathy",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Apathy", ":classification", "Purple Token"),
            ":Hidden",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hidden", ":summary", "* [Action]: A unit with Hidden tokens is not actually at the location shown by its unit marker.\n* [Defense]: Any unit that can see the unit marker may spend an [Action] to attempt to attack or locate the unit. This is done by the unit secretly choosing the actual location of the unit up to the number of Hidden tokens away from the unit marker where the unit lies (note: the target location may not be passed a barrier that the unit could not cross with normal movement). The opponent then tries to guess both direction and distance. The unit then reveals its actual position and moves its unit marker there. If both are guessed, the unit is discovered and loses all Hidden tokens. If either is guessed, the unit loses 1 Hidden token. If the unit has no Hidden tokens, resolve the attack normally. If the unit has Hidden tokens then the unit remains hidden and any attack fails unless it is an area effect and the unit is the effect.", ":classification", "Purple Token"),
            ":Prepare",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Prepare", ":summary", "* [Action]: An item with Prepare may not be used until it has Prepare tokens equal to Prepare value.\n* [Action]: If unit does not move this [Turn], add a Prepare token to it.\n* Note: If the unit moves or takes a another action, then remove all Prepare tokens.")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_genres
   * @return {chapter}
   */
  static t_chapter_genres = {
    vx_type: vx_core.t_type
  }
  static e_chapter_genres = {
    vx_type: nx_tactics_books_advanced_rules.t_chapter_genres
  }

  // (func chapter_genres)
  static f_chapter_genres() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Genres",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Carrier Command",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Carrier Command", ":summary", "Carrier Command is a set of rules for use with units that hold other units in a [Hanger].\n\n       Common Actions\n       * Enter or Exit Hanger - Move and Action (Unit): Place a unit from the [Hanger] on the [Flight Deck] OR from the [Flight Deck] to the [Hanger].\n       Only 1 unit may be on the [Flight Deck] at any given moment and may be targetted normally there.\n       * Launch or Land - Move and Action (Unit): Move a unit onto or off of the [Flight Deck].  If the carrier has a [Launch Catapult], a launching\n       unit gains +2 movement.\n       * Dive Bomb - Action: -4 Altitude and drop bombs attacking the top of the target creating [Fire] and damaging weapons, crew, and [Flight Deck].\n       Normally only the target and opposing aircraft can [Interrupt] before the bombs are dropped.  Can only be performed from exactly +5 Altitude\n       and with no [White Tokens].\n       * Torpedo Bomb - Action: Drop torpedo attacking a side of the target below the water line creating [Flooding] and damaging [Speed].  Can only be\n       performed from exactly +1 Altitude and with no [White Tokens].\n       * Landing - Move and Action (Unit): Move a unit and place it on the [Flight Deck].  Only 1 unit may be on the [Flight Deck] at any given moment\n       and may be targetted normally there.\n       * Refuel or Reload - Move and Action (Unit): Any unit on the [Flight Deck] or in the [Hanger] may refuel OR reload weapons (changing weapons if\n       desired)."),
        ":RTS/4X",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "RTS/4X", ":summary", "4X:\n* eXplore\n* eXpand\n* eXploit\n* eXterminate")
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
    vx_type: nx_tactics_books_advanced_rules.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Advanced Rules",
      ":image",
      "AdvancedRules.jpg",
      ":chaptermap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_chaptermap},
        "Advanced Rules Overview",
        nx_tactics_books_advanced_rules.f_chapter_advanced_rules_overview(),
        "Advanced Tokens",
        nx_tactics_books_advanced_rules.f_chapter_advanced_tokens(),
        "Advanced Rules",
        nx_tactics_books_advanced_rules.f_chapter_advanced_rules(),
        "Genres",
        nx_tactics_books_advanced_rules.f_chapter_genres()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_advanced_rules": nx_tactics_books_advanced_rules.e_chapter_advanced_rules,
      "chapter_advanced_rules_overview": nx_tactics_books_advanced_rules.e_chapter_advanced_rules_overview,
      "chapter_advanced_tokens": nx_tactics_books_advanced_rules.e_chapter_advanced_tokens,
      "chapter_genres": nx_tactics_books_advanced_rules.e_chapter_genres,
      "tacticsbook": nx_tactics_books_advanced_rules.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_advanced_rules": nx_tactics_books_advanced_rules.t_chapter_advanced_rules,
      "chapter_advanced_rules_overview": nx_tactics_books_advanced_rules.t_chapter_advanced_rules_overview,
      "chapter_advanced_tokens": nx_tactics_books_advanced_rules.t_chapter_advanced_tokens,
      "chapter_genres": nx_tactics_books_advanced_rules.t_chapter_genres,
      "tacticsbook": nx_tactics_books_advanced_rules.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/advanced_rules",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_advanced_rules)
    nx_tactics_books_advanced_rules.t_chapter_advanced_rules['vx_value'] = {
      name          : "chapter_advanced_rules",
      pkgname       : "nx/tactics/books/advanced_rules",
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
      fn            : nx_tactics_books_advanced_rules.f_chapter_advanced_rules
    }

    // (func chapter_advanced_rules_overview)
    nx_tactics_books_advanced_rules.t_chapter_advanced_rules_overview['vx_value'] = {
      name          : "chapter_advanced_rules_overview",
      pkgname       : "nx/tactics/books/advanced_rules",
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
      fn            : nx_tactics_books_advanced_rules.f_chapter_advanced_rules_overview
    }

    // (func chapter_advanced_tokens)
    nx_tactics_books_advanced_rules.t_chapter_advanced_tokens['vx_value'] = {
      name          : "chapter_advanced_tokens",
      pkgname       : "nx/tactics/books/advanced_rules",
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
      fn            : nx_tactics_books_advanced_rules.f_chapter_advanced_tokens
    }

    // (func chapter_genres)
    nx_tactics_books_advanced_rules.t_chapter_genres['vx_value'] = {
      name          : "chapter_genres",
      pkgname       : "nx/tactics/books/advanced_rules",
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
      fn            : nx_tactics_books_advanced_rules.f_chapter_genres
    }

    // (func tacticsbook)
    nx_tactics_books_advanced_rules.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/advanced_rules",
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
      fn            : nx_tactics_books_advanced_rules.f_tacticsbook
    }

  }
}
