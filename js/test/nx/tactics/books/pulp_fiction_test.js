'strict mode'

import nx_tactics_books_pulp_fiction from "../../../../src/nx/tactics/books/pulp_fiction.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_books_pulp_fiction_test {


  static test_package(context) {
    const testcaselist = nx_tactics_books_pulp_fiction_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/books/pulp_fiction",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_books_pulp_fiction_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_books_pulp_fiction_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/books/pulp_fiction", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 10), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 10), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 10), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/books/pulp_fiction",
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
          "chapter_action_adventure", 0,
          "chapter_flash_gordon", 0,
          "chapter_hardboiled_detective", 0,
          "chapter_john_carter_on_mars", 0,
          "chapter_land_of_the_lost", 0,
          "chapter_lost_continent", 0,
          "chapter_pulp_fiction_overview", 0,
          "chapter_true_grit___crime", 0,
          "chapter_war_of_the_worlds", 0,
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
