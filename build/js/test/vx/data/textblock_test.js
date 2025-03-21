'strict mode'

import vx_data_textblock from "../../../src/vx/data/textblock.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"
import vx_collection from "../../../src/vx/collection.js"
import vx_type from "../../../src/vx/type.js"

export default class vx_data_textblock_test {


  static test_package(context) {
    const testcaselist = vx_data_textblock_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "vx/data/textblock",
      ":caselist", testcaselist,
      ":coveragesummary", vx_data_textblock_test.test_coveragesummary(),
      ":coveragedetail", vx_data_textblock_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "vx/data/textblock", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 22), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 52, ":total", 52), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 65, ":tests", 17, ":total", 26), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 34, ":tests", 18, ":total", 52), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 25, ":tests", 1, ":total", 4)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "vx/data/textblock",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "delim", 0,
          "delimlist", 1,
          "textblock", 0,
          "textblocklist", 0
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "delimbracketangle", 0,
          "delimbracketcurly", 0,
          "delimbracketsquare", 0,
          "delimclose", 0,
          "delimclosing", 0,
          "delimcomma", 0,
          "delimcomment", 0,
          "delimcommentblock", 0,
          "delimline", 0,
          "delimlisttest1", 0,
          "delimlisttest2", 0,
          "delimlisttest3", 0,
          "delimnonwhitespace", 0,
          "delimparen", 0,
          "delimquote", 0,
          "delimquoteblock", 0,
          "delimspace", 0,
          "delimtest1", 0,
          "delimtest2", 0,
          "delimtest3", 0,
          "delimtext", 0,
          "delimwhitespace", 0
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "children<-textblock", 0,
          "delim-first<-delim-delim", 2,
          "delim-first<-string-delimlist", 1,
          "delim-pos<-string-delim", 1,
          "delimlist-pos<-string-delimlist", 1,
          "is-close", 0,
          "is-single", 0,
          "stringlist<-textblocklist", 1,
          "text<-textblock", 1,
          "textblock-addchild<-textblock-find-child", 0,
          "textblock-delimnotfound", 5,
          "textblock-findparent<-textblock", 0,
          "textblock-init", 1,
          "textblock-parse", 1,
          "textblock-parse-one", 22,
          "textblock-parse<-string-delim", 0,
          "textblock-replace<-textblock-find-replace", 0,
          "textblock-startleft<-string-delim-offset", 1,
          "textblock-startright<-string-delim-offset", 2,
          "textblock<-close-textblock", 2,
          "textblock<-empty-textblock", 0,
          "textblock<-open-textblock", 3,
          "textblock<-single-textblock", 3,
          "textblock<-string-delim", 1,
          "textblock<-textblock-delim", 0,
          "textblocklist<-textblocklist-remove", 1
        )
    )
    return output
  }

  static t_delimlist(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "delimlist",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (new : delimlist\n  delimcomma\n  delimwhitespace)\n (delimlist\n  delimcomma\n  delimwhitespace))",
            ":testresult", vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_delimlist},
                vx_data_textblock.c_delimcomma,
                vx_data_textblock.c_delimwhitespace
              ),
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_delimlist},
                vx_data_textblock.c_delimcomma,
                vx_data_textblock.c_delimwhitespace
              )
            )
          )
        )
    )
    return output
  }

  static f_delim_first_from_delim_delim(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "delim-first<-delim-delim",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (copy delimcomma\n  :pos 1)\n (delim-first<-delim-delim\n  (copy delimspace\n   :pos 2)\n  (copy delimcomma\n   :pos 1)))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_copy(
                vx_data_textblock.c_delimcomma,
                ":pos",
                1
              ),
              vx_data_textblock.f_delim_first_from_delim_delim(
                vx_core.f_copy(
                  vx_data_textblock.c_delimspace,
                  ":pos",
                  2
                ),
                vx_core.f_copy(
                  vx_data_textblock.c_delimcomma,
                  ":pos",
                  1
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (empty delim)\n (delim-first<-delim-delim\n  (delim\n   :pos 0)\n  (empty delim)))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_empty(
                vx_data_textblock.t_delim
              ),
              vx_data_textblock.f_delim_first_from_delim_delim(
                vx_core.f_new({"any-1": vx_data_textblock.t_delim}, ":pos", 0),
                vx_core.f_empty(
                  vx_data_textblock.t_delim
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_delim_first_from_string_delimlist(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "delim-first<-string-delimlist",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (copy delimcomma\n  :pos 2)\n (delim-first<-string-delimlist\n  \"a, b\"\n  (delimlist\n   delimspace\n   delimcomma)))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_copy(
                vx_data_textblock.c_delimcomma,
                ":pos",
                2
              ),
              vx_data_textblock.f_delim_first_from_string_delimlist(
                "a, b",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delimlist},
                  vx_data_textblock.c_delimspace,
                  vx_data_textblock.c_delimcomma
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_delim_pos_from_string_delim(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "delim-pos<-string-delim",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (copy delimcomma\n  :pos 2)\n (delim-pos<-string-delim\n  \"a,b\"\n  delimcomma))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_copy(
                vx_data_textblock.c_delimcomma,
                ":pos",
                2
              ),
              vx_data_textblock.f_delim_pos_from_string_delim(
                "a,b",
                vx_data_textblock.c_delimcomma
              )
            )
          )
        )
    )
    return output
  }

  static f_delimlist_pos_from_string_delimlist(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "delimlist-pos<-string-delimlist",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (delimlist\n  (copy delimspace\n   :pos 3)\n  (copy delimcomma\n   :pos 2))\n (delimlist-pos<-string-delimlist\n  \"a, b\"\n  (delimlist\n   delimspace\n   delimcomma)))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_delimlist},
                vx_core.f_copy(
                  vx_data_textblock.c_delimspace,
                  ":pos",
                  3
                ),
                vx_core.f_copy(
                  vx_data_textblock.c_delimcomma,
                  ":pos",
                  2
                )
              ),
              vx_data_textblock.f_delimlist_pos_from_string_delimlist(
                "a, b",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delimlist},
                  vx_data_textblock.c_delimspace,
                  vx_data_textblock.c_delimcomma
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_stringlist_from_textblocklist(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "stringlist<-textblocklist",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (stringlist\n  \"a\" \"b\")\n (stringlist<-textblocklist\n  (textblocklist\n   (textblock\n    :text \"a\")\n   (textblock\n    :text \"b\"))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new({"any-1": vx_core.t_stringlist}, "a", "b"),
              vx_data_textblock.f_stringlist_from_textblocklist(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblocklist},
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a"),
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b")
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_text_from_textblock(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "text<-textblock",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n \"a\"\n (text<-textblock\n  (textblock\n   :text \"a\")))",
            ":testresult",
            vx_test.f_test(
              context,
              "a",
              vx_data_textblock.f_text_from_textblock(
                vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a")
              )
            )
          )
        )
    )
    return output
  }

  static f_textblock_delimnotfound(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock-delimnotfound",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"<a\"\n  :startpos 1\n  :endpos 2\n  :children\n   (textblocklist\n    (textblock\n     :text \"<a\"\n     :startpos 1\n     :endpos 2\n     :delim\n      (copy delimbracketangle\n       :delimlist vx/data/textblock/delimlisttest1)\n     :children\n      (textblocklist\n       (textblock\n        :text \"a\"\n        :startpos 2\n        :endpos 2))\n     (msg\n      :code \"closedelimmissing\"\n      :detail\n       (delim\n        :name \"delimclose\"\n        :starttext \">\")\n      :severity msg-error))))\n (textblock-delimnotfound\n  (textblock\n   :text \"a\"\n   :startpos 2\n   :endpos 2\n   :delim\n    (delim\n     :delimlist vx/data/textblock/delimlisttest2)\n   :close\n    (copy delimclose\n     :starttext \">\")\n   :parent\n    (textblock\n     :text \"<a\"\n     :startpos 1\n     :endpos 2\n     :delim\n      (copy delimbracketangle\n       :delimlist vx/data/textblock/delimlisttest1)\n     :parent\n      (textblock\n       :text \"<a\"\n       :startpos 1\n       :endpos 2)))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "<a",
                ":startpos",
                1,
                ":endpos",
                2,
                ":children",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblocklist},
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<a",
                    ":startpos",
                    1,
                    ":endpos",
                    2,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 2, ":endpos", 2)
                    ),
                    vx_core.f_new(
                      {"any-1": vx_core.t_msg},
                      ":code",
                      "closedelimmissing",
                      ":detail",
                      vx_core.f_new({"any-1": vx_data_textblock.t_delim}, ":name", "delimclose", ":starttext", ">"),
                      ":severity",
                      vx_core.c_msg_error
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_delimnotfound(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "a",
                  ":startpos",
                  2,
                  ":endpos",
                  2,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<a",
                    ":startpos",
                    1,
                    ":endpos",
                    2,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<a", ":startpos", 1, ":endpos", 2)
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \",\"\n  :startpos 4\n  :endpos 4\n  :delim\n   (copy delimcomma\n    :pos 0)\n  :parent\n   (textblock\n    :text \"b},{c d}>\"\n    :startpos 5\n    :endpos 13\n    :delim\n     (delim\n      :delimlist delimlisttest3)\n    :close\n     (copy delimclose\n      :starttext \"}\")\n    :parent\n     (textblock\n      :text \"{a,b},{c d}>\"\n      :startpos 2\n      :endpos 13\n      :delim\n       (copy delimbracketcurly\n        :pos 0)\n      :close\n       (copy delimclose\n        :starttext \">\")\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :pos 0)\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13))\n      :children\n       (textblocklist\n        (textblock\n         :text \"a\"\n         :startpos 3\n         :endpos 3)))))\n (textblock-delimnotfound\n  (textblock\n   :text \"a\"\n   :startpos 3\n   :endpos 3\n   :parent\n    (textblock\n     :text \",\"\n     :startpos 4\n     :endpos 4\n     :delim\n      (copy delimcomma\n       :pos 0)\n     :parent\n      (textblock\n       :text \"b},{c d}>\"\n       :startpos 5\n       :endpos 13\n       :delim\n        (delim\n         :delimlist delimlisttest3)\n       :close\n        (copy delimclose\n         :starttext \"}\")\n       :parent\n        (textblock\n         :text \"{a,b},{c d}>\"\n         :startpos 2\n         :endpos 13\n         :delim\n          (copy delimbracketcurly\n           :pos 0)\n         :close\n          (copy delimclose\n           :starttext \">\")\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13\n           :delim\n            (copy delimbracketangle\n             :pos 0)\n           :parent\n            (textblock\n             :text \"<{a,b},{c d}>\"\n             :startpos 1\n             :endpos 13))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                ",",
                ":startpos",
                4,
                ":endpos",
                4,
                ":delim",
                vx_core.f_copy(
                  vx_data_textblock.c_delimcomma,
                  ":pos",
                  0
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "b},{c d}>",
                  ":startpos",
                  5,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{a,b},{c d}>",
                    ":startpos",
                    2,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":pos",
                      0
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":pos",
                        0
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3)
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_delimnotfound(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "a",
                  ":startpos",
                  3,
                  ":endpos",
                  3,
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    ",",
                    ":startpos",
                    4,
                    ":endpos",
                    4,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimcomma,
                      ":pos",
                      0
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "b},{c d}>",
                      ":startpos",
                      5,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_delim},
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest3
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        "}"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b},{c d}>",
                        ":startpos",
                        2,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":close",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimclose,
                          ":starttext",
                          ">"
                        ),
                        ":parent",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "<{a,b},{c d}>",
                          ":startpos",
                          1,
                          ":endpos",
                          13,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketangle,
                            ":pos",
                            0
                          ),
                          ":parent",
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \",{c d}>\"\n  :startpos 7\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest3)\n  :close\n   (copy delimclose\n    :starttext \">\")\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13\n    :delim\n     (copy delimbracketangle\n      :pos 0)\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13)\n    :children\n     (textblocklist\n      (textblock\n       :text \"{a,b}\"\n       :startpos 2\n       :endpos 6\n       :delim\n        (copy delimbracketcurly\n         :pos 0)\n       :children\n        (textblocklist\n         (textblock\n          :text \"a\"\n          :startpos 3\n          :endpos 3)\n         (textblock\n          :text \",\"\n          :startpos 4\n          :endpos 4\n          :delim\n           (copy delimcomma\n            :pos 0))\n         (textblock\n          :text \"b\"\n          :startpos 5\n          :endpos 5))))))\n (textblock-delimnotfound\n  (textblock\n   :text \"b\"\n   :startpos 5\n   :endpos 5\n   :parent\n    (textblock\n     :text \",{c d}>\"\n     :startpos 7\n     :endpos 13\n     :delim\n      (delim\n       :delimlist delimlisttest3)\n     :close\n      (copy delimclose\n       :starttext \">\")\n     :parent\n      (textblock\n       :text \"{a,b}\"\n       :startpos 2\n       :endpos 6\n       :delim\n        (copy delimbracketcurly\n         :pos 0)\n       :close delimclosing\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13\n         :delim\n          (copy delimbracketangle\n           :pos 0)\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13))\n       :children\n        (textblocklist\n         (textblock\n          :text \"a\"\n          :startpos 3\n          :endpos 3)\n         (textblock\n          :text \",\"\n          :startpos 4\n          :endpos 4\n          :delim\n           (copy delimcomma\n            :pos 0))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                ",{c d}>",
                ":startpos",
                7,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest3
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  ">"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketangle,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{a,b}",
                      ":startpos",
                      2,
                      ":endpos",
                      6,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":pos",
                        0
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          4,
                          ":endpos",
                          4,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_delimnotfound(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "b",
                  ":startpos",
                  5,
                  ":endpos",
                  5,
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    ",{c d}>",
                    ":startpos",
                    7,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest3
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{a,b}",
                      ":startpos",
                      2,
                      ":endpos",
                      6,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":pos",
                        0
                      ),
                      ":close",
                      vx_data_textblock.c_delimclosing,
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":pos",
                          0
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          4,
                          ":endpos",
                          4,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :startpos 14\n  :endpos 14\n  :delim\n   (delim\n    :delimlist delimlisttest1)\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13\n    :children\n     (textblocklist\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (copy delimbracketangle\n         :pos 0)\n       :children\n        (textblocklist\n         (textblock\n          :text \"{a,b}\"\n          :startpos 2\n          :endpos 6\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"a\"\n             :startpos 3\n             :endpos 3)\n            (textblock\n             :text \",\"\n             :startpos 4\n             :endpos 4\n             :delim\n              (copy delimcomma\n               :pos 0))\n            (textblock\n             :text \"b\"\n             :startpos 5\n             :endpos 5)))\n         (textblock\n          :text \",\"\n          :startpos 7\n          :endpos 7\n          :delim\n           (copy delimcomma\n            :pos 0))\n         (textblock\n          :text \"{c d}\"\n          :startpos 8\n          :endpos 12\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"c\"\n             :startpos 9\n             :endpos 9)\n           (textblock\n            :text \" \"\n            :startpos 10\n            :endpos 10\n            :delim\n             (copy delimwhitespace\n              :pos 0))\n           (textblock\n            :text \"d\"\n            :startpos 11\n            :endpos 11))))))))\n (textblock-delimnotfound\n  (textblock\n   :startpos 13\n   :endpos 13\n   :parent\n    (textblock\n     :startpos 14\n     :endpos 14\n     :delim\n      (delim\n       :delimlist delimlisttest1)\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (copy delimbracketangle\n         :pos 0)\n       :close delimclosing\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13)\n       :children\n        (textblocklist\n         (textblock\n          :text \"{a,b}\"\n          :startpos 2\n          :endpos 6\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"a\"\n             :startpos 3\n             :endpos 3)\n            (textblock\n             :text \",\"\n             :startpos 4\n             :endpos 4\n             :delim\n              (copy delimcomma\n               :pos 0))\n            (textblock\n             :text \"b\"\n             :startpos 5\n             :endpos 5)))\n         (textblock\n          :text \",\"\n          :startpos 7\n          :endpos 7\n          :delim\n           (copy delimcomma\n            :pos 0))\n         (textblock\n          :text \"{c d}\"\n          :startpos 8\n          :endpos 12\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"c\"\n             :startpos 9\n             :endpos 9)\n           (textblock\n            :text \" \"\n            :startpos 10\n            :endpos 10\n            :delim\n             (copy delimwhitespace\n              :pos 0))\n           (textblock\n            :text \"d\"\n            :startpos 11\n            :endpos 11)))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":startpos",
                14,
                ":endpos",
                14,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest1
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":pos",
                        0
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{c d}",
                          ":startpos",
                          8,
                          ":endpos",
                          12,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              " ",
                              ":startpos",
                              10,
                              ":endpos",
                              10,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimwhitespace,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                          )
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_delimnotfound(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":startpos",
                  13,
                  ":endpos",
                  13,
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":startpos",
                    14,
                    ":endpos",
                    14,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":pos",
                        0
                      ),
                      ":close",
                      vx_data_textblock.c_delimclosing,
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{c d}",
                          ":startpos",
                          8,
                          ":endpos",
                          12,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              " ",
                              ":startpos",
                              10,
                              ":endpos",
                              10,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimwhitespace,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text\n   \"\\\"b\\\"\n1,\\\"2\\\"\"\n  :startpos 5\n  :endpos 13\n  :delim\n   (delim\n    :delimlist\n     (delimlist\n      vx/data/textblock/delimline\n      vx/data/textblock/delimquote\n      vx/data/textblock/delimcomma))\n  :parent\n   (textblock\n    :text\n     \"\\\"a\\\",\\\"b\\\"\n1,\\\"2\\\"\"\n    :startpos 1\n    :endpos 13\n    :children\n     (textblocklist\n      (textblock\n       :text \"\\\"a\\\"\"\n       :startpos 1\n       :endpos 3\n       :delim\n        (delim\n         :name \"delimquote\"\n         :starttext \"\\\"\"\n         :endtext \"\\\"\")\n       :children\n        (textblocklist\n         (textblock\n          :text \"a\"\n          :startpos 2\n          :endpos 2)))\n      (textblock\n       :text \",\"\n       :startpos 4\n       :endpos 4\n       :delim\n        (delim\n         :name \"delimcomma\"\n         :starttext \",\")))))\n(textblock-delimnotfound\n (textblock\n  :text \",\"\n  :startpos 4\n  :endpos 4\n  :delim\n   (delim\n    :name \"delimcomma\"\n    :starttext \",\")\n  :parent\n   (textblock\n    :text\n     \"\\\"b\\\"\n1,\\\"2\\\"\"\n    :startpos 5\n    :endpos 13\n    :delim\n     (delim\n      :delimlist\n       (delimlist\n        vx/data/textblock/delimline\n        vx/data/textblock/delimquote\n        vx/data/textblock/delimcomma))\n    :parent\n     (textblock\n      :text\n       \"\\\"a\\\",\\\"b\\\"\n1,\\\"2\\\"\"\n      :startpos 1\n      :endpos 13\n      :children\n       (textblocklist\n        (textblock\n         :text \"\\\"a\\\"\"\n         :startpos 1\n         :endpos 3\n         :delim\n          (delim\n           :name \"delimquote\"\n           :starttext \"\\\"\"\n           :endtext \"\\\"\")\n         :children\n          (textblocklist\n           (textblock\n            :text \"a\"\n            :startpos 2\n            :endpos 2)))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "\"b\"\n1,\"2\"",
                ":startpos",
                5,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delimlist},
                    vx_data_textblock.c_delimline,
                    vx_data_textblock.c_delimquote,
                    vx_data_textblock.c_delimcomma
                  )
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "\"a\",\"b\"\n1,\"2\"",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "\"a\"",
                      ":startpos",
                      1,
                      ":endpos",
                      3,
                      ":delim",
                      vx_core.f_new({"any-1": vx_data_textblock.t_delim}, ":name", "delimquote", ":starttext", "\"", ":endtext", "\""),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 2, ":endpos", 2)
                      )
                    ),
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      ",",
                      ":startpos",
                      4,
                      ":endpos",
                      4,
                      ":delim",
                      vx_core.f_new({"any-1": vx_data_textblock.t_delim}, ":name", "delimcomma", ":starttext", ",")
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_delimnotfound(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",",
                  ":startpos",
                  4,
                  ":endpos",
                  4,
                  ":delim",
                  vx_core.f_new({"any-1": vx_data_textblock.t_delim}, ":name", "delimcomma", ":starttext", ","),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "\"b\"\n1,\"2\"",
                    ":startpos",
                    5,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_delimlist},
                        vx_data_textblock.c_delimline,
                        vx_data_textblock.c_delimquote,
                        vx_data_textblock.c_delimcomma
                      )
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "\"a\",\"b\"\n1,\"2\"",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "\"a\"",
                          ":startpos",
                          1,
                          ":endpos",
                          3,
                          ":delim",
                          vx_core.f_new({"any-1": vx_data_textblock.t_delim}, ":name", "delimquote", ":starttext", "\"", ":endtext", "\""),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 2, ":endpos", 2)
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
    return output
  }

  static f_textblock_init(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock-init",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"<{a,b},{c d}>\"\n  :startpos 1\n  :endpos 13\n  :delim delimtest1\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13))\n (textblock-init\n  (textblock\n   :text \"<{a,b},{c d}>\"\n   :delim delimtest1)))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "<{a,b},{c d}>",
                ":startpos",
                1,
                ":endpos",
                13,
                ":delim",
                vx_data_textblock.c_delimtest1,
                ":parent",
                vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
              ),
              vx_data_textblock.f_textblock_init(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":delim",
                  vx_data_textblock.c_delimtest1
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_textblock_parse(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock-parse",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"<{a,b},{c d}>\"\n  :startpos 1\n  :endpos 13\n  :children\n   (textblocklist\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :pos 0)\n     :children\n      (textblocklist\n       (textblock\n        :text \"{a,b}\"\n        :startpos 2\n        :endpos 6\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"a\"\n           :startpos 3\n           :endpos 3)\n          (textblock\n           :text \",\"\n           :startpos 4\n           :endpos 4\n           :delim\n            (copy delimcomma\n             :pos 0))\n          (textblock\n           :text \"b\"\n           :startpos 5\n           :endpos 5)))\n       (textblock\n        :text \",\"\n        :startpos 7\n        :endpos 7\n        :delim\n         (copy delimcomma\n          :pos 0))\n       (textblock\n        :text \"{c d}\"\n        :startpos 8\n        :endpos 12\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"c\"\n           :startpos 9\n           :endpos 9)\n          (textblock\n           :text \" \"\n           :startpos 10\n           :endpos 10\n           :delim\n            (copy delimwhitespace\n             :pos 0))\n          (textblock\n           :text \"d\"\n           :startpos 11\n           :endpos 11)))))))\n (textblock-parse\n  (textblock\n   :text \"<{a,b},{c d}>\"\n   :delim delimtest1)))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "<{a,b},{c d}>",
                ":startpos",
                1,
                ":endpos",
                13,
                ":children",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblocklist},
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":pos",
                      0
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{c d}",
                        ":startpos",
                        8,
                        ":endpos",
                        12,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            " ",
                            ":startpos",
                            10,
                            ":endpos",
                            10,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimwhitespace,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":delim",
                  vx_data_textblock.c_delimtest1
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_textblock_parse_one(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock-parse-one",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"<a\"\n  :startpos 1\n  :endpos 2\n  :children\n   (textblocklist\n    (textblock\n     :text \"<a\"\n     :startpos 1\n     :endpos 2\n     :delim\n      (copy delimbracketangle\n       :delimlist vx/data/textblock/delimlisttest1)\n     :children\n      (textblocklist\n       (textblock\n        :text \"a\"\n        :startpos 2\n        :endpos 2))\n     (msg\n      :code \"closedelimmissing\"\n      :detail\n       (delim\n        :name \"delimclose\"\n        :starttext \">\")\n      :severity msg-error))))\n (textblock-parse-one\n  (textblock\n   :text \"a\"\n   :startpos 2\n   :endpos 2\n   :delim\n    (delim\n     :delimlist vx/data/textblock/delimlisttest2)\n   :close\n    (copy delimclose\n     :starttext \">\")\n   :parent\n    (textblock\n     :text \"<a\"\n     :startpos 1\n     :endpos 2\n     :delim\n      (copy delimbracketangle\n       :delimlist vx/data/textblock/delimlisttest1)\n     :parent\n      (textblock\n       :text \"<a\"\n       :startpos 1\n       :endpos 2)))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "<a",
                ":startpos",
                1,
                ":endpos",
                2,
                ":children",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblocklist},
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<a",
                    ":startpos",
                    1,
                    ":endpos",
                    2,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 2, ":endpos", 2)
                    ),
                    vx_core.f_new(
                      {"any-1": vx_core.t_msg},
                      ":code",
                      "closedelimmissing",
                      ":detail",
                      vx_core.f_new({"any-1": vx_data_textblock.t_delim}, ":name", "delimclose", ":starttext", ">"),
                      ":severity",
                      vx_core.c_msg_error
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "a",
                  ":startpos",
                  2,
                  ":endpos",
                  2,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<a",
                    ":startpos",
                    1,
                    ":endpos",
                    2,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<a", ":startpos", 1, ":endpos", 2)
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"<{a,b},{c d}>\"\n  :startpos 1\n  :endpos 13\n  :delim delimtest1\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13))\n (textblock-parse-one\n  (textblock\n   :text \"<{a,b},{c d}>\"\n   :delim delimtest1)))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "<{a,b},{c d}>",
                ":startpos",
                1,
                ":endpos",
                13,
                ":delim",
                vx_data_textblock.c_delimtest1,
                ":parent",
                vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":delim",
                  vx_data_textblock.c_delimtest1
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"{a,b},{c d}>\"\n  :startpos 2\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest2)\n  :close\n   (copy delimclose\n    :starttext \">\")\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13\n    :delim\n     (copy delimbracketangle\n      :delimlist delimlisttest1)\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13)))\n (textblock-parse-one\n  (textblock\n   :text \"<{a,b},{c d}>\"\n   :startpos 1\n   :endpos 13\n   :delim delimtest1\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "{a,b},{c d}>",
                ":startpos",
                2,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest2
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  ">"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketangle,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest1
                  ),
                  ":parent",
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":delim",
                  vx_data_textblock.c_delimtest1,
                  ":parent",
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"a,b},{c d}>\"\n  :startpos 3\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest3)\n  :close\n   (copy delimclose\n    :starttext \"}\")\n  :parent\n   (textblock\n    :text \"{a,b},{c d}>\"\n    :startpos 2\n    :endpos 13\n    :delim\n     (copy delimbracketcurly\n      :delimlist delimlisttest2)\n    :close\n     (copy delimclose\n      :starttext \">\")\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13\n      :delim\n       (copy delimbracketangle\n        :delimlist delimlisttest1)\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13))))\n (textblock-parse-one\n  (textblock\n   :text \"{a,b},{c d}>\"\n   :startpos 2\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest2)\n   :close\n    (copy delimclose\n     :starttext \">\")\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :delimlist delimlisttest1)\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13)))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "a,b},{c d}>",
                ":startpos",
                3,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest3
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  "}"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{a,b},{c d}>",
                  ":startpos",
                  2,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketcurly,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{a,b},{c d}>",
                  ":startpos",
                  2,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"a\"\n  :startpos 3\n  :endpos 3\n  :parent\n   (textblock\n    :text \",\"\n    :startpos 4\n    :endpos 4\n    :delim\n     (copy delimcomma\n      :pos 0)\n    :parent\n     (textblock\n      :text \"b},{c d}>\"\n      :startpos 5\n      :endpos 13\n      :delim\n       (delim\n        :delimlist delimlisttest3)\n      :close\n       (copy delimclose\n        :starttext \"}\")\n      :parent\n       (textblock\n        :text \"{a,b},{c d}>\"\n        :startpos 2\n        :endpos 13\n        :delim\n         (copy delimbracketcurly\n          :delimlist delimlisttest2)\n        :close\n         (copy delimclose\n          :starttext \">\")\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13\n          :delim\n           (copy delimbracketangle\n            :delimlist delimlisttest1)\n          :parent\n           (textblock\n            :text \"<{a,b},{c d}>\"\n            :startpos 1\n            :endpos 13))))))\n (textblock-parse-one\n  (textblock\n   :text \"a,b},{c d}>\"\n   :startpos 3\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest3)\n   :close\n    (copy delimclose\n     :starttext \"}\")\n   :parent\n    (textblock\n     :text \"{a,b},{c d}>\"\n     :startpos 2\n     :endpos 13\n     :delim\n      (copy delimbracketcurly\n       :delimlist delimlisttest2)\n     :close\n      (copy delimclose\n       :starttext \">\")\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (copy delimbracketangle\n         :delimlist delimlisttest1)\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "a",
                ":startpos",
                3,
                ":endpos",
                3,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",",
                  ":startpos",
                  4,
                  ":endpos",
                  4,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimcomma,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "b},{c d}>",
                    ":startpos",
                    5,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest3
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      "}"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{a,b},{c d}>",
                      ":startpos",
                      2,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest2
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        ">"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest1
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "a,b},{c d}>",
                  ":startpos",
                  3,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{a,b},{c d}>",
                    ":startpos",
                    2,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \",\"\n  :startpos 4\n  :endpos 4\n  :delim\n   (copy delimcomma\n    :pos 0)\n  :parent\n   (textblock\n    :text \"b},{c d}>\"\n    :startpos 5\n    :endpos 13\n    :delim\n     (delim\n      :delimlist delimlisttest3)\n    :close\n     (copy delimclose\n      :starttext \"}\")\n    :parent\n     (textblock\n      :text \"{a,b},{c d}>\"\n      :startpos 2\n      :endpos 13\n      :delim\n       (copy delimbracketcurly\n        :delimlist delimlisttest2)\n      :close\n       (copy delimclose\n        :starttext \">\")\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :delimlist delimlisttest1)\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13))\n      :children\n       (textblocklist\n        (textblock\n         :text \"a\"\n         :startpos 3\n         :endpos 3)))))\n (textblock-parse-one\n  (textblock\n   :text \"a\"\n   :startpos 3\n   :endpos 3\n   :parent\n    (textblock\n     :text \",\"\n     :startpos 4\n     :endpos 4\n     :delim\n      (copy delimcomma\n       :pos 0)\n     :parent\n      (textblock\n       :text \"b},{c d}>\"\n       :startpos 5\n       :endpos 13\n       :delim\n        (delim\n         :delimlist delimlisttest3)\n       :close\n        (copy delimclose\n         :starttext \"}\")\n       :parent\n        (textblock\n         :text \"{a,b},{c d}>\"\n         :startpos 2\n         :endpos 13\n         :delim\n          (copy delimbracketcurly\n           :delimlist delimlisttest2)\n         :close\n          (copy delimclose\n           :starttext \">\")\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13\n           :delim\n            (copy delimbracketangle\n             :delimlist delimlisttest1)\n           :parent\n            (textblock\n             :text \"<{a,b},{c d}>\"\n             :startpos 1\n             :endpos 13))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                ",",
                ":startpos",
                4,
                ":endpos",
                4,
                ":delim",
                vx_core.f_copy(
                  vx_data_textblock.c_delimcomma,
                  ":pos",
                  0
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "b},{c d}>",
                  ":startpos",
                  5,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{a,b},{c d}>",
                    ":startpos",
                    2,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3)
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "a",
                  ":startpos",
                  3,
                  ":endpos",
                  3,
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    ",",
                    ":startpos",
                    4,
                    ":endpos",
                    4,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimcomma,
                      ":pos",
                      0
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "b},{c d}>",
                      ":startpos",
                      5,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_delim},
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest3
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        "}"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b},{c d}>",
                        ":startpos",
                        2,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest2
                        ),
                        ":close",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimclose,
                          ":starttext",
                          ">"
                        ),
                        ":parent",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "<{a,b},{c d}>",
                          ":startpos",
                          1,
                          ":endpos",
                          13,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketangle,
                            ":delimlist",
                            vx_data_textblock.c_delimlisttest1
                          ),
                          ":parent",
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"b},{c d}>\"\n  :startpos 5\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest3)\n  :close\n   (copy delimclose\n    :starttext \"}\")\n  :parent\n   (textblock\n    :text \"{a,b},{c d}>\"\n    :startpos 2\n    :endpos 13\n    :delim\n     (copy delimbracketcurly\n      :delimlist delimlisttest2)\n    :close\n     (copy delimclose\n      :starttext \">\")\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13\n      :delim\n       (copy delimbracketangle\n        :delimlist delimlisttest1)\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13))\n    :children\n     (textblocklist\n      (textblock\n       :text \"a\"\n       :startpos 3\n       :endpos 3)\n      (textblock\n       :text \",\"\n       :startpos 4\n       :endpos 4\n       :delim\n        (copy delimcomma\n         :pos 0)))))\n (textblock-parse-one\n  (textblock\n   :text \",\"\n   :startpos 4\n   :endpos 4\n   :delim\n    (copy delimcomma\n     :pos 0)\n   :parent\n    (textblock\n     :text \"b},{c d}>\"\n     :startpos 5\n     :endpos 13\n     :delim\n      (delim\n       :delimlist delimlisttest3)\n     :close\n      (copy delimclose\n       :starttext \"}\")\n     :parent\n      (textblock\n       :text \"{a,b},{c d}>\"\n       :startpos 2\n       :endpos 13\n       :delim\n        (copy delimbracketcurly\n         :delimlist delimlisttest2)\n       :close\n        (copy delimclose\n         :starttext \">\")\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13\n         :delim\n          (copy delimbracketangle\n           :delimlist delimlisttest1)\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13))\n       :children\n        (textblocklist\n         (textblock\n          :text \"a\"\n          :startpos 3\n          :endpos 3)))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "b},{c d}>",
                ":startpos",
                5,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest3
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  "}"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{a,b},{c d}>",
                  ":startpos",
                  2,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketcurly,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                  ),
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      ",",
                      ":startpos",
                      4,
                      ":endpos",
                      4,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimcomma,
                        ":pos",
                        0
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",",
                  ":startpos",
                  4,
                  ":endpos",
                  4,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimcomma,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "b},{c d}>",
                    ":startpos",
                    5,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest3
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      "}"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{a,b},{c d}>",
                      ":startpos",
                      2,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest2
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        ">"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest1
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3)
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"b\"\n  :startpos 5\n  :endpos 5\n  :parent\n   (textblock\n    :text \",{c d}>\"\n    :startpos 7\n    :endpos 13\n    :delim\n     (delim\n      :delimlist delimlisttest2)\n    :close\n     (copy delimclose\n      :starttext \">\")\n    :parent\n     (textblock\n      :text \"{a,b}\"\n      :startpos 2\n      :endpos 6\n      :delim\n       (copy delimbracketcurly\n        :pos 0)\n      :close delimclosing\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :delimlist delimlisttest1)\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13))\n      :children\n       (textblocklist\n        (textblock\n         :text \"a\"\n         :startpos 3\n         :endpos 3)\n        (textblock\n         :text \",\"\n         :startpos 4\n         :endpos 4\n         :delim\n          (copy delimcomma\n           :pos 0))))))\n (textblock-parse-one\n  (textblock\n   :text \"b},{c d}>\"\n   :startpos 5\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest3)\n   :close\n    (copy delimclose\n     :starttext \"}\")\n   :parent\n    (textblock\n     :text \"{a,b},{c d}>\"\n     :startpos 2\n     :endpos 13\n     :delim\n      (copy delimbracketcurly\n       :delimlist delimlisttest2)\n     :close\n      (copy delimclose\n       :starttext \">\")\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (copy delimbracketangle\n         :delimlist delimlisttest1)\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13))\n     :children\n      (textblocklist\n       (textblock\n        :text \"a\"\n        :startpos 3\n        :endpos 3)\n       (textblock\n        :text \",\"\n        :startpos 4\n        :endpos 4\n        :delim\n         (copy delimcomma\n          :pos 0)))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "b",
                ":startpos",
                5,
                ":endpos",
                5,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",{c d}>",
                  ":startpos",
                  7,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{a,b}",
                    ":startpos",
                    2,
                    ":endpos",
                    6,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":pos",
                      0
                    ),
                    ":close",
                    vx_data_textblock.c_delimclosing,
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        4,
                        ":endpos",
                        4,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "b},{c d}>",
                  ":startpos",
                  5,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{a,b},{c d}>",
                    ":startpos",
                    2,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        4,
                        ":endpos",
                        4,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \",{c d}>\"\n  :startpos 7\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest2)\n  :close\n   (copy delimclose\n    :starttext \">\")\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13\n    :delim\n     (copy delimbracketangle\n      :delimlist delimlisttest1)\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13)\n    :children\n     (textblocklist\n      (textblock\n       :text \"{a,b}\"\n       :startpos 2\n       :endpos 6\n       :delim\n        (copy delimbracketcurly\n         :pos 0)\n       :children\n        (textblocklist\n         (textblock\n          :text \"a\"\n          :startpos 3\n          :endpos 3)\n         (textblock\n          :text \",\"\n          :startpos 4\n          :endpos 4\n          :delim\n           (copy delimcomma\n            :pos 0))\n         (textblock\n          :text \"b\"\n          :startpos 5\n          :endpos 5))))))\n (textblock-parse-one\n  (textblock\n   :text \"b\"\n   :startpos 5\n   :endpos 5\n   :parent\n    (textblock\n     :text \",{c d}>\"\n     :startpos 7\n     :endpos 13\n     :delim\n      (delim\n       :delimlist delimlisttest2)\n     :close\n      (copy delimclose\n       :starttext \">\")\n     :parent\n      (textblock\n       :text \"{a,b}\"\n       :startpos 2\n       :endpos 6\n       :delim\n        (copy delimbracketcurly\n         :pos 0)\n       :close delimclosing\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13\n         :delim\n          (copy delimbracketangle\n           :delimlist delimlisttest1)\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13))\n       :children\n        (textblocklist\n         (textblock\n          :text \"a\"\n          :startpos 3\n          :endpos 3)\n         (textblock\n          :text \",\"\n          :startpos 4\n          :endpos 4\n          :delim\n           (copy delimcomma\n            :pos 0))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                ",{c d}>",
                ":startpos",
                7,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest2
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  ">"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketangle,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest1
                  ),
                  ":parent",
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{a,b}",
                      ":startpos",
                      2,
                      ":endpos",
                      6,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":pos",
                        0
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          4,
                          ":endpos",
                          4,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "b",
                  ":startpos",
                  5,
                  ":endpos",
                  5,
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    ",{c d}>",
                    ":startpos",
                    7,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{a,b}",
                      ":startpos",
                      2,
                      ":endpos",
                      6,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":pos",
                        0
                      ),
                      ":close",
                      vx_data_textblock.c_delimclosing,
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest1
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          4,
                          ":endpos",
                          4,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :startpos 7\n  :endpos 7\n  :parent\n   (textblock\n    :text \",\"\n    :startpos 7\n    :endpos 7\n    :delim\n     (copy delimcomma\n      :pos 0)\n    :parent\n     (textblock\n      :text \"{c d}>\"\n      :startpos 8\n      :endpos 13\n      :delim\n       (delim\n        :delimlist delimlisttest2)\n      :close\n       (copy delimclose\n        :starttext \">\")\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :delimlist delimlisttest1)\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13)\n        :children\n         (textblocklist\n          (textblock\n           :text \"{a,b}\"\n           :startpos 2\n           :endpos 6\n           :delim\n            (copy delimbracketcurly\n             :pos 0)\n           :children\n            (textblocklist\n             (textblock\n              :text \"a\"\n              :startpos 3\n              :endpos 3)\n             (textblock\n              :text \",\"\n              :startpos 4\n              :endpos 4\n              :delim\n               (copy delimcomma\n                :pos 0))\n             (textblock\n              :text \"b\"\n              :startpos 5\n              :endpos 5))))))))\n (textblock-parse-one\n  (textblock\n   :text \",{c d}>\"\n   :startpos 7\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest2)\n   :close\n    (copy delimclose\n     :starttext \">\")\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :delimlist delimlisttest1)\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13)\n     :children\n      (textblocklist\n       (textblock\n        :text \"{a,b}\"\n        :startpos 2\n        :endpos 6\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"a\"\n           :startpos 3\n           :endpos 3)\n          (textblock\n           :text \",\"\n           :startpos 4\n           :endpos 4\n           :delim\n            (copy delimcomma\n             :pos 0))\n          (textblock\n           :text \"b\"\n           :startpos 5\n           :endpos 5))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":startpos",
                7,
                ":endpos",
                7,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",",
                  ":startpos",
                  7,
                  ":endpos",
                  7,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimcomma,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{c d}>",
                    ":startpos",
                    8,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",{c d}>",
                  ":startpos",
                  7,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \",\"\n  :startpos 7\n  :endpos 7\n  :delim\n   (copy delimcomma\n    :pos 0)\n  :parent\n   (textblock\n    :text \"{c d}>\"\n    :startpos 8\n    :endpos 13\n    :delim\n     (delim\n      :delimlist delimlisttest2)\n    :close\n     (copy delimclose\n      :starttext \">\")\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13\n      :delim\n       (copy delimbracketangle\n        :delimlist delimlisttest1)\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13)\n      :children\n       (textblocklist\n        (textblock\n         :text \"{a,b}\"\n         :startpos 2\n         :endpos 6\n         :delim\n          (copy delimbracketcurly\n           :pos 0)\n         :children\n          (textblocklist\n           (textblock\n            :text \"a\"\n            :startpos 3\n            :endpos 3)\n           (textblock\n            :text \",\"\n            :startpos 4\n            :endpos 4\n            :delim\n             (copy delimcomma\n              :pos 0))\n           (textblock\n            :text \"b\"\n            :startpos 5\n            :endpos 5)))))))\n (textblock-parse-one\n  (textblock\n   :startpos 7\n   :endpos 7\n   :parent\n    (textblock\n     :text \",\"\n     :startpos 7\n     :endpos 7\n     :delim\n      (copy delimcomma\n       :pos 0)\n     :parent\n      (textblock\n       :text \"{c d}>\"\n       :startpos 8\n       :endpos 13\n       :delim\n        (delim\n         :delimlist delimlisttest2)\n       :close\n        (copy delimclose\n         :starttext \">\")\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13\n         :delim\n          (copy delimbracketangle\n           :delimlist delimlisttest1)\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13)\n         :children\n          (textblocklist\n           (textblock\n            :text \"{a,b}\"\n            :startpos 2\n            :endpos 6\n            :delim\n             (copy delimbracketcurly\n              :pos 0)\n            :children\n             (textblocklist\n              (textblock\n               :text \"a\"\n               :startpos 3\n               :endpos 3)\n              (textblock\n               :text \",\"\n               :startpos 4\n               :endpos 4\n               :delim\n                (copy delimcomma\n                 :pos 0))\n              (textblock\n               :text \"b\"\n               :startpos 5\n               :endpos 5))))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                ",",
                ":startpos",
                7,
                ":endpos",
                7,
                ":delim",
                vx_core.f_copy(
                  vx_data_textblock.c_delimcomma,
                  ":pos",
                  0
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{c d}>",
                  ":startpos",
                  8,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":startpos",
                  7,
                  ":endpos",
                  7,
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    ",",
                    ":startpos",
                    7,
                    ":endpos",
                    7,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimcomma,
                      ":pos",
                      0
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{c d}>",
                      ":startpos",
                      8,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_delim},
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest2
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        ">"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest1
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            "{a,b}",
                            ":startpos",
                            2,
                            ":endpos",
                            6,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimbracketcurly,
                              ":pos",
                              0
                            ),
                            ":children",
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblocklist},
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                              vx_core.f_new(
                                {"any-1": vx_data_textblock.t_textblock},
                                ":text",
                                ",",
                                ":startpos",
                                4,
                                ":endpos",
                                4,
                                ":delim",
                                vx_core.f_copy(
                                  vx_data_textblock.c_delimcomma,
                                  ":pos",
                                  0
                                )
                              ),
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"{c d}>\"\n  :startpos 8\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest2)\n  :close\n   (copy delimclose\n    :starttext \">\")\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13\n    :delim\n     (copy delimbracketangle\n      :delimlist delimlisttest1)\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13)\n    :children\n     (textblocklist\n      (textblock\n       :text \"{a,b}\"\n       :startpos 2\n       :endpos 6\n       :delim\n        (copy delimbracketcurly\n         :pos 0)\n       :children\n        (textblocklist\n         (textblock\n          :text \"a\"\n          :startpos 3\n          :endpos 3)\n         (textblock\n          :text \",\"\n          :startpos 4\n          :endpos 4\n          :delim\n           (copy delimcomma\n            :pos 0))\n         (textblock\n          :text \"b\"\n          :startpos 5\n          :endpos 5)))\n      (textblock\n       :text \",\"\n       :startpos 7\n       :endpos 7\n       :delim\n        (copy delimcomma\n         :pos 0)))))\n (textblock-parse-one\n  (textblock\n   :text \",\"\n   :startpos 7\n   :endpos 7\n   :delim\n    (copy delimcomma\n     :pos 0)\n   :parent\n    (textblock\n     :text \"{c d}>\"\n     :startpos 8\n     :endpos 13\n     :delim\n      (delim\n       :delimlist delimlisttest2)\n       :close\n        (copy delimclose\n         :starttext \">\")\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (copy delimbracketangle\n         :delimlist delimlisttest1)\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13)\n       :children\n        (textblocklist\n         (textblock\n          :text \"{a,b}\"\n          :startpos 2\n          :endpos 6\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"a\"\n             :startpos 3\n             :endpos 3)\n            (textblock\n             :text \",\"\n             :startpos 4\n             :endpos 4\n             :delim\n              (copy delimcomma\n               :pos 0))\n            (textblock\n             :text \"b\"\n             :startpos 5\n             :endpos 5)))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "{c d}>",
                ":startpos",
                8,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest2
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  ">"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketangle,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest1
                  ),
                  ":parent",
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{a,b}",
                      ":startpos",
                      2,
                      ":endpos",
                      6,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":pos",
                        0
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          4,
                          ":endpos",
                          4,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                      )
                    ),
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      ",",
                      ":startpos",
                      7,
                      ":endpos",
                      7,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimcomma,
                        ":pos",
                        0
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",",
                  ":startpos",
                  7,
                  ":endpos",
                  7,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimcomma,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{c d}>",
                    ":startpos",
                    8,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"c d}>\"\n  :startpos 9\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest3)\n  :close\n   (copy delimclose\n    :starttext \"}\")\n    :parent\n     (textblock\n      :text \"{c d}>\"\n      :startpos 8\n      :endpos 13\n      :delim\n       (copy delimbracketcurly\n        :delimlist delimlisttest2)\n      :close\n       (copy delimclose\n        :starttext \">\")\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :delimlist delimlisttest1)\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13)\n        :children\n         (textblocklist\n          (textblock\n           :text \"{a,b}\"\n           :startpos 2\n           :endpos 6\n           :delim\n            (copy delimbracketcurly\n             :pos 0)\n           :children\n            (textblocklist\n             (textblock\n              :text \"a\"\n              :startpos 3\n              :endpos 3)\n             (textblock\n              :text \",\"\n              :startpos 4\n              :endpos 4\n              :delim\n               (copy delimcomma\n                :pos 0))\n             (textblock\n              :text \"b\"\n              :startpos 5\n              :endpos 5)))\n          (textblock\n           :text \",\"\n           :startpos 7\n           :endpos 7\n           :delim\n            (copy delimcomma\n             :pos 0))))))\n (textblock-parse-one\n  (textblock\n   :text \"{c d}>\"\n   :startpos 8\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest2)\n   :close\n    (copy delimclose\n     :starttext \">\")\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :delimlist delimlisttest1)\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13)\n     :children\n      (textblocklist\n       (textblock\n        :text \"{a,b}\"\n        :startpos 2\n        :endpos 6\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"a\"\n           :startpos 3\n           :endpos 3)\n          (textblock\n           :text \",\"\n           :startpos 4\n           :endpos 4\n           :delim\n            (copy delimcomma\n             :pos 0))\n          (textblock\n           :text \"b\"\n           :startpos 5\n           :endpos 5)))\n       (textblock\n        :text \",\"\n        :startpos 7\n        :endpos 7\n        :delim\n         (copy delimcomma\n          :pos 0)))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "c d}>",
                ":startpos",
                9,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest3
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  "}"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{c d}>",
                  ":startpos",
                  8,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketcurly,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{c d}>",
                  ":startpos",
                  8,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"c\"\n  :startpos 9\n  :endpos 9\n  :parent\n   (textblock\n    :text \" \"\n    :startpos 10\n    :endpos 10\n    :delim\n     (copy delimwhitespace\n      :pos 0)\n    :parent\n     (textblock\n      :text \"d}>\"\n      :startpos 11\n      :endpos 13\n      :delim\n       (delim\n        :delimlist delimlisttest3)\n      :close\n       (copy delimclose\n        :starttext \"}\")\n      :parent\n       (textblock\n        :text \"{c d}>\"\n        :startpos 8\n        :endpos 13\n        :delim\n         (copy delimbracketcurly\n          :delimlist delimlisttest2)\n        :close\n         (copy delimclose\n          :starttext \">\")\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13\n          :delim\n           (copy delimbracketangle\n            :delimlist delimlisttest1)\n          :parent\n           (textblock\n            :text \"<{a,b},{c d}>\"\n            :startpos 1\n            :endpos 13)\n          :children\n           (textblocklist\n            (textblock\n             :text \"{a,b}\"\n             :startpos 2\n             :endpos 6\n             :delim\n              (copy delimbracketcurly\n               :pos 0)\n             :children\n              (textblocklist\n               (textblock\n                :text \"a\"\n                :startpos 3\n                :endpos 3)\n               (textblock\n                :text \",\"\n                :startpos 4\n                :endpos 4\n                :delim\n                 (copy delimcomma\n                  :pos 0))\n               (textblock\n                :text \"b\"\n                :startpos 5\n                :endpos 5)))\n            (textblock\n             :text \",\"\n             :startpos 7\n             :endpos 7\n             :delim\n              (copy delimcomma\n               :pos 0))))))))\n (textblock-parse-one\n  (textblock\n   :text \"c d}>\"\n   :startpos 9\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest3)\n     :close\n      (copy delimclose\n       :starttext \"}\")\n     :parent\n      (textblock\n       :text \"{c d}>\"\n       :startpos 8\n       :endpos 13\n       :delim\n        (copy delimbracketcurly\n         :delimlist delimlisttest2)\n       :close\n        (copy delimclose\n         :starttext \">\")\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13\n         :delim\n          (copy delimbracketangle\n           :delimlist delimlisttest1)\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13)\n         :children\n          (textblocklist\n           (textblock\n            :text \"{a,b}\"\n            :startpos 2\n            :endpos 6\n            :delim\n             (copy delimbracketcurly\n              :pos 0)\n            :children\n             (textblocklist\n              (textblock\n               :text \"a\"\n               :startpos 3\n               :endpos 3)\n              (textblock\n               :text \",\"\n               :startpos 4\n               :endpos 4\n               :delim\n                (copy delimcomma\n                 :pos 0))\n              (textblock\n               :text \"b\"\n               :startpos 5\n               :endpos 5)))\n           (textblock\n            :text \",\"\n            :startpos 7\n            :endpos 7\n            :delim\n             (copy delimcomma\n              :pos 0))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "c",
                ":startpos",
                9,
                ":endpos",
                9,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  " ",
                  ":startpos",
                  10,
                  ":endpos",
                  10,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimwhitespace,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "d}>",
                    ":startpos",
                    11,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest3
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      "}"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{c d}>",
                      ":startpos",
                      8,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest2
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        ">"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest1
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            "{a,b}",
                            ":startpos",
                            2,
                            ":endpos",
                            6,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimbracketcurly,
                              ":pos",
                              0
                            ),
                            ":children",
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblocklist},
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                              vx_core.f_new(
                                {"any-1": vx_data_textblock.t_textblock},
                                ":text",
                                ",",
                                ":startpos",
                                4,
                                ":endpos",
                                4,
                                ":delim",
                                vx_core.f_copy(
                                  vx_data_textblock.c_delimcomma,
                                  ":pos",
                                  0
                                )
                              ),
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                            )
                          ),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            7,
                            ":endpos",
                            7,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          )
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "c d}>",
                  ":startpos",
                  9,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{c d}>",
                    ":startpos",
                    8,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \" \"\n  :startpos 10\n  :endpos 10\n  :delim\n   (copy delimwhitespace\n    :pos 0)\n  :parent\n   (textblock\n    :text \"d}>\"\n    :startpos 11\n    :endpos 13\n    :delim\n     (delim\n      :delimlist delimlisttest3)\n    :close\n     (copy delimclose\n      :starttext \"}\")\n    :parent\n     (textblock\n      :text \"{c d}>\"\n      :startpos 8\n      :endpos 13\n      :delim\n       (copy delimbracketcurly\n       :delimlist delimlisttest2)\n      :close\n       (copy delimclose\n        :starttext \">\")\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :delimlist delimlisttest1)\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13)\n          :children\n           (textblocklist\n            (textblock\n             :text \"{a,b}\"\n             :startpos 2\n             :endpos 6\n             :delim\n              (copy delimbracketcurly\n               :pos 0)\n             :children\n              (textblocklist\n               (textblock\n                :text \"a\"\n                :startpos 3\n                :endpos 3)\n               (textblock\n                :text \",\"\n                :startpos 4\n                :endpos 4\n                :delim\n                 (copy delimcomma\n                  :pos 0))\n               (textblock\n                :text \"b\"\n                :startpos 5\n                :endpos 5)))\n               (textblock\n                :text \",\"\n                :startpos 7\n                :endpos 7\n                :delim\n                 (copy delimcomma\n                  :pos 0))))\n      :children\n       (textblocklist\n        (textblock\n         :text \"c\"\n         :startpos 9\n         :endpos 9)))))\n (textblock-parse-one\n  (textblock\n   :text \"c\"\n   :startpos 9\n   :endpos 9\n   :parent\n    (textblock\n     :text \" \"\n     :startpos 10\n     :endpos 10\n     :delim\n      (copy delimwhitespace\n       :pos 0)\n     :parent\n      (textblock\n       :text \"d}>\"\n       :startpos 11\n       :endpos 13\n       :delim\n        (delim\n         :delimlist delimlisttest3)\n       :close\n        (copy delimclose\n         :starttext \"}\")\n       :parent\n        (textblock\n         :text \"{c d}>\"\n         :startpos 8\n         :endpos 13\n         :delim\n          (copy delimbracketcurly\n           :delimlist delimlisttest2)\n         :close\n          (copy delimclose\n           :starttext \">\")\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13\n           :delim\n            (copy delimbracketangle\n             :delimlist delimlisttest1)\n           :parent\n            (textblock\n             :text \"<{a,b},{c d}>\"\n             :startpos 1\n             :endpos 13)\n           :children\n            (textblocklist\n             (textblock\n              :text \"{a,b}\"\n              :startpos 2\n              :endpos 6\n              :delim\n               (copy delimbracketcurly\n                :pos 0)\n              :children\n               (textblocklist\n                (textblock\n                 :text \"a\"\n                 :startpos 3\n                 :endpos 3)\n                (textblock\n                 :text \",\"\n                 :startpos 4\n                 :endpos 4\n                 :delim\n                  (copy delimcomma\n                   :pos 0))\n                (textblock\n                 :text \"b\"\n                 :startpos 5\n                 :endpos 5)))\n             (textblock\n              :text \",\"\n              :startpos 7\n              :endpos 7\n              :delim\n               (copy delimcomma\n                :pos 0))))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                " ",
                ":startpos",
                10,
                ":endpos",
                10,
                ":delim",
                vx_core.f_copy(
                  vx_data_textblock.c_delimwhitespace,
                  ":pos",
                  0
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "d}>",
                  ":startpos",
                  11,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{c d}>",
                    ":startpos",
                    8,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        )
                      )
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9)
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "c",
                  ":startpos",
                  9,
                  ":endpos",
                  9,
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    " ",
                    ":startpos",
                    10,
                    ":endpos",
                    10,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimwhitespace,
                      ":pos",
                      0
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "d}>",
                      ":startpos",
                      11,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_delim},
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest3
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        "}"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{c d}>",
                        ":startpos",
                        8,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest2
                        ),
                        ":close",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimclose,
                          ":starttext",
                          ">"
                        ),
                        ":parent",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "<{a,b},{c d}>",
                          ":startpos",
                          1,
                          ":endpos",
                          13,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketangle,
                            ":delimlist",
                            vx_data_textblock.c_delimlisttest1
                          ),
                          ":parent",
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              "{a,b}",
                              ":startpos",
                              2,
                              ":endpos",
                              6,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimbracketcurly,
                                ":pos",
                                0
                              ),
                              ":children",
                              vx_core.f_new(
                                {"any-1": vx_data_textblock.t_textblocklist},
                                vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                                vx_core.f_new(
                                  {"any-1": vx_data_textblock.t_textblock},
                                  ":text",
                                  ",",
                                  ":startpos",
                                  4,
                                  ":endpos",
                                  4,
                                  ":delim",
                                  vx_core.f_copy(
                                    vx_data_textblock.c_delimcomma,
                                    ":pos",
                                    0
                                  )
                                ),
                                vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                              )
                            ),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              7,
                              ":endpos",
                              7,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
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
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"d}>\"\n  :startpos 11\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest3)\n  :close\n   (copy delimclose\n    :starttext \"}\")\n  :parent\n   (textblock\n    :text \"{c d}>\"\n    :startpos 8\n    :endpos 13\n    :delim\n     (copy delimbracketcurly\n      :delimlist delimlisttest2)\n    :close\n     (copy delimclose\n      :starttext \">\")\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13\n      :delim\n       (delim\n        :name \"delimbracketangle\"\n        :starttext \"<\"\n        :endtext \">\"\n        :delimlist delimlisttest1)\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13)\n      :children\n       (textblocklist\n        (textblock\n         :text \"{a,b}\"\n         :startpos 2\n         :endpos 6\n         :delim\n          (copy delimbracketcurly\n           :pos 0)\n         :children\n          (textblocklist\n           (textblock\n            :text \"a\"\n            :startpos 3\n            :endpos 3)\n             (textblock\n              :text \",\"\n              :startpos 4\n              :endpos 4\n              :delim\n               (copy delimcomma\n                :pos 0))\n           (textblock\n            :text \"b\"\n            :startpos 5\n            :endpos 5)))\n        (textblock\n         :text \",\"\n         :startpos 7\n         :endpos 7\n         :delim\n          (copy delimcomma\n           :pos 0))))\n    :children\n     (textblocklist\n      (textblock\n       :text \"c\"\n       :startpos 9\n       :endpos 9)\n      (textblock\n       :text \" \"\n       :startpos 10\n       :endpos 10\n       :delim\n        (copy delimwhitespace\n         :pos 0)))))\n (textblock-parse-one\n  (textblock\n   :text \" \"\n   :startpos 10\n   :endpos 10\n   :delim\n    (copy delimwhitespace\n     :pos 0)\n   :parent\n    (textblock\n     :text \"d}>\"\n     :startpos 11\n     :endpos 13\n     :delim\n      (delim\n       :delimlist delimlisttest3)\n     :close\n      (copy delimclose\n       :starttext \"}\")\n     :parent\n      (textblock\n       :text \"{c d}>\"\n       :startpos 8\n       :endpos 13\n       :delim\n        (copy delimbracketcurly\n        :delimlist delimlisttest2)\n       :close\n        (copy delimclose\n         :starttext \">\")\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13\n         :delim\n          (copy delimbracketangle\n           :delimlist delimlisttest1)\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13)\n         :children\n          (textblocklist\n           (textblock\n            :text \"{a,b}\"\n            :startpos 2\n            :endpos 6\n            :delim\n             (copy delimbracketcurly\n              :pos 0)\n            :children\n             (textblocklist\n              (textblock\n               :text \"a\"\n               :startpos 3\n               :endpos 3)\n              (textblock\n               :text \",\"\n               :startpos 4\n               :endpos 4\n               :delim\n                (copy delimcomma\n                 :pos 0))\n              (textblock\n               :text \"b\"\n               :startpos 5\n               :endpos 5)))\n              (textblock\n               :text \",\"\n               :startpos 7\n               :endpos 7\n               :delim\n                (copy delimcomma\n                 :pos 0))))\n       :children\n        (textblocklist\n         (textblock\n          :text \"c\"\n          :startpos 9\n          :endpos 9)))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "d}>",
                ":startpos",
                11,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest3
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  "}"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{c d}>",
                  ":startpos",
                  8,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketcurly,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":name",
                      "delimbracketangle",
                      ":starttext",
                      "<",
                      ":endtext",
                      ">",
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      )
                    )
                  ),
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      " ",
                      ":startpos",
                      10,
                      ":endpos",
                      10,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimwhitespace,
                        ":pos",
                        0
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  " ",
                  ":startpos",
                  10,
                  ":endpos",
                  10,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimwhitespace,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "d}>",
                    ":startpos",
                    11,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest3
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      "}"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{c d}>",
                      ":startpos",
                      8,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest2
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        ">"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest1
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            "{a,b}",
                            ":startpos",
                            2,
                            ":endpos",
                            6,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimbracketcurly,
                              ":pos",
                              0
                            ),
                            ":children",
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblocklist},
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                              vx_core.f_new(
                                {"any-1": vx_data_textblock.t_textblock},
                                ":text",
                                ",",
                                ":startpos",
                                4,
                                ":endpos",
                                4,
                                ":delim",
                                vx_core.f_copy(
                                  vx_data_textblock.c_delimcomma,
                                  ":pos",
                                  0
                                )
                              ),
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                            )
                          ),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            7,
                            ":endpos",
                            7,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          )
                        )
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9)
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"d\"\n  :startpos 11\n  :endpos 11\n  :parent\n   (textblock\n    :text \">\"\n    :startpos 13\n    :endpos 13\n    :delim\n     (delim\n      :delimlist delimlisttest2)\n    :close\n     (copy delimclose\n      :starttext \">\")\n    :parent\n     (textblock\n      :text \"{c d}\"\n      :startpos 8\n      :endpos 12\n      :delim\n       (copy delimbracketcurly\n        :pos 0)\n      :close delimclosing\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :delimlist delimlisttest1)\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13)\n        :children\n         (textblocklist\n          (textblock\n           :text \"{a,b}\"\n           :startpos 2\n           :endpos 6\n           :delim\n            (copy delimbracketcurly\n             :pos 0)\n           :children\n            (textblocklist\n             (textblock\n              :text \"a\"\n              :startpos 3\n              :endpos 3)\n             (textblock\n              :text \",\"\n              :startpos 4\n              :endpos 4\n              :delim\n               (copy delimcomma\n                :pos 0))\n             (textblock\n              :text \"b\"\n              :startpos 5\n              :endpos 5)))\n          (textblock\n           :text \",\"\n           :startpos 7\n           :endpos 7\n           :delim\n            (copy delimcomma\n             :pos 0))))\n           :children\n            (textblocklist\n             (textblock\n              :text \"c\"\n              :startpos 9\n              :endpos 9)\n             (textblock\n              :text \" \"\n              :startpos 10\n              :endpos 10\n              :delim\n               (copy delimwhitespace\n                :pos 0))))))\n (textblock-parse-one\n  (textblock\n   :text \"d}>\"\n   :startpos 11\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest3)\n   :close\n    (copy delimclose\n     :starttext \"}\")\n   :parent\n    (textblock\n     :text \"{c d}>\"\n     :startpos 8\n     :endpos 13\n     :delim\n      (copy delimbracketcurly\n       :delimlist delimlisttest2)\n     :close\n      (copy delimclose\n       :starttext \">\")\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (delim\n         :name \"delimbracketangle\"\n         :starttext \"<\"\n         :endtext \">\"\n         :delimlist delimlisttest1)\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13)\n       :children\n        (textblocklist\n         (textblock\n          :text \"{a,b}\"\n          :startpos 2\n          :endpos 6\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"a\"\n             :startpos 3\n             :endpos 3)\n              (textblock\n               :text \",\"\n               :startpos 4\n               :endpos 4\n               :delim\n                (copy delimcomma\n                 :pos 0))\n            (textblock\n             :text \"b\"\n             :startpos 5\n             :endpos 5)))\n         (textblock\n          :text \",\"\n          :startpos 7\n          :endpos 7\n          :delim\n           (copy delimcomma\n            :pos 0))))\n     :children\n      (textblocklist\n       (textblock\n        :text \"c\"\n        :startpos 9\n        :endpos 9)\n       (textblock\n        :text \" \"\n        :startpos 10\n        :endpos 10\n        :delim\n         (copy delimwhitespace\n          :pos 0)))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "d",
                ":startpos",
                11,
                ":endpos",
                11,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ">",
                  ":startpos",
                  13,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{c d}",
                    ":startpos",
                    8,
                    ":endpos",
                    12,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":pos",
                      0
                    ),
                    ":close",
                    vx_data_textblock.c_delimclosing,
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        )
                      )
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        " ",
                        ":startpos",
                        10,
                        ":endpos",
                        10,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimwhitespace,
                          ":pos",
                          0
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "d}>",
                  ":startpos",
                  11,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{c d}>",
                    ":startpos",
                    8,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_delim},
                        ":name",
                        "delimbracketangle",
                        ":starttext",
                        "<",
                        ":endtext",
                        ">",
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        )
                      )
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        " ",
                        ":startpos",
                        10,
                        ":endpos",
                        10,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimwhitespace,
                          ":pos",
                          0
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \">\"\n  :startpos 13\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest2)\n  :close\n   (copy delimclose\n    :starttext \">\")\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13\n    :delim\n     (copy delimbracketangle\n      :delimlist delimlisttest1)\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13)\n    :children\n     (textblocklist\n      (textblock\n       :text \"{a,b}\"\n       :startpos 2\n       :endpos 6\n       :delim\n        (copy delimbracketcurly\n         :pos 0)\n       :children\n        (textblocklist\n         (textblock\n          :text \"a\"\n          :startpos 3\n          :endpos 3)\n         (textblock\n          :text \",\"\n          :startpos 4\n          :endpos 4\n          :delim\n           (copy delimcomma\n            :pos 0))\n         (textblock\n          :text \"b\"\n          :startpos 5\n          :endpos 5)))\n      (textblock\n       :text \",\"\n       :startpos 7\n       :endpos 7\n       :delim\n        (copy delimcomma\n         :pos 0))\n      (textblock\n       :text \"{c d}\"\n       :startpos 8\n       :endpos 12\n       :delim\n        (copy delimbracketcurly\n         :pos 0)\n       :children\n        (textblocklist\n         (textblock\n          :text \"c\"\n          :startpos 9\n          :endpos 9)\n         (textblock\n          :text \" \"\n          :startpos 10\n          :endpos 10\n          :delim\n           (copy delimwhitespace\n            :pos 0))\n         (textblock\n          :text \"d\"\n          :startpos 11\n          :endpos 11))))))\n (textblock-parse-one\n  (textblock\n   :text \"d\"\n   :startpos 11\n   :endpos 11\n   :parent\n    (textblock\n     :text \">\"\n     :startpos 13\n     :endpos 13\n     :delim\n      (delim\n       :delimlist delimlisttest2)\n     :close\n      (copy delimclose\n       :starttext \">\")\n     :parent\n      (textblock\n       :text \"{c d}\"\n       :startpos 8\n       :endpos 12\n       :delim\n        (copy delimbracketcurly\n         :pos 0)\n       :close delimclosing\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13\n         :delim\n          (copy delimbracketangle\n           :delimlist delimlisttest1)\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13)\n         :children\n          (textblocklist\n           (textblock\n            :text \"{a,b}\"\n            :startpos 2\n            :endpos 6\n            :delim\n             (copy delimbracketcurly\n              :pos 0)\n            :children\n             (textblocklist\n              (textblock\n               :text \"a\"\n               :startpos 3\n               :endpos 3)\n              (textblock\n               :text \",\"\n               :startpos 4\n               :endpos 4\n               :delim\n                (copy delimcomma\n                 :pos 0))\n              (textblock\n               :text \"b\"\n               :startpos 5\n               :endpos 5)))\n           (textblock\n            :text \",\"\n            :startpos 7\n            :endpos 7\n            :delim\n             (copy delimcomma\n              :pos 0))))\n            :children\n             (textblocklist\n              (textblock\n               :text \"c\"\n               :startpos 9\n               :endpos 9)\n              (textblock\n               :text \" \"\n               :startpos 10\n               :endpos 10\n               :delim\n                (copy delimwhitespace\n                 :pos 0))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                ">",
                ":startpos",
                13,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest2
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  ">"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketangle,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest1
                  ),
                  ":parent",
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{a,b}",
                      ":startpos",
                      2,
                      ":endpos",
                      6,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":pos",
                        0
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          4,
                          ":endpos",
                          4,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                      )
                    ),
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      ",",
                      ":startpos",
                      7,
                      ":endpos",
                      7,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimcomma,
                        ":pos",
                        0
                      )
                    ),
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{c d}",
                      ":startpos",
                      8,
                      ":endpos",
                      12,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":pos",
                        0
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          " ",
                          ":startpos",
                          10,
                          ":endpos",
                          10,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimwhitespace,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "d",
                  ":startpos",
                  11,
                  ":endpos",
                  11,
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    ">",
                    ":startpos",
                    13,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{c d}",
                      ":startpos",
                      8,
                      ":endpos",
                      12,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":pos",
                        0
                      ),
                      ":close",
                      vx_data_textblock.c_delimclosing,
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest1
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            "{a,b}",
                            ":startpos",
                            2,
                            ":endpos",
                            6,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimbracketcurly,
                              ":pos",
                              0
                            ),
                            ":children",
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblocklist},
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                              vx_core.f_new(
                                {"any-1": vx_data_textblock.t_textblock},
                                ":text",
                                ",",
                                ":startpos",
                                4,
                                ":endpos",
                                4,
                                ":delim",
                                vx_core.f_copy(
                                  vx_data_textblock.c_delimcomma,
                                  ":pos",
                                  0
                                )
                              ),
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                            )
                          ),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            7,
                            ":endpos",
                            7,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          )
                        )
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          " ",
                          ":startpos",
                          10,
                          ":endpos",
                          10,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimwhitespace,
                            ":pos",
                            0
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :startpos 13\n  :endpos 13\n  :parent\n   (textblock\n    :startpos 14\n    :endpos 14\n    :delim\n     (delim\n      :delimlist delimlisttest1)\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13\n      :delim\n       (copy delimbracketangle\n        :pos 0)\n      :close delimclosing\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13)\n      :children\n       (textblocklist\n        (textblock\n         :text \"{a,b}\"\n         :startpos 2\n         :endpos 6\n         :delim\n          (copy delimbracketcurly\n           :pos 0)\n         :children\n          (textblocklist\n           (textblock\n            :text \"a\"\n            :startpos 3\n            :endpos 3)\n           (textblock\n            :text \",\"\n            :startpos 4\n            :endpos 4\n            :delim\n             (copy delimcomma\n              :pos 0))\n           (textblock\n            :text \"b\"\n            :startpos 5\n            :endpos 5)))\n        (textblock\n         :text \",\"\n         :startpos 7\n         :endpos 7\n         :delim\n          (copy delimcomma\n           :pos 0))\n        (textblock\n         :text \"{c d}\"\n         :startpos 8\n         :endpos 12\n         :delim\n          (copy delimbracketcurly\n           :pos 0)\n         :children\n          (textblocklist\n           (textblock\n            :text \"c\"\n            :startpos 9\n            :endpos 9)\n          (textblock\n           :text \" \"\n           :startpos 10\n           :endpos 10\n           :delim\n            (copy delimwhitespace\n             :pos 0))\n          (textblock\n           :text \"d\"\n           :startpos 11\n           :endpos 11)))))))\n (textblock-parse-one\n  (textblock\n   :text \">\"\n   :startpos 13\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest2)\n   :close\n    (copy delimclose\n     :starttext \">\")\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :delimlist delimlisttest1)\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13)\n     :children\n      (textblocklist\n       (textblock\n        :text \"{a,b}\"\n        :startpos 2\n        :endpos 6\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"a\"\n           :startpos 3\n           :endpos 3)\n          (textblock\n           :text \",\"\n           :startpos 4\n           :endpos 4\n           :delim\n            (copy delimcomma\n             :pos 0))\n          (textblock\n           :text \"b\"\n           :startpos 5\n           :endpos 5)))\n       (textblock\n        :text \",\"\n        :startpos 7\n        :endpos 7\n        :delim\n         (copy delimcomma\n          :pos 0))\n       (textblock\n        :text \"{c d}\"\n        :startpos 8\n        :endpos 12\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"c\"\n           :startpos 9\n           :endpos 9)\n          (textblock\n           :text \" \"\n           :startpos 10\n           :endpos 10\n           :delim\n            (copy delimwhitespace\n             :pos 0))\n          (textblock\n           :text \"d\"\n           :startpos 11\n           :endpos 11))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":startpos",
                13,
                ":endpos",
                13,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":startpos",
                  14,
                  ":endpos",
                  14,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest1
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":pos",
                      0
                    ),
                    ":close",
                    vx_data_textblock.c_delimclosing,
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{c d}",
                        ":startpos",
                        8,
                        ":endpos",
                        12,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            " ",
                            ":startpos",
                            10,
                            ":endpos",
                            10,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimwhitespace,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ">",
                  ":startpos",
                  13,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{c d}",
                        ":startpos",
                        8,
                        ":endpos",
                        12,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            " ",
                            ":startpos",
                            10,
                            ":endpos",
                            10,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimwhitespace,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :startpos 14\n  :endpos 14\n  :delim\n   (delim\n    :delimlist delimlisttest1)\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13\n    :children\n     (textblocklist\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (copy delimbracketangle\n         :pos 0)\n       :children\n        (textblocklist\n         (textblock\n          :text \"{a,b}\"\n          :startpos 2\n          :endpos 6\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"a\"\n             :startpos 3\n             :endpos 3)\n            (textblock\n             :text \",\"\n             :startpos 4\n             :endpos 4\n             :delim\n              (copy delimcomma\n               :pos 0))\n            (textblock\n             :text \"b\"\n             :startpos 5\n             :endpos 5)))\n         (textblock\n          :text \",\"\n          :startpos 7\n          :endpos 7\n          :delim\n           (copy delimcomma\n            :pos 0))\n         (textblock\n          :text \"{c d}\"\n          :startpos 8\n          :endpos 12\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"c\"\n             :startpos 9\n             :endpos 9)\n           (textblock\n            :text \" \"\n            :startpos 10\n            :endpos 10\n            :delim\n             (copy delimwhitespace\n              :pos 0))\n           (textblock\n            :text \"d\"\n            :startpos 11\n            :endpos 11))))))))\n (textblock-parse-one\n  (textblock\n   :startpos 13\n   :endpos 13\n   :parent\n    (textblock\n     :startpos 14\n     :endpos 14\n     :delim\n      (delim\n       :delimlist delimlisttest1)\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (copy delimbracketangle\n         :pos 0)\n       :close delimclosing\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13)\n       :children\n        (textblocklist\n         (textblock\n          :text \"{a,b}\"\n          :startpos 2\n          :endpos 6\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"a\"\n             :startpos 3\n             :endpos 3)\n            (textblock\n             :text \",\"\n             :startpos 4\n             :endpos 4\n             :delim\n              (copy delimcomma\n               :pos 0))\n            (textblock\n             :text \"b\"\n             :startpos 5\n             :endpos 5)))\n         (textblock\n          :text \",\"\n          :startpos 7\n          :endpos 7\n          :delim\n           (copy delimcomma\n            :pos 0))\n         (textblock\n          :text \"{c d}\"\n          :startpos 8\n          :endpos 12\n          :delim\n           (copy delimbracketcurly\n            :pos 0)\n          :children\n           (textblocklist\n            (textblock\n             :text \"c\"\n             :startpos 9\n             :endpos 9)\n           (textblock\n            :text \" \"\n            :startpos 10\n            :endpos 10\n            :delim\n             (copy delimwhitespace\n              :pos 0))\n           (textblock\n            :text \"d\"\n            :startpos 11\n            :endpos 11)))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":startpos",
                14,
                ":endpos",
                14,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest1
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":pos",
                        0
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{c d}",
                          ":startpos",
                          8,
                          ":endpos",
                          12,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              " ",
                              ":startpos",
                              10,
                              ":endpos",
                              10,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimwhitespace,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                          )
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":startpos",
                  13,
                  ":endpos",
                  13,
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":startpos",
                    14,
                    ":endpos",
                    14,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":pos",
                        0
                      ),
                      ":close",
                      vx_data_textblock.c_delimclosing,
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{c d}",
                          ":startpos",
                          8,
                          ":endpos",
                          12,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              " ",
                              ":startpos",
                              10,
                              ":endpos",
                              10,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimwhitespace,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"<{a,b},{c d}>\"\n  :startpos 1\n  :endpos 13\n  :children\n   (textblocklist\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :pos 0)\n     :children\n      (textblocklist\n       (textblock\n        :text \"{a,b}\"\n        :startpos 2\n        :endpos 6\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"a\"\n           :startpos 3\n           :endpos 3)\n          (textblock\n           :text \",\"\n           :startpos 4\n           :endpos 4\n           :delim\n            (copy delimcomma\n             :pos 0))\n          (textblock\n           :text \"b\"\n           :startpos 5\n           :endpos 5)))\n       (textblock\n        :text \",\"\n        :startpos 7\n        :endpos 7\n        :delim\n         (copy delimcomma\n          :pos 0))\n       (textblock\n        :text \"{c d}\"\n        :startpos 8\n        :endpos 12\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"c\"\n           :startpos 9\n           :endpos 9)\n          (textblock\n           :text \" \"\n           :startpos 10\n           :endpos 10\n           :delim\n            (copy delimwhitespace\n             :pos 0))\n          (textblock\n           :text \"d\"\n           :startpos 11\n           :endpos 11)))))))\n (textblock-parse-one\n  (textblock\n   :startpos 14\n   :endpos 14\n   :delim\n    (delim\n     :delimlist delimlisttest1)\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :children\n      (textblocklist\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"{a,b}\"\n           :startpos 2\n           :endpos 6\n           :delim\n            (copy delimbracketcurly\n             :pos 0)\n           :children\n            (textblocklist\n             (textblock\n              :text \"a\"\n              :startpos 3\n              :endpos 3)\n             (textblock\n              :text \",\"\n              :startpos 4\n              :endpos 4\n              :delim\n               (copy delimcomma\n                :pos 0))\n             (textblock\n              :text \"b\"\n              :startpos 5\n              :endpos 5)))\n          (textblock\n           :text \",\"\n           :startpos 7\n           :endpos 7\n           :delim\n            (copy delimcomma\n             :pos 0))\n          (textblock\n           :text \"{c d}\"\n           :startpos 8\n           :endpos 12\n           :delim\n            (copy delimbracketcurly\n             :pos 0)\n           :children\n            (textblocklist\n             (textblock\n              :text \"c\"\n              :startpos 9\n              :endpos 9)\n            (textblock\n             :text \" \"\n             :startpos 10\n             :endpos 10\n             :delim\n              (copy delimwhitespace\n               :pos 0))\n            (textblock\n             :text \"d\"\n             :startpos 11\n             :endpos 11))))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "<{a,b},{c d}>",
                ":startpos",
                1,
                ":endpos",
                13,
                ":children",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblocklist},
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":pos",
                      0
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{c d}",
                        ":startpos",
                        8,
                        ":endpos",
                        12,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            " ",
                            ":startpos",
                            10,
                            ":endpos",
                            10,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimwhitespace,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":startpos",
                  14,
                  ":endpos",
                  14,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest1
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            "{a,b}",
                            ":startpos",
                            2,
                            ":endpos",
                            6,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimbracketcurly,
                              ":pos",
                              0
                            ),
                            ":children",
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblocklist},
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                              vx_core.f_new(
                                {"any-1": vx_data_textblock.t_textblock},
                                ":text",
                                ",",
                                ":startpos",
                                4,
                                ":endpos",
                                4,
                                ":delim",
                                vx_core.f_copy(
                                  vx_data_textblock.c_delimcomma,
                                  ":pos",
                                  0
                                )
                              ),
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                            )
                          ),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            7,
                            ":endpos",
                            7,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            "{c d}",
                            ":startpos",
                            8,
                            ":endpos",
                            12,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimbracketcurly,
                              ":pos",
                              0
                            ),
                            ":children",
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblocklist},
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                              vx_core.f_new(
                                {"any-1": vx_data_textblock.t_textblock},
                                ":text",
                                " ",
                                ":startpos",
                                10,
                                ":endpos",
                                10,
                                ":delim",
                                vx_core.f_copy(
                                  vx_data_textblock.c_delimwhitespace,
                                  ":pos",
                                  0
                                )
                              ),
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"<{a,b},{c d}>\"\n  :startpos 1\n  :endpos 13\n  :children\n   (textblocklist\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :pos 0)\n     :children\n      (textblocklist\n       (textblock\n        :text \"{a,b}\"\n        :startpos 2\n        :endpos 6\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"a\"\n           :startpos 3\n           :endpos 3)\n          (textblock\n           :text \",\"\n           :startpos 4\n           :endpos 4\n           :delim\n            (copy delimcomma\n             :pos 0))\n          (textblock\n           :text \"b\"\n           :startpos 5\n           :endpos 5)))\n       (textblock\n        :text \",\"\n        :startpos 7\n        :endpos 7\n        :delim\n         (copy delimcomma\n          :pos 0))\n       (textblock\n        :text \"{c d}\"\n        :startpos 8\n        :endpos 12\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"c\"\n           :startpos 9\n           :endpos 9)\n          (textblock\n           :text \" \"\n           :startpos 10\n           :endpos 10\n           :delim\n            (copy delimwhitespace\n             :pos 0))\n          (textblock\n           :text \"d\"\n           :startpos 11\n           :endpos 11)))))))\n (textblock-parse-one\n  (textblock\n   :text \"<{a,b},{c d}>\"\n   :startpos 1\n   :endpos 13\n   :children\n    (textblocklist\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13\n      :delim\n       (copy delimbracketangle\n        :pos 0)\n      :children\n       (textblocklist\n        (textblock\n         :text \"{a,b}\"\n         :startpos 2\n         :endpos 6\n         :delim\n          (copy delimbracketcurly\n           :pos 0)\n         :children\n          (textblocklist\n           (textblock\n            :text \"a\"\n            :startpos 3\n            :endpos 3)\n           (textblock\n            :text \",\"\n            :startpos 4\n            :endpos 4\n            :delim\n             (copy delimcomma\n              :pos 0))\n           (textblock\n            :text \"b\"\n            :startpos 5\n            :endpos 5)))\n        (textblock\n         :text \",\"\n         :startpos 7\n         :endpos 7\n         :delim\n          (copy delimcomma\n           :pos 0))\n        (textblock\n         :text \"{c d}\"\n         :startpos 8\n         :endpos 12\n         :delim\n          (copy delimbracketcurly\n           :pos 0)\n         :children\n          (textblocklist\n           (textblock\n            :text \"c\"\n            :startpos 9\n            :endpos 9)\n           (textblock\n            :text \" \"\n            :startpos 10\n            :endpos 10\n            :delim\n             (copy delimwhitespace\n              :pos 0))\n           (textblock\n            :text \"d\"\n            :startpos 11\n            :endpos 11)))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "<{a,b},{c d}>",
                ":startpos",
                1,
                ":endpos",
                13,
                ":children",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblocklist},
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":pos",
                      0
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{c d}",
                        ":startpos",
                        8,
                        ":endpos",
                        12,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            " ",
                            ":startpos",
                            10,
                            ":endpos",
                            10,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimwhitespace,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_parse_one(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":children",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblocklist},
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":pos",
                        0
                      ),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{c d}",
                          ":startpos",
                          8,
                          ":endpos",
                          12,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              " ",
                              ":startpos",
                              10,
                              ":endpos",
                              10,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimwhitespace,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
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
    return output
  }

  static f_textblock_startleft_from_string_delim_offset(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock-startleft<-string-delim-offset",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"a\"\n  :startpos 1\n  :endpos 1)\n (textblock-startleft<-string-delim-offset\n  \"a,b\"\n  (delim\n   :pos 2)\n  0))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 1, ":endpos", 1),
              vx_data_textblock.f_textblock_startleft_from_string_delim_offset(
                "a,b",
                vx_core.f_new({"any-1": vx_data_textblock.t_delim}, ":pos", 2),
                0
              )
            )
          )
        )
    )
    return output
  }

  static f_textblock_startright_from_string_delim_offset(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock-startright<-string-delim-offset",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \",b\"\n  :startpos 2\n  :delim\n   (copy delimcomma\n    :pos 2))\n (textblock-startright<-string-delim-offset\n  \"a,b\"\n  (copy delimcomma\n   :pos 2)\n  0))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                ",b",
                ":startpos",
                2,
                ":delim",
                vx_core.f_copy(
                  vx_data_textblock.c_delimcomma,
                  ":pos",
                  2
                )
              ),
              vx_data_textblock.f_textblock_startright_from_string_delim_offset(
                "a,b",
                vx_core.f_copy(
                  vx_data_textblock.c_delimcomma,
                  ":pos",
                  2
                ),
                0
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"<b>c\"\n  :startpos 2\n  :delim\n   (copy delimbracketangle\n    :pos 2\n    :delimlist\n     (delimlist\n      delimbracketcurly))\n  :close\n   (copy delimclose\n    :starttext \">\"))\n (textblock-startright<-string-delim-offset\n  \"a<b>c\"\n  (copy delimbracketangle\n   :pos 2\n   :delimlist\n    (delimlist\n     delimbracketcurly))\n  0))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "<b>c",
                ":startpos",
                2,
                ":delim",
                vx_core.f_copy(
                  vx_data_textblock.c_delimbracketangle,
                  ":pos",
                  2,
                  ":delimlist",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delimlist},
                    vx_data_textblock.c_delimbracketcurly
                  )
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  ">"
                )
              ),
              vx_data_textblock.f_textblock_startright_from_string_delim_offset(
                "a<b>c",
                vx_core.f_copy(
                  vx_data_textblock.c_delimbracketangle,
                  ":pos",
                  2,
                  ":delimlist",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delimlist},
                    vx_data_textblock.c_delimbracketcurly
                  )
                ),
                0
              )
            )
          )
        )
    )
    return output
  }

  static f_textblock_from_close_textblock(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock<-close-textblock",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"b\"\n  :startpos 5\n  :endpos 5\n  :parent\n   (textblock\n    :text \",{c d}>\"\n    :startpos 7\n    :endpos 13\n    :delim\n     (delim\n      :delimlist delimlisttest2)\n    :close\n     (copy delimclose\n      :starttext \">\")\n    :parent\n     (textblock\n      :text \"{a,b}\"\n      :startpos 2\n      :endpos 6\n      :delim\n       (copy delimbracketcurly\n        :pos 0)\n      :close delimclosing\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :delimlist delimlisttest1)\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13))\n      :children\n       (textblocklist\n        (textblock\n         :text \"a\"\n         :startpos 3\n         :endpos 3)\n        (textblock\n         :text \",\"\n         :startpos 4\n         :endpos 4\n         :delim\n          (copy delimcomma\n           :pos 0))))))\n (textblock<-close-textblock\n  (copy delimclose\n   :starttext \"}\"\n   :pos 2)\n  (textblock\n   :text \"b},{c d}>\"\n   :startpos 5\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest3)\n   :close\n    (copy delimclose\n     :starttext \"}\")\n   :parent\n    (textblock\n     :text \"{a,b},{c d}>\"\n     :startpos 2\n     :endpos 13\n     :delim\n      (copy delimbracketcurly\n       :delimlist delimlisttest2)\n     :close\n      (copy delimclose\n       :starttext \">\")\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (copy delimbracketangle\n         :delimlist delimlisttest1)\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13))\n     :children\n      (textblocklist\n       (textblock\n        :text \"a\"\n        :startpos 3\n        :endpos 3)\n       (textblock\n        :text \",\"\n        :startpos 4\n        :endpos 4\n        :delim\n         (copy delimcomma\n          :pos 0)))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "b",
                ":startpos",
                5,
                ":endpos",
                5,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",{c d}>",
                  ":startpos",
                  7,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{a,b}",
                    ":startpos",
                    2,
                    ":endpos",
                    6,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":pos",
                      0
                    ),
                    ":close",
                    vx_data_textblock.c_delimclosing,
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        4,
                        ":endpos",
                        4,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_from_close_textblock(
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  "}",
                  ":pos",
                  2
                ),
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "b},{c d}>",
                  ":startpos",
                  5,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{a,b},{c d}>",
                    ":startpos",
                    2,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                    ),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        4,
                        ":endpos",
                        4,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :startpos 13\n  :endpos 13\n  :parent\n   (textblock\n    :startpos 14\n    :endpos 14\n    :delim\n     (delim\n      :delimlist delimlisttest1)\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13\n      :delim\n       (copy delimbracketangle\n        :pos 0)\n      :close delimclosing\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13)\n      :children\n       (textblocklist\n        (textblock\n         :text \"{a,b}\"\n         :startpos 2\n         :endpos 6\n         :delim\n          (copy delimbracketcurly\n           :pos 0)\n         :children\n          (textblocklist\n           (textblock\n            :text \"a\"\n            :startpos 3\n            :endpos 3)\n           (textblock\n            :text \",\"\n            :startpos 4\n            :endpos 4\n            :delim\n             (copy delimcomma\n              :pos 0))\n           (textblock\n            :text \"b\"\n            :startpos 5\n            :endpos 5)))\n        (textblock\n         :text \",\"\n         :startpos 7\n         :endpos 7\n         :delim\n          (copy delimcomma\n           :pos 0))\n        (textblock\n         :text \"{c d}\"\n         :startpos 8\n         :endpos 12\n         :delim\n          (copy delimbracketcurly\n           :pos 0)\n         :children\n          (textblocklist\n           (textblock\n            :text \"c\"\n            :startpos 9\n            :endpos 9)\n          (textblock\n           :text \" \"\n           :startpos 10\n           :endpos 10\n           :delim\n            (copy delimwhitespace\n             :pos 0))\n          (textblock\n           :text \"d\"\n           :startpos 11\n           :endpos 11)))))))\n (textblock<-close-textblock\n  (copy delimclose\n   :starttext \">\"\n   :pos 1)\n  (textblock\n   :text \">\"\n   :startpos 13\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest2)\n   :close\n    (copy delimclose\n     :starttext \">\")\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :delimlist delimlisttest1)\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13)\n     :children\n      (textblocklist\n       (textblock\n        :text \"{a,b}\"\n        :startpos 2\n        :endpos 6\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"a\"\n           :startpos 3\n           :endpos 3)\n          (textblock\n           :text \",\"\n           :startpos 4\n           :endpos 4\n           :delim\n            (copy delimcomma\n             :pos 0))\n          (textblock\n           :text \"b\"\n           :startpos 5\n           :endpos 5)))\n       (textblock\n        :text \",\"\n        :startpos 7\n        :endpos 7\n        :delim\n         (copy delimcomma\n          :pos 0))\n       (textblock\n        :text \"{c d}\"\n        :startpos 8\n        :endpos 12\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"c\"\n           :startpos 9\n           :endpos 9)\n          (textblock\n           :text \" \"\n           :startpos 10\n           :endpos 10\n           :delim\n            (copy delimwhitespace\n             :pos 0))\n          (textblock\n           :text \"d\"\n           :startpos 11\n           :endpos 11))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":startpos",
                13,
                ":endpos",
                13,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":startpos",
                  14,
                  ":endpos",
                  14,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest1
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":pos",
                      0
                    ),
                    ":close",
                    vx_data_textblock.c_delimclosing,
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{c d}",
                        ":startpos",
                        8,
                        ":endpos",
                        12,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            " ",
                            ":startpos",
                            10,
                            ":endpos",
                            10,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimwhitespace,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_from_close_textblock(
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  ">",
                  ":pos",
                  1
                ),
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ">",
                  ":startpos",
                  13,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest1
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        ",",
                        ":startpos",
                        7,
                        ":endpos",
                        7,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimcomma,
                          ":pos",
                          0
                        )
                      ),
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{c d}",
                        ":startpos",
                        8,
                        ":endpos",
                        12,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "c", ":startpos", 9, ":endpos", 9),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            " ",
                            ":startpos",
                            10,
                            ":endpos",
                            10,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimwhitespace,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "d", ":startpos", 11, ":endpos", 11)
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

  static f_textblock_from_open_textblock(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock<-open-textblock",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"c}\"\n  :startpos 4\n  :endpos 5\n  :close\n   (copy delimclose\n    :starttext \"}\")\n  :parent\n   (textblock\n    :text \"{c}\"\n    :startpos 3\n    :endpos 5\n    :delim\n     (copy delimbracketcurly\n      :pos 0)\n    :parent\n     (textblock\n      :text \"ab{c}\"\n      :startpos 1\n      :endpos 5\n      :children\n       (textblocklist\n        (textblock\n         :text \"ab\"\n         :startpos 1\n         :endpos 2)))))\n (textblock<-open-textblock\n  (copy delimbracketcurly\n   :pos 3)\n  (textblock\n   :text \"ab{c}\"\n   :startpos 1\n   :endpos 5\n   :delim delimbracketcurly\n   :parent\n    (textblock\n     :text \"ab{c}\"\n     :startpos 1\n     :endpos 5))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "c}",
                ":startpos",
                4,
                ":endpos",
                5,
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  "}"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{c}",
                  ":startpos",
                  3,
                  ":endpos",
                  5,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketcurly,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "ab{c}",
                    ":startpos",
                    1,
                    ":endpos",
                    5,
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "ab", ":startpos", 1, ":endpos", 2)
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_from_open_textblock(
                vx_core.f_copy(
                  vx_data_textblock.c_delimbracketcurly,
                  ":pos",
                  3
                ),
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "ab{c}",
                  ":startpos",
                  1,
                  ":endpos",
                  5,
                  ":delim",
                  vx_data_textblock.c_delimbracketcurly,
                  ":parent",
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "ab{c}", ":startpos", 1, ":endpos", 5)
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"{a,b},{c d}>\"\n  :startpos 2\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest2)\n  :close\n   (copy delimclose\n    :starttext \">\")\n  :parent\n   (textblock\n    :text \"<{a,b},{c d}>\"\n    :startpos 1\n    :endpos 13\n    :delim\n     (copy delimbracketangle\n      :delimlist delimlisttest1)\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13)))\n (textblock<-open-textblock\n  (copy delimtest2\n   :pos 1)\n  (textblock\n   :text \"<{a,b},{c d}>\"\n   :startpos 1\n   :endpos 13\n   :delim delimtest1\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "{a,b},{c d}>",
                ":startpos",
                2,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest2
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  ">"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketangle,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest1
                  ),
                  ":parent",
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                )
              ),
              vx_data_textblock.f_textblock_from_open_textblock(
                vx_core.f_copy(
                  vx_data_textblock.c_delimtest2,
                  ":pos",
                  1
                ),
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "<{a,b},{c d}>",
                  ":startpos",
                  1,
                  ":endpos",
                  13,
                  ":delim",
                  vx_data_textblock.c_delimtest1,
                  ":parent",
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"a,b},{c d}>\"\n  :startpos 3\n  :endpos 13\n  :delim\n   (delim\n    :delimlist delimlisttest3)\n  :close\n   (copy delimclose\n    :starttext \"}\")\n  :parent\n   (textblock\n    :text \"{a,b},{c d}>\"\n    :startpos 2\n    :endpos 13\n    :delim\n     (copy delimbracketcurly\n      :delimlist delimlisttest2)\n    :close\n     (copy delimclose\n      :starttext \">\")\n    :parent\n     (textblock\n      :text \"<{a,b},{c d}>\"\n      :startpos 1\n      :endpos 13\n      :delim\n       (copy delimbracketangle\n        :pos 0)\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13))))\n (textblock<-open-textblock\n  (copy delimtest3\n   :pos 1)\n  (textblock\n   :text \"{a,b},{c d}>\"\n   :startpos 2\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest2)\n   :close\n    (copy delimclose\n     :starttext \">\")\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :pos 0)\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13)))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "a,b},{c d}>",
                ":startpos",
                3,
                ":endpos",
                13,
                ":delim",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_delim},
                  ":delimlist",
                  vx_data_textblock.c_delimlisttest3
                ),
                ":close",
                vx_core.f_copy(
                  vx_data_textblock.c_delimclose,
                  ":starttext",
                  "}"
                ),
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{a,b},{c d}>",
                  ":startpos",
                  2,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimbracketcurly,
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":pos",
                      0
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                  )
                )
              ),
              vx_data_textblock.f_textblock_from_open_textblock(
                vx_core.f_copy(
                  vx_data_textblock.c_delimtest3,
                  ":pos",
                  1
                ),
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "{a,b},{c d}>",
                  ":startpos",
                  2,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest2
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":pos",
                      0
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                  )
                )
              )
            )
          )
        )
    )
    return output
  }

  static f_textblock_from_single_textblock(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock<-single-textblock",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"a\"\n  :startpos 3\n  :endpos 3\n  :parent\n   (textblock\n    :text \",\"\n    :startpos 4\n    :endpos 4\n    :delim\n     (copy delimcomma\n      :pos 0)\n    :parent\n     (textblock\n      :text \"b},{c d}>\"\n      :startpos 5\n      :endpos 13\n      :delim\n       (delim\n        :delimlist delimlisttest3)\n      :close\n       (copy delimclose\n        :starttext \"}\")\n      :parent\n       (textblock\n        :text \"{a,b},{c d}>\"\n        :startpos 2\n        :endpos 13\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :close\n         (copy delimclose\n          :starttext \">\")\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13\n          :delim\n           (copy delimbracketangle\n            :pos 0)\n          :parent\n           (textblock\n            :text \"<{a,b},{c d}>\"\n            :startpos 1\n            :endpos 13))))))\n (textblock<-single-textblock\n  (copy delimcomma\n   :pos 2)\n  (textblock\n   :text \"a,b},{c d}>\"\n   :startpos 3\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest3)\n   :close\n    (copy delimclose\n     :starttext \"}\")\n   :parent\n    (textblock\n     :text \"{a,b},{c d}>\"\n     :startpos 2\n     :endpos 13\n     :delim\n      (copy delimbracketcurly\n       :pos 0)\n     :close\n      (copy delimclose\n       :starttext \">\")\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13\n       :delim\n        (copy delimbracketangle\n         :pos 0)\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "a",
                ":startpos",
                3,
                ":endpos",
                3,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",",
                  ":startpos",
                  4,
                  ":endpos",
                  4,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimcomma,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "b},{c d}>",
                    ":startpos",
                    5,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest3
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      "}"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{a,b},{c d}>",
                      ":startpos",
                      2,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":pos",
                        0
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        ">"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":pos",
                          0
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_from_single_textblock(
                vx_core.f_copy(
                  vx_data_textblock.c_delimcomma,
                  ":pos",
                  2
                ),
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "a,b},{c d}>",
                  ":startpos",
                  3,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{a,b},{c d}>",
                    ":startpos",
                    2,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":pos",
                      0
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":pos",
                        0
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13)
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :startpos 7\n  :endpos 7\n  :parent\n   (textblock\n    :text \",\"\n    :startpos 7\n    :endpos 7\n    :delim\n     (copy delimcomma\n      :pos 0)\n    :parent\n     (textblock\n      :text \"{c d}>\"\n      :startpos 8\n      :endpos 13\n      :delim\n       (delim\n        :delimlist delimlisttest3)\n      :close\n       (copy delimclose\n        :starttext \">\")\n      :parent\n       (textblock\n        :text \"<{a,b},{c d}>\"\n        :startpos 1\n        :endpos 13\n        :delim\n         (copy delimbracketangle\n          :pos 0)\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13)\n        :children\n         (textblocklist\n          (textblock\n           :text \"{a,b}\"\n           :startpos 2\n           :endpos 6\n           :delim\n            (copy delimbracketcurly\n           :pos 0)\n           :children\n            (textblocklist\n             (textblock\n              :text \"a\"\n              :startpos 3\n              :endpos 3)\n             (textblock\n              :text \",\"\n              :startpos 4\n              :endpos 4\n              :delim\n               (copy delimcomma\n                :pos 0))\n             (textblock\n              :text \"b\"\n              :startpos 5\n              :endpos 5))))))))\n (textblock<-single-textblock\n  (copy delimcomma\n   :pos 1)\n  (textblock\n   :text \",{c d}>\"\n   :startpos 7\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest3)\n   :close\n    (copy delimclose\n     :starttext \">\")\n   :parent\n    (textblock\n     :text \"<{a,b},{c d}>\"\n     :startpos 1\n     :endpos 13\n     :delim\n      (copy delimbracketangle\n       :pos 0)\n     :parent\n      (textblock\n       :text \"<{a,b},{c d}>\"\n       :startpos 1\n       :endpos 13)\n     :children\n      (textblocklist\n       (textblock\n        :text \"{a,b}\"\n        :startpos 2\n        :endpos 6\n        :delim\n         (copy delimbracketcurly\n          :pos 0)\n        :children\n         (textblocklist\n          (textblock\n           :text \"a\"\n           :startpos 3\n           :endpos 3)\n          (textblock\n           :text \",\"\n           :startpos 4\n           :endpos 4\n           :delim\n            (copy delimcomma\n             :pos 0))\n          (textblock\n           :text \"b\"\n           :startpos 5\n           :endpos 5))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":startpos",
                7,
                ":endpos",
                7,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",",
                  ":startpos",
                  7,
                  ":endpos",
                  7,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimcomma,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{c d}>",
                    ":startpos",
                    8,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest3
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":pos",
                        0
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_from_single_textblock(
                vx_core.f_copy(
                  vx_data_textblock.c_delimcomma,
                  ":pos",
                  1
                ),
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  ",{c d}>",
                  ":startpos",
                  7,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    ">"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "<{a,b},{c d}>",
                    ":startpos",
                    1,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketangle,
                      ":pos",
                      0
                    ),
                    ":parent",
                    vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                    ":children",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblocklist},
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "{a,b}",
                        ":startpos",
                        2,
                        ":endpos",
                        6,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketcurly,
                          ":pos",
                          0
                        ),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            4,
                            ":endpos",
                            4,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          ),
                          vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                        )
                      )
                    )
                  )
                )
              )
            )
          ),
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"c\"\n  :startpos 9\n  :endpos 9\n  :parent\n   (textblock\n    :text \" \"\n    :startpos 10\n    :endpos 10\n    :delim\n     (copy delimwhitespace\n      :pos 0)\n    :parent\n     (textblock\n      :text \"d}>\"\n      :startpos 11\n      :endpos 13\n      :delim\n       (delim\n        :delimlist delimlisttest3)\n      :close\n       (copy delimclose\n        :starttext \"}\")\n      :parent\n       (textblock\n        :text \"{c d}>\"\n        :startpos 8\n        :endpos 13\n        :delim\n         (copy delimbracketcurly\n          :delimlist delimlisttest2)\n        :close\n         (copy delimclose\n          :starttext \">\")\n        :parent\n         (textblock\n          :text \"<{a,b},{c d}>\"\n          :startpos 1\n          :endpos 13\n          :delim\n           (copy delimbracketangle\n            :delimlist delimlisttest1)\n          :parent\n           (textblock\n            :text \"<{a,b},{c d}>\"\n            :startpos 1\n            :endpos 13)\n          :children\n           (textblocklist\n            (textblock\n             :text \"{a,b}\"\n             :startpos 2\n             :endpos 6\n             :delim\n              (copy delimbracketcurly\n               :pos 0)\n             :children\n              (textblocklist\n               (textblock\n                :text \"a\"\n                :startpos 3\n                :endpos 3)\n               (textblock\n                :text \",\"\n                :startpos 4\n                :endpos 4\n                :delim\n                 (copy delimcomma\n                  :pos 0))\n               (textblock\n                :text \"b\"\n                :startpos 5\n                :endpos 5)))\n            (textblock\n             :text \",\"\n             :startpos 7\n             :endpos 7\n             :delim\n              (copy delimcomma\n               :pos 0))))))))\n (textblock<-single-textblock\n  (copy delimwhitespace\n   :pos 2)\n  (textblock\n   :text \"c d}>\"\n   :startpos 9\n   :endpos 13\n   :delim\n    (delim\n     :delimlist delimlisttest3)\n     :close\n      (copy delimclose\n       :starttext \"}\")\n     :parent\n      (textblock\n       :text \"{c d}>\"\n       :startpos 8\n       :endpos 13\n       :delim\n        (copy delimbracketcurly\n         :delimlist delimlisttest2)\n       :close\n        (copy delimclose\n         :starttext \">\")\n       :parent\n        (textblock\n         :text \"<{a,b},{c d}>\"\n         :startpos 1\n         :endpos 13\n         :delim\n          (copy delimbracketangle\n           :delimlist delimlisttest1)\n         :parent\n          (textblock\n           :text \"<{a,b},{c d}>\"\n           :startpos 1\n           :endpos 13)\n         :children\n          (textblocklist\n           (textblock\n            :text \"{a,b}\"\n            :startpos 2\n            :endpos 6\n            :delim\n             (copy delimbracketcurly\n              :pos 0)\n            :children\n             (textblocklist\n              (textblock\n               :text \"a\"\n               :startpos 3\n               :endpos 3)\n              (textblock\n               :text \",\"\n               :startpos 4\n               :endpos 4\n               :delim\n                (copy delimcomma\n                 :pos 0))\n              (textblock\n               :text \"b\"\n               :startpos 5\n               :endpos 5)))\n           (textblock\n            :text \",\"\n            :startpos 7\n            :endpos 7\n            :delim\n             (copy delimcomma\n              :pos 0))))))))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "c",
                ":startpos",
                9,
                ":endpos",
                9,
                ":parent",
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  " ",
                  ":startpos",
                  10,
                  ":endpos",
                  10,
                  ":delim",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimwhitespace,
                    ":pos",
                    0
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "d}>",
                    ":startpos",
                    11,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_delim},
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest3
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      "}"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "{c d}>",
                      ":startpos",
                      8,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketcurly,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest2
                      ),
                      ":close",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimclose,
                        ":starttext",
                        ">"
                      ),
                      ":parent",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblock},
                        ":text",
                        "<{a,b},{c d}>",
                        ":startpos",
                        1,
                        ":endpos",
                        13,
                        ":delim",
                        vx_core.f_copy(
                          vx_data_textblock.c_delimbracketangle,
                          ":delimlist",
                          vx_data_textblock.c_delimlisttest1
                        ),
                        ":parent",
                        vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                        ":children",
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblocklist},
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            "{a,b}",
                            ":startpos",
                            2,
                            ":endpos",
                            6,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimbracketcurly,
                              ":pos",
                              0
                            ),
                            ":children",
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblocklist},
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                              vx_core.f_new(
                                {"any-1": vx_data_textblock.t_textblock},
                                ":text",
                                ",",
                                ":startpos",
                                4,
                                ":endpos",
                                4,
                                ":delim",
                                vx_core.f_copy(
                                  vx_data_textblock.c_delimcomma,
                                  ":pos",
                                  0
                                )
                              ),
                              vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                            )
                          ),
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblock},
                            ":text",
                            ",",
                            ":startpos",
                            7,
                            ":endpos",
                            7,
                            ":delim",
                            vx_core.f_copy(
                              vx_data_textblock.c_delimcomma,
                              ":pos",
                              0
                            )
                          )
                        )
                      )
                    )
                  )
                )
              ),
              vx_data_textblock.f_textblock_from_single_textblock(
                vx_core.f_copy(
                  vx_data_textblock.c_delimwhitespace,
                  ":pos",
                  2
                ),
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblock},
                  ":text",
                  "c d}>",
                  ":startpos",
                  9,
                  ":endpos",
                  13,
                  ":delim",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_delim},
                    ":delimlist",
                    vx_data_textblock.c_delimlisttest3
                  ),
                  ":close",
                  vx_core.f_copy(
                    vx_data_textblock.c_delimclose,
                    ":starttext",
                    "}"
                  ),
                  ":parent",
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    "{c d}>",
                    ":startpos",
                    8,
                    ":endpos",
                    13,
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimbracketcurly,
                      ":delimlist",
                      vx_data_textblock.c_delimlisttest2
                    ),
                    ":close",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimclose,
                      ":starttext",
                      ">"
                    ),
                    ":parent",
                    vx_core.f_new(
                      {"any-1": vx_data_textblock.t_textblock},
                      ":text",
                      "<{a,b},{c d}>",
                      ":startpos",
                      1,
                      ":endpos",
                      13,
                      ":delim",
                      vx_core.f_copy(
                        vx_data_textblock.c_delimbracketangle,
                        ":delimlist",
                        vx_data_textblock.c_delimlisttest1
                      ),
                      ":parent",
                      vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "<{a,b},{c d}>", ":startpos", 1, ":endpos", 13),
                      ":children",
                      vx_core.f_new(
                        {"any-1": vx_data_textblock.t_textblocklist},
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          "{a,b}",
                          ":startpos",
                          2,
                          ":endpos",
                          6,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimbracketcurly,
                            ":pos",
                            0
                          ),
                          ":children",
                          vx_core.f_new(
                            {"any-1": vx_data_textblock.t_textblocklist},
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "a", ":startpos", 3, ":endpos", 3),
                            vx_core.f_new(
                              {"any-1": vx_data_textblock.t_textblock},
                              ":text",
                              ",",
                              ":startpos",
                              4,
                              ":endpos",
                              4,
                              ":delim",
                              vx_core.f_copy(
                                vx_data_textblock.c_delimcomma,
                                ":pos",
                                0
                              )
                            ),
                            vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "b", ":startpos", 5, ":endpos", 5)
                          )
                        ),
                        vx_core.f_new(
                          {"any-1": vx_data_textblock.t_textblock},
                          ":text",
                          ",",
                          ":startpos",
                          7,
                          ":endpos",
                          7,
                          ":delim",
                          vx_core.f_copy(
                            vx_data_textblock.c_delimcomma,
                            ":pos",
                            0
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
    return output
  }

  static f_textblock_from_string_delim(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblock<-string-delim",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblock\n  :text \"a\"\n  :startpos 0\n  :endpos 1\n  :delim delimcomma)\n (textblock<-string-delim\n  \"a\"\n  delimcomma))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblock},
                ":text",
                "a",
                ":startpos",
                0,
                ":endpos",
                1,
                ":delim",
                vx_data_textblock.c_delimcomma
              ),
              vx_data_textblock.f_textblock_from_string_delim(
                "a",
                vx_data_textblock.c_delimcomma
              )
            )
          )
        )
    )
    return output
  }

  static f_textblocklist_from_textblocklist_remove(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "vx/data/textblock",
      ":casename", "textblocklist<-textblocklist-remove",
      ":describelist",
        vx_core.f_new_from_type(
          vx_test.t_testdescribelist,
          vx_core.f_new_from_type(
            vx_test.t_testdescribe,
            ":describename", "(test\n (textblocklist\n  (textblock\n   :text \"+\")\n  (textblock\n   :text \"2\")\n  (textblock\n   :text \"3\"))\n (textblocklist<-textblocklist-remove\n  (textblocklist\n   (textblock\n    :text \"+\")\n   (textblock\n    :text \" \"\n    :delim\n     (copy delimwhitespace\n      :pos 0))\n   (textblock\n    :text \"2\")\n   (textblock\n    :text \" \"\n    :delim\n     (copy delimwhitespace\n      :pos 0))\n   (textblock\n    :text \"3\"))\n  delimwhitespace))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                {"any-1": vx_data_textblock.t_textblocklist},
                vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "+"),
                vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "2"),
                vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "3")
              ),
              vx_data_textblock.f_textblocklist_from_textblocklist_remove(
                vx_core.f_new(
                  {"any-1": vx_data_textblock.t_textblocklist},
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "+"),
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    " ",
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimwhitespace,
                      ":pos",
                      0
                    )
                  ),
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "2"),
                  vx_core.f_new(
                    {"any-1": vx_data_textblock.t_textblock},
                    ":text",
                    " ",
                    ":delim",
                    vx_core.f_copy(
                      vx_data_textblock.c_delimwhitespace,
                      ":pos",
                      0
                    )
                  ),
                  vx_core.f_new({"any-1": vx_data_textblock.t_textblock}, ":text", "3")
                ),
                vx_data_textblock.c_delimwhitespace
              )
            )
          )
        )
    )
    return output
  }

  static test_cases(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcaselist,
      vx_data_textblock_test.t_delimlist(context),
      vx_data_textblock_test.f_delim_first_from_delim_delim(context),
      vx_data_textblock_test.f_delim_first_from_string_delimlist(context),
      vx_data_textblock_test.f_delim_pos_from_string_delim(context),
      vx_data_textblock_test.f_delimlist_pos_from_string_delimlist(context),
      vx_data_textblock_test.f_stringlist_from_textblocklist(context),
      vx_data_textblock_test.f_text_from_textblock(context),
      vx_data_textblock_test.f_textblock_delimnotfound(context),
      vx_data_textblock_test.f_textblock_init(context),
      vx_data_textblock_test.f_textblock_parse(context),
      vx_data_textblock_test.f_textblock_parse_one(context),
      vx_data_textblock_test.f_textblock_startleft_from_string_delim_offset(context),
      vx_data_textblock_test.f_textblock_startright_from_string_delim_offset(context),
      vx_data_textblock_test.f_textblock_from_close_textblock(context),
      vx_data_textblock_test.f_textblock_from_open_textblock(context),
      vx_data_textblock_test.f_textblock_from_single_textblock(context),
      vx_data_textblock_test.f_textblock_from_string_delim(context),
      vx_data_textblock_test.f_textblocklist_from_textblocklist_remove(context)
    )
    return output
  }
}
