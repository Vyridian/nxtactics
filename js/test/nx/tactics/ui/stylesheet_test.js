'strict mode'

import nx_tactics_ui_stylesheet from "../../../../src/nx/tactics/ui/stylesheet.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import vx_data_file from "../../../../src/vx/data/file.js"
import vx_ui_ui from "../../../../src/vx/ui/ui.js"

export default class nx_tactics_ui_stylesheet_test {


  static test_package(context) {
    const testcaselist = nx_tactics_ui_stylesheet_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/ui/stylesheet",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_ui_stylesheet_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_ui_stylesheet_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/ui/stylesheet", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 88), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 34, ":tests", 30, ":total", 88), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 88), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/ui/stylesheet",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "font-header1", 0,
          "font-header2", 0,
          "font-label", 0,
          "font-rank", 0,
          "font-text", 0,
          "font-text-2", 0,
          "font-textarea", 0,
          "font-title", 0,
          "fontface1", 0,
          "fontface2", 0,
          "fontface3", 0,
          "image-jester-black", 0,
          "image-jester-red", 0,
          "point-cardsize", 0,
          "point-iconsize", 0,
          "point-rank-pos1", 0,
          "point-rank-pos2", 0,
          "point-rank-size", 0,
          "point-suit-pos1", 0,
          "point-suit-pos2", 0,
          "point-suit-size", 0,
          "style-app", 0,
          "style-app-background", 0,
          "style-app-main", 0,
          "style-app-menubar", 0,
          "style-app-menudrawer", 0,
          "style-app-msgbox", 0,
          "style-app-navbar", 0,
          "style-app-navbar-button", 0,
          "style-app-navdrawer", 0,
          "style-app-parallax", 0,
          "style-app-statusbar", 0,
          "style-app-statusdrawer", 0,
          "style-app-titlebar", 0,
          "style-app-titlebar-print", 0,
          "style-body", 0,
          "style-button-back", 0,
          "style-card", 0,
          "style-card-display", 0,
          "style-card-display2", 0,
          "style-card-display3", 0,
          "style-card-display4", 0,
          "style-card-rank", 0,
          "style-card-suit", 0,
          "style-card-title1", 0,
          "style-card-title2", 0,
          "style-clickable", 0,
          "style-deck", 0,
          "style-div", 0,
          "style-hidden", 0,
          "style-html", 0,
          "style-image-background", 0,
          "style-image-coin1", 0,
          "style-image-coin2", 0,
          "style-image-cup1", 0,
          "style-image-cup2", 0,
          "style-image-jester-black1", 0,
          "style-image-jester-black2", 0,
          "style-image-jester-red1", 0,
          "style-image-jester-red2", 0,
          "style-image-sword1", 0,
          "style-image-sword2", 0,
          "style-image-wand1", 0,
          "style-image-wand2", 0,
          "style-selected", 0,
          "style-text", 0,
          "style-text-2", 0,
          "style-text-header1", 0,
          "style-text-header2", 0,
          "style-text-label", 0,
          "style-text-rank1", 0,
          "style-text-rank2", 0,
          "style-text-title", 0,
          "style-textarea", 0,
          "style-unit", 0,
          "style-unit-body", 0,
          "style-unit-bodydetail", 0,
          "style-unit-detail", 0,
          "style-unit-image", 0,
          "style-unit-mind", 0,
          "style-unit-minddetail", 0,
          "style-unit-move", 0,
          "style-unit-movedetail", 0,
          "style-unit-titles", 0,
          "style-unit-value", 0,
          "style-unit-will", 0,
          "style-unit-willdetail", 0,
          "stylesheet-app", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap
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
