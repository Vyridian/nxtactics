'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_pulp_fiction {

  /**
   * @function chapter_action_adventure
   * @return {chapter}
   */
  static t_chapter_action_adventure = {}
  static e_chapter_action_adventure = {vx_type: nx_tactics_books_pulp_fiction.t_chapter_action_adventure}

  // (func chapter_action_adventure)
  static f_chapter_action_adventure() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Action/Adventure",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Government Units",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Government Units",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Government Agent",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Government Agent",
              ":summary",
              "We have top men working on it now.  Who?  Top... men. - Raiders of the Lost Ark"
            )
          )
        ),
        "Treasure Hunters",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Treasure Hunters",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Indiana Jones",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Indiana Jones",
              ":image",
              "PulpFiction/IndianaJones.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Knowledge",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Knowledge",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    ":Antiquities",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Antiquities"
                    ),
                    ":Archeology",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Archeology"
                    ),
                    "Ancient History",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Ancient History"
                    ),
                    "Religious Studies",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Religious Studies"
                    )
                  )
                )
              )
            ),
            "Lara Croft",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Lara Croft",
              ":image",
              "PulpFiction/LaraCroft.png",
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
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_flash_gordon
   * @return {chapter}
   */
  static t_chapter_flash_gordon = {}
  static e_chapter_flash_gordon = {vx_type: nx_tactics_books_pulp_fiction.t_chapter_flash_gordon}

  // (func chapter_flash_gordon)
  static f_chapter_flash_gordon() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Flash Gordon"
    )
    return output
  }

  /**
   * @function chapter_hardboiled_detective
   * @return {chapter}
   */
  static t_chapter_hardboiled_detective = {}
  static e_chapter_hardboiled_detective = {vx_type: nx_tactics_books_pulp_fiction.t_chapter_hardboiled_detective}

  // (func chapter_hardboiled_detective)
  static f_chapter_hardboiled_detective() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Hardboiled Detective"
    )
    return output
  }

  /**
   * @function chapter_john_carter_on_mars
   * @return {chapter}
   */
  static t_chapter_john_carter_on_mars = {}
  static e_chapter_john_carter_on_mars = {vx_type: nx_tactics_books_pulp_fiction.t_chapter_john_carter_on_mars}

  // (func chapter_john_carter_on_mars)
  static f_chapter_john_carter_on_mars() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "John Carter on Mars"
    )
    return output
  }

  /**
   * @function chapter_land_of_the_lost
   * @return {chapter}
   */
  static t_chapter_land_of_the_lost = {}
  static e_chapter_land_of_the_lost = {vx_type: nx_tactics_books_pulp_fiction.t_chapter_land_of_the_lost}

  // (func chapter_land_of_the_lost)
  static f_chapter_land_of_the_lost() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Land of the Lost",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Land of the Lost Units",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Land of the Lost Units",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Pylon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pylon"
            ),
            ":Skylon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Skylon"
            ),
            ":Enik",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Enik"
            ),
            ":Pakuni",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pakuni"
            ),
            ":Sleestak",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sleestak"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_lost_continent
   * @return {chapter}
   */
  static t_chapter_lost_continent = {}
  static e_chapter_lost_continent = {vx_type: nx_tactics_books_pulp_fiction.t_chapter_lost_continent}

  // (func chapter_lost_continent)
  static f_chapter_lost_continent() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Lost Continent"
    )
    return output
  }

  /**
   * @function chapter_pulp_fiction_overview
   * @return {chapter}
   */
  static t_chapter_pulp_fiction_overview = {}
  static e_chapter_pulp_fiction_overview = {vx_type: nx_tactics_books_pulp_fiction.t_chapter_pulp_fiction_overview}

  // (func chapter_pulp_fiction_overview)
  static f_chapter_pulp_fiction_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Pulp Fiction Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: Pulp Fiction?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: Pulp Fiction?"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_true_grit___crime
   * @return {chapter}
   */
  static t_chapter_true_grit___crime = {}
  static e_chapter_true_grit___crime = {vx_type: nx_tactics_books_pulp_fiction.t_chapter_true_grit___crime}

  // (func chapter_true_grit___crime)
  static f_chapter_true_grit___crime() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "True Grit / Crime"
    )
    return output
  }

  /**
   * @function chapter_war_of_the_worlds
   * @return {chapter}
   */
  static t_chapter_war_of_the_worlds = {}
  static e_chapter_war_of_the_worlds = {vx_type: nx_tactics_books_pulp_fiction.t_chapter_war_of_the_worlds}

  // (func chapter_war_of_the_worlds)
  static f_chapter_war_of_the_worlds() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "War of the Worlds"
    )
    return output
  }

  /**
   * @function tacticsbook
   * @return {book}
   */
  static t_tacticsbook = {}
  static e_tacticsbook = {vx_type: nx_tactics_books_pulp_fiction.t_tacticsbook}

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Pulp Fiction",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Pulp Fiction Overview",
        nx_tactics_books_pulp_fiction.f_chapter_pulp_fiction_overview(),
        "Action/Adventure",
        nx_tactics_books_pulp_fiction.f_chapter_action_adventure(),
        "Flash Gordon",
        nx_tactics_books_pulp_fiction.f_chapter_flash_gordon(),
        "Hardboiled Detective",
        nx_tactics_books_pulp_fiction.f_chapter_hardboiled_detective(),
        "John Carter on Mars",
        nx_tactics_books_pulp_fiction.f_chapter_john_carter_on_mars(),
        "Land of the Lost",
        nx_tactics_books_pulp_fiction.f_chapter_land_of_the_lost(),
        "Lost Continent",
        nx_tactics_books_pulp_fiction.f_chapter_lost_continent(),
        "True Grit / Crime",
        nx_tactics_books_pulp_fiction.f_chapter_true_grit___crime(),
        "War of the Worlds",
        nx_tactics_books_pulp_fiction.f_chapter_war_of_the_worlds()
      )
    )
    return output
  }

  // empty types


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_action_adventure": nx_tactics_books_pulp_fiction.e_chapter_action_adventure,
      "chapter_flash_gordon": nx_tactics_books_pulp_fiction.e_chapter_flash_gordon,
      "chapter_hardboiled_detective": nx_tactics_books_pulp_fiction.e_chapter_hardboiled_detective,
      "chapter_john_carter_on_mars": nx_tactics_books_pulp_fiction.e_chapter_john_carter_on_mars,
      "chapter_land_of_the_lost": nx_tactics_books_pulp_fiction.e_chapter_land_of_the_lost,
      "chapter_lost_continent": nx_tactics_books_pulp_fiction.e_chapter_lost_continent,
      "chapter_pulp_fiction_overview": nx_tactics_books_pulp_fiction.e_chapter_pulp_fiction_overview,
      "chapter_true_grit___crime": nx_tactics_books_pulp_fiction.e_chapter_true_grit___crime,
      "chapter_war_of_the_worlds": nx_tactics_books_pulp_fiction.e_chapter_war_of_the_worlds,
      "tacticsbook": nx_tactics_books_pulp_fiction.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_action_adventure": nx_tactics_books_pulp_fiction.t_chapter_action_adventure,
      "chapter_flash_gordon": nx_tactics_books_pulp_fiction.t_chapter_flash_gordon,
      "chapter_hardboiled_detective": nx_tactics_books_pulp_fiction.t_chapter_hardboiled_detective,
      "chapter_john_carter_on_mars": nx_tactics_books_pulp_fiction.t_chapter_john_carter_on_mars,
      "chapter_land_of_the_lost": nx_tactics_books_pulp_fiction.t_chapter_land_of_the_lost,
      "chapter_lost_continent": nx_tactics_books_pulp_fiction.t_chapter_lost_continent,
      "chapter_pulp_fiction_overview": nx_tactics_books_pulp_fiction.t_chapter_pulp_fiction_overview,
      "chapter_true_grit___crime": nx_tactics_books_pulp_fiction.t_chapter_true_grit___crime,
      "chapter_war_of_the_worlds": nx_tactics_books_pulp_fiction.t_chapter_war_of_the_worlds,
      "tacticsbook": nx_tactics_books_pulp_fiction.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/pulp_fiction",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_action_adventure)
    nx_tactics_books_pulp_fiction.t_chapter_action_adventure['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_chapter_action_adventure['vx_value'] = {
      name          : "chapter_action_adventure",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_chapter_action_adventure
    }

    // (func chapter_flash_gordon)
    nx_tactics_books_pulp_fiction.t_chapter_flash_gordon['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_chapter_flash_gordon['vx_value'] = {
      name          : "chapter_flash_gordon",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_chapter_flash_gordon
    }

    // (func chapter_hardboiled_detective)
    nx_tactics_books_pulp_fiction.t_chapter_hardboiled_detective['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_chapter_hardboiled_detective['vx_value'] = {
      name          : "chapter_hardboiled_detective",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_chapter_hardboiled_detective
    }

    // (func chapter_john_carter_on_mars)
    nx_tactics_books_pulp_fiction.t_chapter_john_carter_on_mars['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_chapter_john_carter_on_mars['vx_value'] = {
      name          : "chapter_john_carter_on_mars",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_chapter_john_carter_on_mars
    }

    // (func chapter_land_of_the_lost)
    nx_tactics_books_pulp_fiction.t_chapter_land_of_the_lost['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_chapter_land_of_the_lost['vx_value'] = {
      name          : "chapter_land_of_the_lost",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_chapter_land_of_the_lost
    }

    // (func chapter_lost_continent)
    nx_tactics_books_pulp_fiction.t_chapter_lost_continent['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_chapter_lost_continent['vx_value'] = {
      name          : "chapter_lost_continent",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_chapter_lost_continent
    }

    // (func chapter_pulp_fiction_overview)
    nx_tactics_books_pulp_fiction.t_chapter_pulp_fiction_overview['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_chapter_pulp_fiction_overview['vx_value'] = {
      name          : "chapter_pulp_fiction_overview",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_chapter_pulp_fiction_overview
    }

    // (func chapter_true_grit___crime)
    nx_tactics_books_pulp_fiction.t_chapter_true_grit___crime['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_chapter_true_grit___crime['vx_value'] = {
      name          : "chapter_true_grit___crime",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_chapter_true_grit___crime
    }

    // (func chapter_war_of_the_worlds)
    nx_tactics_books_pulp_fiction.t_chapter_war_of_the_worlds['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_chapter_war_of_the_worlds['vx_value'] = {
      name          : "chapter_war_of_the_worlds",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_chapter_war_of_the_worlds
    }

    // (func tacticsbook)
    nx_tactics_books_pulp_fiction.t_tacticsbook['vx_type'] = vx_core.t_type
    nx_tactics_books_pulp_fiction.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/pulp_fiction",
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
      fn            : nx_tactics_books_pulp_fiction.f_tacticsbook
    }

  }
}
