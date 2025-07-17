'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_reference {

  /**
   * Constant: bleeding
   * {cardback}
   */
  static c_bleeding = {vx_type: nx_tactics_base.t_cardback, vx_constdef: {pkgname: 'nx/tactics/decks/reference', name: 'bleeding', type: nx_tactics_base.t_cardback}}

  /**
   * Constant: bloodloss
   * {card}
   */
  static c_bloodloss = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/decks/reference', name: 'bloodloss', type: nx_tactics_base.t_card}}

  /**
   * Constant: poisoned
   * {card}
   */
  static c_poisoned = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/decks/reference', name: 'poisoned', type: nx_tactics_base.t_card}}

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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_cardmap},
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlist},
          nx_tactics_base.f_rulelist_from_tactics_keys(tactics, "Roles", "Role: Attacker", "Role: Blaster", "Role: Defender", "Role: Disrupter", "Role: Skirmisher", "Role: Sniper", "Role: Supporter", "Role: Taunter", "Character", "Body", "Mind", "Will", "Speed", "Beast", "Shadow", "Conscience", "Leveling", "Skill", "Power", "Ability", "Specialty", "Place", "Scene", "Map: Exploration", "Map: Personal", "Map: Vehicle", "Scale", "Scaled", "Suit", "Advantage", "Disadvantage", "Blatant", "Subtle", "Area Effect", "Reach", "Flanking", "Surrounded", "Surprise", "Unskilled", "Unfamiliar Item", "Choking", "Hunger", "Thirst", "Exposure", "Weather: Clouds", "Weather: Humidity", "Weather: Temperature", "Weather: Wind", "Build: Unit", "Build: Character", "Build: Item", "Build: Vehicle")
        ),
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
          nx_tactics_decks_reference.c_bleeding,
          10,
          true
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          nx_tactics_decks_reference.c_bloodloss,
          10,
          true
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          nx_tactics_decks_reference.c_poisoned,
          10,
          true
        )
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "bleeding": nx_tactics_decks_reference.c_bleeding,
      "bloodloss": nx_tactics_decks_reference.c_bloodloss,
      "poisoned": nx_tactics_decks_reference.c_poisoned
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

    // (const bleeding)
    Object.assign(nx_tactics_decks_reference.c_bleeding, vx_core.f_new({"any-1": nx_tactics_base.t_cardback}, ":id", "bleeding", ":name", "Bleeding", ":image", "images/card-bleeding.svg", ":summary", "* Turn End: [Fatigue]:1 for each [Bleeding]. IF [Body]:0 THEN [Blood Loss]:1 instead."))

    // (const bloodloss)
    Object.assign(nx_tactics_decks_reference.c_bloodloss, vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "bloodloss", ":name", "Blood Loss", ":image", "images/card-bloodloss.svg", ":summary", "* Day End: Discard one [Blood Loss]"))

    // (const poisoned)
    Object.assign(nx_tactics_decks_reference.c_poisoned, vx_core.f_new({"any-1": nx_tactics_base.t_card}, ":id", "poisoned", ":name", "Poisoned", ":image", "images/card-poisoned.svg"))

  }
}
