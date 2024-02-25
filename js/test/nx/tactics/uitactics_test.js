'strict mode'

import nx_tactics_uitactics from "../../../src/nx/tactics/uitactics.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"
import nx_tactics_base from "../../../src/nx/tactics/base.js"
import vx_event from "../../../src/vx/event.js"
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
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 20), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 27, ":tests", 12, ":total", 44), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 24), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 44), 
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
          vx_core.t_intmap,
          "event-app-home-card-click", 0,
          "eventmap-app-home-card", 0,
          "point-cardsize", 0,
          "style-app", 0,
          "style-app-background", 0,
          "style-app-home", 0,
          "style-app-main", 0,
          "style-app-menubar", 0,
          "style-app-menudrawer", 0,
          "style-app-msgbox", 0,
          "style-app-navbar", 0,
          "style-app-navdrawer", 0,
          "style-app-parallax", 0,
          "style-app-statusbar", 0,
          "style-app-statusdrawer", 0,
          "style-body", 0,
          "style-card", 0,
          "style-clickable", 0,
          "style-html", 0,
          "stylesheet-app", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "event-app-home-card-click<-event", 0,
          "ui-app", 0,
          "ui-app-background", 0,
          "ui-app-home", 0,
          "ui-app-home-books", 0,
          "ui-app-home-powers", 0,
          "ui-app-home-skills", 0,
          "ui-app-main", 0,
          "ui-app-menubar", 0,
          "ui-app-menudrawer", 0,
          "ui-app-msgbox", 0,
          "ui-app-navbar", 0,
          "ui-app-navdrawer", 0,
          "ui-app-parallax", 0,
          "ui-app-statusbar", 0,
          "ui-app-statusdrawer", 0,
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
