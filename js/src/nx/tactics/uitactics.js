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
  static t_ui_app = {
    vx_type: vx_core.t_type
  }
  static e_ui_app = {
    vx_type: nx_tactics_uitactics.t_ui_app
  }

  // (func ui-app)
  static f_ui_app() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const background = nx_tactics_uitactics.f_ui_app_background()
        const main = nx_tactics_uitactics.f_ui_app_main()
        const menubar = nx_tactics_uitactics.f_ui_app_menubar()
        const menudrawer = nx_tactics_uitactics.f_ui_app_menudrawer()
        const msgbox = nx_tactics_uitactics.f_ui_app_msgbox()
        const navbar = nx_tactics_uitactics.f_ui_app_navbar()
        const navdrawer = nx_tactics_uitactics.f_ui_app_navdrawer()
        const parallax = nx_tactics_uitactics.f_ui_app_parallax()
        const statusbar = nx_tactics_uitactics.f_ui_app_statusbar()
        const statusdrawer = nx_tactics_uitactics.f_ui_app_statusdrawer()
        const uimap = vx_core.f_new(
          vx_ui_ui.t_uimap,
          ":background",
          background,
          ":main",
          main,
          ":menubar",
          menubar,
          ":menudrawer",
          menudrawer,
          ":msgbox",
          msgbox,
          ":navbar",
          navbar,
          ":navdrawer",
          navdrawer,
          ":parallax",
          parallax,
          ":statusbar",
          statusbar,
          ":statusdrawer",
          statusdrawer
        )
        return vx_core.f_new(
          vx_ui_ui.t_ui,
          ":uid",
          "app",
          ":style",
          nx_tactics_uitactics.f_ui_app_style(),
          ":uimap",
          uimap
        )
      })
    )
    return output
  }

  /**
   * @function ui_app_background
   * @return {ui}
   */
  static t_ui_app_background = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_background = {
    vx_type: nx_tactics_uitactics.t_ui_app_background
  }

  // (func ui-app-background)
  static f_ui_app_background() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "background"
    )
    return output
  }

  /**
   * @function ui_app_home
   * @return {ui}
   */
  static t_ui_app_home = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_home = {
    vx_type: nx_tactics_uitactics.t_ui_app_home
  }

  // (func ui-app-home)
  static f_ui_app_home() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "home"
    )
    return output
  }

  /**
   * @function ui_app_main
   * @return {ui}
   */
  static t_ui_app_main = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_main = {
    vx_type: nx_tactics_uitactics.t_ui_app_main
  }

  // (func ui-app-main)
  static f_ui_app_main() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "main",
      ":uimap",
      vx_core.f_new(
        vx_ui_ui.t_uimap,
        ":home",
        nx_tactics_uitactics.f_ui_app_home()
      ),
      ":style",
      nx_tactics_uitactics.f_ui_app_main_style()
    )
    return output
  }

  /**
   * @function ui_app_main_style
   * @return {style}
   */
  static t_ui_app_main_style = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_main_style = {
    vx_type: nx_tactics_uitactics.t_ui_app_main_style
  }

  // (func ui-app-main-style)
  static f_ui_app_main_style() {
    let output = vx_ui_ui.e_style
    output = vx_core.f_new(
      vx_ui_ui.t_style,
      ":layout",
      vx_ui_ui.c_layout_maxpanel
    )
    return output
  }

  /**
   * @function ui_app_menubar
   * @return {ui}
   */
  static t_ui_app_menubar = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_menubar = {
    vx_type: nx_tactics_uitactics.t_ui_app_menubar
  }

  // (func ui-app-menubar)
  static f_ui_app_menubar() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "menubar"
    )
    return output
  }

  /**
   * @function ui_app_menudrawer
   * @return {ui}
   */
  static t_ui_app_menudrawer = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_menudrawer = {
    vx_type: nx_tactics_uitactics.t_ui_app_menudrawer
  }

  // (func ui-app-menudrawer)
  static f_ui_app_menudrawer() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "menudrawer"
    )
    return output
  }

  /**
   * @function ui_app_msgbox
   * @return {ui}
   */
  static t_ui_app_msgbox = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_msgbox = {
    vx_type: nx_tactics_uitactics.t_ui_app_msgbox
  }

  // (func ui-app-msgbox)
  static f_ui_app_msgbox() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "msgbox"
    )
    return output
  }

  /**
   * @function ui_app_navbar
   * @return {ui}
   */
  static t_ui_app_navbar = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_navbar = {
    vx_type: nx_tactics_uitactics.t_ui_app_navbar
  }

  // (func ui-app-navbar)
  static f_ui_app_navbar() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "navbar"
    )
    return output
  }

  /**
   * @function ui_app_navdrawer
   * @return {ui}
   */
  static t_ui_app_navdrawer = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_navdrawer = {
    vx_type: nx_tactics_uitactics.t_ui_app_navdrawer
  }

  // (func ui-app-navdrawer)
  static f_ui_app_navdrawer() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "navdrawer"
    )
    return output
  }

  /**
   * @function ui_app_parallax
   * @return {ui}
   */
  static t_ui_app_parallax = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_parallax = {
    vx_type: nx_tactics_uitactics.t_ui_app_parallax
  }

  // (func ui-app-parallax)
  static f_ui_app_parallax() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "parallax"
    )
    return output
  }

  /**
   * @function ui_app_statusbar
   * @return {ui}
   */
  static t_ui_app_statusbar = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_statusbar = {
    vx_type: nx_tactics_uitactics.t_ui_app_statusbar
  }

  // (func ui-app-statusbar)
  static f_ui_app_statusbar() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "statusbar"
    )
    return output
  }

  /**
   * @function ui_app_statusdrawer
   * @return {ui}
   */
  static t_ui_app_statusdrawer = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_statusdrawer = {
    vx_type: nx_tactics_uitactics.t_ui_app_statusdrawer
  }

  // (func ui-app-statusdrawer)
  static f_ui_app_statusdrawer() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "statusdrawer"
    )
    return output
  }

  /**
   * @function ui_app_style
   * Returns the style for app ui.
   * @return {style}
   */
  static t_ui_app_style = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_style = {
    vx_type: nx_tactics_uitactics.t_ui_app_style
  }

  // (func ui-app-style)
  static f_ui_app_style() {
    let output = vx_ui_ui.e_style
    output = vx_core.f_new(
      vx_ui_ui.t_style,
      ":layout",
      vx_ui_ui.c_layout_app
    )
    return output
  }

  /**
   * @function ui_app_stylesheet
   * Returns the stylesheet for app ui.
   * @return {stylesheet}
   */
  static t_ui_app_stylesheet = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_stylesheet = {
    vx_type: nx_tactics_uitactics.t_ui_app_stylesheet
  }

  // (func ui-app-stylesheet)
  static f_ui_app_stylesheet() {
    let output = vx_ui_ui.e_stylesheet
    return output
  }

  /**
   * @function ui_app_from_tactics
   * @param  {tactics} tactics
   * @return {ui}
   */
  static t_ui_app_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_from_tactics = {
    vx_type: nx_tactics_uitactics.t_ui_app_from_tactics
  }

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
  static t_ui_unit = {
    vx_type: vx_core.t_type
  }
  static e_ui_unit = {
    vx_type: nx_tactics_uitactics.t_ui_unit
  }

  // (func ui-unit)
  static f_ui_unit() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_background
   * @return {ui}
   */
  static t_ui_unit_background = {
    vx_type: vx_core.t_type
  }
  static e_ui_unit_background = {
    vx_type: nx_tactics_uitactics.t_ui_unit_background
  }

  // (func ui-unit-background)
  static f_ui_unit_background() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_flavor
   * @return {ui}
   */
  static t_ui_unit_flavor = {
    vx_type: vx_core.t_type
  }
  static e_ui_unit_flavor = {
    vx_type: nx_tactics_uitactics.t_ui_unit_flavor
  }

  // (func ui-unit-flavor)
  static f_ui_unit_flavor() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_header
   * @return {ui}
   */
  static t_ui_unit_header = {
    vx_type: vx_core.t_type
  }
  static e_ui_unit_header = {
    vx_type: nx_tactics_uitactics.t_ui_unit_header
  }

  // (func ui-unit-header)
  static f_ui_unit_header() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_skillpower
   * @return {ui}
   */
  static t_ui_unit_skillpower = {
    vx_type: vx_core.t_type
  }
  static e_ui_unit_skillpower = {
    vx_type: nx_tactics_uitactics.t_ui_unit_skillpower
  }

  // (func ui-unit-skillpower)
  static f_ui_unit_skillpower() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_stat
   * @return {ui}
   */
  static t_ui_unit_stat = {
    vx_type: vx_core.t_type
  }
  static e_ui_unit_stat = {
    vx_type: nx_tactics_uitactics.t_ui_unit_stat
  }

  // (func ui-unit-stat)
  static f_ui_unit_stat() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_unit_style
   * Returns the style for unit ui.
   * @return {style}
   */
  static t_ui_unit_style = {
    vx_type: vx_core.t_type
  }
  static e_ui_unit_style = {
    vx_type: nx_tactics_uitactics.t_ui_unit_style
  }

  // (func ui-unit-style)
  static f_ui_unit_style() {
    let output = vx_ui_ui.e_style
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "ui-app": nx_tactics_uitactics.e_ui_app,
      "ui-app-background": nx_tactics_uitactics.e_ui_app_background,
      "ui-app-home": nx_tactics_uitactics.e_ui_app_home,
      "ui-app-main": nx_tactics_uitactics.e_ui_app_main,
      "ui-app-main-style": nx_tactics_uitactics.e_ui_app_main_style,
      "ui-app-menubar": nx_tactics_uitactics.e_ui_app_menubar,
      "ui-app-menudrawer": nx_tactics_uitactics.e_ui_app_menudrawer,
      "ui-app-msgbox": nx_tactics_uitactics.e_ui_app_msgbox,
      "ui-app-navbar": nx_tactics_uitactics.e_ui_app_navbar,
      "ui-app-navdrawer": nx_tactics_uitactics.e_ui_app_navdrawer,
      "ui-app-parallax": nx_tactics_uitactics.e_ui_app_parallax,
      "ui-app-statusbar": nx_tactics_uitactics.e_ui_app_statusbar,
      "ui-app-statusdrawer": nx_tactics_uitactics.e_ui_app_statusdrawer,
      "ui-app-style": nx_tactics_uitactics.e_ui_app_style,
      "ui-app-stylesheet": nx_tactics_uitactics.e_ui_app_stylesheet,
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
      "ui-app-main": nx_tactics_uitactics.t_ui_app_main,
      "ui-app-main-style": nx_tactics_uitactics.t_ui_app_main_style,
      "ui-app-menubar": nx_tactics_uitactics.t_ui_app_menubar,
      "ui-app-menudrawer": nx_tactics_uitactics.t_ui_app_menudrawer,
      "ui-app-msgbox": nx_tactics_uitactics.t_ui_app_msgbox,
      "ui-app-navbar": nx_tactics_uitactics.t_ui_app_navbar,
      "ui-app-navdrawer": nx_tactics_uitactics.t_ui_app_navdrawer,
      "ui-app-parallax": nx_tactics_uitactics.t_ui_app_parallax,
      "ui-app-statusbar": nx_tactics_uitactics.t_ui_app_statusbar,
      "ui-app-statusdrawer": nx_tactics_uitactics.t_ui_app_statusdrawer,
      "ui-app-style": nx_tactics_uitactics.t_ui_app_style,
      "ui-app-stylesheet": nx_tactics_uitactics.t_ui_app_stylesheet,
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

    // (func ui-app-main)
    nx_tactics_uitactics.t_ui_app_main['vx_value'] = {
      name          : "ui-app-main",
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
      fn            : nx_tactics_uitactics.f_ui_app_main
    }

    // (func ui-app-main-style)
    nx_tactics_uitactics.t_ui_app_main_style['vx_value'] = {
      name          : "ui-app-main-style",
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
      fn            : nx_tactics_uitactics.f_ui_app_main_style
    }

    // (func ui-app-menubar)
    nx_tactics_uitactics.t_ui_app_menubar['vx_value'] = {
      name          : "ui-app-menubar",
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
      fn            : nx_tactics_uitactics.f_ui_app_menubar
    }

    // (func ui-app-menudrawer)
    nx_tactics_uitactics.t_ui_app_menudrawer['vx_value'] = {
      name          : "ui-app-menudrawer",
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
      fn            : nx_tactics_uitactics.f_ui_app_menudrawer
    }

    // (func ui-app-msgbox)
    nx_tactics_uitactics.t_ui_app_msgbox['vx_value'] = {
      name          : "ui-app-msgbox",
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
      fn            : nx_tactics_uitactics.f_ui_app_msgbox
    }

    // (func ui-app-navbar)
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

    // (func ui-app-navdrawer)
    nx_tactics_uitactics.t_ui_app_navdrawer['vx_value'] = {
      name          : "ui-app-navdrawer",
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
      fn            : nx_tactics_uitactics.f_ui_app_navdrawer
    }

    // (func ui-app-parallax)
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

    // (func ui-app-statusbar)
    nx_tactics_uitactics.t_ui_app_statusbar['vx_value'] = {
      name          : "ui-app-statusbar",
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
      fn            : nx_tactics_uitactics.f_ui_app_statusbar
    }

    // (func ui-app-statusdrawer)
    nx_tactics_uitactics.t_ui_app_statusdrawer['vx_value'] = {
      name          : "ui-app-statusdrawer",
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
      fn            : nx_tactics_uitactics.f_ui_app_statusdrawer
    }

    // (func ui-app-style)
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

    // (func ui-app-stylesheet)
    nx_tactics_uitactics.t_ui_app_stylesheet['vx_value'] = {
      name          : "ui-app-stylesheet",
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
      fn            : nx_tactics_uitactics.f_ui_app_stylesheet
    }

    // (func ui-app<-tactics)
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
