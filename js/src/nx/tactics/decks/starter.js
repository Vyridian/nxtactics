'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_starter {

  /**
   * @function deck_starter
   * @return {deck}
   */
  static t_deck_starter = {
    vx_type: vx_core.t_type
  }
  static e_deck_starter = {
    vx_type: nx_tactics_decks_starter.t_deck_starter
  }

  // (func deck-starter)
  static f_deck_starter() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Starter"
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-starter": nx_tactics_decks_starter.e_deck_starter
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-starter": nx_tactics_decks_starter.t_deck_starter
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/starter",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-starter)
    nx_tactics_decks_starter.t_deck_starter['vx_value'] = {
      name          : "deck-starter",
      pkgname       : "nx/tactics/decks/starter",
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
      fn            : nx_tactics_decks_starter.f_deck_starter
    }

  }
}
