'strict mode'

import vx_core from "../../../vx/core.js"
import vx_collection from "../../../vx/collection.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_decks_ability from "../../../nx/tactics/decks/ability.js"
import nx_tactics_decks_item from "../../../nx/tactics/decks/item.js"
import nx_tactics_decks_place from "../../../nx/tactics/decks/place.js"
import nx_tactics_decks_scenario from "../../../nx/tactics/decks/scenario.js"
import nx_tactics_decks_skill from "../../../nx/tactics/decks/skill.js"
import nx_tactics_decks_unit from "../../../nx/tactics/decks/unit.js"
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
  static c_tactics_all = {vx_type: nx_tactics_base.t_tactics, vx_constdef: {pkgname: 'nx/tactics/decks/data', name: 'tactics-all', type: nx_tactics_base.t_tactics}}

  /**
   * @function ability_from_name
   * Returns an ability from tactics-all
   * @param  {string} name
   * @return {ability}
   */
  static t_ability_from_name = {
    vx_type: vx_core.t_type
  }
  static e_ability_from_name = {
    vx_type: nx_tactics_decks_data.t_ability_from_name
  }

  // (func ability<-name)
  static f_ability_from_name(name) {
    let output = nx_tactics_base.e_ability
    output = nx_tactics_decks_data.f_ability_from_name_tactics(
      name,
      nx_tactics_decks_data.c_tactics_all
    )
    return output
  }

  /**
   * @function ability_from_name_tactics
   * Returns an ability from tactics
   * @param  {string} name
   * @param  {tactics} tactics
   * @return {ability}
   */
  static t_ability_from_name_tactics = {
    vx_type: vx_core.t_type
  }
  static e_ability_from_name_tactics = {
    vx_type: nx_tactics_decks_data.t_ability_from_name_tactics
  }

  // (func ability<-name-tactics)
  static f_ability_from_name_tactics(name, tactics) {
    let output = nx_tactics_base.e_ability
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_ability},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":abilitymap")
        const ability = vx_core.f_any_from_map({"any-1": nx_tactics_base.t_ability, "map-1": nx_tactics_base.t_abilitymap}, abilitymap, name)
        return vx_core.f_log_error({"any-1": nx_tactics_base.t_ability}, ability)
      })
    )
    return output
  }

  /**
   * @function booklist_all_from_tactics
   * All books
   * @param  {tactics} tactics
   * @return {booklist}
   */
  static t_booklist_all_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_booklist_all_from_tactics = {
    vx_type: nx_tactics_decks_data.t_booklist_all_from_tactics
  }

  // (func booklist-all<-tactics)
  static f_booklist_all_from_tactics(tactics) {
    let output = nx_tactics_base.e_booklist
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_booklist},
      nx_tactics_books_core_rules.f_tacticsbook(tactics),
      nx_tactics_books_combat.f_tacticsbook(tactics),
      nx_tactics_books_skills.f_tacticsbook(tactics),
      nx_tactics_books_magic.f_tacticsbook(tactics),
      nx_tactics_books_powers.f_tacticsbook(tactics),
      nx_tactics_books_gear.f_tacticsbook(tactics),
      nx_tactics_books_advanced_rules.f_tacticsbook(tactics),
      nx_tactics_books_characters.f_tacticsbook(tactics),
      nx_tactics_books_bestiary.f_tacticsbook(tactics),
      nx_tactics_books_land_sea_and_air.f_tacticsbook(tactics),
      nx_tactics_books_fantasy.f_tacticsbook(tactics),
      nx_tactics_books_giant_monsters.f_tacticsbook(tactics),
      nx_tactics_books_prehistory.f_tacticsbook(tactics),
      nx_tactics_books_medieval.f_tacticsbook(tactics),
      nx_tactics_books_age_of_sail.f_tacticsbook(tactics),
      nx_tactics_books_age_of_steam.f_tacticsbook(tactics),
      nx_tactics_books_pulp_fiction.f_tacticsbook(tactics),
      nx_tactics_books_world_wars.f_tacticsbook(tactics),
      nx_tactics_books_horror.f_tacticsbook(tactics),
      nx_tactics_books_modern.f_tacticsbook(tactics),
      nx_tactics_books_modern_fantasy.f_tacticsbook(tactics),
      nx_tactics_books_superheroes.f_tacticsbook(tactics),
      nx_tactics_books_high_technology.f_tacticsbook(tactics),
      nx_tactics_books_science_fiction.f_tacticsbook(tactics),
      nx_tactics_books_space_and_time.f_tacticsbook(tactics)
    )
    return output
  }

  /**
   * @function tactics_booklist_from_tactics
   * Returns a tactics from a tactics and booklist
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_booklist_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_booklist_from_tactics = {
    vx_type: nx_tactics_decks_data.t_tactics_booklist_from_tactics
  }

  // (func tactics-booklist<-tactics)
  static f_tactics_booklist_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const booklist = nx_tactics_decks_data.f_booklist_all_from_tactics(tactics)
        return nx_tactics_base.f_tactics_from_tactics_booklist(tactics, booklist)
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
   * @function tactics_main
   * Returns a fully loaded tactics
   * @return {tactics}
   */
  static t_tactics_main = {
    vx_type: vx_core.t_type
  }
  static e_tactics_main = {
    vx_type: nx_tactics_decks_data.t_tactics_main
  }

  // (func tactics-main)
  static f_tactics_main() {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const tacticsbasic = vx_core.f_empty(
          nx_tactics_base.t_tactics
        )
        const tacticsabilities = nx_tactics_decks_ability.f_tactics_abilitymap_from_tactics(tacticsbasic)
        const tacticsskills = nx_tactics_decks_skill.f_tactics_skillmap_from_tactics(tacticsabilities)
        const tacticsunits = nx_tactics_decks_unit.f_tactics_unitmap_from_tactics(tacticsskills)
        const tacticsplaces = nx_tactics_decks_place.f_tactics_placemap_from_tactics(tacticsunits)
        const tacticsscenarios = nx_tactics_decks_scenario.f_tactics_scenariomap_from_tactics(tacticsplaces)
        const tacticsall = nx_tactics_decks_data.f_tactics_booklist_from_tactics(tacticsscenarios)
        return tacticsall
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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

  /**
   * @function unit_from_name_tactics
   * Returns a unit from tactics
   * @param  {string} name
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_from_name_tactics = {
    vx_type: vx_core.t_type
  }
  static e_unit_from_name_tactics = {
    vx_type: nx_tactics_decks_data.t_unit_from_name_tactics
  }

  // (func unit<-name-tactics)
  static f_unit_from_name_tactics(name, tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unit},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const unitmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitmap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":unitmap")
        const unit = vx_core.f_any_from_map({"any-1": nx_tactics_base.t_unit, "map-1": nx_tactics_base.t_unitmap}, unitmap, name)
        return vx_core.f_log_error({"any-1": nx_tactics_base.t_unit}, unit)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "tactics-all": nx_tactics_decks_data.c_tactics_all
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "ability<-name": nx_tactics_decks_data.e_ability_from_name,
      "ability<-name-tactics": nx_tactics_decks_data.e_ability_from_name_tactics,
      "booklist-all<-tactics": nx_tactics_decks_data.e_booklist_all_from_tactics,
      "tactics-booklist<-tactics": nx_tactics_decks_data.e_tactics_booklist_from_tactics,
      "tactics-item": nx_tactics_decks_data.e_tactics_item,
      "tactics-main": nx_tactics_decks_data.e_tactics_main,
      "tactics-power": nx_tactics_decks_data.e_tactics_power,
      "tactics-skill": nx_tactics_decks_data.e_tactics_skill,
      "unit<-name-tactics": nx_tactics_decks_data.e_unit_from_name_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "ability<-name": nx_tactics_decks_data.t_ability_from_name,
      "ability<-name-tactics": nx_tactics_decks_data.t_ability_from_name_tactics,
      "booklist-all<-tactics": nx_tactics_decks_data.t_booklist_all_from_tactics,
      "tactics-booklist<-tactics": nx_tactics_decks_data.t_tactics_booklist_from_tactics,
      "tactics-item": nx_tactics_decks_data.t_tactics_item,
      "tactics-main": nx_tactics_decks_data.t_tactics_main,
      "tactics-power": nx_tactics_decks_data.t_tactics_power,
      "tactics-skill": nx_tactics_decks_data.t_tactics_skill,
      "unit<-name-tactics": nx_tactics_decks_data.t_unit_from_name_tactics
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

    // (func ability<-name)
    nx_tactics_decks_data.t_ability_from_name['vx_value'] = {
      name          : "ability<-name",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_ability_from_name
    }

    // (func ability<-name-tactics)
    nx_tactics_decks_data.t_ability_from_name_tactics['vx_value'] = {
      name          : "ability<-name-tactics",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_ability_from_name_tactics
    }

    // (func booklist-all<-tactics)
    nx_tactics_decks_data.t_booklist_all_from_tactics['vx_value'] = {
      name          : "booklist-all<-tactics",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_booklist_all_from_tactics
    }

    // (func tactics-booklist<-tactics)
    nx_tactics_decks_data.t_tactics_booklist_from_tactics['vx_value'] = {
      name          : "tactics-booklist<-tactics",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_tactics_booklist_from_tactics
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_data.f_tactics_item
    }

    // (func tactics-main)
    nx_tactics_decks_data.t_tactics_main['vx_value'] = {
      name          : "tactics-main",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_tactics_main
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_data.f_tactics_skill
    }

    // (func unit<-name-tactics)
    nx_tactics_decks_data.t_unit_from_name_tactics['vx_value'] = {
      name          : "unit<-name-tactics",
      pkgname       : "nx/tactics/decks/data",
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
      fn            : nx_tactics_decks_data.f_unit_from_name_tactics
    }

    // (const tactics-all)
    Object.assign(nx_tactics_decks_data.c_tactics_all, nx_tactics_decks_data.f_tactics_main())

  }
}
