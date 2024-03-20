'strict mode'

import vx_core from "../../vx/core.js"
import vx_collection from "../../vx/collection.js"


export default class nx_tactics_base {


  /**
   * type: ability
   */
  static t_ability = {}
  static e_ability = {vx_type: nx_tactics_base.t_ability}

  /**
   * type: abilitymap
   */
  static t_abilitymap = {}
  static e_abilitymap = {vx_type: nx_tactics_base.t_abilitymap}

  /**
   * type: book
   */
  static t_book = {}
  static e_book = {vx_type: nx_tactics_base.t_book}

  /**
   * type: booklist
   */
  static t_booklist = {}
  static e_booklist = vx_core.vx_new_list(nx_tactics_base.t_booklist, [])

  /**
   * type: bookmap
   */
  static t_bookmap = {}
  static e_bookmap = {vx_type: nx_tactics_base.t_bookmap}

  /**
   * type: card
   */
  static t_card = {}
  static e_card = {vx_type: nx_tactics_base.t_card}

  /**
   * type: cardlist
   */
  static t_cardlist = {}
  static e_cardlist = vx_core.vx_new_list(nx_tactics_base.t_cardlist, [])

  /**
   * type: cardmap
   */
  static t_cardmap = {}
  static e_cardmap = {vx_type: nx_tactics_base.t_cardmap}

  /**
   * type: chapter
   */
  static t_chapter = {}
  static e_chapter = {vx_type: nx_tactics_base.t_chapter}

  /**
   * type: chapterlist
   */
  static t_chapterlist = {}
  static e_chapterlist = vx_core.vx_new_list(nx_tactics_base.t_chapterlist, [])

  /**
   * type: chapterlistlist
   */
  static t_chapterlistlist = {}
  static e_chapterlistlist = vx_core.vx_new_list(nx_tactics_base.t_chapterlistlist, [])

  /**
   * type: chaptermap
   */
  static t_chaptermap = {}
  static e_chaptermap = {vx_type: nx_tactics_base.t_chaptermap}

  /**
   * type: damage
   */
  static t_damage = {}
  static e_damage = {vx_type: nx_tactics_base.t_damage}

  /**
   * type: damagelist
   */
  static t_damagelist = {}
  static e_damagelist = vx_core.vx_new_list(nx_tactics_base.t_damagelist, [])

  /**
   * type: damagemap
   */
  static t_damagemap = {}
  static e_damagemap = {vx_type: nx_tactics_base.t_damagemap}

  /**
   * type: deck
   */
  static t_deck = {}
  static e_deck = {vx_type: nx_tactics_base.t_deck}

  /**
   * type: deckmap
   */
  static t_deckmap = {}
  static e_deckmap = {vx_type: nx_tactics_base.t_deckmap}

  /**
   * type: disorder
   * Lasting Mind Damage
   */
  static t_disorder = {}
  static e_disorder = {vx_type: nx_tactics_base.t_disorder}

  /**
   * type: fate
   */
  static t_fate = {}
  static e_fate = {vx_type: nx_tactics_base.t_fate}

  /**
   * type: goal
   */
  static t_goal = {}
  static e_goal = {vx_type: nx_tactics_base.t_goal}

  /**
   * type: imagecard
   */
  static t_imagecard = {}
  static e_imagecard = {vx_type: nx_tactics_base.t_imagecard}

  /**
   * type: item
   */
  static t_item = {}
  static e_item = {vx_type: nx_tactics_base.t_item}

  /**
   * type: itemmap
   */
  static t_itemmap = {}
  static e_itemmap = {vx_type: nx_tactics_base.t_itemmap}

  /**
   * type: location
   */
  static t_location = {}
  static e_location = {vx_type: nx_tactics_base.t_location}

  /**
   * type: locationmap
   */
  static t_locationmap = {}
  static e_locationmap = {vx_type: nx_tactics_base.t_locationmap}

  /**
   * type: mind
   * The ability to use rational thought to do tasks. This is the opposite of the [Shadow].
   */
  static t_mind = {}
  static e_mind = {vx_type: nx_tactics_base.t_mind}

  /**
   * type: modifier
   */
  static t_modifier = {}
  static e_modifier = {vx_type: nx_tactics_base.t_modifier}

  /**
   * type: modifiermap
   */
  static t_modifiermap = {}
  static e_modifiermap = {vx_type: nx_tactics_base.t_modifiermap}

  /**
   * type: playingcard
   */
  static t_playingcard = {}
  static e_playingcard = {vx_type: nx_tactics_base.t_playingcard}

  /**
   * type: power
   */
  static t_power = {}
  static e_power = {vx_type: nx_tactics_base.t_power}

  /**
   * type: powermap
   */
  static t_powermap = {}
  static e_powermap = {vx_type: nx_tactics_base.t_powermap}

  /**
   * type: rank
   */
  static t_rank = {}
  static e_rank = {vx_type: nx_tactics_base.t_rank}

  /**
   * type: ranksuit
   */
  static t_ranksuit = {}
  static e_ranksuit = {vx_type: nx_tactics_base.t_ranksuit}

  /**
   * type: rating
   * Rating are displayed as level.part:scale.
   */
  static t_rating = {}
  static e_rating = {vx_type: nx_tactics_base.t_rating}

  /**
   * type: role
   */
  static t_role = {}
  static e_role = {vx_type: nx_tactics_base.t_role}

  /**
   * type: rolemap
   */
  static t_rolemap = {}
  static e_rolemap = {vx_type: nx_tactics_base.t_rolemap}

  /**
   * type: rule
   */
  static t_rule = {}
  static e_rule = {vx_type: nx_tactics_base.t_rule}

  /**
   * type: rulemap
   */
  static t_rulemap = {}
  static e_rulemap = {vx_type: nx_tactics_base.t_rulemap}

  /**
   * type: scenario
   */
  static t_scenario = {}
  static e_scenario = {vx_type: nx_tactics_base.t_scenario}

  /**
   * type: scenariomap
   */
  static t_scenariomap = {}
  static e_scenariomap = {vx_type: nx_tactics_base.t_scenariomap}

  /**
   * type: section
   */
  static t_section = {}
  static e_section = {vx_type: nx_tactics_base.t_section}

  /**
   * type: sectionlist
   */
  static t_sectionlist = {}
  static e_sectionlist = vx_core.vx_new_list(nx_tactics_base.t_sectionlist, [])

  /**
   * type: sectionlistlist
   */
  static t_sectionlistlist = {}
  static e_sectionlistlist = vx_core.vx_new_list(nx_tactics_base.t_sectionlistlist, [])

  /**
   * type: sectionmap
   */
  static t_sectionmap = {}
  static e_sectionmap = {vx_type: nx_tactics_base.t_sectionmap}

  /**
   * type: skill
   */
  static t_skill = {}
  static e_skill = {vx_type: nx_tactics_base.t_skill}

  /**
   * type: skilllist
   */
  static t_skilllist = {}
  static e_skilllist = vx_core.vx_new_list(nx_tactics_base.t_skilllist, [])

  /**
   * type: skilllistlist
   */
  static t_skilllistlist = {}
  static e_skilllistlist = vx_core.vx_new_list(nx_tactics_base.t_skilllistlist, [])

  /**
   * type: skillmap
   */
  static t_skillmap = {}
  static e_skillmap = {vx_type: nx_tactics_base.t_skillmap}

  /**
   * type: specialty
   */
  static t_specialty = {}
  static e_specialty = {vx_type: nx_tactics_base.t_specialty}

  /**
   * type: specialtymap
   */
  static t_specialtymap = {}
  static e_specialtymap = {vx_type: nx_tactics_base.t_specialtymap}

  /**
   * type: stat
   */
  static t_stat = {}
  static e_stat = {vx_type: nx_tactics_base.t_stat}

  /**
   * type: suit
   */
  static t_suit = {}
  static e_suit = {vx_type: nx_tactics_base.t_suit}

  /**
   * type: suitmap
   */
  static t_suitmap = {}
  static e_suitmap = {vx_type: nx_tactics_base.t_suitmap}

  /**
   * type: tactics
   */
  static t_tactics = {}
  static e_tactics = {vx_type: nx_tactics_base.t_tactics}

  /**
   * type: tarot
   */
  static t_tarot = {}
  static e_tarot = {vx_type: nx_tactics_base.t_tarot}

  /**
   * type: team
   */
  static t_team = {}
  static e_team = {vx_type: nx_tactics_base.t_team}

  /**
   * type: teammap
   */
  static t_teammap = {}
  static e_teammap = {vx_type: nx_tactics_base.t_teammap}

  /**
   * type: terrain
   */
  static t_terrain = {}
  static e_terrain = {vx_type: nx_tactics_base.t_terrain}

  /**
   * type: terrainmap
   */
  static t_terrainmap = {}
  static e_terrainmap = {vx_type: nx_tactics_base.t_terrainmap}

  /**
   * type: threat
   */
  static t_threat = {}
  static e_threat = {vx_type: nx_tactics_base.t_threat}

  /**
   * type: trauma
   * Lasting Will Damage
   */
  static t_trauma = {}
  static e_trauma = {vx_type: nx_tactics_base.t_trauma}

  /**
   * type: unit
   */
  static t_unit = {}
  static e_unit = {vx_type: nx_tactics_base.t_unit}

  /**
   * type: unitability
   */
  static t_unitability = {}
  static e_unitability = {vx_type: nx_tactics_base.t_unitability}

  /**
   * type: unitabilitymap
   */
  static t_unitabilitymap = {}
  static e_unitabilitymap = {vx_type: nx_tactics_base.t_unitabilitymap}

  /**
   * type: unititem
   */
  static t_unititem = {}
  static e_unititem = {vx_type: nx_tactics_base.t_unititem}

  /**
   * type: unititemmap
   */
  static t_unititemmap = {}
  static e_unititemmap = {vx_type: nx_tactics_base.t_unititemmap}

  /**
   * type: unitmap
   */
  static t_unitmap = {}
  static e_unitmap = {vx_type: nx_tactics_base.t_unitmap}

  /**
   * type: unitpower
   */
  static t_unitpower = {}
  static e_unitpower = {vx_type: nx_tactics_base.t_unitpower}

  /**
   * type: unitpowermap
   */
  static t_unitpowermap = {}
  static e_unitpowermap = {vx_type: nx_tactics_base.t_unitpowermap}

  /**
   * type: unitskill
   */
  static t_unitskill = {}
  static e_unitskill = {vx_type: nx_tactics_base.t_unitskill}

  /**
   * type: unitskillmap
   */
  static t_unitskillmap = {}
  static e_unitskillmap = {vx_type: nx_tactics_base.t_unitskillmap}

  /**
   * type: unitspecialty
   */
  static t_unitspecialty = {}
  static e_unitspecialty = {vx_type: nx_tactics_base.t_unitspecialty}

  /**
   * type: unitspecialtymap
   */
  static t_unitspecialtymap = {}
  static e_unitspecialtymap = {vx_type: nx_tactics_base.t_unitspecialtymap}

  /**
   * type: unitweakness
   */
  static t_unitweakness = {}
  static e_unitweakness = {vx_type: nx_tactics_base.t_unitweakness}

