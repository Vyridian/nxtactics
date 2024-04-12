'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_data_file from "../../../vx/data/file.js"
import vx_ui_ui from "../../../vx/ui/ui.js"


export default class nx_tactics_ui_stylesheet {

  /**
   * Constant: font-header1
   * Returns Header1 Font
   * {font}
   */
  static c_font_header1 = {vx_type: vx_ui_ui.t_font, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'font-header1'}}

  /**
   * Constant: font-header2
   * Returns Header2 Font
   * {font}
   */
  static c_font_header2 = {vx_type: vx_ui_ui.t_font, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'font-header2'}}

  /**
   * Constant: font-label
   * Returns Label Font
   * {font}
   */
  static c_font_label = {vx_type: vx_ui_ui.t_font, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'font-label'}}

  /**
   * Constant: font-rank
   * Returns Normal text Font
   * {font}
   */
  static c_font_rank = {vx_type: vx_ui_ui.t_font, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'font-rank'}}

  /**
   * Constant: font-text
   * Returns Normal text Font
   * {font}
   */
  static c_font_text = {vx_type: vx_ui_ui.t_font, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'font-text'}}

  /**
   * Constant: font-text-2
   * Returns Normal text Font
   * {font}
   */
  static c_font_text_2 = {vx_type: vx_ui_ui.t_font, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'font-text-2'}}

  /**
   * Constant: font-textarea
   * Returns Textarea Font
   * {font}
   */
  static c_font_textarea = {vx_type: vx_ui_ui.t_font, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'font-textarea'}}

  /**
   * Constant: font-title
   * Returns Title Font
   * {font}
   */
  static c_font_title = {vx_type: vx_ui_ui.t_font, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'font-title'}}

  /**
   * Constant: fontface1
   * Returns Fontface1
   * {fontface}
   */
  static c_fontface1 = {vx_type: vx_ui_ui.t_fontface, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'fontface1'}}

  /**
   * Constant: fontface2
   * Returns Fontface2
   * {fontface}
   */
  static c_fontface2 = {vx_type: vx_ui_ui.t_fontface, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'fontface2'}}

  /**
   * Constant: fontface3
   * Returns Fontface3
   * {fontface}
   */
  static c_fontface3 = {vx_type: vx_ui_ui.t_fontface, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'fontface3'}}

  /**
   * Constant: image-jester-black
   * {image}
   */
  static c_image_jester_black = {vx_type: vx_ui_ui.t_image, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'image-jester-black'}}

  /**
   * Constant: image-jester-red
   * {image}
   */
  static c_image_jester_red = {vx_type: vx_ui_ui.t_image, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'image-jester-red'}}

  /**
   * Constant: point-cardsize
   * {point}
   */
  static c_point_cardsize = {vx_type: vx_ui_ui.t_point, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'point-cardsize'}}

  /**
   * Constant: point-iconsize
   * {point}
   */
  static c_point_iconsize = {vx_type: vx_ui_ui.t_point, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'point-iconsize'}}

  /**
   * Constant: point-rank-pos1
   * {point}
   */
  static c_point_rank_pos1 = {vx_type: vx_ui_ui.t_point, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'point-rank-pos1'}}

  /**
   * Constant: point-rank-pos2
   * {point}
   */
  static c_point_rank_pos2 = {vx_type: vx_ui_ui.t_point, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'point-rank-pos2'}}

  /**
   * Constant: point-rank-size
   * {point}
   */
  static c_point_rank_size = {vx_type: vx_ui_ui.t_point, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'point-rank-size'}}

  /**
   * Constant: point-suit-pos1
   * {point}
   */
  static c_point_suit_pos1 = {vx_type: vx_ui_ui.t_point, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'point-suit-pos1'}}

  /**
   * Constant: point-suit-pos2
   * {point}
   */
  static c_point_suit_pos2 = {vx_type: vx_ui_ui.t_point, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'point-suit-pos2'}}

  /**
   * Constant: point-suit-size
   * {point}
   */
  static c_point_suit_size = {vx_type: vx_ui_ui.t_point, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'point-suit-size'}}

  /**
   * Constant: style-app
   * Returns the style for app ui.
   * {style}
   */
  static c_style_app = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app'}}

  /**
   * Constant: style-app-background
   * Returns the style for app ui.
   * {style}
   */
  static c_style_app_background = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-background'}}

  /**
   * Constant: style-app-main
   * {style}
   */
  static c_style_app_main = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-main'}}

  /**
   * Constant: style-app-menubar
   * {style}
   */
  static c_style_app_menubar = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-menubar'}}

  /**
   * Constant: style-app-menudrawer
   * {style}
   */
  static c_style_app_menudrawer = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-menudrawer'}}

  /**
   * Constant: style-app-msgbox
   * {style}
   */
  static c_style_app_msgbox = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-msgbox'}}

  /**
   * Constant: style-app-navbar
   * {style}
   */
  static c_style_app_navbar = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-navbar'}}

  /**
   * Constant: style-app-navbar-button
   * {style}
   */
  static c_style_app_navbar_button = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-navbar-button'}}

  /**
   * Constant: style-app-navdrawer
   * {style}
   */
  static c_style_app_navdrawer = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-navdrawer'}}

  /**
   * Constant: style-app-parallax
   * {style}
   */
  static c_style_app_parallax = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-parallax'}}

  /**
   * Constant: style-app-statusbar
   * {style}
   */
  static c_style_app_statusbar = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-statusbar'}}

  /**
   * Constant: style-app-statusdrawer
   * {style}
   */
  static c_style_app_statusdrawer = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-statusdrawer'}}

  /**
   * Constant: style-app-titlebar
   * {style}
   */
  static c_style_app_titlebar = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-titlebar'}}

  /**
   * Constant: style-app-titlebar-print
   * {style}
   */
  static c_style_app_titlebar_print = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-app-titlebar-print'}}

  /**
   * Constant: style-body
   * Returns the style for app ui.
   * {style}
   */
  static c_style_body = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-body'}}

  /**
   * Constant: style-button-back
   * {style}
   */
  static c_style_button_back = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-button-back'}}

  /**
   * Constant: style-card
   * {style}
   */
  static c_style_card = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-card'}}

  /**
   * Constant: style-card-display
   * {style}
   */
  static c_style_card_display = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-card-display'}}

  /**
   * Constant: style-card-display2
   * {style}
   */
  static c_style_card_display2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-card-display2'}}

  /**
   * Constant: style-card-display3
   * {style}
   */
  static c_style_card_display3 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-card-display3'}}

  /**
   * Constant: style-card-display4
   * {style}
   */
  static c_style_card_display4 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-card-display4'}}

  /**
   * Constant: style-card-rank
   * {style}
   */
  static c_style_card_rank = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-card-rank'}}

  /**
   * Constant: style-card-suit
   * {style}
   */
  static c_style_card_suit = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-card-suit'}}

  /**
   * Constant: style-card-title1
   * {style}
   */
  static c_style_card_title1 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-card-title1'}}

  /**
   * Constant: style-card-title2
   * {style}
   */
  static c_style_card_title2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-card-title2'}}

  /**
   * Constant: style-clickable
   * Returns the style for clickable class.
   * {style}
   */
  static c_style_clickable = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-clickable'}}

  /**
   * Constant: style-deck
   * Returns the style for deck.
   * {style}
   */
  static c_style_deck = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-deck'}}

  /**
   * Constant: style-div
   * Returns the style for app ui.
   * {style}
   */
  static c_style_div = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-div'}}

  /**
   * Constant: style-hidden
   * {style}
   */
  static c_style_hidden = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-hidden'}}

  /**
   * Constant: style-html
   * Returns the style for app ui.
   * {style}
   */
  static c_style_html = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-html'}}

  /**
   * Constant: style-image-background
   * {style}
   */
  static c_style_image_background = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-background'}}

  /**
   * Constant: style-image-coin1
   * {style}
   */
  static c_style_image_coin1 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-coin1'}}

  /**
   * Constant: style-image-coin2
   * {style}
   */
  static c_style_image_coin2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-coin2'}}

  /**
   * Constant: style-image-cup1
   * {style}
   */
  static c_style_image_cup1 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-cup1'}}

  /**
   * Constant: style-image-cup2
   * {style}
   */
  static c_style_image_cup2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-cup2'}}

  /**
   * Constant: style-image-jester-black1
   * {style}
   */
  static c_style_image_jester_black1 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-jester-black1'}}

  /**
   * Constant: style-image-jester-black2
   * {style}
   */
  static c_style_image_jester_black2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-jester-black2'}}

  /**
   * Constant: style-image-jester-red1
   * {style}
   */
  static c_style_image_jester_red1 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-jester-red1'}}

  /**
   * Constant: style-image-jester-red2
   * {style}
   */
  static c_style_image_jester_red2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-jester-red2'}}

  /**
   * Constant: style-image-sword1
   * {style}
   */
  static c_style_image_sword1 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-sword1'}}

  /**
   * Constant: style-image-sword2
   * {style}
   */
  static c_style_image_sword2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-sword2'}}

  /**
   * Constant: style-image-wand1
   * {style}
   */
  static c_style_image_wand1 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-wand1'}}

  /**
   * Constant: style-image-wand2
   * {style}
   */
  static c_style_image_wand2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-image-wand2'}}

  /**
   * Constant: style-item-summary
   * {style}
   */
  static c_style_item_summary = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-item-summary'}}

  /**
   * Constant: style-selected
   * {style}
   */
  static c_style_selected = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-selected'}}

  /**
   * Constant: style-text
   * Returns the style for text area
   * {style}
   */
  static c_style_text = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-text'}}

  /**
   * Constant: style-text-2
   * Returns the style for text area
   * {style}
   */
  static c_style_text_2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-text-2'}}

  /**
   * Constant: style-text-header1
   * Returns the style for header1 text
   * {style}
   */
  static c_style_text_header1 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-text-header1'}}

  /**
   * Constant: style-text-header2
   * Returns the style for header2 text
   * {style}
   */
  static c_style_text_header2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-text-header2'}}

  /**
   * Constant: style-text-label
   * Returns the style for label text
   * {style}
   */
  static c_style_text_label = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-text-label'}}

  /**
   * Constant: style-text-rank1
   * Returns the style for label text
   * {style}
   */
  static c_style_text_rank1 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-text-rank1'}}

  /**
   * Constant: style-text-rank2
   * Returns the style for label text
   * {style}
   */
  static c_style_text_rank2 = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-text-rank2'}}

  /**
   * Constant: style-text-title
   * Returns the style for title text
   * {style}
   */
  static c_style_text_title = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-text-title'}}

  /**
   * Constant: style-textarea
   * Returns the style for text area
   * {style}
   */
  static c_style_textarea = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-textarea'}}

  /**
   * Constant: style-unit
   * Returns the style for unit ui.
   * {style}
   */
  static c_style_unit = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit'}}

  /**
   * Constant: style-unit-body
   * {style}
   */
  static c_style_unit_body = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-body'}}

  /**
   * Constant: style-unit-bodydetail
   * {style}
   */
  static c_style_unit_bodydetail = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-bodydetail'}}

  /**
   * Constant: style-unit-detail
   * {style}
   */
  static c_style_unit_detail = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-detail'}}

  /**
   * Constant: style-unit-image
   * {style}
   */
  static c_style_unit_image = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-image'}}

  /**
   * Constant: style-unit-mind
   * {style}
   */
  static c_style_unit_mind = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-mind'}}

  /**
   * Constant: style-unit-minddetail
   * {style}
   */
  static c_style_unit_minddetail = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-minddetail'}}

  /**
   * Constant: style-unit-move
   * {style}
   */
  static c_style_unit_move = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-move'}}

  /**
   * Constant: style-unit-movedetail
   * {style}
   */
  static c_style_unit_movedetail = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-movedetail'}}

  /**
   * Constant: style-unit-titles
   * Returns the style for unit titles text
   * {style}
   */
  static c_style_unit_titles = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-titles'}}

  /**
   * Constant: style-unit-value
   * {style}
   */
  static c_style_unit_value = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-value'}}

  /**
   * Constant: style-unit-will
   * {style}
   */
  static c_style_unit_will = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-will'}}

  /**
   * Constant: style-unit-willdetail
   * {style}
   */
  static c_style_unit_willdetail = {vx_type: vx_ui_ui.t_style, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'style-unit-willdetail'}}

  /**
   * Constant: stylesheet-app
   * Returns the stylesheet for this project
   * {stylesheet}
   */
  static c_stylesheet_app = {vx_type: vx_ui_ui.t_stylesheet, vx_constdef: {pkgname: 'nx/tactics/ui/stylesheet', name: 'stylesheet-app'}}



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "font-header1": nx_tactics_ui_stylesheet.c_font_header1,
      "font-header2": nx_tactics_ui_stylesheet.c_font_header2,
      "font-label": nx_tactics_ui_stylesheet.c_font_label,
      "font-rank": nx_tactics_ui_stylesheet.c_font_rank,
      "font-text": nx_tactics_ui_stylesheet.c_font_text,
      "font-text-2": nx_tactics_ui_stylesheet.c_font_text_2,
      "font-textarea": nx_tactics_ui_stylesheet.c_font_textarea,
      "font-title": nx_tactics_ui_stylesheet.c_font_title,
      "fontface1": nx_tactics_ui_stylesheet.c_fontface1,
      "fontface2": nx_tactics_ui_stylesheet.c_fontface2,
      "fontface3": nx_tactics_ui_stylesheet.c_fontface3,
      "image-jester-black": nx_tactics_ui_stylesheet.c_image_jester_black,
      "image-jester-red": nx_tactics_ui_stylesheet.c_image_jester_red,
      "point-cardsize": nx_tactics_ui_stylesheet.c_point_cardsize,
      "point-iconsize": nx_tactics_ui_stylesheet.c_point_iconsize,
      "point-rank-pos1": nx_tactics_ui_stylesheet.c_point_rank_pos1,
      "point-rank-pos2": nx_tactics_ui_stylesheet.c_point_rank_pos2,
      "point-rank-size": nx_tactics_ui_stylesheet.c_point_rank_size,
      "point-suit-pos1": nx_tactics_ui_stylesheet.c_point_suit_pos1,
      "point-suit-pos2": nx_tactics_ui_stylesheet.c_point_suit_pos2,
      "point-suit-size": nx_tactics_ui_stylesheet.c_point_suit_size,
      "style-app": nx_tactics_ui_stylesheet.c_style_app,
      "style-app-background": nx_tactics_ui_stylesheet.c_style_app_background,
      "style-app-main": nx_tactics_ui_stylesheet.c_style_app_main,
      "style-app-menubar": nx_tactics_ui_stylesheet.c_style_app_menubar,
      "style-app-menudrawer": nx_tactics_ui_stylesheet.c_style_app_menudrawer,
      "style-app-msgbox": nx_tactics_ui_stylesheet.c_style_app_msgbox,
      "style-app-navbar": nx_tactics_ui_stylesheet.c_style_app_navbar,
      "style-app-navbar-button": nx_tactics_ui_stylesheet.c_style_app_navbar_button,
      "style-app-navdrawer": nx_tactics_ui_stylesheet.c_style_app_navdrawer,
      "style-app-parallax": nx_tactics_ui_stylesheet.c_style_app_parallax,
      "style-app-statusbar": nx_tactics_ui_stylesheet.c_style_app_statusbar,
      "style-app-statusdrawer": nx_tactics_ui_stylesheet.c_style_app_statusdrawer,
      "style-app-titlebar": nx_tactics_ui_stylesheet.c_style_app_titlebar,
      "style-app-titlebar-print": nx_tactics_ui_stylesheet.c_style_app_titlebar_print,
      "style-body": nx_tactics_ui_stylesheet.c_style_body,
      "style-button-back": nx_tactics_ui_stylesheet.c_style_button_back,
      "style-card": nx_tactics_ui_stylesheet.c_style_card,
      "style-card-display": nx_tactics_ui_stylesheet.c_style_card_display,
      "style-card-display2": nx_tactics_ui_stylesheet.c_style_card_display2,
      "style-card-display3": nx_tactics_ui_stylesheet.c_style_card_display3,
      "style-card-display4": nx_tactics_ui_stylesheet.c_style_card_display4,
      "style-card-rank": nx_tactics_ui_stylesheet.c_style_card_rank,
      "style-card-suit": nx_tactics_ui_stylesheet.c_style_card_suit,
      "style-card-title1": nx_tactics_ui_stylesheet.c_style_card_title1,
      "style-card-title2": nx_tactics_ui_stylesheet.c_style_card_title2,
      "style-clickable": nx_tactics_ui_stylesheet.c_style_clickable,
      "style-deck": nx_tactics_ui_stylesheet.c_style_deck,
      "style-div": nx_tactics_ui_stylesheet.c_style_div,
      "style-hidden": nx_tactics_ui_stylesheet.c_style_hidden,
      "style-html": nx_tactics_ui_stylesheet.c_style_html,
      "style-image-background": nx_tactics_ui_stylesheet.c_style_image_background,
      "style-image-coin1": nx_tactics_ui_stylesheet.c_style_image_coin1,
      "style-image-coin2": nx_tactics_ui_stylesheet.c_style_image_coin2,
      "style-image-cup1": nx_tactics_ui_stylesheet.c_style_image_cup1,
      "style-image-cup2": nx_tactics_ui_stylesheet.c_style_image_cup2,
      "style-image-jester-black1": nx_tactics_ui_stylesheet.c_style_image_jester_black1,
      "style-image-jester-black2": nx_tactics_ui_stylesheet.c_style_image_jester_black2,
      "style-image-jester-red1": nx_tactics_ui_stylesheet.c_style_image_jester_red1,
      "style-image-jester-red2": nx_tactics_ui_stylesheet.c_style_image_jester_red2,
      "style-image-sword1": nx_tactics_ui_stylesheet.c_style_image_sword1,
      "style-image-sword2": nx_tactics_ui_stylesheet.c_style_image_sword2,
      "style-image-wand1": nx_tactics_ui_stylesheet.c_style_image_wand1,
      "style-image-wand2": nx_tactics_ui_stylesheet.c_style_image_wand2,
      "style-item-summary": nx_tactics_ui_stylesheet.c_style_item_summary,
      "style-selected": nx_tactics_ui_stylesheet.c_style_selected,
      "style-text": nx_tactics_ui_stylesheet.c_style_text,
      "style-text-2": nx_tactics_ui_stylesheet.c_style_text_2,
      "style-text-header1": nx_tactics_ui_stylesheet.c_style_text_header1,
      "style-text-header2": nx_tactics_ui_stylesheet.c_style_text_header2,
      "style-text-label": nx_tactics_ui_stylesheet.c_style_text_label,
      "style-text-rank1": nx_tactics_ui_stylesheet.c_style_text_rank1,
      "style-text-rank2": nx_tactics_ui_stylesheet.c_style_text_rank2,
      "style-text-title": nx_tactics_ui_stylesheet.c_style_text_title,
      "style-textarea": nx_tactics_ui_stylesheet.c_style_textarea,
      "style-unit": nx_tactics_ui_stylesheet.c_style_unit,
      "style-unit-body": nx_tactics_ui_stylesheet.c_style_unit_body,
      "style-unit-bodydetail": nx_tactics_ui_stylesheet.c_style_unit_bodydetail,
      "style-unit-detail": nx_tactics_ui_stylesheet.c_style_unit_detail,
      "style-unit-image": nx_tactics_ui_stylesheet.c_style_unit_image,
      "style-unit-mind": nx_tactics_ui_stylesheet.c_style_unit_mind,
      "style-unit-minddetail": nx_tactics_ui_stylesheet.c_style_unit_minddetail,
      "style-unit-move": nx_tactics_ui_stylesheet.c_style_unit_move,
      "style-unit-movedetail": nx_tactics_ui_stylesheet.c_style_unit_movedetail,
      "style-unit-titles": nx_tactics_ui_stylesheet.c_style_unit_titles,
      "style-unit-value": nx_tactics_ui_stylesheet.c_style_unit_value,
      "style-unit-will": nx_tactics_ui_stylesheet.c_style_unit_will,
      "style-unit-willdetail": nx_tactics_ui_stylesheet.c_style_unit_willdetail,
      "stylesheet-app": nx_tactics_ui_stylesheet.c_stylesheet_app
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/ui/stylesheet",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (const font-header1)
    Object.assign(nx_tactics_ui_stylesheet.c_font_header1, vx_core.f_new(
      vx_ui_ui.t_font,
      ":name",
      "font-header1",
      ":fontface",
      nx_tactics_ui_stylesheet.c_fontface1,
      ":fontsize",
      100
    ))

    // (const font-header2)
    Object.assign(nx_tactics_ui_stylesheet.c_font_header2, vx_core.f_new(
      vx_ui_ui.t_font,
      ":name",
      "font-header2",
      ":fontface",
      nx_tactics_ui_stylesheet.c_fontface1,
      ":fontsize",
      80
    ))

    // (const font-label)
    Object.assign(nx_tactics_ui_stylesheet.c_font_label, vx_core.f_new(
      vx_ui_ui.t_font,
      ":name",
      "font-label",
      ":fontface",
      nx_tactics_ui_stylesheet.c_fontface1,
      ":fontsize",
      60
    ))

    // (const font-rank)
    Object.assign(nx_tactics_ui_stylesheet.c_font_rank, vx_core.f_new(
      vx_ui_ui.t_font,
      ":name",
      "font-rank",
      ":fontface",
      nx_tactics_ui_stylesheet.c_fontface1,
      ":fontsize",
      120
    ))

    // (const font-text)
    Object.assign(nx_tactics_ui_stylesheet.c_font_text, vx_core.f_new(
      vx_ui_ui.t_font,
      ":name",
      "font-text",
      ":fontface",
      nx_tactics_ui_stylesheet.c_fontface1,
      ":fontsize",
      60
    ))

    // (const font-text-2)
    Object.assign(nx_tactics_ui_stylesheet.c_font_text_2, vx_core.f_new(
      vx_ui_ui.t_font,
      ":name",
      "font-text-2",
      ":fontface",
      nx_tactics_ui_stylesheet.c_fontface1,
      ":fontsize",
      30
    ))

    // (const font-textarea)
    Object.assign(nx_tactics_ui_stylesheet.c_font_textarea, vx_core.f_new(
      vx_ui_ui.t_font,
      ":name",
      "font-textarea",
      ":fontface",
      nx_tactics_ui_stylesheet.c_fontface1,
      ":fontsize",
      60
    ))

    // (const font-title)
    Object.assign(nx_tactics_ui_stylesheet.c_font_title, vx_core.f_new(
      vx_ui_ui.t_font,
      ":name",
      "font-title",
      ":fontface",
      nx_tactics_ui_stylesheet.c_fontface1,
      ":fontsize",
      160
    ))

    // (const fontface1)
    Object.assign(nx_tactics_ui_stylesheet.c_fontface1, vx_core.f_new(
      vx_ui_ui.t_fontface,
      ":name",
      "El Messiri",
      ":weight",
      "400 700",
      ":unicode",
      "U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+0304, U+0308, U+0329, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;",
      ":filelist",
      vx_core.f_new(
        vx_data_file.t_filelist,
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "K2F0fZBRmr9vQ1pHEey6Mo2AAg.woff2",
          ":path",
          "https://fonts.gstatic.com/s/elmessiri/v22"
        )
      )
    ))

    // (const fontface2)
    Object.assign(nx_tactics_ui_stylesheet.c_fontface2, vx_core.f_new(
      vx_ui_ui.t_fontface,
      ":name",
      "Cormorant Upright",
      ":weight",
      "300 400 500 600 700",
      ":unicode",
      "U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+0304, U+0308, U+0329, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;",
      ":filelist",
      vx_core.f_new(
        vx_data_file.t_filelist,
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "VuJudM3I2Y35poFONtLdafkUCHw1y1N5piDrWdQ.woff2",
          ":path",
          "https://fonts.gstatic.com/s/cormorantupright/v18"
        )
      )
    ))

    // (const fontface3)
    Object.assign(nx_tactics_ui_stylesheet.c_fontface3, vx_core.f_new(
      vx_ui_ui.t_fontface,
      ":name",
      "Carattere",
      ":weight",
      "400",
      ":unicode",
      "U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+0304, U+0308, U+0329, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;",
      ":filelist",
      vx_core.f_new(
        vx_data_file.t_filelist,
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "4iCv6Kp1b9dXlgt_CkvjsGyN.woff2",
          ":path",
          "https://fonts.gstatic.com/s/carattere/v7"
        )
      )
    ))

    // (const image-jester-black)
    Object.assign(nx_tactics_ui_stylesheet.c_image_jester_black, vx_core.f_new(
      vx_ui_ui.t_image,
      ":file",
      vx_core.f_new(
        vx_data_file.t_file,
        ":name",
        "icon-jester-black.svg",
        ":path",
        "icons"
      )
    ))

    // (const image-jester-red)
    Object.assign(nx_tactics_ui_stylesheet.c_image_jester_red, vx_core.f_new(
      vx_ui_ui.t_image,
      ":file",
      vx_core.f_new(
        vx_data_file.t_file,
        ":name",
        "icon-jester-red.svg",
        ":path",
        "icons"
      )
    ))

    // (const point-cardsize)
    Object.assign(nx_tactics_ui_stylesheet.c_point_cardsize, vx_core.f_new(
      vx_ui_ui.t_point,
      ":x",
      63,
      ":y",
      88
    ))

    // (const point-iconsize)
    Object.assign(nx_tactics_ui_stylesheet.c_point_iconsize, vx_core.f_new(
      vx_ui_ui.t_point,
      ":x",
      6,
      ":y",
      6
    ))

    // (const point-rank-pos1)
    Object.assign(nx_tactics_ui_stylesheet.c_point_rank_pos1, vx_core.f_new(
      vx_ui_ui.t_point,
      ":x",
      1,
      ":y",
      0
    ))

    // (const point-rank-pos2)
    Object.assign(nx_tactics_ui_stylesheet.c_point_rank_pos2, vx_core.f_new(
      vx_ui_ui.t_point,
      ":x",
      57,
      ":y",
      80
    ))

    // (const point-rank-size)
    Object.assign(nx_tactics_ui_stylesheet.c_point_rank_size, vx_core.f_new(
      vx_ui_ui.t_point,
      ":x",
      4,
      ":y",
      6
    ))

    // (const point-suit-pos1)
    Object.assign(nx_tactics_ui_stylesheet.c_point_suit_pos1, vx_core.f_new(
      vx_ui_ui.t_point,
      ":x",
      0,
      ":y",
      6
    ))

    // (const point-suit-pos2)
    Object.assign(nx_tactics_ui_stylesheet.c_point_suit_pos2, vx_core.f_new(
      vx_ui_ui.t_point,
      ":x",
      56,
      ":y",
      74
    ))

    // (const point-suit-size)
    Object.assign(nx_tactics_ui_stylesheet.c_point_suit_size, vx_core.f_new(
      vx_ui_ui.t_point,
      ":x",
      6,
      ":y",
      6
    ))

    // (const style-app)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app, vx_core.f_new(
      vx_ui_ui.t_style,
      ":color-background",
      "B0E0E6",
      ":layout",
      vx_ui_ui.c_layout_app,
      ":pin",
      vx_ui_ui.c_pin_expand
    ))

    // (const style-app-background)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_background, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-background",
      ":type",
      vx_ui_ui.c_styletype_shared,
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

    // (const style-app-main)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_main, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-main",
      ":type",
      vx_ui_ui.c_styletype_shared,
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
        12
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":y",
        6
      )
    ))

    // (const style-app-menubar)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_menubar, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-menubar",
      ":type",
      vx_ui_ui.c_styletype_shared,
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
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_menudrawer, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-menudrawer",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_menudrawer
    ))

    // (const style-app-msgbox)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_msgbox, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-msgbox",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_msgbox
    ))

    // (const style-app-navbar)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_navbar, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-navbar",
      ":type",
      vx_ui_ui.c_styletype_shared,
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

    // (const style-app-navbar-button)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_navbar_button, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-navbar-button",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":color-background",
      "A9C8FF",
      ":layout",
      vx_ui_ui.c_layout_button,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_iconsize
    ))

    // (const style-app-navdrawer)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_navdrawer, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-navdrawer",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_navdrawer
    ))

    // (const style-app-parallax)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_parallax, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-parallax",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_parallax
    ))

    // (const style-app-statusbar)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_statusbar, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-statusbar",
      ":type",
      vx_ui_ui.c_styletype_shared,
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
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_statusdrawer, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-statusdrawer",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_statusdrawer
    ))

    // (const style-app-titlebar)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_titlebar, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-titlebar",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":color-background",
      "0000F0",
      ":layout",
      vx_ui_ui.c_layout_titlebar,
      ":pin",
      vx_ui_ui.c_pin_top,
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

    // (const style-app-titlebar-print)
    Object.assign(nx_tactics_ui_stylesheet.c_style_app_titlebar_print, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-app-titlebar-print",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":color-background",
      "A9C8FF",
      ":layout",
      vx_ui_ui.c_layout_button,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_iconsize
    ))

    // (const style-body)
    Object.assign(nx_tactics_ui_stylesheet.c_style_body, vx_core.f_new(
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

    // (const style-button-back)
    Object.assign(nx_tactics_ui_stylesheet.c_style_button_back, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-button-back",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":image-background",
      vx_core.f_new(
        vx_ui_ui.t_image,
        ":name",
        "image-button-back",
        ":label",
        "Back",
        ":file",
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "icon-backarrow.svg",
          ":path",
          "icons"
        )
      )
    ))

    // (const style-card)
    Object.assign(nx_tactics_ui_stylesheet.c_style_card, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":color-background",
      "FFFFFF",
      ":layout",
      vx_ui_ui.c_layout_flow_item,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_cardsize
    ))

    // (const style-card-display)
    Object.assign(nx_tactics_ui_stylesheet.c_style_card_display, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card-display",
      ":layout",
      vx_ui_ui.c_layout_label,
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
        ":x",
        51
      )
    ))

    // (const style-card-display2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_card_display2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card-display2",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        61,
        ":y",
        12
      ),
      ":pointrotate",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        90
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        60
      )
    ))

    // (const style-card-display3)
    Object.assign(nx_tactics_ui_stylesheet.c_style_card_display3, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card-display3",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        55,
        ":y",
        80
      ),
      ":pointrotate",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        180
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        51
      )
    ))

    // (const style-card-display4)
    Object.assign(nx_tactics_ui_stylesheet.c_style_card_display4, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card-display4",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        1,
        ":y",
        71
      ),
      ":pointrotate",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        -90
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        58
      )
    ))

    // (const style-card-rank)
    Object.assign(nx_tactics_ui_stylesheet.c_style_card_rank, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card-rank",
      ":layout",
      vx_ui_ui.c_layout_label
    ))

    // (const style-card-suit)
    Object.assign(nx_tactics_ui_stylesheet.c_style_card_suit, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card-suit",
      ":layout",
      vx_ui_ui.c_layout_image
    ))

    // (const style-card-title1)
    Object.assign(nx_tactics_ui_stylesheet.c_style_card_title1, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card-title1",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        7
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        51
      )
    ))

    // (const style-card-title2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_card_title2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-card-title2",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        58,
        ":y",
        88
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        51
      ),
      ":pointrotate",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        180
      )
    ))

    // (const style-clickable)
    Object.assign(nx_tactics_ui_stylesheet.c_style_clickable, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-clickable",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":styletype",
      vx_ui_ui.c_styletype_shared,
      ":cursor",
      vx_ui_ui.t_cursor_pointer,
      ":color-hoverbkgrd",
      "E0E0E0"
    ))

    // (const style-deck)
    Object.assign(nx_tactics_ui_stylesheet.c_style_deck, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-deck",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":color-background",
      "C0C0C0",
      ":layout",
      vx_ui_ui.c_layout_flow_columns
    ))

    // (const style-div)
    Object.assign(nx_tactics_ui_stylesheet.c_style_div, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "div",
      ":styletype",
      vx_ui_ui.c_styletype_system,
      ":layout",
      vx_ui_ui.c_layout_flow_columns
    ))

    // (const style-hidden)
    Object.assign(nx_tactics_ui_stylesheet.c_style_hidden, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-hidden",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":hidden",
      true
    ))

    // (const style-html)
    Object.assign(nx_tactics_ui_stylesheet.c_style_html, vx_core.f_new(
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

    // (const style-image-background)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_background, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-background",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_image,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        0,
        ":y",
        0,
        ":pointtype",
        vx_ui_ui.c_pointtype_absolute
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        100,
        ":y",
        100,
        ":pointtype",
        vx_ui_ui.c_pointtype_percent
      )
    ))

    // (const style-image-coin1)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_coin1, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-coin1",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos1,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      vx_core.f_new(
        vx_ui_ui.t_image,
        ":name",
        "image-coin1",
        ":label",
        "Coins",
        ":file",
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "icon-coin.svg",
          ":path",
          "icons"
        )
      )
    ))

    // (const style-image-coin2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_coin2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-coin2",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos2,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      vx_core.f_new(
        vx_ui_ui.t_image,
        ":name",
        "image-coin2",
        ":label",
        "Coins",
        ":file",
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "icon-coin.svg",
          ":path",
          "icons"
        )
      )
    ))

    // (const style-image-cup1)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_cup1, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-cup1",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos1,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      vx_core.f_new(
        vx_ui_ui.t_image,
        ":name",
        "image-cup1",
        ":label",
        "Cups",
        ":file",
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "icon-cup.svg",
          ":path",
          "icons"
        )
      )
    ))

    // (const style-image-cup2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_cup2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-cup2",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos2,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      vx_core.f_new(
        vx_ui_ui.t_image,
        ":name",
        "image-cup2",
        ":label",
        "Cups",
        ":file",
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "icon-cup.svg",
          ":path",
          "icons"
        )
      )
    ))

    // (const style-image-jester-black1)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_jester_black1, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-jester-black1",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos1,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      nx_tactics_ui_stylesheet.c_image_jester_black
    ))

    // (const style-image-jester-black2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_jester_black2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-jester-black2",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos2,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      nx_tactics_ui_stylesheet.c_image_jester_black
    ))

    // (const style-image-jester-red1)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_jester_red1, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-jester-red1",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos1,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      nx_tactics_ui_stylesheet.c_image_jester_red
    ))

    // (const style-image-jester-red2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_jester_red2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-jester-red2",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos2,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      nx_tactics_ui_stylesheet.c_image_jester_red
    ))

    // (const style-image-sword1)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_sword1, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-sword1",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos1,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      vx_core.f_new(
        vx_ui_ui.t_image,
        ":name",
        "image-sword1",
        ":label",
        "Swords",
        ":file",
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "icon-sword.svg",
          ":path",
          "icons"
        )
      )
    ))

    // (const style-image-sword2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_sword2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-sword2",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos2,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      vx_core.f_new(
        vx_ui_ui.t_image,
        ":name",
        "image-sword2",
        ":label",
        "Swords",
        ":file",
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "icon-sword.svg",
          ":path",
          "icons"
        )
      )
    ))

    // (const style-image-wand1)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_wand1, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-wand1",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos1,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      vx_core.f_new(
        vx_ui_ui.t_image,
        ":name",
        "image-wand1",
        ":label",
        "Wands",
        ":file",
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "icon-wand.svg",
          ":path",
          "icons"
        )
      )
    ))

    // (const style-image-wand2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_image_wand2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-image-wand2",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_suit_pos2,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_suit_size,
      ":image-background",
      vx_core.f_new(
        vx_ui_ui.t_image,
        ":name",
        "image-wand1",
        ":label",
        "Wands",
        ":file",
        vx_core.f_new(
          vx_data_file.t_file,
          ":name",
          "icon-wand.svg",
          ":path",
          "icons"
        )
      )
    ))

    // (const style-item-summary)
    Object.assign(nx_tactics_ui_stylesheet.c_style_item_summary, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-item-summary",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        32,
        ":y",
        16
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        30,
        ":y",
        31
      )
    ))

    // (const style-selected)
    Object.assign(nx_tactics_ui_stylesheet.c_style_selected, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-selected",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":color-background",
      "E2CCCC"
    ))

    // (const style-text)
    Object.assign(nx_tactics_ui_stylesheet.c_style_text, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-text",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":font",
      nx_tactics_ui_stylesheet.c_font_text
    ))

    // (const style-text-2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_text_2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-text-2",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":font",
      nx_tactics_ui_stylesheet.c_font_text_2
    ))

    // (const style-text-header1)
    Object.assign(nx_tactics_ui_stylesheet.c_style_text_header1, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-text-header1",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":font",
      nx_tactics_ui_stylesheet.c_font_header1
    ))

    // (const style-text-header2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_text_header2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-text-header2",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_label,
      ":font",
      nx_tactics_ui_stylesheet.c_font_header2
    ))

    // (const style-text-label)
    Object.assign(nx_tactics_ui_stylesheet.c_style_text_label, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-text-label",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_label,
      ":font",
      nx_tactics_ui_stylesheet.c_font_label
    ))

    // (const style-text-rank1)
    Object.assign(nx_tactics_ui_stylesheet.c_style_text_rank1, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-text-rank1",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":font",
      nx_tactics_ui_stylesheet.c_font_rank,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_rank_pos1,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_rank_size
    ))

    // (const style-text-rank2)
    Object.assign(nx_tactics_ui_stylesheet.c_style_text_rank2, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-text-rank2",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":font",
      nx_tactics_ui_stylesheet.c_font_rank,
      ":pointpos",
      nx_tactics_ui_stylesheet.c_point_rank_pos2,
      ":pointsize",
      nx_tactics_ui_stylesheet.c_point_rank_size
    ))

    // (const style-text-title)
    Object.assign(nx_tactics_ui_stylesheet.c_style_text_title, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-text-title",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":layout",
      vx_ui_ui.c_layout_label,
      ":font",
      nx_tactics_ui_stylesheet.c_font_title
    ))

    // (const style-textarea)
    Object.assign(nx_tactics_ui_stylesheet.c_style_textarea, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-textarea",
      ":type",
      vx_ui_ui.c_styletype_shared,
      ":font",
      nx_tactics_ui_stylesheet.c_font_textarea
    ))

    // (const style-unit)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit, {
      "boundsmargin": {
        "left": 0,
        "right": 0,
        "top": 0,
        "bottom": 0
      },
      "boundspadding": {
        "left": 0,
        "right": 0,
        "top": 0,
        "bottom": 0
      },
      "font": {
        "fontface": {
          "filelist": vx_data_file.e_filelist
        },
        "fontsize": 0,
        "fontstyle": {
          
        }
      },
      "hidden": false,
      "image-background": {
        "file": {
          "permission": {
            
          }
        }
      },
      "layout": {
        
      },
      "pin": {
        
      },
      "pointpos": {
        "x": 0,
        "y": 0,
        "z": 0,
        "t": 0,
        "i": 0
      },
      "pointrotate": {
        "x": 0,
        "y": 0,
        "z": 0,
        "t": 0,
        "i": 0
      },
      "pointsize": {
        "x": 0,
        "y": 0,
        "z": 0,
        "t": 0,
        "i": 0
      }
    })

    // (const style-unit-body)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_body, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-body",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        50,
        ":y",
        8
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        13,
        ":y",
        6
      )
    ))

    // (const style-unit-bodydetail)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_bodydetail, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-bodydetail",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        34,
        ":y",
        13
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        29,
        ":y",
        5
      )
    ))

    // (const style-unit-detail)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_detail, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-detail",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        2,
        ":y",
        50
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        60,
        ":y",
        37
      )
    ))

    // (const style-unit-image)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_image, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-image",
      ":layout",
      vx_ui_ui.c_layout_image,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        1,
        ":y",
        6
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        30,
        ":y",
        42
      )
    ))

    // (const style-unit-mind)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_mind, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-mind",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        50,
        ":y",
        17
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        13,
        ":y",
        6
      )
    ))

    // (const style-unit-minddetail)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_minddetail, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-minddetail",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        34,
        ":y",
        22
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        29,
        ":y",
        5
      )
    ))

    // (const style-unit-move)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_move, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-move",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        50,
        ":y",
        35
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        13,
        ":y",
        6
      )
    ))

    // (const style-unit-movedetail)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_movedetail, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-movedetail",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        34,
        ":y",
        40
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        29,
        ":y",
        5
      )
    ))

    // (const style-unit-titles)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_titles, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-titles",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        7,
        ":y",
        5
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        51,
        ":y",
        4
      )
    ))

    // (const style-unit-value)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_value, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-value",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        50,
        ":y",
        0
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        13,
        ":y",
        6
      )
    ))

    // (const style-unit-will)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_will, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-will",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":align",
      vx_ui_ui.c_align_center,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        50,
        ":y",
        26
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        13,
        ":y",
        6
      )
    ))

    // (const style-unit-willdetail)
    Object.assign(nx_tactics_ui_stylesheet.c_style_unit_willdetail, vx_core.f_new(
      vx_ui_ui.t_style,
      ":name",
      "style-unit-willdetail",
      ":layout",
      vx_ui_ui.c_layout_label,
      ":pointpos",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        34,
        ":y",
        31
      ),
      ":pointsize",
      vx_core.f_new(
        vx_ui_ui.t_point,
        ":x",
        29,
        ":y",
        5
      )
    ))

    // (const stylesheet-app)
    Object.assign(nx_tactics_ui_stylesheet.c_stylesheet_app, vx_core.f_new(
      vx_ui_ui.t_stylesheet,
      ":fontfacemap",
      vx_ui_ui.f_fontfacemap_from_fontfacelist(
        vx_core.f_new(
          vx_ui_ui.t_fontfacelist,
          nx_tactics_ui_stylesheet.c_fontface1,
          nx_tactics_ui_stylesheet.c_fontface2,
          nx_tactics_ui_stylesheet.c_fontface3
        )
      ),
      ":stylemap",
      vx_ui_ui.f_stylemap_from_stylelist(
        vx_core.f_new(
          vx_ui_ui.t_stylelist,
          nx_tactics_ui_stylesheet.c_style_html,
          nx_tactics_ui_stylesheet.c_style_body,
          nx_tactics_ui_stylesheet.c_style_div,
          nx_tactics_ui_stylesheet.c_style_clickable,
          nx_tactics_ui_stylesheet.c_style_hidden,
          nx_tactics_ui_stylesheet.c_style_selected,
          nx_tactics_ui_stylesheet.c_style_app_background,
          nx_tactics_ui_stylesheet.c_style_app_main,
          nx_tactics_ui_stylesheet.c_style_app_menubar,
          nx_tactics_ui_stylesheet.c_style_app_menudrawer,
          nx_tactics_ui_stylesheet.c_style_app_msgbox,
          nx_tactics_ui_stylesheet.c_style_app_navbar,
          nx_tactics_ui_stylesheet.c_style_app_navbar_button,
          nx_tactics_ui_stylesheet.c_style_app_navdrawer,
          nx_tactics_ui_stylesheet.c_style_app_parallax,
          nx_tactics_ui_stylesheet.c_style_app_statusbar,
          nx_tactics_ui_stylesheet.c_style_app_statusdrawer,
          nx_tactics_ui_stylesheet.c_style_app_titlebar,
          nx_tactics_ui_stylesheet.c_style_app_titlebar_print,
          nx_tactics_ui_stylesheet.c_style_button_back,
          nx_tactics_ui_stylesheet.c_style_card,
          nx_tactics_ui_stylesheet.c_style_deck,
          nx_tactics_ui_stylesheet.c_style_image_background,
          nx_tactics_ui_stylesheet.c_style_image_coin1,
          nx_tactics_ui_stylesheet.c_style_image_coin2,
          nx_tactics_ui_stylesheet.c_style_image_cup1,
          nx_tactics_ui_stylesheet.c_style_image_cup2,
          nx_tactics_ui_stylesheet.c_style_image_jester_black1,
          nx_tactics_ui_stylesheet.c_style_image_jester_black2,
          nx_tactics_ui_stylesheet.c_style_image_jester_red1,
          nx_tactics_ui_stylesheet.c_style_image_jester_red2,
          nx_tactics_ui_stylesheet.c_style_image_sword1,
          nx_tactics_ui_stylesheet.c_style_image_sword2,
          nx_tactics_ui_stylesheet.c_style_image_wand1,
          nx_tactics_ui_stylesheet.c_style_image_wand2,
          nx_tactics_ui_stylesheet.c_style_text,
          nx_tactics_ui_stylesheet.c_style_text_2,
          nx_tactics_ui_stylesheet.c_style_text_header1,
          nx_tactics_ui_stylesheet.c_style_text_header2,
          nx_tactics_ui_stylesheet.c_style_text_label,
          nx_tactics_ui_stylesheet.c_style_text_rank1,
          nx_tactics_ui_stylesheet.c_style_text_rank2,
          nx_tactics_ui_stylesheet.c_style_text_title,
          nx_tactics_ui_stylesheet.c_style_textarea
        )
      )
    ))

  }
}
