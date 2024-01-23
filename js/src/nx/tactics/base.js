'strict mode'

import vx_core from "../../vx/core.js"


export default class nx_tactics_base {


  /**
   * type: ability
   */
  static t_ability = {}

  /**
   * type: abilitylist
   */
  static t_abilitylist = {}

  /**
   * type: book
   */
  static t_book = {}

  /**
   * type: booklist
   */
  static t_booklist = {}

  /**
   * type: card
   */
  static t_card = {}

  /**
   * type: cardlist
   */
  static t_cardlist = {}

  /**
   * type: chapter
   */
  static t_chapter = {}

  /**
   * type: chapterlist
   */
  static t_chapterlist = {}

  /**
   * type: damage
   */
  static t_damage = {}

  /**
   * type: damagelist
   */
  static t_damagelist = {}

  /**
   * type: deck
   */
  static t_deck = {}

  /**
   * type: decklist
   */
  static t_decklist = {}

  /**
   * type: item
   */
  static t_item = {}

  /**
   * type: itemlist
   */
  static t_itemlist = {}

  /**
   * type: location
   */
  static t_location = {}

  /**
   * type: locationlist
   */
  static t_locationlist = {}

  /**
   * type: playingcard
   */
  static t_playingcard = {}

  /**
   * type: power
   */
  static t_power = {}

  /**
   * type: powerlist
   */
  static t_powerlist = {}

  /**
   * type: rank
   */
  static t_rank = {}

  /**
   * type: rating
   * Rating are displayed as level.part:scale.
   */
  static t_rating = {}

  /**
   * type: role
   */
  static t_role = {}

  /**
   * type: rolelist
   */
  static t_rolelist = {}

  /**
   * type: rule
   */
  static t_rule = {}

  /**
   * type: rulelist
   */
  static t_rulelist = {}

  /**
   * type: scenario
   */
  static t_scenario = {}

  /**
   * type: scenariolist
   */
  static t_scenariolist = {}

  /**
   * type: section
   */
  static t_section = {}

  /**
   * type: sectionlist
   */
  static t_sectionlist = {}

  /**
   * type: skill
   */
  static t_skill = {}

  /**
   * type: skilllist
   */
  static t_skilllist = {}

  /**
   * type: specialty
   */
  static t_specialty = {}

  /**
   * type: specialtylist
   */
  static t_specialtylist = {}

  /**
   * type: suit
   */
  static t_suit = {}

  /**
   * type: suitlist
   */
  static t_suitlist = {}

  /**
   * type: unit
   */
  static t_unit = {}

  /**
   * type: unitlist
   */
  static t_unitlist = {}
  /**
   * Constant: rank-10
   * {rank}
   */
  static c_rank_10 = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-10'}}

  /**
   * Constant: rank-2
   * {rank}
   */
  static c_rank_2 = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-2'}}

  /**
   * Constant: rank-3
   * {rank}
   */
  static c_rank_3 = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-3'}}

  /**
   * Constant: rank-4
   * {rank}
   */
  static c_rank_4 = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-4'}}

  /**
   * Constant: rank-5
   * {rank}
   */
  static c_rank_5 = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-5'}}

  /**
   * Constant: rank-6
   * {rank}
   */
  static c_rank_6 = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-6'}}

  /**
   * Constant: rank-7
   * {rank}
   */
  static c_rank_7 = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-7'}}

  /**
   * Constant: rank-8
   * {rank}
   */
  static c_rank_8 = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-8'}}

  /**
   * Constant: rank-9
   * {rank}
   */
  static c_rank_9 = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-9'}}

  /**
   * Constant: rank-ace
   * {rank}
   */
  static c_rank_ace = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-ace'}}

  /**
   * Constant: rank-jack
   * {rank}
   */
  static c_rank_jack = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-jack'}}

  /**
   * Constant: rank-joker
   * {rank}
   */
  static c_rank_joker = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-joker'}}

