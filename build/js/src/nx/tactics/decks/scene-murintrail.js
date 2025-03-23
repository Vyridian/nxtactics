'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scene_murintrail {

  /**
   * Constant: power-groundmovement
   * {power}
   */
  static c_power_groundmovement = {vx_type: nx_tactics_base.t_power, vx_constdef: {pkgname: 'nx/tactics/decks/scene-murintrail', name: 'power-groundmovement', type: nx_tactics_base.t_power}}

  /**
   * @function deck_murintrail
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_murintrail = {
    vx_type: vx_core.t_type
  }
  static e_deck_murintrail = {
    vx_type: nx_tactics_decks_scene_murintrail.t_deck_murintrail
  }

  // (func deck-murintrail)
  static f_deck_murintrail(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const goblinscout = nx_tactics_decks_scene_murintrail.f_unit_goblinscout(tactics)
        const goblinscout_i = nx_tactics_base.f_cardimage_from_card(goblinscout)
        const horse = nx_tactics_decks_scene_murintrail.f_unit_horse(tactics)
        const horse_i = nx_tactics_base.f_cardimage_from_card(horse)
        return vx_core.f_new(
          {"any-1": nx_tactics_base.t_deck},
          ":name",
          "Murin Trail",
          ":cardmap",
          nx_tactics_base.f_cardmap_from_cardlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_cardlist},
              nx_tactics_decks_scene_murintrail.f_unit_flint(tactics),
              nx_tactics_decks_scene_murintrail.f_unit_bandit(tactics),
              nx_tactics_decks_scene_murintrail.f_unit_bruiser(tactics),
              nx_tactics_decks_scene_murintrail.f_unit_guardsman(tactics),
              vx_core.f_any_from_any(
                {"any-1": nx_tactics_base.t_cardlist, "any-2": nx_tactics_base.t_skilllist},
                nx_tactics_base.f_skilllist_from_tactics_keys(tactics, "Close Combat", "Melee", "Stealth", "Business", "Tradeskills")
              ),
              vx_core.f_any_from_any(
                {"any-1": nx_tactics_base.t_cardlist, "any-2": nx_tactics_base.t_abilitylist},
                nx_tactics_base.f_abilitylist_from_tactics_keys(tactics, "Ambush", "Bargain", "Sneak")
              ),
              vx_core.f_any_from_any(
                {"any-1": nx_tactics_base.t_cardlist, "any-2": nx_tactics_base.t_itemlist},
                nx_tactics_base.f_itemlist_from_tactics_keys(tactics, "Bare Handed", "Dagger", "Sword: Long", "Sword: Short", "Hammer", "Axe: Hand", "Axe: Wood", "Spear", "Spear: Short", "Bow: Short", "Quiver: Arrows", "Shield: Buckler", "Shield: Heater", "Shield: Round", "Armor: Leather Cuirass", "Coins: Copper", "Coins: Silver", "Coins: Gold", "Coins: Platinum", "Healing Salve", "Cloak: Fine Woodland", "Rations", "Waterskin")
              ),
              nx_tactics_decks_scene_murintrail.f_unit_jesaveer(tactics),
              nx_tactics_decks_scene_murintrail.f_unit_jonaveer(tactics),
              nx_tactics_decks_scene_murintrail.f_unit_xeibhanower(tactics),
              nx_tactics_decks_scene_murintrail.f_unit_wilmducon(tactics),
              nx_tactics_decks_scene_murintrail.f_unit_liliducon(tactics),
              nx_tactics_decks_scene_murintrail.f_unit_wilddog(tactics),
              goblinscout,
              goblinscout_i,
              nx_tactics_decks_scene_murintrail.f_unit_horse(tactics),
              horse_i,
              nx_tactics_decks_scene_murintrail.f_unit_woodencart(tactics),
              nx_tactics_decks_scene_murintrail.f_place_field(tactics),
              nx_tactics_decks_scene_murintrail.f_place_forest(tactics),
              nx_tactics_decks_scene_murintrail.f_place_mountain(tactics),
              nx_tactics_decks_scene_murintrail.f_place_blacksmith(tactics),
              nx_tactics_decks_scene_murintrail.f_place_campsite(tactics),
              nx_tactics_decks_scene_murintrail.f_place_cavemouth(tactics),
              nx_tactics_decks_scene_murintrail.f_place_dirtpath(tactics),
              nx_tactics_decks_scene_murintrail.f_place_farmhouse(tactics),
              nx_tactics_decks_scene_murintrail.f_place_gravelroad(tactics),
              nx_tactics_decks_scene_murintrail.f_place_guardpost(tactics),
              nx_tactics_decks_scene_murintrail.f_place_horsestables(tactics),
              nx_tactics_decks_scene_murintrail.f_place_mill(tactics),
              nx_tactics_decks_scene_murintrail.f_place_stoneroad(tactics),
              nx_tactics_decks_scene_murintrail.f_place_tavern(tactics),
              nx_tactics_decks_scene_murintrail.f_place_tavern_bar(tactics),
              nx_tactics_decks_scene_murintrail.f_place_tavern_bedroom(tactics),
              nx_tactics_decks_scene_murintrail.f_place_tavern_common(tactics),
              nx_tactics_decks_scene_murintrail.f_place_tavern_dining(tactics),
              nx_tactics_decks_scene_murintrail.f_place_tavern_stairs(tactics),
              nx_tactics_decks_scene_murintrail.f_place_temple(tactics),
              nx_tactics_decks_scene_murintrail.f_place_tradingpost(tactics),
              nx_tactics_decks_scene_murintrail.f_place_woodenhall(tactics)
            )
          )
        )
      })
    )
    return output
  }

  /**
   * @function place_blacksmith
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_blacksmith = {
    vx_type: vx_core.t_type
  }
  static e_place_blacksmith = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_blacksmith
  }

  // (func place-blacksmith)
  static f_place_blacksmith(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Blacksmith", ":image", "images/cards/place-blacksmith.svg")
    return output
  }

  /**
   * @function place_campsite
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_campsite = {
    vx_type: vx_core.t_type
  }
  static e_place_campsite = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_campsite
  }

  // (func place-campsite)
  static f_place_campsite(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Campsite", ":image", "images/cards/place-campsite.svg")
    return output
  }

  /**
   * @function place_cavemouth
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_cavemouth = {
    vx_type: vx_core.t_type
  }
  static e_place_cavemouth = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_cavemouth
  }

  // (func place-cavemouth)
  static f_place_cavemouth(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Cave Mouth", ":image", "images/cards/place-cavemouth.svg")
    return output
  }

  /**
   * @function place_dirtpath
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_dirtpath = {
    vx_type: vx_core.t_type
  }
  static e_place_dirtpath = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_dirtpath
  }

  // (func place-dirtpath)
  static f_place_dirtpath(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Dirt Path", ":image", "images/cards/place-dirtpath.svg")
    return output
  }

  /**
   * @function place_farmhouse
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_farmhouse = {
    vx_type: vx_core.t_type
  }
  static e_place_farmhouse = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_farmhouse
  }

  // (func place-farmhouse)
  static f_place_farmhouse(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Farmhouse", ":image", "images/cards/place-farmhouse.svg")
    return output
  }

  /**
   * @function place_field
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_field = {
    vx_type: vx_core.t_type
  }
  static e_place_field = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_field
  }

  // (func place-field)
  static f_place_field(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Field", ":image", "images/cards/place-field.svg")
    return output
  }

  /**
   * @function place_forest
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_forest = {
    vx_type: vx_core.t_type
  }
  static e_place_forest = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_forest
  }

  // (func place-forest)
  static f_place_forest(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Forest", ":image", "images/cards/place-forest.svg")
    return output
  }

  /**
   * @function place_gravelroad
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_gravelroad = {
    vx_type: vx_core.t_type
  }
  static e_place_gravelroad = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_gravelroad
  }

  // (func place-gravelroad)
  static f_place_gravelroad(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Gravel Road", ":image", "images/cards/place-gravelroad.svg")
    return output
  }

  /**
   * @function place_guardpost
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_guardpost = {
    vx_type: vx_core.t_type
  }
  static e_place_guardpost = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_guardpost
  }

  // (func place-guardpost)
  static f_place_guardpost(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Guardpost", ":image", "images/cards/place-guardpost.svg")
    return output
  }

  /**
   * @function place_horsestables
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_horsestables = {
    vx_type: vx_core.t_type
  }
  static e_place_horsestables = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_horsestables
  }

  // (func place-horsestables)
  static f_place_horsestables(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Horse Stables", ":image", "images/cards/place-horsestables.svg")
    return output
  }

  /**
   * @function place_mill
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_mill = {
    vx_type: vx_core.t_type
  }
  static e_place_mill = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_mill
  }

  // (func place-mill)
  static f_place_mill(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Mill", ":image", "images/cards/place-mill.svg")
    return output
  }

  /**
   * @function place_mountain
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_mountain = {
    vx_type: vx_core.t_type
  }
  static e_place_mountain = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_mountain
  }

  // (func place-mountain)
  static f_place_mountain(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Mountain", ":image", "images/cards/place-mountain.svg")
    return output
  }

  /**
   * @function place_stoneroad
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_stoneroad = {
    vx_type: vx_core.t_type
  }
  static e_place_stoneroad = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_stoneroad
  }

  // (func place-stoneroad)
  static f_place_stoneroad(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Stone Road", ":image", "images/cards/place-stoneroad.svg")
    return output
  }

  /**
   * @function place_tavern
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_tavern = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_tavern
  }

  // (func place-tavern)
  static f_place_tavern(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern", ":image", "images/cards/place-tavern.svg")
    return output
  }

  /**
   * @function place_tavern_bar
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_tavern_bar = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_bar = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_tavern_bar
  }

  // (func place-tavern-bar)
  static f_place_tavern_bar(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Bar", ":image", "images/cards/place-tavern-bar.svg")
    return output
  }

  /**
   * @function place_tavern_bedroom
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_tavern_bedroom = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_bedroom = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_tavern_bedroom
  }

  // (func place-tavern-bedroom)
  static f_place_tavern_bedroom(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Bedroom", ":image", "images/cards/place-tavern-bedroom.svg")
    return output
  }

  /**
   * @function place_tavern_common
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_tavern_common = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_common = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_tavern_common
  }

  // (func place-tavern-common)
  static f_place_tavern_common(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Common", ":image", "images/cards/place-tavern-common.svg")
    return output
  }

  /**
   * @function place_tavern_dining
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_tavern_dining = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_dining = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_tavern_dining
  }

  // (func place-tavern-dining)
  static f_place_tavern_dining(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Dining", ":image", "images/cards/place-tavern-dining.svg")
    return output
  }

  /**
   * @function place_tavern_stairs
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_tavern_stairs = {
    vx_type: vx_core.t_type
  }
  static e_place_tavern_stairs = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_tavern_stairs
  }

  // (func place-tavern-stairs)
  static f_place_tavern_stairs(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Stairs", ":image", "images/cards/place-tavern-stairs.svg")
    return output
  }

  /**
   * @function place_temple
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_temple = {
    vx_type: vx_core.t_type
  }
  static e_place_temple = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_temple
  }

  // (func place-temple)
  static f_place_temple(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Temple", ":image", "images/cards/place-temple.svg")
    return output
  }

  /**
   * @function place_tradingpost
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_tradingpost = {
    vx_type: vx_core.t_type
  }
  static e_place_tradingpost = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_tradingpost
  }

  // (func place-tradingpost)
  static f_place_tradingpost(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Trading Post", ":image", "images/cards/place-tradingpost.svg")
    return output
  }

  /**
   * @function place_woodenhall
   * @param  {tactics} tactics
   * @return {place}
   */
  static t_place_woodenhall = {
    vx_type: vx_core.t_type
  }
  static e_place_woodenhall = {
    vx_type: nx_tactics_decks_scene_murintrail.t_place_woodenhall
  }

  // (func place-woodenhall)
  static f_place_woodenhall(tactics) {
    let output = nx_tactics_base.e_place
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Wooden Hall", ":image", "images/cards/place-woodenhall.svg")
    return output
  }

  /**
   * @function scene_murintrail
   * @param  {tactics} tactics
   * @return {scene}
   */
  static t_scene_murintrail = {
    vx_type: vx_core.t_type
  }
  static e_scene_murintrail = {
    vx_type: nx_tactics_decks_scene_murintrail.t_scene_murintrail
  }

  // (func scene-murintrail)
  static f_scene_murintrail(tactics) {
    let output = nx_tactics_base.e_scene
    output = vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Murin Trail Scene", ":secrets", "* The local lord is a young man (Damyen Brushaus) has recently inherited his title, preoccupied with person interests and largely ignores the town.\n* The town watch is a small militia run by a veteran sergeant (Brunhil Virden).\n* Brunhil runs a tight ship, and is not popular in town or among the watch.\n* The area is mostly safe except for numerous venomous snakes.\n* The local inn/pub is basically a large house. There are outdoor tables for food and drink.\n* The innkeeper/cook (Hamal) runs the place with his 12 year old daughter (Rena).\n* The land is mountainous and rocky, but the weather is fair and crops are reasonable.\n* A small religious group is staying in the city until they move on. They locals don't care for them.\n* A priest (Xeib) in town makes and sells anti-venom.\n* Xeib is travelling to Murintown, but he does not want to travel unguarded.")
    return output
  }

  /**
   * @function unit_bandit
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_bandit = {
    vx_type: vx_core.t_type
  }
  static e_unit_bandit = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_bandit
  }

  // (func unit-bandit)
  static f_unit_bandit(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "6x0",
      ":speedland",
      "6kph/4mph",
      ":mass",
      "80kg/180",
      ":height",
      "1.8m/6ft",
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
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Melee"),
          ":level",
          "3",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititem},
              ":item",
              nx_tactics_base.f_item_from_tactics_key(tactics, "Sword: Short")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Stealth"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Ambush")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_bruiser
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_bruiser = {
    vx_type: vx_core.t_type
  }
  static e_unit_bruiser = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_bruiser
  }

  // (func unit-bruiser)
  static f_unit_bruiser(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "5x0",
      ":speedland",
      "5kph/3mph",
      ":mass",
      "100kg/220lb",
      ":height",
      "1.9m/6'3ft",
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
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Close Combat"),
          ":level",
          "2",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Grab")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Intimidation"),
          ":level",
          "1"
        )
      )
    )
    return output
  }

  /**
   * @function unit_flint
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_flint = {
    vx_type: vx_core.t_type
  }
  static e_unit_flint = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_flint
  }

  // (func unit-flint)
  static f_unit_flint(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "7x0",
      ":speedland",
      "7kph/4.5mph",
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
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Close Combat"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititem},
              ":item",
              nx_tactics_base.f_item_from_tactics_key(tactics, "Dagger")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Stealth"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Sneak")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_goblinscout
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_goblinscout = {
    vx_type: vx_core.t_type
  }
  static e_unit_goblinscout = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_goblinscout
  }

  // (func unit-goblinscout)
  static f_unit_goblinscout(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "5x0",
      ":speedland",
      "5kph/3mph",
      ":value",
      "1x0",
      ":mass",
      "22kg/50lb",
      ":height",
      "1m/3ft",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Close Combat"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititem},
              ":item",
              nx_tactics_base.f_item_from_tactics_key(tactics, "Dagger")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Stealth"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Sneak")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_guardsman
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_guardsman = {
    vx_type: vx_core.t_type
  }
  static e_unit_guardsman = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_guardsman
  }

  // (func unit-guardsman)
  static f_unit_guardsman(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "5x0",
      ":speedland",
      "5kph/3mph",
      ":mass",
      "80kg/175",
      ":height",
      "1.8m/6ft",
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
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Melee"),
          ":level",
          "2",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititem},
              ":item",
              nx_tactics_base.f_item_from_tactics_key(tactics, "Spear")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Investigation"),
          ":level",
          "1"
        )
      )
    )
    return output
  }

  /**
   * @function unit_horse
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_horse = {
    vx_type: vx_core.t_type
  }
  static e_unit_horse = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_horse
  }

  // (func unit-horse)
  static f_unit_horse(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "2x2",
      ":mass",
      "450kg/1000lb",
      ":speedland",
      "20kph/12mph",
      ":demeanor",
      "Aloof",
      ":nature",
      "Skitish",
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitpower},
          ":power",
          nx_tactics_decks_scene_murintrail.c_power_groundmovement,
          ":level",
          "4x1"
        )
      )
    )
    return output
  }

  /**
   * @function unit_jesaveer
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_jesaveer = {
    vx_type: vx_core.t_type
  }
  static e_unit_jesaveer = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_jesaveer
  }

  // (func unit-jesaveer)
  static f_unit_jesaveer(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "5x0",
      ":speedland",
      "5kph/3mph",
      ":mass",
      "63kg",
      ":height",
      "1.72m/5ft7",
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
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Melee"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititem},
              ":item",
              nx_tactics_base.f_item_from_tactics_key(tactics, "Hammer")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Tradeskills"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Blacksmithing")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_jonaveer
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_jonaveer = {
    vx_type: vx_core.t_type
  }
  static e_unit_jonaveer = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_jonaveer
  }

  // (func unit-jonaveer)
  static f_unit_jonaveer(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "4x0",
      ":speedland",
      "4kph/2.5mph",
      ":mass",
      "75kg",
      ":height",
      "1.78m/5ft10",
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
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Melee"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititem},
              ":item",
              nx_tactics_base.f_item_from_tactics_key(tactics, "Spear")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Business"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Bargain")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_liliducon
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_liliducon = {
    vx_type: vx_core.t_type
  }
  static e_unit_liliducon = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_liliducon
  }

  // (func unit-liliducon)
  static f_unit_liliducon(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "3x0",
      ":speedland",
      "3kph/2mph",
      ":mass",
      "40kg/88lb",
      ":height",
      "1.5m/5ft",
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
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Survival"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Foraging")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_wilddog
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_wilddog = {
    vx_type: vx_core.t_type
  }
  static e_unit_wilddog = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_wilddog
  }

  // (func unit-wilddog)
  static f_unit_wilddog(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "4x1",
      ":mass",
      "22kg/50lb",
      ":height",
      "76cm/30in",
      ":speedland",
      "40kph/25mph",
      ":nature",
      "Dogged",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Close Combat"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Bite")
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Grab")
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Drag")
            )
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitpower},
          ":power",
          nx_tactics_decks_scene_murintrail.c_power_groundmovement,
          ":level",
          "7x1"
        )
      )
    )
    return output
  }

  /**
   * @function unit_wilmducon
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_wilmducon = {
    vx_type: vx_core.t_type
  }
  static e_unit_wilmducon = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_wilmducon
  }

  // (func unit-wilmducon)
  static f_unit_wilmducon(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "5x0",
      ":speedland",
      "5kph/3mph",
      ":mass",
      "80kg/180",
      ":height",
      "1.8m/6ft",
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
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Melee"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititem},
              ":item",
              nx_tactics_base.f_item_from_tactics_key(tactics, "Axe: Wood")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Hunting"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_base.f_ability_from_tactics_key(tactics, "Snare")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_woodencart
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_woodencart = {
    vx_type: vx_core.t_type
  }
  static e_unit_woodencart = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_woodencart
  }

  // (func unit-woodencart)
  static f_unit_woodencart(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
      ":name",
      "Wooden Cart",
      ":image",
      "images/cards/unit-woodencart.svg",
      ":imgmirror",
      true,
      ":body",
      "2x2",
      ":mass",
      "200kg/440lb"
    )
    return output
  }

  /**
   * @function unit_xeibhanower
   * @param  {tactics} tactics
   * @return {unit}
   */
  static t_unit_xeibhanower = {
    vx_type: vx_core.t_type
  }
  static e_unit_xeibhanower = {
    vx_type: nx_tactics_decks_scene_murintrail.t_unit_xeibhanower
  }

  // (func unit-xeibhanower)
  static f_unit_xeibhanower(tactics) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "4x0",
      ":speedland",
      "4kph/2.5mph",
      ":mass",
      "80kg",
      ":height",
      "1.78m/5'10",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_base.f_skill_from_tactics_key(tactics, "Animal Handling"),
          ":level",
          "3",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_tactics_keys(tactics, "Snake Charming", "Venom Extraction")
        )
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "power-groundmovement": nx_tactics_decks_scene_murintrail.c_power_groundmovement
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-murintrail": nx_tactics_decks_scene_murintrail.e_deck_murintrail,
      "place-blacksmith": nx_tactics_decks_scene_murintrail.e_place_blacksmith,
      "place-campsite": nx_tactics_decks_scene_murintrail.e_place_campsite,
      "place-cavemouth": nx_tactics_decks_scene_murintrail.e_place_cavemouth,
      "place-dirtpath": nx_tactics_decks_scene_murintrail.e_place_dirtpath,
      "place-farmhouse": nx_tactics_decks_scene_murintrail.e_place_farmhouse,
      "place-field": nx_tactics_decks_scene_murintrail.e_place_field,
      "place-forest": nx_tactics_decks_scene_murintrail.e_place_forest,
      "place-gravelroad": nx_tactics_decks_scene_murintrail.e_place_gravelroad,
      "place-guardpost": nx_tactics_decks_scene_murintrail.e_place_guardpost,
      "place-horsestables": nx_tactics_decks_scene_murintrail.e_place_horsestables,
      "place-mill": nx_tactics_decks_scene_murintrail.e_place_mill,
      "place-mountain": nx_tactics_decks_scene_murintrail.e_place_mountain,
      "place-stoneroad": nx_tactics_decks_scene_murintrail.e_place_stoneroad,
      "place-tavern": nx_tactics_decks_scene_murintrail.e_place_tavern,
      "place-tavern-bar": nx_tactics_decks_scene_murintrail.e_place_tavern_bar,
      "place-tavern-bedroom": nx_tactics_decks_scene_murintrail.e_place_tavern_bedroom,
      "place-tavern-common": nx_tactics_decks_scene_murintrail.e_place_tavern_common,
      "place-tavern-dining": nx_tactics_decks_scene_murintrail.e_place_tavern_dining,
      "place-tavern-stairs": nx_tactics_decks_scene_murintrail.e_place_tavern_stairs,
      "place-temple": nx_tactics_decks_scene_murintrail.e_place_temple,
      "place-tradingpost": nx_tactics_decks_scene_murintrail.e_place_tradingpost,
      "place-woodenhall": nx_tactics_decks_scene_murintrail.e_place_woodenhall,
      "scene-murintrail": nx_tactics_decks_scene_murintrail.e_scene_murintrail,
      "unit-bandit": nx_tactics_decks_scene_murintrail.e_unit_bandit,
      "unit-bruiser": nx_tactics_decks_scene_murintrail.e_unit_bruiser,
      "unit-flint": nx_tactics_decks_scene_murintrail.e_unit_flint,
      "unit-goblinscout": nx_tactics_decks_scene_murintrail.e_unit_goblinscout,
      "unit-guardsman": nx_tactics_decks_scene_murintrail.e_unit_guardsman,
      "unit-horse": nx_tactics_decks_scene_murintrail.e_unit_horse,
      "unit-jesaveer": nx_tactics_decks_scene_murintrail.e_unit_jesaveer,
      "unit-jonaveer": nx_tactics_decks_scene_murintrail.e_unit_jonaveer,
      "unit-liliducon": nx_tactics_decks_scene_murintrail.e_unit_liliducon,
      "unit-wilddog": nx_tactics_decks_scene_murintrail.e_unit_wilddog,
      "unit-wilmducon": nx_tactics_decks_scene_murintrail.e_unit_wilmducon,
      "unit-woodencart": nx_tactics_decks_scene_murintrail.e_unit_woodencart,
      "unit-xeibhanower": nx_tactics_decks_scene_murintrail.e_unit_xeibhanower
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-murintrail": nx_tactics_decks_scene_murintrail.t_deck_murintrail,
      "place-blacksmith": nx_tactics_decks_scene_murintrail.t_place_blacksmith,
      "place-campsite": nx_tactics_decks_scene_murintrail.t_place_campsite,
      "place-cavemouth": nx_tactics_decks_scene_murintrail.t_place_cavemouth,
      "place-dirtpath": nx_tactics_decks_scene_murintrail.t_place_dirtpath,
      "place-farmhouse": nx_tactics_decks_scene_murintrail.t_place_farmhouse,
      "place-field": nx_tactics_decks_scene_murintrail.t_place_field,
      "place-forest": nx_tactics_decks_scene_murintrail.t_place_forest,
      "place-gravelroad": nx_tactics_decks_scene_murintrail.t_place_gravelroad,
      "place-guardpost": nx_tactics_decks_scene_murintrail.t_place_guardpost,
      "place-horsestables": nx_tactics_decks_scene_murintrail.t_place_horsestables,
      "place-mill": nx_tactics_decks_scene_murintrail.t_place_mill,
      "place-mountain": nx_tactics_decks_scene_murintrail.t_place_mountain,
      "place-stoneroad": nx_tactics_decks_scene_murintrail.t_place_stoneroad,
      "place-tavern": nx_tactics_decks_scene_murintrail.t_place_tavern,
      "place-tavern-bar": nx_tactics_decks_scene_murintrail.t_place_tavern_bar,
      "place-tavern-bedroom": nx_tactics_decks_scene_murintrail.t_place_tavern_bedroom,
      "place-tavern-common": nx_tactics_decks_scene_murintrail.t_place_tavern_common,
      "place-tavern-dining": nx_tactics_decks_scene_murintrail.t_place_tavern_dining,
      "place-tavern-stairs": nx_tactics_decks_scene_murintrail.t_place_tavern_stairs,
      "place-temple": nx_tactics_decks_scene_murintrail.t_place_temple,
      "place-tradingpost": nx_tactics_decks_scene_murintrail.t_place_tradingpost,
      "place-woodenhall": nx_tactics_decks_scene_murintrail.t_place_woodenhall,
      "scene-murintrail": nx_tactics_decks_scene_murintrail.t_scene_murintrail,
      "unit-bandit": nx_tactics_decks_scene_murintrail.t_unit_bandit,
      "unit-bruiser": nx_tactics_decks_scene_murintrail.t_unit_bruiser,
      "unit-flint": nx_tactics_decks_scene_murintrail.t_unit_flint,
      "unit-goblinscout": nx_tactics_decks_scene_murintrail.t_unit_goblinscout,
      "unit-guardsman": nx_tactics_decks_scene_murintrail.t_unit_guardsman,
      "unit-horse": nx_tactics_decks_scene_murintrail.t_unit_horse,
      "unit-jesaveer": nx_tactics_decks_scene_murintrail.t_unit_jesaveer,
      "unit-jonaveer": nx_tactics_decks_scene_murintrail.t_unit_jonaveer,
      "unit-liliducon": nx_tactics_decks_scene_murintrail.t_unit_liliducon,
      "unit-wilddog": nx_tactics_decks_scene_murintrail.t_unit_wilddog,
      "unit-wilmducon": nx_tactics_decks_scene_murintrail.t_unit_wilmducon,
      "unit-woodencart": nx_tactics_decks_scene_murintrail.t_unit_woodencart,
      "unit-xeibhanower": nx_tactics_decks_scene_murintrail.t_unit_xeibhanower
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scene-murintrail",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-murintrail)
    nx_tactics_decks_scene_murintrail.t_deck_murintrail['vx_value'] = {
      name          : "deck-murintrail",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_deck_murintrail
    }

    // (func place-blacksmith)
    nx_tactics_decks_scene_murintrail.t_place_blacksmith['vx_value'] = {
      name          : "place-blacksmith",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_blacksmith
    }

    // (func place-campsite)
    nx_tactics_decks_scene_murintrail.t_place_campsite['vx_value'] = {
      name          : "place-campsite",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_campsite
    }

    // (func place-cavemouth)
    nx_tactics_decks_scene_murintrail.t_place_cavemouth['vx_value'] = {
      name          : "place-cavemouth",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_cavemouth
    }

    // (func place-dirtpath)
    nx_tactics_decks_scene_murintrail.t_place_dirtpath['vx_value'] = {
      name          : "place-dirtpath",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_dirtpath
    }

    // (func place-farmhouse)
    nx_tactics_decks_scene_murintrail.t_place_farmhouse['vx_value'] = {
      name          : "place-farmhouse",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_farmhouse
    }

    // (func place-field)
    nx_tactics_decks_scene_murintrail.t_place_field['vx_value'] = {
      name          : "place-field",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_field
    }

    // (func place-forest)
    nx_tactics_decks_scene_murintrail.t_place_forest['vx_value'] = {
      name          : "place-forest",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_forest
    }

    // (func place-gravelroad)
    nx_tactics_decks_scene_murintrail.t_place_gravelroad['vx_value'] = {
      name          : "place-gravelroad",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_gravelroad
    }

    // (func place-guardpost)
    nx_tactics_decks_scene_murintrail.t_place_guardpost['vx_value'] = {
      name          : "place-guardpost",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_guardpost
    }

    // (func place-horsestables)
    nx_tactics_decks_scene_murintrail.t_place_horsestables['vx_value'] = {
      name          : "place-horsestables",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_horsestables
    }

    // (func place-mill)
    nx_tactics_decks_scene_murintrail.t_place_mill['vx_value'] = {
      name          : "place-mill",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_mill
    }

    // (func place-mountain)
    nx_tactics_decks_scene_murintrail.t_place_mountain['vx_value'] = {
      name          : "place-mountain",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_mountain
    }

    // (func place-stoneroad)
    nx_tactics_decks_scene_murintrail.t_place_stoneroad['vx_value'] = {
      name          : "place-stoneroad",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_stoneroad
    }

    // (func place-tavern)
    nx_tactics_decks_scene_murintrail.t_place_tavern['vx_value'] = {
      name          : "place-tavern",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_tavern
    }

    // (func place-tavern-bar)
    nx_tactics_decks_scene_murintrail.t_place_tavern_bar['vx_value'] = {
      name          : "place-tavern-bar",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_tavern_bar
    }

    // (func place-tavern-bedroom)
    nx_tactics_decks_scene_murintrail.t_place_tavern_bedroom['vx_value'] = {
      name          : "place-tavern-bedroom",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_tavern_bedroom
    }

    // (func place-tavern-common)
    nx_tactics_decks_scene_murintrail.t_place_tavern_common['vx_value'] = {
      name          : "place-tavern-common",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_tavern_common
    }

    // (func place-tavern-dining)
    nx_tactics_decks_scene_murintrail.t_place_tavern_dining['vx_value'] = {
      name          : "place-tavern-dining",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_tavern_dining
    }

    // (func place-tavern-stairs)
    nx_tactics_decks_scene_murintrail.t_place_tavern_stairs['vx_value'] = {
      name          : "place-tavern-stairs",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_tavern_stairs
    }

    // (func place-temple)
    nx_tactics_decks_scene_murintrail.t_place_temple['vx_value'] = {
      name          : "place-temple",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_temple
    }

    // (func place-tradingpost)
    nx_tactics_decks_scene_murintrail.t_place_tradingpost['vx_value'] = {
      name          : "place-tradingpost",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_tradingpost
    }

    // (func place-woodenhall)
    nx_tactics_decks_scene_murintrail.t_place_woodenhall['vx_value'] = {
      name          : "place-woodenhall",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_place_woodenhall
    }

    // (func scene-murintrail)
    nx_tactics_decks_scene_murintrail.t_scene_murintrail['vx_value'] = {
      name          : "scene-murintrail",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_scene_murintrail
    }

    // (func unit-bandit)
    nx_tactics_decks_scene_murintrail.t_unit_bandit['vx_value'] = {
      name          : "unit-bandit",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_bandit
    }

    // (func unit-bruiser)
    nx_tactics_decks_scene_murintrail.t_unit_bruiser['vx_value'] = {
      name          : "unit-bruiser",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_bruiser
    }

    // (func unit-flint)
    nx_tactics_decks_scene_murintrail.t_unit_flint['vx_value'] = {
      name          : "unit-flint",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_flint
    }

    // (func unit-goblinscout)
    nx_tactics_decks_scene_murintrail.t_unit_goblinscout['vx_value'] = {
      name          : "unit-goblinscout",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_goblinscout
    }

    // (func unit-guardsman)
    nx_tactics_decks_scene_murintrail.t_unit_guardsman['vx_value'] = {
      name          : "unit-guardsman",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_guardsman
    }

    // (func unit-horse)
    nx_tactics_decks_scene_murintrail.t_unit_horse['vx_value'] = {
      name          : "unit-horse",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_horse
    }

    // (func unit-jesaveer)
    nx_tactics_decks_scene_murintrail.t_unit_jesaveer['vx_value'] = {
      name          : "unit-jesaveer",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_jesaveer
    }

    // (func unit-jonaveer)
    nx_tactics_decks_scene_murintrail.t_unit_jonaveer['vx_value'] = {
      name          : "unit-jonaveer",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_jonaveer
    }

    // (func unit-liliducon)
    nx_tactics_decks_scene_murintrail.t_unit_liliducon['vx_value'] = {
      name          : "unit-liliducon",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_liliducon
    }

    // (func unit-wilddog)
    nx_tactics_decks_scene_murintrail.t_unit_wilddog['vx_value'] = {
      name          : "unit-wilddog",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_wilddog
    }

    // (func unit-wilmducon)
    nx_tactics_decks_scene_murintrail.t_unit_wilmducon['vx_value'] = {
      name          : "unit-wilmducon",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_wilmducon
    }

    // (func unit-woodencart)
    nx_tactics_decks_scene_murintrail.t_unit_woodencart['vx_value'] = {
      name          : "unit-woodencart",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_woodencart
    }

    // (func unit-xeibhanower)
    nx_tactics_decks_scene_murintrail.t_unit_xeibhanower['vx_value'] = {
      name          : "unit-xeibhanower",
      pkgname       : "nx/tactics/decks/scene-murintrail",
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
      fn            : nx_tactics_decks_scene_murintrail.f_unit_xeibhanower
    }

    // (const power-groundmovement)
    Object.assign(nx_tactics_decks_scene_murintrail.c_power_groundmovement, vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Ground Movement"))

  }
}
