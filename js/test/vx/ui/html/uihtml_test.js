'strict mode'

import vx_ui_html_uihtml from "../../../../src/vx/ui/html/uihtml.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
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
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 3, ":total", 3), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 3), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "vx/ui/html/uihtml",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap,
          "renderer-html", 0
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "renderer-app", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "render-app<-ui-orig", 0
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
