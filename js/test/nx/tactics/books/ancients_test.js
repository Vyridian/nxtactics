'strict mode'

import nx_tactics_books_ancients from "../../../../src/nx/tactics/books/ancients.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_books_ancients_test {


  static test_package(context) {
    const testcaselist = nx_tactics_books_ancients_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/books/ancients",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_books_ancients_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_books_ancients_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/books/ancients", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 14), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 14), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 14), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/books/ancients",
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
          "chapter_ancients_overview", 0,
          "chapter_ancients_scenarios", 0,
          "chapter_anglo_saxons", 0,
          "chapter_carthaginians", 0,
          "chapter_chinese_dynasty", 0,
          "chapter_egyptian_dynasty", 0,
          "chapter_germanic_tribes", 0,
          "chapter_greek_city_states", 0,
          "chapter_macedon", 0,
          "chapter_norsemen", 0,
          "chapter_persians", 0,
          "chapter_roman_empire", 0,
          "chapter_unfiled_ancient", 0,
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
