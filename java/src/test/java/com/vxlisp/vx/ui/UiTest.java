
package com.vxlisp.vx.ui;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.vxlisp.vx.*;

public final class UiTest {

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "vx/ui/ui", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 16), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 33, ":tests", 9, ":total", 27), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 4), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 4), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 4), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 27), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 0, ":total", 7)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "vx/ui/ui",
      ":typemap", Core.t_intmap.vx_new(
        ":render", 0,
        ":renderer", 0,
        ":rendermap", 0,
        ":ui", 0,
        ":uilayout", 0,
        ":uimap", 0,
        ":uistyle", 0
      ),
      ":constmap", Core.t_intmap.vx_new(
        ":uilayout-app", 0,
        ":uilayout-background", 0,
        ":uilayout-combobox", 0,
        ":uilayout-flow-horizontal", 0,
        ":uilayout-flow-vertical", 0,
        ":uilayout-image", 0,
        ":uilayout-navigation", 0,
        ":uilayout-panel", 0,
        ":uilayout-parallax", 0,
        ":uilayout-scrollbox", 0,
        ":uilayout-scrollbox-horizontal", 0,
        ":uilayout-scrollbox-vertical", 0,
        ":uilayout-split-horizontal", 0,
        ":uilayout-split-vertical", 0,
        ":uilayout-text", 0,
        ":uilayout-textentry", 0
      ),
      ":funcmap", Core.t_intmap.vx_new(
        ":render<-ui", 0,
        ":render<-ui-orig", 0,
        ":rendermap<-uimap", 0,
        ":ui-render<-ui-orig", 0
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "vx/ui/ui", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
