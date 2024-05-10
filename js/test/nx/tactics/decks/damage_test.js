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
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 57), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 19, ":tests", 12, ":total", 61), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 4), 
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
          "bleeding", 0,
          "bloodloss", 0,
          "damage-2c", 0,
          "damage-2d", 0,
          "damage-2h", 0,
          "damage-2s", 0,
          "damage-3c", 0,
          "damage-3d", 0,
          "damage-3h", 0,
          "damage-3s", 0,
          "damage-4c", 0,
          "damage-4d", 0,
          "damage-4h", 0,
          "damage-4s", 0,
          "damage-5c", 0,
          "damage-5d", 0,
          "damage-5h", 0,
          "damage-5s", 0,
          "damage-6c", 0,
          "damage-6d", 0,
          "damage-6h", 0,
          "damage-6s", 0,
          "damage-7c", 0,
          "damage-7d", 0,
          "damage-7h", 0,
          "damage-7s", 0,
          "damage-8c", 0,
          "damage-8d", 0,
          "damage-8h", 0,
          "damage-8s", 0,
          "damage-9c", 0,
          "damage-9d", 0,
          "damage-9h", 0,
          "damage-9s", 0,
          "damage-ac", 0,
          "damage-ad", 0,
          "damage-ah", 0,
          "damage-as", 0,
          "damage-jc", 0,
          "damage-jd", 0,
          "damage-jh", 0,
          "damage-js", 0,
          "damage-kc", 0,
          "damage-kd", 0,
          "damage-kh", 0,
          "damage-ks", 0,
          "damage-qc", 0,
          "damage-qd", 0,
          "damage-qh", 0,
          "damage-qs", 0,
          "damage-tc", 0,
          "damage-td", 0,
          "damage-th", 0,
          "damage-ts", 0,
          "damage-wild-black", 0,
          "damage-wild-red", 0,
          "fatigue", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "deck-bleeding", 0,
          "deck-bloodloss", 0,
          "deck-damage", 0,
          "deck-damageback", 0
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
