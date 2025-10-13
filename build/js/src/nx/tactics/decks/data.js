'strict mode'

import vx_core from "../../../vx/core.js"
import vx_collection from "../../../vx/collection.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_decks_ability from "../../../nx/tactics/decks/ability.js"
import nx_tactics_decks_item from "../../../nx/tactics/decks/item.js"
import nx_tactics_decks_place from "../../../nx/tactics/decks/place.js"
import nx_tactics_decks_power from "../../../nx/tactics/decks/power.js"
import nx_tactics_decks_rule from "../../../nx/tactics/decks/rule.js"
import nx_tactics_decks_scene from "../../../nx/tactics/decks/scene.js"
import nx_tactics_decks_specialty from "../../../nx/tactics/decks/specialty.js"
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
      nx_tactics_books_advanced_rules.f_tacticsbook(tactics),
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
        const tacticsrules = nx_tactics_decks_rule.f_tactics_rulemap_from_tactics(tacticsbasic)
        const tacticsabilities = nx_tactics_decks_ability.f_tactics_abilitymap_from_tactics(tacticsrules)
        const tacticsspecialties = nx_tactics_decks_specialty.f_tactics_specialtymap_from_tactics(tacticsabilities)
        const tacticsskills = nx_tactics_decks_skill.f_tactics_skillmap_from_tactics(tacticsspecialties)
        const tacticspowers = nx_tactics_decks_power.f_tactics_powermap_from_tactics(tacticsskills)
        const tacticsitems = nx_tactics_decks_item.f_tactics_itemmap_from_tactics(tacticspowers)
        const tacticsunits = nx_tactics_decks_unit.f_tactics_unitmap_from_tactics(tacticsitems)
        const tacticsplaces = nx_tactics_decks_place.f_tactics_placemap_from_tactics(tacticsunits)
        const tacticsscenes = nx_tactics_decks_scene.f_tactics_scenemap_from_tactics(tacticsplaces)
        const tacticsall = nx_tactics_decks_data.f_tactics_booklist_from_tactics(tacticsscenes)
        return tacticsall
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "tactics-all": nx_tactics_decks_data.c_tactics_all
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "booklist-all<-tactics": nx_tactics_decks_data.e_booklist_all_from_tactics,
      "tactics-booklist<-tactics": nx_tactics_decks_data.e_tactics_booklist_from_tactics,
      "tactics-main": nx_tactics_decks_data.e_tactics_main
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "booklist-all<-tactics": nx_tactics_decks_data.t_booklist_all_from_tactics,
      "tactics-booklist<-tactics": nx_tactics_decks_data.t_tactics_booklist_from_tactics,
      "tactics-main": nx_tactics_decks_data.t_tactics_main
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

    // (const tactics-all)
    Object.assign(nx_tactics_decks_data.c_tactics_all, nx_tactics_decks_data.f_tactics_main())

  }
}
