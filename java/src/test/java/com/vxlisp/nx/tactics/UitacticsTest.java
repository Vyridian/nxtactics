
package com.vxlisp.nx.tactics;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;
import com.vxlisp.vx.ui.*;

public final class UitacticsTest {

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "nx/tactics/uitactics", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 22, ":tests", 5, ":total", 22), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 22), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 22), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 22), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 22), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 100, ":tests", 0, ":total", 0)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "nx/tactics/uitactics",
      ":typemap", Core.t_intmap.vx_new(
  
      ),
      ":constmap", Core.t_intmap.vx_new(
  
      ),
      ":funcmap", Core.t_intmap.vx_new(
        ":ui-app", 0,
        ":ui-app-background", 0,
        ":ui-app-main", 0,
        ":ui-app-main-style", 0,
        ":ui-app-menubar", 0,
        ":ui-app-menudrawer", 0,
        ":ui-app-msgbox", 0,
        ":ui-app-navbar", 0,
        ":ui-app-navdrawer", 0,
        ":ui-app-parallax", 0,
        ":ui-app-statusbar", 0,
        ":ui-app-statusdrawer", 0,
        ":ui-app-style", 0,
        ":ui-app-stylesheet", 0,
        ":ui-app<-tactics", 0,
        ":ui-unit", 0,
        ":ui-unit-background", 0,
        ":ui-unit-flavor", 0,
        ":ui-unit-header", 0,
        ":ui-unit-skillpower", 0,
        ":ui-unit-stat", 0,
        ":ui-unit-style", 0
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "nx/tactics/uitactics", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
