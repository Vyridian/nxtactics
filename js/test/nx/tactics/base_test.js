'strict mode'

import nx_tactics_base from "../../../src/nx/tactics/base.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"
import vx_collection from "../../../src/vx/collection.js"

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
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 36), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 21, ":tests", 30, ":total", 137), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 7, ":tests", 2, ":total", 28), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 1, ":tests", 2, ":total", 137), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 73)
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
          "abilitymap", 0,
          "book", 0,
          "booklist", 0,
          "bookmap", 0,
          "card", 0,
          "cardlist", 0,
          "cardmap", 0,
          "chapter", 0,
          "chapterlist", 0,
          "chapterlistlist", 0,
          "chaptermap", 0,
          "damage", 0,
          "damagelist", 0,
          "damagemap", 0,
          "deck", 0,
          "deckmap", 0,
          "fate", 0,
          "goal", 0,
          "item", 0,
          "itemmap", 0,
          "location", 0,
          "locationmap", 0,
          "mind", 0,
          "modifier", 0,
          "modifiermap", 0,
          "playingcard", 0,
          "power", 0,
          "powermap", 0,
          "rank", 0,
          "rating", 0,
          "role", 0,
          "rolemap", 0,
          "rule", 0,
          "rulemap", 0,
          "scenario", 0,
          "scenariomap", 0,
          "section", 0,
          "sectionlist", 0,
          "sectionlistlist", 0,
          "sectionmap", 0,
          "skill", 0,
          "skilllist", 0,
          "skilllistlist", 0,
          "skillmap", 0,
          "specialty", 0,
          "specialtymap", 0,
          "stat", 0,
          "suit", 0,
          "suitmap", 0,
          "tactics", 0,
          "tarot", 0,
          "team", 0,
          "teammap", 0,
          "terrain", 0,
          "terrainmap", 0,
          "threat", 0,
          "unit", 0,
          "unitability", 0,
          "unitabilitymap", 0,
          "unititem", 0,
          "unititemmap", 0,
          "unitmap", 0,
          "unitpower", 0,
          "unitpowermap", 0,
          "unitskill", 0,
          "unitskillmap", 0,
          "unitspecialty", 0,
          "unitspecialtymap", 0,
          "unitweakness", 0,
          "unitweaknessmap", 0,
          "weakness", 0,
          "weaknessmap", 0
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "rank-ace", 0,
          "rank-eight", 0,
          "rank-five", 0,
          "rank-four", 0,
          "rank-jack", 0,
          "rank-joker", 0,
          "rank-king", 0,
          "rank-nine", 0,
          "rank-queen", 0,
          "rank-seven", 0,
          "rank-six", 0,
          "rank-ten", 0,
          "rank-three", 0,
          "rank-two", 0,
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
          "stat-beast", 0,
          "stat-body", 0,
          "stat-mind", 0,
          "stat-shadow", 0,
          "stat-speed", 0,
          "stat-will", 0,
          "suit-black", 0,
          "suit-club", 0,
          "suit-diamond", 0,
          "suit-heart", 0,
          "suit-red", 0,
          "suit-spade", 0
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "bookmap<-booklist", 0,
          "cardmap<-bookmap", 0,
          "cardmap<-cardlist", 0,
          "chapterlist<-book", 0,
          "chapterlist<-booklist", 0,
          "chapterlist<-chapterlistlist", 0,
          "chapterlistlist<-booklist", 0,
          "chaptermap<-chapterlist", 0,
          "name<-chapter", 0,
          "rating<-mass", 0,
          "sectionlist-all<-chapterlist", 0,
          "sectionlist-all<-section", 0,
          "sectionlist-all<-sectionlist", 1,
          "sectionlist<-chapter", 0,
          "sectionlist<-chapterlist", 0,
          "sectionlist<-section", 0,
          "sectionlist<-sectionlistlist", 0,
          "sectionlist<-sectionmap", 0,
          "sectionlistlist<-chapterlist", 0,
          "sectionlistlist<-sectionlist", 1,
          "sectionmap<-sectionlist", 0,
          "skilllist<-section", 0,
          "skilllist<-sectionlist", 0,
          "skilllist<-skilllistlist", 0,
          "skilllist<-skillmap", 0,
          "skilllistlist<-sectionlist", 0,
          "skillmap<-skilllist", 0,
          "tactics<-booklist", 0
        )
    )
  }

  static f_sectionlist_all_from_sectionlist(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/base",
      ":casename", "sectionlist-all<-sectionlist",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (sectionlist\n  (section\n   :name \"a\"\n   :sectionmap\n    (sectionmap\n     \"a1\"\n     (section\n      :name \"a1\")))\n  (section\n   :name \"a1\")\n  (section\n   :name \"b\"\n   :sectionmap\n    (sectionmap\n     \"b1\"\n     (section\n      :name \"b1\")))\n  (section\n   :name \"b1\"))\n (sectionlist-all<-sectionlist\n  (sectionlist\n   (section\n    :name \"a\"\n    :sectionmap\n     (sectionmap\n      \"a1\"\n      (section\n       :name \"a1\")))\n   (section\n    :name \"b\"\n    :sectionmap\n     (sectionmap\n      \"b1\"\n      (section\n       :name \"b1\"))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_sectionlist,
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "a",
                  ":sectionmap",
                  vx_core.f_new(
                    nx_tactics_base.t_sectionmap,
                    "a1",
                    vx_core.f_new(
                      nx_tactics_base.t_section,
                      ":name",
                      "a1"
                    )
                  )
                ),
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "a1"
                ),
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "b",
                  ":sectionmap",
                  vx_core.f_new(
                    nx_tactics_base.t_sectionmap,
                    "b1",
                    vx_core.f_new(
                      nx_tactics_base.t_section,
                      ":name",
                      "b1"
                    )
                  )
                ),
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "b1"
                )
              ),
              nx_tactics_base.f_sectionlist_all_from_sectionlist(
                vx_core.f_new(
                  nx_tactics_base.t_sectionlist,
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "a",
                    ":sectionmap",
                    vx_core.f_new(
                      nx_tactics_base.t_sectionmap,
                      "a1",
                      vx_core.f_new(
                        nx_tactics_base.t_section,
                        ":name",
                        "a1"
                      )
                    )
                  ),
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "b",
                    ":sectionmap",
                    vx_core.f_new(
                      nx_tactics_base.t_sectionmap,
                      "b1",
                      vx_core.f_new(
                        nx_tactics_base.t_section,
                        ":name",
                        "b1"
                      )
                    )
                  )
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_sectionlistlist_from_sectionlist(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/base",
      ":casename", "sectionlistlist<-sectionlist",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (sectionlistlist\n  (sectionlist\n   (section\n    :name \"a\"\n    :sectionmap\n     (sectionmap\n      \"a1\"\n      (section\n       :name \"a1\")))\n   (section\n    :name \"a1\"))\n  (sectionlist\n   (section\n    :name \"b\"\n    :sectionmap\n     (sectionmap\n      \"b1\"\n      (section\n       :name \"b1\")))\n   (section\n    :name \"b1\")))\n (sectionlistlist<-sectionlist\n  (sectionlist\n   (section\n    :name \"a\"\n    :sectionmap\n     (sectionmap\n      \"a1\"\n      (section\n       :name \"a1\")))\n   (section\n    :name \"b\"\n    :sectionmap\n     (sectionmap\n      \"b1\"\n      (section\n       :name \"b1\"))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_sectionlistlist,
                vx_core.f_new(
                  nx_tactics_base.t_sectionlist,
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "a",
                    ":sectionmap",
                    vx_core.f_new(
                      nx_tactics_base.t_sectionmap,
                      "a1",
                      vx_core.f_new(
                        nx_tactics_base.t_section,
                        ":name",
                        "a1"
                      )
                    )
                  ),
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "a1"
                  )
                ),
                vx_core.f_new(
                  nx_tactics_base.t_sectionlist,
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "b",
                    ":sectionmap",
                    vx_core.f_new(
                      nx_tactics_base.t_sectionmap,
                      "b1",
                      vx_core.f_new(
                        nx_tactics_base.t_section,
                        ":name",
                        "b1"
                      )
                    )
                  ),
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "b1"
                  )
                )
              ),
              nx_tactics_base.f_sectionlistlist_from_sectionlist(
                vx_core.f_new(
                  nx_tactics_base.t_sectionlist,
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "a",
                    ":sectionmap",
                    vx_core.f_new(
                      nx_tactics_base.t_sectionmap,
                      "a1",
                      vx_core.f_new(
                        nx_tactics_base.t_section,
                        ":name",
                        "a1"
                      )
                    )
                  ),
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "b",
                    ":sectionmap",
                    vx_core.f_new(
                      nx_tactics_base.t_sectionmap,
                      "b1",
                      vx_core.f_new(
                        nx_tactics_base.t_section,
                        ":name",
                        "b1"
                      )
                    )
                  )
                )
              )
            )
          )
        )
    )
    return output
  }

  static test_cases(context) {
    const output = vx_core.f_new(
      vx_test.t_testcaselist,
      nx_tactics_base_test.f_sectionlist_all_from_sectionlist(context),
      nx_tactics_base_test.f_sectionlistlist_from_sectionlist(context)
    )
    return output
  }
}
