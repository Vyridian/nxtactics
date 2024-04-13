'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_high_technology {

  /**
   * @function chapter_car_wars
   * @return {chapter}
   */
  static t_chapter_car_wars = {
    vx_type: vx_core.t_type
  }
  static e_chapter_car_wars = {
    vx_type: nx_tactics_books_high_technology.t_chapter_car_wars
  }

  // (func chapter_car_wars)
  static f_chapter_car_wars() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Car Wars"
    )
    return output
  }

  /**
   * @function chapter_cyberpunk
   * @return {chapter}
   */
  static t_chapter_cyberpunk = {
    vx_type: vx_core.t_type
  }
  static e_chapter_cyberpunk = {
    vx_type: nx_tactics_books_high_technology.t_chapter_cyberpunk
  }

  // (func chapter_cyberpunk)
  static f_chapter_cyberpunk() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Cyberpunk",
      ":summary",
      "* The year is 2151.\n\nThings are pretty bad on planet Earth:\n* Global Warming - The build up of smothering greenhouse effect gases has resulted in the complete melting of the Arctic\nice cap as well as much of the Antartic ice cap.  Coastal areas have been inundated and global temperatures continue to\nrise, a new record every year.\n* Resource Depletion - As the climate changed, desperate farmers overfarmed their land, increasing erosion and therefore\nfood prices.  Fossil fuels became increasingly scarce and given the ongoing climate problems, ecologically unsuitable.\n* Overpopulation -\n* Economic Collapse -\n\nThings are slightly better in space:\n* Orbital Stations - For the last hundred years, large space colonies have been constructed at the five Lagrange points\naround Earth.  Relative to Earth, the Orbital stations are gleaming paradises of corporate efficiency.  Corporate\ninterests are certainly strong on the Orbital colonies, and the Orbitals increasingly chafe at Earth's taxation of their\ngoods and the high tariffs on imports.\n* Luna - Huge moon bases dot the lunar surface.  With its low gravity and limitless lunar rock, the Moon is the natural\nconstruction center for most Orbital facilities and spaceships.  Surface and underground mining operations go around the\nclock.  Enormous massdrivers propel the material into Earth orbit.\n* Mercury - Solar stations on Mercury provide limitless power while the molten\nsurface provides limitless ore. Though the surface is hellish and survival is\ndifficult, Mercury provides wealth beyond imagining to those able to survive.\nThe population is 90% male with most residents on a 6 year work contract. After\nthe contract they usually return to wherever they came from with enough money to\nbuy a house and start a family. Like a military veteran, Mercury companies also\noffer generous benefits for the rest of the contractor's life or generous death\nbenefits to their family if they don't survive. Despite extensive safety systems,\nthe fatatlity rate remains 1 in 20 even among these hardy folk. Politically,\nMercury is extremely independent and has little patience for the affairs of the\nother planets.\n* Venus\n* Mars\n* Asteroid Belt - Though Luna provides a steady supply of material to the colonies, whole Asteroids can be ferried from\nthe Asteroid Belt to create instant colonies.  Further, the valuable minerals in an asteroid are easier to detect and\nmine than in either Lunar or Terrestrial mines.  The Asteroid field is large, however, so a whole crop of freelance\nprospectors have travelled to the Asteroid Belt in a high-tech gold-rush.\n* Jupiter\n* Saturn\n\n* Cryomax - Maximum security prison where prisoners are stored in partial cryonic suspension to maximize space.\n** Reference - Demolition Man\n* Crystal - Liquid crystal computer matrix",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Government",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Government",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Innovator",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Innovator",
              ":reference",
              "Appleseed, Genetic Android, Bioroid",
              ":summary",
              "* Genetically engineered artificial human.\n\nTheoretically superior to humans in every way, they are purposely implanted\nwith a number of limitations:\n* They cannot reproduce.\n* They must undergo routine medical treatments or their genetic structure\nbreaks down.\n* They are peaceful in nature to buffer mankind's tendency to violence.\n* They defer to human authority unless they believe that the authority will\nharm mankind."
            ),
            "Cycle Police",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Cycle Police",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Driving",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Driving",
                  ":level",
                  "4",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    ":Motorcycles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Motorcycles"
                    )
                  )
                )
              )
            ),
            ":E.S.W.A.T.",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "E.S.W.A.T.",
              ":reference",
              "Appleseed"
            ),
            "Mobile Police",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mobile Police",
              ":reference",
              "Appleseed"
            )
          )
        ),
        ":Military",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Military",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Combat Android",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Combat Android"
            ),
            "Planetary Defense Navy",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Planetary Defense Navy"
            ),
            "Planetary Defense Pilot",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Planetary Defense Pilot"
            ),
            "Eugenic Warrior",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Eugenic Warrior",
              ":reference",
              "* Khan, Star Trek II",
              ":summary",
              "* Through bioengineering, an elite warrior caste has been created combining strategic genius, leadership skills,\nand physical perfection.  Unfortunately, they also develop incredible egos and megalomania.",
              ":titles",
              "Master Race, Super Soldier"
            )
          )
        ),
        ":MegaCorps",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "MegaCorps",
          ":summary",
          "* After the world stock market crash and subsequent collapse of many economies and governments around the\nworld (including the US), only international corporations were left with the ability to exert power on a\nglobal scale.\n* The economic collapse acted as a purge, the strongest conglomerates consuming the weaker ones until only\nthe biggest and strongest remained. With most governments enfeebled and the competition obliterated, the\nmegacorps were left to fill a huge power vacuum. Naturally there was some disagreement as to how to divide\nthe spoils. The result was a series of wars as each corporation attempted to destroy its competition\nphysically and finacially. Smaller conflicts, covert and overt, continue to this day, with full scale war\nthreatening to resurface at any time.",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Corporate Man",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Corporate Man",
              ":titles",
              "Collarboy, Company Man, Suit"
            ),
            "Corporate Security",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Corporate Security"
            ),
            "System Administrator",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "System Administrator",
              ":titles",
              "Cyber Engineer, Icemen, SysOp, SysAdmin, Weasel"
            ),
            "Kildren Pilot",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Kildren Pilot",
              ":summary",
              "* Kildren are genetically modified before birth to halt the aging process.\nPhysically, they are eternally teenagers. Mentally, however, they are quiet\nand serious. A side effect of their frozen aging process is the inability to\nrecall distant memories. Kildren, therefore, lack a strong sense of time or\nthe past. They live for the now and are fearless pilots. For some, however,\nthe sense of timelessness lacks purpose and turns into hopelessness."
            ),
            ":Media",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Media",
              ":summary",
              "* Ethnicity: Greek-American\n* Hair: Black Short Waved Hair\n* Eyes: Pale Grey\n* Clothes: Clean White Shirt under black leather thigh-length light-armored jacket (occasional loose tie), grey hardwearing slacks, black shoes or running sneakers, Aviator sunglasses when being 'too cool'.\n* Equipment: Beeper, Camera, Colt automatic pistol and shoulder holster, 1 room apartment\n* Contacts: Camera Man, Police Officer",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Firearms",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Firearms",
                  ":summary",
                  "Pistol",
                  ":level",
                  "4"
                )
              )
            ),
            "Medical Technician",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Medical Technician",
              ":titles",
              "Med Tech"
            ),
            ":Scientist",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Scientist"
            )
          )
        ),
        "Offworld Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Offworld Colonies",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Miner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Miner"
            ),
            ":Pirate",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pirate"
            )
          )
        ),
        ":Sprawls",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Sprawls",
          ":titles",
          "Dirtboys, Dirtgirls",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Bounty Hunter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bounty Hunter"
            ),
            "Cyber Psycho",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Cyber Psycho",
              ":summary",
              "* Buttonhead - someone addicted to artificially stimulating the pleasure centers of the brain.",
              ":titles",
              "Buttonhead"
            ),
            ":Enforcer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Enforcer"
            ),
            ":Fixer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Fixer",
              ":summary",
              "* Fixers buy and sell information, goods, and services.\n* Some of their services merely require the right connections.  Others are not quite legal.",
              ":titles",
              "Bookie, Executive Secretary, Gobetween, Information Broker, Negotiator, Organizer, Producer, Roadie, Thirdman"
            ),
            "Gang Member",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gang Member"
            ),
            ":Netrunner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Netrunner",
              ":summary",
              "* Outlaw computer jocks or hackers.  Some people do it for the glory; most do it for the money.  Information is\npower in the modern world and all the information is somewhere on the Net.  Further, the modern world is a marvel\nof automation, so a clever person may turn that automation to his own uses.",
              ":titles",
              "Crystaljock, Hacker"
            ),
            ":Nomad",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Nomad",
              ":summary",
              "* Deltajock - A pilot of delta-winged smuggling craft\n* Panzerjock - A driver of armored smuggling hovercraft",
              ":titles",
              "Deltajock, Gypsy, Linerunner, Panzerjock, Road Warrior, Smuggler"
            ),
            ":Rocker",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Rocker",
              ":summary",
              "* Zonedancing - Dancing turned into a dominance game.  A dancer attempts to persuade other dancers in his zone to\nconform to his movements using charisma, talent or violence.",
              ":titles",
              "Bard"
            ),
            ":Solo",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Solo",
              ":reference",
              "* I don't want to walk this Earth if I gotta do it solo...so...low. - Iyaz, Solo",
              ":titles",
              "Assassin, Hit Man"
            ),
            ":Tech",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Tech",
              ":titles",
              "Cybertech"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_cyberpunk_campaign
   * @return {chapter}
   */
  static t_chapter_cyberpunk_campaign = {
    vx_type: vx_core.t_type
  }
  static e_chapter_cyberpunk_campaign = {
    vx_type: nx_tactics_books_high_technology.t_chapter_cyberpunk_campaign
  }

  // (func chapter_cyberpunk_campaign)
  static f_chapter_cyberpunk_campaign() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Cyberpunk Campaign",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Cyberpunk Overview",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Cyberpunk Overview",
          ":summary",
          "* Events Leading to War\n* Overview of the War\n* Aftermath"
        ),
        "Car Wars",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Car Wars",
          ":scenariomap",
          vx_core.f_new(
            nx_tactics_base.t_scenariomap,
            "Escort Duty",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Escort Duty",
              ":summary",
              "* An Agricorp has commissioned some independents to covertly escort an unmarked tractor-trailer 1900 miles from\ntheir site in La Jolla to a USDA facility near Nashville, TN.\n* A rival has sent its own independents to get their hands on the cargo.\n* Note: The cargo/escort is a decoy for the real shipment.",
              ":teammap",
              vx_core.f_new(
                nx_tactics_base.t_teammap,
                ":Escort",
                vx_core.f_new(
                  nx_tactics_base.t_team,
                  ":name",
                  "Escort",
                  ":completevictory",
                  "$1000/each if cargo delivered intact.",
                  ":forces",
                  "* 1 Tractor-trailer\n* 2 Sedans",
                  ":partialvictory",
                  "Prevent enemy from taking any of the shipment."
                ),
                ":Interceptors",
                vx_core.f_new(
                  nx_tactics_base.t_team,
                  ":name",
                  "Interceptors",
                  ":completevictory",
                  "Capture the entire shipment.",
                  ":forces",
                  "* 1 Van\n* 3 Sedans",
                  ":partialvictory",
                  "Capture any of the shipment."
                )
              )
            ),
            "Safe House",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Safe House",
              ":summary",
              "* A small-time fixer has evidence of the identity of a cyber serial killer, the Night City Stalker.  Two news\norganizations are bidding on the deal, but the loser contacted the Stalker out of spite."
            ),
            "Toxic Spill",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Toxic Spill",
              ":summary",
              "* While guarding a 200 person Nomad camp, the well drill discovers a hidden toxic waste dump.  Alarms alert the\ndumping company that their little secret has been discovered, so they send a team to 'clean up' the problem.\n* The whole Nomad camp must evacuate 3 miles to town before they are silenced, unfortunately they do not have\nenough vehicles to do it in one trip."
            ),
            "The Heist",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "The Heist",
              ":summary",
              "* In a winter storm, a shipment of Palladium is diverted to a small warehouse in a corporate park.  It will not\nbe moved until the weather turns, so it is a perfect opportunity to break in and steal the goods.\n* During the storm, the skies are dangerous, and even the roads are fairly dicey.  Snowmobile are certainly an\noption.",
              ":teammap",
              vx_core.f_new(
                nx_tactics_base.t_teammap,
                ":Thieves",
                vx_core.f_new(
                  nx_tactics_base.t_team,
                  ":name",
                  "Thieves",
                  ":completevictory",
                  "Capture the whole shipment.",
                  ":forces",
                  "* 10 Thieves\n* 5 Snowmobiles\n* 3 Sedans",
                  ":partialvictory",
                  "Take at least half of the shipment."
                ),
                ":Guards",
                vx_core.f_new(
                  nx_tactics_base.t_team,
                  ":name",
                  "Guards",
                  ":completevictory",
                  "Protect the entire shipment.",
                  ":forces",
                  "* 10 Armed and Armored Guards\n* 10 Unarmored, sleeping Guards\n* 5 Sedans\n* 2 Helicopters",
                  ":partialvictory",
                  "Protect at least half of the shipment."
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
   * @function chapter_high_tech_aircraft
   * @return {chapter}
   */
  static t_chapter_high_tech_aircraft = {
    vx_type: vx_core.t_type
  }
  static e_chapter_high_tech_aircraft = {
    vx_type: nx_tactics_books_high_technology.t_chapter_high_tech_aircraft
  }

  // (func chapter_high_tech_aircraft)
  static f_chapter_high_tech_aircraft() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "High Tech Aircraft",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "High Tech Commercial Aircraft",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "High Tech Commercial Aircraft",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Hypersonic Airliner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hypersonic Airliner",
              ":summary",
              "* Suborbital passenger plane that can make intercontinental flights at Mach 5+\n* Such high speed planes are all wedge shaped Hypersonic Waveriders."
            ),
            "Suborbital Shuttle",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Suborbital Shuttle",
              ":summary",
              "* Suborbital passenger plane that can reach the upper atmosphere and connect to an [Orbital Skyhook Satellite]'s\ntether.  The end of the tether holds a small wing shaped cargo container.  Passengers and cargo are quickly\nexchanged, and the container is reeled back up to the skyhook while the plane returns to its launch site."
            )
          )
        ),
        "High Tech Military Aircraft",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "High Tech Military Aircraft",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Valkyrie Air Cavalry",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Valkyrie Air Cavalry",
              ":classification",
              "Lt. Aircraft"
            ),
            "Aurora Transatmospheric Fighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Aurora Transatmospheric Fighter",
              ":summary",
              "* A sleek, shuttle-like jet with speeds of Mach 5. A nuclear engine, stealth armor, full environmental containment, and a virtual or direct neural link make this one-man craft the deadliest thing in the skies.\n* It carries twin 30mm autocannons, a plasma cannon, 16 air-to-air missiles, and 2 fuel air explosives for ground targets.",
              ":classification",
              "Lt. Aircraft"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_high_tech_equipment
   * @return {chapter}
   */
  static t_chapter_high_tech_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_high_tech_equipment = {
    vx_type: nx_tactics_books_high_technology.t_chapter_high_tech_equipment
  }

  // (func chapter_high_tech_equipment)
  static f_chapter_high_tech_equipment() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "High Tech Equipment",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Consumer Goods",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Consumer Goods",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Autobike",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Autobike",
              ":summary",
              "* Autonomous motorcycle used for most transit. A small fraction of the Autocar\nfleet is filled by Autobikes. Though slightly cheaper to rent than Autocars and\nbetter in tight traffic, most people use Autocars exclusively."
            ),
            ":Autocar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Autocar",
              ":summary",
              "* Autonomous car used for most transit. Ordinary citizens rarely own their own\nvehicles, instead they summon an automated rental car with their phone that takes\nthem directly to their destination. Autocars are parked throughout populated\nareas, so summoning one usually takes seconds. Autocars coordinate with each other\nand can travel at high speeds in tight traffic without incident.\n* History - Automated cars took over major cities within years of their invention.\nThey solved traffic, parking, accident, and environmental problems all at once\nwhile offering cheaper per mile travel than owning your own vehicle. They rapidly\nmade taxi and ridesharing solutions obsolete, and it soon became illegal for a\nhuman to drive a vehicle because autocars were so much safer. Soon all mass\ntransit systems reduced down to autocars and some autobikes."
            ),
            ":Cyberchip",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cyberchip",
              ":summary",
              "* Standard memory/application chip.  All media is stored on cyberchips and can be played by simply plugging the\nchip into any standard interface.\n* Plugging cyberchips directly into one's body is called 'Chipping In'."
            ),
            ":Cybercycle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cybercycle",
              ":summary",
              "* High performance motorcycle that allows direct neural interface."
            ),
            ":Cyberdeck",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cyberdeck"
            ),
            ":Cyberphone",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cyberphone"
            ),
            "Direct Neural Interface",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Direct Neural Interface",
              ":summary",
              "* This implant includes a processor chip and interface plugs that connect directly to the brain.  The chip\ncontains an artificial intelligence avatar program that learns from and emulates the user's personality.  This\nAI can then enter cyberspace or control cybernetic equipment at the speed of a computer program while retaining\nthe decision making logic of its user.  Further, the AI regularly updates the user with its decisions, and\ngathers the user's impression, so it can make further decisions.  While 'Jacked In' the user is motionless as\nhis mind is overwhelmed with information from the AI.  DNI's are powerful tools, but are also risky technology.\nSince information floods into the mind at incredible speeds, any malfunction in the DNI or the AI can cause\nsanity threatening sensory overload or sensory deprivation that seem to last for days in mere seconds.\n* Burn Out - losing one's mind to DNI failure."
            ),
            ":Flitter",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Flitter",
              ":summary",
              "* Light, one-man helicopter",
              ":titles",
              "Aerogyro, Gyrocopter"
            ),
            "Hover Board",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hover Board"
            ),
            "Mag Lev Train",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mag Lev Train",
              ":summary",
              "* Speed: 200mph"
            ),
            ":Metrocar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Metrocar",
              ":summary",
              "* Ultra-subcompact reverse trike."
            ),
            "Mister Fusion",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mister Fusion",
              ":image",
              "HighTech/MrFusion.jpg"
            ),
            "Quad ATV",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Quad ATV"
            ),
            "Private Quadcopter",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Private Quadcopter"
            ),
            ":Skimmer",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Skimmer",
              ":summary",
              "* The modern hovercraft creates a tightly computer-controlled air pocket beneath\nit that allows the Skimmer to move quickly over land or sea. The Skimmer\nmanipulates the pocket to change direction. Though fast and all-terrain, they are\nnot as quiet, maneuverable, or energy efficient as Autocars, so their use is\nlimited to lightly populated areas.",
              ":titles",
              "Ground Effect Vehicle, Hovercraft"
            )
          )
        ),
        "Corporate Equipment",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Corporate Equipment",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Cargo Osprey",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cargo Osprey"
            ),
            "Corporate Limosine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Corporate Limosine"
            ),
            "Corporate Osprey",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Corporate Osprey",
              ":summary",
              "* Speed: 275knots\n* Range: 600miles\n* The Osprey is a tilt-wing propeller plane that is used as a\ncorporate commuter plane. Like a helicopter, it can land on\nbuildings, and it can also fly directly to nearby cities."
            ),
            "Personal Aerodyne",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Personal Aerodyne",
              ":summary",
              "* Speed: 250mph\n* Range: 400miles"
            ),
            ":Transjet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Transjet",
              ":summary",
              "* The Transjet is the standard commercial airliner across the world. It flies up\nbeyond the atmosphere where it can travel at extreme speeds and then lands\nanywhere in the world within an hour.",
              ":titles",
              "Hopper, Transatmospheric Jet"
            )
          )
        ),
        "Police Equipment",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Police Equipment",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Aerodyne",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Aerodyne",
              ":reference",
              "Blade Runner",
              ":summary",
              "* Speed: 350mph\n* Range: 400miles\n* Short and bulbous, the Aerodyne has the aerodynamics of a brick.  It relies on its huge jets to fly.",
              ":titles",
              "Air Car, Pegasus"
            )
          )
        ),
        "Military Equipment",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Military Equipment",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Combat Aerodyne",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Combat Aerodyne",
              ":summary",
              "* Speed: 480mph\n* Range: 600miles\n* Armored combat Aerodyne"
            ),
            "Barracuda Drone Submarine",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Barracuda Drone Submarine",
              ":summary",
              "* Carrier borne small, unmanned, high speed, attack submarine. It is designed as a long range drone that continually scouts the water surrounding a capital ship. Its tip is a HEAT shaped explosive, and it uses a particularly volitle fuel mix, so that it can be used as a torpedo if any serious threat enters its sphere of control."
            ),
            "Manta VTOL Fighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Manta VTOL Fighter",
              ":reference",
              "* Carrier Command: Gaea Mission",
              ":summary",
              "* Carrier borne VTOL Fighter. It has four redirectable thrusters that allow it to hover at any altitude including directly over water. It is fully sealed and can be launched and recovered underwater, but its underwater speed is poor. Its thrust is sufficient to ferry a Sea Lion ATV or other medium vehicle when necessary. It has a small, replaceable mission module to custom tailor its missions for anti-air, anti-ship, anti-armor, anti-personnel, missile, bombs, repair, apc, recon, science, transport, and more. Its mission module is interchangable with the Sea Lion Amphibious Tank."
            ),
            "Pelican VTOL Heavy Transport",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pelican VTOL Heavy Transport",
              ":summary",
              "* Land based VTOL transport plane. It has four redirectable thrusters that allow it to hover at any altitude including directly over water. It is fully sealed and can land and take off from water. It has a single landing deck on top to facilitate in-air refuelling and resupply of VTOL fighters. It has a large, replaceable mission module to custom tailor its missions for anti-air, anti-ship, anti-armor, anti-personnel, missile, bombs, repair, apc, recon, science, transport, and more. It is powerful enough to carry 1 heavy tank, 2 medium tanks, or 3 APCs. It is, however, a large target with limited armor, so it is not suitable for heavy fire situations."
            ),
            "Sea Lion Amphibious Medium Tank",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sea Lion Amphibious Medium Tank",
              ":reference",
              "* Carrier Command: Gaea Mission",
              ":summary",
              "* Carrier borne All Terrain Vehicle. It has six wheels that work equally well on water or land, but on water it augments its speed using a caterpillar drive. It is fully sealed and submerisble, but its underwater speed is poor. It has a small, replaceable mission module to custom tailor its missions for anti-air, anti-ship, anti-armor, anti-personnel, missile, repair, apc, recon, science, and more. Its mission module is interchangable with the Manta Fighter."
            ),
            "Sailfin Light Frigate",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sailfin Light Frigate",
              ":summary",
              "* Fully Submersible Light Frigate loaded with 2 Barracuda Submarines.\n* Purpose - The Sailfin is a high speed interceptor and screening craft. It is equipped with anti-missile and small anti-ship weaponry as well as a large ECM suite.\n* Hydrofoils - Uses a Magnetohydrodynamic (MHD) to produce high speeds with little noise. It is designed in a catamaran configuration with hydrofoils and an air cushion effect to provide near flight.",
              ":titles",
              "Flying Fish"
            ),
            "Hammerhead Destroyer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hammerhead Destroyer",
              ":summary",
              "* Fully Submersible Destroyer loaded with 2 Manta Fighters and 4 Barracuda Submarines.\n* Purpose - The Hammerhead is an all round escort ship for larger capital ships."
            ),
            "Mako Assault Carrier",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mako Assault Carrier",
              ":reference",
              "* Carrier Command: Gaea Mission",
              ":summary",
              "* Fully Submersible Light Carrier loaded with 4 Manta Fighters, 4 Sea Lion ATVs, and 2 Barracuda Submarines. Uses a Magnetohydrodynamic (MHD) to produce high speeds with little noise."
            ),
            "Orca Medium Cruiser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Orca Medium Cruiser",
              ":summary",
              "* Fully Submersible Medium Cruiser loaded with 6 Manta Fighters, 1 Pelican Transport, 6 Sea Lion ATVs, and\n4 Barracuda Submarines."
            ),
            "Leviathan Command Carrier",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Leviathan Command Carrier",
              ":summary",
              "* Fully Submersible Heavy Carrier loaded with 12 Manta Fighters, 4 Pelican Transports, 6 Sea Lion ATVs, and\n8 Barracuda Submarines."
            )
          )
        ),
        "Body Armor",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Body Armor",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Stealth Suit",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Stealth Suit",
              ":reference",
              "* Nuclear launch detected... - Starcraft",
              ":titles",
              "Ghost Special Operative"
            ),
            "Powered Body Armor",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Powered Body Armor",
              ":summary",
              "* Heavy Body Armor",
              ":titles",
              "Hard Suit"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_high_tech_heavy_armor
   * @return {chapter}
   */
  static t_chapter_high_tech_heavy_armor = {
    vx_type: vx_core.t_type
  }
  static e_chapter_high_tech_heavy_armor = {
    vx_type: nx_tactics_books_high_technology.t_chapter_high_tech_heavy_armor
  }

  // (func chapter_high_tech_heavy_armor)
  static f_chapter_high_tech_heavy_armor() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "High Tech Heavy Armor",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "High Mobility Forces",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "High Mobility Forces",
          ":summary",
          "* Mobile - The term Mobile, short for High Mobility, was coined to describe forces that emphasized manueverability and terrain use over raw speed, weaponry, or armor.\n** Mobile Infantry - Human sized battle suits capable of increasing an infantry unit's combat ability. Early versions emphasized weapons and armor, but their high cost and attrition rate moved the focus to fast hit-and-run or blitzkreig style armor.\n** Mobile Suit - The Mobile Suit is an attempt to create a larger version of Mobile Infantry suits. They remain humanoid and can benefit from infantry tactics on a large scale. The design is a swiss army knife, capable of quickly changing and scavenging weapons and is equally suited for combat and large scale repair operations. The design does have many detractors, however, who argue that the humanoid form is not optimal for ground combat where its height makes it an easy target, air combat where it is not aerodynamic, or space combat where legs have little use.\n** Mobile Cavalry - Mobile Cavalry is any High Mobility vehicle that is optimized toward its intended enviroment: Mobile Fighters in atmosphere, Mobile Tanks on land, Mobile Subs underwater, Mobile Insects in space, etc. These system are highly specialized in contrast with the general utility of Mobile Suits. Though such designs seem more optimal, there is an argument that Mobile Suit mass production and spare part availability would ultimately win out.\n** Mobile Armor - The ultimate expression of High Mobility weapons, Mobile Armor are large, heavily armed and armored versions of Mobile Cavalry. They are terrifying monstrosities with similar reputations to the King Tiger tank in World War II. Though on paper, they seem to be the ultimate weapon, in practice their high cost and manufacturing complexity severly limited their deployment and losing even one was devastatingly costly. They can turn the tide of any battle, but were overall less effective than smaller units.\n* Linear Frame - The linear frame is a special harness that mimics the actions of the mobile suit pilot and translates them into mobile suit actions. This gives the mobile suit an uncanny agility and a strangely human grace. A trained pilot can shift the suit's center of gravity to change the armor's orientation without propellent which can substantially increase endurance and survivability.\n* Piloting - A mobile suit pilot wears a special suit and is secured to a linear frame that\nhelp manage the incredible g-forces that the mobile suit produces. Rookie pilots have been\nknocked unconscious or even killed by their own combat maneuvers, so extensive, specialized\ntraining is essential. Ace pilots seem almost superhuman in their ability to take physical\nstress without blacking out.\n* Mobile Suits vs. Capital Ships - Mobile suits have a unique ability against capital ships.\nThey can land anywhere on the surface of the ship (typically outside of firing arcs) and attack\ncomponents directly. Whenever a mobile suit on a capital ship score [Critical Hits], the player\nmay look at the damage deck and choose the critical instead of choosing one at random.\n* Flight Systems - Spacecraft and Exo-Suits use a ionic plasma drive which ionizes and\naccelerates gas particles out the exhaust vents at relativistic speeds. These energized\nparticles create a glowing stardust effect at the exhaust ports. These drives also function in\natmosphere but their interaction with air creates a massive heat buildup, so they can only be\nused in short bursts like jump jets. Unusually large vents with heat dispersers can be specially\ndesigned for atmosphere, but these are suboptimal in space.\n* Plasma Lance - The lance is a short mobile suit melee weapon. Its firing end is a hollow\nmagnetic tube lined with layers of copper leaf. When held in a specially designed hand or connector,\na direct current from the fusion reactor transforms the copper leaf into a short ionizing plasma jet\nof incompressible copper. The lance appears as an empty weapon hilt until it fires; then it flashes\nwith a brief, blinding jet that violently pierces almost any material it contacts. It is very\neffective against armor, but its uses are limited so they may only be used a few times before being\ndepleted. Mobile suits will often carry multiple lances, although larger variants exist.\n\nLand based Mobile Suits follow these principles:\n* Maintain a low profile - Weapons are so destructive that it is much more effective to not be hit. Stay low and use cover at all times. Tracked, Wheeled, Hover and 4 legged vehicles maintain the lowest profile while still being all-terrain.\n* High mobility - Slow, predictable units are sitting ducks. Also, move in 3 dimensions to maximize mobility. This makes legs and jump jets superior to tracks and wheels.\n* Projectile weapons are more effective on the ground than in space - High caliber cannons can be mounted on land vehicles.\n* Land based Mobile Suits developed from dog-like anti-personnel hunter-killer robots. As Electromagnetic Warfare began to defeat digital circuitry, it became necessary to put soldiers back into the war machines and return to larger, more reliable analog systems.\n\nSpace based Mobile Suits follow these principles:\n* Propellent must be expended to accelerate - a modern vehicle in space is more limited by its propellent than its fuel.\n* Arms and Legs are useful - When one part of a mobile suit is moved, it produces a counter-movement in the opposite direction. This effect can be used to adjust the mobile suit's direction without expending propellant. Thus, in zero gravity the mobile suit's arms and legs are not dead weight, but a vital component of its maneuvering system.",
          ":titles",
          "Armored Frame, Exo-Suit, MEC (Multi-Environment Cavalry), Mobile Armor, Mobile Cavalry, Mobile Invantry, Mobile Suit",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Piranha Mobile Armor",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Piranha Mobile Armor",
              ":summary",
              "* The current state-of-the-art space mecha is a wedge-shaped, heavily-armored stealth craft with a turreted particle cannon.\n* Armor Module - The wedge-shaped front, bottom, and sides of the craft are a single hot-swappable module for in combat maintainance. It is primarily composed of ablative, stealth armor. The armor is sharply angled to present the smallest possible angle of penetration and detection from the front.\n* Core Module - The center of the craft is a gyroscopic sphere. The gyroscope is so powerful, it is used for attitude control instead of maneuver jets.\n* Core Drone Module - Like most mobile armors, the Piranha is deployed in large packs (schools) of drones with random human piloted command units. Without a pilot, the core module can contain spare ammo or propellent.\n* Core Pilot Module - The pilot seat is enclosed in this sphere which allows the craft to turn very quickly while rotating the pilot seat separately to minimize angular momentum and G-forces. The escape hatch can be rotated to the top or the bottom of the ship to allow easy exit or connect to ship airlocks.\n* Mission Module - The top and back of the craft contain the weapon systems, propulsion, and fuel in a single hot swappable module. This entire module can be immediately replaced to customize the craft for a mission or rapidly refuel and reload.\n* Space Interceptor Module - The standard space module includes a single heavy particle beam turret and nuclear propulsion (including fuel and reaction mass).\n* Space Bomber Module - This module is identical to the Space Interceptor Modules but replaces the turret with a fixed medium railgun and 2 heavy penetrator nuclear missiles.\n* Orbital Insertion Module - Though rarely used, this module allows the ship to reach orbit from a planet's surface using chemical rockets. The module is also capable of independent re-entry so it can be refueled and reused without the main craft.\n* Atmospheric Interceptor Module - Jet engines and anti-aircraft missiles. With this module, the ship is capable of trans-atmospheric flight. Though its wedge shape is aerodynamic, it provides no lift, so it must rely on its thrust to maneuver and to remain airborne.\n* Atmospheric Bomber Module - Jet engines and precision bombs.\n* Atmospheric Close Support Module - Jet engines and a single heavy penetrator autocannon.\n* Air Cavalry Module - Dual turbine rotor systems and fuel with 2 light rail cannons for rescue and light air support.\n* Land Module - A turret pairing a heavy rail cannon with a high capacity rail machine gun. The rear houses a missile pod housing 6 indirect fire missiles for light bombardment.\n* Marine Module - Marine caterpillar thrust system that allows high speed surface movement or moderate underwater movement with decent stealth.\n* Command Module - Advanced communications and coordiation systems.\n* Sensor Module - Specialized long-range active and passive sensor systems for patroling or spying.\n* Stealth Module - Enhanced stealth system foregoing firepower and performance for stealth. Contains a single medium rail cannon.\n* Science Module - Highly sensitive sensor package for detailed analysis.\n* Service Module - The ship has useful carrying capacity, so besides its combat role, it operates as a repair worker bee and cargo hauler. Typically, repair crews get more flight time on the ship than combat pilots.\n* Cargo Module - A large cargo container and thruster can be afixed to the rear for transport duties.\n* Long Range Module - A variant of the cargo container can be attached to the back of another module to increase the range of the ship providing extra thrust and reaction mass. The module is jettisoned once it reaches its target and is hopefully recovered later.\n* Arms - 6 thin, light-weight arms fold out from under the ship to the front, back, and sides. Each arm has 3 powerful fingers with magnetic clamps and sharp tips that allow the craft to cling to surfaces and walk along them at high speeds like an insect. The arms are strong enough to climb vertical surfaces or be inverted under gravity. The end of each arm has an attitude control jet to aid in high speed manuevers. On land, these jets are replaced with powerful turbines that lets the craft skate across level ground or water. The elbow of each arm is a sphere that can be used as landing gear or wheels on roads or other reasonably flat terrain. 6 arms were chosen, so the craft can still move on 4 arms while carrying or dragging a heavy load with 2. As with insects, 6 arms provides sufficient redundancy in case 1 or even 2 legs are lost to damage. In land combat, the arms allow the craft to maximize cover and peek its gun around corners or over obstacles.",
              ":titles",
              "Terrapin"
            ),
            "Panther Mobile Cavalry",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Panther Mobile Cavalry",
              ":summary",
              "* The current state-of-the-art land mecha is a 4 legged style reminiscent of big cats or wolves.\n* Like most mobile armors, the Panther operates in packs of drones with random human piloted command units. The pilot climbs into the back of the unit and rides in the position of a performance motorcycle.  If desired, the pilot can open the back and sit up as if riding a horse. Piloted units sacrifice a hardpoint to fit the pilot.\n* Payloads such as large caliber cannons and shields are mounted on one of two fixed back mounts. This unit can also stand on 2 legs and slide the cannon up to become a shoulder mount. All 4 legs possess manipulative hands with claws and magnets for climbing and can carry the cannon or a shield as needed. Small wheels in the elbows are used when travelling on roads."
            )
          )
        ),
        "High Tech Land Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "High Tech Land Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Hover Tank",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hover Tank"
            ),
            "Light Walker",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Light Walker"
            ),
            "Heavy Walker",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Heavy Walker"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_high_tech_overview
   * @return {chapter}
   */
  static t_chapter_high_tech_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_high_tech_overview = {
    vx_type: nx_tactics_books_high_technology.t_chapter_high_tech_overview
  }

  // (func chapter_high_tech_overview)
  static f_chapter_high_tech_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "High Tech Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: High Technology?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: High Technology?"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_high_tech_rules
   * @return {chapter}
   */
  static t_chapter_high_tech_rules = {
    vx_type: vx_core.t_type
  }
  static e_chapter_high_tech_rules = {
    vx_type: nx_tactics_books_high_technology.t_chapter_high_tech_rules
  }

  // (func chapter_high_tech_rules)
  static f_chapter_high_tech_rules() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "High Tech Rules",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Cyberspace",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Cyberspace",
          ":summary",
          "* A huge, interconnected series of computer networks, software systems, and virtual realities that form a continuous\ndigital universe of nearly infinite scope.\n* Interface programs sort through this information and produce a virtual world tailored to the user's desire.  The\nmost common interface is that of digital cities that mirror their real world equivalents, but display computer\nsystems, data blocks, and information pathways instead of buildings, people, and highways.\n* Nodes - Nodes in Cyberspace are locations in Cyberspace.  Nodes include Telecom lines, Satellite Uplinks,\nFirewalls, Security Cameras, Remote Controls, Databases, and Virtual Realities.  Different Nodes usually require\nvalid security or payment to use.  Nodes can also hold nasty surprises including alarms and defense programs.\n* Movement - Distances are insignificant in Cyberspace.  Instead, movement is measured in tasks.  Any program can\nperform a number of tasks each turn equal to [Netrunning] skill.  Each node entered in Cyberspace is a task.\nPerforming any [Action] at a node is also a task.",
          ":titles",
          "The Digital Web, The Net, The Network, World Wide Web, The Web"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_high_tech_spacecraft
   * @return {chapter}
   */
  static t_chapter_high_tech_spacecraft = {
    vx_type: vx_core.t_type
  }
  static e_chapter_high_tech_spacecraft = {
    vx_type: nx_tactics_books_high_technology.t_chapter_high_tech_spacecraft
  }

  // (func chapter_high_tech_spacecraft)
  static f_chapter_high_tech_spacecraft() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "High Tech Spacecraft",
      ":summary",
      "* Interplanetary travel is a common reality in the 23rd century.\n\n* Types - Spaceships are mostly cargo and ore mining ships, followed by gas tankers.\n\n* Prismatic Armor - Modern ships have a very thick ablative skin composed of a honeycomb of diamond nano-fibers filled with a highly refractive, radiation and impact absorbing ceramic compound. This armor has a number of beneficial qualities. It deflects energy in random directions which provides radiation resistance, stealth, and energy weapon defense. It fragments and ablates under energy weapon and kinetic impact which shatters incoming	micro-meteors and high speed weaponry and distributes the incoming energy in all directions to prevent penetration. The ablating particles also carry away excess heat in a similar way to evaporation. The resultant particles become a cloud of anti-energy aresol. Any impact strong enough to penetrate the armor will liquify the surrounding armor which quickly solidifies and helps to seal hull breaches.\n\n* Deflectors - Most long-range ships are equipped with a deflector array. The array is composed of a wide bank of closely spaced ionizing lasers and particle beams. The lasers ionize the particles and form a strong magnetic force down the length of the beam. Small objects headed toward the ship are ionized by the beams and then redirected away by the magnetic field. Point defense lasers are used for larger particles as well as incoming missiles.\n\n* Propulsion - Propulsion spaceward (outward from the Sun) is often provided by massive Stellasers that reflect and concentrate solar radiation into a 'tight' beam similar to a laser. Ships have depolyable solar sails to capture this energy for propulsion and recharging batteries. These sails can even be used to slowly tack inward. Some cargo ships use particularly large sails to slowly sail the solar wind to reduce costs. Most ships rely on powerful nuclear thrusters for sunward (toward the Sun) travel to accelerate the ship at up to 1g. When possible the ship will accelerate for half the voyage, turn around, and then decelerate for the rest of the trip.\n\n* Gravity - Except for short periods of weightlessness midway through the trip, the passengers feel gravity during the trip. Up is toward the nose and down is toward the engines. The internal organization of a ship is very similar to a skyscraper. For fuel and reaction mass reasons, the ship may need to travel at slower speeds (and lower gravity) or coast at zero gravity midway through the trip. For this reason, large ships are often equipped with rotating decks to simulate gravity for the crew.\n\n* Reentry - Spaceships are generally too heavy and not equipped to survive a landing on anything larger than a small moon. Landing on something as massive as the Earth's Moon is possible, but achieving orbit again requires a powerful Laser Lifter system like the one on Luna.\n\n* Travel Costs\n** Planet to orbital station skyhooks travel daily and cost 200-300 credits one-way.\n** Orbital to moon travel twice weekly and cost 600 credits one-way.\n** Interplanetary trips are like cruises. They travel weekly and cost 20,000-30,000 credits\none-way.\n\n* Safety - Inner ship walls are covered with pillowy-soft panels of 'Space Gel'. This viscous fluid provides a combination of heat insulation, impact padding, radiation shielding, shrapnel absorption, and depressurization protection. Space Gel exposed to freezing temperatures will immediately harden into a very durable solid. If the hull is breached, damaged panels will leak Space Gel. Any gel that touches an area near the breach will instantly freeze, gradually plugging the leak.",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "High Tech Commercial Spacecraft",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "High Tech Commercial Spacecraft",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Shuttlecraft",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Shuttlecraft"
            ),
            "Cargo Spacefreighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Cargo Spacefreighter"
            ),
            "Ore Spacefreighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ore Spacefreighter",
              ":summary",
              "* Magsail ship"
            ),
            "Gas Spacefreighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gas Spacefreighter"
            ),
            "Space Rescue Ship",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Space Rescue Ship",
              ":reference",
              "Event Horizon",
              ":summary",
              "Emergency Medical and Rescue Craft"
            ),
            "Star Explorer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Explorer",
              ":summary",
              "Scout Vessel"
            ),
            ":Spaceliner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Spaceliner",
              ":summary",
              "Luxury cruise liner for tourism or transport",
              ":titles",
              "Starliner"
            )
          )
        ),
        "Fighter Class",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Fighter Class",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Star Bomber",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Bomber"
            ),
            "Star Figher",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Figher",
              ":summary",
              "* General purpose space fighter that can be fitted with special purpose gear."
            ),
            "Star Interceptor",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Interceptor"
            ),
            "Star Torpedo Bomber",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Torpedo Bomber"
            )
          )
        ),
        "High Tech Shuttle Class",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "High Tech Shuttle Class",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Assault Shuttle",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Assault Shuttle"
            ),
            "Eagle Lunar Transport",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Eagle Lunar Transport",
              ":summary",
              "* The Eagle is the primary form of transportation for the inhabitants of the various moons of the Solar System. A multipurpose craft, it is divided into three basic sections; the command module, the service pod, and the superstructure. It is powered by four nuclear fusion rockets, and carries fuel reserves for 48 hours of flight.\n* Type A Transport Eagle is fitted with the standard passenger pod and is capable of holding 8 passengers (up to 12 in an emergency), in addition to the pilot and co-pilot.\n* Type B Freighter Eagle is used for transporting supplies, equipment and minerals. They can also be used as space-borne tankers for refueling.\n* Type C Reconnaissance Eagle comes equipped with various types of sensory devices for exploratory missions.\n* Type D Rescue Eagle, identifiable by the bold red stripes on the pod, has been adapted for field diagnosis and treatment of injury or disease. Manned by medical personnel, Rescue Eagles are equipped with mobile beds, patient-monitor units, and facilities for field surgery.\n* Type E Laboratory Eagle is equipped with a remote laboratory and can be used to locate and refine crude minerals, eliminating the need to transport bulky raw ores. It can carry food and water and recycle air to support the team for several weeks.\n* Specialty Modules include a the winch platform used to disperse nuclear waste canisters. There is also an additional booster unit that can be added to the super-structure which can increase the range and power.",
              ":titles",
              "Eagle",
              ":speed",
              "162 Mkmh",
              ":mass",
              "238 tons",
              ":length",
              "23m",
              ":range",
              "26 Bkm",
              ":width",
              "9m"
            ),
            "Lunar Rail Capsule",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Lunar Rail Capsule",
              ":summary",
              "* A small pod launched from a Lunar Rail Gun. Passenger Capsule are launched from 80 mile long Rail guns at 1G. Cargo capsules are launched from 2 mile long Rail guns at 40G. They are then captured in lunar orbit by drones and lunar satellite bases."
            ),
            "Star Gunship",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Gunship",
              ":summary",
              "* General purpose heavy weapons platform that can be fitted with special purpose gear."
            ),
            "Heavy Star Bomber",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Heavy Star Bomber"
            ),
            "Reconnaissance Shuttle",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Reconnaissance Shuttle"
            ),
            "Star Torpedo Boat",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Torpedo Boat"
            )
          )
        ),
        "Frigate Class",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Frigate Class",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Assault Star Carrier",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Assault Star Carrier"
            ),
            "Missile Frigate",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Missile Frigate"
            ),
            "Siege Frigate",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Siege Frigate"
            ),
            "Star Destroyer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Destroyer"
            ),
            "System Defense Corvette",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "System Defense Corvette",
              ":summary",
              "Interplanetary Defense"
            )
          )
        ),
        "High Tech Cruisers",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "High Tech Cruisers",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Star Battleship",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Battleship"
            ),
            "Star Carrier",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Carrier"
            ),
            "Star Cruiser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Cruiser"
            )
          )
        ),
        "High Tech Dreadnoughts",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "High Tech Dreadnoughts",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Super Star Battleship",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Super Star Battleship"
            ),
            "Super Star Carrier",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Super Star Carrier"
            )
          )
        ),
        "High Tech Satellites",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "High Tech Satellites",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Communication Satellite",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Communication Satellite"
            ),
            "Damocles Orbital Laser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Damocles Orbital Laser",
              ":image",
              "HighTech/DamoclesSatellite.jpg",
              ":summary",
              "* Orbital Laser Platform designed for strategic strikes against land targets. May also be used agaist\nlarge orbital targets or for asteroid defense."
            ),
            "EMP Satellite",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "EMP Satellite",
              ":reference",
              "* What's it going to be, Plissken? Them or us? I shut down the third world, you win they lose. I shut\ndown America, they win, you lose. The more things change, the more they stay the same. - Snake Plissken,\nEscape from LA",
              ":titles",
              "Goldeneye"
            ),
            "Hunter Killer Satellite",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hunter Killer Satellite",
              ":summary",
              "* A combat ready satellite often masquerading as a peaceful version. Hunter Satellites act like UAV's\nquietly patrolling until their weaponry is needed, then they are disposable.",
              ":titles",
              "Battle Satellite"
            ),
            "Orbital Skyhook Satellite",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Orbital Skyhook Satellite",
              ":summary",
              "* Large rotating satellite in low orbit. Its purpose is to drop its kilometers long tether to dock with a [Suborbital Shuttle] and use its momentum to fling the shuttle into higher orbit. A few of these Skyhooks at different orbits can pull a shuttle all the way into high orbit. Pulling up shuttles gradually degrades the satellite's orbit, but fortunately, the same system can be used in reverse to slow orbital craft without using fuel which returns lost momentum to the Skyhook."
            ),
            "Solar Reflector Satellite",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Solar Reflector Satellite",
              ":summary",
              "* These are massive, lightweight solar mirrors that can be focused for variouse purposes. They can focus light for solar farms, generate light for long nights like on the moon, generate thrust by light pressure and by heating ablative drives."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_jovian_chronicles
   * @return {chapter}
   */
  static t_chapter_jovian_chronicles = {
    vx_type: vx_core.t_type
  }
  static e_chapter_jovian_chronicles = {
    vx_type: nx_tactics_books_high_technology.t_chapter_jovian_chronicles
  }

  // (func chapter_jovian_chronicles)
  static f_chapter_jovian_chronicles() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Jovian Chronicles",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Orbital Revolution",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Orbital Revolution",
          ":summary",
          "Events Leading to War\n* Air Tax\n\nOverview of the War\n* Rock War\n\nAftermath\n* Terran Union",
          ":scenariomap",
          vx_core.f_new(
            nx_tactics_base.t_scenariomap,
            "Rock War",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Rock War"
            ),
            "Battle in the Depths",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Battle in the Depths",
              ":summary",
              "* An undersea fission cannon is discovered before it becomes operational.\n* A squadron is sent ahead of the fleet to destroy the cannon before it\nis brought to bear on the fleet.\n* The base defenders need to stall for 10 minutes until the cannon can be\nfired destroying most of the fleet. 5 minutes later a second shot will\nensure victory.\n* The battle takes place completely underwater."
            ),
            "Destroy the Downlink",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Destroy the Downlink",
              ":summary",
              "* The rebels choose to destroy a microwave receiver converting power from\na vast orbital solar satellite array. If they can destroy it, the entire\narea will be without power and defenseless for days allowing the rebels\nfree reign to take territory.\n* The defenders realize the vulnerability of the station and it is\nheavily defended."
            ),
            "Rat Warren",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Rat Warren",
              ":summary",
              "* The mechs stationed to defend the city are cut off from reinforcements.\n* The rebels see an opportunity, but they have only powersuits and their\nwits to take the colossal defenders down. They can use the sewers and\nsubways as cover to launch hit and run attacks."
            ),
            "Traitorous Acts",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Traitorous Acts",
              ":summary",
              "* An surprise attack is launched on a munitions depot, but there is a\nproblem. The defenders are not surprised: there is a mole in your group.\n* Attackers have a superior force, but one of them is a traitor. They\nwill have to watch their backs.\n* Defender secretly chooses one attacking unit as the traitor and can\nchoose to activate it at any time."
            ),
            "Joy Ride",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Joy Ride",
              ":summary",
              "* A young, hotshot rebel manages to sneak into an enemy test facility and\nsteal a prototype mecha. The whole base is on his tail, and he will need\nto use urban cover and speed to try to get away."
            ),
            "Train Spotting",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Train Spotting",
              ":summary",
              "* Ambush a mag-lev train and stop it before it escapes.\n* Attackers must disable the train and destroy the defenders.\n* Defenders must escape or drive off the attackers."
            ),
            "Breaking Damocles",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Breaking Damocles",
              ":summary",
              "* The Damocles is an orbital facility equipped with a powerful laser. Its\nexistence has put major pressure on Earth governments to comply with UEA\ndemands.\n* Attackers must placed explosives along the edge of the facility and\ndestroy the attitude control thrusters to send the facility into a death\nspiral that would make it burn up in orbit. Hopefully, it will crash in\nan uninhabited area.\n* Defenders must destroy the attackers or the explosives to prevent this\nnightmare scenario."
            ),
            "Moon Rocket",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Moon Rocket",
              ":summary",
              "* A huge rocket is about to be launched from its silo in a crater on the\nMoon.\n* The attackers must destroy the launch silo or failing that the missile\nitself before it leaves the combat area. Critical hits on the missile\nmay cause it to explode, destroying the launch base."
            ),
            "Mirage Storm",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Mirage Storm",
              ":summary",
              "* Two recon mechs gather intelligence around Jupiter but are pursued. The\nrecon units try to even the odds by flying into the atmosphere directly\ninto a super storm. The storm plays havoc with normal sensors, but the\nrecon units can sort out the jumble of sensor data.\n* The 5 attackers must destroy the 2 escaping mechs.\n* The defenders must drive off or destroy the superior attackers.\n* Special Rules: For each defender place 2 additional ghost mechs on the\nbattlefield. These represent false image data produced by the cloud.\nAfter each attack, the defenders may secretly switch which unit is\nthe real mech among the three identical images. The ghost mechs are\nobviously immune to all damage."
            )
          )
        ),
        "Jovian Odyssey",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Jovian Odyssey",
          ":scenariomap",
          vx_core.f_new(
            nx_tactics_base.t_scenariomap,
            "Dreams OF Phantoms",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Dreams OF Phantoms",
              ":summary",
              "* Call of Jupiter - Jovian scientists discovered an odd life form floating in Juptier's\natmosphere, the Jovian Floater. A floating research station was proposed, but the\nextreme funding could not be secured. Spies for the Venusian Bank determined that the\nFloaters may be responsible for the phenomenon called the 'Call of Jupiter', where\nexplorers to Jupiter have often explained that they were drawn to Jupiter because of\ndreams they had of Jupiter singing to them. This would imply that the Floaters can\ncommunicate telepathically over interplanetary space: an incredible finding.\n\n* Slumbering Eidolon - The Venusians established a top secret floating base in Jupiter's\natmosphere under the noses of the Jovians. The intense atmosphere combined with the\npowerful radiation and magnetic fields effectively hide them from any watching eyes\nabove. Eidolon is secretly supported by a group in the largely lawless Joshua Station\nto procure or ship supplies and provide emergency rescue if necessary.\n\n* Mission - Discover the Slumbering Eidolon and capture or destroy it. They could\ndiscover it by finding a supply or courier ship headed there during a patrol, or stumble\nacross a supporting organization on a Jovian colony. The assault force would\nmost probably consist of two Thunderbolts, one Javelin, and a small number of\nPathfinders and Retaliators. If they choose to capture the Eidolon, a hurried scramble\nas a self-destruct timer counts down and bulkheads slam shut is just as exciting as an\naction-packed firefight in the command center. Agents and reporters are harder to\nintegrate with the destruction of the station, but are more\neasily involved in the discovery process."
            ),
            "Dreams OF Secrets",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Dreams OF Secrets",
              ":summary",
              "* Summary - After the discovery and decomissioning of the secret Venusian research\nstation, the Jovian government found some advanced mech prototypes that the Venusians\nhad been testing in the Jovian atmosphere. This led to the Agora paying more attention\nto a request of assylum from one Dr. Peyarje, and sent the PCs to help retrieve him.\n\n* Dr. Peyarje - UEA has conscripted the brilliant Dr. Peyarje into their service,\nforcing him to develop next generation exo-weapons at a hidden base. In the interests of\nkeeping an appearance of openness, they have allowed Peyarje to attend the 2210\n Intersettlement Scientific Convention (ISC), though he is accompanied by a detachment\nof the UEA military. He has managed to get a plea for help and request for asylum to the\nJovian embassy. His crowning achievement is a telepathic mech control system based on\ndiscoveries found from the Floaters over Jupiter.\n\n* Georgia On My Mind - The players have been dispatched to extract Peyarje from the ISC\nconference in Venus orbit. They are hidden among the large Jovian delegation to the ISC\naboard the Georgia On My Mind space liner. However, in order to smuggle them aboard,\nthey can carry now weapons or equipment and will need an alternate means of escape.\n\n* Stanton Station - A space station in Venus Orbit where the Internation Scientific\nConvention (ISC) is being held. Here, Peyarje will be allowed to present a carefully\ncensored summary of his work on cyberlinkage technologies. The players should take part\nin the early stages of the ISC while they investigate the conference and find a way to\nget Peyarje away from his UEA handlers and off-station.\n\n* Jovians - The Jovians wish to reap the PR benefits to be found in rescuing a brilliant,\npacifist scientist from UEA’s militaristic clutches and also hope that Peyarje can shed\nsome light on some samples of his CAT/Rapid-Scan system found on a secret research\nstation.\n\n* UEA - Unfortunately for these operatives, the UEA is taking the security of their\nprisoner very seriously. The third division of the UEA 4th fleet are moored just off\nStanton, at the invitation of the Venusian Plantary Council, and permission has been\ngranted for several officers and marines to accompany Peyarje as a security detail.\nThough the ISC filed a formal protest over the admittance of UEA military officers\nacting in an official capacity, the issue has since been dismissed and other nations\nhave been allowed to included similarly-limited security details for their detachments.\n\n* Beautiful Dreamer - The PC's meet their contact, Ysa Cantroini and through her, Aglaee\nDessources. Both seem to be independents commissioned by the Jovians. Ysa is surpisingly\ncompetent at many abilities and Aglaee has a ship for escape along with the  characters'\ngear and mechs.\n\n\n* CHARACTER INVOLVEMENT\nJAF pilots could be members of an official JAF escort, added (as mentioned\nabove) to balance out the UEA military forces escorting Dr. Peyarje. The pilots would still be\ninstructed to ask questions and discretely investigate, but would be intended to act as a decoy\nand backup for the real extraction team. By asking questions and poking their noses into places\nthey don’t belong, they would be expected to draw attention away from the real JIS operatives.\nWho could, in turn, be exposed and captured at the last minute, forcing the players to pull off\nthe heist on their own with insufficient planning.\n\nThe players could be the backup JIS team instead of the primary, tasked with investigating and\ndoing footwork for the primary team. This puts them on the front lines, while the primary team\nworks to solidify their own cover. The primary team’s cover could then be blown, forcing the\nplayers to execute the operation, and keeping them on the front lines. This has many hooks for\ncomplications and intruigue. What if the compromised team wasn’t discovered, but betrayed\nby a double agent in their own ranks? This goes well with the scenario (see below) that has\nthe players trapped in hiding on Stanton. What if the Venusians (specifically, Malachai) were\naware of the operation all along and either want the operatives to expose themselves or for the\noperation to succeed/fail for reasons of their own?\n\nReporters have the easiest time finding cover identities - they don’t need them. The ISC is a big\ndeal, and reporters from all over the solar system can be expected to attend. And reporters are\nexpected to be nosy, so no-one’s going to take excessive notice of a few asking questions where\nthey shouldn’t. However, due to their typical lack of combat skills, reporters will probably be harder\nto handle for the actual freeing of Peyarje. They would probably have to resort to subterfuge and\ntrickery if called upon to get Peyarje away from his guards themselves. One possibility is to have\nJIS agents already in place on Stanton handle the snatch, then pass Peyarje off to the reporters\nfor transport, as in the JAF pilots write-up above.\n\nThe 3rd Division of the CEGA 4th fleet is composed of:\n • 2 Tengu carriers with extra vehicle bays.\n • 4 Bricru corvettes.\n • 1 Hachiman destroyer.\n\nOne Tengu carries a Wyvern and three Wraiths, while the other carries four Syreens. The\nsquadron is accompanied by several fuel ships, to give extra range to the short-legged CEGA\nwarships. Garand’s Wyvern is the Command variant. While the Hachiman is technically the\nflagship of the squadron, Garand usually commands from aboard his Tengu where he has easy\naccess to his exo-armor. This can be used to involve Kleb in the scenario without Garand’s\nknowledge - Kleb could be travelling aboard the Hachiman, watching and ready to take command\nshould the situation demand it.\n\n* Escape - The 3rd Divison lacks is deployed far from reinforcements, so it will act\ncautiously. They know that they don’t need to kill the players - they need to capture\nthe Dreamer. The PCs should realize this, and be careful not to let themselves be drawn\naway... For what seems like a retreat could really be an attempt to lure them away so\nthat another force can slip in and disable the Dreamer’s engines."
            ),
            "Dreams oF Freedom",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Dreams oF Freedom",
              ":summary",
              "* Beautiful Dreamer - Rescued from his UEA handlers at the Intersettlement Scientific\nConvention, Dr. Peyarje and his rescuers have fled Venus aboard the Beautiful Dreamer,\nprivateer ship commanded by Aglaee DesSources. Unfortunately, they have not lost the UEA\nforces seeking to recapture Peyarje. The 3rd Division of the UEA 4th fleet, commanded\nby ace pilot Ranho Garand, is in hot pursuit.\n\n* Intercept Course - DesSources’ skillful helmsmanship makes the most of their limited\nreaction mass, but Garand’s 3rd Division is slowly closing in, blocking the orbits they\ncould use to travel out-system. Garand's fleet makes a high energy burn and manages to\nintercept them and another heated battle ensues. After the battle, the UEA force, having\nused their remaining reaction mass to intercept must wait for a fuel tender to continue\nthe pursuit.\n\n* The Long Trip to Earth - Low on fuel, with the UEA pursuit fleet closing in fast, the\ncrew of the Beautiful Dreamer find themselves with only one option: change course and\nhead for the Earth system, the heart of the UEA and the only source of supplies and fuel\nin range. Perhaps they can loose their pursuers in the high-traffic Orbitals and find\nanother way to Jupiter. Because reaction mass is low and they need to run silent, the\ntrip takes many days at zero-g. Many days in radio silence are spent discussing ways to\nget out of this mess."
            ),
            "Moonlight Sonata",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Moonlight Sonata",
              ":summary",
              "* Ismael Li - Fortunately, the Jovians have been working hard to save the mission and\nhave made a deal with a burgeoning rebel group on the Moon which can to provide them\nwith the fuel and parts they need... For a price!\n\n* The Eagle has Landed - Now they just need to avoid the blockade and land on the Moon.\nThough the Moon has very low gravity, the Beautiful Dreamer is not designed to land on\na Moon. Even if they survive the landing, they may not be able to take off again.\nHowever, there is no choice in the matter. After a harrowing landing, the rebels help\nbury the Dreamer in lunar dust and begin repairs and refueling.\n\n* Copernicus Base - The characters are invited to the underground, domed city known as\nCoperinus Base. Here the charismatic Ismael Li introduces them to the harsh life of\nthe Lunar miners. There is nothing to do but wait and meet the pleasant locals while the\nship is repaired and the UEA prepares its next move.\n\n* The Plot Thickens - Gradually, Ismael brings the characters to see supporters and see\nhis gear. Ismael intends to lead a rebellion to take over Copernicus Base and he needs\nthe characters' help. His group lacks seasoned fighters and they lack tactics,\norganization, and strategy. This revelation sparks a heated debate over the wisdom of\nthis endevour. No one can argue that their situation is difficult, but even if they\nsucceed the Lunar Authority and the UEA will not just sit back and allow a rebellion.\nIsmael argues that once they seize control, the Lunar Authority will have to negotiate.\nOthers fear a strong, military response. Any armed conflict in a space station is\nloaded with risk. If one of the characters befriends or falls in love with one of the\nrebels, it would add a more personal edge to the rebellion.\n\n* Eleventh Hour - With or without the characters' help, Ismael begins to grease the\nwheels of revolution through raids, assassinations, sabotage, and public relations\ncampaigns. Their target is Captain Ansevik the head of Copernicus security. If they\ncan capture her, they believe they can secure the base.\n\n* Moon Strike - After providing the characters with the repairs and fuel they need, he\nlaunches his armed uprising in the depths of Copernicus hoping to drag them into the\nfight. Moving barricades outwards at carefully-regulated intervals, his troops and\nexo-suits advance through the dome, driving out the UEA bureaucrats and policemen as\nthey go. The few initial firefights go well for the rebels.\n\n* The Tide Turns - About six hours into the fighting, things begin to turn. Ansevik\nmanages to get her exo-suit forces into Copernicus, and their numbers mean bad things\nfor the rebels.\n\n* Evacuation - Catherine Glit starts an evacuation of refugees. The rebels lift as many\nto hastily-contracted merchant and passenger ships in lunar orbit as they can. Things\nbecome even more chaotic as the Selenties abandon their posts and the rebels fall back\nbefore the UEA forces. Organizing such a retreat is no easy task. Dessources takes as\nmany refugees as possible aboard the Dreamer. Ysa wants to help the rebels fight. The\ncharacters should be involved in the fighting or evacuation effort somehow. After all,\nit was their presence that provided the catalyst that started the rebellion.\n\n* Escape - Her holds crammed with refugees and UAE ships starting to move in, Aglaee\norders the characters back to the ship. Greatful for their help, Li lets them go. He\nsends Catherine Glit with them at the last minute, against her wishes. As the characters\nhead for the spaceport, the rebels begin another counter-attack, slowly forcing the UAE\nground troops back and taking the spaceport and ground-to-orbit weapons. The citizens\nwho couldn’t be evacuated riot, pelting helpless UEA infantry and marines with rocks and\nbricks. Things are obviously not going well for the UEA troops.\n\n* Copernicus Dome Disaster - Ansevik realizes that the rebels could use the city's\nground-to-orbit weapons to attack his warships. He must now choose whether to withdraw\nor fire on the defensive batteries. In a panic, Ansevik orders his ships to attack the\nlaser and missile batteries. The resulting explosions are far larger than expected and\nshatter the dome. A hasty retreat ensues as the Dome opens to vacuum, killing rebel,\ncivilian, and UEA marine alike.\n\n* Chaos -  Ismael Li operates the Laser Lifter to boost the refugee ships away, including\nthe Dreamer. Li's last words, relayed to his friends and helpers aboard the Dreamer, are\nMy life for freedom! The Dreamer attempts to escape with the other refugee ships, but\nthe UEA ships are positioned to easily stop them. The UEA demands their surrender, but\nthe UEA ships are then ordered to focus on rescue instead of pursuing the refugee ships.\n\n* Aftermath - In the end, thousands are killed in Copernicus Dome. The UEA, of course,\nrefuses to take the blame for the Dome disaster. Their first desperate response is to\nput the blame on the Jovian terrorists who abducted Peyarje. Reporters use Ansevik’s\nactions as fodder for their own counter-attack against UEA’s propaganda.\n\n* Notes - Develop the rebellion and the rebels, especially Ismael Li. Emphasize the\nmoon’s restrained and industrious culture and the rampant poverty and utilitarian\nnature of the underground cities. If appropriate, show the corruption of the UEA\nofficials that oversee the colonies. Play up the initial hope and final despair of the\nrebels, the desperation of the refugees to find a better life, and the chaos of\nclose-quarters fighting in the Lunar warrens."
            ),
            "Dreams of War",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Dreams of War",
              ":summary",
              "* Mission to Mars - The UEA is in pursuit again and logically expects the Dreamer to\nhead to Jupiter. However, with its high speed escape and her holds crammed with refugees,\nthere’s no way for the Beautiful Dreamer to make Jupiter without running out of supplies\nor fuel. Fortunately for her crew and desperate passengers, the ship can easily make\nMars. There, Aglaee DesSources hopes that the Martian Republic will be able to provide\nhomes to the refugees.\n\n* Decoy - The UEA pursuit will soon catch up and they cannot be allowed to follow the\nDreamer to Mars, so a desperate plan is devised. The booster rockets from the Moon are\nremoved and fitted with decoy gear to make the rockets appear as the Dreamer. The pilots\nwill escort the rockets on the current course while the Dreamer makes a course\ncorrection and silently coasts towards Mars. The escort will engage enemy mechs drawing\nout the enemies resources while maintaining the charade as long as possible. Once the\ndecoy is discovered the pilots must return to the rockets and activate the massive\nrockets to boost away at high speed to rendevous with the Dreamer. This plan is loaded\nwith risk and the pilots will probably be caught or killed. Their farewell is long and\nemotional. After the Moon, the pursuit fleet commander has been ordered to kill everyone\naboard the Dreamer both in revenge and to eliminate witnesses. When the UEA pursuit\nfleet catches up to the decoy, a heated fight begins with no quarter given. Because the\nUEA is out for blood, they focus on the pilots instead of the 'Dreamer'. The pilots are\ndriven back and the ruse is discovered. The pilots must make a desperate dash to the\nbooster and escape before they are blown out of the sky. Fortunately, they escape though\nwith heavy losses and damage and rendevous with the Dreamer on schedule. The UEA fleet\nhas overcommitted to Jupiter and are unable to pursue to Mars. Anxious days pass as the\nDreamer travels at full speed to Mars. When they arrive they will have to hope that the\nMartian government doesn't arrest them on the spot. Meanwhile, Garand has deduced that\nthe refugees will divert the Dreamer to Mars (because that's what he would do), but his\ndisgust with his superiors' handling of the battle on the Moon causes him to go to Mars\non his own.\n\n* Mars Arrival - The Dreamer enters Mars orbit and is immediately escorted by a fighter\nwing and two destroyers. The escort demands that the Dreamer stand down all weapons and\nprepare to be boarded. They have little choice in the matter. There is nowhere else to\ngo. The boarding party secures the engine room and bridge and dock the Dreamer at the\nmassive Orbital Elevator space station called Heaven. All passengers are taken to\nimmigration while their ship is searched. Here they meet Yanna Summers, the chief\nadminstrator of the Elevator. Little information is forthcoming and all senior staff are\nto be taken by shuttle to Mars Federation police headquarters. As they descend, they get\nan amazing view of the incredible Orbital Elevator in action.\n\n* Stairway to Heaven - Constructed with the aid of Venus Bank, the Martian Orbital\nElevator, Stairway to Heaven is a marvel of engineering. It stretches upwards from its\nbase at Hell Station just north of the Federation capital of Kurtzenheim to the Heaven\nStation counterweight. The elevator is dominates the landscape and has become a symbol\nof Mars Federation authority. It shines like a moon day or night, and it catches the\nfirst light of day every sunrise before the rest of Mars. Its ore containers crawl up\nand down the tether 24 hours a day. The current chief adminstrator, Yanna Summers, is\nextremely organized and professional and keeps very tight ship.\n\n* Martian Politics - Since its creation, the Orbital Elevator has become the center of\nMartian politics. Mars has two major political factions: the Mars Federation and the\nFree Republic of Mars. The Mars Federation is an authoritarian regime. It controls most\nof Mars and is loosely allied with the UEA. The Free Republic of Mars is smaller and is\nlargely at odds with everything the Federation does. The Orbital Elevator has become the\ncenter of Martian debate because the Federation controls the Elevator and the huge\nprofits it produces will allow the Federation to dominate the Free Republic in just a\nfew years. Open conflict on Mars has become common and numerous terrorist organizations\nperform increasingly savage raids on the Mars Federation. The Federation in turn blames\nthe Republic of backing the terrorists which is not entirely without merit.\n\n* Life on Mars - At police headquarters, they must negotiate for asylum for the\nrefugees and avoid arrest and extridition to the UEA. They meet with Paul Treben of the\nSolar Police who is surprised to learn of the unofficial version of the events on the\nMoon. He will report everything he learns to his superiors who will in turn secretly\ninform the UEA. Representatives from both political factions arrive intending to use the\ncharacters to their own ends. The Mars Federation wants to extridite the characters as\nterrorists, but the Free Republic grants the refugees asylum and puts a hold on the\nextridition of the crew of the Dreamer.\n\n* Waiting Around - Support for the UEA is weak here, so the characters are released for\nthe time being, though they are escorted by an armed detail at all times. Garand and his\nelite unit are also poking around and soon confronts the high profile characters, but he\nhas no authority on Mars and can do nothing while the characters remain. In the meantime,\nthe refugees are brought to the Free Republic and a media circus begins as their stories\nhit the airwaves. The public is shocked and sympathetic to the Selenites, but this soon\nturns to rage as it becomes clear that the same thing could happen to them. The normal\nprotests for fair use of the Orbital Elevator break out into massive riots and terrorist\nactivity spikes across Mars.\n\n* Dangerous Liason - Though the govenments seems to treat the characters like criminals,\nthe public treats them like celebrities or even heroes. While out and about, a pretty\nyoung woman approaches one of the males and gushes about how wonderful he is and leaves\nhim her contact code on a slip of paper. After further inspection, the contact code is\nnot a personal address but a secure web site. Following the link, they speak with the\ngirl, Lydia Ketchum, but her manner is very different. She is a political radical who\nhas been implicated in terrorist activity including attacks on police and bombings. She\nis proud of her actions and believes that giving her life for a free Mars would be a\nfair trade. She proposes a daring escape plan. Her people will help smuggle the\ncharacters up the elevator in a depressurize ore car. There they must fight their way\nthrough the station, take over the administration headquarters, and release their ship\nand mechs from impound. Her people can then use the station defenses to cover their\nescape. With the station under her control, she can negotiate fair use of the elevator\ngoing forward from a position of strength.\n\n* Departure - Lydia's plan does not sound entirely rational, and she is not the sort of\nperson who can be trusted. However, without allies the characters are never going to\nescape Mars, so they have no choice but to take a chance regardless of the consequences.\nCatherine and Ibrahim are unsure of their long-term safety on Mars and decide to join\nthe group to continue all the way to Jupiter despite the risks.\n\n* Hell Ride - After days of planning, Lydia's people distract the guards and the\ncharacters make a run for it. After they make their escape, they are swiftly taken to\nan ore processing plant and smuggled aboard an ore train car. In the train are guns,\npressure suits, Lydia, and four of her people. The train goes to Hell station where the\ncars are searched. Tense moments pass as they wait for the inspector to get to their\ncar. When he opens the car, he looks right at them, winks at Lydia, waves his scanner,\nand lets the car pass. The characters must take care not to be crushed when the train\ncontents are dumped into an elevator crawler. Soon, the crawler begins its long, slow\ntrip up the elevator.\n\n* Heaven Sent - When the elevator arrives at Heaven, its contents are dumped into an\nopen bin. More of Lydia's sympathizers help them bypass security forces. Now the\ncharacters need to get to Heaven's Command Center with as little bloodshed as possible.\nComplicating the situation, Garand appears on a screen. He and his men have commendeered\nan elevator crawler and are on their way up with their mechs. Though Heaven is a huge\nstructure, it is not a military installation, so with the help of sympathizers, getting\nto the Command Center is surprisingly easy. Yanna is enraged, but her actions are always\npragmatic, so she surrenders the Command Center when the odds are stacked against her.\n\n* Elevator Falls - Once Command is secured, the way to the Dreamer is open. Lydia says\nshe will cover their escape and then begin negotiations with the govenment for release\nof the station. She is, of course, lying. After the Dreamer departs, she does help the\nDreamer escape by threatening the UEA ships who cannot fire on the station, but once the\nDreamer is clear, she turns Heaven's weapons on the tether. As the support is destroyed,\nHeaven begins spinning out of orbit while the elevator cable begins to fall, slowly at\nfirst, then faster and faster. Garand uses his mech to punch free of the doomed elevator,\nbut he is a very low orbit. The damage from the cable's impact is incredible, as the\nwhite-hot dimond-fiber cable slams into the red dust at several times the speed of sound.\nThe elevator is more than one and a half the length of the planet's equator and slowly\nwraps itself around Mars destroying everything around it for miles. The impact raises a\nmassive cloud of dust and leaves a huge canyon visible from space. The destruction is\nunequalled in the history of mankind. The death toll is in the millions. The UEA must\nrescue Garand and Heaven station, so the Dreamer crew can begin the sad trip to Jupiter."
            ),
            "Dreams of Death",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Dreams of Death",
              ":summary",
              "* Epilogue - The Heaven crew is rescued from a harrowing tumble into space, but the\nstation spins off into space. Lydia proudly takes full credit for the assault in the\nname of a free Mars. There is little doubt that Lydia will be tried and executed which\nseemed to be her plan from the start. Her testimony makes it seem that she duped the\nDreamer crew into fighting her battle for her. There are many, however, who draw a\nconnection between the Dreamer crew and the disasters on the Moon and Mars. They are\nnot officially terrorists, but you wouldn't know it from some of the news stations. The\nelevator disaster almost exclusively harmed the Mars Federation which shifted the\nbalance of power back toward the Free Republic, which was Lydia's intention. Garand was\nsaved by a daring low-orbit rescue. The UEA uses his story and the elevator fall to try\nto deflect attention from their crimes on the Moon, but the UN determines that the\nCopernicus Disaster was an act of state oppression and that the UEA should be subjected\nto sactions.\n\n* Jupiter - With fresh supplies and full fuel tanks, the Dreamer is easily able to make\nJupiter. There, Dr. Peyarje transfers to the JAW Skunk Works team on Joshua Station.\nHis new thought control system is refitted into the new Prometheus prototype mech.\n\n* A Mad Plan - The UEA leadership assesses their situation are are not happy at all.\nThey invested massive resources developing Dr. Peyarje's mech control system to gain the\nupper hand, but now that technology will shift military power toward the Jovians instead.\nTheir actions have caused the Selenites to openly hate and fear them. The Martian\neconomy is in ruins with their ally the Mars Federation hit hardest. The Venusian Bank\nis still behind them, but they won't be if UEA influence collapses. The military proposes\na heartless plan: destroy the Jovian colonies now before the new technology can be used\nand the entire Solar System will fall under UEA control. The Venusians can be bought off.\nThe disasters on the Moon and Mars leave them in no position to fight back. The other\ncolonies are too small and will have to fall in line. All of this chaos has created an\nopportunity to establish a new order, but the time to act is now.\n\n* The Hammer Falls - The 4th Fleet, still assigned to recover Peyarje and waiting just\noutside of Jovian space, is ordered into action. The Elysee Station sensor net has been\ndisabled by a UEA agent, allowing the fleet to close with the colony undetected. A\npowerful jamming device has been deployed by the fleet to prevent the station from\ncalling for help. The ships and mechs are ordered to attack Joshua Station to disable\ntheir defenses and force them to negotiate the extradition of the 'terrorists'.\nUnknown to them, their attack is a diversion for an elite squad of marines in exo-suits\nwho will use retro-rocket packs to deorbit Elysee Station. Their real plan is to send\nthe capital colony and all its inhabitants plunging into the Jovian atmosphere within\ntwenty-four hours. With its leaders and their central hub gone, the Jovians will fall\nunder UEA control.\n\n* Dragonstriker - On Joshua station, the characters are introduced to the new elite\nVindicator mechs as well as the prototype Prometheus. Each have been fitted with the new\nCAT control system, but have yet to be tested. Suddenly advanced warning alarms sound,\nthe station is under attack! Ranho Garand's team of elite mechs are charging toward the\nstation, his massive Dragonstriker armor slicing through the Jovian defenses. His\nintense will and discipline give him near-perfect control over the still imperfect\ncontrol system fitted to the prototype Dragonstriker. The characters launch to meet him,\nand the Dreamer hastily launches to lend support to the defending destroyers. All long\nrange communications are disrupted by jammers, so a courier ship is sent to warn the\nother colonies. The battle is intense, but before it can be resolved, the courier\nreturns. The pilot, Carl DeMers, broadcasts a warning when the interference clears:\nthere is another larger force that has attacked Elysee station! They have fixed rocket\npacks to the hull and are decelerating the entire colony out of orbit! Everyone at\nElysee will die when the station breaks up in Jupiter's atmosphere.\n\n* Taking Sides - Kleb’s total lack of honor have pushed Garand’s loyalties to the\nbreaking point. If he finds out about the true plan for Elysee, he will turn on Kleb’s\nfleet. This will cause other fleet elements loyal to Garand to turn or withdraw from\ncombat. The mechs board their ships are are quickly, re-outfitted on the short trip to\nElysee.\n\n* The God and the Dragon - They arrive at Elysee to find the battle in full swing, with\nthe Jovian forces slowly being driven back by the UEA Fleet, and the retro-rockets are\njust beginning to fire. The JSS Godsfire, its weapon block mauled by enemy fire, is\ntrying to evacuate as many civillians as it can, using its remaining firepower to keep\nthe UEA exos and fighters at a distance. Two teams are deployed: one to fight the UEA\nspecial forces and disable the rockets, and the another to battle the UEA fleet. The\narrival of the Prometheus and Dragonstriker, and a detachment of other exo-armors,\nquickly turns the tide of battle. The battle seems unlikely to be resolved soon, thanks\nto the power of Kleb’s Posideon flagship. Garand confronts his former boss, and flies\nstraight toward the Posideon. The Dragonstriker is heavily damaged by the fire, but\nmanages to clamp unto the Posideon's bridge and opens fire at point blank range. The\nDragonstriker and Posideon go up in a massive explosion, damaging nearby ships. The tide\nof battle suddenly turns. Many UEA soldiers were unhappy with Admiral Kleb's actions and\nare easy to convince with impassioned plees. The rockets are disabled and Elysee station\nuses its engines to regain its correct orbit.\n\n* Epilogue: Garand - Of Garand, no remains are found. While he could have escaped in the\nescape pod, it seems unlikely that he survived. That the CSS Karana, an Uller-class\nmissile cruiser believed destroyed during the battle, is missing is noticed during\ncleanup months later, but no connection is ever made between the two events. Garand did\nsurvive, but was horribly wounded, and was recovered later by the crew of the Karana,\nwho had trained under him.\n\n* Epilogue: UEA - Kleb was killed in the destruction of the Scylla’s bridge. The UEA\ngovernment publically him off as a 'lone gunman' who acted without official sanction and\nengages in a ruthless purge of the Navy’s command structure to 'remove any who might\nseek to follow Admiral Kleb’s example'. In fact, they use this to eliminate to expunge\nor marginalize those taught by Garand or 'corrupted' by his philosophy from the upper\nranks. Their shadowy ties to Venus remain as strong as ever, and, much to their relief,\nthe diplomatic repercussions of the Odyssey affair fade away over the next year.\n\n* Epilogue: Venus - Malachai falls into disgrace with VenusBank for his failure to\nproduce results or protect the existance of Project Methuselah, and becomes a\ndissatisfied freelancer. For the next decade he wanders the solar system, hatching mad\nschemes to put him in the good graces of his former employer once more and destroy the\nConfederation. He is eventually captured by SolaPol and disappears. VenusBank begins\nscaling back its operations slightly, uncertain of just how much the Confederation knows.\nNo public or private charges are ever made by the Confederation over the poaching of the\nFloaters or the aims of Project Methuselah, leaving the Bank executives in a very\nunpleasant information vacuum.\n\n* Epilogue: Mars - The consequences of the Martian Elevator take a long time to\nshow themselves. Initially, neither Martian government accuses the other of the\ncollapse. Evidence is sketchy, and the presence of Jovian and UEA agents on-site makes\nthings even more uneasy."
            )
          )
        ),
        "Europa Incident",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Europa Incident",
          ":summary",
          "* The Flashlight Project - Blocked from what they believed to be their rightful control\nover the colonies at every turn by the Jovian Confederation, UEA launched several\ntop-secret advanced weapons projects.  One of the less successful efforts was the\nFlashlight Project, an attempt to develop heavy autonomous drone combat spacecraft.  The\ntwo Lucifer prototypes, the ultimate end result of the project, were ideal for commerce\nraiding.  They could operate for years without more than cursory communication with their\nhome base; their stealth systems could hide them from the most determined sensors; and\ntheir heavy array of particle beam weapons could savage a warship in a single volley.\n* The project turned out to be too complicated and expensive to mass-produce, but the\nprototype was dispatched to Jovian space for 'field trials', with orders to destroy any\ntarget with a Jovian registry it came across. The plan was to disrupt the Jovian economy\nenough to make them more pliable to UEA demands.\n* After the Battle of Elysee, the UEA council determined that the Lucifer would be a\npolitical hand grenade if it was captured. They ordered the Lucifer to self destruct, but\nit had already disappeared in the radiation and magnetic fields around Jupiter, the very\nfields they had relied upon to hide the drone as it went about its work.  Finally, the\ncrew managed to get a signal through, but some interference caused the drone to change\ncourse and crash on Europa instead of self-destructing.",
          ":scenariomap",
          vx_core.f_new(
            nx_tactics_base.t_scenariomap,
            "A Damaged Freighter",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "A Damaged Freighter",
              ":summary",
              "* The UEA Black Eagle Squadron is smuggled aboard the freighter Narsus to recover the\ndatacore of the Lucifer and destroy any evidence. The Black Eagles had planned to slip\nonto Europa undetected after the Narsus dropped into orbit around the moon. Supposedly,\nshe was to be taking on water for a journey up to Ganymede. The plan was that she\nwould deploy the Eagles’ exo-armors, head off to deliver the rest of her cargo, then\nreturn and pick them up a week later. Faulty parts led to an explosion in Narsus'\nengines during her insertion burn. The captain managed to drop the freighter into a\nstable orbit around Europa before the engines completely died, but then, as is\nstandard practice for merchant crews, immediately set off a distress beacon.\n* With all the unexplained attacks in Jovian space lately, an exo-armor patrol is\ndispatched from their carrier to investigate. The crew seems to sincerely have\nsevere engine trouble. Some of the Jovians will have to board the Narsus leaving\ntheir exos tethered to the hull. The remainder stay on patrol.\n* Inside, the freighter is in zero-g and is particularly cramped. The crew's story\nseems to hold up, but the four passengers are uneasy about the situation. The engines\nare in bad shape and are irradiated. The cargo hold has large, sealed, liquid cargo\nbins labeled with warnings as liquid methane. If the Jovians start attempt to open the\ncargo, the captain will lose his nerve and reveal that the passengers are UEA pilots.\nA firefight erupts and the Black Eagles get into the cargo containers and remotely\nopen the cargo bay to vacuum. The UEA troops escape by detonating the Narsus as a\ndistraction (killing the crew, of course) and releasing an ECM scrambler pod. They\nhave clearly descended to Europa somewhere."
            ),
            "Escape to the Ice Planet",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Escape to the Ice Planet",
              ":summary",
              "* With Europa's low surface gravity, the Black Eagle team's exo-armors descend to the\nsurface safely using their own thrusters. Europa’s surface is covered by a thick layer\nof ice. Unlike ice on Earth, this isn’t slippery - it’s nowhere near the freezing\npoint. The surface is perilous with unstable ground and spontaneous geysers.\n* The UEA team radios for a pickup using a small signal booster in orbit. They then\nbegin a tedious search for the Lucifer.\n* The JAF patrol rejoins its carrier and begins a search of Europa.\n* The UEA team eventually discovers the crashed Lucifer but finds footprints and\nvehicle tracks nearby. The data core has already been removed and taken to the small\nresearch station Europa 1. The UEA team breaks the ice beneath the Lucifer to let it\nfall into the ocean below never to be discovered. Then they must follow the tracks to\nrecover the data core before its secrets are revealed and/or silence the witnesses.\n* When the JAF arrives, they must deduce what has happened and race to intercept the\nUEA team."
            ),
            "Hide and Seek",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Hide and Seek",
              ":summary",
              "* Europa 1 is not well guarded, but it is a large facility with lots of staff. The\nUEA must infiltrate the base and quickly locate the data core before the rendezvous in\n12 hours. The station is unarmed, and if a firefight erupts, everyone will flee to the\nunderground shelters. If they run out of time, the UEA may be forced to destroy the\nbase, but this would not guarantee the destruction of the data core.\n* The JAF can immediately land at the base and are introduced to Dr. Han Krieger and\nhis attractive daughter Paula. They have recovered the data core, but did not have\nsufficient equipment to study the downed ship.\n* If the UEA can get close enough they can hack the core remotely and trigger a data\nwipe. They may also threaten to blow up the base if they are not given the core.\nWhether they succeed or not, the UEA will have to retreat back to the rendezvous\npoint or be stranded. When they retreat, the JAF will have to guess at where they are\ngoing and why, but either way they will need to pursue them."
            ),
            "Hell Unchained",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Hell Unchained",
              ":summary",
              "* Suddenly, a large shadow passes overhead. It's a frigate, the UEA pickup has arrived.\nSix exo-armors exit its bay and begin to advance.\n* As the JAF prepare to meet them, the frigate opens fire. Suddenly, there is a deep\ntremor in the ice below. The UEA agents feel it too and stop code. Suddenly, from under\nthe ice, an impossibly brilliant beam of light lances up to engulf one of the\ndescending exo-armors. It doesn't explode but it just melts and disappears in the beam.\nSoon, the ice seems to explode and the enormous black form of the Lucifer rises from\nbelow.\n* With its data core removed and a firefight nearby, it switched to its limited,\nsecondary systems and it is unable to determine friend from foe. Its massive guns are\nclearly building another charge and moments later it fires at the frigate's engines.\nThe crippled engines briefly leak fusing hydrogen before destroying the frigate in a\nnuclear fireball. It then begins to engage the new exo-armors from the frigate.\n* The JAF and UEA will have to quickly come to terms with the fact that the Lucifer\nwill kill them all unless they work together.\n* If the Lucifer escapes, it will boosts off Europa into a tight slingshot orbit\nand then use its ECM systems to hide in Jupiters radiation belt. Without its higher\nbrain functions, the Lucifer is more of a killing machine than an assassin, so it is\nnow a question of how much damage it will do before it is taken down.\n* If the Lucifer is destroyed over Europa, it will crash into the ice and be lost in\nthe depths. Without their pickup, the UEA agents will have to negotiate the terms of\ntheir surrender. Regardless, they will be tried and interrogated for their actions."
            )
          )
        ),
        "Jovian History",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Jovian History",
          ":summary",
          "* Mercury, Helios Station - A permanent colony of 8 million orbiting Mercury is\nestablished. Its orbit puts it constantly in Mercury's shadow protecting it from\nmost of the Sun's deadyly rays. Naturally, it has access to almost limitless\nsolar power. All equipment around Mercury is outfitted with a unique heavy armor\nthat combines hard radiation shielding with solar collection.\n\n* Venus, New Tokyo - The capital of Venus is a sprawling megaplex of 15 million at\nthe North Pole of Venus. Though terraforming has been going on for decades, the\npoles are still the only places where the temperatures are survivable. The city\nis completely enclosed and partially underground. Industry is relegated to the\nwastelands outside. The Venusian bank invested heavily in developing Venus and has\nseen phenomenal growth. The bank now effectively owns the entire planet.\n\n* Earth 2210 - The UAE launches an attack against the Jovian civilian colonies in an\nattempt to push the colonies back into line.\n* Mars, Marsquake - The obital elevator around Mars is destroyed by sabotage, and\nthe enormous, carbon-diamond fiber cable was slowly dragged from orbit as the\nplanet turned. The cable dropped with devastating force, wrapping around the\nequator two and a half times. Fortunately, the sparse population of Mars reduced\nthe scope of the devastation. There is a common joke that Mars is now the only\nplanet with an actual black line at the equator. Hot heads and smugglers have\ntake to racing down the trench created by the cable.\n\n* War Aftermath - Some UAE leaders were found guilty of crimes against humanity\nfor their attacks against the Jovian colonies. The other colonies increasingly see\nEarth as irrelevant to their future. Earth politics is divided on how to proceed.\nThe UAE has gone underground and now covertly funds a paramilitary group of\ndisgruntled combat veterans and pirates in order to further its aims in space."
        ),
        "Jovian Characters",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Jovian Characters",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Aglaee Dessources",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Aglaee Dessources",
              ":summary",
              "* Mysterious, beautiful, and cold, Aglaee DesSources is the captain of the\nBeautiful Dreamer, a privateer vessel. Once an extremely promising CEGA Navy\ncaptain, she retired at the age of thirty to her present position.\n* 42 year old aristocratic-looking woman."
            ),
            "Adrian Allen",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Adrian Allen",
              ":summary",
              "* Adrian is bookish and quiet pilot unlike the adventurous, rowdy Exo-pilot crowd.\nHe is inexperienced and sometimes panics in combat when clear solutions are not\nobvious. He is currently single athough he is attracted to Foxy Fujima.\n* Age: 22"
            ),
            "Madelaine Koudriopoulos",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Madelaine Koudriopoulos",
              ":summary",
              "* Strong willed and tenacious fighter pilot.\n* She is the only daughter of Konrad Koudroipoulos, Khannan's commander. Because of\nthis, she had to fight with pilots who accused her of favoritism and her father who\nmade every effort to get her to step down.\n* She has been teamed up with Adrian Allen who has become like a big brother to her.\nShe interferes a lot with his personal life, much to his despair. She is bold but\nis uncomfortable dating, so she currently has no boyfriend.\n* Age: 21"
            ),
            "Foxy Fujima",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Foxy Fujima",
              ":summary",
              "* Freelance reporter travelling from cylinder to cylinder in search of a story. She\nhas a high attitude of the moral importance of reporting, so she will not cover\ntrival stories which has limited her career development. Her beauty has attracted many\nmen, but she seems to only be interested in her career.\n* Age: 22"
            ),
            "Dr. Agram Peyarje",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dr. Agram Peyarje",
              ":summary",
              "Brilliant scientist researching human/machine interfaces.\nA staunch pacifist, Peyarje is repelled by war in general and utterly\ndisgusted by what CEGA plans to do with his inventions. He sees the Confederation as his best\nhope of escape, even if they too are warmongers."
            ),
            "Dr. Catherine Glit",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dr. Catherine Glit",
              ":summary",
              "* Catherine used to serve as Ismael Li's personal assistant and moderator. She\nis now the representative of the escaping Lunar refugees.\n* She is an excellent doctor, highly regarded by all. While she appears cold\nto everyone, she is shy and only opens up to close friends."
            ),
            "Ismael Li",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ismael Li",
              ":summary",
              "Ismael Li is the leader and driving force behind the burgeoning Lunar resistance movement. Once\na miner, Li worked hard, long hours in the tunnels deep below the Lunar surface and Helium-3\nharvesters. He quit in disgust when he realized that the company he’d worked ten hard years for\nwas constantly operating at a loss and systematically abusing its employees in order to provide\nCEGA and massive Earth corporations with cheap Lunar ores. Using the excellent education\nprovided to all Selenties, Li spoke out against the CEGA \"occupation�?, making speeches and\ndistributing eloquent pleas for regime change in an attempt to awaken the populace to the truth\nof their situation.\n\nFive years ago, under investigation by CEGA and Lunar police forces, Li took his crusade\nunderground. No matter what he did, legitimate means would only get him arrested. He set\nabout building a proper revolutionary organization out of the public eye, aiming to drive CEGA off\nthe Lunar surface by force of arms. Strangely, this has won him many more converts among the\nusually peaceful Selenites than his speaches ever did. He finds this somewhat disheartening,\nbut still forges ahead.\n\nLi is now ready to launch his uprising. The arrival of the PCs has moved his timetable up a bit,\nas their actions on Venus have distracted many of CEGA’s forces and their skills can be a great\nhelp to him. He is a fundamentally honest man, and will promise fuel, parts, and provisions\nin exchange for the PCs’ help. He will give them what he promised without short-changing or\nholding back. He also truly believes in his cause, and would willing sacrifice his life to save any\nof his supporters."
            ),
            "Jovian Floater",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Jovian Floater",
              ":summary",
              "* The Jovian floater is giant, blimp-sized animal filled with gas that lives its entire\nlife floating in Jupiter's atmosphere. It has a unique biology similar to photosynthesis\nthat consumes water, methane, and radiation to produce food. This biology also produces\na short-lived compound that repairs radiation damage to its DNA which allows it to\nsurvive in the harsh radioactive environment. The medical significance of this creature\nespecially to space flight cannot be overstated. How life could begin in such high\nradioactivity remains a mystery."
            ),
            "Luka Ansevik",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Luka Ansevik",
              ":summary",
              "Captain Luka Ansevik is the commander of the small CEGA lunar garrison force. Captain\nAnsevik is throughly unimaginative, a very by-the-book officer, assigned to a post not likely to tax\nher capabilities. After all, what threat could the unarmed and industrious Selenites pose to the\nmilitary might of CEGA? When revolution erupts around her, Ansevik will do her best to contain\nit, but becomes increasing desperate as the situation unravels. She knows that failure to resolve\nthe situation before her superiors are forced to take notice will be the end of her career.\nAnsevik is an officer focused on tactics and administrative work. As such, her combat skills\nare virtually nonexistent - she is much more comfortable ordering others into combat than\nfighting herself. This leads to disaster, as it leaves Ansevik out of touch with her troops as\nthey desperately fight the rebels in the streets of Copernicus. Finally, increasingly desperate to\ncontain the situation, she could be the one to order the dome blown.\n(Ind) Ysa Cantroni\nYsa will be in her element during the Lunar uprising. Action, crusading for justice, and a bevy of\nhuman interest stories to practice her reporting skills on! Having spent a year touring the Earth\nsystem at one point, Ysa has a number of useful contacts on Luna that can supplement those\nprovided by DesSources and Li. Even if she doesn’t travel down from the Dreamer with the PCs\ninitially, she will try to find some way down so she can help the Selenites of Copernicus fight for\ntheir freedom once the uprising begins.\nOf course, Ysa might not be quite as good at tunnel fighting as she thinks she is. Saving her\nfrom herself could be an exciting and frustrating subplot for a PC, especially one who has\nbecome emotionally involved with her. Having a mysterious masked figure in a red CEGA exosuit\n(Garand, of course) help save her and keep her safe from CEGA forces, but carefully avoid\naiding the rebels, might create an interesting mystery... Or not, depending on how sharp your\nplayers are."
            ),
            "Lydia Ketchum",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Lydia Ketchum",
              ":summary",
              "* Lydia Ketchum is a Martian Republic Rook, a Ranger trained for deep-cover operations\nwithin the Federation. One of the Republic’s best rangers, she’s been assigned to watch\nthe orbital elevator. She takes her job quite seriously, and has so far managed to avoid\ndrawing the notice of the Federation.\n\n* Unfortunately, not all is as it appears with Ranger Ketchum. She is from the Isidis\nPlanitia, an isolated area that recently (2207) declared its independence from the rest\nof the Republic. The Isidisians are even more militant about the Federation than\nordinary Republic citizens, and see the Federation’s orbital elevator as a very personal\nand insufferable insult to their national pride."
            ),
            "Yanna Summers",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Yanna Summers",
              ":summary",
              "Yanna Summers is the decidated and hardworking administrator of the Martian Orbital Elevator.\nWhile her actual domain is very small - she only has direct control over Heaven and Hell station -\nthe amount of commerce that travels up and down the beanstalk has given her a sizable amount\nof influence within the Federation’s government. This is counterbalanced by her attempts to open\nFederation society up a little. Her position and efforts, however, did draw the attention of the\nSociety of the Evolved Human, which she eagerly joined when offered membership.\nYanna’s connection to the Society was what lead Aglaee to steer the players towards her, and\ninclined her to help them find a home for the refugees. It also could be what leads to her asking\nthe PCs for help with the scientist case - another test by the Society to help them reach their\npotential. She has contacts all through the Federation bureaucracy, and could use them to help\nthe players with their investigation... But there will likely be a price of some kind, as she’s already\nstretched her resources thin to secure passage for the refugees. This could, however, lead to the\n\"Refugees Under Attack�? subplot. Or Yanna could be a background character that just serves to\nlead the PCs into the episode."
            ),
            "Ysa Cantroini",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ysa Cantroini",
              ":summary",
              "Ysa\nhas spent the past several years travelling the solar system and working odd job. This has given\nher an extremely wide range of skills (though none at more than 2/1 or 2/2) and connections,\nespecially here on her native Venus.\nYsa is bright and intelligent, generally assuming a quiet but cheerful air. She’s a wandering soul,\nand doesn’t think she could ever stay happy in one place or one job for the rest of her life. She\nis seriously considering becoming a reporter, however, as this gives her a way to travel and\nencounter a wide variety of experiences while getting paid and doing good. Much to her shame,\nher father is a high-ranking executive in the Venusian bank. She has cut all ties with him, and\ndoes not regret doing so, but this secret connection could still draw suspicion to her."
            ),
            "Admiral Russel Kleb",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Admiral Russel Kleb",
              ":summary",
              "Admiral Kleb is the throughly corrupt commander of the CEGA 4th Fleet. A hard-line war\nsupporter, Kleb believes the inhabitants of the colonies to be completely inferior to native\nTerrans. This provides him with the justification he needs to take any action in pursuit of CEGA\ndominance. He is in the pay (and service) of the Venusian bank, as they provide him with the\nmeans to further his own ambitions, but he will not hesitate to betray them for his own advantage.\nThey are, after all, just inferior colonists, cowardly employing bribery when they should be using\nrighteous force.\n\n					* Despite his biases, Kleb is a brilliant tactician, equally adept at combat\n					maneuvers and political backstabbing. He is a staunch member of the UEA ruling\n					faction, and an adherent to the warship-centric old school of military thinking. To\n					him, adherents of the exo-centric school are children playing with fancy new toys.\n					Ranho Garand, as the most prominently successful exopilot in the UEA navy and focus\n					of the Dragonstriker program, is a frequent target of Kleb’s scorn."
            ),
            "Ranho Garand",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ranho Garand",
              ":summary",
              "* Commander of the 3rd Division of the CEGA 4th fleet, Garand is an ace exo-armor pilot\nand media darling. Despite his military connections, Garand is a devoted member of\nChang’s political faction. While he does believe the military to be a necessary tool, he\ndoesn’t believe that it is the proper one to further UEA’s domination over their wayward\ncolonies. He was one of UEA’s first exo-armor pilots, and taught many of the current\ngeneration, passing on both his piloting skills and his philosophy.\n\nGarand is a man of honor and discipline, with a spotless service record and excellent\nreputation. He does not enjoy killing or combat, but his honor demands that he follow\norders and defend his people. Despite his iron will, he is prone to fits of irrational\nrage towards those who have forced him to commit (or involved him in) dishonorable acts."
            )
          )
        ),
        "Commercial Spacecraft",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Commercial Spacecraft",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Albatross Transorbital Shuttle",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Albatross Transorbital Shuttle",
              ":summary",
              "* The Albatross is the latest in a long line of shuttles used for cargo and\npassenger transfers to various atmospheres. One or two are standard equipment for\nany large military ship.",
              ":mass",
              "45tons",
              ":speedair",
              "1200kph",
              ":speedspace",
              "1.5g"
            ),
            "Beautiful Dreamer Transport",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Beautiful Dreamer Transport",
              ":summary",
              "* The Beautiful Dreamer, at first sight, seems to be a standard Inari-class liner. As\nwith many Inari, the Dreamer has been modified heavily, and there are many differences\nin the ship’s lines. Two concealed railguns run along the ship’s spine, providing an\nunpleasant and unexpected punch. The cargo bays on the craft’s edges have been modified\nto carry mechs and fighters, complete with concealed catapults.\n* 2 Medium Railguns\n* 4 Mech Bays - Cannot land fighters.\n* 2 Magnetic Catapults",
              ":crew",
              "54",
              ":mass",
              "10000tons",
              ":length",
              "270m"
            ),
            "Inari Space Liner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Inari Space Liner",
              ":summary",
              "* Unlike the bulk transport Mule, the Inari was designed to be a high speed passenger\nliner to get people quickly between the planets. Though not as modular as the Mule,\nthe Inari can be heavily customized to specific tasks. Though it is not a military\nvessel, the Inari is fast and can be modified to be cary significant armor and weapons,\nthus making it well suited as a privateer.",
              ":titles",
              "Georgia on my Mind",
              ":crew",
              "108",
              ":mass",
              "10000tons",
              ":length",
              "200m"
            ),
            "Carver Mining Ship",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Carver Mining Ship",
              ":summary",
              "* The Carver is designed for the purpose seeking out and mining asteroids.\nThe ship is very odd looking with three insect-like legs surrounding the\nmain laser drill. The standard protocol for asteroid mining is to land on\na mineral-rich feature, drill a deep tunnel, and then pressurize the\ntunnel so further operations can be done without environment suits. Ore\nis sent on a conveyor belt to the onboard smelter for separation and\npurification.\n* The Carver is intended to work perpetually. Its drive system is slow\nbut extremely robust, able to use mined hydrogen for fuel and any waste\nmaterial as reaction mass. Small tugs commute back and forth carrying ore\nto nearby space colonies and returning with supplies and spare parts. The\ntugs also carry replacement crew members.\n* The Carver has been in service for so long that their prices have come\ndown dramatically. Since this work is enormously profitable, banks are\nwilling to finance individuals if they can demonstrate a sound business\nplan.",
              ":speed",
              ".15g",
              ":mass",
              "1200tons",
              ":length",
              "80m",
              ":width",
              "80m"
            ),
            "Mule Freighter",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mule Freighter",
              ":summary",
              "* The Mule Freighter is a simple, reliable design for transporting large\namounts of cargo across the solar system. It has no interior cargo hold,\ninstead it has a series of connectors to link self contained cargo pods\nof various sizes. The connectors can also be used to hook onto asteroids\nor other ships to allow the Mule to act as a tug.\n* The Mule is the most common ship in the solar system and is used by\nevery government and commercial space organization. Because the Mule is\nso versatile, it can even be used as a slow carrier or missile gunboat.\nFor similar reasons, it is a favorite ship for smuggling or piracy as\nwell.\n* Its acceleration reduces as its load increases. It can transport up to\n40ktons before its acceleration becomes too low to be practical.",
              ":titles",
              "Narsus",
              ":speed",
              ".4g",
              ":crew",
              "6",
              ":mass",
              "4000tons",
              ":length",
              "345m",
              ":width",
              "40m"
            ),
            "Ox Orbital Tug",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ox Orbital Tug",
              ":summary",
              "* The Ox is a space-only shuttle used for short tranports between space\nstations, tugbot duty, asteroid transport, and salvage operations. It has\nlarge manipulator arms to manage unusually shaped loads. It is a very\nsturdy if slow craft.",
              ":speed",
              ".5g",
              ":mass",
              "41tons"
            )
          )
        ),
        "Jovian Federation",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Jovian Federation",
          ":summary",
          "* Jovian capital ships are built for easy maintainance and reuse.  They are composed of 4\nsections: engine, cargo, habitat, and mission. All but the mission section can be\ninterchanged with the equivalent sections from other ships. The habitat ring can even be\nremoved for short range missions, or additional cargo modules can be added for greater\nendurance.",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Jovian Pilot",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Jovian Pilot"
            ),
            "Jovian Mech Jock",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Jovian Mech Jock"
            ),
            "Jovian Tech",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Jovian Tech"
            ),
            "Lancer Space Interceptor",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Lancer Space Interceptor",
              ":summary",
              "* Despite the heavy investment in Mech Suits, Jovian interceptors remain\nan important part of Jovian armed forces. Their high acceleration allows\nthem to be sent as the first line of defense ahead of the slower Mech\nSuits. They are well suited to recon and hit-and-run missions. They carry\nvariable weapon pods for specialized recon, ECM, bomber, or long-range\nscouting missions.\n* 1 Light Laser Cannon\n* 6 Light Missiles\n* 2 Medium Missiles\n* 1 Heavy Missile",
              ":mass",
              "50tons",
              ":height",
              "25m",
              ":speedspace",
              "3.2g",
              ":width",
              "10m"
            ),
            "Pathfinder Mech Suit",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pathfinder Mech Suit",
              ":image",
              "JovianChronicles/PathfinderToken.png",
              ":summary",
              "* The Pathfinder is a rugged, simple to maintain Exo Suit design that forms the majority\nof the Jovian Mech forces. It is very agile but relatively fragile and mounts only\nlight weaponry because it is designed primarily as a scout craft. Its high speed,\nagility, and exceptional close combat abilities proved the value of Mech Suit design and\nit remains the most iconic Mech Suit in existence.\n* 1 Medium Particle Cannon\n* 2 Medium Missiles\n* 2 Plasma Lances",
              ":mass",
              "35tons",
              ":height",
              "15.4m",
              ":speedland",
              "26kph",
              ":speedspace",
              "2.8g",
              ":width",
              "11m"
            ),
            "Retaliator Mech Suit",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Retaliator Mech Suit",
              ":summary",
              "* The Retailator is the standard Jovian interceptor Mech. Well-armed and fast for its\nsize, it can take on larger opponents and come out on top. Its speed comes at the\nsacrifice of some armor unfortunately and its thrusters always overheat forcing pilots\nto take great care or risk burned out thrusters.\n* 1 Medium Rail Cannon\n* 4 Medium Missiles\n* 6 Light Missiles\n* 2 Plasma Lances",
              ":mass",
              "42tons",
              ":height",
              "15.5m",
              ":speedland",
              "66kph",
              ":speedspace",
              "2.4g",
              ":width",
              "12m"
            ),
            "Vindicator Mech Suit",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Vindicator Mech Suit",
              ":summary",
              "* The Vindicator is the most powerful mass-produced Mech in the solar system. It carries\nmassive armor and armament, but its high cost limits its use to a few elite pilots. It\nis also painfully slow compared to the Pathfinders and Retailators it flies with.\n* 1 Medium Rail Cannon\n* 1 Medium Laser Cannon\n* 10 Heavy Missiles\n* 3 Plasma Lances\n* 2 Anti Missile Systems",
              ":mass",
              "70tons",
              ":height",
              "16m",
              ":speedland",
              "36kph",
              ":speedspace",
              "1.8g",
              ":width",
              "14m"
            ),
            "Prometheus Mech Suit",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Prometheus Mech Suit",
              ":summary",
              "* The Prometheus was intended to be a prototype for a new generation of mech suits which\nwould be more efficient, better armed, and faster than their predecessors. However, as\ndevelopment progressed, several experimental systems were added that made it a one of a\nkind wonder that could never be mass produced.\n* 1 Heavy Plasma Cannon\n* 2 Light Plasma Cannons\n* 2 Plasma Lances",
              ":mass",
              "64tons",
              ":height",
              "18m"
            ),
            "Prometheus Storm Attacker",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Prometheus Storm Attacker",
              ":summary",
              "* The [Prometheus Mech Suit] can be equipped with a heavy set of extra armor and weapons.\nThe additional mass of the armor is negated by additional thrusters. If these thrusters\nare damaged the armor can be jettisoned leaving a fully functional Promethus.\n* 1 Heavy Plasma Cannon\n* 2 Light Plasma Cannons\n* 2 Plasma Lances\n* 2 Heavy Laser Cannons\n* 1 Particle Scatter Gun\n* 80 Medium Missiles",
              ":mass",
              "82tons",
              ":height",
              "21m"
            ),
            "Athena Destroyer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Athena Destroyer",
              ":summary",
              "* Athena Destroyers function much as their wet navy ancestors. Depending\non the political climate, they are either protective shepards or hunting\nwolves. The Athena's job is to get in the way of danger. If an unknown\nvessel is detected, the destroyer will move ahead into a blocking\nposition to defend the rest of the fleet.\n* The Athena is particularly fast and maneuverable for a capital ship and\nworks closely with any small craft.\n\nWeapons:\n* Point Defense System\n* 3x Particle Accelerators\n* 6x Railguns\n* 2x Area Defense Laser Cannon\n* 1x Missile Bay",
              ":speed",
              ".8g",
              ":mass",
              "10ktons",
              ":length",
              "291m",
              ":width",
              "81m"
            ),
            "Forge Patrol Carrier",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Forge Patrol Carrier",
              ":summary",
              "* Forge class carriers carry 12 pilots including squadron leaders.\n* There are 24 Forge class vessels commissioned.\n* Speed: .8g\n\nWeapons:\n* Point Defense System\n* 8 Rail Cannons\n* 2 Laser Cannons\n* 2 Missile Bays\n\nVehicles:\n* 6x Mobile Suits with room for 12\n* 6x Catapults",
              ":mass",
              "39000tons",
              ":length",
              "460m",
              ":width",
              "285m"
            ),
            "Explorer Scout Ship",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Explorer Scout Ship",
              ":summary",
              "* One of the earliest planetary exploration ships, the Explorer has been\nproduced for many years and is a reliable though uninspired design. Its\nmodular design is its greatest asset and has ensured its continued use\nfor decades. The crew module can be extended on a tether for artificial\ngravity with the other end counterbalanced by a water tank.",
              ":speed",
              ".4g",
              ":mass",
              "1ktons",
              ":length",
              "345m",
              ":width",
              "40m"
            ),
            "Gagarin Fleet Tender",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gagarin Fleet Tender",
              ":summary",
              "* The Gagarin is a mobile tender designed to facilitate drydock style repairs close to the front lines.\n* Its mission hull is a gigantic workshop with huge door sections that can surround and refit a vessel in a\npressurized environment.\n* Speed: .1g\n\nWeapons:\n* Point Defense System\n* 1x Missile Bay",
              ":mass",
              "92ktons",
              ":length",
              "740m",
              ":width",
              "285m"
            ),
            "Javelin Cruiser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Javelin Cruiser",
              ":summary",
              "* The Javelin is the most common warship in the Jovian Navy despite its\nage and lack of interceptor or Mech Bays. Its design is based on\npre-Mech combat philosophy, emphasizing heavy weapons on capital ships as\nopposed to projection of force using smaller craft. Therefore, it is\nvery heavily armed for a relatively small craft including the deadly\nheavy particle beam cannon.\n* Crew accomodations are small but comfortable with cleverly placed\nmirrors throughout the ship that give the illusion of greater interior\nspace.\n* Point Defense System\n* 2 Heavy Rail Cannons\n* 1 Heavy Particle Beam Cannon Turret\n* 2 Missile Bay\n* 6 Space Dart Heavy Missiles",
              ":speed",
              ".6g",
              ":mass",
              "20ktons",
              ":length",
              "235m",
              ":width",
              "72m"
            ),
            "Valiant Strike Carrier",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Valiant Strike Carrier",
              ":summary",
              "* The Valiant Strike Carrier is a ship like no other. Every other ship in\nthe fleet is designed to work in cooperation with one another. The Valiant\nis designed to operate on long range, long term patrols with no backup.\nIt is therefore heavily armed, armored, and carries extensive supplies\nand fabrication facilities.\n* It has two rotating crew decks that are very spacious for a spaceship.\n* 6 Heavy Rail Cannons on 2 Turrets\n* 1 Missile Bay\n* 1 Spinal Particle Beam Cannon\n* 6 Magnetic Catapults\n* 1 Certifuge Crew Module\n* 2 Lancer Interceptors\n* 2 Pathfinder Mech Suits\n* 2 Retaliator Mech Suits\n* 2 Vindicator Mech Suits",
              ":speed",
              ".8g",
              ":mass",
              "40ktons",
              ":length",
              "320m",
              ":width",
              "75m"
            )
          )
        ),
        ":UEA",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "UEA",
          ":titles",
          "United Earth Alliance",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "UEA Commando",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "UEA Commando",
              ":classification",
              "Lt. Infantry"
            ),
            "UEA Marine",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "UEA Marine",
              ":summary",
              "* Standard issue for all regular infantry and covert ops personnel.\n* High Impact Plastics with reinforced joints.\n* Enhanced Sensory gear and Comm System\n* HUD Targeting\n* Optional Backpacks with custom gear",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor"
                )
              )
            ),
            "UEA Mobile Infantry",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "UEA Mobile Infantry",
              ":summary",
              "* Standard issue for assault and special forces personnel.\n* Hardened Crystalline Lattice Ceramic Compounds\n* Elaborate Sensory and Comm System\n* HUD Targeting with Smart Weapon links\n\nPowerful Backpack package including:\n* Ion thrusters\n* Heat Sink\n* Mini Fusion Plant\n* Y-rack gernade launcher (optional I-rack or micro turret)\n* Weapons can be powered from plant\n* Environmental Independence\n* Flamethrowers and Thrusters in arms and legs\n* Stealth options available",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor"
                )
              )
            ),
            "UEA Mobile Assault Infantry",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "UEA Mobile Assault Infantry",
              ":summary",
              "* Form is vaguely humanoid\n* Armor is extremely heavy and hardened\n* Weapons are built in and smart\n* Power Assist and Hand to Hand Weaponry make few obstacles a barrier\n\nWeapon Packages\n* When standing still the armor is considered a fixed weapon platform.\n* Heavy Machine Guns\n* Light Autocannon\n* Multiple Missile Launchers\n\nBackpack Package\n* Large Fusion Plant\n* Improved Heat Sink\n* Thrusters are extremely powerful\n* Wheels in legs for fast road movement\n* Speed and Maneuverability in open terrain are the trademarks of these types.\n* They are clumsy and overly destructive in tight quarters.\n* These models are purely Assault/Scorched Earth types similar to miniature tanks.",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor"
                )
              )
            ),
            "UEA Pilot",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "UEA Pilot"
            ),
            "UEA Mecha Pilot",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "UEA Mecha Pilot"
            ),
            "UEA Tech",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "UEA Tech"
            ),
            "Cerberus Mech Suit",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Cerberus Mech Suit",
              ":summary",
              "* The Cerberus is the first cutting edge Mobile Suit design from the UEA.\n* The name Cerberus comes from the large ECM pods on each shoulder which\ncontinually scan in all directions giving the appearance of 3 heads.\n* The Cerberus is designed as a hit-and-run unit, so it very fast and\nmanueverable but has limited endurance by design. It is only available\nto commanders and elite pilots.\n* 30mm Massdriver with Depleted Uranium/Tungsten rounds. 20 shots.\n* Linked 20mm Vulcan Autocannons in the head.\n* 1 Plasma Lance\n* 1 Mech Combat Knife",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "63tons",
              ":height",
              "17m",
              ":speedland",
              "36kph",
              ":speedspace",
              "1.8g",
              ":width",
              "15m"
            ),
            "Dragonstriker Mech Armor",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dragonstriker Mech Armor",
              ":image",
              "JovianChronicles/DragonstrikerToken.png",
              ":summary",
              "* Mechs are designed to battle other mechs and perhaps cripple enemy capital ships.\nThe Dragonstriker is a unique prototype designed to attack enemy capital ships and\ninstallations directly. It is a massive mech, towering over other mechs and carrying\nformidable weapons to battle both capital ship and other mechs.\n* The Dragonstriker has a detachable booster that provides extra acceleration and range.\nThe booster also houses the 2 Medium Laser cannons for strafing enemy capital ships.\n* 4 Heavy Anti-Ship Beam Cannon\n* 2 Medium Anti-Ship Laser Cannon (2 linked under for strafing attacks, mounted to booster)\n* 6 30mm Vulcan Autocannon (4 linked forward, 2 linked rear in head)\n* 4 Heavy Anti-Ship Missile (4 forward)\n* 2 Anti-Missile Laser Turret (1 forward, 1 rear)",
              ":titles",
              "CXE-01",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "110tons",
              ":height",
              "24m"
            ),
            "Hachiman Destroyer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hachiman Destroyer",
              ":summary",
              "* The Hachiman is the workhorse of the UEA navy. They have been produced\nfor many years with minor upgrades.\n* 1 Point Defense System\n* 6 Railcannon Turrets\n* 2 Missile Bays\n* 2 Laser Turrets",
              ":speed",
              ".6g",
              ":classification",
              "Hvy. Spacecraft",
              ":crew",
              "60",
              ":mass",
              "5500tons",
              ":length",
              "208m",
              ":width",
              "80m"
            ),
            "Lucifer Cybersat",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Lucifer Cybersat",
              ":summary",
              "* The Lucifer’s designed for one purpose - to ambush and kill enemy warships.  Its\nsophisticated Stealth systems allow it to hide and its strong electronic warfare suite\nprevents its prey from calling for help.  Powerful thrusters allow it to accelerate at\nincredible speeds, and a cluster of six small linked particle cannons and two large\nones allow it to inflict massive damage very quickly.\n* Armor - Despite the advanced technology, its armor is quite thin for its size, and\nin a stand-up fight, it will almost certainly lose. The only questions are how to\nforce it into a stand-up fight and how many of its attackers it can take with it.\n* Particle Cannons - The combined power of the dual particle cannons are equal to a\nspaceship's main gun. They have separate fusion engines just to recharge its capacitors,\nbut it still takes 30 seconds between firings.\n* Particle Array - The 6 smaller particle cannons are designed for rapid fire against\nfast moving targets and are used between firing of the main guns.\n* Claws - Its claws are independent wire-guided drones armed with small energy weapons\nto deal with enemy interceptors. The claws are very fast and agile, but not very tough.\nThey can replenish their fuel reserves by docking with the Lucifer.\n* Speed - The drones will almost never use their full top speed, and the Lucifer will\nmake every effort to conserve its remass.  For long-range travel, it won’t boost at\nmore than 0.4 or 0.6 Gs except in short bursts.  Much of its time will be spent\ndrifting along a medium-traffic orbit.\n* Stealth - The Lucifer carries an advanced ECM/stealth package that allows it to\nsneak up on enemies and attempt to cripple them while scrambling any distress calls.\n\nECM(6, 10km), Stealth (6);\nQuantity	Name	Type	Arc	ACC	DM	BR	ROF	Perks + Flaws	Ammo\n1	Particle Cannon Cluster	E	F	+0	x12	4	+4	Hw,Red;AD(2),HEAT	Unl.\n2	Mega Particle Cannon	E	F	-1	x30	7	-1	Red,Hw;AD(2),HEAT;Link	Unl.",
              ":titles",
              "CXS-01B, Automated Experimental Terror Raider",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "95tons",
              ":height",
              "18.8m",
              ":speedspace",
              "4g",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Mission Section",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Mission Section",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    "Stealth Vessel",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Stealth Vessel"
                    )
                  )
                )
              )
            ),
            "Lucifer Claw Drone",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Lucifer Claw Drone",
              ":summary",
              "Armor:	10/20/30\n*Miscellaneous Threat Value (MTV): -\nCrew:	Computer 1 (Dumb, Level 2) (2 actions)\n\nAccessories: Autopilot; Arm: Manipulator Arm (R5, Can Punch); Armor: HEAT Resistant(5); Communications (-2, 2km);\nHostile Environment Protection: Radiation (4), Vacuum, Extreme Cold; Sensors(+0, 2km); Vulnerable to Haywire;\nQuantity	Name	Type	Arc	ACC	DM	BR	ROF	Perks + Flaws	Ammo\n1	Laser Cannon	E	FF	+1	x10	5	+0	Red;AD(1),HEAT	Unl.\n1	Plasma Lance	E	F	+0	x15	M	+0	AC,Red;HEAT	Unl.",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "3tons",
              ":speedspace",
              "5g"
            ),
            "Siren Space Interceptor",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Siren Space Interceptor",
              ":summary",
              "* The Siren Fighter is the standard medium range interceptor spaceship\nused by the UEA. It is faster than any other short range space craft in the\nSolar System, but without high mobility verniers it is outclassed by Mobile\nSuits. It is ideally suited for patrolling and policing the space lanes.\n* The Siren can be launched from Earth using a booster rocket making it even more\npractical for Earth defense.\n* 2 Medium Railguns\n* 6 Medium Missiles\n* 4 Light Missiles",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "40tons",
              ":length",
              "14m",
              ":speedspace",
              "3.5g",
              ":width",
              "12m"
            ),
            "Syreen Mech Suit",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Syreen Mech Suit",
              ":image",
              "JovianChronicles/SyreenToken.png",
              ":summary",
              "* The Syreen Suit is a Siren space fighter retrofitted into a Mech Suit. It was hastily\nconstructed when the first conflict with the Jovians displayed the dominant mobility of\nthe Jovian Mech Suits.\n* As an efficient and cheap design, it can be fielded in large numbers. However, it does\nnot compare well to the new Mech Suits that it is meant to face, so casualties are high.\n* The Syreen can be launched from Earth using a booster rocket making it even more\npractical for Earth defense.\n* 2 Heavy Missiles\n* 6 Medium Missiles\n* 4 Light Missiles\n* Point defense laser system\n* 2 Crude manipulator arms for close combat.\n* The command variant includes a powerful ECM pod.",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "52tons",
              ":height",
              "17.2m",
              ":speedspace",
              "3g",
              ":width",
              "17.5m"
            ),
            "Poseidon Battlecruiser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Poseidon Battlecruiser",
              ":summary",
              "* The Poseidon Class Battlecruiser is the top of the line UEA warship. It\ngets its name from the two rotating living sections that give the ship the\nappearance of a trident.\n* The Poseidon outclasses any other warship from any faction and is a\nmenancing presense. It was, however, designed before the advent of Mech\nSuits, so it carries more interceptors than Mechs.\n* Point Defense System\n* 4 Particle Accelerator Batteries\n* 4 Railcannon Batteries\n* 6 Interceptors\n* 4 Mech Suits",
              ":classification",
              "Hvy. Spacecraft",
              ":crew",
              "200",
              ":mass",
              "30ktons",
              ":length",
              "325m",
              ":speedspace",
              ".5g",
              ":width",
              "200m"
            ),
            "Tengu Escort Carrier",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Tengu Escort Carrier",
              ":summary",
              "* The Tengu is a long range craft designed for limited engagements and\npolicing. It has extensive supplies but lacks firepower.\n* 1 Point Defense System\n* 2 Missile Bays\n* 2 Mech Suits\n* 2 Fighters\n* 2 Catapults",
              ":classification",
              "Hvy. Spacecraft",
              ":crew",
              "24",
              ":mass",
              "25ktons",
              ":length",
              "250m",
              ":speedspace",
              ".5g",
              ":width",
              "38m"
            ),
            "Wyvern Mech Suit",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Wyvern Mech Suit",
              ":image",
              "JovianChronicles/WyvernToken.png",
              ":summary",
              "* The Wyveern is the first and most numerous of the UEA Mech Suits.\nThough a copy of the Martial Federation Defender, it is a sturdy,\nreliable and most importantly mass-produceable design. Its primary\nlimitation is the lack of energy weapons which limits its combat\nendurance before it needs to be rearmed.\n* 1 Hyperbazooka\n* 2 Massdriver Machineguns\n* 2 Self guided Missiles",
              ":speed",
              "1.4g",
              ":mass",
              "55tons",
              ":height",
              "17m",
              ":length",
              "4m",
              ":speedair",
              "2.4mach",
              ":speedland",
              "36kph",
              ":width",
              "14m"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_mobile_suit_gundam_equipment
   * @return {chapter}
   */
  static t_chapter_mobile_suit_gundam_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_mobile_suit_gundam_equipment = {
    vx_type: nx_tactics_books_high_technology.t_chapter_mobile_suit_gundam_equipment
  }

  // (func chapter_mobile_suit_gundam_equipment)
  static f_chapter_mobile_suit_gundam_equipment() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Mobile Suit Gundam Equipment",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Gundam Equipment",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Gundam Equipment",
          ":summary",
          "* Energy rating for MW weapons assumes a 3 second burst.",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Titanium Composite",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Titanium Composite",
              ":summary",
              "This is the state of the art armor plate before the discovery of Gundarium Alpha which completely eclipses it."
            ),
            "Gundarium Alpha",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Gundarium Alpha",
              ":summary",
              "Originally called Luna Titanium, it was renamed after the success of the RX-78 Gundam built from it.\nA super high-tensile alloy originally known as Luna Titanium.  Originally intended for use inside thermonuclear\nreactors, this alloy's superb strength, durability, heat resistance and radiation-absorbing properties make it\nan ideal material for mobile suit armor.",
              ":titles",
              "Gundarium, Luna Titanium"
            ),
            "Gundarium Gamma",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Gundarium Gamma"
            ),
            "60mm Vulcan Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "60mm Vulcan Cannon",
              ":reference",
              "Stats based on 57mm Bofors Naval Gun",
              ":titles",
              "VCU-505EX-Gry/Ver.009 (Titans) / VCU-505EX-V*B/Ver.012 (AEUG)",
              ":classification",
              "Cannon",
              ":modifiers",
              "Auto",
              ":muzzlevelocity",
              "1000m/s",
              ":range",
              "8.5km",
              ":rof",
              "220/min"
            ),
            "100mm Machine Gun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "100mm Machine Gun",
              ":titles",
              "NF-GMG-Type.37",
              ":classification",
              "Cannon",
              ":modifiers",
              "Auto",
              ":muzzlevelocity",
              "600m/s"
            ),
            "120mm Machine Gun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "120mm Machine Gun",
              ":classification",
              "Cannon",
              ":modifiers",
              "Auto",
              ":muzzlevelocity",
              "600m/s",
              ":rounds",
              "100"
            ),
            "180mm Recoilless Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "180mm Recoilless Cannon",
              ":titles",
              "NFHI-GMCa-type.09",
              ":classification",
              "Cannon",
              ":muzzlevelocity",
              "300m/s"
            ),
            "240mm Recoilless Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "240mm Recoilless Cannon",
              ":classification",
              "Cannon",
              ":muzzlevelocity",
              "300m/s"
            ),
            "280mm Bazooka",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "280mm Bazooka",
              ":classification",
              "Hvy. Rocket Launcher",
              ":modifiers",
              "HE",
              ":muzzlevelocity",
              "120m/s",
              ":rounds",
              "4"
            ),
            "360mm Hyper Bazooka",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "360mm Hyper Bazooka",
              ":summary",
              "* Capable of destroying a GM in a single hit.",
              ":titles",
              "H&amp;L-GB05R (Zeon) / H-Baz-85-Gry/Ver.045 (Titans) / H-Baz-87-A*E/Ver.004 (AEUG)",
              ":classification",
              "Hvy. Rocket Launcher",
              ":modifiers",
              "HE",
              ":muzzlevelocity",
              "120m/s",
              ":rounds",
              "10"
            ),
            "380mm Hyper Bazooka",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "380mm Hyper Bazooka",
              ":titles",
              "BLASH-XHB-L-03/N-STD",
              ":classification",
              "Hvy. Rocket Launcher",
              ":modifiers",
              "HE",
              ":muzzlevelocity",
              "120m/s",
              ":rounds",
              "5"
            ),
            "Clay Bazooka",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Clay Bazooka",
              ":image",
              "Gundam/ClayBazooka.jpg",
              ":classification",
              "Hvy. Rocket Launcher",
              ":modifiers",
              "HE",
              ":muzzlevelocity",
              "120m/s"
            ),
            ".4MW Beam Saber",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".4MW Beam Saber",
              ":titles",
              "XB-G-1048L (Titans) / A*E-Br*G-Sc-L (AEUG)",
              ":classification",
              "Hvy. Melee",
              ":energy",
              "1.2MJ",
              ":modifiers",
              "Energy"
            ),
            ".65MW Beam Saber",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".65MW Beam Saber",
              ":classification",
              "Hvy. Melee",
              ":energy",
              "1.95MJ",
              ":modifiers",
              "Energy"
            ),
            "1.3MW Beam Gun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "1.3MW Beam Gun",
              ":classification",
              "Cannon",
              ":energy",
              "3.9MJ",
              ":modifiers",
              "Energy"
            ),
            "1.3MW Funnel",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "1.3MW Funnel",
              ":classification",
              "Cannon",
              ":energy",
              "3.9MJ",
              ":modifiers",
              "Energy"
            ),
            "1.9MW Beam Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "1.9MW Beam Rifle",
              ":summary",
              "Powered by rechargeable energy cap",
              ":titles",
              "BOWA-BR-S-85-C2",
              ":classification",
              "Cannon",
              ":energy",
              "5.7MJ",
              ":modifiers",
              "Energy"
            ),
            "2.2MW Beam Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "2.2MW Beam Pistol",
              ":summary",
              "Powered by rechargeable energy cap",
              ":classification",
              "Cannon",
              ":energy",
              "6.6MJ",
              ":modifiers",
              "Energy"
            ),
            "2.2MW Funnel",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "2.2MW Funnel",
              ":classification",
              "Hvy. MG",
              ":energy",
              "6.6MJ",
              ":modifiers",
              "Energy"
            ),
            "2.6MW Beam Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "2.6MW Beam Rifle",
              ":summary",
              "Powered by rechargeable energy cap",
              ":titles",
              "BOWA*XBR-M-86-C2 (Titans), A*E-Br*XBR-87-C (AEUG)",
              ":classification",
              "Cannon",
              ":energy",
              "7.8MJ",
              ":modifiers",
              "Energy"
            ),
            "2.8MW Beam Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "2.8MW Beam Rifle",
              ":summary",
              "Powered by rechargeable energy cap",
              ":classification",
              "Cannon",
              ":energy",
              "8.4MJ",
              ":modifiers",
              "Energy"
            ),
            "5.7MW Beam Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "5.7MW Beam Rifle",
              ":image",
              "Gundam/ZetaBeamRifle.jpg",
              ":summary",
              "Powered by replaceable e-pac, doubles as large beam saber",
              ":classification",
              "Cannon",
              ":energy",
              "17.1MJ",
              ":modifiers",
              "Energy"
            ),
            "8.3MW Hyper Mega Launcher",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "8.3MW Hyper Mega Launcher",
              ":summary",
              "Powered by replaceable e-pac, doubles as large beam saber",
              ":classification",
              "Cannon",
              ":energy",
              "24.9MJ",
              ":modifiers",
              "Energy"
            ),
            "19.5MW Mega Particle Gun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "19.5MW Mega Particle Gun",
              ":classification",
              "Cannon",
              ":energy",
              "58.5MJ",
              ":modifiers",
              "Energy"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_mobile_suit_gundam_units
   * @return {chapter}
   */
  static t_chapter_mobile_suit_gundam_units = {
    vx_type: vx_core.t_type
  }
  static e_chapter_mobile_suit_gundam_units = {
    vx_type: nx_tactics_books_high_technology.t_chapter_mobile_suit_gundam_units
  }

  // (func chapter_mobile_suit_gundam_units)
  static f_chapter_mobile_suit_gundam_units() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Mobile Suit Gundam Units",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Gundam Independents",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Gundam Independents",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Side",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Side",
              ":length",
              "32km"
            )
          )
        ),
        "Gundam Federation",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Gundam Federation",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Ball",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ball",
              ":image",
              "Gundam/Ball.png",
              ":titles",
              "RB-79",
              ":speed",
              ".96g",
              ":classification",
              "Cannon",
              ":mass",
              "17.2tons",
              ":height",
              "12.8m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "3",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "180mm Recoilless Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "180mm Recoilless Cannon",
                      ":facing",
                      "F"
                    )
                  )
                )
              )
            ),
            ":Gundam",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gundam",
              ":image",
              "Gundam/Gundam.png",
              ":summary",
              "Performance: maximum thruster acceleration 0.93 G; maximum ground running speed 165 km/h\nEquipment and design features: re-entry coolant system\nOptional hand armaments: BOWA-XBR-M-79-07G beam rifle, powered by rechargeable energy cap;\nRX·M-Sh-008/S-01025 shield, can be optionally stored on backpack",
              ":titles",
              "RX-78-2",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "43.4tons",
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
                  ":level",
                  "6",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":facing",
                      "Turretx2",
                      ":number",
                      "2"
                    ),
                    "380mm Hyper Bazooka",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "380mm Hyper Bazooka"
                    )
                  )
                )
              )
            ),
            "Gundam Ground Type",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gundam Ground Type",
              ":image",
              "Gundam/GundamGroundType.png",
              ":reference",
              "The engineers at Jaburo used spare parts originally manufactured for the RX-78-2 Gundam prototype and built approximately 20 units of a specialized ground combat-model Gundam, the RX-79[G]. Twelve of these units were assigned to the Kojima Battalion stationed in Southeast Asia, particularly to the 04th and 08th MS Teams. Since the RX-79[G]'s were made primarily of spare parts leftover from \"Project V,\" no replacement parts were available. This resulted in hasty field repairs",
              ":summary",
              "Speed: 0.71 G\nFixed armaments: multi-launcher, mounted in chest;\n2 x X.B.Sa-G-03 beam saber, stored in recharge\nracks in legs, hand-carried in use\nOptional fixed armaments: RGM-S-Sh-WF/S-00109 shield, mounted on either forearm\nOptional hand armaments:\nP.B.R-0079/A12 S-000011 beam rifle, powered by rechargeable energy cap;\nbazooka gun, clip-fed, 7 rounds per clip;\n6-tube missile launcher;",
              ":titles",
              "RX-79(G)",
              ":classification",
              "Med. Tank",
              ":mass",
              "52.8tons",
              ":height",
              "18.2m",
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
                    "100mm Machine Gun",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "100mm Machine Gun",
                      ":summary",
                      "Clip-fed, 2 spare clips stored on hip armor"
                    ),
                    "180mm Recoilless Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "180mm Recoilless Cannon"
                    ),
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":summary",
                      "Chest Mount",
                      ":facing",
                      "FF",
                      ":number",
                      "1"
                    )
                  )
                )
              )
            ),
            ":Guncannon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Guncannon",
              ":image",
              "Gundam/Guncannon.png",
              ":summary",
              "Speed: 0.74 G\nOptional hand armaments: BOWA-XBR-L beam rifle, powered by rechargeable energy cap",
              ":titles",
              "RX-77-2",
              ":speed",
              "78kph",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "51tons",
              ":height",
              "17.5m",
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
                    "240mm Recoilless Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "240mm Recoilless Cannon",
                      ":facing",
                      "FFx2",
                      ":number",
                      "2",
                      ":rounds",
                      "40"
                    ),
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":facing",
                      "Turretx2",
                      ":number",
                      "2"
                    )
                  )
                )
              )
            ),
            ":Guntank",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Guntank",
              ":image",
              "Gundam/Guntank.png",
              ":summary",
              "Performance: maximum thruster acceleration 1.10 G; maximum ground driving speed 70 km/h\n2 x 4-tube 40mm rocket launcher, mounted on arms",
              ":titles",
              "RX-75",
              ":speed",
              "70kph",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "56tons",
              ":height",
              "15.6m",
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
                    "180mm Recoilless Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "180mm Recoilless Cannon",
                      ":facing",
                      "FFx2",
                      ":number",
                      "2",
                      ":rounds",
                      "60"
                    )
                  )
                )
              )
            ),
            ":GM",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "GM",
              ":image",
              "Gundam/GM.png",
              ":titles",
              "RGM-79",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "41.2tons",
              ":height",
              "18m"
            ),
            ":Magellan",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Magellan",
              ":image",
              "Gundam/Magellan.png",
              ":classification",
              "Hvy. Spacecraft"
            ),
            "Pegasus Class Carrier",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pegasus Class Carrier",
              ":image",
              "Gundam/WhiteBase.png",
              ":summary",
              "Fixed armaments: 4 x main gun; 2 x mega particle gun; hyper mega particle cannon; 2 x missile launcher\nMobile suits: 8 (12)\n2x Catapults",
              ":titles",
              "White Base",
              ":classification",
              "Hvy. Spacecraft",
              ":mass",
              "54ktons",
              ":height",
              "76.5m",
              ":length",
              "341.7m",
              ":width",
              "124.1m"
            )
          )
        ),
        ":Zeon",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Zeon",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Big-Zam",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Big-Zam",
              ":image",
              "Gundam/BigZam.png",
              ":classification",
              "Med. Spacecraft",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Energy",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Energy"
                    )
                  )
                )
              )
            ),
            ":Dom",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dom",
              ":image",
              "Gundam/Dom.png",
              ":summary",
              "Ground Mobile Suit",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Elmeth",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Elmeth",
              ":image",
              "Gundam/Elmeth.png",
              ":classification",
              "Med. Spacecraft"
            ),
            ":Gelgoog",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gelgoog",
              ":image",
              "Gundam/Gelgoog.png",
              ":classification",
              "Lt. Spacecraft",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Gouf",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gouf",
              ":image",
              "Gundam/Gouf.png",
              ":classification",
              "Lt. Spacecraft"
            ),
            "Rick Dom",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Rick Dom",
              ":image",
              "Gundam/RickDom.png",
              ":reference",
              "Realizing that the outcome of the war was going to be decided in space, Zeon devoted all of its mobile suit\nmanufacturing resources to space combat units.  Refining the Dom design for space was simple, and mostly involved\nreplacing the hover jet thrusters with standard rocket thrusters.  Zeon manufacturers began cranking out hundreds\nof these new units late in the war, replacing the aging MS-06F Zaku II as the premiere front line combat unit.",
              ":summary",
              "Performance: maximum thruster acceleration 0.67 G; maximum ground running speed 110 km/h\nFixed armaments: scattering beam gun, mounted in torso; heat saber Type7, battery powered, stored in recharge rack on back, hand-carried in use",
              ":titles",
              "MS-09R",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "78.6tons",
              ":height",
              "18.6m",
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
                    "360mm Hyper Bazooka",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "360mm Hyper Bazooka",
                      ":rounds",
                      "10"
                    )
                  )
                )
              )
            ),
            "Zaku II",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Zaku II",
              ":image",
              "Gundam/ZakuII.png",
              ":summary",
              "Speed: .59G/88kph\nSensor radius: 3200 m\n180-degree turn time: 1.7 sec\nGround speed: 88 km/h\nArmor: super-high tensile steel\nArmament: heat hawk x 1\nOptional armament: 3-missile pod x 2, cracker",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "58.1tons",
              ":height",
              "17.5m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "3",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "280mm Bazooka",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "280mm Bazooka",
                      ":rounds",
                      "4"
                    ),
                    "120mm Machine Gun",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "120mm Machine Gun",
                      ":rounds",
                      "100"
                    )
                  )
                )
              )
            ),
            ":Z'Gok",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Z'Gok",
              ":image",
              "Gundam/ZGok.png",
              ":summary",
              "0.86 G; maximum water speed 103 knots\nFixed armaments:\n6 x 240mm missile launcher, 5 round magazine per launcher, mounted in head;\n2 x mega particle cannon, mounted in forearms",
              ":titles",
              "MSM-07",
              ":classification",
              "Lt. Naval Vessel",
              ":crew",
              "1",
              ":mass",
              "65.1tons",
              ":height",
              "18.4m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Zeong",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Zeong",
              ":image",
              "Gundam/Zeong.png",
              ":summary",
              "maximum thruster acceleration 0.81 G\nFixed armaments: 2 x wire-guided 5-barrel mega particle gun, barrels mounted in manipulator fingers, all barrels in each hand\nare fire-linked; 2 x mega particle gun, mounted in torso; mega particle gun, mounted in head",
              ":titles",
              "MSN-02",
              ":classification",
              "Med. Spacecraft",
              ":crew",
              "1",
              ":mass",
              "151.2tons",
              ":height",
              "17.3m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            "Gwazine Class Battleship",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gwazine Class Battleship",
              ":image",
              "Gundam/Gwazine.png",
              ":reference",
              "The Zeon Gwazine class battleships were more than a match for any Federation Forces warship.",
              ":summary",
              "Fixed armaments: 3 x 2-barrel main gun; 10 x 2-barrel secondary gun; many x 155mm machine gun\nMobile suits: 20",
              ":classification",
              "Hvy. Spacecraft",
              ":mass",
              "108.1ktons",
              ":height",
              "103m",
              ":length",
              "440m",
              ":width",
              "320m"
            ),
            ":Musai",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Musai",
              ":image",
              "Gundam/Musai.png"
            ),
            "Zanzibar Class Cruiser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Zanzibar Class Cruiser",
              ":image",
              "Gundam/Zanzibar.png",
              ":reference",
              "Zeon's closest answer to the Federation's Pegasus class carrier, the Zeon Zanzibar class mobile cruiser replaced the vulnerable H.L.V. for the purpose of ferrying mobile suits to Earth and back to space. With a capacity of 6 mobile suits and a battery of bow-mounted mega particle guns, the Zanzibar was often used as the command ship for smaller fleets when a Gwazine class battleship was either unavailable or unsuitable. Lacking the Pegasus class' integral Minovsky Craft System, the Zanzibar could only operate for short periods in Earth's atmosphere, using sustained thrust. When being launched back into space, the Zanzibar class required a special rocket booster to supply the necessary thrust to break free of Earth's gravity.\n like most Zeon warships of the One Year War, lacked launch catapults, instead deploying its complement of mobile suits through a simple hatch on the ventral hull.",
              ":summary",
              "Fixed armaments: 1 x 2-barrel main gun; 4 x mega particle gun; 5 x 2-barrel machine gun\nMobile suits: 6",
              ":classification",
              "Hvy. Spacecraft",
              ":height",
              "70.5m",
              ":length",
              "255m",
              ":width",
              "221.8m"
            )
          )
        ),
        ":0083",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "0083",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Gundam GP01",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gundam GP01",
              ":image",
              "Gundam/GundamGP01.png",
              ":titles",
              "Gundam Unit 01"
            ),
            "Gundam GP02",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gundam GP02",
              ":image",
              "Gundam/GundamGP02.png",
              ":titles",
              "Gundam Unit 02"
            ),
            "Gundam GP03",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gundam GP03",
              ":image",
              "Gundam/GundamGP03.png",
              ":titles",
              "Gundam Unit 03"
            ),
            "Neue Ziel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Neue Ziel",
              ":image",
              "Gundam/NeueZiel.png"
            )
          )
        ),
        ":AEUG",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "AEUG",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Z Gundam",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Z Gundam",
              ":image",
              "Gundam/ZGundam.png",
              ":summary",
              "* Variable Mobile Suit\nSpeed: 1.81 G\nFixed armaments:\n2 x 2-tube grenade launcher, 2 rounds per tube, mounted in forearms;\nOptional fixed armaments:\ngrenade launcher cartridge, 18+1 rounds, serves as extended ammunition magazine for grenade launcher;\nshield, mounted on left forearm",
              ":titles",
              "MSZ-006",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "28.7tons",
              ":height",
              "19.8m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "6",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "5.7MW Beam Rifle",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "5.7MW Beam Rifle",
                      ":summary",
                      "2 spare e-pacs stored in shield"
                    ),
                    "8.3MW Hyper Mega Launcher",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "8.3MW Hyper Mega Launcher"
                    ),
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":facing",
                      "Turretx2",
                      ":number",
                      "2",
                      ":rounds",
                      "1200"
                    )
                  )
                )
              )
            ),
            "Z Gundam Waverider",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Z Gundam Waverider",
              ":image",
              "Gundam/Waverider_ZGundam.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "MSZ-006",
              ":speed",
              "1.81g",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "28.7tons",
              ":length",
              "24.3m",
              ":width",
              "18.6m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "6",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "5.7MW Beam Rifle",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "5.7MW Beam Rifle"
                    ),
                    "1.3MW Beam Gun",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "1.3MW Beam Gun"
                    )
                  )
                )
              )
            ),
            ":G-Defenser",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "G-Defenser",
              ":image",
              "Gundam/GDefenser.png",
              ":summary",
              "* Space Fighter\n* Separatable cockpit capsule\nFixed armaments: 2 x 14-tube missile pod, mounted in binders on main body; long beam rifle, mounted on main body; 2 x mini laser gun fire-linked, power rated at 1.7 MW each, mounted in nose of cockpit capsule; 4 x vulcan gun, mounted in pairs in missile pod binders, each pair fire-linked",
              ":titles",
              "FXA-05D",
              ":speed",
              "1.41g",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "24.7tons",
              ":length",
              "39.5m",
              ":width",
              "27.1m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            "Gundam MK-II",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gundam MK-II",
              ":image",
              "Gundam/GundamMkII.png",
              ":reference",
              "* Paradoxically, the Gundam Mk. II is not armored with the wonderfully durable Gundarium alloy material used by\nthe original RX-78 Gundam, making it no more or less physically durable than mass-production mobile suits.",
              ":summary",
              "RX*M-Sh-VT/S-00018 (Titans) / RX*M-Sh-VT/S-001 (AEUG) shield, mounted on either forearm\nOptional hand armaments: 2 spare e-pacs stored in shield;\nAE/ZIM.C-BAZ-531 clay bazooka, clip-fed, 7 rounds per clip",
              ":titles",
              "RX-178",
              ":speed",
              "1.5g",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "33.4tons",
              ":height",
              "18.5m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "5",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "2.6MW Beam Rifle",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "2.6MW Beam Rifle"
                    ),
                    "360mm Hyper Bazooka",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "360mm Hyper Bazooka",
                      ":rounds",
                      "7"
                    ),
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":facing",
                      "Turretx2",
                      ":number",
                      "2",
                      ":rounds",
                      "1400"
                    )
                  )
                )
              )
            ),
            "Hyaku Shiki",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hyaku Shiki",
              ":image",
              "Gundam/HyakuShiki.png",
              ":summary",
              "Equipment and design features: anti-beam reflective coating on amror\nOptional hand armaments:\nAE/ZIM.C-BAZ-531 clay bazooka, clip-fed, 7 rounds per clip; mega bazooka launcher",
              ":titles",
              "MSN-100",
              ":speed",
              "1.37g",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "31.5tons",
              ":height",
              "18.5m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "6",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "2.8MW Beam Rifle",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "2.8MW Beam Rifle"
                    ),
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":facing",
                      "Turretx2",
                      ":number",
                      "2"
                    )
                  )
                )
              )
            ),
            ":Nemo",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Nemo",
              ":image",
              "Gundam/Nemo.png",
              ":summary",
              "Optional fixed armaments: shield, mounted on either forearm\nAlthough closely based on the GM II, was far better in performance in terms of generator power,\nthruster acceleration and maneuverability. To help keep its cost down, the Nemo used many weapons\nalready employed by other existing mobile suits, such as the RMS-099 Rick Dias' beam saber and the\nGM II's beam rifle.",
              ":titles",
              "MSA-003",
              ":speed",
              "1.15g",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "36.2tons",
              ":height",
              "18.5m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "3",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "1.9MW Beam Rifle",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "1.9MW Beam Rifle"
                    ),
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":facing",
                      "Turretx2",
                      ":number",
                      "2"
                    )
                  )
                )
              )
            ),
            "Rick Dias",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Rick Dias",
              ":image",
              "Gundam/RickDias.png",
              ":reference",
              "* Because many former Zeon engineers worked on the Rick Dias, it featured many similaritys to Zeon suits.  It not\nonly features a mono-eye sensor its name is also derived from the MS-09R Rick Dom (Rick comes from the word\nRemake).  The Rick Dias should originally be called Gundam Gamma because it is built out of new Gundarium Gamma.\nThis material was developed by Axis and it makes the suit lighter and thus makes it able to accommodate greater\nfuel capacity.",
              ":summary",
              "* Equipment and design features: 2 x 'random binder' ejectable external propellant tank, mounted on backpack; birdlime launchers in hands; flare launchers in hands\n* Fixed armaments: 2-barrel 55mm vulcan phalanx anti-missile gun system, mounted in head;\n* Optional hand armaments: AE/ZIM.C-BAZ-531 clay bazooka, clip-fed, 7 rounds; beam rifle, powered by rechargeable energy cap",
              ":titles",
              "RMS-099, Gundam Gamma",
              ":speed",
              "1.37g",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "32.2tons",
              ":height",
              "18.7m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "3",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "2.2MW Beam Pistol",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "2.2MW Beam Pistol",
                      ":number",
                      "2"
                    ),
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":facing",
                      "Turretx2",
                      ":number",
                      "2"
                    )
                  )
                )
              )
            ),
            "Super Gundam",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Super Gundam",
              ":image",
              "Gundam/SuperGundam.png",
              ":summary",
              "Combined Mobile Suit",
              ":titles",
              "FXA-05D+RX-178",
              ":classification",
              "Med. Spacecraft",
              ":mass",
              "72.9tons",
              ":height",
              "18.5m"
            ),
            ":Argama",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Argama",
              ":image",
              "Gundam/Argama.png",
              ":classification",
              "Hvy. Spacecraft"
            ),
            "Garuda Class Transport",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Garuda Class Transport",
              ":image",
              "Gundam/Garuda_Audhumla.png",
              ":summary",
              "Propulsion system: jet engine x 10\nArmament: laser gun x 10\nMobile suits: 20\nShips of the line: Garuda, Audhumla, Sudori, Melord\nMechanical designer: Kazumi Fujita",
              ":titles",
              "Audhumla, Garuda, Melord, Sudori",
              ":classification",
              "Med. Aircraft",
              ":mass",
              "9800tons",
              ":length",
              "317m",
              ":width",
              "524m"
            )
          )
        ),
        "Gundam Titans",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Gundam Titans",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Asshimar",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Asshimar",
              ":image",
              "Gundam/Asshimar.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "NRX-044",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "41.1tons",
              ":height",
              "19.3m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Baund-Doc",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Baund-Doc",
              ":image",
              "Gundam/BaundDoc.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "NRX-055",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "82.7tons",
              ":height",
              "27.3m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Byalant",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Byalant",
              ":image",
              "Gundam/Byalant.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "PMX-000",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "34.2tons",
              ":height",
              "18.6m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Gabthley",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gabthley",
              ":image",
              "Gundam/Gabthley.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "RX-110",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "32.6tons",
              ":height",
              "18.5m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Gaplant",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gaplant",
              ":image",
              "Gundam/Gaplant.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "ORX-005",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "50.7tons",
              ":height",
              "19.8m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            "GM II",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "GM II",
              ":image",
              "Gundam/GMII.png",
              ":summary",
              "Fixed armaments:\nbeam saber, power rating unknown\nOptional fixed armaments: shield, mounted on either forearm",
              ":titles",
              "RMS-179, RGM-79R",
              ":speed",
              "1.06g",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "40.5tons",
              ":height",
              "18.1m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "3",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "1.9MW Beam Rifle",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "1.9MW Beam Rifle"
                    ),
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":facing",
                      "Turretx2",
                      ":number",
                      "2"
                    )
                  )
                )
              )
            ),
            ":Hambrabi",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hambrabi",
              ":image",
              "Gundam/Hambrabi.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "RX-139",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "34.6tons",
              ":height",
              "19.9m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Hizack",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hizack",
              ":image",
              "Gundam/Hizack.png",
              ":titles",
              "RMS-106",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "38.7tons",
              ":height",
              "18m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Marasai",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Marasai",
              ":image",
              "Gundam/Marasai.png",
              ":titles",
              "RMS-108",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "33.1tons",
              ":height",
              "17.5m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Messala",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Messala",
              ":image",
              "Gundam/Messala.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "PMX-000",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "37.3tons",
              ":height",
              "23m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Psycho-Gundam",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Psycho-Gundam",
              ":image",
              "Gundam/PsychoGundam.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "MRX-009",
              ":classification",
              "Med. Spacecraft",
              ":mass",
              "214.1tons",
              ":height",
              "40m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Energy",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Energy"
                    )
                  )
                )
              )
            ),
            "Psycho-Gundam MK-II",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Psycho-Gundam MK-II",
              ":image",
              "Gundam/PsychoGundamMkII.png",
              ":summary",
              "* Variable Mobile Suit\nPerformance: maximum thruster acceleration: 0.86 G (mobile suit mode), 1.99 G (mobile fortress mode)\nEquipment and design features: sensors, range 16230 meters; psycho control chair in cockpit; detachable head, can be operated without main body\nFixed armaments: 20 x mega beam gun, power rated at 6.3 MW each, 3 mounted in each shoulder, 4 mounted in each leg, 2 mounted in each hip armor, 1 mounted in each front waist armor; 3 x mega scattering beam gun, power rated at 10.7 MW each, mounted in torso; 2 x wire-guided psycommu beam sword, power rated at 1.7 MW each, mounted in forearms; 10 x beam gun, emitter barrels mounted as fingers in hands; 2-barrel mega beam gun, mounted in head\nRemote weapons: reflector bits, deflects and redirects beam weapons fire, stored in backpack\nThough armed with the same 3-barreled scattering mega particle gun in its chest and beam gun fingers, the Psyco Gundam Mark II also mounted 20 smaller beam guns all over its body, giving it firepower capable of attacking targets in all directions. Its forearms also mounted large-bladed beam swords, and could be detached and directed at targets via a cable connection and through the control of the Psyco Gundam Mark II's psycommu system, giving the unit an all-range attack capability quite similar to that of the Principality of Zeon's MSN-02 Zeong. The Psyco Gundam Mark II also carried a set of 'reflector bits,' which were unarmed but used to redirect its own beam weapons fire to targets that are out-of-sight, or to deflect incoming enemy beam weapons fire.",
              ":titles",
              "MRX-010",
              ":classification",
              "Med. Spacecraft",
              ":mass",
              "187.8tons",
              ":height",
              "40m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Energy",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Energy"
                    )
                  )
                )
              )
            ),
            ":Qubeley",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Qubeley",
              ":image",
              "Gundam/Qubeley.png",
              ":summary",
              "Fixed armaments: 2 x beam launcher/beam saber, mounted in forearms in beam launcher mode, hand-carried in beam saber mode",
              ":titles",
              "AMX-004",
              ":speed",
              "1.08g",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "35.2tons",
              ":height",
              "18.4m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "6",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "1.3MW Funnel",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "1.3MW Funnel",
                      ":number",
                      "10"
                    )
                  )
                )
              )
            ),
            ":The-O",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "The-O",
              ":image",
              "Gundam/TheO.png",
              ":summary",
              "4 x sub-arm, mounted inside front skirt armor",
              ":titles",
              "PMX-003",
              ":speed",
              "1.57g",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "57.3tons",
              ":height",
              "24.8m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "6",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "2.6MW Beam Rifle",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "2.6MW Beam Rifle"
                    )
                  )
                )
              )
            ),
            ":Saberfish",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Saberfish",
              ":image",
              "Gundam/Saberfish.png",
              ":summary",
              "High Altitude Fighter",
              ":classification",
              "Lt. Aircraft"
            ),
            ":Gwazine",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gwazine",
              ":image",
              "Gundam/Gwazine.png"
            ),
            ":Jupitris",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Jupitris",
              ":image",
              "Gundam/Jupitris.png"
            ),
            ":Salamis",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Salamis",
              ":image",
              "Gundam/Salamis.png"
            )
          )
        ),
        "Federation (New)",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Federation (New)",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Nu Gundam",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Nu Gundam",
              ":image",
              "Gundam/NuGundam.png",
              ":titles",
              "RX-93",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "27.9tons",
              ":height",
              "22m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            ),
            ":Re-GZ",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Re-GZ",
              ":image",
              "Gundam/ReGZ.png",
              ":summary",
              "* Variable Mobile Suit",
              ":titles",
              "RGZ-91",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "24.7tons",
              ":height",
              "20.5m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
                  )
                )
              )
            )
          )
        ),
        "Neo Zion",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Neo Zion",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Alpha-Azieru",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Alpha-Azieru",
              ":image",
              "Gundam/AlphaAzieru.png",
              ":summary",
              "Speed: 8.29 G\n				* 2 x external propellant tank, ejectable, mounted on main body\nFixed armaments: 2 x wire-guided psycommu mega arm, each mounts 5 x beam gun, fire-linked, power rated at 12.6 MW each",
              ":titles",
              "NZ-333",
              ":classification",
              "Med. Spacecraft",
              ":mass",
              "267.4tons",
              ":height",
              "58.4m",
              ":length",
              "108m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":level",
                  "6",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "19.5 MW Mega Particle Gun",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "19.5 MW Mega Particle Gun",
                      ":facing",
                      "Turret"
                    ),
                    "2.2MW Funnel",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "2.2MW Funnel",
                      ":number",
                      "9"
                    ),
                    "60mm Vulcan Cannon",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "60mm Vulcan Cannon",
                      ":facing",
                      "Turretx4",
                      ":number",
                      "4"
                    )
                  )
                )
              )
            ),
            ":Sazabi",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sazabi",
              ":image",
              "Gundam/NuGundam.png",
              ":titles",
              "MSN-04",
              ":classification",
              "Lt. Spacecraft",
              ":mass",
              "30.5tons",
              ":height",
              "25m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Armor",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Hardened vs. Projectiles",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hardened vs. Projectiles"
                    )
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
   * @function chapter_space_colonies
   * @return {chapter}
   */
  static t_chapter_space_colonies = {
    vx_type: vx_core.t_type
  }
  static e_chapter_space_colonies = {
    vx_type: nx_tactics_books_high_technology.t_chapter_space_colonies
  }

  // (func chapter_space_colonies)
  static f_chapter_space_colonies() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Space Colonies",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "L5 Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "L5 Colonies",
          ":summary",
          "* The L5 Colonies are enormous space colonies that have been constructed at the five Lagrange points around Earth where gravitational forces are stable. They are 25km to 40km long.\n* Construction - These stations are constructed inside cylinders of Moon rock and asteroids ferried from the Asteroid Belt. The external surface is heavily armored against meteorite impacts. Industrial complexes are mostly on outermost layer of the colonies to keep them away from habitations. Towns are built on the internal surface of the colony. The internal space is divided into zones with large reflective pressure walls that give the appearance of continuous space while limiting the risk of catastrophic failure to any particular zone. Transport tubes are underground and also serve as emergency shelters. In addition to the outer cylinder, there is also an inner cylinder that forms a pressurized, zero-g drydock through the center of the colony.\n* Personnel - Those that have travelled from Earth to the Orbital stations are many of the best and brightest that Earth has to offer. Each colony supports up to 20 million people. Living space is about 300 square km, which is not a lot of room for so many people. Three or four story buildings are the norm, but they cannot be built higher than that because of the Coriolis effect.\n* Resources - Large amounts of solar energy are continuously collected, but life is difficult in space where all materials must be imported (at high tariffs). Orbital industry is generally thriving.\n* Politics - Because the Orbitals are largely corporate run and lack a specific history, they are largely free of geopolitical politics, as well as cultural and racial conflicts. They do, however, retain fierce, corporate politics. Most of all, the Orbitals chafe under the Earth bound regulatory and military agencies that supervise and tax them. Taxes are necessarily high to support so much technology, and taxes are always a point of conflict.",
          ":titles",
          "Orbitals, Orbital Platforms",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "L1: Shangri-la",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "L1: Shangri-la"
            ),
            "L2: Elysium",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "L2: Elysium"
            ),
            "L4: Avalon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "L4: Avalon",
              ":summary",
              "The first of the L5 colonies, Avalon has the largest starship construction facilities. Its proximity\nto Earth and the Moon provide it optimal security and resources."
            ),
            "L3: Eden",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "L3: Eden"
            ),
            "L5: Valhalla",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "L5: Valhalla"
            )
          )
        ),
        "Nomad Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Nomad Colonies",
          ":summary",
          "* Small individual colonies are beginning to dot open space between the planets. These colonies maintain their own solar orbits and can be convenient stop over points between planets.\n* Culture - Nomad colonists are a hard working, individualistic people. Some are religious or cultural fanatics. Others are essentially criminal organizations or pirates. Nomad colonists are highly desired as crew for interplanetary commercial space flights. They are used to cramped space conditions and they are also 	talented mechanics and jury-riggers.\n* Trade - Each Nomad Colony is primarily a trading station. They do not produce anything except food for themselves. Everything else is purchased from other planets.\n* Politics - Nomad Colonies are each formed for their own reasons and maintain unique governments and social structures. They attempt to remain neutral from other nations and will trade with anyone without regard to political or criminal status. Though the Nomad colonies are each completely unique, they all recognize the other Nomads as allies and treat any threat to one as a threat to all.\n* Military - Nomad Colonies typically maintain little or no defenses as befits their neutral status. They may, however, maintain hidden defenses or pirate ships nearby."
        ),
        "Mars Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mars Colonies",
          ":summary",
          "* Colonial Mars is much like the American Frontier. Colonists left the overcrowded and impoverished Earth in search of a new life knowing that there was almost no chance to return to the Old World. They and their children would live or die on Mars, and they proudly adopted the name Martian.\n* Terraforming - Mars is one of the greatest technological projects ever attempted by humanity.\n* Climate - Mars is in the later stages of Terraforming. The air is thin and cold but breathable, similar to a mountain top.\n* Cities - Since the atmosphere became breathable, the population on Mars has sharply increased. Cities that were once domed habitats have grown into large settlements. Land is practically free, so buildings are low and sprawling.\n* Production - Mining is the primary reason for founding the Martian colony and continues to be the main source of jobs. Terraforming, industrial equipment, and algae farming support the mining effort.\n* Politics - The Martian Council is a democratic body that establishes and enforces Martian law. Unfortunately, they are largely a puppet of the Earth Authority and have been increasingly squeezing the Martian colonists to increase production for their war efforts. This pressure has spurred the creation of the Free Mars Movement that seeks to free Mars form Earth control.\n* Corporations - Martial Metals is one of the biggest corporations in the Solar System. It developed the orbital elevator and its steady source of cheap metals feed a large industry of orbital facilities including drydocks.",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Orbital Elevator",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Orbital Elevator",
              ":summary",
              "* The Orbital Elevator is a miracle of technology and the only practical way to affordably get materials off the planet. The Orbital Elevator, the Asteroid Belt, and the Lunar Railguns are the only sources of building materials for colonies and spacecraft.\n* The Elevator is also a majestic symbol of power for the Martian Council and the Earth Authorities."
            ),
            "Free Mars Radical",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Free Mars Radical"
            ),
            "Martian Pirate",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Martian Pirate"
            ),
            "Sand Marauder",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sand Marauder"
            )
          )
        ),
        "Moon Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Moon Colonies",
          ":summary",
          "* The Moon's mineral and ice deposits made it the logical location of the first\npermanent off-world colony. Robotic solar-powered laser drills cut tunnel\ncomplexes into the walls of craters. Human colonists followed soon after.\nRegular exercise in 1 G training centers is mandatory for all colonists to avoid\nthe dangers of low gravity.\n* Cities dot the lunar landscape connected by underground transport tubes.\n* The two largest cities maintain spaceports complete with Laser Lifters to boost large\nships into orbit.",
          ":titles",
          "Lunars, Lunatics, Moon Men, Moonies, Selenites"
        ),
        "Solar Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Solar Colonies",
          ":placemap",
          vx_core.f_new(
            nx_tactics_base.t_placemap,
            ":Stellaser",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Stellaser",
              ":summary",
              "* Giant mirrors placed in pairs in Solar orbit. The mirrors gather light by reflecting it back and forth between them before releasing it in a concentrated beam to slowly accelerate starships. Though this beam would certainly be deadly to humans, the beam is only dangerous to exposed targets without sufficient radiation shielding.",
              ":titles",
              "Starlight Express"
            )
          )
        ),
        "Venusiau Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Venusiau Colonies"
        ),
        "Asteroid Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Asteroid Colonies",
          ":placemap",
          vx_core.f_new(
            nx_tactics_base.t_placemap,
            "Asteroid Mining Colony",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Asteroid Mining Colony"
            )
          ),
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Asteroid Miner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Asteroid Miner",
              ":titles",
              "Belter"
            )
          )
        ),
        "Jupiter Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Jupiter Colonies",
          ":summary",
          "* Culture - Personal space in Jovian colonies is extremely limited, so people\nshare quarters with multiple people. There are not even enough beds for each\nperson, so most people live with people who work different shifts and use the\nsame beds on off-shifts. Common areas are used for everything except sleeping.\nThe Jovians have adapted to be far more social and reliant on others for day\nto day life. This communal living has generally made them a tight knit society\nwith a strong sense of group identity.\n* Science - Jovian science is one of the most advanced in the solar system.\nResearch and development on ways to make their harsh life safer and more\ncomfortable are always high priorites. Jovian scientists crank out a steady\nstream of innovations across all disciplines.\n* Military - The military has reaped the rewards of Jovian science and is\narguably the most advanced force in the solar system, though certainly nowhere\nnear the largest. Jovian forces are composed of separate standing armies:\nAlpha, Beta, and Gamma Divisions with Alpha containing the Godsfire flagship.\nJovian military theory is based on efficient use of a small number of highly\nmobile units. They do not fear a large scale assault, since they would receive\nmuch forewarning of any attempt to mobilize a large force all the way out to\nJupiter. Jupiter's remoteness makes it fairly easy to defend against direct\nassault, but the harsh environment makes sabotage a much greater threat, so\nJovian intelligence forces constantly search for threats.\n* Agora - The Jovian governing body with primary offices on Elysee colony.",
          ":placemap",
          vx_core.f_new(
            nx_tactics_base.t_placemap,
            "Elysee Station",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Elysee Station",
              ":summary",
              "* The largest Jovian Colony and the capital of the Jovian Confederation."
            ),
            "Joshua Station",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Joshua Station",
              ":summary",
              "* The second largest Jovian Colony and Jupiter's hub of manufacturing. The\nstation is essentially a giant factory with live in workers. All commercial\nstarships are constructed here.\n* Jovian Armor Works - The best known aerospace corporation in Jovian space\nis famous for inventing the Exo-armor and designing almost all of the\nExo-armor fleet.\n* Joshua station also houses the seedier areas of Jovian society. Black\nmarkets, drug dens, and bordellos operate freely. Jovians tend to have a\nlive and let live attitude, so little effort is made to stop activities that\ndon't threaten the colony.",
              ":titles",
              "Wildest Place in the Solar System"
            ),
            "Khannan Station",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Khannan Station",
              ":summary",
              "* The third largest Jovian Colony and Jupiter's military center. The\nstation only allows military personnel on board. Large sections of the colony\nare dedicated to ship construction and others are top secret research labs."
            ),
            "Jovian Gas Refinery",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Jovian Gas Refinery",
              ":summary",
              "* These heavily armored, refining stations float in the upper atmosphere of\nJupiter. They float by means of enormous rings filled with heated hydrogen\nand manuever using fusion thrusters. Multiple kilometer long tubes hang from\nthe bottom of the station extracting gases from the differnt layers of the\natmosphere. The broad round floatation disc and long tubes give the stations\nthe general appearance of a jelly fish."
            ),
            "Io Colony",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Io Colony",
              ":reference",
              "Outland",
              ":summary",
              "* A small, titanium mining colony is located on Io. Miners work intensely to\ngain maximum bonuses. Life is dangerous and many miners are hooked on\namphetimines to maximize productivity. Victimless crime is largely ignored\nin this generally lawless outpost. Besides miners and transport workers there\nare only cooks, bartenders, prostitutes, a single doctor, a sheriff and two\ndeputies."
            )
          )
        ),
        "Saturn Colonies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Saturn Colonies",
          ":summary",
          "* With the exception of Titan, the outer planets are too remote and unimportant\nto ever be colonized. Jupiter provides an unlimited supply of gas resources, so\nSaturn, Uranus, and Neptune have little to offer.",
          ":placemap",
          vx_core.f_new(
            nx_tactics_base.t_placemap,
            "Titan Research Station",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Titan Research Station",
              ":summary",
              "* A small, permanent research colony has been erected on Titan to study its\nunique atmosphere and geology. The hope was to discover evidence of primitive\nlife, but no life has yet to be discovered."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_terminator
   * @return {chapter}
   */
  static t_chapter_terminator = {
    vx_type: vx_core.t_type
  }
  static e_chapter_terminator = {
    vx_type: nx_tactics_books_high_technology.t_chapter_terminator
  }

  // (func chapter_terminator)
  static f_chapter_terminator() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Terminator",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Terminator Units",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Terminator Units",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Terminator T-800",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Terminator T-800",
              ":image",
              "Terminator/T800.png",
              ":mass",
              "200kg",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Strength",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Strength"
                )
              )
            ),
            "Terminator T-1000",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Terminator T-1000",
              ":image",
              "Terminator/T1000.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Flexible",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Flexible"
                )
              )
            ),
            "Terminator T-X",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Terminator T-X",
              ":image",
              "Terminator/TX.png",
              ":summary",
              "* The T-X is designed to not only terminate humans but rogue Terminators\nreprogrammed by the Resistance. It is a composite of the T-800 and T-1000,\na solid endoskeleton covered with polymimetic liquid metal alloy, allowing\nit to take the shape of any humanoid it touches. The T-X endoskeleton\ncontains many powerful weapons making it considerably more deadly than\nprevious versions.",
              ":mass",
              "150kg",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Natural Weaponry",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Natural Weaponry"
                )
              )
            ),
            "Terminator Hunter Killer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Terminator Hunter Killer",
              ":image",
              "Terminator/HunterKiller.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery"
                )
              )
            ),
            "Terminator Tank",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Terminator Tank",
              ":image",
              "Terminator/HKTank.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery"
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
   * @function tacticsbook
   * @return {book}
   */
  static t_tacticsbook = {
    vx_type: vx_core.t_type
  }
  static e_tacticsbook = {
    vx_type: nx_tactics_books_high_technology.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "High Technology",
      ":image",
      "HighTech.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "High Tech Overview",
        nx_tactics_books_high_technology.f_chapter_high_tech_overview(),
        "Cyberpunk Campaign",
        nx_tactics_books_high_technology.f_chapter_cyberpunk_campaign(),
        "High Tech Rules",
        nx_tactics_books_high_technology.f_chapter_high_tech_rules(),
        "High Tech Equipment",
        nx_tactics_books_high_technology.f_chapter_high_tech_equipment(),
        "High Tech Spacecraft",
        nx_tactics_books_high_technology.f_chapter_high_tech_spacecraft(),
        "High Tech Aircraft",
        nx_tactics_books_high_technology.f_chapter_high_tech_aircraft(),
        "High Tech Heavy Armor",
        nx_tactics_books_high_technology.f_chapter_high_tech_heavy_armor(),
        "Space Colonies",
        nx_tactics_books_high_technology.f_chapter_space_colonies(),
        "Car Wars",
        nx_tactics_books_high_technology.f_chapter_car_wars(),
        "Cyberpunk",
        nx_tactics_books_high_technology.f_chapter_cyberpunk(),
        "Jovian Chronicles",
        nx_tactics_books_high_technology.f_chapter_jovian_chronicles(),
        "Mobile Suit Gundam Equipment",
        nx_tactics_books_high_technology.f_chapter_mobile_suit_gundam_equipment(),
        "Mobile Suit Gundam Units",
        nx_tactics_books_high_technology.f_chapter_mobile_suit_gundam_units(),
        "Terminator",
        nx_tactics_books_high_technology.f_chapter_terminator()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_car_wars": nx_tactics_books_high_technology.e_chapter_car_wars,
      "chapter_cyberpunk": nx_tactics_books_high_technology.e_chapter_cyberpunk,
      "chapter_cyberpunk_campaign": nx_tactics_books_high_technology.e_chapter_cyberpunk_campaign,
      "chapter_high_tech_aircraft": nx_tactics_books_high_technology.e_chapter_high_tech_aircraft,
      "chapter_high_tech_equipment": nx_tactics_books_high_technology.e_chapter_high_tech_equipment,
      "chapter_high_tech_heavy_armor": nx_tactics_books_high_technology.e_chapter_high_tech_heavy_armor,
      "chapter_high_tech_overview": nx_tactics_books_high_technology.e_chapter_high_tech_overview,
      "chapter_high_tech_rules": nx_tactics_books_high_technology.e_chapter_high_tech_rules,
      "chapter_high_tech_spacecraft": nx_tactics_books_high_technology.e_chapter_high_tech_spacecraft,
      "chapter_jovian_chronicles": nx_tactics_books_high_technology.e_chapter_jovian_chronicles,
      "chapter_mobile_suit_gundam_equipment": nx_tactics_books_high_technology.e_chapter_mobile_suit_gundam_equipment,
      "chapter_mobile_suit_gundam_units": nx_tactics_books_high_technology.e_chapter_mobile_suit_gundam_units,
      "chapter_space_colonies": nx_tactics_books_high_technology.e_chapter_space_colonies,
      "chapter_terminator": nx_tactics_books_high_technology.e_chapter_terminator,
      "tacticsbook": nx_tactics_books_high_technology.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_car_wars": nx_tactics_books_high_technology.t_chapter_car_wars,
      "chapter_cyberpunk": nx_tactics_books_high_technology.t_chapter_cyberpunk,
      "chapter_cyberpunk_campaign": nx_tactics_books_high_technology.t_chapter_cyberpunk_campaign,
      "chapter_high_tech_aircraft": nx_tactics_books_high_technology.t_chapter_high_tech_aircraft,
      "chapter_high_tech_equipment": nx_tactics_books_high_technology.t_chapter_high_tech_equipment,
      "chapter_high_tech_heavy_armor": nx_tactics_books_high_technology.t_chapter_high_tech_heavy_armor,
      "chapter_high_tech_overview": nx_tactics_books_high_technology.t_chapter_high_tech_overview,
      "chapter_high_tech_rules": nx_tactics_books_high_technology.t_chapter_high_tech_rules,
      "chapter_high_tech_spacecraft": nx_tactics_books_high_technology.t_chapter_high_tech_spacecraft,
      "chapter_jovian_chronicles": nx_tactics_books_high_technology.t_chapter_jovian_chronicles,
      "chapter_mobile_suit_gundam_equipment": nx_tactics_books_high_technology.t_chapter_mobile_suit_gundam_equipment,
      "chapter_mobile_suit_gundam_units": nx_tactics_books_high_technology.t_chapter_mobile_suit_gundam_units,
      "chapter_space_colonies": nx_tactics_books_high_technology.t_chapter_space_colonies,
      "chapter_terminator": nx_tactics_books_high_technology.t_chapter_terminator,
      "tacticsbook": nx_tactics_books_high_technology.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/high_technology",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_car_wars)
    nx_tactics_books_high_technology.t_chapter_car_wars['vx_value'] = {
      name          : "chapter_car_wars",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_car_wars
    }

    // (func chapter_cyberpunk)
    nx_tactics_books_high_technology.t_chapter_cyberpunk['vx_value'] = {
      name          : "chapter_cyberpunk",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_cyberpunk
    }

    // (func chapter_cyberpunk_campaign)
    nx_tactics_books_high_technology.t_chapter_cyberpunk_campaign['vx_value'] = {
      name          : "chapter_cyberpunk_campaign",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_cyberpunk_campaign
    }

    // (func chapter_high_tech_aircraft)
    nx_tactics_books_high_technology.t_chapter_high_tech_aircraft['vx_value'] = {
      name          : "chapter_high_tech_aircraft",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_high_tech_aircraft
    }

    // (func chapter_high_tech_equipment)
    nx_tactics_books_high_technology.t_chapter_high_tech_equipment['vx_value'] = {
      name          : "chapter_high_tech_equipment",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_high_tech_equipment
    }

    // (func chapter_high_tech_heavy_armor)
    nx_tactics_books_high_technology.t_chapter_high_tech_heavy_armor['vx_value'] = {
      name          : "chapter_high_tech_heavy_armor",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_high_tech_heavy_armor
    }

    // (func chapter_high_tech_overview)
    nx_tactics_books_high_technology.t_chapter_high_tech_overview['vx_value'] = {
      name          : "chapter_high_tech_overview",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_high_tech_overview
    }

    // (func chapter_high_tech_rules)
    nx_tactics_books_high_technology.t_chapter_high_tech_rules['vx_value'] = {
      name          : "chapter_high_tech_rules",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_high_tech_rules
    }

    // (func chapter_high_tech_spacecraft)
    nx_tactics_books_high_technology.t_chapter_high_tech_spacecraft['vx_value'] = {
      name          : "chapter_high_tech_spacecraft",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_high_tech_spacecraft
    }

    // (func chapter_jovian_chronicles)
    nx_tactics_books_high_technology.t_chapter_jovian_chronicles['vx_value'] = {
      name          : "chapter_jovian_chronicles",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_jovian_chronicles
    }

    // (func chapter_mobile_suit_gundam_equipment)
    nx_tactics_books_high_technology.t_chapter_mobile_suit_gundam_equipment['vx_value'] = {
      name          : "chapter_mobile_suit_gundam_equipment",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_mobile_suit_gundam_equipment
    }

    // (func chapter_mobile_suit_gundam_units)
    nx_tactics_books_high_technology.t_chapter_mobile_suit_gundam_units['vx_value'] = {
      name          : "chapter_mobile_suit_gundam_units",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_mobile_suit_gundam_units
    }

    // (func chapter_space_colonies)
    nx_tactics_books_high_technology.t_chapter_space_colonies['vx_value'] = {
      name          : "chapter_space_colonies",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_space_colonies
    }

    // (func chapter_terminator)
    nx_tactics_books_high_technology.t_chapter_terminator['vx_value'] = {
      name          : "chapter_terminator",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_chapter_terminator
    }

    // (func tacticsbook)
    nx_tactics_books_high_technology.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/high_technology",
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
      fn            : nx_tactics_books_high_technology.f_tacticsbook
    }

  }
}
