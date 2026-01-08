'strict mode'

import nx_tactics_decks_deck from "../../../../src/nx/tactics/decks/deck.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import nx_tactics_decks_character from "../../../../src/nx/tactics/decks/character.js"
import nx_tactics_decks_condition from "../../../../src/nx/tactics/decks/condition.js"
import nx_tactics_decks_data from "../../../../src/nx/tactics/decks/data.js"
import nx_tactics_decks_disorder from "../../../../src/nx/tactics/decks/disorder.js"
import nx_tactics_decks_dungeon from "../../../../src/nx/tactics/decks/dungeon.js"
import nx_tactics_decks_highway from "../../../../src/nx/tactics/decks/highway.js"
import nx_tactics_decks_intent from "../../../../src/nx/tactics/decks/intent.js"
import nx_tactics_decks_player from "../../../../src/nx/tactics/decks/player.js"
import nx_tactics_decks_reference from "../../../../src/nx/tactics/decks/reference.js"
import nx_tactics_decks_rule from "../../../../src/nx/tactics/decks/rule.js"
import nx_tactics_decks_restrain from "../../../../src/nx/tactics/decks/restrain.js"
import nx_tactics_decks_scene from "../../../../src/nx/tactics/decks/scene.js"
import nx_tactics_decks_story from "../../../../src/nx/tactics/decks/story.js"
import nx_tactics_decks_storyarc from "../../../../src/nx/tactics/decks/storyarc.js"
import nx_tactics_decks_storyevent from "../../../../src/nx/tactics/decks/storyevent.js"
import nx_tactics_decks_trauma from "../../../../src/nx/tactics/decks/trauma.js"
import nx_tactics_decks_vehicle from "../../../../src/nx/tactics/decks/vehicle.js"
import nx_tactics_decks_wilderness from "../../../../src/nx/tactics/decks/wilderness.js"
import nx_tactics_decks_wound from "../../../../src/nx/tactics/decks/wound.js"

export default class nx_tactics_decks_deck_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_deck_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/deck",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_deck_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_deck_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/deck", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 76, ":tests", 10, ":total", 13), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 13), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 13), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/deck",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "card-clock", 0,
          "deck-abilities", 0,
          "deck-books", 0,
          "deck-clock", 0,
          "deck-decks", 0,
          "deck-home", 0,
          "deck-items", 0,
          "deck-places", 0,
          "deck-powers", 0,
          "deck-scenes", 0,
          "deck-skills", 0,
          "deck-specialties", 0,
          "deck-units", 0
        )
    )
    return output
  }

  static test_cases(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcaselist
    )
    return output
  }
}
