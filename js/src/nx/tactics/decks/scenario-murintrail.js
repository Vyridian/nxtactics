'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_decks_data from "../../../nx/tactics/decks/data.js"


export default class nx_tactics_decks_scenario_murintrail {

  /**
   * Constant: power-groundmovement
   * {power}
   */
  static c_power_groundmovement = {vx_type: nx_tactics_base.t_power, vx_constdef: {pkgname: 'nx/tactics/decks/scenario-murintrail', name: 'power-groundmovement'}}

  /**
   * @function deck_murintrail
   * @return {deck}
   */
  static t_deck_murintrail = {
    vx_type: vx_core.t_type
  }
  static e_deck_murintrail = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_deck_murintrail
  }

  // (func deck-murintrail)
  static f_deck_murintrail() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const goblinscout = nx_tactics_decks_scenario_murintrail.f_unit_goblinscout()
        const goblinscout_i = nx_tactics_base.f_cardimage_from_card(goblinscout)
        const horse = nx_tactics_decks_scenario_murintrail.f_unit_horse()
        const horse_i = nx_tactics_base.f_cardimage_from_card(horse)
        return vx_core.f_new(
          nx_tactics_base.t_deck,
          ":name",
          "Murin Trail",
          ":cardmap",
          nx_tactics_base.f_cardmap_from_cardlist(
            vx_core.f_new(
              nx_tactics_base.t_cardlist,
              nx_tactics_decks_scenario_murintrail.f_unit_flint(),
              nx_tactics_decks_scenario_murintrail.f_unit_bandit(),
              nx_tactics_decks_scenario_murintrail.f_unit_bruiser(),
              nx_tactics_decks_scenario_murintrail.f_unit_guardsman(),
              nx_tactics_decks_scenario_murintrail.f_item_healingsalve(),
              nx_tactics_decks_scenario_murintrail.f_item_finewoodlandcloak(),
              nx_tactics_decks_scenario_murintrail.f_item_rations(),
              nx_tactics_decks_scenario_murintrail.f_item_waterskin(),
              nx_tactics_decks_data.f_tactics_skill("Close Combat"),
              nx_tactics_decks_data.f_tactics_skill("Melee"),
              nx_tactics_decks_data.f_tactics_skill("Stealth"),
              nx_tactics_decks_data.f_tactics_ability("Ambush"),
              nx_tactics_decks_data.f_tactics_ability("Sneak"),
              nx_tactics_decks_data.f_tactics_skill("Business"),
              nx_tactics_decks_data.f_tactics_ability("Bargain"),
              nx_tactics_decks_scenario_murintrail.f_item_coppercoins(),
              nx_tactics_decks_scenario_murintrail.f_item_silvercoins(),
              nx_tactics_decks_scenario_murintrail.f_item_goldcoins(),
              nx_tactics_decks_scenario_murintrail.f_item_platinumcoins(),
              nx_tactics_decks_scenario_murintrail.f_item_armor_leathercuirass(),
              nx_tactics_decks_scenario_murintrail.f_item_axehand(),
              nx_tactics_decks_scenario_murintrail.f_item_woodaxe(),
              nx_tactics_decks_data.f_tactics_item("Bare Handed"),
              nx_tactics_decks_data.f_tactics_item("Shortbow"),
              nx_tactics_decks_scenario_murintrail.f_item_dagger(),
              nx_tactics_decks_scenario_murintrail.f_item_hammer(),
              nx_tactics_decks_scenario_murintrail.f_item_shieldbuckler(),
              nx_tactics_decks_scenario_murintrail.f_item_shieldheater(),
              nx_tactics_decks_scenario_murintrail.f_item_shieldround(),
              nx_tactics_decks_scenario_murintrail.f_item_spear(),
              nx_tactics_decks_scenario_murintrail.f_item_shortspear(),
              nx_tactics_decks_scenario_murintrail.f_item_longsword(),
              nx_tactics_decks_scenario_murintrail.f_item_shortsword(),
              nx_tactics_decks_scenario_murintrail.f_unit_jesaveer(),
              nx_tactics_decks_scenario_murintrail.f_unit_jonaveer(),
              nx_tactics_decks_scenario_murintrail.f_unit_xeibhanower(),
              nx_tactics_decks_scenario_murintrail.f_unit_wilmducon(),
              nx_tactics_decks_scenario_murintrail.f_unit_liliducon(),
              nx_tactics_decks_scenario_murintrail.f_unit_wilddog(),
              goblinscout,
              goblinscout_i,
              nx_tactics_decks_scenario_murintrail.f_unit_horse(),
              horse_i,
              nx_tactics_decks_scenario_murintrail.f_unit_woodencart(),
              nx_tactics_decks_scenario_murintrail.f_place_field(),
              nx_tactics_decks_scenario_murintrail.f_place_forest(),
              nx_tactics_decks_scenario_murintrail.f_place_mountain(),
              nx_tactics_decks_scenario_murintrail.f_place_blacksmith(),
              nx_tactics_decks_scenario_murintrail.f_place_campsite(),
              nx_tactics_decks_scenario_murintrail.f_place_cavemouth(),
              nx_tactics_decks_scenario_murintrail.f_place_dirtpath(),
              nx_tactics_decks_scenario_murintrail.f_place_farmhouse(),
              nx_tactics_decks_scenario_murintrail.f_place_gravelroad(),
              nx_tactics_decks_scenario_murintrail.f_place_guardpost(),
              nx_tactics_decks_scenario_murintrail.f_place_horsestables(),
              nx_tactics_decks_scenario_murintrail.f_place_mill(),
              nx_tactics_decks_scenario_murintrail.f_place_stoneroad(),
              nx_tactics_decks_scenario_murintrail.f_place_tavern(),
              nx_tactics_decks_scenario_murintrail.f_place_tavern_bar(),
              nx_tactics_decks_scenario_murintrail.f_place_tavern_bedroom(),
              nx_tactics_decks_scenario_murintrail.f_place_tavern_common(),
              nx_tactics_decks_scenario_murintrail.f_place_tavern_dining(),
              nx_tactics_decks_scenario_murintrail.f_place_tavern_stairs(),
              nx_tactics_decks_scenario_murintrail.f_place_temple(),
              nx_tactics_decks_scenario_murintrail.f_place_tradingpost(),
              nx_tactics_decks_scenario_murintrail.f_place_woodenhall()
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_armor_leathercuirass
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
      "* [Armor]: 1x1 [Hardened vs Slash]\n* [Location]: [Shoulders] [Chest] [Abdomen] [Vitals]",
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_axehand
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
      "* [Fight]: [Melee]\n* [Damage]: [Size Bonus] [Hack] [Slash]\n* [Location]: [1-hand]",
      ":body",
      "9x-1",
      ":mass",
      "900g/2lb"
    )
    return output
  }

  /**
   * @function item_coppercoins
   * @return {item}
   */
  static t_item_coppercoins = {
    vx_type: vx_core.t_type
  }
  static e_item_coppercoins = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_coppercoins
  }

  // (func item-coppercoins)
  static f_item_coppercoins() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Copper Coins",
      ":image",
      "images/cards/item-coppercoins.svg",
      ":summary",
      "* A few (~5=$5) coins.\n* A pauper's wealth.\n* 10 Copper = 1 Silver\n* Cheap meal, 2 cheap drinks, night in a common room, a nice tip.",
      ":body",
      "5x-2",
      ":mass",
      "50g/.1lb"
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_dagger
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
      "* [Fight]: [Close Combat] or [Melee]\n* [Damage]: [Size Bonus] [Pierce] [Slash]\n* [Location]: [1-hand]",
      ":body",
      "5x-1",
      ":mass",
      "500g/1lb",
      ":energy",
      "50J",
      ":length",
      "25cm/10in"
    )
    return output
  }

  /**
   * @function item_finewoodlandcloak
   * @return {item}
   */
  static t_item_finewoodlandcloak = {
    vx_type: vx_core.t_type
  }
  static e_item_finewoodlandcloak = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_finewoodlandcloak
  }

  // (func item-finewoodlandcloak)
  static f_item_finewoodlandcloak() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Fine Woodland Cloak",
      ":image",
      "images/cards/item-finewoodlandcloak.svg",
      ":summary",
      "* [Passive]: [Stealth]:+1 in [Forest]\n* [Passive]: Discard the first [Fatigue] you receive from [Weather] each [Turn].",
      ":body",
      "2x0",
      ":mass",
      "2kg/4.4lb"
    )
    return output
  }

  /**
   * @function item_goldcoins
   * @return {item}
   */
  static t_item_goldcoins = {
    vx_type: vx_core.t_type
  }
  static e_item_goldcoins = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_goldcoins
  }

  // (func item-goldcoins)
  static f_item_goldcoins() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Gold Coins",
      ":image",
      "images/cards/item-goldcoins.svg",
      ":summary",
      "* A few (~5=$500) coins.\n* A tidy sum.\n* 10 Silver = 1 Gold\n* 10 Gold = 1 Platinum\n* A piece of quality gear.",
      ":body",
      "10x-2",
      ":mass",
      "150g/.3lb"
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_hammer
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
      "* [Fight]: [Melee]\n* [Damage]: [Size Bonus]+2 [Bash]\n* [Location]: [1-hand]",
      ":body",
      "2x0",
      ":mass",
      "2kg/4.4lb"
    )
    return output
  }

  /**
   * @function item_healingsalve
   * @return {item}
   */
  static t_item_healingsalve = {
    vx_type: vx_core.t_type
  }
  static e_item_healingsalve = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_healingsalve
  }

  // (func item-healingsalve)
  static f_item_healingsalve() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Healing Salve",
      ":image",
      "images/cards/item-healingsalve.svg",
      ":summary",
      "* [Uses]: 3\n* [Double Action] Use:1: Reduce a Major Wound to a Minor Wound.",
      ":body",
      "5x-1",
      ":mass",
      "500g/1.1lb"
    )
    return output
  }

  /**
   * @function item_longsword
   * @return {item}
   */
  static t_item_longsword = {
    vx_type: vx_core.t_type
  }
  static e_item_longsword = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_longsword
  }

  // (func item-longsword)
  static f_item_longsword() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Longsword",
      ":image",
      "images/cards/item-longsword.svg",
      ":summary",
      "* [Fight]: [Melee]\n* [Damage]: [Size Bonus]+1 [Pierce] [Slash]\n* [Location]: [1-hand]\n* [Armor]: 1x1",
      ":body",
      "10x-1",
      ":mass",
      "1.25kg/3lb"
    )
    return output
  }

  /**
   * @function item_platinumcoins
   * @return {item}
   */
  static t_item_platinumcoins = {
    vx_type: vx_core.t_type
  }
  static e_item_platinumcoins = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_platinumcoins
  }

  // (func item-platinumcoins)
  static f_item_platinumcoins() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Platinum Coins",
      ":image",
      "images/cards/item-platinumcoins.svg",
      ":summary",
      "* A few (~5=$5000) coins.\n* A small fortune.\n* 10 Gold = 1 Platinum\n* A piece of extremely high quality or magical gear.",
      ":body",
      "10x-2",
      ":mass",
      "150g/.3lb"
    )
    return output
  }

  /**
   * @function item_rations
   * @return {item}
   */
  static t_item_rations = {
    vx_type: vx_core.t_type
  }
  static e_item_rations = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_rations
  }

  // (func item-rations)
  static f_item_rations() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Rations",
      ":image",
      "images/cards/item-rations.svg",
      ":summary",
      "* Enough Food for 7-10 days.\n* Cost: [Silver Coins]\n* An assortment of jerky, dried fruits, hardtack, hardrolls, dried cheese, potatoes, turnips and nuts.\n* Water is heavy, so these are mostly dry. If consumed without water, the unit will be [Dehydrated] after 7 days.",
      ":body",
      "4x0",
      ":mass",
      "4kg/9lbs"
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_shieldbuckler
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
      "* [Armor]: 1x1\n* [Location]: [1-hand]",
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_shieldheater
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
      "* [Armor]: 2x1 [Hardened vs Hack]\n* [Location]: [1-hand]",
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_shieldround
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
      "* [Armor]: 2x1 [Hardened vs Pierce]\n* [Location]: [1-hand]",
      ":body",
      "5x0",
      ":mass",
      "5kg/11lb"
    )
    return output
  }

  /**
   * @function item_shortspear
   * @return {item}
   */
  static t_item_shortspear = {
    vx_type: vx_core.t_type
  }
  static e_item_shortspear = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_shortspear
  }

  // (func item-shortspear)
  static f_item_shortspear() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Short Spear",
      ":image",
      "images/cards/item-shortspear.svg",
      ":summary",
      "* [Fight]: [Melee]\n* [Damage]: [Size Bonus]+1 [Pierce] [Slash]\n* [Location]: [1-hand]\n* [Armor]: 1x1",
      ":body",
      "10x-1",
      ":mass",
      "1.5kg/4lb"
    )
    return output
  }

  /**
   * @function item_shortsword
   * @return {item}
   */
  static t_item_shortsword = {
    vx_type: vx_core.t_type
  }
  static e_item_shortsword = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_shortsword
  }

  // (func item-shortsword)
  static f_item_shortsword() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Shortsword",
      ":image",
      "images/cards/item-shortsword.svg",
      ":summary",
      "* [Fight]: [Melee]\n* [Damage]: [Size Bonus]+1 [Pierce] [Slash]\n* [Location]: [1-hand]\n* [Armor]: 1x1",
      ":body",
      "10x-1",
      ":mass",
      "1kg/2.2lb"
    )
    return output
  }

  /**
   * @function item_silvercoins
   * @return {item}
   */
  static t_item_silvercoins = {
    vx_type: vx_core.t_type
  }
  static e_item_silvercoins = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_silvercoins
  }

  // (func item-silvercoins)
  static f_item_silvercoins() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Silver Coins",
      ":image",
      "images/cards/item-silvercoins.svg",
      ":summary",
      "* A few (~5=$50) coins.\n* Spending money.\n* 10 Copper = 1 Silver\n* 10 Silver = 1 Gold\n* 2 nice meals, 3 bottles wine, round of drinks, a private room, week supplies, cheap gear.",
      ":body",
      "10x-2",
      ":mass",
      "100g/.2lb"
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_spear
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
      "* [Fight]: [Melee] [Reach]\n* [Damage]: [Size Bonus]+3 [Pierce] [Slash]\n* [Location]: [2-hand]\n* [Armor]: 1x1",
      ":body",
      "3x0",
      ":mass",
      "3kg/6lb"
    )
    return output
  }

  /**
   * @function item_waterskin
   * @return {item}
   */
  static t_item_waterskin = {
    vx_type: vx_core.t_type
  }
  static e_item_waterskin = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_waterskin
  }

  // (func item-waterskin)
  static f_item_waterskin() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Waterskin",
      ":image",
      "images/cards/item-waterskin.svg",
      ":summary",
      "* 2 liters/.5 gallon. Enough Water for 2 days.\n* Cost: [Copper Coins]. Can be refilled from any clean water source.",
      ":body",
      "2x0",
      ":mass",
      "2kg/4.4lbs"
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_item_woodaxe
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
      "* [Fight]: [Melee]-1\n* [Damage]: [Size Bonus]+3 [Hack] [Slash]\n* [Location]: [2-hand]\n* [Armor]: 1x1",
      ":body",
      "3x0",
      ":mass",
      "3.1kg/7lb"
    )
    return output
  }

  /**
   * @function place_blacksmith
   * @return {place}
   */
  static t_place_blacksmith = {
    vx_type: vx_core.t_type
  }
  static e_place_blacksmith = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_blacksmith
  }

  // (func place-blacksmith)
  static f_place_blacksmith() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Blacksmith",
      ":image",
      "images/cards/place-blacksmith.svg"
    )
    return output
  }

  /**
   * @function place_campsite
   * @return {place}
   */
  static t_place_campsite = {
    vx_type: vx_core.t_type
  }
  static e_place_campsite = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_campsite
  }

  // (func place-campsite)
  static f_place_campsite() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Campsite",
      ":image",
      "images/cards/place-campsite.svg"
    )
    return output
  }

  /**
   * @function place_cavemouth
   * @return {place}
   */
  static t_place_cavemouth = {
    vx_type: vx_core.t_type
  }
  static e_place_cavemouth = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_cavemouth
  }

  // (func place-cavemouth)
  static f_place_cavemouth() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Cave Mouth",
      ":image",
      "images/cards/place-cavemouth.svg"
    )
    return output
  }

  /**
   * @function place_dirtpath
   * @return {place}
   */
  static t_place_dirtpath = {
    vx_type: vx_core.t_type
  }
  static e_place_dirtpath = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_dirtpath
  }

  // (func place-dirtpath)
  static f_place_dirtpath() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Dirt Path",
      ":image",
      "images/cards/place-dirtpath.svg"
    )
    return output
  }

  /**
   * @function place_farmhouse
   * @return {place}
   */
  static t_place_farmhouse = {
    vx_type: vx_core.t_type
  }
  static e_place_farmhouse = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_farmhouse
  }

  // (func place-farmhouse)
  static f_place_farmhouse() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Farmhouse",
      ":image",
      "images/cards/place-farmhouse.svg"
    )
    return output
  }

  /**
   * @function place_field
   * @return {place}
   */
  static t_place_field = {
    vx_type: vx_core.t_type
  }
  static e_place_field = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_field
  }

  // (func place-field)
  static f_place_field() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Field",
      ":image",
      "images/cards/place-field.svg"
    )
    return output
  }

  /**
   * @function place_forest
   * @return {place}
   */
  static t_place_forest = {
    vx_type: vx_core.t_type
  }
  static e_place_forest = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_forest
  }

  // (func place-forest)
  static f_place_forest() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Forest",
      ":image",
      "images/cards/place-forest.svg"
    )
    return output
  }

  /**
   * @function place_gravelroad
   * @return {place}
   */
  static t_place_gravelroad = {
    vx_type: vx_core.t_type
  }
  static e_place_gravelroad = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_gravelroad
  }

  // (func place-gravelroad)
  static f_place_gravelroad() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Gravel Road",
      ":image",
      "images/cards/place-gravelroad.svg"
    )
    return output
  }

  /**
   * @function place_guardpost
   * @return {place}
   */
  static t_place_guardpost = {
    vx_type: vx_core.t_type
  }
  static e_place_guardpost = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_guardpost
  }

  // (func place-guardpost)
  static f_place_guardpost() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Guardpost",
      ":image",
      "images/cards/place-guardpost.svg"
    )
    return output
  }

  /**
   * @function place_horsestables
   * @return {place}
   */
  static t_place_horsestables = {
    vx_type: vx_core.t_type
  }
  static e_place_horsestables = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_horsestables
  }

  // (func place-horsestables)
  static f_place_horsestables() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Horse Stables",
      ":image",
      "images/cards/place-horsestables.svg"
    )
    return output
  }

  /**
   * @function place_mill
   * @return {place}
   */
  static t_place_mill = {
    vx_type: vx_core.t_type
  }
  static e_place_mill = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_mill
  }

  // (func place-mill)
  static f_place_mill() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Mill",
      ":image",
      "images/cards/place-mill.svg"
    )
    return output
  }

  /**
   * @function place_mountain
   * @return {place}
   */
  static t_place_mountain = {
    vx_type: vx_core.t_type
  }
  static e_place_mountain = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_mountain
  }

  // (func place-mountain)
  static f_place_mountain() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Mountain",
      ":image",
      "images/cards/place-mountain.svg"
    )
    return output
  }

  /**
   * @function place_stoneroad
   * @return {place}
   */
  static t_place_stoneroad = {
    vx_type: vx_core.t_type
  }
  static e_place_stoneroad = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_stoneroad
  }

  // (func place-stoneroad)
  static f_place_stoneroad() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Stone Road",
      ":image",
      "images/cards/place-stoneroad.svg"
    )
    return output
  }

  /**
   * @function place_tavern
   * @return {place}
   */
  static t_place_tavern = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_tavern
  }

  // (func place-tavern)
  static f_place_tavern() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Tavern",
      ":image",
      "images/cards/place-tavern.svg"
    )
    return output
  }

  /**
   * @function place_tavern_bar
   * @return {place}
   */
  static t_place_tavern_bar = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_bar = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_tavern_bar
  }

  // (func place-tavern-bar)
  static f_place_tavern_bar() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Tavern Bar",
      ":image",
      "images/cards/place-tavern-bar.svg"
    )
    return output
  }

  /**
   * @function place_tavern_bedroom
   * @return {place}
   */
  static t_place_tavern_bedroom = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_bedroom = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_tavern_bedroom
  }

  // (func place-tavern-bedroom)
  static f_place_tavern_bedroom() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Tavern Bedroom",
      ":image",
      "images/cards/place-tavern-bedroom.svg"
    )
    return output
  }

  /**
   * @function place_tavern_common
   * @return {place}
   */
  static t_place_tavern_common = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_common = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_tavern_common
  }

  // (func place-tavern-common)
  static f_place_tavern_common() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Tavern Common",
      ":image",
      "images/cards/place-tavern-common.svg"
    )
    return output
  }

  /**
   * @function place_tavern_dining
   * @return {place}
   */
  static t_place_tavern_dining = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_dining = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_tavern_dining
  }

  // (func place-tavern-dining)
  static f_place_tavern_dining() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Tavern Dining",
      ":image",
      "images/cards/place-tavern-dining.svg"
    )
    return output
  }

  /**
   * @function place_tavern_stairs
   * @return {place}
   */
  static t_place_tavern_stairs = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_stairs = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_tavern_stairs
  }

  // (func place-tavern-stairs)
  static f_place_tavern_stairs() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Tavern Stairs",
      ":image",
      "images/cards/place-tavern-stairs.svg"
    )
    return output
  }

  /**
   * @function place_temple
   * @return {place}
   */
  static t_place_temple = {
    vx_type: vx_core.t_type
  }
  static e_place_temple = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_temple
  }

  // (func place-temple)
  static f_place_temple() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Temple",
      ":image",
      "images/cards/place-temple.svg"
    )
    return output
  }

  /**
   * @function place_tradingpost
   * @return {place}
   */
  static t_place_tradingpost = {
    vx_type: vx_core.t_type
  }
  static e_place_tradingpost = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_tradingpost
  }

  // (func place-tradingpost)
  static f_place_tradingpost() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Trading Post",
      ":image",
      "images/cards/place-tradingpost.svg"
    )
    return output
  }

  /**
   * @function place_woodenhall
   * @return {place}
   */
  static t_place_woodenhall = {
    vx_type: vx_core.t_type
  }
  static e_place_woodenhall = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_place_woodenhall
  }

  // (func place-woodenhall)
  static f_place_woodenhall() {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new(
      nx_tactics_base.t_place,
      ":name",
      "Wooden Hall",
      ":image",
      "images/cards/place-woodenhall.svg"
    )
    return output
  }

  /**
   * @function unit_bandit
   * @return {unit}
   */
  static t_unit_bandit = {
    vx_type: vx_core.t_type
  }
  static e_unit_bandit = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_bandit
  }

  // (func unit-bandit)
  static f_unit_bandit() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Bandit",
      ":image",
      "images/cards/unit-bandit.svg",
      ":summary",
      "A highwayman.",
      ":race",
      "Human",
      ":gender",
      "M",
      ":body",
      "8x1",
      ":mind",
      "5x1",
      ":will",
      "5x1",
      ":move",
      "3x1",
      ":mass",
      "80kg/180",
      ":height",
      "1.8m/6ft",
      ":speedland",
      "30kph/20mph",
      ":mass",
      "80kg/220lb",
      ":height",
      "1.9m/6'3ft",
      ":demeanor",
      "Opportunistic",
      ":nature",
      "Ruthless",
      ":beast",
      "2x0",
      ":shadow",
      "5x0",
      ":value",
      "1x0",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Melee"),
          ":level",
          "3",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario_murintrail.f_item_shortsword()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Stealth"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Ambush")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_bruiser
   * @return {unit}
   */
  static t_unit_bruiser = {
    vx_type: vx_core.t_type
  }
  static e_unit_bruiser = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_bruiser
  }

  // (func unit-bruiser)
  static f_unit_bruiser() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Bruiser",
      ":image",
      "images/cards/unit-bruiser.svg",
      ":summary",
      "A burly, intimidating man.",
      ":race",
      "Human",
      ":gender",
      "M",
      ":body",
      "10x1",
      ":mind",
      "3x1",
      ":will",
      "5x1",
      ":move",
      "2x1",
      ":mass",
      "100kg/220lb",
      ":height",
      "1.9m/6'3ft",
      ":speedland",
      "20kph/12.5mph",
      ":demeanor",
      "Glaring",
      ":nature",
      "Callous",
      ":beast",
      "5x0",
      ":shadow",
      "1x0",
      ":value",
      "1x0",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Close Combat"),
          ":level",
          "2",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Grab")
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Intimidation"),
          ":level",
          "1"
        )
      )
    )
    return output
  }

  /**
   * @function unit_flint
   * @return {unit}
   */
  static t_unit_flint = {
    vx_type: vx_core.t_type
  }
  static e_unit_flint = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_flint
  }

  // (func unit-flint)
  static f_unit_flint() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Flint (Early)",
      ":image",
      "images/cards/unit-flint.svg",
      ":race",
      "Half-elven",
      ":gender",
      "M",
      ":age",
      17,
      ":body",
      "7x1",
      ":mind",
      "5x1",
      ":will",
      "5x1",
      ":move",
      "3x1",
      ":mass",
      "70kg/153lb",
      ":height",
      "1.67m/5'6",
      ":beast",
      "1x0",
      ":shadow",
      "1x0",
      ":value",
      "1x0",
      ":speedland",
      "30kph/20mph",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Close Combat"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario_murintrail.f_item_dagger()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Stealth"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Sneak")
            )
          )
        )
      )
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_goblinscout
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
      "2x1",
      ":value",
      "1x0",
      ":mass",
      "22kg/50lb",
      ":height",
      "1m/3ft",
      ":speedland",
      "20kph",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Close Combat"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario_murintrail.f_item_dagger()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Stealth"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Sneak")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_guardsman
   * @return {unit}
   */
  static t_unit_guardsman = {
    vx_type: vx_core.t_type
  }
  static e_unit_guardsman = {
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_guardsman
  }

  // (func unit-guardsman)
  static f_unit_guardsman() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      nx_tactics_base.t_unit,
      ":name",
      "Guardsman",
      ":image",
      "images/cards/unit-guardsman.svg",
      ":summary",
      "A typical member of a city watch or to keep lookout.",
      ":race",
      "Human",
      ":gender",
      "M",
      ":body",
      "8x1",
      ":mind",
      "5x1",
      ":will",
      "5x1",
      ":move",
      "3x1",
      ":mass",
      "80kg/175",
      ":height",
      "1.8m/6ft",
      ":speedland",
      "30kph/20mph",
      ":height",
      "1.9m/6'3ft",
      ":demeanor",
      "Indifferent",
      ":nature",
      "Lazy",
      ":beast",
      "1x0",
      ":shadow",
      "2x0",
      ":value",
      "1x0",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Melee"),
          ":level",
          "2",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario_murintrail.f_item_shortspear()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Investigation"),
          ":level",
          "1"
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_horse
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
      ":imgmirror",
      true,
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
      ":nature",
      "Skitish",
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          nx_tactics_base.t_unitpower,
          ":power",
          nx_tactics_decks_scenario_murintrail.c_power_groundmovement,
          ":level",
          "4x1"
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_jesaveer
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
      "3x1",
      ":mass",
      "63kg",
      ":height",
      "1.72m/5ft7",
      ":speedland",
      "30kph/20mph",
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
          nx_tactics_decks_data.f_tactics_skill("Melee"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario_murintrail.f_item_hammer()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Tradeskill"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Blacksmithing")
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_jonaveer
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
      "3x1",
      ":mass",
      "75kg",
      ":height",
      "1.78m/5ft10",
      ":speedland",
      "30kph/20mph",
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
          nx_tactics_decks_data.f_tactics_skill("Melee"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario_murintrail.f_item_spear()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Business"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_skill("Bargain")
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_liliducon
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
      "A pleasant and perceptive young lady, who moved with her father Wilm. She took her mother's death hard, and is having a difficult time adapting.",
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
      "2x1",
      ":mass",
      "40kg/88lb",
      ":height",
      "1.5m/5ft",
      ":speedland",
      "20kph",
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
          nx_tactics_decks_data.f_tactics_skill("Survival"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_skill("Foraging")
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_wilddog
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
          nx_tactics_decks_data.f_tactics_skill("Close Combat"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Bite")
            ),
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Grab")
            ),
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Drag")
            )
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          nx_tactics_base.t_unitpower,
          ":power",
          nx_tactics_decks_scenario_murintrail.c_power_groundmovement,
          ":level",
          "7x1"
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_wilmducon
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
      "A proud, prickly huntsman who lost his wife in a violent raid and moved away with his daughter, Lily, to restart his life.",
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
      "3x1",
      ":mass",
      "80kg/180",
      ":height",
      "1.8m/6ft",
      ":speedland",
      "30kph/20mph",
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
          nx_tactics_decks_data.f_tactics_skill("Melee"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_scenario_murintrail.f_item_woodaxe()
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Hunting"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Trapping")
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_woodencart
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
    vx_type: nx_tactics_decks_scenario_murintrail.t_unit_xeibhanower
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
      "2.5x1",
      ":mass",
      "80kg",
      ":height",
      "1.78m/5'10",
      ":speedland",
      "25kph"
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "power-groundmovement": nx_tactics_decks_scenario_murintrail.c_power_groundmovement
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-murintrail": nx_tactics_decks_scenario_murintrail.e_deck_murintrail,
      "item-armor-leathercuirass": nx_tactics_decks_scenario_murintrail.e_item_armor_leathercuirass,
      "item-axehand": nx_tactics_decks_scenario_murintrail.e_item_axehand,
      "item-coppercoins": nx_tactics_decks_scenario_murintrail.e_item_coppercoins,
      "item-dagger": nx_tactics_decks_scenario_murintrail.e_item_dagger,
      "item-finewoodlandcloak": nx_tactics_decks_scenario_murintrail.e_item_finewoodlandcloak,
      "item-goldcoins": nx_tactics_decks_scenario_murintrail.e_item_goldcoins,
      "item-hammer": nx_tactics_decks_scenario_murintrail.e_item_hammer,
      "item-healingsalve": nx_tactics_decks_scenario_murintrail.e_item_healingsalve,
      "item-longsword": nx_tactics_decks_scenario_murintrail.e_item_longsword,
      "item-platinumcoins": nx_tactics_decks_scenario_murintrail.e_item_platinumcoins,
      "item-rations": nx_tactics_decks_scenario_murintrail.e_item_rations,
      "item-shieldbuckler": nx_tactics_decks_scenario_murintrail.e_item_shieldbuckler,
      "item-shieldheater": nx_tactics_decks_scenario_murintrail.e_item_shieldheater,
      "item-shieldround": nx_tactics_decks_scenario_murintrail.e_item_shieldround,
      "item-shortspear": nx_tactics_decks_scenario_murintrail.e_item_shortspear,
      "item-shortsword": nx_tactics_decks_scenario_murintrail.e_item_shortsword,
      "item-silvercoins": nx_tactics_decks_scenario_murintrail.e_item_silvercoins,
      "item-spear": nx_tactics_decks_scenario_murintrail.e_item_spear,
      "item-waterskin": nx_tactics_decks_scenario_murintrail.e_item_waterskin,
      "item-woodaxe": nx_tactics_decks_scenario_murintrail.e_item_woodaxe,
      "place-blacksmith": nx_tactics_decks_scenario_murintrail.e_place_blacksmith,
      "place-campsite": nx_tactics_decks_scenario_murintrail.e_place_campsite,
      "place-cavemouth": nx_tactics_decks_scenario_murintrail.e_place_cavemouth,
      "place-dirtpath": nx_tactics_decks_scenario_murintrail.e_place_dirtpath,
      "place-farmhouse": nx_tactics_decks_scenario_murintrail.e_place_farmhouse,
      "place-field": nx_tactics_decks_scenario_murintrail.e_place_field,
      "place-forest": nx_tactics_decks_scenario_murintrail.e_place_forest,
      "place-gravelroad": nx_tactics_decks_scenario_murintrail.e_place_gravelroad,
      "place-guardpost": nx_tactics_decks_scenario_murintrail.e_place_guardpost,
      "place-horsestables": nx_tactics_decks_scenario_murintrail.e_place_horsestables,
      "place-mill": nx_tactics_decks_scenario_murintrail.e_place_mill,
      "place-mountain": nx_tactics_decks_scenario_murintrail.e_place_mountain,
      "place-stoneroad": nx_tactics_decks_scenario_murintrail.e_place_stoneroad,
      "place-tavern": nx_tactics_decks_scenario_murintrail.e_place_tavern,
      "place-tavern-bar": nx_tactics_decks_scenario_murintrail.e_place_tavern_bar,
      "place-tavern-bedroom": nx_tactics_decks_scenario_murintrail.e_place_tavern_bedroom,
      "place-tavern-common": nx_tactics_decks_scenario_murintrail.e_place_tavern_common,
      "place-tavern-dining": nx_tactics_decks_scenario_murintrail.e_place_tavern_dining,
      "place-tavern-stairs": nx_tactics_decks_scenario_murintrail.e_place_tavern_stairs,
      "place-temple": nx_tactics_decks_scenario_murintrail.e_place_temple,
      "place-tradingpost": nx_tactics_decks_scenario_murintrail.e_place_tradingpost,
      "place-woodenhall": nx_tactics_decks_scenario_murintrail.e_place_woodenhall,
      "unit-bandit": nx_tactics_decks_scenario_murintrail.e_unit_bandit,
      "unit-bruiser": nx_tactics_decks_scenario_murintrail.e_unit_bruiser,
      "unit-flint": nx_tactics_decks_scenario_murintrail.e_unit_flint,
      "unit-goblinscout": nx_tactics_decks_scenario_murintrail.e_unit_goblinscout,
      "unit-guardsman": nx_tactics_decks_scenario_murintrail.e_unit_guardsman,
      "unit-horse": nx_tactics_decks_scenario_murintrail.e_unit_horse,
      "unit-jesaveer": nx_tactics_decks_scenario_murintrail.e_unit_jesaveer,
      "unit-jonaveer": nx_tactics_decks_scenario_murintrail.e_unit_jonaveer,
      "unit-liliducon": nx_tactics_decks_scenario_murintrail.e_unit_liliducon,
      "unit-wilddog": nx_tactics_decks_scenario_murintrail.e_unit_wilddog,
      "unit-wilmducon": nx_tactics_decks_scenario_murintrail.e_unit_wilmducon,
      "unit-woodencart": nx_tactics_decks_scenario_murintrail.e_unit_woodencart,
      "unit-xeibhanower": nx_tactics_decks_scenario_murintrail.e_unit_xeibhanower
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-murintrail": nx_tactics_decks_scenario_murintrail.t_deck_murintrail,
      "item-armor-leathercuirass": nx_tactics_decks_scenario_murintrail.t_item_armor_leathercuirass,
      "item-axehand": nx_tactics_decks_scenario_murintrail.t_item_axehand,
      "item-coppercoins": nx_tactics_decks_scenario_murintrail.t_item_coppercoins,
      "item-dagger": nx_tactics_decks_scenario_murintrail.t_item_dagger,
      "item-finewoodlandcloak": nx_tactics_decks_scenario_murintrail.t_item_finewoodlandcloak,
      "item-goldcoins": nx_tactics_decks_scenario_murintrail.t_item_goldcoins,
      "item-hammer": nx_tactics_decks_scenario_murintrail.t_item_hammer,
      "item-healingsalve": nx_tactics_decks_scenario_murintrail.t_item_healingsalve,
      "item-longsword": nx_tactics_decks_scenario_murintrail.t_item_longsword,
      "item-platinumcoins": nx_tactics_decks_scenario_murintrail.t_item_platinumcoins,
      "item-rations": nx_tactics_decks_scenario_murintrail.t_item_rations,
      "item-shieldbuckler": nx_tactics_decks_scenario_murintrail.t_item_shieldbuckler,
      "item-shieldheater": nx_tactics_decks_scenario_murintrail.t_item_shieldheater,
      "item-shieldround": nx_tactics_decks_scenario_murintrail.t_item_shieldround,
      "item-shortspear": nx_tactics_decks_scenario_murintrail.t_item_shortspear,
      "item-shortsword": nx_tactics_decks_scenario_murintrail.t_item_shortsword,
      "item-silvercoins": nx_tactics_decks_scenario_murintrail.t_item_silvercoins,
      "item-spear": nx_tactics_decks_scenario_murintrail.t_item_spear,
      "item-waterskin": nx_tactics_decks_scenario_murintrail.t_item_waterskin,
      "item-woodaxe": nx_tactics_decks_scenario_murintrail.t_item_woodaxe,
      "place-blacksmith": nx_tactics_decks_scenario_murintrail.t_place_blacksmith,
      "place-campsite": nx_tactics_decks_scenario_murintrail.t_place_campsite,
      "place-cavemouth": nx_tactics_decks_scenario_murintrail.t_place_cavemouth,
      "place-dirtpath": nx_tactics_decks_scenario_murintrail.t_place_dirtpath,
      "place-farmhouse": nx_tactics_decks_scenario_murintrail.t_place_farmhouse,
      "place-field": nx_tactics_decks_scenario_murintrail.t_place_field,
      "place-forest": nx_tactics_decks_scenario_murintrail.t_place_forest,
      "place-gravelroad": nx_tactics_decks_scenario_murintrail.t_place_gravelroad,
      "place-guardpost": nx_tactics_decks_scenario_murintrail.t_place_guardpost,
      "place-horsestables": nx_tactics_decks_scenario_murintrail.t_place_horsestables,
      "place-mill": nx_tactics_decks_scenario_murintrail.t_place_mill,
      "place-mountain": nx_tactics_decks_scenario_murintrail.t_place_mountain,
      "place-stoneroad": nx_tactics_decks_scenario_murintrail.t_place_stoneroad,
      "place-tavern": nx_tactics_decks_scenario_murintrail.t_place_tavern,
      "place-tavern-bar": nx_tactics_decks_scenario_murintrail.t_place_tavern_bar,
      "place-tavern-bedroom": nx_tactics_decks_scenario_murintrail.t_place_tavern_bedroom,
      "place-tavern-common": nx_tactics_decks_scenario_murintrail.t_place_tavern_common,
      "place-tavern-dining": nx_tactics_decks_scenario_murintrail.t_place_tavern_dining,
      "place-tavern-stairs": nx_tactics_decks_scenario_murintrail.t_place_tavern_stairs,
      "place-temple": nx_tactics_decks_scenario_murintrail.t_place_temple,
      "place-tradingpost": nx_tactics_decks_scenario_murintrail.t_place_tradingpost,
      "place-woodenhall": nx_tactics_decks_scenario_murintrail.t_place_woodenhall,
      "unit-bandit": nx_tactics_decks_scenario_murintrail.t_unit_bandit,
      "unit-bruiser": nx_tactics_decks_scenario_murintrail.t_unit_bruiser,
      "unit-flint": nx_tactics_decks_scenario_murintrail.t_unit_flint,
      "unit-goblinscout": nx_tactics_decks_scenario_murintrail.t_unit_goblinscout,
      "unit-guardsman": nx_tactics_decks_scenario_murintrail.t_unit_guardsman,
      "unit-horse": nx_tactics_decks_scenario_murintrail.t_unit_horse,
      "unit-jesaveer": nx_tactics_decks_scenario_murintrail.t_unit_jesaveer,
      "unit-jonaveer": nx_tactics_decks_scenario_murintrail.t_unit_jonaveer,
      "unit-liliducon": nx_tactics_decks_scenario_murintrail.t_unit_liliducon,
      "unit-wilddog": nx_tactics_decks_scenario_murintrail.t_unit_wilddog,
      "unit-wilmducon": nx_tactics_decks_scenario_murintrail.t_unit_wilmducon,
      "unit-woodencart": nx_tactics_decks_scenario_murintrail.t_unit_woodencart,
      "unit-xeibhanower": nx_tactics_decks_scenario_murintrail.t_unit_xeibhanower
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scenario-murintrail",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-murintrail)
    nx_tactics_decks_scenario_murintrail.t_deck_murintrail['vx_value'] = {
      name          : "deck-murintrail",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_deck_murintrail
    }

    // (func item-armor-leathercuirass)
    nx_tactics_decks_scenario_murintrail.t_item_armor_leathercuirass['vx_value'] = {
      name          : "item-armor-leathercuirass",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_armor_leathercuirass
    }

    // (func item-axehand)
    nx_tactics_decks_scenario_murintrail.t_item_axehand['vx_value'] = {
      name          : "item-axehand",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_axehand
    }

    // (func item-coppercoins)
    nx_tactics_decks_scenario_murintrail.t_item_coppercoins['vx_value'] = {
      name          : "item-coppercoins",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_coppercoins
    }

    // (func item-dagger)
    nx_tactics_decks_scenario_murintrail.t_item_dagger['vx_value'] = {
      name          : "item-dagger",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_dagger
    }

    // (func item-finewoodlandcloak)
    nx_tactics_decks_scenario_murintrail.t_item_finewoodlandcloak['vx_value'] = {
      name          : "item-finewoodlandcloak",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_finewoodlandcloak
    }

    // (func item-goldcoins)
    nx_tactics_decks_scenario_murintrail.t_item_goldcoins['vx_value'] = {
      name          : "item-goldcoins",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_goldcoins
    }

    // (func item-hammer)
    nx_tactics_decks_scenario_murintrail.t_item_hammer['vx_value'] = {
      name          : "item-hammer",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_hammer
    }

    // (func item-healingsalve)
    nx_tactics_decks_scenario_murintrail.t_item_healingsalve['vx_value'] = {
      name          : "item-healingsalve",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_healingsalve
    }

    // (func item-longsword)
    nx_tactics_decks_scenario_murintrail.t_item_longsword['vx_value'] = {
      name          : "item-longsword",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_longsword
    }

    // (func item-platinumcoins)
    nx_tactics_decks_scenario_murintrail.t_item_platinumcoins['vx_value'] = {
      name          : "item-platinumcoins",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_platinumcoins
    }

    // (func item-rations)
    nx_tactics_decks_scenario_murintrail.t_item_rations['vx_value'] = {
      name          : "item-rations",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_rations
    }

    // (func item-shieldbuckler)
    nx_tactics_decks_scenario_murintrail.t_item_shieldbuckler['vx_value'] = {
      name          : "item-shieldbuckler",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_shieldbuckler
    }

    // (func item-shieldheater)
    nx_tactics_decks_scenario_murintrail.t_item_shieldheater['vx_value'] = {
      name          : "item-shieldheater",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_shieldheater
    }

    // (func item-shieldround)
    nx_tactics_decks_scenario_murintrail.t_item_shieldround['vx_value'] = {
      name          : "item-shieldround",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_shieldround
    }

    // (func item-shortspear)
    nx_tactics_decks_scenario_murintrail.t_item_shortspear['vx_value'] = {
      name          : "item-shortspear",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_shortspear
    }

    // (func item-shortsword)
    nx_tactics_decks_scenario_murintrail.t_item_shortsword['vx_value'] = {
      name          : "item-shortsword",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_shortsword
    }

    // (func item-silvercoins)
    nx_tactics_decks_scenario_murintrail.t_item_silvercoins['vx_value'] = {
      name          : "item-silvercoins",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_silvercoins
    }

    // (func item-spear)
    nx_tactics_decks_scenario_murintrail.t_item_spear['vx_value'] = {
      name          : "item-spear",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_spear
    }

    // (func item-waterskin)
    nx_tactics_decks_scenario_murintrail.t_item_waterskin['vx_value'] = {
      name          : "item-waterskin",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_waterskin
    }

    // (func item-woodaxe)
    nx_tactics_decks_scenario_murintrail.t_item_woodaxe['vx_value'] = {
      name          : "item-woodaxe",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_item_woodaxe
    }

    // (func place-blacksmith)
    nx_tactics_decks_scenario_murintrail.t_place_blacksmith['vx_value'] = {
      name          : "place-blacksmith",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_blacksmith
    }

    // (func place-campsite)
    nx_tactics_decks_scenario_murintrail.t_place_campsite['vx_value'] = {
      name          : "place-campsite",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_campsite
    }

    // (func place-cavemouth)
    nx_tactics_decks_scenario_murintrail.t_place_cavemouth['vx_value'] = {
      name          : "place-cavemouth",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_cavemouth
    }

    // (func place-dirtpath)
    nx_tactics_decks_scenario_murintrail.t_place_dirtpath['vx_value'] = {
      name          : "place-dirtpath",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_dirtpath
    }

    // (func place-farmhouse)
    nx_tactics_decks_scenario_murintrail.t_place_farmhouse['vx_value'] = {
      name          : "place-farmhouse",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_farmhouse
    }

    // (func place-field)
    nx_tactics_decks_scenario_murintrail.t_place_field['vx_value'] = {
      name          : "place-field",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_field
    }

    // (func place-forest)
    nx_tactics_decks_scenario_murintrail.t_place_forest['vx_value'] = {
      name          : "place-forest",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_forest
    }

    // (func place-gravelroad)
    nx_tactics_decks_scenario_murintrail.t_place_gravelroad['vx_value'] = {
      name          : "place-gravelroad",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_gravelroad
    }

    // (func place-guardpost)
    nx_tactics_decks_scenario_murintrail.t_place_guardpost['vx_value'] = {
      name          : "place-guardpost",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_guardpost
    }

    // (func place-horsestables)
    nx_tactics_decks_scenario_murintrail.t_place_horsestables['vx_value'] = {
      name          : "place-horsestables",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_horsestables
    }

    // (func place-mill)
    nx_tactics_decks_scenario_murintrail.t_place_mill['vx_value'] = {
      name          : "place-mill",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_mill
    }

    // (func place-mountain)
    nx_tactics_decks_scenario_murintrail.t_place_mountain['vx_value'] = {
      name          : "place-mountain",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_mountain
    }

    // (func place-stoneroad)
    nx_tactics_decks_scenario_murintrail.t_place_stoneroad['vx_value'] = {
      name          : "place-stoneroad",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_stoneroad
    }

    // (func place-tavern)
    nx_tactics_decks_scenario_murintrail.t_place_tavern['vx_value'] = {
      name          : "place-tavern",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_tavern
    }

    // (func place-tavern-bar)
    nx_tactics_decks_scenario_murintrail.t_place_tavern_bar['vx_value'] = {
      name          : "place-tavern-bar",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_tavern_bar
    }

    // (func place-tavern-bedroom)
    nx_tactics_decks_scenario_murintrail.t_place_tavern_bedroom['vx_value'] = {
      name          : "place-tavern-bedroom",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_tavern_bedroom
    }

    // (func place-tavern-common)
    nx_tactics_decks_scenario_murintrail.t_place_tavern_common['vx_value'] = {
      name          : "place-tavern-common",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_tavern_common
    }

    // (func place-tavern-dining)
    nx_tactics_decks_scenario_murintrail.t_place_tavern_dining['vx_value'] = {
      name          : "place-tavern-dining",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_tavern_dining
    }

    // (func place-tavern-stairs)
    nx_tactics_decks_scenario_murintrail.t_place_tavern_stairs['vx_value'] = {
      name          : "place-tavern-stairs",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_tavern_stairs
    }

    // (func place-temple)
    nx_tactics_decks_scenario_murintrail.t_place_temple['vx_value'] = {
      name          : "place-temple",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_temple
    }

    // (func place-tradingpost)
    nx_tactics_decks_scenario_murintrail.t_place_tradingpost['vx_value'] = {
      name          : "place-tradingpost",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_tradingpost
    }

    // (func place-woodenhall)
    nx_tactics_decks_scenario_murintrail.t_place_woodenhall['vx_value'] = {
      name          : "place-woodenhall",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_place_woodenhall
    }

    // (func unit-bandit)
    nx_tactics_decks_scenario_murintrail.t_unit_bandit['vx_value'] = {
      name          : "unit-bandit",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_bandit
    }

    // (func unit-bruiser)
    nx_tactics_decks_scenario_murintrail.t_unit_bruiser['vx_value'] = {
      name          : "unit-bruiser",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_bruiser
    }

    // (func unit-flint)
    nx_tactics_decks_scenario_murintrail.t_unit_flint['vx_value'] = {
      name          : "unit-flint",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_flint
    }

    // (func unit-goblinscout)
    nx_tactics_decks_scenario_murintrail.t_unit_goblinscout['vx_value'] = {
      name          : "unit-goblinscout",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_goblinscout
    }

    // (func unit-guardsman)
    nx_tactics_decks_scenario_murintrail.t_unit_guardsman['vx_value'] = {
      name          : "unit-guardsman",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_guardsman
    }

    // (func unit-horse)
    nx_tactics_decks_scenario_murintrail.t_unit_horse['vx_value'] = {
      name          : "unit-horse",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_horse
    }

    // (func unit-jesaveer)
    nx_tactics_decks_scenario_murintrail.t_unit_jesaveer['vx_value'] = {
      name          : "unit-jesaveer",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_jesaveer
    }

    // (func unit-jonaveer)
    nx_tactics_decks_scenario_murintrail.t_unit_jonaveer['vx_value'] = {
      name          : "unit-jonaveer",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_jonaveer
    }

    // (func unit-liliducon)
    nx_tactics_decks_scenario_murintrail.t_unit_liliducon['vx_value'] = {
      name          : "unit-liliducon",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_liliducon
    }

    // (func unit-wilddog)
    nx_tactics_decks_scenario_murintrail.t_unit_wilddog['vx_value'] = {
      name          : "unit-wilddog",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_wilddog
    }

    // (func unit-wilmducon)
    nx_tactics_decks_scenario_murintrail.t_unit_wilmducon['vx_value'] = {
      name          : "unit-wilmducon",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_wilmducon
    }

    // (func unit-woodencart)
    nx_tactics_decks_scenario_murintrail.t_unit_woodencart['vx_value'] = {
      name          : "unit-woodencart",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_woodencart
    }

    // (func unit-xeibhanower)
    nx_tactics_decks_scenario_murintrail.t_unit_xeibhanower['vx_value'] = {
      name          : "unit-xeibhanower",
      pkgname       : "nx/tactics/decks/scenario-murintrail",
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
      fn            : nx_tactics_decks_scenario_murintrail.f_unit_xeibhanower
    }

    // (const power-groundmovement)
    Object.assign(nx_tactics_decks_scenario_murintrail.c_power_groundmovement, vx_core.f_new(
      nx_tactics_base.t_power,
      ":name",
      "Ground Movement"
    ))

  }
}
