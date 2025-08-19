'strict mode'

import nx_tactics_decks_vehicle from "../../../../src/nx/tactics/decks/vehicle.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_decks_vehicle_test {


  static test_package(context) {
    const testcaselist = nx_tactics_decks_vehicle_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/decks/vehicle",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_decks_vehicle_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_decks_vehicle_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/decks/vehicle", 
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
      "testpkg", "nx/tactics/decks/vehicle",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "malfunction", 0,
          "vehicle-2c", 0,
          "vehicle-2d", 0,
          "vehicle-2h", 0,
          "vehicle-2s", 0,
          "vehicle-3c", 0,
          "vehicle-3d", 0,
          "vehicle-3h", 0,
          "vehicle-3s", 0,
          "vehicle-4c", 0,
          "vehicle-4d", 0,
          "vehicle-4h", 0,
          "vehicle-4s", 0,
          "vehicle-5c", 0,
          "vehicle-5d", 0,
          "vehicle-5h", 0,
          "vehicle-5s", 0,
          "vehicle-6c", 0,
          "vehicle-6d", 0,
          "vehicle-6h", 0,
          "vehicle-6s", 0,
          "vehicle-7c", 0,
          "vehicle-7d", 0,
          "vehicle-7h", 0,
          "vehicle-7s", 0,
          "vehicle-8c", 0,
          "vehicle-8d", 0,
          "vehicle-8h", 0,
          "vehicle-8s", 0,
          "vehicle-9c", 0,
          "vehicle-9d", 0,
          "vehicle-9h", 0,
          "vehicle-9s", 0,
          "vehicle-ac", 0,
          "vehicle-ad", 0,
          "vehicle-ah", 0,
          "vehicle-as", 0,
          "vehicle-jc", 0,
          "vehicle-jd", 0,
          "vehicle-jh", 0,
          "vehicle-js", 0,
          "vehicle-kc", 0,
          "vehicle-kd", 0,
          "vehicle-kh", 0,
          "vehicle-ks", 0,
          "vehicle-qc", 0,
          "vehicle-qd", 0,
          "vehicle-qh", 0,
          "vehicle-qs", 0,
          "vehicle-tc", 0,
          "vehicle-td", 0,
          "vehicle-th", 0,
          "vehicle-ts", 0,
          "vehicle-wild-black", 0,
          "vehicle-wild-red", 0
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "deck-vehicle", 0
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
