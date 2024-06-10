'strict mode'

import nx_tactics_decks_rule from "../../../../src/nx/tactics/decks/rule.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import vx_type from "../../../../src/vx/type.js"

export default class nx_tactics_decks_rule_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_rule_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/rule",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_rule_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_rule_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/rule", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 26), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 26), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 26), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/rule",
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
          "card-action-fight", 0,
          "card-action-move", 0,
          "card-action-recover", 0,
          "card-action-skill", 0,
          "card-advantage", 0,
          "card-areaeffect", 0,
          "card-beast", 0,
          "card-characters", 0,
          "card-conscience", 0,
          "card-damageguide", 0,
          "card-defenselayers", 0,
          "card-disadvantage", 0,
          "card-free-action", 0,
          "card-gameguide", 0,
          "card-leveling", 0,
          "card-lineofsight", 0,
          "card-mapscale-1", 0,
          "card-mapscale-2", 0,
          "card-move", 0,
          "card-reach", 0,
          "card-scale", 0,
          "card-scaled", 0,
          "card-setupguide", 0,
          "card-shadow", 0,
          "card-suprise", 0,
          "deck-rules", 0
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
