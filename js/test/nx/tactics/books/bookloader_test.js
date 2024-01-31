'strict mode'

import nx_tactics_books_bookloader from "../../../../src/nx/tactics/books/bookloader.js"
import vx_core from "../../../../src/vx/core.js"
import vx_test from "../../../../src/vx/test.js"
import nx_tactics_base from "../../../../src/nx/tactics/base.js"
import vx_data_file from "../../../../src/vx/data/file.js"
import vx_type from "../../../../src/vx/type.js"
import vx_data_xml from "../../../../src/vx/data/xml.js"

export default class nx_tactics_books_bookloader_test {


  static test_package(context) {
    const testcaselist = nx_tactics_books_bookloader_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "nx/tactics/books/bookloader",
      ":caselist", testcaselist,
      ":coveragesummary", nx_tactics_books_bookloader_test.test_coveragesummary(),
      ":coveragedetail", nx_tactics_books_bookloader_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "nx/tactics/books/bookloader", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 90, ":tests", 116, ":total", 128), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 34, ":tests", 44, ":total", 128), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 34, ":tests", 44, ":total", 128), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "nx/tactics/books/bookloader",
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
          "ability<-ability-key-value", 0,
          "ability<-ability-stringmap", 1,
          "ability<-ability-xmlchild", 1,
          "ability<-xml", 1,
          "book-read<-bookname", 0,
          "book<-book-key-value", 2,
          "book<-book-stringmap", 1,
          "book<-book-xml", 3,
          "book<-book-xmlchapter", 1,
          "book<-book-xmlchild", 2,
          "book<-xml", 1,
          "book<-xmldoc", 1,
          "book<-xmllist", 1,
          "boolean-write<-book", 0,
          "boolean-write<-booknames", 0,
          "chapter<-chapter-key-value", 0,
          "chapter<-chapter-stringmap", 1,
          "chapter<-chapter-xmlchild", 1,
          "chapter<-chapter-xmlsection", 0,
          "chapter<-xml", 1,
          "damage<-damage-key-value", 0,
          "damage<-damage-stringmap", 1,
          "damage<-damage-xmlchild", 1,
          "damage<-xml", 0,
          "file-read<-bookname", 0,
          "file-write<-book", 0,
          "item<-item-key-value", 0,
          "item<-item-stringmap", 0,
          "item<-item-xmlchild", 0,
          "item<-xml", 0,
          "location<-location-key-value", 0,
          "location<-location-stringmap", 0,
          "location<-location-xmlchild", 0,
          "location<-xml", 0,
          "modifier<-modifier-key-value", 0,
          "modifier<-modifier-stringmap", 0,
          "modifier<-modifier-xmlchild", 0,
          "modifier<-xml", 0,
          "power<-power-key-value", 0,
          "power<-power-stringmap", 1,
          "power<-power-xmlability", 0,
          "power<-power-xmlchild", 1,
          "power<-power-xmlspecialty", 0,
          "power<-xml", 1,
          "rule<-rule-key-value", 0,
          "rule<-rule-stringmap", 1,
          "rule<-rule-xmlchild", 1,
          "rule<-xml", 0,
          "scenario<-scenario-key-value", 0,
          "scenario<-scenario-stringmap", 0,
          "scenario<-scenario-xmlchild", 0,
          "scenario<-scenario-xmlteam", 0,
          "scenario<-xml", 1,
          "section<-section-key-value", 0,
          "section<-section-stringmap", 0,
          "section<-section-xmlchild", 0,
          "section<-section-xmldamage", 0,
          "section<-section-xmlitem", 0,
          "section<-section-xmllocation", 0,
          "section<-section-xmlmodifier", 0,
          "section<-section-xmlpower", 0,
          "section<-section-xmlrule", 0,
          "section<-section-xmlscenario", 0,
          "section<-section-xmlsection", 0,
          "section<-section-xmlskill", 0,
          "section<-section-xmlterrain", 0,
          "section<-section-xmlunit", 0,
          "section<-xml", 1,
          "skill<-skill-key-value", 0,
          "skill<-skill-stringmap", 0,
          "skill<-skill-xmlability", 0,
          "skill<-skill-xmlchild", 1,
          "skill<-skill-xmlspecialty", 0,
          "skill<-xml", 1,
          "specialty<-specialty-key-value", 0,
          "specialty<-specialty-stringmap", 1,
          "specialty<-specialty-xmlchild", 1,
          "specialty<-xml", 1,
          "string-read<-bookname", 0,
          "string-vxlisp-header<-chaptermap", 0,
          "string-vxlisp<-book", 0,
          "string-vxlisp<-chapter", 0,
          "string-vxlisp<-chaptermap", 0,
          "string-writename<-string", 0,
          "team<-team-key-value", 0,
          "team<-team-stringmap", 0,
          "team<-team-xmlchild", 0,
          "team<-xml", 0,
          "terrain<-terrain-key-value", 0,
          "terrain<-terrain-stringmap", 1,
          "terrain<-terrain-xmlchild", 1,
          "terrain<-xml", 0,
          "unit<-unit-key-value", 0,
          "unit<-unit-stringmap", 1,
          "unit<-unit-xmlchild", 1,
          "unit<-unit-xmlpower", 0,
          "unit<-unit-xmlskill", 0,
          "unit<-unit-xmlweakness", 0,
          "unit<-xml", 1,
          "unitability<-unitability-key-value", 0,
          "unitability<-unitability-stringmap", 1,
          "unitability<-unitability-xmlchild", 1,
          "unitability<-xml", 1,
          "unititem<-unititem-key-value", 0,
          "unititem<-unititem-stringmap", 1,
          "unititem<-unititem-xmlchild", 1,
          "unititem<-xml", 1,
          "unitpower<-unitpower-key-value", 0,
          "unitpower<-unitpower-stringmap", 0,
          "unitpower<-unitpower-xmlability", 0,
          "unitpower<-unitpower-xmlchild", 1,
          "unitpower<-unitpower-xmlitem", 0,
          "unitpower<-unitpower-xmlspecialty", 0,
          "unitpower<-xml", 0,
          "unitskill<-unitskill-key-value", 0,
          "unitskill<-unitskill-stringmap", 0,
          "unitskill<-unitskill-xmlability", 0,
          "unitskill<-unitskill-xmlchild", 1,
          "unitskill<-unitskill-xmlitem", 0,
          "unitskill<-unitskill-xmlspecialty", 0,
          "unitskill<-xml", 0,
          "unitspecialty<-unitspecialty-key-value", 0,
          "unitspecialty<-unitspecialty-stringmap", 1,
          "unitspecialty<-unitspecialty-xmlchild", 1,
          "unitspecialty<-xml", 1,
          "unitweakness<-xml", 0,
          "weakness<-xml", 0,
          "xml-read<-bookname", 0
        )
    )
  }

  static f_ability_from_ability_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "ability<-ability-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/ability\n  :name \"name\"\n  :image \"image\")\n (ability<-ability-stringmap\n  (empty base/ability)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_ability,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_ability_from_ability_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_ability
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_ability_from_ability_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "ability<-ability-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/ability\n  :titles \"titles\")\n (ability<-ability-xmlchild\n  (empty base/ability)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_ability,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_ability_from_ability_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_ability
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_ability_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "ability<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/ability\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (ability<-xml\n  (xml/xml\n   :tag \"ability\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_ability,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference"
              ),
              nx_tactics_books_bookloader.f_ability_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "ability",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
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

  static f_book_from_book_key_value(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-key-value",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :name \"nm\")\n (book<-book-key-value\n  (empty base/book)\n  \"name\"\n  \"nm\"))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":name",
                "nm"
              ),
              nx_tactics_books_bookloader.f_book_from_book_key_value(
                vx_core.f_empty(
                  nx_tactics_base.t_book
                ),
                "name",
                "nm"
              )
            )
          ),
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :name \"image\")\n (book<-book-key-value\n  (empty base/book)\n  \"name\"\n  \"image\"))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":name",
                "image"
              ),
              nx_tactics_books_bookloader.f_book_from_book_key_value(
                vx_core.f_empty(
                  nx_tactics_base.t_book
                ),
                "name",
                "image"
              )
            )
          )
        )
    )
    return output
  }

  static f_book_from_book_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :name \"name\"\n  :image \"image\")\n (book<-book-stringmap\n  (empty base/book)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_book_from_book_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_book
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_book_from_book_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :name \"name1\")\n (book<-book-xml\n  (empty base/book)\n  (xml/xml\n   :tag \"doc\"\n   :propmap\n    (stringmap\n     :name \"name1\"))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":name",
                "name1"
              ),
              nx_tactics_books_bookloader.f_book_from_book_xml(
                vx_core.f_empty(
                  nx_tactics_base.t_book
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "doc",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name1"
                  )
                )
              )
            )
          ),
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (empty base/book)\n (book<-book-xml\n  (empty base/book)\n  (xml/xml\n   :tag \"?xml\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_empty(
                nx_tactics_base.t_book
              ),
              nx_tactics_books_bookloader.f_book_from_book_xml(
                vx_core.f_empty(
                  nx_tactics_base.t_book
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "?xml"
                )
              )
            )
          ),
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :name \"name1\"\n  (msgblock\n   (msg\n    :code \":duplicatetagfound\"\n    :detail\n     (anymap\n      :type nx/tactics/base/book\n      :tag \"doc\")\n      :severity 2)))\n (book<-book-xml\n  (base/book\n   :name \"name1\")\n  (xml/xml\n   :tag \"doc\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":name",
                "name1",
                vx_core.f_new(
                  vx_core.t_msgblock,
                  vx_core.f_new(
                    vx_core.t_msg,
                    ":code",
                    ":duplicatetagfound",
                    ":detail",
                    vx_core.f_new(
                      vx_core.t_anymap,
                      ":type",
                      nx_tactics_base.t_book,
                      ":tag",
                      "doc"
                    ),
                    ":severity",
                    2
                  )
                )
              ),
              nx_tactics_books_bookloader.f_book_from_book_xml(
                vx_core.f_new(
                  nx_tactics_base.t_book,
                  ":name",
                  "name1"
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "doc"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_book_from_book_xmlchapter(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-xmlchapter",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :chaptermap\n   (base/chaptermap\n    :chapter1\n     (base/chapter\n      :name \"chapter1\")))\n (book<-book-xmlchapter\n  (empty base/book)\n  (xml/xml\n   :tag \"chapter\"\n   :propmap\n    (stringmap\n     :name \"chapter1\"))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":chaptermap",
                vx_core.f_new(
                  nx_tactics_base.t_chaptermap,
                  ":chapter1",
                  vx_core.f_new(
                    nx_tactics_base.t_chapter,
                    ":name",
                    "chapter1"
                  )
                )
              ),
              nx_tactics_books_bookloader.f_book_from_book_xmlchapter(
                vx_core.f_empty(
                  nx_tactics_base.t_book
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "chapter",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "chapter1"
                  )
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_book_from_book_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :titles \"titles\")\n (book<-book-xmlchild\n  (empty base/book)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_book_from_book_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_book
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :chaptermap\n   (base/chaptermap\n    :chapter1\n     (base/chapter\n      :name \"chapter1\")))\n (book<-book-xmlchild\n  (empty base/book)\n  (xml/xml\n   :tag \"chapter\"\n   :propmap\n    (stringmap\n     :name \"chapter1\"))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":chaptermap",
                vx_core.f_new(
                  nx_tactics_base.t_chaptermap,
                  ":chapter1",
                  vx_core.f_new(
                    nx_tactics_base.t_chapter,
                    ":name",
                    "chapter1"
                  )
                )
              ),
              nx_tactics_books_bookloader.f_book_from_book_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_book
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "chapter",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "chapter1"
                  )
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_book_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :name \"name1\")\n (book<-xml\n  (xml/xml\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"?xml\")\n     (xml/xml\n      :tag \"doc\"\n      :propmap\n       (stringmap\n        :name \"name1\"))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":name",
                "name1"
              ),
              nx_tactics_books_bookloader.f_book_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "?xml"
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "doc",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "name1"
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

  static f_book_from_xmldoc(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-xmldoc",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :name \"name1\"\n  :image \"image1\"\n  :titles \"titles1\"\n  :reference \"reference1\"\n  :chaptermap\n   (base/chaptermap\n    :chapter1\n     (base/chapter\n      :name \"chapter1\")))\n (book<-xmldoc\n  (xml/xml\n   :tag \"doc\"\n   :propmap\n    (stringmap\n     :name \"name1\"\n     :image \"image1\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles1\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference1\")))\n     (xml/xml\n      :tag \"chapter\"\n      :propmap\n       (stringmap\n        :name \"chapter1\"))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":name",
                "name1",
                ":image",
                "image1",
                ":titles",
                "titles1",
                ":reference",
                "reference1",
                ":chaptermap",
                vx_core.f_new(
                  nx_tactics_base.t_chaptermap,
                  ":chapter1",
                  vx_core.f_new(
                    nx_tactics_base.t_chapter,
                    ":name",
                    "chapter1"
                  )
                )
              ),
              nx_tactics_books_bookloader.f_book_from_xmldoc(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "doc",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name1",
                    ":image",
                    "image1"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles1"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference1"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "chapter",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "chapter1"
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

  static f_book_from_xmllist(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-xmllist",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/book\n  :name \"name1\")\n (book<-xmllist\n  (xml/xmllist\n   (xml/xml\n    :tag \"?xml\")\n   (xml/xml\n    :tag \"doc\"\n    :propmap\n     (stringmap\n      :name \"name1\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_book,
                ":name",
                "name1"
              ),
              nx_tactics_books_bookloader.f_book_from_xmllist(
                vx_core.f_new(
                  vx_data_xml.t_xmllist,
                  vx_core.f_new(
                    vx_data_xml.t_xml,
                    ":tag",
                    "?xml"
                  ),
                  vx_core.f_new(
                    vx_data_xml.t_xml,
                    ":tag",
                    "doc",
                    ":propmap",
                    vx_core.f_new(
                      vx_core.t_stringmap,
                      ":name",
                      "name1"
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

  static f_chapter_from_chapter_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "chapter<-chapter-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/chapter\n  :name \"name\"\n  :image \"image\")\n (chapter<-chapter-stringmap\n  (empty base/chapter)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_chapter,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_chapter_from_chapter_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_chapter
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_chapter_from_chapter_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "chapter<-chapter-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/chapter\n  :titles \"titles\")\n (chapter<-chapter-xmlchild\n  (empty base/chapter)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_chapter,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_chapter_from_chapter_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_chapter
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_chapter_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "chapter<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/chapter\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :sectionmap\n   (base/sectionmap\n    :section1\n     (base/section\n      :name \"section1\")\n    :section2\n     (base/section\n      :name \"section2\")))\n (chapter<-xml\n  (xml/xml\n   :tag \"chapter\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"section\"\n      :propmap\n       (stringmap\n        :name \"section1\"))\n     (xml/xml\n      :tag \"section\"\n      :propmap\n       (stringmap\n        :name \"section2\"))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_chapter,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference",
                ":sectionmap",
                vx_core.f_new(
                  nx_tactics_base.t_sectionmap,
                  ":section1",
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "section1"
                  ),
                  ":section2",
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "section2"
                  )
                )
              ),
              nx_tactics_books_bookloader.f_chapter_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "chapter",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "section",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "section1"
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "section",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "section2"
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

  static f_damage_from_damage_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "damage<-damage-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/damage\n  :name  \"name\"\n  :image \"image\")\n (damage<-damage-stringmap\n  (empty base/damage)\n  (stringmap\n   :name  \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_damage,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_damage_from_damage_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_damage
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_damage_from_damage_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "damage<-damage-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/damage\n  :titles \"titles\")\n (damage<-damage-xmlchild\n  (empty base/damage)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_damage,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_damage_from_damage_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_damage
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_power_from_power_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "power<-power-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/power\n  :name \"name\"\n  :image \"image\")\n (power<-power-stringmap\n  (empty base/power)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_power,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_power_from_power_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_power
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_power_from_power_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "power<-power-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/power\n  :titles \"titles\")\n (power<-power-xmlchild\n  (empty base/power)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_power,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_power_from_power_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_power
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_power_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "power<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/power\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :abilitymap\n   (base/abilitymap\n    :ability1\n     (base/ability\n      :name \"ability1\"))\n  :specialtymap\n   (base/specialtymap\n    :specialty1\n     (base/specialty\n      :name \"specialty1\")))\n (power<-xml\n  (xml/xml\n   :tag \"power\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"ability\"\n      :propmap\n       (stringmap\n        :name \"ability1\"))\n     (xml/xml\n      :tag \"specialty\"\n      :propmap\n       (stringmap\n        :name \"specialty1\"))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_power,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference",
                ":abilitymap",
                vx_core.f_new(
                  nx_tactics_base.t_abilitymap,
                  ":ability1",
                  vx_core.f_new(
                    nx_tactics_base.t_ability,
                    ":name",
                    "ability1"
                  )
                ),
                ":specialtymap",
                vx_core.f_new(
                  nx_tactics_base.t_specialtymap,
                  ":specialty1",
                  vx_core.f_new(
                    nx_tactics_base.t_specialty,
                    ":name",
                    "specialty1"
                  )
                )
              ),
              nx_tactics_books_bookloader.f_power_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "power",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "ability",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "ability1"
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "specialty",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "specialty1"
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

  static f_rule_from_rule_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "rule<-rule-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/rule\n  :name  \"name\"\n  :image \"image\")\n (rule<-rule-stringmap\n  (empty base/rule)\n  (stringmap\n   :name  \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_rule,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_rule_from_rule_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_rule
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_rule_from_rule_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "rule<-rule-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/rule\n  :titles \"titles\")\n (rule<-rule-xmlchild\n  (empty base/rule)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_rule,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_rule_from_rule_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_rule
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_scenario_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "scenario<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/scenario\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (scenario<-xml\n  (xml/xml\n   :tag \"scenario\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_scenario,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference"
              ),
              nx_tactics_books_bookloader.f_scenario_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "scenario",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
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

  static f_section_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "section<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/section\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :powermap\n   (base/powermap\n    :power1\n     (base/power\n      :name \"power1\"))\n  :scenariomap\n   (base/scenariomap\n    :scenario1\n     (base/scenario\n      :name \"scenario1\"))\n  :sectionmap\n   (base/sectionmap\n    :section1\n     (base/section\n      :name \"section1\"))\n  :skillmap\n   (base/skillmap\n    :skill1\n     (base/skill\n      :name \"skill1\")))\n (section<-xml\n  (xml/xml\n   :tag \"section\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"power\"\n      :propmap\n       (stringmap\n        :name \"power1\"))\n     (xml/xml\n      :tag \"scenario\"\n      :propmap\n       (stringmap\n        :name \"scenario1\"))\n     (xml/xml\n      :tag \"section\"\n      :propmap\n       (stringmap\n        :name \"section1\"))\n     (xml/xml\n      :tag \"skill\"\n      :propmap\n       (stringmap\n        :name \"skill1\"))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_section,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference",
                ":powermap",
                vx_core.f_new(
                  nx_tactics_base.t_powermap,
                  ":power1",
                  vx_core.f_new(
                    nx_tactics_base.t_power,
                    ":name",
                    "power1"
                  )
                ),
                ":scenariomap",
                vx_core.f_new(
                  nx_tactics_base.t_scenariomap,
                  ":scenario1",
                  vx_core.f_new(
                    nx_tactics_base.t_scenario,
                    ":name",
                    "scenario1"
                  )
                ),
                ":sectionmap",
                vx_core.f_new(
                  nx_tactics_base.t_sectionmap,
                  ":section1",
                  vx_core.f_new(
                    nx_tactics_base.t_section,
                    ":name",
                    "section1"
                  )
                ),
                ":skillmap",
                vx_core.f_new(
                  nx_tactics_base.t_skillmap,
                  ":skill1",
                  vx_core.f_new(
                    nx_tactics_base.t_skill,
                    ":name",
                    "skill1"
                  )
                )
              ),
              nx_tactics_books_bookloader.f_section_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "section",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "power",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "power1"
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "scenario",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "scenario1"
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "section",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "section1"
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "skill",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "skill1"
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

  static f_skill_from_skill_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "skill<-skill-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/skill\n  :titles \"titles\")\n (skill<-skill-xmlchild\n  (empty base/skill)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_skill,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_skill_from_skill_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_skill
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_skill_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "skill<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/skill\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :abilitymap\n   (base/abilitymap\n    :ability1\n     (base/ability\n      :name \"ability1\"))\n  :specialtymap\n   (base/specialtymap\n    :specialty1\n     (base/specialty\n      :name \"specialty1\")))\n (skill<-xml\n  (xml/xml\n   :tag \"skill\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"ability\"\n      :propmap\n       (stringmap\n        :name \"ability1\"))\n     (xml/xml\n      :tag \"specialty\"\n      :propmap\n       (stringmap\n        :name \"specialty1\"))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_skill,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference",
                ":abilitymap",
                vx_core.f_new(
                  nx_tactics_base.t_abilitymap,
                  ":ability1",
                  vx_core.f_new(
                    nx_tactics_base.t_ability,
                    ":name",
                    "ability1"
                  )
                ),
                ":specialtymap",
                vx_core.f_new(
                  nx_tactics_base.t_specialtymap,
                  ":specialty1",
                  vx_core.f_new(
                    nx_tactics_base.t_specialty,
                    ":name",
                    "specialty1"
                  )
                )
              ),
              nx_tactics_books_bookloader.f_skill_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "skill",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "ability",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "ability1"
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "specialty",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "specialty1"
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

  static f_specialty_from_specialty_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "specialty<-specialty-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/specialty\n  :name \"name\"\n  :image \"image\")\n (specialty<-specialty-stringmap\n  (empty base/specialty)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_specialty,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_specialty_from_specialty_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_specialty
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_specialty_from_specialty_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "specialty<-specialty-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/specialty\n  :titles \"titles\")\n (specialty<-specialty-xmlchild\n  (empty base/specialty)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_specialty,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_specialty_from_specialty_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_specialty
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_specialty_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "specialty<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/specialty\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (specialty<-xml\n  (xml/xml\n   :tag \"specialty\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_specialty,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference"
              ),
              nx_tactics_books_bookloader.f_specialty_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "specialty",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
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

  static f_terrain_from_terrain_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "terrain<-terrain-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/terrain\n  :name  \"name\"\n  :image \"image\")\n (terrain<-terrain-stringmap\n  (empty base/terrain)\n  (stringmap\n   :name  \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_terrain,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_terrain_from_terrain_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_terrain
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_terrain_from_terrain_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "terrain<-terrain-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/terrain\n  :titles \"titles\")\n (terrain<-terrain-xmlchild\n  (empty base/terrain)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_terrain,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_terrain_from_terrain_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_terrain
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_unit_from_unit_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unit<-unit-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unit\n  :name \"name\"\n  :image \"image\")\n (unit<-unit-stringmap\n  (empty base/unit)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unit,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_unit_from_unit_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_unit
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_unit_from_unit_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unit<-unit-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unit\n  :titles \"titles\")\n (unit<-unit-xmlchild\n  (empty base/unit)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unit,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_unit_from_unit_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_unit
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_unit_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unit<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unit\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :unitskillmap\n   (base/unitskillmap\n    \"skill1\" (base/unitskill\n              :name \"skill1\")))\n (unit<-xml\n  (xml/xml\n   :tag \"unit\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"skill\"\n      :propmap\n       (stringmap\n        :name \"skill1\"))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unit,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference",
                ":unitskillmap",
                vx_core.f_new(
                  nx_tactics_base.t_unitskillmap,
                  "skill1",
                  vx_core.f_new(
                    nx_tactics_base.t_unitskill,
                    ":name",
                    "skill1"
                  )
                )
              ),
              nx_tactics_books_bookloader.f_unit_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "unit",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "skill",
                      ":propmap",
                      vx_core.f_new(
                        vx_core.t_stringmap,
                        ":name",
                        "skill1"
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

  static f_unitability_from_unitability_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitability<-unitability-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unitability\n  :name \"name\"\n  :image \"image\")\n (unitability<-unitability-stringmap\n  (empty base/unitability)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unitability,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_unitability_from_unitability_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_unitability
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_unitability_from_unitability_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitability<-unitability-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unitability\n  :titles \"titles\")\n (unitability<-unitability-xmlchild\n  (empty base/unitability)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unitability,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_unitability_from_unitability_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_unitability
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_unitability_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitability<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unitability\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (unitability<-xml\n  (xml/xml\n   :tag \"unitability\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unitability,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference"
              ),
              nx_tactics_books_bookloader.f_unitability_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "unitability",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
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

  static f_unititem_from_unititem_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unititem<-unititem-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unititem\n  :name \"name\"\n  :image \"image\")\n (unititem<-unititem-stringmap\n  (empty base/unititem)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unititem,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_unititem_from_unititem_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_unititem
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_unititem_from_unititem_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unititem<-unititem-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unititem\n  :titles \"titles1\")\n (unititem<-unititem-xmlchild\n  (empty base/unititem)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles1\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unititem,
                ":titles",
                "titles1"
              ),
              nx_tactics_books_bookloader.f_unititem_from_unititem_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_unititem
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles1"
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

  static f_unititem_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unititem<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unititem\n  :name \"name1\"\n  :image \"image1\"\n  :titles \"titles1\"\n  :reference \"reference1\"\n  :summary \"summary1\")\n (unititem<-xml\n  (xml/xml\n   :tag \"unititem\"\n   :propmap\n    (stringmap\n     :name \"name1\"\n     :image \"image1\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles1\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference1\")))\n     (xml/xml\n      :tag \"summary\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"summary1\")))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unititem,
                ":name",
                "name1",
                ":image",
                "image1",
                ":titles",
                "titles1",
                ":reference",
                "reference1",
                ":summary",
                "summary1"
              ),
              nx_tactics_books_bookloader.f_unititem_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "unititem",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name1",
                    ":image",
                    "image1"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles1"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference1"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "summary",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "summary1"
                        )
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

  static f_unitpower_from_unitpower_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitpower<-unitpower-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unitpower\n  :summary \"summary1\")\n (unitpower<-unitpower-xmlchild\n  (empty base/unitpower)\n  (xml/xml\n   :tag \"summary\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"summary1\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unitpower,
                ":summary",
                "summary1"
              ),
              nx_tactics_books_bookloader.f_unitpower_from_unitpower_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_unitpower
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "summary",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "summary1"
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

  static f_unitskill_from_unitskill_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitskill<-unitskill-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unitskill\n  :summary \"summary1\")\n (unitskill<-unitskill-xmlchild\n  (empty base/unitskill)\n  (xml/xml\n   :tag \"summary\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"summary1\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unitskill,
                ":summary",
                "summary1"
              ),
              nx_tactics_books_bookloader.f_unitskill_from_unitskill_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_unitskill
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "summary",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "summary1"
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

  static f_unitspecialty_from_unitspecialty_stringmap(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitspecialty<-unitspecialty-stringmap",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unitspecialty\n  :name \"name\"\n  :image \"image\")\n (unitspecialty<-unitspecialty-stringmap\n  (empty base/unitspecialty)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unitspecialty,
                ":name",
                "name",
                ":image",
                "image"
              ),
              nx_tactics_books_bookloader.f_unitspecialty_from_unitspecialty_stringmap(
                vx_core.f_empty(
                  nx_tactics_base.t_unitspecialty
                ),
                vx_core.f_new(
                  vx_core.t_stringmap,
                  ":name",
                  "name",
                  ":image",
                  "image"
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_unitspecialty_from_unitspecialty_xmlchild(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitspecialty<-unitspecialty-xmlchild",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unitspecialty\n  :titles \"titles\")\n (unitspecialty<-unitspecialty-xmlchild\n  (empty base/unitspecialty)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unitspecialty,
                ":titles",
                "titles"
              ),
              nx_tactics_books_bookloader.f_unitspecialty_from_unitspecialty_xmlchild(
                vx_core.f_empty(
                  nx_tactics_base.t_unitspecialty
                ),
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "titles",
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":text",
                      "titles"
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

  static f_unitspecialty_from_xml(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitspecialty<-xml",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (base/unitspecialty\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (unitspecialty<-xml\n  (xml/xml\n   :tag \"unitspecialty\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                nx_tactics_base.t_unitspecialty,
                ":name",
                "name",
                ":image",
                "image",
                ":titles",
                "titles",
                ":reference",
                "reference"
              ),
              nx_tactics_books_bookloader.f_unitspecialty_from_xml(
                vx_core.f_new(
                  vx_data_xml.t_xml,
                  ":tag",
                  "unitspecialty",
                  ":propmap",
                  vx_core.f_new(
                    vx_core.t_stringmap,
                    ":name",
                    "name",
                    ":image",
                    "image"
                  ),
                  ":children",
                  vx_core.f_new(
                    vx_data_xml.t_xmllist,
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "titles",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "titles"
                        )
                      )
                    ),
                    vx_core.f_new(
                      vx_data_xml.t_xml,
                      ":tag",
                      "reference",
                      ":children",
                      vx_core.f_new(
                        vx_data_xml.t_xmllist,
                        vx_core.f_new(
                          vx_data_xml.t_xml,
                          ":text",
                          "reference"
                        )
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
      nx_tactics_books_bookloader_test.f_ability_from_ability_stringmap(context),
      nx_tactics_books_bookloader_test.f_ability_from_ability_xmlchild(context),
      nx_tactics_books_bookloader_test.f_ability_from_xml(context),
      nx_tactics_books_bookloader_test.f_book_from_book_key_value(context),
      nx_tactics_books_bookloader_test.f_book_from_book_stringmap(context),
      nx_tactics_books_bookloader_test.f_book_from_book_xml(context),
      nx_tactics_books_bookloader_test.f_book_from_book_xmlchapter(context),
      nx_tactics_books_bookloader_test.f_book_from_book_xmlchild(context),
      nx_tactics_books_bookloader_test.f_book_from_xml(context),
      nx_tactics_books_bookloader_test.f_book_from_xmldoc(context),
      nx_tactics_books_bookloader_test.f_book_from_xmllist(context),
      nx_tactics_books_bookloader_test.f_chapter_from_chapter_stringmap(context),
      nx_tactics_books_bookloader_test.f_chapter_from_chapter_xmlchild(context),
      nx_tactics_books_bookloader_test.f_chapter_from_xml(context),
      nx_tactics_books_bookloader_test.f_damage_from_damage_stringmap(context),
      nx_tactics_books_bookloader_test.f_damage_from_damage_xmlchild(context),
      nx_tactics_books_bookloader_test.f_power_from_power_stringmap(context),
      nx_tactics_books_bookloader_test.f_power_from_power_xmlchild(context),
      nx_tactics_books_bookloader_test.f_power_from_xml(context),
      nx_tactics_books_bookloader_test.f_rule_from_rule_stringmap(context),
      nx_tactics_books_bookloader_test.f_rule_from_rule_xmlchild(context),
      nx_tactics_books_bookloader_test.f_scenario_from_xml(context),
      nx_tactics_books_bookloader_test.f_section_from_xml(context),
      nx_tactics_books_bookloader_test.f_skill_from_skill_xmlchild(context),
      nx_tactics_books_bookloader_test.f_skill_from_xml(context),
      nx_tactics_books_bookloader_test.f_specialty_from_specialty_stringmap(context),
      nx_tactics_books_bookloader_test.f_specialty_from_specialty_xmlchild(context),
      nx_tactics_books_bookloader_test.f_specialty_from_xml(context),
      nx_tactics_books_bookloader_test.f_terrain_from_terrain_stringmap(context),
      nx_tactics_books_bookloader_test.f_terrain_from_terrain_xmlchild(context),
      nx_tactics_books_bookloader_test.f_unit_from_unit_stringmap(context),
      nx_tactics_books_bookloader_test.f_unit_from_unit_xmlchild(context),
      nx_tactics_books_bookloader_test.f_unit_from_xml(context),
      nx_tactics_books_bookloader_test.f_unitability_from_unitability_stringmap(context),
      nx_tactics_books_bookloader_test.f_unitability_from_unitability_xmlchild(context),
      nx_tactics_books_bookloader_test.f_unitability_from_xml(context),
      nx_tactics_books_bookloader_test.f_unititem_from_unititem_stringmap(context),
      nx_tactics_books_bookloader_test.f_unititem_from_unititem_xmlchild(context),
      nx_tactics_books_bookloader_test.f_unititem_from_xml(context),
      nx_tactics_books_bookloader_test.f_unitpower_from_unitpower_xmlchild(context),
      nx_tactics_books_bookloader_test.f_unitskill_from_unitskill_xmlchild(context),
      nx_tactics_books_bookloader_test.f_unitspecialty_from_unitspecialty_stringmap(context),
      nx_tactics_books_bookloader_test.f_unitspecialty_from_unitspecialty_xmlchild(context),
      nx_tactics_books_bookloader_test.f_unitspecialty_from_xml(context)
    )
    return output
  }
}
