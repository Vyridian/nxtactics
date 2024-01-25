'strict mode'

import vx_core from "../src/vx/core.js"
import vx_test from "../src/vx/test.js"
import vx_web_html from "../src/vx/web/html.js"
import vx_web_htmldoc from "../src/vx/web/htmldoc.js"
import vx_translation_en from "../src/vx/translation/en.js"
import vx_collection_test from "./vx/collection_test.js"
import vx_core_test from "./vx/core_test.js"
import vx_data_csv_test from "./vx/data/csv_test.js"
import vx_data_db_test from "./vx/data/db_test.js"
import vx_data_file_test from "./vx/data/file_test.js"
import vx_data_table_test from "./vx/data/table_test.js"
import vx_data_textblock_test from "./vx/data/textblock_test.js"
import vx_data_tree_test from "./vx/data/tree_test.js"
import vx_data_xml_test from "./vx/data/xml_test.js"
import vx_event_test from "./vx/event_test.js"
import vx_repl_test from "./vx/repl_test.js"
import vx_sample_test from "./vx/sample_test.js"
import vx_state_test from "./vx/state_test.js"
import vx_test_test from "./vx/test_test.js"
import vx_translate_test from "./vx/translate_test.js"
import vx_translation_all_test from "./vx/translation/all_test.js"
import vx_translation_en_test from "./vx/translation/en_test.js"
import vx_translation_es_test from "./vx/translation/es_test.js"
import vx_type_test from "./vx/type_test.js"
import vx_web_html_test from "./vx/web/html_test.js"
import vx_web_htmldoc_test from "./vx/web/htmldoc_test.js"
import vx_web_http_test from "./vx/web/http_test.js"
import nx_crypto_cryptosheet_test from "./nx/crypto/cryptosheet_test.js"
import nx_tactics_apptactics_test from "./nx/tactics/apptactics_test.js"
import nx_tactics_base_test from "./nx/tactics/base_test.js"
import nx_tactics_books_age_of_steam_test from "./nx/tactics/books/age_of_steam_test.js"
import nx_tactics_books_bookloader_test from "./nx/tactics/books/bookloader_test.js"
import nx_tactics_books_gettingstarted_test from "./nx/tactics/books/gettingstarted_test.js"
import nx_tactics_damage_test from "./nx/tactics/damage_test.js"
import vx_ui_appui_test from "./vx/ui/appui_test.js"
import vx_ui_background_test from "./vx/ui/background_test.js"
import vx_ui_element_test from "./vx/ui/element_test.js"
import vx_ui_flow_test from "./vx/ui/flow_test.js"
import vx_ui_image_test from "./vx/ui/image_test.js"
import vx_ui_navigation_test from "./vx/ui/navigation_test.js"
import vx_ui_scrollbar_test from "./vx/ui/scrollbar_test.js"
import vx_ui_text_test from "./vx/ui/text_test.js"
import vx_ui_textentry_test from "./vx/ui/textentry_test.js"
import vx_ui_ui_test from "./vx/ui/ui_test.js"

export default class app_test {

  static async f_displaytestsuite() {
			 const arglist = []
    const context = vx_translation_en.f_context_test(...arglist)
    const stylesheet = vx_test.c_stylesheet_test
    const testpackagelist = app_test.f_testpackagelist_from_all_test(context)
    const resolvedtestpackagelist = await vx_test.f_resolve_testpackagelist(testpackagelist)
    const div = vx_test.f_div_from_testpackagelist(resolvedtestpackagelist)
    const htmltext = vx_web_html.f_string_from_div_indent(div, 0)
    vx_web_htmldoc.f_boolean_write_from_stylesheet(stylesheet)
    vx_web_htmldoc.f_boolean_write_from_id_htmltext("testdisplay", htmltext)
  }

  static f_testpackagelist_from_all_test(context) {
    const testpackagelist = vx_core.f_new(
      vx_test.t_testpackagelist,
      vx_collection_test.test_package(context),
      vx_core_test.test_package(context),
      vx_data_csv_test.test_package(context),
      vx_data_db_test.test_package(context),
      vx_data_file_test.test_package(context),
      vx_data_table_test.test_package(context),
      vx_data_textblock_test.test_package(context),
      vx_data_tree_test.test_package(context),
      vx_data_xml_test.test_package(context),
      vx_event_test.test_package(context),
      vx_repl_test.test_package(context),
      vx_sample_test.test_package(context),
      vx_state_test.test_package(context),
      vx_test_test.test_package(context),
      vx_translate_test.test_package(context),
      vx_translation_all_test.test_package(context),
      vx_translation_en_test.test_package(context),
      vx_translation_es_test.test_package(context),
      vx_type_test.test_package(context),
      vx_web_html_test.test_package(context),
      vx_web_htmldoc_test.test_package(context),
      vx_web_http_test.test_package(context),
      nx_crypto_cryptosheet_test.test_package(context),
      nx_tactics_apptactics_test.test_package(context),
      nx_tactics_base_test.test_package(context),
      nx_tactics_books_age_of_steam_test.test_package(context),
      nx_tactics_books_bookloader_test.test_package(context),
      nx_tactics_books_gettingstarted_test.test_package(context),
      nx_tactics_damage_test.test_package(context),
      vx_ui_appui_test.test_package(context),
      vx_ui_background_test.test_package(context),
      vx_ui_element_test.test_package(context),
      vx_ui_flow_test.test_package(context),
      vx_ui_image_test.test_package(context),
      vx_ui_navigation_test.test_package(context),
      vx_ui_scrollbar_test.test_package(context),
      vx_ui_text_test.test_package(context),
      vx_ui_textentry_test.test_package(context),
      vx_ui_ui_test.test_package(context)
    )
    return testpackagelist
  }

}