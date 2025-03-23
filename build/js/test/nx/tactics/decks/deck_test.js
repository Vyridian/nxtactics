'strict mode'

import nx_tactics_decks_deck from "../../../../src/nx/tactics/decks/deck.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import nx_tactics_decks_conflict from "../../../../src/nx/tactics/decks/conflict.js"
import nx_tactics_decks_data from "../../../../src/nx/tactics/decks/data.js"
import nx_tactics_decks_disorder from "../../../../src/nx/tactics/decks/disorder.js"
import nx_tactics_decks_restraint from "../../../../src/nx/tactics/decks/restraint.js"
import nx_tactics_decks_rule from "../../../../src/nx/tactics/decks/rule.js"
import nx_tactics_decks_scene_murintrail from "../../../../src/nx/tactics/decks/scene-murintrail.js"
import nx_tactics_decks_scene_nightonthetown from "../../../../src/nx/tactics/decks/scene-nightonthetown.js"
import nx_tactics_decks_starter from "../../../../src/nx/tactics/decks/starter.js"
import nx_tactics_decks_tarot from "../../../../src/nx/tactics/decks/tarot.js"
import nx_tactics_decks_trauma from "../../../../src/nx/tactics/decks/trauma.js"
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
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 70, ":tests", 7, ":total", 10), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 10), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 10), 
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
          "deck-books", 0,
          "deck-encounters", 0,
          "deck-home", 0,
          "deck-items", 0,
          "deck-places", 0,
          "deck-powers", 0,
          "deck-scenes", 0,
          "deck-setup", 0,
          "deck-skills", 0,
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
