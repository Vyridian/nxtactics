'strict mode'

import nx_tactics_decks_disorder from "../../../../src/nx/tactics/decks/disorder.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_disorder_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_disorder_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/disorder",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_disorder_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_disorder_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/disorder", 
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
      "testpkg", "nx/tactics/decks/disorder",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "disorder-2c", 0,
          "disorder-2d", 0,
          "disorder-2h", 0,
          "disorder-2s", 0,
          "disorder-3c", 0,
          "disorder-3d", 0,
          "disorder-3h", 0,
          "disorder-3s", 0,
          "disorder-4c", 0,
          "disorder-4d", 0,
          "disorder-4h", 0,
          "disorder-4s", 0,
          "disorder-5c", 0,
          "disorder-5d", 0,
          "disorder-5h", 0,
          "disorder-5s", 0,
          "disorder-6c", 0,
          "disorder-6d", 0,
          "disorder-6h", 0,
          "disorder-6s", 0,
          "disorder-7c", 0,
          "disorder-7d", 0,
          "disorder-7h", 0,
          "disorder-7s", 0,
          "disorder-8c", 0,
          "disorder-8d", 0,
          "disorder-8h", 0,
          "disorder-8s", 0,
          "disorder-9c", 0,
          "disorder-9d", 0,
          "disorder-9h", 0,
          "disorder-9s", 0,
          "disorder-ac", 0,
          "disorder-ad", 0,
          "disorder-ah", 0,
          "disorder-as", 0,
          "disorder-jc", 0,
          "disorder-jd", 0,
          "disorder-jh", 0,
          "disorder-js", 0,
          "disorder-kc", 0,
          "disorder-kd", 0,
          "disorder-kh", 0,
          "disorder-ks", 0,
          "disorder-qc", 0,
          "disorder-qd", 0,
          "disorder-qh", 0,
          "disorder-qs", 0,
          "disorder-tc", 0,
          "disorder-td", 0,
          "disorder-th", 0,
          "disorder-ts", 0,
          "disorder-wild-black", 0,
          "disorder-wild-red", 0,
          "stun", 0
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "deck-disorder", 0
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
