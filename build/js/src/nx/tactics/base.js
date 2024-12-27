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
   * type: abilitylist
   */
  static t_abilitylist = {}
  static e_abilitylist = vx_core.vx_new_list(nx_tactics_base.t_abilitylist, [])

  /**
   * type: abilitylistlist
   */
  static t_abilitylistlist = {}
  static e_abilitylistlist = vx_core.vx_new_list(nx_tactics_base.t_abilitylistlist, [])

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
   * type: cardback
   * The back of a card. Title repeated on top and bottom.
   */
  static t_cardback = {}
  static e_cardback = {vx_type: nx_tactics_base.t_cardback}

  /**
   * type: cardimage
   */
  static t_cardimage = {}
  static e_cardimage = {vx_type: nx_tactics_base.t_cardimage}

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
   * Lasting Body Damage
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
   * type: item
   */
  static t_item = {}
  static e_item = {vx_type: nx_tactics_base.t_item}

  /**
   * type: itemlist
   */
  static t_itemlist = {}
  static e_itemlist = vx_core.vx_new_list(nx_tactics_base.t_itemlist, [])

  /**
   * type: itemlistlist
   */
  static t_itemlistlist = {}
  static e_itemlistlist = vx_core.vx_new_list(nx_tactics_base.t_itemlistlist, [])

  /**
   * type: itemmap
   */
  static t_itemmap = {}
  static e_itemmap = {vx_type: nx_tactics_base.t_itemmap}

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
   * type: place
   */
  static t_place = {}
  static e_place = {vx_type: nx_tactics_base.t_place}

  /**
   * type: placelist
   */
  static t_placelist = {}
  static e_placelist = vx_core.vx_new_list(nx_tactics_base.t_placelist, [])

  /**
   * type: placelistlist
   */
  static t_placelistlist = {}
  static e_placelistlist = vx_core.vx_new_list(nx_tactics_base.t_placelistlist, [])

  /**
   * type: placemap
   */
  static t_placemap = {}
  static e_placemap = {vx_type: nx_tactics_base.t_placemap}

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
   * type: powerlist
   */
  static t_powerlist = {}
  static e_powerlist = vx_core.vx_new_list(nx_tactics_base.t_powerlist, [])

  /**
   * type: powerlistlist
   */
  static t_powerlistlist = {}
  static e_powerlistlist = vx_core.vx_new_list(nx_tactics_base.t_powerlistlist, [])

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
   * Rating are displayed as level.partxscale. e.g. 3x1, 5.1x2
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
   * type: scenariolist
   */
  static t_scenariolist = {}
  static e_scenariolist = vx_core.vx_new_list(nx_tactics_base.t_scenariolist, [])

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
   * type: unitabilitylist
   */
  static t_unitabilitylist = {}
  static e_unitabilitylist = vx_core.vx_new_list(nx_tactics_base.t_unitabilitylist, [])

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
   * type: unititemlist
   */
  static t_unititemlist = {}
  static e_unititemlist = vx_core.vx_new_list(nx_tactics_base.t_unititemlist, [])

  /**
   * type: unititemmap
   */
  static t_unititemmap = {}
  static e_unititemmap = {vx_type: nx_tactics_base.t_unititemmap}

  /**
   * type: unitlist
   */
  static t_unitlist = {}
  static e_unitlist = vx_core.vx_new_list(nx_tactics_base.t_unitlist, [])

  /**
   * type: unitlistlist
   */
  static t_unitlistlist = {}
  static e_unitlistlist = vx_core.vx_new_list(nx_tactics_base.t_unitlistlist, [])

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
   * type: unitpowerlist
   */
  static t_unitpowerlist = {}
  static e_unitpowerlist = vx_core.vx_new_list(nx_tactics_base.t_unitpowerlist, [])

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
   * type: unitskilllist
   */
  static t_unitskilllist = {}
  static e_unitskilllist = vx_core.vx_new_list(nx_tactics_base.t_unitskilllist, [])

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
   * type: weaknesslist
   */
  static t_weaknesslist = {}
  static e_weaknesslist = vx_core.vx_new_list(nx_tactics_base.t_weaknesslist, [])

  /**
   * type: weaknessmap
   */
  static t_weaknessmap = {}
  static e_weaknessmap = {vx_type: nx_tactics_base.t_weaknessmap}
  /**
   * Constant: rank-ace
   * {rank}
   */
  static c_rank_ace = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-ace', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-eight
   * {rank}
   */
  static c_rank_eight = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-eight', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-five
   * {rank}
   */
  static c_rank_five = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-five', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-four
   * {rank}
   */
  static c_rank_four = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-four', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-jack
   * {rank}
   */
  static c_rank_jack = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-jack', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-joker
   * {rank}
   */
  static c_rank_joker = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-joker', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-king
   * {rank}
   */
  static c_rank_king = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-king', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-nine
   * {rank}
   */
  static c_rank_nine = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-nine', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-queen
   * {rank}
   */
  static c_rank_queen = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-queen', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-seven
   * {rank}
   */
  static c_rank_seven = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-seven', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-six
   * {rank}
   */
  static c_rank_six = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-six', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-ten
   * {rank}
   */
  static c_rank_ten = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-ten', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-three
   * {rank}
   */
  static c_rank_three = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-three', type: nx_tactics_base.t_rank}}

  /**
   * Constant: rank-two
   * {rank}
   */
  static c_rank_two = {vx_type: nx_tactics_base.t_rank, vx_constdef: {pkgname: 'nx/tactics/base', name: 'rank-two', type: nx_tactics_base.t_rank}}

  /**
   * Constant: ranksuit-2c
   * {ranksuit}
   */
  static c_ranksuit_2c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-2c', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-2d
   * {ranksuit}
   */
  static c_ranksuit_2d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-2d', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-2h
   * {ranksuit}
   */
  static c_ranksuit_2h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-2h', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-2s
   * {ranksuit}
   */
  static c_ranksuit_2s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-2s', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-3c
   * {ranksuit}
   */
  static c_ranksuit_3c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-3c', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-3d
   * {ranksuit}
   */
  static c_ranksuit_3d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-3d', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-3h
   * {ranksuit}
   */
  static c_ranksuit_3h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-3h', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-3s
   * {ranksuit}
   */
  static c_ranksuit_3s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-3s', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-4c
   * {ranksuit}
   */
  static c_ranksuit_4c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-4c', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-4d
   * {ranksuit}
   */
  static c_ranksuit_4d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-4d', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-4h
   * {ranksuit}
   */
  static c_ranksuit_4h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-4h', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-4s
   * {ranksuit}
   */
  static c_ranksuit_4s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-4s', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-5c
   * {ranksuit}
   */
  static c_ranksuit_5c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-5c', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-5d
   * {ranksuit}
   */
  static c_ranksuit_5d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-5d', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-5h
   * {ranksuit}
   */
  static c_ranksuit_5h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-5h', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-5s
   * {ranksuit}
   */
  static c_ranksuit_5s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-5s', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-6c
   * {ranksuit}
   */
  static c_ranksuit_6c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-6c', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-6d
   * {ranksuit}
   */
  static c_ranksuit_6d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-6d', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-6h
   * {ranksuit}
   */
  static c_ranksuit_6h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-6h', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-6s
   * {ranksuit}
   */
  static c_ranksuit_6s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-6s', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-7c
   * {ranksuit}
   */
  static c_ranksuit_7c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-7c', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-7d
   * {ranksuit}
   */
  static c_ranksuit_7d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-7d', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-7h
   * {ranksuit}
   */
  static c_ranksuit_7h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-7h', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-7s
   * {ranksuit}
   */
  static c_ranksuit_7s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-7s', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-8c
   * {ranksuit}
   */
  static c_ranksuit_8c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-8c', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-8d
   * {ranksuit}
   */
  static c_ranksuit_8d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-8d', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-8h
   * {ranksuit}
   */
  static c_ranksuit_8h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-8h', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-8s
   * {ranksuit}
   */
  static c_ranksuit_8s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-8s', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-9c
   * {ranksuit}
   */
  static c_ranksuit_9c = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-9c', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-9d
   * {ranksuit}
   */
  static c_ranksuit_9d = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-9d', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-9h
   * {ranksuit}
   */
  static c_ranksuit_9h = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-9h', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-9s
   * {ranksuit}
   */
  static c_ranksuit_9s = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-9s', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-ac
   * {ranksuit}
   */
  static c_ranksuit_ac = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ac', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-ad
   * {ranksuit}
   */
  static c_ranksuit_ad = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ad', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-ah
   * {ranksuit}
   */
  static c_ranksuit_ah = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ah', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-as
   * {ranksuit}
   */
  static c_ranksuit_as = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-as', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-jc
   * {ranksuit}
   */
  static c_ranksuit_jc = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jc', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-jd
   * {ranksuit}
   */
  static c_ranksuit_jd = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jd', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-jh
   * {ranksuit}
   */
  static c_ranksuit_jh = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jh', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-jokerblack
   * {ranksuit}
   */
  static c_ranksuit_jokerblack = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jokerblack', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-jokerred
   * {ranksuit}
   */
  static c_ranksuit_jokerred = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-jokerred', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-js
   * {ranksuit}
   */
  static c_ranksuit_js = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-js', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-kc
   * {ranksuit}
   */
  static c_ranksuit_kc = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-kc', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-kd
   * {ranksuit}
   */
  static c_ranksuit_kd = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-kd', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-kh
   * {ranksuit}
   */
  static c_ranksuit_kh = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-kh', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-ks
   * {ranksuit}
   */
  static c_ranksuit_ks = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ks', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-qc
   * {ranksuit}
   */
  static c_ranksuit_qc = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-qc', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-qd
   * {ranksuit}
   */
  static c_ranksuit_qd = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-qd', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-qh
   * {ranksuit}
   */
  static c_ranksuit_qh = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-qh', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-qs
   * {ranksuit}
   */
  static c_ranksuit_qs = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-qs', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-tc
   * {ranksuit}
   */
  static c_ranksuit_tc = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-tc', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-td
   * {ranksuit}
   */
  static c_ranksuit_td = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-td', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-th
   * {ranksuit}
   */
  static c_ranksuit_th = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-th', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: ranksuit-ts
   * {ranksuit}
   */
  static c_ranksuit_ts = {vx_type: nx_tactics_base.t_ranksuit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'ranksuit-ts', type: nx_tactics_base.t_ranksuit}}

  /**
   * Constant: role-aoe
   * {role}
   */
  static c_role_aoe = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-aoe', type: nx_tactics_base.t_role}}

  /**
   * Constant: role-bosskiller
   * {role}
   */
  static c_role_bosskiller = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-bosskiller', type: nx_tactics_base.t_role}}

  /**
   * Constant: role-buffer
   * {role}
   */
  static c_role_buffer = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-buffer', type: nx_tactics_base.t_role}}

  /**
   * Constant: role-crowdcontrol
   * {role}
   */
  static c_role_crowdcontrol = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-crowdcontrol', type: nx_tactics_base.t_role}}

  /**
   * Constant: role-distracter
   * {role}
   */
  static c_role_distracter = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-distracter', type: nx_tactics_base.t_role}}

  /**
   * Constant: role-healer
   * {role}
   */
  static c_role_healer = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-healer', type: nx_tactics_base.t_role}}

  /**
   * Constant: role-sniper
   * {role}
   */
  static c_role_sniper = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-sniper', type: nx_tactics_base.t_role}}

  /**
   * Constant: role-tank
   * {role}
   */
  static c_role_tank = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-tank', type: nx_tactics_base.t_role}}

  /**
   * Constant: role-trapper
   * {role}
   */
  static c_role_trapper = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-trapper', type: nx_tactics_base.t_role}}

  /**
   * Constant: role-utility
   * {role}
   */
  static c_role_utility = {vx_type: nx_tactics_base.t_role, vx_constdef: {pkgname: 'nx/tactics/base', name: 'role-utility', type: nx_tactics_base.t_role}}

  /**
   * Constant: stat-beast
   * The ability to use wild rage or terror to lash out or flee. This is the opposite of the [Will].
   * {stat}
   */
  static c_stat_beast = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-beast', type: nx_tactics_base.t_stat}}

  /**
   * Constant: stat-body
   * {stat}
   */
  static c_stat_body = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-body', type: nx_tactics_base.t_stat}}

  /**
   * Constant: stat-mind
   * {stat}
   */
  static c_stat_mind = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-mind', type: nx_tactics_base.t_stat}}

  /**
   * Constant: stat-shadow
   * The ability to use rational thought to do selfish/impulsive acts. This is the opposite of the [Mind].
   * {stat}
   */
  static c_stat_shadow = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-shadow', type: nx_tactics_base.t_stat}}

  /**
   * Constant: stat-speed
   * {stat}
   */
  static c_stat_speed = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-speed', type: nx_tactics_base.t_stat}}

  /**
   * Constant: stat-will
   * {stat}
   */
  static c_stat_will = {vx_type: nx_tactics_base.t_stat, vx_constdef: {pkgname: 'nx/tactics/base', name: 'stat-will', type: nx_tactics_base.t_stat}}

  /**
   * Constant: suit-black
   * {suit}
   */
  static c_suit_black = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-black', type: nx_tactics_base.t_suit}}

  /**
   * Constant: suit-club
   * {suit}
   */
  static c_suit_club = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-club', type: nx_tactics_base.t_suit}}

  /**
   * Constant: suit-diamond
   * {suit}
   */
  static c_suit_diamond = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-diamond', type: nx_tactics_base.t_suit}}

  /**
   * Constant: suit-heart
   * {suit}
   */
  static c_suit_heart = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-heart', type: nx_tactics_base.t_suit}}

  /**
   * Constant: suit-red
   * {suit}
   */
  static c_suit_red = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-red', type: nx_tactics_base.t_suit}}

  /**
   * Constant: suit-spade
   * {suit}
   */
  static c_suit_spade = {vx_type: nx_tactics_base.t_suit, vx_constdef: {pkgname: 'nx/tactics/base', name: 'suit-spade', type: nx_tactics_base.t_suit}}

  /**
   * @function abilitylist_from_abilitylistlist
   * Returns an abilitylist from a given abilitylistlist
   * @param  {abilitylistlist} abilitylistlist
   * @return {abilitylistlist}
   */
  static t_abilitylist_from_abilitylistlist = {
    vx_type: vx_core.t_type
  }
  static e_abilitylist_from_abilitylistlist = {
    vx_type: nx_tactics_base.t_abilitylist_from_abilitylistlist
  }

  // (func abilitylist<-abilitylistlist)
  static f_abilitylist_from_abilitylistlist(abilitylistlist) {
    let output = nx_tactics_base.e_abilitylistlist
    output = vx_collection.f_list_from_list_join({"any-1": nx_tactics_base.t_ability, "any-2": nx_tactics_base.t_abilitylist, "list-1": nx_tactics_base.t_abilitylist, "list-2": nx_tactics_base.t_abilitylistlist}, abilitylistlist)
    return output
  }

  /**
   * @function abilitylist_from_power
   * Returns an abilitylist from a given power
   * @param  {power} power
   * @return {abilitylist}
   */
  static t_abilitylist_from_power = {
    vx_type: vx_core.t_type
  }
  static e_abilitylist_from_power = {
    vx_type: nx_tactics_base.t_abilitylist_from_power
  }

  // (func abilitylist<-power)
  static f_abilitylist_from_power(power) {
    let output = nx_tactics_base.e_abilitylist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_abilitylist, "any-2": nx_tactics_base.t_ability, "list-1": nx_tactics_base.t_abilitylist, "map-2": nx_tactics_base.t_abilitymap},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_power}, power, ":abilitymap")
        return vx_core.f_list_from_map({"any-1": nx_tactics_base.t_ability, "any-2": nx_tactics_base.t_ability, "list-1": nx_tactics_base.t_abilitylist, "map-2": nx_tactics_base.t_abilitymap}, abilitymap)
      })
    )
    return output
  }

  /**
   * @function abilitylist_from_powerlist
   * Returns a abilitylist from a given skilllist
   * @param  {powerlist} powerlist
   * @return {abilitylist}
   */
  static t_abilitylist_from_powerlist = {
    vx_type: vx_core.t_type
  }
  static e_abilitylist_from_powerlist = {
    vx_type: nx_tactics_base.t_abilitylist_from_powerlist
  }

  // (func abilitylist<-powerlist)
  static f_abilitylist_from_powerlist(powerlist) {
    let output = nx_tactics_base.e_abilitylist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_abilitylist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const abilitylistlist = nx_tactics_base.f_abilitylistlist_from_powerlist(powerlist)
        return nx_tactics_base.f_abilitylist_from_abilitylistlist(abilitylistlist)
      })
    )
    return output
  }

  /**
   * @function abilitylist_from_skill
   * Returns an abilitylist from a given skill
   * @param  {skill} skill
   * @return {abilitylist}
   */
  static t_abilitylist_from_skill = {
    vx_type: vx_core.t_type
  }
  static e_abilitylist_from_skill = {
    vx_type: nx_tactics_base.t_abilitylist_from_skill
  }

  // (func abilitylist<-skill)
  static f_abilitylist_from_skill(skill) {
    let output = nx_tactics_base.e_abilitylist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_abilitylist, "any-2": nx_tactics_base.t_ability, "list-1": nx_tactics_base.t_abilitylist, "map-2": nx_tactics_base.t_abilitymap},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_skill}, skill, ":abilitymap")
        return vx_core.f_list_from_map({"any-1": nx_tactics_base.t_ability, "any-2": nx_tactics_base.t_ability, "list-1": nx_tactics_base.t_abilitylist, "map-2": nx_tactics_base.t_abilitymap}, abilitymap)
      })
    )
    return output
  }

  /**
   * @function abilitylist_from_skilllist
   * Returns a abilitylist from a given skilllist
   * @param  {skilllist} skilllist
   * @return {abilitylist}
   */
  static t_abilitylist_from_skilllist = {
    vx_type: vx_core.t_type
  }
  static e_abilitylist_from_skilllist = {
    vx_type: nx_tactics_base.t_abilitylist_from_skilllist
  }

  // (func abilitylist<-skilllist)
  static f_abilitylist_from_skilllist(skilllist) {
    let output = nx_tactics_base.e_abilitylist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_abilitylist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const abilitylistlist = nx_tactics_base.f_abilitylistlist_from_skilllist(skilllist)
        return nx_tactics_base.f_abilitylist_from_abilitylistlist(abilitylistlist)
      })
    )
    return output
  }

  /**
   * @function abilitylistlist_from_powerlist
   * Returns an abilitylistlist from a given powerlist
   * @param  {powerlist} powerlist
   * @return {abilitylistlist}
   */
  static t_abilitylistlist_from_powerlist = {
    vx_type: vx_core.t_type
  }
  static e_abilitylistlist_from_powerlist = {
    vx_type: nx_tactics_base.t_abilitylistlist_from_powerlist
  }

  // (func abilitylistlist<-powerlist)
  static f_abilitylistlist_from_powerlist(powerlist) {
    let output = nx_tactics_base.e_abilitylistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_abilitylist, "any-2": nx_tactics_base.t_power, "list-1": nx_tactics_base.t_abilitylistlist, "list-2": nx_tactics_base.t_powerlist},
      powerlist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (power) => 
        nx_tactics_base.f_abilitylist_from_power(power))
    )
    return output
  }

  /**
   * @function abilitylistlist_from_skilllist
   * Returns an abilitylistlist from a given skilllist
   * @param  {skilllist} skilllist
   * @return {abilitylistlist}
   */
  static t_abilitylistlist_from_skilllist = {
    vx_type: vx_core.t_type
  }
  static e_abilitylistlist_from_skilllist = {
    vx_type: nx_tactics_base.t_abilitylistlist_from_skilllist
  }

  // (func abilitylistlist<-skilllist)
  static f_abilitylistlist_from_skilllist(skilllist) {
    let output = nx_tactics_base.e_abilitylistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_abilitylist, "any-2": nx_tactics_base.t_skill, "list-1": nx_tactics_base.t_abilitylistlist, "list-2": nx_tactics_base.t_skilllist},
      skilllist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (skill) => 
        nx_tactics_base.f_abilitylist_from_skill(skill))
    )
    return output
  }

  /**
   * @function abilitymap_from_abilitylist
   * Returns an abilitymap from a given abilitylist
   * @param  {abilitylist} ... abilitylist
   * @return {abilitymap}
   */
  static t_abilitymap_from_abilitylist = {
    vx_type: vx_core.t_type
  }
  static e_abilitymap_from_abilitylist = {
    vx_type: nx_tactics_base.t_abilitymap_from_abilitylist
  }

  // (func abilitymap<-abilitylist)
  static f_abilitymap_from_abilitylist(...abilitylist) {
    let output = nx_tactics_base.e_abilitymap
    abilitylist = vx_core.f_new_from_type(nx_tactics_base.t_abilitylist, ...abilitylist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_ability, "any-2": nx_tactics_base.t_ability, "list-2": nx_tactics_base.t_abilitylist, "map-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_ability},
      abilitylist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (ability) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_ability}, ability, ":name"))
    )
    return output
  }

  /**
   * @function abilitymap_from_tactics_namelist
   * Returns a map of abilites from tactics
   * @param  {tactics} tactics
   * @param  {stringlist} ... namelist
   * @return {abilitymap}
   */
  static t_abilitymap_from_tactics_namelist = {
    vx_type: vx_core.t_type
  }
  static e_abilitymap_from_tactics_namelist = {
    vx_type: nx_tactics_base.t_abilitymap_from_tactics_namelist
  }

  // (func abilitymap<-tactics-namelist)
  static f_abilitymap_from_tactics_namelist(tactics, ...namelist) {
    let output = nx_tactics_base.e_abilitymap
    namelist = vx_core.f_new_from_type(vx_core.t_stringlist, ...namelist)
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_abilitymap, "map-1": nx_tactics_base.t_abilitymap},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":abilitymap")
        return vx_collection.f_map_from_map_keys({"any-1": nx_tactics_base.t_ability, "map-1": nx_tactics_base.t_abilitymap}, abilitymap, namelist)
      })
    )
    return output
  }

  /**
   * @function bookmap_from_booklist
   * Returns a bookmap of all books.
   * @param  {booklist} ... booklist
   * @return {bookmap}
   */
  static t_bookmap_from_booklist = {
    vx_type: vx_core.t_type
  }
  static e_bookmap_from_booklist = {
    vx_type: nx_tactics_base.t_bookmap_from_booklist
  }

  // (func bookmap<-booklist)
  static f_bookmap_from_booklist(...booklist) {
    let output = nx_tactics_base.e_bookmap
    booklist = vx_core.f_new_from_type(nx_tactics_base.t_booklist, ...booklist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_book, "any-2": nx_tactics_base.t_book, "list-2": nx_tactics_base.t_booklist, "map-1": nx_tactics_base.t_bookmap, "struct-2": nx_tactics_base.t_book},
      booklist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (book) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_book}, book, ":name"))
    )
    return output
  }

  /**
   * @function cardimage_from_card
   * Returns a cardimage from a given card
   * @param  {card} card
   * @return {cardimage}
   */
  static t_cardimage_from_card = {
    vx_type: vx_core.t_type
  }
  static e_cardimage_from_card = {
    vx_type: nx_tactics_base.t_cardimage_from_card
  }

  // (func cardimage<-card)
  static f_cardimage_from_card(card) {
    let output = nx_tactics_base.e_cardimage
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_cardimage},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":name")
        const image = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":image")
        const imgmirror = vx_core.f_any_from_struct({"any-1": vx_core.t_boolean, "struct-2": nx_tactics_base.t_card}, card, ":imgmirror")
        const id = vx_core.f_new({"any-1": vx_core.t_string}, name, "-image")
        return vx_core.f_new({"any-1": nx_tactics_base.t_cardimage}, ":id", id, ":name", name, ":origcard", card, ":image", image, ":imgmirror", imgmirror)
      })
    )
    return output
  }

  /**
   * @function cardlist_copy_from_card_num
   * Returns a cardlist by copying a card num times
   * @param  {card} card
   * @param  {int} num
   * @return {cardlist}
   */
  static t_cardlist_copy_from_card_num = {
    vx_type: vx_core.t_type
  }
  static e_cardlist_copy_from_card_num = {
    vx_type: nx_tactics_base.t_cardlist_copy_from_card_num
  }

  // (func cardlist-copy<-card-num)
  static f_cardlist_copy_from_card_num(card, num) {
    let output = nx_tactics_base.e_cardlist
    output = vx_collection.f_list_from_for_end_loop(
      {"any-1": nx_tactics_base.t_card, "list-1": nx_tactics_base.t_cardlist},
      1,
      num,
      vx_core.f_new_from_type(vx_core.t_any_from_int, (pos) => 
        vx_core.f_let(
          {"any-1": nx_tactics_base.t_card},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const id = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":id")
            const chg = vx_core.f_new({"any-1": vx_core.t_string}, id, "-", pos)
            return vx_core.f_copy(card, ":id", chg)
          })
        ))
    )
    return output
  }

  /**
   * @function cardmap_copy_from_card_num
   * Returns a cardmap by copying a card num times
   * @param  {card} card
   * @param  {int} num
   * @return {cardmap}
   */
  static t_cardmap_copy_from_card_num = {
    vx_type: vx_core.t_type
  }
  static e_cardmap_copy_from_card_num = {
    vx_type: nx_tactics_base.t_cardmap_copy_from_card_num
  }

  // (func cardmap-copy<-card-num)
  static f_cardmap_copy_from_card_num(card, num) {
    let output = nx_tactics_base.e_cardmap
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_cardmap},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const cardlist = nx_tactics_base.f_cardlist_copy_from_card_num(card, num)
        return nx_tactics_base.f_cardmap_from_cardlist(cardlist)
      })
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
      vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, value]) => 
        vx_core.f_any_from_any({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_book}, value))
    )
    return output
  }

  /**
   * @function cardmap_from_cardlist
   * @param  {cardlist} ... cardlist
   * @return {cardmap}
   */
  static t_cardmap_from_cardlist = {
    vx_type: vx_core.t_type
  }
  static e_cardmap_from_cardlist = {
    vx_type: nx_tactics_base.t_cardmap_from_cardlist
  }

  // (func cardmap<-cardlist)
  static f_cardmap_from_cardlist(...cardlist) {
    let output = nx_tactics_base.e_cardmap
    cardlist = vx_core.f_new_from_type(nx_tactics_base.t_cardlist, ...cardlist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_card, "list-2": nx_tactics_base.t_cardlist, "map-1": nx_tactics_base.t_cardmap},
      cardlist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (card) => 
        vx_core.f_let(
          {"any-1": vx_core.t_string},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const id = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":id")
            const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":name")
            return vx_core.f_if_1(
              {"any-1": vx_core.t_string},
              vx_core.f_notempty(id),
              id,
              name
            )
          })
        ))
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const chaptermap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_chaptermap, "struct-2": nx_tactics_base.t_book}, book, ":chaptermap")
        return vx_core.f_list_from_map_1(
          {"any-1": nx_tactics_base.t_chapter, "any-2": nx_tactics_base.t_chapter, "list-1": nx_tactics_base.t_chapterlist, "map-2": nx_tactics_base.t_chaptermap},
          chaptermap,
          vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, value]) => value)
        )
      })
    )
    return output
  }

  /**
   * @function chapterlist_from_booklist
   * Returns a chapterlist from a given booklist
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
    output = vx_collection.f_list_from_list_join({"any-1": nx_tactics_base.t_chapter, "any-2": nx_tactics_base.t_chapterlist, "list-1": nx_tactics_base.t_chapterlist, "list-2": nx_tactics_base.t_chapterlistlist}, chapterlistlist)
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
      vx_core.f_new_from_type(vx_core.t_any_from_any, (book) => 
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
      vx_core.f_new_from_type(vx_core.t_any_from_any, (chapter) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_chapter}, chapter, ":name"))
    )
    return output
  }

  /**
   * @function itemlist_from_itemlistlist
   * Returns a itemlist from a given itemlistlist
   * @param  {itemlistlist} itemlistlist
   * @return {itemlist}
   */
  static t_itemlist_from_itemlistlist = {
    vx_type: vx_core.t_type
  }
  static e_itemlist_from_itemlistlist = {
    vx_type: nx_tactics_base.t_itemlist_from_itemlistlist
  }

  // (func itemlist<-itemlistlist)
  static f_itemlist_from_itemlistlist(itemlistlist) {
    let output = nx_tactics_base.e_itemlist
    output = vx_collection.f_list_from_list_join({"any-1": nx_tactics_base.t_item, "any-2": nx_tactics_base.t_itemlist, "list-1": nx_tactics_base.t_itemlist, "list-2": nx_tactics_base.t_itemlistlist}, itemlistlist)
    return output
  }

  /**
   * @function itemlist_from_itemmap
   * Returns a itemlist from a given itemmap
   * @param  {itemmap} itemmap
   * @return {itemlist}
   */
  static t_itemlist_from_itemmap = {
    vx_type: vx_core.t_type
  }
  static e_itemlist_from_itemmap = {
    vx_type: nx_tactics_base.t_itemlist_from_itemmap
  }

  // (func itemlist<-itemmap)
  static f_itemlist_from_itemmap(itemmap) {
    let output = nx_tactics_base.e_itemlist
    output = vx_core.f_list_from_map({"any-1": nx_tactics_base.t_item, "any-2": nx_tactics_base.t_item, "list-1": nx_tactics_base.t_itemlist, "map-2": nx_tactics_base.t_itemmap}, itemmap)
    return output
  }

  /**
   * @function itemlist_from_section
   * Returns a itemlist from a given section
   * @param  {section} section
   * @return {itemlist}
   */
  static t_itemlist_from_section = {
    vx_type: vx_core.t_type
  }
  static e_itemlist_from_section = {
    vx_type: nx_tactics_base.t_itemlist_from_section
  }

  // (func itemlist<-section)
  static f_itemlist_from_section(section) {
    let output = nx_tactics_base.e_itemlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_itemlist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const secname = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, section, ":name")
        const sec = vx_core.f_copy(section, ":name", secname)
        const itemmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_itemmap, "struct-2": nx_tactics_base.t_section}, section, ":itemmap")
        return nx_tactics_base.f_itemlist_from_itemmap(itemmap)
      })
    )
    return output
  }

  /**
   * @function itemlist_from_sectionlist
   * Returns a itemlist from a given sectionlist
   * @param  {sectionlist} sectionlist
   * @return {itemlist}
   */
  static t_itemlist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_itemlist_from_sectionlist = {
    vx_type: nx_tactics_base.t_itemlist_from_sectionlist
  }

  // (func itemlist<-sectionlist)
  static f_itemlist_from_sectionlist(sectionlist) {
    let output = nx_tactics_base.e_itemlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_itemlist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const itemlistlist = nx_tactics_base.f_itemlistlist_from_sectionlist(sectionlist)
        return nx_tactics_base.f_itemlist_from_itemlistlist(itemlistlist)
      })
    )
    return output
  }

  /**
   * @function itemlistlist_from_sectionlist
   * Returns a itemlistlist from a given sectionlist
   * @param  {sectionlist} sections
   * @return {itemlistlist}
   */
  static t_itemlistlist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_itemlistlist_from_sectionlist = {
    vx_type: nx_tactics_base.t_itemlistlist_from_sectionlist
  }

  // (func itemlistlist<-sectionlist)
  static f_itemlistlist_from_sectionlist(sections) {
    let output = nx_tactics_base.e_itemlistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_itemlist, "any-2": nx_tactics_base.t_section, "list-1": nx_tactics_base.t_itemlistlist, "list-2": nx_tactics_base.t_sectionlist},
      sections,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (section) => 
        nx_tactics_base.f_itemlist_from_section(section))
    )
    return output
  }

  /**
   * @function itemmap_from_itemlist
   * Returns a itemmap from a given itemlist
   * @param  {itemlist} ... itemlist
   * @return {itemmap}
   */
  static t_itemmap_from_itemlist = {
    vx_type: vx_core.t_type
  }
  static e_itemmap_from_itemlist = {
    vx_type: nx_tactics_base.t_itemmap_from_itemlist
  }

  // (func itemmap<-itemlist)
  static f_itemmap_from_itemlist(...itemlist) {
    let output = nx_tactics_base.e_itemmap
    itemlist = vx_core.f_new_from_type(nx_tactics_base.t_itemlist, ...itemlist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_item, "any-2": nx_tactics_base.t_item, "list-2": nx_tactics_base.t_itemlist, "map-1": nx_tactics_base.t_itemmap, "struct-2": nx_tactics_base.t_item},
      itemlist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (item) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":name"))
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
   * @function placelist_from_placelistlist
   * Returns a placelist from a given placelistlist
   * @param  {placelistlist} placelistlist
   * @return {placelist}
   */
  static t_placelist_from_placelistlist = {
    vx_type: vx_core.t_type
  }
  static e_placelist_from_placelistlist = {
    vx_type: nx_tactics_base.t_placelist_from_placelistlist
  }

  // (func placelist<-placelistlist)
  static f_placelist_from_placelistlist(placelistlist) {
    let output = nx_tactics_base.e_placelist
    output = vx_collection.f_list_from_list_join({"any-1": nx_tactics_base.t_place, "any-2": nx_tactics_base.t_placelist, "list-1": nx_tactics_base.t_placelist, "list-2": nx_tactics_base.t_placelistlist}, placelistlist)
    return output
  }

  /**
   * @function placelist_from_placemap
   * Returns a placelist from a given placemap
   * @param  {placemap} placemap
   * @return {placelist}
   */
  static t_placelist_from_placemap = {
    vx_type: vx_core.t_type
  }
  static e_placelist_from_placemap = {
    vx_type: nx_tactics_base.t_placelist_from_placemap
  }

  // (func placelist<-placemap)
  static f_placelist_from_placemap(placemap) {
    let output = nx_tactics_base.e_placelist
    output = vx_core.f_list_from_map({"any-1": nx_tactics_base.t_place, "any-2": nx_tactics_base.t_place, "list-1": nx_tactics_base.t_placelist, "map-2": nx_tactics_base.t_placemap}, placemap)
    return output
  }

  /**
   * @function placelist_from_section
   * Returns a placelist from a given section
   * @param  {section} section
   * @return {placelist}
   */
  static t_placelist_from_section = {
    vx_type: vx_core.t_type
  }
  static e_placelist_from_section = {
    vx_type: nx_tactics_base.t_placelist_from_section
  }

  // (func placelist<-section)
  static f_placelist_from_section(section) {
    let output = nx_tactics_base.e_placelist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_placelist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const secname = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, section, ":name")
        const sec = vx_core.f_copy(section, ":name", secname)
        const placemap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_placemap, "struct-2": nx_tactics_base.t_section}, section, ":placemap")
        return nx_tactics_base.f_placelist_from_placemap(placemap)
      })
    )
    return output
  }

  /**
   * @function placelist_from_sectionlist
   * Returns a placelist from a given sectionlist
   * @param  {sectionlist} sectionlist
   * @return {placelist}
   */
  static t_placelist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_placelist_from_sectionlist = {
    vx_type: nx_tactics_base.t_placelist_from_sectionlist
  }

  // (func placelist<-sectionlist)
  static f_placelist_from_sectionlist(sectionlist) {
    let output = nx_tactics_base.e_placelist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_placelist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const placelistlist = nx_tactics_base.f_placelistlist_from_sectionlist(sectionlist)
        return nx_tactics_base.f_placelist_from_placelistlist(placelistlist)
      })
    )
    return output
  }

  /**
   * @function placelistlist_from_sectionlist
   * Returns a placelistlist from a given sectionlist
   * @param  {sectionlist} sections
   * @return {placelistlist}
   */
  static t_placelistlist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_placelistlist_from_sectionlist = {
    vx_type: nx_tactics_base.t_placelistlist_from_sectionlist
  }

  // (func placelistlist<-sectionlist)
  static f_placelistlist_from_sectionlist(sections) {
    let output = nx_tactics_base.e_placelistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_placelist, "any-2": nx_tactics_base.t_section, "list-1": nx_tactics_base.t_placelistlist, "list-2": nx_tactics_base.t_sectionlist},
      sections,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (section) => 
        nx_tactics_base.f_placelist_from_section(section))
    )
    return output
  }

  /**
   * @function placemap_from_placelist
   * Returns a placemap from a given placelist
   * @param  {placelist} ... placelist
   * @return {placemap}
   */
  static t_placemap_from_placelist = {
    vx_type: vx_core.t_type
  }
  static e_placemap_from_placelist = {
    vx_type: nx_tactics_base.t_placemap_from_placelist
  }

  // (func placemap<-placelist)
  static f_placemap_from_placelist(...placelist) {
    let output = nx_tactics_base.e_placemap
    placelist = vx_core.f_new_from_type(nx_tactics_base.t_placelist, ...placelist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_place, "any-2": nx_tactics_base.t_place, "list-2": nx_tactics_base.t_placelist, "map-1": nx_tactics_base.t_placemap, "struct-2": nx_tactics_base.t_place},
      placelist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (place) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_place}, place, ":name"))
    )
    return output
  }

  /**
   * @function powerlist_from_powerlistlist
   * Returns a powerlist from a given powerlistlist
   * @param  {powerlistlist} powerlistlist
   * @return {powerlist}
   */
  static t_powerlist_from_powerlistlist = {
    vx_type: vx_core.t_type
  }
  static e_powerlist_from_powerlistlist = {
    vx_type: nx_tactics_base.t_powerlist_from_powerlistlist
  }

  // (func powerlist<-powerlistlist)
  static f_powerlist_from_powerlistlist(powerlistlist) {
    let output = nx_tactics_base.e_powerlist
    output = vx_collection.f_list_from_list_join({"any-1": nx_tactics_base.t_power, "any-2": nx_tactics_base.t_powerlist, "list-1": nx_tactics_base.t_powerlist, "list-2": nx_tactics_base.t_powerlistlist}, powerlistlist)
    return output
  }

  /**
   * @function powerlist_from_powermap
   * Returns a powerlist from a given powermap
   * @param  {powermap} powermap
   * @return {powerlist}
   */
  static t_powerlist_from_powermap = {
    vx_type: vx_core.t_type
  }
  static e_powerlist_from_powermap = {
    vx_type: nx_tactics_base.t_powerlist_from_powermap
  }

  // (func powerlist<-powermap)
  static f_powerlist_from_powermap(powermap) {
    let output = nx_tactics_base.e_powerlist
    output = vx_core.f_list_from_map({"any-1": nx_tactics_base.t_power, "any-2": nx_tactics_base.t_power, "list-1": nx_tactics_base.t_powerlist, "map-2": nx_tactics_base.t_powermap}, powermap)
    return output
  }

  /**
   * @function powerlist_from_section
   * Returns a powerlist from a given section
   * @param  {section} section
   * @return {powerlist}
   */
  static t_powerlist_from_section = {
    vx_type: vx_core.t_type
  }
  static e_powerlist_from_section = {
    vx_type: nx_tactics_base.t_powerlist_from_section
  }

  // (func powerlist<-section)
  static f_powerlist_from_section(section) {
    let output = nx_tactics_base.e_powerlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_powerlist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const secname = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, section, ":name")
        const sec = vx_core.f_copy(section, ":name", secname)
        const powermap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_powermap, "struct-2": nx_tactics_base.t_section}, section, ":powermap")
        return nx_tactics_base.f_powerlist_from_powermap(powermap)
      })
    )
    return output
  }

  /**
   * @function powerlist_from_sectionlist
   * Returns a powerlist from a given sectionlist
   * @param  {sectionlist} sectionlist
   * @return {powerlist}
   */
  static t_powerlist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_powerlist_from_sectionlist = {
    vx_type: nx_tactics_base.t_powerlist_from_sectionlist
  }

  // (func powerlist<-sectionlist)
  static f_powerlist_from_sectionlist(sectionlist) {
    let output = nx_tactics_base.e_powerlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_powerlist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const powerlistlist = nx_tactics_base.f_powerlistlist_from_sectionlist(sectionlist)
        return nx_tactics_base.f_powerlist_from_powerlistlist(powerlistlist)
      })
    )
    return output
  }

  /**
   * @function powerlistlist_from_sectionlist
   * Returns a powerlistlist from a given sectionlist
   * @param  {sectionlist} sections
   * @return {powerlistlist}
   */
  static t_powerlistlist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_powerlistlist_from_sectionlist = {
    vx_type: nx_tactics_base.t_powerlistlist_from_sectionlist
  }

  // (func powerlistlist<-sectionlist)
  static f_powerlistlist_from_sectionlist(sections) {
    let output = nx_tactics_base.e_powerlistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_powerlist, "any-2": nx_tactics_base.t_section, "list-1": nx_tactics_base.t_powerlistlist, "list-2": nx_tactics_base.t_sectionlist},
      sections,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (section) => 
        nx_tactics_base.f_powerlist_from_section(section))
    )
    return output
  }

  /**
   * @function powermap_from_powerlist
   * Returns a powermap from a given powerlist
   * @param  {powerlist} powerlist
   * @return {powermap}
   */
  static t_powermap_from_powerlist = {
    vx_type: vx_core.t_type
  }
  static e_powermap_from_powerlist = {
    vx_type: nx_tactics_base.t_powermap_from_powerlist
  }

  // (func powermap<-powerlist)
  static f_powermap_from_powerlist(powerlist) {
    let output = nx_tactics_base.e_powermap
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_power, "any-2": nx_tactics_base.t_power, "list-2": nx_tactics_base.t_powerlist, "map-1": nx_tactics_base.t_powermap, "struct-2": nx_tactics_base.t_power},
      powerlist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (power) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_power}, power, ":name"))
    )
    return output
  }

  /**
   * @function scenariomap_from_scenariolist
   * Returns a scenariomap from a given scenariolist
   * @param  {scenariolist} ... scenariolist
   * @return {scenariomap}
   */
  static t_scenariomap_from_scenariolist = {
    vx_type: vx_core.t_type
  }
  static e_scenariomap_from_scenariolist = {
    vx_type: nx_tactics_base.t_scenariomap_from_scenariolist
  }

  // (func scenariomap<-scenariolist)
  static f_scenariomap_from_scenariolist(...scenariolist) {
    let output = nx_tactics_base.e_scenariomap
    scenariolist = vx_core.f_new_from_type(nx_tactics_base.t_scenariolist, ...scenariolist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_scenario, "any-2": nx_tactics_base.t_scenario, "list-2": nx_tactics_base.t_scenariolist, "map-1": nx_tactics_base.t_scenariomap, "struct-2": nx_tactics_base.t_scenario},
      scenariolist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (scenario) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_scenario}, scenario, ":name"))
    )
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const subsections = nx_tactics_base.f_sectionlist_from_section(section)
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_sectionlist, "any-2": nx_tactics_base.t_section, "list-2": nx_tactics_base.t_sectionlist},
          subsections,
          vx_core.f_new({"any-1": nx_tactics_base.t_sectionlist}, section),
          vx_core.f_new_from_type(vx_core.t_any_from_reduce, (total, subsection) => 
            vx_core.f_let(
              {"any-1": nx_tactics_base.t_sectionlist},
              [],
              vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const sectionlistlist = nx_tactics_base.f_sectionlistlist_from_sectionlist(sectionlist)
        return vx_collection.f_list_from_list_join({"any-1": nx_tactics_base.t_section, "any-2": nx_tactics_base.t_sectionlist, "list-1": nx_tactics_base.t_sectionlist, "list-2": nx_tactics_base.t_sectionlistlist}, sectionlistlist)
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
    output = vx_collection.f_list_from_list_join({"any-1": nx_tactics_base.t_section, "any-2": nx_tactics_base.t_sectionlist, "list-1": nx_tactics_base.t_sectionlist, "list-2": nx_tactics_base.t_sectionlistlist}, sectionlistlist)
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
      vx_core.f_new_from_type(vx_core.t_any_from_any, (chapter) => 
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
      vx_core.f_new_from_type(vx_core.t_any_from_any, (section) => 
        vx_core.f_let(
          {"any-1": nx_tactics_base.t_sectionlist},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const sublist = nx_tactics_base.f_sectionlist_from_section(section)
            return vx_core.f_new({"any-1": nx_tactics_base.t_sectionlist}, section, sublist)
          })
        ))
    )
    return output
  }

  /**
   * @function sectionmap_from_sectionlist
   * Returns a sectionmap from a given sectionlist
   * @param  {sectionlist} ... sectionlist
   * @return {sectionmap}
   */
  static t_sectionmap_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_sectionmap_from_sectionlist = {
    vx_type: nx_tactics_base.t_sectionmap_from_sectionlist
  }

  // (func sectionmap<-sectionlist)
  static f_sectionmap_from_sectionlist(...sectionlist) {
    let output = nx_tactics_base.e_sectionmap
    sectionlist = vx_core.f_new_from_type(nx_tactics_base.t_sectionlist, ...sectionlist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_section, "any-2": nx_tactics_base.t_section, "list-2": nx_tactics_base.t_sectionlist, "map-1": nx_tactics_base.t_sectionmap, "struct-2": nx_tactics_base.t_section},
      sectionlist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (section) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, section, ":name"))
    )
    return output
  }

  /**
   * @function skilllist_from_section
   * Returns a skilllist from a given section
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
   * Returns a skilllist from a given sectionlist
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const skilllistlist = nx_tactics_base.f_skilllistlist_from_sectionlist(sectionlist)
        return nx_tactics_base.f_skilllist_from_skilllistlist(skilllistlist)
      })
    )
    return output
  }

  /**
   * @function skilllist_from_skilllistlist
   * Returns a skilllist from a given skilllistlist
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
    output = vx_collection.f_list_from_list_join({"any-1": nx_tactics_base.t_skill, "any-2": nx_tactics_base.t_skilllist, "list-1": nx_tactics_base.t_skilllist, "list-2": nx_tactics_base.t_skilllistlist}, skilllistlist)
    return output
  }

  /**
   * @function skilllist_from_skillmap
   * Returns a skilllist from a given skillmap
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
      vx_core.f_new_from_type(vx_core.t_any_from_any, (section) => 
        nx_tactics_base.f_skilllist_from_section(section))
    )
    return output
  }

  /**
   * @function skillmap_from_skilllist
   * Returns a skillmap from a given skilllist
   * @param  {skilllist} ... skilllist
   * @return {skillmap}
   */
  static t_skillmap_from_skilllist = {
    vx_type: vx_core.t_type
  }
  static e_skillmap_from_skilllist = {
    vx_type: nx_tactics_base.t_skillmap_from_skilllist
  }

  // (func skillmap<-skilllist)
  static f_skillmap_from_skilllist(...skilllist) {
    let output = nx_tactics_base.e_skillmap
    skilllist = vx_core.f_new_from_type(nx_tactics_base.t_skilllist, ...skilllist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_skill, "any-2": nx_tactics_base.t_skill, "list-2": nx_tactics_base.t_skilllist, "map-1": nx_tactics_base.t_skillmap, "struct-2": nx_tactics_base.t_skill},
      skilllist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (skill) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_skill}, skill, ":name"))
    )
    return output
  }

  /**
   * @function tactics_from_tactics_booklist
   * Return a ready tactics from a booklist.
   * @param  {tactics} tactics
   * @param  {booklist} booklist
   * @return {tactics}
   */
  static t_tactics_from_tactics_booklist = {
    vx_type: vx_core.t_type
  }
  static e_tactics_from_tactics_booklist = {
    vx_type: nx_tactics_base.t_tactics_from_tactics_booklist
  }

  // (func tactics<-tactics-booklist)
  static f_tactics_from_tactics_booklist(tactics, booklist) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const bookmap = nx_tactics_base.f_bookmap_from_booklist(booklist)
        const chapterlist = nx_tactics_base.f_chapterlist_from_booklist(booklist)
        const chaptermap = nx_tactics_base.f_chaptermap_from_chapterlist(chapterlist)
        const sectionlist = nx_tactics_base.f_sectionlist_all_from_chapterlist(chapterlist)
        const sectionmap = nx_tactics_base.f_sectionmap_from_sectionlist(sectionlist)
        const itemlist = nx_tactics_base.f_itemlist_from_sectionlist(sectionlist)
        const itemmap = nx_tactics_base.f_itemmap_from_itemlist(itemlist)
        const placelist = nx_tactics_base.f_placelist_from_sectionlist(sectionlist)
        const placemap = nx_tactics_base.f_placemap_from_placelist(placelist)
        const powerlist = nx_tactics_base.f_powerlist_from_sectionlist(sectionlist)
        const powermap = nx_tactics_base.f_powermap_from_powerlist(powerlist)
        const skilllist = nx_tactics_base.f_skilllist_from_sectionlist(sectionlist)
        const skillmap = nx_tactics_base.f_skillmap_from_skilllist(skilllist)
        const abilitylist1 = nx_tactics_base.f_abilitylist_from_skilllist(skilllist)
        const abilitylist2 = nx_tactics_base.f_abilitylist_from_powerlist(powerlist)
        const abilitylist3 = vx_core.f_new({"any-1": nx_tactics_base.t_abilitylist}, abilitylist1, abilitylist2)
        const abilitymap = nx_tactics_base.f_abilitymap_from_abilitylist(abilitylist3)
        const unitlist = nx_tactics_base.f_unitlist_from_sectionlist(sectionlist)
        const unitmap = nx_tactics_base.f_unitmap_from_unitlist(unitlist)
        const tacticsbook = vx_core.f_new(
          {"any-1": nx_tactics_base.t_tactics},
          ":abilitymap",
          abilitymap,
          ":bookmap",
          bookmap,
          ":itemmap",
          itemmap,
          ":placemap",
          placemap,
          ":powermap",
          powermap,
          ":scenariomap",
          nx_tactics_base.t_scenariomap,
          ":skillmap",
          skillmap,
          ":unitmap",
          unitmap
        )
        return nx_tactics_base.f_tactics_from_tactics_merge(tactics, tacticsbook)
      })
    )
    return output
  }

  /**
   * @function tactics_from_tactics_merge
   * Returns a tactics with all maps merged with merge.
   * @param  {tactics} tactics
   * @param  {tactics} merge
   * @return {tactics}
   */
  static t_tactics_from_tactics_merge = {
    vx_type: vx_core.t_type
  }
  static e_tactics_from_tactics_merge = {
    vx_type: nx_tactics_base.t_tactics_from_tactics_merge
  }

  // (func tactics<-tactics-merge)
  static f_tactics_from_tactics_merge(tactics, merge) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const abilitymap1 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":abilitymap")
        const abilitymap2 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_tactics}, merge, ":abilitymap")
        const abilitymap3 = vx_core.f_copy(abilitymap1, abilitymap2)
        const bookmap1 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_bookmap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":bookmap")
        const bookmap2 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_bookmap, "struct-2": nx_tactics_base.t_tactics}, merge, ":bookmap")
        const bookmap3 = vx_core.f_copy(bookmap1, bookmap2)
        const itemmap1 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_itemmap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":itemmap")
        const itemmap2 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_itemmap, "struct-2": nx_tactics_base.t_tactics}, merge, ":itemmap")
        const itemmap3 = vx_core.f_copy(itemmap1, itemmap2)
        const placemap1 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_placemap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":placemap")
        const placemap2 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_placemap, "struct-2": nx_tactics_base.t_tactics}, merge, ":placemap")
        const placemap3 = vx_core.f_copy(placemap1, placemap2)
        const powermap1 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_powermap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":powermap")
        const powermap2 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_powermap, "struct-2": nx_tactics_base.t_tactics}, merge, ":powermap")
        const powermap3 = vx_core.f_copy(powermap1, powermap2)
        const scenariomap1 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_scenariomap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":scenariomap")
        const scenariomap2 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_scenariomap, "struct-2": nx_tactics_base.t_tactics}, merge, ":scenariomap")
        const scenariomap3 = vx_core.f_copy(scenariomap1, scenariomap2)
        const skillmap1 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_skillmap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":skillmap")
        const skillmap2 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_skillmap, "struct-2": nx_tactics_base.t_tactics}, merge, ":skillmap")
        const skillmap3 = vx_core.f_copy(skillmap1, skillmap2)
        const unitmap1 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitmap, "struct-2": nx_tactics_base.t_tactics}, tactics, ":unitmap")
        const unitmap2 = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitmap, "struct-2": nx_tactics_base.t_tactics}, merge, ":unitmap")
        const unitmap3 = vx_core.f_copy(unitmap1, unitmap2)
        return vx_core.f_new({"any-1": nx_tactics_base.t_tactics}, ":abilitymap", abilitymap3, ":bookmap", bookmap3, ":itemmap", itemmap3, ":placemap", placemap3, ":powermap", powermap3, ":scenariomap", scenariomap3, ":skillmap", skillmap3, ":unitmap", unitmap3)
      })
    )
    return output
  }

  /**
   * @function unitabilitymap_from_unitabilitylist
   * Returns a unitabilitymap from a unitabilitylist
   * @param  {unitabilitylist} ... unitabilitylist
   * @return {unitabilitymap}
   */
  static t_unitabilitymap_from_unitabilitylist = {
    vx_type: vx_core.t_type
  }
  static e_unitabilitymap_from_unitabilitylist = {
    vx_type: nx_tactics_base.t_unitabilitymap_from_unitabilitylist
  }

  // (func unitabilitymap<-unitabilitylist)
  static f_unitabilitymap_from_unitabilitylist(...unitabilitylist) {
    let output = nx_tactics_base.e_unitabilitymap
    unitabilitylist = vx_core.f_new_from_type(nx_tactics_base.t_unitabilitylist, ...unitabilitylist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_unitability, "any-2": nx_tactics_base.t_unitability, "list-2": nx_tactics_base.t_unitabilitylist, "map-1": nx_tactics_base.t_unitabilitymap},
      unitabilitylist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (unitability) => 
        vx_core.f_let(
          {"any-1": vx_core.t_string},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const ability = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_ability, "struct-2": nx_tactics_base.t_unitability}, unitability, ":ability")
            const name = vx_core.f_if_1(
              {"any-1": vx_core.t_string},
              vx_core.f_is_empty_1(ability),
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitability}, unitability, ":name"),
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_ability}, ability, ":name")
            )
            return name
          })
        ))
    )
    return output
  }

  /**
   * @function unititemmap_from_unititemlist
   * Returns a unititemmap from a unititemlist
   * @param  {unititemlist} ... unititemlist
   * @return {unititemmap}
   */
  static t_unititemmap_from_unititemlist = {
    vx_type: vx_core.t_type
  }
  static e_unititemmap_from_unititemlist = {
    vx_type: nx_tactics_base.t_unititemmap_from_unititemlist
  }

  // (func unititemmap<-unititemlist)
  static f_unititemmap_from_unititemlist(...unititemlist) {
    let output = nx_tactics_base.e_unititemmap
    unititemlist = vx_core.f_new_from_type(nx_tactics_base.t_unititemlist, ...unititemlist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_unititem, "any-2": nx_tactics_base.t_unititem, "list-2": nx_tactics_base.t_unititemlist, "map-1": nx_tactics_base.t_unititemmap},
      unititemlist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (unititem) => 
        vx_core.f_let(
          {"any-1": vx_core.t_string},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const item = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_item, "struct-2": nx_tactics_base.t_unititem}, unititem, ":item")
            const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":name")
            return name
          })
        ))
    )
    return output
  }

  /**
   * @function unitlist_from_section
   * Returns a unitlist from a given unitlistlist
   * @param  {section} section
   * @return {unitlist}
   */
  static t_unitlist_from_section = {
    vx_type: vx_core.t_type
  }
  static e_unitlist_from_section = {
    vx_type: nx_tactics_base.t_unitlist_from_section
  }

  // (func unitlist<-section)
  static f_unitlist_from_section(section) {
    let output = nx_tactics_base.e_unitlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitlist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const secname = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, section, ":name")
        const sec = vx_core.f_copy(section, ":name", secname)
        const unitmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitmap, "struct-2": nx_tactics_base.t_section}, section, ":unitmap")
        return nx_tactics_base.f_unitlist_from_unitmap(unitmap)
      })
    )
    return output
  }

  /**
   * @function unitlist_from_sectionlist
   * Returns a unitlist from a given sectionlist
   * @param  {sectionlist} sectionlist
   * @return {unitlist}
   */
  static t_unitlist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_unitlist_from_sectionlist = {
    vx_type: nx_tactics_base.t_unitlist_from_sectionlist
  }

  // (func unitlist<-sectionlist)
  static f_unitlist_from_sectionlist(sectionlist) {
    let output = nx_tactics_base.e_unitlist
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitlist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const unitlistlist = nx_tactics_base.f_unitlistlist_from_sectionlist(sectionlist)
        return nx_tactics_base.f_unitlist_from_unitlistlist(unitlistlist)
      })
    )
    return output
  }

  /**
   * @function unitlist_from_unitlistlist
   * Returns a unitlist from a given unitlistlist
   * @param  {unitlistlist} unitlistlist
   * @return {unitlist}
   */
  static t_unitlist_from_unitlistlist = {
    vx_type: vx_core.t_type
  }
  static e_unitlist_from_unitlistlist = {
    vx_type: nx_tactics_base.t_unitlist_from_unitlistlist
  }

  // (func unitlist<-unitlistlist)
  static f_unitlist_from_unitlistlist(unitlistlist) {
    let output = nx_tactics_base.e_unitlist
    output = vx_collection.f_list_from_list_join({"any-1": nx_tactics_base.t_unit, "any-2": nx_tactics_base.t_unitlist, "list-1": nx_tactics_base.t_unitlist, "list-2": nx_tactics_base.t_unitlistlist}, unitlistlist)
    return output
  }

  /**
   * @function unitlist_from_unitmap
   * Returns a unitlist from a given unitmap
   * @param  {unitmap} unitmap
   * @return {unitlist}
   */
  static t_unitlist_from_unitmap = {
    vx_type: vx_core.t_type
  }
  static e_unitlist_from_unitmap = {
    vx_type: nx_tactics_base.t_unitlist_from_unitmap
  }

  // (func unitlist<-unitmap)
  static f_unitlist_from_unitmap(unitmap) {
    let output = nx_tactics_base.e_unitlist
    output = vx_core.f_list_from_map({"any-1": nx_tactics_base.t_unit, "any-2": nx_tactics_base.t_unit, "list-1": nx_tactics_base.t_unitlist, "map-2": nx_tactics_base.t_unitmap}, unitmap)
    return output
  }

  /**
   * @function unitlistlist_from_sectionlist
   * Returns a unitlistlist from a given sectionlist
   * @param  {sectionlist} sections
   * @return {unitlistlist}
   */
  static t_unitlistlist_from_sectionlist = {
    vx_type: vx_core.t_type
  }
  static e_unitlistlist_from_sectionlist = {
    vx_type: nx_tactics_base.t_unitlistlist_from_sectionlist
  }

  // (func unitlistlist<-sectionlist)
  static f_unitlistlist_from_sectionlist(sections) {
    let output = nx_tactics_base.e_unitlistlist
    output = vx_core.f_list_from_list_1(
      {"any-1": nx_tactics_base.t_unitlist, "any-2": nx_tactics_base.t_section, "list-1": nx_tactics_base.t_unitlistlist, "list-2": nx_tactics_base.t_sectionlist},
      sections,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (section) => 
        nx_tactics_base.f_unitlist_from_section(section))
    )
    return output
  }

  /**
   * @function unitmap_from_unitlist
   * Returns a unitmap from a given unitlist
   * @param  {unitlist} ... unitlist
   * @return {unitmap}
   */
  static t_unitmap_from_unitlist = {
    vx_type: vx_core.t_type
  }
  static e_unitmap_from_unitlist = {
    vx_type: nx_tactics_base.t_unitmap_from_unitlist
  }

  // (func unitmap<-unitlist)
  static f_unitmap_from_unitlist(...unitlist) {
    let output = nx_tactics_base.e_unitmap
    unitlist = vx_core.f_new_from_type(nx_tactics_base.t_unitlist, ...unitlist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_unit, "any-2": nx_tactics_base.t_unit, "list-2": nx_tactics_base.t_unitlist, "map-1": nx_tactics_base.t_unitmap, "struct-2": nx_tactics_base.t_unit},
      unitlist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (unit) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":name"))
    )
    return output
  }

  /**
   * @function unitpowermap_from_unitpowerlist
   * Returns a unitpowermap from a unitpowerlist
   * @param  {unitpowerlist} ... unitpowerlist
   * @return {unitpowermap}
   */
  static t_unitpowermap_from_unitpowerlist = {
    vx_type: vx_core.t_type
  }
  static e_unitpowermap_from_unitpowerlist = {
    vx_type: nx_tactics_base.t_unitpowermap_from_unitpowerlist
  }

  // (func unitpowermap<-unitpowerlist)
  static f_unitpowermap_from_unitpowerlist(...unitpowerlist) {
    let output = nx_tactics_base.e_unitpowermap
    unitpowerlist = vx_core.f_new_from_type(nx_tactics_base.t_unitpowerlist, ...unitpowerlist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_unitpower, "any-2": nx_tactics_base.t_unitpower, "list-2": nx_tactics_base.t_unitpowerlist, "map-1": nx_tactics_base.t_unitpowermap},
      unitpowerlist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (unitpower) => 
        vx_core.f_let(
          {"any-1": vx_core.t_string},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const power = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_power, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":power")
            const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_power}, power, ":name")
            return name
          })
        ))
    )
    return output
  }

  /**
   * @function unitskillmap_from_unitskilllist
   * Returns a unitskillmap from a unitskilllist
   * @param  {unitskilllist} ... unitskilllist
   * @return {unitskillmap}
   */
  static t_unitskillmap_from_unitskilllist = {
    vx_type: vx_core.t_type
  }
  static e_unitskillmap_from_unitskilllist = {
    vx_type: nx_tactics_base.t_unitskillmap_from_unitskilllist
  }

  // (func unitskillmap<-unitskilllist)
  static f_unitskillmap_from_unitskilllist(...unitskilllist) {
    let output = nx_tactics_base.e_unitskillmap
    unitskilllist = vx_core.f_new_from_type(nx_tactics_base.t_unitskilllist, ...unitskilllist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_unitskill, "any-2": nx_tactics_base.t_unitskill, "list-2": nx_tactics_base.t_unitskilllist, "map-1": nx_tactics_base.t_unitskillmap},
      unitskilllist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (unitskill) => 
        vx_core.f_let(
          {"any-1": vx_core.t_string},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const skill = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_skill, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":skill")
            const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_skill}, skill, ":name")
            return name
          })
        ))
    )
    return output
  }

  /**
   * @function weaknessmap_from_weaknesslist
   * Returns a weaknessmap from a given weaknesslist
   * @param  {weaknesslist} ... weaknesslist
   * @return {weaknessmap}
   */
  static t_weaknessmap_from_weaknesslist = {
    vx_type: vx_core.t_type
  }
  static e_weaknessmap_from_weaknesslist = {
    vx_type: nx_tactics_base.t_weaknessmap_from_weaknesslist
  }

  // (func weaknessmap<-weaknesslist)
  static f_weaknessmap_from_weaknesslist(...weaknesslist) {
    let output = nx_tactics_base.e_weaknessmap
    weaknesslist = vx_core.f_new_from_type(nx_tactics_base.t_weaknesslist, ...weaknesslist)
    output = vx_core.f_map_from_list(
      {"any-1": nx_tactics_base.t_weakness, "any-2": nx_tactics_base.t_weakness, "list-2": nx_tactics_base.t_weaknesslist, "map-1": nx_tactics_base.t_weaknessmap, "struct-2": nx_tactics_base.t_weakness},
      weaknesslist,
      vx_core.f_new_from_type(vx_core.t_any_from_any, (weakness) => 
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_weakness}, weakness, ":name"))
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
      "abilitylist": nx_tactics_base.e_abilitylist,
      "abilitylistlist": nx_tactics_base.e_abilitylistlist,
      "abilitymap": nx_tactics_base.e_abilitymap,
      "book": nx_tactics_base.e_book,
      "booklist": nx_tactics_base.e_booklist,
      "bookmap": nx_tactics_base.e_bookmap,
      "card": nx_tactics_base.e_card,
      "cardback": nx_tactics_base.e_cardback,
      "cardimage": nx_tactics_base.e_cardimage,
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
      "item": nx_tactics_base.e_item,
      "itemlist": nx_tactics_base.e_itemlist,
      "itemlistlist": nx_tactics_base.e_itemlistlist,
      "itemmap": nx_tactics_base.e_itemmap,
      "mind": nx_tactics_base.e_mind,
      "modifier": nx_tactics_base.e_modifier,
      "modifiermap": nx_tactics_base.e_modifiermap,
      "place": nx_tactics_base.e_place,
      "placelist": nx_tactics_base.e_placelist,
      "placelistlist": nx_tactics_base.e_placelistlist,
      "placemap": nx_tactics_base.e_placemap,
      "playingcard": nx_tactics_base.e_playingcard,
      "power": nx_tactics_base.e_power,
      "powerlist": nx_tactics_base.e_powerlist,
      "powerlistlist": nx_tactics_base.e_powerlistlist,
      "powermap": nx_tactics_base.e_powermap,
      "rank": nx_tactics_base.e_rank,
      "ranksuit": nx_tactics_base.e_ranksuit,
      "rating": nx_tactics_base.e_rating,
      "role": nx_tactics_base.e_role,
      "rolemap": nx_tactics_base.e_rolemap,
      "rule": nx_tactics_base.e_rule,
      "rulemap": nx_tactics_base.e_rulemap,
      "scenario": nx_tactics_base.e_scenario,
      "scenariolist": nx_tactics_base.e_scenariolist,
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
      "unitabilitylist": nx_tactics_base.e_unitabilitylist,
      "unitabilitymap": nx_tactics_base.e_unitabilitymap,
      "unititem": nx_tactics_base.e_unititem,
      "unititemlist": nx_tactics_base.e_unititemlist,
      "unititemmap": nx_tactics_base.e_unititemmap,
      "unitlist": nx_tactics_base.e_unitlist,
      "unitlistlist": nx_tactics_base.e_unitlistlist,
      "unitmap": nx_tactics_base.e_unitmap,
      "unitpower": nx_tactics_base.e_unitpower,
      "unitpowerlist": nx_tactics_base.e_unitpowerlist,
      "unitpowermap": nx_tactics_base.e_unitpowermap,
      "unitskill": nx_tactics_base.e_unitskill,
      "unitskilllist": nx_tactics_base.e_unitskilllist,
      "unitskillmap": nx_tactics_base.e_unitskillmap,
      "unitspecialty": nx_tactics_base.e_unitspecialty,
      "unitspecialtymap": nx_tactics_base.e_unitspecialtymap,
      "unitweakness": nx_tactics_base.e_unitweakness,
      "unitweaknessmap": nx_tactics_base.e_unitweaknessmap,
      "weakness": nx_tactics_base.e_weakness,
      "weaknesslist": nx_tactics_base.e_weaknesslist,
      "weaknessmap": nx_tactics_base.e_weaknessmap,
      "abilitylist<-abilitylistlist": nx_tactics_base.e_abilitylist_from_abilitylistlist,
      "abilitylist<-power": nx_tactics_base.e_abilitylist_from_power,
      "abilitylist<-powerlist": nx_tactics_base.e_abilitylist_from_powerlist,
      "abilitylist<-skill": nx_tactics_base.e_abilitylist_from_skill,
      "abilitylist<-skilllist": nx_tactics_base.e_abilitylist_from_skilllist,
      "abilitylistlist<-powerlist": nx_tactics_base.e_abilitylistlist_from_powerlist,
      "abilitylistlist<-skilllist": nx_tactics_base.e_abilitylistlist_from_skilllist,
      "abilitymap<-abilitylist": nx_tactics_base.e_abilitymap_from_abilitylist,
      "abilitymap<-tactics-namelist": nx_tactics_base.e_abilitymap_from_tactics_namelist,
      "bookmap<-booklist": nx_tactics_base.e_bookmap_from_booklist,
      "cardimage<-card": nx_tactics_base.e_cardimage_from_card,
      "cardlist-copy<-card-num": nx_tactics_base.e_cardlist_copy_from_card_num,
      "cardmap-copy<-card-num": nx_tactics_base.e_cardmap_copy_from_card_num,
      "cardmap<-bookmap": nx_tactics_base.e_cardmap_from_bookmap,
      "cardmap<-cardlist": nx_tactics_base.e_cardmap_from_cardlist,
      "chapterlist<-book": nx_tactics_base.e_chapterlist_from_book,
      "chapterlist<-booklist": nx_tactics_base.e_chapterlist_from_booklist,
      "chapterlist<-chapterlistlist": nx_tactics_base.e_chapterlist_from_chapterlistlist,
      "chapterlistlist<-booklist": nx_tactics_base.e_chapterlistlist_from_booklist,
      "chaptermap<-chapterlist": nx_tactics_base.e_chaptermap_from_chapterlist,
      "itemlist<-itemlistlist": nx_tactics_base.e_itemlist_from_itemlistlist,
      "itemlist<-itemmap": nx_tactics_base.e_itemlist_from_itemmap,
      "itemlist<-section": nx_tactics_base.e_itemlist_from_section,
      "itemlist<-sectionlist": nx_tactics_base.e_itemlist_from_sectionlist,
      "itemlistlist<-sectionlist": nx_tactics_base.e_itemlistlist_from_sectionlist,
      "itemmap<-itemlist": nx_tactics_base.e_itemmap_from_itemlist,
      "name<-chapter": nx_tactics_base.e_name_from_chapter,
      "placelist<-placelistlist": nx_tactics_base.e_placelist_from_placelistlist,
      "placelist<-placemap": nx_tactics_base.e_placelist_from_placemap,
      "placelist<-section": nx_tactics_base.e_placelist_from_section,
      "placelist<-sectionlist": nx_tactics_base.e_placelist_from_sectionlist,
      "placelistlist<-sectionlist": nx_tactics_base.e_placelistlist_from_sectionlist,
      "placemap<-placelist": nx_tactics_base.e_placemap_from_placelist,
      "powerlist<-powerlistlist": nx_tactics_base.e_powerlist_from_powerlistlist,
      "powerlist<-powermap": nx_tactics_base.e_powerlist_from_powermap,
      "powerlist<-section": nx_tactics_base.e_powerlist_from_section,
      "powerlist<-sectionlist": nx_tactics_base.e_powerlist_from_sectionlist,
      "powerlistlist<-sectionlist": nx_tactics_base.e_powerlistlist_from_sectionlist,
      "powermap<-powerlist": nx_tactics_base.e_powermap_from_powerlist,
      "scenariomap<-scenariolist": nx_tactics_base.e_scenariomap_from_scenariolist,
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
      "tactics<-tactics-booklist": nx_tactics_base.e_tactics_from_tactics_booklist,
      "tactics<-tactics-merge": nx_tactics_base.e_tactics_from_tactics_merge,
      "unitabilitymap<-unitabilitylist": nx_tactics_base.e_unitabilitymap_from_unitabilitylist,
      "unititemmap<-unititemlist": nx_tactics_base.e_unititemmap_from_unititemlist,
      "unitlist<-section": nx_tactics_base.e_unitlist_from_section,
      "unitlist<-sectionlist": nx_tactics_base.e_unitlist_from_sectionlist,
      "unitlist<-unitlistlist": nx_tactics_base.e_unitlist_from_unitlistlist,
      "unitlist<-unitmap": nx_tactics_base.e_unitlist_from_unitmap,
      "unitlistlist<-sectionlist": nx_tactics_base.e_unitlistlist_from_sectionlist,
      "unitmap<-unitlist": nx_tactics_base.e_unitmap_from_unitlist,
      "unitpowermap<-unitpowerlist": nx_tactics_base.e_unitpowermap_from_unitpowerlist,
      "unitskillmap<-unitskilllist": nx_tactics_base.e_unitskillmap_from_unitskilllist,
      "weaknessmap<-weaknesslist": nx_tactics_base.e_weaknessmap_from_weaknesslist
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "abilitylist<-abilitylistlist": nx_tactics_base.t_abilitylist_from_abilitylistlist,
      "abilitylist<-power": nx_tactics_base.t_abilitylist_from_power,
      "abilitylist<-powerlist": nx_tactics_base.t_abilitylist_from_powerlist,
      "abilitylist<-skill": nx_tactics_base.t_abilitylist_from_skill,
      "abilitylist<-skilllist": nx_tactics_base.t_abilitylist_from_skilllist,
      "abilitylistlist<-powerlist": nx_tactics_base.t_abilitylistlist_from_powerlist,
      "abilitylistlist<-skilllist": nx_tactics_base.t_abilitylistlist_from_skilllist,
      "abilitymap<-abilitylist": nx_tactics_base.t_abilitymap_from_abilitylist,
      "abilitymap<-tactics-namelist": nx_tactics_base.t_abilitymap_from_tactics_namelist,
      "bookmap<-booklist": nx_tactics_base.t_bookmap_from_booklist,
      "cardimage<-card": nx_tactics_base.t_cardimage_from_card,
      "cardlist-copy<-card-num": nx_tactics_base.t_cardlist_copy_from_card_num,
      "cardmap-copy<-card-num": nx_tactics_base.t_cardmap_copy_from_card_num,
      "cardmap<-bookmap": nx_tactics_base.t_cardmap_from_bookmap,
      "cardmap<-cardlist": nx_tactics_base.t_cardmap_from_cardlist,
      "chapterlist<-book": nx_tactics_base.t_chapterlist_from_book,
      "chapterlist<-booklist": nx_tactics_base.t_chapterlist_from_booklist,
      "chapterlist<-chapterlistlist": nx_tactics_base.t_chapterlist_from_chapterlistlist,
      "chapterlistlist<-booklist": nx_tactics_base.t_chapterlistlist_from_booklist,
      "chaptermap<-chapterlist": nx_tactics_base.t_chaptermap_from_chapterlist,
      "itemlist<-itemlistlist": nx_tactics_base.t_itemlist_from_itemlistlist,
      "itemlist<-itemmap": nx_tactics_base.t_itemlist_from_itemmap,
      "itemlist<-section": nx_tactics_base.t_itemlist_from_section,
      "itemlist<-sectionlist": nx_tactics_base.t_itemlist_from_sectionlist,
      "itemlistlist<-sectionlist": nx_tactics_base.t_itemlistlist_from_sectionlist,
      "itemmap<-itemlist": nx_tactics_base.t_itemmap_from_itemlist,
      "name<-chapter": nx_tactics_base.t_name_from_chapter,
      "placelist<-placelistlist": nx_tactics_base.t_placelist_from_placelistlist,
      "placelist<-placemap": nx_tactics_base.t_placelist_from_placemap,
      "placelist<-section": nx_tactics_base.t_placelist_from_section,
      "placelist<-sectionlist": nx_tactics_base.t_placelist_from_sectionlist,
      "placelistlist<-sectionlist": nx_tactics_base.t_placelistlist_from_sectionlist,
      "placemap<-placelist": nx_tactics_base.t_placemap_from_placelist,
      "powerlist<-powerlistlist": nx_tactics_base.t_powerlist_from_powerlistlist,
      "powerlist<-powermap": nx_tactics_base.t_powerlist_from_powermap,
      "powerlist<-section": nx_tactics_base.t_powerlist_from_section,
      "powerlist<-sectionlist": nx_tactics_base.t_powerlist_from_sectionlist,
      "powerlistlist<-sectionlist": nx_tactics_base.t_powerlistlist_from_sectionlist,
      "powermap<-powerlist": nx_tactics_base.t_powermap_from_powerlist,
      "scenariomap<-scenariolist": nx_tactics_base.t_scenariomap_from_scenariolist,
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
      "tactics<-tactics-booklist": nx_tactics_base.t_tactics_from_tactics_booklist,
      "tactics<-tactics-merge": nx_tactics_base.t_tactics_from_tactics_merge,
      "unitabilitymap<-unitabilitylist": nx_tactics_base.t_unitabilitymap_from_unitabilitylist,
      "unititemmap<-unititemlist": nx_tactics_base.t_unititemmap_from_unititemlist,
      "unitlist<-section": nx_tactics_base.t_unitlist_from_section,
      "unitlist<-sectionlist": nx_tactics_base.t_unitlist_from_sectionlist,
      "unitlist<-unitlistlist": nx_tactics_base.t_unitlist_from_unitlistlist,
      "unitlist<-unitmap": nx_tactics_base.t_unitlist_from_unitmap,
      "unitlistlist<-sectionlist": nx_tactics_base.t_unitlistlist_from_sectionlist,
      "unitmap<-unitlist": nx_tactics_base.t_unitmap_from_unitlist,
      "unitpowermap<-unitpowerlist": nx_tactics_base.t_unitpowermap_from_unitpowerlist,
      "unitskillmap<-unitskilllist": nx_tactics_base.t_unitskillmap_from_unitskilllist,
      "weaknessmap<-weaknesslist": nx_tactics_base.t_weaknessmap_from_weaknesslist
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "ability": nx_tactics_base.t_ability,
      "abilitylist": nx_tactics_base.t_abilitylist,
      "abilitylistlist": nx_tactics_base.t_abilitylistlist,
      "abilitymap": nx_tactics_base.t_abilitymap,
      "book": nx_tactics_base.t_book,
      "booklist": nx_tactics_base.t_booklist,
      "bookmap": nx_tactics_base.t_bookmap,
      "card": nx_tactics_base.t_card,
      "cardback": nx_tactics_base.t_cardback,
      "cardimage": nx_tactics_base.t_cardimage,
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
      "item": nx_tactics_base.t_item,
      "itemlist": nx_tactics_base.t_itemlist,
      "itemlistlist": nx_tactics_base.t_itemlistlist,
      "itemmap": nx_tactics_base.t_itemmap,
      "mind": nx_tactics_base.t_mind,
      "modifier": nx_tactics_base.t_modifier,
      "modifiermap": nx_tactics_base.t_modifiermap,
      "place": nx_tactics_base.t_place,
      "placelist": nx_tactics_base.t_placelist,
      "placelistlist": nx_tactics_base.t_placelistlist,
      "placemap": nx_tactics_base.t_placemap,
      "playingcard": nx_tactics_base.t_playingcard,
      "power": nx_tactics_base.t_power,
      "powerlist": nx_tactics_base.t_powerlist,
      "powerlistlist": nx_tactics_base.t_powerlistlist,
      "powermap": nx_tactics_base.t_powermap,
      "rank": nx_tactics_base.t_rank,
      "ranksuit": nx_tactics_base.t_ranksuit,
      "rating": nx_tactics_base.t_rating,
      "role": nx_tactics_base.t_role,
      "rolemap": nx_tactics_base.t_rolemap,
      "rule": nx_tactics_base.t_rule,
      "rulemap": nx_tactics_base.t_rulemap,
      "scenario": nx_tactics_base.t_scenario,
      "scenariolist": nx_tactics_base.t_scenariolist,
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
      "unitabilitylist": nx_tactics_base.t_unitabilitylist,
      "unitabilitymap": nx_tactics_base.t_unitabilitymap,
      "unititem": nx_tactics_base.t_unititem,
      "unititemlist": nx_tactics_base.t_unititemlist,
      "unititemmap": nx_tactics_base.t_unititemmap,
      "unitlist": nx_tactics_base.t_unitlist,
      "unitlistlist": nx_tactics_base.t_unitlistlist,
      "unitmap": nx_tactics_base.t_unitmap,
      "unitpower": nx_tactics_base.t_unitpower,
      "unitpowerlist": nx_tactics_base.t_unitpowerlist,
      "unitpowermap": nx_tactics_base.t_unitpowermap,
      "unitskill": nx_tactics_base.t_unitskill,
      "unitskilllist": nx_tactics_base.t_unitskilllist,
      "unitskillmap": nx_tactics_base.t_unitskillmap,
      "unitspecialty": nx_tactics_base.t_unitspecialty,
      "unitspecialtymap": nx_tactics_base.t_unitspecialtymap,
      "unitweakness": nx_tactics_base.t_unitweakness,
      "unitweaknessmap": nx_tactics_base.t_unitweaknessmap,
      "weakness": nx_tactics_base.t_weakness,
      "weaknesslist": nx_tactics_base.t_weaknesslist,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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

    // (type abilitylistlist)
    nx_tactics_base.t_abilitylistlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_abilitylistlist['vx_value'] = {
      name          : "abilitylistlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_abilitylist],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_abilitylistlist['vx_type'] = nx_tactics_base.t_abilitylistlist

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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
        "multi": false
      }
    }
    nx_tactics_base.e_card['vx_type'] = nx_tactics_base.t_card
    nx_tactics_base.e_card['vx_value'] = {}

    // (type cardback)
    nx_tactics_base.t_cardback['vx_type'] = vx_core.t_type
    nx_tactics_base.t_cardback['vx_value'] = {
      name          : "cardback",
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
        "multi": false
      }
    }
    nx_tactics_base.e_cardback['vx_type'] = nx_tactics_base.t_cardback
    nx_tactics_base.e_cardback['vx_value'] = {}

    // (type cardimage)
    nx_tactics_base.t_cardimage['vx_type'] = vx_core.t_type
    nx_tactics_base.t_cardimage['vx_value'] = {
      name          : "cardimage",
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
    nx_tactics_base.e_cardimage['vx_type'] = nx_tactics_base.t_cardimage
    nx_tactics_base.e_cardimage['vx_value'] = {}

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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "move": {
          "name" : "move",
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
        "armor": {
          "name" : "armor",
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
        "speed": {
          "name" : "speed",
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

    // (type itemlistlist)
    nx_tactics_base.t_itemlistlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_itemlistlist['vx_value'] = {
      name          : "itemlistlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_itemlist],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_itemlistlist['vx_type'] = nx_tactics_base.t_itemlistlist

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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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

    // (type place)
    nx_tactics_base.t_place['vx_type'] = vx_core.t_type
    nx_tactics_base.t_place['vx_value'] = {
      name          : "place",
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "placemap": {
          "name" : "placemap",
          "type" : nx_tactics_base.t_placemap,
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
    nx_tactics_base.e_place['vx_type'] = nx_tactics_base.t_place
    nx_tactics_base.e_place['vx_value'] = {}

    // (type placelist)
    nx_tactics_base.t_placelist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_placelist['vx_value'] = {
      name          : "placelist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_place],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_placelist['vx_type'] = nx_tactics_base.t_placelist

    // (type placelistlist)
    nx_tactics_base.t_placelistlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_placelistlist['vx_value'] = {
      name          : "placelistlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_placelist],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_placelistlist['vx_type'] = nx_tactics_base.t_placelistlist

    // (type placemap)
    nx_tactics_base.t_placemap['vx_type'] = vx_core.t_type
    nx_tactics_base.t_placemap['vx_value'] = {
      name          : "placemap",
      pkgname       : "nx/tactics/base",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_place],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_placemap['vx_type'] = nx_tactics_base.t_placemap
    nx_tactics_base.e_placemap['vx_value'] = {}

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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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

    // (type powerlistlist)
    nx_tactics_base.t_powerlistlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_powerlistlist['vx_value'] = {
      name          : "powerlistlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_powerlist],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_powerlistlist['vx_type'] = nx_tactics_base.t_powerlistlist

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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "modifiermap": {
          "name" : "modifiermap",
          "type" : nx_tactics_base.t_modifiermap,
          "multi": false
        },
        "placemap": {
          "name" : "placemap",
          "type" : nx_tactics_base.t_placemap,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "placemap": {
          "name" : "placemap",
          "type" : nx_tactics_base.t_placemap,
          "multi": false
        },
        "powermap": {
          "name" : "powermap",
          "type" : nx_tactics_base.t_powermap,
          "multi": false
        },
        "scenariomap": {
          "name" : "scenariomap",
          "type" : nx_tactics_base.t_scenariomap,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "move": {
          "name" : "move",
          "type" : vx_core.t_string,
          "multi": false
        },
        "shadow": {
          "name" : "shadow",
          "type" : vx_core.t_string,
          "multi": false
        },
        "conscience": {
          "name" : "conscience",
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
        "age": {
          "name" : "age",
          "type" : vx_core.t_int,
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
        "gender": {
          "name" : "gender",
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
        "race": {
          "name" : "race",
          "type" : vx_core.t_string,
          "multi": false
        },
        "range": {
          "name" : "range",
          "type" : vx_core.t_string,
          "multi": false
        },
        "speed": {
          "name" : "speed",
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
        "ability": {
          "name" : "ability",
          "type" : nx_tactics_base.t_ability,
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

    // (type unitabilitylist)
    nx_tactics_base.t_unitabilitylist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitabilitylist['vx_value'] = {
      name          : "unitabilitylist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
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
    nx_tactics_base.e_unitabilitylist['vx_type'] = nx_tactics_base.t_unitabilitylist

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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "item": {
          "name" : "item",
          "type" : nx_tactics_base.t_item,
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

    // (type unititemlist)
    nx_tactics_base.t_unititemlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unititemlist['vx_value'] = {
      name          : "unititemlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
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
    nx_tactics_base.e_unititemlist['vx_type'] = nx_tactics_base.t_unititemlist

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

    // (type unitlistlist)
    nx_tactics_base.t_unitlistlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitlistlist['vx_value'] = {
      name          : "unitlistlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [nx_tactics_base.t_unitlist],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    nx_tactics_base.e_unitlistlist['vx_type'] = nx_tactics_base.t_unitlistlist

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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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

    // (type unitpowerlist)
    nx_tactics_base.t_unitpowerlist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitpowerlist['vx_value'] = {
      name          : "unitpowerlist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
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
    nx_tactics_base.e_unitpowerlist['vx_type'] = nx_tactics_base.t_unitpowerlist

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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        "level": {
          "name" : "level",
          "type" : vx_core.t_string,
          "multi": false
        },
        "powerlevel": {
          "name" : "powerlevel",
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

    // (type unitskilllist)
    nx_tactics_base.t_unitskilllist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_unitskilllist['vx_value'] = {
      name          : "unitskilllist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
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
    nx_tactics_base.e_unitskilllist['vx_type'] = nx_tactics_base.t_unitskilllist

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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
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
        "id": {
          "name" : "id",
          "type" : vx_core.t_string,
          "multi": false
        },
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
        "imgmirror": {
          "name" : "imgmirror",
          "type" : vx_core.t_boolean,
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
        }
      },
      proplast      : {
        "name" : "ranksuit",
        "type" : nx_tactics_base.t_ranksuit,
        "multi": false
      }
    }
    nx_tactics_base.e_weakness['vx_type'] = nx_tactics_base.t_weakness
    nx_tactics_base.e_weakness['vx_value'] = {}

    // (type weaknesslist)
    nx_tactics_base.t_weaknesslist['vx_type'] = vx_core.t_type
    nx_tactics_base.t_weaknesslist['vx_value'] = {
      name          : "weaknesslist",
      pkgname       : "nx/tactics/base",
      extends       : ":list",
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
    nx_tactics_base.e_weaknesslist['vx_type'] = nx_tactics_base.t_weaknesslist

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

    // (func abilitylist<-abilitylistlist)
    nx_tactics_base.t_abilitylist_from_abilitylistlist['vx_value'] = {
      name          : "abilitylist<-abilitylistlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_abilitylist_from_abilitylistlist
    }

    // (func abilitylist<-power)
    nx_tactics_base.t_abilitylist_from_power['vx_value'] = {
      name          : "abilitylist<-power",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_abilitylist_from_power
    }

    // (func abilitylist<-powerlist)
    nx_tactics_base.t_abilitylist_from_powerlist['vx_value'] = {
      name          : "abilitylist<-powerlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_abilitylist_from_powerlist
    }

    // (func abilitylist<-skill)
    nx_tactics_base.t_abilitylist_from_skill['vx_value'] = {
      name          : "abilitylist<-skill",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_abilitylist_from_skill
    }

    // (func abilitylist<-skilllist)
    nx_tactics_base.t_abilitylist_from_skilllist['vx_value'] = {
      name          : "abilitylist<-skilllist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_abilitylist_from_skilllist
    }

    // (func abilitylistlist<-powerlist)
    nx_tactics_base.t_abilitylistlist_from_powerlist['vx_value'] = {
      name          : "abilitylistlist<-powerlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_abilitylistlist_from_powerlist
    }

    // (func abilitylistlist<-skilllist)
    nx_tactics_base.t_abilitylistlist_from_skilllist['vx_value'] = {
      name          : "abilitylistlist<-skilllist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_abilitylistlist_from_skilllist
    }

    // (func abilitymap<-abilitylist)
    nx_tactics_base.t_abilitymap_from_abilitylist['vx_value'] = {
      name          : "abilitymap<-abilitylist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_abilitymap_from_abilitylist
    }

    // (func abilitymap<-tactics-namelist)
    nx_tactics_base.t_abilitymap_from_tactics_namelist['vx_value'] = {
      name          : "abilitymap<-tactics-namelist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_abilitymap_from_tactics_namelist
    }

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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_base.f_bookmap_from_booklist
    }

    // (func cardimage<-card)
    nx_tactics_base.t_cardimage_from_card['vx_value'] = {
      name          : "cardimage<-card",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_cardimage_from_card
    }

    // (func cardlist-copy<-card-num)
    nx_tactics_base.t_cardlist_copy_from_card_num['vx_value'] = {
      name          : "cardlist-copy<-card-num",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_cardlist_copy_from_card_num
    }

    // (func cardmap-copy<-card-num)
    nx_tactics_base.t_cardmap_copy_from_card_num['vx_value'] = {
      name          : "cardmap-copy<-card-num",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_cardmap_copy_from_card_num
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_base.f_chaptermap_from_chapterlist
    }

    // (func itemlist<-itemlistlist)
    nx_tactics_base.t_itemlist_from_itemlistlist['vx_value'] = {
      name          : "itemlist<-itemlistlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_itemlist_from_itemlistlist
    }

    // (func itemlist<-itemmap)
    nx_tactics_base.t_itemlist_from_itemmap['vx_value'] = {
      name          : "itemlist<-itemmap",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_itemlist_from_itemmap
    }

    // (func itemlist<-section)
    nx_tactics_base.t_itemlist_from_section['vx_value'] = {
      name          : "itemlist<-section",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_itemlist_from_section
    }

    // (func itemlist<-sectionlist)
    nx_tactics_base.t_itemlist_from_sectionlist['vx_value'] = {
      name          : "itemlist<-sectionlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_itemlist_from_sectionlist
    }

    // (func itemlistlist<-sectionlist)
    nx_tactics_base.t_itemlistlist_from_sectionlist['vx_value'] = {
      name          : "itemlistlist<-sectionlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_itemlistlist_from_sectionlist
    }

    // (func itemmap<-itemlist)
    nx_tactics_base.t_itemmap_from_itemlist['vx_value'] = {
      name          : "itemmap<-itemlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_itemmap_from_itemlist
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_base.f_name_from_chapter
    }

    // (func placelist<-placelistlist)
    nx_tactics_base.t_placelist_from_placelistlist['vx_value'] = {
      name          : "placelist<-placelistlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_placelist_from_placelistlist
    }

    // (func placelist<-placemap)
    nx_tactics_base.t_placelist_from_placemap['vx_value'] = {
      name          : "placelist<-placemap",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_placelist_from_placemap
    }

    // (func placelist<-section)
    nx_tactics_base.t_placelist_from_section['vx_value'] = {
      name          : "placelist<-section",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_placelist_from_section
    }

    // (func placelist<-sectionlist)
    nx_tactics_base.t_placelist_from_sectionlist['vx_value'] = {
      name          : "placelist<-sectionlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_placelist_from_sectionlist
    }

    // (func placelistlist<-sectionlist)
    nx_tactics_base.t_placelistlist_from_sectionlist['vx_value'] = {
      name          : "placelistlist<-sectionlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_placelistlist_from_sectionlist
    }

    // (func placemap<-placelist)
    nx_tactics_base.t_placemap_from_placelist['vx_value'] = {
      name          : "placemap<-placelist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_placemap_from_placelist
    }

    // (func powerlist<-powerlistlist)
    nx_tactics_base.t_powerlist_from_powerlistlist['vx_value'] = {
      name          : "powerlist<-powerlistlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_powerlist_from_powerlistlist
    }

    // (func powerlist<-powermap)
    nx_tactics_base.t_powerlist_from_powermap['vx_value'] = {
      name          : "powerlist<-powermap",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_powerlist_from_powermap
    }

    // (func powerlist<-section)
    nx_tactics_base.t_powerlist_from_section['vx_value'] = {
      name          : "powerlist<-section",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_powerlist_from_section
    }

    // (func powerlist<-sectionlist)
    nx_tactics_base.t_powerlist_from_sectionlist['vx_value'] = {
      name          : "powerlist<-sectionlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_powerlist_from_sectionlist
    }

    // (func powerlistlist<-sectionlist)
    nx_tactics_base.t_powerlistlist_from_sectionlist['vx_value'] = {
      name          : "powerlistlist<-sectionlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_powerlistlist_from_sectionlist
    }

    // (func powermap<-powerlist)
    nx_tactics_base.t_powermap_from_powerlist['vx_value'] = {
      name          : "powermap<-powerlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_powermap_from_powerlist
    }

    // (func scenariomap<-scenariolist)
    nx_tactics_base.t_scenariomap_from_scenariolist['vx_value'] = {
      name          : "scenariomap<-scenariolist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_scenariomap_from_scenariolist
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_base.f_skillmap_from_skilllist
    }

    // (func tactics<-tactics-booklist)
    nx_tactics_base.t_tactics_from_tactics_booklist['vx_value'] = {
      name          : "tactics<-tactics-booklist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_tactics_from_tactics_booklist
    }

    // (func tactics<-tactics-merge)
    nx_tactics_base.t_tactics_from_tactics_merge['vx_value'] = {
      name          : "tactics<-tactics-merge",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_tactics_from_tactics_merge
    }

    // (func unitabilitymap<-unitabilitylist)
    nx_tactics_base.t_unitabilitymap_from_unitabilitylist['vx_value'] = {
      name          : "unitabilitymap<-unitabilitylist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unitabilitymap_from_unitabilitylist
    }

    // (func unititemmap<-unititemlist)
    nx_tactics_base.t_unititemmap_from_unititemlist['vx_value'] = {
      name          : "unititemmap<-unititemlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unititemmap_from_unititemlist
    }

    // (func unitlist<-section)
    nx_tactics_base.t_unitlist_from_section['vx_value'] = {
      name          : "unitlist<-section",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unitlist_from_section
    }

    // (func unitlist<-sectionlist)
    nx_tactics_base.t_unitlist_from_sectionlist['vx_value'] = {
      name          : "unitlist<-sectionlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unitlist_from_sectionlist
    }

    // (func unitlist<-unitlistlist)
    nx_tactics_base.t_unitlist_from_unitlistlist['vx_value'] = {
      name          : "unitlist<-unitlistlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unitlist_from_unitlistlist
    }

    // (func unitlist<-unitmap)
    nx_tactics_base.t_unitlist_from_unitmap['vx_value'] = {
      name          : "unitlist<-unitmap",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unitlist_from_unitmap
    }

    // (func unitlistlist<-sectionlist)
    nx_tactics_base.t_unitlistlist_from_sectionlist['vx_value'] = {
      name          : "unitlistlist<-sectionlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unitlistlist_from_sectionlist
    }

    // (func unitmap<-unitlist)
    nx_tactics_base.t_unitmap_from_unitlist['vx_value'] = {
      name          : "unitmap<-unitlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unitmap_from_unitlist
    }

    // (func unitpowermap<-unitpowerlist)
    nx_tactics_base.t_unitpowermap_from_unitpowerlist['vx_value'] = {
      name          : "unitpowermap<-unitpowerlist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unitpowermap_from_unitpowerlist
    }

    // (func unitskillmap<-unitskilllist)
    nx_tactics_base.t_unitskillmap_from_unitskilllist['vx_value'] = {
      name          : "unitskillmap<-unitskilllist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_unitskillmap_from_unitskilllist
    }

    // (func weaknessmap<-weaknesslist)
    nx_tactics_base.t_weaknessmap_from_weaknesslist['vx_value'] = {
      name          : "weaknessmap<-weaknesslist",
      pkgname       : "nx/tactics/base",
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
      fn            : nx_tactics_base.f_weaknessmap_from_weaknesslist
    }

    // (const rank-ace)
    Object.assign(nx_tactics_base.c_rank_ace, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Ace", ":titles", "A"))

    // (const rank-eight)
    Object.assign(nx_tactics_base.c_rank_eight, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Eight", ":titles", "8"))

    // (const rank-five)
    Object.assign(nx_tactics_base.c_rank_five, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Five", ":titles", "5"))

    // (const rank-four)
    Object.assign(nx_tactics_base.c_rank_four, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Four", ":titles", "4"))

    // (const rank-jack)
    Object.assign(nx_tactics_base.c_rank_jack, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Jack", ":titles", "J"))

    // (const rank-joker)
    Object.assign(nx_tactics_base.c_rank_joker, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Wild", ":titles", "W"))

    // (const rank-king)
    Object.assign(nx_tactics_base.c_rank_king, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "King", ":titles", "K"))

    // (const rank-nine)
    Object.assign(nx_tactics_base.c_rank_nine, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Nine", ":titles", "9"))

    // (const rank-queen)
    Object.assign(nx_tactics_base.c_rank_queen, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Queen", ":titles", "Q"))

    // (const rank-seven)
    Object.assign(nx_tactics_base.c_rank_seven, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Seven", ":titles", "7"))

    // (const rank-six)
    Object.assign(nx_tactics_base.c_rank_six, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Six", ":titles", "6"))

    // (const rank-ten)
    Object.assign(nx_tactics_base.c_rank_ten, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Ten", ":titles", "10"))

    // (const rank-three)
    Object.assign(nx_tactics_base.c_rank_three, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Three", ":titles", "3"))

    // (const rank-two)
    Object.assign(nx_tactics_base.c_rank_two, vx_core.f_new({"any-1": nx_tactics_base.t_rank}, ":name", "Two", ":titles", "2"))

    // (const ranksuit-2c)
    Object.assign(nx_tactics_base.c_ranksuit_2c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_two,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-2d)
    Object.assign(nx_tactics_base.c_ranksuit_2d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_two,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-2h)
    Object.assign(nx_tactics_base.c_ranksuit_2h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_two,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-2s)
    Object.assign(nx_tactics_base.c_ranksuit_2s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_two,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-3c)
    Object.assign(nx_tactics_base.c_ranksuit_3c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_three,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-3d)
    Object.assign(nx_tactics_base.c_ranksuit_3d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_three,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-3h)
    Object.assign(nx_tactics_base.c_ranksuit_3h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_three,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-3s)
    Object.assign(nx_tactics_base.c_ranksuit_3s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_three,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-4c)
    Object.assign(nx_tactics_base.c_ranksuit_4c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_four,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-4d)
    Object.assign(nx_tactics_base.c_ranksuit_4d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_four,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-4h)
    Object.assign(nx_tactics_base.c_ranksuit_4h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_four,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-4s)
    Object.assign(nx_tactics_base.c_ranksuit_4s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_four,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-5c)
    Object.assign(nx_tactics_base.c_ranksuit_5c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_five,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-5d)
    Object.assign(nx_tactics_base.c_ranksuit_5d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_five,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-5h)
    Object.assign(nx_tactics_base.c_ranksuit_5h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_five,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-5s)
    Object.assign(nx_tactics_base.c_ranksuit_5s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_five,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-6c)
    Object.assign(nx_tactics_base.c_ranksuit_6c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_six,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-6d)
    Object.assign(nx_tactics_base.c_ranksuit_6d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_six,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-6h)
    Object.assign(nx_tactics_base.c_ranksuit_6h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_six,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-6s)
    Object.assign(nx_tactics_base.c_ranksuit_6s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_six,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-7c)
    Object.assign(nx_tactics_base.c_ranksuit_7c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_seven,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-7d)
    Object.assign(nx_tactics_base.c_ranksuit_7d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_seven,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-7h)
    Object.assign(nx_tactics_base.c_ranksuit_7h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_seven,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-7s)
    Object.assign(nx_tactics_base.c_ranksuit_7s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_seven,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-8c)
    Object.assign(nx_tactics_base.c_ranksuit_8c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_eight,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-8d)
    Object.assign(nx_tactics_base.c_ranksuit_8d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_eight,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-8h)
    Object.assign(nx_tactics_base.c_ranksuit_8h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_eight,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-8s)
    Object.assign(nx_tactics_base.c_ranksuit_8s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_eight,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-9c)
    Object.assign(nx_tactics_base.c_ranksuit_9c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_nine,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-9d)
    Object.assign(nx_tactics_base.c_ranksuit_9d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_nine,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-9h)
    Object.assign(nx_tactics_base.c_ranksuit_9h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_nine,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-9s)
    Object.assign(nx_tactics_base.c_ranksuit_9s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_nine,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-ac)
    Object.assign(nx_tactics_base.c_ranksuit_ac, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-ad)
    Object.assign(nx_tactics_base.c_ranksuit_ad, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-ah)
    Object.assign(nx_tactics_base.c_ranksuit_ah, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-as)
    Object.assign(nx_tactics_base.c_ranksuit_as, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-jc)
    Object.assign(nx_tactics_base.c_ranksuit_jc, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_jack,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-jd)
    Object.assign(nx_tactics_base.c_ranksuit_jd, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_jack,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-jh)
    Object.assign(nx_tactics_base.c_ranksuit_jh, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_jack,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-jokerblack)
    Object.assign(nx_tactics_base.c_ranksuit_jokerblack, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_joker,
      ":suit",
      nx_tactics_base.c_suit_black
    ))

    // (const ranksuit-jokerred)
    Object.assign(nx_tactics_base.c_ranksuit_jokerred, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_joker,
      ":suit",
      nx_tactics_base.c_suit_red
    ))

    // (const ranksuit-js)
    Object.assign(nx_tactics_base.c_ranksuit_js, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_jack,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-kc)
    Object.assign(nx_tactics_base.c_ranksuit_kc, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_king,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-kd)
    Object.assign(nx_tactics_base.c_ranksuit_kd, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_king,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-kh)
    Object.assign(nx_tactics_base.c_ranksuit_kh, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_king,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-ks)
    Object.assign(nx_tactics_base.c_ranksuit_ks, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_king,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-qc)
    Object.assign(nx_tactics_base.c_ranksuit_qc, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_queen,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-qd)
    Object.assign(nx_tactics_base.c_ranksuit_qd, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_queen,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-qh)
    Object.assign(nx_tactics_base.c_ranksuit_qh, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_queen,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-qs)
    Object.assign(nx_tactics_base.c_ranksuit_qs, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_queen,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const ranksuit-tc)
    Object.assign(nx_tactics_base.c_ranksuit_tc, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_ten,
      ":suit",
      nx_tactics_base.c_suit_club
    ))

    // (const ranksuit-td)
    Object.assign(nx_tactics_base.c_ranksuit_td, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_ten,
      ":suit",
      nx_tactics_base.c_suit_diamond
    ))

    // (const ranksuit-th)
    Object.assign(nx_tactics_base.c_ranksuit_th, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_ten,
      ":suit",
      nx_tactics_base.c_suit_heart
    ))

    // (const ranksuit-ts)
    Object.assign(nx_tactics_base.c_ranksuit_ts, vx_core.f_new(
      {"any-1": nx_tactics_base.t_ranksuit},
      ":rank",
      nx_tactics_base.c_rank_ten,
      ":suit",
      nx_tactics_base.c_suit_spade
    ))

    // (const stat-beast)
    Object.assign(nx_tactics_base.c_stat_beast, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const stat-body)
    Object.assign(nx_tactics_base.c_stat_body, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const stat-mind)
    Object.assign(nx_tactics_base.c_stat_mind, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const stat-shadow)
    Object.assign(nx_tactics_base.c_stat_shadow, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const stat-speed)
    Object.assign(nx_tactics_base.c_stat_speed, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const stat-will)
    Object.assign(nx_tactics_base.c_stat_will, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const suit-black)
    Object.assign(nx_tactics_base.c_suit_black, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const suit-club)
    Object.assign(nx_tactics_base.c_suit_club, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const suit-diamond)
    Object.assign(nx_tactics_base.c_suit_diamond, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const suit-heart)
    Object.assign(nx_tactics_base.c_suit_heart, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const suit-red)
    Object.assign(nx_tactics_base.c_suit_red, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

    // (const suit-spade)
    Object.assign(nx_tactics_base.c_suit_spade, {
      "imgmirror": false,
      "ranksuit": {
        "imgmirror": false,
        "ranksuit": {
          "imgmirror": false,
          "ranksuit": {
            
          },
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "rank": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        },
        "suit": {
          "imgmirror": false,
          "ranksuit": {
            
          }
        }
      }
    })

  }
}
