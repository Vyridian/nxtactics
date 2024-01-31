'strict mode'

import vx_core from "../../vx/core.js"
import nx_tactics_base from "../../nx/tactics/base.js"
import vx_ui_ui from "../../vx/ui/ui.js"


export default class nx_tactics_uitactics {

  /**
   * @function ui_app
   * Returns the template for the app ui.
   * @return {ui}
   */
  static t_ui_app = {}
  static e_ui_app = {vx_type: nx_tactics_uitactics.t_ui_app}

  // (func ui-app)
  static f_ui_app() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const background = nx_tactics_uitactics.f_ui_app_background()
        const home = nx_tactics_uitactics.f_ui_app_home()
        const nav = nx_tactics_uitactics.f_ui_app_nav()
        const navbar = nx_tactics_uitactics.f_ui_app_navbar()
        const parallax = nx_tactics_uitactics.f_ui_app_parallax()
        const status = nx_tactics_uitactics.f_ui_app_status()
        const uimap = vx_core.f_new(
          vx_ui_ui.t_uimap,
          ":background",
          background,
          ":home",
          home,
          ":nav",
          nav,
          ":navbar",
          navbar,
          ":parallax",
          parallax
        )
        return vx_core.f_new(
          vx_ui_ui.t_ui,
          ":uilayout",
          vx_ui_ui.c_uilayout_app,
          ":uimap",
          uimap,
          ":uistyle",
          nx_tactics_uitactics.f_ui_app_style()
        )
      })
    )
    return output
  }

  /**
   * @function ui_app_background
   * @return {ui}
   */
  static t_ui_app_background = {}
  static e_ui_app_background = {vx_type: nx_tactics_uitactics.t_ui_app_background}

  // (func ui-app-background)
  static f_ui_app_background() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_app_home
   * @return {ui}
   */
  static t_ui_app_home = {}
  static e_ui_app_home = {vx_type: nx_tactics_uitactics.t_ui_app_home}

  // (func ui-app-home)
  static f_ui_app_home() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_app_nav
   * @return {ui}
   */
  static t_ui_app_nav = {}
  static e_ui_app_nav = {vx_type: nx_tactics_uitactics.t_ui_app_nav}

  // (func ui-app-nav)
  static f_ui_app_nav() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_app_navbar
   * @return {ui}
   */
  static t_ui_app_navbar = {}
  static e_ui_app_navbar = {vx_type: nx_tactics_uitactics.t_ui_app_navbar}

  // (func ui-app-navbar)
  static f_ui_app_navbar() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_app_parallax
   * @return {ui}
   */
  static t_ui_app_parallax = {}
  static e_ui_app_parallax = {vx_type: nx_tactics_uitactics.t_ui_app_parallax}

  // (func ui-app-parallax)
  static f_ui_app_parallax() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_app_status
   * @return {ui}
   */
  static t_ui_app_status = {}
  static e_ui_app_status = {vx_type: nx_tactics_uitactics.t_ui_app_status}

  // (func ui-app-status)
  static f_ui_app_status() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_app_style
   * Returns the style for app ui.
   * @return {uistyle}
   */
  static t_ui_app_style = {}
  static e_ui_app_style = {vx_type: nx_tactics_uitactics.t_ui_app_style}

  // (func ui-app-style)
  static f_ui_app_style() {
    let output = vx_ui_ui.e_uistyle
    return output
  }

  /**
   * @function ui_app_from_tactics
   * @param  {tactics} tactics
   * @return {ui}
   */
  static t_ui_app_from_tactics = {}
  static e_ui_app_from_tactics = {vx_type: nx_tactics_uitactics.t_ui_app_from_tactics}

  // (func ui-app<-tactics)
  static f_ui_app_from_tactics(tactics) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const appui = nx_tactics_uitactics.f_ui_app()
        return vx_core.f_copy(appui, ":data", tactics)
      })
    )
    return output
  }

  /**
   * @function ui_unit
   * Returns the template for a unit ui.
   * @return {ui}
   */
  static t_ui_unit = {}
  static e_ui_unit = {vx_type: nx_tactics_uitactics.t_ui_unit}

  // (func ui-unit)
  static f_ui_unit() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_background
   * @return {ui}
   */
  static t_ui_unit_background = {}
  static e_ui_unit_background = {vx_type: nx_tactics_uitactics.t_ui_unit_background}

  // (func ui-unit-background)
  static f_ui_unit_background() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_flavor
   * @return {ui}
   */
  static t_ui_unit_flavor = {}
  static e_ui_unit_flavor = {vx_type: nx_tactics_uitactics.t_ui_unit_flavor}

  // (func ui-unit-flavor)
  static f_ui_unit_flavor() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_header
   * @return {ui}
   */
  static t_ui_unit_header = {}
  static e_ui_unit_header = {vx_type: nx_tactics_uitactics.t_ui_unit_header}

  // (func ui-unit-header)
  static f_ui_unit_header() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_skillpower
   * @return {ui}
   */
  static t_ui_unit_skillpower = {}
  static e_ui_unit_skillpower = {vx_type: nx_tactics_uitactics.t_ui_unit_skillpower}

  // (func ui-unit-skillpower)
  static f_ui_unit_skillpower() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_stat
   * @return {ui}
   */
  static t_ui_unit_stat = {}
  static e_ui_unit_stat = {vx_type: nx_tactics_uitactics.t_ui_unit_stat}

  // (func ui-unit-stat)
  static f_ui_unit_stat() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_style
   * Returns the style for unit ui.
   * @return {uistyle}
   */
  static t_ui_unit_style = {}
  static e_ui_unit_style = {vx_type: nx_tactics_uitactics.t_ui_unit_style}

  // (func ui-unit-style)
  static f_ui_unit_style() {
    let output = vx_ui_ui.e_uistyle
    return output
  }

  // empty types


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "ui-app": nx_tactics_uitactics.e_ui_app,
      "ui-app-background": nx_tactics_uitactics.e_ui_app_background,
      "ui-app-home": nx_tactics_uitactics.e_ui_app_home,
      "ui-app-nav": nx_tactics_uitactics.e_ui_app_nav,
      "ui-app-navbar": nx_tactics_uitactics.e_ui_app_navbar,
      "ui-app-parallax": nx_tactics_uitactics.e_ui_app_parallax,
      "ui-app-status": nx_tactics_uitactics.e_ui_app_status,
      "ui-app-style": nx_tactics_uitactics.e_ui_app_style,
      "ui-app<-tactics": nx_tactics_uitactics.e_ui_app_from_tactics,
      "ui-unit": nx_tactics_uitactics.e_ui_unit,
      "ui-unit-background": nx_tactics_uitactics.e_ui_unit_background,
      "ui-unit-flavor": nx_tactics_uitactics.e_ui_unit_flavor,
      "ui-unit-header": nx_tactics_uitactics.e_ui_unit_header,
      "ui-unit-skillpower": nx_tactics_uitactics.e_ui_unit_skillpower,
      "ui-unit-stat": nx_tactics_uitactics.e_ui_unit_stat,
      "ui-unit-style": nx_tactics_uitactics.e_ui_unit_style
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "ui-app": nx_tactics_uitactics.t_ui_app,
      "ui-app-background": nx_tactics_uitactics.t_ui_app_background,
      "ui-app-home": nx_tactics_uitactics.t_ui_app_home,
      "ui-app-nav": nx_tactics_uitactics.t_ui_app_nav,
      "ui-app-navbar": nx_tactics_uitactics.t_ui_app_navbar,
      "ui-app-parallax": nx_tactics_uitactics.t_ui_app_parallax,
      "ui-app-status": nx_tactics_uitactics.t_ui_app_status,
      "ui-app-style": nx_tactics_uitactics.t_ui_app_style,
      "ui-app<-tactics": nx_tactics_uitactics.t_ui_app_from_tactics,
      "ui-unit": nx_tactics_uitactics.t_ui_unit,
      "ui-unit-background": nx_tactics_uitactics.t_ui_unit_background,
      "ui-unit-flavor": nx_tactics_uitactics.t_ui_unit_flavor,
      "ui-unit-header": nx_tactics_uitactics.t_ui_unit_header,
      "ui-unit-skillpower": nx_tactics_uitactics.t_ui_unit_skillpower,
      "ui-unit-stat": nx_tactics_uitactics.t_ui_unit_stat,
      "ui-unit-style": nx_tactics_uitactics.t_ui_unit_style
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/uitactics",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func ui-app)
    nx_tactics_uitactics.t_ui_app['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_app['vx_value'] = {
      name          : "ui-app",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_app
    }

    // (func ui-app-background)
    nx_tactics_uitactics.t_ui_app_background['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_app_background['vx_value'] = {
      name          : "ui-app-background",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_app_background
    }

    // (func ui-app-home)
    nx_tactics_uitactics.t_ui_app_home['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_app_home['vx_value'] = {
      name          : "ui-app-home",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_app_home
    }

    // (func ui-app-nav)
    nx_tactics_uitactics.t_ui_app_nav['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_app_nav['vx_value'] = {
      name          : "ui-app-nav",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_app_nav
    }

    // (func ui-app-navbar)
    nx_tactics_uitactics.t_ui_app_navbar['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_app_navbar['vx_value'] = {
      name          : "ui-app-navbar",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_app_navbar
    }

    // (func ui-app-parallax)
    nx_tactics_uitactics.t_ui_app_parallax['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_app_parallax['vx_value'] = {
      name          : "ui-app-parallax",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_app_parallax
    }

    // (func ui-app-status)
    nx_tactics_uitactics.t_ui_app_status['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_app_status['vx_value'] = {
      name          : "ui-app-status",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_app_status
    }

    // (func ui-app-style)
    nx_tactics_uitactics.t_ui_app_style['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_app_style['vx_value'] = {
      name          : "ui-app-style",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_app_style
    }

    // (func ui-app<-tactics)
    nx_tactics_uitactics.t_ui_app_from_tactics['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_app_from_tactics['vx_value'] = {
      name          : "ui-app<-tactics",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_app_from_tactics
    }

    // (func ui-unit)
    nx_tactics_uitactics.t_ui_unit['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_unit['vx_value'] = {
      name          : "ui-unit",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_unit
    }

    // (func ui-unit-background)
    nx_tactics_uitactics.t_ui_unit_background['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_unit_background['vx_value'] = {
      name          : "ui-unit-background",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_unit_background
    }

    // (func ui-unit-flavor)
    nx_tactics_uitactics.t_ui_unit_flavor['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_unit_flavor['vx_value'] = {
      name          : "ui-unit-flavor",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_unit_flavor
    }

    // (func ui-unit-header)
    nx_tactics_uitactics.t_ui_unit_header['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_unit_header['vx_value'] = {
      name          : "ui-unit-header",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_unit_header
    }

    // (func ui-unit-skillpower)
    nx_tactics_uitactics.t_ui_unit_skillpower['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_unit_skillpower['vx_value'] = {
      name          : "ui-unit-skillpower",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_unit_skillpower
    }

    // (func ui-unit-stat)
    nx_tactics_uitactics.t_ui_unit_stat['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_unit_stat['vx_value'] = {
      name          : "ui-unit-stat",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_unit_stat
    }

    // (func ui-unit-style)
    nx_tactics_uitactics.t_ui_unit_style['vx_type'] = vx_core.t_type
    nx_tactics_uitactics.t_ui_unit_style['vx_value'] = {
      name          : "ui-unit-style",
      pkgname       : "nx/tactics/uitactics",
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
      fn            : nx_tactics_uitactics.f_ui_unit_style
    }

  }
}
