
package com.vxlisp.nx.tactics.books;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class AncientsTest {

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "nx/tactics/books/ancients", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 14), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 14), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 14), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 14), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 14), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "nx/tactics/books/ancients",
      ":typemap", Core.t_intmap.vx_new(
  
      ),
      ":constmap", Core.t_intmap.vx_new(
  
      ),
      ":funcmap", Core.t_intmap.vx_new(
        ":chapter_ancients_overview", 0,
        ":chapter_ancients_scenarios", 0,
        ":chapter_anglo_saxons", 0,
        ":chapter_carthaginians", 0,
        ":chapter_chinese_dynasty", 0,
        ":chapter_egyptian_dynasty", 0,
        ":chapter_germanic_tribes", 0,
        ":chapter_greek_city_states", 0,
        ":chapter_macedon", 0,
        ":chapter_norsemen", 0,
        ":chapter_persians", 0,
        ":chapter_roman_empire", 0,
        ":chapter_unfiled_ancient", 0,
        ":tacticsbook", 0
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "nx/tactics/books/ancients", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
