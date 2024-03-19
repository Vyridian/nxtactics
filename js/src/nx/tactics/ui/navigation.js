'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_ui_stylesheet from "../../../nx/tactics/ui/stylesheet.js"
import vx_ui_ui from "../../../vx/ui/ui.js"


export default class nx_tactics_ui_navigation {

  /**
   * @function boolean_navigate_back
   * Navigate to the previous ui
   * @return {boolean}
   */
  static t_boolean_navigate_back = {
    vx_type: vx_core.t_type
  }
  static e_boolean_navigate_back = {
    vx_type: nx_tactics_ui_navigation.t_boolean_navigate_back
  }

  // (func boolean-navigate-back)
  static f_boolean_navigate_back(context) {
    let output = vx_core.e_boolean
    output = vx_core.f_let(
      {"any-1": vx_core.t_boolean},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const navbar = nx_tactics_ui_navigation.f_ui_navbar(context)
        const main = nx_tactics_ui_navigation.f_ui_main(context)
        const posselected = nx_tactics_ui_navigation.f_int_selected_from_main(main)
        const poschg = vx_core.f_log_1({"any-1": vx_core.t_int}, "nx/tactics/ui/navigation/boolean-navigate-back/:value/let/:arg/fn-any/:value/if", vx_core.f_if(
          {"any-1": vx_core.t_int},
          vx_core.f_gt(posselected, 1),
          vx_core.f_minus1(posselected)
        ))
        const navbarchg = nx_tactics_ui_navigation.f_ui_writeselected_from_navbar_pos(context, navbar, poschg)
        const mainchg = nx_tactics_ui_navigation.f_ui_writeselected_from_main_pos(context, main, poschg)
        return vx_core.f_if(
          {"any-1": vx_core.t_boolean},
          vx_core.f_gt(poschg, 0),
          true
        )
      })
    )
    return output
  }

  /**
   * @function int_selected_from_main
   * Returns the index of the currently selected main
   * @param  {ui} main
   * @return {int}
   */
  static t_int_selected_from_main = {
    vx_type: vx_core.t_type
  }
  static e_int_selected_from_main = {
    vx_type: nx_tactics_ui_navigation.t_int_selected_from_main
  }

  // (func int-selected<-main)
  static f_int_selected_from_main(main) {
    let output = vx_core.e_int
    output = vx_ui_ui.f_int_selected_from_ui(main)
    return output
  }

  /**
   * @function ui_main
   * Returns the application main panel
   * @return {ui}
   */
  static t_ui_main = {
    vx_type: vx_core.t_type
  }
  static e_ui_main = {
    vx_type: nx_tactics_ui_navigation.t_ui_main
  }

  // (func ui-main)
  static f_ui_main(context) {
    let output = vx_ui_ui.e_ui
    output = vx_ui_ui.f_ui_readstate_from_uid(context, "main")
    return output
  }

  /**
   * @function ui_navbar
   * Returns the application navbar
   * @return {ui}
   */
  static t_ui_navbar = {
    vx_type: vx_core.t_type
  }
  static e_ui_navbar = {
    vx_type: nx_tactics_ui_navigation.t_ui_navbar
  }

  // (func ui-navbar)
  static f_ui_navbar(context) {
    let output = vx_ui_ui.e_ui
    output = vx_ui_ui.f_ui_readstate_from_uid(context, "navbar")
    return output
  }

  /**
   * @function ui_navbutton
   * @return {ui}
   */
  static t_ui_navbutton = {
    vx_type: vx_core.t_type
  }
  static e_ui_navbutton = {
    vx_type: nx_tactics_ui_navigation.t_ui_navbutton
  }

  // (func ui-navbutton)
  static f_ui_navbutton() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "navbar-",
      ":parent",
      "navbar",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_navbar_button,
        nx_tactics_ui_stylesheet.c_style_clickable
      )
    )
    return output
  }

  /**
   * @function ui_navbutton_from_ui_parent_selected
   * Returns a navbar-button
   * @param  {ui} ui
   * @param  {string} parent
   * @param  {boolean} selected
   * @return {ui}
   */
  static t_ui_navbutton_from_ui_parent_selected = {
    vx_type: vx_core.t_type
  }
  static e_ui_navbutton_from_ui_parent_selected = {
    vx_type: nx_tactics_ui_navigation.t_ui_navbutton_from_ui_parent_selected
  }

  // (func ui-navbutton<-ui-parent-selected)
  static f_ui_navbutton_from_ui_parent_selected(ui, parent, selected) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, ui, ":name")
        const uid = vx_core.f_new(
          vx_core.t_string,
          parent,
          "-",
          name
        )
        const navbutton = nx_tactics_ui_navigation.f_ui_navbutton()
        return vx_core.f_copy(
          navbutton,
          ":uid",
          uid,
          ":name",
          name,
          ":parent",
          parent,
          ":selected",
          selected,
          ":stylelist",
          vx_core.f_new(
            vx_ui_ui.t_stylelist,
            nx_tactics_ui_stylesheet.c_style_app_navbar_button,
            nx_tactics_ui_stylesheet.c_style_clickable
          )
        )
      })
    )
    return output
  }

  /**
   * @function ui_writeselected_from_main_pos
   * @param  {ui} main
   * @param  {int} pos
   * @return {ui}
   */
  static t_ui_writeselected_from_main_pos = {
    vx_type: vx_core.t_type
  }
  static e_ui_writeselected_from_main_pos = {
    vx_type: nx_tactics_ui_navigation.t_ui_writeselected_from_main_pos
  }

  // (func ui-writeselected<-main-pos)
  static f_ui_writeselected_from_main_pos(context, main, pos) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_ui},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_lt(pos, 1)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return main})
      )
    )
    return output
  }

  /**
   * @function ui_writeselected_from_navbar_pos
   * @param  {ui} navbar
   * @param  {int} pos
   * @return {ui}
   */
  static t_ui_writeselected_from_navbar_pos = {
    vx_type: vx_core.t_type
  }
  static e_ui_writeselected_from_navbar_pos = {
    vx_type: nx_tactics_ui_navigation.t_ui_writeselected_from_navbar_pos
  }

  // (func ui-writeselected<-navbar-pos)
  static f_ui_writeselected_from_navbar_pos(context, navbar, pos) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_ui},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_lt(pos, 1)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return navbar})
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "boolean-navigate-back": nx_tactics_ui_navigation.e_boolean_navigate_back,
      "int-selected<-main": nx_tactics_ui_navigation.e_int_selected_from_main,
      "ui-main": nx_tactics_ui_navigation.e_ui_main,
      "ui-navbar": nx_tactics_ui_navigation.e_ui_navbar,
      "ui-navbutton": nx_tactics_ui_navigation.e_ui_navbutton,
      "ui-navbutton<-ui-parent-selected": nx_tactics_ui_navigation.e_ui_navbutton_from_ui_parent_selected,
      "ui-writeselected<-main-pos": nx_tactics_ui_navigation.e_ui_writeselected_from_main_pos,
      "ui-writeselected<-navbar-pos": nx_tactics_ui_navigation.e_ui_writeselected_from_navbar_pos
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "boolean-navigate-back": nx_tactics_ui_navigation.t_boolean_navigate_back,
      "int-selected<-main": nx_tactics_ui_navigation.t_int_selected_from_main,
      "ui-main": nx_tactics_ui_navigation.t_ui_main,
      "ui-navbar": nx_tactics_ui_navigation.t_ui_navbar,
      "ui-navbutton": nx_tactics_ui_navigation.t_ui_navbutton,
      "ui-navbutton<-ui-parent-selected": nx_tactics_ui_navigation.t_ui_navbutton_from_ui_parent_selected,
      "ui-writeselected<-main-pos": nx_tactics_ui_navigation.t_ui_writeselected_from_main_pos,
      "ui-writeselected<-navbar-pos": nx_tactics_ui_navigation.t_ui_writeselected_from_navbar_pos
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/ui/navigation",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func boolean-navigate-back)
    nx_tactics_ui_navigation.t_boolean_navigate_back['vx_value'] = {
      name          : "boolean-navigate-back",
      pkgname       : "nx/tactics/ui/navigation",
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
      fn            : nx_tactics_ui_navigation.f_boolean_navigate_back
    }

    // (func int-selected<-main)
    nx_tactics_ui_navigation.t_int_selected_from_main['vx_value'] = {
      name          : "int-selected<-main",
      pkgname       : "nx/tactics/ui/navigation",
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
      fn            : nx_tactics_ui_navigation.f_int_selected_from_main
    }

    // (func ui-main)
    nx_tactics_ui_navigation.t_ui_main['vx_value'] = {
      name          : "ui-main",
      pkgname       : "nx/tactics/ui/navigation",
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
      fn            : nx_tactics_ui_navigation.f_ui_main
    }

    // (func ui-navbar)
    nx_tactics_ui_navigation.t_ui_navbar['vx_value'] = {
      name          : "ui-navbar",
      pkgname       : "nx/tactics/ui/navigation",
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
      fn            : nx_tactics_ui_navigation.f_ui_navbar
    }

    // (func ui-navbutton)
    nx_tactics_ui_navigation.t_ui_navbutton['vx_value'] = {
      name          : "ui-navbutton",
      pkgname       : "nx/tactics/ui/navigation",
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
      fn            : nx_tactics_ui_navigation.f_ui_navbutton
    }

    // (func ui-navbutton<-ui-parent-selected)
    nx_tactics_ui_navigation.t_ui_navbutton_from_ui_parent_selected['vx_value'] = {
      name          : "ui-navbutton<-ui-parent-selected",
      pkgname       : "nx/tactics/ui/navigation",
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
      fn            : nx_tactics_ui_navigation.f_ui_navbutton_from_ui_parent_selected
    }

    // (func ui-writeselected<-main-pos)
    nx_tactics_ui_navigation.t_ui_writeselected_from_main_pos['vx_value'] = {
      name          : "ui-writeselected<-main-pos",
      pkgname       : "nx/tactics/ui/navigation",
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
      fn            : nx_tactics_ui_navigation.f_ui_writeselected_from_main_pos
    }

    // (func ui-writeselected<-navbar-pos)
    nx_tactics_ui_navigation.t_ui_writeselected_from_navbar_pos['vx_value'] = {
      name          : "ui-writeselected<-navbar-pos",
      pkgname       : "nx/tactics/ui/navigation",
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
      fn            : nx_tactics_ui_navigation.f_ui_writeselected_from_navbar_pos
    }

  }
}
