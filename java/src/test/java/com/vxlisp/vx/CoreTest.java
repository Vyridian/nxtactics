
package com.vxlisp.vx;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public final class CoreTest {

  static Test.Type_testcase t_boolean(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "boolean",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true true)",
          ":testresult",
            Test.f_test_true(
              context,
              Core.vx_new_boolean(true)
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false false)",
          ":testresult",
            Test.f_test_false(
              context,
              Core.vx_new_boolean(false)
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (boolean true))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_new(
                Core.t_boolean,
                Core.t_anylist.vx_new(
                  Core.vx_new_boolean(true)
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false (boolean false))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_new(
                Core.t_boolean,
                Core.t_anylist.vx_new(
                  Core.vx_new_boolean(false)
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase t_float(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "float",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 4.5 (float 4.5))",
          ":testresult",
            Test.f_test(
              context,
              Core.t_decimal.vx_new_from_string("4.5"),
              Core.f_new(
                Core.t_float,
                Core.t_anylist.vx_new(
                  Core.t_decimal.vx_new_from_string("4.5")
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase t_int(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "int",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true  (is-int 4))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_int(Core.vx_new_int(4))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true  (is-int \"4\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_int(Core.vx_new_string("4"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true  (is-int infinity))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_int(
                Core.c_infinity
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true  (is-int neginfinity))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_int(
                Core.c_neginfinity
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true  (is-int notanumber))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_int(
                Core.c_notanumber
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false (is-int \"a\"))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_is_int(Core.vx_new_string("a"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false (is-int 5.5))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_is_int(Core.t_decimal.vx_new_from_string("5.5"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase t_string(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "string",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"a\" (string \"a\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("a"),
              Core.f_new(
                Core.t_string,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("a")
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"ab\" (string \"a\" \"b\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("ab"),
              Core.f_new(
                Core.t_string,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("a"),
                  Core.vx_new_string("b")
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase c_false(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "false",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false false)",
          ":testresult",
            Test.f_test_false(
              context,
              Core.vx_new_boolean(false)
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase c_true(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "true",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true true)",
          ":testresult",
            Test.f_test_true(
              context,
              Core.vx_new_boolean(true)
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_not(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "!",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false false)",
          ":testresult",
            Test.f_test_false(
              context,
              Core.vx_new_boolean(false)
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false (! true))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_not(
                Core.vx_new_boolean(true)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_ne(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "!=",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-ne true false)",
          ":testresult",
            Test.f_test_ne(
              context,
              Core.vx_new_boolean(true),
              Core.vx_new_boolean(false)
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-ne \"a\" \"b\")",
          ":testresult",
            Test.f_test_ne(context, Core.vx_new_string("a"), Core.vx_new_string("b"))
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_multiply(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "*",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 6 (* 3 2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(6),
              Core.f_multiply(Core.vx_new_int(3), Core.vx_new_int(2))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test -10 (* 5 -2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(-10),
              Core.f_multiply(Core.vx_new_int(5), Core.vx_new_int(-2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_multiply_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "*_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 6.4 (* 3.2 2))",
          ":testresult",
            Test.f_test(
              context,
              Core.t_decimal.vx_new_from_string("6.4"),
              Core.f_multiply_1(Core.t_decimal.vx_new_from_string("3.2"), Core.vx_new_int(2))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test -10.2 (* 5.1 -2))",
          ":testresult",
            Test.f_test(
              context,
              Core.t_decimal.vx_new_from_string("-10.2"),
              Core.f_multiply_1(Core.t_decimal.vx_new_from_string("5.1"), Core.vx_new_int(-2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_multiply_2(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "*_2",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 24 (* 3 2 4))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(24),
              Core.f_multiply_2(
                Core.t_intlist.vx_new(
                  Core.vx_new_int(3),
                  Core.vx_new_int(2),
                  Core.vx_new_int(4)
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test -20 (* 5 -2 2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(-20),
              Core.f_multiply_2(
                Core.t_intlist.vx_new(
                  Core.vx_new_int(5),
                  Core.vx_new_int(-2),
                  Core.vx_new_int(2)
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_multiply_3(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "*_3",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 24 (* 3 2 4))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(24),
              Core.f_multiply_2(
                Core.t_intlist.vx_new(
                  Core.vx_new_int(3),
                  Core.vx_new_int(2),
                  Core.vx_new_int(4)
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test -20 (* 5 -2 2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(-20),
              Core.f_multiply_2(
                Core.t_intlist.vx_new(
                  Core.vx_new_int(5),
                  Core.vx_new_int(-2),
                  Core.vx_new_int(2)
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_plus(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "+",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 5 (+ 2 3))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(5),
              Core.f_plus(Core.vx_new_int(2), Core.vx_new_int(3))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test 3 (+ 5 -2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(3),
              Core.f_plus(Core.vx_new_int(5), Core.vx_new_int(-2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_plus_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "+_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 5 (+ 2  3))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(5),
              Core.f_plus(Core.vx_new_int(2), Core.vx_new_int(3))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test 3 (+ 5 -2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(3),
              Core.f_plus(Core.vx_new_int(5), Core.vx_new_int(-2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_plus1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "+1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test  3 (+1  2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(3),
              Core.f_plus1(Core.vx_new_int(2))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test -1 (+1 -2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(-1),
              Core.f_plus1(Core.vx_new_int(-2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_minus(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "-",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 1 (- 3 2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(1),
              Core.f_minus(Core.vx_new_int(3), Core.vx_new_int(2))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test 7 (- 5 -2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(7),
              Core.f_minus(Core.vx_new_int(5), Core.vx_new_int(-2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_minus_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "-_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 5 (+ 2 3))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(5),
              Core.f_plus(Core.vx_new_int(2), Core.vx_new_int(3))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test 3 (+ 5 -2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(3),
              Core.f_plus(Core.vx_new_int(5), Core.vx_new_int(-2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_minus1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "-1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test  1 (-1  2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(1),
              Core.f_minus1(Core.vx_new_int(2))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test -3 (-1 -2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(-3),
              Core.f_minus1(Core.vx_new_int(-2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_divide(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "/",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 3 (/ 6 2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(3),
              Core.f_divide(Core.vx_new_int(6), Core.vx_new_int(2))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test -5 (/ 10 -2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(-5),
              Core.f_divide(Core.vx_new_int(10), Core.vx_new_int(-2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_lt(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "<",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (< 2 3))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_lt(Core.vx_new_int(2), Core.vx_new_int(3))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_lt_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "<_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (< 2 3))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_lt(Core.vx_new_int(2), Core.vx_new_int(3))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (< \"b\" \"d\" \"z\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_lt_1(
                Core.t_anylist.vx_new(
                  Core.vx_new_string("b"),
                  Core.vx_new_string("d"),
                  Core.vx_new_string("z")
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_chainfirst(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "<-",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (*\n  (+\n   (- 5 3)\n   3)\n  2)\n (<-\n  5\n  (- 3)\n  (+ 3)\n  (* 2)))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_multiply(
                Core.f_plus(
                  Core.f_minus(Core.vx_new_int(5), Core.vx_new_int(3)),
                  Core.vx_new_int(3)
                ),
                Core.vx_new_int(2)
              ),
              Core.f_multiply(
                Core.f_plus(
                  Core.f_minus(Core.vx_new_int(5), Core.vx_new_int(3)),
                  Core.vx_new_int(3)
                ),
                Core.vx_new_int(2)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_chainlast(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "<<-",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (* (+ (- 3 5) 3) 2)\n (<<-\n  5\n  (- 3)\n  (+ 3)\n  (* 2)))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_multiply(
                Core.f_plus(
                  Core.f_minus(Core.vx_new_int(3), Core.vx_new_int(5)),
                  Core.vx_new_int(3)
                ),
                Core.vx_new_int(2)
              ),
              Core.f_multiply(
                Core.vx_new_int(2),
                Core.f_plus(
                  Core.vx_new_int(3),
                  Core.f_minus(Core.vx_new_int(3), Core.vx_new_int(5))
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_le(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "<=",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (<= 2 3))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_le(Core.vx_new_int(2), Core.vx_new_int(3))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_le_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "<=_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (<= \"b\" \"d\" \"z\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_le_1(
                Core.t_anylist.vx_new(
                  Core.vx_new_string("b"),
                  Core.vx_new_string("d"),
                  Core.vx_new_string("z")
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_eq(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "=",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (= true true))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_eq(
                Core.vx_new_boolean(true),
                Core.vx_new_boolean(true)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (= 2 2))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_eq(Core.vx_new_int(2), Core.vx_new_int(2))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (= \"a\" \"a\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_eq(Core.vx_new_string("a"), Core.vx_new_string("a"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (=\n  (stringlist \"a\" \"b\" \"c\")\n  (new stringlist \"a\" \"b\" \"c\")))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_eq(
                Core.f_new(
                  Core.t_stringlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("a"),
                    Core.vx_new_string("b"),
                    Core.vx_new_string("c")
                  )
                ),
                Core.f_new(
                  Core.t_stringlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("a"),
                    Core.vx_new_string("b"),
                    Core.vx_new_string("c")
                  )
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (=\n  (stringmap :a \"1\" :b \"2\")\n  (new stringmap :a \"1\" :b \"2\")))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_eq(
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":a"),
                    Core.vx_new_string("1"),
                    Core.vx_new_string(":b"),
                    Core.vx_new_string("2")
                  )
                ),
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":a"),
                    Core.vx_new_string("1"),
                    Core.vx_new_string(":b"),
                    Core.vx_new_string("2")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_eq_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "=_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false (= 2 2 3))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_eq_1(
                Core.t_anylist.vx_new(
                  Core.vx_new_int(2),
                  Core.vx_new_int(2),
                  Core.vx_new_int(3)
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_eqeq(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "==",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (== 0 0))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_eqeq(Core.vx_new_int(0), Core.vx_new_int(0))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (== \"\" \"\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_eqeq(Core.vx_new_string(""), Core.vx_new_string(""))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_gt(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", ">",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (> 3 2))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_gt(Core.vx_new_int(3), Core.vx_new_int(2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_gt_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", ">_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (> \"z\" \"y\" \"b\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_gt_1(
                Core.t_anylist.vx_new(
                  Core.vx_new_string("z"),
                  Core.vx_new_string("y"),
                  Core.vx_new_string("b")
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_ge(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", ">=",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (>= 3 2))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_ge(Core.vx_new_int(3), Core.vx_new_int(2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_ge_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", ">=_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (>= \"z\" \"b\" \"b\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_ge_1(
                Core.t_anylist.vx_new(
                  Core.vx_new_string("z"),
                  Core.vx_new_string("b"),
                  Core.vx_new_string("b")
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_and(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "and",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (and true true))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_and(
                Core.vx_new_boolean(true),
                Core.vx_new_boolean(true)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false\n (and true false))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_and(
                Core.vx_new_boolean(true),
                Core.vx_new_boolean(false)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_and_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "and_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (and true true true))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_and_1(
                Core.t_booleanlist.vx_new(
                  Core.vx_new_boolean(true),
                  Core.vx_new_boolean(true),
                  Core.vx_new_boolean(true)
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false\n (and true true false))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_and_1(
                Core.t_booleanlist.vx_new(
                  Core.vx_new_boolean(true),
                  Core.vx_new_boolean(true),
                  Core.vx_new_boolean(false)
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_any_from_list(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "any<-list",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"b\"\n (any<-list\n  (list \"a\" \"b\" \"c\")\n  2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("b"),
              Core.f_any_from_list(
                Core.t_any,
                Core.f_new(
                  Core.t_list,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("a"),
                    Core.vx_new_string("b"),
                    Core.vx_new_string("c")
                  )
                ),
                Core.vx_new_int(2)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"b\"\n (:2 (stringlist \"a\" \"b\" \"c\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("b"),
              Core.f_any_from_list(
                Core.t_string,
                Core.f_new(
                  Core.t_stringlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("a"),
                    Core.vx_new_string("b"),
                    Core.vx_new_string("c")
                  )
                ),
                Core.vx_new_int(2)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_any_from_list_start_reduce(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "any<-list-start-reduce",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n 24\n (any<-list-start-reduce : int\n  (intlist 3 2 4)\n  1\n  (fn : int\n   [total : int\n    num   : int]\n   (* total num))))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(24),
              Core.f_any_from_list_start_reduce(
                Core.t_int,
                Core.f_new(
                  Core.t_intlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_int(3),
                    Core.vx_new_int(2),
                    Core.vx_new_int(4)
                  )
                ),
                Core.vx_new_int(1),
                Core.t_any_from_reduce.vx_fn_new((total_any, num_any) -> {
                  Core.Type_int total = Core.f_any_from_any(Core.t_int, total_any);
                  Core.Type_int num = Core.f_any_from_any(Core.t_int, num_any);
                  return 
                    Core.f_multiply(total, num);
                })
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_any_from_map(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "any<-map",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"v2\"\n (any<-map\n  (map\n   :a \"v1\"\n   :b \"v2\"\n   :c \"v3\")\n  :b))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("v2"),
              Core.f_any_from_map(
                Core.t_any,
                Core.f_new(
                  Core.t_map,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":a"),
                    Core.vx_new_string("v1"),
                    Core.vx_new_string(":b"),
                    Core.vx_new_string("v2"),
                    Core.vx_new_string(":c"),
                    Core.vx_new_string("v3")
                  )
                ),
                Core.vx_new_string(":b")
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_any_from_map_start_reduce(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "any<-map-start-reduce",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"xayb\"\n (any<-map-start-reduce\n  (stringmap\n   :a \"x\"\n   :b \"y\")\n  \"\"\n  (fn : string\n   [current : string\n    key     : string\n    value   : any]\n   (copy current\n    value\n    key))))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("xayb"),
              Core.f_any_from_map_start_reduce(
                Core.t_string,
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":a"),
                    Core.vx_new_string("x"),
                    Core.vx_new_string(":b"),
                    Core.vx_new_string("y")
                  )
                ),
                Core.vx_new_string(""),
                Core.t_any_from_any_key_value.vx_fn_new((current_any, key_any, value_any) -> {
                  Core.Type_string current = Core.f_any_from_any(Core.t_string, current_any);
                  Core.Type_string key = Core.f_any_from_any(Core.t_string, key_any);
                  Core.Type_any value = Core.f_any_from_any(Core.t_any, value_any);
                  return 
                    Core.f_copy(
                      current,
                      Core.t_anylist.vx_new(
                        value,
                        key
                      )
                    );
                })
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_compare(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "compare",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 1 (compare 3 2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(1),
              Core.f_compare(Core.vx_new_int(3), Core.vx_new_int(2))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test 1 (compare \"z\" \"a\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(1),
              Core.f_compare(Core.vx_new_string("z"), Core.vx_new_string("a"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_contains(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "contains",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true  (contains \"abcde\" \"cd\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_contains(Core.vx_new_string("abcde"), Core.vx_new_string("cd"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false (contains \"abcde\" \"dc\"))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_contains(Core.vx_new_string("abcde"), Core.vx_new_string("dc"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_contains_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "contains_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (contains (stringlist \"1\" \"2\" \"3\") \"2\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_contains_1(
                Core.f_new(
                  Core.t_stringlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("1"),
                    Core.vx_new_string("2"),
                    Core.vx_new_string("3")
                  )
                ),
                Core.vx_new_string("2")
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (contains (intlist 1 2 3) 2))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_contains_1(
                Core.f_new(
                  Core.t_intlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_int(1),
                    Core.vx_new_int(2),
                    Core.vx_new_int(3)
                  )
                ),
                Core.vx_new_int(2)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false\n (contains (list 1 \"2\" 3) 2))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_contains_1(
                Core.f_new(
                  Core.t_list,
                  Core.t_anylist.vx_new(
                    Core.vx_new_int(1),
                    Core.vx_new_string("2"),
                    Core.vx_new_int(3)
                  )
                ),
                Core.vx_new_int(2)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_copy(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "copy",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (stringmap\n  :a \"1\"\n  :b \"2\")\n (copy (stringmap :a \"1\")\n  :b \"2\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Core.t_stringmap,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":a"),
                  Core.vx_new_string("1"),
                  Core.vx_new_string(":b"),
                  Core.vx_new_string("2")
                )
              ),
              Core.f_copy(
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":a"),
                    Core.vx_new_string("1")
                  )
                ),
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":b"),
                  Core.vx_new_string("2")
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_empty(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "empty",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"\"     (empty string))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string(""),
              Core.f_empty(
                Core.t_string
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test (list) (empty list))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_empty(
                Core.t_list
              ),
              Core.f_empty(
                Core.t_list
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test (map)  (empty map))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_empty(
                Core.t_map
              ),
              Core.f_empty(
                Core.t_map
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_first_from_list(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "first<-list",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"b\"\n (first<-list\n  (stringlist \"b\" \"c\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("b"),
              Core.f_first_from_list(
                Core.t_string,
                Core.f_new(
                  Core.t_stringlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("b"),
                    Core.vx_new_string("c")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_first_from_list_any_from_any(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "first<-list-any<-any",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"b\"\n (first<-list-any<-any\n  (list nothing \"b\" \"c\")\n  resolve))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("b"),
              Core.f_first_from_list_any_from_any(
                Core.t_any,
                Core.f_new(
                  Core.t_list,
                  Core.t_anylist.vx_new(
                    Core.c_nothing,
                    Core.vx_new_string("b"),
                    Core.vx_new_string("c")
                  )
                ),
                Core.t_resolve
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_float_from_string(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "float<-string",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (float 2.3)\n (float<-string\n  \"2.3\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Core.t_float,
                Core.t_anylist.vx_new(
                  Core.t_decimal.vx_new_from_string("2.3")
                )
              ),
              Core.f_float_from_string(Core.vx_new_string("2.3"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_if(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "if",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"a\"\n (if (= 2 2) \"a\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("a"),
              Core.f_if(
                Core.t_string,
                Core.f_eq(Core.vx_new_int(2), Core.vx_new_int(2)),
                Core.vx_new_string("a")
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"\"\n (if : string\n  (= 1 2)\n  \"a\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string(""),
              Core.f_if(
                Core.t_string,
                Core.f_eq(Core.vx_new_int(1), Core.vx_new_int(2)),
                Core.vx_new_string("a")
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_if_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "if_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"a\"\n (if\n  (= 2 2)\n  \"a\"\n  \"b\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("a"),
              Core.f_if_1(
                Core.t_string,
                Core.f_eq(Core.vx_new_int(2), Core.vx_new_int(2)),
                Core.vx_new_string("a"),
                Core.vx_new_string("b")
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"b\"\n (if\n  (= 1 2)\n  \"a\"\n  \"b\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("b"),
              Core.f_if_1(
                Core.t_string,
                Core.f_eq(Core.vx_new_int(1), Core.vx_new_int(2)),
                Core.vx_new_string("a"),
                Core.vx_new_string("b")
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_if_2(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "if_2",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (if\n  (then (= 2 3) false)\n  (then (!= 3 3) false)\n  (else (! false))))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_if_2(
                Core.t_any,
                Core.t_thenelselist.vx_new(
                  Core.f_then(
                    Core.t_boolean_from_func.vx_fn_new(() -> {
                      return Core.f_eq(Core.vx_new_int(2), Core.vx_new_int(3));
                    }),
                    Core.t_any_from_func.vx_fn_new(() -> {
                      return Core.vx_new_boolean(false);
                    })
                  ),
                  Core.f_then(
                    Core.t_boolean_from_func.vx_fn_new(() -> {
                      return Core.f_ne(Core.vx_new_int(3), Core.vx_new_int(3));
                    }),
                    Core.t_any_from_func.vx_fn_new(() -> {
                      return Core.vx_new_boolean(false);
                    })
                  ),
                  Core.f_else(
                    Core.t_any_from_func.vx_fn_new(() -> {
                      return Core.f_not(
                        Core.vx_new_boolean(false)
                      );
                    })
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_int_from_string(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "int<-string",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 4 (int<-string \"4\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(4),
              Core.f_int_from_string(Core.vx_new_string("4"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test 5 (int<-string \"5.4\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(5),
              Core.f_int_from_string(Core.vx_new_string("5.4"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test 5 (int<-string \"5.9\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(5),
              Core.f_int_from_string(Core.vx_new_string("5.9"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test notanumber  (int<-string \"notanumber\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.c_notanumber,
              Core.f_int_from_string(Core.vx_new_string("notanumber"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test infinity    (int<-string \"infinity\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.c_infinity,
              Core.f_int_from_string(Core.vx_new_string("infinity"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test neginfinity (int<-string \"neginfinity\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.c_neginfinity,
              Core.f_int_from_string(Core.vx_new_string("neginfinity"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_is_empty_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "is-empty_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (is-empty \"\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_empty(Core.vx_new_string(""))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (is-empty (list)))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_empty_1(
                Core.f_empty(
                  Core.t_list
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (is-empty (map)))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_empty_1(
                Core.f_empty(
                  Core.t_map
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_is_int(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "is-int",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (is-int 2))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_int(Core.vx_new_int(2))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (is-int \"2\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_int(Core.vx_new_string("2"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (is-int infinity))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_int(
                Core.c_infinity
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true\n (is-int \"infinity\"))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_int(Core.vx_new_string("infinity"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_is_number(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "is-number",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true  (is-number 5))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_number(Core.vx_new_int(5))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true  (is-number 5.5))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_is_number(Core.t_decimal.vx_new_from_string("5.5"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false (is-number \"a\"))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_is_number(Core.vx_new_string("a"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_last_from_list(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "last<-list",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"c\" (last<-list (list \"b\" \"c\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("c"),
              Core.f_last_from_list(
                Core.t_any,
                Core.f_new(
                  Core.t_list,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("b"),
                    Core.vx_new_string("c")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_length_from_list(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "length<-list",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 3 (length<-list (stringlist \"a\" \"b\" \"c\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(3),
              Core.f_length_from_list(
                Core.f_new(
                  Core.t_stringlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("a"),
                    Core.vx_new_string("b"),
                    Core.vx_new_string("c")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_let(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "let",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n 7\n (let\n  [v1 : int := 2\n   v2 : int := (+ v1 3)]\n  (+ v1 v2)))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(7),
              Core.f_let(
                Core.t_int,
                Core.t_any_from_func.vx_fn_new(() -> {
                  final Core.Type_int v1 = Core.vx_new_int(2);
                  final Core.Type_int v2 = Core.f_plus(v1, Core.vx_new_int(3));
                  return Core.f_plus(v1, v2);
                })
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_list_from_map(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "list<-map",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (stringlist \"a1\" \"b2\")\n (list<-map : stringlist\n  (stringmap \"a\" \"1\" \"b\" \"2\")\n  (fn : string\n   [key : string\n    val : string]\n   (string key val))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Core.t_stringlist,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("a1"),
                  Core.vx_new_string("b2")
                )
              ),
              Core.f_list_from_map(
                Core.t_stringlist,
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("a"),
                    Core.vx_new_string("1"),
                    Core.vx_new_string("b"),
                    Core.vx_new_string("2")
                  )
                ),
                Core.t_any_from_key_value.vx_fn_new((key_any, val_any) -> {
                  Core.Type_string key = Core.f_any_from_any(Core.t_string, key_any);
                  Core.Type_string val = Core.f_any_from_any(Core.t_string, val_any);
                  return 
                    Core.f_new(
                      Core.t_string,
                      Core.t_anylist.vx_new(
                        key,
                        val
                      )
                    );
                })
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_map_from_list(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "map<-list",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (stringmap\n  \"keya\" \"a\"\n  \"keyb\" \"b\")\n (map<-list : stringmap\n  (stringlist \"a\" \"b\")\n  (fn : string\n   [val : string]\n   (string \"key\" val))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Core.t_stringmap,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("keya"),
                  Core.vx_new_string("a"),
                  Core.vx_new_string("keyb"),
                  Core.vx_new_string("b")
                )
              ),
              Core.f_map_from_list(
                Core.t_stringmap,
                Core.f_new(
                  Core.t_stringlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("a"),
                    Core.vx_new_string("b")
                  )
                ),
                Core.t_any_from_any.vx_fn_new((val_any) -> {
                  Core.Type_string val = Core.f_any_from_any(Core.t_string, val_any);
                  return 
                    Core.f_new(
                      Core.t_string,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string("key"),
                        val
                      )
                    );
                })
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_map_from_map(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "map<-map",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (stringmap\n  :a \"a1\"\n  :b \"b2\")\n (map<-map : stringmap\n  (stringmap\n   :a \"1\"\n   :b \"2\")\n  (fn : string\n   [key : string\n    val : string]\n   (string key val))))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Core.t_stringmap,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":a"),
                  Core.vx_new_string("a1"),
                  Core.vx_new_string(":b"),
                  Core.vx_new_string("b2")
                )
              ),
              Core.f_map_from_map(
                Core.t_stringmap,
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":a"),
                    Core.vx_new_string("1"),
                    Core.vx_new_string(":b"),
                    Core.vx_new_string("2")
                  )
                ),
                Core.t_any_from_key_value.vx_fn_new((key_any, val_any) -> {
                  Core.Type_string key = Core.f_any_from_any(Core.t_string, key_any);
                  Core.Type_string val = Core.f_any_from_any(Core.t_string, val_any);
                  return 
                    Core.f_new(
                      Core.t_string,
                      Core.t_anylist.vx_new(
                        key,
                        val
                      )
                    );
                })
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_new(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "new",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test true (new boolean true))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_boolean(true),
              Core.f_new(
                Core.t_boolean,
                Core.t_anylist.vx_new(
                  Core.vx_new_boolean(true)
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test 4 (new int 4))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(4),
              Core.f_new(
                Core.t_int,
                Core.t_anylist.vx_new(
                  Core.vx_new_int(4)
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test 5.4 (new float 5.4))",
          ":testresult",
            Test.f_test(
              context,
              Core.t_decimal.vx_new_from_string("5.4"),
              Core.f_new(
                Core.t_float,
                Core.t_anylist.vx_new(
                  Core.t_decimal.vx_new_from_string("5.4")
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"a\" (new string \"a\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("a"),
              Core.f_new(
                Core.t_string,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("a")
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (stringlist \"a\" \"b\" \"c\")\n (new stringlist \"a\" \"b\" \"c\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Core.t_stringlist,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("a"),
                  Core.vx_new_string("b"),
                  Core.vx_new_string("c")
                )
              ),
              Core.f_new(
                Core.t_stringlist,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("a"),
                  Core.vx_new_string("b"),
                  Core.vx_new_string("c")
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n (stringmap :a \"1\" :b \"2\")\n (new stringmap :a \"1\" :b \"2\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.f_new(
                Core.t_stringmap,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":a"),
                  Core.vx_new_string("1"),
                  Core.vx_new_string(":b"),
                  Core.vx_new_string("2")
                )
              ),
              Core.f_new(
                Core.t_stringmap,
                Core.t_anylist.vx_new(
                  Core.vx_new_string(":a"),
                  Core.vx_new_string("1"),
                  Core.vx_new_string(":b"),
                  Core.vx_new_string("2")
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_or(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "or",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (or true true))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_or(
                Core.vx_new_boolean(true),
                Core.vx_new_boolean(true)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (or true false))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_or(
                Core.vx_new_boolean(true),
                Core.vx_new_boolean(false)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false (or false false))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_or(
                Core.vx_new_boolean(false),
                Core.vx_new_boolean(false)
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_or_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "or_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test-true (or false true false))",
          ":testresult",
            Test.f_test_true(
              context,
              Core.f_or_1(
                Core.t_booleanlist.vx_new(
                  Core.vx_new_boolean(false),
                  Core.vx_new_boolean(true),
                  Core.vx_new_boolean(false)
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test-false (or false false false))",
          ":testresult",
            Test.f_test_false(
              context,
              Core.f_or_1(
                Core.t_booleanlist.vx_new(
                  Core.vx_new_boolean(false),
                  Core.vx_new_boolean(false),
                  Core.vx_new_boolean(false)
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_resolve(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "resolve",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"a\" (resolve \"a\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("a"),
              Core.f_resolve(Core.t_string, Core.vx_new_string("a"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_resolve_1(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "resolve_1",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 4 (resolve (fn : int [] (+ 1 3))))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(4),
              Core.f_resolve_1(
                Core.t_int,
                Core.t_any_from_func.vx_fn_new(() -> {
                  
                  return 
                    Core.f_plus(Core.vx_new_int(1), Core.vx_new_int(3));
                })
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_resolve_async(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "resolve-async",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 4 (resolve : int (fn : int [] (+ 1 3))))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(4),
              Core.f_resolve_1(
                Core.t_int,
                Core.t_any_from_func.vx_fn_new(() -> {
                  
                  return 
                    Core.f_plus(Core.vx_new_int(1), Core.vx_new_int(3));
                })
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_string_repeat(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "string-repeat",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"abab\" (string-repeat \"ab\" 2))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("abab"),
              Core.f_string_repeat(Core.vx_new_string("ab"), Core.vx_new_int(2))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_string_from_any(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "string<-any",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"true\"  (string<-any true))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("true"),
              Core.f_string_from_any(
                Core.vx_new_boolean(true)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"4\"     (string<-any 4))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("4"),
              Core.f_string_from_any(Core.vx_new_int(4))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"5.4\"   (string<-any 5.4))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("5.4"),
              Core.f_string_from_any(Core.t_decimal.vx_new_from_string("5.4"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"\\\"a\\\"\" (string<-any \"a\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("\"a\""),
              Core.f_string_from_any(Core.vx_new_string("a"))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"(stringlist\n   \\\"a\\\"\n   \\\"b\\\"\n   \\\"c\\\")\"\n (string<-any (stringlist \"a\" \"b\" \"c\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("(stringlist\n \"a\"\n \"b\"\n \"c\")"),
              Core.f_string_from_any(
                Core.f_new(
                  Core.t_stringlist,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("a"),
                    Core.vx_new_string("b"),
                    Core.vx_new_string("c")
                  )
                )
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"(stringmap\n   :a \\\"1\\\"\n   :b \\\"2\\\")\"\n (string<-any (stringmap :a \"1\" :b \"2\")))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("(stringmap\n :a \"1\"\n :b \"2\")"),
              Core.f_string_from_any(
                Core.f_new(
                  Core.t_stringmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":a"),
                    Core.vx_new_string("1"),
                    Core.vx_new_string(":b"),
                    Core.vx_new_string("2")
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_string_from_string_find_replace(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "string<-string-find-replace",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n \"a!b!c\"\n (string<-string-find-replace\n  \"axybxyc\"\n  \"xy\"\n  \"!\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("a!b!c"),
              Core.f_string_from_string_find_replace(Core.vx_new_string("axybxyc"), Core.vx_new_string("xy"), Core.vx_new_string("!"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_switch(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "switch",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test 1\n (switch : int\n  \"d\"\n  (case (list \"b\" \"c\" \"d\") 1)\n  (else 2)))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_int(1),
              Core.f_switch(
                Core.t_int,
                Core.vx_new_string("d"),
                Core.t_thenelselist.vx_new(
                  Core.f_case(
                    Core.f_new(
                      Core.t_list,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string("b"),
                        Core.vx_new_string("c"),
                        Core.vx_new_string("d")
                      )
                    ),
                    Core.t_any_from_func.vx_fn_new(() -> {
                      return Core.vx_new_int(1);
                    })
                  ),
                  Core.f_else(
                    Core.t_any_from_func.vx_fn_new(() -> {
                      return Core.vx_new_int(2);
                    })
                  )
                )
              )
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_type_from_any(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "type<-any",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n boolean\n (type<-any false))",
          ":testresult",
            Test.f_test(
              context,
              Core.t_boolean,
              Core.f_type_from_any(
                Core.vx_new_boolean(false)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n int\n (type<-any 5))",
          ":testresult",
            Test.f_test(
              context,
              Core.t_int,
              Core.f_type_from_any(Core.vx_new_int(5))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test\n string\n (type<-any \"a\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.t_string,
              Core.f_type_from_any(Core.vx_new_string("a"))
            )
        )
      )
    );
    return output;
  }

  static Test.Type_testcase f_typename_from_any(final Core.Type_context context) {
    Test.Type_testcase output = Test.t_testcase.vx_new(
      ":passfail", false,
      ":testpkg", "vx/core",
      ":casename", "typename<-any",
      ":describelist",
      Test.t_testdescribelist.vx_new(
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"vx/core/boolean\" (typename<-any false))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("vx/core/boolean"),
              Core.f_typename_from_any(
                Core.vx_new_boolean(false)
              )
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"vx/core/int\"     (typename<-any 5))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("vx/core/int"),
              Core.f_typename_from_any(Core.vx_new_int(5))
            )
        ),
        Test.t_testdescribe.vx_new(
          ":describename", "(test \"vx/core/string\"  (typename<-any \"a\"))",
          ":testresult",
            Test.f_test(
              context,
              Core.vx_new_string("vx/core/string"),
              Core.f_typename_from_any(Core.vx_new_string("a"))
            )
        )
      )
    );
    return output;
  }

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> arraylisttestcase = new ArrayList<>(Arrays.asList(
      CoreTest.t_boolean(context),
      CoreTest.t_float(context),
      CoreTest.t_int(context),
      CoreTest.t_string(context),
      CoreTest.c_false(context),
      CoreTest.c_true(context),
      CoreTest.f_not(context),
      CoreTest.f_ne(context),
      CoreTest.f_multiply(context),
      CoreTest.f_multiply_1(context),
      CoreTest.f_multiply_2(context),
      CoreTest.f_multiply_3(context),
      CoreTest.f_plus(context),
      CoreTest.f_plus_1(context),
      CoreTest.f_plus1(context),
      CoreTest.f_minus(context),
      CoreTest.f_minus_1(context),
      CoreTest.f_minus1(context),
      CoreTest.f_divide(context),
      CoreTest.f_lt(context),
      CoreTest.f_lt_1(context),
      CoreTest.f_chainfirst(context),
      CoreTest.f_chainlast(context),
      CoreTest.f_le(context),
      CoreTest.f_le_1(context),
      CoreTest.f_eq(context),
      CoreTest.f_eq_1(context),
      CoreTest.f_eqeq(context),
      CoreTest.f_gt(context),
      CoreTest.f_gt_1(context),
      CoreTest.f_ge(context),
      CoreTest.f_ge_1(context),
      CoreTest.f_and(context),
      CoreTest.f_and_1(context),
      CoreTest.f_any_from_list(context),
      CoreTest.f_any_from_list_start_reduce(context),
      CoreTest.f_any_from_map(context),
      CoreTest.f_any_from_map_start_reduce(context),
      CoreTest.f_compare(context),
      CoreTest.f_contains(context),
      CoreTest.f_contains_1(context),
      CoreTest.f_copy(context),
      CoreTest.f_empty(context),
      CoreTest.f_first_from_list(context),
      CoreTest.f_first_from_list_any_from_any(context),
      CoreTest.f_float_from_string(context),
      CoreTest.f_if(context),
      CoreTest.f_if_1(context),
      CoreTest.f_if_2(context),
      CoreTest.f_int_from_string(context),
      CoreTest.f_is_empty_1(context),
      CoreTest.f_is_int(context),
      CoreTest.f_is_number(context),
      CoreTest.f_last_from_list(context),
      CoreTest.f_length_from_list(context),
      CoreTest.f_let(context),
      CoreTest.f_list_from_map(context),
      CoreTest.f_map_from_list(context),
      CoreTest.f_map_from_map(context),
      CoreTest.f_new(context),
      CoreTest.f_or(context),
      CoreTest.f_or_1(context),
      CoreTest.f_resolve(context),
      CoreTest.f_resolve_1(context),
      CoreTest.f_resolve_async(context),
      CoreTest.f_string_repeat(context),
      CoreTest.f_string_from_any(context),
      CoreTest.f_string_from_string_find_replace(context),
      CoreTest.f_switch(context),
      CoreTest.f_type_from_any(context),
      CoreTest.f_typename_from_any(context)
    ));
    Test.Type_testcaselist output = Test.t_testcaselist.vx_new(arraylisttestcase);
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    return Test.t_testcoveragesummary.vx_new(
      ":testpkg",   "vx/core", 
      ":constnums", Test.t_testcoveragenums.vx_new(":pct", 14, ":tests", 2, ":total", 14), 
      ":docnums", Test.t_testcoveragenums.vx_new(":pct", 89, ":tests", 221, ":total", 248), 
      ":funcnums", Test.t_testcoveragenums.vx_new(":pct", 48, ":tests", 65, ":total", 135), 
      ":bigospacenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 1, ":total", 161), 
      ":bigotimenums", Test.t_testcoveragenums.vx_new(":pct", 0, ":tests", 1, ":total", 161), 
      ":totalnums", Test.t_testcoveragenums.vx_new(":pct", 31, ":tests", 71, ":total", 222), 
      ":typenums", Test.t_testcoveragenums.vx_new(":pct", 5, ":tests", 4, ":total", 73)
    );
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    return Test.t_testcoveragedetail.vx_new(
      ":testpkg", "vx/core",
      ":typemap", Core.t_intmap.vx_new(
        ":any", 0,
        ":any-async<-func", 0,
        ":any<-anylist", 0,
        ":anylist", 0,
        ":anymap", 0,
        ":anytype", 0,
        ":arg", 0,
        ":arglist", 0,
        ":argmap", 0,
        ":boolean", 4,
        ":booleanlist", 0,
        ":collection", 0,
        ":compilelanguages", 0,
        ":connect", 0,
        ":connectlist", 0,
        ":connectmap", 0,
        ":const", 0,
        ":constdef", 0,
        ":constlist", 0,
        ":constmap", 0,
        ":context", 0,
        ":date", 0,
        ":decimal", 0,
        ":error", 0,
        ":float", 1,
        ":func", 0,
        ":funcdef", 0,
        ":funclist", 0,
        ":funcmap", 0,
        ":int", 7,
        ":intlist", 0,
        ":intmap", 0,
        ":list", 0,
        ":listtype", 0,
        ":locale", 0,
        ":map", 0,
        ":maptype", 0,
        ":mempool", 0,
        ":msg", 0,
        ":msgblock", 0,
        ":msgblocklist", 0,
        ":msglist", 0,
        ":none", 0,
        ":notype", 0,
        ":number", 0,
        ":numberlist", 0,
        ":numbermap", 0,
        ":package", 0,
        ":packagemap", 0,
        ":permission", 0,
        ":permissionlist", 0,
        ":permissionmap", 0,
        ":project", 0,
        ":security", 0,
        ":session", 0,
        ":setting", 0,
        ":state", 0,
        ":statelistener", 0,
        ":string", 2,
        ":stringlist", 0,
        ":stringmap", 0,
        ":struct", 0,
        ":thenelse", 0,
        ":thenelselist", 0,
        ":translation", 0,
        ":translationlist", 0,
        ":translationmap", 0,
        ":type", 0,
        ":typedef", 0,
        ":typelist", 0,
        ":typemap", 0,
        ":user", 0,
        ":value", 0
      ),
      ":constmap", Core.t_intmap.vx_new(
        ":false", 1,
        ":global", 0,
        ":infinity", 0,
        ":mempool-active", 0,
        ":msg-error", 0,
        ":msg-info", 0,
        ":msg-severe", 0,
        ":msg-warning", 0,
        ":neginfinity", 0,
        ":newline", 0,
        ":notanumber", 0,
        ":nothing", 0,
        ":quote", 0,
        ":true", 1
      ),
      ":funcmap", Core.t_intmap.vx_new(
        ":!", 2,
        ":!-empty", 0,
        ":!-empty_1", 0,
        ":!=", 2,
        ":!==", 0,
        ":*", 2,
        ":*_1", 2,
        ":*_2", 2,
        ":*_3", 2,
        ":+", 2,
        ":+_1", 2,
        ":+_2", 0,
        ":+_3", 0,
        ":+1", 2,
        ":-", 2,
        ":-_1", 2,
        ":-_2", 0,
        ":-_3", 0,
        ":-1", 2,
        ":.", 0,
        ":/", 2,
        ":<", 1,
        ":<_1", 2,
        ":<-", 1,
        ":<<-", 1,
        ":<=", 1,
        ":<=_1", 1,
        ":=", 5,
        ":=_1", 1,
        ":==", 2,
        ":>", 1,
        ":>_1", 1,
        ":>=", 1,
        ":>=_1", 1,
        ":allowfuncs<-security", 0,
        ":allowtypenames<-typedef", 0,
        ":allowtypes<-typedef", 0,
        ":and", 2,
        ":and_1", 2,
        ":any<-any", 0,
        ":any<-any-async", 0,
        ":any<-any-context", 0,
        ":any<-any-context-async", 0,
        ":any<-any-key-value", 0,
        ":any<-func", 0,
        ":any<-func-async", 0,
        ":any<-int", 0,
        ":any<-key-value", 0,
        ":any<-key-value-async", 0,
        ":any<-list", 2,
        ":any<-list-start-reduce", 1,
        ":any<-list-start-reduce-next", 0,
        ":any<-map", 1,
        ":any<-map-start-reduce", 1,
        ":any<-none", 0,
        ":any<-none-async", 0,
        ":any<-reduce", 0,
        ":any<-reduce-async", 0,
        ":any<-reduce-next", 0,
        ":any<-reduce-next-async", 0,
        ":any<-struct", 0,
        ":async", 0,
        ":boolean-permission<-func", 0,
        ":boolean<-any", 0,
        ":boolean<-func", 0,
        ":boolean<-none", 0,
        ":case", 0,
        ":case_1", 0,
        ":compare", 2,
        ":contains", 2,
        ":contains_1", 3,
        ":context-main", 0,
        ":copy", 1,
        ":else", 0,
        ":empty", 3,
        ":extends<-any", 0,
        ":extends<-typedef", 0,
        ":first<-list", 1,
        ":first<-list-any<-any", 1,
        ":float<-string", 1,
        ":fn", 0,
        ":funcdef<-func", 0,
        ":funcname<-funcdef", 0,
        ":if", 2,
        ":if_1", 2,
        ":if_2", 1,
        ":int<-func", 0,
        ":int<-string", 6,
        ":is-empty", 0,
        ":is-empty_1", 3,
        ":is-endswith", 0,
        ":is-float", 0,
        ":is-func", 0,
        ":is-int", 4,
        ":is-number", 3,
        ":is-pass<-permission", 0,
        ":last<-list", 1,
        ":length<-list", 1,
        ":let", 1,
        ":let-async", 0,
        ":list-join<-list", 0,
        ":list<-list", 0,
        ":list<-list-async", 0,
        ":list<-map", 1,
        ":list<-map-async", 0,
        ":list<-type", 0,
        ":log", 0,
        ":log_1", 0,
        ":main", 0,
        ":map<-list", 1,
        ":map<-map", 1,
        ":mempool-addref", 0,
        ":mempool-release", 0,
        ":mempool-removeref", 0,
        ":mempool-removerefchildren", 0,
        ":mempool-reserve", 0,
        ":msg<-error", 0,
        ":msg<-error_1", 0,
        ":msg<-error_2", 0,
        ":msg<-warning", 0,
        ":msgblock<-msgblock-msg", 0,
        ":msgblock<-msgblock-msgblock", 0,
        ":name<-typedef", 0,
        ":native", 0,
        ":native<-any", 0,
        ":new", 6,
        ":number<-func", 0,
        ":or", 3,
        ":or_1", 2,
        ":package-global<-name", 0,
        ":packagename<-typedef", 0,
        ":path<-context-path", 0,
        ":path<-setting-path", 0,
        ":permission<-id-context", 0,
        ":properties<-typedef", 0,
        ":proplast<-typedef", 0,
        ":resolve", 1,
        ":resolve_1", 1,
        ":resolve-async", 1,
        ":resolve-first", 0,
        ":resolve-list", 0,
        ":security<-context", 0,
        ":security<-user", 0,
        ":session<-context", 0,
        ":setting<-context", 0,
        ":string-repeat", 1,
        ":string<-any", 6,
        ":string<-any-indent", 0,
        ":string<-func", 0,
        ":string<-string-find-replace", 1,
        ":switch", 1,
        ":then", 0,
        ":traits<-typedef", 0,
        ":type<-any", 3,
        ":typedef<-any", 0,
        ":typedef<-type", 0,
        ":typename<-any", 3,
        ":typename<-type", 0,
        ":typename<-typedef", 0,
        ":typenames<-typelist", 0,
        ":user<-context", 0
      )
    );
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Test.t_testpackage.vx_new(
      ":testpkg", "vx/core", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
