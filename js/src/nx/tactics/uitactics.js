'strict mode'

import vx_core from "../../vx/core.js"
import nx_tactics_base from "../../nx/tactics/base.js"
import vx_event from "../../vx/event.js"
import vx_ui_ui from "../../vx/ui/ui.js"


export default class nx_tactics_uitactics {

  /**
   * Constant: event-app-home-card-click
   * {event}
   */
  static c_event_app_home_card_click = {vx_type: vx_event.t_event, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'event-app-home-card-click'}}

  /**
   * Constant: eventmap-app-home-card
   * Eventmap for app-home-card
   * {eventmap}
   */
  static c_eventmap_app_home_card = {vx_type: vx_event.t_eventmap, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'eventmap-app-home-card'}}

  /**
   * Constant: point-cardsize
   * {point}
   */
  static c_point_cardsize = {vx_type: vx_ui_ui.t_point, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'point-cardsize'}}

  /**
   * Constant: style-app
   * Returns the style for app ui.
   * {style}
   */
  static c_style_app = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app'}}

  /**
   * Constant: style-app-background
   * Returns the style for app ui.
   * {style}
   */
  static c_style_app_background = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-background'}}

  /**
   * Constant: style-app-home
   * Returns the style for app ui.
   * {style}
   */
  static c_style_app_home = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-home'}}

  /**
   * Constant: style-app-main
   * {style}
   */
  static c_style_app_main = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-main'}}

  /**
   * Constant: style-app-menubar
   * {style}
   */
  static c_style_app_menubar = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-menubar'}}

  /**
   * Constant: style-app-menudrawer
   * {style}
   */
  static c_style_app_menudrawer = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-menudrawer'}}

  /**
   * Constant: style-app-msgbox
   * {style}
   */
  static c_style_app_msgbox = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-msgbox'}}

  /**
   * Constant: style-app-navbar
   * {style}
   */
  static c_style_app_navbar = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-navbar'}}

  /**
   * Constant: style-app-navdrawer
   * {style}
   */
  static c_style_app_navdrawer = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-navdrawer'}}

  /**
   * Constant: style-app-parallax
   * {style}
   */
  static c_style_app_parallax = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-parallax'}}

  /**
   * Constant: style-app-statusbar
   * {style}
   */
  static c_style_app_statusbar = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-statusbar'}}

  /**
   * Constant: style-app-statusdrawer
   * {style}
   */
  static c_style_app_statusdrawer = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-app-statusdrawer'}}

  /**
   * Constant: style-body
   * Returns the style for app ui.
   * {style}
   */
  static c_style_body = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-body'}}

  /**
   * Constant: style-card
   * {style}
   */
  static c_style_card = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-card'}}

  /**
   * Constant: style-clickable
   * Returns the style for clickable class.
   * {style}
   */
  static c_style_clickable = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-clickable'}}

  /**
   * Constant: style-html
   * Returns the style for app ui.
   * {style}
   */
  static c_style_html = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'style-html'}}

  /**
   * Constant: stylesheet-app
   * {stylesheet}
   */
  static c_stylesheet_app = {vx_type: vx_ui_ui.t_stylesheet, vx_constdef: {pkgname: 'nx/tactics/uitactics', name: 'stylesheet-app'}}

  /**
   * @function event_app_home_card_click_from_event
   * Event handler for card clicks
   * @param  {event} event
   * @return {event}
   */
  static t_event_app_home_card_click_from_event = {
    vx_type: vx_core.t_type
  }
  static e_event_app_home_card_click_from_event = {
    vx_type: nx_tactics_uitactics.t_event_app_home_card_click_from_event
  }

  // (func event-app-home-card-click<-event)
  static f_event_app_home_card_click_from_event(event) {
    let output = vx_event.e_event
    output = event
    return output
  }

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
          nx_tactics_uitactics.c_style_app,
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
      "background",
      ":style",
      nx_tactics_uitactics.c_style_app_background
    )
    return output
  }

  /**
   * @function ui_app_home
   * App Home Panel
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
      ":style",
      nx_tactics_uitactics.c_style_app_home,
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        vx_core.f_new(
          vx_ui_ui.t_uilist,
          nx_tactics_uitactics.f_ui_app_home_books(),
          nx_tactics_uitactics.f_ui_app_home_skills(),
          nx_tactics_uitactics.f_ui_app_home_powers()
        )
      ),
      ":uid",
      "home"
    )
    return output
  }

  /**
   * @function ui_app_home_books
   * @return {ui}
   */
  static t_ui_app_home_books = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_home_books = {
    vx_type: nx_tactics_uitactics.t_ui_app_home_books
  }

  // (func ui-app-home-books)
  static f_ui_app_home_books() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "apphomebooks",
      ":eventmap",
      nx_tactics_uitactics.c_eventmap_app_home_card,
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_uitactics.c_style_card,
        nx_tactics_uitactics.c_style_clickable
      ),
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        vx_core.f_new(
          vx_ui_ui.t_uilist,
          vx_core.f_new(
            vx_ui_ui.t_ui,
            ":uid",
            "bookstitle",
            ":style",
            vx_core.f_new(
              vx_ui_ui.t_style,
              ":layout",
              vx_ui_ui.c_layout_label
            ),
            ":data",
            "Books"
          )
        )
      )
    )
    return output
  }

  /**
   * @function ui_app_home_powers
   * @return {ui}
   */
  static t_ui_app_home_powers = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_home_powers = {
    vx_type: nx_tactics_uitactics.t_ui_app_home_powers
  }

  // (func ui-app-home-powers)
  static f_ui_app_home_powers() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "apphomepowers",
      ":eventmap",
      nx_tactics_uitactics.c_eventmap_app_home_card,
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_uitactics.c_style_card,
        nx_tactics_uitactics.c_style_clickable
      ),
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        vx_core.f_new(
          vx_ui_ui.t_uilist,
          vx_core.f_new(
            vx_ui_ui.t_ui,
            ":uid",
            "powersstitle",
            ":style",
            vx_core.f_new(
              vx_ui_ui.t_style,
              ":layout",
              vx_ui_ui.c_layout_label
            ),
            ":data",
            "Powers"
          )
        )
      )
    )
    return output
  }

  /**
   * @function ui_app_home_skills
   * @return {ui}
   */
  static t_ui_app_home_skills = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_home_skills = {
    vx_type: nx_tactics_uitactics.t_ui_app_home_skills
  }

  // (func ui-app-home-skills)
  static f_ui_app_home_skills() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "apphomeskills",
      ":eventmap",
      nx_tactics_uitactics.c_eventmap_app_home_card,
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_uitactics.c_style_card,
        nx_tactics_uitactics.c_style_clickable
      ),
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        vx_core.f_new(
          vx_ui_ui.t_uilist,
          vx_core.f_new(
            vx_ui_ui.t_ui,
            ":uid",
            "skillsstitle",
            ":style",
            vx_core.f_new(
              vx_ui_ui.t_style,
              ":layout",
              vx_ui_ui.c_layout_label
            ),
            ":data",
            "Skills"
          )
        )
      )
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
      ":style",
      nx_tactics_uitactics.c_style_app_main,
      ":uimap",
      vx_core.f_new(
        vx_ui_ui.t_uimap,
        ":home",
        nx_tactics_uitactics.f_ui_app_home()
      )
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
      "menubar",
      ":style",
      nx_tactics_uitactics.c_style_app_menubar
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
      "menudrawer",
      ":style",
      nx_tactics_uitactics.c_style_app_menudrawer
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
      "msgbox",
      ":style",
      nx_tactics_uitactics.c_style_app_msgbox
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
      "navbar",
      ":style",
      nx_tactics_uitactics.c_style_app_navbar
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
      "navdrawer",
      ":style",
      nx_tactics_uitactics.c_style_app_navdrawer
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
      "parallax",
      ":style",
      nx_tactics_uitactics.c_style_app_parallax
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
      "statusbar",
      ":style",
      nx_tactics_uitactics.c_style_app_statusbar
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
      "statusdrawer",
      ":style",
      nx_tactics_uitactics.c_style_app_statusdrawer
    )
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
      "event-app-home-card-click": nx_tactics_uitactics.c_event_app_home_card_click,
      "eventmap-app-home-card": nx_tactics_uitactics.c_eventmap_app_home_card,
      "point-cardsize": nx_tactics_uitactics.c_point_cardsize,
      "style-app": nx_tactics_uitactics.c_style_app,
      "style-app-background": nx_tactics_uitactics.c_style_app_background,
      "style-app-home": nx_tactics_uitactics.c_style_app_home,
      "style-app-main": nx_tactics_uitactics.c_style_app_main,
      "style-app-menubar": nx_tactics_uitactics.c_style_app_menubar,
      "style-app-menudrawer": nx_tactics_uitactics.c_style_app_menudrawer,
      "style-app-msgbox": nx_tactics_uitactics.c_style_app_msgbox,
      "style-app-navbar": nx_tactics_uitactics.c_style_app_navbar,
      "style-app-navdrawer": nx_tactics_uitactics.c_style_app_navdrawer,
      "style-app-parallax": nx_tactics_uitactics.c_style_app_parallax,
      "style-app-statusbar": nx_tactics_uitactics.c_style_app_statusbar,
      "style-app-statusdrawer": nx_tactics_uitactics.c_style_app_statusdrawer,
      "style-body": nx_tactics_uitactics.c_style_body,
      "style-card": nx_tactics_uitactics.c_style_card,
      "style-clickable": nx_tactics_uitactics.c_style_clickable,
      "style-html": nx_tactics_uitactics.c_style_html,
      "stylesheet-app": nx_tactics_uitactics.c_stylesheet_app
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "event-app-home-card-click<-event": nx_tactics_uitactics.e_event_app_home_card_click_from_event,
      "ui-app": nx_tactics_uitactics.e_ui_app,
      "ui-app-background": nx_tactics_uitactics.e_ui_app_background,
      "ui-app-home": nx_tactics_uitactics.e_ui_app_home,
      "ui-app-home-books": nx_tactics_uitactics.e_ui_app_home_books,
      "ui-app-home-powers": nx_tactics_uitactics.e_ui_app_home_powers,
      "ui-app-home-skills": nx_tactics_uitactics.e_ui_app_home_skills,
      "ui-app-main": nx_tactics_uitactics.e_ui_app_main,
      "ui-app-menubar": nx_tactics_uitactics.e_ui_app_menubar,
      "ui-app-menudrawer": nx_tactics_uitactics.e_ui_app_menudrawer,
      "ui-app-msgbox": nx_tactics_uitactics.e_ui_app_msgbox,
      "ui-app-navbar": nx_tactics_uitactics.e_ui_app_navbar,
      "ui-app-navdrawer": nx_tactics_uitactics.e_ui_app_navdrawer,
      "ui-app-parallax": nx_tactics_uitactics.e_ui_app_parallax,
      "ui-app-statusbar": nx_tactics_uitactics.e_ui_app_statusbar,
      "ui-app-statusdrawer": nx_tactics_uitactics.e_ui_app_statusdrawer,
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
      "event-app-home-card-click<-event": nx_tactics_uitactics.t_event_app_home_card_click_from_event,
      "ui-app": nx_tactics_uitactics.t_ui_app,
      "ui-app-background": nx_tactics_uitactics.t_ui_app_background,
      "ui-app-home": nx_tactics_uitactics.t_ui_app_home,
      "ui-app-home-books": nx_tactics_uitactics.t_ui_app_home_books,
      "ui-app-home-powers": nx_tactics_uitactics.t_ui_app_home_powers,
      "ui-app-home-skills": nx_tactics_uitactics.t_ui_app_home_skills,
      "ui-app-main": nx_tactics_uitactics.t_ui_app_main,
      "ui-app-menubar": nx_tactics_uitactics.t_ui_app_menubar,
      "ui-app-menudrawer": nx_tactics_uitactics.t_ui_app_menudrawer,
      "ui-app-msgbox": nx_tactics_uitactics.t_ui_app_msgbox,
      "ui-app-navbar": nx_tactics_uitactics.t_ui_app_navbar,
      "ui-app-navdrawer": nx_tactics_uitactics.t_ui_app_navdrawer,
      "ui-app-parallax": nx_tactics_uitactics.t_ui_app_parallax,
      "ui-app-statusbar": nx_tactics_uitactics.t_ui_app_statusbar,
      "ui-app-statusdrawer": nx_tactics_uitactics.t_ui_app_statusdrawer,
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

    // (func event-app-home-card-click<-event)
    nx_tactics_uitactics.t_event_app_home_card_click_from_event['vx_value'] = {
      name          : "event-app-home-card-click<-event",
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
      fn            : nx_tactics_uitactics.f_event_app_home_card_click_from_event
    }

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

    // (func ui-app-home-books)
    nx_tactics_uitactics.t_ui_app_home_books['vx_value'] = {
      name          : "ui-app-home-books",
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
      fn            : nx_tactics_uitactics.f_ui_app_home_books
    }

    // (func ui-app-home-powers)
    nx_tactics_uitactics.t_ui_app_home_powers['vx_value'] = {
      name          : "ui-app-home-powers",
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
      fn            : nx_tactics_uitactics.f_ui_app_home_powers
    }

    // (func ui-app-home-skills)
    nx_tactics_uitactics.t_ui_app_home_skills['vx_value'] = {
      name          : "ui-app-home-skills",
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
      fn            : nx_tactics_uitactics.f_ui_app_home_skills
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

    // (const event-app-home-card-click)
    Object.assign(nx_tactics_uitactics.c_event_app_home_card_click, vx_core.f_copy(
      vx_event.c_event_click,
      ":event<-event",
      nx_tactics_uitactics.t_event_app_home_card_click_from_event
    ))

    // (const eventmap-app-home-card)
    Object.assign(nx_tactics_uitactics.c_eventmap_app_home_card, vx_event.f_eventmap_from_eventlist(
      vx_core.f_new(
        vx_event.t_eventlist,
        nx_tactics_uitactics.c_event_app_home_card_click
      )
    ))

    // (const point-cardsize)
    Object.assign(nx_tactics_uitactics.c_point_cardsize, vx_core.f_new(
      vx_ui_ui.t_point,
      ":x",
      64,
      ":y",
      89
    ))

    // (const style-app)
    Object.assign(nx_tactics_uitactics.c_style_app, vx_core.f_new(
      vx_ui_ui.t_style,
      ":color-background",
      "B0E0E6",
      ":layout",
      vx_ui_ui.c_layout_app,
      ":pin",
      vx_ui_ui.c_pin_expand
    ))

    // (const style-app-background)
    Object.assign(nx_tactics_uitactics.c_style_app_background, vx_core.f_new(
      vx_ui_ui.t_style,
      ":layout",
      vx_ui_ui.c_layout_background,
      ":pin",
      vx_ui_ui.c_pin_center,
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        1000,
        ":y",
        1000
      )
    ))

    // (const style-app-home)
    Object.assign(nx_tactics_uitactics.c_style_app_home, vx_core.f_new(
      vx_ui_ui.t_style,
      ":color-background",
      "F0F0F0",
      ":layout",
      vx_ui_ui.c_layout_flow_columns,
      ":pin",
      vx_ui_ui.c_pin_expand
    ))

    // (const style-app-main)
    Object.assign(nx_tactics_uitactics.c_style_app_main, vx_core.f_new(
      vx_ui_ui.t_style,
      ":layout",
      vx_ui_ui.c_layout_main,
      ":pin",
      vx_ui_ui.c_pin_center_v,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        6,
        ":y",
        6
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":y",
        6
      )
    ))

    // (const style-app-menubar)
    Object.assign(nx_tactics_uitactics.c_style_app_menubar, vx_core.f_new(
      vx_ui_ui.t_style,
      ":color-background",
      "5E9CA0",
      ":layout",
      vx_ui_ui.c_layout_menubar,
      ":pin",
      vx_ui_ui.c_pin_top,
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":y",
        6
      )
    ))

    // (const style-app-menudrawer)
    Object.assign(nx_tactics_uitactics.c_style_app_menudrawer, vx_core.f_new(
      vx_ui_ui.t_style,
      ":layout",
      vx_ui_ui.c_layout_menudrawer
    ))

    // (const style-app-msgbox)
    Object.assign(nx_tactics_uitactics.c_style_app_msgbox, vx_core.f_new(
      vx_ui_ui.t_style,
      ":layout",
      vx_ui_ui.c_layout_msgbox
    ))

    // (const style-app-navbar)
    Object.assign(nx_tactics_uitactics.c_style_app_navbar, vx_core.f_new(
      vx_ui_ui.t_style,
      ":color-background",
      "90C5A9",
      ":layout",
      vx_ui_ui.c_layout_navbar,
      ":pin",
      vx_ui_ui.c_pin_left,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":y",
        6
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        6,
        ":y",
        6
      )
    ))

    // (const style-app-navdrawer)
    Object.assign(nx_tactics_uitactics.c_style_app_navdrawer, vx_core.f_new(
      vx_ui_ui.t_style,
      ":layout",
      vx_ui_ui.c_layout_navdrawer
    ))

    // (const style-app-parallax)
    Object.assign(nx_tactics_uitactics.c_style_app_parallax, vx_core.f_new(
      vx_ui_ui.t_style,
      ":layout",
      vx_ui_ui.c_layout_parallax
    ))

    // (const style-app-statusbar)
    Object.assign(nx_tactics_uitactics.c_style_app_statusbar, vx_core.f_new(
      vx_ui_ui.t_style,
      ":color-background",
      "B6B6B6",
      ":layout",
      vx_ui_ui.c_layout_statusbar,
      ":pin",
      vx_ui_ui.c_pin_bottom,
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":y",
        6
      )
    ))

    // (const style-app-statusdrawer)
    Object.assign(nx_tactics_uitactics.c_style_app_statusdrawer, vx_core.f_new(
      vx_ui_ui.t_style,
      ":layout",
      vx_ui_ui.c_layout_statusdrawer
    ))

    // (const style-body)
    Object.assign(nx_tactics_uitactics.c_style_body, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "body",
      ":styletype",
      vx_ui_ui.c_styletype_system,
      ":boundsmargin",
      vx_core.f_new(
        vx_ui_ui.t_bounds,
        ":left",
        0,
        ":right",
        0,
        ":top",
        0,
        ":bottom",
        0
      ),
      ":boundspadding",
      vx_core.f_new(
        vx_ui_ui.t_bounds,
        ":left",
        0,
        ":right",
        0,
        ":top",
        0,
        ":bottom",
        0
      ),
      ":pin",
      vx_ui_ui.c_pin_expand
    ))

    // (const style-card)
    Object.assign(nx_tactics_uitactics.c_style_card, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card",
      ":color-background",
      "FFFFFF",
      ":layout",
      vx_ui_ui.c_layout_panel,
      ":pointsize",
      nx_tactics_uitactics.c_point_cardsize,
      ":type",
      vx_ui_ui.c_styletype_shared
    ))

    // (const style-clickable)
    Object.assign(nx_tactics_uitactics.c_style_clickable, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "clickable",
      ":styletype",
      vx_ui_ui.c_styletype_shared,
      ":cursor",
      vx_ui_ui.t_cursor_pointer,
      ":color-hoverbkgrd",
      "F0C0C0"
    ))

    // (const style-html)
    Object.assign(nx_tactics_uitactics.c_style_html, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "html",
      ":styletype",
      vx_ui_ui.c_styletype_system,
      ":boundsmargin",
      vx_core.f_new(
        vx_ui_ui.t_bounds,
        ":left",
        0,
        ":right",
        0,
        ":top",
        0,
        ":bottom",
        0
      ),
      ":boundspadding",
      vx_core.f_new(
        vx_ui_ui.t_bounds,
        ":left",
        0,
        ":right",
        0,
        ":top",
        0,
        ":bottom",
        0
      ),
      ":pin",
      vx_ui_ui.c_pin_expand
    ))

    // (const stylesheet-app)
    Object.assign(nx_tactics_uitactics.c_stylesheet_app, vx_core.f_new(
      vx_ui_ui.t_stylesheet,
      ":stylemap",
      vx_ui_ui.f_stylemap_from_stylelist(
        vx_core.f_new(
          vx_ui_ui.t_stylelist,
          nx_tactics_uitactics.c_style_html,
          nx_tactics_uitactics.c_style_body,
          nx_tactics_uitactics.c_style_clickable,
          nx_tactics_uitactics.c_style_card
        )
      )
    ))

  }
}
