package com.vxlisp.nx.tactics;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.books.*;
import com.vxlisp.vx.data.*;
import com.vxlisp.vx.ui.*;

public final class Apptactics {

  /**
   * @function context_nx
   * Returns the context for execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {context}
   * (func context-nx)
   */
  public static interface Func_context_nx extends Core.Func_any_from_any {
    public Core.Type_context vx_context_nx(final Core.Type_anylist args);
  }

  public static class Class_context_nx extends Core.Class_base implements Func_context_nx {

    @Override
    public Func_context_nx vx_new(Object... vals) {
      Class_context_nx output = new Class_context_nx();
      return output;
    }

    @Override
    public Func_context_nx vx_copy(Object... vals) {
      Class_context_nx output = new Class_context_nx();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/apptactics", // pkgname
        "context-nx", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "context", // name
          ":struct", // extends
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
    public Func_context_nx vx_empty() {return e_context_nx;}
    @Override
    public Func_context_nx vx_type() {return t_context_nx;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_anylist inputval = (Core.Type_anylist)value;
      Core.Type_any outputval = Apptactics.f_context_nx(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_anylist args = Core.f_any_from_any(Core.t_anylist, arglist.vx_any(Core.vx_new_int(0)));
      output = Apptactics.f_context_nx(args);
      return output;
    }

    @Override
    public Core.Type_context vx_context_nx(final Core.Type_anylist args) {
      return Apptactics.f_context_nx(args);
    }

  }

  public static final Func_context_nx e_context_nx = new Apptactics.Class_context_nx();
  public static final Func_context_nx t_context_nx = new Apptactics.Class_context_nx();

  public static Core.Type_context f_context_nx(final Core.Type_anylist args) {
    Core.Type_context output = Core.e_context;
    output = Core.f_new(
      Core.t_context,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":session"),
        Core.f_new(
          Core.t_session,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":user"),
            Core.f_new(
              Core.t_user,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":security"),
                Apptactics.f_security_nx()
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function main_nx
   * The default function for app main execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {string}
   * (func main-nx)
   */
  public static interface Func_main_nx extends Core.Func_any_from_any_context {
    public Core.Type_string vx_main_nx(final Core.Type_context context, final Core.Type_anylist args);
  }

  public static class Class_main_nx extends Core.Class_base implements Func_main_nx {

    @Override
    public Func_main_nx vx_new(Object... vals) {
      Class_main_nx output = new Class_main_nx();
      return output;
    }

    @Override
    public Func_main_nx vx_copy(Object... vals) {
      Class_main_nx output = new Class_main_nx();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/apptactics", // pkgname
        "main-nx", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
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
    public Func_main_nx vx_empty() {return e_main_nx;}
    @Override
    public Func_main_nx vx_type() {return t_main_nx;}

    @Override
    public Core.Func_any_from_any_context vx_fn_new(Core.Class_any_from_any_context.IFn fn) {return Core.e_any_from_any_context;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any_context(final T generic_any_1, final Core.Type_context context, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_anylist inputval = (Core.Type_anylist)value;
      Core.Type_any outputval = Apptactics.f_main_nx(context, inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_context context = Core.f_any_from_any(Core.t_context, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_anylist args = Core.f_any_from_any(Core.t_anylist, arglist.vx_any(Core.vx_new_int(0)));
      output = Apptactics.f_main_nx(context, args);
      return output;
    }

    @Override
    public Core.Type_string vx_main_nx(final Core.Type_context context, final Core.Type_anylist args) {
      return Apptactics.f_main_nx(context, args);
    }

  }

  public static final Func_main_nx e_main_nx = new Apptactics.Class_main_nx();
  public static final Func_main_nx t_main_nx = new Apptactics.Class_main_nx();

  public static Core.Type_string f_main_nx(final Core.Type_context context, final Core.Type_anylist args) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringlist booknames = Core.f_new(
          Core.t_stringlist,
          Core.t_anylist.vx_new(
              Core.vx_new_string("TACTICSBOOK_CORE"),
              Core.vx_new_string("TACTICSBOOK_ADVANCED"),
              Core.vx_new_string("TACTICSBOOK_ANCIENT"),
              Core.vx_new_string("TACTICSBOOK_AOSAIL"),
              Core.vx_new_string("TACTICSBOOK_AOSTEAM"),
              Core.vx_new_string("TACTICSBOOK_BESTIARY"),
              Core.vx_new_string("TACTICSBOOK_CHARS"),
              Core.vx_new_string("TACTICSBOOK_COMBAT"),
              Core.vx_new_string("TACTICSBOOK_FANTASY"),
              Core.vx_new_string("TACTICSBOOK_GEAR"),
              Core.vx_new_string("TACTICSBOOK_GIANT"),
              Core.vx_new_string("TACTICSBOOK_HIGHTECH"),
              Core.vx_new_string("TACTICSBOOK_HORROR"),
              Core.vx_new_string("TACTICSBOOK_LANDSEA"),
              Core.vx_new_string("TACTICSBOOK_MAGIC"),
              Core.vx_new_string("TACTICSBOOK_MEDIEVAL"),
              Core.vx_new_string("TACTICSBOOK_MFANTASY"),
              Core.vx_new_string("TACTICSBOOK_MODERN"),
              Core.vx_new_string("TACTICSBOOK_POWERS"),
              Core.vx_new_string("TACTICSBOOK_PREHISTORY"),
              Core.vx_new_string("TACTICSBOOK_PULP"),
              Core.vx_new_string("TACTICSBOOK_SCIFI"),
              Core.vx_new_string("TACTICSBOOK_SKILLS"),
              Core.vx_new_string("TACTICSBOOK_SPACE"),
              Core.vx_new_string("TACTICSBOOK_SUPER"),
              Core.vx_new_string("TACTICSBOOK_WORLDWARS")
          )
        );
        final Core.Type_boolean done = Bookloader.f_boolean_write_from_booknames(context, booknames);
        return Core.f_string_from_any(done);
      })
    );
    return output;
  }

  /**
   * @function security_nx
   * Returns the security for execution.
   * @return {security}
   * (func security-nx)
   */
  public static interface Func_security_nx extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_security vx_security_nx();
  }

  public static class Class_security_nx extends Core.Class_base implements Func_security_nx {

    @Override
    public Func_security_nx vx_new(Object... vals) {
      Class_security_nx output = new Class_security_nx();
      return output;
    }

    @Override
    public Func_security_nx vx_copy(Object... vals) {
      Class_security_nx output = new Class_security_nx();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/apptactics", // pkgname
        "security-nx", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "security", // name
          ":struct", // extends
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
    public Func_security_nx vx_empty() {return e_security_nx;}
    @Override
    public Func_security_nx vx_type() {return t_security_nx;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Apptactics.f_security_nx();
      return output;
    }

    @Override
    public Core.Type_security vx_security_nx() {
      return Apptactics.f_security_nx();
    }

  }

  public static final Func_security_nx e_security_nx = new Apptactics.Class_security_nx();
  public static final Func_security_nx t_security_nx = new Apptactics.Class_security_nx();

  public static Core.Type_security f_security_nx() {
    Core.Type_security output = Core.e_security;
    output = Core.f_new(
      Core.t_security,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":allowfuncs"),
        Core.f_new(
          Core.t_funclist,
          Core.t_anylist.vx_new(
            File.t_boolean_write_from_file_any,
            File.t_boolean_write_from_file_string,
            File.t_file_read_from_file,
            File.t_string_read_from_file
          )
        )
      )
    );
    return output;
  }


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    mapfunc.put("context-nx", Apptactics.t_context_nx);
    mapfunc.put("main-nx", Apptactics.t_main_nx);
    mapfunc.put("security-nx", Apptactics.t_security_nx);
    Core.vx_global_package_set("nx/tactics/apptactics", maptype, mapconst, mapfunc);
  }

}