  /**
   * type: unitweaknessmap
   */
  static t_unitweaknessmap = {}
  static e_unitweaknessmap = {vx_type: nx_tactics_base.t_unitweaknessmap}

  /**
   * type: weakness
   */
  static t_weakness = {}
  static e_weakness = {vx_type: nx_tactics_base.t_weakness}

  /**
   * type: weaknessmap
   */
  static t_weaknessmap = {}
  static e_weaknessmap = {vx_type: nx_tactics_base.t_weaknessmap}

  /**
   * type: wound
   * Lasting Body Damage
   */
  static t_wound = {}
  static e_wound = {vx_type: nx_tactics_base.t_wound}
  /**
   * Constant: rank-ace
   * {rank}
   */
  static c_rank_ace = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-ace'}}

  /**
   * Constant: rank-eight
   * {rank}
   */
  static c_rank_eight = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-eight'}}

  /**
   * Constant: rank-five
   * {rank}
   */
  static c_rank_five = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-five'}}

  /**
   * Constant: rank-four
   * {rank}
   */
  static c_rank_four = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-four'}}

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
   * Constant: rank-nine
   * {rank}
   */
  static c_rank_nine = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-nine'}}

  /**
   * Constant: rank-queen
   * {rank}
   */
  static c_rank_queen = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-queen'}}

  /**
   * Constant: rank-seven
   * {rank}
   */
  static c_rank_seven = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-seven'}}

  /**
   * Constant: rank-six
   * {rank}
   */
  static c_rank_six = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-six'}}

  /**
   * Constant: rank-ten
   * {rank}
   */
  static c_rank_ten = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-ten'}}

  /**
   * Constant: rank-three
   * {rank}
   */
  static c_rank_three = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-three'}}

  /**
   * Constant: rank-two
   * {rank}
   */
  static c_rank_two = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-two'}}

  /**
   * Constant: ranksuit-2c
   * {ranksuit}
   */
  static c_ranksuit_2c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-2c'}}

  /**
   * Constant: ranksuit-2d
   * {ranksuit}
   */
  static c_ranksuit_2d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-2d'}}

  /**
   * Constant: ranksuit-2h
   * {ranksuit}
   */
  static c_ranksuit_2h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-2h'}}

  /**
   * Constant: ranksuit-2s
   * {ranksuit}
   */
  static c_ranksuit_2s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-2s'}}

  /**
   * Constant: ranksuit-3c
   * {ranksuit}
   */
  static c_ranksuit_3c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-3c'}}

  /**
   * Constant: ranksuit-3d
   * {ranksuit}
   */
  static c_ranksuit_3d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-3d'}}

  /**
   * Constant: ranksuit-3h
   * {ranksuit}
   */
  static c_ranksuit_3h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-3h'}}

  /**
   * Constant: ranksuit-3s
   * {ranksuit}
   */
  static c_ranksuit_3s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-3s'}}

  /**
   * Constant: ranksuit-4c
   * {ranksuit}
   */
  static c_ranksuit_4c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-4c'}}

  /**
   * Constant: ranksuit-4d
   * {ranksuit}
   */
  static c_ranksuit_4d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-4d'}}

  /**
   * Constant: ranksuit-4h
   * {ranksuit}
   */
  static c_ranksuit_4h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-4h'}}

  /**
   * Constant: ranksuit-4s
   * {ranksuit}
   */
  static c_ranksuit_4s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-4s'}}

  /**
   * Constant: ranksuit-5c
   * {ranksuit}
   */
  static c_ranksuit_5c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-5c'}}

  /**
   * Constant: ranksuit-5d
   * {ranksuit}
   */
  static c_ranksuit_5d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-5d'}}

  /**
   * Constant: ranksuit-5h
   * {ranksuit}
   */
  static c_ranksuit_5h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-5h'}}

  /**
   * Constant: ranksuit-5s
   * {ranksuit}
   */
  static c_ranksuit_5s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-5s'}}

  /**
   * Constant: ranksuit-6c
   * {ranksuit}
   */
  static c_ranksuit_6c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-6c'}}

  /**
   * Constant: ranksuit-6d
   * {ranksuit}
   */
  static c_ranksuit_6d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-6d'}}

  /**
   * Constant: ranksuit-6h
   * {ranksuit}
   */
  static c_ranksuit_6h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-6h'}}

  /**
   * Constant: ranksuit-6s
   * {ranksuit}
   */
  static c_ranksuit_6s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-6s'}}

  /**
   * Constant: ranksuit-7c
   * {ranksuit}
   */
  static c_ranksuit_7c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-7c'}}

  /**
   * Constant: ranksuit-7d
   * {ranksuit}
   */
  static c_ranksuit_7d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-7d'}}

  /**
   * Constant: ranksuit-7h
   * {ranksuit}
   */
  static c_ranksuit_7h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-7h'}}

  /**
   * Constant: ranksuit-7s
   * {ranksuit}
   */
  static c_ranksuit_7s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-7s'}}

  /**
   * Constant: ranksuit-8c
   * {ranksuit}
   */
  static c_ranksuit_8c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-8c'}}

  /**
   * Constant: ranksuit-8d
   * {ranksuit}
   */
  static c_ranksuit_8d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-8d'}}

  /**
   * Constant: ranksuit-8h
   * {ranksuit}
   */
  static c_ranksuit_8h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-8h'}}

  /**
   * Constant: ranksuit-8s
   * {ranksuit}
   */
  static c_ranksuit_8s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-8s'}}

  /**
   * Constant: ranksuit-9c
   * {ranksuit}
   */
  static c_ranksuit_9c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-9c'}}

  /**
   * Constant: ranksuit-9d
   * {ranksuit}
   */
  static c_ranksuit_9d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-9d'}}

  /**
   * Constant: ranksuit-9h
   * {ranksuit}
   */
  static c_ranksuit_9h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-9h'}}

  /**
   * Constant: ranksuit-9s
   * {ranksuit}
   */
  static c_ranksuit_9s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-9s'}}

  /**
   * Constant: ranksuit-ac
   * {ranksuit}
   */
  static c_ranksuit_ac = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ac'}}

  /**
   * Constant: ranksuit-ad
   * {ranksuit}
   */
  static c_ranksuit_ad = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ad'}}

  /**
   * Constant: ranksuit-ah
   * {ranksuit}
   */
  static c_ranksuit_ah = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ah'}}

  /**
   * Constant: ranksuit-as
   * {ranksuit}
   */
  static c_ranksuit_as = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-as'}}

  /**
   * Constant: ranksuit-jc
   * {ranksuit}
   */
  static c_ranksuit_jc = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jc'}}

  /**
   * Constant: ranksuit-jd
   * {ranksuit}
   */
  static c_ranksuit_jd = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jd'}}

  /**
   * Constant: ranksuit-jh
   * {ranksuit}
   */
  static c_ranksuit_jh = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jh'}}

  /**
   * Constant: ranksuit-jokerblack
   * {ranksuit}
   */
  static c_ranksuit_jokerblack = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jokerblack'}}

  /**
   * Constant: ranksuit-jokerred
   * {ranksuit}
   */
  static c_ranksuit_jokerred = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jokerred'}}

  /**
   * Constant: ranksuit-js
   * {ranksuit}
   */
  static c_ranksuit_js = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-js'}}

  /**
   * Constant: ranksuit-kc
   * {ranksuit}
   */
  static c_ranksuit_kc = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-kc'}}

  /**
   * Constant: ranksuit-kd
   * {ranksuit}
   */
  static c_ranksuit_kd = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-kd'}}

  /**
   * Constant: ranksuit-kh
   * {ranksuit}
   */
  static c_ranksuit_kh = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-kh'}}

  /**
   * Constant: ranksuit-ks
   * {ranksuit}
   */
  static c_ranksuit_ks = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ks'}}

  /**
   * Constant: ranksuit-qc
   * {ranksuit}
   */
  static c_ranksuit_qc = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-qc'}}

  /**
   * Constant: ranksuit-qd
   * {ranksuit}
   */
  static c_ranksuit_qd = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-qd'}}

  /**
   * Constant: ranksuit-qh
   * {ranksuit}
   */
  static c_ranksuit_qh = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-qh'}}

  /**
   * Constant: ranksuit-qs
   * {ranksuit}
   */
  static c_ranksuit_qs = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-qs'}}

  /**
   * Constant: ranksuit-tc
   * {ranksuit}
   */
  static c_ranksuit_tc = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-tc'}}

  /**
   * Constant: ranksuit-td
   * {ranksuit}
   */
  static c_ranksuit_td = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-td'}}

  /**
   * Constant: ranksuit-th
   * {ranksuit}
   */
  static c_ranksuit_th = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-th'}}

  /**
   * Constant: ranksuit-ts
   * {ranksuit}
   */
  static c_ranksuit_ts = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ts'}}

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
   * Constant: suit-black
   * {suit}
   */
  static c_suit_black = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-black'}}

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
   * Constant: suit-red
   * {suit}
   */
  static c_suit_red = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-red'}}

  /**
   * Constant: suit-spade
   * {suit}
   */
  static c_suit_spade = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-spade'}}

  /**
   * @function bookmap_from_booklist
   * Returns a bookmap of all books.
   * @param  {booklist} booklist
   * @return {bookmap}
   */
  static t_bookmap_from_booklist = {
    vx_type: vx_core.t_type
  }
  static e_bookmap_from_booklist = {
    vx_type: nx_tactics_base.t_bookmap_from_booklist
  }

