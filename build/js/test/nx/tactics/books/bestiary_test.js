'strict mode'

import nx_tactics_books_bestiary from "../../../../src/nx/tactics/books/bestiary.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"

export default class nx_tactics_books_bestiary_test {


  static test_package(context) {
    const testcaselist = nx_tactics_books_bestiary_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/books/bestiary",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_books_bestiary_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_books_bestiary_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/books/bestiary", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 23), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 23), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 23), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/books/bestiary",
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
          "chapter_amphibians", 0,
          "chapter_arthropods", 0,
          "chapter_avians", 0,
          "chapter_beastmen", 0,
          "chapter_bestiary_overview", 0,
          "chapter_constructs", 0,
          "chapter_darkling", 0,
          "chapter_dragons", 0,
          "chapter_elementals", 0,
          "chapter_extra-dimensional", 0,
          "chapter_giant_races", 0,
          "chapter_humanoids", 0,
          "chapter_humanoids_fantastic", 0,
          "chapter_mammals_marsupials", 0,
          "chapter_marine_creatures", 0,
          "chapter_microorganisms", 0,
          "chapter_mythical_beasts", 0,
          "chapter_plants", 0,
          "chapter_reptiles", 0,
          "chapter_shapeshifters", 0,
          "chapter_undead_creatures", 0,
          "chapter_underground_creatures", 0,
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
