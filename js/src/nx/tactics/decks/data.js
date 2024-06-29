'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_books_advanced_rules from "../../../nx/tactics/books/advanced_rules.js"
import nx_tactics_books_age_of_sail from "../../../nx/tactics/books/age_of_sail.js"
import nx_tactics_books_age_of_steam from "../../../nx/tactics/books/age_of_steam.js"
import nx_tactics_books_bestiary from "../../../nx/tactics/books/bestiary.js"
import nx_tactics_books_characters from "../../../nx/tactics/books/characters.js"
import nx_tactics_books_combat from "../../../nx/tactics/books/combat.js"
import nx_tactics_books_core_rules from "../../../nx/tactics/books/core_rules.js"
import nx_tactics_books_fantasy from "../../../nx/tactics/books/fantasy.js"
import nx_tactics_books_gear from "../../../nx/tactics/books/gear.js"
import nx_tactics_books_giant_monsters from "../../../nx/tactics/books/giant_monsters.js"
import nx_tactics_books_high_technology from "../../../nx/tactics/books/high_technology.js"
import nx_tactics_books_horror from "../../../nx/tactics/books/horror.js"
import nx_tactics_books_land_sea_and_air from "../../../nx/tactics/books/land_sea_and_air.js"
import nx_tactics_books_magic from "../../../nx/tactics/books/magic.js"
import nx_tactics_books_medieval from "../../../nx/tactics/books/medieval.js"
import nx_tactics_books_modern from "../../../nx/tactics/books/modern.js"
import nx_tactics_books_modern_fantasy from "../../../nx/tactics/books/modern_fantasy.js"
import nx_tactics_books_powers from "../../../nx/tactics/books/powers.js"
import nx_tactics_books_prehistory from "../../../nx/tactics/books/prehistory.js"
import nx_tactics_books_pulp_fiction from "../../../nx/tactics/books/pulp_fiction.js"
import nx_tactics_books_science_fiction from "../../../nx/tactics/books/science_fiction.js"
import nx_tactics_books_skills from "../../../nx/tactics/books/skills.js"
import nx_tactics_books_space_and_time from "../../../nx/tactics/books/space_and_time.js"
import nx_tactics_books_superheroes from "../../../nx/tactics/books/superheroes.js"
import nx_tactics_books_world_wars from "../../../nx/tactics/books/world_wars.js"


export default class nx_tactics_decks_data {

  /**
   * Constant: tactics-all
   * All tactics cards
   * {tactics}
   */
  static c_tactics_all = {vx_type: nx_tactics_base.t_tactics, vx_constdef: {pkgname: 'nx/tactics/decks/data', name: 'tactics-all'}}

  /**
   * @function booklist_all
   * All books
   * @return {booklist}
   */
  static t_booklist_all = {
    vx_type: vx_core.t_type
  }
  static e_booklist_all = {
    vx_type: nx_tactics_decks_data.t_booklist_all
  }

  // (func booklist-all)
  static f_booklist_all() {
    let output = nx_tactics_base.e_booklist
    output = vx_core.f_new(
      nx_tactics_base.t_booklist,
      nx_tactics_books_core_rules.f_tacticsbook(),
      nx_tactics_books_combat.f_tacticsbook(),
      nx_tactics_books_skills.f_tacticsbook(),
      nx_tactics_books_magic.f_tacticsbook(),
      nx_tactics_books_powers.f_tacticsbook(),
      nx_tactics_books_gear.f_tacticsbook(),
      nx_tactics_books_advanced_rules.f_tacticsbook(),
      nx_tactics_books_characters.f_tacticsbook(),
      nx_tactics_books_bestiary.f_tacticsbook(),
      nx_tactics_books_land_sea_and_air.f_tacticsbook(),
      nx_tactics_books_fantasy.f_tacticsbook(),
      nx_tactics_books_giant_monsters.f_tacticsbook(),
      nx_tactics_books_prehistory.f_tacticsbook(),
      nx_tactics_books_medieval.f_tacticsbook(),
      nx_tactics_books_age_of_sail.f_tacticsbook(),
      nx_tactics_books_age_of_steam.f_tacticsbook(),
      nx_tactics_books_pulp_fiction.f_tacticsbook(),
      nx_tactics_books_world_wars.f_tacticsbook(),
      nx_tactics_books_horror.f_tacticsbook(),
      nx_tactics_books_modern.f_tacticsbook(),
      nx_tactics_books_modern_fantasy.f_tacticsbook(),
      nx_tactics_books_superheroes.f_tacticsbook(),
      nx_tactics_books_high_technology.f_tacticsbook(),
      nx_tactics_books_science_fiction.f_tacticsbook(),
      nx_tactics_books_space_and_time.f_tacticsbook()
    )
    return output
  }

