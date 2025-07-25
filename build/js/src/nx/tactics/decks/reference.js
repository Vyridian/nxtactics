'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_reference {

  /**
   * @function deck_reference
   * Reference Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_reference = {
    vx_type: vx_core.t_type
  }
  static e_deck_reference = {
    vx_type: nx_tactics_decks_reference.t_deck_reference
  }

  // (func deck-reference)
  static f_deck_reference(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Reference",
      ":image",
      "images/rule-reference.svg",
      ":layout",
      nx_tactics_base.c_cardlayout_imageonly,
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_list_from_list(
          {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_rule, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_rulelist},
          nx_tactics_base.f_rulelist_from_tactics_keys(tactics, "Body", "Mind", "Will", "Speed", "Advantage", "Disadvantage", "Flanking", "Surrounded", "Surprise", "Elevation", "Unskilled", "Area Effect", "Weather", "Weather: Clouds", "Weather: Humidity", "Weather: Temperature", "Weather: Wind", "Bleeding", "Blood Loss", "Diseased", "Poisoned", "Choking", "Hunger", "Thirst", "Exposure")
        )
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-reference": nx_tactics_decks_reference.e_deck_reference
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-reference": nx_tactics_decks_reference.t_deck_reference
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/reference",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-reference)
    nx_tactics_decks_reference.t_deck_reference['vx_value'] = {
      name          : "deck-reference",
      pkgname       : "nx/tactics/decks/reference",
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
      fn            : nx_tactics_decks_reference.f_deck_reference
    }

  }
}
