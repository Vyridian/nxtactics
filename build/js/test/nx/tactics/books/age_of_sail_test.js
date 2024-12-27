'strict mode'

import nx_tactics_books_age_of_sail from "../../../../src/nx/tactics/books/age_of_sail.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_books_age_of_sail_test {


  static test_package(context) {
    const testcaselist = nx_tactics_books_age_of_sail_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/books/age_of_sail",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_books_age_of_sail_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_books_age_of_sail_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/books/age_of_sail", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 8), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 8), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 8), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/books/age_of_sail",
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
          "chapter_age_of_sail_overview", 0,
          "chapter_age_of_sail_weaponry", 0,
          "chapter_american_revolution", 0,
          "chapter_french_revolution", 0,
          "chapter_golden_age_of_sail", 0,
          "chapter_renaissance", 0,
          "chapter_tokugawa_shogunate", 0,
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
