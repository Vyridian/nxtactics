'strict mode'

import nx_tactics_decks_restrain from "../../../../src/nx/tactics/decks/restrain.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_restrain_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_restrain_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/restrain",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_restrain_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_restrain_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/restrain", 
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
      "testpkg", "nx/tactics/decks/restrain",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "restrain-2c", 0,
          "restrain-2d", 0,
          "restrain-2h", 0,
          "restrain-2s", 0,
          "restrain-3c", 0,
          "restrain-3d", 0,
          "restrain-3h", 0,
          "restrain-3s", 0,
          "restrain-4c", 0,
          "restrain-4d", 0,
          "restrain-4h", 0,
          "restrain-4s", 0,
          "restrain-5c", 0,
          "restrain-5d", 0,
          "restrain-5h", 0,
          "restrain-5s", 0,
          "restrain-6c", 0,
          "restrain-6d", 0,
          "restrain-6h", 0,
          "restrain-6s", 0,
          "restrain-7c", 0,
          "restrain-7d", 0,
          "restrain-7h", 0,
          "restrain-7s", 0,
          "restrain-8c", 0,
          "restrain-8d", 0,
          "restrain-8h", 0,
          "restrain-8s", 0,
          "restrain-9c", 0,
          "restrain-9d", 0,
          "restrain-9h", 0,
          "restrain-9s", 0,
          "restrain-ac", 0,
          "restrain-ad", 0,
          "restrain-ah", 0,
          "restrain-as", 0,
          "restrain-jc", 0,
          "restrain-jd", 0,
          "restrain-jh", 0,
          "restrain-js", 0,
          "restrain-kc", 0,
          "restrain-kd", 0,
          "restrain-kh", 0,
          "restrain-ks", 0,
          "restrain-qc", 0,
          "restrain-qd", 0,
          "restrain-qh", 0,
          "restrain-qs", 0,
          "restrain-tc", 0,
          "restrain-td", 0,
          "restrain-th", 0,
          "restrain-ts", 0,
          "restrain-wild-black", 0,
          "restrain-wild-red", 0,
          "slow", 0
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "deck-restrain", 0
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
