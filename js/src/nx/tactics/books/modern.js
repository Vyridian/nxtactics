'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_modern {

  /**
   * @function chapter_cold_war
   * @return {chapter}
   */
  static t_chapter_cold_war = {
    vx_type: vx_core.t_type
  }
  static e_chapter_cold_war = {
    vx_type: nx_tactics_books_modern.t_chapter_cold_war
  }

  // (func chapter_cold_war)
  static f_chapter_cold_war() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Cold War",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "American Aircraft",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "American Aircraft",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "A-10 Warthog",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "A-10 Warthog",
              ":classification",
              "Lt. Aircraft",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "4",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "30mm GAU-8 Avenger",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "30mm GAU-8 Avenger"
                    )
                  )
                )
              )
            ),
            "AH-1 Cobra",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "AH-1 Cobra",
              ":image",
              "Modern/American_Helicopter_Cobra.png",
              ":summary",
              "2x 7.62mm Miniguns\n2x 7-round 70mm Rocket Pods\n20mm XM195 Vulcan Cannon",
              ":speed",
              "350kph",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "2",
              ":mass",
              "4tons",
              ":height",
              "4m",
              ":length",
              "13m",
              ":range",
              "570km"
            ),
            "Candy Bomber",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Candy Bomber",
              ":classification",
              "Hvy. Aircraft"
            ),
            "UH-1 Iroquois (Huey)",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "UH-1 Iroquois (Huey)",
              ":image",
              "Modern/American_Helicopter_Huey.png",
              ":summary",
              "2x 7.62mm M60 Machine Gun\n2x 7-round 70mm Rocket Pods",
              ":speed",
              "200kph",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1+14",
              ":mass",
              "4tons",
              ":height",
              "4m",
              ":length",
              "17m",
              ":width",
              "3m"
            ),
            "SR-71 Blackbird",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "SR-71 Blackbird",
              ":image",
              "Modern/American_SpyPlane_SR71Blackbird.png",
              ":classification",
              "Hvy. Aircraft"
            )
          )
        ),
        "American Ground Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "American Ground Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "M46 Patton",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "M46 Patton",
              ":summary",
              "* An improved Pershing sometimes called Pershing II, was used extensively in Korean War.\n* 90mm Cannon",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "4"
                )
              )
            ),
            "M48 Patton",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "M48 Patton",
              ":summary",
              "* A completely redesigned Pershing based Vietnam Era Tank\n4 Gunnery\n105mm Cannon\nArmor\n120mm\n.50 cal MG\n7.62mm MG",
              ":mass",
              "50tons",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "4"
                )
              )
            )
          )
        ),
        "American Missles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "American Missles",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":ICBM",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "ICBM"
            ),
            "Polaris Submarine Missile",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Polaris Submarine Missile"
            )
          )
        ),
        "British Ground Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "British Ground Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "QF 20 Pounder",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "QF 20 Pounder"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_cops_and_robbers
   * @return {chapter}
   */
  static t_chapter_modern_cops_and_robbers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_cops_and_robbers = {
    vx_type: nx_tactics_books_modern.t_chapter_modern_cops_and_robbers
  }

  // (func chapter_modern_cops_and_robbers)
  static f_chapter_modern_cops_and_robbers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Cops and Robbers",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Modern Government",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Government",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Administrator",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Administrator"
            ),
            "ATF Agent",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "ATF Agent"
            ),
            ":Congressman",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Congressman"
            ),
            "DEA Agent",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "DEA Agent"
            ),
            ":Diplomat",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Diplomat",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Communications",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Communications",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    ":Negotiation",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Negotiation"
                    ),
                    ":Politics",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Politics"
                    )
                  )
                )
              )
            ),
            "FBI Agent",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "FBI Agent"
            ),
            ":Monarch",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Monarch"
            ),
            ":Noble",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Noble",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Influence",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Influence"
                )
              )
            ),
            ":Senator",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Senator"
            )
          )
        ),
        "Modern Police",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Police",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Police Officer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Police Officer",
              ":titles",
              "Beat Cop, Pig (derogatory), Thin Blue Line"
            ),
            ":Detective",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Detective"
            ),
            "Forensics Investigator",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Forensics Investigator"
            ),
            "Internal Affair Agent",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Internal Affair Agent"
            ),
            ":S.W.A.T.",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "S.W.A.T."
            )
          )
        ),
        "Modern Criminals",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Criminals",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Armed Robber",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Armed Robber"
            ),
            ":Informant",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Informant"
            ),
            "Purse Snatcher",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Purse Snatcher"
            ),
            "Serial Killer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Serial Killer"
            )
          )
        ),
        "Modern Crime Gangs",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Crime Gangs",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Mafia",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mafia"
            ),
            "Tong Gangs",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Tong Gangs",
              ":summary",
              "Tongs are local street gangs."
            ),
            ":Triads",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Triads",
              ":summary",
              "The Triads are like the [Yakuza] offering protection to the locals.  This protection normally comes in the form of crushing the competition on the triad's businesses.  Unlike the [Yakuza], the triads deal in slavery and are more open in their illegal dealings.  Enforcement is very brutal."
            ),
            ":Yakuza",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Yakuza",
              ":summary",
              "Besides weapons and drugs, the Yakuza are the neighborhood protection in many areas and do so far more efficiently than the police. Contrary to the attitudes protrayed in Hollywood, the Yakuza make justice swift and fair for the people they deal with. It has done this way for longer than the United States has been around. The Yakuza is not about random violence and mayhem. It is about order and discipline. Of course, many of the younger members have cast aside traditions and have become violent thugs. Like the Triads, the Yakuza was originally a response to the feudal lords when those who were not samurai had no rights or safety."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_ground_vehicles
   * @return {chapter}
   */
  static t_chapter_modern_ground_vehicles = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_ground_vehicles = {
    vx_type: nx_tactics_books_modern.t_chapter_modern_ground_vehicles
  }

  // (func chapter_modern_ground_vehicles)
  static f_chapter_modern_ground_vehicles() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Ground Vehicles",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Modern Cycles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Cycles"
        ),
        "Modern Cars",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Cars",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Compact",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Compact",
              ":image",
              "Modern/Civilian_Compact.png"
            ),
            "Luxury Sedan",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Luxury Sedan"
            ),
            ":Minivan",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Minivan",
              ":image",
              "Modern/Civilian_Minivan.png"
            ),
            ":Sedan",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sedan",
              ":image",
              "Modern/Civilian_Sedan.png"
            ),
            "Sports Car",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sports Car",
              ":image",
              "Modern/Civilian_SportsCar.png"
            ),
            ":Subcompact",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Subcompact",
              ":titles",
              "Econobox"
            ),
            "Station Wagon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Station Wagon",
              ":image",
              "Modern/Civilian_StationWagon.png"
            )
          )
        ),
        "Modern Trucks",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Trucks",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Armored Car",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Armored Car",
              ":summary",
              "* RWD. 200 hp engine [20], 20 gallon tank [4], driver, gunner, SR 6, TS 80, AC 4 (max 8), 16 mpg @65.\nFP Armor: F30, L30, R30, B30, T30, U20. Cargo 200 cf. Max load 2000 lb. $70,000, 8500 lb."
            ),
            ":HummVee",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "HummVee"
            ),
            ":Jeep",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Jeep"
            ),
            "Land Cruiser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Land Cruiser"
            ),
            "Pickup Truck",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pickup Truck",
              ":image",
              "Modern/Civilian_PickupTruck.png",
              ":summary",
              "* Same as Sport Utility except: two to three passengers. Cargo 160 cf. Max load 1000-3000 lb. $20,000 3300 lb."
            ),
            "Sport Utility",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sport Utility",
              ":image",
              "Modern/Civilian_SUV.png",
              ":summary",
              "* RWD or AWD with around 180 hp, two- or four-door with two to eight passengers.  SR 6, TS 110, AC 6 (max 10), 18 mpg@65. Cargo 20-70 cf. Max load 500-1000 lb. $30,000 3500 lb."
            ),
            ":Van",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Van"
            )
          )
        ),
        "Modern Heavy Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Heavy Vehicles",
          ":summary",
          "150% Cost, 150% Load, 75% Speed, -1 Handling",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Bus",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bus",
              ":titles",
              "School Bus"
            ),
            "Bus, Luxury",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bus, Luxury",
              ":titles",
              "Charter Bus"
            ),
            ":Backhoe",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Backhoe"
            ),
            "Bobcat Loader",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bobcat Loader"
            ),
            ":Bulldozer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bulldozer"
            ),
            ":Camper",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Camper"
            ),
            "Cargo Truck",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Cargo Truck"
            ),
            "Construction Crane",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Construction Crane"
            ),
            "Dump Truck",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dump Truck"
            ),
            "Garbage Truck",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Garbage Truck"
            ),
            "Giant Dump Truck",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Giant Dump Truck"
            ),
            "Giant Shovel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Giant Shovel"
            ),
            "Recreational Vehicle (RV)",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Recreational Vehicle (RV)"
            ),
            "Tractor Trailer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Tractor Trailer",
              ":summary",
              "* 200 gallon tank, driver, 2 passengers. SR 5.75, TS 125, AC 3 (max 6), 12 mpg@65. No Armor.\nCargo 5000 cf. Max load 30 tons. $300,000, 10 tons.  Tractor trailers use two overlapping vehicle counters."
            )
          )
        ),
        "Modern Police Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Police Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Police Cruiser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Police Cruiser"
            ),
            "SWAT Truck",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "SWAT Truck"
            )
          )
        ),
        "Modern Military Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Military Vehicles",
          ":summary",
          "* Amphibious Vehicles\n* Artillery\n** Light Tank\n** Heavy Tank\n*** Tracked. 2000 hp supercharged engine [70], 120 gallon self-sealing armored tank [20], driver, commander, 2 gunners, 120 mm tank gun [15] in turret (50), MG50 [4] in turret (50), SS [3] front and back (5|5), targeting computer. SR 2, TS 50, AC 3 (max 20), 1 mpg@50. Military-grade Armor: F500, L350, R350, B300, T140, U170. Cargo 10 cf. Max load 4000 lb. $5 million, 40 tons. Each tread has 80 hits. The 120 mm cannon does 25d +\n30 damage, and has a to-hit of 13, but requires one round to reload.\n* Hovertank",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Armored Personal Carrier (APC)",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Armored Personal Carrier (APC)",
              ":summary",
              "* Wheeled. 500 hp engine, 60 gallon selfsealing tank, driver, gunner, MG50 also in turret (50), SS [3] back (5),\nSR 2, TS 50, AC 3 (max 20), 3 mpg@50. Militarygrade Armor: F100, L80, R80, B70, T40, U50.  Cargo 10 soldiers with\nfull gear.  Max load 2000 lb. $250,000, 10 tons."
            )
          )
        ),
        "Modern Trailers",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Trailers"
        ),
        "Modern Hovercraft",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Hovercraft"
        ),
        "Modern Trains",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Trains",
          ":summary",
          "* 150% Cost, 200% Load\n* With a maximum AC of less than one and silly amounts of weight, a train does not stop for anything.  When a\nsteadily moving train collides with a vehicle it does as much damage as the vehicle can take: even a tank would be\ncompletely shattered if a train struck it.  A train is very hard to destroy, also... it would derail before\nactually turning into rubble.",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Armored Boxcar",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Armored Boxcar"
            ),
            "Automobile Cargo Car",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Automobile Cargo Car"
            ),
            ":Boxcar",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Boxcar"
            ),
            ":Caboose",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Caboose"
            ),
            "Dining Car",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dining Car"
            ),
            "Flatbed Car",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Flatbed Car"
            ),
            "Hand Cart",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hand Cart"
            ),
            ":Locomotive",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Locomotive"
            ),
            ":Monorail",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Monorail"
            ),
            "Passenger Car",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Passenger Car"
            ),
            "Sleeping Car",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sleeping Car"
            ),
            ":Streetcar",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Streetcar"
            ),
            "Tanker Car",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Tanker Car"
            ),
            ":Tram",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Tram"
            ),
            "Weapon Mount Car",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Weapon Mount Car"
            )
          )
        ),
        "Modern Snowcraft",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Snowcraft",
          ":summary",
          "* 75% Load, on Snow no Terrain Penalty and 150% Speed, off Snow +1 Terrain Penalty.\n* Icecraft - On Ice no Terrain Penalty and 200% Speed, off Ice cannot move.",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Iceskates",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Iceskates",
              ":summary",
              "* Personal, Unpowered, Icecraft"
            ),
            "Ice sailboat",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ice sailboat",
              ":summary",
              "* Medium, Sail, Icecraft"
            ),
            ":Skis",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Skis",
              ":summary",
              "* Personal, Unpowered, Snowcraft"
            ),
            ":Snowboard",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Snowboard",
              ":summary",
              "* Personal, Unpowered, Snowcraft"
            ),
            ":Snowshoes",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Snowshoes",
              ":summary",
              "* Personal, Unpowered, Snowcraft"
            )
          ),
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Dog Sled",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dog Sled",
              ":summary",
              "* Unpowered, Offroad, Snowcraft"
            ),
            ":Snowmobile",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Snowmobile",
              ":summary",
              "* Offroad, Snowcraft"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_mercenaries
   * @return {chapter}
   */
  static t_chapter_modern_mercenaries = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_mercenaries = {
    vx_type: nx_tactics_books_modern.t_chapter_modern_mercenaries
  }

  // (func chapter_modern_mercenaries)
  static f_chapter_modern_mercenaries() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Mercenaries",
      ":reference",
      "* Blackrock\n* Millenium's End",
      ":summary",
      "Mercenaries\nSmuggling\nSoldiers of Fortune\nVIP Bodyguards",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Black Eagle Security",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Black Eagle Security",
          ":summary",
          "* Black Eagle is a large security firm offering 'specialists for hire'. They maintain a strong reputation for effectiveness, discipline, and discretion. Their fees are high, but they are the gold standard when dealing with critical situations on a moment's notice.\n* Black Eagle is based in Atlanta, Georgia. It maintains branch facilities in Miami, Dubai, the Phillipines, and South Africa.\n* Black Eagle provides contract security teams to guard embassies for major countries. They also can be engaged for\ndeniable covert actions including: smash and grab, target removal, and cyber espianoge.\n* Black Eagle is very careful to maintain deniability in all of its activities. It does not have business cards or\nletter-head or logos. Its personnel are all independent contractors who are always paid by the job, in cash. There is 	always a risk that Black Eagle personnel will be captured, killed, or imprisoned. Black Eagle values loyalty above all\nelse and will go to great lengths to prove itself when its own people get in trouble.\n* The true secret to Black Eagle's success is its information network. The company maintains a large database of 'persons of interest' along with psychological profiles and potential future value. Whenever possible, Black Eagle will trade favors instead of cash. They proactively offer help to key individuals who are in trouble, so they can count on those people for help in the future. Black Eagle has influence among numerous politicians, lobbyists, lawyers, judges, military personnel, police, prison guards, prisoners, criminal informants, as well as numerous ordinary people who serve as their eyes and ears on the street."
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_overview
   * @return {chapter}
   */
  static t_chapter_modern_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_overview = {
    vx_type: nx_tactics_books_modern.t_chapter_modern_overview
  }

  // (func chapter_modern_overview)
  static f_chapter_modern_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Modern Naval Warfare",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Naval Warfare",
          ":summary",
          "* Aircraft Carriers\n* Destroyers\n* Cruisers\n* Torpedo Boats\n* Radar\n* Naval Cannons\n* Stealth Fighters\n* Unmanned Naval Vehicles\n* Nuclear Submarines\n* Attack Submarines"
        ),
        "Modern Aerial Warfare",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Aerial Warfare",
          ":summary",
          "* Jet Planes\n* Stealth Fighters\n* Unmanned Aerial Vehicles (UAV)\n* Air Cavalry\n* Flying Fortress\n* Landing Strips\n* Aircraft Carriers\n* Machine Guns\n* Strafing\n* Tank Killing\n* Stealth Bombing\n* Strategic Bombing\n* Nuclear Bombing\n* Cruise Missiles\n* Fuel Air Explosives\n* Intercontinental Ballistic Missiles (ICBM)"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_space
   * @return {chapter}
   */
  static t_chapter_modern_space = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_space = {
    vx_type: nx_tactics_books_modern.t_chapter_modern_space
  }

  // (func chapter_modern_space)
  static f_chapter_modern_space() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Space",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Modern Space Units",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Space Units",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Astronaut",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Astronaut"
            ),
            "International Space Station",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "International Space Station"
            ),
            "Space Shuttle",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Space Shuttle"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_spies
   * @return {chapter}
   */
  static t_chapter_modern_spies = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_spies = {
    vx_type: nx_tactics_books_modern.t_chapter_modern_spies
  }

  // (func chapter_modern_spies)
  static f_chapter_modern_spies() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Spies",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Spy Units",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Spy Units",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "CIA Agent",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "CIA Agent"
            ),
            "NSA Agent",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "NSA Agent"
            ),
            ":Terrorist",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Terrorist"
            ),
            "Aaron Jorgenson",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Aaron Jorgenson",
              ":summary",
              "* Wealthy Norwegian shipping magnate with subsidiaries in petroleum products, trucking, and pharmaceuticals.\n* He is an ultra-conservative and has served several terms in public office.\n* He was married and divorced (his wife died of natural causes soon after the divorce).\n* He has no heirs or family.\n* At 56, he is also dying of an inoperable brain tumor.\n* His greatest possessions are his fabulous collection of artwork in his luxurious mansion.\n* Personality - Mr. Jorgenson is an arrogant and selfish man. He is a self-made man and believes that the strong deserve to take what they can and that the weak deserve their lot. He idolizes men of action, especially his Viking ancestors. With only a short time left to live, he has dedicated his fortune to a spectacular plan that would make him a modern day Viking."
            ),
            "James Bond",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "James Bond",
              ":summary",
              "* Mr. Bond, you persist in defying my efforts to provide an amusing death for you. - Hugo Drax, Moonraker\n* Do you expect me to talk. No, Mr. Bond. I expect you to die. - Auric Goldfinger and James Bond, Goldfinger",
              ":titles",
              "007"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_sports
   * @return {chapter}
   */
  static t_chapter_modern_sports = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_sports = {
    vx_type: nx_tactics_books_modern.t_chapter_modern_sports
  }

  // (func chapter_modern_sports)
  static f_chapter_modern_sports() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Sports",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Soccer",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Soccer",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Soccer Ball",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Soccer Ball",
              ":image",
              "Modern/Soccer_Ball.png"
            ),
            "Soccer Player (Blue)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Soccer Player (Blue)",
              ":image",
              "Modern/Soccer_PlayerBlue.png"
            ),
            "Soccer Player (Red)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Soccer Player (Red)",
              ":image",
              "Modern/Soccer_PlayerRed.png"
            )
          ),
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Soccer Goal",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Soccer Goal",
              ":image",
              "Units/Modern/Soccer_Goal.png"
            )
          )
        ),
        ":Football",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Football",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Football Field",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Football Field",
              ":image",
              "Units/Modern/Football_Field.jpg"
            )
          ),
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Linebacker (Blue)",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Linebacker (Blue)",
              ":image",
              "Modern/Football_LinebackerBlue.png"
            ),
            "Linebacker (Red)",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Linebacker (Red)",
              ":image",
              "Modern/Football_LinebackerRed.png"
            ),
            "Quarterback (Blue)",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Quarterback (Blue)",
              ":image",
              "Modern/Football_QuarterbackBlue.png"
            ),
            "Quarterback (Red)",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Quarterback (Red)",
              ":image",
              "Modern/Football_QuarterbackRed.png"
            ),
            "Receiver (Blue)",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Receiver (Blue)",
              ":image",
              "Modern/Football_ReceiverBlue.png"
            ),
            "Receiver (Red)",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Receiver (Red)",
              ":image",
              "Modern/Football_ReceiverRed.png"
            )
          )
        ),
        "Underground Sports",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Underground Sports",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Pit Fighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pit Fighter"
            ),
            "Rollerball Player",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Rollerball Player"
            ),
            "Street Fighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Street Fighter"
            )
          )
        ),
        "Other Sports",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Other Sports",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Baseball Player",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Baseball Player"
            ),
            ":Boxer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Boxer"
            ),
            "Hockey Player",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hockey Player"
            ),
            "Ping Pong Player",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ping Pong Player"
            )
          )
        ),
        "Modern Scenarios",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Scenarios",
          ":scenariomap",
          vx_core.f_new(
            nx_tactics_base.t_scenariomap,
            "Boxing Match",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Boxing Match"
            ),
            "Soccer Game",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Soccer Game"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_warfare
   * @return {chapter}
   */
  static t_chapter_modern_warfare = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_warfare = {
    vx_type: nx_tactics_books_modern.t_chapter_modern_warfare
  }

  // (func chapter_modern_warfare)
  static f_chapter_modern_warfare() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Warfare",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Modern America",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern America",
          ":reference",
          "* I'm going to make it up for all of the Sunday Times. I am going to make it up for all of the nusery rhymes. They never really wanted to tell the truth. I'm so tired of you America. ... Tell me, do you really think you go to hell for having loved? Tell me, enough of thinking everything that you've done is good. I really need to know. After soaking the body of Jesus Christ in blood. I 'm so tired of America. ... You took advantage of a world that loved you well. I'm going to a town that has already been burnt down. I'm so tired of you America - Rufus Wainwright, Going To a Town"
        ),
        "Modern American Aircraft",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern American Aircraft",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Advanced Tactical Fighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Advanced Tactical Fighter"
            ),
            "B-1 Bomber",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "B-1 Bomber"
            ),
            "B-2 Stealth Bomber",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "B-2 Stealth Bomber"
            ),
            "Predator UAV",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Predator UAV"
            ),
            "Stealth Fighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Stealth Fighter"
            ),
            "SH-60 Seahawk Helicopter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "SH-60 Seahawk Helicopter"
            ),
            "Blackhawk Helicopter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Blackhawk Helicopter"
            ),
            "Apache Helicopter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Apache Helicopter"
            ),
            "C-5 Galaxy",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "C-5 Galaxy"
            ),
            "C-17 Globemaster III",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "C-17 Globemaster III"
            ),
            "BGM-109 Tomahawk Cruise Missile",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "BGM-109 Tomahawk Cruise Missile",
              ":summary",
              "* Conventional: 1,000 lb (450 kg) Bullpup, or submunitions dispenser with BLU-97/B Combined Effects Bomb, or a 200 kiloton of TNT (840 terajoule) W80 nuclear device (inactivated per SALT)"
            )
          )
        ),
        "Modern American Ground Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern American Ground Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "M1A2 Abrams Tank",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "M1A2 Abrams Tank",
              ":summary",
              "Turbine Engine: takes any fuel, typically Jet Fuel, starting the engine consumes nearly 11 gallons of fuel and it emits a jet blast behind it. Can survive multiple hits from the most powerful tank munitions including 120mm DU APFSDS and anti-tank missiles. Its own weapons are unable to penetrate front or side armor even at close range in friendly fire incidents.\n\n4 Gunnery\n120mm smoothbore: APFSDS, HEAT, Anti-Personnel\n.50 MG, 2 x 7.62mm MG\nSmoke Grenades, Smoke Screen\nArmor\n610mm Composite DU, 1500mm vs HEAT, 950mm vs APDS Front\nMissile Countermeasures",
              ":speed",
              "72kph",
              ":mass",
              "70tons",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "4"
                )
              )
            ),
            "M2A2 Bradley AFV",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "M2A2 Bradley AFV",
              ":summary",
              "25mm Chain Gun, 900 rounds, APDS, HEI\n7.62mm MG, 2200 rounds\nTOWII Missiles\nSmoke Grenades, Smoke Screen",
              ":speed",
              "66kph",
              ":mass",
              "33tons",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "4"
                )
              )
            ),
            "Patriot Missile System",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Patriot Missile System"
            )
          )
        ),
        "American Naval Vessels",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "American Naval Vessels",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Ticonderoga Missile Cruiser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ticonderoga Missile Cruiser",
              ":summary",
              "* Aegis Combat System\n2 x 61 cell Mk41 vertical launch systems\n122 x RIM-66 SM-2, RIM-162 ESSM, BGM-109 Tomahawk, or RUM-139 VL-Asroc\n8 x RGM-84 Harpoon missiles\n2 x Mark 45 5in / 54cal lightweight gun\n2 x 25mm\n24 x .50cal (12.7mm) gun\n2 x Phalanx CIWS\n2 x Mk32 12.75in (324mm) triple torpedo tubes"
            )
          )
        ),
        "Modern British Ground Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern British Ground Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Challenger 2",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Challenger 2",
              ":summary",
              "Comparable to the M1 Abrams, though it uses a diesel engine.\nOne near Basra survived being hit by 70 RPGs.\n105mm L7 Gun"
            )
          )
        ),
        "Modern German Ground Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern German Ground Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Leopard 2A6",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Leopard 2A6",
              ":summary",
              "Comparable to the M1 Abrams, it carries a heavier gun and uses a diesel engine which increases reliability."
            )
          )
        ),
        "Modern Israeli Ground Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Israeli Ground Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Merkava Mark IV",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Merkava Mark IV"
            )
          )
        ),
        "Modern African Ground Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern African Ground Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Technical",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Technical"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_special_ops
   * @return {chapter}
   */
  static t_chapter_special_ops = {
    vx_type: vx_core.t_type
  }
  static e_chapter_special_ops = {
    vx_type: nx_tactics_books_modern.t_chapter_special_ops
  }

  // (func chapter_special_ops)
  static f_chapter_special_ops() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Special Ops",
      ":summary",
      "Special Ops\nBlack Ops\nDeniable Insurgencies\nImpossible Missions\nHostage Rescue"
    )
    return output
  }

  /**
   * @function chapter_the_abyss
   * @return {chapter}
   */
  static t_chapter_the_abyss = {
    vx_type: vx_core.t_type
  }
  static e_chapter_the_abyss = {
    vx_type: nx_tactics_books_modern.t_chapter_the_abyss
  }

  // (func chapter_the_abyss)
  static f_chapter_the_abyss() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "The Abyss",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Abyss Units",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Abyss Units",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Construction Submarine",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Construction Submarine"
            ),
            "Big Geek",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Big Geek"
            ),
            "Little Geek",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Little Geek"
            ),
            "Navy Seal",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Navy Seal"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_the_prisoner
   * @return {chapter}
   */
  static t_chapter_the_prisoner = {
    vx_type: vx_core.t_type
  }
  static e_chapter_the_prisoner = {
    vx_type: nx_tactics_books_modern.t_chapter_the_prisoner
  }

  // (func chapter_the_prisoner)
  static f_chapter_the_prisoner() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "The Prisoner",
      ":reference",
      "* Where am I? You are at the village. Who do you work for?  That would be telling. What do you want? Information. You won't get it. By hook or by crook, we will. Who are you?  I am number 2. Who is number 1? You are number 6. I am not a number. I am a free man. Ha ha ha ha. - The Prisoner\n* Be seeing you. - The Prisoner"
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
    vx_type: nx_tactics_books_modern.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Modern",
      ":image",
      "Modern.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Modern Overview",
        nx_tactics_books_modern.f_chapter_modern_overview(),
        "Cold War",
        nx_tactics_books_modern.f_chapter_cold_war(),
        "Modern Ground Vehicles",
        nx_tactics_books_modern.f_chapter_modern_ground_vehicles(),
        "The Abyss",
        nx_tactics_books_modern.f_chapter_the_abyss(),
        "Modern Space",
        nx_tactics_books_modern.f_chapter_modern_space(),
        "Modern Cops and Robbers",
        nx_tactics_books_modern.f_chapter_modern_cops_and_robbers(),
        "Modern Mercenaries",
        nx_tactics_books_modern.f_chapter_modern_mercenaries(),
        "The Prisoner",
        nx_tactics_books_modern.f_chapter_the_prisoner(),
        "Special Ops",
        nx_tactics_books_modern.f_chapter_special_ops(),
        "Modern Spies",
        nx_tactics_books_modern.f_chapter_modern_spies(),
        "Modern Sports",
        nx_tactics_books_modern.f_chapter_modern_sports(),
        "Modern Warfare",
        nx_tactics_books_modern.f_chapter_modern_warfare()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_cold_war": nx_tactics_books_modern.e_chapter_cold_war,
      "chapter_modern_cops_and_robbers": nx_tactics_books_modern.e_chapter_modern_cops_and_robbers,
      "chapter_modern_ground_vehicles": nx_tactics_books_modern.e_chapter_modern_ground_vehicles,
      "chapter_modern_mercenaries": nx_tactics_books_modern.e_chapter_modern_mercenaries,
      "chapter_modern_overview": nx_tactics_books_modern.e_chapter_modern_overview,
      "chapter_modern_space": nx_tactics_books_modern.e_chapter_modern_space,
      "chapter_modern_spies": nx_tactics_books_modern.e_chapter_modern_spies,
      "chapter_modern_sports": nx_tactics_books_modern.e_chapter_modern_sports,
      "chapter_modern_warfare": nx_tactics_books_modern.e_chapter_modern_warfare,
      "chapter_special_ops": nx_tactics_books_modern.e_chapter_special_ops,
      "chapter_the_abyss": nx_tactics_books_modern.e_chapter_the_abyss,
      "chapter_the_prisoner": nx_tactics_books_modern.e_chapter_the_prisoner,
      "tacticsbook": nx_tactics_books_modern.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_cold_war": nx_tactics_books_modern.t_chapter_cold_war,
      "chapter_modern_cops_and_robbers": nx_tactics_books_modern.t_chapter_modern_cops_and_robbers,
      "chapter_modern_ground_vehicles": nx_tactics_books_modern.t_chapter_modern_ground_vehicles,
      "chapter_modern_mercenaries": nx_tactics_books_modern.t_chapter_modern_mercenaries,
      "chapter_modern_overview": nx_tactics_books_modern.t_chapter_modern_overview,
      "chapter_modern_space": nx_tactics_books_modern.t_chapter_modern_space,
      "chapter_modern_spies": nx_tactics_books_modern.t_chapter_modern_spies,
      "chapter_modern_sports": nx_tactics_books_modern.t_chapter_modern_sports,
      "chapter_modern_warfare": nx_tactics_books_modern.t_chapter_modern_warfare,
      "chapter_special_ops": nx_tactics_books_modern.t_chapter_special_ops,
      "chapter_the_abyss": nx_tactics_books_modern.t_chapter_the_abyss,
      "chapter_the_prisoner": nx_tactics_books_modern.t_chapter_the_prisoner,
      "tacticsbook": nx_tactics_books_modern.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/modern",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_cold_war)
    nx_tactics_books_modern.t_chapter_cold_war['vx_value'] = {
      name          : "chapter_cold_war",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_cold_war
    }

    // (func chapter_modern_cops_and_robbers)
    nx_tactics_books_modern.t_chapter_modern_cops_and_robbers['vx_value'] = {
      name          : "chapter_modern_cops_and_robbers",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_modern_cops_and_robbers
    }

    // (func chapter_modern_ground_vehicles)
    nx_tactics_books_modern.t_chapter_modern_ground_vehicles['vx_value'] = {
      name          : "chapter_modern_ground_vehicles",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_modern_ground_vehicles
    }

    // (func chapter_modern_mercenaries)
    nx_tactics_books_modern.t_chapter_modern_mercenaries['vx_value'] = {
      name          : "chapter_modern_mercenaries",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_modern_mercenaries
    }

    // (func chapter_modern_overview)
    nx_tactics_books_modern.t_chapter_modern_overview['vx_value'] = {
      name          : "chapter_modern_overview",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_modern_overview
    }

    // (func chapter_modern_space)
    nx_tactics_books_modern.t_chapter_modern_space['vx_value'] = {
      name          : "chapter_modern_space",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_modern_space
    }

    // (func chapter_modern_spies)
    nx_tactics_books_modern.t_chapter_modern_spies['vx_value'] = {
      name          : "chapter_modern_spies",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_modern_spies
    }

    // (func chapter_modern_sports)
    nx_tactics_books_modern.t_chapter_modern_sports['vx_value'] = {
      name          : "chapter_modern_sports",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_modern_sports
    }

    // (func chapter_modern_warfare)
    nx_tactics_books_modern.t_chapter_modern_warfare['vx_value'] = {
      name          : "chapter_modern_warfare",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_modern_warfare
    }

    // (func chapter_special_ops)
    nx_tactics_books_modern.t_chapter_special_ops['vx_value'] = {
      name          : "chapter_special_ops",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_special_ops
    }

    // (func chapter_the_abyss)
    nx_tactics_books_modern.t_chapter_the_abyss['vx_value'] = {
      name          : "chapter_the_abyss",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_the_abyss
    }

    // (func chapter_the_prisoner)
    nx_tactics_books_modern.t_chapter_the_prisoner['vx_value'] = {
      name          : "chapter_the_prisoner",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_chapter_the_prisoner
    }

    // (func tacticsbook)
    nx_tactics_books_modern.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/modern",
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
      fn            : nx_tactics_books_modern.f_tacticsbook
    }

  }
}
