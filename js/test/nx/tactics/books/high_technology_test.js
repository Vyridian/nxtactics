'strict mode'

import nx_tactics_books_high_technology from "../../../../src/nx/tactics/books/high_technology.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_books_high_technology_test {


  static test_package(context) {
    const testcaselist = nx_tactics_books_high_technology_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/books/high_technology",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_books_high_technology_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_books_high_technology_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/books/high_technology", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 15), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 15), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 15), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/books/high_technology",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "chapter_car_wars", 0,
          "chapter_cyberpunk", 0,
          "chapter_cyberpunk_campaign", 0,
          "chapter_high_tech_aircraft", 0,
          "chapter_high_tech_equipment", 0,
          "chapter_high_tech_heavy_armor", 0,
          "chapter_high_tech_overview", 0,
          "chapter_high_tech_rules", 0,
          "chapter_high_tech_spacecraft", 0,
          "chapter_jovian_chronicles", 0,
          "chapter_mobile_suit_gundam_equipment", 0,
          "chapter_mobile_suit_gundam_units", 0,
          "chapter_space_colonies", 0,
          "chapter_terminator", 0,
          "tacticsbook", 0
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
