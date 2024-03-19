'strict mode'

import nx_tactics_ui_uitactics from "../../../../src/nx/tactics/ui/uitactics.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import nx_tactics_deck from "../../../../src/nx/tactics/deck.js"
import vx_event from "../../../../src/vx/event.js"
import nx_tactics_ui_navigation from "../../../../src/nx/tactics/ui/navigation.js"
import nx_tactics_ui_stylesheet from "../../../../src/nx/tactics/ui/stylesheet.js"
import vx_type from "../../../../src/vx/type.js"
import vx_ui_ui from "../../../../src/vx/ui/ui.js"

export default class nx_tactics_ui_uitactics_test {


  static test_package(context) {
    const testcaselist = nx_tactics_ui_uitactics_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/ui/uitactics",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_ui_uitactics_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_ui_uitactics_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/ui/uitactics", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 5), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 52, ":tests", 23, ":total", 44), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 39), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 44), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/ui/uitactics",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "event-navbutton-back-click", 0,
          "event-navigate-card-click", 0,
          "event-printbutton-click", 0,
          "eventmap-app-home-card", 0,
          "eventmap-navbutton-back", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "event-navbutton-click<-event", 0,
          "event-navigate-card-click<-event", 0,
          "event-printbutton-click<-event", 0,
          "string-display<-any", 0,
          "string-display<-book", 0,
          "string-display<-deck", 0,
          "string-display<-skill", 0,
          "ui-app", 0,
          "ui-app-background", 0,
          "ui-app-home", 0,
          "ui-app-main", 0,
          "ui-app-menubar", 0,
          "ui-app-menudrawer", 0,
          "ui-app-msgbox", 0,
          "ui-app-navbar", 0,
          "ui-app-navdrawer", 0,
          "ui-app-parallax", 0,
          "ui-app-statusbar", 0,
          "ui-app-statusdrawer", 0,
          "ui-app-titlebar", 0,
          "ui-app-titlebar-print", 0,
          "ui-app<-tactics", 0,
          "ui-nav<-any-parent", 0,
          "ui-nav<-deck-parent", 0,
          "ui-nav<-skill-parent", 0,
          "ui-navbutton-back", 0,
          "ui-navigate<-ui", 0,
          "ui-navigate<-ui-main", 0,
          "ui-navigate<-ui-navbar", 0,
          "ui<-any-parent", 0,
          "ui<-card-parent", 0,
          "ui<-fate-parent", 0,
          "ui<-unit-background", 0,
          "ui<-unit-flavor", 0,
          "ui<-unit-header", 0,
          "ui<-unit-parent", 0,
          "ui<-unit-skillpower", 0,
          "ui<-unit-stat", 0,
          "uimap<-cardmap-parent", 0
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
