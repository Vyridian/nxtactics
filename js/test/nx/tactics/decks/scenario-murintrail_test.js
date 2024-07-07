'strict mode'

import nx_tactics_decks_scenario_murintrail from "../../../../src/nx/tactics/decks/scenario-murintrail.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import nx_tactics_decks_data from "../../../../src/nx/tactics/decks/data.js"

export default class nx_tactics_decks_scenario_murintrail_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_scenario_murintrail_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/scenario-murintrail",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_scenario_murintrail_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_scenario_murintrail_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/scenario-murintrail", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 58), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 57), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 58), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/scenario-murintrail",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "power-groundmovement", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "deck-murintrail", 0,
          "item-armor-leathercuirass", 0,
          "item-arrowquiver", 0,
          "item-axehand", 0,
          "item-coppercoins", 0,
          "item-dagger", 0,
          "item-finewoodlandcloak", 0,
          "item-goldcoins", 0,
          "item-hammer", 0,
          "item-healingsalve", 0,
          "item-longsword", 0,
          "item-platinumcoins", 0,
          "item-rations", 0,
          "item-shieldbuckler", 0,
          "item-shieldheater", 0,
          "item-shieldround", 0,
          "item-shortspear", 0,
          "item-shortsword", 0,
          "item-silvercoins", 0,
          "item-spear", 0,
          "item-waterskin", 0,
          "item-woodaxe", 0,
          "place-blacksmith", 0,
          "place-campsite", 0,
          "place-cavemouth", 0,
          "place-dirtpath", 0,
          "place-farmhouse", 0,
          "place-field", 0,
          "place-forest", 0,
          "place-gravelroad", 0,
          "place-guardpost", 0,
          "place-horsestables", 0,
          "place-mill", 0,
          "place-mountain", 0,
          "place-stoneroad", 0,
          "place-tavern", 0,
          "place-tavern-bar", 0,
          "place-tavern-bedroom", 0,
          "place-tavern-common", 0,
          "place-tavern-dining", 0,
          "place-tavern-stairs", 0,
          "place-temple", 0,
          "place-tradingpost", 0,
          "place-woodenhall", 0,
          "unit-bandit", 0,
          "unit-bruiser", 0,
          "unit-flint", 0,
          "unit-goblinscout", 0,
          "unit-guardsman", 0,
          "unit-horse", 0,
          "unit-jesaveer", 0,
          "unit-jonaveer", 0,
          "unit-liliducon", 0,
          "unit-wilddog", 0,
          "unit-wilmducon", 0,
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
