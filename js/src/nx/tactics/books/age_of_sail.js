'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_age_of_sail {

  /**
   * @function chapter_age_of_sail_overview
   * @return {chapter}
   */
  static t_chapter_age_of_sail_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_age_of_sail_overview = {
    vx_type: nx_tactics_books_age_of_sail.t_chapter_age_of_sail_overview
  }

  // (func chapter_age_of_sail_overview)
  static f_chapter_age_of_sail_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Age of Sail Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: Age of Sail?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: Age of Sail?",
          ":reference",
          "http://www.thepirateking.com/historical/cannon_projectiles.htm",
          ":summary",
          "The Age of Sail was the period in which international trade and naval warfare were dominated by sailing ships,\nlasting from the 16th to the mid 19th century.  This is a significant period during which square-rigged sailing\nships carried European settlers to many parts of the world in one of the most expansive human migrations in\nrecorded history."
        ),
        "Age of Sail Land Warfare",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Land Warfare",
          ":summary",
          "* Infantry\n* Cavalry\n* Muskets\n* Cannons\n* Artillery\n* High Ground"
        ),
        "Age of Sail Naval Warfare",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Naval Warfare",
          ":summary",
          "* Wind\n* Large Ships\n* Small Ships\n* Solid Shot\n* Burning Shot\n* Chain Shot\n* Fortifications"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_age_of_sail_weaponry
   * @return {chapter}
   */
  static t_chapter_age_of_sail_weaponry = {
    vx_type: vx_core.t_type
  }
  static e_chapter_age_of_sail_weaponry = {
    vx_type: nx_tactics_books_age_of_sail.t_chapter_age_of_sail_weaponry
  }

  // (func chapter_age_of_sail_weaponry)
  static f_chapter_age_of_sail_weaponry() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Age of Sail Weaponry",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Age of Sail Pistols",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Pistols",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "20mm Dragon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "20mm Dragon",
              ":reference",
              "The blunderbuss, and especially the shorter dragon, was typically issued to troops such as cavalry, who needed a\nlightweight, easily handled firearm.  The dragon became so associated with cavalry and mounted infantry that the\nterm dragoon became synonymous with mounted infantry.",
              ":summary",
              "* A short, muzzle-loading, flintlock, hand shotgun",
              ":muzzlevelocity",
              "225m/s"
            )
          )
        ),
        "Age of Sail Rifles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Rifles",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "12mm Carbine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "12mm Carbine",
              ":summary",
              "Short musket\n# Effective Range 60m\n# Muskets could regularly penetrate Plate Armor",
              ":muzzlevelocity",
              "438m/s"
            ),
            "18mm Musket",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "18mm Musket",
              ":reference",
              "The Brown Bess was used in the era of the expansion of the British Empire.  It was used for a hundred years with\nincremental changes in its design.",
              ":summary",
              "# Effective Range 60m\n# Muskets could regularly penetrate Plate Armor",
              ":titles",
              "Brown Bess",
              ":muzzlevelocity",
              "320m/s"
            ),
            "20mm Blunderbuss",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "20mm Blunderbuss",
              ":reference",
              "A blunderbuss is a muzzle-loading firearm with a flared, trumpet-like barrel and is the predecessor to the\nshotgun.  Most of these weapons are mid-sized, being smaller than most shoulder-fired arms, but larger than a\npistol.  The muzzle was flared not to increase the spread of the shot, but rather to funnel powder and shot into\nthe weapon, making it easier to reload on horseback or on a moving carriage.",
              ":muzzlevelocity",
              "225m/s"
            )
          )
        ),
        "Age of Sail Cannons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Cannons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Chainshot",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Chainshot",
              ":image",
              "AgeOfSail/Cannon_Chainshot.jpg",
              ":summary",
              "* Does no damage.  All [Hits] are [Disabled Tokens].  All [Critical Hits] are [Crippled Tokens]."
            ),
            ":Grapeshot",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Grapeshot",
              ":image",
              "AgeOfSail/Cannon_Grapeshot.jpg"
            ),
            "Round shot",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Round shot",
              ":image",
              "AgeOfSail/Cannon_Roundshot.jpg"
            ),
            "140mm Field Culverin",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "140mm Field Culverin",
              ":image",
              "AgeOfSail/Culverin.jpg",
              ":summary",
              "600,000J",
              ":classification",
              "Cannon",
              ":length",
              "4.5m",
              ":mass",
              "2.2tons",
              ":muzzlevelocity",
              "400m/s",
              ":range",
              "450m"
            ),
            "100mm Demi-culverin",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "100mm Demi-culverin",
              ":image",
              "AgeOfSail/Demi-culverin.jpg",
              ":classification",
              "Cannon",
              ":length",
              "3.4m",
              ":mass",
              "1.5tons",
              ":muzzlevelocity",
              "487m/s",
              ":range",
              "300m",
              ":rof",
              ".75/min"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_american_revolution
   * @return {chapter}
   */
  static t_chapter_american_revolution = {
    vx_type: vx_core.t_type
  }
  static e_chapter_american_revolution = {
    vx_type: nx_tactics_books_age_of_sail.t_chapter_american_revolution
  }

  // (func chapter_american_revolution)
  static f_chapter_american_revolution() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "American Revolution",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Age of Sail United States",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail United States",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "American Frigate",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "American Frigate",
              ":image",
              "AgeOfSail/AmericanFrigate.png",
              ":titles",
              "USS Constitution, Old Ironsides",
              ":speed",
              "24kph",
              ":classification",
              "Hvy. Naval Vessel",
              ":mass",
              "2200tons",
              ":length",
              "62m",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "21 inches (530 mm/88mm RHA)",
                  ":front",
                  "88mm",
                  ":back",
                  "88mm",
                  ":side",
                  "88mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Gunnery",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Gunnery",
                  ":summary",
                  "30 x 24-pounder (11 kg) long gun\n20 x 32-pounder (15 kg) carronade\n2 x 24-pounder (11 kg) bow chasers",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    ":Salvo",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Salvo"
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
   * @function chapter_french_revolution
   * @return {chapter}
   */
  static t_chapter_french_revolution = {
    vx_type: vx_core.t_type
  }
  static e_chapter_french_revolution = {
    vx_type: nx_tactics_books_age_of_sail.t_chapter_french_revolution
  }

  // (func chapter_french_revolution)
  static f_chapter_french_revolution() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "French Revolution"
    )
    return output
  }

  /**
   * @function chapter_golden_age_of_sail
   * @return {chapter}
   */
  static t_chapter_golden_age_of_sail = {
    vx_type: vx_core.t_type
  }
  static e_chapter_golden_age_of_sail = {
    vx_type: nx_tactics_books_age_of_sail.t_chapter_golden_age_of_sail
  }

  // (func chapter_golden_age_of_sail)
  static f_chapter_golden_age_of_sail() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Golden Age of Sail",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Age of Sail Scenarios",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Scenarios",
          ":scenariomap",
          vx_core.f_new(
            nx_tactics_base.t_scenariomap,
            ":Pirates",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Pirates"
            ),
            ":Swashbucklers",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Swashbucklers"
            )
          )
        ),
        "Age of Sail Dutch",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Dutch"
        ),
        "Age of Sail British",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail British",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "British Musketeers",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "British Musketeers",
              ":image",
              "AgeOfSail/British_Musketeers.png",
              ":summary",
              "Musket Infantry",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Firearms",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Firearms",
                  ":level",
                  "3",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "18mm Musket",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "18mm Musket"
                    )
                  )
                )
              )
            ),
            "British Caravel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "British Caravel",
              ":image",
              "AgeOfSail/BritishCaravel.png",
              ":speed",
              "15kph",
              ":classification",
              "Med. Naval Vessel",
              ":crew",
              "20",
              ":mass",
              "150tons",
              ":length",
              "25m",
              ":width",
              "9m",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "British Frigate",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "British Frigate",
              ":image",
              "AgeOfSail/BritishFrigate.png",
              ":reference",
              "A warship second only in size to the Ship-of-the-Line.  Frigates were three-masted with a raised forecastle\nand quarterdeck.  They had anywhere from 24 to 38 guns on her deck.  They were faster than the\nship-of-the-lines and were used for escort purposes.  They were sometimes used to hunt pirates.  Only a few\npirates were ever in command of a frigate as most pirates would flee from a frigate.",
              ":speed",
              "20kph",
              ":classification",
              "Med. Naval Vessel",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "14 inches (360 mm/60mm RHA)",
                  ":front",
                  "60mm",
                  ":back",
                  "60mm",
                  ":side",
                  "60mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "British Man-O-War",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "British Man-O-War",
              ":image",
              "AgeOfSail/BritishManOWar.png",
              ":classification",
              "Hvy. Naval Vessel",
              ":mass",
              "1000tons",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "14 inches (360 mm/60mm RHA)",
                  ":front",
                  "60mm",
                  ":back",
                  "60mm",
                  ":side",
                  "60mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "British Schooner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "British Schooner",
              ":image",
              "AgeOfSail/BritishSchooner.png",
              ":classification",
              "Med. Naval Vessel",
              ":mass",
              "80tons",
              ":length",
              "18m",
              ":width",
              "6m",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "British Racing Galleon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "British Racing Galleon",
              ":classification",
              "Lt. Naval Vessel",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            )
          )
        ),
        "East India Company",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "East India Company"
        ),
        ":French",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "French",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Napoleon Bonaparte",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Napoleon Bonaparte",
              ":image",
              "AgeOfSail/French_Napoleon.png"
            ),
            "French Musketeers",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "French Musketeers",
              ":image",
              "AgeOfSail/French_Musketeers.png",
              ":summary",
              "Musket Infantry",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Firearms",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Firearms",
                  ":level",
                  "3",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "18mm Musket",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "18mm Musket"
                    )
                  )
                )
              )
            ),
            "French Carabiners",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "French Carabiners",
              ":summary",
              "Light Cavalry carrying short Carbine rifles",
              ":classification",
              "Lt. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Firearms",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Firearms",
                  ":level",
                  "3",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "12mm Carbine",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "12mm Carbine"
                    )
                  )
                )
              )
            ),
            "French Dragoons",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "French Dragoons",
              ":image",
              "AgeOfSail/French_Dragoons.png",
              ":summary",
              "Musket Cavalry intending to ride into battle and dismount to fire.",
              ":classification",
              "Med. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Firearms",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Firearms",
                  ":level",
                  "3",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "18mm Musket",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "18mm Musket"
                    )
                  )
                )
              )
            ),
            "French Man-O-War",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "French Man-O-War",
              ":reference",
              "These ships were the heavy-guns of the fleet.  They resembled galleons in design, but had heavy fire-power.\nOnly the three major sea-powers of the time (Spain, England, and France) had many of these kind of ships.",
              ":classification",
              "Hvy. Naval Vessel",
              ":mass",
              "1000tons",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "14 inches (360 mm/60mm RHA)",
                  ":front",
                  "60mm",
                  ":back",
                  "60mm",
                  ":side",
                  "60mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "French Schooner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "French Schooner",
              ":image",
              "AgeOfSail/FrenchSchooner.png",
              ":classification",
              "Med. Naval Vessel",
              ":mass",
              "80tons",
              ":length",
              "18m",
              ":width",
              "6m",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            )
          )
        ),
        ":Pirates",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Pirates",
          ":summary",
          "The era of piracy in the Caribbean Sea began in the 17th century and died out in\nthe 1720s after the navies of the nations of Western Europe with colonies in the\nCaribbean began combating pirates.",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Pirate Crew",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pirate Crew",
              ":image",
              "AgeOfSail/Pirate_Crew.png",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Boarding Party",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Boarding Party"
                    )
                  )
                )
              )
            ),
            "Pirate Caravel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pirate Caravel",
              ":image",
              "AgeOfSail/PirateCaravel.png",
              ":speed",
              "15kph",
              ":classification",
              "Med. Naval Vessel",
              ":crew",
              "20",
              ":mass",
              "150tons",
              ":length",
              "25m",
              ":width",
              "9m",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "Pirate Schooner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pirate Schooner",
              ":image",
              "AgeOfSail/PirateSchooner.png",
              ":reference",
              "The Schooner has a narrow hull, two masts and is less than 100 tons.  She is generally rigged with two large\nsails.  She had a shallow draft which allowed her to remain in shallow coves waiting for her prey.  The\nSchooner is very fast and large enough to carry a plentiful crew.  It was a favorite among both pirates and\nsmugglers.",
              ":classification",
              "Med. Naval Vessel",
              ":mass",
              "80tons",
              ":length",
              "18m",
              ":width",
              "6m",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "Pirate Sloop",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pirate Sloop",
              ":reference",
              "The Sloop was fast, agile, and had a shallow draft.\nToday's sailing Yacht is essentially a sloop.",
              ":classification",
              "Lt. Naval Vessel",
              ":mass",
              "100tons",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "Pirate Brigantine",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pirate Brigantine",
              ":reference",
              "The brigantine was a small ship carrying both sails and oars.  It was a favorite of Mediterranean pirates\nfrom whence it got its name Brigantine meaning Brigand Ship.  Later the ship referred to a two-masted sailing\nship with much greater sailing power.",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            )
          )
        ),
        "Age of Sail Portuguese",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Portuguese",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Portuguese Caravel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Portuguese Caravel",
              ":reference",
              "The Nina was actually named the Santa Clara.  Nina was a pun on its owner's name: Juan Nino.",
              ":titles",
              "Nina, Pinta",
              ":speed",
              "15kph",
              ":classification",
              "Med. Naval Vessel",
              ":crew",
              "20",
              ":mass",
              "150tons",
              ":length",
              "25m",
              ":width",
              "9m",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "Portuguese Carrack",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Portuguese Carrack",
              ":reference",
              "All of Columbus' ships were second-hand (if not third or more) and were never meant for exploration.",
              ":titles",
              "Santa Maria",
              ":speed",
              "10kph",
              ":classification",
              "Med. Naval Vessel",
              ":crew",
              "40",
              ":mass",
              "300tons",
              ":length",
              "25m",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            )
          )
        ),
        "Age of Sail Spanish",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Spanish",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Silver Train",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Silver Train"
            ),
            "Treasure Fleet",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Treasure Fleet",
              ":classification",
              "Hvy. Naval Vessel"
            ),
            "Spanish Caravel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Spanish Caravel",
              ":image",
              "AgeOfSail/SpanishCaravel.png",
              ":speed",
              "15kph",
              ":classification",
              "Med. Naval Vessel",
              ":crew",
              "20",
              ":mass",
              "150tons",
              ":length",
              "25m",
              ":width",
              "9m",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "7 inches (180 mm/30mm RHA)",
                  ":front",
                  "30mm",
                  ":back",
                  "30mm",
                  ":side",
                  "30mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "Spanish Galleon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Spanish Galleon",
              ":image",
              "AgeOfSail/SpanishGalleon.png",
              ":reference",
              "Large ships meant for transporting cargo.  The Spanish treasure fleets were made of these ships.  Although\nthey were sluggish, they weren't the easy target you would expect for they could carry heavy cannon which\nmade attacking them difficult.  They had two to three decks.  Most had three masts.  Some galleons sported 4\nmasts but these were an exception to the rule.",
              ":classification",
              "Hvy. Naval Vessel",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "14 inches (360 mm/60mm RHA)",
                  ":front",
                  "60mm",
                  ":back",
                  "60mm",
                  ":side",
                  "60mm"
                )
              )
            ),
            "Spanish Man-O-War",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Spanish Man-O-War",
              ":image",
              "AgeOfSail/SpanishManOWar.png",
              ":classification",
              "Hvy. Naval Vessel",
              ":mass",
              "1000tons",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Armor",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Armor",
                  ":summary",
                  "14 inches (360 mm/60mm RHA)",
                  ":front",
                  "60mm",
                  ":back",
                  "60mm",
                  ":side",
                  "60mm"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
                )
              )
            ),
            "Spanish Schooner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Spanish Schooner",
              ":image",
              "AgeOfSail/SpanishSchooner.png",
              ":classification",
              "Med. Naval Vessel",
              ":mass",
              "80tons",
              ":length",
              "18m",
              ":width",
              "6m",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Seamanship",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Seamanship",
                  ":level",
                  "4"
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
   * @function chapter_renaissance
   * @return {chapter}
   */
  static t_chapter_renaissance = {
    vx_type: vx_core.t_type
  }
  static e_chapter_renaissance = {
    vx_type: nx_tactics_books_age_of_sail.t_chapter_renaissance
  }

  // (func chapter_renaissance)
  static f_chapter_renaissance() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Renaissance"
    )
    return output
  }

  /**
   * @function chapter_tokugawa_shogunate
   * @return {chapter}
   */
  static t_chapter_tokugawa_shogunate = {
    vx_type: vx_core.t_type
  }
  static e_chapter_tokugawa_shogunate = {
    vx_type: nx_tactics_books_age_of_sail.t_chapter_tokugawa_shogunate
  }

  // (func chapter_tokugawa_shogunate)
  static f_chapter_tokugawa_shogunate() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Tokugawa Shogunate",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Tokugawa Prefecture",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Tokugawa Prefecture",
          ":placemap",
          vx_core.f_new(
            nx_tactics_base.t_placemap,
            "Tokugawa Town",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Tokugawa Town",
              ":summary",
              "* The Daimyo chose to place his castle near a moderately-sized villiage.  He wanted the advantage of a town\nwithout having more people than could be kept track of.  The Daimyo's presense has brought an influx of trade, and\nthe town is surprisingly wealthy.\n* There is a cooper, a brewer, a courtesan house, an inn, a silk-maker, a woodworker, 2 woodcutters, 15 merchants,\n20 fishermen, over 100 farmers, and about 15 vagrants.\n* There are 2 police officers and many of the townspeople are in the reserve.\n* In addition, the Daimyo personally supports 25 samurai, a swordsmith, an armorer, a fletcher, 2 carpenters, 2\nadvisors, a scupltor, a jeweler, 2 fine weavers, 2 painters, 2 scribes, and a mistress."
            ),
            "Buddhist Temple",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Buddhist Temple",
              ":summary",
              "* A temple was established in the area long before the Daimyo located himself in the area.  The temple remains a\nsignificant political power, and with their Sohei and Budoka, they could be more than an annoyance to the Daimyo.\n* Besides the master, there are 4 senior priests (Gakusho) and 20 monks (12 Gakusho and 8 Budoka).  There are also\n5 Sohei that act as guards and trainers.  The temple is supported by donations and tithes.\n* Martial training is only allowed as it pertains to self-awareness.  Fighting people is a sin unless in the\nprotection of others.  Training has been a point of contention with the Daimyo, but the issue has died down."
            )
          ),
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Daimyo",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Daimyo",
              ":summary",
              "* A gruff, no nonsense samurai.  He craved the power and pretige of this position, but now finds that life as a\nDaimyo is sheltered and dull.\n* He is convinced that there is a plot to take his life, though there is no evidence to support this.  He seems to\nenjoy the challenge of defending himself against this threat.  He does fear dying dishonorably.  For this reason,\nhe has his food rigorously tested and his bedchambers inordinately guarded.  He tries to leave himself more open to\na direct attack, so he is often poorly guarded when he is armed.\n* The Daimyo feels intellectually challenged by both the Temple Master and the Castellan.  He has become\nincreasingly interested in these mind games, and a good challenge is a sure way to the Daimyo's good favor.",
              ":titles",
              "Kenji Ginichi"
            ),
            "Daimyo's Wife",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Daimyo's Wife",
              ":summary",
              "* Efficient, beautiful, and totally unimportant.  The Daimyo is not interested in her at all.  She is only a baby\nmachine to him (and not a very good one).  She does not aspire to higher station and is quite content with her\ncircle of friends from the villiage who visit often."
            ),
            "Daimyo's Son",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Daimyo's Son",
              ":summary",
              "* A bored an somewhat obnoxious teenager.  He revels in the past exploits of his illustrious father and is horrified\nby the inactive positon he is in now (a feeling shared by the Daimyo).  The idea of being a Daimyo (or a court\nsamural makes him ill.  He wants to be an adventurer or a a ronin.  He has studied with the samurai and budoka, but\nhe lacks incentive and discipline.  His most accomplished skill is distracting his guards so he can slip away."
            ),
            ":Castellan",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Castellan",
              ":summary",
              "* A classic samurai, dedicated and loyal.  His main duties are to keep the province running, but more importantly he\nmust protect the Daimyo and his family.  This last task has proven very difficult.  The Daimyo and his son have\nproven very difficult to defend.  The Daimyo constantly reduces his guards, and his son tries to escape them.  The\ncastellan may not disobey the Daimyo, but he has prepared a long list of ways to manipulate the Daimyo into safer\ncourses of action.  When unable to control the Daimyo, he will send troops 'on patrol' in the Daimyo's area.  He\nwill delay or harry the Daimyo to make his movements less predictable.  The Daimyo is aware of these machinations\nand enjoys outsmarting the castellan wherever possible.  So far, the castellan is easily winning this battle of\nwits."
            ),
            "Temple Master",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Temple Master",
              ":summary",
              "* The temple master is a man of great diplomatic skill, and the Daimyo has found himself outmatched in all but\nmilitary issues.  The Daimyo often does not grant the master an audience until he has brushed up on the matter at\nhand."
            ),
            ":Oyabun",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Oyabun",
              ":summary",
              "* The head of the local Yakuza sees that the Daimyo is acting rather recklessly and is plotting an elaborate and\nsubtle scheme to take advantage of the situation."
            )
          )
        ),
        "Age of Sail Japan",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Age of Sail Japan",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Japanese Archer",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Japanese Archer"
            ),
            "Japanese Daimyo",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Japanese Daimyo"
            ),
            "Japanese Emperor",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Japanese Emperor"
            ),
            "Japanese Rifleman",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Japanese Rifleman"
            ),
            "Japnese Samurai",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Japnese Samurai"
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
    vx_type: nx_tactics_books_age_of_sail.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Age Of Sail",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Age of Sail Overview",
        nx_tactics_books_age_of_sail.f_chapter_age_of_sail_overview(),
        "Age of Sail Weaponry",
        nx_tactics_books_age_of_sail.f_chapter_age_of_sail_weaponry(),
        "Renaissance",
        nx_tactics_books_age_of_sail.f_chapter_renaissance(),
        "Golden Age of Sail",
        nx_tactics_books_age_of_sail.f_chapter_golden_age_of_sail(),
        "American Revolution",
        nx_tactics_books_age_of_sail.f_chapter_american_revolution(),
        "French Revolution",
        nx_tactics_books_age_of_sail.f_chapter_french_revolution(),
        "Tokugawa Shogunate",
        nx_tactics_books_age_of_sail.f_chapter_tokugawa_shogunate()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_age_of_sail_overview": nx_tactics_books_age_of_sail.e_chapter_age_of_sail_overview,
      "chapter_age_of_sail_weaponry": nx_tactics_books_age_of_sail.e_chapter_age_of_sail_weaponry,
      "chapter_american_revolution": nx_tactics_books_age_of_sail.e_chapter_american_revolution,
      "chapter_french_revolution": nx_tactics_books_age_of_sail.e_chapter_french_revolution,
      "chapter_golden_age_of_sail": nx_tactics_books_age_of_sail.e_chapter_golden_age_of_sail,
      "chapter_renaissance": nx_tactics_books_age_of_sail.e_chapter_renaissance,
      "chapter_tokugawa_shogunate": nx_tactics_books_age_of_sail.e_chapter_tokugawa_shogunate,
      "tacticsbook": nx_tactics_books_age_of_sail.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_age_of_sail_overview": nx_tactics_books_age_of_sail.t_chapter_age_of_sail_overview,
      "chapter_age_of_sail_weaponry": nx_tactics_books_age_of_sail.t_chapter_age_of_sail_weaponry,
      "chapter_american_revolution": nx_tactics_books_age_of_sail.t_chapter_american_revolution,
      "chapter_french_revolution": nx_tactics_books_age_of_sail.t_chapter_french_revolution,
      "chapter_golden_age_of_sail": nx_tactics_books_age_of_sail.t_chapter_golden_age_of_sail,
      "chapter_renaissance": nx_tactics_books_age_of_sail.t_chapter_renaissance,
      "chapter_tokugawa_shogunate": nx_tactics_books_age_of_sail.t_chapter_tokugawa_shogunate,
      "tacticsbook": nx_tactics_books_age_of_sail.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/age_of_sail",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_age_of_sail_overview)
    nx_tactics_books_age_of_sail.t_chapter_age_of_sail_overview['vx_value'] = {
      name          : "chapter_age_of_sail_overview",
      pkgname       : "nx/tactics/books/age_of_sail",
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
      fn            : nx_tactics_books_age_of_sail.f_chapter_age_of_sail_overview
    }

    // (func chapter_age_of_sail_weaponry)
    nx_tactics_books_age_of_sail.t_chapter_age_of_sail_weaponry['vx_value'] = {
      name          : "chapter_age_of_sail_weaponry",
      pkgname       : "nx/tactics/books/age_of_sail",
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
      fn            : nx_tactics_books_age_of_sail.f_chapter_age_of_sail_weaponry
    }

    // (func chapter_american_revolution)
    nx_tactics_books_age_of_sail.t_chapter_american_revolution['vx_value'] = {
      name          : "chapter_american_revolution",
      pkgname       : "nx/tactics/books/age_of_sail",
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
      fn            : nx_tactics_books_age_of_sail.f_chapter_american_revolution
    }

    // (func chapter_french_revolution)
    nx_tactics_books_age_of_sail.t_chapter_french_revolution['vx_value'] = {
      name          : "chapter_french_revolution",
      pkgname       : "nx/tactics/books/age_of_sail",
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
      fn            : nx_tactics_books_age_of_sail.f_chapter_french_revolution
    }

    // (func chapter_golden_age_of_sail)
    nx_tactics_books_age_of_sail.t_chapter_golden_age_of_sail['vx_value'] = {
      name          : "chapter_golden_age_of_sail",
      pkgname       : "nx/tactics/books/age_of_sail",
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
      fn            : nx_tactics_books_age_of_sail.f_chapter_golden_age_of_sail
    }

    // (func chapter_renaissance)
    nx_tactics_books_age_of_sail.t_chapter_renaissance['vx_value'] = {
      name          : "chapter_renaissance",
      pkgname       : "nx/tactics/books/age_of_sail",
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
      fn            : nx_tactics_books_age_of_sail.f_chapter_renaissance
    }

    // (func chapter_tokugawa_shogunate)
    nx_tactics_books_age_of_sail.t_chapter_tokugawa_shogunate['vx_value'] = {
      name          : "chapter_tokugawa_shogunate",
      pkgname       : "nx/tactics/books/age_of_sail",
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
      fn            : nx_tactics_books_age_of_sail.f_chapter_tokugawa_shogunate
    }

    // (func tacticsbook)
    nx_tactics_books_age_of_sail.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/age_of_sail",
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
      fn            : nx_tactics_books_age_of_sail.f_tacticsbook
    }

  }
}
