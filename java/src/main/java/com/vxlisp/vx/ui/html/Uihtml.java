package com.vxlisp.vx.ui.html;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.vx.web.*;
import com.vxlisp.vx.ui.*;

public final class Uihtml {


  /**
   * type: renderer-html
   * Html specific renderer
   * (type renderer-html)
   */
  public interface Type_renderer_html extends Core.Type_struct, Ui.Type_renderer {
    public Uihtml.Type_renderer_html vx_new(final Object... vals);
    public Uihtml.Type_renderer_html vx_copy(final Object... vals);
    public Uihtml.Type_renderer_html vx_empty();
    public Uihtml.Type_renderer_html vx_type();
    public Ui.Func_render_from_ui_orig fn_render();
  }

  public static class Class_renderer_html extends Core.Class_base implements Type_renderer_html {

    protected Ui.Func_render_from_ui_orig vx_p_fn_render;

    @Override
    public Ui.Func_render_from_ui_orig fn_render() {
      return this.vx_p_fn_render == null ? Ui.e_render_from_ui_orig : this.vx_p_fn_render;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":fn-render":
        output = this.fn_render();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":fn-render", this.fn_render());
      return Core.immutablemap(output);
    }

    @Override
    public Type_renderer_html vx_new(final Object... vals) {return e_renderer_html.vx_copy(vals);}

