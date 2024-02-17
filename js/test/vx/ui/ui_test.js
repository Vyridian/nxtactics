'strict mode'

import vx_ui_ui from "../../../src/vx/ui/ui.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"
import vx_event from "../../../src/vx/event.js"

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
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 22), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 32, ":tests", 13, ":total", 40), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 6), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 40), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 12)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "vx/ui/ui",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap,
          "layout", 0,
          "point", 0,
          "pointstyle", 0,
          "render", 0,
          "renderer", 0,
          "rendermap", 0,
          "style", 0,
          "stylelist", 0,
          "stylemap", 0,
          "stylesheet", 0,
          "ui", 0,
          "uimap", 0
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "layout-app", 0,
          "layout-background", 0,
          "layout-combobox", 0,
          "layout-flow-horizontal", 0,
          "layout-flow-vertical", 0,
          "layout-image", 0,
          "layout-maxpanel", 0,
          "layout-menubar", 0,
          "layout-menudrawer", 0,
          "layout-navbar", 0,
          "layout-navdrawer", 0,
          "layout-panel", 0,
          "layout-parallax", 0,
          "layout-scrollbox", 0,
          "layout-scrollbox-horizontal", 0,
          "layout-scrollbox-vertical", 0,
          "layout-split-horizontal", 0,
          "layout-split-vertical", 0,
          "layout-statusbar", 0,
          "layout-statusdrawer", 0,
          "layout-text", 0,
          "layout-textentry", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "layout<-style", 0,
          "ui-render<-fn-render-ui-orig-parent", 0,
          "ui-render<-ui", 0,
          "ui-render<-ui-orig-parent", 0,
          "ui<-renderer-ui-orig-parent", 0,
          "uimap-render<-uimap", 0
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
