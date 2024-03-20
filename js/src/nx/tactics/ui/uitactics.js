'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_decks_deck from "../../../nx/tactics/decks/deck.js"
import vx_event from "../../../vx/event.js"
import nx_tactics_ui_navigation from "../../../nx/tactics/ui/navigation.js"
import nx_tactics_ui_stylesheet from "../../../nx/tactics/ui/stylesheet.js"
import vx_type from "../../../vx/type.js"
import vx_ui_ui from "../../../vx/ui/ui.js"


export default class nx_tactics_ui_uitactics {

  /**
   * Constant: event-navbutton-back-click
   * {event}
   */
  static c_event_navbutton_back_click = {vx_type: vx_event.t_event, vx_constdef: {pkgname: 'nx/tactics/ui/uitactics', name: 'event-navbutton-back-click'}}

  /**
   * Constant: event-navigate-card-click
   * {event}
   */
  static c_event_navigate_card_click = {vx_type: vx_event.t_event, vx_constdef: {pkgname: 'nx/tactics/ui/uitactics', name: 'event-navigate-card-click'}}

  /**
   * Constant: event-printbutton-click
   * {event}
   */
  static c_event_printbutton_click = {vx_type: vx_event.t_event, vx_constdef: {pkgname: 'nx/tactics/ui/uitactics', name: 'event-printbutton-click'}}

  /**
   * Constant: eventmap-app-home-card
   * Eventmap for app-home-card
   * {eventmap}
   */
  static c_eventmap_app_home_card = {vx_type: vx_event.t_eventmap, vx_constdef: {pkgname: 'nx/tactics/ui/uitactics', name: 'eventmap-app-home-card'}}

