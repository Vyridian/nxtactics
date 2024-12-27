'strict mode'

import nx_tactics_ui_uitactics from "../../../../src/nx/tactics/ui/uitactics.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import vx_collection from "../../../../src/vx/collection.js"
import nx_tactics_decks_deck from "../../../../src/nx/tactics/decks/deck.js"
import vx_event from "../../../../src/vx/event.js"
import vx_data_file from "../../../../src/vx/data/file.js"
import nx_tactics_ui_navigation from "../../../../src/nx/tactics/ui/navigation.js"
import nx_tactics_ui_stylesheet from "../../../../src/nx/tactics/ui/stylesheet.js"
import vx_type from "../../../../src/vx/type.js"
import vx_ui_ui from "../../../../src/vx/ui/ui.js"

export default class nx_tactics_ui_uitactics_test {


  static test_package(context) {
    const testcaselist = nx_tactics_ui_uitactics_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/ui/uitactics",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_ui_uitactics_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_ui_uitactics_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/ui/uitactics", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 3), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 66, ":tests", 37, ":total", 56), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 7, ":tests", 4, ":total", 53), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 7, ":tests", 4, ":total", 56), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/ui/uitactics",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "event-navigate-card-click", 0,
          "event-printbutton-click", 0,
          "eventmap-app-home-card", 0
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "event-navigate-card-click<-event", 0,
          "event-printbutton-click<-event", 0,
          "string-display<-any", 0,
          "string-display<-book", 0,
          "string-display<-deck", 0,
          "string-display<-skill", 0,
          "string-display<-unit", 0,
          "string-display<-unitpower", 0,
          "string-display<-unitskill", 0,
          "string<-conscience-beast-shadow", 1,
          "string<-demeanor-nature", 1,
          "string<-land-water-air-space", 1,
          "string<-mass-h-l-w", 1,
          "stringlist-display<-unitabilitymap", 0,
          "stringlist-display<-unititemmap", 0,
          "stringlist-display<-unitpowermap", 0,
          "stringlist-display<-unitskillmap", 0,
          "stringlist-display<-unitspecialtymap", 0,
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
          "ui-app-titlebar-title", 0,
          "ui-app<-tactics", 0,
          "ui-image<-uid-path", 0,
          "ui-nav<-any-parent", 0,
          "ui-nav<-deck-parent", 0,
          "ui-nav<-skill-parent", 0,
          "ui-navbutton-back", 0,
          "ui-navigate<-ui", 0,
          "ui-navigate<-ui-main", 0,
          "ui-navigate<-ui-navbar", 0,
          "ui-suit<-uid-rank-suit-pos", 0,
          "ui-title1<-uid-text", 0,
          "ui-title2<-uid-text", 0,
          "ui<-any-parent", 0,
          "ui<-card-parent", 0,
          "uilist<-card-parent", 0,
          "uilist<-cardimage-parent", 0,
          "uilist<-item-parent", 0,
          "uilist<-ranksuit-parent", 0,
          "uilist<-unit-parent", 0,
          "uimap<-cardmap-parent-page-size", 0
        )
    )
    return output
  }

  static f_string_from_conscience_beast_shadow(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/ui/uitactics",
      ":casename", "string<-conscience-beast-shadow",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n \"conscience:1x1 beast:2x1 shadow:3x1\"\n (string<-conscience-beast-shadow\n  \"1x1\" \"2x1\" \"3x1\"))",
            ":testresult",
            vx_test.f_test(
              context,
              "conscience:1x1 beast:2x1 shadow:3x1",
              nx_tactics_ui_uitactics.f_string_from_conscience_beast_shadow("1x1", "2x1", "3x1")
            )
          )
        )
    )
    return output
  }

  static f_string_from_demeanor_nature(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/ui/uitactics",
      ":casename", "string<-demeanor-nature",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n \"demeanor:nice nature:naughty\"\n (string<-demeanor-nature\n  \"nice\" \"naughty\"))",
            ":testresult",
            vx_test.f_test(
              context,
              "demeanor:nice nature:naughty",
              nx_tactics_ui_uitactics.f_string_from_demeanor_nature("nice", "naughty")
            )
          )
        )
    )
    return output
  }

  static f_string_from_land_water_air_space(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/ui/uitactics",
      ":casename", "string<-land-water-air-space",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n \"land:1 water:2 air:3 space:4\"\n (string<-land-water-air-space\n  \"1\" \"2\" \"3\" \"4\"))",
            ":testresult",
            vx_test.f_test(
              context,
              "land:1 water:2 air:3 space:4",
              nx_tactics_ui_uitactics.f_string_from_land_water_air_space("1", "2", "3", "4")
            )
          )
        )
    )
    return output
  }

  static f_string_from_mass_h_l_w(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/ui/uitactics",
      ":casename", "string<-mass-h-l-w",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n \"mass:80kg/160lb h:2m/6ft l:1m/3ft w:1m/3ft\"\n (string<-mass-h-l-w\n  \"80kg/160lb\" \"2m/6ft\" \"1m/3ft\" \"1m/3ft\"))",
            ":testresult",
            vx_test.f_test(
              context,
              "mass:80kg/160lb h:2m/6ft l:1m/3ft w:1m/3ft",
              nx_tactics_ui_uitactics.f_string_from_mass_h_l_w("80kg/160lb", "2m/6ft", "1m/3ft", "1m/3ft")
            )
          )
        )
    )
    return output
  }

  static test_cases(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcaselist,
      nx_tactics_ui_uitactics_test.f_string_from_conscience_beast_shadow(context),
      nx_tactics_ui_uitactics_test.f_string_from_demeanor_nature(context),
      nx_tactics_ui_uitactics_test.f_string_from_land_water_air_space(context),
      nx_tactics_ui_uitactics_test.f_string_from_mass_h_l_w(context)
    )
    return output
  }
}
