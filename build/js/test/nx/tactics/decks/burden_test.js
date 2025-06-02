'strict mode'

import nx_tactics_decks_burden from "../../../../src/nx/tactics/decks/burden.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_burden_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_burden_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/burden",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_burden_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_burden_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/burden", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 55), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 1, ":tests", 1, ":total", 56), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 56), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/burden",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "burden-2c", 0,
          "burden-2d", 0,
          "burden-2h", 0,
          "burden-2s", 0,
          "burden-3c", 0,
          "burden-3d", 0,
          "burden-3h", 0,
          "burden-3s", 0,
          "burden-4c", 0,
          "burden-4d", 0,
          "burden-4h", 0,
          "burden-4s", 0,
          "burden-5c", 0,
          "burden-5d", 0,
          "burden-5h", 0,
          "burden-5s", 0,
          "burden-6c", 0,
          "burden-6d", 0,
          "burden-6h", 0,
          "burden-6s", 0,
          "burden-7c", 0,
          "burden-7d", 0,
          "burden-7h", 0,
          "burden-7s", 0,
          "burden-8c", 0,
          "burden-8d", 0,
          "burden-8h", 0,
          "burden-8s", 0,
          "burden-9c", 0,
          "burden-9d", 0,
          "burden-9h", 0,
          "burden-9s", 0,
          "burden-ac", 0,
          "burden-ad", 0,
          "burden-ah", 0,
          "burden-as", 0,
          "burden-jc", 0,
          "burden-jd", 0,
          "burden-jh", 0,
          "burden-js", 0,
          "burden-kc", 0,
          "burden-kd", 0,
          "burden-kh", 0,
          "burden-ks", 0,
          "burden-qc", 0,
          "burden-qd", 0,
          "burden-qh", 0,
          "burden-qs", 0,
          "burden-tc", 0,
          "burden-td", 0,
          "burden-th", 0,
          "burden-ts", 0,
          "burden-wild-black", 0,
          "burden-wild-red", 0,
          "slow", 0
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "deck-burden", 0
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