  /**
   * Constant: eventmap-navbutton-back
   * Eventmap for navbutton-back
   * {eventmap}
   */
  static c_eventmap_navbutton_back = {vx_type: vx_event.t_eventmap, vx_constdef: {pkgname: 'nx/tactics/ui/uitactics', name: 'eventmap-navbutton-back'}}

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
    vx_type: nx_tactics_ui_uitactics.t_event_navbutton_click_from_event
  }

  // (func event-navbutton-click<-event)
  static f_event_navbutton_click_from_event(context, event) {
    let output = vx_event.e_event
    output = vx_core.f_let(
      {"any-1": vx_event.t_event},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const ischanged = nx_tactics_ui_navigation.f_boolean_navigate_back(context)
        return event
      })
    )
    return output
  }

  /**
   * @function event_navigate_card_click_from_event
   * Event handler for card clicks
   * @param  {event} event
   * @return {event}
   */
  static t_event_navigate_card_click_from_event = {
    vx_type: vx_core.t_type
  }
  static e_event_navigate_card_click_from_event = {
    vx_type: nx_tactics_ui_uitactics.t_event_navigate_card_click_from_event
  }

  // (func event-navigate-card-click<-event)
  static f_event_navigate_card_click_from_event(context, event) {
    let output = vx_event.e_event
    output = vx_core.f_let(
      {"any-1": vx_event.t_event},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const parent = "nav"
        const uifrom = vx_ui_ui.f_ui_from_from_event(context, event)
        const data = vx_core.f_any_from_struct({"any-1": vx_core.t_any, "struct-2": vx_ui_ui.t_ui}, uifrom, ":data")
        const uinav = nx_tactics_ui_uitactics.f_ui_from_any_parent(data, parent)
        const uichg = nx_tactics_ui_uitactics.f_ui_navigate_from_ui(context, uinav)
        return event
      })
    )
    return output
  }

  /**
   * @function event_printbutton_click_from_event
   * Event handler for card clicks
   * @param  {event} event
   * @return {event}
   */
  static t_event_printbutton_click_from_event = {
    vx_type: vx_core.t_type
  }
  static e_event_printbutton_click_from_event = {
    vx_type: nx_tactics_ui_uitactics.t_event_printbutton_click_from_event
  }

  // (func event-printbutton-click<-event)
  static f_event_printbutton_click_from_event(context, event) {
    let output = vx_event.e_event
    output = vx_core.f_let(
      {"any-1": vx_event.t_event},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const uimain = vx_ui_ui.f_ui_readstate_from_uid(context, "main")
        const isprint = vx_ui_ui.f_boolean_print(context, uimain)
        return event
      })
    )
    return output
  }

  /**
   * @function string_display_from_any
   * Returns display text from any
   * @param  {any} value
   * @return {string}
   */
  static t_string_display_from_any = {
    vx_type: vx_core.t_type
  }
  static e_string_display_from_any = {
    vx_type: nx_tactics_ui_uitactics.t_string_display_from_any
  }

  // (func string-display<-any)
  static f_string_display_from_any(value) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const datatype = vx_core.f_type_from_any(value)
        const display = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              datatype,
              nx_tactics_base.t_book
            )}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_string_display_from_book(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_book, "any-2": vx_core.t_any}, value)
            )})
          ),
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              datatype,
              nx_tactics_base.t_deck
            )}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_string_display_from_deck(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_deck, "any-2": vx_core.t_any}, value)
            )})
          ),
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              datatype,
              nx_tactics_base.t_skill
            )}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_string_display_from_skill(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_skill, "any-2": vx_core.t_any}, value)
            )})
          ),
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_type.f_is_type(
              datatype,
              nx_tactics_base.t_card
            )}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
              {"any-1": vx_core.t_string},
              [],
              vx_core.f_new(vx_core.t_any_from_func, () => {
                const card = vx_core.f_any_from_any({"any-1": nx_tactics_base.t_card, "any-2": vx_core.t_any}, value)
                const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":summary")
                return summary
              })
            )})
          )
        )
        return display
      })
    )
    return output
  }

  /**
   * @function string_display_from_book
   * Returns display text from a book
   * @param  {book} book
   * @return {string}
   */
  static t_string_display_from_book = {
    vx_type: vx_core.t_type
  }
  static e_string_display_from_book = {
    vx_type: nx_tactics_ui_uitactics.t_string_display_from_book
  }

  // (func string-display<-book)
  static f_string_display_from_book(book) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const chaptermap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_chaptermap, "struct-2": nx_tactics_base.t_book}, book, ":chaptermap")
        const names = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_chapter, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_chaptermap, "struct-2": nx_tactics_base.t_chapter},
          chaptermap,
          vx_core.f_new(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_chapter}, value, ":name"))
        )
        const display = vx_type.f_string_from_stringlist_join(names, ", ")
        return display
      })
    )
    return output
  }

  /**
   * @function string_display_from_deck
   * Returns display text from a deck
   * @param  {deck} deck
   * @return {string}
   */
  static t_string_display_from_deck = {
    vx_type: vx_core.t_type
  }
  static e_string_display_from_deck = {
    vx_type: nx_tactics_ui_uitactics.t_string_display_from_deck
  }

  // (func string-display<-deck)
  static f_string_display_from_deck(deck) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const cardmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_cardmap, "struct-2": nx_tactics_base.t_deck}, deck, ":cardmap")
        const names = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_card, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_cardmap, "struct-2": nx_tactics_base.t_card},
          cardmap,
          vx_core.f_new(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, value, ":name"))
        )
        const display = vx_type.f_string_from_stringlist_join(names, ", ")
        return display
      })
    )
    return output
  }

  /**
   * @function string_display_from_skill
   * Returns display text from a skill
   * @param  {skill} skill
   * @return {string}
   */
  static t_string_display_from_skill = {
    vx_type: vx_core.t_type
  }
  static e_string_display_from_skill = {
    vx_type: nx_tactics_ui_uitactics.t_string_display_from_skill
  }

  // (func string-display<-skill)
  static f_string_display_from_skill(skill) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const specialtymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_skill}, skill, ":specialtymap")
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_skill}, skill, ":abilitymap")
        const specialnames = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_specialty, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_specialty},
          specialtymap,
          vx_core.f_new(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_specialty}, value, ":name"))
        )
        const abilitynames = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_ability, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_ability},
          abilitymap,
          vx_core.f_new(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_ability}, value, ":name"))
        )
        const appended = vx_core.f_new(
          vx_core.t_stringlist,
          specialnames,
          abilitynames
        )
        const display = vx_type.f_string_from_stringlist_join(appended, ", ")
        return display
      })
    )
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app
  }

  // (func ui-app)
  static f_ui_app() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const background = nx_tactics_ui_uitactics.f_ui_app_background()
        const main = nx_tactics_ui_uitactics.f_ui_app_main()
        const menubar = nx_tactics_ui_uitactics.f_ui_app_menubar()
        const menudrawer = nx_tactics_ui_uitactics.f_ui_app_menudrawer()
        const msgbox = nx_tactics_ui_uitactics.f_ui_app_msgbox()
        const navbar = nx_tactics_ui_uitactics.f_ui_app_navbar()
        const navdrawer = nx_tactics_ui_uitactics.f_ui_app_navdrawer()
        const parallax = nx_tactics_ui_uitactics.f_ui_app_parallax()
        const statusbar = nx_tactics_ui_uitactics.f_ui_app_statusbar()
        const statusdrawer = nx_tactics_ui_uitactics.f_ui_app_statusdrawer()
        const titlebar = nx_tactics_ui_uitactics.f_ui_app_titlebar()
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
          statusdrawer,
          ":titlebar",
          titlebar
        )
        return vx_core.f_new(
          vx_ui_ui.t_ui,
          ":uid",
          "app",
          ":style",
          nx_tactics_ui_stylesheet.c_style_app,
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_background
  }

  // (func ui-app-background)
  static f_ui_app_background() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "app-background",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_background
      )
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_home
  }

  // (func ui-app-home)
  static f_ui_app_home() {
    let output = vx_ui_ui.e_ui
    output = nx_tactics_ui_uitactics.f_ui_nav_from_deck_parent(
      nx_tactics_decks_deck.f_deck_home(),
      "main"
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_main
  }

  // (func ui-app-main)
  static f_ui_app_main() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "main",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_main
      ),
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        vx_core.f_new(
          vx_ui_ui.t_uilist,
          nx_tactics_ui_uitactics.f_ui_app_home()
        )
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_menubar
  }

  // (func ui-app-menubar)
  static f_ui_app_menubar() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "menubar",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_menubar
      )
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_menudrawer
  }

  // (func ui-app-menudrawer)
  static f_ui_app_menudrawer() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "menudrawer",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_menudrawer
      )
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_msgbox
  }

  // (func ui-app-msgbox)
  static f_ui_app_msgbox() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "msgbox",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_msgbox
      )
    )
    return output
  }

  /**
   * @function ui_app_navbar
   * Returns a new side navigation bar
   * @return {ui}
   */
  static t_ui_app_navbar = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_navbar = {
    vx_type: nx_tactics_ui_uitactics.t_ui_app_navbar
  }

  // (func ui-app-navbar)
  static f_ui_app_navbar() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "navbar",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_navbar
      ),
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        vx_core.f_new(
          vx_ui_ui.t_uilist,
          nx_tactics_ui_uitactics.f_ui_navbutton_back(),
          nx_tactics_ui_navigation.f_ui_navbutton_from_ui_parent_selected(
            vx_core.f_new(
              vx_ui_ui.t_ui,
              ":name",
              "Home"
            ),
            "navbar",
            true
          )
        )
      )
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_navdrawer
  }

  // (func ui-app-navdrawer)
  static f_ui_app_navdrawer() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "navdrawer",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_navdrawer
      )
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_parallax
  }

  // (func ui-app-parallax)
  static f_ui_app_parallax() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "parallax",
      ":style",
      nx_tactics_ui_stylesheet.c_style_app_parallax
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_statusbar
  }

  // (func ui-app-statusbar)
  static f_ui_app_statusbar() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "statusbar",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_statusbar
      )
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_statusdrawer
  }

  // (func ui-app-statusdrawer)
  static f_ui_app_statusdrawer() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "statusdrawer",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_statusdrawer
      )
    )
    return output
  }

  /**
   * @function ui_app_titlebar
   * @return {ui}
   */
  static t_ui_app_titlebar = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_titlebar = {
    vx_type: nx_tactics_ui_uitactics.t_ui_app_titlebar
  }

  // (func ui-app-titlebar)
  static f_ui_app_titlebar() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "titlebar",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_titlebar
      ),
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        vx_core.f_new(
          vx_ui_ui.t_uilist,
          nx_tactics_ui_uitactics.f_ui_app_titlebar_print()
        )
      )
    )
    return output
  }

  /**
   * @function ui_app_titlebar_print
   * @return {ui}
   */
  static t_ui_app_titlebar_print = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_titlebar_print = {
    vx_type: nx_tactics_ui_uitactics.t_ui_app_titlebar_print
  }

  // (func ui-app-titlebar-print)
  static f_ui_app_titlebar_print() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      vx_ui_ui.t_ui,
      ":uid",
      "titlebar-print",
      ":parent",
      "titlebar",
      ":stylelist",
      vx_core.f_new(
        vx_ui_ui.t_stylelist,
        nx_tactics_ui_stylesheet.c_style_app_titlebar_print,
        nx_tactics_ui_stylesheet.c_style_clickable
      ),
      ":eventmap",
      vx_event.f_eventmap_from_eventlist(
        vx_core.f_new(
          vx_event.t_eventlist,
          nx_tactics_ui_uitactics.c_event_printbutton_click
        )
      )
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
    vx_type: nx_tactics_ui_uitactics.t_ui_app_from_tactics
  }

  // (func ui-app<-tactics)
  static f_ui_app_from_tactics(tactics) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const appui = nx_tactics_ui_uitactics.f_ui_app()
        return vx_core.f_copy(appui, ":data", tactics)
      })
    )
    return output
  }

  /**
   * @function ui_nav_from_any_parent
   * Returns a ui created from any value
   * @param  {any} data
   * @param  {string} parent
   * @return {ui}
   */
  static t_ui_nav_from_any_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_nav_from_any_parent = {
    vx_type: nx_tactics_ui_uitactics.t_ui_nav_from_any_parent
  }

  // (func ui-nav<-any-parent)
  static f_ui_nav_from_any_parent(data, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_ui},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_is_empty_1(data)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_empty(
          vx_ui_ui.t_ui
        )})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_ui},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const datatype = vx_core.f_type_from_any(data)
            return vx_core.f_if_2(
              {"any-1": vx_ui_ui.t_ui},
              vx_core.f_then(
                vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
                  datatype,
                  nx_tactics_base.t_deck
                )}),
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_nav_from_deck_parent(
                  vx_core.f_any_from_any({"any-1": nx_tactics_base.t_deck, "any-2": vx_core.t_any}, data),
                  parent
                )})
              ),
              vx_core.f_then(
                vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
                  datatype,
                  nx_tactics_base.t_skill
                )}),
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_nav_from_skill_parent(
                  vx_core.f_any_from_any({"any-1": nx_tactics_base.t_skill, "any-2": vx_core.t_any}, data),
                  parent
                )})
              )
            )
          })
        )})
      )
    )
    return output
  }

  /**
   * @function ui_nav_from_deck_parent
   * Returns the a deck ui.
   * @param  {deck} deck
   * @param  {string} parent
   * @return {ui}
   */
  static t_ui_nav_from_deck_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_nav_from_deck_parent = {
    vx_type: nx_tactics_ui_uitactics.t_ui_nav_from_deck_parent
  }

  // (func ui-nav<-deck-parent)
  static f_ui_nav_from_deck_parent(deck, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_deck}, deck, ":name")
        const uid = vx_core.f_new(
          vx_core.t_string,
          parent,
          "-",
          name
        )
        const cardmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_cardmap, "struct-2": nx_tactics_base.t_deck}, deck, ":cardmap")
        const uimap = nx_tactics_ui_uitactics.f_uimap_from_cardmap_parent(cardmap, uid)
        return vx_core.f_new(
          vx_ui_ui.t_ui,
          ":uid",
          uid,
          ":parent",
          parent,
          ":stylelist",
          vx_core.f_new(
            vx_ui_ui.t_stylelist,
            nx_tactics_ui_stylesheet.c_style_deck
          ),
          ":data",
          deck,
          ":uimap",
          uimap
        )
      })
    )
    return output
  }

  /**
   * @function ui_nav_from_skill_parent
   * Returns the a deck ui.
   * @param  {skill} skill
   * @param  {string} parent
   * @return {ui}
   */
  static t_ui_nav_from_skill_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_nav_from_skill_parent = {
    vx_type: nx_tactics_ui_uitactics.t_ui_nav_from_skill_parent
  }

  // (func ui-nav<-skill-parent)
  static f_ui_nav_from_skill_parent(skill, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_skill}, skill, ":name")
        const uid = vx_core.f_new(
          vx_core.t_string,
          parent,
          "-",
          name
        )
        const specialtymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_skill}, skill, ":specialtymap")
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_skill}, skill, ":abilitymap")
        const cardmap1 = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_specialty, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_specialtymap}, specialtymap)
        const cardmap2 = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_ability, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_abilitymap}, abilitymap)
        const cardmap3 = vx_core.f_copy(cardmap1, cardmap2)
        const uimap = nx_tactics_ui_uitactics.f_uimap_from_cardmap_parent(cardmap3, uid)
        return vx_core.f_new(
          vx_ui_ui.t_ui,
          ":uid",
          uid,
          ":parent",
          parent,
          ":stylelist",
          vx_core.f_new(
            vx_ui_ui.t_stylelist,
            nx_tactics_ui_stylesheet.c_style_deck
          ),
          ":data",
          skill,
          ":uimap",
          uimap
        )
      })
    )
    return output
  }

  /**
   * @function ui_navbutton_back
   * Returns the navigation back button
   * @return {ui}
   */
  static t_ui_navbutton_back = {
    vx_type: vx_core.t_type
  }
  static e_ui_navbutton_back = {
    vx_type: nx_tactics_ui_uitactics.t_ui_navbutton_back
  }

  // (func ui-navbutton-back)
  static f_ui_navbutton_back() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const navbutton = nx_tactics_ui_navigation.f_ui_navbutton()
        const name = "Back"
        const uid1 = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, navbutton, ":uid")
        const uid2 = vx_core.f_new(
          vx_core.t_string,
          uid1,
          name
        )
        const styles1 = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_stylelist, "struct-2": vx_ui_ui.t_ui}, navbutton, ":stylelist")
        const styles2 = vx_core.f_copy(
          styles1,
          nx_tactics_ui_stylesheet.c_style_button_back
        )
        return vx_core.f_copy(
          navbutton,
          ":uid",
          uid2,
          ":name",
          name,
          ":stylelist",
          styles2,
          ":eventmap",
          nx_tactics_ui_uitactics.c_eventmap_navbutton_back
        )
      })
    )
    return output
  }

  /**
   * @function ui_navigate_from_ui
   * Navigate to the given ui
   * @param  {ui} uiarg
   * @return {ui}
   */
  static t_ui_navigate_from_ui = {
    vx_type: vx_core.t_type
  }
  static e_ui_navigate_from_ui = {
    vx_type: nx_tactics_ui_uitactics.t_ui_navigate_from_ui
  }

  // (func ui-navigate<-ui)
  static f_ui_navigate_from_ui(context, uiarg) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_ui},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty_1(uiarg)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_ui},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const navbar = nx_tactics_ui_navigation.f_ui_navbar(context)
            const main = nx_tactics_ui_navigation.f_ui_main(context)
            const ui1 = nx_tactics_ui_uitactics.f_ui_navigate_from_ui_navbar(context, uiarg, navbar)
            const ui2 = nx_tactics_ui_uitactics.f_ui_navigate_from_ui_main(context, uiarg, main)
            return uiarg
          })
        )})
      ),
      vx_core.f_else(vx_core.f_new(vx_core.t_any_from_func, () => {return uiarg}))
    )
    return output
  }

  /**
   * @function ui_navigate_from_ui_main
   * Navigate to the given ui
   * @param  {ui} ui
   * @param  {ui} main
   * @return {ui}
   */
  static t_ui_navigate_from_ui_main = {
    vx_type: vx_core.t_type
  }
  static e_ui_navigate_from_ui_main = {
    vx_type: nx_tactics_ui_uitactics.t_ui_navigate_from_ui_main
  }

  // (func ui-navigate<-ui-main)
  static f_ui_navigate_from_ui_main(context, ui, main) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const uid = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, ui, ":uid")
        const data = vx_core.f_any_from_struct({"any-1": vx_core.t_any, "struct-2": vx_ui_ui.t_ui}, ui, ":data")
        const mainid = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, main, ":uid")
        const mainmap1 = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_uimap, "struct-2": vx_ui_ui.t_ui}, main, ":uimap")
        const mainmap2 = vx_core.f_map_from_map_1(
          {"any-1": vx_ui_ui.t_ui, "any-2": vx_ui_ui.t_ui, "map-1": vx_ui_ui.t_uimap, "map-2": vx_ui_ui.t_uimap},
          mainmap1,
          vx_core.f_new(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_if_2(
              {"any-1": vx_ui_ui.t_ui},
              vx_core.f_then(
                vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eq(
                  true,
                  vx_core.f_any_from_struct({"any-1": vx_core.t_boolean, "struct-2": vx_ui_ui.t_ui}, value, ":hidden")
                )}),
                vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_empty(
                  vx_ui_ui.t_ui
                )})
              ),
              vx_core.f_else(
                vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
                  value,
                  ":hidden",
                  true
                )})
              )
            ))
        )
        const mainb1 = nx_tactics_ui_uitactics.f_ui_nav_from_any_parent(data, mainid)
        const mainb2 = vx_ui_ui.f_ui_layout_from_ui(context, mainb1)
        const mainmap3 = vx_core.f_copy(mainmap2, uid, mainb2)
        const main2 = vx_ui_ui.f_ui_writechildmap_from_ui_childmap(main, mainmap3)
        const main3 = vx_ui_ui.f_ui_render(main2)
        return main3
      })
    )
    return output
  }

  /**
   * @function ui_navigate_from_ui_navbar
   * Navigate to the given ui
   * @param  {ui} ui
   * @param  {ui} navbar
   * @return {ui}
   */
  static t_ui_navigate_from_ui_navbar = {
    vx_type: vx_core.t_type
  }
  static e_ui_navigate_from_ui_navbar = {
    vx_type: nx_tactics_ui_uitactics.t_ui_navigate_from_ui_navbar
  }

  // (func ui-navigate<-ui-navbar)
  static f_ui_navigate_from_ui_navbar(context, ui, navbar) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const uid = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, ui, ":uid")
        const navbarid = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, navbar, ":uid")
        const buttona1 = vx_ui_ui.f_ui_selected_from_ui(navbar)
        const buttona2 = vx_core.f_copy(
          buttona1,
          ":selected",
          false
        )
        const uidbtnb = vx_core.f_new(
          vx_core.t_string,
          "navbutton-",
          uid
        )
        const buttonb1 = vx_ui_ui.f_ui_child_from_ui_uid(navbar, uidbtnb)
        const buttonb2 = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty_1(buttonb1)}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              buttonb1,
              ":selected",
              true
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_navigation.f_ui_navbutton_from_ui_parent_selected(
              ui,
              navbarid,
              true
            )})
          )
        )
        const navbar2 = vx_ui_ui.f_ui_writechild_from_ui_child(navbar, buttona2)
        const navbar3 = vx_ui_ui.f_ui_writechild_from_ui_child(navbar2, buttonb2)
        const navbar4 = vx_ui_ui.f_ui_layout_from_ui(context, navbar3)
        const navbar5 = vx_ui_ui.f_ui_render(navbar4)
        return navbar5
      })
    )
    return output
  }

  /**
   * @function ui_from_any_parent
   * Returns a ui created from any value
   * @param  {any} data
   * @param  {string} parent
   * @return {ui}
   */
  static t_ui_from_any_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_any_parent = {
    vx_type: nx_tactics_ui_uitactics.t_ui_from_any_parent
  }

  // (func ui<-any-parent)
  static f_ui_from_any_parent(data, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const datatype = vx_core.f_type_from_any(data)
        return vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              datatype,
              nx_tactics_base.t_unit
            )}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_from_unit_parent(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_unit, "any-2": vx_core.t_any}, data),
              parent
            )})
          ),
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_type.f_is_type(
              datatype,
              nx_tactics_base.t_fate
            )}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_from_fate_parent(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_fate, "any-2": vx_core.t_any}, data),
              parent
            )})
          ),
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_type.f_is_type(
              datatype,
              nx_tactics_base.t_card
            )}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_from_card_parent(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_card, "any-2": vx_core.t_any}, data),
              parent
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function ui_from_card_parent
   * Returns the a card ui.
   * @param  {card} card
   * @param  {string} parent
   * @return {ui}
   */
  static t_ui_from_card_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_card_parent = {
    vx_type: nx_tactics_ui_uitactics.t_ui_from_card_parent
  }

  // (func ui<-card-parent)
  static f_ui_from_card_parent(card, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":name")
        const uid = vx_core.f_new(
          vx_core.t_string,
          parent,
          "-",
          name
        )
        const display = nx_tactics_ui_uitactics.f_string_display_from_any(card)
        const labeltitle = vx_core.f_new(
          vx_core.t_string,
          uid,
          "-title"
        )
        const labeldisplay = vx_core.f_new(
          vx_core.t_string,
          uid,
          "-display"
        )
        const events = vx_core.f_if_2(
          {"any-1": vx_event.t_eventmap},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eq(display, "")}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_empty(
              vx_event.t_eventmap
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.c_eventmap_app_home_card})
          )
        )
        const styles = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_stylelist},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eq(display, "")}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_new(
              vx_ui_ui.t_stylelist,
              nx_tactics_ui_stylesheet.c_style_card
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_new(
              vx_ui_ui.t_stylelist,
              nx_tactics_ui_stylesheet.c_style_card,
              nx_tactics_ui_stylesheet.c_style_clickable
            )})
          )
        )
        const ranksuit = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_ranksuit, "struct-2": nx_tactics_base.t_card}, card, ":ranksuit")
        const uilistrs = nx_tactics_ui_uitactics.f_uilist_from_ranksuit_parent(ranksuit, uid)
        return vx_core.f_new(
          vx_ui_ui.t_ui,
          ":uid",
          uid,
          ":name",
          name,
          ":eventmap",
          events,
          ":stylelist",
          styles,
          ":data",
          card,
          ":uimap",
          vx_ui_ui.f_uimap_from_uilist(
            vx_core.f_new(
              vx_ui_ui.t_uilist,
              uilistrs,
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labeltitle,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_title,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  nx_tactics_ui_stylesheet.c_style_text_header1
                ),
                ":data",
                name
              ),
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labeldisplay,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_display,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  nx_tactics_ui_stylesheet.c_style_text_area
                ),
                ":data",
                display
              )
            )
          )
        )
      })
    )
    return output
  }

  /**
   * @function ui_from_fate_parent
   * Returns the a card ui.
   * @param  {fate} fate
   * @param  {string} parent
   * @return {ui}
   */
  static t_ui_from_fate_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_fate_parent = {
    vx_type: nx_tactics_ui_uitactics.t_ui_from_fate_parent
  }

  // (func ui<-fate-parent)
  static f_ui_from_fate_parent(fate, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_fate}, fate, ":name")
        const rank = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_rank, "struct-2": nx_tactics_base.t_fate}, fate, ":rank")
        const suit = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_suit, "struct-2": nx_tactics_base.t_fate}, fate, ":suit")
        const srank = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_rank}, rank, ":titles")
        const uid = vx_core.f_new(
          vx_core.t_string,
          parent,
          "-",
          name
        )
        const display = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_fate}, fate, ":summary")
        const labeldisplay = vx_core.f_new(
          vx_core.t_string,
          uid,
          "-display"
        )
        const labelrank1 = vx_core.f_new(
          vx_core.t_string,
          uid,
          "-rank1"
        )
        const labelrank2 = vx_core.f_new(
          vx_core.t_string,
          uid,
          "-rank2"
        )
        const labelsuit1 = vx_core.f_new(
          vx_core.t_string,
          uid,
          "-suit1"
        )
        const labelsuit2 = vx_core.f_new(
          vx_core.t_string,
          uid,
          "-suit2"
        )
        const labeltitle = vx_core.f_new(
          vx_core.t_string,
          uid,
          "-title"
        )
        const suitstyle1 = vx_core.f_switch(
          {"any-1": vx_ui_ui.t_style, "any-2": nx_tactics_base.t_suit},
          suit,
          vx_core.f_case_1(
            nx_tactics_base.c_suit_black,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_jester_black1})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_red,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_jester_red1})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_diamond,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_coin1})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_heart,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_cup1})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_spade,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_sword1})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_club,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_wand1})
          )
        )
        const suitstyle2 = vx_core.f_switch(
          {"any-1": vx_ui_ui.t_style, "any-2": nx_tactics_base.t_suit},
          suit,
          vx_core.f_case_1(
            nx_tactics_base.c_suit_black,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_jester_black2})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_red,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_jester_red2})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_diamond,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_coin2})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_heart,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_cup2})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_spade,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_sword2})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_club,
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_wand2})
          )
        )
        const styles = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_stylelist},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eq(display, "")}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_new(
              vx_ui_ui.t_stylelist,
              nx_tactics_ui_stylesheet.c_style_card
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_new(
              vx_ui_ui.t_stylelist,
              nx_tactics_ui_stylesheet.c_style_card,
              nx_tactics_ui_stylesheet.c_style_clickable
            )})
          )
        )
        return vx_core.f_new(
          vx_ui_ui.t_ui,
          ":uid",
          uid,
          ":name",
          name,
          ":stylelist",
          styles,
          ":data",
          nx_tactics_base.t_card,
          ":uimap",
          vx_ui_ui.f_uimap_from_uilist(
            vx_core.f_new(
              vx_ui_ui.t_uilist,
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labelrank1,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_rank,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  nx_tactics_ui_stylesheet.c_style_text_rank1
                ),
                ":data",
                srank
              ),
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labelrank2,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_rank,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  nx_tactics_ui_stylesheet.c_style_text_rank2
                ),
                ":data",
                srank
              ),
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labelsuit1,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_suit,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  suitstyle1
                ),
                ":data",
                srank
              ),
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labelsuit2,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_suit,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  suitstyle2
                ),
                ":data",
                srank
              ),
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labeltitle,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_title,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  nx_tactics_ui_stylesheet.c_style_text_header1
                ),
                ":data",
                name
              ),
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labeldisplay,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_display,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  nx_tactics_ui_stylesheet.c_style_text_area
                ),
                ":data",
                display
              )
            )
          )
        )
      })
    )
    return output
  }

  /**
   * @function ui_from_unit_background
   * @return {ui}
   */
  static t_ui_from_unit_background = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_unit_background = {
    vx_type: nx_tactics_ui_uitactics.t_ui_from_unit_background
  }

  // (func ui<-unit-background)
  static f_ui_from_unit_background() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_from_unit_flavor
   * @return {ui}
   */
  static t_ui_from_unit_flavor = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_unit_flavor = {
    vx_type: nx_tactics_ui_uitactics.t_ui_from_unit_flavor
  }

  // (func ui<-unit-flavor)
  static f_ui_from_unit_flavor() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_from_unit_header
   * @return {ui}
   */
  static t_ui_from_unit_header = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_unit_header = {
    vx_type: nx_tactics_ui_uitactics.t_ui_from_unit_header
  }

  // (func ui<-unit-header)
  static f_ui_from_unit_header() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_from_unit_parent
   * Returns the template for a unit ui.
   * @param  {unit} unit
   * @param  {string} parent
   * @return {ui}
   */
  static t_ui_from_unit_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_unit_parent = {
    vx_type: nx_tactics_ui_uitactics.t_ui_from_unit_parent
  }

  // (func ui<-unit-parent)
  static f_ui_from_unit_parent(unit, parent) {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_from_unit_skillpower
   * @return {ui}
   */
  static t_ui_from_unit_skillpower = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_unit_skillpower = {
    vx_type: nx_tactics_ui_uitactics.t_ui_from_unit_skillpower
  }

  // (func ui<-unit-skillpower)
  static f_ui_from_unit_skillpower() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function ui_from_unit_stat
   * @return {ui}
   */
  static t_ui_from_unit_stat = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_unit_stat = {
    vx_type: nx_tactics_ui_uitactics.t_ui_from_unit_stat
  }

  // (func ui<-unit-stat)
  static f_ui_from_unit_stat() {
    let output = vx_ui_ui.e_ui
    return output
  }

  /**
   * @function uilist_from_ranksuit_parent
   * @param  {ranksuit} ranksuitarg
   * @param  {string} parent
   * @return {uilist}
   */
  static t_uilist_from_ranksuit_parent = {
    vx_type: vx_core.t_type
  }
  static e_uilist_from_ranksuit_parent = {
    vx_type: nx_tactics_ui_uitactics.t_uilist_from_ranksuit_parent
  }

  // (func uilist<-ranksuit-parent)
  static f_uilist_from_ranksuit_parent(ranksuitarg, parent) {
    let output = vx_ui_ui.e_uilist
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_uilist},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_is_empty_1(ranksuitarg)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_empty(
          nx_tactics_base.t_ranksuit
        )})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_uilist},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const rank = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_rank, "struct-2": nx_tactics_base.t_ranksuit}, ranksuitarg, ":rank")
            const suit = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_suit, "struct-2": nx_tactics_base.t_ranksuit}, ranksuitarg, ":suit")
            const labelrank1 = vx_core.f_new(
              vx_core.t_string,
              parent,
              "-rank1"
            )
            const labelrank2 = vx_core.f_new(
              vx_core.t_string,
              parent,
              "-rank2"
            )
            const labelsuit1 = vx_core.f_new(
              vx_core.t_string,
              parent,
              "-suit1"
            )
            const labelsuit2 = vx_core.f_new(
              vx_core.t_string,
              parent,
              "-suit2"
            )
            const srank = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_rank}, rank, ":titles")
            const ssuit = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_suit}, suit, ":titles")
            const suitstyle1 = vx_core.f_switch(
              {"any-1": vx_ui_ui.t_style, "any-2": nx_tactics_base.t_suit},
              suit,
              vx_core.f_case_1(
                nx_tactics_base.c_suit_black,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_jester_black1})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_red,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_jester_red1})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_diamond,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_coin1})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_heart,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_cup1})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_spade,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_sword1})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_club,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_wand1})
              )
            )
            const suitstyle2 = vx_core.f_switch(
              {"any-1": vx_ui_ui.t_style, "any-2": nx_tactics_base.t_suit},
              suit,
              vx_core.f_case_1(
                nx_tactics_base.c_suit_black,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_jester_black2})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_red,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_jester_red2})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_diamond,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_coin2})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_heart,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_cup2})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_spade,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_sword2})
              ),
              vx_core.f_case_1(
                nx_tactics_base.c_suit_club,
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_image_wand2})
              )
            )
            return vx_core.f_new(
              vx_ui_ui.t_uilist,
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labelrank1,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_rank,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  nx_tactics_ui_stylesheet.c_style_text_rank1
                ),
                ":data",
                srank
              ),
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labelrank2,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_rank,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  nx_tactics_ui_stylesheet.c_style_text_rank2
                ),
                ":data",
                srank
              ),
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labelsuit1,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_suit,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  suitstyle1
                ),
                ":data",
                ssuit
              ),
              vx_core.f_new(
                vx_ui_ui.t_ui,
                ":uid",
                labelsuit2,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_suit,
                ":stylelist",
                vx_core.f_new(
                  vx_ui_ui.t_stylelist,
                  suitstyle2
                ),
                ":data",
                ssuit
              )
            )
          })
        )})
      )
    )
    return output
  }

  /**
   * @function uimap_from_cardmap_parent
   * @param  {cardmap} cardmap
   * @param  {string} parent
   * @return {uimap}
   */
  static t_uimap_from_cardmap_parent = {
    vx_type: vx_core.t_type
  }
  static e_uimap_from_cardmap_parent = {
    vx_type: nx_tactics_ui_uitactics.t_uimap_from_cardmap_parent
  }

  // (func uimap<-cardmap-parent)
  static f_uimap_from_cardmap_parent(cardmap, parent) {
    let output = vx_ui_ui.e_uimap
    output = vx_core.f_map_from_map_1(
      {"any-1": vx_ui_ui.t_ui, "any-2": nx_tactics_base.t_card, "map-1": vx_ui_ui.t_uimap, "map-2": nx_tactics_base.t_cardmap},
      cardmap,
      vx_core.f_new(vx_core.t_any_from_key_value, ([key, card]) => 
        nx_tactics_ui_uitactics.f_ui_from_any_parent(card, parent))
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "event-navbutton-back-click": nx_tactics_ui_uitactics.c_event_navbutton_back_click,
      "event-navigate-card-click": nx_tactics_ui_uitactics.c_event_navigate_card_click,
      "event-printbutton-click": nx_tactics_ui_uitactics.c_event_printbutton_click,
      "eventmap-app-home-card": nx_tactics_ui_uitactics.c_eventmap_app_home_card,
      "eventmap-navbutton-back": nx_tactics_ui_uitactics.c_eventmap_navbutton_back
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "event-navbutton-click<-event": nx_tactics_ui_uitactics.e_event_navbutton_click_from_event,
      "event-navigate-card-click<-event": nx_tactics_ui_uitactics.e_event_navigate_card_click_from_event,
      "event-printbutton-click<-event": nx_tactics_ui_uitactics.e_event_printbutton_click_from_event,
      "string-display<-any": nx_tactics_ui_uitactics.e_string_display_from_any,
      "string-display<-book": nx_tactics_ui_uitactics.e_string_display_from_book,
      "string-display<-deck": nx_tactics_ui_uitactics.e_string_display_from_deck,
      "string-display<-skill": nx_tactics_ui_uitactics.e_string_display_from_skill,
      "ui-app": nx_tactics_ui_uitactics.e_ui_app,
      "ui-app-background": nx_tactics_ui_uitactics.e_ui_app_background,
      "ui-app-home": nx_tactics_ui_uitactics.e_ui_app_home,
      "ui-app-main": nx_tactics_ui_uitactics.e_ui_app_main,
      "ui-app-menubar": nx_tactics_ui_uitactics.e_ui_app_menubar,
      "ui-app-menudrawer": nx_tactics_ui_uitactics.e_ui_app_menudrawer,
      "ui-app-msgbox": nx_tactics_ui_uitactics.e_ui_app_msgbox,
      "ui-app-navbar": nx_tactics_ui_uitactics.e_ui_app_navbar,
      "ui-app-navdrawer": nx_tactics_ui_uitactics.e_ui_app_navdrawer,
      "ui-app-parallax": nx_tactics_ui_uitactics.e_ui_app_parallax,
      "ui-app-statusbar": nx_tactics_ui_uitactics.e_ui_app_statusbar,
      "ui-app-statusdrawer": nx_tactics_ui_uitactics.e_ui_app_statusdrawer,
      "ui-app-titlebar": nx_tactics_ui_uitactics.e_ui_app_titlebar,
      "ui-app-titlebar-print": nx_tactics_ui_uitactics.e_ui_app_titlebar_print,
      "ui-app<-tactics": nx_tactics_ui_uitactics.e_ui_app_from_tactics,
      "ui-nav<-any-parent": nx_tactics_ui_uitactics.e_ui_nav_from_any_parent,
      "ui-nav<-deck-parent": nx_tactics_ui_uitactics.e_ui_nav_from_deck_parent,
      "ui-nav<-skill-parent": nx_tactics_ui_uitactics.e_ui_nav_from_skill_parent,
      "ui-navbutton-back": nx_tactics_ui_uitactics.e_ui_navbutton_back,
      "ui-navigate<-ui": nx_tactics_ui_uitactics.e_ui_navigate_from_ui,
      "ui-navigate<-ui-main": nx_tactics_ui_uitactics.e_ui_navigate_from_ui_main,
      "ui-navigate<-ui-navbar": nx_tactics_ui_uitactics.e_ui_navigate_from_ui_navbar,
      "ui<-any-parent": nx_tactics_ui_uitactics.e_ui_from_any_parent,
      "ui<-card-parent": nx_tactics_ui_uitactics.e_ui_from_card_parent,
      "ui<-fate-parent": nx_tactics_ui_uitactics.e_ui_from_fate_parent,
      "ui<-unit-background": nx_tactics_ui_uitactics.e_ui_from_unit_background,
      "ui<-unit-flavor": nx_tactics_ui_uitactics.e_ui_from_unit_flavor,
      "ui<-unit-header": nx_tactics_ui_uitactics.e_ui_from_unit_header,
      "ui<-unit-parent": nx_tactics_ui_uitactics.e_ui_from_unit_parent,
      "ui<-unit-skillpower": nx_tactics_ui_uitactics.e_ui_from_unit_skillpower,
      "ui<-unit-stat": nx_tactics_ui_uitactics.e_ui_from_unit_stat,
      "uilist<-ranksuit-parent": nx_tactics_ui_uitactics.e_uilist_from_ranksuit_parent,
      "uimap<-cardmap-parent": nx_tactics_ui_uitactics.e_uimap_from_cardmap_parent
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "event-navbutton-click<-event": nx_tactics_ui_uitactics.t_event_navbutton_click_from_event,
      "event-navigate-card-click<-event": nx_tactics_ui_uitactics.t_event_navigate_card_click_from_event,
      "event-printbutton-click<-event": nx_tactics_ui_uitactics.t_event_printbutton_click_from_event,
      "string-display<-any": nx_tactics_ui_uitactics.t_string_display_from_any,
      "string-display<-book": nx_tactics_ui_uitactics.t_string_display_from_book,
      "string-display<-deck": nx_tactics_ui_uitactics.t_string_display_from_deck,
      "string-display<-skill": nx_tactics_ui_uitactics.t_string_display_from_skill,
      "ui-app": nx_tactics_ui_uitactics.t_ui_app,
      "ui-app-background": nx_tactics_ui_uitactics.t_ui_app_background,
      "ui-app-home": nx_tactics_ui_uitactics.t_ui_app_home,
      "ui-app-main": nx_tactics_ui_uitactics.t_ui_app_main,
      "ui-app-menubar": nx_tactics_ui_uitactics.t_ui_app_menubar,
      "ui-app-menudrawer": nx_tactics_ui_uitactics.t_ui_app_menudrawer,
      "ui-app-msgbox": nx_tactics_ui_uitactics.t_ui_app_msgbox,
      "ui-app-navbar": nx_tactics_ui_uitactics.t_ui_app_navbar,
      "ui-app-navdrawer": nx_tactics_ui_uitactics.t_ui_app_navdrawer,
      "ui-app-parallax": nx_tactics_ui_uitactics.t_ui_app_parallax,
      "ui-app-statusbar": nx_tactics_ui_uitactics.t_ui_app_statusbar,
      "ui-app-statusdrawer": nx_tactics_ui_uitactics.t_ui_app_statusdrawer,
      "ui-app-titlebar": nx_tactics_ui_uitactics.t_ui_app_titlebar,
      "ui-app-titlebar-print": nx_tactics_ui_uitactics.t_ui_app_titlebar_print,
      "ui-app<-tactics": nx_tactics_ui_uitactics.t_ui_app_from_tactics,
      "ui-nav<-any-parent": nx_tactics_ui_uitactics.t_ui_nav_from_any_parent,
      "ui-nav<-deck-parent": nx_tactics_ui_uitactics.t_ui_nav_from_deck_parent,
      "ui-nav<-skill-parent": nx_tactics_ui_uitactics.t_ui_nav_from_skill_parent,
      "ui-navbutton-back": nx_tactics_ui_uitactics.t_ui_navbutton_back,
      "ui-navigate<-ui": nx_tactics_ui_uitactics.t_ui_navigate_from_ui,
      "ui-navigate<-ui-main": nx_tactics_ui_uitactics.t_ui_navigate_from_ui_main,
      "ui-navigate<-ui-navbar": nx_tactics_ui_uitactics.t_ui_navigate_from_ui_navbar,
      "ui<-any-parent": nx_tactics_ui_uitactics.t_ui_from_any_parent,
      "ui<-card-parent": nx_tactics_ui_uitactics.t_ui_from_card_parent,
      "ui<-fate-parent": nx_tactics_ui_uitactics.t_ui_from_fate_parent,
      "ui<-unit-background": nx_tactics_ui_uitactics.t_ui_from_unit_background,
      "ui<-unit-flavor": nx_tactics_ui_uitactics.t_ui_from_unit_flavor,
      "ui<-unit-header": nx_tactics_ui_uitactics.t_ui_from_unit_header,
      "ui<-unit-parent": nx_tactics_ui_uitactics.t_ui_from_unit_parent,
      "ui<-unit-skillpower": nx_tactics_ui_uitactics.t_ui_from_unit_skillpower,
      "ui<-unit-stat": nx_tactics_ui_uitactics.t_ui_from_unit_stat,
      "uilist<-ranksuit-parent": nx_tactics_ui_uitactics.t_uilist_from_ranksuit_parent,
      "uimap<-cardmap-parent": nx_tactics_ui_uitactics.t_uimap_from_cardmap_parent
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/ui/uitactics",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func event-navbutton-click<-event)
    nx_tactics_ui_uitactics.t_event_navbutton_click_from_event['vx_value'] = {
      name          : "event-navbutton-click<-event",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_event_navbutton_click_from_event
    }

    // (func event-navigate-card-click<-event)
    nx_tactics_ui_uitactics.t_event_navigate_card_click_from_event['vx_value'] = {
      name          : "event-navigate-card-click<-event",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_event_navigate_card_click_from_event
    }

    // (func event-printbutton-click<-event)
    nx_tactics_ui_uitactics.t_event_printbutton_click_from_event['vx_value'] = {
      name          : "event-printbutton-click<-event",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_event_printbutton_click_from_event
    }

    // (func string-display<-any)
    nx_tactics_ui_uitactics.t_string_display_from_any['vx_value'] = {
      name          : "string-display<-any",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_display_from_any
    }

    // (func string-display<-book)
    nx_tactics_ui_uitactics.t_string_display_from_book['vx_value'] = {
      name          : "string-display<-book",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_display_from_book
    }

    // (func string-display<-deck)
    nx_tactics_ui_uitactics.t_string_display_from_deck['vx_value'] = {
      name          : "string-display<-deck",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_display_from_deck
    }

    // (func string-display<-skill)
    nx_tactics_ui_uitactics.t_string_display_from_skill['vx_value'] = {
      name          : "string-display<-skill",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_display_from_skill
    }

    // (func ui-app)
    nx_tactics_ui_uitactics.t_ui_app['vx_value'] = {
      name          : "ui-app",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app
    }

    // (func ui-app-background)
    nx_tactics_ui_uitactics.t_ui_app_background['vx_value'] = {
      name          : "ui-app-background",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_background
    }

    // (func ui-app-home)
    nx_tactics_ui_uitactics.t_ui_app_home['vx_value'] = {
      name          : "ui-app-home",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_home
    }

    // (func ui-app-main)
    nx_tactics_ui_uitactics.t_ui_app_main['vx_value'] = {
      name          : "ui-app-main",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_main
    }

    // (func ui-app-menubar)
    nx_tactics_ui_uitactics.t_ui_app_menubar['vx_value'] = {
      name          : "ui-app-menubar",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_menubar
    }

    // (func ui-app-menudrawer)
    nx_tactics_ui_uitactics.t_ui_app_menudrawer['vx_value'] = {
      name          : "ui-app-menudrawer",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_menudrawer
    }

    // (func ui-app-msgbox)
    nx_tactics_ui_uitactics.t_ui_app_msgbox['vx_value'] = {
      name          : "ui-app-msgbox",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_msgbox
    }

    // (func ui-app-navbar)
    nx_tactics_ui_uitactics.t_ui_app_navbar['vx_value'] = {
      name          : "ui-app-navbar",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_navbar
    }

    // (func ui-app-navdrawer)
    nx_tactics_ui_uitactics.t_ui_app_navdrawer['vx_value'] = {
      name          : "ui-app-navdrawer",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_navdrawer
    }

    // (func ui-app-parallax)
    nx_tactics_ui_uitactics.t_ui_app_parallax['vx_value'] = {
      name          : "ui-app-parallax",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_parallax
    }

    // (func ui-app-statusbar)
    nx_tactics_ui_uitactics.t_ui_app_statusbar['vx_value'] = {
      name          : "ui-app-statusbar",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_statusbar
    }

    // (func ui-app-statusdrawer)
    nx_tactics_ui_uitactics.t_ui_app_statusdrawer['vx_value'] = {
      name          : "ui-app-statusdrawer",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_statusdrawer
    }

    // (func ui-app-titlebar)
    nx_tactics_ui_uitactics.t_ui_app_titlebar['vx_value'] = {
      name          : "ui-app-titlebar",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_titlebar
    }

    // (func ui-app-titlebar-print)
    nx_tactics_ui_uitactics.t_ui_app_titlebar_print['vx_value'] = {
      name          : "ui-app-titlebar-print",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_titlebar_print
    }

    // (func ui-app<-tactics)
    nx_tactics_ui_uitactics.t_ui_app_from_tactics['vx_value'] = {
      name          : "ui-app<-tactics",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_from_tactics
    }

    // (func ui-nav<-any-parent)
    nx_tactics_ui_uitactics.t_ui_nav_from_any_parent['vx_value'] = {
      name          : "ui-nav<-any-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_nav_from_any_parent
    }

    // (func ui-nav<-deck-parent)
    nx_tactics_ui_uitactics.t_ui_nav_from_deck_parent['vx_value'] = {
      name          : "ui-nav<-deck-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_nav_from_deck_parent
    }

    // (func ui-nav<-skill-parent)
    nx_tactics_ui_uitactics.t_ui_nav_from_skill_parent['vx_value'] = {
      name          : "ui-nav<-skill-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_nav_from_skill_parent
    }

    // (func ui-navbutton-back)
    nx_tactics_ui_uitactics.t_ui_navbutton_back['vx_value'] = {
      name          : "ui-navbutton-back",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_navbutton_back
    }

    // (func ui-navigate<-ui)
    nx_tactics_ui_uitactics.t_ui_navigate_from_ui['vx_value'] = {
      name          : "ui-navigate<-ui",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_navigate_from_ui
    }

    // (func ui-navigate<-ui-main)
    nx_tactics_ui_uitactics.t_ui_navigate_from_ui_main['vx_value'] = {
      name          : "ui-navigate<-ui-main",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_navigate_from_ui_main
    }

    // (func ui-navigate<-ui-navbar)
    nx_tactics_ui_uitactics.t_ui_navigate_from_ui_navbar['vx_value'] = {
      name          : "ui-navigate<-ui-navbar",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_navigate_from_ui_navbar
    }

    // (func ui<-any-parent)
    nx_tactics_ui_uitactics.t_ui_from_any_parent['vx_value'] = {
      name          : "ui<-any-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_from_any_parent
    }

    // (func ui<-card-parent)
    nx_tactics_ui_uitactics.t_ui_from_card_parent['vx_value'] = {
      name          : "ui<-card-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_from_card_parent
    }

    // (func ui<-fate-parent)
    nx_tactics_ui_uitactics.t_ui_from_fate_parent['vx_value'] = {
      name          : "ui<-fate-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_from_fate_parent
    }

    // (func ui<-unit-background)
    nx_tactics_ui_uitactics.t_ui_from_unit_background['vx_value'] = {
      name          : "ui<-unit-background",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_from_unit_background
    }

    // (func ui<-unit-flavor)
    nx_tactics_ui_uitactics.t_ui_from_unit_flavor['vx_value'] = {
      name          : "ui<-unit-flavor",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_from_unit_flavor
    }

    // (func ui<-unit-header)
    nx_tactics_ui_uitactics.t_ui_from_unit_header['vx_value'] = {
      name          : "ui<-unit-header",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_from_unit_header
    }

    // (func ui<-unit-parent)
    nx_tactics_ui_uitactics.t_ui_from_unit_parent['vx_value'] = {
      name          : "ui<-unit-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_from_unit_parent
    }

    // (func ui<-unit-skillpower)
    nx_tactics_ui_uitactics.t_ui_from_unit_skillpower['vx_value'] = {
      name          : "ui<-unit-skillpower",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_from_unit_skillpower
    }

    // (func ui<-unit-stat)
    nx_tactics_ui_uitactics.t_ui_from_unit_stat['vx_value'] = {
      name          : "ui<-unit-stat",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_from_unit_stat
    }

    // (func uilist<-ranksuit-parent)
    nx_tactics_ui_uitactics.t_uilist_from_ranksuit_parent['vx_value'] = {
      name          : "uilist<-ranksuit-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_uilist_from_ranksuit_parent
    }

    // (func uimap<-cardmap-parent)
    nx_tactics_ui_uitactics.t_uimap_from_cardmap_parent['vx_value'] = {
      name          : "uimap<-cardmap-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_uimap_from_cardmap_parent
    }

    // (const event-navbutton-back-click)
    Object.assign(nx_tactics_ui_uitactics.c_event_navbutton_back_click, vx_core.f_copy(
      vx_event.c_event_click,
      ":event<-event",
      nx_tactics_ui_uitactics.t_event_navbutton_click_from_event
    ))

    // (const event-navigate-card-click)
    Object.assign(nx_tactics_ui_uitactics.c_event_navigate_card_click, vx_core.f_copy(
      vx_event.c_event_click,
      ":event<-event",
      nx_tactics_ui_uitactics.t_event_navigate_card_click_from_event
    ))

    // (const event-printbutton-click)
    Object.assign(nx_tactics_ui_uitactics.c_event_printbutton_click, vx_core.f_copy(
      vx_event.c_event_click,
      ":event<-event",
      nx_tactics_ui_uitactics.t_event_printbutton_click_from_event
    ))

    // (const eventmap-app-home-card)
    Object.assign(nx_tactics_ui_uitactics.c_eventmap_app_home_card, vx_event.f_eventmap_from_eventlist(
      vx_core.f_new(
        vx_event.t_eventlist,
        nx_tactics_ui_uitactics.c_event_navigate_card_click
      )
    ))

    // (const eventmap-navbutton-back)
    Object.assign(nx_tactics_ui_uitactics.c_eventmap_navbutton_back, vx_event.f_eventmap_from_eventlist(
      vx_core.f_new(
        vx_event.t_eventlist,
        nx_tactics_ui_uitactics.c_event_navbutton_back_click
      )
    ))

  }
}
