'strict mode'

import vx_util_randomize from "../../../src/vx/util/randomize.js"
import vx_core from "../../../src/vx/core.js"
import vx_test from "../../../src/vx/test.js"

export default class vx_util_randomize_test {


  static test_package(context) {
    const testcaselist = vx_util_randomize_test.test_cases(context)
    const output = vx_core.f_new_from_type(
      vx_test.t_testpackage,
      ":testpkg", "vx/util/randomize",
      ":caselist", testcaselist,
      ":coveragesummary", vx_util_randomize_test.test_coveragesummary(),
      ":coveragedetail", vx_util_randomize_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragesummary,
      "testpkg",   "vx/util/randomize", 
      "constnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 2, ":total", 2), 
      "funcnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 2), 
      "bigospacenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 2), 
      "typenums", vx_core.f_new_from_type(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0)
    )
    return output
  }

  static test_coveragedetail() {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcoveragedetail,
      "testpkg", "vx/util/randomize",
      "typemap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "constmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap
        ),
      "funcmap",
        vx_core.f_new_from_type(
          vx_core.t_intmap,
          "randomize", 0,
          "rolldice", 0
        )
    )
    return output
  }

  static test_cases(context) {
    const output = vx_core.f_new_from_type(
      vx_test.t_testcaselist
    )
    return output
  }
}
