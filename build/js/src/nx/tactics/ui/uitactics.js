'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_collection from "../../../vx/collection.js"
import nx_tactics_decks_deck from "../../../nx/tactics/decks/deck.js"
import vx_event from "../../../vx/event.js"
import vx_data_file from "../../../vx/data/file.js"
import nx_tactics_ui_navigation from "../../../nx/tactics/ui/navigation.js"
import nx_tactics_ui_stylesheet from "../../../nx/tactics/ui/stylesheet.js"
import vx_type from "../../../vx/type.js"
import vx_ui_ui from "../../../vx/ui/ui.js"


export default class nx_tactics_ui_uitactics {

  /**
   * Constant: event-navigate-card-click
   * {event}
   */
  static c_event_navigate_card_click = {vx_type: vx_event.t_event, vx_constdef: {pkgname: 'nx/tactics/ui/uitactics', name: 'event-navigate-card-click', type: vx_event.t_event}}

  /**
   * Constant: event-printbutton-click
   * {event}
   */
  static c_event_printbutton_click = {vx_type: vx_event.t_event, vx_constdef: {pkgname: 'nx/tactics/ui/uitactics', name: 'event-printbutton-click', type: vx_event.t_event}}

  /**
   * Constant: eventmap-app-home-card
   * Eventmap for app-home-card
   * {eventmap}
   */
  static c_eventmap_app_home_card = {vx_type: vx_event.t_eventmap, vx_constdef: {pkgname: 'nx/tactics/ui/uitactics', name: 'eventmap-app-home-card', type: vx_event.t_eventmap}}

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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const parent = "app/nav"
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const uimain = nx_tactics_ui_navigation.f_ui_readstate_main(context)
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const datatype = vx_core.f_type_from_any(value)
        const display = vx_core.f_switch(
          {"any-1": vx_core.t_string, "any-2": vx_core.t_any},
          datatype,
          vx_core.f_case_1(
            nx_tactics_base.t_book,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_string_display_from_book(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_book, "any-2": vx_core.t_any}, value)
            )})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_deck,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_string_display_from_deck(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_deck, "any-2": vx_core.t_any}, value)
            )})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_skill,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_string_display_from_skill(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_skill, "any-2": vx_core.t_any}, value)
            )})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_power,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_string_display_from_power(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_power, "any-2": vx_core.t_any}, value)
            )})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_item,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return ""})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_place,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return ""})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_unit,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return ""})
          ),
          vx_core.f_else(
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_if(
              {"any-1": vx_core.t_string},
              vx_type.f_is_type(
                datatype,
                nx_tactics_base.t_card
              ),
              vx_core.f_let(
                {"any-1": vx_core.t_string},
                [],
                vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
                  const card = vx_core.f_any_from_any({"any-1": nx_tactics_base.t_card, "any-2": vx_core.t_any}, value)
                  const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":summary")
                  return summary
                })
              )
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const chaptermap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_chaptermap, "struct-2": nx_tactics_base.t_book}, book, ":chaptermap")
        const names = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_chapter, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_chaptermap, "struct-2": nx_tactics_base.t_chapter},
          chaptermap,
          vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, value]) => 
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const cardmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_cardmap, "struct-2": nx_tactics_base.t_deck}, deck, ":cardmap")
        const names = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_card, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_cardmap, "struct-2": nx_tactics_base.t_card},
          cardmap,
          vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, value, ":name"))
        )
        const display = vx_type.f_string_from_stringlist_join(names, ", ")
        return display
      })
    )
    return output
  }

  /**
   * @function string_display_from_item
   * Returns display text from an item
   * @param  {item} item
   * @return {string}
   */
  static t_string_display_from_item = {
    vx_type: vx_core.t_type
  }
  static e_string_display_from_item = {
    vx_type: nx_tactics_ui_uitactics.t_string_display_from_item
  }

  // (func string-display<-item)
  static f_string_display_from_item(item) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":summary")
        const skilllist = nx_tactics_ui_uitactics.f_stringlist_display_from_unitskillmap(
          vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitskillmap, "struct-2": nx_tactics_base.t_item}, item, ":unitskillmap")
        )
        const powerlist = nx_tactics_ui_uitactics.f_stringlist_display_from_unitpowermap(
          vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitpowermap, "struct-2": nx_tactics_base.t_item}, item, ":unitpowermap")
        )
        const summarylist = vx_core.f_if_2(
          {"any-1": vx_core.t_stringlist},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(summary)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_stringlist}, summary)})
          )
        )
        const displaylist = vx_core.f_new({"any-1": vx_core.t_stringlist}, summarylist, skilllist, powerlist)
        return vx_type.f_string_from_stringlist_join(
          displaylist,
          vx_core.c_newline
        )
      })
    )
    return output
  }

  /**
   * @function string_display_from_power
   * Returns display text from a power
   * @param  {power} power
   * @return {string}
   */
  static t_string_display_from_power = {
    vx_type: vx_core.t_type
  }
  static e_string_display_from_power = {
    vx_type: nx_tactics_ui_uitactics.t_string_display_from_power
  }

  // (func string-display<-power)
  static f_string_display_from_power(power) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_power}, power, ":summary")
        const specialtymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_power}, power, ":specialtymap")
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_power}, power, ":abilitymap")
        const specialnames = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_specialty, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_specialty},
          specialtymap,
          vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_specialty}, value, ":name"))
        )
        const abilitynames = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_ability, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_ability},
          abilitymap,
          vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_ability}, value, ":name"))
        )
        const appended = vx_core.f_new({"any-1": vx_core.t_stringlist}, summary, specialnames, abilitynames)
        const display = vx_type.f_string_from_stringlist_join(appended, " ")
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_skill}, skill, ":summary")
        const specialtymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_skill}, skill, ":specialtymap")
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_skill}, skill, ":abilitymap")
        const specialnames = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_specialty, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_specialty},
          specialtymap,
          vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_specialty}, value, ":name"))
        )
        const abilitynames = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_ability, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_ability},
          abilitymap,
          vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, value]) => 
            vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_ability}, value, ":name"))
        )
        const appended = vx_core.f_new({"any-1": vx_core.t_stringlist}, summary, specialnames, abilitynames)
        const display = vx_type.f_string_from_stringlist_join(appended, " ")
        return display
      })
    )
    return output
  }

  /**
   * @function string_display_from_unit
   * Returns display text from a unit
   * @param  {unit} unit
   * @return {string}
   */
  static t_string_display_from_unit = {
    vx_type: vx_core.t_type
  }
  static e_string_display_from_unit = {
    vx_type: nx_tactics_ui_uitactics.t_string_display_from_unit
  }

  // (func string-display<-unit)
  static f_string_display_from_unit(unit) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":summary")
        const skilllist = nx_tactics_ui_uitactics.f_stringlist_display_from_unitskillmap(
          vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitskillmap, "struct-2": nx_tactics_base.t_unit}, unit, ":unitskillmap")
        )
        const powerlist = nx_tactics_ui_uitactics.f_stringlist_display_from_unitpowermap(
          vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitpowermap, "struct-2": nx_tactics_base.t_unit}, unit, ":unitpowermap")
        )
        const summarylist = vx_core.f_if_2(
          {"any-1": vx_core.t_stringlist},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(summary)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_stringlist}, summary)})
          )
        )
        const displaylist = vx_core.f_new({"any-1": vx_core.t_stringlist}, summarylist, skilllist, powerlist)
        return vx_type.f_string_from_stringlist_join(
          displaylist,
          vx_core.c_newline
        )
      })
    )
    return output
  }

  /**
   * @function string_display_from_unitpower
   * Returns a string from a unitpower
   * @param  {unitpower} unitpower
   * @return {string}
   */
  static t_string_display_from_unitpower = {
    vx_type: vx_core.t_type
  }
  static e_string_display_from_unitpower = {
    vx_type: nx_tactics_ui_uitactics.t_string_display_from_unitpower
  }

  // (func string-display<-unitpower)
  static f_string_display_from_unitpower(unitpower) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const power = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_power, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":power")
        const level = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":level")
        const rating = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":rating")
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_power}, power, ":name")
        const lvl = vx_core.f_if_1(
          {"any-1": vx_core.t_string},
          vx_core.f_eqeq(0, level),
          "",
          level
        )
        const ratinglvl = vx_core.f_if_1(
          {"any-1": vx_core.t_string},
          vx_core.f_eqeq("", rating),
          "",
          vx_core.f_new({"any-1": vx_core.t_string}, " Rating:", rating)
        )
        const specialties = nx_tactics_ui_uitactics.f_stringlist_display_from_unitspecialtymap(
          vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitspecialtymap, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":unitspecialtymap")
        )
        const abilities = nx_tactics_ui_uitactics.f_stringlist_display_from_unitabilitymap(
          vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitabilitymap, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":unitabilitymap")
        )
        const extralist = vx_core.f_new({"any-1": vx_core.t_stringlist}, specialties, abilities)
        const extras = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty_1(extralist)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_core.t_string},
              " ",
              vx_type.f_string_from_stringlist_join(extralist, " ")
            )})
          )
        )
        return vx_core.f_new({"any-1": vx_core.t_string}, "* [", name, "]:", lvl, ratinglvl, extras)
      })
    )
    return output
  }

  /**
   * @function string_display_from_unitskill
   * Returns a string from a unitskill
   * @param  {unitskill} unitskill
   * @return {string}
   */
  static t_string_display_from_unitskill = {
    vx_type: vx_core.t_type
  }
  static e_string_display_from_unitskill = {
    vx_type: nx_tactics_ui_uitactics.t_string_display_from_unitskill
  }

  // (func string-display<-unitskill)
  static f_string_display_from_unitskill(unitskill) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const skill = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_skill, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":skill")
        const level = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":level")
        const skillname = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_skill}, skill, ":name")
        const items = nx_tactics_ui_uitactics.f_stringlist_display_from_unititemmap(
          vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unititemmap, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":unititemmap")
        )
        const specialties = nx_tactics_ui_uitactics.f_stringlist_display_from_unitspecialtymap(
          vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitspecialtymap, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":unitspecialtymap")
        )
        const abilities = nx_tactics_ui_uitactics.f_stringlist_display_from_unitabilitymap(
          vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitabilitymap, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":unitabilitymap")
        )
        const extralist = vx_core.f_new({"any-1": vx_core.t_stringlist}, items, specialties, abilities)
        const extras = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty_1(extralist)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_core.t_string},
              " ",
              vx_type.f_string_from_stringlist_join(extralist, " ")
            )})
          )
        )
        return vx_core.f_new({"any-1": vx_core.t_string}, "* [", skillname, "]:", level, extras)
      })
    )
    return output
  }

  /**
   * @function string_from_conscience_beast_shadow
   * Returns a string for will string
   * @param  {string} conscience
   * @param  {string} beast
   * @param  {string} shadow
   * @return {string}
   */
  static t_string_from_conscience_beast_shadow = {
    vx_type: vx_core.t_type
  }
  static e_string_from_conscience_beast_shadow = {
    vx_type: nx_tactics_ui_uitactics.t_string_from_conscience_beast_shadow
  }

  // (func string<-conscience-beast-shadow)
  static f_string_from_conscience_beast_shadow(conscience, beast, shadow) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const s1 = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(conscience)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "conscience:", conscience)})
          )
        )
        const s2 = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(beast)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "beast:", beast)})
          )
        )
        const s3 = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(shadow)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "shadow:", shadow)})
          )
        )
        const slist = vx_core.f_new({"any-1": vx_core.t_stringlist}, s1, s2, s3)
        const sjoin = vx_type.f_string_from_stringlist_join(slist, " ")
        return vx_type.f_string_trim(sjoin)
      })
    )
    return output
  }

  /**
   * @function string_from_demeanor_nature
   * Returns a string for mind string
   * @param  {string} demeanor
   * @param  {string} nature
   * @return {string}
   */
  static t_string_from_demeanor_nature = {
    vx_type: vx_core.t_type
  }
  static e_string_from_demeanor_nature = {
    vx_type: nx_tactics_ui_uitactics.t_string_from_demeanor_nature
  }

  // (func string<-demeanor-nature)
  static f_string_from_demeanor_nature(demeanor, nature) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const sdemeanor = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(demeanor)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "demeanor:", demeanor)})
          )
        )
        const snature = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(nature)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "nature:", nature)})
          )
        )
        const slist = vx_core.f_new({"any-1": vx_core.t_stringlist}, sdemeanor, snature)
        const sjoin = vx_type.f_string_from_stringlist_join(slist, " ")
        return vx_type.f_string_trim(sjoin)
      })
    )
    return output
  }

  /**
   * @function string_from_land_water_air_space
   * Returns a string for will string
   * @param  {string} land
   * @param  {string} water
   * @param  {string} air
   * @param  {string} space
   * @return {string}
   */
  static t_string_from_land_water_air_space = {
    vx_type: vx_core.t_type
  }
  static e_string_from_land_water_air_space = {
    vx_type: nx_tactics_ui_uitactics.t_string_from_land_water_air_space
  }

  // (func string<-land-water-air-space)
  static f_string_from_land_water_air_space(land, water, air, space) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const s1 = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(land)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "land:", land)})
          )
        )
        const s2 = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(water)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "water:", water)})
          )
        )
        const s3 = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(air)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "air:", air)})
          )
        )
        const s4 = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(space)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "space:", space)})
          )
        )
        const slist = vx_core.f_new({"any-1": vx_core.t_stringlist}, s1, s2, s3, s4)
        const sjoin = vx_type.f_string_from_stringlist_join(slist, " ")
        return vx_type.f_string_trim(sjoin)
      })
    )
    return output
  }

  /**
   * @function string_from_mass_h_l_w
   * Returns a string from a mass, height, length, width
   * @param  {string} mass
   * @param  {string} height
   * @param  {string} length
   * @param  {string} width
   * @return {string}
   */
  static t_string_from_mass_h_l_w = {
    vx_type: vx_core.t_type
  }
  static e_string_from_mass_h_l_w = {
    vx_type: nx_tactics_ui_uitactics.t_string_from_mass_h_l_w
  }

  // (func string<-mass-h-l-w)
  static f_string_from_mass_h_l_w(mass, height, length, width) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const smass = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(mass)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "mass:", mass)})
          )
        )
        const h = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(height)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "h:", height)})
          )
        )
        const l = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(length)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "l:", length)})
          )
        )
        const w = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(width)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new({"any-1": vx_core.t_string}, "w:", width)})
          )
        )
        const slist = vx_core.f_new({"any-1": vx_core.t_stringlist}, smass, h, l, w)
        const sjoin = vx_type.f_string_from_stringlist_join(slist, " ")
        return vx_type.f_string_trim(sjoin)
      })
    )
    return output
  }

  /**
   * @function stringlist_display_from_unitabilitymap
   * Returns a stringlist from a unitabilitymap
   * @param  {unitabilitymap} unitabilitymap
   * @return {stringlist}
   */
  static t_stringlist_display_from_unitabilitymap = {
    vx_type: vx_core.t_type
  }
  static e_stringlist_display_from_unitabilitymap = {
    vx_type: nx_tactics_ui_uitactics.t_stringlist_display_from_unitabilitymap
  }

  // (func stringlist-display<-unitabilitymap)
  static f_stringlist_display_from_unitabilitymap(unitabilitymap) {
    let output = vx_core.e_stringlist
    output = vx_core.f_list_from_map_1(
      {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_unitability, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_unitabilitymap},
      unitabilitymap,
      vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, unitability]) => 
        vx_core.f_new({"any-1": vx_core.t_string}, "[", key, "]"))
    )
    return output
  }

  /**
   * @function stringlist_display_from_unititemmap
   * Returns a stringlist from a unititemmap
   * @param  {unititemmap} unititemmap
   * @return {stringlist}
   */
  static t_stringlist_display_from_unititemmap = {
    vx_type: vx_core.t_type
  }
  static e_stringlist_display_from_unititemmap = {
    vx_type: nx_tactics_ui_uitactics.t_stringlist_display_from_unititemmap
  }

  // (func stringlist-display<-unititemmap)
  static f_stringlist_display_from_unititemmap(unititemmap) {
    let output = vx_core.e_stringlist
    output = vx_core.f_list_from_map_1(
      {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_unititem, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_unititemmap},
      unititemmap,
      vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, unititem]) => 
        vx_core.f_new({"any-1": vx_core.t_string}, "[", key, "]"))
    )
    return output
  }

  /**
   * @function stringlist_display_from_unitpowermap
   * Returns a stringlist from a unitpowermap
   * @param  {unitpowermap} unitpowermap
   * @return {stringlist}
   */
  static t_stringlist_display_from_unitpowermap = {
    vx_type: vx_core.t_type
  }
  static e_stringlist_display_from_unitpowermap = {
    vx_type: nx_tactics_ui_uitactics.t_stringlist_display_from_unitpowermap
  }

  // (func stringlist-display<-unitpowermap)
  static f_stringlist_display_from_unitpowermap(unitpowermap) {
    let output = vx_core.e_stringlist
    output = vx_core.f_list_from_map_1(
      {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_unitpower, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_unitpowermap},
      unitpowermap,
      vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, unitpower]) => 
        nx_tactics_ui_uitactics.f_string_display_from_unitpower(unitpower))
    )
    return output
  }

  /**
   * @function stringlist_display_from_unitskillmap
   * Returns a stringlist from a unitskillmap
   * @param  {unitskillmap} unitskillmap
   * @return {stringlist}
   */
  static t_stringlist_display_from_unitskillmap = {
    vx_type: vx_core.t_type
  }
  static e_stringlist_display_from_unitskillmap = {
    vx_type: nx_tactics_ui_uitactics.t_stringlist_display_from_unitskillmap
  }

  // (func stringlist-display<-unitskillmap)
  static f_stringlist_display_from_unitskillmap(unitskillmap) {
    let output = vx_core.e_stringlist
    output = vx_core.f_list_from_map_1(
      {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_unitskill, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_unitskillmap},
      unitskillmap,
      vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, unitskill]) => 
        nx_tactics_ui_uitactics.f_string_display_from_unitskill(unitskill))
    )
    return output
  }

  /**
   * @function stringlist_display_from_unitspecialtymap
   * Returns a stringlist from a unitspecialtymap
   * @param  {unitspecialtymap} unitspecialtymap
   * @return {stringlist}
   */
  static t_stringlist_display_from_unitspecialtymap = {
    vx_type: vx_core.t_type
  }
  static e_stringlist_display_from_unitspecialtymap = {
    vx_type: nx_tactics_ui_uitactics.t_stringlist_display_from_unitspecialtymap
  }

  // (func stringlist-display<-unitspecialtymap)
  static f_stringlist_display_from_unitspecialtymap(unitspecialtymap) {
    let output = vx_core.e_stringlist
    output = vx_core.f_list_from_map_1(
      {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_unitspecialty, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_unitspecialtymap},
      unitspecialtymap,
      vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, unitspecialty]) => 
        vx_core.f_new({"any-1": vx_core.t_string}, "[", key, "]"))
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
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
        const uimap = vx_ui_ui.f_uimap_from_uilist(background, main, menubar, menudrawer, msgbox, navbar, navdrawer, parallax, statusbar, statusdrawer, titlebar)
        return vx_core.f_new(
          {"any-1": vx_ui_ui.t_ui},
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/background",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
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
      "app/main"
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/main",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
        nx_tactics_ui_stylesheet.c_style_app_main
      ),
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        nx_tactics_ui_uitactics.f_ui_app_home()
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/menubar",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/menudrawer",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/msgbox",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/navbar",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
        nx_tactics_ui_stylesheet.c_style_app_navbar
      ),
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        nx_tactics_ui_uitactics.f_ui_navbutton_back(),
        nx_tactics_ui_navigation.f_ui_navbutton_from_ui_selected(
          vx_core.f_new({"any-1": vx_ui_ui.t_ui}, ":name", "Home"),
          true
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/navdrawer",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/parallax",
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/statusbar",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/statusdrawer",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/titlebar",
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
        nx_tactics_ui_stylesheet.c_style_app_titlebar
      ),
      ":uimap",
      vx_ui_ui.f_uimap_from_uilist(
        nx_tactics_ui_uitactics.f_ui_app_titlebar_title(),
        nx_tactics_ui_uitactics.f_ui_app_titlebar_print()
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
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/titlebar/print",
      ":data",
      vx_core.f_new({"any-1": vx_data_file.t_file}, ":name", "icon-printer.svg", ":path", "icons"),
      ":style",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_style},
        ":layout",
        vx_ui_ui.c_layout_image
      ),
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
        nx_tactics_ui_stylesheet.c_style_app_titlebar_print,
        nx_tactics_ui_stylesheet.c_style_clickable
      ),
      ":eventmap",
      vx_event.f_eventmap_from_eventlist(
        vx_core.f_new(
          {"any-1": vx_event.t_eventlist},
          nx_tactics_ui_uitactics.c_event_printbutton_click
        )
      )
    )
    return output
  }

  /**
   * @function ui_app_titlebar_title
   * @return {ui}
   */
  static t_ui_app_titlebar_title = {
    vx_type: vx_core.t_type
  }
  static e_ui_app_titlebar_title = {
    vx_type: nx_tactics_ui_uitactics.t_ui_app_titlebar_title
  }

  // (func ui-app-titlebar-title)
  static f_ui_app_titlebar_title() {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      "app/titlebar/title",
      ":data",
      "Title",
      ":style",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_style},
        ":layout",
        vx_ui_ui.c_layout_label
      ),
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
        nx_tactics_ui_stylesheet.c_style_app_titlebar_title
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const appui = nx_tactics_ui_uitactics.f_ui_app()
        return vx_core.f_copy(appui, ":data", tactics)
      })
    )
    return output
  }

  /**
   * @function ui_image_from_uid_path
   * @param  {string} uid
   * @param  {string} path
   * @return {ui}
   */
  static t_ui_image_from_uid_path = {
    vx_type: vx_core.t_type
  }
  static e_ui_image_from_uid_path = {
    vx_type: nx_tactics_ui_uitactics.t_ui_image_from_uid_path
  }

  // (func ui-image<-uid-path)
  static f_ui_image_from_uid_path(uid, path) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_ui},
      vx_core.f_then(
        vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(path)}),
        vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
          {"any-1": vx_ui_ui.t_ui},
          ":uid",
          vx_core.f_new({"any-1": vx_core.t_string}, uid, "/imagebkgd"),
          ":style",
          vx_core.f_new(
            {"any-1": vx_ui_ui.t_style},
            ":layout",
            vx_ui_ui.c_layout_image
          ),
          ":stylelist",
          vx_core.f_new(
            {"any-1": vx_ui_ui.t_stylelist},
            nx_tactics_ui_stylesheet.c_style_image_background
          ),
          ":data",
          vx_data_file.f_file_from_path(path)
        )})
      )
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
        vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_is_empty_1(data)}),
        vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_empty(
          vx_ui_ui.t_ui
        )})
      ),
      vx_core.f_else(
        vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_ui},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const datatype = vx_core.f_type_from_any(data)
            return vx_core.f_if_2(
              {"any-1": vx_ui_ui.t_ui},
              vx_core.f_then(
                vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
                  datatype,
                  nx_tactics_base.t_deck
                )}),
                vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_nav_from_deck_parent(
                  vx_core.f_any_from_any({"any-1": nx_tactics_base.t_deck, "any-2": vx_core.t_any}, data),
                  parent
                )})
              ),
              vx_core.f_then(
                vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
                  datatype,
                  nx_tactics_base.t_skill
                )}),
                vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_nav_from_skill_parent(
                  vx_core.f_any_from_any({"any-1": nx_tactics_base.t_skill, "any-2": vx_core.t_any}, data),
                  parent
                )})
              ),
              vx_core.f_then(
                vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
                  datatype,
                  nx_tactics_base.t_power
                )}),
                vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_nav_from_power_parent(
                  vx_core.f_any_from_any({"any-1": nx_tactics_base.t_power, "any-2": vx_core.t_any}, data),
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_deck}, deck, ":name")
        const uid = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/", name)
        const cardmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_cardmap, "struct-2": nx_tactics_base.t_deck}, deck, ":cardmap")
        const uimap = nx_tactics_ui_uitactics.f_uimap_from_cardmap_parent_page_size(cardmap, uid, 1, 100)
        return vx_core.f_new(
          {"any-1": vx_ui_ui.t_ui},
          ":uid",
          uid,
          ":stylelist",
          vx_core.f_new(
            {"any-1": vx_ui_ui.t_stylelist},
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
   * @function ui_nav_from_power_parent
   * Returns a deck ui.
   * @param  {power} power
   * @param  {string} parent
   * @return {ui}
   */
  static t_ui_nav_from_power_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_nav_from_power_parent = {
    vx_type: nx_tactics_ui_uitactics.t_ui_nav_from_power_parent
  }

  // (func ui-nav<-power-parent)
  static f_ui_nav_from_power_parent(power, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_power}, power, ":name")
        const uid = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/", name)
        const specialtymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_power}, power, ":specialtymap")
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_power}, power, ":abilitymap")
        const cardmap1 = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_specialty, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_specialtymap}, specialtymap)
        const cardmap2 = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_ability, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_abilitymap}, abilitymap)
        const cardmap3 = vx_core.f_copy(cardmap1, cardmap2)
        const uimap = nx_tactics_ui_uitactics.f_uimap_from_cardmap_parent_page_size(cardmap3, uid, 1, 100)
        return vx_core.f_new(
          {"any-1": vx_ui_ui.t_ui},
          ":uid",
          uid,
          ":stylelist",
          vx_core.f_new(
            {"any-1": vx_ui_ui.t_stylelist},
            nx_tactics_ui_stylesheet.c_style_deck
          ),
          ":data",
          nx_tactics_base.t_skill,
          ":uimap",
          uimap
        )
      })
    )
    return output
  }

  /**
   * @function ui_nav_from_skill_parent
   * Returns a deck ui.
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_skill}, skill, ":name")
        const uid = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/", name)
        const specialtymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_skill}, skill, ":specialtymap")
        const abilitymap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_skill}, skill, ":abilitymap")
        const cardmap1 = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_specialty, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_specialtymap}, specialtymap)
        const cardmap2 = vx_core.f_map_from_map({"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_ability, "map-1": nx_tactics_base.t_cardmap, "map-2": nx_tactics_base.t_abilitymap}, abilitymap)
        const cardmap3 = vx_core.f_copy(cardmap1, cardmap2)
        const uimap = nx_tactics_ui_uitactics.f_uimap_from_cardmap_parent_page_size(cardmap3, uid, 1, 100)
        return vx_core.f_new(
          {"any-1": vx_ui_ui.t_ui},
          ":uid",
          uid,
          ":stylelist",
          vx_core.f_new(
            {"any-1": vx_ui_ui.t_stylelist},
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const navbutton = nx_tactics_ui_navigation.f_ui_navbutton()
        const name = "Back"
        const uid1 = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, navbutton, ":uid")
        const uid2 = vx_core.f_new({"any-1": vx_core.t_string}, uid1, "/", name)
        const uiimage = nx_tactics_ui_uitactics.f_ui_image_from_uid_path(uid2, "icons/icon-backarrow.svg")
        const uimap = vx_ui_ui.f_uimap_from_uilist(uiimage)
        const styles1 = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_stylelist, "struct-2": vx_ui_ui.t_ui}, navbutton, ":stylelist")
        return vx_core.f_copy(navbutton, ":uid", uid2, ":name", name, ":stylelist", styles1, ":uimap", uimap)
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
        vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty_1(uiarg)}),
        vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_ui},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const navbar = nx_tactics_ui_navigation.f_ui_readstate_navbar(context)
            const main = nx_tactics_ui_navigation.f_ui_readstate_main(context)
            const ui1 = nx_tactics_ui_uitactics.f_ui_navigate_from_ui_navbar(context, uiarg, navbar)
            const ui2 = nx_tactics_ui_uitactics.f_ui_navigate_from_ui_main(context, uiarg, main)
            return uiarg
          })
        )})
      ),
      vx_core.f_else(vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return uiarg}))
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const data = vx_core.f_any_from_struct({"any-1": vx_core.t_any, "struct-2": vx_ui_ui.t_ui}, ui, ":data")
        const mainid = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, main, ":uid")
        const mainmap = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_uimap, "struct-2": vx_ui_ui.t_ui}, main, ":uimap")
        const pos = vx_ui_ui.f_int_visible_from_ui(main)
        const len = vx_core.f_length_2(mainmap)
        const isremoveend = vx_core.f_if_2(
          {"any-1": vx_core.t_boolean},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_gt(len, pos)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_ui_ui.f_boolean_layoutremove_from_ui_start_end(
              context,
              main,
              vx_core.f_plus1(pos),
              len
            )})
          )
        )
        const uivisible = vx_ui_ui.f_ui_visible_from_ui(main)
        const ishidden = vx_ui_ui.f_boolean_layout_from_ui_parent_visible(
          context,
          uivisible,
          main,
          false
        )
        const child = nx_tactics_ui_uitactics.f_ui_nav_from_any_parent(data, mainid)
        const isadded = vx_ui_ui.f_boolean_layoutaddchild_from_ui_parent(context, child, main)
        const card = vx_core.f_any_from_any({"any-1": nx_tactics_base.t_card, "any-2": vx_core.t_any}, data)
        const title = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":name")
        const istitle = nx_tactics_ui_navigation.f_boolean_layouttitlebar_from_string(context, title)
        return main
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const uid = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, ui, ":uid")
        const navmap = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_uimap, "struct-2": vx_ui_ui.t_ui}, navbar, ":uimap")
        const pos = vx_ui_ui.f_int_selected_from_ui(navbar)
        const len = vx_core.f_length_2(navmap)
        const isremoveend = vx_core.f_if_2(
          {"any-1": vx_core.t_boolean},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_gt(len, pos)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_ui_ui.f_boolean_layoutremove_from_ui_start_end(
              context,
              navbar,
              vx_core.f_plus1(pos),
              len
            )})
          )
        )
        const uiselected = vx_ui_ui.f_ui_selected_from_ui(navbar)
        const isselected = vx_ui_ui.f_boolean_layout_from_ui_parent_selected(
          context,
          uiselected,
          navbar,
          false
        )
        const button = nx_tactics_ui_navigation.f_ui_navbutton_from_ui_selected(
          ui,
          true
        )
        const isadded = vx_ui_ui.f_boolean_layoutaddchild_from_ui_parent(context, button, navbar)
        return navbar
      })
    )
    return output
  }

  /**
   * @function ui_suit_from_uid_rank_suit_pos
   * @param  {string} uid
   * @param  {rank} rank
   * @param  {suit} suit
   * @param  {int} pos
   * @return {ui}
   */
  static t_ui_suit_from_uid_rank_suit_pos = {
    vx_type: vx_core.t_type
  }
  static e_ui_suit_from_uid_rank_suit_pos = {
    vx_type: nx_tactics_ui_uitactics.t_ui_suit_from_uid_rank_suit_pos
  }

  // (func ui-suit<-uid-rank-suit-pos)
  static f_ui_suit_from_uid_rank_suit_pos(uid, rank, suit, pos) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const id = vx_core.f_new({"any-1": vx_core.t_string}, uid, "/suit-", pos)
        const filename = vx_core.f_switch(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_suit},
          suit,
          vx_core.f_case_1(
            nx_tactics_base.c_suit_club,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "icon-wand.svg"})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_diamond,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "icon-coin.svg"})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_heart,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "icon-cup.svg"})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_spade,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "icon-sword.svg"})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_black,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "icon-jester-black.svg"})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_suit_red,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "icon-jester-red.svg"})
          )
        )
        const style = vx_core.f_switch(
          {"any-1": vx_ui_ui.t_style, "any-2": vx_core.t_int},
          pos,
          vx_core.f_case_1(
            1,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_style},
              ":layout",
              vx_ui_ui.c_layout_image,
              ":pointpos",
              nx_tactics_ui_stylesheet.c_point_suit_pos1,
              ":pointsize",
              nx_tactics_ui_stylesheet.c_point_suit_size
            )})
          ),
          vx_core.f_case_1(
            2,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_style},
              ":layout",
              vx_ui_ui.c_layout_image,
              ":pointpos",
              nx_tactics_ui_stylesheet.c_point_suit_pos2,
              ":pointrotate",
              vx_ui_ui.c_point_rotate_180,
              ":pointsize",
              nx_tactics_ui_stylesheet.c_point_suit_size
            )})
          )
        )
        return vx_core.f_new(
          {"any-1": vx_ui_ui.t_ui},
          ":uid",
          id,
          ":style",
          style,
          ":data",
          vx_core.f_new({"any-1": vx_data_file.t_file}, ":name", filename, ":path", "icons")
        )
      })
    )
    return output
  }

  /**
   * @function ui_title1_from_uid_text
   * Returns a card title1
   * @param  {string} uid
   * @param  {string} text
   * @return {ui}
   */
  static t_ui_title1_from_uid_text = {
    vx_type: vx_core.t_type
  }
  static e_ui_title1_from_uid_text = {
    vx_type: nx_tactics_ui_uitactics.t_ui_title1_from_uid_text
  }

  // (func ui-title1<-uid-text)
  static f_ui_title1_from_uid_text(uid, text) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      vx_core.f_new({"any-1": vx_core.t_string}, uid, "/title1"),
      ":style",
      nx_tactics_ui_stylesheet.c_style_card_title1,
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
        nx_tactics_ui_stylesheet.c_style_text_header1
      ),
      ":data",
      text
    )
    return output
  }

  /**
   * @function ui_title2_from_uid_text
   * Returns a card title2
   * @param  {string} uid
   * @param  {string} text
   * @return {ui}
   */
  static t_ui_title2_from_uid_text = {
    vx_type: vx_core.t_type
  }
  static e_ui_title2_from_uid_text = {
    vx_type: nx_tactics_ui_uitactics.t_ui_title2_from_uid_text
  }

  // (func ui-title2<-uid-text)
  static f_ui_title2_from_uid_text(uid, text) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_new(
      {"any-1": vx_ui_ui.t_ui},
      ":uid",
      vx_core.f_new({"any-1": vx_core.t_string}, uid, "/title2"),
      ":style",
      nx_tactics_ui_stylesheet.c_style_card_title2,
      ":stylelist",
      vx_core.f_new(
        {"any-1": vx_ui_ui.t_stylelist},
        nx_tactics_ui_stylesheet.c_style_text_header1
      ),
      ":data",
      text
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const datatype = vx_core.f_type_from_any(data)
        return vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_type.f_is_type(
              datatype,
              nx_tactics_base.t_card
            )}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_from_card_parent(
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
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const id = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":id")
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":name")
        const image = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":image")
        const datatype = vx_core.f_type_from_any(card)
        const display = nx_tactics_ui_uitactics.f_string_display_from_any(card)
        const id1 = vx_core.f_if_1(
          {"any-1": vx_core.t_string},
          vx_core.f_notempty(id),
          id,
          name
        )
        const uid = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/", id1)
        const imgback = vx_core.f_switch(
          {"any-1": vx_core.t_string, "any-2": vx_core.t_any},
          datatype,
          vx_core.f_case_1(
            nx_tactics_base.t_item,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "images/item.svg"})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_unit,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "images/unit.svg"})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_place,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return ""})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_cardimage,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return ""})
          ),
          vx_core.f_else(vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return image}))
        )
        const uiimage = nx_tactics_ui_uitactics.f_ui_image_from_uid_path(uid, imgback)
        const events = vx_core.f_if_2(
          {"any-1": vx_event.t_eventmap},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eq(display, "")}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_empty(
              vx_event.t_eventmap
            )})
          ),
          vx_core.f_else(
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.c_eventmap_app_home_card})
          )
        )
        const styles = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_stylelist},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eq(display, "")}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_stylelist},
              nx_tactics_ui_stylesheet.c_style_card
            )})
          ),
          vx_core.f_else(
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_stylelist},
              nx_tactics_ui_stylesheet.c_style_card,
              nx_tactics_ui_stylesheet.c_style_clickable
            )})
          )
        )
        const uilist1 = nx_tactics_ui_uitactics.f_uilist_from_card_parent(card, parent)
        const uilist2 = vx_core.f_new({"any-1": vx_ui_ui.t_uilist}, uiimage, uilist1)
        return vx_core.f_new(
          {"any-1": vx_ui_ui.t_ui},
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
          vx_ui_ui.f_uimap_from_uilist(uilist2)
        )
      })
    )
    return output
  }

  /**
   * @function uilist_from_card_parent
   * @param  {card} card
   * @param  {string} parent
   * @return {uilist}
   */
  static t_uilist_from_card_parent = {
    vx_type: vx_core.t_type
  }
  static e_uilist_from_card_parent = {
    vx_type: nx_tactics_ui_uitactics.t_uilist_from_card_parent
  }

  // (func uilist<-card-parent)
  static f_uilist_from_card_parent(card, parent) {
    let output = vx_ui_ui.e_uilist
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_uilist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const id = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":id")
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":name")
        const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_card}, card, ":summary")
        const layout = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_cardlayout, "struct-2": nx_tactics_base.t_card}, card, ":layout")
        const datatype = vx_core.f_type_from_any(card)
        const style_display = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_style},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              datatype,
              nx_tactics_base.t_conflict
            )}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_card_display})
          ),
          vx_core.f_else(
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_stylesheet.c_style_card_display})
          )
        )
        const isdisplay4 = vx_core.f_or_1(
          vx_core.f_eqeq(
            datatype,
            nx_tactics_base.t_damage
          ),
          vx_core.f_eqeq(
            datatype,
            nx_tactics_base.t_disorder
          ),
          vx_core.f_eqeq(
            datatype,
            nx_tactics_base.t_trauma
          )
        )
        const id1 = vx_core.f_if_1(
          {"any-1": vx_core.t_string},
          vx_core.f_notempty(id),
          id,
          name
        )
        const uid = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/", id1)
        const display = vx_core.f_switch(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_cardlayout},
          layout,
          vx_core.f_case_1(
            nx_tactics_base.c_cardlayout_imageonly,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return ""})
          ),
          vx_core.f_else(
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_string_display_from_any(card)})
          )
        )
        const displaysplit = vx_core.f_if_2(
          {"any-1": vx_core.t_stringlist},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return isdisplay4}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_type.f_stringlist_from_string_split(
              display,
              vx_core.c_newline
            )})
          )
        )
        const display1 = vx_core.f_if_2(
          {"any-1": vx_core.t_string},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return isdisplay4}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_any_from_list({"any-1": vx_core.t_string, "list-1": vx_core.t_stringlist}, displaysplit, 1)})
          ),
          vx_core.f_else(vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return display}))
        )
        const uititle1 = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              datatype,
              nx_tactics_base.t_conflict
            )}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_empty(
              vx_ui_ui.t_ui
            )})
          ),
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              layout,
              nx_tactics_base.c_cardlayout_imageonly
            )}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_empty(
              vx_ui_ui.t_ui
            )})
          ),
          vx_core.f_else(
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_title1_from_uid_text(uid, name)})
          )
        )
        const uititle2 = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              datatype,
              nx_tactics_base.t_conflict
            )}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_empty(
              vx_ui_ui.t_ui
            )})
          ),
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              layout,
              nx_tactics_base.c_cardlayout_imageonly
            )}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_empty(
              vx_ui_ui.t_ui
            )})
          ),
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              datatype,
              nx_tactics_base.t_cardback
            )}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_ui_title2_from_uid_text(uid, name)})
          )
        )
        const uiddisplay = vx_core.f_new({"any-1": vx_core.t_string}, uid, "/display")
        const uidisplay = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(display1)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              uiddisplay,
              ":style",
              style_display,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_textarea
              ),
              ":data",
              display1
            )})
          )
        )
        const ranksuit = vx_core.f_if_2(
          {"any-1": nx_tactics_base.t_ranksuit},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              layout,
              nx_tactics_base.c_cardlayout_imageonly
            )}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_empty(
              vx_ui_ui.t_ui
            )})
          ),
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              datatype,
              nx_tactics_base.t_conflict
            )}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_empty(
              nx_tactics_base.t_ranksuit
            )})
          ),
          vx_core.f_else(
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_ranksuit, "struct-2": nx_tactics_base.t_card}, card, ":ranksuit")})
          )
        )
        const uilist1 = nx_tactics_ui_uitactics.f_uilist_from_ranksuit_parent(ranksuit, uid)
        const uilist2 = vx_core.f_switch(
          {"any-1": vx_ui_ui.t_uilist, "any-2": vx_core.t_any},
          datatype,
          vx_core.f_case_1(
            nx_tactics_base.t_item,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_uilist_from_item_parent(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_item, "any-2": nx_tactics_base.t_card}, card),
              parent
            )})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_place,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_uilist_from_place_parent(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_place, "any-2": nx_tactics_base.t_card}, card),
              parent
            )})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_unit,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_uilist_from_unit_parent(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_unit, "any-2": nx_tactics_base.t_card}, card),
              parent
            )})
          ),
          vx_core.f_case_1(
            nx_tactics_base.t_cardimage,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return nx_tactics_ui_uitactics.f_uilist_from_cardimage_parent(
              vx_core.f_any_from_any({"any-1": nx_tactics_base.t_cardimage, "any-2": nx_tactics_base.t_card}, card),
              parent
            )})
          ),
          vx_core.f_else(
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_if(
              {"any-1": vx_ui_ui.t_uilist},
              isdisplay4,
              vx_core.f_let(
                {"any-1": vx_ui_ui.t_uilist},
                [],
                vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
                  const uid2 = vx_core.f_new({"any-1": vx_core.t_string}, uid, "/display2")
                  const display2 = vx_core.f_any_from_list({"any-1": vx_core.t_string, "list-1": vx_core.t_stringlist}, displaysplit, 2)
                  const uidisplay2 = vx_core.f_new(
                    {"any-1": vx_ui_ui.t_ui},
                    ":uid",
                    uid2,
                    ":style",
                    nx_tactics_ui_stylesheet.c_style_card_display2,
                    ":stylelist",
                    vx_core.f_new(
                      {"any-1": vx_ui_ui.t_stylelist},
                      nx_tactics_ui_stylesheet.c_style_textarea
                    ),
                    ":data",
                    display2
                  )
                  const uid3 = vx_core.f_new({"any-1": vx_core.t_string}, uid, "/display3")
                  const display3 = vx_core.f_any_from_list({"any-1": vx_core.t_string, "list-1": vx_core.t_stringlist}, displaysplit, 3)
                  const uidisplay3 = vx_core.f_new(
                    {"any-1": vx_ui_ui.t_ui},
                    ":uid",
                    uid3,
                    ":style",
                    nx_tactics_ui_stylesheet.c_style_card_display3,
                    ":stylelist",
                    vx_core.f_new(
                      {"any-1": vx_ui_ui.t_stylelist},
                      nx_tactics_ui_stylesheet.c_style_textarea
                    ),
                    ":data",
                    display3
                  )
                  const uid4 = vx_core.f_new({"any-1": vx_core.t_string}, uid, "/display4")
                  const display4 = vx_core.f_any_from_list({"any-1": vx_core.t_string, "list-1": vx_core.t_stringlist}, displaysplit, 4)
                  const uidisplay4 = vx_core.f_new(
                    {"any-1": vx_ui_ui.t_ui},
                    ":uid",
                    uid4,
                    ":style",
                    nx_tactics_ui_stylesheet.c_style_card_display4,
                    ":stylelist",
                    vx_core.f_new(
                      {"any-1": vx_ui_ui.t_stylelist},
                      nx_tactics_ui_stylesheet.c_style_textarea
                    ),
                    ":data",
                    display4
                  )
                  return vx_core.f_new({"any-1": vx_ui_ui.t_uilist}, uidisplay2, uidisplay3, uidisplay4)
                })
              )
            )})
          )
        )
        return vx_core.f_new({"any-1": vx_ui_ui.t_uilist}, uilist1, uilist2, uititle1, uititle2, uidisplay)
      })
    )
    return output
  }

  /**
   * @function uilist_from_cardimage_parent
   * Returns a list of child ui from a cardimage/parent
   * @param  {cardimage} cardimage
   * @param  {string} parent
   * @return {uilist}
   */
  static t_uilist_from_cardimage_parent = {
    vx_type: vx_core.t_type
  }
  static e_uilist_from_cardimage_parent = {
    vx_type: nx_tactics_ui_uitactics.t_uilist_from_cardimage_parent
  }

  // (func uilist<-cardimage-parent)
  static f_uilist_from_cardimage_parent(cardimage, parent) {
    let output = vx_ui_ui.e_uilist
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_uilist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_cardimage}, cardimage, ":name")
        const image = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_cardimage}, cardimage, ":image")
        const layout = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_cardlayout, "struct-2": nx_tactics_base.t_cardimage}, cardimage, ":layout")
        const imgmirror = vx_core.f_any_from_struct({"any-1": vx_core.t_boolean, "struct-2": nx_tactics_base.t_cardimage}, cardimage, ":imgmirror")
        const prefix = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/", name)
        const uiimage1 = vx_core.f_switch(
          {"any-1": vx_ui_ui.t_ui, "any-2": nx_tactics_base.t_cardlayout},
          layout,
          vx_core.f_case_1(
            nx_tactics_base.c_cardlayout_imageonly,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/image1"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_image_background,
              ":data",
              vx_data_file.f_file_from_path(image)
            )})
          ),
          vx_core.f_case_1(
            nx_tactics_base.c_cardlayout_textimage,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/image1"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_image_background,
              ":data",
              vx_data_file.f_file_from_path(image)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/image1"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_cardimage_image1,
              ":data",
              vx_data_file.f_file_from_path(image)
            )})
          )
        )
        const uiimage2 = vx_core.f_switch(
          {"any-1": vx_ui_ui.t_ui, "any-2": nx_tactics_base.t_cardlayout},
          nx_tactics_base.t_cardlayout,
          vx_core.f_case_1(
            nx_tactics_base.c_cardlayout_imagemirror,
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/image2"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_cardimage_image2,
              ":data",
              vx_data_file.f_file_from_path(image)
            )})
          )
        )
        return vx_core.f_new({"any-1": vx_ui_ui.t_uilist}, uiimage1, uiimage2)
      })
    )
    return output
  }

  /**
   * @function uilist_from_item_parent
   * Returns a list of child ui from a item/parent
   * @param  {item} item
   * @param  {string} parent
   * @return {uilist}
   */
  static t_uilist_from_item_parent = {
    vx_type: vx_core.t_type
  }
  static e_uilist_from_item_parent = {
    vx_type: nx_tactics_ui_uitactics.t_uilist_from_item_parent
  }

  // (func uilist<-item-parent)
  static f_uilist_from_item_parent(item, parent) {
    let output = vx_ui_ui.e_uilist
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_uilist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":name")
        const titles = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":titles")
        const image = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":image")
        const value = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":value")
        const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":summary")
        const body = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":body")
        const bodydetail = nx_tactics_ui_uitactics.f_string_from_mass_h_l_w(
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":mass"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":height"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":length"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":width")
        )
        const prefix = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/", name)
        const detail = nx_tactics_ui_uitactics.f_string_display_from_item(item)
        const uiimage = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(image)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/image"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_image,
              ":data",
              vx_data_file.f_file_from_path(image)
            )})
          )
        )
        const uivalue = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(value)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/value"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_value,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_header1
              ),
              ":data",
              value
            )})
          )
        )
        const uititles = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(titles)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/titles"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_titles,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text
              ),
              ":data",
              titles
            )})
          )
        )
        const uibody = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(body)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/body"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_body,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_header1
              ),
              ":data",
              body
            )})
          )
        )
        const uibodydetail = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(bodydetail)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/bodydetail"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_bodydetail,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_2
              ),
              ":data",
              bodydetail
            )})
          )
        )
        const uidetail = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(detail)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/detail"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_detail,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_textarea
              ),
              ":data",
              detail
            )})
          )
        )
        return vx_core.f_new({"any-1": vx_ui_ui.t_uilist}, uiimage, uivalue, uititles, uibody, uibodydetail, uidetail)
      })
    )
    return output
  }

  /**
   * @function uilist_from_place_parent
   * Returns a list of child ui from a place/parent
   * @param  {place} place
   * @param  {string} parent
   * @return {uilist}
   */
  static t_uilist_from_place_parent = {
    vx_type: vx_core.t_type
  }
  static e_uilist_from_place_parent = {
    vx_type: nx_tactics_ui_uitactics.t_uilist_from_place_parent
  }

  // (func uilist<-place-parent)
  static f_uilist_from_place_parent(place, parent) {
    let output = vx_ui_ui.e_uilist
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_uilist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_place}, place, ":name")
        const titles = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_place}, place, ":titles")
        const image = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_place}, place, ":image")
        const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_place}, place, ":summary")
        const prefix = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/", name)
        const detail = summary
        const uiimage = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(image)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/image"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_place_image,
              ":data",
              vx_data_file.f_file_from_path(image)
            )})
          )
        )
        const uititles = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(titles)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/titles"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_titles,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text
              ),
              ":data",
              titles
            )})
          )
        )
        const uidetail = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(detail)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/detail"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_place_detail,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_textarea
              ),
              ":data",
              detail
            )})
          )
        )
        return vx_core.f_new({"any-1": vx_ui_ui.t_uilist}, uiimage, uititles, uidetail)
      })
    )
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
        vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_is_empty_1(ranksuitarg)}),
        vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_empty(
          nx_tactics_base.t_ranksuit
        )})
      ),
      vx_core.f_else(
        vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_uilist},
          [],
          vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
            const rank = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_rank, "struct-2": nx_tactics_base.t_ranksuit}, ranksuitarg, ":rank")
            const suit = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_suit, "struct-2": nx_tactics_base.t_ranksuit}, ranksuitarg, ":suit")
            const labelrank1 = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/rank1")
            const labelrank2 = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/rank2")
            const labelsuit1 = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/suit1")
            const labelsuit2 = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/suit2")
            const srank = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_rank}, rank, ":titles")
            const ssuit = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_suit}, suit, ":titles")
            const uisuit1 = nx_tactics_ui_uitactics.f_ui_suit_from_uid_rank_suit_pos(parent, rank, suit, 1)
            const uisuit2 = nx_tactics_ui_uitactics.f_ui_suit_from_uid_rank_suit_pos(parent, rank, suit, 2)
            return vx_core.f_new(
              {"any-1": vx_ui_ui.t_uilist},
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_ui},
                ":uid",
                labelrank1,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_rank,
                ":stylelist",
                vx_core.f_new(
                  {"any-1": vx_ui_ui.t_stylelist},
                  nx_tactics_ui_stylesheet.c_style_text_rank1
                ),
                ":data",
                srank
              ),
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_ui},
                ":uid",
                labelrank2,
                ":style",
                nx_tactics_ui_stylesheet.c_style_card_rank,
                ":stylelist",
                vx_core.f_new(
                  {"any-1": vx_ui_ui.t_stylelist},
                  nx_tactics_ui_stylesheet.c_style_text_rank2
                ),
                ":data",
                srank
              ),
              uisuit1,
              uisuit2
            )
          })
        )})
      )
    )
    return output
  }

  /**
   * @function uilist_from_unit_parent
   * Returns a list of child ui from an unit/parent
   * @param  {unit} unit
   * @param  {string} parent
   * @return {uilist}
   */
  static t_uilist_from_unit_parent = {
    vx_type: vx_core.t_type
  }
  static e_uilist_from_unit_parent = {
    vx_type: nx_tactics_ui_uitactics.t_uilist_from_unit_parent
  }

  // (func uilist<-unit-parent)
  static f_uilist_from_unit_parent(unit, parent) {
    let output = vx_ui_ui.e_uilist
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_uilist},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":name")
        const titles = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":titles")
        const image = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":image")
        const value = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":value")
        const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":summary")
        const body = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":body")
        const bodydetail = nx_tactics_ui_uitactics.f_string_from_mass_h_l_w(
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":mass"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":height"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":length"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":width")
        )
        const mind = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":mind")
        const minddetail = nx_tactics_ui_uitactics.f_string_from_demeanor_nature(
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":demeanor"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":nature")
        )
        const will = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":will")
        const willdetail = nx_tactics_ui_uitactics.f_string_from_conscience_beast_shadow(
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":conscience"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":beast"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":shadow")
        )
        const speed = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":speed")
        const speeddetail = nx_tactics_ui_uitactics.f_string_from_land_water_air_space(
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":speedland"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":speedwater"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":speedair"),
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":speedspace")
        )
        const detail = nx_tactics_ui_uitactics.f_string_display_from_unit(unit)
        const prefix = vx_core.f_new({"any-1": vx_core.t_string}, parent, "/", name)
        const uiimage = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(image)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/image"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_image,
              ":data",
              vx_data_file.f_file_from_path(image)
            )})
          )
        )
        const uivalue = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(value)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/value"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_value,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_header1
              ),
              ":data",
              value
            )})
          )
        )
        const uititles = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(titles)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/titles"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_titles,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text
              ),
              ":data",
              titles
            )})
          )
        )
        const uibody = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(body)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/body"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_body,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_header1
              ),
              ":data",
              body
            )})
          )
        )
        const uibodydetail = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(bodydetail)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/bodydetail"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_bodydetail,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_2
              ),
              ":data",
              bodydetail
            )})
          )
        )
        const uimind = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(mind)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/mind"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_mind,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_header1
              ),
              ":data",
              mind
            )})
          )
        )
        const uiminddetail = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(minddetail)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/minddetail"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_minddetail,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_2
              ),
              ":data",
              minddetail
            )})
          )
        )
        const uiwill = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(will)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/will"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_will,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_header1
              ),
              ":data",
              will
            )})
          )
        )
        const uiwilldetail = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(willdetail)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/willdetail"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_willdetail,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_2
              ),
              ":data",
              willdetail
            )})
          )
        )
        const uispeed = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(speed)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/speed"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_speed,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_header1
              ),
              ":data",
              speed
            )})
          )
        )
        const uispeeddetail = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(speeddetail)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/speeddetail"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_speeddetail,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_text_2
              ),
              ":data",
              speeddetail
            )})
          )
        )
        const uidetail = vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_ui},
          vx_core.f_then(
            vx_core.f_new_from_type(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty(detail)}),
            vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return vx_core.f_new(
              {"any-1": vx_ui_ui.t_ui},
              ":uid",
              vx_core.f_new({"any-1": vx_core.t_string}, prefix, "/detail"),
              ":style",
              nx_tactics_ui_stylesheet.c_style_unit_detail,
              ":stylelist",
              vx_core.f_new(
                {"any-1": vx_ui_ui.t_stylelist},
                nx_tactics_ui_stylesheet.c_style_textarea
              ),
              ":data",
              detail
            )})
          )
        )
        return vx_core.f_new({"any-1": vx_ui_ui.t_uilist}, uiimage, uivalue, uititles, uibody, uibodydetail, uimind, uiminddetail, uiwill, uiwilldetail, uispeed, uispeeddetail, uidetail)
      })
    )
    return output
  }

  /**
   * @function uimap_from_cardmap_parent_page_size
   * Returns a uimap given a cardmap
   * @param  {cardmap} cardmap
   * @param  {string} parent
   * @param  {int} page
   * @param  {int} size
   * @return {uimap}
   */
  static t_uimap_from_cardmap_parent_page_size = {
    vx_type: vx_core.t_type
  }
  static e_uimap_from_cardmap_parent_page_size = {
    vx_type: nx_tactics_ui_uitactics.t_uimap_from_cardmap_parent_page_size
  }

  // (func uimap<-cardmap-parent-page-size)
  static f_uimap_from_cardmap_parent_page_size(cardmap, parent, page, size) {
    let output = vx_ui_ui.e_uimap
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_uimap},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const uilist = vx_core.f_list_from_map_1(
          {"any-1": vx_ui_ui.t_ui, "any-2": nx_tactics_base.t_card, "list-1": vx_ui_ui.t_uilist, "map-2": nx_tactics_base.t_cardmap},
          cardmap,
          vx_core.f_new_from_type(vx_core.t_any_from_key_value, ([key, card]) => 
            nx_tactics_ui_uitactics.f_ui_from_card_parent(card, parent))
        )
        return vx_ui_ui.f_uimap_from_uilist(uilist)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "event-navigate-card-click": nx_tactics_ui_uitactics.c_event_navigate_card_click,
      "event-printbutton-click": nx_tactics_ui_uitactics.c_event_printbutton_click,
      "eventmap-app-home-card": nx_tactics_ui_uitactics.c_eventmap_app_home_card
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "event-navigate-card-click<-event": nx_tactics_ui_uitactics.e_event_navigate_card_click_from_event,
      "event-printbutton-click<-event": nx_tactics_ui_uitactics.e_event_printbutton_click_from_event,
      "string-display<-any": nx_tactics_ui_uitactics.e_string_display_from_any,
      "string-display<-book": nx_tactics_ui_uitactics.e_string_display_from_book,
      "string-display<-deck": nx_tactics_ui_uitactics.e_string_display_from_deck,
      "string-display<-item": nx_tactics_ui_uitactics.e_string_display_from_item,
      "string-display<-power": nx_tactics_ui_uitactics.e_string_display_from_power,
      "string-display<-skill": nx_tactics_ui_uitactics.e_string_display_from_skill,
      "string-display<-unit": nx_tactics_ui_uitactics.e_string_display_from_unit,
      "string-display<-unitpower": nx_tactics_ui_uitactics.e_string_display_from_unitpower,
      "string-display<-unitskill": nx_tactics_ui_uitactics.e_string_display_from_unitskill,
      "string<-conscience-beast-shadow": nx_tactics_ui_uitactics.e_string_from_conscience_beast_shadow,
      "string<-demeanor-nature": nx_tactics_ui_uitactics.e_string_from_demeanor_nature,
      "string<-land-water-air-space": nx_tactics_ui_uitactics.e_string_from_land_water_air_space,
      "string<-mass-h-l-w": nx_tactics_ui_uitactics.e_string_from_mass_h_l_w,
      "stringlist-display<-unitabilitymap": nx_tactics_ui_uitactics.e_stringlist_display_from_unitabilitymap,
      "stringlist-display<-unititemmap": nx_tactics_ui_uitactics.e_stringlist_display_from_unititemmap,
      "stringlist-display<-unitpowermap": nx_tactics_ui_uitactics.e_stringlist_display_from_unitpowermap,
      "stringlist-display<-unitskillmap": nx_tactics_ui_uitactics.e_stringlist_display_from_unitskillmap,
      "stringlist-display<-unitspecialtymap": nx_tactics_ui_uitactics.e_stringlist_display_from_unitspecialtymap,
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
      "ui-app-titlebar-title": nx_tactics_ui_uitactics.e_ui_app_titlebar_title,
      "ui-app<-tactics": nx_tactics_ui_uitactics.e_ui_app_from_tactics,
      "ui-image<-uid-path": nx_tactics_ui_uitactics.e_ui_image_from_uid_path,
      "ui-nav<-any-parent": nx_tactics_ui_uitactics.e_ui_nav_from_any_parent,
      "ui-nav<-deck-parent": nx_tactics_ui_uitactics.e_ui_nav_from_deck_parent,
      "ui-nav<-power-parent": nx_tactics_ui_uitactics.e_ui_nav_from_power_parent,
      "ui-nav<-skill-parent": nx_tactics_ui_uitactics.e_ui_nav_from_skill_parent,
      "ui-navbutton-back": nx_tactics_ui_uitactics.e_ui_navbutton_back,
      "ui-navigate<-ui": nx_tactics_ui_uitactics.e_ui_navigate_from_ui,
      "ui-navigate<-ui-main": nx_tactics_ui_uitactics.e_ui_navigate_from_ui_main,
      "ui-navigate<-ui-navbar": nx_tactics_ui_uitactics.e_ui_navigate_from_ui_navbar,
      "ui-suit<-uid-rank-suit-pos": nx_tactics_ui_uitactics.e_ui_suit_from_uid_rank_suit_pos,
      "ui-title1<-uid-text": nx_tactics_ui_uitactics.e_ui_title1_from_uid_text,
      "ui-title2<-uid-text": nx_tactics_ui_uitactics.e_ui_title2_from_uid_text,
      "ui<-any-parent": nx_tactics_ui_uitactics.e_ui_from_any_parent,
      "ui<-card-parent": nx_tactics_ui_uitactics.e_ui_from_card_parent,
      "uilist<-card-parent": nx_tactics_ui_uitactics.e_uilist_from_card_parent,
      "uilist<-cardimage-parent": nx_tactics_ui_uitactics.e_uilist_from_cardimage_parent,
      "uilist<-item-parent": nx_tactics_ui_uitactics.e_uilist_from_item_parent,
      "uilist<-place-parent": nx_tactics_ui_uitactics.e_uilist_from_place_parent,
      "uilist<-ranksuit-parent": nx_tactics_ui_uitactics.e_uilist_from_ranksuit_parent,
      "uilist<-unit-parent": nx_tactics_ui_uitactics.e_uilist_from_unit_parent,
      "uimap<-cardmap-parent-page-size": nx_tactics_ui_uitactics.e_uimap_from_cardmap_parent_page_size
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "event-navigate-card-click<-event": nx_tactics_ui_uitactics.t_event_navigate_card_click_from_event,
      "event-printbutton-click<-event": nx_tactics_ui_uitactics.t_event_printbutton_click_from_event,
      "string-display<-any": nx_tactics_ui_uitactics.t_string_display_from_any,
      "string-display<-book": nx_tactics_ui_uitactics.t_string_display_from_book,
      "string-display<-deck": nx_tactics_ui_uitactics.t_string_display_from_deck,
      "string-display<-item": nx_tactics_ui_uitactics.t_string_display_from_item,
      "string-display<-power": nx_tactics_ui_uitactics.t_string_display_from_power,
      "string-display<-skill": nx_tactics_ui_uitactics.t_string_display_from_skill,
      "string-display<-unit": nx_tactics_ui_uitactics.t_string_display_from_unit,
      "string-display<-unitpower": nx_tactics_ui_uitactics.t_string_display_from_unitpower,
      "string-display<-unitskill": nx_tactics_ui_uitactics.t_string_display_from_unitskill,
      "string<-conscience-beast-shadow": nx_tactics_ui_uitactics.t_string_from_conscience_beast_shadow,
      "string<-demeanor-nature": nx_tactics_ui_uitactics.t_string_from_demeanor_nature,
      "string<-land-water-air-space": nx_tactics_ui_uitactics.t_string_from_land_water_air_space,
      "string<-mass-h-l-w": nx_tactics_ui_uitactics.t_string_from_mass_h_l_w,
      "stringlist-display<-unitabilitymap": nx_tactics_ui_uitactics.t_stringlist_display_from_unitabilitymap,
      "stringlist-display<-unititemmap": nx_tactics_ui_uitactics.t_stringlist_display_from_unititemmap,
      "stringlist-display<-unitpowermap": nx_tactics_ui_uitactics.t_stringlist_display_from_unitpowermap,
      "stringlist-display<-unitskillmap": nx_tactics_ui_uitactics.t_stringlist_display_from_unitskillmap,
      "stringlist-display<-unitspecialtymap": nx_tactics_ui_uitactics.t_stringlist_display_from_unitspecialtymap,
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
      "ui-app-titlebar-title": nx_tactics_ui_uitactics.t_ui_app_titlebar_title,
      "ui-app<-tactics": nx_tactics_ui_uitactics.t_ui_app_from_tactics,
      "ui-image<-uid-path": nx_tactics_ui_uitactics.t_ui_image_from_uid_path,
      "ui-nav<-any-parent": nx_tactics_ui_uitactics.t_ui_nav_from_any_parent,
      "ui-nav<-deck-parent": nx_tactics_ui_uitactics.t_ui_nav_from_deck_parent,
      "ui-nav<-power-parent": nx_tactics_ui_uitactics.t_ui_nav_from_power_parent,
      "ui-nav<-skill-parent": nx_tactics_ui_uitactics.t_ui_nav_from_skill_parent,
      "ui-navbutton-back": nx_tactics_ui_uitactics.t_ui_navbutton_back,
      "ui-navigate<-ui": nx_tactics_ui_uitactics.t_ui_navigate_from_ui,
      "ui-navigate<-ui-main": nx_tactics_ui_uitactics.t_ui_navigate_from_ui_main,
      "ui-navigate<-ui-navbar": nx_tactics_ui_uitactics.t_ui_navigate_from_ui_navbar,
      "ui-suit<-uid-rank-suit-pos": nx_tactics_ui_uitactics.t_ui_suit_from_uid_rank_suit_pos,
      "ui-title1<-uid-text": nx_tactics_ui_uitactics.t_ui_title1_from_uid_text,
      "ui-title2<-uid-text": nx_tactics_ui_uitactics.t_ui_title2_from_uid_text,
      "ui<-any-parent": nx_tactics_ui_uitactics.t_ui_from_any_parent,
      "ui<-card-parent": nx_tactics_ui_uitactics.t_ui_from_card_parent,
      "uilist<-card-parent": nx_tactics_ui_uitactics.t_uilist_from_card_parent,
      "uilist<-cardimage-parent": nx_tactics_ui_uitactics.t_uilist_from_cardimage_parent,
      "uilist<-item-parent": nx_tactics_ui_uitactics.t_uilist_from_item_parent,
      "uilist<-place-parent": nx_tactics_ui_uitactics.t_uilist_from_place_parent,
      "uilist<-ranksuit-parent": nx_tactics_ui_uitactics.t_uilist_from_ranksuit_parent,
      "uilist<-unit-parent": nx_tactics_ui_uitactics.t_uilist_from_unit_parent,
      "uimap<-cardmap-parent-page-size": nx_tactics_ui_uitactics.t_uimap_from_cardmap_parent_page_size
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_ui_uitactics.f_string_display_from_deck
    }

    // (func string-display<-item)
    nx_tactics_ui_uitactics.t_string_display_from_item['vx_value'] = {
      name          : "string-display<-item",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_display_from_item
    }

    // (func string-display<-power)
    nx_tactics_ui_uitactics.t_string_display_from_power['vx_value'] = {
      name          : "string-display<-power",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_display_from_power
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_ui_uitactics.f_string_display_from_skill
    }

    // (func string-display<-unit)
    nx_tactics_ui_uitactics.t_string_display_from_unit['vx_value'] = {
      name          : "string-display<-unit",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_display_from_unit
    }

    // (func string-display<-unitpower)
    nx_tactics_ui_uitactics.t_string_display_from_unitpower['vx_value'] = {
      name          : "string-display<-unitpower",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_display_from_unitpower
    }

    // (func string-display<-unitskill)
    nx_tactics_ui_uitactics.t_string_display_from_unitskill['vx_value'] = {
      name          : "string-display<-unitskill",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_display_from_unitskill
    }

    // (func string<-conscience-beast-shadow)
    nx_tactics_ui_uitactics.t_string_from_conscience_beast_shadow['vx_value'] = {
      name          : "string<-conscience-beast-shadow",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_from_conscience_beast_shadow
    }

    // (func string<-demeanor-nature)
    nx_tactics_ui_uitactics.t_string_from_demeanor_nature['vx_value'] = {
      name          : "string<-demeanor-nature",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_from_demeanor_nature
    }

    // (func string<-land-water-air-space)
    nx_tactics_ui_uitactics.t_string_from_land_water_air_space['vx_value'] = {
      name          : "string<-land-water-air-space",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_from_land_water_air_space
    }

    // (func string<-mass-h-l-w)
    nx_tactics_ui_uitactics.t_string_from_mass_h_l_w['vx_value'] = {
      name          : "string<-mass-h-l-w",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_string_from_mass_h_l_w
    }

    // (func stringlist-display<-unitabilitymap)
    nx_tactics_ui_uitactics.t_stringlist_display_from_unitabilitymap['vx_value'] = {
      name          : "stringlist-display<-unitabilitymap",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_stringlist_display_from_unitabilitymap
    }

    // (func stringlist-display<-unititemmap)
    nx_tactics_ui_uitactics.t_stringlist_display_from_unititemmap['vx_value'] = {
      name          : "stringlist-display<-unititemmap",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_stringlist_display_from_unititemmap
    }

    // (func stringlist-display<-unitpowermap)
    nx_tactics_ui_uitactics.t_stringlist_display_from_unitpowermap['vx_value'] = {
      name          : "stringlist-display<-unitpowermap",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_stringlist_display_from_unitpowermap
    }

    // (func stringlist-display<-unitskillmap)
    nx_tactics_ui_uitactics.t_stringlist_display_from_unitskillmap['vx_value'] = {
      name          : "stringlist-display<-unitskillmap",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_stringlist_display_from_unitskillmap
    }

    // (func stringlist-display<-unitspecialtymap)
    nx_tactics_ui_uitactics.t_stringlist_display_from_unitspecialtymap['vx_value'] = {
      name          : "stringlist-display<-unitspecialtymap",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_stringlist_display_from_unitspecialtymap
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_ui_uitactics.f_ui_app_titlebar_print
    }

    // (func ui-app-titlebar-title)
    nx_tactics_ui_uitactics.t_ui_app_titlebar_title['vx_value'] = {
      name          : "ui-app-titlebar-title",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_app_titlebar_title
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_ui_uitactics.f_ui_app_from_tactics
    }

    // (func ui-image<-uid-path)
    nx_tactics_ui_uitactics.t_ui_image_from_uid_path['vx_value'] = {
      name          : "ui-image<-uid-path",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_image_from_uid_path
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_ui_uitactics.f_ui_nav_from_deck_parent
    }

    // (func ui-nav<-power-parent)
    nx_tactics_ui_uitactics.t_ui_nav_from_power_parent['vx_value'] = {
      name          : "ui-nav<-power-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_nav_from_power_parent
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_ui_uitactics.f_ui_navigate_from_ui_navbar
    }

    // (func ui-suit<-uid-rank-suit-pos)
    nx_tactics_ui_uitactics.t_ui_suit_from_uid_rank_suit_pos['vx_value'] = {
      name          : "ui-suit<-uid-rank-suit-pos",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_suit_from_uid_rank_suit_pos
    }

    // (func ui-title1<-uid-text)
    nx_tactics_ui_uitactics.t_ui_title1_from_uid_text['vx_value'] = {
      name          : "ui-title1<-uid-text",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_title1_from_uid_text
    }

    // (func ui-title2<-uid-text)
    nx_tactics_ui_uitactics.t_ui_title2_from_uid_text['vx_value'] = {
      name          : "ui-title2<-uid-text",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_ui_title2_from_uid_text
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_ui_uitactics.f_ui_from_card_parent
    }

    // (func uilist<-card-parent)
    nx_tactics_ui_uitactics.t_uilist_from_card_parent['vx_value'] = {
      name          : "uilist<-card-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_uilist_from_card_parent
    }

    // (func uilist<-cardimage-parent)
    nx_tactics_ui_uitactics.t_uilist_from_cardimage_parent['vx_value'] = {
      name          : "uilist<-cardimage-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_uilist_from_cardimage_parent
    }

    // (func uilist<-item-parent)
    nx_tactics_ui_uitactics.t_uilist_from_item_parent['vx_value'] = {
      name          : "uilist<-item-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_uilist_from_item_parent
    }

    // (func uilist<-place-parent)
    nx_tactics_ui_uitactics.t_uilist_from_place_parent['vx_value'] = {
      name          : "uilist<-place-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_uilist_from_place_parent
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_ui_uitactics.f_uilist_from_ranksuit_parent
    }

    // (func uilist<-unit-parent)
    nx_tactics_ui_uitactics.t_uilist_from_unit_parent['vx_value'] = {
      name          : "uilist<-unit-parent",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_uilist_from_unit_parent
    }

    // (func uimap<-cardmap-parent-page-size)
    nx_tactics_ui_uitactics.t_uimap_from_cardmap_parent_page_size['vx_value'] = {
      name          : "uimap<-cardmap-parent-page-size",
      pkgname       : "nx/tactics/ui/uitactics",
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
      fn            : nx_tactics_ui_uitactics.f_uimap_from_cardmap_parent_page_size
    }

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
        {"any-1": vx_event.t_eventlist},
        nx_tactics_ui_uitactics.c_event_navigate_card_click
      )
    ))

  }
}
