'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_medieval {

  /**
   * @function chapter_medieval_english
   * @return {chapter}
   */
  static t_chapter_medieval_english = {
    vx_type: vx_core.t_type
  }
  static e_chapter_medieval_english = {
    vx_type: nx_tactics_books_medieval.t_chapter_medieval_english
  }

  // (func chapter_medieval_english)
  static f_chapter_medieval_english() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Medieval English",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Medieval English Infantry",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Medieval English Infantry",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "English Longbowman",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "English Longbowman"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_medieval_french
   * @return {chapter}
   */
  static t_chapter_medieval_french = {
    vx_type: vx_core.t_type
  }
  static e_chapter_medieval_french = {
    vx_type: nx_tactics_books_medieval.t_chapter_medieval_french
  }

  // (func chapter_medieval_french)
  static f_chapter_medieval_french() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Medieval French",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Medieval French Infantry",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Medieval French Infantry",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "French Gendarme",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "French Gendarme",
              ":summary",
              "Founded in 1400s.",
              ":classification",
              "Hvy. Cavalry"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_medieval_german
   * @return {chapter}
   */
  static t_chapter_medieval_german = {
    vx_type: vx_core.t_type
  }
  static e_chapter_medieval_german = {
    vx_type: nx_tactics_books_medieval.t_chapter_medieval_german
  }

  // (func chapter_medieval_german)
  static f_chapter_medieval_german() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Medieval German"
    )
    return output
  }

  /**
   * @function chapter_medieval_items
   * @return {chapter}
   */
  static t_chapter_medieval_items = {
    vx_type: vx_core.t_type
  }
  static e_chapter_medieval_items = {
    vx_type: nx_tactics_books_medieval.t_chapter_medieval_items
  }

  // (func chapter_medieval_items)
  static f_chapter_medieval_items() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Medieval Items",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Medieval Firearms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Medieval Firearms",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "760mm Arquebus",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "760mm Arquebus",
              ":summary",
              "In terms of accuracy, the arquebus was unable to match the accuracy of a bow in the hands of a highly-skilled archer. However, the arquebus had a faster rate of fire than the most powerful crossbow, had a shorter learning curve than a longbow, and was more powerful than either. An arquebusier could carry more ammunition and powder than a crossbowman or longbowman could with bolts or arrows. Once the methods were developed, powder and shot were relatively easy to mass-produce, while arrow making was a genuine craft requiring highly skilled labor. The weapon also had the added advantage of frightening enemies (and horses) with the noise. Wind can reduce the accuracy of archery, but has much less of an effect on an arquebusier. Perhaps most important, producing an effective arquebusier required much less training than producing an effective bowman.\n\nAs low-velocity firearms, they were used against enemies that were often partially or fully protected by steel-plate armour. Plate armour was standard in European combat from about 1400 until the middle of the 17th century. Good suits of plate would usually stop an arquebus ball at long range. It was a common practice to 'proof' (test) armour by firing a pistol or arquebus at a new breastplate. The small dent would be circled by engraving, to call attention to it. However, at close range, it was possible to pierce even the armor of knights and other heavy cavalry,",
              ":muzzlevelocity",
              "449m/s"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_medieval_overview
   * @return {chapter}
   */
  static t_chapter_medieval_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_medieval_overview = {
    vx_type: nx_tactics_books_medieval.t_chapter_medieval_overview
  }

  // (func chapter_medieval_overview)
  static f_chapter_medieval_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Medieval Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: Medieval?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: Medieval?"
        ),
        "Medieval Land Warfare",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Medieval Land Warfare",
          ":summary",
          "* Infantry\n* Formations\n* Axemen\n* Polearms\n* Cavalry\n* Horse Archers\n* Armored Cavalry\n* Knights\n* Elephants\n* Chariots\n* Archers\n* Longbows\n* Crossbows\n* Siege\n* Ballista\n* Catapult\n* Fortifications"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_medieval_scenarios
   * @return {chapter}
   */
  static t_chapter_medieval_scenarios = {
    vx_type: vx_core.t_type
  }
  static e_chapter_medieval_scenarios = {
    vx_type: nx_tactics_books_medieval.t_chapter_medieval_scenarios
  }

  // (func chapter_medieval_scenarios)
  static f_chapter_medieval_scenarios() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Medieval Scenarios",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Medieval Events",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Medieval Events",
          ":scenariomap",
          vx_core.f_new(
            nx_tactics_base.t_scenariomap,
            ":Assassination",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Assassination"
            ),
            "Bandit Raid",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Bandit Raid",
              ":reference",
              "Seven Samurai"
            ),
            ":Battle",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Battle"
            ),
            ":Ceremony",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Ceremony"
            ),
            ":Contest",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Contest"
            ),
            ":Courier",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Courier"
            ),
            ":Deserters",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Deserters"
            ),
            ":Duel",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Duel"
            ),
            "Empty Battlefield",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Empty Battlefield"
            ),
            ":Escort",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Escort"
            ),
            "Fist Fight",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Fist Fight"
            ),
            ":Highwaymen",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Highwaymen"
            ),
            ":Hunt",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Hunt"
            ),
            "Noble Hunt",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Noble Hunt"
            ),
            "Noble Party",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Noble Party",
              ":reference",
              "Cinderella"
            ),
            "Peasant Demonstration",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Peasant Demonstration",
              ":summary",
              "* Put down or support minor uprisings."
            ),
            "Peasant Discontent",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Peasant Discontent",
              ":summary",
              "* Put down or support minor uprisings."
            ),
            "Peasant Uprising",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Peasant Uprising",
              ":summary",
              "* Put down or support a major uprising."
            ),
            ":Quest",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Quest"
            ),
            "Scouting Mission",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Scouting Mission"
            ),
            ":Spying",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Spying"
            ),
            "Visiting Dignitary",
            vx_core.f_new(
              nx_tactics_base.t_scenario,
              ":name",
              "Visiting Dignitary"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_medieval_spanish
   * @return {chapter}
   */
  static t_chapter_medieval_spanish = {
    vx_type: vx_core.t_type
  }
  static e_chapter_medieval_spanish = {
    vx_type: nx_tactics_books_medieval.t_chapter_medieval_spanish
  }

  // (func chapter_medieval_spanish)
  static f_chapter_medieval_spanish() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Medieval Spanish"
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
    vx_type: nx_tactics_books_medieval.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Medieval",
      ":image",
      "Medieval-2-Total-War-Kingdoms-642.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Medieval Overview",
        nx_tactics_books_medieval.f_chapter_medieval_overview(),
        "Medieval Scenarios",
        nx_tactics_books_medieval.f_chapter_medieval_scenarios(),
        "Medieval Items",
        nx_tactics_books_medieval.f_chapter_medieval_items(),
        "Medieval English",
        nx_tactics_books_medieval.f_chapter_medieval_english(),
        "Medieval French",
        nx_tactics_books_medieval.f_chapter_medieval_french(),
        "Medieval German",
        nx_tactics_books_medieval.f_chapter_medieval_german(),
        "Medieval Spanish",
        nx_tactics_books_medieval.f_chapter_medieval_spanish()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_medieval_english": nx_tactics_books_medieval.e_chapter_medieval_english,
      "chapter_medieval_french": nx_tactics_books_medieval.e_chapter_medieval_french,
      "chapter_medieval_german": nx_tactics_books_medieval.e_chapter_medieval_german,
      "chapter_medieval_items": nx_tactics_books_medieval.e_chapter_medieval_items,
      "chapter_medieval_overview": nx_tactics_books_medieval.e_chapter_medieval_overview,
      "chapter_medieval_scenarios": nx_tactics_books_medieval.e_chapter_medieval_scenarios,
      "chapter_medieval_spanish": nx_tactics_books_medieval.e_chapter_medieval_spanish,
      "tacticsbook": nx_tactics_books_medieval.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_medieval_english": nx_tactics_books_medieval.t_chapter_medieval_english,
      "chapter_medieval_french": nx_tactics_books_medieval.t_chapter_medieval_french,
      "chapter_medieval_german": nx_tactics_books_medieval.t_chapter_medieval_german,
      "chapter_medieval_items": nx_tactics_books_medieval.t_chapter_medieval_items,
      "chapter_medieval_overview": nx_tactics_books_medieval.t_chapter_medieval_overview,
      "chapter_medieval_scenarios": nx_tactics_books_medieval.t_chapter_medieval_scenarios,
      "chapter_medieval_spanish": nx_tactics_books_medieval.t_chapter_medieval_spanish,
      "tacticsbook": nx_tactics_books_medieval.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/medieval",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_medieval_english)
    nx_tactics_books_medieval.t_chapter_medieval_english['vx_value'] = {
      name          : "chapter_medieval_english",
      pkgname       : "nx/tactics/books/medieval",
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
      fn            : nx_tactics_books_medieval.f_chapter_medieval_english
    }

    // (func chapter_medieval_french)
    nx_tactics_books_medieval.t_chapter_medieval_french['vx_value'] = {
      name          : "chapter_medieval_french",
      pkgname       : "nx/tactics/books/medieval",
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
      fn            : nx_tactics_books_medieval.f_chapter_medieval_french
    }

    // (func chapter_medieval_german)
    nx_tactics_books_medieval.t_chapter_medieval_german['vx_value'] = {
      name          : "chapter_medieval_german",
      pkgname       : "nx/tactics/books/medieval",
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
      fn            : nx_tactics_books_medieval.f_chapter_medieval_german
    }

    // (func chapter_medieval_items)
    nx_tactics_books_medieval.t_chapter_medieval_items['vx_value'] = {
      name          : "chapter_medieval_items",
      pkgname       : "nx/tactics/books/medieval",
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
      fn            : nx_tactics_books_medieval.f_chapter_medieval_items
    }

    // (func chapter_medieval_overview)
    nx_tactics_books_medieval.t_chapter_medieval_overview['vx_value'] = {
      name          : "chapter_medieval_overview",
      pkgname       : "nx/tactics/books/medieval",
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
      fn            : nx_tactics_books_medieval.f_chapter_medieval_overview
    }

    // (func chapter_medieval_scenarios)
    nx_tactics_books_medieval.t_chapter_medieval_scenarios['vx_value'] = {
      name          : "chapter_medieval_scenarios",
      pkgname       : "nx/tactics/books/medieval",
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
      fn            : nx_tactics_books_medieval.f_chapter_medieval_scenarios
    }

    // (func chapter_medieval_spanish)
    nx_tactics_books_medieval.t_chapter_medieval_spanish['vx_value'] = {
      name          : "chapter_medieval_spanish",
      pkgname       : "nx/tactics/books/medieval",
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
      fn            : nx_tactics_books_medieval.f_chapter_medieval_spanish
    }

    // (func tacticsbook)
    nx_tactics_books_medieval.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/medieval",
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
      fn            : nx_tactics_books_medieval.f_tacticsbook
    }

  }
}