  /**
   * @function tactics_ability
   * Returns an ability from tactics-all
   * @param  {string} name
   * @return {ability}
   */
  static t_tactics_ability = {
    vx_type: vx_core.t_type
  }
  static e_tactics_ability = {
    vx_type: nx_tactics_decks_data.t_tactics_ability
  }

  // (func tactics-ability)
  static f_tactics_ability(name) {
    let output = nx_tactics_base.e_ability
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_ability, "map-1": nx_tactics_base.t_abilitymap},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const abilitymap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":abilitymap"
        )
        return vx_core.f_any_from_map({"any-1": nx_tactics_base.t_ability, "map-1": nx_tactics_base.t_abilitymap}, abilitymap, name)
      })
    )
    return output
  }

  /**
   * @function tactics_item
   * Returns an item from tactics-all
   * @param  {string} name
   * @return {item}
   */
  static t_tactics_item = {
    vx_type: vx_core.t_type
  }
  static e_tactics_item = {
    vx_type: nx_tactics_decks_data.t_tactics_item
  }

  // (func tactics-item)
  static f_tactics_item(name) {
    let output = nx_tactics_base.e_item
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_item, "map-1": nx_tactics_base.t_itemmap},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const itemmap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_itemmap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":itemmap"
        )
        return vx_core.f_any_from_map({"any-1": nx_tactics_base.t_item, "map-1": nx_tactics_base.t_itemmap}, itemmap, name)
      })
    )
    return output
  }

  /**
   * @function tactics_power
   * Returns a power from tactics-all
   * @param  {string} name
   * @return {power}
   */
  static t_tactics_power = {
    vx_type: vx_core.t_type
  }
  static e_tactics_power = {
    vx_type: nx_tactics_decks_data.t_tactics_power
  }

  // (func tactics-power)
  static f_tactics_power(name) {
    let output = nx_tactics_base.e_power
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_power, "map-1": nx_tactics_base.t_powermap},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const powermap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_powermap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":powermap"
        )
        return vx_core.f_any_from_map({"any-1": nx_tactics_base.t_power, "map-1": nx_tactics_base.t_powermap}, powermap, name)
      })
    )
    return output
  }

  /**
   * @function tactics_skill
   * Returns a skill from tactics-all
   * @param  {string} name
   * @return {skill}
   */
  static t_tactics_skill = {
    vx_type: vx_core.t_type
  }
  static e_tactics_skill = {
    vx_type: nx_tactics_decks_data.t_tactics_skill
  }

  // (func tactics-skill)
  static f_tactics_skill(name) {
    let output = nx_tactics_base.e_skill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_skill, "map-1": nx_tactics_base.t_skillmap},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const skillmap = vx_core.f_any_from_struct(
          {"any-1": nx_tactics_base.t_skillmap, "struct-2": nx_tactics_base.t_tactics},
          nx_tactics_decks_data.c_tactics_all,
          ":skillmap"
        )
        return vx_core.f_any_from_map({"any-1": nx_tactics_base.t_skill, "map-1": nx_tactics_base.t_skillmap}, skillmap, name)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "tactics-all": nx_tactics_decks_data.c_tactics_all
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "booklist-all": nx_tactics_decks_data.e_booklist_all,
      "tactics-ability": nx_tactics_decks_data.e_tactics_ability,
      "tactics-item": nx_tactics_decks_data.e_tactics_item,
      "tactics-power": nx_tactics_decks_data.e_tactics_power,
      "tactics-skill": nx_tactics_decks_data.e_tactics_skill
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "booklist-all": nx_tactics_decks_data.t_booklist_all,
      "tactics-ability": nx_tactics_decks_data.t_tactics_ability,
      "tactics-item": nx_tactics_decks_data.t_tactics_item,
      "tactics-power": nx_tactics_decks_data.t_tactics_power,
      "tactics-skill": nx_tactics_decks_data.t_tactics_skill
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/data",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func booklist-all)
    nx_tactics_decks_data.t_booklist_all['vx_value'] = {
      name          : "booklist-all",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_booklist_all
    }

    // (func tactics-ability)
    nx_tactics_decks_data.t_tactics_ability['vx_value'] = {
      name          : "tactics-ability",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_tactics_ability
    }

    // (func tactics-item)
    nx_tactics_decks_data.t_tactics_item['vx_value'] = {
      name          : "tactics-item",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_tactics_item
    }

    // (func tactics-power)
    nx_tactics_decks_data.t_tactics_power['vx_value'] = {
      name          : "tactics-power",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_tactics_power
    }

    // (func tactics-skill)
    nx_tactics_decks_data.t_tactics_skill['vx_value'] = {
      name          : "tactics-skill",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_tactics_skill
    }

    // (const tactics-all)
    Object.assign(nx_tactics_decks_data.c_tactics_all, vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const booklist = nx_tactics_decks_data.f_booklist_all()
        return nx_tactics_base.f_tactics_from_booklist(booklist)
      })
    ))

  }
}