    @Override
    public Type_renderer_html vx_copy(final Object... vals) {
      Type_renderer_html output = this;
      boolean ischanged = false;
      Class_renderer_html val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Ui.Func_render_from_ui_orig vx_p_fn_render = val.fn_render();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":fn-render");
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
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/ui/html/uihtml/renderer-html", ":invalidkeytype", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          if (istestkey) {
            if (!testkey.startsWith(":")) {
              testkey = ":" + testkey;
            }
            boolean isvalidkey = validkeys.contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else {
              Core.Type_any msgval = Core.vx_new_string(testkey);
              msg = Core.vx_msg_from_error("vx/ui/html/uihtml/renderer-html", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":fn-render":
            if (valsub == vx_p_fn_render) {
            } else if (valsub instanceof Ui.Func_render_from_ui_orig) {
              ischanged = true;
              vx_p_fn_render = (Ui.Func_render_from_ui_orig)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("fn-render"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/html/uihtml/renderer-html", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/ui/html/uihtml/renderer-html", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_renderer_html work = new Class_renderer_html();
        work.vx_p_fn_render = vx_p_fn_render;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_renderer_html vx_empty() {return e_renderer_html;}
    @Override
    public Type_renderer_html vx_type() {return t_renderer_html;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/html/uihtml", // pkgname
        "renderer-html", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Ui.t_renderer), // traits
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

  public static final Type_renderer_html e_renderer_html = new Class_renderer_html();
  public static final Type_renderer_html t_renderer_html = new Class_renderer_html();

  /**
   * Constant: renderer-app
   * Html App Renderer
   * {renderer-html}
   */
  public static class Const_renderer_app extends Uihtml.Class_renderer_html implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/html/uihtml", // pkgname
        "renderer-app", // name
        Core.typedef_new(
          "vx/ui/html/uihtml", // pkgname
          "renderer-html", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Ui.t_renderer), // traits
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

    public static void const_new(Const_renderer_app output) {
      Uihtml.Type_renderer_html val = Core.f_new(
        Uihtml.t_renderer_html,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":fn-render"),
                Uihtml.t_render_app_from_ui_orig
        )
      );
      output.vx_p_fn_render = val.fn_render();
    }


  }

  public static final Const_renderer_app c_renderer_app = new Const_renderer_app();

  /**
   * @function node_app_from_ui_orig
   * @param  {ui} ui
   * @param  {ui} orig
   * @return {node}
   * (func node-app<-ui-orig)
   */
  public static interface Func_node_app_from_ui_orig extends Core.Type_func, Core.Type_replfunc {
    public Html.Type_node vx_node_app_from_ui_orig(final Ui.Type_ui ui, final Ui.Type_ui orig);
  }

  public static class Class_node_app_from_ui_orig extends Core.Class_base implements Func_node_app_from_ui_orig {

    @Override
    public Func_node_app_from_ui_orig vx_new(Object... vals) {
      Class_node_app_from_ui_orig output = new Class_node_app_from_ui_orig();
      return output;
    }

    @Override
    public Func_node_app_from_ui_orig vx_copy(Object... vals) {
      Class_node_app_from_ui_orig output = new Class_node_app_from_ui_orig();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/html/uihtml", // pkgname
        "node-app<-ui-orig", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/web/html", // pkgname
          "node", // name
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
    public Func_node_app_from_ui_orig vx_empty() {return e_node_app_from_ui_orig;}
    @Override
    public Func_node_app_from_ui_orig vx_type() {return t_node_app_from_ui_orig;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Type_ui ui = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(0)));
      Ui.Type_ui orig = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(1)));
      output = Uihtml.f_node_app_from_ui_orig(ui, orig);
      return output;
    }

    @Override
    public Html.Type_node vx_node_app_from_ui_orig(final Ui.Type_ui ui, final Ui.Type_ui orig) {
      return Uihtml.f_node_app_from_ui_orig(ui, orig);
    }

  }

  public static final Func_node_app_from_ui_orig e_node_app_from_ui_orig = new Uihtml.Class_node_app_from_ui_orig();
  public static final Func_node_app_from_ui_orig t_node_app_from_ui_orig = new Uihtml.Class_node_app_from_ui_orig();

  public static Html.Type_node f_node_app_from_ui_orig(final Ui.Type_ui ui, final Ui.Type_ui orig) {
    Html.Type_node output = Html.e_node;
    output = Core.f_empty(
      Html.t_div
    );
    return output;
  }

  /**
   * @function render_app_from_ui_orig
   * Returns a rendered object from a UI Element.
   * @param  {ui} ui
   * @param  {ui} orig
   * @return {render}
   * (func render-app<-ui-orig)
   */
  public static interface Func_render_app_from_ui_orig extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_render vx_render_app_from_ui_orig(final Ui.Type_ui ui, final Ui.Type_ui orig);
  }

  public static class Class_render_app_from_ui_orig extends Core.Class_base implements Func_render_app_from_ui_orig {

    @Override
    public Func_render_app_from_ui_orig vx_new(Object... vals) {
      Class_render_app_from_ui_orig output = new Class_render_app_from_ui_orig();
      return output;
    }

    @Override
    public Func_render_app_from_ui_orig vx_copy(Object... vals) {
      Class_render_app_from_ui_orig output = new Class_render_app_from_ui_orig();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/html/uihtml", // pkgname
        "render-app<-ui-orig", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "render", // name
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
    public Func_render_app_from_ui_orig vx_empty() {return e_render_app_from_ui_orig;}
    @Override
    public Func_render_app_from_ui_orig vx_type() {return t_render_app_from_ui_orig;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Type_ui ui = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(0)));
      Ui.Type_ui orig = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(1)));
      output = Uihtml.f_render_app_from_ui_orig(ui, orig);
      return output;
    }

    @Override
    public Ui.Type_render vx_render_app_from_ui_orig(final Ui.Type_ui ui, final Ui.Type_ui orig) {
      return Uihtml.f_render_app_from_ui_orig(ui, orig);
    }

  }

  public static final Func_render_app_from_ui_orig e_render_app_from_ui_orig = new Uihtml.Class_render_app_from_ui_orig();
  public static final Func_render_app_from_ui_orig t_render_app_from_ui_orig = new Uihtml.Class_render_app_from_ui_orig();

  public static Ui.Type_render f_render_app_from_ui_orig(final Ui.Type_ui ui, final Ui.Type_ui orig) {
    Ui.Type_render output = Ui.e_render;
    output = Core.f_let(
      Ui.t_render,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string uid = ui.uid();
        final Ui.Type_render render = ui.render();
        final Html.Type_node node = Uihtml.f_node_app_from_ui_orig(ui, orig);
        final Core.Type_string htmltext = Html.f_string_from_node_indent(node, Core.vx_new_int(2));
        final Core.Type_boolean isdone = Htmldoc.f_boolean_write_from_id_htmltext(uid, htmltext);
        return render;
      })
    );
    return output;
  }


  static {
    Const_renderer_app.const_new(c_renderer_app);
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    maptype.put("renderer-html", Uihtml.t_renderer_html);
    mapconst.put("renderer-app", Uihtml.c_renderer_app);
    mapfunc.put("node-app<-ui-orig", Uihtml.t_node_app_from_ui_orig);
    mapfunc.put("render-app<-ui-orig", Uihtml.t_render_app_from_ui_orig);
    Core.vx_global_package_set("vx/ui/html/uihtml", maptype, mapconst, mapfunc);
  }

}
