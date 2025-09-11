'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_condition {

  /**
   * @function deck_condition
   * Condition Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_condition = {
    vx_type: vx_core.t_type
  }
  static e_deck_condition = {
    vx_type: nx_tactics_decks_condition.t_deck_condition
  }

  // (func deck-condition)
  static f_deck_condition(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const rulelist = nx_tactics_base.f_rulelist_from_tactics_keys(tactics, "Ability Point", "Bleeding", "Blind", "Blood Loss", "Bound", "Broken", "Burning", "Character Point", "Choking", "Constriction", "Damaged", "Deaf", "Diseased", "Diving", "Dying", "Electrified", "Elevation", "Exposure", "Freezing", "Held", "Hunger", "Immobilized", "Impaired", "Isolation", "Paralyzed", "Petrified", "Poisoned", "Skill Point", "Stasis", "Thirst", "Transformed")
        const cardmap = nx_tactics_base.f_cardmap_from_cardlist(
          vx_core.f_list_from_list({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_rule, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_rulelist}, rulelist)
        )
        return vx_core.f_new(
          {"any-1": nx_tactics_base.t_deck},
          ":name",
          "Condition",
          ":image",
          "images/rule-condition.svg",
          ":layout",
          nx_tactics_base.c_cardlayout_imageonly,
          ":cardmap",
          cardmap
        )
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-condition": nx_tactics_decks_condition.e_deck_condition
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-condition": nx_tactics_decks_condition.t_deck_condition
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/condition",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-condition)
    nx_tactics_decks_condition.t_deck_condition['vx_value'] = {
      name          : "deck-condition",
      pkgname       : "nx/tactics/decks/condition",
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
      fn            : nx_tactics_decks_condition.f_deck_condition
    }

  }
}
