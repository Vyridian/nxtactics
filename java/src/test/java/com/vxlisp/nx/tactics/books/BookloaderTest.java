
package com.vxlisp.nx.tactics.books;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;
import com.vxlisp.vx.data.*;

public final class BookloaderTest {

  static Test.Type_testcase f_ability_from_ability_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "ability<-ability-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/ability\n  :name \"name\"\n  :image \"image\")\n (ability<-ability-stringmap\n  (empty base/ability)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_ability,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_ability_from_ability_stringmap(
                Core.f_empty(
                  Base.t_ability
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

  static Test.Type_testcase f_ability_from_ability_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "ability<-ability-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/ability\n  :titles \"titles\")\n (ability<-ability-xmlchild\n  (empty base/ability)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_ability,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_ability_from_ability_xmlchild(
                Core.f_empty(
                  Base.t_ability
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

  static Test.Type_testcase f_ability_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "ability<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/ability\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (ability<-xml\n  (xml/xml\n   :tag \"ability\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_ability,
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
              Bookloader.f_ability_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("ability"),
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

  static Test.Type_testcase f_book_from_book_key_value(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-key-value",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :name \"nm\")\n (book<-book-key-value\n  (empty base/book)\n  \"name\"\n  \"nm\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("nm")
                )
              ),
              Bookloader.f_book_from_book_key_value(
                Core.f_empty(
                  Base.t_book
                ),
                Core.vx_new_string("name"),
                Core.vx_new_string("nm")
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :name \"image\")\n (book<-book-key-value\n  (empty base/book)\n  \"name\"\n  \"image\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_book_from_book_key_value(
                Core.f_empty(
                  Base.t_book
                ),
                Core.vx_new_string("name"),
                Core.vx_new_string("image")
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_book_from_book_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :name \"name\"\n  :image \"image\")\n (book<-book-stringmap\n  (empty base/book)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
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

  static Test.Type_testcase f_book_from_book_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :name \"name1\")\n (book<-book-xml\n  (empty base/book)\n  (xml/xml\n   :tag \"doc\"\n   :propmap\n    (stringmap\n     :name \"name1\"))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name1")
                )
              ),
              Bookloader.f_book_from_book_xml(
                Core.f_empty(
                  Base.t_book
                ),
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("doc"),
                    Core.vx_new_string(":propmap"),
                    Core.f_new(
                      Core.t_stringmap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("name1")
                      )
                    )
                  )
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (empty base/book)\n (book<-book-xml\n  (empty base/book)\n  (xml/xml\n   :tag \"?xml\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_empty(
                Base.t_book
              ),
              Bookloader.f_book_from_book_xml(
                Core.f_empty(
                  Base.t_book
                ),
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("?xml")
                  )
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :name \"name1\"\n  (msgblock\n   (msg\n    :code \":duplicatetagfound\"\n    :detail\n     (anymap\n      :type nx/tactics/base/book\n      :tag \"doc\")\n      :severity 2)))\n (book<-book-xml\n  (base/book\n   :name \"name1\")\n  (xml/xml\n   :tag \"doc\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name1"),
                  Core.f_new(
                    Core.t_msgblock,
                    Core.t_anylist.vx_new(
                      Core.f_new(
                        Core.t_msg,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":code"),
                          Core.vx_new_string(":duplicatetagfound"),
                          Core.vx_new_string(":detail"),
                          Core.f_new(
                            Core.t_anymap,
                            Core.t_anylist.vx_new(
                              Core.vx_new_string(":type"),
                              Base.t_book,
                              Core.vx_new_string(":tag"),
                              Core.vx_new_string("doc")
                            )
                          ),
                          Core.vx_new_string(":severity"),
                          Core.vx_new_int(2)
                        )
                      )
                    )
                  )
                )
              ),
              Bookloader.f_book_from_book_xml(
                Core.f_new(
                  Base.t_book,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":name"),
                    Core.vx_new_string("name1")
                  )
                ),
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("doc")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_book_from_book_xmlchapter(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-book-xmlchapter",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :chaptermap\n   (base/chaptermap\n    :chapter1\n     (base/chapter\n      :name \"chapter1\")))\n (book<-book-xmlchapter\n  (empty base/book)\n  (xml/xml\n   :tag \"chapter\"\n   :propmap\n    (stringmap\n     :name \"chapter1\"))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
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
              Bookloader.f_book_from_book_xmlchapter(
                Core.f_empty(
                  Base.t_book
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
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :chaptermap\n   (base/chaptermap\n    :chapter1\n     (base/chapter\n      :name \"chapter1\")))\n (book<-book-xmlchild\n  (empty base/book)\n  (xml/xml\n   :tag \"chapter\"\n   :propmap\n    (stringmap\n     :name \"chapter1\"))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
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
              Bookloader.f_book_from_book_xmlchild(
                Core.f_empty(
                  Base.t_book
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
          ":describename", "(test\n (base/book\n  :name \"name1\")\n (book<-xml\n  (xml/xml\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"?xml\")\n     (xml/xml\n      :tag \"doc\"\n      :propmap\n       (stringmap\n        :name \"name1\"))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name1")
                )
              ),
              Bookloader.f_book_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("?xml")
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("doc"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("name1")
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

  static Test.Type_testcase f_book_from_xmldoc(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-xmldoc",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :name \"name1\"\n  :image \"image1\"\n  :titles \"titles1\"\n  :reference \"reference1\"\n  :chaptermap\n   (base/chaptermap\n    :chapter1\n     (base/chapter\n      :name \"chapter1\")))\n (book<-xmldoc\n  (xml/xml\n   :tag \"doc\"\n   :propmap\n    (stringmap\n     :name \"name1\"\n     :image \"image1\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles1\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference1\")))\n     (xml/xml\n      :tag \"chapter\"\n      :propmap\n       (stringmap\n        :name \"chapter1\"))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name1"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image1"),
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles1"),
                  Core.vx_new_string(":reference"),
                  Core.vx_new_string("reference1"),
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
              Bookloader.f_book_from_xmldoc(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("doc"),
                    Core.vx_new_string(":propmap"),
                    Core.f_new(
                      Core.t_stringmap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("name1"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("image1")
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
                                    Core.vx_new_string("titles1")
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
                                    Core.vx_new_string("reference1")
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

  static Test.Type_testcase f_book_from_xmllist(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "book<-xmllist",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/book\n  :name \"name1\")\n (book<-xmllist\n  (xml/xmllist\n   (xml/xml\n    :tag \"?xml\")\n   (xml/xml\n    :tag \"doc\"\n    :propmap\n     (stringmap\n      :name \"name1\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_book,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name1")
                )
              ),
              Bookloader.f_book_from_xmllist(
                Core.f_new(
                  Xml.t_xmllist,
                  Core.t_anylist.vx_new(
                    Core.f_new(
                      Xml.t_xml,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":tag"),
                        Core.vx_new_string("?xml")
                      )
                    ),
                    Core.f_new(
                      Xml.t_xml,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":tag"),
                        Core.vx_new_string("doc"),
                        Core.vx_new_string(":propmap"),
                        Core.f_new(
                          Core.t_stringmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":name"),
                            Core.vx_new_string("name1")
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
          ":describename", "(test\n (base/chapter\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :sectionmap\n   (base/sectionmap\n    :section1\n     (base/section\n      :name \"section1\")\n    :section2\n     (base/section\n      :name \"section2\")))\n (chapter<-xml\n  (xml/xml\n   :tag \"chapter\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"section\"\n      :propmap\n       (stringmap\n        :name \"section1\"))\n     (xml/xml\n      :tag \"section\"\n      :propmap\n       (stringmap\n        :name \"section2\"))))))",
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
                      ),
                      Core.vx_new_string(":section2"),
                      Core.f_new(
                        Base.t_section,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("section2")
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
                                Core.vx_new_string("section2")
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

  static Test.Type_testcase f_damage_from_damage_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "damage<-damage-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/damage\n  :name  \"name\"\n  :image \"image\")\n (damage<-damage-stringmap\n  (empty base/damage)\n  (stringmap\n   :name  \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_damage,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_damage_from_damage_stringmap(
                Core.f_empty(
                  Base.t_damage
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

  static Test.Type_testcase f_damage_from_damage_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "damage<-damage-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/damage\n  :titles \"titles\")\n (damage<-damage-xmlchild\n  (empty base/damage)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_damage,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_damage_from_damage_xmlchild(
                Core.f_empty(
                  Base.t_damage
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

  static Test.Type_testcase f_power_from_power_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "power<-power-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/power\n  :name \"name\"\n  :image \"image\")\n (power<-power-stringmap\n  (empty base/power)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_power,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_power_from_power_stringmap(
                Core.f_empty(
                  Base.t_power
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

  static Test.Type_testcase f_power_from_power_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "power<-power-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/power\n  :titles \"titles\")\n (power<-power-xmlchild\n  (empty base/power)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_power,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_power_from_power_xmlchild(
                Core.f_empty(
                  Base.t_power
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

  static Test.Type_testcase f_power_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "power<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/power\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :abilitymap\n   (base/abilitymap\n    :ability1\n     (base/ability\n      :name \"ability1\"))\n  :specialtymap\n   (base/specialtymap\n    :specialty1\n     (base/specialty\n      :name \"specialty1\")))\n (power<-xml\n  (xml/xml\n   :tag \"power\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"ability\"\n      :propmap\n       (stringmap\n        :name \"ability1\"))\n     (xml/xml\n      :tag \"specialty\"\n      :propmap\n       (stringmap\n        :name \"specialty1\"))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_power,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image"),
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string(":reference"),
                  Core.vx_new_string("reference"),
                  Core.vx_new_string(":abilitymap"),
                  Core.f_new(
                    Base.t_abilitymap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":ability1"),
                      Core.f_new(
                        Base.t_ability,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("ability1")
                        )
                      )
                    )
                  ),
                  Core.vx_new_string(":specialtymap"),
                  Core.f_new(
                    Base.t_specialtymap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":specialty1"),
                      Core.f_new(
                        Base.t_specialty,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("specialty1")
                        )
                      )
                    )
                  )
                )
              ),
              Bookloader.f_power_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("power"),
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
                            Core.vx_new_string("ability"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("ability1")
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("specialty"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("specialty1")
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
          ":describename", "(test\n (base/section\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :powermap\n   (base/powermap\n    :power1\n     (base/power\n      :name \"power1\"))\n  :scenariomap\n   (base/scenariomap\n    :scenario1\n     (base/scenario\n      :name \"scenario1\"))\n  :sectionmap\n   (base/sectionmap\n    :section1\n     (base/section\n      :name \"section1\"))\n  :skillmap\n   (base/skillmap\n    :skill1\n     (base/skill\n      :name \"skill1\")))\n (section<-xml\n  (xml/xml\n   :tag \"section\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"power\"\n      :propmap\n       (stringmap\n        :name \"power1\"))\n     (xml/xml\n      :tag \"scenario\"\n      :propmap\n       (stringmap\n        :name \"scenario1\"))\n     (xml/xml\n      :tag \"section\"\n      :propmap\n       (stringmap\n        :name \"section1\"))\n     (xml/xml\n      :tag \"skill\"\n      :propmap\n       (stringmap\n        :name \"skill1\"))))))",
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
                  Core.vx_new_string(":powermap"),
                  Core.f_new(
                    Base.t_powermap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":power1"),
                      Core.f_new(
                        Base.t_power,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("power1")
                        )
                      )
                    )
                  ),
                  Core.vx_new_string(":scenariomap"),
                  Core.f_new(
                    Base.t_scenariomap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":scenario1"),
                      Core.f_new(
                        Base.t_scenario,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("scenario1")
                        )
                      )
                    )
                  ),
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
                  ),
                  Core.vx_new_string(":skillmap"),
                  Core.f_new(
                    Base.t_skillmap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":skill1"),
                      Core.f_new(
                        Base.t_skill,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("skill1")
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
                            Core.vx_new_string("power"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("power1")
                              )
                            )
                          )
                        ),
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
                                Core.vx_new_string("scenario1")
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

  static Test.Type_testcase f_skill_from_skill_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "skill<-skill-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/skill\n  :titles \"titles\")\n (skill<-skill-xmlchild\n  (empty base/skill)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_skill,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_skill_from_skill_xmlchild(
                Core.f_empty(
                  Base.t_skill
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

  static Test.Type_testcase f_skill_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "skill<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/skill\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\"\n  :abilitymap\n   (base/abilitymap\n    :ability1\n     (base/ability\n      :name \"ability1\"))\n  :specialtymap\n   (base/specialtymap\n    :specialty1\n     (base/specialty\n      :name \"specialty1\")))\n (skill<-xml\n  (xml/xml\n   :tag \"skill\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))\n     (xml/xml\n      :tag \"ability\"\n      :propmap\n       (stringmap\n        :name \"ability1\"))\n     (xml/xml\n      :tag \"specialty\"\n      :propmap\n       (stringmap\n        :name \"specialty1\"))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_skill,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image"),
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string(":reference"),
                  Core.vx_new_string("reference"),
                  Core.vx_new_string(":abilitymap"),
                  Core.f_new(
                    Base.t_abilitymap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":ability1"),
                      Core.f_new(
                        Base.t_ability,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("ability1")
                        )
                      )
                    )
                  ),
                  Core.vx_new_string(":specialtymap"),
                  Core.f_new(
                    Base.t_specialtymap,
                    Core.t_anylist.vx_new(
                      Core.vx_new_string(":specialty1"),
                      Core.f_new(
                        Base.t_specialty,
                        Core.t_anylist.vx_new(
                          Core.vx_new_string(":name"),
                          Core.vx_new_string("specialty1")
                        )
                      )
                    )
                  )
                )
              ),
              Bookloader.f_skill_from_xml(
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
                            Core.vx_new_string("ability"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("ability1")
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":tag"),
                            Core.vx_new_string("specialty"),
                            Core.vx_new_string(":propmap"),
                            Core.f_new(
                              Core.t_stringmap,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("specialty1")
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

  static Test.Type_testcase f_specialty_from_specialty_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "specialty<-specialty-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/specialty\n  :name \"name\"\n  :image \"image\")\n (specialty<-specialty-stringmap\n  (empty base/specialty)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_specialty,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_specialty_from_specialty_stringmap(
                Core.f_empty(
                  Base.t_specialty
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

  static Test.Type_testcase f_specialty_from_specialty_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "specialty<-specialty-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/specialty\n  :titles \"titles\")\n (specialty<-specialty-xmlchild\n  (empty base/specialty)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_specialty,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_specialty_from_specialty_xmlchild(
                Core.f_empty(
                  Base.t_specialty
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

  static Test.Type_testcase f_specialty_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "specialty<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/specialty\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (specialty<-xml\n  (xml/xml\n   :tag \"specialty\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_specialty,
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
              Bookloader.f_specialty_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("specialty"),
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

  static Test.Type_testcase f_terrain_from_terrain_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "terrain<-terrain-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/terrain\n  :name  \"name\"\n  :image \"image\")\n (terrain<-terrain-stringmap\n  (empty base/terrain)\n  (stringmap\n   :name  \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_terrain,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_terrain_from_terrain_stringmap(
                Core.f_empty(
                  Base.t_terrain
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

  static Test.Type_testcase f_terrain_from_terrain_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "terrain<-terrain-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/terrain\n  :titles \"titles\")\n (terrain<-terrain-xmlchild\n  (empty base/terrain)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_terrain,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_terrain_from_terrain_xmlchild(
                Core.f_empty(
                  Base.t_terrain
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

  static Test.Type_testcase f_unitability_from_unitability_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitability<-unitability-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unitability\n  :name \"name\"\n  :image \"image\")\n (unitability<-unitability-stringmap\n  (empty base/unitability)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unitability,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_unitability_from_unitability_stringmap(
                Core.f_empty(
                  Base.t_unitability
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

  static Test.Type_testcase f_unitability_from_unitability_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitability<-unitability-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unitability\n  :titles \"titles\")\n (unitability<-unitability-xmlchild\n  (empty base/unitability)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unitability,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_unitability_from_unitability_xmlchild(
                Core.f_empty(
                  Base.t_unitability
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

  static Test.Type_testcase f_unitability_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitability<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unitability\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (unitability<-xml\n  (xml/xml\n   :tag \"unitability\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unitability,
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
              Bookloader.f_unitability_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("unitability"),
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

  static Test.Type_testcase f_unititem_from_unititem_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unititem<-unititem-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unititem\n  :name \"name\"\n  :image \"image\")\n (unititem<-unititem-stringmap\n  (empty base/unititem)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unititem,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_unititem_from_unititem_stringmap(
                Core.f_empty(
                  Base.t_unititem
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

  static Test.Type_testcase f_unititem_from_unititem_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unititem<-unititem-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unititem\n  :titles \"titles1\")\n (unititem<-unititem-xmlchild\n  (empty base/unititem)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles1\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unititem,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles1")
                )
              ),
              Bookloader.f_unititem_from_unititem_xmlchild(
                Core.f_empty(
                  Base.t_unititem
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
                            Core.vx_new_string("titles1")
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

  static Test.Type_testcase f_unititem_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unititem<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unititem\n  :name \"name1\"\n  :image \"image1\"\n  :titles \"titles1\"\n  :reference \"reference1\"\n  :summary \"summary1\")\n (unititem<-xml\n  (xml/xml\n   :tag \"unititem\"\n   :propmap\n    (stringmap\n     :name \"name1\"\n     :image \"image1\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles1\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference1\")))\n     (xml/xml\n      :tag \"summary\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"summary1\")))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unititem,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name1"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image1"),
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles1"),
                  Core.vx_new_string(":reference"),
                  Core.vx_new_string("reference1"),
                  Core.vx_new_string(":summary"),
                  Core.vx_new_string("summary1")
                )
              ),
              Bookloader.f_unititem_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("unititem"),
                    Core.vx_new_string(":propmap"),
                    Core.f_new(
                      Core.t_stringmap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("name1"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("image1")
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
                                    Core.vx_new_string("titles1")
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
                                    Core.vx_new_string("reference1")
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
                            Core.vx_new_string("summary"),
                            Core.vx_new_string(":children"),
                            Core.f_new(
                              Xml.t_xmllist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Xml.t_xml,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":text"),
                                    Core.vx_new_string("summary1")
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

  static Test.Type_testcase f_unitpower_from_unitpower_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitpower<-unitpower-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unitpower\n  :summary \"summary1\")\n (unitpower<-unitpower-xmlchild\n  (empty base/unitpower)\n  (xml/xml\n   :tag \"summary\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"summary1\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unitpower,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":summary"),
                  Core.vx_new_string("summary1")
                )
              ),
              Bookloader.f_unitpower_from_unitpower_xmlchild(
                Core.f_empty(
                  Base.t_unitpower
                ),
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("summary"),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":text"),
                            Core.vx_new_string("summary1")
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

  static Test.Type_testcase f_unitskill_from_unitskill_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitskill<-unitskill-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unitskill\n  :summary \"summary1\")\n (unitskill<-unitskill-xmlchild\n  (empty base/unitskill)\n  (xml/xml\n   :tag \"summary\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"summary1\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unitskill,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":summary"),
                  Core.vx_new_string("summary1")
                )
              ),
              Bookloader.f_unitskill_from_unitskill_xmlchild(
                Core.f_empty(
                  Base.t_unitskill
                ),
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("summary"),
                    Core.vx_new_string(":children"),
                    Core.f_new(
                      Xml.t_xmllist,
                      Core.t_anylist.vx_new(
                        Core.f_new(
                          Xml.t_xml,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":text"),
                            Core.vx_new_string("summary1")
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

  static Test.Type_testcase f_unitspecialty_from_unitspecialty_stringmap(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitspecialty<-unitspecialty-stringmap",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unitspecialty\n  :name \"name\"\n  :image \"image\")\n (unitspecialty<-unitspecialty-stringmap\n  (empty base/unitspecialty)\n  (stringmap\n   :name \"name\"\n   :image \"image\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unitspecialty,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  Core.vx_new_string("name"),
                  Core.vx_new_string(":image"),
                  Core.vx_new_string("image")
                )
              ),
              Bookloader.f_unitspecialty_from_unitspecialty_stringmap(
                Core.f_empty(
                  Base.t_unitspecialty
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

  static Test.Type_testcase f_unitspecialty_from_unitspecialty_xmlchild(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitspecialty<-unitspecialty-xmlchild",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unitspecialty\n  :titles \"titles\")\n (unitspecialty<-unitspecialty-xmlchild\n  (empty base/unitspecialty)\n  (xml/xml\n   :tag \"titles\"\n   :children\n    (xml/xmllist\n     (xml/xml\n      :text \"titles\")))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unitspecialty,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Core.vx_new_string("titles")
                )
              ),
              Bookloader.f_unitspecialty_from_unitspecialty_xmlchild(
                Core.f_empty(
                  Base.t_unitspecialty
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

  static Test.Type_testcase f_unitspecialty_from_xml(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "nx/tactics/books/bookloader",
      ":casename", "unitspecialty<-xml",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (base/unitspecialty\n  :name \"name\"\n  :image \"image\"\n  :titles \"titles\"\n  :reference \"reference\")\n (unitspecialty<-xml\n  (xml/xml\n   :tag \"unitspecialty\"\n   :propmap\n    (stringmap\n     :name \"name\"\n     :image \"image\")\n   :children\n    (xml/xmllist\n     (xml/xml\n      :tag \"titles\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"titles\")))\n     (xml/xml\n      :tag \"reference\"\n      :children\n       (xml/xmllist\n        (xml/xml\n         :text \"reference\")))))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Base.t_unitspecialty,
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
              Bookloader.f_unitspecialty_from_xml(
                Core.f_new(
                  Xml.t_xml,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":tag"),
                    Core.vx_new_string("unitspecialty"),
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

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      BookloaderTest.f_ability_from_ability_stringmap(context),
      BookloaderTest.f_ability_from_ability_xmlchild(context),
      BookloaderTest.f_ability_from_xml(context),
      BookloaderTest.f_book_from_book_key_value(context),
      BookloaderTest.f_book_from_book_stringmap(context),
      BookloaderTest.f_book_from_book_xml(context),
      BookloaderTest.f_book_from_book_xmlchapter(context),
      BookloaderTest.f_book_from_book_xmlchild(context),
      BookloaderTest.f_book_from_xml(context),
      BookloaderTest.f_book_from_xmldoc(context),
      BookloaderTest.f_book_from_xmllist(context),
      BookloaderTest.f_chapter_from_chapter_stringmap(context),
      BookloaderTest.f_chapter_from_chapter_xmlchild(context),
      BookloaderTest.f_chapter_from_xml(context),
      BookloaderTest.f_damage_from_damage_stringmap(context),
      BookloaderTest.f_damage_from_damage_xmlchild(context),
      BookloaderTest.f_power_from_power_stringmap(context),
      BookloaderTest.f_power_from_power_xmlchild(context),
      BookloaderTest.f_power_from_xml(context),
      BookloaderTest.f_rule_from_rule_stringmap(context),
      BookloaderTest.f_rule_from_rule_xmlchild(context),
      BookloaderTest.f_scenario_from_xml(context),
      BookloaderTest.f_section_from_xml(context),
      BookloaderTest.f_skill_from_skill_xmlchild(context),
      BookloaderTest.f_skill_from_xml(context),
      BookloaderTest.f_specialty_from_specialty_stringmap(context),
      BookloaderTest.f_specialty_from_specialty_xmlchild(context),
      BookloaderTest.f_specialty_from_xml(context),
      BookloaderTest.f_terrain_from_terrain_stringmap(context),
      BookloaderTest.f_terrain_from_terrain_xmlchild(context),
      BookloaderTest.f_unit_from_unit_stringmap(context),
      BookloaderTest.f_unit_from_unit_xmlchild(context),
      BookloaderTest.f_unit_from_xml(context),
      BookloaderTest.f_unitability_from_unitability_stringmap(context),
      BookloaderTest.f_unitability_from_unitability_xmlchild(context),
      BookloaderTest.f_unitability_from_xml(context),
      BookloaderTest.f_unititem_from_unititem_stringmap(context),
      BookloaderTest.f_unititem_from_unititem_xmlchild(context),
      BookloaderTest.f_unititem_from_xml(context),
      BookloaderTest.f_unitpower_from_unitpower_xmlchild(context),
      BookloaderTest.f_unitskill_from_unitskill_xmlchild(context),
      BookloaderTest.f_unitspecialty_from_unitspecialty_stringmap(context),
      BookloaderTest.f_unitspecialty_from_unitspecialty_xmlchild(context),
      BookloaderTest.f_unitspecialty_from_xml(context)
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "nx/tactics/books/bookloader", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 90, ":tests", 116, ":total", 128), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 34, ":tests", 44, ":total", 128), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 128), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 128), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 34, ":tests", 44, ":total", 128), 
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
        ":ability<-ability-key-value", 0,
        ":ability<-ability-stringmap", 1,
        ":ability<-ability-xmlchild", 1,
        ":ability<-xml", 1,
        ":book-read<-bookname", 0,
        ":book<-book-key-value", 2,
        ":book<-book-stringmap", 1,
        ":book<-book-xml", 3,
        ":book<-book-xmlchapter", 1,
        ":book<-book-xmlchild", 2,
        ":book<-xml", 1,
        ":book<-xmldoc", 1,
        ":book<-xmllist", 1,
        ":boolean-write<-book", 0,
        ":boolean-write<-booknames", 0,
        ":chapter<-chapter-key-value", 0,
        ":chapter<-chapter-stringmap", 1,
        ":chapter<-chapter-xmlchild", 1,
        ":chapter<-chapter-xmlsection", 0,
        ":chapter<-xml", 1,
        ":damage<-damage-key-value", 0,
        ":damage<-damage-stringmap", 1,
        ":damage<-damage-xmlchild", 1,
        ":damage<-xml", 0,
        ":file-read<-bookname", 0,
        ":file-write<-book", 0,
        ":item<-item-key-value", 0,
        ":item<-item-stringmap", 0,
        ":item<-item-xmlchild", 0,
        ":item<-xml", 0,
        ":location<-location-key-value", 0,
        ":location<-location-stringmap", 0,
        ":location<-location-xmlchild", 0,
        ":location<-xml", 0,
        ":modifier<-modifier-key-value", 0,
        ":modifier<-modifier-stringmap", 0,
        ":modifier<-modifier-xmlchild", 0,
        ":modifier<-xml", 0,
        ":power<-power-key-value", 0,
        ":power<-power-stringmap", 1,
        ":power<-power-xmlability", 0,
        ":power<-power-xmlchild", 1,
        ":power<-power-xmlspecialty", 0,
        ":power<-xml", 1,
        ":rule<-rule-key-value", 0,
        ":rule<-rule-stringmap", 1,
        ":rule<-rule-xmlchild", 1,
        ":rule<-xml", 0,
        ":scenario<-scenario-key-value", 0,
        ":scenario<-scenario-stringmap", 0,
        ":scenario<-scenario-xmlchild", 0,
        ":scenario<-scenario-xmlteam", 0,
        ":scenario<-xml", 1,
        ":section<-section-key-value", 0,
        ":section<-section-stringmap", 0,
        ":section<-section-xmlchild", 0,
        ":section<-section-xmldamage", 0,
        ":section<-section-xmlitem", 0,
        ":section<-section-xmllocation", 0,
        ":section<-section-xmlmodifier", 0,
        ":section<-section-xmlpower", 0,
        ":section<-section-xmlrule", 0,
        ":section<-section-xmlscenario", 0,
        ":section<-section-xmlsection", 0,
        ":section<-section-xmlskill", 0,
        ":section<-section-xmlterrain", 0,
        ":section<-section-xmlunit", 0,
        ":section<-xml", 1,
        ":skill<-skill-key-value", 0,
        ":skill<-skill-stringmap", 0,
        ":skill<-skill-xmlability", 0,
        ":skill<-skill-xmlchild", 1,
        ":skill<-skill-xmlspecialty", 0,
        ":skill<-xml", 1,
        ":specialty<-specialty-key-value", 0,
        ":specialty<-specialty-stringmap", 1,
        ":specialty<-specialty-xmlchild", 1,
        ":specialty<-xml", 1,
        ":string-read<-bookname", 0,
        ":string-vxlisp-header<-chaptermap", 0,
        ":string-vxlisp<-book", 0,
        ":string-vxlisp<-chapter", 0,
        ":string-vxlisp<-chaptermap", 0,
        ":string-writename<-string", 0,
        ":team<-team-key-value", 0,
        ":team<-team-stringmap", 0,
        ":team<-team-xmlchild", 0,
        ":team<-xml", 0,
        ":terrain<-terrain-key-value", 0,
        ":terrain<-terrain-stringmap", 1,
        ":terrain<-terrain-xmlchild", 1,
        ":terrain<-xml", 0,
        ":unit<-unit-key-value", 0,
        ":unit<-unit-stringmap", 1,
        ":unit<-unit-xmlchild", 1,
        ":unit<-unit-xmlpower", 0,
        ":unit<-unit-xmlskill", 0,
        ":unit<-unit-xmlweakness", 0,
        ":unit<-xml", 1,
        ":unitability<-unitability-key-value", 0,
        ":unitability<-unitability-stringmap", 1,
        ":unitability<-unitability-xmlchild", 1,
        ":unitability<-xml", 1,
        ":unititem<-unititem-key-value", 0,
        ":unititem<-unititem-stringmap", 1,
        ":unititem<-unititem-xmlchild", 1,
        ":unititem<-xml", 1,
        ":unitpower<-unitpower-key-value", 0,
        ":unitpower<-unitpower-stringmap", 0,
        ":unitpower<-unitpower-xmlability", 0,
        ":unitpower<-unitpower-xmlchild", 1,
        ":unitpower<-unitpower-xmlitem", 0,
        ":unitpower<-unitpower-xmlspecialty", 0,
        ":unitpower<-xml", 0,
        ":unitskill<-unitskill-key-value", 0,
        ":unitskill<-unitskill-stringmap", 0,
        ":unitskill<-unitskill-xmlability", 0,
        ":unitskill<-unitskill-xmlchild", 1,
        ":unitskill<-unitskill-xmlitem", 0,
        ":unitskill<-unitskill-xmlspecialty", 0,
        ":unitskill<-xml", 0,
        ":unitspecialty<-unitspecialty-key-value", 0,
        ":unitspecialty<-unitspecialty-stringmap", 1,
        ":unitspecialty<-unitspecialty-xmlchild", 1,
        ":unitspecialty<-xml", 1,
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
