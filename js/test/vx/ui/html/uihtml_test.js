'strict mode'

import vx_ui_html_uihtml from "../../../../src/vx/ui/html/uihtml.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import vx_web_html from "../../../../src/vx/web/html.js"
import vx_web_htmldoc from "../../../../src/vx/web/htmldoc.js"
import vx_ui_ui from "../../../../src/vx/ui/ui.js"

export default class vx_ui_html_uihtml_test {


  static test_package(context) {
    const testcaselist = vx_ui_html_uihtml_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "vx/ui/html/uihtml",
      ":caselist", testcaselist,
      ":coveragesummary", vx_ui_html_uihtml_test.test_coveragesummary(),
      ":coveragedetail", vx_ui_html_uihtml_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "vx/ui/html/uihtml", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 2), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 60, ":tests", 6, ":total", 10), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 8), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 10), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "vx/ui/html/uihtml",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "renderer-app", 0,
          "renderer-default", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "divchildlist<-uimap", 0,
          "node-app<-ui-orig-parent", 0,
          "node-render<-node-uid", 0,
          "renderer<-style", 0,
          "ui-render-app<-ui-orig-parent", 0,
          "ui-render-default<-ui-orig-parent", 0,
          "ui-renderer<-ui", 0,
          "uimap-renderer<-uimap", 0
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
