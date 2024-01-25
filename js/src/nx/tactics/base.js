'strict mode'

import vx_core from "../../vx/core.js"


export default class nx_tactics_base {


  /**
   * type: ability
   */
  static t_ability = {}

  /**
   * type: abilitymap
   */
  static t_abilitymap = {}

  /**
   * type: book
   */
  static t_book = {}

  /**
   * type: bookmap
   */
  static t_bookmap = {}

  /**
   * type: card
   */
  static t_card = {}

  /**
   * type: cardlist
   */
  static t_cardlist = {}

  /**
   * type: cardmap
   */
  static t_cardmap = {}

  /**
   * type: chapter
   */
  static t_chapter = {}

  /**
   * type: chapterlist
   */
  static t_chapterlist = {}

  /**
   * type: chaptermap
   */
  static t_chaptermap = {}

  /**
   * type: damage
   */
  static t_damage = {}

  /**
   * type: damagelist
   */
  static t_damagelist = {}

  /**
   * type: damagemap
   */
  static t_damagemap = {}

  /**
   * type: deck
   */
  static t_deck = {}

  /**
   * type: deckmap
   */
  static t_deckmap = {}

  /**
   * type: goal
   */
  static t_goal = {}

  /**
   * type: item
   */
  static t_item = {}

  /**
   * type: itemmap
   */
  static t_itemmap = {}

  /**
   * type: location
   */
  static t_location = {}

  /**
   * type: locationmap
   */
  static t_locationmap = {}

  /**
   * type: mind
   * The ability to use rational thought to do tasks. This is the opposite of the [Shadow].
   */
  static t_mind = {}

  /**
   * type: modifier
   */
  static t_modifier = {}

  /**
   * type: playingcard
   */
  static t_playingcard = {}

  /**
   * type: power
   */
  static t_power = {}

  /**
   * type: powermap
   */
  static t_powermap = {}

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
   * type: rolemap
   */
  static t_rolemap = {}

  /**
   * type: rule
   */
  static t_rule = {}

  /**
   * type: rulemap
   */
  static t_rulemap = {}

  /**
   * type: scenario
   */
  static t_scenario = {}

  /**
   * type: scenariomap
   */
  static t_scenariomap = {}

  /**
   * type: section
   */
  static t_section = {}

  /**
   * type: sectionmap
   */
  static t_sectionmap = {}

  /**
   * type: skill
   */
  static t_skill = {}

  /**
   * type: skillmap
   */
  static t_skillmap = {}

  /**
   * type: specialty
   */
  static t_specialty = {}

  /**
   * type: specialtymap
   */
  static t_specialtymap = {}

  /**
   * type: stat
   */
  static t_stat = {}

  /**
   * type: suit
   */
  static t_suit = {}

  /**
   * type: suitmap
   */
  static t_suitmap = {}

  /**
   * type: threat
   */
  static t_threat = {}

  /**
   * type: unit
   */
  static t_unit = {}

  /**
   * type: unitability
   */
  static t_unitability = {}

  /**
   * type: unitabilitymap
   */
  static t_unitabilitymap = {}

  /**
   * type: unititem
   */
  static t_unititem = {}

  /**
   * type: unititemmap
   */
  static t_unititemmap = {}

  /**
   * type: unitmap
   */
  static t_unitmap = {}

  /**
   * type: unitpower
   */
  static t_unitpower = {}

  /**
   * type: unitpowermap
   */
  static t_unitpowermap = {}

  /**
   * type: unitskill
   */
  static t_unitskill = {}

  /**
   * type: unitskillmap
   */
  static t_unitskillmap = {}

  /**
   * type: unitspecialty
   */
  static t_unitspecialty = {}

  /**
   * type: unitspecialtymap
   */
  static t_unitspecialtymap = {}

  /**
   * type: unitweakness
   */
  static t_unitweakness = {}

  /**
   * type: unitweaknessmap
   */
  static t_unitweaknessmap = {}

  /**
   * type: weakness
   */
  static t_weakness = {}

  /**
   * type: weaknessmap
   */
  static t_weaknessmap = {}
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
   * Constant: stat-beast
   * The ability to use wild rage or terror to lash out or flee. This is the opposite of the [Will].
   * {stat}
   */
  static c_stat_beast = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-beast'}}

