'strict mode'

import vx_core from "../src/vx/core.js"
import vx_test from "../src/vx/test.js"
import vx_web_html from "../src/vx/web/html.js"
import vx_web_htmldoc from "../src/vx/web/htmldoc.js"
import vx_translation_en from "../src/vx/translation/en.js"
import vx_core_test from "./vx/core_test.js"
import vx_data_db_test from "./vx/data/db_test.js"
import vx_data_table_test from "./vx/data/table_test.js"
import vx_data_tree_test from "./vx/data/tree_test.js"
import vx_event_test from "./vx/event_test.js"
import vx_sample_test from "./vx/sample_test.js"
import vx_state_test from "./vx/state_test.js"
import vx_type_test from "./vx/type_test.js"
import vx_web_html_test from "./vx/web/html_test.js"
import nx_crypto_cryptosheet_test from "./nx/crypto/cryptosheet_test.js"
import vx_ui_element_test from "./vx/ui/element_test.js"
import vx_collection_test from "./vx/collection_test.js"
import vx_data_textblock_test from "./vx/data/textblock_test.js"
import vx_repl_test from "./vx/repl_test.js"
import nx_tactics_base_test from "./nx/tactics/base_test.js"
import nx_tactics_books_advanced_rules_test from "./nx/tactics/books/advanced_rules_test.js"
import nx_tactics_books_age_of_sail_test from "./nx/tactics/books/age_of_sail_test.js"
import nx_tactics_books_age_of_steam_test from "./nx/tactics/books/age_of_steam_test.js"
import nx_tactics_books_ancients_test from "./nx/tactics/books/ancients_test.js"
import nx_tactics_books_bestiary_test from "./nx/tactics/books/bestiary_test.js"
import nx_tactics_books_characters_test from "./nx/tactics/books/characters_test.js"
import nx_tactics_books_combat_test from "./nx/tactics/books/combat_test.js"
import nx_tactics_books_core_rules_test from "./nx/tactics/books/core_rules_test.js"
import nx_tactics_books_fantasy_test from "./nx/tactics/books/fantasy_test.js"
import nx_tactics_books_gear_test from "./nx/tactics/books/gear_test.js"
import nx_tactics_books_gettingstarted_test from "./nx/tactics/books/gettingstarted_test.js"
import nx_tactics_books_giant_monsters_test from "./nx/tactics/books/giant_monsters_test.js"
import nx_tactics_books_high_technology_test from "./nx/tactics/books/high_technology_test.js"
import nx_tactics_books_horror_test from "./nx/tactics/books/horror_test.js"
import nx_tactics_books_land_sea_and_air_test from "./nx/tactics/books/land_sea_and_air_test.js"
import nx_tactics_books_magic_test from "./nx/tactics/books/magic_test.js"
import nx_tactics_books_medieval_test from "./nx/tactics/books/medieval_test.js"
import nx_tactics_books_modern_test from "./nx/tactics/books/modern_test.js"
import nx_tactics_books_modern_fantasy_test from "./nx/tactics/books/modern_fantasy_test.js"
import nx_tactics_books_powers_test from "./nx/tactics/books/powers_test.js"
import nx_tactics_books_prehistory_test from "./nx/tactics/books/prehistory_test.js"
import nx_tactics_books_pulp_fiction_test from "./nx/tactics/books/pulp_fiction_test.js"
import nx_tactics_books_science_fiction_test from "./nx/tactics/books/science_fiction_test.js"
import nx_tactics_books_skills_test from "./nx/tactics/books/skills_test.js"
import nx_tactics_books_space_and_time_test from "./nx/tactics/books/space_and_time_test.js"
import nx_tactics_books_superheroes_test from "./nx/tactics/books/superheroes_test.js"
import nx_tactics_books_world_wars_test from "./nx/tactics/books/world_wars_test.js"
import nx_tactics_decks_disorder_test from "./nx/tactics/decks/disorder_test.js"
import nx_tactics_decks_fate_test from "./nx/tactics/decks/fate_test.js"
import nx_tactics_decks_restraint_test from "./nx/tactics/decks/restraint_test.js"
import nx_tactics_decks_rule_test from "./nx/tactics/decks/rule_test.js"
import nx_tactics_decks_scenario_test from "./nx/tactics/decks/scenario_test.js"
import nx_tactics_decks_scenario_nightonthetown_test from "./nx/tactics/decks/scenario_nightonthetown_test.js"
import nx_tactics_decks_starter_test from "./nx/tactics/decks/starter_test.js"
import nx_tactics_decks_tarot_test from "./nx/tactics/decks/tarot_test.js"
import nx_tactics_decks_trauma_test from "./nx/tactics/decks/trauma_test.js"
import nx_tactics_decks_wound_test from "./nx/tactics/decks/wound_test.js"
import vx_data_file_test from "./vx/data/file_test.js"
import vx_data_xml_test from "./vx/data/xml_test.js"
import vx_test_test from "./vx/test_test.js"
import vx_ui_ui_test from "./vx/ui/ui_test.js"
import vx_web_htmldoc_test from "./vx/web/htmldoc_test.js"
import nx_tactics_books_bookloader_test from "./nx/tactics/books/bookloader_test.js"
import nx_tactics_decks_deck_test from "./nx/tactics/decks/deck_test.js"
import nx_tactics_ui_stylesheet_test from "./nx/tactics/ui/stylesheet_test.js"
import vx_data_csv_test from "./vx/data/csv_test.js"
import vx_translate_test from "./vx/translate_test.js"
import vx_translation_en_test from "./vx/translation/en_test.js"
import vx_translation_es_test from "./vx/translation/es_test.js"
import vx_ui_html_uihtml_test from "./vx/ui/html/uihtml_test.js"
import vx_ui_svg_uisvg_test from "./vx/ui/svg/uisvg_test.js"
import vx_web_http_test from "./vx/web/http_test.js"
import nx_tactics_ui_navigation_test from "./nx/tactics/ui/navigation_test.js"
import nx_tactics_ui_uitactics_test from "./nx/tactics/ui/uitactics_test.js"
import vx_translation_all_test from "./vx/translation/all_test.js"
import nx_tactics_apptactics_test from "./nx/tactics/apptactics_test.js"

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
      vx_core_test.test_package(context),
      vx_data_db_test.test_package(context),
      vx_data_table_test.test_package(context),
      vx_data_tree_test.test_package(context),
      vx_event_test.test_package(context),
      vx_sample_test.test_package(context),
      vx_state_test.test_package(context),
      vx_type_test.test_package(context),
      vx_web_html_test.test_package(context),
      nx_crypto_cryptosheet_test.test_package(context),
      vx_ui_element_test.test_package(context),
      vx_collection_test.test_package(context),
      vx_data_textblock_test.test_package(context),
      vx_repl_test.test_package(context),
      nx_tactics_base_test.test_package(context),
      nx_tactics_books_advanced_rules_test.test_package(context),
      nx_tactics_books_age_of_sail_test.test_package(context),
      nx_tactics_books_age_of_steam_test.test_package(context),
      nx_tactics_books_ancients_test.test_package(context),
      nx_tactics_books_bestiary_test.test_package(context),
      nx_tactics_books_characters_test.test_package(context),
      nx_tactics_books_combat_test.test_package(context),
      nx_tactics_books_core_rules_test.test_package(context),
      nx_tactics_books_fantasy_test.test_package(context),
      nx_tactics_books_gear_test.test_package(context),
      nx_tactics_books_gettingstarted_test.test_package(context),
      nx_tactics_books_giant_monsters_test.test_package(context),
      nx_tactics_books_high_technology_test.test_package(context),
      nx_tactics_books_horror_test.test_package(context),
      nx_tactics_books_land_sea_and_air_test.test_package(context),
      nx_tactics_books_magic_test.test_package(context),
      nx_tactics_books_medieval_test.test_package(context),
      nx_tactics_books_modern_test.test_package(context),
      nx_tactics_books_modern_fantasy_test.test_package(context),
      nx_tactics_books_powers_test.test_package(context),
      nx_tactics_books_prehistory_test.test_package(context),
      nx_tactics_books_pulp_fiction_test.test_package(context),
      nx_tactics_books_science_fiction_test.test_package(context),
      nx_tactics_books_skills_test.test_package(context),
      nx_tactics_books_space_and_time_test.test_package(context),
      nx_tactics_books_superheroes_test.test_package(context),
      nx_tactics_books_world_wars_test.test_package(context),
      nx_tactics_decks_disorder_test.test_package(context),
      nx_tactics_decks_fate_test.test_package(context),
      nx_tactics_decks_restraint_test.test_package(context),
      nx_tactics_decks_rule_test.test_package(context),
      nx_tactics_decks_scenario_test.test_package(context),
      nx_tactics_decks_scenario_nightonthetown_test.test_package(context),
      nx_tactics_decks_starter_test.test_package(context),
      nx_tactics_decks_tarot_test.test_package(context),
      nx_tactics_decks_trauma_test.test_package(context),
      nx_tactics_decks_wound_test.test_package(context),
      vx_data_file_test.test_package(context),
      vx_data_xml_test.test_package(context),
      vx_test_test.test_package(context),
      vx_ui_ui_test.test_package(context),
      vx_web_htmldoc_test.test_package(context),
      nx_tactics_books_bookloader_test.test_package(context),
      nx_tactics_decks_deck_test.test_package(context),
      nx_tactics_ui_stylesheet_test.test_package(context),
      vx_data_csv_test.test_package(context),
      vx_translate_test.test_package(context),
      vx_translation_en_test.test_package(context),
      vx_translation_es_test.test_package(context),
      vx_ui_html_uihtml_test.test_package(context),
      vx_ui_svg_uisvg_test.test_package(context),
      vx_web_http_test.test_package(context),
      nx_tactics_ui_navigation_test.test_package(context),
      nx_tactics_ui_uitactics_test.test_package(context),
      vx_translation_all_test.test_package(context),
      nx_tactics_apptactics_test.test_package(context)
    )
    return testpackagelist
  }

}