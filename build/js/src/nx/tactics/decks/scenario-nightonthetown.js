'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_decks_data from "../../../nx/tactics/decks/data.js"


export default class nx_tactics_decks_scenario_nightonthetown {

  /**
   * @function deck_nightonthetown
   * @param  {tactics} tactics
   * @return {deck}
   */
  static t_deck_nightonthetown = {
    vx_type: vx_core.t_type
  }
  static e_deck_nightonthetown = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_deck_nightonthetown
  }

  // (func deck-nightonthetown)
  static f_deck_nightonthetown(tactics) {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_deck},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const professor = nx_tactics_decks_scenario_nightonthetown.f_unit_theprofessor()
        const professori = nx_tactics_base.f_cardimage_from_card(professor)
        return vx_core.f_new(
          {"any-1": nx_tactics_base.t_deck},
          ":name",
          "Night on the Town",
          ":cardmap",
          nx_tactics_base.f_cardmap_from_cardlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_cardlist},
              professor,
              professori,
              vx_core.f_any_from_any(
                {"any-1": nx_tactics_base.t_cardlist, "any-2": nx_tactics_base.t_abilitylist},
                nx_tactics_base.f_abilitylist_from_tactics_keys(tactics, "Bite", "Detail Oriented", "Grab")
              ),
              vx_core.f_any_from_any(
                {"any-1": nx_tactics_base.t_cardlist, "any-2": nx_tactics_base.t_itemlist},
                nx_tactics_base.f_itemlist_from_tactics_keys(tactics, "Bare Handed", "Fire Axe", "Jerry Can", "Keys", "Knife", "Liquor Bottle", "Lock Combination", "Molotov Cocktail", "Monocle", "Revolver", "Revolver Ammo", "Rifle", "Rifle Ammo", "Shortbow", "Shotgun", "Shotgun Ammo", "Spear")
              ),
              nx_tactics_decks_scenario_nightonthetown.f_unit_zombiecrawler(),
              nx_tactics_decks_scenario_nightonthetown.f_unit_zombiedog(),
              nx_tactics_base.f_cardimage_from_card(
                nx_tactics_decks_scenario_nightonthetown.f_unit_zombiedog()
              ),
              nx_tactics_decks_scenario_nightonthetown.f_unit_zombierunner(),
              nx_tactics_base.f_cardimage_from_card(
                nx_tactics_decks_scenario_nightonthetown.f_unit_zombierunner()
              ),
              nx_tactics_decks_scenario_nightonthetown.f_unit_zombiewalker(),
              nx_tactics_base.f_cardimage_from_card(
                nx_tactics_decks_scenario_nightonthetown.f_unit_zombiewalker()
              ),
              nx_tactics_decks_scenario_nightonthetown.f_place_clinic(),
              nx_tactics_decks_scenario_nightonthetown.f_place_conveniencestore(),
              nx_tactics_decks_scenario_nightonthetown.f_place_gasstation(),
              nx_tactics_decks_scenario_nightonthetown.f_place_gunstore(),
              nx_tactics_decks_scenario_nightonthetown.f_place_policestation(),
              nx_tactics_decks_scenario_nightonthetown.f_place_street()
            )
          )
        )
      })
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
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Clinic", ":image", "images/cards/place-clinic.svg")
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
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Convenience Store", ":image", "images/cards/place-conveniencestore.svg")
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
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Gas Station", ":image", "images/cards/place-gasstation.svg")
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
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Gun Store", ":image", "images/cards/place-gunstore.svg")
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
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Police Station", ":image", "images/cards/place-policestation.svg")
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
    output = vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Street", ":image", "images/cards/place-street.svg")
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
    output = vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Zombie", ":summary", "* [Undead]: Immune to [Bleeding] and [Fear]. Never targets [Undead].\n* [Mindless]: Does not avoid [Hazard].\n* [Prey]: [Bleeding], [Prone] within 2 Moves. Will [Disengage] for prey.\n* [Zombie Plague]:\n** IF a unit suffers a [Pierce] [Bite]\n** THEN at the beginning of each [Turn], take [Fatigue]:+1 or [Stress]:+1 until cured.")
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
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "5x0",
      ":mass",
      "70kg/155lb",
      ":height",
      "1.7m/5'6",
      ":speedland",
      "18kph/11mph",
      ":demeanor",
      "Foolish",
      ":nature",
      "Cowardly",
      ":summary",
      "",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Ranged"),
          ":level",
          "1",
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititem},
              ":item",
              nx_tactics_decks_data.f_item_from_key("Shortbow")
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Investigation"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_decks_data.f_ability_from_key("Detail Oriented")
            )
          ),
          ":unititemmap",
          nx_tactics_base.f_unititemmap_from_unititemlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititem},
              ":item",
              nx_tactics_decks_data.f_item_from_key("Monocle")
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function unit_zombiecrawler
   * @return {unit}
   */
  static t_unit_zombiecrawler = {
    vx_type: vx_core.t_type
  }
  static e_unit_zombiecrawler = {
    vx_type: nx_tactics_decks_scenario_nightonthetown.t_unit_zombiecrawler
  }

  // (func unit-zombiecrawler)
  static f_unit_zombiecrawler() {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_unit},
      ":name",
      "Zombie Crawler",
      ":image",
      "images/cards/unit-zombiecrawler.svg",
      ":body",
      "8x1",
      ":mind",
      "5x-1",
      ":will",
      "2x1",
      ":speed",
      "2x0",
      ":mass",
      "80kg/175",
      ":speedland",
      "10kph",
      ":summary",
      "[Zombie]",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Close Combat"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_decks_data.f_ability_from_key("Grab")
            )
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitpower},
          ":power",
          nx_tactics_decks_data.f_tactics_power("Natural Weaponry"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_decks_data.f_ability_from_key("Bite")
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
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "6X0",
      ":mass",
      "22kg/50lb",
      ":height",
      "76cm/30in",
      ":speedland",
      "20kph/12mph",
      ":nature",
      "Dogged",
      ":summary",
      "[Zombie]",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Close Combat"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_decks_data.f_ability_from_key("Grab")
            )
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitpower},
          ":power",
          nx_tactics_decks_data.f_tactics_power("Natural Weaponry"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_decks_data.f_ability_from_key("Bite")
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
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "3x0",
      ":mass",
      "70kg/155lb",
      ":height",
      "1.8m/6ft",
      ":speedland",
      "10kph/7mph",
      ":demeanor",
      "Aloof",
      ":summary",
      "[Zombie]",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Close Combat"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_decks_data.f_ability_from_key("Grab")
            )
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitpower},
          ":power",
          nx_tactics_decks_data.f_tactics_power("Natural Weaponry"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_decks_data.f_ability_from_key("Bite")
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
      {"any-1": nx_tactics_base.t_unit},
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
      ":speed",
      "2x0",
      ":mass",
      "80kg/175",
      ":speedland",
      "10kph",
      ":summary",
      "[Zombie]",
      ":unitskillmap",
      nx_tactics_base.f_unitskillmap_from_unitskilllist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskill},
          ":skill",
          nx_tactics_decks_data.f_tactics_skill("Close Combat"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_decks_data.f_ability_from_key("Grab")
            )
          )
        )
      ),
      ":unitpowermap",
      nx_tactics_base.f_unitpowermap_from_unitpowerlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitpower},
          ":power",
          nx_tactics_decks_data.f_tactics_power("Natural Weaponry"),
          ":level",
          "1",
          ":unitabilitymap",
          nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitability},
              ":ability",
              nx_tactics_decks_data.f_ability_from_key("Bite")
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
      "place-clinic": nx_tactics_decks_scenario_nightonthetown.e_place_clinic,
      "place-conveniencestore": nx_tactics_decks_scenario_nightonthetown.e_place_conveniencestore,
      "place-gasstation": nx_tactics_decks_scenario_nightonthetown.e_place_gasstation,
      "place-gunstore": nx_tactics_decks_scenario_nightonthetown.e_place_gunstore,
      "place-policestation": nx_tactics_decks_scenario_nightonthetown.e_place_policestation,
      "place-street": nx_tactics_decks_scenario_nightonthetown.e_place_street,
      "rule-zombie": nx_tactics_decks_scenario_nightonthetown.e_rule_zombie,
      "unit-theprofessor": nx_tactics_decks_scenario_nightonthetown.e_unit_theprofessor,
      "unit-zombiecrawler": nx_tactics_decks_scenario_nightonthetown.e_unit_zombiecrawler,
      "unit-zombiedog": nx_tactics_decks_scenario_nightonthetown.e_unit_zombiedog,
      "unit-zombierunner": nx_tactics_decks_scenario_nightonthetown.e_unit_zombierunner,
      "unit-zombiewalker": nx_tactics_decks_scenario_nightonthetown.e_unit_zombiewalker
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-nightonthetown": nx_tactics_decks_scenario_nightonthetown.t_deck_nightonthetown,
      "place-clinic": nx_tactics_decks_scenario_nightonthetown.t_place_clinic,
      "place-conveniencestore": nx_tactics_decks_scenario_nightonthetown.t_place_conveniencestore,
      "place-gasstation": nx_tactics_decks_scenario_nightonthetown.t_place_gasstation,
      "place-gunstore": nx_tactics_decks_scenario_nightonthetown.t_place_gunstore,
      "place-policestation": nx_tactics_decks_scenario_nightonthetown.t_place_policestation,
      "place-street": nx_tactics_decks_scenario_nightonthetown.t_place_street,
      "rule-zombie": nx_tactics_decks_scenario_nightonthetown.t_rule_zombie,
      "unit-theprofessor": nx_tactics_decks_scenario_nightonthetown.t_unit_theprofessor,
      "unit-zombiecrawler": nx_tactics_decks_scenario_nightonthetown.t_unit_zombiecrawler,
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_scenario_nightonthetown.f_deck_nightonthetown
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_scenario_nightonthetown.f_unit_theprofessor
    }

    // (func unit-zombiecrawler)
    nx_tactics_decks_scenario_nightonthetown.t_unit_zombiecrawler['vx_value'] = {
      name          : "unit-zombiecrawler",
      pkgname       : "nx/tactics/decks/scenario-nightonthetown",
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
      fn            : nx_tactics_decks_scenario_nightonthetown.f_unit_zombiecrawler
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_scenario_nightonthetown.f_unit_zombiewalker
    }

  }
}
