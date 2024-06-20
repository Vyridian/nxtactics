'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scenario_nightonthetown {

  /**
   * Constant: ability-bite
   * {ability}
   */
  static c_ability_bite = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario_nightonthetown', name: 'ability-bite'}}

  /**
   * Constant: ability-sneak
   * {ability}
   */
  static c_ability_sneak = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario_nightonthetown', name: 'ability-sneak'}}

  /**
   * Constant: skill-closecombat
   * {skill}
   */
  static c_skill_closecombat = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario_nightonthetown', name: 'skill-closecombat'}}

  /**
   * Constant: skill-investigation
   * {skill}
   */
  static c_skill_investigation = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario_nightonthetown', name: 'skill-investigation'}}

  /**
   * Constant: skill-melee
   * {skill}
   */
  static c_skill_melee = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario_nightonthetown', name: 'skill-melee'}}

  /**
   * Constant: skill-ranged
   * {skill}
   */
  static c_skill_ranged = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario_nightonthetown', name: 'skill-ranged'}}

  /**
   * Constant: skill-stealth
   * {skill}
   */
  static c_skill_stealth = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario_nightonthetown', name: 'skill-stealth'}}

  /**
   * Constant: skill-survival
   * {skill}
   */
  static c_skill_survival = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario_nightonthetown', name: 'skill-survival'}}

  /**
   * Constant: skill-tradeskill
   * {skill}
   */
  static c_skill_tradeskill = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario_nightonthetown', name: 'skill-tradeskill'}}

  /**
   * @function deck_nightonthetown
   * @return {deck}
   */
  static t_deck_nightonthetown = {
    vx_type: vx_core.t_type
  }
  static e_deck_nightonthetown = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_deck_nightonthetown
  }

  // (func deck-nightonthetown)
  static f_deck_nightonthetown() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Night on the Town",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_scenario_nightonthetown.f_unit_theprofessor(),
          nx_tactics_decks_scenario_nightonthetown.f_unit_zombiedog(),
          nx_tactics_decks_scenario_nightonthetown.f_unit_zombierunner(),
          nx_tactics_decks_scenario_nightonthetown.f_unit_zombiewalker(),
          nx_tactics_decks_scenario_nightonthetown.f_item_barehanded(),
          nx_tactics_decks_scenario_nightonthetown.f_item_bowshort(),
          nx_tactics_decks_scenario_nightonthetown.f_item_combination(),
          nx_tactics_decks_scenario_nightonthetown.f_item_fireaxe(),
          nx_tactics_decks_scenario_nightonthetown.f_item_jerrycan(),
          nx_tactics_decks_scenario_nightonthetown.f_item_keys(),
          nx_tactics_decks_scenario_nightonthetown.f_item_knife(),
          nx_tactics_decks_scenario_nightonthetown.f_item_liquor(),
          nx_tactics_decks_scenario_nightonthetown.f_item_molotovcocktail(),
          nx_tactics_decks_scenario_nightonthetown.f_item_monocle(),
          nx_tactics_decks_scenario_nightonthetown.f_item_revolver(),
          nx_tactics_decks_scenario_nightonthetown.f_item_revolverammo(),
          nx_tactics_decks_scenario_nightonthetown.f_item_rifle(),
          nx_tactics_decks_scenario_nightonthetown.f_item_rifleammo(),
          nx_tactics_decks_scenario_nightonthetown.f_item_safe(),
          nx_tactics_decks_scenario_nightonthetown.f_item_shotgun(),
          nx_tactics_decks_scenario_nightonthetown.f_item_shotgunammo(),
          nx_tactics_decks_scenario_nightonthetown.f_item_spear(),
          nx_tactics_decks_scenario_nightonthetown.f_place_clinic(),
          nx_tactics_decks_scenario_nightonthetown.f_place_conveniencestore(),
          nx_tactics_decks_scenario_nightonthetown.f_place_gasstation(),
          nx_tactics_decks_scenario_nightonthetown.f_place_gunstore(),
          nx_tactics_decks_scenario_nightonthetown.f_place_policestation(),
          nx_tactics_decks_scenario_nightonthetown.f_place_street()
        )
      )
    )
    return output
  }

  /**
   * @function item_axehand
   * @return {item}
   */
  static t_item_axehand = {
    vx_type: vx_core.t_type
  }
  static e_item_axehand = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_axehand
  }

  // (func item-axehand)
  static f_item_axehand() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Hand Axe",
      ":image",
      "images/cards/item-axehand.svg",
      ":summary",
      "* Melee: [Hack] [Slash]\n* Hit: [Size Bonus]\n* Location: [1-hand]",
      ":body",
      "9x-1",
      ":mass",
      "900g/2lb"
    )
    return output
  }

  /**
   * @function item_barehanded
   * @return {item}
   */
  static t_item_barehanded = {
    vx_type: vx_core.t_type
  }
  static e_item_barehanded = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_barehanded
  }

  // (func item-barehanded)
  static f_item_barehanded() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Bare Handed",
      ":image",
      "images/cards/item-barehanded.svg",
      ":summary",
      "* Close Combat: [Bash]\n* Hit: [Size Bonus]"
    )
    return output
  }

  /**
   * @function item_bowshort
   * @return {item}
   */
  static t_item_bowshort = {
    vx_type: vx_core.t_type
  }
  static e_item_bowshort = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_bowshort
  }

  // (func item-bowshort)
  static f_item_bowshort() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Short Bow",
      ":image",
      "images/cards/item-bowshort.svg",
      ":summary",
      "* Ranged: [Pierce] [Slash]\n* Hit:+1\n* Range:10x1 100m/300ft\n* Location: [2-hand]",
      ":body",
      "10x-1",
      ":mass",
      "1kg/2lb"
    )
    return output
  }

  /**
   * @function item_combination
   * @return {item}
   */
  static t_item_combination = {
    vx_type: vx_core.t_type
  }
  static e_item_combination = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_combination
  }

  // (func item-combination)
  static f_item_combination() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Combination",
      ":image",
      "images/cards/item-combination.svg"
    )
    return output
  }

  /**
   * @function item_fireaxe
   * @return {item}
   */
  static t_item_fireaxe = {
    vx_type: vx_core.t_type
  }
  static e_item_fireaxe = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_fireaxe
  }

  // (func item-fireaxe)
  static f_item_fireaxe() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Fire Axe",
      ":image",
      "images/cards/item-woodaxe.svg",
      ":summary",
      "* Melee: [Hack] [Slash]\n* Attack:-1\n* Hit:+3 [Size Bonus]\n* Location: [2-hand]\n* Armor:1x1",
      ":body",
      "3x0",
      ":mass",
      "3.1kg/7lb"
    )
    return output
  }

  /**
   * @function item_jerrycan
   * @return {item}
   */
  static t_item_jerrycan = {
    vx_type: vx_core.t_type
  }
  static e_item_jerrycan = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_jerrycan
  }

  // (func item-jerrycan)
  static f_item_jerrycan() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Jerry Can",
      ":image",
      "images/cards/item-jerrycan.svg"
    )
    return output
  }

  /**
   * @function item_keys
   * @return {item}
   */
  static t_item_keys = {
    vx_type: vx_core.t_type
  }
  static e_item_keys = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_keys
  }

  // (func item-keys)
  static f_item_keys() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Keys",
      ":image",
      "images/cards/item-keys.svg"
    )
    return output
  }

  /**
   * @function item_knife
   * @return {item}
   */
  static t_item_knife = {
    vx_type: vx_core.t_type
  }
  static e_item_knife = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_knife
  }

  // (func item-knife)
  static f_item_knife() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Knife",
      ":image",
      "images/cards/item-knife.svg",
      ":summary",
      "* Close Combat: [Pierce] [Slash]\n* Hit: [Size Bonus]\n* Location: [1-hand]",
      ":body",
      "5x-1",
      ":mass",
      "500g/1lb",
      ":length",
      "25cm/10in"
    )
    return output
  }

  /**
   * @function item_liquor
   * @return {item}
   */
  static t_item_liquor = {
    vx_type: vx_core.t_type
  }
  static e_item_liquor = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_liquor
  }

  // (func item-liquor)
  static f_item_liquor() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Liquor",
      ":image",
      "images/cards/item-liquor.svg"
    )
    return output
  }

  /**
   * @function item_molotovcocktail
   * @return {item}
   */
  static t_item_molotovcocktail = {
    vx_type: vx_core.t_type
  }
  static e_item_molotovcocktail = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_molotovcocktail
  }

  // (func item-molotovcocktail)
  static f_item_molotovcocktail() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Molotov Cocktail",
      ":image",
      "images/cards/item-molotovcocktail.svg"
    )
    return output
  }

  /**
   * @function item_monocle
   * @return {item}
   */
  static t_item_monocle = {
    vx_type: vx_core.t_type
  }
  static e_item_monocle = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_monocle
  }

  // (func item-monocle)
  static f_item_monocle() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Monocle",
      ":image",
      "images/cards/item-monocle.svg",
      ":summary",
      "* if examining small objects\n** [Investigation]:+1",
      ":body",
      "2x-2",
      ":mass",
      "20g/.05lb"
    )
    return output
  }

  /**
   * @function item_revolver
   * @return {item}
   */
  static t_item_revolver = {
    vx_type: vx_core.t_type
  }
  static e_item_revolver = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_revolver
  }

  // (func item-revolver)
  static f_item_revolver() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Revolver",
      ":image",
      "images/cards/item-revolver.svg"
    )
    return output
  }

  /**
   * @function item_revolverammo
   * @return {item}
   */
  static t_item_revolverammo = {
    vx_type: vx_core.t_type
  }
  static e_item_revolverammo = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_revolverammo
  }

  // (func item-revolverammo)
  static f_item_revolverammo() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Revolver Ammo",
      ":image",
      "images/cards/item-revolverammo.svg"
    )
    return output
  }

  /**
   * @function item_rifle
   * @return {item}
   */
  static t_item_rifle = {
    vx_type: vx_core.t_type
  }
  static e_item_rifle = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_rifle
  }

  // (func item-rifle)
  static f_item_rifle() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Rifle",
      ":image",
      "images/cards/item-rifle.svg"
    )
    return output
  }

  /**
   * @function item_rifleammo
   * @return {item}
   */
  static t_item_rifleammo = {
    vx_type: vx_core.t_type
  }
  static e_item_rifleammo = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_rifleammo
  }

  // (func item-rifleammo)
  static f_item_rifleammo() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Rifle Ammo",
      ":image",
      "images/cards/item-rifleammo.svg"
    )
    return output
  }

  /**
   * @function item_safe
   * @return {item}
   */
  static t_item_safe = {
    vx_type: vx_core.t_type
  }
  static e_item_safe = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_safe
  }

  // (func item-safe)
  static f_item_safe() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Safe",
      ":image",
      "images/cards/item-safe.svg"
    )
    return output
  }

  /**
   * @function item_shotgun
   * @return {item}
   */
  static t_item_shotgun = {
    vx_type: vx_core.t_type
  }
  static e_item_shotgun = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_shotgun
  }

  // (func item-shotgun)
  static f_item_shotgun() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Shotgun",
      ":image",
      "images/cards/item-shotgun.svg"
    )
    return output
  }

  /**
   * @function item_shotgunammo
   * @return {item}
   */
  static t_item_shotgunammo = {
    vx_type: vx_core.t_type
  }
  static e_item_shotgunammo = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_shotgunammo
  }

  // (func item-shotgunammo)
  static f_item_shotgunammo() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Shotgun Ammo",
      ":image",
      "images/cards/item-shotgunammo.svg"
    )
    return output
  }

  /**
   * @function item_spear
   * @return {item}
   */
  static t_item_spear = {
    vx_type: vx_core.t_type
  }
  static e_item_spear = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_spear
  }

  // (func item-spear)
  static f_item_spear() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Spear",
      ":image",
      "images/cards/item-spear.svg",
      ":summary",
      "* Melee: [Pierce] [Slash]\n* Hit:+3 [Size Bonus]\n* Location: [2-hand]\n* Armor:1x1\n* [Reach]",
      ":body",
      "3x0",
      ":mass",
      "3kg/6lb"
    )
    return output
  }

  /**
   * @function place_clinic
   * @return {place}
   */
  static t_place_clinic = {
    vx_type: vx_core.t_type
  }
  static e_place_clinic = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_place_clinic
  }

  // (func place-clinic)
  static f_place_clinic() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Clinic",
      ":image",
      "images/cards/place-clinic.svg"
    )
    return output
  }

  /**
   * @function place_conveniencestore
   * @return {place}
   */
  static t_place_conveniencestore = {
    vx_type: vx_core.t_type
  }
  static e_place_conveniencestore = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_place_conveniencestore
  }

  // (func place-conveniencestore)
  static f_place_conveniencestore() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Convenience Store",
      ":image",
      "images/cards/place-conveniencestore.svg"
    )
    return output
  }

  /**
   * @function place_gasstation
   * @return {place}
   */
  static t_place_gasstation = {
    vx_type: vx_core.t_type
  }
  static e_place_gasstation = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_place_gasstation
  }

  // (func place-gasstation)
  static f_place_gasstation() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Gas Station",
      ":image",
      "images/cards/place-gasstation.svg"
    )
    return output
  }

  /**
   * @function place_gunstore
   * @return {place}
   */
  static t_place_gunstore = {
    vx_type: vx_core.t_type
  }
  static e_place_gunstore = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_place_gunstore
  }

  // (func place-gunstore)
  static f_place_gunstore() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Gun Store",
      ":image",
      "images/cards/place-gunstore.svg"
    )
    return output
  }

  /**
   * @function place_policestation
   * @return {place}
   */
  static t_place_policestation = {
    vx_type: vx_core.t_type
  }
  static e_place_policestation = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_place_policestation
  }

  // (func place-policestation)
  static f_place_policestation() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Police Station",
      ":image",
      "images/cards/place-policestation.svg"
    )
    return output
  }

  /**
   * @function place_street
   * @return {place}
   */
  static t_place_street = {
    vx_type: vx_core.t_type
  }
  static e_place_street = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_place_street
  }

  // (func place-street)
  static f_place_street() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Street",
      ":image",
      "images/cards/place-street.svg"
    )
    return output
  }

  /**
   * @function unit_theprofessor
   * @return {unit}
   */
  static t_unit_theprofessor = {
    vx_type: vx_core.t_type
  }
  static e_unit_theprofessor = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_unit_theprofessor
  }

  // (func unit-theprofessor)
  static f_unit_theprofessor() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "The Professor",
      ":image",
      "images/cards/unit-theprofessor.svg",
      ":body",
      "7x2",
      ":mind",
      "7x1",
      ":will",
      "3x1",
      ":move",
      "6x1",
      ":mass",
      "70kg/155lb",
      ":height",
      "1.7m/5'6",
      ":speedland",
      "60kph/37mph",
      ":demeanor",
      "Foolish",
      ":nature",
      "Cowardly",
      ":summary",
      "",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario_nightonthetown.c_skill_ranged,
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario_nightonthetown.f_item_bowshort()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario_nightonthetown.c_skill_investigation,
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario_nightonthetown.f_item_monocle()
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_zombiedog
   * @return {unit}
   */
  static t_unit_zombiedog = {
    vx_type: vx_core.t_type
  }
  static e_unit_zombiedog = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_unit_zombiedog
  }

  // (func unit-zombiedog)
  static f_unit_zombiedog() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Zombie Dog",
      ":image",
      "images/cards/unit-zombiedog.svg",
      ":body",
      "2x1",
      ":mind",
      "8x-1",
      ":will",
      "4x1",
      ":move",
      "7x1",
      ":mass",
      "22kg/50lb",
      ":height",
      "76cm/30in",
      ":speedland",
      "70kph/37mph",
      ":nature",
      "Dogged",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario_nightonthetown.c_skill_closecombat,
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_scenario_nightonthetown.c_ability_bite
            )
          )
        )
      ),
      ":summary",
      "[Prey]: [Bleeding], [Prone] within 2 Moves. Never targets [Undead].\n[Ravenous]: Will ignore current target for a [Bleeding] or [Prone] target within 2 Moves."
    )
    return output
  }

  /**
   * @function unit_zombierunner
   * @return {unit}
   */
  static t_unit_zombierunner = {
    vx_type: vx_core.t_type
  }
  static e_unit_zombierunner = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_unit_zombierunner
  }

  // (func unit-zombierunner)
  static f_unit_zombierunner() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Horse",
      ":image",
      "images/cards/unit-horse.svg",
      ":body",
      "4x2",
      ":mind",
      "5x-1",
      ":will",
      "2x1",
      ":move",
      "5x1",
      ":mass",
      "450kg/1000lb",
      ":speedland",
      "50kph/30mph",
      ":demeanor",
      "Aloof",
      ":summary",
      "[Prey]: [Bleeding], [Prone] within 2 Moves. Never targets [Undead].\n[Ravenous]: Will ignore current target for a [Bleeding] or [Prone] target within 2 Moves."
    )
    return output
  }

  /**
   * @function unit_zombiewalker
   * @return {unit}
   */
  static t_unit_zombiewalker = {
    vx_type: vx_core.t_type
  }
  static e_unit_zombiewalker = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_unit_zombiewalker
  }

  // (func unit-zombiewalker)
  static f_unit_zombiewalker() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Zombie Walker",
      ":image",
      "images/cards/unit-zombiewalker.svg",
      ":body",
      "4x2",
      ":mind",
      "5x-1",
      ":will",
      "2x1",
      ":move",
      "5x1",
      ":mass",
      "450kg/1000lb",
      ":speedland",
      "50kph/30mph",
      ":summary",
      "[Prey]: [Bleeding], [Prone] within 2 Moves. Never targets [Undead].\n[Ravenous]: Will ignore current target for a [Bleeding] or [Prone] target within 2 Moves."
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "ability-bite": nx_tactics_decks_scenario_nightonthetown.c_ability_bite,
      "ability-sneak": nx_tactics_decks_scenario_nightonthetown.c_ability_sneak,
      "skill-closecombat": nx_tactics_decks_scenario_nightonthetown.c_skill_closecombat,
      "skill-investigation": nx_tactics_decks_scenario_nightonthetown.c_skill_investigation,
      "skill-melee": nx_tactics_decks_scenario_nightonthetown.c_skill_melee,
      "skill-ranged": nx_tactics_decks_scenario_nightonthetown.c_skill_ranged,
      "skill-stealth": nx_tactics_decks_scenario_nightonthetown.c_skill_stealth,
      "skill-survival": nx_tactics_decks_scenario_nightonthetown.c_skill_survival,
      "skill-tradeskill": nx_tactics_decks_scenario_nightonthetown.c_skill_tradeskill
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-nightonthetown": nx_tactics_decks_scenario_nightonthetown.e_deck_nightonthetown,
      "item-axehand": nx_tactics_decks_scenario_nightonthetown.e_item_axehand,
      "item-barehanded": nx_tactics_decks_scenario_nightonthetown.e_item_barehanded,
      "item-bowshort": nx_tactics_decks_scenario_nightonthetown.e_item_bowshort,
      "item-combination": nx_tactics_decks_scenario_nightonthetown.e_item_combination,
      "item-fireaxe": nx_tactics_decks_scenario_nightonthetown.e_item_fireaxe,
      "item-jerrycan": nx_tactics_decks_scenario_nightonthetown.e_item_jerrycan,
      "item-keys": nx_tactics_decks_scenario_nightonthetown.e_item_keys,
      "item-knife": nx_tactics_decks_scenario_nightonthetown.e_item_knife,
      "item-liquor": nx_tactics_decks_scenario_nightonthetown.e_item_liquor,
      "item-molotovcocktail": nx_tactics_decks_scenario_nightonthetown.e_item_molotovcocktail,
      "item-monocle": nx_tactics_decks_scenario_nightonthetown.e_item_monocle,
      "item-revolver": nx_tactics_decks_scenario_nightonthetown.e_item_revolver,
      "item-revolverammo": nx_tactics_decks_scenario_nightonthetown.e_item_revolverammo,
      "item-rifle": nx_tactics_decks_scenario_nightonthetown.e_item_rifle,
      "item-rifleammo": nx_tactics_decks_scenario_nightonthetown.e_item_rifleammo,
      "item-safe": nx_tactics_decks_scenario_nightonthetown.e_item_safe,
      "item-shotgun": nx_tactics_decks_scenario_nightonthetown.e_item_shotgun,
      "item-shotgunammo": nx_tactics_decks_scenario_nightonthetown.e_item_shotgunammo,
      "item-spear": nx_tactics_decks_scenario_nightonthetown.e_item_spear,
      "place-clinic": nx_tactics_decks_scenario_nightonthetown.e_place_clinic,
      "place-conveniencestore": nx_tactics_decks_scenario_nightonthetown.e_place_conveniencestore,
      "place-gasstation": nx_tactics_decks_scenario_nightonthetown.e_place_gasstation,
      "place-gunstore": nx_tactics_decks_scenario_nightonthetown.e_place_gunstore,
      "place-policestation": nx_tactics_decks_scenario_nightonthetown.e_place_policestation,
      "place-street": nx_tactics_decks_scenario_nightonthetown.e_place_street,
      "unit-theprofessor": nx_tactics_decks_scenario_nightonthetown.e_unit_theprofessor,
      "unit-zombiedog": nx_tactics_decks_scenario_nightonthetown.e_unit_zombiedog,
      "unit-zombierunner": nx_tactics_decks_scenario_nightonthetown.e_unit_zombierunner,
      "unit-zombiewalker": nx_tactics_decks_scenario_nightonthetown.e_unit_zombiewalker
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-nightonthetown": nx_tactics_decks_scenario_nightonthetown.t_deck_nightonthetown,
      "item-axehand": nx_tactics_decks_scenario_nightonthetown.t_item_axehand,
      "item-barehanded": nx_tactics_decks_scenario_nightonthetown.t_item_barehanded,
      "item-bowshort": nx_tactics_decks_scenario_nightonthetown.t_item_bowshort,
      "item-combination": nx_tactics_decks_scenario_nightonthetown.t_item_combination,
      "item-fireaxe": nx_tactics_decks_scenario_nightonthetown.t_item_fireaxe,
      "item-jerrycan": nx_tactics_decks_scenario_nightonthetown.t_item_jerrycan,
      "item-keys": nx_tactics_decks_scenario_nightonthetown.t_item_keys,
      "item-knife": nx_tactics_decks_scenario_nightonthetown.t_item_knife,
      "item-liquor": nx_tactics_decks_scenario_nightonthetown.t_item_liquor,
      "item-molotovcocktail": nx_tactics_decks_scenario_nightonthetown.t_item_molotovcocktail,
      "item-monocle": nx_tactics_decks_scenario_nightonthetown.t_item_monocle,
      "item-revolver": nx_tactics_decks_scenario_nightonthetown.t_item_revolver,
      "item-revolverammo": nx_tactics_decks_scenario_nightonthetown.t_item_revolverammo,
      "item-rifle": nx_tactics_decks_scenario_nightonthetown.t_item_rifle,
      "item-rifleammo": nx_tactics_decks_scenario_nightonthetown.t_item_rifleammo,
      "item-safe": nx_tactics_decks_scenario_nightonthetown.t_item_safe,
      "item-shotgun": nx_tactics_decks_scenario_nightonthetown.t_item_shotgun,
      "item-shotgunammo": nx_tactics_decks_scenario_nightonthetown.t_item_shotgunammo,
      "item-spear": nx_tactics_decks_scenario_nightonthetown.t_item_spear,
      "place-clinic": nx_tactics_decks_scenario_nightonthetown.t_place_clinic,
      "place-conveniencestore": nx_tactics_decks_scenario_nightonthetown.t_place_conveniencestore,
      "place-gasstation": nx_tactics_decks_scenario_nightonthetown.t_place_gasstation,
      "place-gunstore": nx_tactics_decks_scenario_nightonthetown.t_place_gunstore,
      "place-policestation": nx_tactics_decks_scenario_nightonthetown.t_place_policestation,
      "place-street": nx_tactics_decks_scenario_nightonthetown.t_place_street,
      "unit-theprofessor": nx_tactics_decks_scenario_nightonthetown.t_unit_theprofessor,
      "unit-zombiedog": nx_tactics_decks_scenario_nightonthetown.t_unit_zombiedog,
      "unit-zombierunner": nx_tactics_decks_scenario_nightonthetown.t_unit_zombierunner,
      "unit-zombiewalker": nx_tactics_decks_scenario_nightonthetown.t_unit_zombiewalker
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scenario_nightonthetown",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-nightonthetown)
    nx_tactics_decks_scenario_nightonthetown.t_deck_nightonthetown['vx_value'] = {
      name          : "deck-nightonthetown",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_deck_nightonthetown
    }

    // (func item-axehand)
    nx_tactics_decks_scenario_nightonthetown.t_item_axehand['vx_value'] = {
      name          : "item-axehand",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_axehand
    }

    // (func item-barehanded)
    nx_tactics_decks_scenario_nightonthetown.t_item_barehanded['vx_value'] = {
      name          : "item-barehanded",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_barehanded
    }

    // (func item-bowshort)
    nx_tactics_decks_scenario_nightonthetown.t_item_bowshort['vx_value'] = {
      name          : "item-bowshort",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_bowshort
    }

    // (func item-combination)
    nx_tactics_decks_scenario_nightonthetown.t_item_combination['vx_value'] = {
      name          : "item-combination",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_combination
    }

    // (func item-fireaxe)
    nx_tactics_decks_scenario_nightonthetown.t_item_fireaxe['vx_value'] = {
      name          : "item-fireaxe",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_fireaxe
    }

    // (func item-jerrycan)
    nx_tactics_decks_scenario_nightonthetown.t_item_jerrycan['vx_value'] = {
      name          : "item-jerrycan",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_jerrycan
    }

    // (func item-keys)
    nx_tactics_decks_scenario_nightonthetown.t_item_keys['vx_value'] = {
      name          : "item-keys",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_keys
    }

    // (func item-knife)
    nx_tactics_decks_scenario_nightonthetown.t_item_knife['vx_value'] = {
      name          : "item-knife",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_knife
    }

    // (func item-liquor)
    nx_tactics_decks_scenario_nightonthetown.t_item_liquor['vx_value'] = {
      name          : "item-liquor",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_liquor
    }

    // (func item-molotovcocktail)
    nx_tactics_decks_scenario_nightonthetown.t_item_molotovcocktail['vx_value'] = {
      name          : "item-molotovcocktail",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_molotovcocktail
    }

    // (func item-monocle)
    nx_tactics_decks_scenario_nightonthetown.t_item_monocle['vx_value'] = {
      name          : "item-monocle",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_monocle
    }

    // (func item-revolver)
    nx_tactics_decks_scenario_nightonthetown.t_item_revolver['vx_value'] = {
      name          : "item-revolver",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_revolver
    }

    // (func item-revolverammo)
    nx_tactics_decks_scenario_nightonthetown.t_item_revolverammo['vx_value'] = {
      name          : "item-revolverammo",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_revolverammo
    }

    // (func item-rifle)
    nx_tactics_decks_scenario_nightonthetown.t_item_rifle['vx_value'] = {
      name          : "item-rifle",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_rifle
    }

    // (func item-rifleammo)
    nx_tactics_decks_scenario_nightonthetown.t_item_rifleammo['vx_value'] = {
      name          : "item-rifleammo",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_rifleammo
    }

    // (func item-safe)
    nx_tactics_decks_scenario_nightonthetown.t_item_safe['vx_value'] = {
      name          : "item-safe",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_safe
    }

    // (func item-shotgun)
    nx_tactics_decks_scenario_nightonthetown.t_item_shotgun['vx_value'] = {
      name          : "item-shotgun",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_shotgun
    }

    // (func item-shotgunammo)
    nx_tactics_decks_scenario_nightonthetown.t_item_shotgunammo['vx_value'] = {
      name          : "item-shotgunammo",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_shotgunammo
    }

    // (func item-spear)
    nx_tactics_decks_scenario_nightonthetown.t_item_spear['vx_value'] = {
      name          : "item-spear",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_spear
    }

    // (func place-clinic)
    nx_tactics_decks_scenario_nightonthetown.t_place_clinic['vx_value'] = {
      name          : "place-clinic",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_place_clinic
    }

    // (func place-conveniencestore)
    nx_tactics_decks_scenario_nightonthetown.t_place_conveniencestore['vx_value'] = {
      name          : "place-conveniencestore",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_place_conveniencestore
    }

    // (func place-gasstation)
    nx_tactics_decks_scenario_nightonthetown.t_place_gasstation['vx_value'] = {
      name          : "place-gasstation",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_place_gasstation
    }

    // (func place-gunstore)
    nx_tactics_decks_scenario_nightonthetown.t_place_gunstore['vx_value'] = {
      name          : "place-gunstore",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_place_gunstore
    }

    // (func place-policestation)
    nx_tactics_decks_scenario_nightonthetown.t_place_policestation['vx_value'] = {
      name          : "place-policestation",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_place_policestation
    }

    // (func place-street)
    nx_tactics_decks_scenario_nightonthetown.t_place_street['vx_value'] = {
      name          : "place-street",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_place_street
    }

    // (func unit-theprofessor)
    nx_tactics_decks_scenario_nightonthetown.t_unit_theprofessor['vx_value'] = {
      name          : "unit-theprofessor",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_unit_theprofessor
    }

    // (func unit-zombiedog)
    nx_tactics_decks_scenario_nightonthetown.t_unit_zombiedog['vx_value'] = {
      name          : "unit-zombiedog",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_unit_zombiedog
    }

    // (func unit-zombierunner)
    nx_tactics_decks_scenario_nightonthetown.t_unit_zombierunner['vx_value'] = {
      name          : "unit-zombierunner",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_unit_zombierunner
    }

    // (func unit-zombiewalker)
    nx_tactics_decks_scenario_nightonthetown.t_unit_zombiewalker['vx_value'] = {
      name          : "unit-zombiewalker",
      pkgname       : "nx/tactics/decks/scenario_nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_unit_zombiewalker
    }

    // (const ability-bite)
    Object.assign(nx_tactics_decks_scenario_nightonthetown.c_ability_bite, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Bite"
    ))

    // (const ability-sneak)
    Object.assign(nx_tactics_decks_scenario_nightonthetown.c_ability_sneak, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Sneak"
    ))

    // (const skill-closecombat)
    Object.assign(nx_tactics_decks_scenario_nightonthetown.c_skill_closecombat, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Close Combat"
    ))

    // (const skill-investigation)
    Object.assign(nx_tactics_decks_scenario_nightonthetown.c_skill_investigation, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Investigation"
    ))

    // (const skill-melee)
    Object.assign(nx_tactics_decks_scenario_nightonthetown.c_skill_melee, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Melee"
    ))

    // (const skill-ranged)
    Object.assign(nx_tactics_decks_scenario_nightonthetown.c_skill_ranged, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Ranged"
    ))

    // (const skill-stealth)
    Object.assign(nx_tactics_decks_scenario_nightonthetown.c_skill_stealth, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Stealth"
    ))

    // (const skill-survival)
    Object.assign(nx_tactics_decks_scenario_nightonthetown.c_skill_survival, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Survival"
    ))

    // (const skill-tradeskill)
    Object.assign(nx_tactics_decks_scenario_nightonthetown.c_skill_tradeskill, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Tradeskill"
    ))

  }
}