  /**
   * Constant: stat-body
   * {stat}
   */
  static c_stat_body = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-body'}}

  /**
   * Constant: stat-mind
   * {stat}
   */
  static c_stat_mind = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-mind'}}

  /**
   * Constant: stat-shadow
   * The ability to use rational thought to do selfish/impulsive acts. This is the opposite of the [Mind].
   * {stat}
   */
  static c_stat_shadow = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-shadow'}}

  /**
   * Constant: stat-speed
   * {stat}
   */
  static c_stat_speed = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-speed'}}

  /**
   * Constant: stat-will
   * {stat}
   */
  static c_stat_will = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-will'}}

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
  static e_abilitymap = {}
  static e_book = {}
  static e_bookmap = {}
  static e_card = {}
  static e_cardlist = []
  static e_cardmap = {}
  static e_chapter = {}
  static e_chapterlist = []
  static e_chaptermap = {}
  static e_damage = {}
  static e_damagelist = []
  static e_damagemap = {}
  static e_deck = {}
  static e_deckmap = {}
  static e_goal = {}
  static e_item = {}
  static e_itemmap = {}
  static e_location = {}
  static e_locationmap = {}
  static e_mind = {}
  static e_modifier = {}
  static e_playingcard = {}
  static e_power = {}
  static e_powermap = {}
  static e_rank = {}
  static e_rating = {}
  static e_role = {}
  static e_rolemap = {}
  static e_rule = {}
  static e_rulemap = {}
  static e_scenario = {}
  static e_scenariomap = {}
  static e_section = {}
  static e_sectionmap = {}
  static e_skill = {}
  static e_skillmap = {}
  static e_specialty = {}
  static e_specialtymap = {}
  static e_stat = {}
  static e_suit = {}
  static e_suitmap = {}
  static e_threat = {}
  static e_unit = {}
  static e_unitability = {}
  static e_unitabilitymap = {}
  static e_unititem = {}
  static e_unititemmap = {}
  static e_unitmap = {}
  static e_unitpower = {}
  static e_unitpowermap = {}
  static e_unitskill = {}
  static e_unitskillmap = {}
  static e_unitspecialty = {}
  static e_unitspecialtymap = {}
  static e_unitweakness = {}
  static e_unitweaknessmap = {}
  static e_weakness = {}
  static e_weaknessmap = {}


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
      "stat-beast": nx_tactics_base.c_stat_beast,
      "stat-body": nx_tactics_base.c_stat_body,
      "stat-mind": nx_tactics_base.c_stat_mind,
      "stat-shadow": nx_tactics_base.c_stat_shadow,
      "stat-speed": nx_tactics_base.c_stat_speed,
      "stat-will": nx_tactics_base.c_stat_will,
      "suit-club": nx_tactics_base.c_suit_club,
      "suit-diamond": nx_tactics_base.c_suit_diamond,
      "suit-heart": nx_tactics_base.c_suit_heart,
      "suit-spade": nx_tactics_base.c_suit_spade
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "ability": nx_tactics_base.e_ability,
      "abilitymap": nx_tactics_base.e_abilitymap,
      "book": nx_tactics_base.e_book,
      "bookmap": nx_tactics_base.e_bookmap,
      "card": nx_tactics_base.e_card,
      "cardlist": nx_tactics_base.e_cardlist,
      "cardmap": nx_tactics_base.e_cardmap,
      "chapter": nx_tactics_base.e_chapter,
      "chapterlist": nx_tactics_base.e_chapterlist,
      "chaptermap": nx_tactics_base.e_chaptermap,
      "damage": nx_tactics_base.e_damage,
      "damagelist": nx_tactics_base.e_damagelist,
      "damagemap": nx_tactics_base.e_damagemap,
      "deck": nx_tactics_base.e_deck,
      "deckmap": nx_tactics_base.e_deckmap,
      "goal": nx_tactics_base.e_goal,
      "item": nx_tactics_base.e_item,
      "itemmap": nx_tactics_base.e_itemmap,
      "location": nx_tactics_base.e_location,
      "locationmap": nx_tactics_base.e_locationmap,
      "mind": nx_tactics_base.e_mind,
      "modifier": nx_tactics_base.e_modifier,
      "playingcard": nx_tactics_base.e_playingcard,
      "power": nx_tactics_base.e_power,
      "powermap": nx_tactics_base.e_powermap,
      "rank": nx_tactics_base.e_rank,
      "rating": nx_tactics_base.e_rating,
      "role": nx_tactics_base.e_role,
      "rolemap": nx_tactics_base.e_rolemap,
      "rule": nx_tactics_base.e_rule,
      "rulemap": nx_tactics_base.e_rulemap,
      "scenario": nx_tactics_base.e_scenario,
      "scenariomap": nx_tactics_base.e_scenariomap,
      "section": nx_tactics_base.e_section,
      "sectionmap": nx_tactics_base.e_sectionmap,
      "skill": nx_tactics_base.e_skill,
      "skillmap": nx_tactics_base.e_skillmap,
      "specialty": nx_tactics_base.e_specialty,
      "specialtymap": nx_tactics_base.e_specialtymap,
      "stat": nx_tactics_base.e_stat,
      "suit": nx_tactics_base.e_suit,
      "suitmap": nx_tactics_base.e_suitmap,
      "threat": nx_tactics_base.e_threat,
      "unit": nx_tactics_base.e_unit,
      "unitability": nx_tactics_base.e_unitability,
      "unitabilitymap": nx_tactics_base.e_unitabilitymap,
      "unititem": nx_tactics_base.e_unititem,
      "unititemmap": nx_tactics_base.e_unititemmap,
      "unitmap": nx_tactics_base.e_unitmap,
      "unitpower": nx_tactics_base.e_unitpower,
      "unitpowermap": nx_tactics_base.e_unitpowermap,
      "unitskill": nx_tactics_base.e_unitskill,
      "unitskillmap": nx_tactics_base.e_unitskillmap,
      "unitspecialty": nx_tactics_base.e_unitspecialty,
      "unitspecialtymap": nx_tactics_base.e_unitspecialtymap,
      "unitweakness": nx_tactics_base.e_unitweakness,
      "unitweaknessmap": nx_tactics_base.e_unitweaknessmap,
      "weakness": nx_tactics_base.e_weakness,
      "weaknessmap": nx_tactics_base.e_weaknessmap,
      "rating<-mass": nx_tactics_base.e_rating_from_mass
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "rating<-mass": nx_tactics_base.t_rating_from_mass
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "ability": nx_tactics_base.t_ability,
      "abilitymap": nx_tactics_base.t_abilitymap,
      "book": nx_tactics_base.t_book,
      "bookmap": nx_tactics_base.t_bookmap,
      "card": nx_tactics_base.t_card,
      "cardlist": nx_tactics_base.t_cardlist,
      "cardmap": nx_tactics_base.t_cardmap,
      "chapter": nx_tactics_base.t_chapter,
      "chapterlist": nx_tactics_base.t_chapterlist,
      "chaptermap": nx_tactics_base.t_chaptermap,
      "damage": nx_tactics_base.t_damage,
      "damagelist": nx_tactics_base.t_damagelist,
      "damagemap": nx_tactics_base.t_damagemap,
      "deck": nx_tactics_base.t_deck,
      "deckmap": nx_tactics_base.t_deckmap,
      "goal": nx_tactics_base.t_goal,
      "item": nx_tactics_base.t_item,
      "itemmap": nx_tactics_base.t_itemmap,
      "location": nx_tactics_base.t_location,
      "locationmap": nx_tactics_base.t_locationmap,
      "mind": nx_tactics_base.t_mind,
      "modifier": nx_tactics_base.t_modifier,
      "playingcard": nx_tactics_base.t_playingcard,
      "power": nx_tactics_base.t_power,
      "powermap": nx_tactics_base.t_powermap,
      "rank": nx_tactics_base.t_rank,
      "rating": nx_tactics_base.t_rating,
      "role": nx_tactics_base.t_role,
      "rolemap": nx_tactics_base.t_rolemap,
      "rule": nx_tactics_base.t_rule,
      "rulemap": nx_tactics_base.t_rulemap,
      "scenario": nx_tactics_base.t_scenario,
      "scenariomap": nx_tactics_base.t_scenariomap,
      "section": nx_tactics_base.t_section,
      "sectionmap": nx_tactics_base.t_sectionmap,
      "skill": nx_tactics_base.t_skill,
      "skillmap": nx_tactics_base.t_skillmap,
      "specialty": nx_tactics_base.t_specialty,
      "specialtymap": nx_tactics_base.t_specialtymap,
      "stat": nx_tactics_base.t_stat,
      "suit": nx_tactics_base.t_suit,
      "suitmap": nx_tactics_base.t_suitmap,
      "threat": nx_tactics_base.t_threat,
      "unit": nx_tactics_base.t_unit,
      "unitability": nx_tactics_base.t_unitability,
      "unitabilitymap": nx_tactics_base.t_unitabilitymap,
      "unititem": nx_tactics_base.t_unititem,
      "unititemmap": nx_tactics_base.t_unititemmap,
      "unitmap": nx_tactics_base.t_unitmap,
      "unitpower": nx_tactics_base.t_unitpower,
      "unitpowermap": nx_tactics_base.t_unitpowermap,
      "unitskill": nx_tactics_base.t_unitskill,
      "unitskillmap": nx_tactics_base.t_unitskillmap,
      "unitspecialty": nx_tactics_base.t_unitspecialty,
      "unitspecialtymap": nx_tactics_base.t_unitspecialtymap,
      "unitweakness": nx_tactics_base.t_unitweakness,
      "unitweaknessmap": nx_tactics_base.t_unitweaknessmap,
      "weakness": nx_tactics_base.t_weakness,
      "weaknessmap": nx_tactics_base.t_weaknessmap
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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

