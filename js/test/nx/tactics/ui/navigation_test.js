'strict mode'

import nx_tactics_ui_navigation from "../../../../src/nx/tactics/ui/navigation.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_ui_stylesheet from "../../../../src/nx/tactics/ui/stylesheet.js"
import vx_ui_ui from "../../../../src/vx/ui/ui.js"

export default class nx_tactics_ui_navigation_test {


  static test_package(context) {
    const testcaselist = nx_tactics_ui_navigation_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/ui/navigation",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_ui_navigation_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_ui_navigation_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/ui/navigation", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 62, ":tests", 5, ":total", 8), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 8), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 8), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/ui/navigation",
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
          "boolean-navigate-back", 0,
          "ui-app", 0,
          "ui-layout<-main-selected", 0,
          "ui-layout<-navbar-selected", 0,
          "ui-main", 0,
          "ui-navbar", 0,
          "ui-navbutton", 0,
          "ui-navbutton<-ui-parent-selected", 0
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
