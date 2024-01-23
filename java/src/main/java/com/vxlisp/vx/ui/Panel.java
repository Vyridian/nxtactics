package com.vxlisp.vx.ui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import com.vxlisp.vx.*;

public final class Panel {


  /**
   * type: layout
   * Universal Layout
   * (type layout)
   */
  public interface Type_layout extends Core.Type_struct {
    public Panel.Type_layout vx_new(final Object... vals);
    public Panel.Type_layout vx_copy(final Object... vals);
    public Panel.Type_layout vx_empty();
    public Panel.Type_layout vx_type();
  }

  public static class Class_layout extends Core.Class_base implements Type_layout {

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      return Core.immutablemap(output);
    }

    @Override
    public Type_layout vx_new(final Object... vals) {return e_layout.vx_copy(vals);}

    @Override
    public Type_layout vx_copy(final Object... vals) {
      Type_layout output = this;
      boolean ischanged = false;
      Class_layout val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_layout work = new Class_layout();
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_layout vx_empty() {return e_layout;}
    @Override
    public Type_layout vx_type() {return t_layout;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/panel", // pkgname
        "layout", // name
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

  public static final Type_layout e_layout = new Class_layout();
  public static final Type_layout t_layout = new Class_layout();

  /**
   * type: panel
   * (type panel)
   */
  public interface Type_panel extends Core.Type_struct {
    public Panel.Type_panel vx_new(final Object... vals);
    public Panel.Type_panel vx_copy(final Object... vals);
    public Panel.Type_panel vx_empty();
    public Panel.Type_panel vx_type();
    public Panel.Type_layout layout();
    public Core.Type_any data();
    public Core.Type_any rendered();
    public Panel.Func_any_render_from_panel render_fn();
    public Panel.Type_panelmap panelmap();
  }

  public static class Class_panel extends Core.Class_base implements Type_panel {

    protected Panel.Type_layout vx_p_layout;

    @Override
    public Panel.Type_layout layout() {
      return this.vx_p_layout == null ? Panel.e_layout : this.vx_p_layout;
    }

    protected Core.Type_any vx_p_data;

    @Override
    public Core.Type_any data() {
      return this.vx_p_data == null ? Core.e_any : this.vx_p_data;
    }

    protected Core.Type_any vx_p_rendered;

    @Override
    public Core.Type_any rendered() {
      return this.vx_p_rendered == null ? Core.e_any : this.vx_p_rendered;
    }

    protected Panel.Func_any_render_from_panel vx_p_render_fn;

    @Override
    public Panel.Func_any_render_from_panel render_fn() {
      return this.vx_p_render_fn == null ? Panel.e_any_render_from_panel : this.vx_p_render_fn;
    }

    protected Panel.Type_panelmap vx_p_panelmap;

    @Override
    public Panel.Type_panelmap panelmap() {
      return this.vx_p_panelmap == null ? Panel.e_panelmap : this.vx_p_panelmap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":layout":
        output = this.layout();
        break;
      case ":data":
        output = this.data();
        break;
      case ":rendered":
        output = this.rendered();
        break;
      case ":render-fn":
        output = this.render_fn();
        break;
      case ":panelmap":
        output = this.panelmap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":layout", this.layout());
      output.put(":data", this.data());
      output.put(":rendered", this.rendered());
      output.put(":render-fn", this.render_fn());
      output.put(":panelmap", this.panelmap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_panel vx_new(final Object... vals) {return e_panel.vx_copy(vals);}

    @Override
    public Type_panel vx_copy(final Object... vals) {
      Type_panel output = this;
      boolean ischanged = false;
      Class_panel val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Panel.Type_layout vx_p_layout = val.layout();
      Core.Type_any vx_p_data = val.data();
      Core.Type_any vx_p_rendered = val.rendered();
      Panel.Func_any_render_from_panel vx_p_render_fn = val.render_fn();
      Panel.Type_panelmap vx_p_panelmap = val.panelmap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":layout");
      validkeys.add(":data");
      validkeys.add(":rendered");
      validkeys.add(":render-fn");
      validkeys.add(":panelmap");
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
            msg = Core.vx_msg_from_error(":invalidkeytype (new panel) " + svalsub);
            msgblock = msgblock.vx_copy(msg);
          }
          if (istestkey) {
            boolean isvalidkey = validkeys.contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else {
              msg = Core.vx_msg_from_error(":invalidkey (new panel) " + testkey);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":layout":
            if (valsub == vx_p_layout) {
            } else if (valsub instanceof Panel.Type_layout) {
              ischanged = true;
              vx_p_layout = (Panel.Type_layout)valsub;
            } else {
              msg = Core.vx_msg_from_error(":invalidvalue (new panel :layout " + valsub.toString() + ")");
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":data":
            if (valsub == vx_p_data) {
            } else if (valsub instanceof Core.Type_any) {
              ischanged = true;
              vx_p_data = (Core.Type_any)valsub;
            } else {
              msg = Core.vx_msg_from_error(":invalidvalue (new panel :data " + valsub.toString() + ")");
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":rendered":
            if (valsub == vx_p_rendered) {
            } else if (valsub instanceof Core.Type_any) {
              ischanged = true;
              vx_p_rendered = (Core.Type_any)valsub;
            } else {
              msg = Core.vx_msg_from_error(":invalidvalue (new panel :rendered " + valsub.toString() + ")");
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":render-fn":
            if (valsub == vx_p_render_fn) {
            } else if (valsub instanceof Panel.Func_any_render_from_panel) {
              ischanged = true;
              vx_p_render_fn = (Panel.Func_any_render_from_panel)valsub;
            } else {
              msg = Core.vx_msg_from_error(":invalidvalue (new panel :render-fn " + valsub.toString() + ")");
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":panelmap":
            if (valsub == vx_p_panelmap) {
            } else if (valsub instanceof Panel.Type_panelmap) {
              ischanged = true;
              vx_p_panelmap = (Panel.Type_panelmap)valsub;
            } else {
              msg = Core.vx_msg_from_error(":invalidvalue (new panel :panelmap " + valsub.toString() + ")");
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            msg = Core.vx_msg_from_error(":invalidkey (new panel) " + key);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_panel work = new Class_panel();
        work.vx_p_layout = vx_p_layout;
        work.vx_p_data = vx_p_data;
        work.vx_p_rendered = vx_p_rendered;
        work.vx_p_render_fn = vx_p_render_fn;
        work.vx_p_panelmap = vx_p_panelmap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_panel vx_empty() {return e_panel;}
    @Override
    public Type_panel vx_type() {return t_panel;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/panel", // pkgname
        "panel", // name
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

  public static final Type_panel e_panel = new Class_panel();
  public static final Type_panel t_panel = new Class_panel();

  /**
   * type: panelmap
   * (type panelmap)
   */
  public interface Type_panelmap extends Core.Type_map {
    public Panel.Type_panelmap vx_new(final Object... vals);
    public Panel.Type_panelmap vx_copy(final Object... vals);
    public Panel.Type_panelmap vx_empty();
    public Panel.Type_panelmap vx_type();
    public Map<String, Panel.Type_panel> vx_mappanel();
    public Panel.Type_panel vx_panel(final Core.Type_string key);
  }

  public static class Class_panelmap extends Core.Class_base implements Type_panelmap {

    protected Map<String, Panel.Type_panel> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Panel.Type_panel>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Panel.Type_panel vx_panel(final Core.Type_string key) {
      Panel.Type_panel output = Panel.e_panel;
      Class_panelmap map = this;
      String skey = key.vx_string();
      Map<String, Panel.Type_panel> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Panel.e_panel);
      return output;
    }

    @Override
    public Map<String, Panel.Type_panel> vx_mappanel() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_panel(key);
    }

    @Override
    public Type_panelmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_panelmap output = new Class_panelmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Panel.Type_panel> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Panel.Type_panel) {
          Panel.Type_panel castval = (Panel.Type_panel)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("(panelmap) Invalid Value: " + val.toString() + "");
          msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
        }
      }
      output.vx_p_map = Core.immutablemap(map);
      if (msgblock != Core.e_msgblock) {
        output.vxmsgblock = msgblock;
      }
      return output;
    }

    @Override
    public Type_panelmap vx_new(final Object... vals) {return e_panelmap.vx_copy(vals);}

    @Override
    public Type_panelmap vx_copy(final Object... vals) {
      Type_panelmap output = this;
      boolean ischanged = false;
      Class_panelmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Panel.Type_panel> mapval = new LinkedHashMap<>(val.vx_mappanel());
      Core.Type_msg msg;
      String key = "";
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = Core.t_msgblock.vx_copy(msgblock, valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = Core.t_msgblock.vx_copy(msgblock, valsub);
        } else if (key.equals("")) {
          if (valsub instanceof Core.Type_string) {
            Core.Type_string valstring = (Core.Type_string)valsub;
            key = valstring.vx_string();
          } else if (valsub instanceof String) {
            key = (String)valsub;
          } else {
            msg = Core.vx_msg_from_error(":keyexpected: " + valsub.toString() + "");
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Panel.Type_panel valany = null;
          if (valsub instanceof Panel.Type_panel) {
            valany = (Panel.Type_panel)valsub;
          } else if (valsub instanceof Panel.Type_panel) {
            valany = (Panel.Type_panel)valsub;
          } else {
            msg = Core.vx_msg_from_error(":invalidkeyvalue: " + key + " "  + valsub.toString() + "");
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
          if (valany != null) {
            ischanged = true;
            if (key.startsWith(":")) {
              key = key.substring(1);
            }
            mapval.put(key, valany);
            key = "";
          }
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_panelmap work = new Class_panelmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_panelmap vx_empty() {return e_panelmap;}
    @Override
    public Type_panelmap vx_type() {return t_panelmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/panel", // pkgname
        "panelmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Panel.t_panel), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_panelmap e_panelmap = new Class_panelmap();
  public static final Type_panelmap t_panelmap = new Class_panelmap();

  /**
   * Constant: layout-app
   * {layout}
   */
  public static class Const_layout_app extends Panel.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/panel", // pkgname
        "layout-app", // name
        Core.typedef_new(
          "vx/ui/panel", // pkgname
          "layout", // name
          ":struct", // extends
          Core.e_typelist, // traits
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

    public static void const_new(Const_layout_app output) {
    }


  }

  public static final Const_layout_app c_layout_app = new Const_layout_app();


  /**
   * Constant: layout-background
   * {layout}
   */
  public static class Const_layout_background extends Panel.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/panel", // pkgname
        "layout-background", // name
        Core.typedef_new(
          "vx/ui/panel", // pkgname
          "layout", // name
          ":struct", // extends
          Core.e_typelist, // traits
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

    public static void const_new(Const_layout_background output) {
    }


  }

  public static final Const_layout_background c_layout_background = new Const_layout_background();


  /**
   * Constant: layout-navigation
   * {layout}
   */
  public static class Const_layout_navigation extends Panel.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/panel", // pkgname
        "layout-navigation", // name
        Core.typedef_new(
          "vx/ui/panel", // pkgname
          "layout", // name
          ":struct", // extends
          Core.e_typelist, // traits
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

    public static void const_new(Const_layout_navigation output) {
    }


  }

  public static final Const_layout_navigation c_layout_navigation = new Const_layout_navigation();


  /**
   * Constant: layout-split-horizontal
   * {layout}
   */
  public static class Const_layout_split_horizontal extends Panel.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/panel", // pkgname
        "layout-split-horizontal", // name
        Core.typedef_new(
          "vx/ui/panel", // pkgname
          "layout", // name
          ":struct", // extends
          Core.e_typelist, // traits
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

    public static void const_new(Const_layout_split_horizontal output) {
    }


  }

  public static final Const_layout_split_horizontal c_layout_split_horizontal = new Const_layout_split_horizontal();


  /**
   * Constant: layout-split-vertical
   * {layout}
   */
  public static class Const_layout_split_vertical extends Panel.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/panel", // pkgname
        "layout-split-vertical", // name
        Core.typedef_new(
          "vx/ui/panel", // pkgname
          "layout", // name
          ":struct", // extends
          Core.e_typelist, // traits
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

    public static void const_new(Const_layout_split_vertical output) {
    }


  }

  public static final Const_layout_split_vertical c_layout_split_vertical = new Const_layout_split_vertical();

  /**
   * @function any_render_from_panel
   * Returns a rendered object from a panel.
   * @param  {panel} panel
   * @return {any}
   * (func any-render<-panel)
   */
  public static interface Func_any_render_from_panel extends Core.Func_any_from_any {
    public Core.Type_any vx_any_render_from_panel(final Panel.Type_panel panel);
  }

  public static class Class_any_render_from_panel extends Core.Class_base implements Func_any_render_from_panel {

    @Override
    public Func_any_render_from_panel vx_new(Object... vals) {
      Class_any_render_from_panel output = new Class_any_render_from_panel();
      return output;
    }

    @Override
    public Func_any_render_from_panel vx_copy(Object... vals) {
      Class_any_render_from_panel output = new Class_any_render_from_panel();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/panel", // pkgname
        "any-render<-panel", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "any", // name
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
    public Func_any_render_from_panel vx_empty() {return e_any_render_from_panel;}
    @Override
    public Func_any_render_from_panel vx_type() {return t_any_render_from_panel;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Panel.Type_panel inputval = (Panel.Type_panel)value;
      Core.Type_any outputval = Panel.f_any_render_from_panel(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Panel.Type_panel panel = Core.f_any_from_any(Panel.t_panel, arglist.vx_any(Core.vx_new_int(0)));
      output = Panel.f_any_render_from_panel(panel);
      return output;
    }

    @Override
    public Core.Type_any vx_any_render_from_panel(final Panel.Type_panel panel) {
      return Panel.f_any_render_from_panel(panel);
    }

  }

  public static final Func_any_render_from_panel e_any_render_from_panel = new Panel.Class_any_render_from_panel();
  public static final Func_any_render_from_panel t_any_render_from_panel = new Panel.Class_any_render_from_panel();

  public static Core.Type_any f_any_render_from_panel(final Panel.Type_panel panel) {
    Core.Type_any output = Core.e_any;
    return output;
  }

  /**
   * @function boolean_render_from_panelmap
   * Renders a panelmap and returns true if successful.
   * @param  {panelmap} panelmap
   * @return {boolean}
   * (func boolean-render<-panelmap)
   */
  public static interface Func_boolean_render_from_panelmap extends Core.Func_any_from_any {
    public Core.Type_boolean vx_boolean_render_from_panelmap(final Panel.Type_panelmap panelmap);
  }

  public static class Class_boolean_render_from_panelmap extends Core.Class_base implements Func_boolean_render_from_panelmap {

    @Override
    public Func_boolean_render_from_panelmap vx_new(Object... vals) {
      Class_boolean_render_from_panelmap output = new Class_boolean_render_from_panelmap();
      return output;
    }

    @Override
    public Func_boolean_render_from_panelmap vx_copy(Object... vals) {
      Class_boolean_render_from_panelmap output = new Class_boolean_render_from_panelmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/panel", // pkgname
        "boolean-render<-panelmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "boolean", // name
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
    public Func_boolean_render_from_panelmap vx_empty() {return e_boolean_render_from_panelmap;}
    @Override
    public Func_boolean_render_from_panelmap vx_type() {return t_boolean_render_from_panelmap;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Panel.Type_panelmap inputval = (Panel.Type_panelmap)value;
      Core.Type_any outputval = Panel.f_boolean_render_from_panelmap(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Panel.Type_panelmap panelmap = Core.f_any_from_any(Panel.t_panelmap, arglist.vx_any(Core.vx_new_int(0)));
      output = Panel.f_boolean_render_from_panelmap(panelmap);
      return output;
    }

    @Override
    public Core.Type_boolean vx_boolean_render_from_panelmap(final Panel.Type_panelmap panelmap) {
      return Panel.f_boolean_render_from_panelmap(panelmap);
    }

  }

  public static final Func_boolean_render_from_panelmap e_boolean_render_from_panelmap = new Panel.Class_boolean_render_from_panelmap();
  public static final Func_boolean_render_from_panelmap t_boolean_render_from_panelmap = new Panel.Class_boolean_render_from_panelmap();

  public static Core.Type_boolean f_boolean_render_from_panelmap(final Panel.Type_panelmap panelmap) {
    Core.Type_boolean output = Core.e_boolean;
    return output;
  }


  static {
    Const_layout_app.const_new(c_layout_app);
    Const_layout_background.const_new(c_layout_background);
    Const_layout_navigation.const_new(c_layout_navigation);
    Const_layout_split_horizontal.const_new(c_layout_split_horizontal);
    Const_layout_split_vertical.const_new(c_layout_split_vertical);
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    maptype.put("layout", Panel.t_layout);
    maptype.put("panel", Panel.t_panel);
    maptype.put("panelmap", Panel.t_panelmap);
    mapconst.put("layout-app", Panel.c_layout_app);
    mapconst.put("layout-background", Panel.c_layout_background);
    mapconst.put("layout-navigation", Panel.c_layout_navigation);
    mapconst.put("layout-split-horizontal", Panel.c_layout_split_horizontal);
    mapconst.put("layout-split-vertical", Panel.c_layout_split_vertical);
    mapfunc.put("any-render<-panel", Panel.t_any_render_from_panel);
    mapfunc.put("boolean-render<-panelmap", Panel.t_boolean_render_from_panelmap);
    Core.vx_global_package_set("vx/ui/panel", maptype, mapconst, mapfunc);
  }

}
