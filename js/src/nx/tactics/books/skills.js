'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_skills {

  /**
   * @function chapter_skill_types
   * @return {chapter}
   */
  static t_chapter_skill_types = {
    vx_type: vx_core.t_type
  }
  static e_chapter_skill_types = {
    vx_type: nx_tactics_books_skills.t_chapter_skill_types
  }

  // (func chapter_skill_types)
  static f_chapter_skill_types() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Skill Types",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Physical Skills",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Physical Skills",
          ":skillmap",
          vx_core.f_new(
            nx_tactics_base.t_skillmap,
            "Animal Handling",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Animal Handling",
              ":summary",
              "* Deploy: Deploy trained animals with total level equal to skill.\n* Each week, one animal may be trained one trick.",
              ":titles",
              "Animal Trainer, Breeder, Driver, Herder, Horse Whisperer, Houndmaster, Shepherd, Zoologist",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Falconry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Falconry"
                ),
                ":Herding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Herding",
                  ":titles",
                  "Cowboy, Pig Farmer, Rancher, Shepherd"
                ),
                ":Husbandry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Husbandry"
                ),
                "Stare Down",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stare Down"
                ),
                "Guard Training",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Guard Training"
                ),
                ":Retrieve",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Retrieve"
                ),
                "Seeing Eye Training",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Seeing Eye Training"
                ),
                "Snake Charming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Snake Charming"
                ),
                "Train Dog",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Train Dog"
                ),
                "Train Elephant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Train Elephant"
                ),
                "Train Horse",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Train Horse"
                ),
                "War Training",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "War Training"
                )
              )
            ),
            ":Assassination",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Assassination",
              ":reference",
              "Was it so easy? Was it so simple? You just pushed and death came? Nothing spiritual about it...They just stopped talking, stopped breathing, stopped moving, finally stopped twitching. - Kylar Stern, The Way of Shadows",
              ":titles",
              "Assassin, Blackguard, Ninja, Shinobi",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Harvest Poison",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Harvest Poison"
                ),
                "Kiss of Death",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Kiss of Death"
                ),
                "Poisoned Arrow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poisoned Arrow"
                ),
                "Poisoned Blade",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poisoned Blade"
                ),
                "Poisoned Dust",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poisoned Dust"
                ),
                ":Poisoning",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poisoning"
                ),
                "Poison Tolerance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poison Tolerance",
                  ":reference",
                  "...it was your cup that was poisoned.  They were both poisoned.  I spent the last few years building up an immunity to iocane powder. - Princess Bride"
                ),
                "Prepare Acid",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Acid"
                ),
                "Prepare Anti-Coagulant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Anti-Coagulant",
                  ":summary",
                  "* Create an Anti-Coagulant Poison. A target with Anti-Coagulant cannot easily stop [Bleeding]."
                ),
                "Prepare Antidote",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Antidote",
                  ":summary",
                  "* Skilled in antidote creation.  Can create an antidote for any Poison user can brew."
                ),
                "Prepare Poison",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Poison"
                )
              )
            ),
            ":Athletics",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Athletics",
              ":stat",
              "Body",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Balance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Balance",
                  ":summary",
                  "* User has extensive experience balancing under difficult circumstances.\n* [Action]: Roll vs. difficulty to maintain balance. If any [Hits] are rolled, balance is maintained. Movement is at half speed while balancing, but additional [Hits] or [Criticals] improve movement speed by 10% each up to full speed."
                ),
                ":Backflip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Backflip",
                  ":summary",
                  "+1 Initiative\n+0 Speed (Can only move backward, ignores terrain movement penalties)\n* A showy move that allows the unit to move directly backward without turning."
                ),
                "Body Building",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Body Building",
                  ":summary",
                  "* Character is distinctly powerful looking.\n* [Passive]: Unit may reroll any failed attempt to lift, push, or pull an object."
                ),
                ":Breakfall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Breakfall",
                  ":summary",
                  "* Reduces Critical Hits to Hits from impacts during Knockback, Knockdown, or Falling\n* [Reaction]"
                ),
                ":Contortion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Contortion"
                ),
                "Escape Artistry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Escape Artistry"
                ),
                "Freestyle Running",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Freestyle Running",
                  ":summary",
                  "* [Action]: Ignore 1 [Hazard] from each space of [Forest], [Broken Ground], [Jungle], [Swamp], or [Obstacle]."
                ),
                ":Gymnastics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gymnastics"
                ),
                "High Jump",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "High Jump"
                ),
                "Ice Climbing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Climbing"
                ),
                ":Kippup",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Kippup",
                  ":summary",
                  "* [Move]: Change from [Prone] to [Standing]."
                ),
                "Leap Attack",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Leap Attack"
                ),
                "Long Jump",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Long Jump"
                ),
                ":Marathon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Marathon"
                ),
                "Pole Vault",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pole Vault"
                ),
                ":Rappelling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rappelling"
                ),
                "Rock Climbing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rock Climbing"
                ),
                "SCUBA Diving",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "SCUBA Diving"
                ),
                ":Skateboarding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Skateboarding"
                ),
                ":Skating",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Skating"
                ),
                ":Skydiving",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Skydiving"
                ),
                ":Sledding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sledding"
                ),
                ":Slide",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Slide",
                  ":summary",
                  "* Move at full speed under low obstacles like tables or overhangs."
                ),
                ":Snorkeling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Snorkeling"
                ),
                ":Snowboarding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Snowboarding"
                ),
                ":Skiing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Skiing"
                ),
                ":Sports",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sports"
                ),
                ":Swimming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Swimming"
                ),
                "Swimming, Cold Water",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Swimming, Cold Water"
                ),
                "Swimming, Distance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Swimming, Distance"
                ),
                "Team Acrobatics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Team Acrobatics",
                  ":summary",
                  "* Allows a number of people with this ability to work together to form human pyramids, human ladders, etc."
                ),
                ":Tightrope",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tightrope"
                ),
                ":Throw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Throw"
                ),
                "Tree Climbing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tree Climbing",
                  ":summary",
                  "[Action]: Climb a tree. Hammocks and seats can be built with enough time and equipment."
                ),
                ":Tumbling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tumbling"
                ),
                ":Vault",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vault",
                  ":summary",
                  "* Move over a low obstacle with no reduction in speed.\n* [Action]: Move and ignore up to Level in movement penalties this turn from fences, barricades, and other low obstacles."
                ),
                "Wall Climbing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall Climbing"
                ),
                "Wall Spring",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall Spring"
                ),
                "Zero G",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Zero G"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Acrobatics",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Acrobatics",
                  ":summary",
                  "* Balance\n* Breakfall\n* Contortion\n* Escape Artistry\n* Gymnastics\n* High Jump\n* Kippup\n* Long Jump\n* Tightrope\n* Throw\n* Tumbling\n* Wall Spring\n* Zero G",
                  ":titles",
                  "Acrobat, Contortionist, Escape Artist, Jester"
                ),
                ":Climbing",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Climbing",
                  ":summary",
                  "* Ice Climbing\n* Rappelling\n* Rock Climbing\n* Tree Climbing\n* Wall Climbing"
                )
              )
            ),
            ":Hunting",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Hunting",
              ":reference",
              "* Royal Huntsman - Sleeping Beauty",
              ":titles",
              "Forward Observer, Gamekeeper, Hunter, Huntress, Huntsman, Huntmaster, Lookout, Mage Hunter, Master Huntsman, Master of the Hunt, Poacher, Ranger, Royal Huntsman, Scout, Sentinel, Stalker, Tracer, Tracker, Watchman",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Call of the Hunt",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call of the Hunt"
                ),
                "Cull the Herd",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cull the Herd"
                ),
                ":Deadfall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deadfall"
                ),
                "Field Dressing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Field Dressing"
                ),
                ":Fishing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fishing",
                  ":summary",
                  "* Catch enough fish to eat. Similar to Foraging.",
                  ":titles",
                  "Fisherman"
                ),
                ":Lure",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lure",
                  ":reference",
                  "Everquest Pulling"
                ),
                ":Scouting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scouting",
                  ":titles",
                  "Reconnaissance"
                ),
                ":Snare",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Snare"
                ),
                "There is No Escape",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "There is No Escape",
                  ":reference",
                  "* Raiden Shogun, Genshin Impact"
                ),
                ":Track",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Track"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                "Bounty Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Bounty Hunter",
                  ":reference",
                  "* Certainly there is no hunting like the hunting of man and those who have hunted armed men long enough and liked it, never really care for anything else thereafter. - On the Blue Water, Ernest Hemmingway",
                  ":summary",
                  "* Bounty Hunting represents experience in stalking and capturing a target in an urban setting. This is traditionally done for money and can be quite profitable.\n* Bounties are placed on people for whom the law lacks the resources or inclination to pursue.\n* Bounties are placed by insurance companies, bail bondsmen, armies, the F.B.I., and individuals.\n* The reward can be paid for information, the capture of the target in a reasonably uninjured state, or even dead or alive.\n* The reward obviously needs to be commensurate with the difficulty or no one will take it. Capturing is harder than killing, so captures gain a bonus."
                ),
                "Demon Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Demon Hunter"
                ),
                "Devil Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Devil Hunter"
                ),
                "Mage Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Mage Hunter"
                ),
                ":Trapper",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Trapper"
                ),
                "Treasure Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Treasure Hunter",
                  ":reference",
                  "* Indiana Jones\n* Lara Croft",
                  ":summary",
                  "* Treasure Hunting represents experience in the dangerous and profitable world of lost tombs and ancient relics. Rare relics hold high presitge and are usually sold (in the form of a finders fee) to museaums, governments or private collectors. Raiding tombs is a fairly lawless and perilous activity to start with, and such high value items tend to attract disreputable characters of all kinds. As a result, treasure hunters often end their careers in unfortunate accidents.\n* +1 while researching or navigating inside a crypt or tomb.",
                  ":titles",
                  "Tomb Raider, Treasure Seeker"
                ),
                "Vampire Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Vampire Hunter"
                ),
                "Werewof Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Werewof Hunter"
                ),
                "Witch Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Witch Hunter"
                )
              )
            ),
            ":Rage",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Rage",
              ":titles",
              "Berserker, Marauder, Wildman",
              ":stat",
              "Beast",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Berserker",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Berserker"
                ),
                ":Frenzy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Frenzy"
                ),
                ":Fury",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fury"
                ),
                ":Hatred",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hatred",
                  ":summary",
                  "* Attack: +1 Speed vs. Tribal or long-standing personal enemies."
                ),
                ":Howl",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Howl"
                ),
                ":Taunt",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Taunt",
                  ":reference",
                  "* Kirk: We tried it once your way, Khan, are you game for a rematch? Khan, I'm laughing at the 'superior intellect.' Khan: Full impulse power! Joachim: No, sir! You have Genesis! You can have whatever... Khan: FULL POWER! DAMN YOU! - Star Trek II: The Wrath of Khan",
                  ":summary",
                  "* Dishonor opponent's mother.\n* Roll vs. Mind. If successful, opponent must attack you.",
                  ":titles",
                  "Goad"
                ),
                ":Vengeance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vengeance",
                  ":reference",
                  "* More names off the list, more names on it. - Pyke, Runeterra\n* She opened a book and a box of tools. Sunny came home with a mission... Sunny came home with a list of names. She didn't believe in transcendence. 'It's time for a few small repairs.' she said. Sunny came home with a Vengence. - Shawn Colvin, Sunny Came Home"
                ),
                ":Warcry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Warcry"
                )
              )
            ),
            ":Survival",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Survival",
              ":summary",
              "Common Survival Abilities\n* [Anytime]: Survival Skill may be rolled against any appropriate terrain based hazard taking the better of defense or Survival roll.\n* [Daily]: Units missing appropriate supplies for the terrain must roll Days + # of missing supplies + Terrain Penalty versus Body + Survival or gain Black [Exhaustion] Tokens.",
              ":titles",
              "Adventurer, Courier, Drifter, Explorer, Forager, Messenger, Pathfinder, Pioneer, Sentry, Survivalist, Trailblazer, Traveller, Wanderer, Wayfarer",
              ":stat",
              "Defense",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Cold Weather Survival",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cold Weather Survival",
                  ":summary",
                  "* Hazards - Blizzard, Avalanche, Frostbite"
                ),
                "Dead Reckoning",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dead Reckoning",
                  ":summary",
                  "* Estimate current position and movement."
                ),
                "Desert Survival",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Desert Survival",
                  ":titles",
                  "Desert Bandit, Desert Dweller, Desert Fox, Desert Nomad, Dune Raider, Dune Rider"
                ),
                "Detect Hollow Rock",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Detect Hollow Rock",
                  ":summary",
                  "* Detect trap doors, secret doors, and unstable rocks."
                ),
                ":Foraging",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Foraging",
                  ":summary",
                  "* [Action]: This ability can be used to forage for 1 man day of food and water for each [Hit]. Such food will typically be disgusting to those unaccustomed to the local cuisine, but it will sustain. Excess food only lasts for 1 additional day before going bad. Excess water can be transfered to containers if any, otherwise it cannot be carried. [Critical Hit]s provide a particularly tasty, convenient, or useful source of nutrition (e.g. water in bamboo that can be carried, food that will last another day or more)."
                ),
                ":Forestry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Forestry",
                  ":reference",
                  "Tin Man",
                  ":summary",
                  "* This ability is used to avoid or mitigate the common hazards encountered while delving into the forest.  This can also be used to avoid the attention of random predators.\n* [Requires]: Unit must be a [Light Unit]\n* [Move]: Ignore movement penalty for 2 [Forest] spaces\n* [Action]: [+1 Stealth] in [Woods]\n* [Defense]: [+1 Defense] vs Ranged in [Woods]",
                  ":titles",
                  "Forest Lord, Logger, Lumberjack, Pathcutter, Ranger, Warden, Woodcutter, Woodsman"
                ),
                "High Altitude Survival",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "High Altitude Survival"
                ),
                "Jungle Survival",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jungle Survival",
                  ":reference",
                  "Tarzan",
                  ":summary",
                  "* This ability is used to avoid or mitigate the common hazards encountered while delving into the jungle. This can also be used to avoid the attention of random predators.\n* [Requires]: Unit must be a [Light Unit]\n* [Move]: Ignore movement penalty for 1 [Jungle] space\n* [Action]: [+1 Stealth] in [Jungle]\n* [Defense]: [+1 Defense] vs Ranged in [Jungle]",
                  ":titles",
                  "Jungle Dweller, Lord of the Jungle"
                ),
                "Motion Sense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Motion Sense",
                  ":summary",
                  "* Detect air movements and faint sounds to detect moving things even when they are around corners or in the dark."
                ),
                "Swamp Survival",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Swamp Survival",
                  ":summary",
                  "* This ability is used to avoid or mitigate the common hazards encountered while delving into swampland. This can also be used to avoid the attention of random predators.\n* [Requires]: Unit must be a [Light Unit]\n* [Move]: Ignore movement penalty for 1 [Swamp] space\n* [Action]: [+1 Stealth] in [Swamp]\n* [Defense]: [+1 Defense] vs Ranged in [Swamp]",
                  ":titles",
                  "Murk Dweller, Murk Lord, Swamp Lord, Swamp Knight, Swamp Thing"
                ),
                "Underground Survival",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Underground Survival"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Caving",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Caving",
                  ":summary",
                  "* Dead Reckoning\n* Detect Hollow Rock\n* Mining\n* Motion Sense\n* Sapping\n* Underground Survival",
                  ":titles",
                  "Miner, Prospector, Sapper, Spelunker, Underminer"
                )
              )
            ),
            ":Tradeskills",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Tradeskills",
              ":reference",
              "* Tradesman",
              ":stat",
              "None",
              ":abilitymap",
              nx_tactics_base.f_abilitymap_from_abilitylist(
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Administration",
                  ":titles",
                  "Administrator, Secretary"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Agriculture",
                  ":summary",
                  "* Grow Crop",
                  ":titles",
                  "Farmer, Gardener"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Architecture",
                  ":summary",
                  "* [Extended Action]: Design a structure. The size and quality of the structure are limited by level.\n* [Action]: Determine weaknesses of a structure.",
                  ":titles",
                  "Architect"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blacksmithing",
                  ":titles",
                  "Blacksmith"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Brewing",
                  ":summary",
                  "* Brew Beer\n* Brew Hard Liquor\n* Brew Mead\n* Brew Wine",
                  ":titles",
                  "Brewer, Vintner"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Carpentry",
                  ":titles",
                  "Carpenter"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cleaning",
                  ":titles",
                  "Maid"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cobbling",
                  ":summary",
                  "* Make Shoes",
                  ":titles",
                  "Cobbler"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cooking",
                  ":summary",
                  "* Prepare Recipe",
                  ":titles",
                  "Chef, Cook"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cooping",
                  ":summary",
                  "* Make Sealable Barrel",
                  ":titles",
                  "Cooper"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Glassblowing",
                  ":summary",
                  "* Blow Bottle\n* Blow Glass Decoration"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jewelsmithing",
                  ":summary",
                  "* Gemcutting\n* Fashion Jewelry",
                  ":titles",
                  "Gemcutter, Jeweler"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Laboring",
                  ":titles",
                  "Laborer, Worker"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Landscaping",
                  ":summary",
                  "* Grow Bonsai\n* Grow Flowers\n* Grow Hedges\n* Grow Hedge Maze\n* Grow Trees",
                  ":titles",
                  "Groundskeeper, Landscaper, Lawnboy"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Leatherworking",
                  ":summary",
                  "* Fashion Leather Goods\n* Flay Skins",
                  ":titles",
                  "Tanner"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Livestock"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Logging"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Metalworking",
                  ":titles",
                  "Coppersmith, Goldsmith, Machinist, Pewtersmith, Silversmith"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plumbing",
                  ":titles",
                  "Plumber"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Porting",
                  ":summary",
                  "* Bear Litter\n* Port Boat",
                  ":titles",
                  "Bearer, Porter"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pottery",
                  ":titles",
                  "Potter"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Servant",
                  ":titles",
                  "Butler, Footman, Lady in Waiting"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sewing",
                  ":summary",
                  "* Crochet\n              * Embroidery\n              * Fashion Clothing\n              * Needlepoint\n              * Repair Cloth",
                  ":titles",
                  "Dressmaker, Seamstress"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stagecraft",
                  ":summary",
                  "* The technical aspects of theatrical production, which include scenic design, stage machinery, lighting, sound, costume design, and makeup.",
                  ":titles",
                  "Stagehand"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Weaponsmith",
                  ":summary",
                  "* The ability to repair, improve, or even create weapons.\n* [Razor's Edge] - Work a weapon to give a +1 Synergy the first time it hits.",
                  ":titles",
                  "Bladesmith, Swordsmith"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Woodworking",
                  ":summary",
                  "The process of building, making or carving something using wood.",
                  ":titles",
                  "Carver, Whittler, Woodworker"
                )
              )
            )
          )
        ),
        "Transportation Skills",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Transportation Skills",
          ":skillmap",
          vx_core.f_new(
            nx_tactics_base.t_skillmap,
            ":Driving",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Driving",
              ":titles",
              "Driver, Trucker",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Bootlegger Reverse",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bootlegger Reverse"
                ),
                ":Drift",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drift"
                ),
                ":Swerve",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Swerve"
                ),
                "3 Point Turn",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "3 Point Turn"
                ),
                "Parallel Parking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Parallel Parking"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Motorcycles",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Motorcycles"
                ),
                ":Trucks",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Trucks"
                ),
                "Construction Vehicles",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Construction Vehicles"
                )
              )
            ),
            ":Piloting",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Piloting",
              ":summary",
              "* The Jink and Barrel Roll maneuvers simply make it harder for the plane to be hit.\n* The Half Loop, Wingover, and Falling Leaf are all attempts to loose an enemy that's tailing you.\n* The Loop, Immelman, and Retournment are all attempts to both loose a tail, abd to end up tailing that foe yourself.\n* When a 'dogged' plane attempts a maneuver to escape his tail the pilot needs to succeed in the maneuver. If he fails his roll, then he's still being tailed, if he succeeds, then the tailing pilot gets to attempt the same maneuver (as a 'free' action at full dice pool) - if the 'tail' matches or exceeds the successes rolled by the target plane's pilot, then the tail is maintained for another turn.\n* When a dogged plane attempts a 'reversal' maneuver the effects are the same, except that if the tailing plane scores less successes than the target plane, the roles are reversed.",
              ":titles",
              "Aviator, Pilot, Sky Captain, Sky Knight, Sky Marshall, Wing Commander, Wingman",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Barn Storming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Barn Storming",
                  ":summary",
                  "* Low altitude flying that uses ground cover to block line of sight.  Naturally, this manuever can be extremely dangerous.",
                  ":titles",
                  "Nape of the Earth"
                ),
                "Barrel Roll",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Barrel Roll",
                  ":reference",
                  "* Do a barrel roll! - Peppy Hare, Star Fox 64",
                  ":summary",
                  "The pilot rolls the plane over sideways and 'corkscrews' through the air."
                ),
                "Cobra maneuver",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cobra maneuver",
                  ":summary",
                  "* A dramatic and demanding maneuver in which an airplane flying at a moderate speed abruptly raises its nose momentarily to a vertical and slightly past vertical attitude, causing an extremely high angle of attack and momentarily stalling the plane, making a full-body air brake before dropping back to normal position, during which the aircraft does not change effective altitude.",
                  ":titles",
                  "Dynamic deceleration"
                ),
                "Carrier Landing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Carrier Landing"
                ),
                "Circle of Death",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Circle of Death",
                  ":summary",
                  "A Russian WWII maneuver when attacking ground forces that attacks the column from the rear, then circles around to make repeated rear attacks until all weapons were expended."
                ),
                "Close Air Support",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Close Air Support"
                ),
                "Dive Bombing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dive Bombing",
                  ":summary",
                  "High speed attack from high altitude.  Increases movement speed and damage of physical attacks."
                ),
                "Falling Leaf",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Falling Leaf",
                  ":summary",
                  "The pilot deliberately stalls, sending it into a spinning fall, only to restart the engine and level off."
                ),
                "Fly Out of the Sun",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fly Out of the Sun",
                  ":summary",
                  "If the sun is behind, allows a surprise attack."
                ),
                "Flyby Attack",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flyby Attack"
                ),
                "Flying Mount",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flying Mount",
                  ":summary",
                  "* When riding a mount that can fly, a unit must have experience riding that particular mount.\n* Examples: Dragon, Flying Carpet, Giant Eagle, Giant Wasp, Griffin, Hippogriff, Pegasus, Roc"
                ),
                "Half Loop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Half Loop",
                  ":summary",
                  "The pilot pulls up and over, as if he was going to loop the aircraft, but adds a half-roll to right the plane at the top of the loop to continue level flight in the opposite direction to that which he started."
                ),
                "Immelmann Turn",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Immelmann Turn",
                  ":summary",
                  "The Immelmann turn has become one of the most popular airshow maneuvers in the world. However, the aerobatic maneuver is altogether different from the WWI Immelmann turn (See Wingover) and is of little use in modern dogfighting.",
                  ":titles",
                  "Roll Off the Top"
                ),
                ":Jink",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jink",
                  ":summary",
                  "* Yawing his plane from side to side, the pilot attempts to throw-off the aim of enemy gunners.\n* [Action]: [+1 Defense] until this unit's next turn."
                ),
                ":Levitating",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Levitating",
                  ":summary",
                  "* If a unit uses powers to fly, the unit must gain this ability of fly at a penalty."
                ),
                ":Loop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Loop",
                  ":summary",
                  "* The pilot pulls the plane up and over in a complete circle, ending up in the same position and facing that he started."
                ),
                "Pull Out of a Dive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pull Out of a Dive"
                ),
                "Remote Piloting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Remote Piloting"
                ),
                "Split S",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Split S",
                  ":summary",
                  "A diving maneuver mostly used to disengage. The pilot half-rolls his aircraft inverted and executes a descending half-loop, resulting in level flight in the exact opposite direction at a lower altitude.",
                  ":titles",
                  "Reverse Immelmann"
                ),
                ":Strafe",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Strafe"
                ),
                "Strategic Bombing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Strategic Bombing"
                ),
                ":Tail",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tail"
                ),
                "Torpedo Bomb",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Torpedo Bomb",
                  ":summary",
                  "Fly [Nape of the Earth] and drop a torpedo or other payload."
                ),
                "Wing Over",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wing Over",
                  ":reference",
                  "Performed by an experienced flyer, this maneuver can surprise a pursuer by quickly reversing on them. If you have the distance lead in a chase, you can use this to convert from a defensive posture to an offensive one. The trick is not to get shot up when you are reversing.",
                  ":titles",
                  "Immelmann Turn, Retournment"
                ),
                "Winged Flight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Winged Flight",
                  ":summary",
                  "* If the unit has wings, it must have this ability or fly at a penalty.\n* If the unit grew up with wings, this ability is assumed."
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                "Civilian Airplanes",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Civilian Airplanes"
                ),
                "Commercial Airplanes",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Commercial Airplanes"
                ),
                ":Helicopters",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Helicopters"
                )
              )
            ),
            ":Riding",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Riding",
              ":summary",
              "* Level 1: Ride a horse\n* Level 2: Ride a Lt. Warhorse\n* Level 3: Ride a Med. Warhorse\n* Level 4: Ride a Hvy. Warhorse\n* Note: Riding a flying mount requires [Flying]",
              ":titles",
              "Caravan Driver, Cavalry, Driver, Dragoon, Horseman, Knight, Lancer, Outrider, Rider",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Bareback",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bareback",
                  ":summary",
                  "* Can ride without a saddle without penalty."
                ),
                "Bull Riding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bull Riding",
                  ":summary",
                  "* While riding a hostile creature, the Scale of the creature considered to be one less for you."
                ),
                "Catabatan Circle",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Catabatan Circle",
                  ":summary",
                  "* [Formation]\n* High Dodge and Concentrated firepower"
                ),
                ":Charge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Charge",
                  ":reference",
                  "* We'll use the old ways...speed of horse! - Arthur, Excalibur",
                  ":summary",
                  "* [Requires]: Unit must have moved at least 4 spaces in a straight line.\n* [Action]: Melee Attack costs no [Speed].\n* [Attack], [Damage]: Any [Critical Hits] may be [Morale Tokens]"
                ),
                "Drive Carriage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drive Carriage"
                ),
                "Drive Cart",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drive Cart"
                ),
                "Horse Archery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Horse Archery",
                  ":summary",
                  "Can use a bow while riding without penalty."
                ),
                "Run Down",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Run Down",
                  ":summary",
                  "* [Damage]: +1 Damage when attacking from the rear.\n* [Attack], [Damage]: Any [Critical Hits] may be [Retreats]"
                ),
                "Side Saddle",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Side Saddle",
                  ":summary",
                  "* Can ride side saddle without penalty."
                ),
                "Steed Trample",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Steed Trample"
                )
              )
            ),
            ":Seamanship",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Seamanship",
              ":summary",
              "The art of operating a ship or boat including specialised skills such as: navigation and international maritime law; weather, meteorology and forecasting; watchstanding; ship-handling and small boat handling; operation of deck equipment, anchors and cables; ropework and line handling; communications; sailing; engines; execution of evolutions such as towing; cargo handling equipment, dangerous cargoes and cargo storage; dealing with emergencies; survival at sea and search and rescue; fire fighting.\n\nThe degree of knowledge needed within these areas is dependent upon the nature of the work. However, the practice of good seamanship should be the goal of all.",
              ":titles",
              "Admiral, Capitan, Commodore, First Officer, Navigator, Pirate, Sailor, Seaman, Ship's Mate",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Boarding Party",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Boarding Party",
                  ":summary",
                  "* When a ship touches a dock or another ship, it is very unstable and must be secured for 1 round before anyone may move across. With this ability, the unit may step, jump, or even swing to the other side immediately. A skill roll must still be made, but a failed roll simply wastes a turn."
                ),
                "Marine Survival",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Marine Survival",
                  ":summary",
                  "* Open Water, Whitewater"
                ),
                "Merchant Marine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Merchant Marine",
                  ":summary",
                  "Civilian Merchants operating private vessels are considered naval auxilliary and may be called into service to deliver troops and supplies for the military."
                ),
                ":Navigation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Navigation",
                  ":summary",
                  "* More than just finding a vessel's present location, safe navigation includes predicting future location, route planning and collision avoidance.\n* [Extended Action]: When determining actual travel time by sea, roll vs the difficulty of the journey. -1% travel time x [Hits] rolled. -2% travel time x [Critical Hits] rolled."
                ),
                ":Planing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Planing",
                  ":summary",
                  "* Planing describes the state in which the hull of a waterborne craft is lifting up higher up to the point where it merely skims across the water, rather than moving through it."
                ),
                ":Ramming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ramming"
                ),
                ":Righting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Righting",
                  ":summary",
                  "The act of reversing a capsized vessel is called righting.\n\nIf a capsized vessel has sufficient flotation to prevent sinking, it may recover on its own if the stability is such that it is not stable inverted.\n\nSmall dinghies frequently capsize in the normal course of use and are occasionally deliberately capsized as it can be the fastest means of draining water from the boat.\n\nIn a storm, even large vessels may be rolled by being hit broadside by a large wave. This is normally catastrophic for larger ships."
                ),
                ":Sailing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sailing",
                  ":summary",
                  "This includes maneuvers such as heaving to, jibe, reefing, and tacking."
                ),
                "Trade Winds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trade Winds",
                  ":summary",
                  "Faster travel when piloting commercial sailing vessels."
                )
              )
            ),
            "Starpiloting",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Starpiloting",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Astronavigation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Astronavigation"
                ),
                "Astronavigation - FTL",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Astronavigation - FTL"
                ),
                "Astronavigation - Jump Drive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Astronavigation - Jump Drive"
                ),
                "Combat Orbital Piloting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Combat Orbital Piloting"
                ),
                "Combat Space Piloting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Combat Space Piloting"
                ),
                "Orbital Piloting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Orbital Piloting"
                )
              )
            )
          )
        ),
        "Academic Skills",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Academic Skills",
          ":skillmap",
          vx_core.f_new(
            nx_tactics_base.t_skillmap,
            ":Computers",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Computers",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "AI Programming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "AI Programming",
                  ":summary",
                  "* Artificial Intelligences may be given skills if the designer also possesses that skill. AI skill rolls are not open-ended."
                ),
                "Computer Engineering",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Computer Engineering"
                ),
                "Computer Programming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Computer Programming"
                ),
                "Computer Virus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Computer Virus"
                ),
                "Edit Recording",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Edit Recording",
                  ":summary",
                  "* Modify a recording to mislead the viewer."
                ),
                ":Encryption",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Encryption"
                ),
                "False Images",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "False Images"
                ),
                "Garbage In / Garbage Out",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Garbage In / Garbage Out"
                ),
                "Ghost in the Machine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ghost in the Machine",
                  ":summary",
                  "* By digitizing one's personality at the moment of death, a person can gain a semblance of immortality. A new program is created that is an replica of the original. Successes determine how close a copy it is to the original. 10 successes is a perfect copy."
                ),
                ":Hacking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hacking"
                ),
                ":Override",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Override",
                  ":reference",
                  "* Joachim: Our shields are dropping. Khan: Then raise them! Joachim: I can't! Khan: The override. Where's the override? - Joachim, Khan - Star Trek II: The Wrath of Khan"
                ),
                "Remote Access",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Remote Access"
                ),
                ":Reprogram",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reprogram"
                ),
                ":Telecommute",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telecommute"
                )
              )
            ),
            ":Electronics",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Electronics",
              ":reference",
              "Reverse the polarity of the neutron flow - Doctor Who",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Air Traffic Control",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Air Traffic Control"
                ),
                ":Blackout",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blackout"
                ),
                "Boost Power Output",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Boost Power Output"
                ),
                "Communication Systems",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Communication Systems"
                ),
                "Cybernetic Systems",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Systems"
                ),
                "Detection Systems",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Detection Systems"
                ),
                "Disable Electronics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Disable Electronics"
                ),
                "Disrupt Guidance Systems",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Disrupt Guidance Systems"
                ),
                "Electrical Overload",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Electrical Overload",
                  ":summary",
                  "* Burn out a small part of a system. The system becomes unusable until the fault is found and corrected."
                ),
                "Electronic Bypass",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Electronic Bypass"
                ),
                "Gravitic Systems",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gravitic Systems"
                ),
                "Jam Communications",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jam Communications"
                ),
                "Power Systems",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Power Systems"
                ),
                "Robotic Systems",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Robotic Systems"
                ),
                "Repair Electrical System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Repair Electrical System"
                ),
                "Shield Technologies",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shield Technologies"
                ),
                "Short Circuit",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Short Circuit"
                )
              )
            ),
            ":Investigation",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Investigation",
              ":summary",
              "* Investigation is the ability to uncover hidden or lost information. Though it allows the user to rapidly find information, it does not provide the ability to use that information. Other skills or allies would be needed beyond the basics.",
              ":titles",
              "Archivist, Crime Scene Investigator, Detective, Inspector, Investigative Reporter, Librarian, Researcher, Seeker",
              ":abilitymap",
              nx_tactics_base.f_abilitymap_from_abilitylist(
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Decipher",
                  ":summary",
                  "* Detect and decode hidden messages."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Connect the Dots"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crack the Case"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Criminal Research"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Data Collection"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Detail Oriented",
                  ":summary",
                  "ONCE IF you found and item during a [Search] AND had [Hits]:10+ THEN you may resuffle that item into the [Search Deck] and draw again taking the new result insteaad."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Delve Too Deep"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Desperate Search"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dig Deep"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Financial Research"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Find Traces"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Forbidden Knowledge"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Forensic Research"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Historical Research"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Inquiring Mind"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Medical Research"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Occult Research"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ransack"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scene of the Crime"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Search",
                  ":summary",
                  "* Rummage around for things:\n** ONCE, IF you searched a location and found an [Item], you may reshuffle that [Item] into its location and draw again."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Search for the Truth"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Seek",
                  ":summary",
                  "* Detect Hidden:\n** IF you have a valid reason to suspect something hidden\n** THEN [Simple Skill]: [Investigation] vs target [Stealth]/[Hide] with [Size Penalty] to detect them."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Working a Hunch"
                )
              )
            ),
            ":Knowledge",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Knowledge",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Ancient History",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ancient History"
                ),
                ":Antiquities",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Antiquities",
                  ":summary",
                  "* The study and valuation of unique objects throughout history."
                ),
                ":Archeology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Archeology",
                  ":summary",
                  "* The study and reclamation of ancient relics and remains.",
                  ":titles",
                  "Archeologist, Paleontology, Paleontologist"
                ),
                "Current Events",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Current Events"
                ),
                ":Geography",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Geography"
                ),
                "Military History",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Military History"
                ),
                "Movie Trivia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Movie Trivia",
                  ":summary",
                  "* Each topic must be taken separately.\n* Any knowledge rolls in the given field are at +2.\n* Character has a high chance to remember any detail in the given topic.  This is similar to eidetic memory."
                ),
                "Music Trivia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Music Trivia",
                  ":summary",
                  "* Each topic must be taken separately.\n* Any knowledge rolls in the given field are at +2.\n* Character has a high chance to remember any detail in the given topic.  This is similar to eidetic memory."
                ),
                "Mythology and Legend",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mythology and Legend"
                ),
                "National History",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "National History"
                ),
                "Religious Studies",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Religious Studies"
                ),
                "Sports Trivia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sports Trivia"
                ),
                "World History",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "World History"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":History",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "History"
                ),
                ":Trivia",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Trivia"
                )
              )
            ),
            ":Mechanics",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Mechanics",
              ":titles",
              "Locksmith, Tinker, Tinsmith, Watchmaker",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Clockmaking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Clockmaking"
                ),
                ":Decontaminate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Decontaminate"
                ),
                ":Demolition",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Demolition"
                ),
                "Engineering: Aeronautical",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Aeronautical"
                ),
                "Engineering: Armor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Armor",
                  ":titles",
                  "Armorer"
                ),
                "Engineering: Civil",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Civil",
                  ":titles",
                  "Construction"
                ),
                "Engineering: Cybernetic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Cybernetic"
                ),
                "Engineering: Hydraulic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Hydraulic"
                ),
                "Engineering: Optics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Optics"
                ),
                "Engineering: Nuclear",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Nuclear"
                ),
                "Engineering: Robotic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Robotic"
                ),
                "Engineering: Rocket and Reaction Engines",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Rocket and Reaction Engines"
                ),
                "Engineering: Siege",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Siege"
                ),
                "Engineering: Star Drive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Star Drive"
                ),
                "Engineering: Temporal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Temporal"
                ),
                "Engineering: Vehicular",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Vehicular"
                ),
                "Engineering: Weaponry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering: Weaponry",
                  ":titles",
                  "Gunsmithing"
                ),
                ":Fortification",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fortification"
                ),
                "Kit Bash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Kit Bash"
                ),
                "Lock Construction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lock Construction"
                ),
                "Lock Picking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lock Picking"
                ),
                "Mechanical Maintenance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mechanical Maintenance"
                ),
                "Mechanical Repair",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mechanical Repair"
                ),
                "Mechanism Construction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mechanism Construction",
                  ":summary",
                  "* See [Equipment: Mechanisms]"
                ),
                "Mechanism Deactivation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mechanism Deactivation"
                ),
                "Mechanism Detection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mechanism Detection"
                ),
                ":Mining",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mining"
                ),
                ":Salvage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Salvage"
                ),
                "Trap Detection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trap Detection"
                ),
                "Trap Disarming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trap Disarming"
                ),
                "Trap Laying",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trap Laying",
                  ":summary",
                  "* See [Equipment: Traps]"
                ),
                ":Welding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Welding"
                )
              )
            ),
            ":Medicine",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Medicine",
              ":titles",
              "Caregiver, Caretaker, Dentist, Doctor, EMT, Medic, Medical Examiner, Nurse, Physician, Surgeon",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Anatomy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Anatomy"
                ),
                ":Dentistry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dentistry"
                ),
                ":Diagnose",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Diagnose"
                ),
                "Emergency Treatment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Emergency Treatment"
                ),
                "First Aid",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "First Aid"
                ),
                ":Immunology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Immunology"
                ),
                ":Leeching",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Leeching"
                ),
                "Medical Practice",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Medical Practice"
                ),
                ":Nursing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nursing"
                ),
                ":Pharmacy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pharmacy",
                  ":titles",
                  "Pharmacist, Pharmacy Technician"
                ),
                ":Physiology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physiology"
                ),
                ":Surgery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Surgery"
                ),
                "Surgery: Brain",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Surgery: Brain"
                ),
                "Surgery: Cosmetic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Surgery: Cosmetic"
                ),
                "Surgery: Cybernetic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Surgery: Cybernetic"
                ),
                "Surgery: Nerve",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Surgery: Nerve"
                ),
                "Treat Disease",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Treat Disease"
                ),
                "Treat Injury",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Treat Injury"
                ),
                "Treat Poison",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Treat Poison"
                ),
                "Treat Radiation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Treat Radiation"
                ),
                "Veterinary Medicine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Veterinary Medicine"
                )
              )
            ),
            "Life Sciences",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Life Sciences",
              ":reference",
              "* See [Equipment: Drugs]\n* See [Flora and Fauna: Plants]",
              ":titles",
              "Life Scientist",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Biochemistry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Biochemistry",
                  ":titles",
                  "Biochemist"
                ),
                ":Biology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Biology",
                  ":titles",
                  "Biologist"
                ),
                "Biology, Molecular",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Biology, Molecular",
                  ":titles",
                  "Molecular Biologist"
                ),
                "Biology, Xeno",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Biology, Xeno"
                ),
                ":Botony",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Botony",
                  ":summary",
                  "* Analyze/Identify Plant\n* Locate Plant\n* Harvest Plant\n* Cultivate Plant Strain",
                  ":titles",
                  "Botonist, Herbalist, Horticulturalist"
                ),
                ":Cloning",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cloning"
                ),
                ":Cryogenics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cryogenics",
                  ":summary",
                  "Hidden in ice for a century, to walk the Earth again. Lord have mercy on the frozen man. - James Taylor, The Frozen Man"
                ),
                ":Cultivate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cultivate",
                  ":summary",
                  "* Grow any plant, fungus, or bacteria that you have studied."
                ),
                "Enhance Drug",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enhance Drug",
                  ":summary",
                  "* Increase the effect that an existing drug or treatment will have."
                ),
                "Gene Bank",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gene Bank"
                ),
                "Gene Splicing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gene Splicing",
                  ":summary",
                  "* Grow new creatures that have characteristics taken from others."
                ),
                "Gene Therapy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gene Therapy"
                ),
                "Gene Sequencing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gene Sequencing",
                  ":summary",
                  "* By gathering a sample of a biological organism and studying it, the researcher can discover every detail of its abilities and biological mechanics."
                ),
                "Genetic Screening",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Genetic Screening"
                ),
                ":Genetics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Genetics",
                  ":titles",
                  "Geneticist"
                ),
                "Genetic Engineering",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Genetic Engineering"
                ),
                ":Ecology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ecology",
                  ":summary",
                  "Ecology is the interdisciplinary scientific study of the interactions between organisms and their environment."
                ),
                ":Homeopathy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Homeopathy"
                ),
                "Lab Work",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lab Work",
                  ":titles",
                  "Wet Science"
                ),
                ":Pathology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pathology",
                  ":summary",
                  "* Analyze/Identify Disease"
                ),
                ":Pharmacology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pharmacology",
                  ":summary",
                  "* Create/Develop Drug",
                  ":titles",
                  "Pharmacist, Pharmacologist"
                ),
                "Prepare Anti-Bacterial",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Anti-Bacterial"
                ),
                "Prepare Anti-Fungal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Anti-Fungal"
                ),
                "Prepare Anti-Parasitic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Anti-Parasitic"
                ),
                "Prepare Anti-Toxin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Anti-Toxin"
                ),
                "Prepare Anti-Viral",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Anti-Viral"
                ),
                "Prepare Balm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Balm"
                ),
                "Prepare Herbal Remedy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Herbal Remedy"
                ),
                "Prepare Panacea",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Panacea",
                  ":summary",
                  "* Cure bacteria, virus, fungal, or parasitic infestation."
                ),
                "Prepare Pigments",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Pigments"
                ),
                "Prepare Poultice",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Poultice"
                ),
                "Prepare Spices",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Spices"
                ),
                "Prepare Vaccine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Vaccine"
                ),
                ":Zoology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Zoology",
                  ":summary",
                  "* Analyze/Identify Animal\n* Locate Animal",
                  ":titles",
                  "Zoologist"
                )
              )
            ),
            "Physical Sciences",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Physical Sciences",
              ":reference",
              "* Personally, I liked the university. They gave us money and facilities, we didn't have to produce anything! You've never been out of college! You don't know what it's like out there! I've worked in the private sector. They expect results. - Ghostbusters",
              ":summary",
              "* Scientists believe that by studying a thing, one can learn its patterns and gain mastery over it.",
              ":titles",
              "Sage, Scholar, Scientist",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Analyze Substance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Analyze Substance",
                  ":summary",
                  "* [Requires]: Must have abilities corresponding to the substance being analyzed (e.g. Geology for rocks, Metallurgy for metals, etc.).\n* [Extended Action]: Run a series of tests on a substance to determine its make up."
                ),
                ":Astronomy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Astronomy"
                ),
                ":Astrophysics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Astrophysics"
                ),
                ":Cartography",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cartography",
                  ":summary",
                  "* [Action]: Accurately map the surrounding area.\n* [Action]: Locate anomalies in maps, including errors, forgeries, and potentially hidden areas.",
                  ":titles",
                  "Cartographer, Map Maker"
                ),
                ":Chemistry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chemistry"
                ),
                ":Geology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Geology",
                  ":titles",
                  "Mineralolgy, Vulcanism"
                ),
                ":Experimentation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Experimentation"
                ),
                ":Mathematics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mathematics",
                  ":titles",
                  "Algebra, Geometric, Probability, Trigonometry"
                ),
                "Mathematics: Advanced",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mathematics: Advanced",
                  ":reference",
                  "* Differential Calculus - The definition, properties, and applications of the derivative of a function. The process of finding the derivative is called differentiation.\n* Integral Calculus - The definitions, properties, and applications of two related concepts, the indefinite integral and the definite integral. The process of finding the value of an integral is called integration.\n* Calculus is used in every branch of the physical sciences, actuarial science, computer science, statistics, engineering, economics, business, medicine, demography, and in other fields wherever a problem can be mathematically modeled and an optimal solution is desired.\n* Physics makes particular use of calculus; all concepts in classical mechanics are interrelated through calculus. The mass of an object of known density, the moment of inertia of objects, as well as the total energy of an object within a conservative field can be found by the use of calculus.\n* Electricity and Magnetism - Calculus can be used to find the total flux of electromagnetic fields. A more historical example of the use of calculus in physics is Newton's second law of motion, it expressly uses the term 'rate of change' which refers to the derivative.\n* Medicine - Calculus can be used to find the optimal branching angle of a blood vessel so as to maximize flow.\n* Economics - Calculus allows for the determination of maximal profit by providing a way to easily calculate both marginal cost and marginal revenue.",
                  ":titles",
                  "Differential Calculus, Integral Calculus, Limits and Infintesimals, Linear Algebra"
                ),
                ":Metallurgy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Metallurgy"
                ),
                ":Meteorology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Meteorology"
                ),
                ":Planetology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Planetology"
                ),
                "Publish or Perish",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Publish or Perish",
                  ":summary",
                  "* Ability to create academic papers that increase Fame."
                ),
                ":Optics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Optics"
                ),
                "Physics: Dimensional",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics: Dimensional"
                ),
                "Physics: Electromagnetic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics: Electromagnetic"
                ),
                "Physics: Fluid Dynamics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics: Fluid Dynamics"
                ),
                "Physics: Forces",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics: Forces"
                ),
                "Physics: Newtonian",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics: Newtonian"
                ),
                "Physics: Nuclear",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics: Nuclear",
                  ":reference",
                  "* You said crossing the streams was bad!  Cross the streams...  You're gonna endanger us, you're gonna endanger our client - the nice lady, who paid us in advance, before she became a dog...Not necessarily. There's definitely a *very slim* chance we'll survive. I love this plan!  I'm excited to be a part of it!  LET'S DO IT! - Ghostbusters"
                ),
                "Physics: Quantum",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics: Quantum"
                ),
                "Physics: Temporal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics: Temporal",
                  ":reference",
                  "* The future is not set. There's no fate but what we make for ourselves. - Reece, The Terminator"
                ),
                "Physics: Thermodynamics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics: Thermodynamics"
                ),
                "Quick Study",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Quick Study",
                  ":reference",
                  "I know Kung Fu. - Neo, The Matrix",
                  ":summary",
                  "* Cram to learn a low level skill very quickly. The skill doesn't last long, but often it doesn't have to."
                ),
                ":Study",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Study"
                )
              )
            )
          )
        ),
        "Social Skills",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Social Skills",
          ":skillmap",
          vx_core.f_new(
            nx_tactics_base.t_skillmap,
            ":Art",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Art",
              ":reference",
              "* Art requires a certain... cruelty. - Jhin, Runeterra",
              ":titles",
              "Artist, Artisan",
              ":stat",
              "Spirit",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Art Imitates Life",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Art Imitates Life",
                  ":reference",
                  "Dorian Gray",
                  ":summary",
                  "Artwork become real"
                ),
                ":Calligraphy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Calligraphy"
                ),
                ":Crafts",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crafts"
                ),
                ":Drawing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drawing"
                ),
                ":Painting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Painting"
                ),
                ":Photoshopping",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Photoshopping",
                  ":summary",
                  "* Modify an image to improve or mislead."
                ),
                ":Sculpture",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sculpture"
                )
              )
            ),
            ":Business",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Business",
              ":reference",
              "* Did they get you to trade? Your heroes for ghosts? Hot ashes for trees? Hot air for a cool breeze? Cold comfort for change? Did you exchange? A walk-on part in the war. For a leading role in a cage? - Pink Floyd, Wish you were here",
              ":titles",
              "Commerce",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Accounting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Accounting",
                  ":titles",
                  "Accountant, Actuary, Clerk"
                ),
                ":Advertising",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Advertising",
                  ":titles",
                  "Marketing Representative"
                ),
                ":Appraise",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Appraise",
                  ":summary",
                  "* Determine the value of an item in the current market."
                ),
                ":Bargain",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bargain",
                  ":summary",
                  "* Ability that Limits any attempt to buy or sell goods at their actual worth.",
                  ":titles",
                  "Haggler, Merchant"
                ),
                ":Barter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Barter",
                  ":summary",
                  "* Ability that Limits any attempt to buy or sell goods at their actual worth."
                ),
                "Business Management",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Business Management"
                ),
                ":Distribution",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Distribution"
                ),
                ":Economics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Economics",
                  ":reference",
                  "* In 5 minutes, you learn what the average University student remembers 5 years after learning school ... Economics: Supply and Demand. That's it. - Father Guido Sarducci, Five Minute University"
                ),
                ":Finance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Finance"
                ),
                ":Marketing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Marketing"
                ),
                ":Procure",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Procure",
                  ":summary",
                  "The ability to find rare, exotic or illegal items for sale or trade.",
                  ":titles",
                  "Procurer"
                ),
                ":Sales",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sales",
                  ":reference",
                  "* In 5 minutes, you learn what the average University student remembers 5 years after learning school ... Business is: You buy something, you sell it for more - Father Guido Sarducci, Five Minute University",
                  ":titles",
                  "Carpetbagger, Peddler, Salesman"
                ),
                ":Speculate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Speculate"
                ),
                "Trade Routes",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trade Routes"
                ),
                "Trade Union",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trade Union"
                )
              )
            ),
            ":Communications",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Communications",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Appearance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Appearance",
                  ":summary",
                  "* Expert on personal grooming, cosmetics, and hairstyling."
                ),
                ":Carousing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Carousing"
                ),
                "Detect Lie",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Detect Lie"
                ),
                ":Drinking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drinking"
                ),
                ":Drugs",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drugs"
                ),
                ":Etiquette",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Etiquette"
                ),
                ":Fashion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fashion",
                  ":summary",
                  "* Knows current fashions and what clothing with make the best impact."
                ),
                ":Fiction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fiction",
                  ":summary",
                  "* Can author, critique, interpret, and detect fiction."
                ),
                "Go Viral",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Go Viral",
                  ":summary",
                  "* Create an interesting message popular enough to be passed around."
                ),
                ":Gossip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gossip",
                  ":summary",
                  "* The single best way to get information, but, given it source, may not be reliable."
                ),
                ":Interview",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Interview",
                  ":titles",
                  "Interviewer, Reporter"
                ),
                ":Journalism",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Journalism",
                  ":titles",
                  "Journalist, Media, Reporter"
                ),
                ":Literacy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Literacy",
                  ":summary",
                  "* Can read and write\n* This ability is assumed in modern characters from 1st and 2nd world nations"
                ),
                "Motivational Speaking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Motivational Speaking",
                  ":reference",
                  "* My name is Matt Foley and I am a motivational speaker... First off, I am thirty-five years old, I am divorced, and I live in a van down by the river... Well I'm here to tell you, that you're probably going to find out, as you go out there, that you're not going to amount to jack squat! You're going to end up eating a steady diet of government cheese and living in a van down by the river! - Matt Foley, SNL",
                  ":titles",
                  "Motivational Speaker"
                ),
                ":Negotiation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Negotiation",
                  ":titles",
                  "Advisor, Arbiter, Diplomat, Emissary, Envoy, Legate, Negotiator"
                ),
                ":Photography",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Photography",
                  ":titles",
                  "Photographer"
                ),
                ":Poetry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poetry",
                  ":summary",
                  "Can author any type of poetry",
                  ":titles",
                  "Poet"
                ),
                ":Politics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Politics"
                ),
                ":Recruiting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Recruiting",
                  ":titles",
                  "Casting Director, Hiring Manager, Recruiter"
                ),
                ":Scribe",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scribe",
                  ":summary",
                  "* Can copy writings exactly"
                ),
                ":Sincerity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sincerity",
                  ":summary",
                  "* Helps convince others when you are being truthful.\n* Helps improve long term relationships by increasing trust.\n* Limitation - May only be used when you truly believe that your are correct."
                ),
                "Small Talk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Small Talk",
                  ":titles",
                  "The Gift of Gab"
                ),
                ":Streetwise",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Streetwise",
                  ":summary",
                  "* [Action]: Gain knowledge where a good or service can be found in a city including black market goods or services."
                ),
                ":Translator",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Translator",
                  ":summary",
                  "* Can translate immediately"
                ),
                "Trash Talk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trash Talk",
                  ":reference",
                  "* What's the matter Agent Scary Lips? You're Scary Lips tasting my hairy shit? You tasting Doug Wilson's World Famous beef stew? How's it going down, its kinda spicy right? You guys are so fucked right now, all I can think about is your wife and a horse. - Doug Wilson, Weeds",
                  ":titles",
                  "Put Down"
                ),
                ":Videography",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Videography",
                  ":titles",
                  "Cameraman, Videographer"
                ),
                "Video Production",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Video Production",
                  ":titles",
                  "Director, Producer"
                ),
                "Wise Words",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wise Words",
                  ":summary",
                  "* Apply personal life experiences to help others understand themselves."
                ),
                ":Cantonese",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cantonese"
                ),
                ":English",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "English"
                ),
                ":French",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "French"
                ),
                ":German",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "German"
                ),
                ":Greek",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Greek"
                ),
                ":Italian",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Italian"
                ),
                ":Latin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Latin"
                ),
                ":Mandarin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mandarin"
                ),
                "Olde English",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Olde English"
                ),
                ":Portuguese",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Portuguese"
                ),
                ":Russian",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Russian"
                ),
                "Sign Language",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sign Language"
                ),
                ":Spanish",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spanish"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Linguistics",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Linguistics",
                  ":reference",
                  "* So we put her on the hit list, of a common, cunning linguist: a master of many tongues. - Deep Purple, Knocking at Your Backdoor",
                  ":summary",
                  "* Philosophy - The 'common tongue' concept is boring and unrealistic.\n* Simulate the limitations of language by reducing usable vocabulary. This can be done by limiting a conversation to 2, 3, 4, or 5 letter words depending on the fluency of those involved. Having a conversation using only 2 letter words is going to require a fair amount of hand gesturing or drawing to get a point across. If a person is overhearing a conversation, bleep out the big words and let them guess at the missing words."
                ),
                ":Writing",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Writing"
                )
              )
            ),
            ":Crime",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Crime",
              ":titles",
              "Bandit, Brigand, Crime Boss, Crook, Cutthroat, Highwayman, Pimp, Yakuza, Yakuza - Oyabun",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Armed Robbery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Armed Robbery"
                ),
                ":Blackmail",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blackmail"
                ),
                ":Bribery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bribery"
                ),
                "Crime Syndicate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crime Syndicate"
                ),
                "Crime Wave",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crime Wave"
                ),
                "Criminal Mastermind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Criminal Mastermind"
                ),
                ":Extortion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Extortion"
                ),
                "Fence Goods",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fence Goods"
                ),
                ":Kidnapping",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Kidnapping"
                ),
                "Mafia Connections",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mafia Connections"
                ),
                ":Pimping",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pimping"
                ),
                ":Piracy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Piracy",
                  ":summary",
                  "* Armed robbery of large shipments of goods without damaging the merchandise."
                ),
                ":Prostitution",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prostitution"
                ),
                ":Rustling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rustling",
                  ":summary",
                  "* Stealing and selling livestock"
                ),
                ":Waylay",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Waylay"
                )
              )
            ),
            ":Deception",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Deception",
              ":reference",
              "* I whisper Truth, into Lies... - Leblanc, Runeterra",
              ":titles",
              "Chicanery, Legerdemain",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Burglary",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Burglary"
                ),
                "Con Artist",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Con Artist"
                ),
                "Confidence Game",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Confidence Game",
                  ":titles",
                  "Con Artist, Swindler"
                ),
                ":Decoy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Decoy",
                  ":summary",
                  "* Create a decoy to mislead.\n* [Move]: Remove this unit from play and place 1 Decoy Token and 1 Decoy Unit Token on this unit's space. Both decoys may act normally during the Action phase, but any action but movement will dispel the decoys.  Both decoys defend as the original unit. If either unit is Hit, both decoys are dispelled. The decoys last until the next turn or until dispelled."
                ),
                "Detect Trap",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Detect Trap"
                ),
                ":Distraction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Distraction",
                  ":titles",
                  "Throw Dirt"
                ),
                ":Escape",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Escape",
                  ":reference",
                  "* The chain in those handcuffs is high-tensile steel. It'd take you ten minutes to hack through it with this. Now, if you're lucky, you could hack through your ankle in five minutes. Go.",
                  ":summary",
                  "* The ability comes from extensive practice escaping from various bonds and confinements. At higher abilities, the user can dislocate joints to slither out of bonds.",
                  ":titles",
                  "Escape Artist"
                ),
                "Evade Pursuit",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Evade Pursuit",
                  ":summary",
                  "* Ability to correctly evaluate the opponent's pursuit style and outwit the pursuer."
                ),
                ":Forgery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Forgery",
                  ":summary",
                  "* The ability to forge money or documents. This ability is also used while creating money to prevent forgery.\n* [Extended Action]: Roll vs. object quality or anti-forgery level. Any [Hits] allow a forgery that can pass at a distance. The more [Hits] and [Criticals] rolled, the more indistinquishable from the original. High level forgeries are works of art unto themselves."
                ),
                ":Gambling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gambling",
                  ":titles",
                  "Gambler, High Roller"
                ),
                "Honor Among Thieves",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Honor Among Thieves"
                ),
                ":Misdirection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Misdirection"
                ),
                "Pick Pockets",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pick Pockets"
                ),
                "Sleight of Hand",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sleight of Hand",
                  ":summary",
                  "* Hide a small object in hand without being noticed.",
                  ":titles",
                  "Legerdemain"
                ),
                ":Smuggling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Smuggling"
                ),
                "Stage Magic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stage Magic"
                ),
                "Thieves Guild Codes",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Thieves Guild Codes",
                  ":summary",
                  "Thieves must conceal their illegal conversations and the guilds have developed a shifting series of hand signals, marks, and code words to communicate simple concepts without arising suspiscion."
                ),
                "Use Blinding Powder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Use Blinding Powder"
                ),
                "Use Flash Powder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Use Flash Powder"
                ),
                "Use Irritating Powder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Use Irritating Powder"
                ),
                "Use Sleeping Powder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Use Sleeping Powder"
                ),
                ":Vanish",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vanish"
                ),
                ":Ventriloquism",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ventriloquism"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Thievery",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Thievery",
                  ":reference",
                  "This is where Forrestall cashed in.  A friend of yours?  A competitor... he was good. He was very good. - Indiana Jones, Raiders of the Lost Ark",
                  ":summary",
                  "* Burglary, Escape, Fence Goods, Honor Among Thieves, Pick Pockets, Smuggling, Thieves Guild Codes",
                  ":titles",
                  "Burglar, Cutpurse, Footpad, Nezumi kozo, Pick Pocket, Smuggler, Thief"
                ),
                ":Trickery",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Trickery",
                  ":summary",
                  "* Blinding Powder, Confidence Game, Decoy, Distraction, Flash Powder, Gambling, Irritating Powder, Misdirection, Sleight of Hand, Stage Magic, Swindling, Vanish, Ventriloquism",
                  ":titles",
                  "Blackguard, Caitiff, Charlatan, Con Artist, Delinquent, Gambler, Knave, Ne'er do well, Ninja, Rapscallion, Renegade, Riffraff, Rogue, Scoundrel, Scalawag, Stage Magician, Swashbuckler, Swindler, Trickster"
                )
              )
            ),
            ":Espionage",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Espionage",
              ":titles",
              "Covert Ops, Infiltrator, Informer, Spy, Traitor",
              ":stat",
              "Shadow",
              ":abilitymap",
              nx_tactics_base.f_abilitymap_from_abilitylist(
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Counterintelligence"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cyber Intelligence",
                  ":summary",
                  "* Intelligence gathered from computer networks.",
                  ":titles",
                  "CYBINT, DNINT, Digital Network Intelligence"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eavesdrop",
                  ":summary",
                  "* Listen in to conversations without being detected."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Infiltrate",
                  ":summary",
                  "* [Defense] - Mind\n* [Deploy] - Deploy this unit in waiting area.\n* [Action] - Replace any non-unique unit with this unit."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Geospatial Intelligence",
                  ":summary",
                  "* Intelligence gathered from satellite, aerial photography, mapping.\n* Espionage, Diplomats, Military Attaches, NGOs, Patrolling, POWs Detainees, Refugees, Strategic Reconnaissance, Traveller Debriefing",
                  ":titles",
                  "GEOINT, IMINT, Imagery Intelligence"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Human Intelligence",
                  ":summary",
                  "* Intelligence gathered from a person on the ground.\n* Espionage, Diplomats, Military Attaches, NGOs, Patrolling, POWs Detainees, Refugees, Strategic Reconnaissance, Traveller Debriefing",
                  ":titles",
                  "HUMINT"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Intelligence Network",
                  ":reference",
                  "If you thought there was some secret cell somewhere working Al Qaedia. Then I want you to know you're wrong. This it it. There is no working group coming to the rescue. There is nobody else hidden on some other floor. There is just us... and we are failing!... They murdered 3000 of our citizens..in cold-blood and they have slaughtered our forward deploy. And what the fuck have we done about it, huh? What have we done?! We have 20 leadership names. We have only eliminated 4 of them. I want targets. Do your fucking jobs. Bring me people to kill. - Zero Dark Thirty"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lip Reading",
                  ":summary",
                  "* Attempt to understand what is being said without the benefit of hearing. The more [Hits] rolled, the more accurate the interpretation."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Measurement and Signals",
                  ":summary",
                  "* Intelligence gathered from the signatures (distinctive characteristics) of fixed or dynamic target sources. This includes radar, acoustic, nuclear, chemical, and biological intelligence.",
                  ":titles",
                  "MASINT"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Misdirection",
                  ":reference",
                  "* Smoke and Mirrors... Classic Misdirection - Leblanc, Runeterra"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Open Source Intelligence",
                  ":summary",
                  "* Intelligence gathered from open sources.",
                  ":titles",
                  "OSINT"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Propaganda"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Quick Change"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sabotage",
                  ":titles",
                  "Saboteur"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Signals Intelligence",
                  ":reference",
                  "* Quiller",
                  ":summary",
                  "* Intelligence gathered from interception of signals.",
                  ":titles",
                  "SIGINT, Signals"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Subversion"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Technical Intelligence",
                  ":summary",
                  "* Intelligence gathered from analysis of weapons and equipment.",
                  ":titles",
                  "TECHINT"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Whispering Campaign"
                )
              )
            ),
            ":Faith",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Faith",
              ":reference",
              "The argument goes something like this: 'I refuse to prove that I exist,' says God, 'for proof denies faith, and without faith I am nothing.' 'But,' says Man, 'The Babel fish is a dead giveaway, isn't it? It could not have evolved by chance. It proves you exist, and so therefore, by your own arguments, you don't. QED.' - Hitchhiker's Guide to the Galaxy",
              ":titles",
              "Abbot, Absolver, Archbishop, Bishop, Cardinal, Cleric, Ceremonial Guard, Gakusho, Missionary, Paladin, Priest, Redeemer, Sin	Eater, Theologist, Theurge, Theurgy",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Absolution",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Absolution"
                ),
                ":Affirmation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Affirmation",
                  ":summary",
                  "An affirmation is a statement designed to have a positive effect on the conscious mind when repeated at frequent intervals throughout meditation ritual spells."
                ),
                ":Atonement",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Atonement"
                ),
                ":Blessing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blessing",
                  ":summary",
                  "* A simple incantation with a variety of subtle effects.\n* [Action]: Touch. Target gains a new Blessing Token (max 1).  At any time, the target may remove the token and gain +1 on any Defense roll.\n* [Duration]: up to 1 day/level."
                ),
                ":Chant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chant",
                  ":summary",
                  "* Aura: All Allies with same Religion within level spaces receive +1 on Defense rolls."
                ),
                ":Confession",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Confession"
                ),
                ":Consecration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Consecration",
                  ":summary",
                  "* To consecrate is to solemnly dedicate or devote something or someone to a sacred purpose, to cleanse and protect."
                ),
                ":Contemplation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Contemplation",
                  ":summary",
                  "* Contemplation is a focused and disiplined form of contemplation or reflecting, whereby one is able to alter an emotional state and to receive self-insight."
                ),
                ":Conversion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Conversion"
                ),
                ":Dedication",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dedication",
                  ":summary",
                  "* [Death]: Unit enters specified Deity's realm.  It is not substantiated that this ability actually works. Those who have crossed over are changed and may not and will not return."
                ),
                ":Drumming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drumming",
                  ":summary",
                  "* Drumming is literally pounding on a surface.  This is used to raise power and to change emotional states."
                ),
                ":Excommunication",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Excommunication"
                ),
                ":Initiation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Initiation",
                  ":summary",
                  "* Used to describe the profound spiritual experience that occurs when one's unity with Deity and the Universe is realised; when one is welcomed as a fully-fledged member of a particular group; and the celebration of a successful ritual."
                ),
                ":Marriage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Marriage"
                ),
                ":Mass",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mass"
                ),
                ":Namegiving",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Namegiving"
                ),
                ":Ordainment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ordainment"
                ),
                ":Redemption",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Redemption"
                ),
                ":Sacrament",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sacrament"
                ),
                ":Salvation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Salvation"
                ),
                ":Sanctify",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sanctify"
                ),
                "Sin Eating",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sin Eating",
                  ":summary",
                  "* A willing subject may describe his dark desires, the Sin Eater then repeats the description replacing references to the subject with himself. After the ritual is complete, the subject will not feel the urges so strongly. Instead the Sin Eater will feel those emotions. If he acts on them, even symbolically, his [Shadow] gains power. If he can resolve them, he gains experience."
                )
              )
            ),
            ":Influence",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Influence",
              ":reference",
              "* Many men, of course, became extremely rich, and this was perfectly natural and nothing to be ashamed of because no one was really poor, at least no one worth speaking of. - Hitchhiker's Guide to the Galaxy",
              ":titles",
              "Aristocrat, Baron, Baroness, Baronet, Celebrity, Count, Countess, Daimyo, Dame, Duchess, Duke, Emperor, Empress, King, Knight, Lord, Marchioness, Marquis, Matriarch, Monarch, Patriarch, Pontif, Prince, Princess, Queen, Regina, Regis, Sire, Sovereign, Star",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Black Market Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Black Market Ties"
                ),
                ":Boon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Boon"
                ),
                ":Business",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Business"
                ),
                "Carte Blanche",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Carte Blanche",
                  ":titles",
                  "Blank Check"
                ),
                "Corporate Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Corporate Ties"
                ),
                "Entertainment Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Entertainment Ties"
                ),
                ":Fame",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fame",
                  ":summary",
                  "* Your reputation precedes you. People are drawn to the famous and will often do extraordinary things to be near them.\n* [Synergy]: [Seduction]\n* [Action]: Leverage your fame to gain minor free goods or services including upgraded lodging, free meals, audience with nobles, etc."
                ),
                "Family Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Family Ties"
                ),
                ":Fortune",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fortune"
                ),
                ":Followers",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Followers",
                  ":titles",
                  "Acolyte, Apprentice, Retinue, Servant, Serf, Shieldbearer"
                ),
                "Friends in High Places",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Friends in High Places",
                  ":reference",
                  "* I'm telling you this guy is protected from up on high by the Prince of Darkness. - Jeff Rabin, Usual Suspects"
                ),
                ":Infamy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Infamy",
                  ":summary",
                  "* Your dark reputation precedes you. People are intrigued by the infamous and will often do extraordinary things in fear and facination of them.\n* [Synergy]: [Intimidation]\n* [Action]: Leverage your infamy to gain minor free goods or services including upgraded lodging, free meals, etc."
                ),
                ":Intrigue",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Intrigue"
                ),
                ":Investing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Investing"
                ),
                "Judicial Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Judicial Ties"
                ),
                "Law Enforcement Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Law Enforcement Ties"
                ),
                "License to Kill",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "License to Kill"
                ),
                ":Mansion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mansion"
                ),
                "Media Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Media Ties"
                ),
                "Night Club",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Night Club"
                ),
                "Noble Birth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Noble Birth"
                ),
                "Official Title",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Official Title"
                ),
                "Political Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Political Ties",
                  ":titles",
                  "Ambassador, Minister, Politician, Senator"
                ),
                "Religious Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Religious Ties"
                ),
                "Train Follower",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Train Follower"
                ),
                "Underworld Ties",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Underworld Ties"
                ),
                ":Windfall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Windfall"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Nobility",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Nobility",
                  ":titles",
                  "Noble Lineage"
                ),
                ":Royalty",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Royalty",
                  ":titles",
                  "Royal Lineage"
                )
              )
            ),
            ":Intimidation",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Intimidation",
              ":reference",
              "* I must not fear. Fear is the mind-killer. Fear is the little-death that brings total obliteration. I will face my fear. I will permit it to pass over me and through me. And when it has gone past I will turn the inner eye to see its path. Where the fear has gone there will be nothing. Only I will remain. - Bene Gesserit Litany, Dune\n* They tell him they want his territory: all his business. Soze looks over the faces of his family, then he showed these men of will what will really was. He tells him he would rather see his family dead, than live another day after this. ... He waits until his wife and kids are in the ground, and then he goes after the rest of the mob. He kills their kids. He kills their wives. He kills their parents and their parents friends. He burns down the houses they live in and the stores they work in. He kills people who owe them money. And like that, he's gone. - Verbal Kint, Usual Suspects",
              ":titles",
              "Demagogue, Enforcer, Fearmonger, Overseer, Pimp, Slave Lord, Slaver, Tormentor, Torturer",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Coercion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Coercion",
                  ":reference",
                  "* The boat will be ready for you on Friday. If I see you or any of your friends before then, Miss. Finneran will find herself the victim of a most gruesome violation before she dies. As will your father, Mr. Hockney, and your Uncle Randall in Arizona, Mr. Kint. I might only castrate Mr. McManus's nephew, David. Do I make myself clear? - Kobayashi, Usual Suspects"
                ),
                "Death March",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Death March",
                  ":summary",
                  "* Increase movement of allies within level spaces. Sustained use of this ability runs the risk of injuring or killing some allies."
                ),
                ":Duress",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Duress"
                ),
                ":Enslave",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enslave",
                  ":reference",
                  "Did you know that pain causes the formation of the strongest chemical bonds in the mammalian brain?  Whip a dog, and it keeps coming back... At first it will hope that you'll stop, but after a while, it won't even know the difference. But you already know all about that don't you?... Time melted away into the pain... Finally something clicked over in his head and reality rushed back in around him, clearer and sharper than ever before... Staring he made out faces. Faces not unlike his own reflection he had seen only an eternity ago. Faces distended in howling agony... eyes welling with tears of blood, eyes that all turned toward Her, crying in admiration. - Mage: The Book of Madness"
                ),
                "Grip of Fear",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Grip of Fear",
                  ":reference",
                  "* It was Keyser Soze, Agent Kujan. I mean the Devil himself. How do you shoot the devil in the back? What if you miss? - Verbal, Usual Suspects"
                ),
                ":Interrogate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Interrogate",
                  ":reference",
                  "* I'm gonna ask you one more goddamn time, and if you still 'respectfully refuse,' I'm callin' the Bear Jew over here, and he's gonna take that big-ole bat of his, and he's gonna beat you to death with it. Now take your wiener schnitzel lickin' finger and point out on this map what I want to know...We got a German here who wants to die for his country! Oblige him! - Lt. Aldo Raine, Inglourious Basterds\n* You don't need that. I'll tell you everything. Yes...I know you will. - Raiders of the Lost Ark"
                ),
                ":Intimidate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Intimidate",
                  ":reference",
                  "* Your timing is impeccable. Pity you were all they sent... The Fatui would do well to update their intelligence concerning me. Ah, but of course, that would require one of you to return in one piece. - Ayato, Genshin Impact\n* ...to the death. No. To the pain. I don't think I'm quite familiar with that phrase. ... To the pain means the first thing you will lose will be your feet below the ankles. Then your hands at the wrists. Next your nose. ...And then my ears, I understand let's get on with it. WRONG. Your ears you keep and I'll tell you why. So that every shriek of every child at seeing your hideousness will be yours to cherish. Every babe that weeps at your approach, every woman who cries out, 'Dear God! What is that THING?,' will echo in your perfect ears. That is what to the pain means. It means I leave you in anguish, wallowing in freakish misery ... forever. ...I think you're bluffing. It's possible, Pig, I might be bluffing. It's conceivable, you miserable, vomitous mass, that I'm only lying here because I lack the strength to stand. But, then again... perhaps I have the strength after all. - Princess Bride",
                  ":summary",
                  "* A form of bluffing"
                ),
                "Reign of Terror",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reign of Terror",
                  ":summary",
                  "* Use to rally troops"
                ),
                ":Terrorize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Terrorize",
                  ":summary",
                  "* [Attack]: Any [Critical Hits] may be [Retreats]"
                ),
                ":Torment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Torment"
                ),
                ":Torture",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Torture",
                  ":reference",
                  "* Your cries of agony, where will they not reach?  Where on Citaeron will they not re-echo?  No man living will meet a doom more terrible than yours. - Sophocles, Oedipus Rex"
                )
              )
            ),
            ":Law",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Law",
              ":titles",
              "Bailiff, Constable, Executioner, Judge, Lawbringer, Lawyer, Litigant, Magistrate, Peace Officer, Peacekeeper, Police Officer",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Authority",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Authority"
                ),
                "Blind Justice",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blind Justice"
                ),
                "Call In Backup",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call In Backup",
                  ":summary",
                  "Bring me everyone.  What do you mean 'everyone'?  E-V-E-R-Y-O-N-E! - Stansfield and Benny - Leon the Professional"
                ),
                ":Condemn",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Condemn"
                ),
                ":Confiscate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Confiscate"
                ),
                "Crime and Punishment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crime and Punishment"
                ),
                "Crowd Control",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crowd Control"
                ),
                "Detective Work",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Detective Work",
                  ":reference",
                  "* To a cop the explanation is never that complicated. It's always simple. There's no mystery to the street, no arch criminal behind it all. If you got a dead body and you think his brother did it, you're gonna find out you're right. - Verbal, Usual Suspects"
                ),
                ":Dragnet",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dragnet",
                  ":reference",
                  "* Our fugitive has been on the run for ninety minutes. Average foot speed over uneven ground barring injuries is 4 miles-per-hour. That gives us a radius of six miles. What I want from each and every one of you is a hard-target search of every gas station, residence, warehouse, farmhouse, henhouse, outhouse and doghouse in that area. - The Fugitive",
                  ":summary",
                  "* Search a large area for a fugitive."
                ),
                ":Exile",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Exile"
                ),
                ":Exonerate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Exonerate"
                ),
                ":Judgment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Judgment",
                  ":reference",
                  "* I am the law! - Judge Dredd"
                ),
                ":Precedent",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Precedent"
                ),
                ":Prosecute",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prosecute"
                ),
                "Scales of Justice",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scales of Justice"
                ),
                ":Shakedown",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shakedown",
                  ":reference",
                  "* How many times you been in a lineup? It's always you and four dummies. PD are paying homeless guys $10 a head half the time. And there's no way they'd line five felons in the same row. No way - Keaton, Usual Suspects"
                ),
                ":Trial",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trial"
                )
              )
            ),
            ":Performance",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Performance",
              ":reference",
              "* Ahh, the denouement. - Jhin, Runeterra",
              ":titles",
              "Entertainer, Performer, Jester, Juggler",
              ":stat",
              "Spirit",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Allure",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Allure"
                ),
                ":Amplify",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Amplify",
                  ":reference",
                  "These go to eleven. - This is Spinal Tap",
                  ":summary",
                  "* A performer must be able to be heard. This ability maximizes the acoustics available and allows the performer's message to be heard."
                ),
                ":Ballad",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ballad"
                ),
                "Ballroom Dance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ballroom Dance"
                ),
                "Break Dance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Break Dance"
                ),
                ":Calm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Calm",
                  ":titles",
                  "Pacify, Soothe the Savage"
                ),
                "Captivating Song",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Captivating Song",
                  ":summary",
                  "* For each success, the targets Move is reduced by 1."
                ),
                ":Comedy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Comedy",
                  ":titles",
                  "Clown, Comedian, Mime, Jester"
                ),
                ":Crescendo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crescendo"
                ),
                ":Dirge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dirge",
                  ":summary",
                  "* Opponents in Radius are cloaked in despair.\n* [Passive]\n* [Continuous]: [Retreats] are increased by 1 for all opponents within the radius.",
                  ":titles",
                  "Demoralize, Song of Fear"
                ),
                ":Discord",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Discord",
                  ":summary",
                  "* A sudden sound that disrupts the natural flow of existing sounds.\n* The secret to this skill is to pick the most inappropriate sound at the most inappropriate time.\n* The result is extremely distracting and will cancel other effects based on sound including other Communication abilities.",
                  ":titles",
                  "Cacaphony"
                ),
                ":Disguise",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Disguise"
                ),
                ":Fanfare",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fanfare",
                  ":summary",
                  "* A cheering audience increases an entertrainer's power."
                ),
                "Gabriel's Horn",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gabriel's Horn",
                  ":summary",
                  "* [Requires]: Horn\n* Damages Walls of any kind"
                ),
                ":Harmonize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Harmonize"
                ),
                ":Heartstrings",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heartstrings",
                  ":reference",
                  "* Strumming my pain with his fingers. Singing my life with his words. Killing me softly with his song. Killing me softly with his song telling my whole life with his song. - The Fugees, Killing Me Softly"
                ),
                "Hip Hop Dance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hip Hop Dance"
                ),
                ":Imitation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Imitation"
                ),
                ":Impersonation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Impersonation"
                ),
                ":Incite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Incite"
                ),
                ":Inspiration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Inspiration",
                  ":summary",
                  "* Allies in Radius are Continuously inspired to greater feats by this ability.\n* [Passive]\n* [Continuous]: [Retreats] are reduced by 1 for all allies within the radius."
                ),
                ":Juggling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Juggling",
                  ":summary",
                  "* Besides juggling objects, this ability allows the user to catch objects.\n* [Reaction]: When an object is thrown at a space within one space of the user, roll vs. the [Attack], the object is caught if any [Hits] are scored. Further, the user may immediately throw the object using [Juggling] level as attack value."
                ),
                ":Lullaby",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lullaby"
                ),
                "Performance Art",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Performance Art",
                  ":reference",
                  "Cirque de Soleil"
                ),
                "Pole Dance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pole Dance"
                ),
                ":Requiem",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Requiem"
                ),
                "Salsa Dance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Salsa Dance"
                ),
                ":Satirize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Satirize"
                ),
                ":Serenade",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Serenade"
                ),
                ":Sexpertise",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sexpertise",
                  ":reference",
                  "* If you don't like the company, let's just do it you and me...you and me...or three...or four, on the floor. - Britney Spears, Three"
                ),
                ":Silence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Silence"
                ),
                "Siren Song",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Siren Song",
                  ":summary",
                  "* [Action]: For each success, during its turn, the target must use half of its [Move] to approach the singer."
                ),
                ":Speeches",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Speeches"
                ),
                ":Song",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Song"
                ),
                ":Storytelling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Storytelling",
                  ":titles",
                  "Storyteller"
                ),
                ":Style",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Style"
                ),
                ":Tango",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tango"
                ),
                ":Waltz",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Waltz"
                ),
                "War Song",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "War Song",
                  ":reference",
                  "Battle Hymn, Glorious Anthem"
                ),
                "Work Song",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Work Song"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Courtesan",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Courtesan",
                  ":reference",
                  "* Madame Kaji: We've been servicing the road-weary crotches of every man here to pay obeisance to your new family. You need service only one, freshly washed. Akemi: You don't understand. Madame Kaji: That he's a beast. He's weak. He's a man. All men are weak. The ones who act beastly are weakest. They penetrate women and think that makes them powerful. Really, their pricks are fragile. Exposed. You saw it yourself. They want to be diapered, spanked, and breastfed, then strut away like they conquered an army. Nurture his weakness. Be his strength, and he'll worship you. Akemi: I, don't know if I can. Madame Kaji: Stop running to and from men, and decide what you want for your fucking self. Akemi: I want to be in control of my life. Madame Kaji: Then take control of his, Princess - Madame Kaji and Akemi, Blue Eye Samurai",
                  ":summary",
                  "* A prostitute, especially one whose clients are members of a royal court or of high social standing."
                ),
                ":Dance",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Dance",
                  ":summary",
                  "Ballroom Dance, Break Dance, Hip Hop Dance, Pole Dance, Salsa Dance, Tango, Waltz"
                ),
                ":Music",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Music",
                  ":summary",
                  "* Song, Musical Instrument\n* The power of music lies in its ability to tell truths that we willing listen to even if they are unpleasant.\n* See Equipment for Musical Instruments\n* Musical Instruments may be used with any performance power to increase any Range or Radius by 1 Space.",
                  ":titles",
                  "Bard, Classical, Drummer, Guitarist, Harpist, Hip-Hop, Jazz, Lyrist, Minstrel, Musician, Piper, Pop, Rap, Rhapsode, Rock, Skald, Troubadour"
                ),
                ":Acting",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Acting",
                  ":reference",
                  "* Acting! - Master Thespian, Saturday Night Live",
                  ":titles",
                  "Drama Queen, Master Thespian, Theater Brat, Thespian"
                )
              )
            ),
            ":Persuasion",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Persuasion",
              ":titles",
              "Fast Talker, Silver Tongue Devil, Smooth Operator",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Bluff",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bluff"
                ),
                ":Credibility",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Credibility",
                  ":summary",
                  "* The ability to convince large groups of people that you are telling the truth."
                ),
                ":Debate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Debate"
                ),
                "Fast Talk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fast Talk"
                ),
                ":Lying",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lying",
                  ":titles",
                  "Fibbing"
                ),
                ":Manipulation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Manipulation"
                ),
                ":Pickup",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pickup"
                ),
                ":Seduction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Seduction",
                  ":reference",
                  "* But what of all those sweet words you spoke in private?  Oh that's just what we call pillow talk, baby, that's all. - Ash, Army of Darkness\n* But you don't understand. That men are weak? \n* Guess I must be dumb. She had a pocket full of horses, trojan and some of them used... I guess I should have closed my eyes when you drove me to the pace where your horses run free. Cause I felt a little ill when I saw all the pictures of the jockeys that were there before me. Believe it or not, I started to worry. I wondered if I had enough class. But it was Saturday night, I guess that makes it alright. And you say, Baby have you got enough gas? Oh, Yeah! - Prince, Little Red Corvette",
                  ":titles",
                  "Femme Fatale, Vamp"
                ),
                "Silver Tongue",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Silver Tongue"
                ),
                "Swords to Plowshares",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Swords to Plowshares",
                  ":summary",
                  "* Sincerly convince a rival to choose peace over conflict."
                )
              )
            ),
            "Social Sciences",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Social Sciences",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Anthropology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Anthropology",
                  ":summary",
                  "* The study of cultures, customs, habits, race, tribes, gangs, and other group affliations and interactions."
                ),
                "Breaking Point",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Breaking Point",
                  ":summary",
                  "* Determine psychological weaknesses (phobias, addictions, obsessions, etc.)"
                ),
                "Determine Motivation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Determine Motivation"
                ),
                ":Philosophy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Philosophy"
                ),
                ":Profile",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Profile"
                ),
                ":Psychoanalyze",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Psychoanalyze"
                ),
                ":Psychology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Psychology"
                ),
                ":Sociology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sociology"
                ),
                ":Teaching",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Teaching",
                  ":reference",
                  "* The true master is an eternal student. - Master Yi, Runeterra",
                  ":titles",
                  "Educator"
                ),
                ":Theology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Theology",
                  ":summary",
                  "* Knowledge about the history, customs, and objects of religions. Though the focus is on a particular religion, Theology includes some understanding of all religions."
                )
              )
            ),
            ":Stealth",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Stealth",
              ":titles",
              "Stalker",
              ":stat",
              "Body",
              ":summary",
              "* This skill includes abilities that let you hide, move silently, and suprise your opponents.",
              ":abilitymap",
              nx_tactics_base.f_abilitymap_from_abilitylist(
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ambush",
                  ":summary",
                  "* [Simple Skill]: Anyone who is within 10m, tests [Investigation] vs. [Stealth] with [Advantage] to detect them.\n* [Downtime]: Carefully choose an ambush spot and conceal multiple units. They remain concealed as long as they do not move or speak."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Backstab",
                  ":summary",
                  "* [Passive]:\n** IF [Flanking] THEN [Initiative]:+1 AND [Hits]:+1\n** IF [Blindspot] THEN [Initiative]:+1/level AND [Hits]:+1/[Level]",
                  ":titles",
                  "Back Biter, Back Stabber, Opportunist, Traitor"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blend into the Crowd",
                  ":summary",
                  "* Attitude, Mannerism, and Appearance can often allow a stranger to go unnoticed in a crowd.\n* [Continuous]: While active, unit is hidden as long as at least 10 other units are within skill spaces."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Camouflage",
                  ":summary",
                  "* [Continuous]: While active, unit is hidden.\n* [Defense]: +1 Defense in [Terrain].\n* [Roll]: Skill - Move this turn.\n* [Versus]: and others must roll Spirit - Terrain penalty vs to detect."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cloak and Dagger",
                  ":summary",
                  "* [Action]: Gains short term Stealth, move up to 2 spaces ignoring attacks of opportunity and attack with a [Knife] by [Surprise]."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hide",
                  ":summary",
                  "* Find a hiding place in an area where you will not normally be detected.\n* IF You have [Full Cover] AND you don't move AND your opponents are at least your [Body] spaces away.\n* THEN [Action] [Continuous]: You are hidden from view AND Opponents must succeed at [Investigate]/[Seek] to detect you."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sneak",
                  ":summary",
                  "* Move silently: [Passive]: You may move at half speed (rounded down) without cancelling [Stealth] abilities."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sneak Attack",
                  ":titles",
                  "Suprise Attack"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stalk",
                  ":summary",
                  "* The ability to move carefully to avoid detection.\n* [Requires]: No other action may be performed this turn.\n* [Action]: Move at half speed. Any attempt to act toward you, first requires an Mind vs. your skill or fail."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Strike and Fade",
                  ":summary",
                  "* [Requires]: No other action may be performed this turn.\n* [Attack]: After this attack, if you have sufficient Move remaining, move 1 space."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tailing",
                  ":summary",
                  "* Subtly pursue someone. Ideally, you must stay as far away as possible without losing track of your quarry. Completely unaware people are easy to pursue. Paranoid targets will attempt to spot tailing and may attempt to evade tails even when they do not know they are being tailed."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vanish",
                  ":reference",
                  "* Smoke Bomb! - Krieger, Archer",
                  ":summary",
                  "* If you can momentarily break line of sight, you can immediately [Hide]."
                ),
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Without a Trace",
                  ":summary",
                  "* Extremely difficult tor track you."
                )
              )
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_skills_overview
   * @return {chapter}
   */
  static t_chapter_skills_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_skills_overview = {
    vx_type: nx_tactics_books_skills.t_chapter_skills_overview
  }

  // (func chapter_skills_overview)
  static f_chapter_skills_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Skills Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: Skills?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: Skills?",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Extraordinary Skills",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Extraordinary Skills",
              ":reference",
              "* What you call tao. It's a power everyone possesses innately, but mastering it allows one to achieve superhuman abilities... But you must be careful how you use it. Tao is life itself. Use too much, and you'll exhaust more than just your stamina... In the worst case, overuse likely leads to death. - Shion-dono , Hell's Paradise"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function tacticsbook
   * @return {book}
   */
  static t_tacticsbook = {
    vx_type: vx_core.t_type
  }
  static e_tacticsbook = {
    vx_type: nx_tactics_books_skills.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Skills",
      ":image",
      "Skill.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Skills Overview",
        nx_tactics_books_skills.f_chapter_skills_overview(),
        "Skill Types",
        nx_tactics_books_skills.f_chapter_skill_types()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_skill_types": nx_tactics_books_skills.e_chapter_skill_types,
      "chapter_skills_overview": nx_tactics_books_skills.e_chapter_skills_overview,
      "tacticsbook": nx_tactics_books_skills.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_skill_types": nx_tactics_books_skills.t_chapter_skill_types,
      "chapter_skills_overview": nx_tactics_books_skills.t_chapter_skills_overview,
      "tacticsbook": nx_tactics_books_skills.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/skills",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_skill_types)
    nx_tactics_books_skills.t_chapter_skill_types['vx_value'] = {
      name          : "chapter_skill_types",
      pkgname       : "nx/tactics/books/skills",
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
      fn            : nx_tactics_books_skills.f_chapter_skill_types
    }

    // (func chapter_skills_overview)
    nx_tactics_books_skills.t_chapter_skills_overview['vx_value'] = {
      name          : "chapter_skills_overview",
      pkgname       : "nx/tactics/books/skills",
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
      fn            : nx_tactics_books_skills.f_chapter_skills_overview
    }

    // (func tacticsbook)
    nx_tactics_books_skills.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/skills",
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
      fn            : nx_tactics_books_skills.f_tacticsbook
    }

  }
}