  /**
   * Constant: rank-king
   * {rank}
   */
  static c_rank_king = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-king'}}

  /**
   * Constant: rank-queen
   * {rank}
   */
  static c_rank_queen = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-queen'}}

  /**
   * Constant: role-aoe
   * {role}
   */
  static c_role_aoe = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-aoe'}}

  /**
   * Constant: role-bosskiller
   * {role}
   */
  static c_role_bosskiller = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-bosskiller'}}

  /**
   * Constant: role-buffer
   * {role}
   */
  static c_role_buffer = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-buffer'}}

  /**
   * Constant: role-crowdcontrol
   * {role}
   */
  static c_role_crowdcontrol = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-crowdcontrol'}}

  /**
   * Constant: role-distracter
   * {role}
   */
  static c_role_distracter = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-distracter'}}

  /**
   * Constant: role-healer
   * {role}
   */
  static c_role_healer = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-healer'}}

  /**
   * Constant: role-sniper
   * {role}
   */
  static c_role_sniper = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-sniper'}}

  /**
   * Constant: role-tank
   * {role}
   */
  static c_role_tank = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-tank'}}

  /**
   * Constant: role-trapper
   * {role}
   */
  static c_role_trapper = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-trapper'}}

  /**
   * Constant: role-utility
   * {role}
   */
  static c_role_utility = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-utility'}}

  /**
   * Constant: suit-club
   * {suit}
   */
  static c_suit_club = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-club'}}

  /**
   * Constant: suit-diamond
   * {suit}
   */
  static c_suit_diamond = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-diamond'}}

  /**
   * Constant: suit-heart
   * {suit}
   */
  static c_suit_heart = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-heart'}}

  /**
   * Constant: suit-spade
   * {suit}
   */
  static c_suit_spade = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-spade'}}

  /**
   * @function rating_from_mass
   * Return a rating from a mass.
   * @param  {string} mass
   * @return {rating}
   */
  static t_rating_from_mass = {}
  static e_rating_from_mass = {vx_type: nx_tactics_base.t_rating_from_mass}

  // (func rating<-mass)
  static f_rating_from_mass(mass) {
    let output = nx_tactics_base.e_rating
    return output
  }

