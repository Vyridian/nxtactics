
package com.vxlisp.vx.web;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;

public final class HtmlTest {

  static Test.Type_testcase f_string_from_body_indent(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/web/html",
      ":casename", "string<-body-indent",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"<body></body>\"\n (string<-body-indent (body) 0))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("<body></body>"),
              Html.f_string_from_body_indent(
                Core.f_empty(
                  Html.t_body
                ),
                Core.vx_new_int(0)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"<body>\n  <div></div>\n</body>\"\n (string<-body-indent (body (div)) 0))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("<body>\n  <div></div>\n</body>"),
              Html.f_string_from_body_indent(
                Core.f_new(
                  Html.t_body,
                  Core.t_anylist.vx_new(
                    Core.f_empty(
                      Html.t_div
                    )
                  )
                ),
                Core.vx_new_int(0)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_string_from_div_indent(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/web/html",
      ":casename", "string<-div-indent",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"<div></div>\"\n (string<-div-indent (div) 0))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("<div></div>"),
              Html.f_string_from_div_indent(
                Core.f_empty(
                  Html.t_div
                ),
                Core.vx_new_int(0)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"<div id=\\\"myid\\\"></div>\"\n (string<-div-indent\n  (div :id \"myid\") 0))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("<div id=\"myid\"></div>"),
              Html.f_string_from_div_indent(
                Core.f_new(
                  Html.t_div,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":id"),
                    Core.vx_new_string("myid")
                  )
                ),
                Core.vx_new_int(0)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_string_from_head_indent(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/web/html",
      ":casename", "string<-head-indent",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"<head></head>\"\n (string<-head-indent (head) 0))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("<head></head>"),
              Html.f_string_from_head_indent(
                Core.f_empty(
                  Html.t_head
                ),
                Core.vx_new_int(0)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_string_from_html(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/web/html",
      ":casename", "string<-html",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"<!DOCTYPE html>\n<html>\n  <head></head>\n  <body></body>\n  <footer></footer>\n</html>\"\n (string<-html\n  (html :head (head) :body (body))))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("<!DOCTYPE html>\n<html>\n  <head></head>\n  <body></body>\n  <footer></footer>\n</html>"),
              Html.f_string_from_html(
                Core.f_new(
                  Html.t_html,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":head"),
                    Core.f_empty(
                      Html.t_head
                    ),
                    Core.vx_new_string(":body"),
                    Core.f_empty(
                      Html.t_body
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

  static Test.Type_testcase f_string_from_meta_indent(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/web/html",
      ":casename", "string<-meta-indent",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"<meta charset=\\\"utf-8\\\" />\"\n (string<-meta-indent (meta :charset \"utf-8\") 0))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("<meta charset=\"utf-8\" />"),
              Html.f_string_from_meta_indent(
                Core.f_new(
                  Html.t_meta,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":charset"),
                    Core.vx_new_string("utf-8")
                  )
                ),
                Core.vx_new_int(0)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_string_from_p_indent(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/web/html",
      ":casename", "string<-p-indent",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"<p>data</p>\"\n (string<-p-indent (p :text \"data\") 0))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("<p>data</p>"),
              Html.f_string_from_p_indent(
                Core.f_new(
                  Html.t_p,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":text"),
                    Core.vx_new_string("data")
                  )
                ),
                Core.vx_new_int(0)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"<p id=\\\"myid\\\">data</p>\"\n (string<-p-indent\n  (p :id \"myid\" :text \"data\") 0))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("<p id=\"myid\">data</p>"),
              Html.f_string_from_p_indent(
                Core.f_new(
                  Html.t_p,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":id"),
                    Core.vx_new_string("myid"),
                    Core.vx_new_string(":text"),
                    Core.vx_new_string("data")
                  )
                ),
                Core.vx_new_int(0)
              )
            )
        )
      )
    );
    return output;
  }

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      HtmlTest.f_string_from_body_indent(context),
      HtmlTest.f_string_from_div_indent(context),
      HtmlTest.f_string_from_head_indent(context),
      HtmlTest.f_string_from_html(context),
      HtmlTest.f_string_from_meta_indent(context),
      HtmlTest.f_string_from_p_indent(context)
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "vx/web/html", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 98, ":tests", 66, ":total", 67), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 16, ":tests", 6, ":total", 36), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 36), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 36), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 8, ":tests", 6, ":total", 67), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 31)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "vx/web/html",
      ":typemap", Core.t_intmap.vx_new(
        ":body", 0,
        ":details", 0,
        ":div", 0,
        ":divchild", 0,
        ":divchildlist", 0,
        ":divlist", 0,
        ":footer", 0,
        ":h1", 0,
        ":h2", 0,
        ":h3", 0,
        ":head", 0,
        ":headchild", 0,
        ":headchildlist", 0,
        ":html", 0,
        ":meta", 0,
        ":node", 0,
        ":nodelist", 0,
        ":p", 0,
        ":propmap", 0,
        ":style", 0,
        ":stylelist", 0,
        ":stylemap", 0,
        ":stylesheet", 0,
        ":table", 0,
        ":tbody", 0,
        ":td", 0,
        ":tdlist", 0,
        ":thead", 0,
        ":title", 0,
        ":tr", 0,
        ":trlist", 0
      ),
      ":constmap", Core.t_intmap.vx_new(
  
      ),
      ":funcmap", Core.t_intmap.vx_new(
        ":htmlstring<-string", 0,
        ":string-indent", 0,
        ":string<-body-indent", 2,
        ":string<-details-indent", 0,
        ":string<-div-indent", 2,
        ":string<-footer-indent", 0,
        ":string<-h1-indent", 0,
        ":string<-h2-indent", 0,
        ":string<-h3-indent", 0,
        ":string<-head-indent", 1,
        ":string<-html", 1,
        ":string<-indent", 0,
        ":string<-meta-indent", 1,
        ":string<-node-indent", 0,
        ":string<-nodelist-indent", 0,
        ":string<-nodelist-tag-prop-indent", 0,
        ":string<-p-indent", 2,
        ":string<-propname-val", 0,
        ":string<-propstyle", 0,
        ":string<-style-indent", 0,
        ":string<-stylelist-indent", 0,
        ":string<-stylepropmap-indent", 0,
        ":string<-stylesheet-indent", 0,
        ":string<-table-indent", 0,
        ":string<-tbody-indent", 0,
        ":string<-td-indent", 0,
        ":string<-thead-indent", 0,
        ":string<-title-indent", 0,
        ":string<-tr-indent", 0,
        ":string<-uri", 0,
        ":style<-stylesheet-name", 0,
        ":stylemap<-stylelist", 0,
        ":stylemap<-stylesheet", 0,
        ":styles<-stylesheet", 0,
        ":stylesheet-loadmap", 0,
        ":uri<-string", 0
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "vx/web/html", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
