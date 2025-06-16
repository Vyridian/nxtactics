'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_library {

  /**
   * Constant: bleeding
   * {cardback}
   */
  static c_bleeding = {vx_type: nx_tactics_base.t_cardback, vx_constdef: {pkgname: 'nx/tactics/decks/library', name: 'bleeding', type: nx_tactics_base.t_cardback}}

  /**
   * Constant: bloodloss
   * {card}
   */
  static c_bloodloss = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/decks/library', name: 'bloodloss', type: nx_tactics_base.t_card}}

  /**
   * Constant: poisoned
   * {card}
   */
  static c_poisoned = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/decks/library', name: 'poisoned', type: nx_tactics_base.t_card}}

  /**
   * @function deck_library
   * Library Deck
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_library = {
    vx_type: vx_core.t_type
  }
  static e_deck_library = {
    vx_type: nx_tactics_decks_library.t_deck_library
  }

  // (func deck-library)
  static f_deck_library(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Library Deck",
      ":image",
      "images/deck-library.svg",
      ":layout",
      nx_tactics_base.c_cardlayout_imageonly,
      ":cardmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_cardmap},
        nx_tactics_base.f_cardlist_copy_from_tactics_rulekey_count_isnum(
          tactics,
          "Skill Point",
          5,
          true
        ),
        nx_tactics_base.f_cardlist_copy_from_tactics_rulekey_count_isnum(
          tactics,
          "Ability Point",
          5,
          true
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          nx_tactics_decks_library.c_bleeding,
          10,
          true
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          nx_tactics_decks_library.c_bloodloss,
          10,
          true
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          nx_tactics_decks_library.c_poisoned,
          10,
          true
        )
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "bleeding": nx_tactics_decks_library.c_bleeding,
      "bloodloss": nx_tactics_decks_library.c_bloodloss,
      "poisoned": nx_tactics_decks_library.c_poisoned
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-library": nx_tactics_decks_library.e_deck_library
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-library": nx_tactics_decks_library.t_deck_library
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/library",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-library)
    nx_tactics_decks_library.t_deck_library['vx_value'] = {
      name          : "deck-library",
      pkgname       : "nx/tactics/decks/library",
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
      fn            : nx_tactics_decks_library.f_deck_library
    }

    // (const bleeding)
    Object.assign(nx_tactics_decks_library.c_bleeding, vx_core.f_new({"any-1": nx_tactics_base.t_cardback}, ":id", "bleeding", ":name", "Bleeding", ":image", "images/card-bleeding.svg", ":summary", "* Turn End: [Fatigue]:1 for each [Bleeding]. IF [Body]:0 THEN [Blood Loss]:1 instead."))

    // (const bloodloss)
    Object.assign(nx_tactics_decks_library.c_bloodloss, vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "bloodloss", ":name", "Blood Loss", ":image", "images/card-bloodloss.svg", ":summary", "* Day End: Discard one [Blood Loss]"))

    // (const poisoned)
    Object.assign(nx_tactics_decks_library.c_poisoned, vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "poisoned", ":name", "Poisoned", ":image", "images/card-poisoned.svg"))

  }
}