  // empty types
  static e_ability = {}
  static e_abilitylist = []
  static e_book = {}
  static e_booklist = []
  static e_card = {}
  static e_cardlist = []
  static e_chapter = {}
  static e_chapterlist = []
  static e_damage = {}
  static e_damagelist = []
  static e_deck = {}
  static e_decklist = []
  static e_item = {}
  static e_itemlist = []
  static e_location = {}
  static e_locationlist = []
  static e_playingcard = {}
  static e_power = {}
  static e_powerlist = []
  static e_rank = {}
  static e_rating = {}
  static e_role = {}
  static e_rolelist = []
  static e_rule = {}
  static e_rulelist = []
  static e_scenario = {}
  static e_scenariolist = []
  static e_section = {}
  static e_sectionlist = []
  static e_skill = {}
  static e_skilllist = []
  static e_specialty = {}
  static e_specialtylist = []
  static e_suit = {}
  static e_suitlist = []
  static e_unit = {}
  static e_unitlist = []


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "rank-10": nx_tactics_base.c_rank_10,
      "rank-2": nx_tactics_base.c_rank_2,
      "rank-3": nx_tactics_base.c_rank_3,
      "rank-4": nx_tactics_base.c_rank_4,
      "rank-5": nx_tactics_base.c_rank_5,
      "rank-6": nx_tactics_base.c_rank_6,
      "rank-7": nx_tactics_base.c_rank_7,
      "rank-8": nx_tactics_base.c_rank_8,
      "rank-9": nx_tactics_base.c_rank_9,
      "rank-ace": nx_tactics_base.c_rank_ace,
      "rank-jack": nx_tactics_base.c_rank_jack,
      "rank-joker": nx_tactics_base.c_rank_joker,
      "rank-king": nx_tactics_base.c_rank_king,
      "rank-queen": nx_tactics_base.c_rank_queen,
      "role-aoe": nx_tactics_base.c_role_aoe,
      "role-bosskiller": nx_tactics_base.c_role_bosskiller,
      "role-buffer": nx_tactics_base.c_role_buffer,
      "role-crowdcontrol": nx_tactics_base.c_role_crowdcontrol,
      "role-distracter": nx_tactics_base.c_role_distracter,
      "role-healer": nx_tactics_base.c_role_healer,
      "role-sniper": nx_tactics_base.c_role_sniper,
      "role-tank": nx_tactics_base.c_role_tank,
      "role-trapper": nx_tactics_base.c_role_trapper,
      "role-utility": nx_tactics_base.c_role_utility,
      "suit-club": nx_tactics_base.c_suit_club,
      "suit-diamond": nx_tactics_base.c_suit_diamond,
      "suit-heart": nx_tactics_base.c_suit_heart,
      "suit-spade": nx_tactics_base.c_suit_spade
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "ability": nx_tactics_base.e_ability,
      "abilitylist": nx_tactics_base.e_abilitylist,
      "book": nx_tactics_base.e_book,
      "booklist": nx_tactics_base.e_booklist,
      "card": nx_tactics_base.e_card,
      "cardlist": nx_tactics_base.e_cardlist,
      "chapter": nx_tactics_base.e_chapter,
      "chapterlist": nx_tactics_base.e_chapterlist,
      "damage": nx_tactics_base.e_damage,
      "damagelist": nx_tactics_base.e_damagelist,
      "deck": nx_tactics_base.e_deck,
      "decklist": nx_tactics_base.e_decklist,
      "item": nx_tactics_base.e_item,
      "itemlist": nx_tactics_base.e_itemlist,
      "location": nx_tactics_base.e_location,
      "locationlist": nx_tactics_base.e_locationlist,
      "playingcard": nx_tactics_base.e_playingcard,
      "power": nx_tactics_base.e_power,
      "powerlist": nx_tactics_base.e_powerlist,
      "rank": nx_tactics_base.e_rank,
      "rating": nx_tactics_base.e_rating,
      "role": nx_tactics_base.e_role,
      "rolelist": nx_tactics_base.e_rolelist,
      "rule": nx_tactics_base.e_rule,
      "rulelist": nx_tactics_base.e_rulelist,
      "scenario": nx_tactics_base.e_scenario,
      "scenariolist": nx_tactics_base.e_scenariolist,
      "section": nx_tactics_base.e_section,
      "sectionlist": nx_tactics_base.e_sectionlist,
      "skill": nx_tactics_base.e_skill,
      "skilllist": nx_tactics_base.e_skilllist,
      "specialty": nx_tactics_base.e_specialty,
      "specialtylist": nx_tactics_base.e_specialtylist,
      "suit": nx_tactics_base.e_suit,
      "suitlist": nx_tactics_base.e_suitlist,
      "unit": nx_tactics_base.e_unit,
      "unitlist": nx_tactics_base.e_unitlist,
      "rating<-mass": nx_tactics_base.e_rating_from_mass
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "rating<-mass": nx_tactics_base.t_rating_from_mass
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "ability": nx_tactics_base.t_ability,
      "abilitylist": nx_tactics_base.t_abilitylist,
      "book": nx_tactics_base.t_book,
      "booklist": nx_tactics_base.t_booklist,
      "card": nx_tactics_base.t_card,
      "cardlist": nx_tactics_base.t_cardlist,
      "chapter": nx_tactics_base.t_chapter,
      "chapterlist": nx_tactics_base.t_chapterlist,
      "damage": nx_tactics_base.t_damage,
      "damagelist": nx_tactics_base.t_damagelist,
      "deck": nx_tactics_base.t_deck,
      "decklist": nx_tactics_base.t_decklist,
      "item": nx_tactics_base.t_item,
      "itemlist": nx_tactics_base.t_itemlist,
      "location": nx_tactics_base.t_location,
      "locationlist": nx_tactics_base.t_locationlist,
      "playingcard": nx_tactics_base.t_playingcard,
      "power": nx_tactics_base.t_power,
      "powerlist": nx_tactics_base.t_powerlist,
      "rank": nx_tactics_base.t_rank,
      "rating": nx_tactics_base.t_rating,
      "role": nx_tactics_base.t_role,
      "rolelist": nx_tactics_base.t_rolelist,
      "rule": nx_tactics_base.t_rule,
      "rulelist": nx_tactics_base.t_rulelist,
      "scenario": nx_tactics_base.t_scenario,
      "scenariolist": nx_tactics_base.t_scenariolist,
      "section": nx_tactics_base.t_section,
      "sectionlist": nx_tactics_base.t_sectionlist,
      "skill": nx_tactics_base.t_skill,
      "skilllist": nx_tactics_base.t_skilllist,
      "specialty": nx_tactics_base.t_specialty,
      "specialtylist": nx_tactics_base.t_specialtylist,
      "suit": nx_tactics_base.t_suit,
      "suitlist": nx_tactics_base.t_suitlist,
      "unit": nx_tactics_base.t_unit,
      "unitlist": nx_tactics_base.t_unitlist
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/base",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (type ability)
    nx_tactics_base.t_ability['vx_type'] = vx_core.t_type
    nx_tactics_base.t_ability['vx_value'] = {
      name          : "ability",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_ability['vx_type'] = nx_tactics_base.t_ability
    nx_tactics_base.e_ability['vx_value'] = {}

    // (type abilitylist)
    nx_tactics_base.t_abilitylist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_abilitylist['vx_value'] = {
      name          : "abilitylist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_ability],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_abilitylist['vx_type'] = nx_tactics_base.t_abilitylist

    // (type book)
    nx_tactics_base.t_book['vx_type'] = vx_core.t_type
    nx_tactics_base.t_book['vx_value'] = {
      name          : "book",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "chapterlist": {
          "name" : "chapterlist",
          "type" : nx_tactics_base.t_chapterlist,
          "multi": false
        }
      },
      proplast      : {
        "name" : "chapterlist",
        "type" : nx_tactics_base.t_chapterlist,
        "multi": false
      }
    }
    nx_tactics_base.e_book['vx_type'] = nx_tactics_base.t_book
    nx_tactics_base.e_book['vx_value'] = {}

    // (type booklist)
    nx_tactics_base.t_booklist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_booklist['vx_value'] = {
      name          : "booklist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_book],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_booklist['vx_type'] = nx_tactics_base.t_booklist

    // (type card)
    nx_tactics_base.t_card['vx_type'] = vx_core.t_type
    nx_tactics_base.t_card['vx_value'] = {
      name          : "card",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_card['vx_type'] = nx_tactics_base.t_card
    nx_tactics_base.e_card['vx_value'] = {}

    // (type cardlist)
    nx_tactics_base.t_cardlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_cardlist['vx_value'] = {
      name          : "cardlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_card],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_cardlist['vx_type'] = nx_tactics_base.t_cardlist

    // (type chapter)
    nx_tactics_base.t_chapter['vx_type'] = vx_core.t_type
    nx_tactics_base.t_chapter['vx_value'] = {
      name          : "chapter",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "sectionlist": {
          "name" : "sectionlist",
          "type" : nx_tactics_base.t_sectionlist,
          "multi": false
        }
      },
      proplast      : {
        "name" : "sectionlist",
        "type" : nx_tactics_base.t_sectionlist,
        "multi": false
      }
    }
    nx_tactics_base.e_chapter['vx_type'] = nx_tactics_base.t_chapter
    nx_tactics_base.e_chapter['vx_value'] = {}

    // (type chapterlist)
    nx_tactics_base.t_chapterlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_chapterlist['vx_value'] = {
      name          : "chapterlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_chapter],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_chapterlist['vx_type'] = nx_tactics_base.t_chapterlist

    // (type damage)
    nx_tactics_base.t_damage['vx_type'] = vx_core.t_type
    nx_tactics_base.t_damage['vx_value'] = {
      name          : "damage",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card, nx_tactics_base.t_playingcard],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "rank": {
          "name" : "rank",
          "type" : nx_tactics_base.t_rank,
          "multi": false
        },
        "suit": {
          "name" : "suit",
          "type" : nx_tactics_base.t_suit,
          "multi": false
        }
      },
      proplast      : {
        "name" : "suit",
        "type" : nx_tactics_base.t_suit,
        "multi": false
      }
    }
    nx_tactics_base.e_damage['vx_type'] = nx_tactics_base.t_damage
    nx_tactics_base.e_damage['vx_value'] = {}

    // (type damagelist)
    nx_tactics_base.t_damagelist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_damagelist['vx_value'] = {
      name          : "damagelist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_damage],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_damagelist['vx_type'] = nx_tactics_base.t_damagelist

    // (type deck)
    nx_tactics_base.t_deck['vx_type'] = vx_core.t_type
    nx_tactics_base.t_deck['vx_value'] = {
      name          : "deck",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "cardlist": {
          "name" : "cardlist",
          "type" : nx_tactics_base.t_cardlist,
          "multi": false
        }
      },
      proplast      : {
        "name" : "cardlist",
        "type" : nx_tactics_base.t_cardlist,
        "multi": false
      }
    }
    nx_tactics_base.e_deck['vx_type'] = nx_tactics_base.t_deck
    nx_tactics_base.e_deck['vx_value'] = {}

    // (type decklist)
    nx_tactics_base.t_decklist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_decklist['vx_value'] = {
      name          : "decklist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_deck],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_decklist['vx_type'] = nx_tactics_base.t_decklist

    // (type item)
    nx_tactics_base.t_item['vx_type'] = vx_core.t_type
    nx_tactics_base.t_item['vx_value'] = {
      name          : "item",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "mass": {
          "name" : "mass",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "mass",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_item['vx_type'] = nx_tactics_base.t_item
    nx_tactics_base.e_item['vx_value'] = {}

    // (type itemlist)
    nx_tactics_base.t_itemlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_itemlist['vx_value'] = {
      name          : "itemlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_item],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_itemlist['vx_type'] = nx_tactics_base.t_itemlist

    // (type location)
    nx_tactics_base.t_location['vx_type'] = vx_core.t_type
    nx_tactics_base.t_location['vx_value'] = {
      name          : "location",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "locationlist": {
          "name" : "locationlist",
          "type" : nx_tactics_base.t_locationlist,
          "multi": false
        },
        "unitlist": {
          "name" : "unitlist",
          "type" : nx_tactics_base.t_unitlist,
          "multi": false
        }
      },
      proplast      : {
        "name" : "unitlist",
        "type" : nx_tactics_base.t_unitlist,
        "multi": false
      }
    }
    nx_tactics_base.e_location['vx_type'] = nx_tactics_base.t_location
    nx_tactics_base.e_location['vx_value'] = {}

    // (type locationlist)
    nx_tactics_base.t_locationlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_locationlist['vx_value'] = {
      name          : "locationlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_location],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_locationlist['vx_type'] = nx_tactics_base.t_locationlist

    // (type playingcard)
    nx_tactics_base.t_playingcard['vx_type'] = vx_core.t_type
    nx_tactics_base.t_playingcard['vx_value'] = {
      name          : "playingcard",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {
        "rank": {
          "name" : "rank",
          "type" : nx_tactics_base.t_rank,
          "multi": false
        },
        "suit": {
          "name" : "suit",
          "type" : nx_tactics_base.t_suit,
          "multi": false
        }
      },
      proplast      : {
        "name" : "suit",
        "type" : nx_tactics_base.t_suit,
        "multi": false
      }
    }
    nx_tactics_base.e_playingcard['vx_type'] = nx_tactics_base.t_playingcard
    nx_tactics_base.e_playingcard['vx_value'] = {}

    // (type power)
    nx_tactics_base.t_power['vx_type'] = vx_core.t_type
    nx_tactics_base.t_power['vx_value'] = {
      name          : "power",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "rating": {
          "name" : "rating",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "abilitylist": {
          "name" : "abilitylist",
          "type" : nx_tactics_base.t_abilitylist,
          "multi": false
        },
        "specialtylist": {
          "name" : "specialtylist",
          "type" : nx_tactics_base.t_specialtylist,
          "multi": false
        }
      },
      proplast      : {
        "name" : "specialtylist",
        "type" : nx_tactics_base.t_specialtylist,
        "multi": false
      }
    }
    nx_tactics_base.e_power['vx_type'] = nx_tactics_base.t_power
    nx_tactics_base.e_power['vx_value'] = {}

    // (type powerlist)
    nx_tactics_base.t_powerlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_powerlist['vx_value'] = {
      name          : "powerlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_power],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_powerlist['vx_type'] = nx_tactics_base.t_powerlist

    // (type rank)
    nx_tactics_base.t_rank['vx_type'] = vx_core.t_type
    nx_tactics_base.t_rank['vx_value'] = {
      name          : "rank",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_rank['vx_type'] = nx_tactics_base.t_rank
    nx_tactics_base.e_rank['vx_value'] = {}

    // (type rating)
    nx_tactics_base.t_rating['vx_type'] = vx_core.t_type
    nx_tactics_base.t_rating['vx_value'] = {
      name          : "rating",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "level": {
          "name" : "level",
          "type" : vx_core.t_int,
          "multi": false
        },
        "part": {
          "name" : "part",
          "type" : vx_core.t_int,
          "multi": false
        },
        "scale": {
          "name" : "scale",
          "type" : vx_core.t_int,
          "multi": false
        }
      },
      proplast      : {
        "name" : "scale",
        "type" : vx_core.t_int,
        "multi": false
      }
    }
    nx_tactics_base.e_rating['vx_type'] = nx_tactics_base.t_rating
    nx_tactics_base.e_rating['vx_value'] = {}

    // (type role)
    nx_tactics_base.t_role['vx_type'] = vx_core.t_type
    nx_tactics_base.t_role['vx_value'] = {
      name          : "role",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_role['vx_type'] = nx_tactics_base.t_role
    nx_tactics_base.e_role['vx_value'] = {}

    // (type rolelist)
    nx_tactics_base.t_rolelist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_rolelist['vx_value'] = {
      name          : "rolelist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_role],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_rolelist['vx_type'] = nx_tactics_base.t_rolelist

    // (type rule)
    nx_tactics_base.t_rule['vx_type'] = vx_core.t_type
    nx_tactics_base.t_rule['vx_value'] = {
      name          : "rule",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_rule['vx_type'] = nx_tactics_base.t_rule
    nx_tactics_base.e_rule['vx_value'] = {}

    // (type rulelist)
    nx_tactics_base.t_rulelist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_rulelist['vx_value'] = {
      name          : "rulelist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_rule],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_rulelist['vx_type'] = nx_tactics_base.t_rulelist

    // (type scenario)
    nx_tactics_base.t_scenario['vx_type'] = vx_core.t_type
    nx_tactics_base.t_scenario['vx_value'] = {
      name          : "scenario",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "unitlist": {
          "name" : "unitlist",
          "type" : nx_tactics_base.t_unitlist,
          "multi": false
        }
      },
      proplast      : {
        "name" : "unitlist",
        "type" : nx_tactics_base.t_unitlist,
        "multi": false
      }
    }
    nx_tactics_base.e_scenario['vx_type'] = nx_tactics_base.t_scenario
    nx_tactics_base.e_scenario['vx_value'] = {}

    // (type scenariolist)
    nx_tactics_base.t_scenariolist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_scenariolist['vx_value'] = {
      name          : "scenariolist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_scenario],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_scenariolist['vx_type'] = nx_tactics_base.t_scenariolist

    // (type section)
    nx_tactics_base.t_section['vx_type'] = vx_core.t_type
    nx_tactics_base.t_section['vx_value'] = {
      name          : "section",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "decklist": {
          "name" : "decklist",
          "type" : nx_tactics_base.t_decklist,
          "multi": false
        },
        "itemlist": {
          "name" : "itemlist",
          "type" : nx_tactics_base.t_itemlist,
          "multi": false
        },
        "locationlist": {
          "name" : "locationlist",
          "type" : nx_tactics_base.t_locationlist,
          "multi": false
        },
        "powerlist": {
          "name" : "powerlist",
          "type" : nx_tactics_base.t_powerlist,
          "multi": false
        },
        "rulelist": {
          "name" : "rulelist",
          "type" : nx_tactics_base.t_rulelist,
          "multi": false
        },
        "scenariolist": {
          "name" : "scenariolist",
          "type" : nx_tactics_base.t_scenariolist,
          "multi": false
        },
        "sectionlist": {
          "name" : "sectionlist",
          "type" : nx_tactics_base.t_sectionlist,
          "multi": false
        },
        "skilllist": {
          "name" : "skilllist",
          "type" : nx_tactics_base.t_skilllist,
          "multi": false
        },
        "suitlist": {
          "name" : "suitlist",
          "type" : nx_tactics_base.t_suitlist,
          "multi": false
        },
        "unitlist": {
          "name" : "unitlist",
          "type" : nx_tactics_base.t_unitlist,
          "multi": false
        }
      },
      proplast      : {
        "name" : "unitlist",
        "type" : nx_tactics_base.t_unitlist,
        "multi": false
      }
    }
    nx_tactics_base.e_section['vx_type'] = nx_tactics_base.t_section
    nx_tactics_base.e_section['vx_value'] = {}

    // (type sectionlist)
    nx_tactics_base.t_sectionlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_sectionlist['vx_value'] = {
      name          : "sectionlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_section],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_sectionlist['vx_type'] = nx_tactics_base.t_sectionlist

    // (type skill)
    nx_tactics_base.t_skill['vx_type'] = vx_core.t_type
    nx_tactics_base.t_skill['vx_value'] = {
      name          : "skill",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "rating": {
          "name" : "rating",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "abilitylist": {
          "name" : "abilitylist",
          "type" : nx_tactics_base.t_abilitylist,
          "multi": false
        },
        "specialtylist": {
          "name" : "specialtylist",
          "type" : nx_tactics_base.t_specialtylist,
          "multi": false
        }
      },
      proplast      : {
        "name" : "specialtylist",
        "type" : nx_tactics_base.t_specialtylist,
        "multi": false
      }
    }
    nx_tactics_base.e_skill['vx_type'] = nx_tactics_base.t_skill
    nx_tactics_base.e_skill['vx_value'] = {}

    // (type skilllist)
    nx_tactics_base.t_skilllist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_skilllist['vx_value'] = {
      name          : "skilllist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_skill],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_skilllist['vx_type'] = nx_tactics_base.t_skilllist

    // (type specialty)
    nx_tactics_base.t_specialty['vx_type'] = vx_core.t_type
    nx_tactics_base.t_specialty['vx_value'] = {
      name          : "specialty",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_specialty['vx_type'] = nx_tactics_base.t_specialty
    nx_tactics_base.e_specialty['vx_value'] = {}

    // (type specialtylist)
    nx_tactics_base.t_specialtylist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_specialtylist['vx_value'] = {
      name          : "specialtylist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_specialty],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_specialtylist['vx_type'] = nx_tactics_base.t_specialtylist

    // (type suit)
    nx_tactics_base.t_suit['vx_type'] = vx_core.t_type
    nx_tactics_base.t_suit['vx_value'] = {
      name          : "suit",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_suit['vx_type'] = nx_tactics_base.t_suit
    nx_tactics_base.e_suit['vx_value'] = {}

    // (type suitlist)
    nx_tactics_base.t_suitlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_suitlist['vx_value'] = {
      name          : "suitlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_suit],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_suitlist['vx_type'] = nx_tactics_base.t_suitlist

    // (type unit)
    nx_tactics_base.t_unit['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unit['vx_value'] = {
      name          : "unit",
      pkgname       : "nx/tactics/base",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "references": {
          "name" : "references",
          "type" : vx_core.t_string,
          "multi": false
        },
        "doc": {
          "name" : "doc",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "body": {
          "name" : "body",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "mind": {
          "name" : "mind",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "will": {
          "name" : "will",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "speed": {
          "name" : "speed",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "shadow": {
          "name" : "shadow",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "beast": {
          "name" : "beast",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "mass": {
          "name" : "mass",
          "type" : vx_core.t_string,
          "multi": false
        },
        "roles": {
          "name" : "roles",
          "type" : nx_tactics_base.t_rolelist,
          "multi": false
        },
        "skills": {
          "name" : "skills",
          "type" : nx_tactics_base.t_skilllist,
          "multi": false
        },
        "powers": {
          "name" : "powers",
          "type" : nx_tactics_base.t_powerlist,
          "multi": false
        }
      },
      proplast      : {
        "name" : "powers",
        "type" : nx_tactics_base.t_powerlist,
        "multi": false
      }
    }
    nx_tactics_base.e_unit['vx_type'] = nx_tactics_base.t_unit
    nx_tactics_base.e_unit['vx_value'] = {}

    // (type unitlist)
    nx_tactics_base.t_unitlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitlist['vx_value'] = {
      name          : "unitlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_unit],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_unitlist['vx_type'] = nx_tactics_base.t_unitlist

    // (const rank-10)
    Object.assign(nx_tactics_base.c_rank_10, {
      
    })

    // (const rank-2)
    Object.assign(nx_tactics_base.c_rank_2, {
      
    })

    // (const rank-3)
    Object.assign(nx_tactics_base.c_rank_3, {
      
    })

    // (const rank-4)
    Object.assign(nx_tactics_base.c_rank_4, {
      
    })

    // (const rank-5)
    Object.assign(nx_tactics_base.c_rank_5, {
      
    })

    // (const rank-6)
    Object.assign(nx_tactics_base.c_rank_6, {
      
    })

    // (const rank-7)
    Object.assign(nx_tactics_base.c_rank_7, {
      
    })

    // (const rank-8)
    Object.assign(nx_tactics_base.c_rank_8, {
      
    })

    // (const rank-9)
    Object.assign(nx_tactics_base.c_rank_9, {
      
    })

    // (const rank-ace)
    Object.assign(nx_tactics_base.c_rank_ace, {
      
    })

    // (const rank-jack)
    Object.assign(nx_tactics_base.c_rank_jack, {
      
    })

    // (const rank-joker)
    Object.assign(nx_tactics_base.c_rank_joker, {
      
    })

    // (const rank-king)
    Object.assign(nx_tactics_base.c_rank_king, {
      
    })

    // (const rank-queen)
    Object.assign(nx_tactics_base.c_rank_queen, {
      
    })

    // (const suit-club)
    Object.assign(nx_tactics_base.c_suit_club, {
      
    })

    // (const suit-diamond)
    Object.assign(nx_tactics_base.c_suit_diamond, {
      
    })

    // (const suit-heart)
    Object.assign(nx_tactics_base.c_suit_heart, {
      
    })

    // (const suit-spade)
    Object.assign(nx_tactics_base.c_suit_spade, {
      
    })

    // (func rating<-mass)
    nx_tactics_base.t_rating_from_mass['vx_type'] = vx_core.t_type
    nx_tactics_base.t_rating_from_mass['vx_value'] = {
      name          : "rating<-mass",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_rating_from_mass
    }

  }
}
