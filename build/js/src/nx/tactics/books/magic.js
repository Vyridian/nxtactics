'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_magic {

  /**
   * @function chapter_magic_items
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_magic_items = {
    vx_type: vx_core.t_type
  }
  static e_chapter_magic_items = {
    vx_type: nx_tactics_books_magic.t_chapter_magic_items
  }

  // (func chapter_magic_items)
  static f_chapter_magic_items(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Magic Items",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Magic Items",
          ":summary",
          "* Magic Weapons ignore armor equal to their + value.\n* Magic Armor ignores damage equal to their + value.",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Ascalan Lance",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Ascalan Lance", ":reference", "* The lance (or in some versions of the story, sword) that Saint George used to slay the dragon, named after the city Ashkelon.", ":titles", "Dragon Slayer Lance"),
            "Fan of the Winds",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Fan of the Winds"),
            "Firebrand",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Firebrand", ":titles", "Flame Tongue"),
            "Fox Mask",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Fox Mask"),
            "Frostbrand",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Frostbrand"),
            "Moonblade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Moonblade", ":titles", "A silver sword that is as hard as steel"),
            "Oni Mask",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Oni Mask"),
            "Poseidon's Net",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Poseidon's Net"),
            "Poseidon's Trident",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Poseidon's Trident"),
            "Runestaff",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Runestaff", ":summary", "* A staff with one or more Runes incribed upon it."),
            "Runesword",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Runesword", ":summary", "* A sword with one or more Runes incribed upon it.")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_magic_overview
   * @return {chapter}
   */
  static t_chapter_magic_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_magic_overview = {
    vx_type: nx_tactics_books_magic.t_chapter_magic_overview
  }

  // (func chapter_magic_overview)
  static f_chapter_magic_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new({"any-1": nx_tactics_base.t_chapter}, ":name", "Magic Overview", ":summary", "* The Art")
    return output
  }

  /**
   * @function chapter_magic_skills
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_magic_skills = {
    vx_type: vx_core.t_type
  }
  static e_chapter_magic_skills = {
    vx_type: nx_tactics_books_magic.t_chapter_magic_skills
  }

  // (func chapter_magic_skills)
  static f_chapter_magic_skills(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Magical Skills",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Arcane Magic",
          ":reference",
          "* Magic/Magick is not capable of producing 'miracles' or violating the physical laws of the universe (e.g., it cannot cause a solar eclipse), although it is theoretically possible to cause in any object any change of which that object is capable by nature - Aleister Crowley\n* Every intentional (Willed) act is a Magical act. - Aleister Crowley\n* Magick is the Science of understanding oneself and one's conditions. It is the Art of applying that 	understanding in action. - Aleister Crowley",
          ":summary",
          "* Those who pursue the arcane arts believe that by aligning their own minds to the patterns of reality, they may turn those patterns to their own ends.\n* Many believe that one must Awaken before being able to wield Magic.\n* Arcanists focus on the will of the individual to bend the world to their desires. This individual supremicist viewpoint is typically reflected in their egos as well.",
          ":titles",
          "Arcanist",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Alchemy", "Artifice", "Astrology", "Chronomancy", "Conjuration", "Papercraft", "Protection", "Sorcery", "Thaumaturgy", "Wizardry")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Black Magic",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Bloodcraft", "Chaos", "Corruption", "Darkness", "Demonic", "Fleshcraft", "Necromancy")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Thergy",
          ":reference",
          "* Pray, not for the gods, or the betterment of others, but for yourself - Rosaria, Genshin Impact",
          ":titles",
          "Channelling, Miracle Working, White Magic",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Conviction", "Blessing", "Invocation", "Life", "Primus", "Purity", "Radiant")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Nature Magic",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Animalism", "Herbalism", "Naturalism", "Wild")
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Spiritual",
          ":titles",
          "Spiritualism",
          ":powermap",
          nx_tactics_base.f_powermap_from_tactics_keys(tactics, "Cultivation", "Curses", "Divination", "Dreaming", "Enchantment", "Shamanism")
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
    vx_type: nx_tactics_books_magic.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Magic",
      ":image",
      "Magick.jpg",
      ":chaptermap",
      nx_tactics_base.f_chaptermap_from_chapterlist(
        nx_tactics_books_magic.f_chapter_magic_overview(),
        nx_tactics_books_magic.f_chapter_magic_skills(tactics),
        nx_tactics_books_magic.f_chapter_magic_items(tactics)
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_magic_items": nx_tactics_books_magic.e_chapter_magic_items,
      "chapter_magic_overview": nx_tactics_books_magic.e_chapter_magic_overview,
      "chapter_magic_skills": nx_tactics_books_magic.e_chapter_magic_skills,
      "tacticsbook": nx_tactics_books_magic.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_magic_items": nx_tactics_books_magic.t_chapter_magic_items,
      "chapter_magic_overview": nx_tactics_books_magic.t_chapter_magic_overview,
      "chapter_magic_skills": nx_tactics_books_magic.t_chapter_magic_skills,
      "tacticsbook": nx_tactics_books_magic.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/magic",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_magic_items)
    nx_tactics_books_magic.t_chapter_magic_items['vx_value'] = {
      name          : "chapter_magic_items",
      pkgname       : "nx/tactics/books/magic",
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
      fn            : nx_tactics_books_magic.f_chapter_magic_items
    }

    // (func chapter_magic_overview)
    nx_tactics_books_magic.t_chapter_magic_overview['vx_value'] = {
      name          : "chapter_magic_overview",
      pkgname       : "nx/tactics/books/magic",
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
      fn            : nx_tactics_books_magic.f_chapter_magic_overview
    }

    // (func chapter_magic_skills)
    nx_tactics_books_magic.t_chapter_magic_skills['vx_value'] = {
      name          : "chapter_magic_skills",
      pkgname       : "nx/tactics/books/magic",
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
      fn            : nx_tactics_books_magic.f_chapter_magic_skills
    }

    // (func tacticsbook)
    nx_tactics_books_magic.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/magic",
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
      fn            : nx_tactics_books_magic.f_tacticsbook
    }

  }
}
