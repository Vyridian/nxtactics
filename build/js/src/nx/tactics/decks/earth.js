'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_earth {

  /**
   * @function deck_earth
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_earth = {
    vx_type: vx_core.t_type
  }
  static e_deck_earth = {
    vx_type: nx_tactics_decks_earth.t_deck_earth
  }

  // (func deck-earth)
  static f_deck_earth(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Earth Map",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        nx_tactics_base.f_cardlist_images_from_tactics_places(tactics, "Earth:Map", "Earth:Africa", "Earth:America-N", "Earth:America-S", "Earth:Antarctica", "Earth:Arctic", "Earth:Asia", "Earth:Atlantic-N", "Earth:Atlantic-S", "Earth:Europe", "Earth:Indian Ocean", "Earth:Oceania", "Earth:Pacific-N", "Earth:Pacific-S")
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-earth": nx_tactics_decks_earth.e_deck_earth
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-earth": nx_tactics_decks_earth.t_deck_earth
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/earth",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-earth)
    nx_tactics_decks_earth.t_deck_earth['vx_value'] = {
      name          : "deck-earth",
      pkgname       : "nx/tactics/decks/earth",
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
      fn            : nx_tactics_decks_earth.f_deck_earth
    }

  }
}
