'strict mode'

import vx_ui_ui from "../../../src/vx/ui/ui.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"

export default class vx_ui_ui_test {


  static test_package(context) {
    const testcaselist = vx_ui_ui_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "vx/ui/ui",
      ":caselist", testcaselist,
      ":coveragesummary", vx_ui_ui_test.test_coveragesummary(),
      ":coveragedetail", vx_ui_ui_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "vx/ui/ui", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 16), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 33, ":tests", 9, ":total", 27), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 4), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 27), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 7)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "vx/ui/ui",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap,
          "render", 0,
          "renderer", 0,
          "rendermap", 0,
          "ui", 0,
          "uilayout", 0,
          "uimap", 0,
          "uistyle", 0
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "uilayout-app", 0,
          "uilayout-background", 0,
          "uilayout-combobox", 0,
          "uilayout-flow-horizontal", 0,
          "uilayout-flow-vertical", 0,
          "uilayout-image", 0,
          "uilayout-navigation", 0,
          "uilayout-panel", 0,
          "uilayout-parallax", 0,
          "uilayout-scrollbox", 0,
          "uilayout-scrollbox-horizontal", 0,
          "uilayout-scrollbox-vertical", 0,
          "uilayout-split-horizontal", 0,
          "uilayout-split-vertical", 0,
          "uilayout-text", 0,
          "uilayout-textentry", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "render<-ui", 0,
          "render<-ui-orig", 0,
          "rendermap<-uimap", 0,
          "ui-render<-ui-orig", 0
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
