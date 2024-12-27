'strict mode'

import nx_tactics_decks_tarot from "../../../../src/nx/tactics/decks/tarot.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_tarot_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_tarot_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/tarot",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_tarot_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_tarot_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/tarot", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 54), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 1, ":tests", 1, ":total", 55), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 55), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/tarot",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "tarot-2c", 0,
          "tarot-2d", 0,
          "tarot-2h", 0,
          "tarot-2s", 0,
          "tarot-3c", 0,
          "tarot-3d", 0,
          "tarot-3h", 0,
          "tarot-3s", 0,
          "tarot-4c", 0,
          "tarot-4d", 0,
          "tarot-4h", 0,
          "tarot-4s", 0,
          "tarot-5c", 0,
          "tarot-5d", 0,
          "tarot-5h", 0,
          "tarot-5s", 0,
          "tarot-6c", 0,
          "tarot-6d", 0,
          "tarot-6h", 0,
          "tarot-6s", 0,
          "tarot-7c", 0,
          "tarot-7d", 0,
          "tarot-7h", 0,
          "tarot-7s", 0,
          "tarot-8c", 0,
          "tarot-8d", 0,
          "tarot-8h", 0,
          "tarot-8s", 0,
          "tarot-9c", 0,
          "tarot-9d", 0,
          "tarot-9h", 0,
          "tarot-9s", 0,
          "tarot-ac", 0,
          "tarot-ad", 0,
          "tarot-ah", 0,
          "tarot-as", 0,
          "tarot-jc", 0,
          "tarot-jd", 0,
          "tarot-jh", 0,
          "tarot-js", 0,
          "tarot-kc", 0,
          "tarot-kd", 0,
          "tarot-kh", 0,
          "tarot-ks", 0,
          "tarot-qc", 0,
          "tarot-qd", 0,
          "tarot-qh", 0,
          "tarot-qs", 0,
          "tarot-tc", 0,
          "tarot-td", 0,
          "tarot-th", 0,
          "tarot-ts", 0,
          "tarot-wildblack", 0,
          "tarot-wildred", 0
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "deck-tarot", 0
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
