'strict mode'

import nx_tactics_decks_conflict from "../../../../src/nx/tactics/decks/conflict.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_conflict_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_conflict_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/conflict",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_conflict_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_conflict_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/conflict", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 54), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 3, ":tests", 2, ":total", 57), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 3), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 57), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/conflict",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "conflict-2c", 0,
          "conflict-2d", 0,
          "conflict-2h", 0,
          "conflict-2s", 0,
          "conflict-3c", 0,
          "conflict-3d", 0,
          "conflict-3h", 0,
          "conflict-3s", 0,
          "conflict-4c", 0,
          "conflict-4d", 0,
          "conflict-4h", 0,
          "conflict-4s", 0,
          "conflict-5c", 0,
          "conflict-5d", 0,
          "conflict-5h", 0,
          "conflict-5s", 0,
          "conflict-6c", 0,
          "conflict-6d", 0,
          "conflict-6h", 0,
          "conflict-6s", 0,
          "conflict-7c", 0,
          "conflict-7d", 0,
          "conflict-7h", 0,
          "conflict-7s", 0,
          "conflict-8c", 0,
          "conflict-8d", 0,
          "conflict-8h", 0,
          "conflict-8s", 0,
          "conflict-9c", 0,
          "conflict-9d", 0,
          "conflict-9h", 0,
          "conflict-9s", 0,
          "conflict-ac", 0,
          "conflict-ad", 0,
          "conflict-ah", 0,
          "conflict-as", 0,
          "conflict-jc", 0,
          "conflict-jd", 0,
          "conflict-jh", 0,
          "conflict-js", 0,
          "conflict-kc", 0,
          "conflict-kd", 0,
          "conflict-kh", 0,
          "conflict-ks", 0,
          "conflict-qc", 0,
          "conflict-qd", 0,
          "conflict-qh", 0,
          "conflict-qs", 0,
          "conflict-tc", 0,
          "conflict-td", 0,
          "conflict-th", 0,
          "conflict-ts", 0,
          "conflict-wildblack", 0,
          "conflict-wildred", 0
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "card-conflict-back", 0,
          "conflictbacklist", 0,
          "conflictcardlist", 0
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
