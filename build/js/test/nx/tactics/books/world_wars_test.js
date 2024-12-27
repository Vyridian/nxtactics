'strict mode'

import nx_tactics_books_world_wars from "../../../../src/nx/tactics/books/world_wars.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_books_world_wars_test {


  static test_package(context) {
    const testcaselist = nx_tactics_books_world_wars_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/books/world_wars",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_books_world_wars_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_books_world_wars_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/books/world_wars", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 28), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 28), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 28), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/books/world_wars",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "chapter_world_wars_overview", 0,
          "chapter_wwi_british_forces", 0,
          "chapter_wwi_campaign", 0,
          "chapter_wwi_french_forces", 0,
          "chapter_wwi_german_forces", 0,
          "chapter_wwii_american_equipment", 0,
          "chapter_wwii_american_units", 0,
          "chapter_wwii_british_equipment", 0,
          "chapter_wwii_british_units", 0,
          "chapter_wwii_east_african_theatre", 0,
          "chapter_wwii_eastern_front", 0,
          "chapter_wwii_equipment", 0,
          "chapter_wwii_french_equipment", 0,
          "chapter_wwii_french_units", 0,
          "chapter_wwii_german_equipment", 0,
          "chapter_wwii_german_units", 0,
          "chapter_wwii_italian_units", 0,
          "chapter_wwii_japanese_equipment", 0,
          "chapter_wwii_japanese_units", 0,
          "chapter_wwii_mediterranean_theatre", 0,
          "chapter_wwii_middle_east_theatre", 0,
          "chapter_wwii_north_african_theatre", 0,
          "chapter_wwii_overview", 0,
          "chapter_wwii_pacific_theatre", 0,
          "chapter_wwii_soviet_equipment", 0,
          "chapter_wwii_soviet_units", 0,
          "chapter_wwii_western_front", 0,
          "tacticsbook", 0
        )
    )
    return output
  }

  static test_cases(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcaselist
    )
    return output
  }
}
