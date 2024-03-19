'strict mode'

import nx_tactics_damage from "../../../src/nx/tactics/damage.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"
import nx_tactics_base from "../../../src/nx/tactics/base.js"

export default class nx_tactics_damage_test {


  static test_package(context) {
    const testcaselist = nx_tactics_damage_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/damage",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_damage_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_damage_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/damage", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 27), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 35, ":tests", 10, ":total", 28), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 28), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/damage",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap,
          "wound", 0
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "breakdown", 0,
          "burden", 0,
          "deck-disorder", 0,
          "deck-trauma", 0,
          "deck-wound", 0,
          "fatigue", 0,
          "strain", 0,
          "stress", 0,
          "trauma", 0,
          "wound-ca", 0,
          "wound-da", 0,
          "wound-ha", 0,
          "wound-j1", 0,
          "wound-j2", 0,
          "wound-s10", 0,
          "wound-s2", 0,
          "wound-s3", 0,
          "wound-s4", 0,
          "wound-s5", 0,
          "wound-s6", 0,
          "wound-s7", 0,
          "wound-s8", 0,
          "wound-s9", 0,
          "wound-sa", 0,
          "wound-sj", 0,
          "wound-sk", 0,
          "wound-sq", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap
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
