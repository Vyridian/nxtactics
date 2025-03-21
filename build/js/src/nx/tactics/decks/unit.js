'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_unit {

  /**
   * @function tactics_unitmap_from_tactics
   * Returns a tactics updated with unitmap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_unitmap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_unitmap_from_tactics = {
    vx_type: nx_tactics_decks_unit.t_tactics_unitmap_from_tactics
  }

  // (func tactics-unitmap<-tactics)
  static f_tactics_unitmap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const unitmap = nx_tactics_decks_unit.f_unitmap_tactics(tactics)
        return vx_core.f_copy(tactics, ":unitmap", unitmap)
      })
    )
    return output
  }

  /**
   * @function unitmap_tactics
   * Returns the base unitmap
   * @param  {tactics} tactics
   * @return {unitmap}
   */
  static t_unitmap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_unitmap_tactics = {
    vx_type: nx_tactics_decks_unit.t_unitmap_tactics
  }

  // (func unitmap-tactics)
  static f_unitmap_tactics(tactics) {
    let output = nx_tactics_base.e_unitmap
    output = nx_tactics_base.f_unitmap_from_unitlist(
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Butterfly: Giant"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Caterpillar: Giant"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellbear"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellboar"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellbull"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hidden", ":image", "images/cards/unit-hidden.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Snake: Emerald Viper",
        ":summary",
        "* Movement - They can swim and climb trees.\n* Venomous Bite - Vipers carry a limited amount of venom. They can control the amount that injected including none at all.\n* Venom - Viperid venoms typically contain an abundance of protein-degrading enzymes, called proteases, that produce symptoms such as pain, strong local swelling and necrosis, blood loss from cardiovascular damage complicated disruption of the blood-clotting system. Death is usually caused by collapse in blood pressure. Due to the nature of proteolytic venom, a viperid bite is often a very painful experience and should always be taken seriously, though it may not necessarily prove fatal. Even with prompt and proper treatment, a bite can still result in a permanent scar, and in the worst cases, the affected limb may even have to be amputated.\n * Vision - They do not have heat vision unlike Pit Vipers",
        ":image",
        "images/cards/unit-snake-emeraldviper.svg",
        ":body",
        "2x0",
        ":mind",
        "2x1",
        ":will",
        "4x1",
        ":speed",
        "3x0",
        ":speedland",
        "3kph/2mph",
        ":mass",
        "2kg/5lbs",
        ":length",
        "30cm/1ft",
        ":skillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitskill},
            ":level",
            1,
            ":skill",
            nx_tactics_base.f_skill_from_tactics_key(tactics, "Stealth"),
            ":abilitylist",
            nx_tactics_base.f_abilitylist_from_tactics_keys(tactics, "Ambush", "Camouflage")
          )
        ),
        ":powermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitpower},
            ":level",
            2,
            ":intensity",
            "2x2",
            ":power",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Venomous"),
            ":abilitylist",
            nx_tactics_base.f_abilitylist_from_tactics_keys(tactics, "Poison Bite")
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
      "tactics-unitmap<-tactics": nx_tactics_decks_unit.e_tactics_unitmap_from_tactics,
      "unitmap-tactics": nx_tactics_decks_unit.e_unitmap_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "tactics-unitmap<-tactics": nx_tactics_decks_unit.t_tactics_unitmap_from_tactics,
      "unitmap-tactics": nx_tactics_decks_unit.t_unitmap_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/unit",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func tactics-unitmap<-tactics)
    nx_tactics_decks_unit.t_tactics_unitmap_from_tactics['vx_value'] = {
      name          : "tactics-unitmap<-tactics",
      pkgname       : "nx/tactics/decks/unit",
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
      fn            : nx_tactics_decks_unit.f_tactics_unitmap_from_tactics
    }

    // (func unitmap-tactics)
    nx_tactics_decks_unit.t_unitmap_tactics['vx_value'] = {
      name          : "unitmap-tactics",
      pkgname       : "nx/tactics/decks/unit",
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
      fn            : nx_tactics_decks_unit.f_unitmap_tactics
    }

  }
}
