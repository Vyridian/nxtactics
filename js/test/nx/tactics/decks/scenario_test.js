'strict mode'

import nx_tactics_decks_scenario from "../../../../src/nx/tactics/decks/scenario.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_scenario_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_scenario_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/scenario",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_scenario_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_scenario_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/scenario", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 34), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 34), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 34), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/scenario",
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
          "deck-murintrail", 0,
          "item-armor-leathercuirass", 0,
          "item-axehand", 0,
          "item-axewood", 0,
          "item-barehanded", 0,
          "item-bowshort", 0,
          "item-dagger", 0,
          "item-hammer", 0,
          "item-shieldbuckler", 0,
          "item-shieldheater", 0,
          "item-shieldround", 0,
          "item-spear", 0,
          "item-spearshort", 0,
          "item-swordlong", 0,
          "place-blacksmith", 0,
          "place-campsite", 0,
          "place-cavemouth", 0,
          "place-farmhouse", 0,
          "place-field", 0,
          "place-forest", 0,
          "place-guardpost", 0,
          "place-mill", 0,
          "place-mountain", 0,
          "place-stoneroad", 0,
          "place-tavern", 0,
          "place-temple", 0,
          "place-tradingpost", 0,
          "unit-goblinscout", 0,
          "unit-horse", 0,
          "unit-jesaveer", 0,
          "unit-jonaveer", 0,
          "unit-wilddog", 0,
          "unit-woodencart", 0,
          "unit-xeibhanower", 0
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
