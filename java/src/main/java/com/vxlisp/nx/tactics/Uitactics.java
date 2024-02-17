package com.vxlisp.nx.tactics;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.vx.ui.*;

public final class Uitactics {

  /**
   * @function ui_app
   * Returns the template for the app ui.
   * @return {ui}
   * (func ui-app)
   */
  public static interface Func_ui_app extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app();
  }

  public static class Class_ui_app extends Core.Class_base implements Func_ui_app {

    @Override
    public Func_ui_app vx_new(Object... vals) {
      Class_ui_app output = new Class_ui_app();
      return output;
    }

    @Override
    public Func_ui_app vx_copy(Object... vals) {
      Class_ui_app output = new Class_ui_app();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app vx_empty() {return e_ui_app;}
    @Override
    public Func_ui_app vx_type() {return t_ui_app;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app() {
      return Uitactics.f_ui_app();
    }

  }

  public static final Func_ui_app e_ui_app = new Uitactics.Class_ui_app();
  public static final Func_ui_app t_ui_app = new Uitactics.Class_ui_app();

  public static Ui.Type_ui f_ui_app() {
    Ui.Type_ui output = Ui.e_ui;
    output = Core.f_let(
      Ui.t_ui,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Ui.Type_ui background = Uitactics.f_ui_app_background();
        final Ui.Type_ui main = Uitactics.f_ui_app_main();
        final Ui.Type_ui menubar = Uitactics.f_ui_app_menubar();
        final Ui.Type_ui menudrawer = Uitactics.f_ui_app_menudrawer();
        final Ui.Type_ui msgbox = Uitactics.f_ui_app_msgbox();
        final Ui.Type_ui navbar = Uitactics.f_ui_app_navbar();
        final Ui.Type_ui navdrawer = Uitactics.f_ui_app_navdrawer();
        final Ui.Type_ui parallax = Uitactics.f_ui_app_parallax();
        final Ui.Type_ui statusbar = Uitactics.f_ui_app_statusbar();
        final Ui.Type_ui statusdrawer = Uitactics.f_ui_app_statusdrawer();
        final Ui.Type_uimap uimap = Core.f_new(
          Ui.t_uimap,
          Core.t_anylist.vx_new(
              Core.vx_new_string(":background"),
              background,
              Core.vx_new_string(":main"),
              main,
              Core.vx_new_string(":menubar"),
              menubar,
              Core.vx_new_string(":menudrawer"),
              menudrawer,
              Core.vx_new_string(":msgbox"),
              msgbox,
              Core.vx_new_string(":navbar"),
              navbar,
              Core.vx_new_string(":navdrawer"),
              navdrawer,
              Core.vx_new_string(":parallax"),
              parallax,
              Core.vx_new_string(":statusbar"),
              statusbar,
              Core.vx_new_string(":statusdrawer"),
              statusdrawer
          )
        );
        return Core.f_new(
          Ui.t_ui,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":uilayout"),
            Ui.c_uilayout_app,
            Core.vx_new_string(":uimap"),
            uimap,
            Core.vx_new_string(":uistyle"),
            Uitactics.f_ui_app_style()
          )
        );
      })
    );
    return output;
  }

  /**
   * @function ui_app_background
   * @return {ui}
   * (func ui-app-background)
   */
  public static interface Func_ui_app_background extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_background();
  }

  public static class Class_ui_app_background extends Core.Class_base implements Func_ui_app_background {

    @Override
    public Func_ui_app_background vx_new(Object... vals) {
      Class_ui_app_background output = new Class_ui_app_background();
      return output;
    }

    @Override
    public Func_ui_app_background vx_copy(Object... vals) {
      Class_ui_app_background output = new Class_ui_app_background();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-background", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_background vx_empty() {return e_ui_app_background;}
    @Override
    public Func_ui_app_background vx_type() {return t_ui_app_background;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_background();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_background() {
      return Uitactics.f_ui_app_background();
    }

  }

  public static final Func_ui_app_background e_ui_app_background = new Uitactics.Class_ui_app_background();
  public static final Func_ui_app_background t_ui_app_background = new Uitactics.Class_ui_app_background();

  public static Ui.Type_ui f_ui_app_background() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_app_main
   * @return {ui}
   * (func ui-app-main)
   */
  public static interface Func_ui_app_main extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_main();
  }

  public static class Class_ui_app_main extends Core.Class_base implements Func_ui_app_main {

    @Override
    public Func_ui_app_main vx_new(Object... vals) {
      Class_ui_app_main output = new Class_ui_app_main();
      return output;
    }

    @Override
    public Func_ui_app_main vx_copy(Object... vals) {
      Class_ui_app_main output = new Class_ui_app_main();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-main", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_main vx_empty() {return e_ui_app_main;}
    @Override
    public Func_ui_app_main vx_type() {return t_ui_app_main;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_main();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_main() {
      return Uitactics.f_ui_app_main();
    }

  }

  public static final Func_ui_app_main e_ui_app_main = new Uitactics.Class_ui_app_main();
  public static final Func_ui_app_main t_ui_app_main = new Uitactics.Class_ui_app_main();

  public static Ui.Type_ui f_ui_app_main() {
    Ui.Type_ui output = Ui.e_ui;
    output = Core.f_new(
      Ui.t_ui,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":uistyle"),
        Uitactics.f_ui_app_main_style()
      )
    );
    return output;
  }

  /**
   * @function ui_app_main_style
   * @return {uistyle}
   * (func ui-app-main-style)
   */
  public static interface Func_ui_app_main_style extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_uistyle vx_ui_app_main_style();
  }

  public static class Class_ui_app_main_style extends Core.Class_base implements Func_ui_app_main_style {

    @Override
    public Func_ui_app_main_style vx_new(Object... vals) {
      Class_ui_app_main_style output = new Class_ui_app_main_style();
      return output;
    }

    @Override
    public Func_ui_app_main_style vx_copy(Object... vals) {
      Class_ui_app_main_style output = new Class_ui_app_main_style();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-main-style", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uistyle", // name
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
    public Func_ui_app_main_style vx_empty() {return e_ui_app_main_style;}
    @Override
    public Func_ui_app_main_style vx_type() {return t_ui_app_main_style;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_main_style();
      return output;
    }

    @Override
    public Ui.Type_uistyle vx_ui_app_main_style() {
      return Uitactics.f_ui_app_main_style();
    }

  }

  public static final Func_ui_app_main_style e_ui_app_main_style = new Uitactics.Class_ui_app_main_style();
  public static final Func_ui_app_main_style t_ui_app_main_style = new Uitactics.Class_ui_app_main_style();

  public static Ui.Type_uistyle f_ui_app_main_style() {
    Ui.Type_uistyle output = Ui.e_uistyle;
    output = Core.f_new(
      Ui.t_uistyle,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":uilayout"),
        Ui.c_uilayout_maxpanel
      )
    );
    return output;
  }

  /**
   * @function ui_app_menubar
   * @return {ui}
   * (func ui-app-menubar)
   */
  public static interface Func_ui_app_menubar extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_menubar();
  }

  public static class Class_ui_app_menubar extends Core.Class_base implements Func_ui_app_menubar {

    @Override
    public Func_ui_app_menubar vx_new(Object... vals) {
      Class_ui_app_menubar output = new Class_ui_app_menubar();
      return output;
    }

    @Override
    public Func_ui_app_menubar vx_copy(Object... vals) {
      Class_ui_app_menubar output = new Class_ui_app_menubar();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-menubar", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_menubar vx_empty() {return e_ui_app_menubar;}
    @Override
    public Func_ui_app_menubar vx_type() {return t_ui_app_menubar;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_menubar();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_menubar() {
      return Uitactics.f_ui_app_menubar();
    }

  }

  public static final Func_ui_app_menubar e_ui_app_menubar = new Uitactics.Class_ui_app_menubar();
  public static final Func_ui_app_menubar t_ui_app_menubar = new Uitactics.Class_ui_app_menubar();

  public static Ui.Type_ui f_ui_app_menubar() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_app_menudrawer
   * @return {ui}
   * (func ui-app-menudrawer)
   */
  public static interface Func_ui_app_menudrawer extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_menudrawer();
  }

  public static class Class_ui_app_menudrawer extends Core.Class_base implements Func_ui_app_menudrawer {

    @Override
    public Func_ui_app_menudrawer vx_new(Object... vals) {
      Class_ui_app_menudrawer output = new Class_ui_app_menudrawer();
      return output;
    }

    @Override
    public Func_ui_app_menudrawer vx_copy(Object... vals) {
      Class_ui_app_menudrawer output = new Class_ui_app_menudrawer();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-menudrawer", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_menudrawer vx_empty() {return e_ui_app_menudrawer;}
    @Override
    public Func_ui_app_menudrawer vx_type() {return t_ui_app_menudrawer;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_menudrawer();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_menudrawer() {
      return Uitactics.f_ui_app_menudrawer();
    }

  }

  public static final Func_ui_app_menudrawer e_ui_app_menudrawer = new Uitactics.Class_ui_app_menudrawer();
  public static final Func_ui_app_menudrawer t_ui_app_menudrawer = new Uitactics.Class_ui_app_menudrawer();

  public static Ui.Type_ui f_ui_app_menudrawer() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_app_msgbox
   * @return {ui}
   * (func ui-app-msgbox)
   */
  public static interface Func_ui_app_msgbox extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_msgbox();
  }

  public static class Class_ui_app_msgbox extends Core.Class_base implements Func_ui_app_msgbox {

    @Override
    public Func_ui_app_msgbox vx_new(Object... vals) {
      Class_ui_app_msgbox output = new Class_ui_app_msgbox();
      return output;
    }

    @Override
    public Func_ui_app_msgbox vx_copy(Object... vals) {
      Class_ui_app_msgbox output = new Class_ui_app_msgbox();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-msgbox", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_msgbox vx_empty() {return e_ui_app_msgbox;}
    @Override
    public Func_ui_app_msgbox vx_type() {return t_ui_app_msgbox;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_msgbox();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_msgbox() {
      return Uitactics.f_ui_app_msgbox();
    }

  }

  public static final Func_ui_app_msgbox e_ui_app_msgbox = new Uitactics.Class_ui_app_msgbox();
  public static final Func_ui_app_msgbox t_ui_app_msgbox = new Uitactics.Class_ui_app_msgbox();

  public static Ui.Type_ui f_ui_app_msgbox() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_app_navbar
   * @return {ui}
   * (func ui-app-navbar)
   */
  public static interface Func_ui_app_navbar extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_navbar();
  }

  public static class Class_ui_app_navbar extends Core.Class_base implements Func_ui_app_navbar {

    @Override
    public Func_ui_app_navbar vx_new(Object... vals) {
      Class_ui_app_navbar output = new Class_ui_app_navbar();
      return output;
    }

    @Override
    public Func_ui_app_navbar vx_copy(Object... vals) {
      Class_ui_app_navbar output = new Class_ui_app_navbar();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-navbar", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_navbar vx_empty() {return e_ui_app_navbar;}
    @Override
    public Func_ui_app_navbar vx_type() {return t_ui_app_navbar;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_navbar();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_navbar() {
      return Uitactics.f_ui_app_navbar();
    }

  }

  public static final Func_ui_app_navbar e_ui_app_navbar = new Uitactics.Class_ui_app_navbar();
  public static final Func_ui_app_navbar t_ui_app_navbar = new Uitactics.Class_ui_app_navbar();

  public static Ui.Type_ui f_ui_app_navbar() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_app_navdrawer
   * @return {ui}
   * (func ui-app-navdrawer)
   */
  public static interface Func_ui_app_navdrawer extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_navdrawer();
  }

  public static class Class_ui_app_navdrawer extends Core.Class_base implements Func_ui_app_navdrawer {

    @Override
    public Func_ui_app_navdrawer vx_new(Object... vals) {
      Class_ui_app_navdrawer output = new Class_ui_app_navdrawer();
      return output;
    }

    @Override
    public Func_ui_app_navdrawer vx_copy(Object... vals) {
      Class_ui_app_navdrawer output = new Class_ui_app_navdrawer();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-navdrawer", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_navdrawer vx_empty() {return e_ui_app_navdrawer;}
    @Override
    public Func_ui_app_navdrawer vx_type() {return t_ui_app_navdrawer;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_navdrawer();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_navdrawer() {
      return Uitactics.f_ui_app_navdrawer();
    }

  }

  public static final Func_ui_app_navdrawer e_ui_app_navdrawer = new Uitactics.Class_ui_app_navdrawer();
  public static final Func_ui_app_navdrawer t_ui_app_navdrawer = new Uitactics.Class_ui_app_navdrawer();

  public static Ui.Type_ui f_ui_app_navdrawer() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_app_parallax
   * @return {ui}
   * (func ui-app-parallax)
   */
  public static interface Func_ui_app_parallax extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_parallax();
  }

  public static class Class_ui_app_parallax extends Core.Class_base implements Func_ui_app_parallax {

    @Override
    public Func_ui_app_parallax vx_new(Object... vals) {
      Class_ui_app_parallax output = new Class_ui_app_parallax();
      return output;
    }

    @Override
    public Func_ui_app_parallax vx_copy(Object... vals) {
      Class_ui_app_parallax output = new Class_ui_app_parallax();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-parallax", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_parallax vx_empty() {return e_ui_app_parallax;}
    @Override
    public Func_ui_app_parallax vx_type() {return t_ui_app_parallax;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_parallax();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_parallax() {
      return Uitactics.f_ui_app_parallax();
    }

  }

  public static final Func_ui_app_parallax e_ui_app_parallax = new Uitactics.Class_ui_app_parallax();
  public static final Func_ui_app_parallax t_ui_app_parallax = new Uitactics.Class_ui_app_parallax();

  public static Ui.Type_ui f_ui_app_parallax() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_app_statusbar
   * @return {ui}
   * (func ui-app-statusbar)
   */
  public static interface Func_ui_app_statusbar extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_statusbar();
  }

  public static class Class_ui_app_statusbar extends Core.Class_base implements Func_ui_app_statusbar {

    @Override
    public Func_ui_app_statusbar vx_new(Object... vals) {
      Class_ui_app_statusbar output = new Class_ui_app_statusbar();
      return output;
    }

    @Override
    public Func_ui_app_statusbar vx_copy(Object... vals) {
      Class_ui_app_statusbar output = new Class_ui_app_statusbar();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-statusbar", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_statusbar vx_empty() {return e_ui_app_statusbar;}
    @Override
    public Func_ui_app_statusbar vx_type() {return t_ui_app_statusbar;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_statusbar();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_statusbar() {
      return Uitactics.f_ui_app_statusbar();
    }

  }

  public static final Func_ui_app_statusbar e_ui_app_statusbar = new Uitactics.Class_ui_app_statusbar();
  public static final Func_ui_app_statusbar t_ui_app_statusbar = new Uitactics.Class_ui_app_statusbar();

  public static Ui.Type_ui f_ui_app_statusbar() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_app_statusdrawer
   * @return {ui}
   * (func ui-app-statusdrawer)
   */
  public static interface Func_ui_app_statusdrawer extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_app_statusdrawer();
  }

  public static class Class_ui_app_statusdrawer extends Core.Class_base implements Func_ui_app_statusdrawer {

    @Override
    public Func_ui_app_statusdrawer vx_new(Object... vals) {
      Class_ui_app_statusdrawer output = new Class_ui_app_statusdrawer();
      return output;
    }

    @Override
    public Func_ui_app_statusdrawer vx_copy(Object... vals) {
      Class_ui_app_statusdrawer output = new Class_ui_app_statusdrawer();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-statusdrawer", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_statusdrawer vx_empty() {return e_ui_app_statusdrawer;}
    @Override
    public Func_ui_app_statusdrawer vx_type() {return t_ui_app_statusdrawer;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_statusdrawer();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_statusdrawer() {
      return Uitactics.f_ui_app_statusdrawer();
    }

  }

  public static final Func_ui_app_statusdrawer e_ui_app_statusdrawer = new Uitactics.Class_ui_app_statusdrawer();
  public static final Func_ui_app_statusdrawer t_ui_app_statusdrawer = new Uitactics.Class_ui_app_statusdrawer();

  public static Ui.Type_ui f_ui_app_statusdrawer() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_app_style
   * Returns the style for app ui.
   * @return {uistyle}
   * (func ui-app-style)
   */
  public static interface Func_ui_app_style extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_uistyle vx_ui_app_style();
  }

  public static class Class_ui_app_style extends Core.Class_base implements Func_ui_app_style {

    @Override
    public Func_ui_app_style vx_new(Object... vals) {
      Class_ui_app_style output = new Class_ui_app_style();
      return output;
    }

    @Override
    public Func_ui_app_style vx_copy(Object... vals) {
      Class_ui_app_style output = new Class_ui_app_style();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-style", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uistyle", // name
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
    public Func_ui_app_style vx_empty() {return e_ui_app_style;}
    @Override
    public Func_ui_app_style vx_type() {return t_ui_app_style;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_style();
      return output;
    }

    @Override
    public Ui.Type_uistyle vx_ui_app_style() {
      return Uitactics.f_ui_app_style();
    }

  }

  public static final Func_ui_app_style e_ui_app_style = new Uitactics.Class_ui_app_style();
  public static final Func_ui_app_style t_ui_app_style = new Uitactics.Class_ui_app_style();

  public static Ui.Type_uistyle f_ui_app_style() {
    Ui.Type_uistyle output = Ui.e_uistyle;
    return output;
  }

  /**
   * @function ui_app_stylesheet
   * Returns the stylesheet for app ui.
   * @return {uistylesheet}
   * (func ui-app-stylesheet)
   */
  public static interface Func_ui_app_stylesheet extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_uistylesheet vx_ui_app_stylesheet();
  }

  public static class Class_ui_app_stylesheet extends Core.Class_base implements Func_ui_app_stylesheet {

    @Override
    public Func_ui_app_stylesheet vx_new(Object... vals) {
      Class_ui_app_stylesheet output = new Class_ui_app_stylesheet();
      return output;
    }

    @Override
    public Func_ui_app_stylesheet vx_copy(Object... vals) {
      Class_ui_app_stylesheet output = new Class_ui_app_stylesheet();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app-stylesheet", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uistylesheet", // name
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
    public Func_ui_app_stylesheet vx_empty() {return e_ui_app_stylesheet;}
    @Override
    public Func_ui_app_stylesheet vx_type() {return t_ui_app_stylesheet;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_app_stylesheet();
      return output;
    }

    @Override
    public Ui.Type_uistylesheet vx_ui_app_stylesheet() {
      return Uitactics.f_ui_app_stylesheet();
    }

  }

  public static final Func_ui_app_stylesheet e_ui_app_stylesheet = new Uitactics.Class_ui_app_stylesheet();
  public static final Func_ui_app_stylesheet t_ui_app_stylesheet = new Uitactics.Class_ui_app_stylesheet();

  public static Ui.Type_uistylesheet f_ui_app_stylesheet() {
    Ui.Type_uistylesheet output = Ui.e_uistylesheet;
    return output;
  }

  /**
   * @function ui_app_from_tactics
   * @param  {tactics} tactics
   * @return {ui}
   * (func ui-app<-tactics)
   */
  public static interface Func_ui_app_from_tactics extends Core.Func_any_from_any {
    public Ui.Type_ui vx_ui_app_from_tactics(final Base.Type_tactics tactics);
  }

  public static class Class_ui_app_from_tactics extends Core.Class_base implements Func_ui_app_from_tactics {

    @Override
    public Func_ui_app_from_tactics vx_new(Object... vals) {
      Class_ui_app_from_tactics output = new Class_ui_app_from_tactics();
      return output;
    }

    @Override
    public Func_ui_app_from_tactics vx_copy(Object... vals) {
      Class_ui_app_from_tactics output = new Class_ui_app_from_tactics();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-app<-tactics", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_app_from_tactics vx_empty() {return e_ui_app_from_tactics;}
    @Override
    public Func_ui_app_from_tactics vx_type() {return t_ui_app_from_tactics;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Base.Type_tactics inputval = (Base.Type_tactics)value;
      Core.Type_any outputval = Uitactics.f_ui_app_from_tactics(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_tactics tactics = Core.f_any_from_any(Base.t_tactics, arglist.vx_any(Core.vx_new_int(0)));
      output = Uitactics.f_ui_app_from_tactics(tactics);
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_app_from_tactics(final Base.Type_tactics tactics) {
      return Uitactics.f_ui_app_from_tactics(tactics);
    }

  }

  public static final Func_ui_app_from_tactics e_ui_app_from_tactics = new Uitactics.Class_ui_app_from_tactics();
  public static final Func_ui_app_from_tactics t_ui_app_from_tactics = new Uitactics.Class_ui_app_from_tactics();

  public static Ui.Type_ui f_ui_app_from_tactics(final Base.Type_tactics tactics) {
    Ui.Type_ui output = Ui.e_ui;
    output = Core.f_let(
      Ui.t_ui,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Ui.Type_ui appui = Uitactics.f_ui_app();
        return Core.f_copy(
          appui,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":data"),
            tactics
          )
        );
      })
    );
    return output;
  }

  /**
   * @function ui_unit
   * Returns the template for a unit ui.
   * @return {ui}
   * (func ui-unit)
   */
  public static interface Func_ui_unit extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_unit();
  }

  public static class Class_ui_unit extends Core.Class_base implements Func_ui_unit {

    @Override
    public Func_ui_unit vx_new(Object... vals) {
      Class_ui_unit output = new Class_ui_unit();
      return output;
    }

    @Override
    public Func_ui_unit vx_copy(Object... vals) {
      Class_ui_unit output = new Class_ui_unit();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-unit", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_unit vx_empty() {return e_ui_unit;}
    @Override
    public Func_ui_unit vx_type() {return t_ui_unit;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_unit();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_unit() {
      return Uitactics.f_ui_unit();
    }

  }

  public static final Func_ui_unit e_ui_unit = new Uitactics.Class_ui_unit();
  public static final Func_ui_unit t_ui_unit = new Uitactics.Class_ui_unit();

  public static Ui.Type_ui f_ui_unit() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_unit_background
   * @return {ui}
   * (func ui-unit-background)
   */
  public static interface Func_ui_unit_background extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_unit_background();
  }

  public static class Class_ui_unit_background extends Core.Class_base implements Func_ui_unit_background {

    @Override
    public Func_ui_unit_background vx_new(Object... vals) {
      Class_ui_unit_background output = new Class_ui_unit_background();
      return output;
    }

    @Override
    public Func_ui_unit_background vx_copy(Object... vals) {
      Class_ui_unit_background output = new Class_ui_unit_background();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-unit-background", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_unit_background vx_empty() {return e_ui_unit_background;}
    @Override
    public Func_ui_unit_background vx_type() {return t_ui_unit_background;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_unit_background();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_unit_background() {
      return Uitactics.f_ui_unit_background();
    }

  }

  public static final Func_ui_unit_background e_ui_unit_background = new Uitactics.Class_ui_unit_background();
  public static final Func_ui_unit_background t_ui_unit_background = new Uitactics.Class_ui_unit_background();

  public static Ui.Type_ui f_ui_unit_background() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_unit_flavor
   * @return {ui}
   * (func ui-unit-flavor)
   */
  public static interface Func_ui_unit_flavor extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_unit_flavor();
  }

  public static class Class_ui_unit_flavor extends Core.Class_base implements Func_ui_unit_flavor {

    @Override
    public Func_ui_unit_flavor vx_new(Object... vals) {
      Class_ui_unit_flavor output = new Class_ui_unit_flavor();
      return output;
    }

    @Override
    public Func_ui_unit_flavor vx_copy(Object... vals) {
      Class_ui_unit_flavor output = new Class_ui_unit_flavor();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-unit-flavor", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_unit_flavor vx_empty() {return e_ui_unit_flavor;}
    @Override
    public Func_ui_unit_flavor vx_type() {return t_ui_unit_flavor;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_unit_flavor();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_unit_flavor() {
      return Uitactics.f_ui_unit_flavor();
    }

  }

  public static final Func_ui_unit_flavor e_ui_unit_flavor = new Uitactics.Class_ui_unit_flavor();
  public static final Func_ui_unit_flavor t_ui_unit_flavor = new Uitactics.Class_ui_unit_flavor();

  public static Ui.Type_ui f_ui_unit_flavor() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_unit_header
   * @return {ui}
   * (func ui-unit-header)
   */
  public static interface Func_ui_unit_header extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_unit_header();
  }

  public static class Class_ui_unit_header extends Core.Class_base implements Func_ui_unit_header {

    @Override
    public Func_ui_unit_header vx_new(Object... vals) {
      Class_ui_unit_header output = new Class_ui_unit_header();
      return output;
    }

    @Override
    public Func_ui_unit_header vx_copy(Object... vals) {
      Class_ui_unit_header output = new Class_ui_unit_header();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-unit-header", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_unit_header vx_empty() {return e_ui_unit_header;}
    @Override
    public Func_ui_unit_header vx_type() {return t_ui_unit_header;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_unit_header();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_unit_header() {
      return Uitactics.f_ui_unit_header();
    }

  }

  public static final Func_ui_unit_header e_ui_unit_header = new Uitactics.Class_ui_unit_header();
  public static final Func_ui_unit_header t_ui_unit_header = new Uitactics.Class_ui_unit_header();

  public static Ui.Type_ui f_ui_unit_header() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_unit_skillpower
   * @return {ui}
   * (func ui-unit-skillpower)
   */
  public static interface Func_ui_unit_skillpower extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_unit_skillpower();
  }

  public static class Class_ui_unit_skillpower extends Core.Class_base implements Func_ui_unit_skillpower {

    @Override
    public Func_ui_unit_skillpower vx_new(Object... vals) {
      Class_ui_unit_skillpower output = new Class_ui_unit_skillpower();
      return output;
    }

    @Override
    public Func_ui_unit_skillpower vx_copy(Object... vals) {
      Class_ui_unit_skillpower output = new Class_ui_unit_skillpower();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-unit-skillpower", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_unit_skillpower vx_empty() {return e_ui_unit_skillpower;}
    @Override
    public Func_ui_unit_skillpower vx_type() {return t_ui_unit_skillpower;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_unit_skillpower();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_unit_skillpower() {
      return Uitactics.f_ui_unit_skillpower();
    }

  }

  public static final Func_ui_unit_skillpower e_ui_unit_skillpower = new Uitactics.Class_ui_unit_skillpower();
  public static final Func_ui_unit_skillpower t_ui_unit_skillpower = new Uitactics.Class_ui_unit_skillpower();

  public static Ui.Type_ui f_ui_unit_skillpower() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_unit_stat
   * @return {ui}
   * (func ui-unit-stat)
   */
  public static interface Func_ui_unit_stat extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_unit_stat();
  }

  public static class Class_ui_unit_stat extends Core.Class_base implements Func_ui_unit_stat {

    @Override
    public Func_ui_unit_stat vx_new(Object... vals) {
      Class_ui_unit_stat output = new Class_ui_unit_stat();
      return output;
    }

    @Override
    public Func_ui_unit_stat vx_copy(Object... vals) {
      Class_ui_unit_stat output = new Class_ui_unit_stat();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-unit-stat", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "ui", // name
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
    public Func_ui_unit_stat vx_empty() {return e_ui_unit_stat;}
    @Override
    public Func_ui_unit_stat vx_type() {return t_ui_unit_stat;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_unit_stat();
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_unit_stat() {
      return Uitactics.f_ui_unit_stat();
    }

  }

  public static final Func_ui_unit_stat e_ui_unit_stat = new Uitactics.Class_ui_unit_stat();
  public static final Func_ui_unit_stat t_ui_unit_stat = new Uitactics.Class_ui_unit_stat();

  public static Ui.Type_ui f_ui_unit_stat() {
    Ui.Type_ui output = Ui.e_ui;
    return output;
  }

  /**
   * @function ui_unit_style
   * Returns the style for unit ui.
   * @return {uistyle}
   * (func ui-unit-style)
   */
  public static interface Func_ui_unit_style extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_uistyle vx_ui_unit_style();
  }

  public static class Class_ui_unit_style extends Core.Class_base implements Func_ui_unit_style {

    @Override
    public Func_ui_unit_style vx_new(Object... vals) {
      Class_ui_unit_style output = new Class_ui_unit_style();
      return output;
    }

    @Override
    public Func_ui_unit_style vx_copy(Object... vals) {
      Class_ui_unit_style output = new Class_ui_unit_style();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/uitactics", // pkgname
        "ui-unit-style", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uistyle", // name
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
    public Func_ui_unit_style vx_empty() {return e_ui_unit_style;}
    @Override
    public Func_ui_unit_style vx_type() {return t_ui_unit_style;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Uitactics.f_ui_unit_style();
      return output;
    }

    @Override
    public Ui.Type_uistyle vx_ui_unit_style() {
      return Uitactics.f_ui_unit_style();
    }

  }

  public static final Func_ui_unit_style e_ui_unit_style = new Uitactics.Class_ui_unit_style();
  public static final Func_ui_unit_style t_ui_unit_style = new Uitactics.Class_ui_unit_style();

  public static Ui.Type_uistyle f_ui_unit_style() {
    Ui.Type_uistyle output = Ui.e_uistyle;
    return output;
  }


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    mapfunc.put("ui-app", Uitactics.t_ui_app);
    mapfunc.put("ui-app-background", Uitactics.t_ui_app_background);
    mapfunc.put("ui-app-main", Uitactics.t_ui_app_main);
    mapfunc.put("ui-app-main-style", Uitactics.t_ui_app_main_style);
    mapfunc.put("ui-app-menubar", Uitactics.t_ui_app_menubar);
    mapfunc.put("ui-app-menudrawer", Uitactics.t_ui_app_menudrawer);
    mapfunc.put("ui-app-msgbox", Uitactics.t_ui_app_msgbox);
    mapfunc.put("ui-app-navbar", Uitactics.t_ui_app_navbar);
    mapfunc.put("ui-app-navdrawer", Uitactics.t_ui_app_navdrawer);
    mapfunc.put("ui-app-parallax", Uitactics.t_ui_app_parallax);
    mapfunc.put("ui-app-statusbar", Uitactics.t_ui_app_statusbar);
    mapfunc.put("ui-app-statusdrawer", Uitactics.t_ui_app_statusdrawer);
    mapfunc.put("ui-app-style", Uitactics.t_ui_app_style);
    mapfunc.put("ui-app-stylesheet", Uitactics.t_ui_app_stylesheet);
    mapfunc.put("ui-app<-tactics", Uitactics.t_ui_app_from_tactics);
    mapfunc.put("ui-unit", Uitactics.t_ui_unit);
    mapfunc.put("ui-unit-background", Uitactics.t_ui_unit_background);
    mapfunc.put("ui-unit-flavor", Uitactics.t_ui_unit_flavor);
    mapfunc.put("ui-unit-header", Uitactics.t_ui_unit_header);
    mapfunc.put("ui-unit-skillpower", Uitactics.t_ui_unit_skillpower);
    mapfunc.put("ui-unit-stat", Uitactics.t_ui_unit_stat);
    mapfunc.put("ui-unit-style", Uitactics.t_ui_unit_style);
    Core.vx_global_package_set("nx/tactics/uitactics", maptype, mapconst, mapfunc);
  }

}
