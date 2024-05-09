'strict mode'

import nx_tactics_decks_deck from "../../../../src/nx/tactics/decks/deck.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import nx_tactics_decks_damage from "../../../../src/nx/tactics/decks/damage.js"
import nx_tactics_decks_fate from "../../../../src/nx/tactics/decks/fate.js"
import nx_tactics_decks_rule from "../../../../src/nx/tactics/decks/rule.js"
import nx_tactics_decks_scenario from "../../../../src/nx/tactics/decks/scenario.js"
import nx_tactics_decks_starter from "../../../../src/nx/tactics/decks/starter.js"
import nx_tactics_decks_tarot from "../../../../src/nx/tactics/decks/tarot.js"
import nx_tactics_books_advanced_rules from "../../../../src/nx/tactics/books/advanced_rules.js"
import nx_tactics_books_age_of_sail from "../../../../src/nx/tactics/books/age_of_sail.js"
import nx_tactics_books_age_of_steam from "../../../../src/nx/tactics/books/age_of_steam.js"
import nx_tactics_books_bestiary from "../../../../src/nx/tactics/books/bestiary.js"
import nx_tactics_books_characters from "../../../../src/nx/tactics/books/characters.js"
import nx_tactics_books_combat from "../../../../src/nx/tactics/books/combat.js"
import nx_tactics_books_core_rules from "../../../../src/nx/tactics/books/core_rules.js"
import nx_tactics_books_fantasy from "../../../../src/nx/tactics/books/fantasy.js"
import nx_tactics_books_gear from "../../../../src/nx/tactics/books/gear.js"
import nx_tactics_books_giant_monsters from "../../../../src/nx/tactics/books/giant_monsters.js"
import nx_tactics_books_high_technology from "../../../../src/nx/tactics/books/high_technology.js"
import nx_tactics_books_horror from "../../../../src/nx/tactics/books/horror.js"
import nx_tactics_books_land_sea_and_air from "../../../../src/nx/tactics/books/land_sea_and_air.js"
import nx_tactics_books_magic from "../../../../src/nx/tactics/books/magic.js"
import nx_tactics_books_medieval from "../../../../src/nx/tactics/books/medieval.js"
import nx_tactics_books_modern from "../../../../src/nx/tactics/books/modern.js"
import nx_tactics_books_modern_fantasy from "../../../../src/nx/tactics/books/modern_fantasy.js"
import nx_tactics_books_powers from "../../../../src/nx/tactics/books/powers.js"
import nx_tactics_books_prehistory from "../../../../src/nx/tactics/books/prehistory.js"
import nx_tactics_books_pulp_fiction from "../../../../src/nx/tactics/books/pulp_fiction.js"
import nx_tactics_books_science_fiction from "../../../../src/nx/tactics/books/science_fiction.js"
import nx_tactics_books_skills from "../../../../src/nx/tactics/books/skills.js"
import nx_tactics_books_space_and_time from "../../../../src/nx/tactics/books/space_and_time.js"
import nx_tactics_books_superheroes from "../../../../src/nx/tactics/books/superheroes.js"
import nx_tactics_books_world_wars from "../../../../src/nx/tactics/books/world_wars.js"

export default class nx_tactics_decks_deck_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_deck_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/deck",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_deck_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_deck_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/deck", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 75, ":tests", 9, ":total", 12), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 11), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 12), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/deck",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "tactics-all", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "booklist-all", 0,
          "deck-books", 0,
          "deck-encounters", 0,
          "deck-home", 0,
          "deck-items", 0,
          "deck-places", 0,
          "deck-powers", 0,
          "deck-scenarios", 0,
          "deck-setup", 0,
          "deck-skills", 0,
          "deck-units", 0
        )
    )
  }

  static test_cases(context) {
    const output = vx_core.f_new(
      vx_test.t_testcaselist
    )
    return output
  }
}
