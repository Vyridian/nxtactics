'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_giant_monsters {

  /**
   * @function chapter_daikaiju
   * @return {chapter}
   */
  static t_chapter_daikaiju = {
    vx_type: vx_core.t_type
  }
  static e_chapter_daikaiju = {
    vx_type: nx_tactics_books_giant_monsters.t_chapter_daikaiju
  }

  // (func chapter_daikaiju)
  static f_chapter_daikaiju() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Daikaiju",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Human Forces",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Human Forces",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Bombers",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bombers"
            ),
            ":Helicopters",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Helicopters"
            ),
            ":Fighters",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Fighters",
              ":image",
              "Modern/FighterToken.png"
            ),
            ":Tanks",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Tanks",
              ":image",
              "Modern/TankToken.png"
            ),
            "Mobile Missile Launchers",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mobile Missile Launchers",
              ":image",
              "Modern/MobileMissileToken.png"
            ),
            ":Missiles",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Missiles",
              ":image",
              "Modern/MissilesToken.png"
            ),
            "Dimension Tide",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dimension Tide",
              ":image",
              "Daikaiju/DimensionTide.png",
              ":summary",
              "* Creates a dimensional hole the size of a building.  For the next few seconds, all matter nearby is sucked into\nthe hole (presumably never to return).  No one knows where the matter goes, but it is known that after the\ndimension tide passed a dimensional disturbance remained through which a creature passed onto our world."
            ),
            "Type 66 Maser Cannon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Type 66 Maser Cannon",
              ":image",
              "Daikaiju/MaserCannonToken.png",
              ":mass",
              "80tons",
              ":height",
              "6m",
              ":length",
              "15m"
            ),
            "Super X",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Super X",
              ":image",
              "Daikaiju/SuperXToken.png",
              ":summary",
              "* Flight at mach 1\n* Cadmium Missiles\n* Laser Cannons\n* equipped with a wide variety of missiles\n* heat resistant layer",
              ":mass",
              "150tons",
              ":height",
              "11m",
              ":length",
              "27m"
            ),
            "Super X-II",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Super X-II",
              ":image",
              "Daikaiju/SuperX2.png"
            ),
            "Super X-III",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Super X-III",
              ":image",
              "Daikaiju/SuperX3Token.png",
              ":summary",
              "Flight at mach 1.7; can fire a Freezer Beam; equipped with Cadmium Missiles; heat resistant layer",
              ":mass",
              "220tons",
              ":height",
              "7.4m",
              ":length",
              "38.5m",
              ":width",
              "58.7m"
            )
          )
        ),
        "Allied Monsters",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Allied Monsters",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Gamera",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gamera",
              ":image",
              "Daikaiju/GameraToken.png",
              ":summary",
              "* Flight at Mach 3.5 using rockets contained in limbs\n* Plasma fireballs\n* Elbow claws\n* Can open plates in his chest and fire a Mana Blast\n* Can swim at 180 knots\n* Burrowing ability\n* Able to absorb and manipulate fire\n* Can draw more power by establishing a link with a human host\n* Orign - Believed to be over 150 million years old and created by an ancient civilization as a guardian of the Earth.\n* Armor - So tough that it survived the shock of a nuclear weapon.",
              ":mass",
              "120tons",
              ":height",
              "80m"
            ),
            "Mecha King Ghidorah",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mecha King Ghidorah",
              ":image",
              "Daikaiju/MechaKingGhidorahToken.png",
              ":summary",
              "Antigravity flight at mach 4; able to fire Gravity beams from its mouths on the left and right head; can fire a Laser Triple beam from the central head; equipped with Godzilla Capture Cables and the large Machine Hand restraint that can also discharge electricity",
              ":mass",
              "80ktons",
              ":length",
              "140m"
            ),
            ":Mechagodzilla",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mechagodzilla",
              ":image",
              "Daikaiju/MechaGodzillaToken.png",
              ":summary",
              "Flight at mach 2; Mega-Buster ray from mouth; paralysis missiles; Super Heat Shield NT-20, laser beam eyes; Plasma Grenade that fires energy absorbed by the Super Heat Shield; 'G-Crusher;' shock anchors and cables; dual Garuda shoulder mounted laser cannons",
              ":mass",
              "150ktons",
              ":length",
              "120m"
            ),
            ":Mogera",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mogera",
              ":image",
              "Daikaiju/MogeraToken.png",
              ":summary",
              "Flight at mach 1; can travel through space at mach 44; able to fire Plasma Laser Cannons from eyes; equipped with a rotating drill for a nose; able to fire a beam from its chest; can launch Spiral Grenade missiles from its hands; has treads under feet for faster movement on land; able to fire lasers from its two hands; can separate into the Star Falcon and Land Moguera",
              ":mass",
              "160ktons",
              ":height",
              "120m"
            ),
            ":Mothra",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mothra",
              ":image",
              "Daikaiju/MothraToken.png",
              ":summary",
              "* Flight at mach 3\n* can travel through space\n* hurricane winds from wings\n* antenna ray-shooting beams\n* can release powder from her wings that will reflect energy attacks back on their source\n* able to conduct energy through its touch or release it as strands of lightning from her wings",
              ":mass",
              "20ktons",
              ":length",
              "65m"
            ),
            "Mothra, Larva",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mothra, Larva",
              ":image",
              "Daikaiju/MothraLarvaeToken.png",
              ":summary",
              "Web Attack",
              ":mass",
              "15ktons",
              ":length",
              "120m"
            )
          )
        ),
        "Enemy Monsters",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Enemy Monsters",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Battra",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Battra",
              ":image",
              "Daikaiju/BattraToken.png",
              ":summary",
              "Flight at mach 3; can travel through space; hurricane winds from wings; able to shoot Prism beams from eyes; can conduct energy through its touch",
              ":mass",
              "30ktons",
              ":length",
              "73m"
            ),
            "Battra, Larva",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Battra, Larva",
              ":image",
              "Daikaiju/BattraLarvaeToken.png",
              ":summary",
              "Burrowing ability; adept swimmer; able to shoot Prism beams from horn and eyes; body can generate energy pulses to attack others with its touch",
              ":mass",
              "20ktons",
              ":length",
              "90m"
            ),
            ":Biollante",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Biollante",
              ":image",
              "Daikaiju/Biollante.png"
            ),
            ":Destroyah",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Destroyah",
              ":image",
              "Daikaiju/Destroyah.png"
            ),
            ":Godzilla",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Godzilla",
              ":image",
              "Daikaiju/GodzillaToken.png",
              ":summary",
              "* Superheated atomic breath capable of devastating whole city blocks\n* Remarkably fast regenerative healing factor\n* Incredibly strong, even for his size\n* Able to swim at 40 knots\n* Though extremely powerful, possesses a few weaknesses: has an aversion to electricity, can be weakened by massive amounts of cadmium and other radiation-retardants",
              ":mass",
              "60ktons",
              ":height",
              "100m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Radiation Powers",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Radiation Powers",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Radiation Beam",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Radiation Beam"
                    ),
                    "Radiation Blast",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Radiation Blast"
                    )
                  )
                )
              )
            ),
            ":Gyaos",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gyaos",
              ":image",
              "Daikaiju/GyaosToken.png",
              ":summary",
              "* Flight at mach 4.2\n* Hurricane winds from wings\n* A shrill cry serves as an ultrasonic scalpel which amounts to approximately 3 million Hz, and can also cut\nthrough solid steel bards with a thickness of 30cm.\n* Can reproduce asexually\n* Gyoas easily adapts to its surroundings, growing exponentially in size.\n* Gyaos has one absolutely perfect pair of chromosomes.\n* Origin - Gyaos was the product of genetic engineering by a super-ancient civilization.\n* Vision - As a nocturnal creature, Gyaos avoids and dislikes light.",
              ":mass",
              "75tons",
              ":height",
              "85m",
              ":width",
              "185m"
            ),
            "King Ghidorah",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "King Ghidorah",
              ":image",
              "Daikaiju/KingGhidorahToken.png",
              ":summary",
              "* Speed Mach 3\n* Able to fire Gravity beams from its mouths\n* hurricane winds from wings\n* constricting necks",
              ":mass",
              "70ktons",
              ":height",
              "140m"
            ),
            ":Legion",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Legion",
              ":image",
              "Daikaiju/LegionToken.png",
              ":reference",
              "And he asked him, What is thy name? And he answered, saying, My name is Legion: for we are many. - New Testament - Mark 5:9",
              ":summary",
              "* Silicone-based life form with cell structure like transistors\n* Joints operate by pressurized gas.\n* Communicates via electromagnetic waves\n* Launches seeds into orbit by generating a high oxygen area and then detonating it.\nFlight at mach 1; sharp horn, which can open to fire a beam; horn generates a tremendous amount of heat after firing; can burrow and travel, underground, at a speed of 50 kilometers an hour; able to produce up to 100 Symbiotic Legion an hour; can create a magnetic force shield to protect the front of its body using the ten smaller legs near its head; if its horn is destroyed Legion can fire off strands of energy that are able to pierce and burn objects\nEye: Legion can see electro-magnetic activity.\nVoice: The Legion Mother's microwave blast, which eminates from her huge tusks is powerful enough to vaporize a type-90 tank with one blow.\nOvaries: Legion's ovaries house a hive of countless soldiers that can be ordered to attack instantly. It is estimated that she can reproduce approximately 100 soldiers every hour.\nAppendages: Legion's many appendages are used in both battle and burrowing; while they quickly assist in breaking up even the toughest earth, these deadly arms were seen puncturing Gamera's shell.\nArmored Exoskeleton: Made of a hard silicone-like resin, Legion's exo-skeleton is not only an insulator but protects her body from attacks.\nInterference wave-blast: Generated in the shape of a parabola, it acts as a shield. Legion was seen disabling the automatic targeting system of missles with this abilaity.",
              ":mass",
              "600tons",
              ":height",
              "140m"
            ),
            ":Megaguirus",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Megaguirus",
              ":image",
              "Daikaiju/MegaguirusToken.png",
              ":summary",
              "Flight at mach 4; hurricane winds and sonic waves from wings; claws; stinger with the ability to drain power; claw tipped wings; able to use stinger to discharge a blast of energy comprised of its opponent's beam weapon which it absorbed; flight causes electronic disturbances",
              ":mass",
              "12ktons",
              ":length",
              "50m"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_giant_robots
   * @return {chapter}
   */
  static t_chapter_giant_robots = {
    vx_type: vx_core.t_type
  }
  static e_chapter_giant_robots = {
    vx_type: nx_tactics_books_giant_monsters.t_chapter_giant_robots
  }

  // (func chapter_giant_robots)
  static f_chapter_giant_robots() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Giant Robots",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Allied Robots",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Allied Robots",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Getter 1",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Getter 1",
              ":image",
              "Daikaiju/Getter_1.png",
              ":summary",
              "* Swimming: 18knots\n* Flight: Mach 2",
              ":speed",
              "420kph",
              ":mass",
              "220tons",
              ":height",
              "38m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* Getter Beam\n* Tomahawk Boomerang",
                  ":level",
                  "5"
                )
              )
            ),
            "Getter 2",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Getter 2",
              ":image",
              "Daikaiju/Getter_2.png",
              ":summary",
              "* Swimming: 18knots\n* Ground Speed: Mach 3!\n* Tunnelling: 300kph",
              ":speed",
              "420kph",
              ":mass",
              "220tons",
              ":height",
              "38m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* Getter Drill\n* Drill Missile",
                  ":level",
                  "5"
                )
              )
            ),
            "Getter 3",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Getter 3",
              ":image",
              "Daikaiju/Getter_3.png",
              ":summary",
              "* Swimming: 28knots\n* Flight: Mach 3",
              ":speed",
              "150kph",
              ":mass",
              "220tons",
              ":height",
              "20m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* Getter Missile",
                  ":level",
                  "5"
                )
              )
            ),
            "Getter G Dragon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Getter G Dragon",
              ":image",
              "Daikaiju/GetterG_Dragon.png",
              ":summary",
              "* Flight: Mach 3.5",
              ":mass",
              "330tons",
              ":height",
              "50m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* Getter Beam\n* Double Tomahawk Boomerang",
                  ":level",
                  "5"
                )
              )
            ),
            "Getter G Liger",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Getter G Liger",
              ":image",
              "Daikaiju/GetterG_Liger.png",
              ":summary",
              "* Swimming: 18knots\n* Flight: Mach 2\n* Ground Speed: Mach 3!\n* Tunnelling: 800kph",
              ":mass",
              "330tons",
              ":height",
              "50m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* Liger Missile",
                  ":level",
                  "5"
                )
              )
            ),
            "Getter G Poseidon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Getter G Poseidon",
              ":image",
              "Daikaiju/GetterG_Poseidon.png",
              ":mass",
              "330tons",
              ":height",
              "40m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* Finger Net\n* Strong Missile\n* Getter Cyclone",
                  ":level",
                  "5"
                )
              )
            ),
            "Great Mazinger",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Great Mazinger",
              ":image",
              "Daikaiju/GreatMazinger.png",
              ":summary",
              "* Swimming: 25knots\n* Flight: Mach 4 (Mach 5 w/Great Booster)\n* Ceiling: 50km\n* Jump: 30m\n* Dive Depth: 8km",
              ":speed",
              "450kph",
              ":mass",
              "32tons",
              ":height",
              "25m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* Navel Missile\n* Atomic Punch\n* Great Boomerang\n* Scramble Cutter - Attack with Great Booster\n* Great Typhoon\n* Breast Burn\n* Thunder Break",
                  ":level",
                  "5"
                )
              )
            ),
            ":Grendizer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Grendizer",
              ":image",
              "Daikaiju/Grendizer.png"
            ),
            "Mazinger Z",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mazinger Z",
              ":image",
              "Daikaiju/MazingerZ.png",
              ":summary",
              "* Swimming: 20knots\n* Flight: Mach 3 w/Jet Scrander",
              ":speed",
              "360kph",
              ":mass",
              "20tons",
              ":height",
              "18m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "Koushiryoku Beam\nMazinger Z can channel pure Photonic Energy through its eyes, unleashing a pair of powerful lasers, which are said to be equal to 10 tons of explosives. This was originally considered Mazinger Z's weakest attack, however, in Shin Mazinger the power of this attacked is greatly magnified to the point where it can now be considered the strongest.\nMissile Punch\nMazinger Z mounts a missile launch bay in its belly, which can store several missiles.\nRocket Punch\nMazinger Z's eponymous attack; it fires off its forearm like a missile, punching straight through an enemy before returning and docking with the elbow again.\nRust Hurricane\nThe powerful turbines in Mazinger Z's head create gale-force winds, launching them through the mouth grill. The attack includes highly corrosive particles (thought to be ionized hydrogen), almost instantaneously causing an enemy to rust over and fall apart.\nBreast Fire\nThe large red fins on Mazinger Z's chest act as heat sinks for its Photonic Energy reactor. Mazinger Z can fire off this stored thermal energy as a powerful, 30,000 degree white-hot beam that melts almost anything. In the Super Robot Wars series, Kouji and Tetsuya Tsurugi can use the Breast Fire and Breast Burn respectively in the Double Burning Fire attack, which they use in the MX version of the Final Dynamic Special (also involving Grendizer and a Getter).\nKyoukagata Rocket Punch\nMazinger Z's Rocket Punch was later reinforced with stronger armor, giving it a more powerful punch.\nIron Cutter\nAn improved Rocket Punch in which the forearm sprouts a pair of axe-like blades, allowing it to cut and slash as well as bludgeon. This is the only weapon in Mazinger Z:s arsenal which can damage Super-alloy Z.\nDrill Missile\nA barrage of small, needle-like missiles fired from ports in Mazinger's upper arms. This attack was typically performed after the Rocket Punch but before the forearm had returned.\nDaisharin Rocket Punch\nMazinger Z spins its arms rapidly, building up momentum before firing off both fists in standard Rocket Punch fashion.\nReitou Beam\nMazinger unleashes a blast of intense cold; this attack was alternately fired from the mouth grill or the spikes on the sides of Mazinger's head.\nFinger Missile\nA rarely-used attack where Mazinger fires the last joint of its fingers as miniature missiles.",
                  ":level",
                  "5"
                )
              )
            ),
            ":Raideen",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Raideen",
              ":image",
              "Daikaiju/Raideen.png",
              ":summary",
              "Flight: Mach 10 in God Bird form",
              ":mass",
              "350tons",
              ":height",
              "52m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* God Missile\n* God Arrow",
                  ":level",
                  "5"
                )
              )
            ),
            ":Voltron",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Voltron",
              ":image",
              "Daikaiju/Voltron.png",
              ":mass",
              "700tons",
              ":height",
              "60m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "* Wing Boomerang - Boomerang attack from the wings of GoLion.\n* Space Cutter - Spinning Blades.\n* Eye Flash - Beams fired from the eyes of GoLion.\n* Hurricane Attack - Wind attack similar to Daimos Blizzard, but not as strong.\n* Laser Magnum - Laser-like bullets fired from the mouth of the Green Lion.\n* Fire Tornado - A burst of flame emits from the mouth of the Red Lion.\n* Cross Beam - Cross-shaped boomerang fired from the chest.\n* Gatling Missiles - Small missiles fired from the legs.\n* Electromagnetic Lance - Weapon used as a spear at times.\n* Foot Missile - Missiles fired from the mouths of the Blue and Yellow Lions.\n* Four Lion Attack - The 'Lion Head Attack' 100-Ton Punch.\n* Grand Fire - A stream of flames fired from the mouths of the Blue and Yellow Lions",
                  ":level",
                  "5"
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
   * @function chapter_overview
   * @return {chapter}
   */
  static t_chapter_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_overview = {
    vx_type: nx_tactics_books_giant_monsters.t_chapter_overview
  }

  // (func chapter_overview)
  static f_chapter_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics:Giant Monsters?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics:Giant Monsters?"
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
    vx_type: nx_tactics_books_giant_monsters.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Giant Monsters",
      ":image",
      "GiantMonsters.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Overview",
        nx_tactics_books_giant_monsters.f_chapter_overview(),
        "Daikaiju",
        nx_tactics_books_giant_monsters.f_chapter_daikaiju(),
        "Giant Robots",
        nx_tactics_books_giant_monsters.f_chapter_giant_robots()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_daikaiju": nx_tactics_books_giant_monsters.e_chapter_daikaiju,
      "chapter_giant_robots": nx_tactics_books_giant_monsters.e_chapter_giant_robots,
      "chapter_overview": nx_tactics_books_giant_monsters.e_chapter_overview,
      "tacticsbook": nx_tactics_books_giant_monsters.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_daikaiju": nx_tactics_books_giant_monsters.t_chapter_daikaiju,
      "chapter_giant_robots": nx_tactics_books_giant_monsters.t_chapter_giant_robots,
      "chapter_overview": nx_tactics_books_giant_monsters.t_chapter_overview,
      "tacticsbook": nx_tactics_books_giant_monsters.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/giant_monsters",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_daikaiju)
    nx_tactics_books_giant_monsters.t_chapter_daikaiju['vx_value'] = {
      name          : "chapter_daikaiju",
      pkgname       : "nx/tactics/books/giant_monsters",
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
      fn            : nx_tactics_books_giant_monsters.f_chapter_daikaiju
    }

    // (func chapter_giant_robots)
    nx_tactics_books_giant_monsters.t_chapter_giant_robots['vx_value'] = {
      name          : "chapter_giant_robots",
      pkgname       : "nx/tactics/books/giant_monsters",
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
      fn            : nx_tactics_books_giant_monsters.f_chapter_giant_robots
    }

    // (func chapter_overview)
    nx_tactics_books_giant_monsters.t_chapter_overview['vx_value'] = {
      name          : "chapter_overview",
      pkgname       : "nx/tactics/books/giant_monsters",
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
      fn            : nx_tactics_books_giant_monsters.f_chapter_overview
    }

    // (func tacticsbook)
    nx_tactics_books_giant_monsters.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/giant_monsters",
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
      fn            : nx_tactics_books_giant_monsters.f_tacticsbook
    }

  }
}
