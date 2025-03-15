'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_power {

  /**
   * @function powermap_tactics
   * Returns the base powermap
   * @param  {tactics} tactics
   * @return {powermap}
   */
  static t_powermap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_powermap_tactics = {
    vx_type: nx_tactics_decks_power.t_powermap_tactics
  }

  // (func powermap-tactics)
  static f_powermap_tactics(tactics) {
    let output = nx_tactics_base.e_powermap
    output = nx_tactics_base.f_powermap_from_powerlist(
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Venomous",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Poison Bite")
      )
    )
    return output
  }

  /**
   * @function tactics_powermap_from_tactics
   * Returns a tactics updated with powermap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_powermap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_powermap_from_tactics = {
    vx_type: nx_tactics_decks_power.t_tactics_powermap_from_tactics
  }

  // (func tactics-powermap<-tactics)
  static f_tactics_powermap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const powermap = nx_tactics_decks_power.f_powermap_tactics(tactics)
        return vx_core.f_copy(tactics, ":powermap", powermap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "powermap-tactics": nx_tactics_decks_power.e_powermap_tactics,
      "tactics-powermap<-tactics": nx_tactics_decks_power.e_tactics_powermap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "powermap-tactics": nx_tactics_decks_power.t_powermap_tactics,
      "tactics-powermap<-tactics": nx_tactics_decks_power.t_tactics_powermap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/power",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func powermap-tactics)
    nx_tactics_decks_power.t_powermap_tactics['vx_value'] = {
      name          : "powermap-tactics",
      pkgname       : "nx/tactics/decks/power",
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
      fn            : nx_tactics_decks_power.f_powermap_tactics
    }

    // (func tactics-powermap<-tactics)
    nx_tactics_decks_power.t_tactics_powermap_from_tactics['vx_value'] = {
      name          : "tactics-powermap<-tactics",
      pkgname       : "nx/tactics/decks/power",
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
      fn            : nx_tactics_decks_power.f_tactics_powermap_from_tactics
    }

  }
}
