'strict mode'

import vx_core from "../../vx/core.js"


export default class vx_util_randomize {

  static vx_randomize(
    lower,
    upper) {
    let output = Math.floor(Math.random() * upper) + 1
    return output
  }
  /**
   * @function randomize
   * Returns a random int between lower and upper inclusive.
   * @param  {int} lower
   * @param  {int} upper
   * @return {int}
   */
  static t_randomize = {
    vx_type: vx_core.t_type
  }
  static e_randomize = {
    vx_type: vx_util_randomize.t_randomize
  }

  // (func randomize)
  static f_randomize(lower, upper) {
    let output = vx_core.e_int
    output = vx_util_randomize.vx_randomize(lower, upper)
    return output
  }

  /**
   * @function rolldice
   * Returns the total of a number of dice rolls.
   * @param  {int} number
   * @param  {int} type
   * @return {int}
   */
  static t_rolldice = {
    vx_type: vx_core.t_type
  }
  static e_rolldice = {
    vx_type: vx_util_randomize.t_rolldice
  }

  // (func rolldice)
  static f_rolldice(number, type) {
    let output = vx_core.e_int
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "randomize": vx_util_randomize.e_randomize,
      "rolldice": vx_util_randomize.e_rolldice
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "randomize": vx_util_randomize.t_randomize,
      "rolldice": vx_util_randomize.t_rolldice
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "vx/util/randomize",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func randomize)
    vx_util_randomize.t_randomize['vx_value'] = {
      name          : "randomize",
      pkgname       : "vx/util/randomize",
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
      fn            : vx_util_randomize.f_randomize
    }

    // (func rolldice)
    vx_util_randomize.t_rolldice['vx_value'] = {
      name          : "rolldice",
      pkgname       : "vx/util/randomize",
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
      fn            : vx_util_randomize.f_rolldice
    }

  }
}
