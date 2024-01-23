package com.vxlisp.vx.translation;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;

public final class Es {

  /**
   * @function translation_es
   * Returns translation data
   * @return {translation}
   * (func translation-es)
   */
  public static interface Func_translation_es extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_translation vx_translation_es();
  }

  public static class Class_translation_es extends Core.Class_base implements Func_translation_es {

    @Override
    public Func_translation_es vx_new(Object... vals) {
      Class_translation_es output = new Class_translation_es();
      return output;
    }

    @Override
    public Func_translation_es vx_copy(Object... vals) {
      Class_translation_es output = new Class_translation_es();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/translation/es", // pkgname
        "translation-es", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "translation", // name
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
    public Func_translation_es vx_empty() {return e_translation_es;}
    @Override
    public Func_translation_es vx_type() {return t_translation_es;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Es.f_translation_es();
      return output;
    }

    @Override
    public Core.Type_translation vx_translation_es() {
      return Es.f_translation_es();
    }

  }

  public static final Func_translation_es e_translation_es = new Es.Class_translation_es();
  public static final Func_translation_es t_translation_es = new Es.Class_translation_es();

  public static Core.Type_translation f_translation_es() {
    Core.Type_translation output = Core.e_translation;
    output = Core.f_new(
      Core.t_translation,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("es"),
        Core.vx_new_string(":wordmap"),
        Es.f_words()
      )
    );
    return output;
  }

  /**
   * @function words
   * Word Translation
   * @return {stringmap}
   * (func words)
   */
  public static interface Func_words extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_stringmap vx_words();
  }

  public static class Class_words extends Core.Class_base implements Func_words {

    @Override
    public Func_words vx_new(Object... vals) {
      Class_words output = new Class_words();
      return output;
    }

    @Override
    public Func_words vx_copy(Object... vals) {
      Class_words output = new Class_words();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/translation/es", // pkgname
        "words", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "stringmap", // name
          ":map", // extends
          Core.e_typelist, // traits
          Core.t_typelist.vx_new(Core.t_string), // allowtypes
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
    public Func_words vx_empty() {return e_words;}
    @Override
    public Func_words vx_type() {return t_words;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Es.f_words();
      return output;
    }

    @Override
    public Core.Type_stringmap vx_words() {
      return Es.f_words();
    }

  }

  public static final Func_words e_words = new Es.Class_words();
  public static final Func_words t_words = new Es.Class_words();

  public static Core.Type_stringmap f_words() {
    Core.Type_stringmap output = Core.e_stringmap;
    output = Core.f_new(
      Core.t_stringmap,
      Core.t_anylist.vx_new(
        Core.vx_new_string("Hello"),
        Core.vx_new_string("Hola"),
        Core.vx_new_string("World"),
        Core.vx_new_string("Mundo")
      )
    );
    return output;
  }


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    mapfunc.put("translation-es", Es.t_translation_es);
    mapfunc.put("words", Es.t_words);
    Core.vx_global_package_set("vx/translation/es", maptype, mapconst, mapfunc);
  }

}
