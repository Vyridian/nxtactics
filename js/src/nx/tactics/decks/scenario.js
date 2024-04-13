'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scenario {

  /**
   * Constant: ability-bargain
   * {ability}
   */
  static c_ability_bargain = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'ability-bargain'}}

  /**
   * Constant: ability-bite
   * {ability}
   */
  static c_ability_bite = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'ability-bite'}}

  /**
   * Constant: ability-blacksmithing
   * {ability}
   */
  static c_ability_blacksmithing = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'ability-blacksmithing'}}

  /**
   * Constant: ability-drag
   * {ability}
   */
  static c_ability_drag = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'ability-drag'}}

  /**
   * Constant: ability-foraging
   * {ability}
   */
  static c_ability_foraging = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'ability-foraging'}}

  /**
   * Constant: ability-grab
   * {ability}
   */
  static c_ability_grab = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'ability-grab'}}

  /**
   * Constant: ability-sneak
   * {ability}
   */
  static c_ability_sneak = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'ability-sneak'}}

  /**
   * Constant: ability-trapping
   * {ability}
   */
  static c_ability_trapping = {vx_type: nx_tactics_base.t_ability, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'ability-trapping'}}

  /**
   * Constant: power-groundmovement
   * {power}
   */
  static c_power_groundmovement = {vx_type: nx_tactics_base.t_power, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'power-groundmovement'}}

  /**
   * Constant: skill-business
   * {skill}
   */
  static c_skill_business = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'skill-business'}}

  /**
   * Constant: skill-closecombat
   * {skill}
   */
  static c_skill_closecombat = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'skill-closecombat'}}

  /**
   * Constant: skill-hunting
   * {skill}
   */
  static c_skill_hunting = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'skill-hunting'}}

  /**
   * Constant: skill-melee
   * {skill}
   */
  static c_skill_melee = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'skill-melee'}}

  /**
   * Constant: skill-stealth
   * {skill}
   */
  static c_skill_stealth = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'skill-stealth'}}

  /**
   * Constant: skill-survival
   * {skill}
   */
  static c_skill_survival = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'skill-survival'}}

  /**
   * Constant: skill-tradeskill
   * {skill}
   */
  static c_skill_tradeskill = {vx_type: nx_tactics_base.t_skill, vx_constdef: {pkgname: 'nx/tactics/decks/scenario', name: 'skill-tradeskill'}}

  /**
   * @function deck_murintrail
   * @return {deck}
   */
  static t_deck_murintrail = {
    vx_type: vx_core.t_type
  }
  static e_deck_murintrail = {
    vx_type: nx_tactics_decks_scenario.t_deck_murintrail
  }

  // (func deck-murintrail)
  static f_deck_murintrail() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const goblinscout = nx_tactics_decks_scenario.f_unit_goblinscout()
        const goblinscout_i = nx_tactics_base.f_cardimage_from_card(goblinscout)
        const horse = nx_tactics_decks_scenario.f_unit_horse()
        const horse_i = nx_tactics_base.f_cardimage_from_card(horse)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":name",
          "Murin Trail",
          ":cardmap",
          nx_tactics_base.f_cardmap_from_cardlist(
            vx_core.f_new(
              nx_tactics_base.t_cardlist,
              nx_tactics_decks_scenario.f_unit_jesaveer(),
              nx_tactics_decks_scenario.f_unit_jonaveer(),
              nx_tactics_decks_scenario.f_unit_xeibhanower(),
              nx_tactics_decks_scenario.f_unit_wilmducon(),
              nx_tactics_decks_scenario.f_unit_liliducon(),
              nx_tactics_decks_scenario.f_unit_wilddog(),
              nx_tactics_decks_scenario.f_unit_goblinscout(),
              nx_tactics_decks_scenario.f_unit_horse(),
              nx_tactics_decks_scenario.f_unit_woodencart(),
              nx_tactics_decks_scenario.f_item_armor_leathercuirass(),
              nx_tactics_decks_scenario.f_item_axehand(),
              nx_tactics_decks_scenario.f_item_woodaxe(),
              nx_tactics_decks_scenario.f_item_barehanded(),
              nx_tactics_decks_scenario.f_item_bowshort(),
              nx_tactics_decks_scenario.f_item_dagger(),
              nx_tactics_decks_scenario.f_item_hammer(),
              nx_tactics_decks_scenario.f_item_shieldbuckler(),
              nx_tactics_decks_scenario.f_item_shieldheater(),
              nx_tactics_decks_scenario.f_item_shieldround(),
              nx_tactics_decks_scenario.f_item_spear(),
              nx_tactics_decks_scenario.f_item_spearshort(),
              nx_tactics_decks_scenario.f_item_swordlong(),
              nx_tactics_decks_scenario.f_place_field(),
              nx_tactics_decks_scenario.f_place_forest(),
              nx_tactics_decks_scenario.f_place_mountain(),
              nx_tactics_decks_scenario.f_place_blacksmith(),
              nx_tactics_decks_scenario.f_place_campsite(),
              nx_tactics_decks_scenario.f_place_cavemouth(),
              nx_tactics_decks_scenario.f_place_farmhouse(),
              nx_tactics_decks_scenario.f_place_guardpost(),
              nx_tactics_decks_scenario.f_place_mill(),
              nx_tactics_decks_scenario.f_place_stoneroad(),
              nx_tactics_decks_scenario.f_place_tavern(),
              nx_tactics_decks_scenario.f_place_temple(),
              nx_tactics_decks_scenario.f_place_tradingpost()
            )
          )
        )
      })
    )
    return output
  }

  /**
   * @function item_armor_leathercuirass
   * @return {item}
   */
  static t_item_armor_leathercuirass = {
    vx_type: vx_core.t_type
  }
  static e_item_armor_leathercuirass = {
    vx_type: nx_tactics_decks_scenario.t_item_armor_leathercuirass
  }

  // (func item-armor-leathercuirass)
  static f_item_armor_leathercuirass() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Leather Cuirass",
      ":titles",
      "Leather Body Armor",
      ":image",
      "images/cards/item-armor-leathercuirass.svg",
      ":summary",
      "* Armor:1x1\n* Location: [Shoulders] [Chest] [Abdomen] [Vitals]\n* Hardened: [Slash]",
      ":body",
      "7x0",
      ":mass",
      "7kg/15lb"
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
    vx_type: nx_tactics_decks_scenario.t_item_axehand
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
    vx_type: nx_tactics_decks_scenario.t_item_barehanded
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
    vx_type: nx_tactics_decks_scenario.t_item_bowshort
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
   * @function item_dagger
   * @return {item}
   */
  static t_item_dagger = {
    vx_type: vx_core.t_type
  }
  static e_item_dagger = {
    vx_type: nx_tactics_decks_scenario.t_item_dagger
  }

  // (func item-dagger)
  static f_item_dagger() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Dagger",
      ":image",
      "images/cards/item-dagger.svg",
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
   * @function item_hammer
   * @return {item}
   */
  static t_item_hammer = {
    vx_type: vx_core.t_type
  }
  static e_item_hammer = {
    vx_type: nx_tactics_decks_scenario.t_item_hammer
  }

  // (func item-hammer)
  static f_item_hammer() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Hammer",
      ":image",
      "images/cards/item-hammer.svg",
      ":summary",
      "* Melee: [Bash]\n* Hit:+2 [Size Bonus]\n* Location: [1-hand]",
      ":body",
      "2x0",
      ":mass",
      "2kg/4.4lb"
    )
    return output
  }

  /**
   * @function item_shieldbuckler
   * @return {item}
   */
  static t_item_shieldbuckler = {
    vx_type: vx_core.t_type
  }
  static e_item_shieldbuckler = {
    vx_type: nx_tactics_decks_scenario.t_item_shieldbuckler
  }

  // (func item-shieldbuckler)
  static f_item_shieldbuckler() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Buckler Shield",
      ":image",
      "images/cards/item-shieldbuckler.svg",
      ":summary",
      "* Armor:1x1\n* Location: [1-hand]",
      ":body",
      "10x-1",
      ":mass",
      "1kg/2lb"
    )
    return output
  }

  /**
   * @function item_shieldheater
   * @return {item}
   */
  static t_item_shieldheater = {
    vx_type: vx_core.t_type
  }
  static e_item_shieldheater = {
    vx_type: nx_tactics_decks_scenario.t_item_shieldheater
  }

  // (func item-shieldheater)
  static f_item_shieldheater() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Heater Shield",
      ":image",
      "images/cards/item-shieldheater.svg",
      ":summary",
      "* Armor:2x1\n* Location: [1-hand]\n* Hardened: [Hack]",
      ":body",
      "3x0",
      ":mass",
      "3.2kg/7lb"
    )
    return output
  }

  /**
   * @function item_shieldround
   * @return {item}
   */
  static t_item_shieldround = {
    vx_type: vx_core.t_type
  }
  static e_item_shieldround = {
    vx_type: nx_tactics_decks_scenario.t_item_shieldround
  }

  // (func item-shieldround)
  static f_item_shieldround() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Round Shield",
      ":image",
      "images/cards/item-shieldround.svg",
      ":summary",
      "* Armor:2x1\n* Location: [1-hand]\n* Hardened: [Pierce]",
      ":body",
      "5x0",
      ":mass",
      "5kg/11lb"
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
    vx_type: nx_tactics_decks_scenario.t_item_spear
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
   * @function item_spearshort
   * @return {item}
   */
  static t_item_spearshort = {
    vx_type: vx_core.t_type
  }
  static e_item_spearshort = {
    vx_type: nx_tactics_decks_scenario.t_item_spearshort
  }

  // (func item-spearshort)
  static f_item_spearshort() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Short Spear",
      ":image",
      "images/cards/item-spearshort.svg",
      ":summary",
      "* Melee: [Pierce] [Slash]\n* Hit:+1 [Size Bonus]\n* Location: [1-hand]",
      ":body",
      "10x-1",
      ":mass",
      "1.5kg/4lb"
    )
    return output
  }

  /**
   * @function item_swordlong
   * @return {item}
   */
  static t_item_swordlong = {
    vx_type: vx_core.t_type
  }
  static e_item_swordlong = {
    vx_type: nx_tactics_decks_scenario.t_item_swordlong
  }

  // (func item-swordlong)
  static f_item_swordlong() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Longsword",
      ":image",
      "images/cards/item-swordlong.svg",
      ":summary",
      "* Melee: [Pierce] [Slash]\n* Hit:+1 [Size Bonus]\n* Location: [1-hand]\n* Armor:1x1",
      ":body",
      "10x-1",
      ":mass",
      "1.25kg/3lb"
    )
    return output
  }

  /**
   * @function item_woodaxe
   * @return {item}
   */
  static t_item_woodaxe = {
    vx_type: vx_core.t_type
  }
  static e_item_woodaxe = {
    vx_type: nx_tactics_decks_scenario.t_item_woodaxe
  }

  // (func item-woodaxe)
  static f_item_woodaxe() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Wood Axe",
      ":titles",
      "Splitting Maul",
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
   * @function place_blacksmith
   * @return {location}
   */
  static t_place_blacksmith = {
    vx_type: vx_core.t_type
  }
  static e_place_blacksmith = {
    vx_type: nx_tactics_decks_scenario.t_place_blacksmith
  }

  // (func place-blacksmith)
  static f_place_blacksmith() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Blacksmith",
      ":image",
      "images/cards/place-blacksmith.svg"
    )
    return output
  }

  /**
   * @function place_campsite
   * @return {location}
   */
  static t_place_campsite = {
    vx_type: vx_core.t_type
  }
  static e_place_campsite = {
    vx_type: nx_tactics_decks_scenario.t_place_campsite
  }

  // (func place-campsite)
  static f_place_campsite() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Campsite",
      ":image",
      "images/cards/place-campsite.svg"
    )
    return output
  }

  /**
   * @function place_cavemouth
   * @return {location}
   */
  static t_place_cavemouth = {
    vx_type: vx_core.t_type
  }
  static e_place_cavemouth = {
    vx_type: nx_tactics_decks_scenario.t_place_cavemouth
  }

  // (func place-cavemouth)
  static f_place_cavemouth() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Cave Mouth",
      ":image",
      "images/cards/place-cavemouth.svg"
    )
    return output
  }

  /**
   * @function place_farmhouse
   * @return {location}
   */
  static t_place_farmhouse = {
    vx_type: vx_core.t_type
  }
  static e_place_farmhouse = {
    vx_type: nx_tactics_decks_scenario.t_place_farmhouse
  }

  // (func place-farmhouse)
  static f_place_farmhouse() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Farmhouse",
      ":image",
      "images/cards/place-farmhouse.svg"
    )
    return output
  }

  /**
   * @function place_field
   * @return {location}
   */
  static t_place_field = {
    vx_type: vx_core.t_type
  }
  static e_place_field = {
    vx_type: nx_tactics_decks_scenario.t_place_field
  }

  // (func place-field)
  static f_place_field() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Field",
      ":image",
      "images/cards/place-field.svg"
    )
    return output
  }

  /**
   * @function place_forest
   * @return {location}
   */
  static t_place_forest = {
    vx_type: vx_core.t_type
  }
  static e_place_forest = {
    vx_type: nx_tactics_decks_scenario.t_place_forest
  }

  // (func place-forest)
  static f_place_forest() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Forest",
      ":image",
      "images/cards/place-forest.svg"
    )
    return output
  }

  /**
   * @function place_guardpost
   * @return {location}
   */
  static t_place_guardpost = {
    vx_type: vx_core.t_type
  }
  static e_place_guardpost = {
    vx_type: nx_tactics_decks_scenario.t_place_guardpost
  }

  // (func place-guardpost)
  static f_place_guardpost() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Guardpost",
      ":image",
      "images/cards/place-guardpost.svg"
    )
    return output
  }

  /**
   * @function place_mill
   * @return {location}
   */
  static t_place_mill = {
    vx_type: vx_core.t_type
  }
  static e_place_mill = {
    vx_type: nx_tactics_decks_scenario.t_place_mill
  }

  // (func place-mill)
  static f_place_mill() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Mill",
      ":image",
      "images/cards/place-mill.svg"
    )
    return output
  }

  /**
   * @function place_mountain
   * @return {location}
   */
  static t_place_mountain = {
    vx_type: vx_core.t_type
  }
  static e_place_mountain = {
    vx_type: nx_tactics_decks_scenario.t_place_mountain
  }

  // (func place-mountain)
  static f_place_mountain() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Mountain",
      ":image",
      "images/cards/place-mountain.svg"
    )
    return output
  }

  /**
   * @function place_stoneroad
   * @return {location}
   */
  static t_place_stoneroad = {
    vx_type: vx_core.t_type
  }
  static e_place_stoneroad = {
    vx_type: nx_tactics_decks_scenario.t_place_stoneroad
  }

  // (func place-stoneroad)
  static f_place_stoneroad() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Stone Road",
      ":image",
      "images/cards/place-stoneroad.svg"
    )
    return output
  }

  /**
   * @function place_tavern
   * @return {location}
   */
  static t_place_tavern = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern = {
    vx_type: nx_tactics_decks_scenario.t_place_tavern
  }

  // (func place-tavern)
  static f_place_tavern() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Tavern",
      ":image",
      "images/cards/place-tavern.svg"
    )
    return output
  }

  /**
   * @function place_temple
   * @return {location}
   */
  static t_place_temple = {
    vx_type: vx_core.t_type
  }
  static e_place_temple = {
    vx_type: nx_tactics_decks_scenario.t_place_temple
  }

  // (func place-temple)
  static f_place_temple() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Temple",
      ":image",
      "images/cards/place-temple.svg"
    )
    return output
  }

  /**
   * @function place_tradingpost
   * @return {location}
   */
  static t_place_tradingpost = {
    vx_type: vx_core.t_type
  }
  static e_place_tradingpost = {
    vx_type: nx_tactics_decks_scenario.t_place_tradingpost
  }

  // (func place-tradingpost)
  static f_place_tradingpost() {
    let output = nx_tactics_base.e_location
    output = vx_core.f_new(
      nx_tactics_base.t_location,
      ":name",
      "Trading Post",
      ":image",
      "images/cards/place-tradingpost.svg"
    )
    return output
  }

  /**
   * @function unit_goblinscout
   * @return {unit}
   */
  static t_unit_goblinscout = {
    vx_type: vx_core.t_type
  }
  static e_unit_goblinscout = {
    vx_type: nx_tactics_decks_scenario.t_unit_goblinscout
  }

  // (func unit-goblinscout)
  static f_unit_goblinscout() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Goblin Scout",
      ":image",
      "images/cards/unit-goblin-scout.svg",
      ":gender",
      "Male",
      ":demeanor",
      "Depraved",
      ":nature",
      "Cowardly Envious",
      ":conscience",
      "1x1",
      ":beast",
      "1x0",
      ":race",
      "Goblin",
      ":body",
      "2x1",
      ":mind",
      "6x1",
      ":will",
      "2x1",
      ":move",
      "4x0",
      ":value",
      "1x0",
      ":mass",
      "22kg/50lb",
      ":height",
      "1m/3ft",
      ":speedland",
      "4kph/2.5mph",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_closecombat,
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario.f_item_dagger()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_stealth,
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_scenario.c_ability_sneak
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_horse
   * @return {unit}
   */
  static t_unit_horse = {
    vx_type: vx_core.t_type
  }
  static e_unit_horse = {
    vx_type: nx_tactics_decks_scenario.t_unit_horse
  }

  // (func unit-horse)
  static f_unit_horse() {
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
      "8x0",
      ":mass",
      "450kg/1000lb",
      ":speedland",
      "8kph/5mph",
      ":demeanor",
      "Aloof",
      ":nature",
      "Skitish",
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          nx_tactics_base.t_unitpower,
          ":power",
          nx_tactics_decks_scenario.c_power_groundmovement,
          ":level",
          "8x0"
        )
      )
    )
    return output
  }

  /**
   * @function unit_jesaveer
   * @return {unit}
   */
  static t_unit_jesaveer = {
    vx_type: vx_core.t_type
  }
  static e_unit_jesaveer = {
    vx_type: nx_tactics_decks_scenario.t_unit_jesaveer
  }

  // (func unit-jesaveer)
  static f_unit_jesaveer() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Jes Aveer",
      ":titles",
      "Jessana Aveer",
      ":image",
      "images/cards/unit-jesaveer.svg",
      ":summary",
      "A resilient, young woman with a love of blacksmithing.",
      ":race",
      "Human",
      ":gender",
      "F",
      ":age",
      24,
      ":body",
      "6x1",
      ":mind",
      "6x1",
      ":will",
      "6x1",
      ":move",
      "5x0",
      ":mass",
      "63kg",
      ":height",
      "1.72m/5ft7",
      ":speedland",
      "5kph/3mph",
      ":demeanor",
      "Willful",
      ":nature",
      "Nuturing",
      ":beast",
      "1x0",
      ":shadow",
      "1x0",
      ":value",
      "1x0",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_melee,
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario.f_item_hammer()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_tradeskill,
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_scenario.c_ability_blacksmithing
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_jonaveer
   * @return {unit}
   */
  static t_unit_jonaveer = {
    vx_type: vx_core.t_type
  }
  static e_unit_jonaveer = {
    vx_type: nx_tactics_decks_scenario.t_unit_jonaveer
  }

  // (func unit-jonaveer)
  static f_unit_jonaveer() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Jon Aveer",
      ":titles",
      "Ajona Aveer",
      ":image",
      "images/cards/unit-jonaveer.svg",
      ":summary",
      "A clever, young man trying to make his fortune.",
      ":race",
      "Human",
      ":gender",
      "M",
      ":age",
      23,
      ":body",
      "7x1",
      ":mind",
      "6x1",
      ":will",
      "5x1",
      ":move",
      "5x0",
      ":mass",
      "75kg",
      ":height",
      "1.78m/5ft10",
      ":speedland",
      "5kph/3mph",
      ":demeanor",
      "Frivolous",
      ":nature",
      "Loyal",
      ":beast",
      "1x0",
      ":shadow",
      "1x0",
      ":value",
      "1x0",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_melee,
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario.f_item_spear()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_business,
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_scenario.c_ability_bargain
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_liliducon
   * @return {unit}
   */
  static t_unit_liliducon = {
    vx_type: vx_core.t_type
  }
  static e_unit_liliducon = {
    vx_type: nx_tactics_decks_scenario.t_unit_liliducon
  }

  // (func unit-liliducon)
  static f_unit_liliducon() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Lili Ducon",
      ":image",
      "images/cards/unit-liliducon.svg",
      ":summary",
      "A pleasant and perceptive young lady, who moved with her father Wilm. She took her mother's death hard, and having a difficult time adapting.",
      ":race",
      "Human",
      ":gender",
      "F",
      ":age",
      11,
      ":body",
      "4x1",
      ":mind",
      "4x1",
      ":will",
      "4x1",
      ":move",
      "4x0",
      ":mass",
      "40kg/88lb",
      ":height",
      "1.5m/5ft",
      ":speedland",
      "4kph",
      ":demeanor",
      "Pleasant",
      ":nature",
      "Anxious",
      ":beast",
      "1x0",
      ":shadow",
      "1x0",
      ":value",
      "1x0",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_survival,
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_scenario.c_ability_foraging
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_wilddog
   * @return {unit}
   */
  static t_unit_wilddog = {
    vx_type: vx_core.t_type
  }
  static e_unit_wilddog = {
    vx_type: nx_tactics_decks_scenario.t_unit_wilddog
  }

  // (func unit-wilddog)
  static f_unit_wilddog() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Wild Dog",
      ":image",
      "images/cards/unit-wilddog.svg",
      ":summary",
      "The Wild Dog is one of the fastest runners in the animal kingdom.",
      ":body",
      "5x1",
      ":mind",
      "8x-1",
      ":will",
      "4x1",
      ":move",
      "2x1",
      ":mass",
      "22kg/50lb",
      ":height",
      "76cm/30in",
      ":speedland",
      "20kph/12mph (max 70/44)",
      ":nature",
      "Dogged",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_closecombat,
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_scenario.c_ability_bite
            ),
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_scenario.c_ability_grab
            )
          ),
          vx_core.f_new(
            nx_tactics_base.t_unitability,
            ":ability",
            nx_tactics_decks_scenario.c_ability_drag
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          nx_tactics_base.t_unitpower,
          ":power",
          nx_tactics_decks_scenario.c_power_groundmovement,
          ":level",
          "2x1"
        )
      )
    )
    return output
  }

  /**
   * @function unit_wilmducon
   * @return {unit}
   */
  static t_unit_wilmducon = {
    vx_type: vx_core.t_type
  }
  static e_unit_wilmducon = {
    vx_type: nx_tactics_decks_scenario.t_unit_wilmducon
  }

  // (func unit-wilmducon)
  static f_unit_wilmducon() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Wilm Ducon",
      ":image",
      "images/cards/unit-wilmducon.svg",
      ":summary",
      "A proud, prickly huntsman who lost his wife in a violent raid and moved away with his daughter Lily to restart his life.",
      ":race",
      "Human",
      ":gender",
      "M",
      ":age",
      30,
      ":body",
      "8x1",
      ":mind",
      "5x1",
      ":will",
      "5x1",
      ":move",
      "5x0",
      ":mass",
      "80kg/180",
      ":height",
      "1.8m/6ft",
      ":speedland",
      "5kph/3mph",
      ":demeanor",
      "Gruff",
      ":nature",
      "Tortured",
      ":beast",
      "1x0",
      ":shadow",
      "1x0",
      ":value",
      "1x0",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_melee,
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario.f_item_woodaxe()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_scenario.c_skill_hunting,
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_scenario.c_ability_trapping
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_woodencart
   * @return {unit}
   */
  static t_unit_woodencart = {
    vx_type: vx_core.t_type
  }
  static e_unit_woodencart = {
    vx_type: nx_tactics_decks_scenario.t_unit_woodencart
  }

  // (func unit-woodencart)
  static f_unit_woodencart() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Wooden Cart",
      ":image",
      "images/cards/unit-woodencart.svg",
      ":body",
      "2x2",
      ":mass",
      "200kg/440lb"
    )
    return output
  }

  /**
   * @function unit_xeibhanower
   * @return {unit}
   */
  static t_unit_xeibhanower = {
    vx_type: vx_core.t_type
  }
  static e_unit_xeibhanower = {
    vx_type: nx_tactics_decks_scenario.t_unit_xeibhanower
  }

  // (func unit-xeibhanower)
  static f_unit_xeibhanower() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Xeib Honower",
      ":image",
      "images/cards/unit-xeibhanower.svg",
      ":race",
      "Human",
      ":gender",
      "M",
      ":age",
      23,
      ":body",
      "8x1",
      ":mind",
      "5x1",
      ":will",
      "6x1",
      ":move",
      "4x0",
      ":mass",
      "80kg",
      ":height",
      "1.78m/5'10",
      ":speedland",
      "4kph/2.5mph"
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "ability-bargain": nx_tactics_decks_scenario.c_ability_bargain,
      "ability-bite": nx_tactics_decks_scenario.c_ability_bite,
      "ability-blacksmithing": nx_tactics_decks_scenario.c_ability_blacksmithing,
      "ability-drag": nx_tactics_decks_scenario.c_ability_drag,
      "ability-foraging": nx_tactics_decks_scenario.c_ability_foraging,
      "ability-grab": nx_tactics_decks_scenario.c_ability_grab,
      "ability-sneak": nx_tactics_decks_scenario.c_ability_sneak,
      "ability-trapping": nx_tactics_decks_scenario.c_ability_trapping,
      "power-groundmovement": nx_tactics_decks_scenario.c_power_groundmovement,
      "skill-business": nx_tactics_decks_scenario.c_skill_business,
      "skill-closecombat": nx_tactics_decks_scenario.c_skill_closecombat,
      "skill-hunting": nx_tactics_decks_scenario.c_skill_hunting,
      "skill-melee": nx_tactics_decks_scenario.c_skill_melee,
      "skill-stealth": nx_tactics_decks_scenario.c_skill_stealth,
      "skill-survival": nx_tactics_decks_scenario.c_skill_survival,
      "skill-tradeskill": nx_tactics_decks_scenario.c_skill_tradeskill
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-murintrail": nx_tactics_decks_scenario.e_deck_murintrail,
      "item-armor-leathercuirass": nx_tactics_decks_scenario.e_item_armor_leathercuirass,
      "item-axehand": nx_tactics_decks_scenario.e_item_axehand,
      "item-barehanded": nx_tactics_decks_scenario.e_item_barehanded,
      "item-bowshort": nx_tactics_decks_scenario.e_item_bowshort,
      "item-dagger": nx_tactics_decks_scenario.e_item_dagger,
      "item-hammer": nx_tactics_decks_scenario.e_item_hammer,
      "item-shieldbuckler": nx_tactics_decks_scenario.e_item_shieldbuckler,
      "item-shieldheater": nx_tactics_decks_scenario.e_item_shieldheater,
      "item-shieldround": nx_tactics_decks_scenario.e_item_shieldround,
      "item-spear": nx_tactics_decks_scenario.e_item_spear,
      "item-spearshort": nx_tactics_decks_scenario.e_item_spearshort,
      "item-swordlong": nx_tactics_decks_scenario.e_item_swordlong,
      "item-woodaxe": nx_tactics_decks_scenario.e_item_woodaxe,
      "place-blacksmith": nx_tactics_decks_scenario.e_place_blacksmith,
      "place-campsite": nx_tactics_decks_scenario.e_place_campsite,
      "place-cavemouth": nx_tactics_decks_scenario.e_place_cavemouth,
      "place-farmhouse": nx_tactics_decks_scenario.e_place_farmhouse,
      "place-field": nx_tactics_decks_scenario.e_place_field,
      "place-forest": nx_tactics_decks_scenario.e_place_forest,
      "place-guardpost": nx_tactics_decks_scenario.e_place_guardpost,
      "place-mill": nx_tactics_decks_scenario.e_place_mill,
      "place-mountain": nx_tactics_decks_scenario.e_place_mountain,
      "place-stoneroad": nx_tactics_decks_scenario.e_place_stoneroad,
      "place-tavern": nx_tactics_decks_scenario.e_place_tavern,
      "place-temple": nx_tactics_decks_scenario.e_place_temple,
      "place-tradingpost": nx_tactics_decks_scenario.e_place_tradingpost,
      "unit-goblinscout": nx_tactics_decks_scenario.e_unit_goblinscout,
      "unit-horse": nx_tactics_decks_scenario.e_unit_horse,
      "unit-jesaveer": nx_tactics_decks_scenario.e_unit_jesaveer,
      "unit-jonaveer": nx_tactics_decks_scenario.e_unit_jonaveer,
      "unit-liliducon": nx_tactics_decks_scenario.e_unit_liliducon,
      "unit-wilddog": nx_tactics_decks_scenario.e_unit_wilddog,
      "unit-wilmducon": nx_tactics_decks_scenario.e_unit_wilmducon,
      "unit-woodencart": nx_tactics_decks_scenario.e_unit_woodencart,
      "unit-xeibhanower": nx_tactics_decks_scenario.e_unit_xeibhanower
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-murintrail": nx_tactics_decks_scenario.t_deck_murintrail,
      "item-armor-leathercuirass": nx_tactics_decks_scenario.t_item_armor_leathercuirass,
      "item-axehand": nx_tactics_decks_scenario.t_item_axehand,
      "item-barehanded": nx_tactics_decks_scenario.t_item_barehanded,
      "item-bowshort": nx_tactics_decks_scenario.t_item_bowshort,
      "item-dagger": nx_tactics_decks_scenario.t_item_dagger,
      "item-hammer": nx_tactics_decks_scenario.t_item_hammer,
      "item-shieldbuckler": nx_tactics_decks_scenario.t_item_shieldbuckler,
      "item-shieldheater": nx_tactics_decks_scenario.t_item_shieldheater,
      "item-shieldround": nx_tactics_decks_scenario.t_item_shieldround,
      "item-spear": nx_tactics_decks_scenario.t_item_spear,
      "item-spearshort": nx_tactics_decks_scenario.t_item_spearshort,
      "item-swordlong": nx_tactics_decks_scenario.t_item_swordlong,
      "item-woodaxe": nx_tactics_decks_scenario.t_item_woodaxe,
      "place-blacksmith": nx_tactics_decks_scenario.t_place_blacksmith,
      "place-campsite": nx_tactics_decks_scenario.t_place_campsite,
      "place-cavemouth": nx_tactics_decks_scenario.t_place_cavemouth,
      "place-farmhouse": nx_tactics_decks_scenario.t_place_farmhouse,
      "place-field": nx_tactics_decks_scenario.t_place_field,
      "place-forest": nx_tactics_decks_scenario.t_place_forest,
      "place-guardpost": nx_tactics_decks_scenario.t_place_guardpost,
      "place-mill": nx_tactics_decks_scenario.t_place_mill,
      "place-mountain": nx_tactics_decks_scenario.t_place_mountain,
      "place-stoneroad": nx_tactics_decks_scenario.t_place_stoneroad,
      "place-tavern": nx_tactics_decks_scenario.t_place_tavern,
      "place-temple": nx_tactics_decks_scenario.t_place_temple,
      "place-tradingpost": nx_tactics_decks_scenario.t_place_tradingpost,
      "unit-goblinscout": nx_tactics_decks_scenario.t_unit_goblinscout,
      "unit-horse": nx_tactics_decks_scenario.t_unit_horse,
      "unit-jesaveer": nx_tactics_decks_scenario.t_unit_jesaveer,
      "unit-jonaveer": nx_tactics_decks_scenario.t_unit_jonaveer,
      "unit-liliducon": nx_tactics_decks_scenario.t_unit_liliducon,
      "unit-wilddog": nx_tactics_decks_scenario.t_unit_wilddog,
      "unit-wilmducon": nx_tactics_decks_scenario.t_unit_wilmducon,
      "unit-woodencart": nx_tactics_decks_scenario.t_unit_woodencart,
      "unit-xeibhanower": nx_tactics_decks_scenario.t_unit_xeibhanower
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scenario",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-murintrail)
    nx_tactics_decks_scenario.t_deck_murintrail['vx_value'] = {
      name          : "deck-murintrail",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_deck_murintrail
    }

    // (func item-armor-leathercuirass)
    nx_tactics_decks_scenario.t_item_armor_leathercuirass['vx_value'] = {
      name          : "item-armor-leathercuirass",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_armor_leathercuirass
    }

    // (func item-axehand)
    nx_tactics_decks_scenario.t_item_axehand['vx_value'] = {
      name          : "item-axehand",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_axehand
    }

    // (func item-barehanded)
    nx_tactics_decks_scenario.t_item_barehanded['vx_value'] = {
      name          : "item-barehanded",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_barehanded
    }

    // (func item-bowshort)
    nx_tactics_decks_scenario.t_item_bowshort['vx_value'] = {
      name          : "item-bowshort",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_bowshort
    }

    // (func item-dagger)
    nx_tactics_decks_scenario.t_item_dagger['vx_value'] = {
      name          : "item-dagger",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_dagger
    }

    // (func item-hammer)
    nx_tactics_decks_scenario.t_item_hammer['vx_value'] = {
      name          : "item-hammer",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_hammer
    }

    // (func item-shieldbuckler)
    nx_tactics_decks_scenario.t_item_shieldbuckler['vx_value'] = {
      name          : "item-shieldbuckler",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_shieldbuckler
    }

    // (func item-shieldheater)
    nx_tactics_decks_scenario.t_item_shieldheater['vx_value'] = {
      name          : "item-shieldheater",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_shieldheater
    }

    // (func item-shieldround)
    nx_tactics_decks_scenario.t_item_shieldround['vx_value'] = {
      name          : "item-shieldround",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_shieldround
    }

    // (func item-spear)
    nx_tactics_decks_scenario.t_item_spear['vx_value'] = {
      name          : "item-spear",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_spear
    }

    // (func item-spearshort)
    nx_tactics_decks_scenario.t_item_spearshort['vx_value'] = {
      name          : "item-spearshort",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_spearshort
    }

    // (func item-swordlong)
    nx_tactics_decks_scenario.t_item_swordlong['vx_value'] = {
      name          : "item-swordlong",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_swordlong
    }

    // (func item-woodaxe)
    nx_tactics_decks_scenario.t_item_woodaxe['vx_value'] = {
      name          : "item-woodaxe",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_item_woodaxe
    }

    // (func place-blacksmith)
    nx_tactics_decks_scenario.t_place_blacksmith['vx_value'] = {
      name          : "place-blacksmith",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_blacksmith
    }

    // (func place-campsite)
    nx_tactics_decks_scenario.t_place_campsite['vx_value'] = {
      name          : "place-campsite",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_campsite
    }

    // (func place-cavemouth)
    nx_tactics_decks_scenario.t_place_cavemouth['vx_value'] = {
      name          : "place-cavemouth",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_cavemouth
    }

    // (func place-farmhouse)
    nx_tactics_decks_scenario.t_place_farmhouse['vx_value'] = {
      name          : "place-farmhouse",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_farmhouse
    }

    // (func place-field)
    nx_tactics_decks_scenario.t_place_field['vx_value'] = {
      name          : "place-field",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_field
    }

    // (func place-forest)
    nx_tactics_decks_scenario.t_place_forest['vx_value'] = {
      name          : "place-forest",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_forest
    }

    // (func place-guardpost)
    nx_tactics_decks_scenario.t_place_guardpost['vx_value'] = {
      name          : "place-guardpost",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_guardpost
    }

    // (func place-mill)
    nx_tactics_decks_scenario.t_place_mill['vx_value'] = {
      name          : "place-mill",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_mill
    }

    // (func place-mountain)
    nx_tactics_decks_scenario.t_place_mountain['vx_value'] = {
      name          : "place-mountain",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_mountain
    }

    // (func place-stoneroad)
    nx_tactics_decks_scenario.t_place_stoneroad['vx_value'] = {
      name          : "place-stoneroad",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_stoneroad
    }

    // (func place-tavern)
    nx_tactics_decks_scenario.t_place_tavern['vx_value'] = {
      name          : "place-tavern",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_tavern
    }

    // (func place-temple)
    nx_tactics_decks_scenario.t_place_temple['vx_value'] = {
      name          : "place-temple",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_temple
    }

    // (func place-tradingpost)
    nx_tactics_decks_scenario.t_place_tradingpost['vx_value'] = {
      name          : "place-tradingpost",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_place_tradingpost
    }

    // (func unit-goblinscout)
    nx_tactics_decks_scenario.t_unit_goblinscout['vx_value'] = {
      name          : "unit-goblinscout",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_goblinscout
    }

    // (func unit-horse)
    nx_tactics_decks_scenario.t_unit_horse['vx_value'] = {
      name          : "unit-horse",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_horse
    }

    // (func unit-jesaveer)
    nx_tactics_decks_scenario.t_unit_jesaveer['vx_value'] = {
      name          : "unit-jesaveer",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_jesaveer
    }

    // (func unit-jonaveer)
    nx_tactics_decks_scenario.t_unit_jonaveer['vx_value'] = {
      name          : "unit-jonaveer",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_jonaveer
    }

    // (func unit-liliducon)
    nx_tactics_decks_scenario.t_unit_liliducon['vx_value'] = {
      name          : "unit-liliducon",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_liliducon
    }

    // (func unit-wilddog)
    nx_tactics_decks_scenario.t_unit_wilddog['vx_value'] = {
      name          : "unit-wilddog",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_wilddog
    }

    // (func unit-wilmducon)
    nx_tactics_decks_scenario.t_unit_wilmducon['vx_value'] = {
      name          : "unit-wilmducon",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_wilmducon
    }

    // (func unit-woodencart)
    nx_tactics_decks_scenario.t_unit_woodencart['vx_value'] = {
      name          : "unit-woodencart",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_woodencart
    }

    // (func unit-xeibhanower)
    nx_tactics_decks_scenario.t_unit_xeibhanower['vx_value'] = {
      name          : "unit-xeibhanower",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_unit_xeibhanower
    }

    // (const ability-bargain)
    Object.assign(nx_tactics_decks_scenario.c_ability_bargain, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Bargain"
    ))

    // (const ability-bite)
    Object.assign(nx_tactics_decks_scenario.c_ability_bite, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Bite"
    ))

    // (const ability-blacksmithing)
    Object.assign(nx_tactics_decks_scenario.c_ability_blacksmithing, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Blacksmithing"
    ))

    // (const ability-drag)
    Object.assign(nx_tactics_decks_scenario.c_ability_drag, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Drag"
    ))

    // (const ability-foraging)
    Object.assign(nx_tactics_decks_scenario.c_ability_foraging, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Foraging"
    ))

    // (const ability-grab)
    Object.assign(nx_tactics_decks_scenario.c_ability_grab, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Grab"
    ))

    // (const ability-sneak)
    Object.assign(nx_tactics_decks_scenario.c_ability_sneak, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Sneak"
    ))

    // (const ability-trapping)
    Object.assign(nx_tactics_decks_scenario.c_ability_trapping, vx_core.f_new(
      nx_tactics_base.t_ability,
      ":name",
      "Trapping"
    ))

    // (const power-groundmovement)
    Object.assign(nx_tactics_decks_scenario.c_power_groundmovement, vx_core.f_new(
      nx_tactics_base.t_power,
      ":name",
      "Ground Movement"
    ))

    // (const skill-business)
    Object.assign(nx_tactics_decks_scenario.c_skill_business, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Business"
    ))

    // (const skill-closecombat)
    Object.assign(nx_tactics_decks_scenario.c_skill_closecombat, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Close Combat"
    ))

    // (const skill-hunting)
    Object.assign(nx_tactics_decks_scenario.c_skill_hunting, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Hunting"
    ))

    // (const skill-melee)
    Object.assign(nx_tactics_decks_scenario.c_skill_melee, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Melee"
    ))

    // (const skill-stealth)
    Object.assign(nx_tactics_decks_scenario.c_skill_stealth, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Stealth"
    ))

    // (const skill-survival)
    Object.assign(nx_tactics_decks_scenario.c_skill_survival, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Survival"
    ))

    // (const skill-tradeskill)
    Object.assign(nx_tactics_decks_scenario.c_skill_tradeskill, vx_core.f_new(
      nx_tactics_base.t_skill,
      ":name",
      "Tradeskill"
    ))

  }
}
