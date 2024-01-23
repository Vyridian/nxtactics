'strict mode'

import nx_tactics_base from "../../../src/nx/tactics/base.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"

export default class nx_tactics_base_test {


  static test_package(context) {
    const testcaselist = nx_tactics_base_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/base",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_base_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_base_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/base", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 28), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 3, ":tests", 2, ":total", 66), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 66), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 37)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/base",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap,
          "ability", 0,
          "abilitylist", 0,
          "book", 0,
          "booklist", 0,
          "card", 0,
          "cardlist", 0,
          "chapter", 0,
          "chapterlist", 0,
          "damage", 0,
          "damagelist", 0,
          "deck", 0,
          "decklist", 0,
          "item", 0,
          "itemlist", 0,
          "location", 0,
          "locationlist", 0,
          "playingcard", 0,
          "power", 0,
          "powerlist", 0,
          "rank", 0,
          "rating", 0,
          "role", 0,
          "rolelist", 0,
          "rule", 0,
          "rulelist", 0,
          "scenario", 0,
          "scenariolist", 0,
          "section", 0,
          "sectionlist", 0,
          "skill", 0,
          "skilllist", 0,
          "specialty", 0,
          "specialtylist", 0,
          "suit", 0,
          "suitlist", 0,
          "unit", 0,
          "unitlist", 0
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "rank-10", 0,
          "rank-2", 0,
          "rank-3", 0,
          "rank-4", 0,
          "rank-5", 0,
          "rank-6", 0,
          "rank-7", 0,
          "rank-8", 0,
          "rank-9", 0,
          "rank-ace", 0,
          "rank-jack", 0,
          "rank-joker", 0,
          "rank-king", 0,
          "rank-queen", 0,
          "role-aoe", 0,
          "role-bosskiller", 0,
          "role-buffer", 0,
          "role-crowdcontrol", 0,
          "role-distracter", 0,
          "role-healer", 0,
          "role-sniper", 0,
          "role-tank", 0,
          "role-trapper", 0,
          "role-utility", 0,
          "suit-club", 0,
          "suit-diamond", 0,
          "suit-heart", 0,
          "suit-spade", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "rating<-mass", 0
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
