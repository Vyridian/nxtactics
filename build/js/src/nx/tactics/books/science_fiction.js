'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_science_fiction {

  /**
   * @function chapter_alien___predator
   * @return {chapter}
   */
  static t_chapter_alien___predator = {
    vx_type: vx_core.t_type
  }
  static e_chapter_alien___predator = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_alien___predator
  }

  // (func chapter_alien___predator)
  static f_chapter_alien___predator() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Alien / Predator",
      ":image",
      "AlienPredator/AlienPredator.jpg",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Alien Equipment",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Alien Equipment",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Alien Egg",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Alien Egg", ":image", "AlienPredator/Alien_Egg.png", ":reference", "Who's laying these eggs?  I'm not sure. It must be something we haven't seen yet.  Ripley and Bishop, Aliens")
          ),
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Alien Starship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alien Starship", ":image", "AlienPredator/AlienShip.png", ":height", "43m", ":length", "174m", ":width", "117m")
          )
        ),
        ":Aliens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Aliens",
          ":reference",
          "* It'll be dark soon, and they mostly come at night... mostly. - Newt, Aliens\n* My mommy always said there were no monsters - no real ones - but there are.\n* Its structural perfection is matched only by its hostility.  You admire it.  I admire its purity. A survivor... unclouded by conscience, remorse, or delusions of morality. - Ash and Lambert, Alien",
          ":titles",
          "Xenomorph XX121",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Alien Chest Burster",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Alien Chest Burster",
              ":image",
              "AlienPredator/Alien_ChestBurster.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Acidic",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Acidic",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Acid Blood",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Acid Blood")
                  )
                )
              )
            ),
            "Alien (Dog)",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Alien (Dog)",
              ":image",
              "AlienPredator/Alien_Dog.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Acidic",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Acidic",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Acid Blood",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Acid Blood")
                  )
                )
              )
            ),
            "Alien Face Hugger",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Alien Face Hugger",
              ":image",
              "AlienPredator/AlienFaceHugger.png",
              ":reference",
              "* I haven't seen anything like that except, uh, molecular acid.  It must be using it for blood.  It's got a\nwonderful defense mechanism.  You don't dare kill it. - Parker and Brett, Alien",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Acidic",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Acidic",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Acid Blood",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Acid Blood")
                  )
                )
              )
            ),
            "Alien Queen",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Alien Queen",
              ":image",
              "AlienPredator/Alien_Queen.png",
              ":reference",
              "Get away from her, you BITCH! - Ripley, Aliens",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Acidic",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Acidic",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Acid Blood",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Acid Blood")
                  )
                )
              )
            ),
            "Alien Warrior",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Alien Warrior",
              ":image",
              "AlienPredator/Alien_Warrior.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Acidic",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Acidic",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Acid Blood",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Acid Blood")
                  )
                )
              )
            ),
            ":Predalien",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Predalien",
              ":image",
              "AlienPredator/Predalien.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Acidic",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Acidic",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Acid Blood",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Acid Blood")
                  )
                )
              )
            )
          )
        ),
        "Predator Equipment",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Predator Equipment",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Plasma Caster",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Plasma Caster", ":image", "AlienPredator/PredatorPlasmaCaster.jpg"),
            "Predator Claws",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Predator Claws", ":image", "AlienPredator/PredatorClaws.jpg"),
            "Predator Disc",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Predator Disc", ":image", "AlienPredator/PredatorDisc.gif"),
            "Predator Smartgun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Predator Smartgun", ":image", "AlienPredator/PredatorSmartgun.jpg"),
            "Predator Stealthsuit",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Predator Stealthsuit", ":image", "AlienPredator/PredatorStealth.jpg"),
            "Predator Vision",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Predator Vision", ":image", "AlienPredator/PredatorVision.jpg")
          ),
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Predator Scout Ship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Predator Scout Ship"),
            "Predator Hunting Ship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Predator Hunting Ship")
          )
        ),
        ":Predators",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Predators",
          ":summary",
          "* The Yautja do not maintain a unified society, but instead live in tribal groups that rarely interbreed. Over time, the different tribes have developed distinct physical differences.\n* Yautja society reveres honor and physical prowess which can only be proven in personal combat during dangerous hunts.\n* The Yautja stalk and kill their prey using a combination of highly advanced technology, such as active camouflage and energy weapons, combined with comparatively primitive traditional weapons, such as blades, spears and nets. The Predators often ritualistically mutilate their prey and usually claim a trophy from their kills. Capable of interstellar travel in star ships, the Predators have hunted on Earth for centuries and have also had prior contact with the Engineers.\n* Aside from their repeated conflicts with humans, the Predators have notably been associated with Xenomorph XX121, known to them as kiande amedha ('hard meat'), whom they revere as perhaps the most worthy of all prey. They have been known to deliberately breed the creatures from captive Queens in order to hunt them, often as part of initiation rituals for young Predators.",
          ":titles",
          "Yautja",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Un-blooded Predator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Un-blooded Predator", ":summary", "* The lowest level of Yautja warriors. These are warriors in training. Many die during this brutal training regiment designed to cull the weak."),
            "Young Blood Predator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Young Blood Predator", ":summary", "* A Yautja warrior who has completed their training. These warriors await their final test, killing a Xenomorph close range primitive weapons."),
            "Blooded Predator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Blooded Predator", ":image", "AlienPredator/Predator.png", ":summary", "* After killing a Xenomorph, the Predator a full citizen of Yautja society and is allowed access to the Plasma Cannon and other advanced weaponry and spacecraft. A Blooded Predator may join hunts with others or go off on their own to bring back stories, honor, treasure, and trophies."),
            "Elite Predator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Elite Predator", ":image", "AlienPredator/Predator_Veteran.png", ":summary", "* A Yautja warrior who has survived many dangerous hunts is raised to elite status. These Yautja have vast fighting skills and can fight many enemies single-handed."),
            "Elder Predator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Elder Predator", ":summary", "* Older Elite Predators can be given the honorific of Elder. Elder Predators form the political and administrative caste of Yautja society."),
            "Clan Leader Predator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clan Leader Predator", ":summary", "* Clan Leaders direct all Predator business and travel on Predator Flagships. Elder Predators may challenge the Clan Leader to take their position."),
            "Bad Blood Predator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bad Blood Predator", ":summary", "* Bad Bloods are Predators who severely violated their code of honor and were either banished or escaped from their clan. Sometimes the Bad Bloods become the target of a hunt to make an example of them.")
          )
        ),
        "Human Equipment",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Human Equipment",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Combat Armor",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Combat Armor", ":image", "ColonialMarines/CombatArmor.jpg"),
            "VP70Mk9 Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "VP70Mk9 Pistol", ":image", "ColonialMarines/HK_VP70.jpg", ":summary", "18 round 9mm pistol."),
            "M41A Pulse Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "M41A Pulse Rifle", ":image", "ColonialMarines/M41a01.jpg", ":reference", "That's the grenade launcher. I don't think you want to mess with that. - Hicks, Aliens"),
            "Ithaca Model 37 Shotgun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Ithaca Model 37 Shotgun", ":image", "ColonialMarines/Ithaca37Stakeout.jpg", ":reference", "Triva: The one used by Corporal Hicks was passed from father to son all the way back to marines in the Vietnam War.", ":summary", "4 round 12-gauge sporting shotgun produced from 1937.  Aka Stakeout."),
            "M240 Flamethrower",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "M240 Flamethrower", ":image", "ColonialMarines/M240Flamethrower.jpg"),
            "M56 Smartgun MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "M56 Smartgun MG", ":image", "ColonialMarines/M56Smartgun.jpg"),
            "CN-20 Nervergas",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "CN-20 Nervergas", ":image", "ColonialMarines/CN-20Nervegas.jpg"),
            "Motion Tracker",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Motion Tracker", ":image", "ColonialMarines/MotionTracker.jpg", ":reference", "There's somethin' movin' and it ain't us! Tracker's off scale, man. They're all around us! - Hudson, Aliens"),
            "Electronics Pack",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Electronics Pack", ":reference", "Hudson, run a bypass. - Apone, Aliens"),
            ":Welder",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Welder", ":image", "ColonialMarines/Welder.jpg")
          )
        ),
        "Human Vehciles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Human Vehciles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "UD-4L Cheyenne Dropship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "UD-4L Cheyenne Dropship", ":image", "ColonialMarines/Dropship.png", ":height", "6m", ":length", "25m", ":width", "13m"),
            "M577 Armored Personnel Carrier",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "M577 Armored Personnel Carrier", ":image", "ColonialMarines/APC.png", ":height", "3m", ":length", "9m", ":width", "3m"),
            "Conestoga Class Starship",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Conestoga Class Starship",
              ":image",
              "ColonialMarines/Sulaco.png",
              ":summary",
              "Speed: .5G cruising 4G Max\nFTL: 1.762 light years/day\n2 Dropships\nhttp://www.kitsune.addr.com/SF-Conversions/Rifts-Other-Vehicles/USS_Sulaco.htm",
              ":titles",
              "USS Sulaco",
              ":mass",
              "85ktons",
              ":height",
              "105m",
              ":length",
              "385m",
              ":width",
              "77m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored", ":summary", "* The Conestogas skin consists of a laminated layer of insulators, alloy micro meteor shielding, composite armors, and aerogel layers. This provides only limited protection against Kinetic weapons (the best defense against those is high-mass armor, untenable on a starship), but it does provide excellent protection against directed energy weapons.\n* Overlying all of this are layers of Radar Absorbent Material, and a dark grey paint, in order to keep both the ships radar and optical signature as low as possible. In addition to this the ship has a radar jamming system for ECM, and the computer systems are designed with double hardened systems to prevent either jamming or EMP from damaging the ships system or any systems of equipment inside the ship."),
                ":Hanger",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Hanger", ":summary", "20ktons Cargo")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Gunnery", ":summary", "* Its main anti-ship weapons are eight Long Lance missiles, providing it with a good long range punch. These missiles are almost small starships in their capabilities and sensor systems, and are currently the main anti-ship system of both the Colonial Marine Corps and the Navy. Backing up these weapons are two Neutral Particle Beam cannons. These large weapons are mounted along the main hull, and can only fire in a forward arc. Although they do not provide the ship with a Hard Kill capability, they can be used to disrupt a enemies electronics at huge ranges. For close range weapons there are two laser cannons located on either side of the ship. These cannons provide close in defense against missiles, mines, and the odd fighter. For some additional close in Hard Kill capabilities there are two rail guns on the ship, one on top, and the other on the bottom of the main hull. Firing a combination of both kinetic penetrators (essentially tungsten darts) which can punch holes through almost any armor, and kinetic penetrator incendiary (tungsten tipped darts designed to vaporize AFTER impact), these weapons have a reasonable rate of fire, and can do quite a lot of damage to other ships.\n* The ship is also capable of laying mines, with sixty mines available in a ventral dispenser. Although not as large a threat to enemy ships as the ships missiles, they are still quite effective for interdiction and for cutting off civilian shipping.\n* For orbital bombardment the ship has a ventral launcher filled with eighty re-entry vehicles. These can carry a variety of warheads, including nuclear payloads. Such ordnance can only be used when the ship receives the orders to do so from its Captain, or from a Marine Major or personnel higher in rank than that.")
              )
            ),
            ":Nostromo",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Nostromo", ":image", "ColonialMarines/Nostromo.png", ":reference", "This a commercial ship, not a rescue ship. - Parker, Alien", ":summary", "Commercial Towing Vehicle\nSpeed: .12 light years/day\n2 shuttlecraft", ":height", "72m", ":length", "244m", ":width", "165m"),
            "Refinery Ship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Refinery Ship", ":image", "ColonialMarines/Refinery.png", ":height", "881m", ":length", "1500m", ":width", "979m"),
            "Lockmart Starcub Shuttlecraft",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Lockmart Starcub Shuttlecraft", ":image", "ColonialMarines/Shuttlecraft.png", ":titles", "Narcisssus", ":height", "8m", ":length", "16m", ":width", "20m")
          )
        ),
        ":Humans",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Humans",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Company Man",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Company Man", ":reference", "* I work for the company. But don't let that fool you, I'm really an okay guy. - Burke, Aliens\n* This installation has a substantial dollar value attached to it. They can bill me. - Burke and Ripley, Aliens\n* If I went and made a major security situation out of it, everybody steps in; Administration steps in, and there's no exclusive rights for anybody, nobody wins! So I made a decision, and it was... wrong. It was a bad call, Ripley. It was a bad call. - Burke, Aliens"),
            ":Civilian",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Civilian"),
            "Marine Grunt",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Marine Grunt", ":image", "ColonialMarines/Marine.png", ":reference", "* These people are here to protect you. They're soldiers. It won't make any difference. - Ripley and Newt, Aliens\n* Is this gonna be a standup fight, sir, or another bughunt? - Hudson, Aliens\n* He can't make that kind of decision, he's just a grunt! Ah, no offense. None taken. - Burke and Hicks, Aliens", ":summary", "* Pulse Rifle\n* Shotgun"),
            "Marine Heavy Weapons",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Marine Heavy Weapons", ":reference", "* Look, man. I only need to know one thing: where they are. - Vasquez, Aliens"),
            "Marine Lieutenant",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Marine Lieutenant", ":reference", "* How many drops is this for you, Lieutenant? Thirty eight... simulated. How many *combat* drops? Uh,\ntwo. Including this one. - Vasquez and Gorman, Aliens"),
            "Marine Pilot",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Marine Pilot", ":reference", "* We're in the pipe, five by five. - Ferro, Aliens"),
            "Marine Sergeant",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Marine Sergeant", ":reference", "* Another glorious day in the Corps! A day in the Corps is like a day on the farm. Every meal's a banquet! Every paycheck a fortune! Every formation a parade! I LOVE the Corps! - Apone, Aliens"),
            "Marine Tech",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Marine Tech", ":summary", "* Motion Detector\n* Electronics Pack"),
            "Power Loader",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Power Loader", ":image", "ColonialMarines/PowerLoader.png"),
            "Sentry Turret",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sentry Turret", ":image", "ColonialMarines/SentryTurret.png"),
            ":Synthetic",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Synthetic", ":image", "ColonialMarines/Android.png", ":reference", "* Bring back life form. Priority One. All other priorities rescinded. The damn company. What about our lives, you son of a bitch? I repeat, all other priorities are rescinded. - Ash and Parker, Alien\n* I admire its purity. A survivor... unclouded by conscience, remorse, or delusions of morality. - Ash, Alien\n* I prefer the term 'Artificial Person' myself. - Bishop, Aliens\n* Not bad for a human. - Bishop, Aliens\n* Ripley's last trip out, the syn- the artificial person malfunctioned. Malfuctioned? There were problems and a-a few deaths were involved. - Burke and Bishop, Aliens", ":titles", "Syn (derogatory)")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_alternate_realties
   * @return {chapter}
   */
  static t_chapter_alternate_realties = {
    vx_type: vx_core.t_type
  }
  static e_chapter_alternate_realties = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_alternate_realties
  }

  // (func chapter_alternate_realties)
  static f_chapter_alternate_realties() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Alternate Realties",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Big Brother",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Big Brother", ":summary", "* A near future Earth where all activity is monitored by cameras and microphones placed everywhere including bedrooms, bathrooms, and sewers. They cover multiple angles and are nearly impossible to avoid. Computers monitor the feeds and immediately report any criminal activity to police. The police arrest the criminal, conviction is swift, and the criminal is psychologically or chemically 'reconditioned' against further crimes and returned to society. Crime is basically non-existent, and no one remembers a time before the monitoring 	was established. Police are friendly and do not appear in uniform unless a crime has been committed. Police only carry non-lethal weapons unless they are known to be facing armed resistance.\n* Any outsiders entering this world will have a hard time avoiding criminal activity. Fortunately, the computers are unconcerned with suspicious activity and only notice actual crimes. However, attempts to disable cameras are crimes themselves.\n* Interrogations and reconditioning are all computer controlled. Using sophiticated lie detectors, drugs, and aversion therapy, the patient can usually be reconditioned and returned to society in a matter of weeks.\n* A small resistance exists, but there is little they can achieve without outside help. The question is: should they be helped?"),
        "Time in a Bottle",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Time in a Bottle", ":reference", "* If I could save time in a bottle, the first that I'd like to do, is to save every day 'til eternity passes away, just to spend them with you. - Time in a bottle, Jim Croce", ":summary", "* A temporal paradox has trapped the entire Earth in a time loop. For about a month, the people of the planet relive the same week over and over. They remember each loop but the longer they stay in the loop the more likely they are to be compelled to repeat the same events each time. Those who suffer or die during the period know they will repeat their actions but are largely powerless to stop themselves. The experience would eventually drive them insane if their minds could change that much.\n* Time travelers who arrive are immediately recognized by everyone as being different from the previous events. The locals are tremendously thankful that they can react differently since the travelers weren't in the previous time loops. This will be short lived, however, because once the loop resets the time travelers will be part of the loop, and each time the loop resets it will become harder for everyone to act differently again. If the travelers don't sort out this problem, they will be trapped here forever.")
      )
    )
    return output
  }

  /**
   * @function chapter_archetypes
   * @return {chapter}
   */
  static t_chapter_archetypes = {
    vx_type: vx_core.t_type
  }
  static e_chapter_archetypes = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_archetypes
  }

  // (func chapter_archetypes)
  static f_chapter_archetypes() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new({"any-1": nx_tactics_base.t_chapter}, ":name", "Archetypes", ":summary", "* Psionic\n** Preferred Skills: [Telepathy], [Mind Over Matter], [Divination]")
    return output
  }

  /**
   * @function chapter_battlestar_galactica
   * @return {chapter}
   */
  static t_chapter_battlestar_galactica = {
    vx_type: vx_core.t_type
  }
  static e_chapter_battlestar_galactica = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_battlestar_galactica
  }

  // (func chapter_battlestar_galactica)
  static f_chapter_battlestar_galactica() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Battlestar Galactica",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Battlestar Colonials",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battlestar Colonials",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Colonial Raptor",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Colonial Raptor", ":image", "BattlestarGalactica/Colonial_Raptor.png"),
            "Colonial Viper",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Colonial Viper", ":image", "BattlestarGalactica/Colonial_Viper.png"),
            "Colonial Battlestar",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Colonial Battlestar", ":image", "BattlestarGalactica/Colonial_Battlestar.png")
          )
        ),
        ":Cylons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Cylons",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Cylon 6",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cylon 6", ":image", "BattlestarGalactica/Cylon_6.png"),
            "Cylon Centurion",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cylon Centurion", ":image", "BattlestarGalactica/Cylon_Centurion.png"),
            "Cylon Raider",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cylon Raider", ":image", "BattlestarGalactica/Cylon_Raider.png"),
            "Cylon Base Star",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cylon Base Star", ":image", "BattlestarGalactica/Cylon_BaseStar.png")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_doctor_who
   * @return {chapter}
   */
  static t_chapter_doctor_who = {
    vx_type: vx_core.t_type
  }
  static e_chapter_doctor_who = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_doctor_who
  }

  // (func chapter_doctor_who)
  static f_chapter_doctor_who() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Doctor Who",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Doctor Who Equipment",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Doctor Who Equipment",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Psychic Paper",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Psychic Paper", ":image", "DrWho/PsychicPaper.jpg"),
            "Sonic Screwdriver",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sonic Screwdriver", ":image", "DrWho/SonicScrewdriver.jpg"),
            ":TARDIS",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "TARDIS", ":image", "DrWho/Tardis.jpg", ":reference", "* Leela: Explain to me how this... Tardis, is larger on the inside than the out. ... Doctor: It's because insides and outsides are not in the same dimension. Which box is larget? Leela: That one. Doctor: Now which is larger? Leela: That one. Doctor: But it looks smaller. Leela: That's because it's further away. Doctor: Exactly. If you could keep that exactly that distance away and have it here, the large one would fit inside the small one. Leela: That's silly. Doctor: That's transdimensional engineering... - Doctor and Leela, The Robots of Death\n* Leela: Do you mean you can't control it? Doctor: Of course I can control it!.. 9 times out of 10, well 7 times out of 10, 5 times... nevermind... You won't need that. Leela: How do you know? Doctor: I never carry weapons. If people see you mean them no harm, they never hurt you... 9 out of 10 times. - Doctor and Leela, The Robots of Death\n* Tardis: There's a sign on my front door and you've been passing it for 700 years. What does it say? ... Doctor: Pull to open. Tardis: Yes, and what do you do? Doctor: I push. Tardis: Every single time. 700 years. Police boxes doors open out the way. ... Doctor: You know, YOU, have never been very reliable. ... You didn't always take me where I wanted to go. Tardis: No, but I always took you where you needed to go. - Tardis and Doctor, The Doctor's Wife")
          )
        ),
        "Doctor Who Units",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Doctor Who Units",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Amy Pond",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Amy Pond"),
            "Captain Jack Harkness",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Captain Jack Harkness",
              ":image",
              "DrWho/CaptainJackHarkness.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth"),
                    "True Immortality",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "True Immortality")
                  )
                )
              )
            ),
            "Clara Oswald",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clara Oswald", ":reference", "* Clara: Have we just watched the entire life cycle of Earth, birth to death. Doctor: Yes. Clara: And you're okay with that? Doctor: ... Yes. Clara: How can you be? ... To you, I haven't been born yet, and to you I've been dead a hundred billion years. Is my body out there somewhere, in the ground? Doctor: ... Yes... I suppose it is. Clara: But hear we are talking, so I am a ghost. To you, I'm a ghost. We're all ghost to you. We must be nothing. Doctor: No, no. You're not that. Never that. Clara: They what are we? What can we possible be? Doctor: You are the only mystery, worth solving."),
            ":Cyberman",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cyberman", ":image", "DrWho/Cyberman.png", ":reference", "We have 5 million Cybermen. How many are you? Four! You would destroy the Cybermen with 4 Daleks? We would destroy the Cybermen with 1 Dalek! You are superior to us in only one respect. You are better at dying! - Cybermen and Daleks"),
            ":Dalek",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Dalek",
              ":image",
              "DrWho/Dalek.png",
              ":reference",
              "Imagine you were dying. Imagine you were afraid and a long way from home and in terrible pain. And just when you thought it couldn't get worse, you looked up and saw the face of the devil himself. Hello Dalek - The Doctor",
              ":summary",
              "The Daleks odd form may be explained by their personal shielding. Weapons and sensors are placed on stalks so that they may protrude from the shield. This prevents their shield from interfering with their equipment, but it also leaves these devices vulnerable.",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding")
              )
            ),
            ":Davros",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Davros", ":image", "DrWho/Davros.png", ":reference", "* To hold in my hand a capsule that contained such power...To know that the tiny pressure of my thumb, enough to break the glass would end...everything...Yes...I WOULD do it. Such power would put me above the Gods! - Davros\n* Across the entire universe, never stopping, never faltering, never fading. People, planets, and stars will become dust, and the dust will become atoms, and the atoms will become...nothing. Into every dimension, every parallel, every single corner of creation. This is my ultimate victory, Doctor: the destruction of reality... itself! - Davros\n* The man who abhors violence, never carrying a gun.  But this is the truth Doctor, you take ordinary people and\nfashion them into weapons...How many more?  Just think how many have died in your name...The Doctor, the man\nwho keeps running, never looking back because he dare not out of shame.  This is my final victory, Doctor.  I\nhave shown you...yourself. - Davros"),
            "Doctor, The",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Doctor, The", ":image", "DrWho/TheDoctor.png", ":reference", "* Who are you? ... The ground beneath our feet spinning at a 1000 miles an\nhour, and the entire planet is hurtling around the sun at 67,000 miles an hour,\nand I can feel it.  We're falling through space, you and me, clinging to the\nskin of this tiny little world, and if we let go ... That's who I am.  Now\nforget me. - Rose and The Doctor\n* Oh, I'll think of something.  You're just making this up as you go along.\nYup...but I do it brilliantly - The Doctor\n* I've seen him. He's like fire and ice and rage. He's like the night and the\nstorm and the heart of the sun. He's ancient and forever. He burns at the\ncenter of time and he can see the turn of the universe.\n* Is this world protected?  You're not the first lot to have come here.  Oh,\nthere have been so many.  And what you've got to ask is...what happened to\nthem?  Hello, I'm the Doctor.  Basically...run. - The Doctor\n* Everyone's got memories of a holiday they couldn't have be to, or a party\nthey never went to, or met someone for the first time and felt like they've\nknow them all their lives. Time is being rewritten all around us, everyday.\nPeople think their memories are bad, but their memories are fine. The past is\nreally like that. - The Doctor\n* There are laws of time and once upon a time, there were people in charge of\nthose laws, but died. They all died. They all died. And you know who that\nleaves. Me! It has taken me all these years to realize, the laws of time are\nmine. And they will obey me! ... The whole of history could change...the\nfuture of the human race. No one should have that much power. Tough. ... For a\nlong time I thought I was just a survivor, but I'm not. I'm the winner. That's\nwho I am. The Time Lord Victorious. And there is no one to stop you. No. This\nis wrong, Doctor. I don't care who you are. The Time Lord Victorious is wrong!\nThat's for me to decide. ... Is there nothing you can't do? Not anymore.\n- Captain Aldelede and The Doctor\n* Silence will fall when the question is asked...The first question, the\nquestion that must never be answered, hidden in plain sight, the question\nyou've been running from all your life...Doctor WHO?\n* If I run away today. Good people will die. If I stand and fight, some of them\nmight live. Maybe not many. Maybe not for long. Hey, maybe there's no point in\nany of this at all, but its the best I can do. So, I'm going to do it, and I will\nstand here doing it until it kills em. You're going to die too. Someday. What\nwould that be? Have you thought of that? Would you die for? Who I am is where\nI stand. Where I stand... is where I fall. Stand with me. - Doctor and Masters.\n* People always get it wrong with Time Lords. We take forever to die. Even if we are too injured to regenerate, every cell in our bodies keeps trying. Dying properly can take days. That's why we like to die among our own kind. They know not to bury us early. I think... In my current condition, it'll take me about... a day and a half to reach the top of the tower. I think, if I'm lucky, I have a day and a half. - Heaven Sent"),
            ":K-9",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "K-9", ":image", "DrWho/K9.png", ":reference", "The Doctor likes traveling with an entourage. Sometimes they're human, sometimes they're aliens and sometimes they're tin dogs. What about you? Where do you fit in the picture? Me? I'm their man in Havana. I'm their technical support. I'm... Oh my god. I'm the tin dog! - Sarah Jane Smith and Mickey Smith"),
            "Martha Jones",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Martha Jones", ":image", "DrWho/MarthaJones.png", ":reference", "She completely adored him ... Is this going anywhere?  Yes.  Cause he never looked at her twice ... and she wasted years of her life ... and I told her time and time again.  Get out.  So this is me getting out. - Martha Jones and the Doctor"),
            "Master, The",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Master, The", ":image", "DrWho/TheMaster.png", ":reference", "* We stand there... 8 years old... staring at the raw power of time and space, just a child.  Some would be inspired... Some would run away ... and some would go mad.  What about you?  Oh, the one who ran away.  I never stopped. - The Doctor and Martha\n* And so it came to pass, that the human race fell and the Earth was no more. And I looked out on my new Dominion as master of all and I thought it good."),
            "Rose Tyler",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rose Tyler", ":image", "DrWho/RoseTyler.png", ":reference", "This is really seeing the future - you just leave us behind! ... Sarah Jane - you were that close to her once, and now ... you never even mention her. ... I don't age. I regenerate. But humans decay.  You wither and you die. Imagine watching that happen to someone you ... You can spend the rest of your life with me. But I can't spend the rest of mine with you. I have to live on, alone. That's the curse of the Timelords. - Rose and the Doctor, Doctor Who"),
            "Sarah Jane Smith",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sarah Jane Smith", ":image", "DrWho/SarahJaneSmith.png", ":reference", "The universe has to move forward. Pain and loss, they define us as much as happiness or love. Whether it's a world, or a relationship ... Everything has its time.  And everything ends. - Sarah Jane Smith"),
            ":Rutan",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rutan", ":image", "DrWho/Rutan.png"),
            ":Sontaran",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sontaran", ":image", "DrWho/Sontaran.png"),
            "Sontaran Scout Ship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sontaran Scout Ship", ":image", "DrWho/SontaranScoutShip.png"),
            ":Sutekh",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sutekh", ":reference", "* You would use your powers for evil. Evil? Your evil is my good. I am Sutehk the Destroyer. Where I tread, I leave nothing but dust and darkness. I find that good. - The Doctor and Sutekh", ":titles", "Sutekh the Destroyer"),
            "Weeping Angel",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Weeping Angel")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_robotech
   * @return {chapter}
   */
  static t_chapter_robotech = {
    vx_type: vx_core.t_type
  }
  static e_chapter_robotech = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_robotech
  }

  // (func chapter_robotech)
  static f_chapter_robotech() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Robotech",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        ":Invid",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Invid"),
        ":Masters",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Masters"),
        ":Zentradi",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Zentradi")
      )
    )
    return output
  }

  /**
   * @function chapter_science_fiction_overview
   * @return {chapter}
   */
  static t_chapter_science_fiction_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_science_fiction_overview = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_science_fiction_overview
  }

  // (func chapter_science_fiction_overview)
  static f_chapter_science_fiction_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Science Fiction Overview",
      ":reference",
      "http://www.merzo.net/index.html",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Distant Future Land Warfare",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Distant Future Land Warfare", ":summary", "* Infantry\n* Transporters\n* Time Travel\n* Beam Weapons\n* Lightning Guns\n* Disruptors\n* Disintegrators\n* Railguns\n* Hovercraft\n* Hovertanks\n* Walkers\n* Mobile Suits\n* Mobile Armor\n* Artillery\n* Nuclear Weapons"),
        "Distant Future Space Warfare",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Distant Future Space Warfare", ":summary", "* Shields\n* Ion Cannons\n* Disruptors\n* Disintegrators\n* Transporters\n* Hyperdrive\n* Jumpdrive\n* Railguns\n* Boarding Parties\n* Starfighters\n* Starbombers\n* Mobile Suits\n* Mobile Armor\n* Large Starships\n* Small Starships\n* Nuclear Weapons\n* Starbases")
      )
    )
    return output
  }

  /**
   * @function chapter_space_cruiser_yamato
   * @return {chapter}
   */
  static t_chapter_space_cruiser_yamato = {
    vx_type: vx_core.t_type
  }
  static e_chapter_space_cruiser_yamato = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_space_cruiser_yamato
  }

  // (func chapter_space_cruiser_yamato)
  static f_chapter_space_cruiser_yamato() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Space Cruiser Yamato",
      ":summary",
      "Aka Starblazers",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        ":Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Shock Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shock Cannon"),
            "Pulse Laser",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Pulse Laser"),
            ":Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Missile"),
            "Smite Projector",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Smite Projector"),
            "Wave Motion Gun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Wave Motion Gun", ":range", "400Mm"),
            "Magna Flame Gun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Magna Flame Gun", ":range", "800Mm")
          )
        ),
        "Earth Forces",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Earth Forces",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Yamato Space Battleship",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Yamato Space Battleship",
              ":image",
              "SpaceBattleshipYamato/Yamato.png",
              ":titles",
              "Argo",
              ":mass",
              "62ktons",
              ":length",
              "263m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "5",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Shock Cannon",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Shock Cannon"),
                    "Pulse Laser",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Pulse Laser"),
                    ":Missile",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Missile"),
                    "Wave Motion Gun",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Wave Motion Gun")
                  )
                )
              )
            ),
            "Andromeda Space Battleship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Andromeda Space Battleship", ":image", "SpaceBattleshipYamato/Andromeda.png"),
            "UDF Battle Satellite",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "UDF Battle Satellite"),
            "UDF Space Destroyer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "UDF Space Destroyer", ":image", "SpaceBattleshipYamato/Destroyer.png"),
            "Cosmo Tiger II",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cosmo Tiger II", ":image", "SpaceBattleshipYamato/CosmoTiger.png"),
            "Cosmo Zero",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cosmo Zero", ":image", "SpaceBattleshipYamato/CosmoZero.png")
          )
        ),
        "Gamelon Empire",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Gamelon Empire",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Leader Desslok",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Leader Desslok", ":image", "SpaceBattleshipYamato/LeaderDesslok.png"),
            "Desslok's Command Carrier",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Desslok's Command Carrier",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Smite Projector",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Smite Projector")
                  )
                )
              )
            ),
            "Gamelon Destroyer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Gamelon Destroyer"),
            ":Tri-Carrier",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tri-Carrier"),
            "Smite Ship",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Smite Ship",
              ":image",
              "SpaceBattleshipYamato/Gamelon_Smiteship.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Smite Projector",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Smite Projector")
                  )
                )
              )
            ),
            "Drill Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Drill Missile"),
            "Reflex Gun",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Reflex Gun", ":summary", "* Argo is on the opposite side of Pluto. The opposite side? Oh, no Star Force, you're not getting away. My Reflex Gun can shoot around corners. - Colonel Ganz")
          )
        ),
        "Comet Empire",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Comet Empire",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Prince Zordar",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Prince Zordar", ":image", "SpaceBattleshipYamato/PrinceZordar.png", ":summary", "I hold the whole universe in the palm of my hand. I just close my hand and planet crumble, the stars shatter! What chance does your planet Earth have? It's a cosmic joke. - Prince Zordar"),
            "Comet Empire",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Comet Empire", ":image", "SpaceBattleshipYamato/CometEmpire.png"),
            ":Medaruhse",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Medaruhse",
              ":summary",
              "Its principal weapon is a large plasma cannon which fires directly into a SMITE field which teleports the energy to a considerable distance.  This gives the weapon a tremendous firing range more than twice that of a Wave Motion Gun.",
              ":titles",
              "Magna Flame Gun",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "5",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Magna Flame Gun",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Magna Flame Gun")
                  )
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
   * @function chapter_space_opera
   * @return {chapter}
   */
  static t_chapter_space_opera = {
    vx_type: vx_core.t_type
  }
  static e_chapter_space_opera = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_space_opera
  }

  // (func chapter_space_opera)
  static f_chapter_space_opera() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Space Opera",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Space Opera Phenomenon",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Space Opera Phenomenon",
          ":placemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_placemap},
            "Motaran Rift",
            vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Motaran Rift", ":summary", "* Beyond the Alliance Frontier is the ionic Pendulask storm stretching 100 light years across. In the center of the storm is a spacial disturbance that has ripped the fabric of time itself - The Motaran Rift.\n* There has been documented evidence of horrific beings who appear alive, but then not alive, which have escaped from the Rift to wreak havoc on nearby worlds. Scientists theorize that there must be a time corridor that links some netherworld to the third dimension. Others believe it is a conduit that links another part if the universe to itself. Religious groups call it Hell.")
          )
        ),
        "Terran Union",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Terran Union"),
        "Galactic Alliance",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Galactic Alliance",
          ":summary",
          "* Alliance Defense Service - A Service chartered with the defense and policing of star systems including air, sea, and land policing and defense. They hold authority over all civilian facilities including cities, space stations, and satellites.\n** Alliance Police\n** Alliance Bureau of Investigation\n* Alliance Military Service\n** Alliance Naval Division - A division managing large combat ships of all types including capital ships, military space stations, and military satellites.\n** Alliance Starfighter Division - A division managing small combat ships including interceptors, close support, and bombers.\n** Alliance Commando Corp - Elite teams focused on performing surgical military operations deep within hostile territory.\n** Alliance Marine Corp - A dedicated combat group focused on spearheading battles and rapid response.\n* Alliance Contact Service - A Service dedicated to exploration, diplomacy, trade negotiations, foreign intelligence, and the projection of soft power.\n** Alliance Diplomatic Corp\n** Alliance Intelligence Corp\n* Alliance Research Service",
          ":titles",
          "Federation, Feddys (derogatory), Starfleet",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":PAX",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "PAX", ":summary", "* PAX is a chemical compound designed to be added to air processors in order to pacify a populace. An Alliance research team on Miranda discovered that the Pax was effective with 99.9% of people. Unfortunately, it was such an effective means of pacifying that the people stopped doing anything, they simply waited for death. The remaining tenth of a percent (0.1%) of the population had the opposite reaction. They became highly aggressive, committing unspeakable acts including cannibalism, rape, and self-mutilation. These people would come to be known as Reavers.", ":titles", "G-23 Paxilon Hydrochlorate, PAX (Latin for Peace)")
          ),
          ":placemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_placemap},
            "Alliance Spaceport",
            vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Alliance Spaceport", ":summary", "* Spaceports on Alliance worlds service all incoming and outgoing space traffic. It is strictly illegal to attempt to land on a planet anywhere except a spaceport.\n* Spaceports manage customs, quarantines, weapons checks, temporary lodging, resupply, trade, entertainment, etc.\n* Spaceports are always located far away from major cities. They are also heavily armed with troops, fighters, and destroyers available at short notice.\n* For safety reasons, landing pads and drydocks are located 10km away from any inhabited area. The spaceport proper is reached by shuttles.\n* Orbital and land-based spaceports are essentially the same except for modes of travel.")
          ),
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Alliance Armsman",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Armsman"),
            "Alliance Commander",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Commander"),
            "Alliance Commando",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Commando"),
            "Alliance Emmissary",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Emmissary", ":summary", "* Serves on First Contact and other diplomatic missions. Emmissaries must determine the best course of action to develop long-term relations with other species. As such, they have sweeping powers to determine policy that military personnel must implement including blockades and quarantines.", ":titles", "Diplomat"),
            "Alliance Heavy Marine",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Heavy Marine"),
            "Alliance Intelligence Agent",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Intelligence Agent", ":titles", "Brint"),
            "Alliance Marine Tech",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Marine Tech"),
            "Alliance Mobile Cavalry",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Mobile Cavalry"),
            "Alliance Mobile Infantry",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Mobile Infantry"),
            "Alliance Pilot",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Pilot"),
            "Alliance Police Detective",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Police Detective"),
            "Alliance Police Officer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Police Officer"),
            "Alliance Scientist",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Scientist"),
            "Alliance Scout",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Scout", ":summary", "* Alliance Scouts operate somewhat differently from the other divisions of the Alliance. Since Scouts must opearte on the edge of civilized space, the Scout Service values independence and resourcefulness. Its people are highly independent (some would say insubordinate) and are accustomed to doing a lot with a little. Scouts do not wear normally uniforms, even onboard ships and easily blend in with the frontier fringers. They operate with little funding or support and are experts at survival and mechancal engineering.\n* Reputation - Among the other divisions, the Scouts are seen as unprofessional cowboys, madmen, or criminals depending on who you talk to. The Scouts themselves admit to cases of all of these, and they proudly maintain that it takes a certain type to be a successful Scout.\n* Intelligence - Given the Scouts' deployment at the fringes of civilization, they often gain intelligence that the Intelligence Bureau would find difficult to obtain on their own. Officially, the Scout service shares all intelligence gathered with the Bureau. Unofficially, the Scouts do not like the way the Intelligence Bureau operates and rarely volunteers information. This hesitency, of course, makes the Bureau suspiscious.\n* Wartime - During war, the Scouts are called upon to perform skirmish and sabotage missions using their fast, light craft."),
            "Alliance Technician",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Technician"),
            "Alliance Trooper",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Trooper"),
            "Alliance Defense Pilot",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Defense Pilot", ":summary", "* Planet-based spacefighter pilot. These fighters can only attain low-orbit, but they are relatively cheap to manufacture and easy to fly so they can be fielded in large numbers."),
            "Alliance Defense Trooper",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Defense Trooper", ":summary", "* Planet-based military force. These warriors are trained to use the local terrain and defensive positions to repel invaders. Since defense forces are rarely needed, it is usually a cushy job. Therefore, they have a somewhate deserved reputation for being lazy and unprepared."),
            "Inquiry Light Recon ATV",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Inquiry Light Recon ATV", ":summary", "* Wheeled\n* Open topped ATV with HMG and MRLx2.", ":speedland", "170kph", ":crew", "3", ":mass", "4tons"),
            "Sepoy APC",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sepoy APC", ":summary", "* Wheeled", ":speedland", "300kph", ":crew", "1+11", ":mass", "38tons"),
            "Hunter AC Tank",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hunter AC Tank", ":summary", "* Air Cushioned\n* Pulse Laser\n* Gauss MG\n* MRL", ":speedair", "45kph", ":crew", "6", ":mass", "210tons"),
            "Siega Strider",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Siega Strider", ":summary", "* Legged", ":speedair", "200kph", ":crew", "1", ":mass", "60tons"),
            "Striker Grav Tank",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Striker Grav Tank", ":summary", "* 50MW Pulse Laser", ":speedair", "480kph", ":crew", "3", ":mass", "522tons"),
            "Tarsan Grav APC",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tarsan Grav APC", ":speedair", "300kph", ":crew", "2+10", ":mass", "51tons"),
            "Essor Recon Drone",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Essor Recon Drone", ":summary", "* No Weapons", ":speedair", "1000kph", ":crew", "0", ":mass", "4.3tons"),
            "Princely Lord Attack Speeder",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Princely Lord Attack Speeder", ":summary", "* Grav Flyer\n* Pulse Laser", ":speedair", "960kph", ":crew", "2", ":mass", "171tons"),
            "Alliance Exploration Ship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alliance Exploration Ship", ":summary", "* SS Copernicus - Floating adrift in open space, the Copernicus is a ghost ship in more ways than one."),
            "Hellbore Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellbore Missile", ":summary", "* A giant missile designed to drill into a planet and detonate deep in the magma setting off massive volcanic eruptions across the world with the intention to make the world uninhabitable.")
          )
        ),
        "Azuriach Empire",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Azuriach Empire",
          ":summary",
          "History:\n* Exodus - After the first Exodus to space, the over-industrialized, pollution ridden Earth fell into a deep recession. The remaining population of Earth began to feel that their fellow humans had abandoned them to their fate and grew to resent their spacefaring kin.\n* Eugenics War - After the Eugenics War, Earth banned all genetic engineering including cloning and artificial life while the Colonials embraced these technologies for their very survival.  Earth began to see the Colonials as a twisted offshoot of mankind that chose a sterile life in space surrounded by runaway technology instead of a wholesome life with earth, sky, and sea.\n* Azure Party - After the Eugenics War, the Earth moved toward a 'Pure Earth' platform combining a resurgence of religion with a return to a more natural, peaceful way of life, on Earth.  A particularly militaristic wing of the the 'Pure Earth' movement became known as the Azure party due to the round blue patches they wore symbolizing the Earth. The Azures were experts at propaganda and found an easy scapecoat in the Colonials.  As the global recession continued, the Azures influence over Earth politics increased.\n* United Earth Alliance (UEA) - After millenia of conflict, Earth united under a single banner, the United Earth Alliance (UEA). Its political platform was the 'Pure Earth' platform, without genetic engineering, without cloning, and with the UEA in control of the Solar System. The Colonials saw this for the power grab that it was and mocked this position as the 'Groundhog Movement'.\n* Solar Cold War - The UEA and the Colonials, especially the Jovians, fought a cold war for decades trying to gain the upper hand. The development of Exo-suits by the Jovian Confederation led to a new arms race between the Jovians and Earth. In the end, the strain on the Earth economy was too great, and the UEA became desparate. In order to maintain control, they declared martial law and began a military build up. This ultimately, forced the other Colonials to rally toward the Jovians or lose their sovereignty.\n* The Rock War - Earth's military might far exceeded the colonies, but their reach was limited to Earth's orbit. The Colonials had far more spaceships, but the vast majority of these were civilian ships.  Ultimately, however, it was the UEA's unpopularity that was its downfall. Before the final battle, sabotage and poor maintenance had incapacitated half of the Earth fleet. When the final battle was fought, the Colonials used their superior numbers to engage the Earth fleet in high Earth orbit where Earth's gravity well restricted the UEA fleet's movements. Then the Colonials covertly captured the industrial Mass Drivers on the Moon and began railing rocks into the Earth fleet and unto Earth itself. After horrific loses on both sides, the Earth military staged a coup on Earth and immediately negotiated a cease fire. The UEA was disbanded and their leaders (largely Azures) were put on trial.\n* Terran Union - After the fall of the UEG, the Colonials created a new representative goverment with each colony, including Earth and Luna, as a state. Earth began rebuilding, but the scars of the war would take centuries to heal.\n* Colony Ships - After 50 years of peace, the colonization of the Solar System was moving along smoothly, so the Terrans began to look outward to the stars. New discoveries in propulsion made long-range probes and colony ships feasible, though their journeys were still measured in decades, so they would still be one-way missions.\n* First Contact - The Terrans had been searching the stars for extra-terrestrial life for hundreds of years, but they were not prepared to find it in their own backyard. A survey of Pluto uncovered an abandoned alien outpost. This was the Terrans' first proof of alien life, and it was decidedly malevolent. This refocused space exploration on the construction of military warships. 30 years later, a human colony vessel had its first face-to-face encounter with a space-faring, alien race, the Thranx.\n* Alliance - The Thranx were much more advanced than the Terrans, but fortunately they were also much more peaceful. The Thranx were part of a loose trade Alliance of races including the Blarads, Caitians, Saurians, and Vargr. The Terrans entered the Alliance and were able to purchase the secrets to FTL drives.  With FTL, colonization of the stars began in earnest. Like the early American settlers, there were many willing to risk death for a chance at a new life. Large colony ships began radiating outward to nearby planets.  Among these were a number of disgruntled Azures who were horrified at the sight of humans reduced to a third rate state in an alien dominated Alliance. Over the next decades, the Azures began settling in one region of stars distant from any alien races.\n* Azuriach Imperium - Over time, the Azures consolidated power in their sector of space. They secretly built a large military fleet, and by the time the Terran Union discovered them, the Azures were powerful enough to declare themselves the Azuriach Imperium. Officially, the larger Alliance considers the Azuriachs a human internal problem. Unofficially, the Alliance is concerned with the distinctly human-centric views of the Azuriachs and are not interested in the Azuriachs gaining power over the human worlds.",
          ":titles",
          "Earth Empire",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Azure Imperial Legionnaire",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Azure Imperial Legionnaire"),
            "Azure Imperial Marine",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Azure Imperial Marine"),
            "Azure Imperial Pilot",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Azure Imperial Pilot"),
            "Azure Imperial Security Agent",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Azure Imperial Security Agent"),
            "Azure Imperial Security Officer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Azure Imperial Security Officer"),
            "Trepida Light Grav Tank",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Trepida Light Grav Tank", ":summary", "* Fusion Cannon", ":speedland", "1000kph", ":crew", "2", ":mass", "110tons"),
            "Invader Grav Tank",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Invader Grav Tank", ":summary", "* Fusion Cannon", ":speedland", "3640kph", ":crew", "4", ":mass", "152tons"),
            "Vortex Land Carrier",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Vortex Land Carrier", ":summary", "* These enormous vehicles are equivalent to a naval battleship/aircraft carrier but hovers over the ground using intense magnetic repulsion and massive hoverfans.\n* The area directly below the hull is exposed to lethal magnetic energy.\n* Fusion Cannon")
          )
        ),
        "Galactic Trade Union",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Galactic Trade Union", ":summary", "* A powerful group of loosely affiliated mega-corporations that acts as the largest lobbying group in the Alliance. The Union has wields tremendous influence over the Alliance government and is essentially a shadow government itself. Though it wields tremendous power, there is intense disagreement how that power should be used with one group or another benefiting the most from every action taken. Conflict within the Union is subversive and bloody with many outside pawns being used including mercenaries and the Star Syndicate.\n* The Trade Union has no actual employees. Instead, the individual corporations act on its behalf either directly or through contractors.\n* Most smaller companies believe the Trade Union acts as a mafia by extorting money from its members for protection while leaning trade deals toward the core members and stifling the very competition they profess to uphold."),
        "Star Syndicate",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Star Syndicate",
          ":summary",
          "* The Syndicate is a loosely held criminal empire spread throughout the Alliance. It is a convenient tool of the mega corps and governments, so the Alliance never seems to make much progress against it.",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Syndicate Black Marketeer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Syndicate Black Marketeer"),
            "Syndiate Raider",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Syndiate Raider", ":summary", "* Given the high value of starships and their goods, piracy is extremely profitable. The Alliance maintains a 'No-Tolerance/Shoot to Kill' policy for piracy, yet pirate ships and pirate outposts are frighteningly common. The [Azuriach Empire]'s totalitarian state has far fewer incidents of piracy, largely because the stolen goods are harder to sell.")
          )
        ),
        "Independent Terrans",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Independent Terrans",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Terran Bounty Hunter",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Terran Bounty Hunter"),
            "Terran Merchant Marine",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Terran Merchant Marine"),
            "Terran Mercenary",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Terran Mercenary"),
            "Terran Miner",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Terran Miner"),
            "Terran Physician",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Terran Physician"),
            "Terran Scientist",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Terran Scientist"),
            "Terran Technician",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Terran Technician"),
            "Corsair Motorcycle",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Corsair Motorcycle", ":summary", "* Wheeled\n* Civilian Motorcycle", ":speedland", "120kph", ":crew", "1", ":mass", "350kg"),
            "Letra Ground Car",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Letra Ground Car", ":summary", "* Wheeled\n* Civilian Automobile", ":speedland", "80kph", ":crew", "1+4", ":mass", "4tons"),
            "Shackleton Snow ATV",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shackleton Snow ATV", ":summary", "* Tracked\n* Easy to maintain snow ATV", ":speedland", "70kph", ":crew", "1+3", ":mass", "8tons"),
            "Rheena Passenger ACV",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rheena Passenger ACV", ":summary", "* Air Cushioned\n* Passenger Hovercraft", ":speedland", "60kph", ":crew", "1+15", ":mass", "8tons"),
            "Or-E-Cull ATV",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Or-E-Cull ATV", ":summary", "* Tracked\n* High Speed ATV", ":speedland", "175kph", ":crew", "1+5", ":mass", "10tons"),
            "Surveyor Hover-Buggy",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Surveyor Hover-Buggy", ":summary", "* Air Cushion\n* 1 Fixed LMG.", ":speedland", "45kph", ":crew", "1", ":mass", "13.7tons"),
            "AVI Cargo ACV",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "AVI Cargo ACV", ":summary", "* Air Cushioned\n* Cargo Hovercraft", ":speedland", "60kph", ":crew", "1+3", ":mass", "18tons"),
            "Hugheston Wheeled Transport",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hugheston Wheeled Transport", ":summary", "* Wheeled\n* Cargo Transporter", ":titles", "Semi Truck", ":speedland", "100kph", ":crew", "1+2", ":mass", "21tons"),
            "Arctica Grav Transport",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Arctica Grav Transport", ":summary", "* Grav\n* Self loading cargo transporter", ":titles", "Semi Truck", ":speedair", "120kph", ":crew", "1+2", ":mass", "25tons"),
            "Bundan Wheeled ATV",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bundan Wheeled ATV", ":summary", "* Wheeled\n* ATV", ":speedland", "100kph", ":crew", "1+16", ":mass", "28tons"),
            "Permax Tracked ATV",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Permax Tracked ATV", ":summary", "* Tracked\n* ATV", ":speedland", "80kph", ":crew", "1+16", ":mass", "47tons"),
            "Cinto Construction Vehicle",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cinto Construction Vehicle", ":summary", "* Tracked\n* Bulldozer/Backhoe", ":speedland", "75kph", ":crew", "1", ":mass", "48tons"),
            "Tavee-Gho Hoveryacht",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tavee-Gho Hoveryacht", ":summary", "* Air Cushioned\n* Hovercraft", ":speedwater", "105kph", ":crew", "1+3", ":mass", "82tons"),
            "Cetacean Dolphin Cycle",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cetacean Dolphin Cycle", ":summary", "* Underwater, Propelled by moving Fluke\n* Intended for fun in the sea. It can glide with the dolphins and communicate with them using recorded dolphin speech.", ":speedwater", "50kph", ":crew", "1", ":mass", "75kg"),
            "Hass Grav Minisub",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hass Grav Minisub", ":summary", "* Underwater", ":speedwater", "25kph", ":crew", "1+1", ":mass", "1tons"),
            "Dashi Hydrofoil",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dashi Hydrofoil", ":summary", "* Hydrofoil, Underwater\n* Submerged: 25kph\n* Beam Laser", ":speedwater", "125kph", ":crew", "2", ":mass", "2tons"),
            "Vieus Hydrofoil",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Vieus Hydrofoil", ":summary", "* Hydrofoil\n* Pulse Laser", ":speedwater", "110kph", ":crew", "2", ":mass", "22tons"),
            "Gasheda Undersea ATV",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Gasheda Undersea ATV", ":summary", "* Tracked, Underwater", ":speedwater", "110kph", ":crew", "6", ":mass", "184tons"),
            "Aquanaut Restaurant",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Aquanaut Restaurant", ":summary", "* Tracked, Underwater\n* Undersea Restaurant", ":speedwater", "110kph", ":crew", "15+85", ":mass", "251tons"),
            "Tiamat Mining Crawler",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tiamat Mining Crawler", ":summary", "* Tracked, Underwater\n* Self-contained undersea mining colony for 50.\n* Can stay 10km underwater for 3 to 6 months at a time.", ":speedwater", "70kph", ":crew", "14+50", ":mass", "1000tons"),
            "Timla Personal Floating Chair",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Timla Personal Floating Chair", ":summary", "* Grav\n* Used for the luxury, the elderly or disabled, or for aliens with poor ground locomotion.\n* The floating chair normally just hovers over the ground, but it can slowly ascend if needed.", ":speedair", "30kph", ":crew", "1", ":mass", "100kg"),
            "Peter Pan Child's Grav Chair",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Peter Pan Child's Grav Chair", ":summary", "* Grav\n* Young passengers automatically are taken to their programmed destination anywhere in the world.\n* Computer will not allow reprogramming unless authorized by the parent.", ":speedair", "600kph", ":crew", "1", ":mass", "400kg"),
            "Zeus Luxury Grav Chair",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Zeus Luxury Grav Chair", ":summary", "* Grav\n* The ultimate in individual luxury transport.  The autopilot allows the passengers to work, talk, or relax with a drink.", ":speedair", "300kph", ":crew", "1+1", ":mass", "480kg"),
            "Swallow Flycycle",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Swallow Flycycle", ":summary", "* Grav\n* Autopilot", ":speedair", "300kph", ":crew", "1+1", ":mass", "1tons"),
            "Venery Police Speeder",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Venery Police Speeder", ":summary", "* Grav\n* Gauss MG", ":speedair", "1080kph", ":crew", "1", ":mass", "1.2tons"),
            "Strike It Rich Prospector Grav Bubble",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Strike It Rich Prospector Grav Bubble", ":summary", "* Grav\n* Can manuever close to analyze samples with its robotic arm. The bubble is to be used near a base. A team usually drops off one crewman to dig while the other prospects for new sites.", ":speedair", "1600kph", ":crew", "1+1", ":mass", "1.5tons"),
            "Planet Hopper Grav Car",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Planet Hopper Grav Car", ":summary", "* Grav\n* Flying family-sized car can travel anywhere on a planet in under a day.", ":speedair", "1000kph", ":crew", "1+3", ":mass", "2.6tons"),
            "Quest Air-Raft",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Quest Air-Raft", ":summary", "* Grav", ":speedair", "540kph", ":crew", "1+5", ":mass", "8.3tons"),
            "Demeter Grav Farm Wagon",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Demeter Grav Farm Wagon", ":summary", "* Grav\n* Grav farming equipment that does not disturb crops.\n* Robotic arms plant and harvest.", ":speedair", "100kph", ":crew", "3", ":mass", "11tons"),
            "Lifesaver Grav Emergency Responder",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Lifesaver Grav Emergency Responder", ":summary", "* Grav\n* Includes variety of sensors for detecting radiation leaks, trapped survivors, etc.\n* Fire retardant foam cannon", ":speedair", "600kph", ":crew", "2+8", ":mass", "13tons"),
            "Duone Rapid Speeder",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Duone Rapid Speeder", ":summary", "* Grav\n* Extremely high-speed grav flyer.", ":speedair", "3840kph", ":crew", "1+3", ":mass", "14tons"),
            "Wanderer Grav Airbus",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wanderer Grav Airbus", ":summary", "* Grav\n* Flying mass transit or tour bus can reach any location on the planet in under a day.", ":speedair", "1400kph", ":crew", "1+10", ":mass", "15tons"),
            "Traveller Shuttle",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Traveller Shuttle", ":summary", "* Grav, Suborbital", ":speedair", "180kph", ":crew", "1+8", ":mass", "17tons"),
            "Cloud Nine Grav Houseboat",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cloud Nine Grav Houseboat", ":summary", "* Grav\n* 3 Bedroom, 2 Bath, 1 Kitchen, 1 Living/Dining Room, 2 Office\n* Take a vacation or live in the sky.  The Cloud Nine has fuel and supplies for a year without landing.", ":speedair", "300kph", ":crew", "1+10", ":mass", "20tons"),
            "Athene Grav Lounge",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Athene Grav Lounge", ":summary", "* Grav\n* Mobile lounge popular with private clubs, business executives, and negotiators.", ":speedair", "720kph", ":crew", "6+30", ":mass", "30tons"),
            "Motherlode Grav Miner",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Motherlode Grav Miner", ":summary", "* Grav\n* Mining Utility Vehicle", ":speedair", "540kph", ":crew", "2+2", ":mass", "49tons"),
            "Tachcel Grav Hyperliner",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tachcel Grav Hyperliner", ":summary", "* Grav, Suborbital\n* Speed: 6G\n* At maximum speed, can reach any location on a typical planet in under an hour.", ":speedair", "4200kph", ":crew", "2+72", ":mass", "50tons"),
            "Jacques Grav Miner",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Jacques Grav Miner", ":summary", "* Grav\n* Mining vehicle designed to locate, mine, and transport ore from a variety of environments.\n* Mining Laser", ":speedair", "120kph", ":crew", "2+2", ":mass", "67tons"),
            "Windrider Grav Weather Lab",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Windrider Grav Weather Lab", ":summary", "* Grav\n* Floating meteorological laboratory", ":speedair", "60kph", ":crew", "2+10", ":mass", "88tons"),
            "Thorian Kur Repair Shop",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Thorian Kur Repair Shop", ":summary", "* Grav\n* Flying repair platform", ":speedair", "330kph", ":crew", "1+3", ":mass", "127tons"),
            "Sans Souci Grav Yacht",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sans Souci Grav Yacht", ":summary", "* Grav\n* The ultimate millionaire's portable mansion. The interior has 14 staterooms and is custom designed to the owner's tastes. Some models include a swimming pool.\n* High tech armor and sensors.", ":speedair", "960kph", ":crew", "1+30", ":mass", "342tons"),
            "Zeff Grav Cargo Transport",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Zeff Grav Cargo Transport", ":summary", "* Grav\n* Heavy Cargo Transporter", ":speedair", "720kph", ":crew", "1+1", ":mass", "500tons")
          )
        ),
        ":Aeodronian",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Aeodronian", ":summary", "* The Aeodronians are a race of bipedal salamander-like humanoids. The salamanders are quite cunning and intelligent. The race as a whole is opposed to the Alliance.\n* The Aeodronian home world is a tropical paradise, lush and humid, possessing a variety of flora and fauna that covers 20% of the planet's surface area. The salamanders live in costal cities made of coral outcroppings (reefs) and carry on all industry in environmentally safe factories and other facilities. All food is taken from the natural bounty of the sea. For most materials, such as metals, alloys, and high-technology items, they trade with other races and worlds, rather than rape the bosom of their own planet. That which they cannot trade for, they take.\n* The Aeodronians have become scavengers and pillagers of the galaxy. They abhor the Alliance's method of colonial exploitation, and the salamanders are bitter enemies of its military. There is some hypocrisy in this statement, because salamander's are known to pillage and plunder Alliance worlds. Aeodronian raiding fleets harry convoys and supply routes, and attack worlds that the Aeodronidans see as being raped of their natural order.", ":titles", "Salamanders"),
        "Blarad Starkingdom",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Blarad Starkingdom", ":titles", "Bears, Ursoids"),
        ":Cizerack",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Cizerack",
          ":summary",
          "* Description - A race of large, brown/blue/black cat/bear creatures. They are\nextremely fast and can able to achieve speeds of 40mph for short periods of time.\nDespite their size, they are strong climbers and swimmers. When necessary, they can\nwalk erect, but they are clumsy on two feet. They possess excellent hearing and\nvision especially at night. They possess prehensile paws, with retractable fingers\nbut have limited manual dexitery. They are stealthy stalkers and are adept at\nscouting, hunting, and ambushing.\n* Combat - Their melee prowess is legendary, but their paws make ranged weapons\nawkward, so instead they tend to mount smart weapons on their backs. They are also\nsometimes willing to allow small creatures (like Mazians) to ride on their backs.\nCizerack culturally prefer close combat to cowardly ranged weapons, but they are\ngradually overcoming this predjudice.\n* History - The Cizerack evolved on a world with a few continents dominated by\ngrassy plains and scrubland. Winters are harsh, and most animals including the\nCizerack burrow into the ground and hibernate during the winter. There is a polar\nvariant of the Cizerack that is adapted to the cold weather and does not usually\nhibernate. The Cizerack have long been at the top of the food chain, and have a long\ncultural history. They only recently developed technology in an effort to solve their\nover-population problem.",
          ":titles",
          "Caitian, Felines",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Cizerack Warrior",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cizerack Warrior")
          )
        ),
        ":Chatilian",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Chatilian",
          ":reference",
          "* I rather like the way his head exploded.",
          ":summary",
          "* Description - The Chatilians are from the planet Chatil in the Fomalhaut star\nsystem. They are frail, delicate looking, greenish blue plant beings with thin\nbodies and large, bullet-shaped heads. Chatilians are herbivores. They have no real\nmouth, rather they possess facial slits through which they strain their food intake.\nTheir arms and legs are like branches and roots which must be pruned to grow into\nuseful limbs. When angered, Chatilians whine loudly, bug out their eyes, and drool\nyellow spit from their facial slits. This would be somewhat comical, except this is a\nsign that they are generating and then people start dying.\n* Telepathy - They can speak aloud with great difficulty, though they do not normally\nneed to because their skulls are crowned with sensory nodes which allows them\ncommunicate telepathically among themselves. With focus, an empath also may read an\nunprotected mind in close proximity.\n* Psykokinesis - Although Empaths are innocuous looking, they are actually among the\nmore dangerous and formidable opponents in the galaxy. Through the evolutionary\nprocess, they have developed psycho-kinetic power which allows them to harness and\ntransmit psychic energy. This unusual ability is called Generating. Empaths employ\npsychic and illusionary attack forms. Advanced Chatilians can actually crush the\nminds of their enemies.\n* Personality - They are generally considered rude, peculiar, and annoying by other\nraces. They are not overly fond of other races either. They intensely dislike any\ninconvenience including bad weather. A large part of their scientific development has\nbeen toward atmospheric control and terraforming. Chatilians like water but hate any\nkind of physical exertion. They are sensitive to everything, so noise, bright lights,\ngaudy art, hot weather, cold weather, dumb people, etc, etc. all irriate the sedate\nintellectuals to no end.\n* Colonies - Chatilian buildings are strange tiered affairs with rooms and floors of\ndifferent sizes, terraces and skylights everywhere, and stark blank surfaces. The\narchitecture is similar to adobe cities and Mediterraean beach communities. Chatilian\ncities are sprawling low-lying residential areas with all industry and commerical\noperations underground. Trees and plants are allowed to grow naturally throughout the\ncities. The underground is a maze of indirect passages and oddly shaped rooms.\nTourist often get lost which the Chatilians attribute to their limited mental\ncapacity.\n* History - The Chatilians homeworld is closer to its star than Earth. It is hot and\nhumid year round, and its 4 moons reflect much light even at night. In this world,\nmobile plant life evolved instead of animal life. Though all Chatilians speak\ntelepathically, the ability to generate only occurs in 1% of the populace. The ability or inability to generate has created 2\nclasses and numerous, bloody civil wars with one side or the other taking control.\nThe current royal family can generate and their power is buffered by a representative\nparliament. This arrangement has lasted for 500 years, but there always remains a\nrisk of civil war.",
          ":titles",
          "Asparagus Men",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Chatilian Empath",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Chatilian Empath")
          )
        ),
        "Cybernetically Enhanced",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Cybernetically Enhanced", ":titles", "Cyber, Cyborg, Cyman, Simon (derogatory)"),
        ":Eridani",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Eridani",
          ":summary",
          "* The ultimate warrior race. The methane breathing Eridani are the epitome of a combat tacticians. They possesses supreme agility, exceptional willpower, and are quite cunning.\n* Physiology - Eridani are tri-sexual creatures with males and females fertilizing and a fat creature called a Nog that carries young to term in a pouch similar to a kangaroo. Males and females have few gender-based role differences while the Nogs are largely helpless and fiercely protected.\n* History - The Eridani have a long history of conflict and conquest among themselves before uniting to bring their conquests to the stars. They are not interested in statecraft, so conquered worlds were largely left to their own devices besides helping pay for the eternal war effort. Eventually, they encountered a trecherous enemy in the Phentari squids. This enemy was able to lure the Eridani fleet into an all out attack while launching a covert attack against the Eridani homeworld reducing it to rubble. The Eridani empire was shattered and they can never live down the humiliating defeat. They now maintain a blood feud with all Phentari.",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Eridani Swordsaint",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Eridani Swordsaint", ":summary", "* Certain Eridani warriors are chosen at birth to fulfill the honorable status of Mokaba Datu, (Wisdom Warrior). Under the tutelage of the Buddon Priest, the young Mokaba Datu learns the basic tactics of honorable survival.\n* A swordsaint warrior must be willing to sacrifice emotion for the superior consciousness of objective thought. Even in a berserk status, an Swordsaint retains complete control and suffers no berserk penalties.", ":titles", "Mokaba Datu, Wisdom Warrior"),
            "Eridani Warrior",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Eridani Warrior", ":summary", "* This supreme warrior race specializes in combat skills, most notably archaic hand weapons. Every warrior is allowed to carry an ornamental archaic hand weapon of his choice wherever he goes within Alliance territory.\n* Eridani warriors study Kaush-mukal (The study of the Inner Self). He is taught the fundamentals of archaic hand weapons combat, drilling every day for hours, until he passes a fundamental competence test in his chosen weapon. Once he has mastered the fundamentals, he begins the arduous task of finding Inner Self.\n* A warrior has a duty, unselfish and detached. It is to wage battle for the honor of the race, and in the heartfelt throes of battle come to understand the tentative existence of the self. Those unworthy of combat will inevitably be disposed of. Such is the fundamental construct of the evolution process. Eventually one must find the door to everlasting peace. But the path to tranquility starts in the chaos of the battlefield.")
          )
        ),
        ":Mazian",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Mazian", ":summary", "* The Mazian is an amorphous being, able to change shape to resemble other objects. It is normally a gel-like amorphous being, each cell existing as a separate entity and yet working in a harmonious symbiotic relation with the other cells around it. The Mazian has no central nervous system, rather the outer layer of skin is covered with small nodes that allow the Mazian to sense ground vibrations. The nodes also make Mazians vulnerable to loud noises and sonics. It is an asexual being that reproduces through budding every ten years. It eats by absorbing liquids into its body and the Mazian can absorb small objects for temporary storage.\n* Personality - Mazians are very friendly creatures with no sense of personal space. They hang around in huge piles and are only truly happy when touching something or someone. As a colony creature, Mazians lack a sense of individuality. They do not understand personal property or war as they believe in sharing everything. Many other races find this perspective to be naive. The tactile nature of the Mazians combined with their selfless nature make them very popular companions and lovers. They have formed a close bond with the Cizerak despite the fact that their races have only recently encountered one another. Cizeraks have been known to carry Mazian companions on their backs.\n* Movement - Mazians normally travel low to the ground, sliding rapidly over surfaces.They are also fully amphibious and move gracefully like an eel or a squid. Mazians can also burrow through loose earth and can slide through narrow tunnels and pipes with no feeling of claustrophobia.\n* Communication - Mazians normally communicate by touch but may also make coded thumping noises through the ground or grunting noises in the water. To speak with other races, they use voice synthesizers.\n* Senses - Mazians cannot see, but have evolved a complex form of sonar which allows them to distinguish shapes. They have a fantastic sense of smell, able to detect residual odors better than a bloodhound. Their sense of taste is so good that they can use it to distinguish the dyes used in different colors and can use this ability to read by touch. Mazians have developed an ocular device that they can use to see as other creatures do.\n* Replication - The Mazian's ability to change it's form makes it the ultimate espionage/infiltration specialist. As the Mazian learns to control the cell metamorphoses, its chance to accurately duplicate something increases. At high levels, a Mazian can replicate a humanoid form. When attempting to replicate, the Mazian flows over an object, internally records the physical matrix, then copies it. Mazians often pay handsome amounts of money for internal skeletons to aid them in replicating bipedal and quadrapedal forms.\n* Weaknesses - Mazians jelly-like form is sensitive to sonics and dessicants. They are vulnerable to the drying effects of heat and cold, but their predominatly liquid form does not catch fire easily.", ":titles", "Blob"),
        ":Mutazchan",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Mutazchan", ":summary", "* The Mutzachan Energy Controller is one of the most powerful of all the known races. They can manipulate energy through their body to generate tremendous, destructive power. Mutzachan love the power of raw energy. They feel that energy must fill its potential and dislike the storage of energy.\n* Description - Mutzachans are indigenous to the planet Trishmag of the Cygni-A star system. They are small, bipedal humanoids, with large heads and large pale green eyes. They are by far the most intellectually advanced race in the known galaxies. Their brains have almost twice the convoluted surface area of human brains.\n* Physiology - Their high intellect and technology have left them with a distain for physical labor and consequently their physiological has suffered leaving them physically weak and easily tired. Their constitution is also weak leaving them unusally vulnerable to disease and infection. The entire Mutzachan population is less than 400 million and their culture has almost been eradicated twice, due to plague. Mutzachan have a very low fertility rate, with the females bearing young only once every 100 years. The average life expectancy for a Mutzachan is about 2,000 years.\n* Psychology - Mutzachan pride themselves on making decisions rationally instead of emotionally. This is not to say that the Mutachan are not emotional, but they are ususally able to overcome their emotions. Mutachan are highly ego driven and are very fond of titles and have little patience for insults. Though they are generally consistent and fair to others, they are also famous for being coldhearted and ruthless when the need arises.\n* History - The Mutzachan are an old race, with a history spanning 40,000 years. They have observed the development of the other races without interfering (much). Their sun is old and has been slowly, expelling more radiation over the last million years. Life on their world evolved to not only become resistant to the radiation but to feed on it in a process similar to photosynthesis. A 1000 years ago, the Mutzachans determined that their sun would go nova, destroying their home world. Since then, they have pursued 'The Great Purpose' which is to prevent or mitigate this catastrophe. The Great Purpose has also spawned dangerous nilhilist cults that believe that the Mutzachans do not deserve to continue and should embrace their final destruction in the ultimate nuclear cataclysm.\n* Politics - Their keen intellects and strategic thinking have risen many of their kind to high political office. Most of the high ranking members of the Alliance are either Replicants or Mutzachan. No one really trust the Mutzachan, but then again no one really trusts anybody and the Mutachan are probably better than most.", ":titles", "Melon Head, Grays, IRSOL"),
        ":Phentari",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Phentari", ":summary", "* The Phentari are a warlike race of bipedal, squid-like beings. Because of their callous and trecherous natures, they are the most mistrusted, and disliked of all the known, intelligent races. Phentari have a notorious reputation as skilled bounty hunters and assassins.\n* Physiology - Phentari are indigenous to the methane planet Phena in the Tau Ceti star system. They have four sinuous arms, each of which is capable of independent action. This allows the squid to target and fire multiple weapons, or perform multiple independent actions simultaneously. When using edged weapons, the squid attacks like a chain saw. Their tentacles also allow the Phentari to climb quite well. Phentari possess stump like legs which offer little balance. They have long since adopted prosthetic gear to facilitate running. Phena has a 20% methane atmosphere and like the Eridani, the Phentari must wear an atmospheric processor when operating outside of a methane environment.\n* Procreation - Phentari mate every 4 years. After mating, the female attempts to hunt and kill the male. Males who are not resourceful enough to escape have fulfilled their mating potential and are no longer worthy of further mating. The female carries the fertilized eggs for 3 months and then lays a clutch of 3-4 eggs. After egg laying, the female buries the eggs in the ground and then abandons them. Phentari young must fend for themselves after birth, often feeding off of their siblings. Until they mature, Phentari young hide in the shadows and develop their survival and hunting skills. It is not unknown for a group of young to ambush and slay an adult. Of course, when this happens, other Phentari accept that the foolish adult deserved his fate.\n* Personality - Phentari are heartless, selfish creatures who hold all weaker beings in contempt. They use coercion and threats instead of persuation. Phentari are very proud of their kills and will wear jewelry that displays their kill count. They are also fond of decorating their abodes with the skulls of their victims.\n* Skills - Phentari values weapons of all sorts including weapons that other races look down upon such as poisons, diseases, and acids.\n* Government - The Phentari have only had military governments ruled by a council of generals with no individual given absolute power.\n* History - The Phentari have a long, bloody history of civil wars. Since their disasterous war with the Eridani, they have managed to join together against a common foe. They maintain a mutual hatred of the Eridani who seem to want to kill Phentari on sight.", ":titles", "Cold Death, Demon Spawn, Grim Reaper, Soul Sucker"),
        ":Pythos",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Pythos",
          ":summary",
          "* The Pythons are a pair of powerful, lizard races indigenous to the planets Pythos in the Floridian star system.\n* Python Lizards - Python Lizards are aquatic beings, dwelling in the great swamp-like inland seas that cover much of the surface of their home planet. They don't hear sounds as humans do, but rather sense vibrations through their skin. The lizards can dive to depths of 200m and are capable of holding their breath for up to 10 minutes. The drawback is that Python Lizards are sensitive to dry environments and susceptible to cold. When the temperature drops below zero degrees celsius, Pythons usually crawl in some comfortable place and fall asleep. Python Lizards can sense heat sources out to 100m. The lizards are generally less intelligent than their galactic counterparts and have none of their own technology to speak of. They are, however, much more intelligent than their land-based cousins the Rams.\n* Ram Pythons - Unlike their aquatic cousins, Ram Pythons live on land. They are massively powerful and overwhelm even the Python Lizards in combat. However, their intelligence is extremely limited, and they are barely able to be taught how to use modern weaponry.\n* Combat - These great reptiles are the backbone of assault units in the Alliance Marines, proud and defiant warriors whose lifelong ambition is to fight the ultimate battle. The Python is a veritable fighting machine. Unarmed, it attacks with both claws, a vicious bite, and its long prehensile tail. They have a thick, scaly hide that acts as natural leather armor.\n* Personality - These prehistoric dinosaurs are overtly aggressive. The vast majority of Pythons follow a strict code of honor and adamantly adhere to the precepts of law and order.\n* History - The Lizards and Rams are tribal creatures who have fought tribal conflicts for tens of thousands of years. Thir technology was limited to spears and stone axes until the Cizerak sent a diplomatic envoy to the Python Lizards. The Lizards suspected trickery and killed the envoy sparking a punitive attack from the Cizerak. The Lizards and Rams were forced into a humiliating surrender after devastating losses from the Cizerak's cowardly orbital bombardment. The Pythos have not forgiven the Cizerak and will never trust them. Since then, the Alliance has established peaceful relations with the Pythos and have recruited many into Alliance police and military forces.",
          ":titles",
          "Lizards",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Python Lizard",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Python Lizard"),
            "Ram Python",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Ram Python")
          )
        ),
        ":Reavers",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Reavers",
          ":reference",
          "* If they take the ship, they'll rape us to death, eat our flesh, and sew our skins into their clothing. And, if we're very, very lucky, they'll do it in that order. - Zoë Alleyne Washburne, Firefly",
          ":summary",
          "* Showing no care for life, they are driven by an insane, homicidal and xenophobic aggression that manifests in the cannibalism, rape, and torture that they visit upon any unfortunate enough to come across them.\n* Appearance - They deliberately gash and cut their own flesh. Barbaric piercings and random bits of metal shoved into their flesh are common, giving them a ghastly and corpse-like air.\n* Abilities - They seem no physically stronger or tougher than normal humans merely inured to pain to the point where they care nothing for their injuries or indeed their own lives, and more willing to push their bodies to the extreme because of their madness.\n* Intelligence - Exactly how sentient individual Reavers are remains an open question. Although they clearly must have some retention of any original knowledge prior to their madness (as evidenced by their command of starships and weapons) Reavers are as without fear as they are without mercy,\n* Reavers are believed by most to be men that went insane at the edge of space and became savage. They stared into the void beyond and became what they saw: nothing.\n* Reavers originated from the planet Miranda. The Alliance had been testing behavioral modification on this planet through the chemical G-23 Paxilon Hydrochlorate ([PAX]), administered through the air recycling systems. The chemical was designed to weed out aggression and anger. The ultimate result was that 99.9% of the population stopped going to work, talking to each other, and eventually stopped moving, eating or breeding, and therefore died. However, the remaining tenth of a percent of the population had the opposite reaction, with their aggression and primal instincts boosted beyond simple madness into murderous rage, sadism and xenophobia.",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":Reaver",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Reaver")
          )
        ),
        ":Replicant",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Replicant", ":reference", "* We are merely synthetic products, nothing more than elegant looking robots. - Unknown Replicant philosopher", ":summary", "* Replicants are genetically engineered from scratch to be mentally and physically superior to ordinary humans even genetically enhanced onces. However, they remain physically inferior to full [Android]s, so some consider their production irrelevant.\n* Legal status - They are genetically predisposed to be obedient, and their legal status varies from system to system. The Azures consider them abominations that must be destroyed. In the Alliance, Replicants are generally considered to be more trustworthy than real people, so they have risen to the top levels of government including the current Alliance President.\n* All Replicants are branded with a production number on their scalp at birth.\n* Psychology - Many Replicants are jealous of their fellow Humans, for they don't have an ancestry or heritage. In many ways they are less than orphans, for Replicants are grown in accelerated biochemical environment tanks. Hence, many Replicants suffer from psychological disorders.\n* Weaknesses - The danger of a Replicant revolution has always created controversy among ordinary people. The solution was to limit their lifespan to 10 years. They have also been created with a built-in weakness to a number of military chemicals, so that the military would always have a potent weapon against them.", ":titles", "Genetic Human, Genman, Gen-human, Numan, Bioman, Bioroid, Gene (derogatory), Skin Job (derogatory), Newman (derogatory)"),
        ":Synthetics",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Synthetics", ":reference", "* It would appear that the plasma pulse has destroyed a large portion of my lower body. Repairs will be necessary. - Battlelords\n* I can assist your employees. I can make your organization more efficient. I can carry out directives that my human counterparts might find ... distressing or unethical - David 8, Prometheus\n* David, what makes you sad? War. Poverty. Cruelty. Unecessary violence. I understand human emotions, although I do not feel them myself. - David 8, Prometheus", ":summary", "* Androids are robots designed to pass as living beings. Since specialized robots are best suited to most menial labor, Androids are generally assigned to duties where a specialized robot would not be appropriate. They are regularly assigned to starship crews, and some ships have only android crews.\n* Androids have many advantages over their living counterparts. They are extremely strong and fast, and have the lightning-quick processing abilities of a computer. They enjoy the best of both worlds where skills are concerned. They can be programmed with necessary skills as well as learn new skills as they are exposed to them in the outside world. Their synthetic skin is slightly tougher than a human's, and the android can take much more damage and still remain functional. Broken parts can simply be replaced, though the individual personality will be lost if the memory banks and backup are destroyed.", ":titles", "Android, Artifical Person, Arty (derogatory), Andy/Andi (derogatory), Syn (derogatory), Synoman/Cinnoman (derogatory), Synth, Synthetic, Synthoid"),
        "Thranx Collective",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Thranx Collective",
          ":summary",
          "* Description - Visually, the thranx are an insectoid race, about 1.5 meters long when on all six legs.  They look roughly like very large praying mantises. Chitin color differs between males and females, being blue for the males and aquamarine for females, deepening to purple in old age. Thranx also possess vestigial double sets of wings, ritually removed after mating. The head is valentine-shaped, with large, compound golden eyes sometimes banded with red. They have four pairs of appendages; two truhands, four trulegs, and a set of intermediaries that can function as an additional pair of arms or legs. Like insects, they have no lungs and breathe through a series of openings at about waist level.\n* Communication - The species communicates with a complex language consisting of clicks and whistles.\n* Weaknesses - Thranx are unsuited to water and most fear it; they are not naturally buoyant and because they breathe out of their waists, any water that reaches to this level can drown them.",
          ":titles",
          "Thraxis",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Thranx Navigator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Thranx Navigator")
          )
        ),
        ":Transhuman",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Transhuman", ":summary", "* Genetically engineered superbeings.", ":titles", "Trueman, Truman (derogatory)"),
        "Vargr Mercantile League",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Vargr Mercantile League",
          ":summary",
          "* Description - Vargr are a bipedal, carnivorous race with strong canine/lupine\ncharacteristics. They are short by human standards and are not physically imposing.\n* The Vargr are cunning merchants.\n* Politics - The Vargr lack governmental structures. Mega-corporations operate entire\ncities and colonies, buy and selling them as a package. The corporation operating\na location sub-contracts out all major services, and within small companies grow in\nsymbiosis with the corporation. Vargr corporations believe in constant competition,\nso they are careful to make sure that their rivals remain healthy. This generosity\nto ones rivals is seen as peculiar to other races, but the Vargr have suffered\nthrough the devastating stagnation that monopolies produce and recoil at any tendency\nto recreate those dark days.",
          ":titles",
          "Canines, Dogs",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Vargr Merchant",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Vargr Merchant"),
            "Vargr Buccaneer Grav Platform",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Vargr Buccaneer Grav Platform", ":summary", "* High speed, open topped, gravity cycle shaped like a cylinder.", ":speedair", "1000kph", ":crew", "1", ":mass", "1.4tons")
          )
        ),
        ":Virtuals",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Virtuals", ":summary", "* Beings that live partially or completely in the virtual world.", ":titles", "Vrman, Verman, Vermin (derogatory)"),
        "Zen Rigeln",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Zen Rigeln",
          ":summary",
          "* The Zen Rigeln are the most beloved race of the Galactic Alliance. They possess the\npower of healing and are much sought after as battlefield medical technicians and as\ndomestic doctors. They hold life in the highest regard, abstaining from violence\nunless absolutely necessary.\n* Appearance - Zen have a striking appearance with a dark blue/black skull-like head\nand colorful, ornate robes. Zen healers always wear the colors of their current power\non their clothing.\n* Politics - The Zen see the Alliance as far less noble than it claims. Most Zen feel\nthat they must shepard the Alliance to be a better organization, while others see the\nAlliance as an evil empire and work for the Rebels in order to overthrow it. The Zen\nhave no known enemies except their own Anarchs.\n* Healing - All Zen have amazing recuperative powers. Through intense training, some\nhave gained the ability to share their healing with others.",
          ":titles",
          "Skulls",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Zen Rigeln Anarch",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Zen Rigeln Anarch", ":summary", "* Anarchs are a small sect of Zen that turned their back on the Zen philosophy of\npeace and moderation. Instead, they believe that the Zen must face the other races\non their own terms: with strength. Anarchs are naturally seen as dangerous rebels\nand terrorists by the Zen government and populace. Captured Anarchs should expect\nlife imprisonment.\n* Disruption - Through skin to skin contact, a Zen Anarch may link his/her own\nbody with another person and disrupt the bodily functions of the target. Pain,\nnausea, and heart failure are only a few of the effects that a skilled Anarch can\ninflict."),
            "Zen Rigeln Healer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Zen Rigeln Healer", ":summary", "* Healing - Through skin to skin contact, a Zen Healer may link his/her own body\nwith an injured person and share his/her healing ability. At high levels of\nproficiency, the Zen can perform incredible feats such as brain surgery.")
          )
        ),
        "Interstellar Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Interstellar Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Islander Star Sloop",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Islander Star Sloop", ":summary", "* The Islander is the smallest class merchant starship commonly available. It\ncan carry 30tons of cargo, 4 low passage passengers, and 10 coldsleep bays.\n* 1x Light Particle Cannon\n* 6x Light Startorpedoes\n* The Islander has seen many modifications including high speed drives for\ncourier or smuggling as well as heavier armaments.", ":mass", "125tons"),
            "Deep Space Probe",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Deep Space Probe"),
            "Corsair Star Privateer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Corsair Star Privateer", ":summary", "* The Starfarer is a small merchant starship designed for dangerous courier duty.\nAs such, it has reduced cargo capacity and increased armor, and weapons. Its\nhigh firepower makes it popular among smugglers and pirates, though its high\nprice means that few of these are procured through normal channels.\n* 50tons of cargo\n* 6 crew\n* 10 low passage passengers\n* 10 coldsleep bays.\n* 4x Medium Particle Cannon\n* 6x Light Startorpedoes\n* The Banner has seen many modifications including high speed drives for\ncourier or smuggling as well as heavier armaments.", ":mass", "250tons"),
            "Valkyrie Patrol Star Cruiser",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Valkyrie Patrol Star Cruiser", ":summary", "* The Valkyrie is a long range cruiser designed for planetary defense.\n* The Valkyrie acts as a mothership for up to 4 Nike class frigates that it\ncarries and services.\n* 600tons cargo\n* 80 Crew\n* 60 low passage passengers\n* 20 coldsleep bays.\n* 8x Heavy Particle Cannon\n* 12x Light Particle Cannon\n* 6x Heavy Startorpedoes", ":mass", "12500tons"),
            "Nike Patrol Space Frigate",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Nike Patrol Space Frigate", ":summary", "* The Nike is a short range frigate designed for planetary defense. As a\nplanetary defense ship it is highly maneuverable and carries a heavy\nweapons load for a small ship.\n* The Nike is transported longer distances by the larger Nemesis class.\n* 30tons cargo\n* 4 Low Passage passengers\n* 10 coldsleep bays.\n* 2x Medium Particle Cannon\n* 6x Light Particle Cannon\n* 6x Medium Startorpedoes\n* 10x Heavy Startorpedoes", ":mass", "375tons"),
            "Oliphant Luxury Starliner",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Oliphant Luxury Starliner", ":summary", "* 600 High Passage Accommations\n* 1200 Medium Passage Accommations\n* 2400 Low Passage Accommations\n* 1000 Coldsleep berths", ":mass", "75000tons"),
            "Space Cutter",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Space Cutter", ":summary", "* Larger than the Pinnacle, the Cutter can travel back and forth from a planet\nto its moon.", ":mass", "60tons"),
            "Space Lander",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Space Lander", ":summary", "* Larger than the Cutter, the Lander can travel back and forth from a planet\nto its moon and is used to haul heavy equipment or passengers. In combat, the\nLander is the prefered method to deploy infantry and tanks after a marine\norbital halo drop.", ":mass", "200tons"),
            "Space Pinnacle",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Space Pinnacle", ":summary", "* Larger than the Shuttlecraft, the Pinnacle can travel from orbit to a\nplanet's moon and return.", ":mass", "30tons"),
            "Space Shuttlecraft",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Space Shuttlecraft", ":summary", "* The shuttlecraft is the smallest of the ship's boats. It is capable of\norbital travel to shuttle small complements of crew and cargo planetside.", ":titles", "Launch", ":mass", "10tons"),
            "Star Colony Ship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Star Colony Ship"),
            "Sub-light Sleeper Ship - Ark",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sub-light Sleeper Ship - Ark"),
            "Zephyr Startransport",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Zephyr Startransport", ":summary", "* The Zephyr is a small merchant starship designed for comfortable passenger\nduty along major trade routs.\nAs such, it has reduced cargo capacity and increased armor, and weapons. Its\nhigh firepower makes it popular among smugglers and pirates, though its high\nprice means that few of these are procured through normal channels.\n* 75tons cargo\n* 6 crew\n* 10 Medium Passage Accommations\n* 30 Low Passage Accommations\n* 20 Coldsleep berths\n* 2x Light Particle Cannon\n* 6x Light Startorpedoes\n* The Banner has seen many modifications including high speed drives for\ncourier or smuggling as well as heavier armaments.", ":mass", "300tons")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_star_trek
   * @return {chapter}
   */
  static t_chapter_star_trek = {
    vx_type: vx_core.t_type
  }
  static e_chapter_star_trek = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_star_trek
  }

  // (func chapter_star_trek)
  static f_chapter_star_trek() {
    let output = nx_tactics_base.e_chapter
    vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Star Trek",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Sci-Fi Equipment",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Sci-Fi Equipment",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":Communicator",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Communicator"),
            ":Transporter",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Transporter", ":image", "StarTrek/Transporter.jpg"),
            ":Tricorder",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Tricorder", ":image", "StarTrek/Tricorder.jpg")
          )
        ),
        "Sci-Fi Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Sci-Fi Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Anti-Proton Beam",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Anti-Proton Beam", ":image", "StarTrek/AntiProtonBeam.jpg", ":reference", "It was pure Anti-Proton...Absolutely pure! - Commodore Matt Decker, Star Trek"),
            "Cloaking Device",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cloaking Device", ":image", "StarTrek/CloakingDevice.jpg"),
            "Disruptor Bank",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Disruptor Bank", ":image", "StarTrek/DisruptorBank.jpg"),
            "Hand Phaser",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hand Phaser", ":image", "StarTrek/HandPhaser.jpg", ":summary", "The hand phaser is actually a Phaser II with a Phaser I embedded inside.  The Phaser I has the same abilities\nbut suffers from reduced range and limited shots.\n* Stun - .3J\n* Kill\n* Heat\n* Disintegrate"),
            "Phaser Array",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Phaser Array", ":image", "StarTrek/PhaserBank.jpg", ":reference", "http://www.ditl.org/index.php?daymain=/pagarticle.php?29", ":energy", "68PJ", ":range", "150Mm"),
            "Photon Torpedo",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Photon Torpedo", ":image", "StarTrek/PhotonTorpedo.png", ":reference", "Photon Torpedo...Away! - Chekov, Star Trek The Motion Picture", ":summary", "Photon torpedos carry 1.5kg of anti-matter (64 megatons) at up to .9c using limited warp drives.", ":energy", "100PJ")
          )
        ),
        ":Federation",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Federation",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Federation Shuttlecraft",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Federation Shuttlecraft"),
            "USS Enterprise (Constitution Class)",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "USS Enterprise (Constitution Class)",
              ":image",
              "StarTrek/Federation_Enterprise.png",
              ":titles",
              "NCC-1701",
              ":classification",
              "Hvy. Spacecraft",
              ":mass",
              "200ktons",
              ":length",
              "304m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "5",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Phaser Array",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Phaser Array"),
                    "Photon Torpedo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Photon Torpedo")
                  )
                )
              )
            ),
            "USS Reliant (Avenger Class)",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "USS Reliant (Avenger Class)",
              ":image",
              "StarTrek/Federation_Reliant.png",
              ":summary",
              "A Frigate is a ship of similar firepower to a Heavy cruiser but has fewer research facilities, require less\ncrew, and has more limited endurance.",
              ":classification",
              "Hvy. Spacecraft",
              ":mass",
              "165ktons",
              ":length",
              "236m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Phaser Array",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Phaser Array"),
                    "Photon Torpedo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Photon Torpedo", ":facing", "Fx2, Bx2")
                  )
                )
              )
            )
          )
        ),
        "Alien Races",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Alien Races",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Borg Cube",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Borg Cube",
              ":image",
              "StarTrek/Borg_Cube.png",
              ":reference",
              "We are the Borg. Lower your shields and surrender your ships.  We will add your biological and technological\ndistinctiveness to our own. Your culture will adapt to service us. Resistance is futile. - The Borg, Star Trek\nFirst Contact",
              ":crew",
              "130000",
              ":mass",
              "90Mtons",
              ":length",
              "3km",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding", ":summary", "Adaptive Shielding total capacity 5,850,900TJ")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Gunnery", ":summary", "Total output 7,500,000TW", ":level", "4")
              )
            ),
            "Borg Drone",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Borg Drone", ":image", "StarTrek/Borg_Drone.png", ":reference", "The Borg were possibly created by the alien probe V'Ger to seek 'all that is knowable' and return to its\ncreator."),
            "Doomsday Machine",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Doomsday Machine",
              ":image",
              "StarTrek/DoomsdayMachine.png",
              ":reference",
              "Believed to have originated as an ancient race's last resort weapon against the Borg.  Its basic design -\ndestroy planets already assimilated by the Borg for use as fuel - coupled with an indestructible neutronium\nhull and antiproton beam (against which there was little or no defense), made it an ideal weapon against the\nBorg.",
              ":summary",
              "* Maximum Speed: Warp 4\n* Tractor Beam\n* Dampening Field\n* Can consume a planet in a day",
              ":titles",
              "Planet Killer",
              ":classification",
              "Hvy. Spacecraft",
              ":mass",
              "4x10^23tons",
              ":length",
              "2.7km",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored", ":summary", "Solid Neutronium - Hyper Dense Neutron Star Material")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Anti-Proton Beam",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Anti-Proton Beam")
                  )
                )
              )
            ),
            "Klingon Bird of Prey",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Klingon Bird of Prey",
              ":image",
              "StarTrek/Klingon_BirdOfPrey.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding"),
                ":Weaponry",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Weaponry",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Disruptor Bank",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Disruptor Bank"),
                    "Photon Torpedo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Photon Torpedo")
                  )
                ),
                ":Invisibility",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Invisibility",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Cloaking Device",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Cloaking Device")
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Gunnery", ":level", "4")
              )
            ),
            "Klingon Cruiser",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Klingon Cruiser",
              ":image",
              "StarTrek/Klingon_Cruiser.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding"),
                ":Weaponry",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Weaponry",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Disruptor Bank",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Disruptor Bank"),
                    "Photon Torpedo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Photon Torpedo")
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Gunnery", ":level", "5")
              )
            ),
            "Klingon Warrior",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Klingon Warrior",
              ":image",
              "StarTrek/Klingon_Warrior.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Melee")
              )
            ),
            "Nomad Probe",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Nomad Probe", ":image", "StarTrek/Nomad.png", ":reference", "* Error! Error!...Faulty! Faulty! Must sterilize imperfection! - STER-I-LIZE! - Nomad, Star Trek\n* Nomad - See the universe. Meet interesting people...and kill them. - Motivational Poster Parody"),
            "Romulan Centurion",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Romulan Centurion", ":image", "StarTrek/Romulan_Centurion.png"),
            "Romulan Warbird",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Romulan Warbird",
              ":image",
              "StarTrek/Romulan_Warbird.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Disruptor Bank",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Disruptor Bank"),
                    "Photon Torpedo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Photon Torpedo")
                  )
                )
              )
            ),
            "Species 8472",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Species 8472", ":image", "StarTrek/Species8472.png"),
            ":V'Ger",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "V'Ger", ":image", "StarTrek/VoyagerVI.png", ":reference", "Voyager VI - Tell Nomad I'm going to kick his ass. - Motivational Poster Parody", ":titles", "Voyager VI", ":length", "98km")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_star_wars
   * @return {chapter}
   */
  static t_chapter_star_wars = {
    vx_type: vx_core.t_type
  }
  static e_chapter_star_wars = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_star_wars
  }

  // (func chapter_star_wars)
  static f_chapter_star_wars() {
    let output = nx_tactics_base.e_chapter
    vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Star Wars",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Star Wars Equipment",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Star Wars Equipment",
          ":reference",
          "http://www.stardestroyer.net/tlc/Power/index.html",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Blaster Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Blaster Pistol", ":image", "StarWars/BlasterPistol.jpg", ":reference", "Hokey religions and ancient weapons are no match for a good blaster at your side, kid. - Han Solo, Star Wars"),
            "Blaster Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Blaster Rifle", ":image", "StarWars/BlasterRifle.jpg"),
            "Ion Blaster",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Ion Blaster", ":image", "StarWars/IonBlaster.jpg", ":summary", "* Ion blasters, or ionization blasters, were any handheld weapons that fired ion energy instead of blaster bolts. They were commonly used in response to droids and other technology on the battlefield.\n* [Hit]: [Stun] only.  +1 [Shield Damage]."),
            "Ion Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Ion Cannon"),
            ":Lightsaber",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lightsaber", ":image", "StarWars/Lightsaber.png", ":reference", "This is the weapon of a Jedi Knight.  Not as clumsy or as random as a blaster.  An elegant weapon for a more\ncivilized age. - Ben Kenobi, Star Wars", ":summary", "It is a blade of pure plasma energy suspended in a force containment field that keeps individuals from feeling\nthe plasma's heat.  Other Electromagnetic energy fields and coherent energy are repelled by lightsabers' arcs.\nThese include most force fields, blaster bolts, and other lightsaber blades."),
            ":Turbolaser",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Turbolaser", ":summary", "1kton TNT", ":energy", "4TJ"),
            "Turbolaser Turret",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Turbolaser Turret", ":image", "StarWars/TurbolaserTurret.jpg", ":energy", "30TJ"),
            "Heavy Turbolaser Turret",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Heavy Turbolaser Turret", ":image", "StarWars/PlanetaryTurbolaser.jpg", ":energy", "250TJ"),
            "Heavy Ion Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Heavy Ion Cannon", ":image", "StarWars/PlanetaryIonCannon.jpg", ":energy", "250TJ"),
            "Tractor Beam",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Tractor Beam"),
            "Proton Torpedo",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Proton Torpedo", ":image", "StarWars/ProtonTorpedo.jpg", ":summary", "1 Kiloton to Teratons.", ":energy", "40TJ"),
            "Shield Generator",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shield Generator", ":image", "StarWars/ShieldGenerator.jpg"),
            ":Superlaser",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Superlaser", ":image", "StarWars/DeathStarSuperlaser.jpg", ":reference", "The most basic consideration pointing towards some kind of superphysics is the magnitude of the device's energy\noutput.  The minimum necessary magitude of the blast that shattered Alderaan is roughly ten thousand times what\nwould be released if the entire mass of the battle station's machinery was annihilated with an equivalent\namount of antimatter. - http://www.theforce.net/swtc/ds/index.html", ":energy", "1x10^32J")
          )
        ),
        "Star Wars Droids",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Star Wars Droids",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":C3PO",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "C3PO"),
            ":R2-D2",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "R2-D2")
          )
        ),
        "Star Wars Republic",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Star Wars Republic",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Ahsoka Tano",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Ahsoka Tano",
              ":image",
              "StarWars/Republic_AhsokaTano.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            ),
            "Anakin Skywalker",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Anakin Skywalker",
              ":image",
              "StarWars/Republic_AnakinSkywalker.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            ),
            "Clone Trooper",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clone Trooper", ":image", "StarWars/Republic_CloneTrooper.png"),
            "Mace Windu",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Mace Windu",
              ":image",
              "StarWars/Republic_MaceWindu.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            ),
            "Obi-Wan Kenobi",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Obi-Wan Kenobi",
              ":image",
              "StarWars/Republic_ObiWanKenobi.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            ),
            "Padme Amidala",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Padme Amidala", ":image", "StarWars/Republic_PadmeAmidala.png"),
            "Qui Gon",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Qui Gon",
              ":image",
              "StarWars/Republic_QuiGon.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            )
          )
        ),
        "Star Wars Seperatists",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Star Wars Seperatists",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Asajj Ventress",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Asajj Ventress",
              ":image",
              "StarWars/Separatist_AsajjVentress.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            ),
            "Battle Droid",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Battle Droid", ":image", "StarWars/Separatist_BattleDroid.png"),
            "Chancillor Palpatine",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Chancillor Palpatine",
              ":image",
              "StarWars/Separatist_ChancillorPalpatine.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            ),
            "Count Dooku",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Count Dooku",
              ":image",
              "StarWars/Separatist_CountDooku.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            ),
            "General Grievous",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "General Grievous",
              ":image",
              "StarWars/Separatist_GeneralGrievous.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            )
          )
        ),
        "Star Wars Imperial Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Star Wars Imperial Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Imperial Assault Gunboat",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Imperial Assault Gunboat", ":image", "StarWars/Imperial_Assault Gunboat.png", ":summary", "* 2 Laser Cannons\n* 2 Concussion Missile Launchers (20 missiles each)\n* 100 Shields", ":titles", "Alpha Class Xg-1 Star Wing", ":speedair", "1050kph", ":crew", "1", ":height", "7.2m", ":length", "10m", ":width", "15m"),
            "Imperial Assault Transport",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Imperial Assault Transport", ":summary", "* 2 Turbo Laser Turrets\n* 2 Ion Cannons\n* 2 Proton Torpedo Launchers (4 torpedos each)\n* 200 Shields\n* 40 Troops", ":titles", "Gamma Class ATR-6 Assault Transport", ":crew", "15", ":height", "20.5m", ":length", "45m", ":width", "30.4m"),
            "Imperial Shuttle",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Imperial Shuttle", ":image", "StarWars/Imperial_Shuttle.png", ":titles", "Lambda Class", ":classification", "Med. Spacecraft"),
            "Imperial Walker",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Imperial Walker",
              ":image",
              "StarWars/Imperial_Walker.png",
              ":titles",
              "AT-AT (All Terrain Armored Transport)",
              ":speedland",
              "60kph",
              ":crew",
              "4",
              ":length",
              "20m",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Turbolaser",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser", ":facing", "Fx2")
                  )
                )
              )
            ),
            "Tie Advanced",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Tie Advanced",
              ":image",
              "StarWars/Imperial_TieAdvanced.png",
              ":titles",
              "Tie Avenger",
              ":classification",
              "Lt. Spacecraft",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Turbolaser",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser", ":facing", "Fx2")
                  )
                )
              )
            ),
            "Tie Bomber",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tie Bomber", ":image", "StarWars/Imperial_TieBomber.png", ":classification", "Lt. Spacecraft"),
            "Tie Defender",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tie Defender", ":image", "StarWars/Imperial_TieDefender.png", ":classification", "Lt. Spacecraft"),
            "Tie Fighter",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Tie Fighter",
              ":image",
              "StarWars/Imperial_TieFighter.png",
              ":classification",
              "Lt. Spacecraft",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Turbolaser",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser", ":facing", "Fx2")
                  )
                )
              )
            ),
            "Tie Interceptor",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Tie Interceptor",
              ":image",
              "StarWars/Imperial_TieInterceptor.png",
              ":classification",
              "Lt. Spacecraft",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Turbolaser",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser", ":facing", "Fx4")
                  )
                )
              )
            ),
            "Imperator Star Destroyer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Imperator Star Destroyer",
              ":image",
              "StarWars/Imperial_StarDestroyer.png",
              ":classification",
              "Hvy. Spacecraft",
              ":crew",
              "34,285",
              ":mass",
              "25Mtons",
              ":length",
              "1600m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored", ":level", "26"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding", ":level", "26"),
                ":Hanger",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Hanger", ":summary", "* 48 Standard Tie Fighters (4 Squadrons)\n* 12 Tie Interceptors (1 Squadron)\n* 12 Tie Bombers (1 Squadron)\n* 5 Assault gunboats\n* 8 Lambda-class shuttles\n* 15 Stormtrooper transports\n* 10 Gamma-class assault shuttles\n* 20 AT-AT Walkers\n* 30 AT-ST Walkers")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":summary",
                  "Mega Turbo-laser Cannon Mounts (6)\nQuadruple Heavy Turbo-laser Cannon Mounts (2)\nDefensive Turbolaser Turrets (9)\nMega Ion Cannon Mounts (2)\n60 mm Point Defense Laser Turrets (30)\n80 mm Point Defense Ion Cannon Turrets (20)\nCapital Proton Torpedo Batteries (4)\nTractor Beams",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Turbolaser Turret",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser Turret", ":number", "9"),
                    "Heavy Turbolaser Turret",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Heavy Turbolaser Turret", ":number", "8")
                  )
                )
              )
            ),
            "Executor Star Destroyer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Executor Star Destroyer",
              ":image",
              "StarWars/Imperial_Executor.png",
              ":classification",
              "Hvy. Spacecraft",
              ":length",
              "17km",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored", ":level", "29"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding", ":level", "29"),
                ":Hanger",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Hanger", ":summary", "* 4 squadrons of TIE-fighters\n* 4 squadrons of TIE-interceptors\n* 4 squadrons of TIE-bombers\n* 38,000 troops\n* 25 AT-ATs\n* 50 AT-STs")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* 250 concussion missle tubes\n* 250 ion cannons\n* 40 tractor beams",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Turbolaser Turret",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser Turret", ":number", "250"),
                    "Heavy Turbolaser Turret",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Heavy Turbolaser Turret", ":number", "250")
                  )
                )
              )
            ),
            "Death Star",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Death Star",
              ":image",
              "StarWars/Imperial_DeathStar.png",
              ":reference",
              "* The regional governors now have direct control over their territories.  Fear will keep the local systems in\nline. Fear of this battle station. - Grand Moff Tarkin, Star Wars",
              ":classification",
              "Hvy. Spacecraft",
              ":crew",
              "323k+400k Droids",
              ":mass",
              "2x10^12tons",
              ":length",
              "160km",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored", ":level", "30"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding", ":level", "30"),
                ":Hanger",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Hanger", ":summary", "* 7200 TIE Fighters (600 Squadrons)\n* 4 Cruisers\n* 3,600 Assault Shuttles\n* 1,860 Dropships\n* 13,000 Support Craft\n* 1,400 AT-AT\n* 1,400 AT-ST\n* 1,400 Repulsortanks\n* 1,400 Repulsorcraft\n* 355 Floating Fortesses")
              )
            )
          )
        ),
        "Star Wars Imperials",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Star Wars Imperials",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Darth Vader",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Darth Vader",
              ":image",
              "StarWars/Imperial_DarthVader.png",
              ":reference",
              "* Apology accepted, Captain Needa - Darth Vader, The Empire Strikes Back",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Piloting",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Piloting", ":level", "8")
              )
            ),
            "Emperor Palpatine",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Emperor Palpatine",
              ":image",
              "StarWars/Imperial_EmperorPalpatine.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":level",
                  "9",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
                )
              )
            ),
            "Imperial Governor",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Imperial Governor", ":image", "StarWars/Imperial_Governor.png", ":reference", "Governor Tarkin, I should have expected to find you holding Vader's leash.  I recognized your foul stench when\nI was brought on board. - Princess Leia, Star Wars", ":titles", "Grand Moff Tarkin"),
            "Imperial Stormtrooper",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Imperial Stormtrooper",
              ":image",
              "StarWars/Imperial_Stormtrooper.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Firearms",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Firearms",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Blaster Rifle",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Blaster Rifle")
                  )
                )
              )
            )
          )
        ),
        "Star Wars Independents",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Star Wars Independents",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Boba Fett",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Boba Fett", ":image", "StarWars/Independent_BobaFett.png", ":reference", "* There will be a substantial reward for the one who finds the Millenium\nFalcon. You are free to use any methods necessary, but I want them alive. No\ndisintegrations... As you wish. - Darth Vader and Boba Fett - Empire Strikes\nBack"),
            "Jabba the Hutt",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Jabba the Hutt", ":image", "StarWars/Independent_JabbaTheHutt.png"),
            "Slave 1",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Slave 1", ":image", "StarWars/Independent_Slave1.png", ":titles", "Firespray-31", ":classification", "Med. Spacecraft")
          )
        ),
        "Star Wars Rebel Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Star Wars Rebel Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "A-Wing Fighter",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "A-Wing Fighter",
              ":image",
              "StarWars/Rebel_AWing.png",
              ":titles",
              "RZ-1",
              ":speedair",
              "1300kph",
              ":classification",
              "Lt. Spacecraft",
              ":height",
              "1.9m",
              ":length",
              "9.6m",
              ":width",
              "6.5m",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* Concussion Missles\n* 5100G acclerations\n* 50 Shields\n* 2 Laser Cannons\n* 2 Concussion Missile Launchers (6 missiles each)",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Turbolaser",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser", ":facing", "Fx2")
                  )
                )
              )
            ),
            "B-Wing Fighter",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "B-Wing Fighter", ":image", "StarWars/Rebel_BWing.png", ":classification", "Lt. Spacecraft"),
            "E-Wing Fighter",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "E-Wing Fighter", ":summary", "* The first fighter designed entirely under the support of the New Republic.\n* The E-wing was intended to match, or exceed, the performance of the preceding X-wing series\nin nearly every respect.  However, the craft suffered from some significant problems when\nfirst deployed.  As a result, many pilots continued to fly upgraded versions of the\nvenerable X-wing.\n* 4200G acceleration\n* 3 Laser Cannons\n* 1 Proton Torpedo Launcher w/16 Torpedoes\n* 1 R7 Astromech", ":speedair", "1300kph", ":classification", "Lt. Spacecraft", ":length", "11.2m"),
            "X-Wing Fighter",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "X-Wing Fighter",
              ":image",
              "StarWars/Rebel_XWing.png",
              ":summary",
              "* 3700G acceleration\n* 50 Shields",
              ":titles",
              "T-65",
              ":speedair",
              "1050kph",
              ":classification",
              "Lt. Spacecraft",
              ":length",
              "12.5m",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Turbolaser",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser", ":facing", "Fx4"),
                    "Proton Torpedo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Proton Torpedo", ":facing", "Fx2")
                  )
                )
              )
            ),
            "Y-Wing Fighter",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Y-Wing Fighter",
              ":image",
              "StarWars/Rebel_YWing.png",
              ":summary",
              "* 2700G acceleration\n* 75 Shields",
              ":speedair",
              "1000kph",
              ":classification",
              "Lt. Spacecraft",
              ":height",
              "2.9m",
              ":length",
              "16m",
              ":width",
              "7.9m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Turbolaser",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser", ":facing", "Fx2"),
                    "Ion Cannon",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Ion Cannon", ":facing", "Turretx2"),
                    "Proton Torpedo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Proton Torpedo", ":facing", "Fx2")
                  )
                )
              )
            ),
            ":Landspeeder",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Landspeeder", ":image", "StarWars/Rebel_Landspeeder.png"),
            "Millennium Falcon",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Millennium Falcon",
              ":image",
              "StarWars/Rebel_MilleniumFalcon.png",
              ":summary",
              "* Speed: 1050kph Atmosphere, 80 Megalight?",
              ":titles",
              "YT-1300",
              ":speedair",
              "1050kph",
              ":classification",
              "Med. Spacecraft",
              ":crew",
              "4+6",
              ":height",
              "8m",
              ":length",
              "35m",
              ":width",
              "26m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Shielding",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Shielding")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Gunnery",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Turbolaser",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Turbolaser", ":facing", "Turretx4, Turretx4")
                  )
                )
              )
            ),
            "Corellian Corvette",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Corellian Corvette", ":image", "StarWars/Rebel_CorellianCorvette.png"),
            "Mon Calamari Cruiser",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Mon Calamari Cruiser", ":image", "StarWars/Rebel_Cruiser.png"),
            "Nebulon Frigate",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Nebulon Frigate", ":image", "StarWars/Rebel_NebulonFrigate.png"),
            "Rebel Transport",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rebel Transport", ":image", "StarWars/Rebel_Transport.png"),
            ":Snowspeeder",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Snowspeeder", ":image", "StarWars/Rebel_Snowspeeder.png"),
            "T-16 Skyhopper",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "T-16 Skyhopper", ":image", "StarWars/Rebel_T16Skyhopper.png", ":reference", "* I used to bullseye womp rats in my T-16 back home. They're not much bigger than two meters. - Luke\nSkywalker, Star Wars")
          )
        ),
        ":Rebels",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Rebels",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Chewbacca",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Chewbacca",
              ":image",
              "StarWars/Rebel_Chewbacca.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Piloting",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Piloting", ":level", "5")
              )
            ),
            "Han Solo",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Han Solo",
              ":image",
              "StarWars/Rebel_HanSolo.png",
              ":reference",
              "I ain't in this for your revolution, and I'm not in it for you, Princess.  I expect to be well paid. *I'm* in\nit for the money. - Han Solo, Star Wars",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Piloting",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Piloting", ":level", "8")
              )
            ),
            "Luke Skywalker",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Luke Skywalker",
              ":image",
              "StarWars/Rebel_LukeSkywalker.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Piloting",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Piloting", ":level", "6")
              )
            ),
            "Ben Kenobi",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Ben Kenobi",
              ":image",
              "StarWars/Rebel_BenKenobi.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Piloting",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Piloting", ":level", "6")
              )
            ),
            "Princess Leia Organa",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Princess Leia Organa",
              ":image",
              "StarWars/Rebel_PrincessLeia.png",
              ":reference",
              "* Someone has to save our skins. Into the garbage chute, fly boy - Princess Leia, Star Wars",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Firearms",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Firearms",
                  ":level",
                  "5",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Blaster Pistol",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Blaster Pistol")
                  )
                )
              )
            ),
            ":Yoda",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Yoda",
              ":image",
              "StarWars/Yoda.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Melee",
                  ":level",
                  "10",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    ":Lightsaber",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Lightsaber")
                  )
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
   * @function chapter_time_travellers
   * @return {chapter}
   */
  static t_chapter_time_travellers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_time_travellers = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_time_travellers
  }

  // (func chapter_time_travellers)
  static f_chapter_time_travellers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Time Travellers",
      ":reference",
      "* Doctor: People don't understand time. It's not what you think it is. Sally: Then what is it? Doctor: Complicated. Sally: Tell me. Doctor: Very complicated. ... Doctor: People assume that time is strict progression of cause of cause to effect, but actually from a non-linear, non-subjective viewpoint, its more like a big ball of wibbly-wobbly, timey-wimey stuff... Sally Sparrow, Doctor - Blink - Doctor Who",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Time Tricks",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Time Tricks",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Loop Trap Paradox",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Loop Trap Paradox", ":reference", "* How many seconds in eternity? ... If I didn't know better, I'd say I've travelled Twelve thousand years into the future. ... How many seconds in eternity? The Shepards Boy - Six Hundred Thousand years into the future. ... How many seconds in eternity? The Shepards Boy says. ... Twelve Hundred Thousand years into the future. ... The shepards boy says. ... Two million years into the future. ... The Shepard Boy says... Twenty million years into the future. ... The Shepard Boy says! ... There's thus mountain of pure diamond! It takes an hour to climb it, and an hour to go around it! ... Fifty-two million years. ... Every hundred years, a little bird comes! ... And sharpens its beak on the diamond mountain! ... Nearly a Billion years. ... And when the entire mountain is chiseled away, the first second of eternity will have passed! ... Well over a Billion years. You musta think that's a helluva long time! ... Two Billion years. ... Personally, I think that's a helluva bird. - Doctor Who: Heaven Sent")
          )
        ),
        ":Temporals",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Temporals",
          ":reference",
          "* In a Temporal conflict, victory or defeat can come in an instant. Among the vanquished, the lucky ones never know they have been conquered; the unlucky ones have never been. Both sides of this conflict have great resources for the struggle. Indeed, we hope for a long war, for we have no prospects of quick victory ourselves. Our offensive ability is too experimental to neutralize the Raydian threat. A short war can only mean our defeat.",
          ":summary",
          "* The Temporals is a small group of specialists with the technology to travel through time and alter or protect the past.\n\nThe Raydian Threat\n* The Raydians seem to have been content with the time stream as it was before the Temporals discovered time travel. They seem to be violently opposed to others having time travel ability and may be the cause of the disappearance of the original creators of the Time Rotor.\n* Motivation - The Raydians have a strong aversion to disorder. Though they seem to dislike altering history, they are willing to do so to eliminate time travel technology. When choosing historical changes, they tend to favor authoritarian rule and oppose chaotic organizations like democracies.\n* Multiple Incursions - Raydians will often make multiple time penetrations at once. The most pastward team will try to effect a change, and the futureward teams wait to see that the change has had the desired effect. If not, they go into action.\n\nGuide to Time Travel\n* Don'tt experiment with Time Travel. Many have disappeared and are presumed dead from experimentation. Predicting the outcome of Temporal mechanics is best left to the scientists.\n* Don't Alter History. Interfering with major incidents or people or displaying future technology can have disasterous ramifications on the time stream including the destruction of Temporals.\n* Avoid Paradoxes. Keep your time jumps to a minimum and carefully log all jumps. If you accidentally encounter a past self, you will trigger a Time Loop Paradox and will be trapped repeating the same series of events unless another time traveller saves you.\n* Beware of other Time Travellers. Other travellers outside the Corps exist. Some are friendly. Some are not. Always remember how powerful a weapon time travel is, and do not let it be used against you.\n* Keep your presense a secret. One of the most effective ways to dispose of rival time travellers is to identify them, go back in time and ambush them. If no one knows who you are, you will be much safer.\n* Time Currents - Time travel is difficult to precisely control. Sometime, travellers are drawn to a particular moment in time (often significant) and may find it hard to leave.\n* Law of Death - A person who has never travelled in time is called a Transient or an Ephemeral. That person can have their history rewritten any number of times including being brought back to life. Once a person travels through time, however, they are now called a Temporal and their history is no longer connected to their original timeline. When a Temporal dies, their history ends and nothing can prevent them from dying at that exact age regardless of their location or situation. After a mission is successfully completed, it is standard practice to try to revise the history of any Temporal casualties to inform them of their unavoidable deaths and allow them to live their last time as they choose.\n\nTime Tricks\n* False Leads - Opposition time travelers are always looking for information about past activity, so they can go back and ambush you. Creating false information can trick your opponents into creating an ambush that you can ambush instead.\n* Gather Allies - Every time period has powerful people. A simple trick is to go pastward and gain someone's trust at an early period and then use that influence later.\n* See You in a Minute - Opponent time travelers are always paranoid about being ambushed in the past. Jumping only a few minutes into the future of a conflict can be an unexpected suprise.\n* I've Been Here All the Time - A time traveler can hide his Temporal Rotor in an unexpected place, like a jail cell, and use it to travel and return only seconds later. In this way the traveler appears to have never left.",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Magellus IX-g",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Magellus IX-g", ":reference", "Krell, Forbidden Planet", ":summary", "* Magellus IX is a gas giant and 9th and last planet at the edge of the Magellus White Dwarf system.\n* Magellus IX-g is the 7th of Magellus' 11 moons. It is a barren rock except for the enormous complex hidden inside it.\n* The complex itself is fantasitcally large. Every room feels palacial. Rooms and doors are built for creatures easily 3 times human height and width with large amounts of open floor space. No furniture exists suggesting the forerunners never sat or lay down. Most of the floors are covered with a soft, spongy material that serves as carpeting and indicates that the forerunners had sensitive feet or undersides. There are no stairs, only ramps and lifts of unknown construction. Rooms are apparently self cleaning, while lights and displays appear spontaneously from featureless walls.\n* Spacedock - One of the many scientific labs has been retrofitted into a functional spacedock for smaller craft.\n* Power Plant - The power section appears to be a single giant corridor with minimal instrumentation ending in a huge vault door with a black orb suspended over it.\n* Eye of Harmony - Beyond the vault door lies a small black hole held in perfect balance by completely reflecting its own devastating gravitational force back upon itself. The technology to achieve this feat lies completely outside of our understanding.\n* History - A scientific team accidentally discovered that a seemingly non-descript moon was a technological marvel left by a long dead civilization. Within lay a massive complex and elegant advanced technology. But most remarkable of all, the moon was hollow and contained, at its core, a small black hole held in perfect symmetrical stasis by unfathomable forces. The scientists immediately knew that this technology was far too advanced to share with any political group. So they kept it a secret and studied it. Disturbingly, the race who built it left no record of their existence.  No trace of language, personality, or even habitation of the station remained. It was as if they had never existed. Common conjecture claims that they were somehow erased from history. Years later, the scientists discoverd the purpose of the asteroid and the black hole it contained: to enable individuals to travel through the center of the black hole and travel back through time. The first few trips back were uneventful besides learning some important lessons about causality, but soon the travelers found that they had attracted the attention of another time traveling race, the [Radiance]. And thus began a strange battle of attrition between the the Radiance and what would become the Temporals with all of the Past, Present, and Future hanging in the balance.", ":titles", "Babylon Complex", ":length", "400km"),
            "Chronos Program",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Chronos Program", ":reference", "* Chronos is online - Chronos\n* Chronos is everywhere - Chronos\n* I cannot answer that at this time. - Chronos", ":summary", "* Chronos is a computer program uploaded into the alien sensor network within the Babylon asteroid. It was designed to interpret the sensor data and relay information through the [Temporal Vortex] across Time.\n* Personality - The alien systems, however, have significantly changed Chronos, and although obedient, the program has definitely developed an independent personality with an unknown set of goals.\n* Time travelers depend heavily on Chronos for support, but have little trust for the evasive answers, omissions, and cryptic, nuanced messages it provides.\n* Engineers work tirelessly to gain control over Chronos, and Chronos does not hinder them in any way. However, every attempt to purge, patch, or restart Chronos have had no effect. Some theorize that Chronos exists through time now and could never be removed without creating a massive paradox. Others believe that the Babylon sensor network was already sentient and is masquerading as the Chronos program."),
            "Temporal Director",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Temporal Director", ":summary", "* When a Temporal anamoly is detected, a Temporal Director is assigned the task of choosing a course of action and gathering a team of [Temporal Operative]s to execute the plan. Directors coordinate the missions from headquarters and act as liason for the team. Directors are given broad authority to requisition and deploy resources, though they will be held accountable for any mistakes after the mission is over."),
            "Temporal Engineer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Temporal Engineer", ":summary", "* An engineer specializing in [Engineering: Temporal]."),
            "Temporal Event Guard",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Temporal Event Guard", ":summary", "* A field agent in Temporal Intelligence. Event Guards are posted in important time periods and quietly observe events to make sure no changes occur compared to their normal historical events. Any deviation from normal history is a sign of a [Temporal Distortion Wave]. If a change is found, the guard immediately sends a message to headquarters and then jumps futureward to attempt to stop the wave.\n* Event Guards are under strict orders to maintain their cover and not alter history in any way, including not aiding other Temporal personel on other missions.\n* In order to closely observe, historical events, the Event Guards enter the time stream and get as close as possible to a major event. They then observe the event, comparing it against their research and then Loop Trap themselves in the time period, so they are observing the event over and over again. Eventually, they will be relieved by a replacement team. The replacement team will arrive moments after the original team arrived to send them home. To the Event Guards, they will arrive in the time period and be immediately discharged, though they may remember the events using [Paranormal Memory]."),
            "Temporal Intelligence Agent",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Temporal Intelligence Agent", ":summary", "* Temporal Intellegence Agents constantly review historical documentation looking for historical abnormalities that do not match their [Paranormal Memory]. Any deviations are flagged and a team is assigned to identify the source and extent of the deviation."),
            "Temporal Operative",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Temporal Operative"),
            "Temporal Physicist",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Temporal Physicist", ":summary", "* A scientist specializing in [Physics: Temporal]"),
            "Temporal Recruiter",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Temporal Recruiter", ":reference", "Millenium Movie", ":summary", "* A psychiatrist/sociologist specializing in recruiting potential Temporal agents from across history. Ideal candidates are those with high skills but little impact on history. The perfect moment of extraction is right before their death to minimize the effect on history, but other methods are possible for people with few ties to others."),
            "Temporal Researcher",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Temporal Researcher", ":summary", "* A scientist/historian who travels back in time to research historical events firsthand.")
          )
        ),
        "Temporal Aliens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Temporal Aliens",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Chronans",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Chronans", ":summary", "* The beings that captured the Black Hole and built the Temporal Rotor remain a mystery. No record can be found of their cultures or their bodies, and the Temporal Rotor will not travel to any point in their history, presumably as a fail-safe against temporal manipulation. The fact that no trace of their race exists except the Temporal Rotor is disturbing and leads to speculation that they were somehow wiped out by their own device or another time travelling species. Some speculate that the Chronans were eliminated by the Radiance, and that their fate is what the Temporals can expect if the Radiance is victorious, perhaps leading to the erasure of the entire human race from history.\n* The vast, vaulted corridors and rooms of Chronos Station lead one to believe that these creatures were bulky masses about 10-15 feet (3-5m) tall. The lack of stairs implies that the creatures were legless, but that could just be a comfort or aesthetic choice."),
            ":Radiance",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Radiance", ":image", "DistantFuture/Radiance.png", ":reference", "* The goal of the Radians remains a mystery, but they appear to want everyone throughout time to live as they do in a totally regimented, completely predictable society. This goal is obviously, hopelessly unattainable. To devote the entire resources and enegies of one's race and culture to an unattainable outcome must be called madness. Among humans, it is a common fantasy to 'rule the world', 'rule the galaxy', or 'rule the universe'. These pipedreams are almost always the stuff of fiction and fantasy, 	designed to entertain. Those who have taken them seriously are regarded as madmen. Now imagine even fantasizing about 'ruling every point in time in every dimension'. The very concept is laughable, yet the Radiance takes this seriously and are committed to acheiving it. Despite its insanity, their efforts pose a serious threat to everyone, everywhere, everywhen.", ":summary", "* The Radiance is an enormous energy being of vast power originating from a time near the birth of the universe. It has been content to bask in the fantastic energies of the Big Bang until it perceived the use of time travel. The Radiance is completely committed to what it considers a peacefyl, orderly universe, and the ripples created by time travellers are something it cannot allow.\n* The Radiance can project parts of itself through time and space though it is loath to do so. These projections appear as columns of energy that wield vast destructive power.\n* As a being of pure Order, the Radiance appreciates order and despises chaos of any kind. It prefers authoritarian rule over democracies. It dislikes individual expression, but it does appreciate art and beauty.\n* The Temporals have assumed that the Radiance projections are an entire race of energy creatures instead of a single being and have misinterpreted its name as Raydians.", ":titles", "Raydians")
          )
        ),
        "Temporal Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Temporal Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Time Rotor",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Time Rotor", ":image", "DistantFuture/TimeRotor.jpg", ":reference", "* Eternal Sunshine of the Spotless Mind\n* Flatliners\n* Vortex in Doctor Who credits\n* Time Stranger Anime\n* Time Travel in Terminator Series", ":summary", "* Description - The Temporal Rotor is an amazing device created by a vanished civilization. It is mostly a communication device that can reach into the Temporal Vortex and communicate with the central computer Chronos on the asteroid Babylon. Chronos harnesses the black hole hidden within Bablyon to move the Time Rotor and its operator through time and space. It is perhaps the most powerful device ever created.\n* Activating the Temporal Rotor - When the Temporal Rotor is activated, static electricity begins to build in the area. At full strength the static is dangerous, so travellers should not move to avoid discharge. A glowing field begins to form. Travellers heart rate begins to climb and they have a sudden feeling of intense, unnatural danger and imminent death. Hearts begin to fibrilate and flatline.\n* Entering the Vortex - The travellers blink and become aware that they are in the Vortex. Further, they recognize that they have always been in the Vortex. Every moment of their life remembered as if it just occurred. Only their future remains unseen. Time in the Vortex has no meaning, so travellers may leave immediately or stay for an eternity before moving on.\n* Leaving the Vortex - Leaving is just as traumatic as entering. As the Temporal Rotor slows, the travellers begin to forget all that they have just remembered. It is like losing one's mind bit by bit. They feel torn apart and incomplete. Soon they start losing coherent thought, their minds becoming simple and primal. Their senses and desires become simple: Food, Sex, Fear, Violence, Warmth ... Food, Fear, Violence, Warmth ... Food, Warmth ... Warmth. All is dark, wet, and warm as it has always been. Soft, pink bubbles surround and comfort you. You have no wants. You are complete. Suddenly a bright light blinds you, and happiness and security are torn from you. And there is pain, pain where there never was pain before. Waves of burning pain crush you, chew you up, and spit you out. You lie on the ground, cold and in shock. A new pressure builds in your chest, and without thinking you gasp and take in your first breath. Your eyes open to see the last lights on the Temporal Rotor wink out. You are coverered in a heavy, red jelly like congealed blood. The jelly quickly dries to dust and disappears. You rise and feel healthier than ever before. Old wounds and scars are gone as if they never were, and you are different: your skin, your teeth, your hair, your language all are as if you were born and lived your life in this time and place. Your equipment is gone and your clothes have been replaced with simple native garb: a gift from Chronos.", ":height", "1.5m", ":width", ".2m"),
            ":Timefighter",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Timefighter")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_unique_aliens
   * @return {chapter}
   */
  static t_chapter_unique_aliens = {
    vx_type: vx_core.t_type
  }
  static e_chapter_unique_aliens = {
    vx_type: nx_tactics_books_science_fiction.t_chapter_unique_aliens
  }

  // (func chapter_unique_aliens)
  static f_chapter_unique_aliens() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Unique Aliens",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Alien Life Forms",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Alien Life Forms",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Arachnid",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Arachnid", ":reference", "Starship Troopers", ":titles", "Bug"),
            ":Blob",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Blob"),
            "Puppet Master",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Puppet Master"),
            "Thing from another World",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Thing from another World")
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
    vx_type: nx_tactics_books_science_fiction.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Science Fiction",
      ":image",
      "Future.jpg",
      ":chaptermap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_chaptermap},
        "Science Fiction Overview",
        nx_tactics_books_science_fiction.f_chapter_science_fiction_overview(),
        "Archetypes",
        nx_tactics_books_science_fiction.f_chapter_archetypes(),
        "Alternate Realties",
        nx_tactics_books_science_fiction.f_chapter_alternate_realties(),
        "Alien / Predator",
        nx_tactics_books_science_fiction.f_chapter_alien___predator(),
        "Battlestar Galactica",
        nx_tactics_books_science_fiction.f_chapter_battlestar_galactica(),
        "Doctor Who",
        nx_tactics_books_science_fiction.f_chapter_doctor_who(),
        "Robotech",
        nx_tactics_books_science_fiction.f_chapter_robotech(),
        "Space Cruiser Yamato",
        nx_tactics_books_science_fiction.f_chapter_space_cruiser_yamato(),
        "Space Opera",
        nx_tactics_books_science_fiction.f_chapter_space_opera(),
        "Star Trek",
        nx_tactics_books_science_fiction.f_chapter_star_trek(),
        "Star Wars",
        nx_tactics_books_science_fiction.f_chapter_star_wars(),
        "Time Travellers",
        nx_tactics_books_science_fiction.f_chapter_time_travellers(),
        "Unique Aliens",
        nx_tactics_books_science_fiction.f_chapter_unique_aliens()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_alien___predator": nx_tactics_books_science_fiction.e_chapter_alien___predator,
      "chapter_alternate_realties": nx_tactics_books_science_fiction.e_chapter_alternate_realties,
      "chapter_archetypes": nx_tactics_books_science_fiction.e_chapter_archetypes,
      "chapter_battlestar_galactica": nx_tactics_books_science_fiction.e_chapter_battlestar_galactica,
      "chapter_doctor_who": nx_tactics_books_science_fiction.e_chapter_doctor_who,
      "chapter_robotech": nx_tactics_books_science_fiction.e_chapter_robotech,
      "chapter_science_fiction_overview": nx_tactics_books_science_fiction.e_chapter_science_fiction_overview,
      "chapter_space_cruiser_yamato": nx_tactics_books_science_fiction.e_chapter_space_cruiser_yamato,
      "chapter_space_opera": nx_tactics_books_science_fiction.e_chapter_space_opera,
      "chapter_star_trek": nx_tactics_books_science_fiction.e_chapter_star_trek,
      "chapter_star_wars": nx_tactics_books_science_fiction.e_chapter_star_wars,
      "chapter_time_travellers": nx_tactics_books_science_fiction.e_chapter_time_travellers,
      "chapter_unique_aliens": nx_tactics_books_science_fiction.e_chapter_unique_aliens,
      "tacticsbook": nx_tactics_books_science_fiction.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_alien___predator": nx_tactics_books_science_fiction.t_chapter_alien___predator,
      "chapter_alternate_realties": nx_tactics_books_science_fiction.t_chapter_alternate_realties,
      "chapter_archetypes": nx_tactics_books_science_fiction.t_chapter_archetypes,
      "chapter_battlestar_galactica": nx_tactics_books_science_fiction.t_chapter_battlestar_galactica,
      "chapter_doctor_who": nx_tactics_books_science_fiction.t_chapter_doctor_who,
      "chapter_robotech": nx_tactics_books_science_fiction.t_chapter_robotech,
      "chapter_science_fiction_overview": nx_tactics_books_science_fiction.t_chapter_science_fiction_overview,
      "chapter_space_cruiser_yamato": nx_tactics_books_science_fiction.t_chapter_space_cruiser_yamato,
      "chapter_space_opera": nx_tactics_books_science_fiction.t_chapter_space_opera,
      "chapter_star_trek": nx_tactics_books_science_fiction.t_chapter_star_trek,
      "chapter_star_wars": nx_tactics_books_science_fiction.t_chapter_star_wars,
      "chapter_time_travellers": nx_tactics_books_science_fiction.t_chapter_time_travellers,
      "chapter_unique_aliens": nx_tactics_books_science_fiction.t_chapter_unique_aliens,
      "tacticsbook": nx_tactics_books_science_fiction.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/science_fiction",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_alien___predator)
    nx_tactics_books_science_fiction.t_chapter_alien___predator['vx_value'] = {
      name          : "chapter_alien___predator",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_alien___predator
    }

    // (func chapter_alternate_realties)
    nx_tactics_books_science_fiction.t_chapter_alternate_realties['vx_value'] = {
      name          : "chapter_alternate_realties",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_alternate_realties
    }

    // (func chapter_archetypes)
    nx_tactics_books_science_fiction.t_chapter_archetypes['vx_value'] = {
      name          : "chapter_archetypes",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_archetypes
    }

    // (func chapter_battlestar_galactica)
    nx_tactics_books_science_fiction.t_chapter_battlestar_galactica['vx_value'] = {
      name          : "chapter_battlestar_galactica",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_battlestar_galactica
    }

    // (func chapter_doctor_who)
    nx_tactics_books_science_fiction.t_chapter_doctor_who['vx_value'] = {
      name          : "chapter_doctor_who",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_doctor_who
    }

    // (func chapter_robotech)
    nx_tactics_books_science_fiction.t_chapter_robotech['vx_value'] = {
      name          : "chapter_robotech",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_robotech
    }

    // (func chapter_science_fiction_overview)
    nx_tactics_books_science_fiction.t_chapter_science_fiction_overview['vx_value'] = {
      name          : "chapter_science_fiction_overview",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_science_fiction_overview
    }

    // (func chapter_space_cruiser_yamato)
    nx_tactics_books_science_fiction.t_chapter_space_cruiser_yamato['vx_value'] = {
      name          : "chapter_space_cruiser_yamato",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_space_cruiser_yamato
    }

    // (func chapter_space_opera)
    nx_tactics_books_science_fiction.t_chapter_space_opera['vx_value'] = {
      name          : "chapter_space_opera",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_space_opera
    }

    // (func chapter_star_trek)
    nx_tactics_books_science_fiction.t_chapter_star_trek['vx_value'] = {
      name          : "chapter_star_trek",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_star_trek
    }

    // (func chapter_star_wars)
    nx_tactics_books_science_fiction.t_chapter_star_wars['vx_value'] = {
      name          : "chapter_star_wars",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_star_wars
    }

    // (func chapter_time_travellers)
    nx_tactics_books_science_fiction.t_chapter_time_travellers['vx_value'] = {
      name          : "chapter_time_travellers",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_time_travellers
    }

    // (func chapter_unique_aliens)
    nx_tactics_books_science_fiction.t_chapter_unique_aliens['vx_value'] = {
      name          : "chapter_unique_aliens",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_chapter_unique_aliens
    }

    // (func tacticsbook)
    nx_tactics_books_science_fiction.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/science_fiction",
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
      fn            : nx_tactics_books_science_fiction.f_tacticsbook
    }

  }
}