    // (type abilitymap)
    nx_tactics_base.t_abilitymap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_abilitymap['vx_value'] = {
      name          : "abilitymap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_abilitymap['vx_type'] = nx_tactics_base.t_abilitymap
    nx_tactics_base.e_abilitymap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "chaptermap": {
          "name" : "chaptermap",
          "type" : nx_tactics_base.t_chaptermap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "chaptermap",
        "type" : nx_tactics_base.t_chaptermap,
        "multi": false
      }
    }
    nx_tactics_base.e_book['vx_type'] = nx_tactics_base.t_book
    nx_tactics_base.e_book['vx_value'] = {}

    // (type bookmap)
    nx_tactics_base.t_bookmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_bookmap['vx_value'] = {
      name          : "bookmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_bookmap['vx_type'] = nx_tactics_base.t_bookmap
    nx_tactics_base.e_bookmap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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

    // (type cardmap)
    nx_tactics_base.t_cardmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_cardmap['vx_value'] = {
      name          : "cardmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_cardmap['vx_type'] = nx_tactics_base.t_cardmap
    nx_tactics_base.e_cardmap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "sectionmap": {
          "name" : "sectionmap",
          "type" : nx_tactics_base.t_sectionmap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "sectionmap",
        "type" : nx_tactics_base.t_sectionmap,
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

    // (type chaptermap)
    nx_tactics_base.t_chaptermap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_chaptermap['vx_value'] = {
      name          : "chaptermap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_chaptermap['vx_type'] = nx_tactics_base.t_chaptermap
    nx_tactics_base.e_chaptermap['vx_value'] = {}

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
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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

    // (type damagemap)
    nx_tactics_base.t_damagemap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_damagemap['vx_value'] = {
      name          : "damagemap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_damagemap['vx_type'] = nx_tactics_base.t_damagemap
    nx_tactics_base.e_damagemap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "cardmap": {
          "name" : "cardmap",
          "type" : nx_tactics_base.t_cardmap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "cardmap",
        "type" : nx_tactics_base.t_cardmap,
        "multi": false
      }
    }
    nx_tactics_base.e_deck['vx_type'] = nx_tactics_base.t_deck
    nx_tactics_base.e_deck['vx_value'] = {}

    // (type deckmap)
    nx_tactics_base.t_deckmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_deckmap['vx_value'] = {
      name          : "deckmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
    nx_tactics_base.e_deckmap['vx_type'] = nx_tactics_base.t_deckmap
    nx_tactics_base.e_deckmap['vx_value'] = {}

    // (type goal)
    nx_tactics_base.t_goal['vx_type'] = vx_core.t_type
    nx_tactics_base.t_goal['vx_value'] = {
      name          : "goal",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "description": {
          "name" : "description",
          "type" : vx_core.t_string,
          "multi": false
        },
        "progress": {
          "name" : "progress",
          "type" : vx_core.t_int,
          "multi": false
        },
        "complete": {
          "name" : "complete",
          "type" : vx_core.t_int,
          "multi": false
        },
        "reward": {
          "name" : "reward",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "reward",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_goal['vx_type'] = nx_tactics_base.t_goal
    nx_tactics_base.e_goal['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
        "rolemap": {
          "name" : "rolemap",
          "type" : nx_tactics_base.t_rolemap,
          "multi": false
        },
        "unitpowermap": {
          "name" : "unitpowermap",
          "type" : nx_tactics_base.t_unitpowermap,
          "multi": false
        },
        "unitskillmap": {
          "name" : "unitskillmap",
          "type" : nx_tactics_base.t_unitskillmap,
          "multi": false
        },
        "unitweaknessmap": {
          "name" : "unitweaknessmap",
          "type" : nx_tactics_base.t_unitweaknessmap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "unitweaknessmap",
        "type" : nx_tactics_base.t_unitweaknessmap,
        "multi": false
      }
    }
    nx_tactics_base.e_item['vx_type'] = nx_tactics_base.t_item
    nx_tactics_base.e_item['vx_value'] = {}

    // (type itemmap)
    nx_tactics_base.t_itemmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_itemmap['vx_value'] = {
      name          : "itemmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_itemmap['vx_type'] = nx_tactics_base.t_itemmap
    nx_tactics_base.e_itemmap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "locationmap": {
          "name" : "locationmap",
          "type" : nx_tactics_base.t_locationmap,
          "multi": false
        },
        "unitmap": {
          "name" : "unitmap",
          "type" : nx_tactics_base.t_unitmap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "unitmap",
        "type" : nx_tactics_base.t_unitmap,
        "multi": false
      }
    }
    nx_tactics_base.e_location['vx_type'] = nx_tactics_base.t_location
    nx_tactics_base.e_location['vx_value'] = {}

    // (type locationmap)
    nx_tactics_base.t_locationmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_locationmap['vx_value'] = {
      name          : "locationmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_locationmap['vx_type'] = nx_tactics_base.t_locationmap
    nx_tactics_base.e_locationmap['vx_value'] = {}

    // (type mind)
    nx_tactics_base.t_mind['vx_type'] = vx_core.t_type
    nx_tactics_base.t_mind['vx_value'] = {
      name          : "mind",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
    nx_tactics_base.e_mind['vx_type'] = nx_tactics_base.t_mind
    nx_tactics_base.e_mind['vx_value'] = {}

    // (type modifier)
    nx_tactics_base.t_modifier['vx_type'] = vx_core.t_type
    nx_tactics_base.t_modifier['vx_value'] = {
      name          : "modifier",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
    nx_tactics_base.e_modifier['vx_type'] = nx_tactics_base.t_modifier
    nx_tactics_base.e_modifier['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "abilitymap": {
          "name" : "abilitymap",
          "type" : nx_tactics_base.t_abilitymap,
          "multi": false
        },
        "specialtymap": {
          "name" : "specialtymap",
          "type" : nx_tactics_base.t_specialtymap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "specialtymap",
        "type" : nx_tactics_base.t_specialtymap,
        "multi": false
      }
    }
    nx_tactics_base.e_power['vx_type'] = nx_tactics_base.t_power
    nx_tactics_base.e_power['vx_value'] = {}

    // (type powermap)
    nx_tactics_base.t_powermap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_powermap['vx_value'] = {
      name          : "powermap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_powermap['vx_type'] = nx_tactics_base.t_powermap
    nx_tactics_base.e_powermap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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

    // (type rolemap)
    nx_tactics_base.t_rolemap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_rolemap['vx_value'] = {
      name          : "rolemap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_rolemap['vx_type'] = nx_tactics_base.t_rolemap
    nx_tactics_base.e_rolemap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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

    // (type rulemap)
    nx_tactics_base.t_rulemap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_rulemap['vx_value'] = {
      name          : "rulemap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_rulemap['vx_type'] = nx_tactics_base.t_rulemap
    nx_tactics_base.e_rulemap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
    nx_tactics_base.e_scenario['vx_type'] = nx_tactics_base.t_scenario
    nx_tactics_base.e_scenario['vx_value'] = {}

    // (type scenariomap)
    nx_tactics_base.t_scenariomap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_scenariomap['vx_value'] = {
      name          : "scenariomap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_scenariomap['vx_type'] = nx_tactics_base.t_scenariomap
    nx_tactics_base.e_scenariomap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "deckmap": {
          "name" : "deckmap",
          "type" : nx_tactics_base.t_deckmap,
          "multi": false
        },
        "itemmap": {
          "name" : "itemmap",
          "type" : nx_tactics_base.t_itemmap,
          "multi": false
        },
        "locationmap": {
          "name" : "locationmap",
          "type" : nx_tactics_base.t_locationmap,
          "multi": false
        },
        "powermap": {
          "name" : "powermap",
          "type" : nx_tactics_base.t_powermap,
          "multi": false
        },
        "rulemap": {
          "name" : "rulemap",
          "type" : nx_tactics_base.t_rulemap,
          "multi": false
        },
        "scenariomap": {
          "name" : "scenariomap",
          "type" : nx_tactics_base.t_scenariomap,
          "multi": false
        },
        "sectionmap": {
          "name" : "sectionmap",
          "type" : nx_tactics_base.t_sectionmap,
          "multi": false
        },
        "skillmap": {
          "name" : "skillmap",
          "type" : nx_tactics_base.t_skillmap,
          "multi": false
        },
        "suitmap": {
          "name" : "suitmap",
          "type" : nx_tactics_base.t_suitmap,
          "multi": false
        },
        "unitmap": {
          "name" : "unitmap",
          "type" : nx_tactics_base.t_unitmap,
          "multi": false
        },
        "weaknessmap": {
          "name" : "weaknessmap",
          "type" : nx_tactics_base.t_weaknessmap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "weaknessmap",
        "type" : nx_tactics_base.t_weaknessmap,
        "multi": false
      }
    }
    nx_tactics_base.e_section['vx_type'] = nx_tactics_base.t_section
    nx_tactics_base.e_section['vx_value'] = {}

    // (type sectionmap)
    nx_tactics_base.t_sectionmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_sectionmap['vx_value'] = {
      name          : "sectionmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_sectionmap['vx_type'] = nx_tactics_base.t_sectionmap
    nx_tactics_base.e_sectionmap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
        "stat": {
          "name" : "stat",
          "type" : nx_tactics_base.t_stat,
          "multi": false
        },
        "abilitymap": {
          "name" : "abilitymap",
          "type" : nx_tactics_base.t_abilitymap,
          "multi": false
        },
        "specialtymap": {
          "name" : "specialtymap",
          "type" : nx_tactics_base.t_specialtymap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "specialtymap",
        "type" : nx_tactics_base.t_specialtymap,
        "multi": false
      }
    }
    nx_tactics_base.e_skill['vx_type'] = nx_tactics_base.t_skill
    nx_tactics_base.e_skill['vx_value'] = {}

    // (type skillmap)
    nx_tactics_base.t_skillmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_skillmap['vx_value'] = {
      name          : "skillmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_skillmap['vx_type'] = nx_tactics_base.t_skillmap
    nx_tactics_base.e_skillmap['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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

    // (type specialtymap)
    nx_tactics_base.t_specialtymap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_specialtymap['vx_value'] = {
      name          : "specialtymap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
    nx_tactics_base.e_specialtymap['vx_type'] = nx_tactics_base.t_specialtymap
    nx_tactics_base.e_specialtymap['vx_value'] = {}

    // (type stat)
    nx_tactics_base.t_stat['vx_type'] = vx_core.t_type
    nx_tactics_base.t_stat['vx_value'] = {
      name          : "stat",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
    nx_tactics_base.e_stat['vx_type'] = nx_tactics_base.t_stat
    nx_tactics_base.e_stat['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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

    // (type suitmap)
    nx_tactics_base.t_suitmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_suitmap['vx_value'] = {
      name          : "suitmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
    nx_tactics_base.e_suitmap['vx_type'] = nx_tactics_base.t_suitmap
    nx_tactics_base.e_suitmap['vx_value'] = {}

    // (type threat)
    nx_tactics_base.t_threat['vx_type'] = vx_core.t_type
    nx_tactics_base.t_threat['vx_value'] = {
      name          : "threat",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "description": {
          "name" : "description",
          "type" : vx_core.t_string,
          "multi": false
        },
        "progress": {
          "name" : "progress",
          "type" : vx_core.t_int,
          "multi": false
        },
        "complete": {
          "name" : "complete",
          "type" : vx_core.t_int,
          "multi": false
        },
        "consequences": {
          "name" : "consequences",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "consequences",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_threat['vx_type'] = nx_tactics_base.t_threat
    nx_tactics_base.e_threat['vx_value'] = {}

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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
        "demeanor": {
          "name" : "demeanor",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "nature": {
          "name" : "nature",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "mass": {
          "name" : "mass",
          "type" : vx_core.t_string,
          "multi": false
        },
        "height": {
          "name" : "height",
          "type" : vx_core.t_string,
          "multi": false
        },
        "length": {
          "name" : "length",
          "type" : vx_core.t_string,
          "multi": false
        },
        "width": {
          "name" : "width",
          "type" : vx_core.t_string,
          "multi": false
        },
        "damagelist": {
          "name" : "damagelist",
          "type" : nx_tactics_base.t_damagelist,
          "multi": false
        },
        "rolemap": {
          "name" : "rolemap",
          "type" : nx_tactics_base.t_rolemap,
          "multi": false
        },
        "unitpowermap": {
          "name" : "unitpowermap",
          "type" : nx_tactics_base.t_unitpowermap,
          "multi": false
        },
        "unitskillmap": {
          "name" : "unitskillmap",
          "type" : nx_tactics_base.t_unitskillmap,
          "multi": false
        },
        "unitweaknessmap": {
          "name" : "unitweaknessmap",
          "type" : nx_tactics_base.t_unitweaknessmap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "unitweaknessmap",
        "type" : nx_tactics_base.t_unitweaknessmap,
        "multi": false
      }
    }
    nx_tactics_base.e_unit['vx_type'] = nx_tactics_base.t_unit
    nx_tactics_base.e_unit['vx_value'] = {}

    // (type unitability)
    nx_tactics_base.t_unitability['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitability['vx_value'] = {
      name          : "unitability",
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
    nx_tactics_base.e_unitability['vx_type'] = nx_tactics_base.t_unitability
    nx_tactics_base.e_unitability['vx_value'] = {}

    // (type unitabilitymap)
    nx_tactics_base.t_unitabilitymap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitabilitymap['vx_value'] = {
      name          : "unitabilitymap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_unitability],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_unitabilitymap['vx_type'] = nx_tactics_base.t_unitabilitymap
    nx_tactics_base.e_unitabilitymap['vx_value'] = {}

    // (type unititem)
    nx_tactics_base.t_unititem['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unititem['vx_value'] = {
      name          : "unititem",
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
    nx_tactics_base.e_unititem['vx_type'] = nx_tactics_base.t_unititem
    nx_tactics_base.e_unititem['vx_value'] = {}

    // (type unititemmap)
    nx_tactics_base.t_unititemmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unititemmap['vx_value'] = {
      name          : "unititemmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_unititem],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_unititemmap['vx_type'] = nx_tactics_base.t_unititemmap
    nx_tactics_base.e_unititemmap['vx_value'] = {}

    // (type unitmap)
    nx_tactics_base.t_unitmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitmap['vx_value'] = {
      name          : "unitmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
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
    nx_tactics_base.e_unitmap['vx_type'] = nx_tactics_base.t_unitmap
    nx_tactics_base.e_unitmap['vx_value'] = {}

    // (type unitpower)
    nx_tactics_base.t_unitpower['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitpower['vx_value'] = {
      name          : "unitpower",
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
        "level": {
          "name" : "level",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "power": {
          "name" : "power",
          "type" : nx_tactics_base.t_power,
          "multi": false
        },
        "abilitymap": {
          "name" : "abilitymap",
          "type" : nx_tactics_base.t_unitabilitymap,
          "multi": false
        },
        "itemmap": {
          "name" : "itemmap",
          "type" : nx_tactics_base.t_unititemmap,
          "multi": false
        },
        "specialtymap": {
          "name" : "specialtymap",
          "type" : nx_tactics_base.t_unitspecialtymap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "specialtymap",
        "type" : nx_tactics_base.t_unitspecialtymap,
        "multi": false
      }
    }
    nx_tactics_base.e_unitpower['vx_type'] = nx_tactics_base.t_unitpower
    nx_tactics_base.e_unitpower['vx_value'] = {}

    // (type unitpowermap)
    nx_tactics_base.t_unitpowermap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitpowermap['vx_value'] = {
      name          : "unitpowermap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_unitpower],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_unitpowermap['vx_type'] = nx_tactics_base.t_unitpowermap
    nx_tactics_base.e_unitpowermap['vx_value'] = {}

    // (type unitskill)
    nx_tactics_base.t_unitskill['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitskill['vx_value'] = {
      name          : "unitskill",
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
        "level": {
          "name" : "level",
          "type" : nx_tactics_base.t_rating,
          "multi": false
        },
        "skill": {
          "name" : "skill",
          "type" : nx_tactics_base.t_skill,
          "multi": false
        },
        "unitabilitymap": {
          "name" : "unitabilitymap",
          "type" : nx_tactics_base.t_unitabilitymap,
          "multi": false
        },
        "unititemmap": {
          "name" : "unititemmap",
          "type" : nx_tactics_base.t_unititemmap,
          "multi": false
        },
        "unitspecialtymap": {
          "name" : "unitspecialtymap",
          "type" : nx_tactics_base.t_unitspecialtymap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "unitspecialtymap",
        "type" : nx_tactics_base.t_unitspecialtymap,
        "multi": false
      }
    }
    nx_tactics_base.e_unitskill['vx_type'] = nx_tactics_base.t_unitskill
    nx_tactics_base.e_unitskill['vx_value'] = {}

    // (type unitskillmap)
    nx_tactics_base.t_unitskillmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitskillmap['vx_value'] = {
      name          : "unitskillmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_unitskill],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_unitskillmap['vx_type'] = nx_tactics_base.t_unitskillmap
    nx_tactics_base.e_unitskillmap['vx_value'] = {}

    // (type unitspecialty)
    nx_tactics_base.t_unitspecialty['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitspecialty['vx_value'] = {
      name          : "unitspecialty",
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
    nx_tactics_base.e_unitspecialty['vx_type'] = nx_tactics_base.t_unitspecialty
    nx_tactics_base.e_unitspecialty['vx_value'] = {}

    // (type unitspecialtymap)
    nx_tactics_base.t_unitspecialtymap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitspecialtymap['vx_value'] = {
      name          : "unitspecialtymap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_unitspecialty],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_unitspecialtymap['vx_type'] = nx_tactics_base.t_unitspecialtymap
    nx_tactics_base.e_unitspecialtymap['vx_value'] = {}

    // (type unitweakness)
    nx_tactics_base.t_unitweakness['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitweakness['vx_value'] = {
      name          : "unitweakness",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
    nx_tactics_base.e_unitweakness['vx_type'] = nx_tactics_base.t_unitweakness
    nx_tactics_base.e_unitweakness['vx_value'] = {}

    // (type unitweaknessmap)
    nx_tactics_base.t_unitweaknessmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitweaknessmap['vx_value'] = {
      name          : "unitweaknessmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_unitweakness],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_unitweaknessmap['vx_type'] = nx_tactics_base.t_unitweaknessmap
    nx_tactics_base.e_unitweaknessmap['vx_value'] = {}

    // (type weakness)
    nx_tactics_base.t_weakness['vx_type'] = vx_core.t_type
    nx_tactics_base.t_weakness['vx_value'] = {
      name          : "weakness",
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
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
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
    nx_tactics_base.e_weakness['vx_type'] = nx_tactics_base.t_weakness
    nx_tactics_base.e_weakness['vx_value'] = {}

    // (type weaknessmap)
    nx_tactics_base.t_weaknessmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_weaknessmap['vx_value'] = {
      name          : "weaknessmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_weakness],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_weaknessmap['vx_type'] = nx_tactics_base.t_weaknessmap
    nx_tactics_base.e_weaknessmap['vx_value'] = {}

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

    // (const stat-beast)
    Object.assign(nx_tactics_base.c_stat_beast, {
      
    })

    // (const stat-body)
    Object.assign(nx_tactics_base.c_stat_body, {
      
    })

    // (const stat-mind)
    Object.assign(nx_tactics_base.c_stat_mind, {
      
    })

    // (const stat-shadow)
    Object.assign(nx_tactics_base.c_stat_shadow, {
      
    })

    // (const stat-speed)
    Object.assign(nx_tactics_base.c_stat_speed, {
      
    })

    // (const stat-will)
    Object.assign(nx_tactics_base.c_stat_will, {
      
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
