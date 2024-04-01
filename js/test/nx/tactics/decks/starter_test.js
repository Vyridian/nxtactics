'strict mode'

import nx_tactics_decks_starter from "../../../../src/nx/tactics/decks/starter.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import vx_type from "../../../../src/vx/type.js"

export default class nx_tactics_decks_starter_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_starter_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/starter",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_starter_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_starter_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/starter", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 24), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 24), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 24), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/starter",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "card-characterguide", 0,
          "card-combatguide", 0,
          "card-damageguide", 0,
          "card-fatelower", 0,
          "card-fateupper", 0,
          "card-gameguide", 0,
          "card-levelingguide", 0,
          "card-player-blue", 0,
          "card-player-green", 0,
          "card-player-red", 0,
          "card-player-yellow", 0,
          "card-setupguide", 0,
          "card-skillguide", 0,
          "card-turnguide", 0,
          "card-turnorder", 0,
          "card-unit-blue", 0,
          "card-unit-green", 0,
          "card-unit-red", 0,
          "card-unit-yellow", 0,
          "deck-player", 0,
          "deck-player-blue", 0,
          "deck-player-green", 0,
          "deck-player-red", 0,
          "deck-player-yellow", 0
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
