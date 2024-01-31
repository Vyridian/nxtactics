
package com.vxlisp.nx.tactics.books;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class World_warsTest {

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "nx/tactics/books/world_wars", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 28), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 28), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 28), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 28), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 28), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "nx/tactics/books/world_wars",
      ":typemap", Core.t_intmap.vx_new(
  
      ),
      ":constmap", Core.t_intmap.vx_new(
  
      ),
      ":funcmap", Core.t_intmap.vx_new(
        ":chapter_world_wars_overview", 0,
        ":chapter_wwi_british_forces", 0,
        ":chapter_wwi_campaign", 0,
        ":chapter_wwi_french_forces", 0,
        ":chapter_wwi_german_forces", 0,
        ":chapter_wwii_american_equipment", 0,
        ":chapter_wwii_american_units", 0,
        ":chapter_wwii_british_equipment", 0,
        ":chapter_wwii_british_units", 0,
        ":chapter_wwii_east_african_theatre", 0,
        ":chapter_wwii_eastern_front", 0,
        ":chapter_wwii_equipment", 0,
        ":chapter_wwii_french_equipment", 0,
        ":chapter_wwii_french_units", 0,
        ":chapter_wwii_german_equipment", 0,
        ":chapter_wwii_german_units", 0,
        ":chapter_wwii_italian_units", 0,
        ":chapter_wwii_japanese_equipment", 0,
        ":chapter_wwii_japanese_units", 0,
        ":chapter_wwii_mediterranean_theatre", 0,
        ":chapter_wwii_middle_east_theatre", 0,
        ":chapter_wwii_north_african_theatre", 0,
        ":chapter_wwii_overview", 0,
        ":chapter_wwii_pacific_theatre", 0,
        ":chapter_wwii_soviet_equipment", 0,
        ":chapter_wwii_soviet_units", 0,
        ":chapter_wwii_western_front", 0,
        ":tacticsbook", 0
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "nx/tactics/books/world_wars", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
