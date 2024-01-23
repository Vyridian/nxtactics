
package com.vxlisp.nx.tactics;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;

public final class DamageTest {

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "nx/tactics/damage", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 27), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 35, ":tests", 10, ":total", 28), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 28), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 1)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "nx/tactics/damage",
      ":typemap", Core.t_intmap.vx_new(
        ":wound", 0
      ),
      ":constmap", Core.t_intmap.vx_new(
        ":breakdown", 0,
        ":duress", 0,
        ":fatigue", 0,
        ":irrationaldeck", 0,
        ":stagger", 0,
        ":stress", 0,
        ":trauma", 0,
        ":unwillingdeck", 0,
        ":wound-ca", 0,
        ":wound-da", 0,
        ":wound-ha", 0,
        ":wound-j1", 0,
        ":wound-j2", 0,
        ":wound-s10", 0,
        ":wound-s2", 0,
        ":wound-s3", 0,
        ":wound-s4", 0,
        ":wound-s5", 0,
        ":wound-s6", 0,
        ":wound-s7", 0,
        ":wound-s8", 0,
        ":wound-s9", 0,
        ":wound-sa", 0,
        ":wound-sj", 0,
        ":wound-sk", 0,
        ":wound-sq", 0,
        ":wounddeck", 0
      ),
      ":funcmap", Core.t_intmap.vx_new(
  
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "nx/tactics/damage", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
