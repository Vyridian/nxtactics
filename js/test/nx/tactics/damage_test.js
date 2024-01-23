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
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 19), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 5, ":tests", 1, ":total", 19), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 19), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/damage",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "physical-ca", 0,
          "physical-da", 0,
          "physical-ha", 0,
          "physical-j1", 0,
          "physical-j2", 0,
          "physical-s10", 0,
          "physical-s2", 0,
          "physical-s3", 0,
          "physical-s4", 0,
          "physical-s5", 0,
          "physical-s6", 0,
          "physical-s7", 0,
          "physical-s8", 0,
          "physical-s9", 0,
          "physical-sa", 0,
          "physical-sj", 0,
          "physical-sk", 0,
          "physical-sq", 0,
          "physicaldamagedeck", 0
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
