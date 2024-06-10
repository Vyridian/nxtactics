'strict mode'

import vx_core from "../../../vx/core.js"
import vx_event from "../../../vx/event.js"
import nx_tactics_ui_stylesheet from "../../../nx/tactics/ui/stylesheet.js"
import vx_ui_ui from "../../../vx/ui/ui.js"


export default class nx_tactics_ui_navigation {

  /**
   * Constant: event-navbutton-click
   * {event}
   */
  static c_event_navbutton_click = {vx_type: vx_event.t_event, vx_constdef: {pkgname: 'nx/tactics/ui/navigation', name: 'event-navbutton-click'}}

  /**
   * Constant: eventmap-navbutton
   * Eventmap for navbutton
   * {eventmap}
   */
  static c_eventmap_navbutton = {vx_type: vx_event.t_eventmap, vx_constdef: {pkgname: 'nx/tactics/ui/navigation', name: 'eventmap-navbutton'}}

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
        const navbar = nx_tactics_ui_navigation.f_ui_readstate_navbar(context)
        const ideselect = vx_ui_ui.f_int_selected_from_ui(navbar)
        const ischange = vx_core.f_gt(ideselect, 2)
        return vx_core.f_if_2(
          {"any-1": vx_core.t_boolean},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return ischange}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_navigation.f_boolean_navigate_from_select(
              context,
              vx_core.f_minus(ideselect, 2)
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function boolean_navigate_from_navid
   * Navigate to the named navid.
   * @param  {string} navid
   * @return {boolean}
   */
  static t_boolean_navigate_from_navid = {
    vx_type: vx_core.t_type
  }
  static e_boolean_navigate_from_navid = {
    vx_type: nx_tactics_ui_navigation.t_boolean_navigate_from_navid
  }

  // (func boolean-navigate<-navid)
  static f_boolean_navigate_from_navid(context, navid) {
    let output = vx_core.e_boolean
    output = vx_core.f_let(
      {"any-1": vx_core.t_boolean},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const navbar = nx_tactics_ui_navigation.f_ui_readstate_navbar(context)
        const inavselect = vx_ui_ui.f_int_child_from_ui_uid(navbar, navid)
        return nx_tactics_ui_navigation.f_boolean_navigate_from_select(
          context,
          vx_core.f_minus1(inavselect)
        )
      })
    )
    return output
  }

  /**
   * @function boolean_navigate_from_select
   * Navigate to the ui at select position.
   * @param  {int} iselect
   * @return {boolean}
   */
  static t_boolean_navigate_from_select = {
    vx_type: vx_core.t_type
  }
  static e_boolean_navigate_from_select = {
    vx_type: nx_tactics_ui_navigation.t_boolean_navigate_from_select
  }

  // (func boolean-navigate<-select)
  static f_boolean_navigate_from_select(context, iselect) {
    let output = vx_core.e_boolean
    output = vx_core.f_let(
      {"any-1": vx_core.t_boolean},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const main = nx_tactics_ui_navigation.f_ui_readstate_main(context)
        const ideselect = vx_ui_ui.f_int_visible_from_ui(main)
        const ischange = vx_core.f_ne(iselect, ideselect)
        return vx_core.f_if_2(
          {"any-1": vx_core.t_boolean},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return ischange}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
              {"any-1": vx_core.t_boolean},
              [],
              vx_core.f_new(vx_core.t_any_from_func, () => {
                const navbar = nx_tactics_ui_navigation.f_ui_readstate_navbar(context)
                const navdeselect = vx_ui_ui.f_ui_child_from_ui_pos(
                  navbar,
                  vx_core.f_plus1(ideselect)
                )
                const isnavdeselect = vx_ui_ui.f_boolean_layout_from_ui_parent_selected(
                  context,
                  navdeselect,
                  navbar,
                  false
                )
                const navselect = vx_ui_ui.f_ui_child_from_ui_pos(
                  navbar,
                  vx_core.f_plus1(iselect)
                )
                const isnavselect = vx_ui_ui.f_boolean_layout_from_ui_parent_selected(
                  context,
                  navselect,
                  navbar,
                  true
                )
                const maindeselect = vx_ui_ui.f_ui_child_from_ui_pos(main, ideselect)
                const ismaindeselect = vx_ui_ui.f_boolean_layout_from_ui_parent_visible(
                  context,
                  maindeselect,
                  main,
                  false
                )
                const mainselect = vx_ui_ui.f_ui_child_from_ui_pos(main, iselect)
                const ismainselect = vx_ui_ui.f_boolean_layout_from_ui_parent_visible(
                  context,
                  mainselect,
                  main,
                  true
                )
                return   true
              })
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function event_navbutton_click_from_event
   * Event handler for card clicks
   * @param  {event} event
   * @return {event}
   */
  static t_event_navbutton_click_from_event = {
    vx_type: vx_core.t_type
  }
  static e_event_navbutton_click_from_event = {
    vx_type: nx_tactics_ui_navigation.t_event_navbutton_click_from_event
  }

  // (func event-navbutton-click<-event)
  static f_event_navbutton_click_from_event(context, event) {
    let output = vx_event.e_event
    output = vx_core.f_let(
      {"any-1": vx_event.t_event},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const target = vx_ui_ui.f_ui_from_from_event(context, event)
        const uid = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, target, ":uid")
        const isback = vx_core.f_eq(uid, "app/navbar/Back")
        const isnav = vx_core.f_if_2(
          {"any-1": vx_core.t_boolean},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return isback}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_navigation.f_boolean_navigate_back(context)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_navigation.f_boolean_navigate_from_navid(context, uid)})
          )
        )
        return event
      })
    )
    return output
  }

  /**
   * @function ui_app
   * Returns the application app
   * @return {ui}
   */
  static t_ui_app = {
    vx_type: vx_core.t_type
  }
  static e_ui_app = {
    vx_type: nx_tactics_ui_navigation.t_ui_app
  }

  // (func ui-app)
  static f_ui_app(context) {
    let output = vx_ui_ui.e_ui
    output = vx_ui_ui.f_ui_readstate_uiapp(context)
    return output
  }

  /**
   * @function ui_layout_from_main_selected
   * @param  {ui} main
   * @param  {int} selected
   * @return {ui}
   */
  static t_ui_layout_from_main_selected = {
    vx_type: vx_core.t_type
  }
  static e_ui_layout_from_main_selected = {
    vx_type: nx_tactics_ui_navigation.t_ui_layout_from_main_selected
  }

  // (func ui-layout<-main-selected)
  static f_ui_layout_from_main_selected(context, main, selected) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_ui},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_lt(selected, 1)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return main})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_ui},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const parent = vx_ui_ui.f_ui_readstate_uiapp(context)
            return vx_ui_ui.f_ui_layout_from_ui_parent_visible(main, parent, selected)
          })
        )})
      )
    )
    return output
  }

  /**
   * @function ui_layout_from_navbar_selected
   * @param  {ui} navbar
   * @param  {int} selected
   * @return {ui}
   */
  static t_ui_layout_from_navbar_selected = {
    vx_type: vx_core.t_type
  }
  static e_ui_layout_from_navbar_selected = {
    vx_type: nx_tactics_ui_navigation.t_ui_layout_from_navbar_selected
  }

  // (func ui-layout<-navbar-selected)
  static f_ui_layout_from_navbar_selected(context, navbar, selected) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_ui},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_lt(selected, 1)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return navbar})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_ui},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const parent = vx_ui_ui.f_ui_readstate_uiapp(context)
            return vx_ui_ui.f_ui_layout_from_ui_parent_selected(
              navbar,
              parent,
              vx_core.f_plus1(selected)
            )
          })
        )})
      )
    )
    return output
  }

  /**
   * @function ui_navbutton
   * Returns an empty navbutton
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
      "app/navbar",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_navbar_button,
        nx_tactics_ui_stylesheet.c_style_clickable
      ),
      ":eventmap",
      nx_tactics_ui_navigation.c_eventmap_navbutton
    )
    return output
  }

  /**
   * @function ui_navbutton_from_ui_selected
   * Returns a navbar-button
   * @param  {ui} ui
   * @param  {boolean} selected
   * @return {ui}
   */
  static t_ui_navbutton_from_ui_selected = {
    vx_type: vx_core.t_type
  }
  static e_ui_navbutton_from_ui_selected = {
    vx_type: nx_tactics_ui_navigation.t_ui_navbutton_from_ui_selected
  }

  // (func ui-navbutton<-ui-selected)
  static f_ui_navbutton_from_ui_selected(ui, selected) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, ui, ":name")
        const navbutton = nx_tactics_ui_navigation.f_ui_navbutton()
        const uid = vx_core.f_new(
          vx_core.t_string,
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, navbutton, ":uid"),
          "/",
          name
        )
        return vx_core.f_copy(navbutton, ":uid", uid, ":name", name, ":selected", selected)
      })
    )
    return output
  }

  /**
   * @function ui_readstate_main
   * Returns the application main panel
   * @return {ui}
   */
  static t_ui_readstate_main = {
    vx_type: vx_core.t_type
  }
  static e_ui_readstate_main = {
    vx_type: nx_tactics_ui_navigation.t_ui_readstate_main
  }

  // (func ui-readstate-main)
  static f_ui_readstate_main(context) {
    let output = vx_ui_ui.e_ui
    output = vx_ui_ui.f_ui_readstate_from_uid(context, "app/main")
    return output
  }

  /**
   * @function ui_readstate_navbar
   * Returns the application navbar
   * @return {ui}
   */
  static t_ui_readstate_navbar = {
    vx_type: vx_core.t_type
  }
  static e_ui_readstate_navbar = {
    vx_type: nx_tactics_ui_navigation.t_ui_readstate_navbar
  }

  // (func ui-readstate-navbar)
  static f_ui_readstate_navbar(context) {
    let output = vx_ui_ui.e_ui
    output = vx_ui_ui.f_ui_readstate_from_uid(context, "app/navbar")
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "event-navbutton-click": nx_tactics_ui_navigation.c_event_navbutton_click,
      "eventmap-navbutton": nx_tactics_ui_navigation.c_eventmap_navbutton
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "boolean-navigate-back": nx_tactics_ui_navigation.e_boolean_navigate_back,
      "boolean-navigate<-navid": nx_tactics_ui_navigation.e_boolean_navigate_from_navid,
      "boolean-navigate<-select": nx_tactics_ui_navigation.e_boolean_navigate_from_select,
      "event-navbutton-click<-event": nx_tactics_ui_navigation.e_event_navbutton_click_from_event,
      "ui-app": nx_tactics_ui_navigation.e_ui_app,
      "ui-layout<-main-selected": nx_tactics_ui_navigation.e_ui_layout_from_main_selected,
      "ui-layout<-navbar-selected": nx_tactics_ui_navigation.e_ui_layout_from_navbar_selected,
      "ui-navbutton": nx_tactics_ui_navigation.e_ui_navbutton,
      "ui-navbutton<-ui-selected": nx_tactics_ui_navigation.e_ui_navbutton_from_ui_selected,
      "ui-readstate-main": nx_tactics_ui_navigation.e_ui_readstate_main,
      "ui-readstate-navbar": nx_tactics_ui_navigation.e_ui_readstate_navbar
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "boolean-navigate-back": nx_tactics_ui_navigation.t_boolean_navigate_back,
      "boolean-navigate<-navid": nx_tactics_ui_navigation.t_boolean_navigate_from_navid,
      "boolean-navigate<-select": nx_tactics_ui_navigation.t_boolean_navigate_from_select,
      "event-navbutton-click<-event": nx_tactics_ui_navigation.t_event_navbutton_click_from_event,
      "ui-app": nx_tactics_ui_navigation.t_ui_app,
      "ui-layout<-main-selected": nx_tactics_ui_navigation.t_ui_layout_from_main_selected,
      "ui-layout<-navbar-selected": nx_tactics_ui_navigation.t_ui_layout_from_navbar_selected,
      "ui-navbutton": nx_tactics_ui_navigation.t_ui_navbutton,
      "ui-navbutton<-ui-selected": nx_tactics_ui_navigation.t_ui_navbutton_from_ui_selected,
      "ui-readstate-main": nx_tactics_ui_navigation.t_ui_readstate_main,
      "ui-readstate-navbar": nx_tactics_ui_navigation.t_ui_readstate_navbar
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

    // (func boolean-navigate<-navid)
    nx_tactics_ui_navigation.t_boolean_navigate_from_navid['vx_value'] = {
      name          : "boolean-navigate<-navid",
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
      fn            : nx_tactics_ui_navigation.f_boolean_navigate_from_navid
    }

    // (func boolean-navigate<-select)
    nx_tactics_ui_navigation.t_boolean_navigate_from_select['vx_value'] = {
      name          : "boolean-navigate<-select",
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
      fn            : nx_tactics_ui_navigation.f_boolean_navigate_from_select
    }

    // (func event-navbutton-click<-event)
    nx_tactics_ui_navigation.t_event_navbutton_click_from_event['vx_value'] = {
      name          : "event-navbutton-click<-event",
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
      fn            : nx_tactics_ui_navigation.f_event_navbutton_click_from_event
    }

    // (func ui-app)
    nx_tactics_ui_navigation.t_ui_app['vx_value'] = {
      name          : "ui-app",
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
      fn            : nx_tactics_ui_navigation.f_ui_app
    }

    // (func ui-layout<-main-selected)
    nx_tactics_ui_navigation.t_ui_layout_from_main_selected['vx_value'] = {
      name          : "ui-layout<-main-selected",
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
      fn            : nx_tactics_ui_navigation.f_ui_layout_from_main_selected
    }

    // (func ui-layout<-navbar-selected)
    nx_tactics_ui_navigation.t_ui_layout_from_navbar_selected['vx_value'] = {
      name          : "ui-layout<-navbar-selected",
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
      fn            : nx_tactics_ui_navigation.f_ui_layout_from_navbar_selected
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

    // (func ui-navbutton<-ui-selected)
    nx_tactics_ui_navigation.t_ui_navbutton_from_ui_selected['vx_value'] = {
      name          : "ui-navbutton<-ui-selected",
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
      fn            : nx_tactics_ui_navigation.f_ui_navbutton_from_ui_selected
    }

    // (func ui-readstate-main)
    nx_tactics_ui_navigation.t_ui_readstate_main['vx_value'] = {
      name          : "ui-readstate-main",
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
      fn            : nx_tactics_ui_navigation.f_ui_readstate_main
    }

    // (func ui-readstate-navbar)
    nx_tactics_ui_navigation.t_ui_readstate_navbar['vx_value'] = {
      name          : "ui-readstate-navbar",
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
      fn            : nx_tactics_ui_navigation.f_ui_readstate_navbar
    }

    // (const event-navbutton-click)
    Object.assign(nx_tactics_ui_navigation.c_event_navbutton_click, vx_core.f_copy(
      vx_event.c_event_click,
      ":event<-event",
      nx_tactics_ui_navigation.t_event_navbutton_click_from_event
    ))

    // (const eventmap-navbutton)
    Object.assign(nx_tactics_ui_navigation.c_eventmap_navbutton, vx_event.f_eventmap_from_eventlist(
      vx_core.f_new(
        vx_event.t_eventlist,
        nx_tactics_ui_navigation.c_event_navbutton_click
      )
    ))

  }
}
