
package com.vxlisp.nx.tactics.books;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;
import com.vxlisp.vx.data.*;

public final class BookloaderTest {

  static Test.Type_testcase f_book_from_book_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :name \"bookname\"\n  :image \"bookimage\")\n (book<-book-stringmap\n  (empty base/book)\n  (stringmap\n   :name \"bookname\"\n   :image \"bookimage\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("bookname"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("bookimage")
                )
              ),
              Bookloader.f_book_from_book_stringmap(
                Core.f_empty(
                  Base.t_book
                ),
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":name"),
                    Core.vx_new_string("bookname"),
                    Core.vx_new_string(":image"),
                    Core.vx_new_string("bookimage")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_book_from_book_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :titles \"titles\")\n (book<-book-xmlchild\n  (empty base/book)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_book_from_book_xmlchild(
                Core.f_empty(
                  Base.t_book
                ),
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("titles"),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":text"),
                            Core.vx_new_string("titles")
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
    );
    return output;
  }

  static Test.Type_testcase f_book_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :chaptermap\n   (base/chaptermap\n    :chapter1\n     (base/chapter\n      :name \"chapter1\")))\n (book<-xml\n  (xml/xml\n   :tag \"book\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"chapter\"\n      :propmap\n       (stringmap\n        :name \"chapter1\"))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image"),
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string(":reference"),
                  Core.vx_new_string("reference"),
                  Core.vx_new_string(":chaptermap"),
                  Core.f_new(
                    Base.t_chaptermap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":chapter1"),
                      Core.f_new(
                        Base.t_chapter,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("chapter1")
                        )
                      )
                    )
                  )
                )
              ),
              Bookloader.f_book_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("book"),
                    Core.vx_new_string(":propmap"),
                    Core.f_new(
                      Core.t_stringmap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("name"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("image")
                      )
                    ),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("titles"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("titles")
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("reference"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("reference")
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("chapter"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("chapter1")
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
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_chapter_from_chapter_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "chapter<-chapter-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/chapter\n  :name \"name\"\n  :image \"image\")\n (chapter<-chapter-stringmap\n  (empty base/chapter)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_chapter,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_chapter_from_chapter_stringmap(
                Core.f_empty(
                  Base.t_chapter
                ),
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":name"),
                    Core.vx_new_string("name"),
                    Core.vx_new_string(":image"),
                    Core.vx_new_string("image")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_chapter_from_chapter_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "chapter<-chapter-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/chapter\n  :titles \"titles\")\n (chapter<-chapter-xmlchild\n  (empty base/chapter)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_chapter,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_chapter_from_chapter_xmlchild(
                Core.f_empty(
                  Base.t_chapter
                ),
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("titles"),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":text"),
                            Core.vx_new_string("titles")
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
    );
    return output;
  }

  static Test.Type_testcase f_chapter_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "chapter<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/chapter\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :sectionmap\n   (base/sectionmap\n    :section1\n     (base/section\n      :name \"section1\")))\n (chapter<-xml\n  (xml/xml\n   :tag \"chapter\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"section\"\n      :propmap\n       (stringmap\n        :name \"section1\"))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_chapter,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image"),
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string(":reference"),
                  Core.vx_new_string("reference"),
                  Core.vx_new_string(":sectionmap"),
                  Core.f_new(
                    Base.t_sectionmap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":section1"),
                      Core.f_new(
                        Base.t_section,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("section1")
                        )
                      )
                    )
                  )
                )
              ),
              Bookloader.f_chapter_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("chapter"),
                    Core.vx_new_string(":propmap"),
                    Core.f_new(
                      Core.t_stringmap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("name"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("image")
                      )
                    ),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("titles"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("titles")
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("reference"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("reference")
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("section"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("section1")
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
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_rule_from_rule_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "rule<-rule-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/rule\n  :name  \"name\"\n  :image \"image\")\n (rule<-rule-stringmap\n  (empty base/rule)\n  (stringmap\n   :name  \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_rule,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_rule_from_rule_stringmap(
                Core.f_empty(
                  Base.t_rule
                ),
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":name"),
                    Core.vx_new_string("name"),
                    Core.vx_new_string(":image"),
                    Core.vx_new_string("image")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_rule_from_rule_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "rule<-rule-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/rule\n  :titles \"titles\")\n (rule<-rule-xmlchild\n  (empty base/rule)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_rule,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_rule_from_rule_xmlchild(
                Core.f_empty(
                  Base.t_rule
                ),
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("titles"),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":text"),
                            Core.vx_new_string("titles")
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
    );
    return output;
  }

  static Test.Type_testcase f_scenario_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "scenario<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/scenario\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (scenario<-xml\n  (xml/xml\n   :tag \"scenario\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_scenario,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image"),
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string(":reference"),
                  Core.vx_new_string("reference")
                )
              ),
              Bookloader.f_scenario_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("scenario"),
                    Core.vx_new_string(":propmap"),
                    Core.f_new(
                      Core.t_stringmap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("name"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("image")
                      )
                    ),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("titles"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("titles")
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("reference"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("reference")
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
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_section_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "section<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/section\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :sectionmap\n   (base/sectionmap\n    :section1\n     (base/section\n      :name \"section1\")))\n (section<-xml\n  (xml/xml\n   :tag \"section\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"section\"\n      :propmap\n       (stringmap\n        :name \"section1\"))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_section,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image"),
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string(":reference"),
                  Core.vx_new_string("reference"),
                  Core.vx_new_string(":sectionmap"),
                  Core.f_new(
                    Base.t_sectionmap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":section1"),
                      Core.f_new(
                        Base.t_section,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("section1")
                        )
                      )
                    )
                  )
                )
              ),
              Bookloader.f_section_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("section"),
                    Core.vx_new_string(":propmap"),
                    Core.f_new(
                      Core.t_stringmap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("name"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("image")
                      )
                    ),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("titles"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("titles")
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("reference"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("reference")
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("section"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("section1")
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
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_unit_from_unit_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unit<-unit-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unit\n  :name \"name\"\n  :image \"image\")\n (unit<-unit-stringmap\n  (empty base/unit)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unit,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_unit_from_unit_stringmap(
                Core.f_empty(
                  Base.t_unit
                ),
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":name"),
                    Core.vx_new_string("name"),
                    Core.vx_new_string(":image"),
                    Core.vx_new_string("image")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_unit_from_unit_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unit<-unit-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unit\n  :titles \"titles\")\n (unit<-unit-xmlchild\n  (empty base/unit)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unit,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_unit_from_unit_xmlchild(
                Core.f_empty(
                  Base.t_unit
                ),
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("titles"),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":text"),
                            Core.vx_new_string("titles")
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
    );
    return output;
  }

  static Test.Type_testcase f_unit_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unit<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unit\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :unitskillmap\n   (base/unitskillmap\n    \"skill1\" (base/unitskill\n              :name \"skill1\")))\n (unit<-xml\n  (xml/xml\n   :tag \"unit\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"skill\"\n      :propmap\n       (stringmap\n        :name \"skill1\"))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unit,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image"),
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string(":reference"),
                  Core.vx_new_string("reference"),
                  Core.vx_new_string(":unitskillmap"),
                  Core.f_new(
                    Base.t_unitskillmap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string("skill1"),
                      Core.f_new(
                        Base.t_unitskill,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("skill1")
                        )
                      )
                    )
                  )
                )
              ),
              Bookloader.f_unit_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("unit"),
                    Core.vx_new_string(":propmap"),
                    Core.f_new(
                      Core.t_stringmap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("name"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("image")
                      )
                    ),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("titles"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("titles")
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("reference"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("reference")
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("skill"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("skill1")
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
        )
      )
    );
    return output;
  }

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      BookloaderTest.f_book_from_book_stringmap(context),
      BookloaderTest.f_book_from_book_xmlchild(context),
      BookloaderTest.f_book_from_xml(context),
      BookloaderTest.f_chapter_from_chapter_stringmap(context),
      BookloaderTest.f_chapter_from_chapter_xmlchild(context),
      BookloaderTest.f_chapter_from_xml(context),
      BookloaderTest.f_rule_from_rule_stringmap(context),
      BookloaderTest.f_rule_from_rule_xmlchild(context),
      BookloaderTest.f_scenario_from_xml(context),
      BookloaderTest.f_section_from_xml(context),
      BookloaderTest.f_unit_from_unit_stringmap(context),
      BookloaderTest.f_unit_from_unit_xmlchild(context),
      BookloaderTest.f_unit_from_xml(context)
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "nx/tactics/books/bookloader", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 88, ":tests", 47, ":total", 53), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 24, ":tests", 13, ":total", 53), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 53), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 53), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 24, ":tests", 13, ":total", 53), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "nx/tactics/books/bookloader",
      ":typemap", Core.t_intmap.vx_new(
  
      ),
      ":constmap", Core.t_intmap.vx_new(
  
      ),
      ":funcmap", Core.t_intmap.vx_new(
        ":book-read<-bookname", 0,
        ":book<-book-key-value", 0,
        ":book<-book-stringmap", 1,
        ":book<-book-xml", 0,
        ":book<-book-xmlchapter", 0,
        ":book<-book-xmlchild", 1,
        ":book<-xml", 1,
        ":book<-xmllist", 0,
        ":book<-xmltop", 0,
        ":boolean-write<-book", 0,
        ":boolean-write<-booknames", 0,
        ":chapter<-chapter-key-value", 0,
        ":chapter<-chapter-stringmap", 1,
        ":chapter<-chapter-xmlchild", 1,
        ":chapter<-chapter-xmlsection", 0,
        ":chapter<-xml", 1,
        ":file-read<-bookname", 0,
        ":file-write<-book", 0,
        ":modifier<-xml", 0,
        ":rule<-rule-key-value", 0,
        ":rule<-rule-stringmap", 1,
        ":rule<-rule-xmlchild", 1,
        ":rule<-xml", 0,
        ":scenario<-scenario-key-value", 0,
        ":scenario<-scenario-stringmap", 0,
        ":scenario<-scenario-xmlchild", 0,
        ":scenario<-xml", 1,
        ":section<-section-key-value", 0,
        ":section<-section-stringmap", 0,
        ":section<-section-xmlchild", 0,
        ":section<-section-xmlrule", 0,
        ":section<-section-xmlscenario", 0,
        ":section<-section-xmlsection", 0,
        ":section<-section-xmlunit", 0,
        ":section<-xml", 1,
        ":string-read<-bookname", 0,
        ":string-vxlisp<-book", 0,
        ":string-writename<-book", 0,
        ":unit<-unit-key-value", 0,
        ":unit<-unit-stringmap", 1,
        ":unit<-unit-xmlchild", 1,
        ":unit<-unit-xmlpower", 0,
        ":unit<-unit-xmlskill", 0,
        ":unit<-unit-xmlweakness", 0,
        ":unit<-xml", 1,
        ":unitpower<-xml", 0,
        ":unitskill<-unitskill-key-value", 0,
        ":unitskill<-unitskill-stringmap", 0,
        ":unitskill<-unitskill-xmlchild", 0,
        ":unitskill<-xml", 0,
        ":unitweakness<-xml", 0,
        ":weakness<-xml", 0,
        ":xml-read<-bookname", 0
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "nx/tactics/books/bookloader", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
