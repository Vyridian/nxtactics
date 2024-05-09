'strict mode'

import nx_tactics_decks_fate from "../../../../src/nx/tactics/decks/fate.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_fate_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_fate_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/fate",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_fate_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_fate_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/fate", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 54), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 3, ":tests", 2, ":total", 57), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 2), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 56), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/fate",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "fate-2c", 0,
          "fate-2d", 0,
          "fate-2h", 0,
          "fate-2s", 0,
          "fate-3c", 0,
          "fate-3d", 0,
          "fate-3h", 0,
          "fate-3s", 0,
          "fate-4c", 0,
          "fate-4d", 0,
          "fate-4h", 0,
          "fate-4s", 0,
          "fate-5c", 0,
          "fate-5d", 0,
          "fate-5h", 0,
          "fate-5s", 0,
          "fate-6c", 0,
          "fate-6d", 0,
          "fate-6h", 0,
          "fate-6s", 0,
          "fate-7c", 0,
          "fate-7d", 0,
          "fate-7h", 0,
          "fate-7s", 0,
          "fate-8c", 0,
          "fate-8d", 0,
          "fate-8h", 0,
          "fate-8s", 0,
          "fate-9c", 0,
          "fate-9d", 0,
          "fate-9h", 0,
          "fate-9s", 0,
          "fate-ac", 0,
          "fate-ad", 0,
          "fate-ah", 0,
          "fate-as", 0,
          "fate-jc", 0,
          "fate-jd", 0,
          "fate-jh", 0,
          "fate-js", 0,
          "fate-kc", 0,
          "fate-kd", 0,
          "fate-kh", 0,
          "fate-ks", 0,
          "fate-qc", 0,
          "fate-qd", 0,
          "fate-qh", 0,
          "fate-qs", 0,
          "fate-tc", 0,
          "fate-td", 0,
          "fate-th", 0,
          "fate-ts", 0,
          "fate-wildblack", 0,
          "fate-wildred", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "card-fate", 0,
          "deck-fate", 0,
          "deck-fate_1", 0
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
