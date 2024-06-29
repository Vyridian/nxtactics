'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_decks_data from "../../../nx/tactics/decks/data.js"


export default class nx_tactics_decks_scenario_nightonthetown {

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
          nx_tactics_decks_scenario_nightonthetown.f_rule_zombie(),
          nx_tactics_decks_scenario_nightonthetown.f_unit_zombiedog(),
          nx_tactics_decks_scenario_nightonthetown.f_unit_zombierunner(),
          nx_tactics_decks_scenario_nightonthetown.f_unit_zombiewalker(),
          nx_tactics_decks_data.f_tactics_item("Bare Handed"),
          nx_tactics_decks_data.f_tactics_item("Shortbow"),
          nx_tactics_decks_data.f_tactics_ability("Grab"),
          nx_tactics_decks_data.f_tactics_ability("Bite"),
          nx_tactics_decks_scenario_nightonthetown.f_item_lockcombination(),
          nx_tactics_decks_scenario_nightonthetown.f_item_fireaxe(),
          nx_tactics_decks_scenario_nightonthetown.f_item_jerrycan(),
          nx_tactics_decks_scenario_nightonthetown.f_item_keys(),
          nx_tactics_decks_scenario_nightonthetown.f_item_knife(),
          nx_tactics_decks_scenario_nightonthetown.f_item_liquorbottle(),
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
      "* [Fight]: [Melee]\n* [Initiative]:-1\n* [Damage]: [Size Bonus]+3 [Hack] [Slash]\n* [Location]: [2-hand]\n* [Armor]:1x1",
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
      "* [Fight]: [Close Combat]\n* [Damage]: [Size Bonus]-1 [Pierce] [Slash]\n* [Location]: [1-hand]",
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
   * @function item_liquorbottle
   * @return {item}
   */
  static t_item_liquorbottle = {
    vx_type: vx_core.t_type
  }
  static e_item_liquorbottle = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_liquorbottle
  }

  // (func item-liquorbottle)
  static f_item_liquorbottle() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Liquor Bottle",
      ":image",
      "images/cards/item-liquorbottle.svg"
    )
    return output
  }

  /**
   * @function item_lockcombination
   * @return {item}
   */
  static t_item_lockcombination = {
    vx_type: vx_core.t_type
  }
  static e_item_lockcombination = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_item_lockcombination
  }

  // (func item-lockcombination)
  static f_item_lockcombination() {
    let output = nx_tactics_base.e_item
    output = vx_core.f_new(
      nx_tactics_base.t_item,
      ":name",
      "Lock Combination",
      ":image",
      "images/cards/item-lockcombination.svg"
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
      "* [Passive]: IF examining small objects THEN [Investigation]:+1",
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
      "* [Fight]: [Melee] [Reach]\n* [Damage]: [Size Bonus]+3 [Pierce] [Slash]\n* [Location]: [2-hand]\n* [Armor]:1x1",
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
   * @function rule_zombie
   * @return {rule}
   */
  static t_rule_zombie = {
    vx_type: vx_core.t_type
  }
  static e_rule_zombie = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_rule_zombie
  }

  // (func rule-zombie)
  static f_rule_zombie() {
    let output = nx_tactics_base.e_rule
    output = vx_core.f_new(
      nx_tactics_base.t_rule,
      ":name",
      "Zombie",
      ":summary",
      "* [Undead]: Immune to [Bleeding] and [Fear]. Never targets [Undead].\n* [Mindless]: Does not avoid [Hazard].\n* [Prey]: [Bleeding], [Prone] within 2 Moves. Will [Disengage] for prey.\n* [Zombie Plague]:\n** IF a unit suffers a [Pierce] [Bite]\n** THEN at the beginning of each [Turn], take [Fatigue]:+1 or [Stress]:+1 until cured."
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
      "4x1",
      ":mass",
      "70kg/155lb",
      ":height",
      "1.7m/5'6",
      ":speedland",
      "40kph/25mph",
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
          nx_tactics_decks_data.f_tactics_skill("Ranged"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              nx_tactics_base.t_unititem,
              ":item",
              nx_tactics_decks_data.f_tactics_item("Shortbow")
            )
          )
        ),
        vx_core.f_new(
          nx_tactics_base.t_unitskill,
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Investigation"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Detail Oriented")
            )
          ),
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
      "50kph/30mph",
      ":nature",
      "Dogged",
      ":summary",
      "[Zombie]",
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
              nx_tactics_decks_data.f_tactics_ability("Grab")
            )
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          nx_tactics_base.t_unitpower,
          ":power",
          nx_tactics_decks_data.f_tactics_power("Natural Weaponry"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Bite")
            )
          )
        )
      )
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
      "Zombie Runner",
      ":image",
      "images/cards/unit-zombierunner.svg",
      ":body",
      "7x1",
      ":mind",
      "5x-1",
      ":will",
      "2x1",
      ":move",
      "3x1",
      ":mass",
      "70kg/155lb",
      ":height",
      "1.8m/6ft",
      ":speedland",
      "30kph/20mph",
      ":demeanor",
      "Aloof",
      ":summary",
      "[Zombie]",
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
              nx_tactics_decks_data.f_tactics_ability("Grab")
            )
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          nx_tactics_base.t_unitpower,
          ":power",
          nx_tactics_decks_data.f_tactics_power("Natural Weaponry"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Bite")
            )
          )
        )
      )
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
      "8x1",
      ":mind",
      "5x-1",
      ":will",
      "2x1",
      ":move",
      "2x1",
      ":mass",
      "80kg/175",
      ":speedland",
      "20kph/12mph",
      ":summary",
      "[Zombie]",
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
              nx_tactics_decks_data.f_tactics_ability("Grab")
            )
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          nx_tactics_base.t_unitpower,
          ":power",
          nx_tactics_decks_data.f_tactics_power("Natural Weaponry"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              nx_tactics_base.t_unitability,
              ":ability",
              nx_tactics_decks_data.f_tactics_ability("Bite")
            )
          )
        )
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-nightonthetown": nx_tactics_decks_scenario_nightonthetown.e_deck_nightonthetown,
      "item-axehand": nx_tactics_decks_scenario_nightonthetown.e_item_axehand,
      "item-fireaxe": nx_tactics_decks_scenario_nightonthetown.e_item_fireaxe,
      "item-jerrycan": nx_tactics_decks_scenario_nightonthetown.e_item_jerrycan,
      "item-keys": nx_tactics_decks_scenario_nightonthetown.e_item_keys,
      "item-knife": nx_tactics_decks_scenario_nightonthetown.e_item_knife,
      "item-liquorbottle": nx_tactics_decks_scenario_nightonthetown.e_item_liquorbottle,
      "item-lockcombination": nx_tactics_decks_scenario_nightonthetown.e_item_lockcombination,
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
      "rule-zombie": nx_tactics_decks_scenario_nightonthetown.e_rule_zombie,
      "unit-theprofessor": nx_tactics_decks_scenario_nightonthetown.e_unit_theprofessor,
      "unit-zombiedog": nx_tactics_decks_scenario_nightonthetown.e_unit_zombiedog,
      "unit-zombierunner": nx_tactics_decks_scenario_nightonthetown.e_unit_zombierunner,
      "unit-zombiewalker": nx_tactics_decks_scenario_nightonthetown.e_unit_zombiewalker
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-nightonthetown": nx_tactics_decks_scenario_nightonthetown.t_deck_nightonthetown,
      "item-axehand": nx_tactics_decks_scenario_nightonthetown.t_item_axehand,
      "item-fireaxe": nx_tactics_decks_scenario_nightonthetown.t_item_fireaxe,
      "item-jerrycan": nx_tactics_decks_scenario_nightonthetown.t_item_jerrycan,
      "item-keys": nx_tactics_decks_scenario_nightonthetown.t_item_keys,
      "item-knife": nx_tactics_decks_scenario_nightonthetown.t_item_knife,
      "item-liquorbottle": nx_tactics_decks_scenario_nightonthetown.t_item_liquorbottle,
      "item-lockcombination": nx_tactics_decks_scenario_nightonthetown.t_item_lockcombination,
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
      "rule-zombie": nx_tactics_decks_scenario_nightonthetown.t_rule_zombie,
      "unit-theprofessor": nx_tactics_decks_scenario_nightonthetown.t_unit_theprofessor,
      "unit-zombiedog": nx_tactics_decks_scenario_nightonthetown.t_unit_zombiedog,
      "unit-zombierunner": nx_tactics_decks_scenario_nightonthetown.t_unit_zombierunner,
      "unit-zombiewalker": nx_tactics_decks_scenario_nightonthetown.t_unit_zombiewalker
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scenario-nightonthetown",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-nightonthetown)
    nx_tactics_decks_scenario_nightonthetown.t_deck_nightonthetown['vx_value'] = {
      name          : "deck-nightonthetown",
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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

    // (func item-fireaxe)
    nx_tactics_decks_scenario_nightonthetown.t_item_fireaxe['vx_value'] = {
      name          : "item-fireaxe",
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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

    // (func item-liquorbottle)
    nx_tactics_decks_scenario_nightonthetown.t_item_liquorbottle['vx_value'] = {
      name          : "item-liquorbottle",
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_liquorbottle
    }

    // (func item-lockcombination)
    nx_tactics_decks_scenario_nightonthetown.t_item_lockcombination['vx_value'] = {
      name          : "item-lockcombination",
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_item_lockcombination
    }

    // (func item-molotovcocktail)
    nx_tactics_decks_scenario_nightonthetown.t_item_molotovcocktail['vx_value'] = {
      name          : "item-molotovcocktail",
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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

    // (func rule-zombie)
    nx_tactics_decks_scenario_nightonthetown.t_rule_zombie['vx_value'] = {
      name          : "rule-zombie",
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_rule_zombie
    }

    // (func unit-theprofessor)
    nx_tactics_decks_scenario_nightonthetown.t_unit_theprofessor['vx_value'] = {
      name          : "unit-theprofessor",
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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

  }
}