  // (func bookmap<-booklist)
  static f_bookmap_from_booklist(booklist) {
    let output = nx_tactics_base.e_bookmap
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_book, "any-2": nx_tactics_base.t_book, "list-2": nx_tactics_base.t_booklist, "map-1": nx_tactics_base.t_bookmap, "struct-2": nx_tactics_base.t_book},
      booklist,
      vx_core.f_new(vx_core.t_any_from_any, (book) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_book}, book, ":name"))
    )
    return output
  }

  /**
   * @function cardmap_from_bookmap
   * Returns a cardmap from a given bookmap
   * @param  {bookmap} bookmap
   * @return {cardmap}
   */
  static t_cardmap_from_bookmap = {
    vx_type: vx_core.t_type
  }
  static e_cardmap_from_bookmap = {
    vx_type: nx_tactics_base.t_cardmap_from_bookmap
  }

  // (func cardmap<-bookmap)
  static f_cardmap_from_bookmap(bookmap) {
    let output = nx_tactics_base.e_cardmap
    output = vx_core.f_map_from_map_1(
      {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_book, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_bookmap},
      bookmap,
      vx_core.f_new(vx_core.t_any_from_key_value, ([key, value]) => 
        vx_core.f_any_from_any({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_book}, value))
    )
    return output
  }

  /**
   * @function cardmap_from_cardlist
   * @param  {cardlist} cardlist
   * @return {cardmap}
   */
  static t_cardmap_from_cardlist = {
    vx_type: vx_core.t_type
  }
  static e_cardmap_from_cardlist = {
    vx_type: nx_tactics_base.t_cardmap_from_cardlist
  }

  // (func cardmap<-cardlist)
  static f_cardmap_from_cardlist(cardlist) {
    let output = nx_tactics_base.e_cardmap
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_card, "list-2": nx_tactics_base.t_cardlist, "map-1": nx_tactics_base.t_cardmap, "struct-2": nx_tactics_base.t_card},
      cardlist,
      vx_core.f_new(vx_core.t_any_from_any, (card) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":name"))
    )
    return output
  }

  /**
   * @function chapterlist_from_book
   * Returns a chapterlist from a given book
   * @param  {book} book
   * @return {chapterlist}
   */
  static t_chapterlist_from_book = {
    vx_type: vx_core.t_type
  }
  static e_chapterlist_from_book = {
    vx_type: nx_tactics_base.t_chapterlist_from_book
  }

  // (func chapterlist<-book)
  static f_chapterlist_from_book(book) {
    let output = nx_tactics_base.e_chapterlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_chapterlist, "any-2": nx_tactics_base.t_chapter, "list-1": nx_tactics_base.t_chapterlist, "map-2": nx_tactics_base.t_chaptermap},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const chaptermap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_chaptermap, "struct-2": nx_tactics_base.t_book}, book, ":chaptermap")
        return vx_core.f_list_from_map_1(
          {"any-1": nx_tactics_base.t_chapter, "any-2": nx_tactics_base.t_chapter, "list-1": nx_tactics_base.t_chapterlist, "map-2": nx_tactics_base.t_chaptermap},
          chaptermap,
          vx_core.f_new(vx_core.t_any_from_key_value, ([key, value]) => value)
        )
      })
    )
    return output
  }

  /**
   * @function chapterlist_from_booklist
   * Returns a chapterlist from a given bookmap
   * @param  {booklist} booklist
   * @return {chapterlist}
   */
  static t_chapterlist_from_booklist = {
    vx_type: vx_core.t_type
  }
  static e_chapterlist_from_booklist = {
    vx_type: nx_tactics_base.t_chapterlist_from_booklist
  }

  // (func chapterlist<-booklist)
  static f_chapterlist_from_booklist(booklist) {
    let output = nx_tactics_base.e_chapterlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_chapterlist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const chapterlistlist = nx_tactics_base.f_chapterlistlist_from_booklist(booklist)
        return nx_tactics_base.f_chapterlist_from_chapterlistlist(chapterlistlist)
      })
    )
    return output
  }

  /**
   * @function chapterlist_from_chapterlistlist
   * Returns a chapterlist from a given chapterlistlist
   * @param  {chapterlistlist} chapterlistlist
   * @return {chapterlistlist}
   */
  static t_chapterlist_from_chapterlistlist = {
    vx_type: vx_core.t_type
  }
  static e_chapterlist_from_chapterlistlist = {
    vx_type: nx_tactics_base.t_chapterlist_from_chapterlistlist
  }

  // (func chapterlist<-chapterlistlist)
  static f_chapterlist_from_chapterlistlist(chapterlistlist) {
    let output = nx_tactics_base.e_chapterlistlist
    output = vx_core.f_list_join_from_list({"any-1": nx_tactics_base.t_chapter, "any-2": nx_tactics_base.t_chapterlist, "list-1": nx_tactics_base.t_chapterlist, "list-2": nx_tactics_base.t_chapterlistlist}, chapterlistlist)
    return output
  }

  /**
   * @function chapterlistlist_from_booklist
   * Returns a chapterlistlist from a given booklist
   * @param  {booklist} booklist
   * @return {chapterlistlist}
   */
  static t_chapterlistlist_from_booklist = {
    vx_type: vx_core.t_type
  }
  static e_chapterlistlist_from_booklist = {
    vx_type: nx_tactics_base.t_chapterlistlist_from_booklist
  }

  // (func chapterlistlist<-booklist)
  static f_chapterlistlist_from_booklist(booklist) {
    let output = nx_tactics_base.e_chapterlistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_chapterlist, "any-2": nx_tactics_base.t_book, "list-1": nx_tactics_base.t_chapterlistlist, "list-2": nx_tactics_base.t_booklist},
      booklist,
      vx_core.f_new(vx_core.t_any_from_any, (book) => 
        nx_tactics_base.f_chapterlist_from_book(book))
    )
    return output
  }

  /**
   * @function chaptermap_from_chapterlist
   * Returns a chaptermap from a given chapterlist
   * @param  {chapterlist} chapterlist
   * @return {chaptermap}
   */
  static t_chaptermap_from_chapterlist = {
    vx_type: vx_core.t_type
  }
  static e_chaptermap_from_chapterlist = {
    vx_type: nx_tactics_base.t_chaptermap_from_chapterlist
  }

  // (func chaptermap<-chapterlist)
  static f_chaptermap_from_chapterlist(chapterlist) {
    let output = nx_tactics_base.e_chaptermap
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_chapter, "any-2": nx_tactics_base.t_chapter, "list-2": nx_tactics_base.t_chapterlist, "map-1": nx_tactics_base.t_chaptermap, "struct-2": nx_tactics_base.t_chapter},
      chapterlist,
      vx_core.f_new(vx_core.t_any_from_any, (chapter) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_chapter}, chapter, ":name"))
    )
    return output
  }

  /**
   * @function name_from_chapter
   * @param  {chapter} chapter
   * @return {string}
   */
  static t_name_from_chapter = {
    vx_type: vx_core.t_type
  }
  static e_name_from_chapter = {
    vx_type: nx_tactics_base.t_name_from_chapter
  }

  // (func name<-chapter)
  static f_name_from_chapter(chapter) {
    let output = vx_core.e_string
    output = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_chapter}, chapter, ":name")
    return output
  }

  /**
   * @function rating_from_mass
   * Return a rating from a mass.
   * @param  {string} mass
   * @return {rating}
   */
  static t_rating_from_mass = {
    vx_type: vx_core.t_type
  }
  static e_rating_from_mass = {
    vx_type: nx_tactics_base.t_rating_from_mass
  }

  // (func rating<-mass)
  static f_rating_from_mass(mass) {
    let output = nx_tactics_base.e_rating
    return output
  }

  /**
   * @function sectionlist_all_from_chapterlist
   * Returns a list of all sections including subsections
   * @param  {chapterlist} chapterlist
   * @return {sectionlist}
   */
  static t_sectionlist_all_from_chapterlist = {
    vx_type: vx_core.t_type
  }
  static e_sectionlist_all_from_chapterlist = {
    vx_type: nx_tactics_base.t_sectionlist_all_from_chapterlist
  }

  // (func sectionlist-all<-chapterlist)
  static f_sectionlist_all_from_chapterlist(chapterlist) {
    let output = nx_tactics_base.e_sectionlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_sectionlist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const sections = nx_tactics_base.f_sectionlist_from_chapterlist(chapterlist)
        return nx_tactics_base.f_sectionlist_all_from_sectionlist(sections)
      })
    )
    return output
  }

  /**
   * @function sectionlist_all_from_section
   * Returns a list of all sections including subsections
   * @param  {section} section
   * @return {sectionlist}
   */
  static t_sectionlist_all_from_section = {
    vx_type: vx_core.t_type
  }
  static e_sectionlist_all_from_section = {
    vx_type: nx_tactics_base.t_sectionlist_all_from_section
  }

  // (func sectionlist-all<-section)
  static f_sectionlist_all_from_section(section) {
    let output = nx_tactics_base.e_sectionlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_sectionlist, "any-2": nx_tactics_base.t_section, "list-2": nx_tactics_base.t_sectionlist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const subsections = nx_tactics_base.f_sectionlist_from_section(section)
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_sectionlist, "any-2": nx_tactics_base.t_section, "list-2": nx_tactics_base.t_sectionlist},
          subsections,
          vx_core.f_new(
            nx_tactics_base.t_sectionlist,
            section
          ),
          vx_core.f_new(vx_core.t_any_from_reduce, (total, subsection) => 
            vx_core.f_let(
              {"any-1": nx_tactics_base.t_sectionlist},
              [],
              vx_core.f_new(vx_core.t_any_from_func, () => {
                const subsubsections = nx_tactics_base.f_sectionlist_all_from_section(subsection)
                return vx_core.f_copy(total, subsubsections)
              })
            ))
        )
      })
    )
    return output
  }

  /**
   * @function sectionlist_all_from_sectionlist
   * Returns a list of all sections including subsections
   * @param  {sectionlist} sectionlist
   * @return {sectionlist}
   */
  static t_sectionlist_all_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_sectionlist_all_from_sectionlist = {
    vx_type: nx_tactics_base.t_sectionlist_all_from_sectionlist
  }

  // (func sectionlist-all<-sectionlist)
  static f_sectionlist_all_from_sectionlist(sectionlist) {
    let output = nx_tactics_base.e_sectionlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_sectionlist, "any-2": nx_tactics_base.t_sectionlist, "list-1": nx_tactics_base.t_sectionlist, "list-2": nx_tactics_base.t_sectionlistlist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const sectionlistlist = nx_tactics_base.f_sectionlistlist_from_sectionlist(sectionlist)
        return vx_core.f_list_join_from_list({"any-1": nx_tactics_base.t_section, "any-2": nx_tactics_base.t_sectionlist, "list-1": nx_tactics_base.t_sectionlist, "list-2": nx_tactics_base.t_sectionlistlist}, sectionlistlist)
      })
    )
    return output
  }

  /**
   * @function sectionlist_from_chapter
   * Returns a list of all sections directly under the given chapter
   * @param  {chapter} chapter
   * @return {sectionlist}
   */
  static t_sectionlist_from_chapter = {
    vx_type: vx_core.t_type
  }
  static e_sectionlist_from_chapter = {
    vx_type: nx_tactics_base.t_sectionlist_from_chapter
  }

  // (func sectionlist<-chapter)
  static f_sectionlist_from_chapter(chapter) {
    let output = nx_tactics_base.e_sectionlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_sectionlist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const sectionmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_sectionmap, "struct-2": nx_tactics_base.t_chapter}, chapter, ":sectionmap")
        return nx_tactics_base.f_sectionlist_from_sectionmap(sectionmap)
      })
    )
    return output
  }

  /**
   * @function sectionlist_from_chapterlist
   * Returns a list of all sections directly under the given chapterlist
   * @param  {chapterlist} chapterlist
   * @return {sectionlist}
   */
  static t_sectionlist_from_chapterlist = {
    vx_type: vx_core.t_type
  }
  static e_sectionlist_from_chapterlist = {
    vx_type: nx_tactics_base.t_sectionlist_from_chapterlist
  }

  // (func sectionlist<-chapterlist)
  static f_sectionlist_from_chapterlist(chapterlist) {
    let output = nx_tactics_base.e_sectionlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_sectionlist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const sectionlistlist = nx_tactics_base.f_sectionlistlist_from_chapterlist(chapterlist)
        return nx_tactics_base.f_sectionlist_from_sectionlistlist(sectionlistlist)
      })
    )
    return output
  }

  /**
   * @function sectionlist_from_section
   * Returns a list of all sections including subsections
   * @param  {section} section
   * @return {sectionlist}
   */
  static t_sectionlist_from_section = {
    vx_type: vx_core.t_type
  }
  static e_sectionlist_from_section = {
    vx_type: nx_tactics_base.t_sectionlist_from_section
  }

  // (func sectionlist<-section)
  static f_sectionlist_from_section(section) {
    let output = nx_tactics_base.e_sectionlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_sectionlist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const sectionmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_sectionmap, "struct-2": nx_tactics_base.t_section}, section, ":sectionmap")
        return nx_tactics_base.f_sectionlist_from_sectionmap(sectionmap)
      })
    )
    return output
  }

  /**
   * @function sectionlist_from_sectionlistlist
   * Returns a sectionlist from a given sectionlistlist
   * @param  {sectionlistlist} sectionlistlist
   * @return {sectionlist}
   */
  static t_sectionlist_from_sectionlistlist = {
    vx_type: vx_core.t_type
  }
  static e_sectionlist_from_sectionlistlist = {
    vx_type: nx_tactics_base.t_sectionlist_from_sectionlistlist
  }

  // (func sectionlist<-sectionlistlist)
  static f_sectionlist_from_sectionlistlist(sectionlistlist) {
    let output = nx_tactics_base.e_sectionlist
    output = vx_core.f_list_join_from_list({"any-1": nx_tactics_base.t_section, "any-2": nx_tactics_base.t_sectionlist, "list-1": nx_tactics_base.t_sectionlist, "list-2": nx_tactics_base.t_sectionlistlist}, sectionlistlist)
    return output
  }

  /**
   * @function sectionlist_from_sectionmap
   * Returns a list of all sections including subsections
   * @param  {sectionmap} sectionmap
   * @return {sectionlist}
   */
  static t_sectionlist_from_sectionmap = {
    vx_type: vx_core.t_type
  }
  static e_sectionlist_from_sectionmap = {
    vx_type: nx_tactics_base.t_sectionlist_from_sectionmap
  }

  // (func sectionlist<-sectionmap)
  static f_sectionlist_from_sectionmap(sectionmap) {
    let output = nx_tactics_base.e_sectionlist
    output = vx_core.f_list_from_map({"any-1": nx_tactics_base.t_section, "any-2": nx_tactics_base.t_section, "list-1": nx_tactics_base.t_sectionlist, "map-2": nx_tactics_base.t_sectionmap}, sectionmap)
    return output
  }

  /**
   * @function sectionlistlist_from_chapterlist
   * Returns a shallow sectionlistlist from a given chapterlist
   * @param  {chapterlist} chapterlist
   * @return {sectionlistlist}
   */
  static t_sectionlistlist_from_chapterlist = {
    vx_type: vx_core.t_type
  }
  static e_sectionlistlist_from_chapterlist = {
    vx_type: nx_tactics_base.t_sectionlistlist_from_chapterlist
  }

  // (func sectionlistlist<-chapterlist)
  static f_sectionlistlist_from_chapterlist(chapterlist) {
    let output = nx_tactics_base.e_sectionlistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_sectionlist, "any-2": nx_tactics_base.t_chapter, "list-1": nx_tactics_base.t_sectionlistlist, "list-2": nx_tactics_base.t_chapterlist},
      chapterlist,
      vx_core.f_new(vx_core.t_any_from_any, (chapter) => 
        nx_tactics_base.f_sectionlist_from_chapter(chapter))
    )
    return output
  }

  /**
   * @function sectionlistlist_from_sectionlist
   * Returns a shallow sectionlistlist from a given sectionlist
   * @param  {sectionlist} sectionlist
   * @return {sectionlistlist}
   */
  static t_sectionlistlist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_sectionlistlist_from_sectionlist = {
    vx_type: nx_tactics_base.t_sectionlistlist_from_sectionlist
  }

  // (func sectionlistlist<-sectionlist)
  static f_sectionlistlist_from_sectionlist(sectionlist) {
    let output = nx_tactics_base.e_sectionlistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_sectionlist, "any-2": nx_tactics_base.t_section, "list-1": nx_tactics_base.t_sectionlistlist, "list-2": nx_tactics_base.t_sectionlist},
      sectionlist,
      vx_core.f_new(vx_core.t_any_from_any, (section) => 
        vx_core.f_let(
          {"any-1": nx_tactics_base.t_sectionlist},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const sublist = nx_tactics_base.f_sectionlist_from_section(section)
            return vx_core.f_new(
              nx_tactics_base.t_sectionlist,
              section,
              sublist
            )
          })
        ))
    )
    return output
  }

  /**
   * @function sectionmap_from_sectionlist
   * Returns a sectionmap from a given sectionlist
   * @param  {sectionlist} sectionlist
   * @return {sectionmap}
   */
  static t_sectionmap_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_sectionmap_from_sectionlist = {
    vx_type: nx_tactics_base.t_sectionmap_from_sectionlist
  }

  // (func sectionmap<-sectionlist)
  static f_sectionmap_from_sectionlist(sectionlist) {
    let output = nx_tactics_base.e_sectionmap
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_section, "any-2": nx_tactics_base.t_section, "list-2": nx_tactics_base.t_sectionlist, "map-1": nx_tactics_base.t_sectionmap, "struct-2": nx_tactics_base.t_section},
      sectionlist,
      vx_core.f_new(vx_core.t_any_from_any, (section) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, section, ":name"))
    )
    return output
  }

  /**
   * @function skilllist_from_section
   * Returns a skilllist from a given skilllistlist
   * @param  {section} section
   * @return {skilllist}
   */
  static t_skilllist_from_section = {
    vx_type: vx_core.t_type
  }
  static e_skilllist_from_section = {
    vx_type: nx_tactics_base.t_skilllist_from_section
  }

  // (func skilllist<-section)
  static f_skilllist_from_section(section) {
    let output = nx_tactics_base.e_skilllist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_skilllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const secname = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, section, ":name")
        const sec = vx_core.f_copy(section, ":name", secname)
        const skillmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_skillmap, "struct-2": nx_tactics_base.t_section}, section, ":skillmap")
        return nx_tactics_base.f_skilllist_from_skillmap(skillmap)
      })
    )
    return output
  }

  /**
   * @function skilllist_from_sectionlist
   * Returns a skilllist from a given skilllistlist
   * @param  {sectionlist} sectionlist
   * @return {skilllist}
   */
  static t_skilllist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_skilllist_from_sectionlist = {
    vx_type: nx_tactics_base.t_skilllist_from_sectionlist
  }

  // (func skilllist<-sectionlist)
  static f_skilllist_from_sectionlist(sectionlist) {
    let output = nx_tactics_base.e_skilllist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_skilllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const skilllistlist = nx_tactics_base.f_skilllistlist_from_sectionlist(sectionlist)
        return nx_tactics_base.f_skilllist_from_skilllistlist(skilllistlist)
      })
    )
    return output
  }

  /**
   * @function skilllist_from_skilllistlist
   * Returns a skillmap from a given skilllist
   * @param  {skilllistlist} skilllistlist
   * @return {skilllist}
   */
  static t_skilllist_from_skilllistlist = {
    vx_type: vx_core.t_type
  }
  static e_skilllist_from_skilllistlist = {
    vx_type: nx_tactics_base.t_skilllist_from_skilllistlist
  }

  // (func skilllist<-skilllistlist)
  static f_skilllist_from_skilllistlist(skilllistlist) {
    let output = nx_tactics_base.e_skilllist
    output = vx_core.f_list_join_from_list({"any-1": nx_tactics_base.t_skill, "any-2": nx_tactics_base.t_skilllist, "list-1": nx_tactics_base.t_skilllist, "list-2": nx_tactics_base.t_skilllistlist}, skilllistlist)
    return output
  }

  /**
   * @function skilllist_from_skillmap
   * Returns a skillmap from a given skilllist
   * @param  {skillmap} skillmap
   * @return {skilllist}
   */
  static t_skilllist_from_skillmap = {
    vx_type: vx_core.t_type
  }
  static e_skilllist_from_skillmap = {
    vx_type: nx_tactics_base.t_skilllist_from_skillmap
  }

  // (func skilllist<-skillmap)
  static f_skilllist_from_skillmap(skillmap) {
    let output = nx_tactics_base.e_skilllist
    output = vx_core.f_list_from_map({"any-1": nx_tactics_base.t_skill, "any-2": nx_tactics_base.t_skill, "list-1": nx_tactics_base.t_skilllist, "map-2": nx_tactics_base.t_skillmap}, skillmap)
    return output
  }

  /**
   * @function skilllistlist_from_sectionlist
   * Returns a skilllistlist from a given sectionlist
   * @param  {sectionlist} sections
   * @return {skilllistlist}
   */
  static t_skilllistlist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_skilllistlist_from_sectionlist = {
    vx_type: nx_tactics_base.t_skilllistlist_from_sectionlist
  }

  // (func skilllistlist<-sectionlist)
  static f_skilllistlist_from_sectionlist(sections) {
    let output = nx_tactics_base.e_skilllistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_skilllist, "any-2": nx_tactics_base.t_section, "list-1": nx_tactics_base.t_skilllistlist, "list-2": nx_tactics_base.t_sectionlist},
      sections,
      vx_core.f_new(vx_core.t_any_from_any, (section) => 
        nx_tactics_base.f_skilllist_from_section(section))
    )
    return output
  }

  /**
   * @function skillmap_from_skilllist
   * Returns a skillmap from a given skilllist
   * @param  {skilllist} skilllist
   * @return {skillmap}
   */
  static t_skillmap_from_skilllist = {
    vx_type: vx_core.t_type
  }
  static e_skillmap_from_skilllist = {
    vx_type: nx_tactics_base.t_skillmap_from_skilllist
  }

  // (func skillmap<-skilllist)
  static f_skillmap_from_skilllist(skilllist) {
    let output = nx_tactics_base.e_skillmap
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_skill, "any-2": nx_tactics_base.t_skill, "list-2": nx_tactics_base.t_skilllist, "map-1": nx_tactics_base.t_skillmap, "struct-2": nx_tactics_base.t_skill},
      skilllist,
      vx_core.f_new(vx_core.t_any_from_any, (skill) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_skill}, skill, ":name"))
    )
    return output
  }

  /**
   * @function tactics_from_booklist
   * Return a ready tactics from a bookmap.
   * @param  {booklist} booklist
   * @return {tactics}
   */
  static t_tactics_from_booklist = {
    vx_type: vx_core.t_type
  }
  static e_tactics_from_booklist = {
    vx_type: nx_tactics_base.t_tactics_from_booklist
  }

  // (func tactics<-booklist)
  static f_tactics_from_booklist(booklist) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const bookmap = nx_tactics_base.f_bookmap_from_booklist(booklist)
        const chapterlist = nx_tactics_base.f_chapterlist_from_booklist(booklist)
        const chaptermap = nx_tactics_base.f_chaptermap_from_chapterlist(chapterlist)
        const sectionlist = nx_tactics_base.f_sectionlist_all_from_chapterlist(chapterlist)
        const sectionmap = nx_tactics_base.f_sectionmap_from_sectionlist(sectionlist)
        const skilllist = nx_tactics_base.f_skilllist_from_sectionlist(sectionlist)
        const skillmap = nx_tactics_base.f_skillmap_from_skilllist(skilllist)
        return vx_core.f_new(
          nx_tactics_base.t_tactics,
          ":bookmap",
          bookmap,
          ":chaptermap",
          chaptermap,
          ":powermap",
          nx_tactics_base.t_powermap,
          ":sectionmap",
          sectionmap,
          ":skillmap",
          skillmap,
          ":unitmap",
          nx_tactics_base.t_unitmap
        )
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "rank-ace": nx_tactics_base.c_rank_ace,
      "rank-eight": nx_tactics_base.c_rank_eight,
      "rank-five": nx_tactics_base.c_rank_five,
      "rank-four": nx_tactics_base.c_rank_four,
      "rank-jack": nx_tactics_base.c_rank_jack,
      "rank-joker": nx_tactics_base.c_rank_joker,
      "rank-king": nx_tactics_base.c_rank_king,
      "rank-nine": nx_tactics_base.c_rank_nine,
      "rank-queen": nx_tactics_base.c_rank_queen,
      "rank-seven": nx_tactics_base.c_rank_seven,
      "rank-six": nx_tactics_base.c_rank_six,
      "rank-ten": nx_tactics_base.c_rank_ten,
      "rank-three": nx_tactics_base.c_rank_three,
      "rank-two": nx_tactics_base.c_rank_two,
      "ranksuit-2c": nx_tactics_base.c_ranksuit_2c,
      "ranksuit-2d": nx_tactics_base.c_ranksuit_2d,
      "ranksuit-2h": nx_tactics_base.c_ranksuit_2h,
      "ranksuit-2s": nx_tactics_base.c_ranksuit_2s,
      "ranksuit-3c": nx_tactics_base.c_ranksuit_3c,
      "ranksuit-3d": nx_tactics_base.c_ranksuit_3d,
      "ranksuit-3h": nx_tactics_base.c_ranksuit_3h,
      "ranksuit-3s": nx_tactics_base.c_ranksuit_3s,
      "ranksuit-4c": nx_tactics_base.c_ranksuit_4c,
      "ranksuit-4d": nx_tactics_base.c_ranksuit_4d,
      "ranksuit-4h": nx_tactics_base.c_ranksuit_4h,
      "ranksuit-4s": nx_tactics_base.c_ranksuit_4s,
      "ranksuit-5c": nx_tactics_base.c_ranksuit_5c,
      "ranksuit-5d": nx_tactics_base.c_ranksuit_5d,
      "ranksuit-5h": nx_tactics_base.c_ranksuit_5h,
      "ranksuit-5s": nx_tactics_base.c_ranksuit_5s,
      "ranksuit-6c": nx_tactics_base.c_ranksuit_6c,
      "ranksuit-6d": nx_tactics_base.c_ranksuit_6d,
      "ranksuit-6h": nx_tactics_base.c_ranksuit_6h,
      "ranksuit-6s": nx_tactics_base.c_ranksuit_6s,
      "ranksuit-7c": nx_tactics_base.c_ranksuit_7c,
      "ranksuit-7d": nx_tactics_base.c_ranksuit_7d,
      "ranksuit-7h": nx_tactics_base.c_ranksuit_7h,
      "ranksuit-7s": nx_tactics_base.c_ranksuit_7s,
      "ranksuit-8c": nx_tactics_base.c_ranksuit_8c,
      "ranksuit-8d": nx_tactics_base.c_ranksuit_8d,
      "ranksuit-8h": nx_tactics_base.c_ranksuit_8h,
      "ranksuit-8s": nx_tactics_base.c_ranksuit_8s,
      "ranksuit-9c": nx_tactics_base.c_ranksuit_9c,
      "ranksuit-9d": nx_tactics_base.c_ranksuit_9d,
      "ranksuit-9h": nx_tactics_base.c_ranksuit_9h,
      "ranksuit-9s": nx_tactics_base.c_ranksuit_9s,
      "ranksuit-ac": nx_tactics_base.c_ranksuit_ac,
      "ranksuit-ad": nx_tactics_base.c_ranksuit_ad,
      "ranksuit-ah": nx_tactics_base.c_ranksuit_ah,
      "ranksuit-as": nx_tactics_base.c_ranksuit_as,
      "ranksuit-jc": nx_tactics_base.c_ranksuit_jc,
      "ranksuit-jd": nx_tactics_base.c_ranksuit_jd,
      "ranksuit-jh": nx_tactics_base.c_ranksuit_jh,
      "ranksuit-jokerblack": nx_tactics_base.c_ranksuit_jokerblack,
      "ranksuit-jokerred": nx_tactics_base.c_ranksuit_jokerred,
      "ranksuit-js": nx_tactics_base.c_ranksuit_js,
      "ranksuit-kc": nx_tactics_base.c_ranksuit_kc,
      "ranksuit-kd": nx_tactics_base.c_ranksuit_kd,
      "ranksuit-kh": nx_tactics_base.c_ranksuit_kh,
      "ranksuit-ks": nx_tactics_base.c_ranksuit_ks,
      "ranksuit-qc": nx_tactics_base.c_ranksuit_qc,
      "ranksuit-qd": nx_tactics_base.c_ranksuit_qd,
      "ranksuit-qh": nx_tactics_base.c_ranksuit_qh,
      "ranksuit-qs": nx_tactics_base.c_ranksuit_qs,
      "ranksuit-tc": nx_tactics_base.c_ranksuit_tc,
      "ranksuit-td": nx_tactics_base.c_ranksuit_td,
      "ranksuit-th": nx_tactics_base.c_ranksuit_th,
      "ranksuit-ts": nx_tactics_base.c_ranksuit_ts,
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
      "suit-black": nx_tactics_base.c_suit_black,
      "suit-club": nx_tactics_base.c_suit_club,
      "suit-diamond": nx_tactics_base.c_suit_diamond,
      "suit-heart": nx_tactics_base.c_suit_heart,
      "suit-red": nx_tactics_base.c_suit_red,
      "suit-spade": nx_tactics_base.c_suit_spade
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "ability": nx_tactics_base.e_ability,
      "abilitymap": nx_tactics_base.e_abilitymap,
      "book": nx_tactics_base.e_book,
      "booklist": nx_tactics_base.e_booklist,
      "bookmap": nx_tactics_base.e_bookmap,
      "card": nx_tactics_base.e_card,
      "cardlist": nx_tactics_base.e_cardlist,
      "cardmap": nx_tactics_base.e_cardmap,
      "chapter": nx_tactics_base.e_chapter,
      "chapterlist": nx_tactics_base.e_chapterlist,
      "chapterlistlist": nx_tactics_base.e_chapterlistlist,
      "chaptermap": nx_tactics_base.e_chaptermap,
      "damage": nx_tactics_base.e_damage,
      "damagelist": nx_tactics_base.e_damagelist,
      "damagemap": nx_tactics_base.e_damagemap,
      "deck": nx_tactics_base.e_deck,
      "deckmap": nx_tactics_base.e_deckmap,
      "disorder": nx_tactics_base.e_disorder,
      "fate": nx_tactics_base.e_fate,
      "goal": nx_tactics_base.e_goal,
      "imagecard": nx_tactics_base.e_imagecard,
      "item": nx_tactics_base.e_item,
      "itemmap": nx_tactics_base.e_itemmap,
      "location": nx_tactics_base.e_location,
      "locationmap": nx_tactics_base.e_locationmap,
      "mind": nx_tactics_base.e_mind,
      "modifier": nx_tactics_base.e_modifier,
      "modifiermap": nx_tactics_base.e_modifiermap,
      "playingcard": nx_tactics_base.e_playingcard,
      "power": nx_tactics_base.e_power,
      "powermap": nx_tactics_base.e_powermap,
      "rank": nx_tactics_base.e_rank,
      "ranksuit": nx_tactics_base.e_ranksuit,
      "rating": nx_tactics_base.e_rating,
      "role": nx_tactics_base.e_role,
      "rolemap": nx_tactics_base.e_rolemap,
      "rule": nx_tactics_base.e_rule,
      "rulemap": nx_tactics_base.e_rulemap,
      "scenario": nx_tactics_base.e_scenario,
      "scenariomap": nx_tactics_base.e_scenariomap,
      "section": nx_tactics_base.e_section,
      "sectionlist": nx_tactics_base.e_sectionlist,
      "sectionlistlist": nx_tactics_base.e_sectionlistlist,
      "sectionmap": nx_tactics_base.e_sectionmap,
      "skill": nx_tactics_base.e_skill,
      "skilllist": nx_tactics_base.e_skilllist,
      "skilllistlist": nx_tactics_base.e_skilllistlist,
      "skillmap": nx_tactics_base.e_skillmap,
      "specialty": nx_tactics_base.e_specialty,
      "specialtymap": nx_tactics_base.e_specialtymap,
      "stat": nx_tactics_base.e_stat,
      "suit": nx_tactics_base.e_suit,
      "suitmap": nx_tactics_base.e_suitmap,
      "tactics": nx_tactics_base.e_tactics,
      "tarot": nx_tactics_base.e_tarot,
      "team": nx_tactics_base.e_team,
      "teammap": nx_tactics_base.e_teammap,
      "terrain": nx_tactics_base.e_terrain,
      "terrainmap": nx_tactics_base.e_terrainmap,
      "threat": nx_tactics_base.e_threat,
      "trauma": nx_tactics_base.e_trauma,
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
      "wound": nx_tactics_base.e_wound,
      "bookmap<-booklist": nx_tactics_base.e_bookmap_from_booklist,
      "cardmap<-bookmap": nx_tactics_base.e_cardmap_from_bookmap,
      "cardmap<-cardlist": nx_tactics_base.e_cardmap_from_cardlist,
      "chapterlist<-book": nx_tactics_base.e_chapterlist_from_book,
      "chapterlist<-booklist": nx_tactics_base.e_chapterlist_from_booklist,
      "chapterlist<-chapterlistlist": nx_tactics_base.e_chapterlist_from_chapterlistlist,
      "chapterlistlist<-booklist": nx_tactics_base.e_chapterlistlist_from_booklist,
      "chaptermap<-chapterlist": nx_tactics_base.e_chaptermap_from_chapterlist,
      "name<-chapter": nx_tactics_base.e_name_from_chapter,
      "rating<-mass": nx_tactics_base.e_rating_from_mass,
      "sectionlist-all<-chapterlist": nx_tactics_base.e_sectionlist_all_from_chapterlist,
      "sectionlist-all<-section": nx_tactics_base.e_sectionlist_all_from_section,
      "sectionlist-all<-sectionlist": nx_tactics_base.e_sectionlist_all_from_sectionlist,
      "sectionlist<-chapter": nx_tactics_base.e_sectionlist_from_chapter,
      "sectionlist<-chapterlist": nx_tactics_base.e_sectionlist_from_chapterlist,
      "sectionlist<-section": nx_tactics_base.e_sectionlist_from_section,
      "sectionlist<-sectionlistlist": nx_tactics_base.e_sectionlist_from_sectionlistlist,
      "sectionlist<-sectionmap": nx_tactics_base.e_sectionlist_from_sectionmap,
      "sectionlistlist<-chapterlist": nx_tactics_base.e_sectionlistlist_from_chapterlist,
      "sectionlistlist<-sectionlist": nx_tactics_base.e_sectionlistlist_from_sectionlist,
      "sectionmap<-sectionlist": nx_tactics_base.e_sectionmap_from_sectionlist,
      "skilllist<-section": nx_tactics_base.e_skilllist_from_section,
      "skilllist<-sectionlist": nx_tactics_base.e_skilllist_from_sectionlist,
      "skilllist<-skilllistlist": nx_tactics_base.e_skilllist_from_skilllistlist,
      "skilllist<-skillmap": nx_tactics_base.e_skilllist_from_skillmap,
      "skilllistlist<-sectionlist": nx_tactics_base.e_skilllistlist_from_sectionlist,
      "skillmap<-skilllist": nx_tactics_base.e_skillmap_from_skilllist,
      "tactics<-booklist": nx_tactics_base.e_tactics_from_booklist
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "bookmap<-booklist": nx_tactics_base.t_bookmap_from_booklist,
      "cardmap<-bookmap": nx_tactics_base.t_cardmap_from_bookmap,
      "cardmap<-cardlist": nx_tactics_base.t_cardmap_from_cardlist,
      "chapterlist<-book": nx_tactics_base.t_chapterlist_from_book,
      "chapterlist<-booklist": nx_tactics_base.t_chapterlist_from_booklist,
      "chapterlist<-chapterlistlist": nx_tactics_base.t_chapterlist_from_chapterlistlist,
      "chapterlistlist<-booklist": nx_tactics_base.t_chapterlistlist_from_booklist,
      "chaptermap<-chapterlist": nx_tactics_base.t_chaptermap_from_chapterlist,
      "name<-chapter": nx_tactics_base.t_name_from_chapter,
      "rating<-mass": nx_tactics_base.t_rating_from_mass,
      "sectionlist-all<-chapterlist": nx_tactics_base.t_sectionlist_all_from_chapterlist,
      "sectionlist-all<-section": nx_tactics_base.t_sectionlist_all_from_section,
      "sectionlist-all<-sectionlist": nx_tactics_base.t_sectionlist_all_from_sectionlist,
      "sectionlist<-chapter": nx_tactics_base.t_sectionlist_from_chapter,
      "sectionlist<-chapterlist": nx_tactics_base.t_sectionlist_from_chapterlist,
      "sectionlist<-section": nx_tactics_base.t_sectionlist_from_section,
      "sectionlist<-sectionlistlist": nx_tactics_base.t_sectionlist_from_sectionlistlist,
      "sectionlist<-sectionmap": nx_tactics_base.t_sectionlist_from_sectionmap,
      "sectionlistlist<-chapterlist": nx_tactics_base.t_sectionlistlist_from_chapterlist,
      "sectionlistlist<-sectionlist": nx_tactics_base.t_sectionlistlist_from_sectionlist,
      "sectionmap<-sectionlist": nx_tactics_base.t_sectionmap_from_sectionlist,
      "skilllist<-section": nx_tactics_base.t_skilllist_from_section,
      "skilllist<-sectionlist": nx_tactics_base.t_skilllist_from_sectionlist,
      "skilllist<-skilllistlist": nx_tactics_base.t_skilllist_from_skilllistlist,
      "skilllist<-skillmap": nx_tactics_base.t_skilllist_from_skillmap,
      "skilllistlist<-sectionlist": nx_tactics_base.t_skilllistlist_from_sectionlist,
      "skillmap<-skilllist": nx_tactics_base.t_skillmap_from_skilllist,
      "tactics<-booklist": nx_tactics_base.t_tactics_from_booklist
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "ability": nx_tactics_base.t_ability,
      "abilitymap": nx_tactics_base.t_abilitymap,
      "book": nx_tactics_base.t_book,
      "booklist": nx_tactics_base.t_booklist,
      "bookmap": nx_tactics_base.t_bookmap,
      "card": nx_tactics_base.t_card,
      "cardlist": nx_tactics_base.t_cardlist,
      "cardmap": nx_tactics_base.t_cardmap,
      "chapter": nx_tactics_base.t_chapter,
      "chapterlist": nx_tactics_base.t_chapterlist,
      "chapterlistlist": nx_tactics_base.t_chapterlistlist,
      "chaptermap": nx_tactics_base.t_chaptermap,
      "damage": nx_tactics_base.t_damage,
      "damagelist": nx_tactics_base.t_damagelist,
      "damagemap": nx_tactics_base.t_damagemap,
      "deck": nx_tactics_base.t_deck,
      "deckmap": nx_tactics_base.t_deckmap,
      "disorder": nx_tactics_base.t_disorder,
      "fate": nx_tactics_base.t_fate,
      "goal": nx_tactics_base.t_goal,
      "imagecard": nx_tactics_base.t_imagecard,
      "item": nx_tactics_base.t_item,
      "itemmap": nx_tactics_base.t_itemmap,
      "location": nx_tactics_base.t_location,
      "locationmap": nx_tactics_base.t_locationmap,
      "mind": nx_tactics_base.t_mind,
      "modifier": nx_tactics_base.t_modifier,
      "modifiermap": nx_tactics_base.t_modifiermap,
      "playingcard": nx_tactics_base.t_playingcard,
      "power": nx_tactics_base.t_power,
      "powermap": nx_tactics_base.t_powermap,
      "rank": nx_tactics_base.t_rank,
      "ranksuit": nx_tactics_base.t_ranksuit,
      "rating": nx_tactics_base.t_rating,
      "role": nx_tactics_base.t_role,
      "rolemap": nx_tactics_base.t_rolemap,
      "rule": nx_tactics_base.t_rule,
      "rulemap": nx_tactics_base.t_rulemap,
      "scenario": nx_tactics_base.t_scenario,
      "scenariomap": nx_tactics_base.t_scenariomap,
      "section": nx_tactics_base.t_section,
      "sectionlist": nx_tactics_base.t_sectionlist,
      "sectionlistlist": nx_tactics_base.t_sectionlistlist,
      "sectionmap": nx_tactics_base.t_sectionmap,
      "skill": nx_tactics_base.t_skill,
      "skilllist": nx_tactics_base.t_skilllist,
      "skilllistlist": nx_tactics_base.t_skilllistlist,
      "skillmap": nx_tactics_base.t_skillmap,
      "specialty": nx_tactics_base.t_specialty,
      "specialtymap": nx_tactics_base.t_specialtymap,
      "stat": nx_tactics_base.t_stat,
      "suit": nx_tactics_base.t_suit,
      "suitmap": nx_tactics_base.t_suitmap,
      "tactics": nx_tactics_base.t_tactics,
      "tarot": nx_tactics_base.t_tarot,
      "team": nx_tactics_base.t_team,
      "teammap": nx_tactics_base.t_teammap,
      "terrain": nx_tactics_base.t_terrain,
      "terrainmap": nx_tactics_base.t_terrainmap,
      "threat": nx_tactics_base.t_threat,
      "trauma": nx_tactics_base.t_trauma,
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
      "weaknessmap": nx_tactics_base.t_weaknessmap,
      "wound": nx_tactics_base.t_wound
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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

    // (type chapterlistlist)
    nx_tactics_base.t_chapterlistlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_chapterlistlist['vx_value'] = {
      name          : "chapterlistlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_chapterlist],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_chapterlistlist['vx_type'] = nx_tactics_base.t_chapterlistlist

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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_deckmap['vx_type'] = nx_tactics_base.t_deckmap
    nx_tactics_base.e_deckmap['vx_value'] = {}

    // (type disorder)
    nx_tactics_base.t_disorder['vx_type'] = vx_core.t_type
    nx_tactics_base.t_disorder['vx_value'] = {
      name          : "disorder",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_disorder['vx_type'] = nx_tactics_base.t_disorder
    nx_tactics_base.e_disorder['vx_value'] = {}

    // (type fate)
    nx_tactics_base.t_fate['vx_type'] = vx_core.t_type
    nx_tactics_base.t_fate['vx_value'] = {
      name          : "fate",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_fate['vx_type'] = nx_tactics_base.t_fate
    nx_tactics_base.e_fate['vx_value'] = {}

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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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

    // (type imagecard)
    nx_tactics_base.t_imagecard['vx_type'] = vx_core.t_type
    nx_tactics_base.t_imagecard['vx_value'] = {
      name          : "imagecard",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "origcard": {
          "name" : "origcard",
          "type" : nx_tactics_base.t_card,
          "multi": false
        }
      },
      proplast      : {
        "name" : "origcard",
        "type" : nx_tactics_base.t_card,
        "multi": false
      }
    }
    nx_tactics_base.e_imagecard['vx_type'] = nx_tactics_base.t_imagecard
    nx_tactics_base.e_imagecard['vx_value'] = {}

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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "classification": {
          "name" : "classification",
          "type" : vx_core.t_string,
          "multi": false
        },
        "crew": {
          "name" : "crew",
          "type" : vx_core.t_string,
          "multi": false
        },
        "energy": {
          "name" : "energy",
          "type" : vx_core.t_string,
          "multi": false
        },
        "explosive": {
          "name" : "explosive",
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
        "mass": {
          "name" : "mass",
          "type" : vx_core.t_string,
          "multi": false
        },
        "modifiers": {
          "name" : "modifiers",
          "type" : vx_core.t_string,
          "multi": false
        },
        "muzzlevelocity": {
          "name" : "muzzlevelocity",
          "type" : vx_core.t_string,
          "multi": false
        },
        "range": {
          "name" : "range",
          "type" : vx_core.t_string,
          "multi": false
        },
        "rof": {
          "name" : "rof",
          "type" : vx_core.t_string,
          "multi": false
        },
        "rolemap": {
          "name" : "rolemap",
          "type" : nx_tactics_base.t_rolemap,
          "multi": false
        },
        "rounds": {
          "name" : "rounds",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speedair": {
          "name" : "speedair",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speedland": {
          "name" : "speedland",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speedspace": {
          "name" : "speedspace",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speedwater": {
          "name" : "speedwater",
          "type" : vx_core.t_string,
          "multi": false
        },
        "value": {
          "name" : "value",
          "type" : vx_core.t_string,
          "multi": false
        },
        "width": {
          "name" : "width",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "width",
        "type" : vx_core.t_string,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_modifier['vx_type'] = nx_tactics_base.t_modifier
    nx_tactics_base.e_modifier['vx_value'] = {}

    // (type modifiermap)
    nx_tactics_base.t_modifiermap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_modifiermap['vx_value'] = {
      name          : "modifiermap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_modifier],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_modifiermap['vx_type'] = nx_tactics_base.t_modifiermap
    nx_tactics_base.e_modifiermap['vx_value'] = {}

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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "stat": {
          "name" : "stat",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_rank['vx_type'] = nx_tactics_base.t_rank
    nx_tactics_base.e_rank['vx_value'] = {}

    // (type ranksuit)
    nx_tactics_base.t_ranksuit['vx_type'] = vx_core.t_type
    nx_tactics_base.t_ranksuit['vx_value'] = {
      name          : "ranksuit",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_ranksuit['vx_type'] = nx_tactics_base.t_ranksuit
    nx_tactics_base.e_ranksuit['vx_value'] = {}

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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "size": {
          "name" : "size",
          "type" : vx_core.t_int,
          "multi": false
        }
      },
      proplast      : {
        "name" : "size",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "classification": {
          "name" : "classification",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "classification",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "teammap": {
          "name" : "teammap",
          "type" : nx_tactics_base.t_teammap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "teammap",
        "type" : nx_tactics_base.t_teammap,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "damagemap": {
          "name" : "damagemap",
          "type" : nx_tactics_base.t_damagemap,
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
        "modifiermap": {
          "name" : "modifiermap",
          "type" : nx_tactics_base.t_modifiermap,
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
        "terrainmap": {
          "name" : "terrainmap",
          "type" : nx_tactics_base.t_terrainmap,
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

    // (type sectionlistlist)
    nx_tactics_base.t_sectionlistlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_sectionlistlist['vx_value'] = {
      name          : "sectionlistlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_sectionlist],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_sectionlistlist['vx_type'] = nx_tactics_base.t_sectionlistlist

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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "stat": {
          "name" : "stat",
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

    // (type skilllistlist)
    nx_tactics_base.t_skilllistlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_skilllistlist['vx_value'] = {
      name          : "skilllistlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_skilllist],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_skilllistlist['vx_type'] = nx_tactics_base.t_skilllistlist

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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_suitmap['vx_type'] = nx_tactics_base.t_suitmap
    nx_tactics_base.e_suitmap['vx_value'] = {}

    // (type tactics)
    nx_tactics_base.t_tactics['vx_type'] = vx_core.t_type
    nx_tactics_base.t_tactics['vx_value'] = {
      name          : "tactics",
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
        "bookmap": {
          "name" : "bookmap",
          "type" : nx_tactics_base.t_bookmap,
          "multi": false
        },
        "abilitymap": {
          "name" : "abilitymap",
          "type" : nx_tactics_base.t_abilitymap,
          "multi": false
        },
        "cardmap": {
          "name" : "cardmap",
          "type" : nx_tactics_base.t_cardmap,
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
        "skillmap": {
          "name" : "skillmap",
          "type" : nx_tactics_base.t_skillmap,
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
    nx_tactics_base.e_tactics['vx_type'] = nx_tactics_base.t_tactics
    nx_tactics_base.e_tactics['vx_value'] = {}

    // (type tarot)
    nx_tactics_base.t_tarot['vx_type'] = vx_core.t_type
    nx_tactics_base.t_tarot['vx_value'] = {
      name          : "tarot",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_tarot['vx_type'] = nx_tactics_base.t_tarot
    nx_tactics_base.e_tarot['vx_value'] = {}

    // (type team)
    nx_tactics_base.t_team['vx_type'] = vx_core.t_type
    nx_tactics_base.t_team['vx_value'] = {
      name          : "team",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "completevictory": {
          "name" : "completevictory",
          "type" : vx_core.t_string,
          "multi": false
        },
        "deploy": {
          "name" : "deploy",
          "type" : vx_core.t_string,
          "multi": false
        },
        "forces": {
          "name" : "forces",
          "type" : vx_core.t_string,
          "multi": false
        },
        "partialvictory": {
          "name" : "partialvictory",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "partialvictory",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    nx_tactics_base.e_team['vx_type'] = nx_tactics_base.t_team
    nx_tactics_base.e_team['vx_value'] = {}

    // (type teammap)
    nx_tactics_base.t_teammap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_teammap['vx_value'] = {
      name          : "teammap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_team],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_teammap['vx_type'] = nx_tactics_base.t_teammap
    nx_tactics_base.e_teammap['vx_value'] = {}

    // (type terrain)
    nx_tactics_base.t_terrain['vx_type'] = vx_core.t_type
    nx_tactics_base.t_terrain['vx_value'] = {
      name          : "terrain",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_terrain['vx_type'] = nx_tactics_base.t_terrain
    nx_tactics_base.e_terrain['vx_value'] = {}

    // (type terrainmap)
    nx_tactics_base.t_terrainmap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_terrainmap['vx_value'] = {
      name          : "terrainmap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_terrain],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_terrainmap['vx_type'] = nx_tactics_base.t_terrainmap
    nx_tactics_base.e_terrainmap['vx_value'] = {}

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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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

    // (type trauma)
    nx_tactics_base.t_trauma['vx_type'] = vx_core.t_type
    nx_tactics_base.t_trauma['vx_value'] = {
      name          : "trauma",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_trauma['vx_type'] = nx_tactics_base.t_trauma
    nx_tactics_base.e_trauma['vx_value'] = {}

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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "body": {
          "name" : "body",
          "type" : vx_core.t_string,
          "multi": false
        },
        "mind": {
          "name" : "mind",
          "type" : vx_core.t_string,
          "multi": false
        },
        "will": {
          "name" : "will",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speed": {
          "name" : "speed",
          "type" : vx_core.t_string,
          "multi": false
        },
        "shadow": {
          "name" : "shadow",
          "type" : vx_core.t_string,
          "multi": false
        },
        "beast": {
          "name" : "beast",
          "type" : vx_core.t_string,
          "multi": false
        },
        "demeanor": {
          "name" : "demeanor",
          "type" : vx_core.t_string,
          "multi": false
        },
        "nature": {
          "name" : "nature",
          "type" : vx_core.t_string,
          "multi": false
        },
        "classification": {
          "name" : "classification",
          "type" : vx_core.t_string,
          "multi": false
        },
        "crew": {
          "name" : "crew",
          "type" : vx_core.t_string,
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
        "range": {
          "name" : "range",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speedair": {
          "name" : "speedair",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speedland": {
          "name" : "speedland",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speedspace": {
          "name" : "speedspace",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speedwater": {
          "name" : "speedwater",
          "type" : vx_core.t_string,
          "multi": false
        },
        "value": {
          "name" : "value",
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
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "reference",
        "type" : vx_core.t_string,
        "multi": false
      }
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
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "facing": {
          "name" : "facing",
          "type" : vx_core.t_string,
          "multi": false
        },
        "number": {
          "name" : "number",
          "type" : vx_core.t_string,
          "multi": false
        },
        "rounds": {
          "name" : "rounds",
          "type" : vx_core.t_string,
          "multi": false
        },
        "value": {
          "name" : "value",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "value",
        "type" : vx_core.t_string,
        "multi": false
      }
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
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "level": {
          "name" : "level",
          "type" : vx_core.t_string,
          "multi": false
        },
        "power": {
          "name" : "power",
          "type" : nx_tactics_base.t_power,
          "multi": false
        },
        "front": {
          "name" : "front",
          "type" : vx_core.t_string,
          "multi": false
        },
        "back": {
          "name" : "back",
          "type" : vx_core.t_string,
          "multi": false
        },
        "over": {
          "name" : "over",
          "type" : vx_core.t_string,
          "multi": false
        },
        "under": {
          "name" : "under",
          "type" : vx_core.t_string,
          "multi": false
        },
        "side": {
          "name" : "side",
          "type" : vx_core.t_string,
          "multi": false
        },
        "strength": {
          "name" : "strength",
          "type" : vx_core.t_string,
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
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        },
        "level": {
          "name" : "level",
          "type" : vx_core.t_string,
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
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "reference",
        "type" : vx_core.t_string,
        "multi": false
      }
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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

    // (type wound)
    nx_tactics_base.t_wound['vx_type'] = vx_core.t_type
    nx_tactics_base.t_wound['vx_value'] = {
      name          : "wound",
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
        "icon": {
          "name" : "icon",
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
        "ranksuit": {
          "name" : "ranksuit",
          "type" : nx_tactics_base.t_ranksuit,
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
    nx_tactics_base.e_wound['vx_type'] = nx_tactics_base.t_wound
    nx_tactics_base.e_wound['vx_value'] = {}

    // (func bookmap<-booklist)
    nx_tactics_base.t_bookmap_from_booklist['vx_value'] = {
      name          : "bookmap<-booklist",
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
      fn            : nx_tactics_base.f_bookmap_from_booklist
    }

    // (func cardmap<-bookmap)
    nx_tactics_base.t_cardmap_from_bookmap['vx_value'] = {
      name          : "cardmap<-bookmap",
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
      fn            : nx_tactics_base.f_cardmap_from_bookmap
    }

    // (func cardmap<-cardlist)
    nx_tactics_base.t_cardmap_from_cardlist['vx_value'] = {
      name          : "cardmap<-cardlist",
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
      fn            : nx_tactics_base.f_cardmap_from_cardlist
    }

    // (func chapterlist<-book)
    nx_tactics_base.t_chapterlist_from_book['vx_value'] = {
      name          : "chapterlist<-book",
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
      fn            : nx_tactics_base.f_chapterlist_from_book
    }

    // (func chapterlist<-booklist)
    nx_tactics_base.t_chapterlist_from_booklist['vx_value'] = {
      name          : "chapterlist<-booklist",
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
      fn            : nx_tactics_base.f_chapterlist_from_booklist
    }

    // (func chapterlist<-chapterlistlist)
    nx_tactics_base.t_chapterlist_from_chapterlistlist['vx_value'] = {
      name          : "chapterlist<-chapterlistlist",
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
      fn            : nx_tactics_base.f_chapterlist_from_chapterlistlist
    }

    // (func chapterlistlist<-booklist)
    nx_tactics_base.t_chapterlistlist_from_booklist['vx_value'] = {
      name          : "chapterlistlist<-booklist",
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
      fn            : nx_tactics_base.f_chapterlistlist_from_booklist
    }

    // (func chaptermap<-chapterlist)
    nx_tactics_base.t_chaptermap_from_chapterlist['vx_value'] = {
      name          : "chaptermap<-chapterlist",
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
      fn            : nx_tactics_base.f_chaptermap_from_chapterlist
    }

    // (func name<-chapter)
    nx_tactics_base.t_name_from_chapter['vx_value'] = {
      name          : "name<-chapter",
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
      fn            : nx_tactics_base.f_name_from_chapter
    }

    // (func rating<-mass)
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

    // (func sectionlist-all<-chapterlist)
    nx_tactics_base.t_sectionlist_all_from_chapterlist['vx_value'] = {
      name          : "sectionlist-all<-chapterlist",
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
      fn            : nx_tactics_base.f_sectionlist_all_from_chapterlist
    }

    // (func sectionlist-all<-section)
    nx_tactics_base.t_sectionlist_all_from_section['vx_value'] = {
      name          : "sectionlist-all<-section",
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
      fn            : nx_tactics_base.f_sectionlist_all_from_section
    }

    // (func sectionlist-all<-sectionlist)
    nx_tactics_base.t_sectionlist_all_from_sectionlist['vx_value'] = {
      name          : "sectionlist-all<-sectionlist",
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
      fn            : nx_tactics_base.f_sectionlist_all_from_sectionlist
    }

    // (func sectionlist<-chapter)
    nx_tactics_base.t_sectionlist_from_chapter['vx_value'] = {
      name          : "sectionlist<-chapter",
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
      fn            : nx_tactics_base.f_sectionlist_from_chapter
    }

    // (func sectionlist<-chapterlist)
    nx_tactics_base.t_sectionlist_from_chapterlist['vx_value'] = {
      name          : "sectionlist<-chapterlist",
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
      fn            : nx_tactics_base.f_sectionlist_from_chapterlist
    }

    // (func sectionlist<-section)
    nx_tactics_base.t_sectionlist_from_section['vx_value'] = {
      name          : "sectionlist<-section",
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
      fn            : nx_tactics_base.f_sectionlist_from_section
    }

    // (func sectionlist<-sectionlistlist)
    nx_tactics_base.t_sectionlist_from_sectionlistlist['vx_value'] = {
      name          : "sectionlist<-sectionlistlist",
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
      fn            : nx_tactics_base.f_sectionlist_from_sectionlistlist
    }

    // (func sectionlist<-sectionmap)
    nx_tactics_base.t_sectionlist_from_sectionmap['vx_value'] = {
      name          : "sectionlist<-sectionmap",
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
      fn            : nx_tactics_base.f_sectionlist_from_sectionmap
    }

    // (func sectionlistlist<-chapterlist)
    nx_tactics_base.t_sectionlistlist_from_chapterlist['vx_value'] = {
      name          : "sectionlistlist<-chapterlist",
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
      fn            : nx_tactics_base.f_sectionlistlist_from_chapterlist
    }

    // (func sectionlistlist<-sectionlist)
    nx_tactics_base.t_sectionlistlist_from_sectionlist['vx_value'] = {
      name          : "sectionlistlist<-sectionlist",
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
      fn            : nx_tactics_base.f_sectionlistlist_from_sectionlist
    }

    // (func sectionmap<-sectionlist)
    nx_tactics_base.t_sectionmap_from_sectionlist['vx_value'] = {
      name          : "sectionmap<-sectionlist",
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
      fn            : nx_tactics_base.f_sectionmap_from_sectionlist
    }

    // (func skilllist<-section)
    nx_tactics_base.t_skilllist_from_section['vx_value'] = {
      name          : "skilllist<-section",
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
      fn            : nx_tactics_base.f_skilllist_from_section
    }

    // (func skilllist<-sectionlist)
    nx_tactics_base.t_skilllist_from_sectionlist['vx_value'] = {
      name          : "skilllist<-sectionlist",
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
      fn            : nx_tactics_base.f_skilllist_from_sectionlist
    }

    // (func skilllist<-skilllistlist)
    nx_tactics_base.t_skilllist_from_skilllistlist['vx_value'] = {
      name          : "skilllist<-skilllistlist",
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
      fn            : nx_tactics_base.f_skilllist_from_skilllistlist
    }

    // (func skilllist<-skillmap)
    nx_tactics_base.t_skilllist_from_skillmap['vx_value'] = {
      name          : "skilllist<-skillmap",
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
      fn            : nx_tactics_base.f_skilllist_from_skillmap
    }

    // (func skilllistlist<-sectionlist)
    nx_tactics_base.t_skilllistlist_from_sectionlist['vx_value'] = {
      name          : "skilllistlist<-sectionlist",
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
      fn            : nx_tactics_base.f_skilllistlist_from_sectionlist
    }

    // (func skillmap<-skilllist)
    nx_tactics_base.t_skillmap_from_skilllist['vx_value'] = {
      name          : "skillmap<-skilllist",
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
      fn            : nx_tactics_base.f_skillmap_from_skilllist
    }

    // (func tactics<-booklist)
    nx_tactics_base.t_tactics_from_booklist['vx_value'] = {
      name          : "tactics<-booklist",
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
      fn            : nx_tactics_base.f_tactics_from_booklist
    }

    // (const rank-ace)
    Object.assign(nx_tactics_base.c_rank_ace, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Ace",
      ":titles",
      "A"
    ))

    // (const rank-eight)
    Object.assign(nx_tactics_base.c_rank_eight, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Eight",
      ":titles",
      "8"
    ))

    // (const rank-five)
    Object.assign(nx_tactics_base.c_rank_five, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Five",
      ":titles",
      "5"
    ))

    // (const rank-four)
    Object.assign(nx_tactics_base.c_rank_four, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Four",
      ":titles",
      "4"
    ))

    // (const rank-jack)
    Object.assign(nx_tactics_base.c_rank_jack, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Jack",
      ":titles",
      "J"
    ))

    // (const rank-joker)
    Object.assign(nx_tactics_base.c_rank_joker, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Wild",
      ":titles",
      "W"
    ))

    // (const rank-king)
    Object.assign(nx_tactics_base.c_rank_king, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "King",
      ":titles",
      "K"
    ))

    // (const rank-nine)
    Object.assign(nx_tactics_base.c_rank_nine, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Nine",
      ":titles",
      "9"
    ))

    // (const rank-queen)
    Object.assign(nx_tactics_base.c_rank_queen, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Queen",
      ":titles",
      "Q"
    ))

    // (const rank-seven)
    Object.assign(nx_tactics_base.c_rank_seven, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Seven",
      ":titles",
      "7"
    ))

    // (const rank-six)
    Object.assign(nx_tactics_base.c_rank_six, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Six",
      ":titles",
      "6"
    ))

    // (const rank-ten)
    Object.assign(nx_tactics_base.c_rank_ten, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Ten",
      ":titles",
      "10"
    ))

    // (const rank-three)
    Object.assign(nx_tactics_base.c_rank_three, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Three",
      ":titles",
      "3"
    ))

    // (const rank-two)
    Object.assign(nx_tactics_base.c_rank_two, vx_core.f_new(
      nx_tactics_base.t_rank,
      ":name",
      "Two",
      ":titles",
      "2"
    ))

    // (const ranksuit-2c)
    Object.assign(nx_tactics_base.c_ranksuit_2c, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_two,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-2d)
    Object.assign(nx_tactics_base.c_ranksuit_2d, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_two,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-2h)
    Object.assign(nx_tactics_base.c_ranksuit_2h, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_two,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-2s)
    Object.assign(nx_tactics_base.c_ranksuit_2s, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_two,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-3c)
    Object.assign(nx_tactics_base.c_ranksuit_3c, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_three,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-3d)
    Object.assign(nx_tactics_base.c_ranksuit_3d, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_three,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-3h)
    Object.assign(nx_tactics_base.c_ranksuit_3h, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_three,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-3s)
    Object.assign(nx_tactics_base.c_ranksuit_3s, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_three,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-4c)
    Object.assign(nx_tactics_base.c_ranksuit_4c, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_four,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-4d)
    Object.assign(nx_tactics_base.c_ranksuit_4d, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_four,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-4h)
    Object.assign(nx_tactics_base.c_ranksuit_4h, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_four,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-4s)
    Object.assign(nx_tactics_base.c_ranksuit_4s, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_four,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-5c)
    Object.assign(nx_tactics_base.c_ranksuit_5c, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_five,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-5d)
    Object.assign(nx_tactics_base.c_ranksuit_5d, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_five,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-5h)
    Object.assign(nx_tactics_base.c_ranksuit_5h, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_five,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-5s)
    Object.assign(nx_tactics_base.c_ranksuit_5s, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_five,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-6c)
    Object.assign(nx_tactics_base.c_ranksuit_6c, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_six,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-6d)
    Object.assign(nx_tactics_base.c_ranksuit_6d, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_six,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-6h)
    Object.assign(nx_tactics_base.c_ranksuit_6h, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_six,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-6s)
    Object.assign(nx_tactics_base.c_ranksuit_6s, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_six,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-7c)
    Object.assign(nx_tactics_base.c_ranksuit_7c, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_seven,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-7d)
    Object.assign(nx_tactics_base.c_ranksuit_7d, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_seven,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-7h)
    Object.assign(nx_tactics_base.c_ranksuit_7h, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_seven,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-7s)
    Object.assign(nx_tactics_base.c_ranksuit_7s, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_seven,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-8c)
    Object.assign(nx_tactics_base.c_ranksuit_8c, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_ten,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-8d)
    Object.assign(nx_tactics_base.c_ranksuit_8d, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_eight,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-8h)
    Object.assign(nx_tactics_base.c_ranksuit_8h, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_eight,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-8s)
    Object.assign(nx_tactics_base.c_ranksuit_8s, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_eight,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-9c)
    Object.assign(nx_tactics_base.c_ranksuit_9c, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_nine,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-9d)
    Object.assign(nx_tactics_base.c_ranksuit_9d, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_nine,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-9h)
    Object.assign(nx_tactics_base.c_ranksuit_9h, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_nine,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-9s)
    Object.assign(nx_tactics_base.c_ranksuit_9s, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_nine,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-ac)
    Object.assign(nx_tactics_base.c_ranksuit_ac, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-ad)
    Object.assign(nx_tactics_base.c_ranksuit_ad, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-ah)
    Object.assign(nx_tactics_base.c_ranksuit_ah, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-as)
    Object.assign(nx_tactics_base.c_ranksuit_as, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-jc)
    Object.assign(nx_tactics_base.c_ranksuit_jc, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_jack,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-jd)
    Object.assign(nx_tactics_base.c_ranksuit_jd, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_jack,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-jh)
    Object.assign(nx_tactics_base.c_ranksuit_jh, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_jack,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-jokerblack)
    Object.assign(nx_tactics_base.c_ranksuit_jokerblack, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_joker,
      ":suit",
      nx_tactics_base.c_suit_black
    ))

    // (const ranksuit-jokerred)
    Object.assign(nx_tactics_base.c_ranksuit_jokerred, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_joker,
      ":suit",
      nx_tactics_base.c_suit_red
    ))

    // (const ranksuit-js)
    Object.assign(nx_tactics_base.c_ranksuit_js, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_jack,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-kc)
    Object.assign(nx_tactics_base.c_ranksuit_kc, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_king,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-kd)
    Object.assign(nx_tactics_base.c_ranksuit_kd, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_king,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-kh)
    Object.assign(nx_tactics_base.c_ranksuit_kh, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_king,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-ks)
    Object.assign(nx_tactics_base.c_ranksuit_ks, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_king,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-qc)
    Object.assign(nx_tactics_base.c_ranksuit_qc, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_queen,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-qd)
    Object.assign(nx_tactics_base.c_ranksuit_qd, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_queen,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-qh)
    Object.assign(nx_tactics_base.c_ranksuit_qh, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_queen,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-qs)
    Object.assign(nx_tactics_base.c_ranksuit_qs, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_queen,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-tc)
    Object.assign(nx_tactics_base.c_ranksuit_tc, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_ten,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-td)
    Object.assign(nx_tactics_base.c_ranksuit_td, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_ten,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-th)
    Object.assign(nx_tactics_base.c_ranksuit_th, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_ten,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-ts)
    Object.assign(nx_tactics_base.c_ranksuit_ts, vx_core.f_new(
      nx_tactics_base.t_ranksuit,
      ":rank",
      nx_tactics_base.c_rank_ten,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const stat-beast)
    Object.assign(nx_tactics_base.c_stat_beast, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const stat-body)
    Object.assign(nx_tactics_base.c_stat_body, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const stat-mind)
    Object.assign(nx_tactics_base.c_stat_mind, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const stat-shadow)
    Object.assign(nx_tactics_base.c_stat_shadow, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const stat-speed)
    Object.assign(nx_tactics_base.c_stat_speed, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const stat-will)
    Object.assign(nx_tactics_base.c_stat_will, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const suit-black)
    Object.assign(nx_tactics_base.c_suit_black, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const suit-club)
    Object.assign(nx_tactics_base.c_suit_club, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const suit-diamond)
    Object.assign(nx_tactics_base.c_suit_diamond, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const suit-heart)
    Object.assign(nx_tactics_base.c_suit_heart, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const suit-red)
    Object.assign(nx_tactics_base.c_suit_red, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const suit-spade)
    Object.assign(nx_tactics_base.c_suit_spade, {
      "ranksuit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "rank": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "ranksuit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

  }
}
