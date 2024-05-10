'strict mode'

import nx_tactics_decks_restraint from "../../../../src/nx/tactics/decks/restraint.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_restraint_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_restraint_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/restraint",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_restraint_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_restraint_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/restraint", 
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
      "testpkg", "nx/tactics/decks/restraint",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "restraint-2c", 0,
          "restraint-2d", 0,
          "restraint-2h", 0,
          "restraint-2s", 0,
          "restraint-3c", 0,
          "restraint-3d", 0,
          "restraint-3h", 0,
          "restraint-3s", 0,
          "restraint-4c", 0,
          "restraint-4d", 0,
          "restraint-4h", 0,
          "restraint-4s", 0,
          "restraint-5c", 0,
          "restraint-5d", 0,
          "restraint-5h", 0,
          "restraint-5s", 0,
          "restraint-6c", 0,
          "restraint-6d", 0,
          "restraint-6h", 0,
          "restraint-6s", 0,
          "restraint-7c", 0,
          "restraint-7d", 0,
          "restraint-7h", 0,
          "restraint-7s", 0,
          "restraint-8c", 0,
          "restraint-8d", 0,
          "restraint-8h", 0,
          "restraint-8s", 0,
          "restraint-9c", 0,
          "restraint-9d", 0,
          "restraint-9h", 0,
          "restraint-9s", 0,
          "restraint-ac", 0,
          "restraint-ad", 0,
          "restraint-ah", 0,
          "restraint-as", 0,
          "restraint-jc", 0,
          "restraint-jd", 0,
          "restraint-jh", 0,
          "restraint-js", 0,
          "restraint-kc", 0,
          "restraint-kd", 0,
          "restraint-kh", 0,
          "restraint-ks", 0,
          "restraint-qc", 0,
          "restraint-qd", 0,
          "restraint-qh", 0,
          "restraint-qs", 0,
          "restraint-tc", 0,
          "restraint-td", 0,
          "restraint-th", 0,
          "restraint-ts", 0,
          "restraint-wild-black", 0,
          "restraint-wild-red", 0,
          "slow", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "deck-restraint", 0,
          "deck-restraintback", 0
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
