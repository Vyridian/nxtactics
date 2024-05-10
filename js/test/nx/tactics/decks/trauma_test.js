'strict mode'

import nx_tactics_decks_trauma from "../../../../src/nx/tactics/decks/trauma.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_trauma_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_trauma_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/trauma",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_trauma_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_trauma_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/trauma", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 55), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 3, ":tests", 2, ":total", 57), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 2), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 57), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/trauma",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "stress", 0,
          "trauma-2c", 0,
          "trauma-2d", 0,
          "trauma-2h", 0,
          "trauma-2s", 0,
          "trauma-3c", 0,
          "trauma-3d", 0,
          "trauma-3h", 0,
          "trauma-3s", 0,
          "trauma-4c", 0,
          "trauma-4d", 0,
          "trauma-4h", 0,
          "trauma-4s", 0,
          "trauma-5c", 0,
          "trauma-5d", 0,
          "trauma-5h", 0,
          "trauma-5s", 0,
          "trauma-6c", 0,
          "trauma-6d", 0,
          "trauma-6h", 0,
          "trauma-6s", 0,
          "trauma-7c", 0,
          "trauma-7d", 0,
          "trauma-7h", 0,
          "trauma-7s", 0,
          "trauma-8c", 0,
          "trauma-8d", 0,
          "trauma-8h", 0,
          "trauma-8s", 0,
          "trauma-9c", 0,
          "trauma-9d", 0,
          "trauma-9h", 0,
          "trauma-9s", 0,
          "trauma-ac", 0,
          "trauma-ad", 0,
          "trauma-ah", 0,
          "trauma-as", 0,
          "trauma-jc", 0,
          "trauma-jd", 0,
          "trauma-jh", 0,
          "trauma-js", 0,
          "trauma-kc", 0,
          "trauma-kd", 0,
          "trauma-kh", 0,
          "trauma-ks", 0,
          "trauma-qc", 0,
          "trauma-qd", 0,
          "trauma-qh", 0,
          "trauma-qs", 0,
          "trauma-tc", 0,
          "trauma-td", 0,
          "trauma-th", 0,
          "trauma-ts", 0,
          "trauma-wild-black", 0,
          "trauma-wild-red", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "deck-trauma", 0,
          "deck-traumaback", 0
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
