'strict mode'

import vx_ui_panel from "../../../src/vx/ui/panel.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"

export default class vx_ui_panel_test {


  static test_package(context) {
    const testcaselist = vx_ui_panel_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "vx/ui/panel",
      ":caselist", testcaselist,
      ":coveragesummary", vx_ui_panel_test.test_coveragesummary(),
      ":coveragedetail", vx_ui_panel_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "vx/ui/panel", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 5), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 30, ":tests", 3, ":total", 10), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 2), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 10), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 3)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "vx/ui/panel",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap,
          "layout", 0,
          "panel", 0,
          "panelmap", 0
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "layout-app", 0,
          "layout-background", 0,
          "layout-navigation", 0,
          "layout-split-horizontal", 0,
          "layout-split-vertical", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "any-render<-panel", 0,
          "boolean-render<-panelmap", 0
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
