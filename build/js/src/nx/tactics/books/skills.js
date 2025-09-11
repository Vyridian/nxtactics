'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_skills {

  /**
   * @function chapter_skill_types
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_skill_types = {
    vx_type: vx_core.t_type
  }
  static e_chapter_skill_types = {
    vx_type: nx_tactics_books_skills.t_chapter_skill_types
  }

  // (func chapter_skill_types)
  static f_chapter_skill_types(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Skill Types",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Physical Skills",
          ":skillmap",
          nx_tactics_base.f_skillmap_from_tactics_keys(tactics, "Animals", "Assassination", "Athletics", "Hunting", "Rage", "Survival", "Tradeskill")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Transportation Skills",
          ":skillmap",
          nx_tactics_base.f_skillmap_from_tactics_keys(tactics, "Driving", "Piloting", "Riding", "Seamanship")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Academic Skills",
          ":skillmap",
          nx_tactics_base.f_skillmap_from_tactics_keys(tactics, "Computers", "Electronics", "Intellect", "Investigation", "Knowledge", "Mechanics", "Medicine", "Science:Life", "Science:Physical")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Social Skills",
          ":skillmap",
          nx_tactics_base.f_skillmap_from_tactics_keys(tactics, "Art", "Business", "Communication", "Crime", "Deception", "Espionage", "Influence", "Intimidation", "Law", "Leadership", "Performance", "Persuasion", "Religion", "Science:Social", "Stealth")
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
    vx_type: nx_tactics_books_skills.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Skills",
      ":image",
      "Skill.jpg",
      ":chaptermap",
      nx_tactics_base.f_chaptermap_from_chapterlist(
        nx_tactics_books_skills.f_chapter_skill_types(tactics)
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_skill_types": nx_tactics_books_skills.e_chapter_skill_types,
      "tacticsbook": nx_tactics_books_skills.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_skill_types": nx_tactics_books_skills.t_chapter_skill_types,
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_skills.f_chapter_skill_types
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_skills.f_tacticsbook
    }

  }
}
