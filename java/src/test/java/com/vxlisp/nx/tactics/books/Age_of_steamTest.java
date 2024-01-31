
package com.vxlisp.nx.tactics.books;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Age_of_steamTest {

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "nx/tactics/books/age_of_steam", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 8), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 8), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 8), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 8), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 8), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "nx/tactics/books/age_of_steam",
      ":typemap", Core.t_intmap.vx_new(
  
      ),
      ":constmap", Core.t_intmap.vx_new(
  
      ),
      ":funcmap", Core.t_intmap.vx_new(
        ":chapter_age_of_steam_equipment", 0,
        ":chapter_age_of_steam_overview", 0,
        ":chapter_civil_war", 0,
        ":chapter_examples_of_play", 0,
        ":chapter_steam_age_maps", 0,
        ":chapter_victorian_england", 0,
        ":chapter_wild_west", 0,
        ":tacticsbook", 0
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "nx/tactics/books/age_of_steam", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
