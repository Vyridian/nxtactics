'strict mode'

import nx_tactics_uitactics from "../../../src/nx/tactics/uitactics.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"
import nx_tactics_base from "../../../src/nx/tactics/base.js"
import vx_ui_ui from "../../../src/vx/ui/ui.js"

export default class nx_tactics_uitactics_test {


  static test_package(context) {
    const testcaselist = nx_tactics_uitactics_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/uitactics",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_uitactics_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_uitactics_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/uitactics", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 25, ":tests", 4, ":total", 16), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 16), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 16), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/uitactics",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "ui-app", 0,
          "ui-app-background", 0,
          "ui-app-home", 0,
          "ui-app-nav", 0,
          "ui-app-navbar", 0,
          "ui-app-parallax", 0,
          "ui-app-status", 0,
          "ui-app-style", 0,
          "ui-app<-tactics", 0,
          "ui-unit", 0,
          "ui-unit-background", 0,
          "ui-unit-flavor", 0,
          "ui-unit-header", 0,
          "ui-unit-skillpower", 0,
          "ui-unit-stat", 0,
          "ui-unit-style", 0
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
