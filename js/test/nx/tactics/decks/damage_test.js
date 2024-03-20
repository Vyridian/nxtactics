'strict mode'

import nx_tactics_decks_damage from "../../../../src/nx/tactics/decks/damage.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_damage_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_damage_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/damage",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_damage_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_damage_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/damage", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 58), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 21, ":tests", 13, ":total", 61), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 3), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 61), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/decks/damage",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "fatigue", 0,
          "slow", 0,
          "stress", 0,
          "stun", 0,
          "wound-2c", 0,
          "wound-2d", 0,
          "wound-2h", 0,
          "wound-2s", 0,
          "wound-3c", 0,
          "wound-3d", 0,
          "wound-3h", 0,
          "wound-3s", 0,
          "wound-4c", 0,
          "wound-4d", 0,
          "wound-4h", 0,
          "wound-4s", 0,
          "wound-5c", 0,
          "wound-5d", 0,
          "wound-5h", 0,
          "wound-5s", 0,
          "wound-6c", 0,
          "wound-6d", 0,
          "wound-6h", 0,
          "wound-6s", 0,
          "wound-7c", 0,
          "wound-7d", 0,
          "wound-7h", 0,
          "wound-7s", 0,
          "wound-8c", 0,
          "wound-8d", 0,
          "wound-8h", 0,
          "wound-8s", 0,
          "wound-9c", 0,
          "wound-9d", 0,
          "wound-9h", 0,
          "wound-9s", 0,
          "wound-ac", 0,
          "wound-ad", 0,
          "wound-ah", 0,
          "wound-as", 0,
          "wound-jc", 0,
          "wound-jd", 0,
          "wound-jh", 0,
          "wound-js", 0,
          "wound-kc", 0,
          "wound-kd", 0,
          "wound-kh", 0,
          "wound-ks", 0,
          "wound-qc", 0,
          "wound-qd", 0,
          "wound-qh", 0,
          "wound-qs", 0,
          "wound-tc", 0,
          "wound-td", 0,
          "wound-th", 0,
          "wound-ts", 0,
          "wound-wild-black", 0,
          "wound-wild-red", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "deck-disorder", 0,
          "deck-trauma", 0,
          "deck-wound", 0
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
