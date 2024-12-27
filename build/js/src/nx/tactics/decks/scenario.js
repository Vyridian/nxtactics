'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_scenario {

  /**
   * @function scenariomap_tactics
   * Returns the base scenariomap
   * @param  {tactics} tactics
   * @return {scenariomap}
   */
  static t_scenariomap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_scenariomap_tactics = {
    vx_type: nx_tactics_decks_scenario.t_scenariomap_tactics
  }

  // (func scenariomap-tactics)
  static f_scenariomap_tactics(tactics) {
    let output = nx_tactics_base.e_scenariomap
    output = nx_tactics_base.f_scenariomap_from_scenariolist(
      vx_core.f_new({"any-1": nx_tactics_base.t_scenario}, ":name", "scenario1")
    )
    return output
  }

  /**
   * @function tactics_scenariomap_from_tactics
   * Returns a tactics updated with scenariomap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_scenariomap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_scenariomap_from_tactics = {
    vx_type: nx_tactics_decks_scenario.t_tactics_scenariomap_from_tactics
  }

  // (func tactics-scenariomap<-tactics)
  static f_tactics_scenariomap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const scenariomap = nx_tactics_decks_scenario.f_scenariomap_tactics(tactics)
        return vx_core.f_copy(tactics, ":scenariomap", scenariomap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "scenariomap-tactics": nx_tactics_decks_scenario.e_scenariomap_tactics,
      "tactics-scenariomap<-tactics": nx_tactics_decks_scenario.e_tactics_scenariomap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "scenariomap-tactics": nx_tactics_decks_scenario.t_scenariomap_tactics,
      "tactics-scenariomap<-tactics": nx_tactics_decks_scenario.t_tactics_scenariomap_from_tactics
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

    // (func scenariomap-tactics)
    nx_tactics_decks_scenario.t_scenariomap_tactics['vx_value'] = {
      name          : "scenariomap-tactics",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_scenariomap_tactics
    }

    // (func tactics-scenariomap<-tactics)
    nx_tactics_decks_scenario.t_tactics_scenariomap_from_tactics['vx_value'] = {
      name          : "tactics-scenariomap<-tactics",
      pkgname       : "nx/tactics/decks/scenario",
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
      fn            : nx_tactics_decks_scenario.f_tactics_scenariomap_from_tactics
    }

  }
}
