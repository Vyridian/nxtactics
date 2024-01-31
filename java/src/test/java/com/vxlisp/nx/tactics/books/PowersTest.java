
package com.vxlisp.nx.tactics.books;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class PowersTest {

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "nx/tactics/books/powers", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 13), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 13), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 13), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 13), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 13), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "nx/tactics/books/powers",
      ":typemap", Core.t_intmap.vx_new(
  
      ),
      ":constmap", Core.t_intmap.vx_new(
  
      ),
      ":funcmap", Core.t_intmap.vx_new(
        ":chapter_alteration_powers", 0,
        ":chapter_body_powers", 0,
        ":chapter_energy_and_forces", 0,
        ":chapter_enhancement_powers", 0,
        ":chapter_equipment_powers", 0,
        ":chapter_godlike_powers", 0,
        ":chapter_mental_powers_and_weaknesses", 0,
        ":chapter_movement_powers", 0,
        ":chapter_physical_powers_and_weaknesses", 0,
        ":chapter_powers_overview", 0,
        ":chapter_special_modifiers", 0,
        ":chapter_strength_and_weaknesses", 0,
        ":tacticsbook", 0
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "nx/tactics/books/powers", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
