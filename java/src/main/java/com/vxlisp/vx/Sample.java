package com.vxlisp.vx;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Sample {


  /**
   * type: mytype
   * (type mytype)
   */
  public interface Type_mytype extends Core.Type_struct {
    public Sample.Type_mytype vx_new(final Object... vals);
    public Sample.Type_mytype vx_copy(final Object... vals);
    public Sample.Type_mytype vx_empty();
    public Sample.Type_mytype vx_type();
    public Core.Type_int mynum();
    public Core.Type_string mystr();
  }

  public static class Class_mytype extends Core.Class_base implements Type_mytype {

    protected Core.Type_int vx_p_mynum;

    @Override
    public Core.Type_int mynum() {
      return this.vx_p_mynum == null ? Core.e_int : this.vx_p_mynum;
    }

    protected Core.Type_string vx_p_mystr;

    @Override
    public Core.Type_string mystr() {
      return this.vx_p_mystr == null ? Core.e_string : this.vx_p_mystr;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":mynum":
        output = this.mynum();
        break;
      case ":mystr":
        output = this.mystr();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":mynum", this.mynum());
      output.put(":mystr", this.mystr());
      return Core.immutablemap(output);
    }

    @Override
    public Type_mytype vx_new(final Object... vals) {return e_mytype.vx_copy(vals);}

    @Override
    public Type_mytype vx_copy(final Object... vals) {
      Type_mytype output = this;
      boolean ischanged = false;
      Class_mytype val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_int vx_p_mynum = val.mynum();
      Core.Type_string vx_p_mystr = val.mystr();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":mynum");
      validkeys.add(":mystr");
      String key = "";
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (key == "") {
          boolean istestkey = false;
          String testkey = "";
          if (valsub instanceof Core.Type_string) {
            Core.Type_string valstr = (Core.Type_string)valsub;
            testkey = valstr.vx_string();
            istestkey = true;
          } else if (valsub instanceof String) {
            testkey = (String)valsub;
            istestkey = true;
          } else {
            String svalsub;
            if (valsub instanceof Core.Type_any) {
              Core.Type_any anyvalsub = (Core.Type_any)valsub;
              svalsub = Core.vx_string_from_any(anyvalsub);
            } else {
              svalsub = valsub.toString();
            }
            msg = Core.vx_msg_from_error(":invalidkeytype (new mytype) " + svalsub);
            msgblock = msgblock.vx_copy(msg);
          }
          if (istestkey) {
            boolean isvalidkey = validkeys.contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else {
              msg = Core.vx_msg_from_error(":invalidkey (new mytype) " + testkey);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":mynum":
            if (valsub == vx_p_mynum) {
            } else if (valsub instanceof Core.Type_int) {
              ischanged = true;
              vx_p_mynum = (Core.Type_int)valsub;
            } else if (valsub instanceof Integer) {
              ischanged = true;
              vx_p_mynum = Core.t_int.vx_new(valsub);
            } else {
              msg = Core.vx_msg_from_error(":invalidvalue (new mytype :mynum " + valsub.toString() + ")");
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":mystr":
            if (valsub == vx_p_mystr) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_mystr = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_mystr = Core.t_string.vx_new(valsub);
            } else {
              msg = Core.vx_msg_from_error(":invalidvalue (new mytype :mystr " + valsub.toString() + ")");
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            msg = Core.vx_msg_from_error(":invalidkey (new mytype) " + key);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_mytype work = new Class_mytype();
        work.vx_p_mynum = vx_p_mynum;
        work.vx_p_mystr = vx_p_mystr;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_mytype vx_empty() {return e_mytype;}
    @Override
    public Type_mytype vx_type() {return t_mytype;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/sample", // pkgname
        "mytype", // name
        ":struct", // extends
        Core.e_typelist, // traits
        Core.e_typelist, // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_mytype e_mytype = new Class_mytype();
  public static final Type_mytype t_mytype = new Class_mytype();

  /**
   * Constant: myconst
   * My Constant
   * {int}
   */
  public static class Const_myconst extends Core.Class_int implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/sample", // pkgname
        "myconst", // name
        Core.typedef_new(
          "vx/core", // pkgname
          "int", // name
          "", // extends
          Core.t_typelist.vx_new(Core.t_number), // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        )
      );
    }

    public static void const_new(Const_myconst output) {
    }

    @Override
    public int vx_int() {
      this.vxint = 4;
      return this.vxint;
    }

  }

  public static final Const_myconst c_myconst = new Const_myconst();

  /**
   * @function main
   * @return {none}
   * (func main)
   */
  public static interface Func_main extends Core.Type_func, Core.Type_replfunc {
    public void vx_main();
  }

  public static class Class_main extends Core.Class_base implements Func_main {

    @Override
    public Func_main vx_new(Object... vals) {
      Class_main output = new Class_main();
      return output;
    }

    @Override
    public Func_main vx_copy(Object... vals) {
      Class_main output = new Class_main();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/sample", // pkgname
        "main", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "none", // name
          "", // extends
          Core.e_typelist, // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
    }

    @Override
    public Func_main vx_empty() {return e_main;}
    @Override
    public Func_main vx_type() {return t_main;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Sample.f_main();
      return output;
    }

    @Override
    public void vx_main() {Sample.f_main();
    }

  }

  public static final Func_main e_main = new Sample.Class_main();
  public static final Func_main t_main = new Sample.Class_main();

  public static void f_main() {
    Sample.f_myfunc(Core.vx_new_int(2));
  }

  /**
   * @function myfunc
   * My Function
   * @param  {int} myarg My Arg
   * @return {int}
   * (func myfunc)
   */
  public static interface Func_myfunc extends Core.Func_any_from_any {
    public Core.Type_int vx_myfunc(final Core.Type_int myarg);
  }

  public static class Class_myfunc extends Core.Class_base implements Func_myfunc {

    @Override
    public Func_myfunc vx_new(Object... vals) {
      Class_myfunc output = new Class_myfunc();
      return output;
    }

    @Override
    public Func_myfunc vx_copy(Object... vals) {
      Class_myfunc output = new Class_myfunc();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/sample", // pkgname
        "myfunc", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "int", // name
          "", // extends
          Core.t_typelist.vx_new(Core.t_number), // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
    }

    @Override
    public Func_myfunc vx_empty() {return e_myfunc;}
    @Override
    public Func_myfunc vx_type() {return t_myfunc;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_int inputval = (Core.Type_int)value;
      Core.Type_any outputval = Sample.f_myfunc(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_int myarg = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(0)));
      output = Sample.f_myfunc(myarg);
      return output;
    }

    @Override
    public Core.Type_int vx_myfunc(final Core.Type_int myarg) {
      return Sample.f_myfunc(myarg);
    }

  }

  public static final Func_myfunc e_myfunc = new Sample.Class_myfunc();
  public static final Func_myfunc t_myfunc = new Sample.Class_myfunc();

  public static Core.Type_int f_myfunc(final Core.Type_int myarg) {
    Core.Type_int output = Core.e_int;
    output = Core.f_plus(
      Sample.c_myconst,
      myarg
    );
    return output;
  }


  static {
    Const_myconst.const_new(c_myconst);
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    maptype.put("mytype", Sample.t_mytype);
    mapconst.put("myconst", Sample.c_myconst);
    mapfunc.put("main", Sample.t_main);
    mapfunc.put("myfunc", Sample.t_myfunc);
    Core.vx_global_package_set("vx/sample", maptype, mapconst, mapfunc);
  }

}
