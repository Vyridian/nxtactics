'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_prehistory {

  /**
   * @function chapter_prehistoric_creatures
   * @return {chapter}
   */
  static t_chapter_prehistoric_creatures = {
    vx_type: vx_core.t_type
  }
  static e_chapter_prehistoric_creatures = {
    vx_type: nx_tactics_books_prehistory.t_chapter_prehistoric_creatures
  }

  // (func chapter_prehistoric_creatures)
  static f_chapter_prehistoric_creatures() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Prehistoric Creatures",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        ":Dinosaurs",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Dinosaurs",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Allosaurus",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Allosaurus"),
            ":Ankylosaur",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Ankylosaur"),
            "Brontosaur (Apatosaurus)",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Brontosaur (Apatosaurus)"),
            ":Protoceratops",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Protoceratops"),
            ":Stegosaurus",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Stegosaurus"),
            ":Triceratops",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Triceratops"),
            ":Velociraptor",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Velociraptor",
              ":summary",
              "Turkey sized carnivore",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                "Natural Weaponry",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Natural Weaponry",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Jaws of Death",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Jaws of Death")
                  )
                )
              )
            ),
            "Tyrannosaurus Rex",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Tyrannosaurus Rex",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                "Natural Weaponry",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Natural Weaponry",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Jaws of Death",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Jaws of Death"),
                    "Swallow Whole",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Swallow Whole")
                  )
                )
              )
            )
          )
        ),
        "Prehistoric Avian Creatures",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Prehistoric Avian Creatures",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Pterodactyl",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pterodactyl")
          )
        ),
        "Prehistoric Insects",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Prehistoric Insects",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Giant Dragonfly",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Giant Dragonfly"),
            "Giant Mosquito",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Giant Mosquito")
          )
        ),
        "Prehistoric Marine Creatures",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Prehistoric Marine Creatures",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Giant Gar",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Giant Gar"),
            "Giant Turtle",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Giant Turtle"),
            ":Megaladon",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Megaladon",
              ":summary",
              "70 ft shark.  Highly developed killing machine kills with no remorse, no pity, no feeling of satisfaction.  Their only apparent emotion is [[Bloodlust]].",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                "Natural Weaponry",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Natural Weaponry",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Jaws of Death",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Jaws of Death"),
                    "Swallow Whole",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Swallow Whole")
                  )
                )
              )
            ),
            ":Plesiosaur",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Plesiosaur")
          )
        ),
        "Prehistoric Mammals",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Prehistoric Mammals",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Megatherium",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Megatherium", ":summary", "Elephant-sized ground sloth"),
            ":Sabrelion",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sabrelion"),
            "Sabretooth Tiger",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sabretooth Tiger"),
            "Woolly Mammoth",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Woolly Mammoth")
          )
        ),
        "Primitive Man",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Primitive Man",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Hunter/Gatherer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hunter/Gatherer")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_prehistory_overview
   * @return {chapter}
   */
  static t_chapter_prehistory_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_prehistory_overview = {
    vx_type: nx_tactics_books_prehistory.t_chapter_prehistory_overview
  }

  // (func chapter_prehistory_overview)
  static f_chapter_prehistory_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Prehistory Overview",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Why Tactics: Prehistory?",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Why Tactics: Prehistory?")
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
    vx_type: nx_tactics_books_prehistory.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Prehistory",
      ":chaptermap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_chaptermap},
        "Prehistory Overview",
        nx_tactics_books_prehistory.f_chapter_prehistory_overview(),
        "Prehistoric Creatures",
        nx_tactics_books_prehistory.f_chapter_prehistoric_creatures()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_prehistoric_creatures": nx_tactics_books_prehistory.e_chapter_prehistoric_creatures,
      "chapter_prehistory_overview": nx_tactics_books_prehistory.e_chapter_prehistory_overview,
      "tacticsbook": nx_tactics_books_prehistory.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_prehistoric_creatures": nx_tactics_books_prehistory.t_chapter_prehistoric_creatures,
      "chapter_prehistory_overview": nx_tactics_books_prehistory.t_chapter_prehistory_overview,
      "tacticsbook": nx_tactics_books_prehistory.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/prehistory",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_prehistoric_creatures)
    nx_tactics_books_prehistory.t_chapter_prehistoric_creatures['vx_value'] = {
      name          : "chapter_prehistoric_creatures",
      pkgname       : "nx/tactics/books/prehistory",
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
      fn            : nx_tactics_books_prehistory.f_chapter_prehistoric_creatures
    }

    // (func chapter_prehistory_overview)
    nx_tactics_books_prehistory.t_chapter_prehistory_overview['vx_value'] = {
      name          : "chapter_prehistory_overview",
      pkgname       : "nx/tactics/books/prehistory",
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
      fn            : nx_tactics_books_prehistory.f_chapter_prehistory_overview
    }

    // (func tacticsbook)
    nx_tactics_books_prehistory.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/prehistory",
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
      fn            : nx_tactics_books_prehistory.f_tacticsbook
    }

  }
}
