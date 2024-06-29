'strict mode'

import nx_tactics_decks_scenario_nightonthetown from "../../../../src/nx/tactics/decks/scenario-nightonthetown.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import nx_tactics_decks_data from "../../../../src/nx/tactics/decks/data.js"

export default class nx_tactics_decks_scenario_nightonthetown_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_scenario_nightonthetown_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/scenario-nightonthetown",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_scenario_nightonthetown_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_scenario_nightonthetown_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/scenario-nightonthetown", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 29), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 29), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 29), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/scenario-nightonthetown",
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
          "deck-nightonthetown", 0,
          "item-axehand", 0,
          "item-fireaxe", 0,
          "item-jerrycan", 0,
          "item-keys", 0,
          "item-knife", 0,
          "item-liquorbottle", 0,
          "item-lockcombination", 0,
          "item-molotovcocktail", 0,
          "item-monocle", 0,
          "item-revolver", 0,
          "item-revolverammo", 0,
          "item-rifle", 0,
          "item-rifleammo", 0,
          "item-safe", 0,
          "item-shotgun", 0,
          "item-shotgunammo", 0,
          "item-spear", 0,
          "place-clinic", 0,
          "place-conveniencestore", 0,
          "place-gasstation", 0,
          "place-gunstore", 0,
          "place-policestation", 0,
          "place-street", 0,
          "rule-zombie", 0,
          "unit-theprofessor", 0,
          "unit-zombiedog", 0,
          "unit-zombierunner", 0,
          "unit-zombiewalker", 0
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
