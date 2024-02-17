package com.vxlisp.vx.ui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import com.vxlisp.vx.*;

public final class Ui {


  /**
   * type: render
   * Universal Rendered UI
   * (type render)
   */
  public interface Type_render extends Core.Type_struct {
    public Ui.Type_render vx_new(final Object... vals);
    public Ui.Type_render vx_copy(final Object... vals);
    public Ui.Type_render vx_empty();
    public Ui.Type_render vx_type();
  }

  public static class Class_render extends Core.Class_base implements Type_render {

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
    public Type_render vx_new(final Object... vals) {return e_render.vx_copy(vals);}

    @Override
    public Type_render vx_copy(final Object... vals) {
      Type_render output = this;
      boolean ischanged = false;
      Class_render val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_render work = new Class_render();
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_render vx_empty() {return e_render;}
    @Override
    public Type_render vx_type() {return t_render;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
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
      );
    }

  }

  public static final Type_render e_render = new Class_render();
  public static final Type_render t_render = new Class_render();

  /**
   * type: renderer
   * Universal Renderer
   * (type renderer)
   */
  public interface Type_renderer extends Core.Type_struct {
    public Ui.Type_renderer vx_new(final Object... vals);
    public Ui.Type_renderer vx_copy(final Object... vals);
    public Ui.Type_renderer vx_empty();
    public Ui.Type_renderer vx_type();
    public Ui.Func_render_from_ui_orig fn_render();
  }

  public static class Class_renderer extends Core.Class_base implements Type_renderer {

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
    public Type_renderer vx_new(final Object... vals) {return e_renderer.vx_copy(vals);}

    @Override
    public Type_renderer vx_copy(final Object... vals) {
      Type_renderer output = this;
      boolean ischanged = false;
      Class_renderer val = this;
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
            msg = Core.vx_msg_from_error("vx/ui/ui/renderer", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/ui/ui/renderer", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("vx/ui/ui/renderer", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/ui/ui/renderer", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_renderer work = new Class_renderer();
        work.vx_p_fn_render = vx_p_fn_render;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_renderer vx_empty() {return e_renderer;}
    @Override
    public Type_renderer vx_type() {return t_renderer;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/ui", // pkgname
        "renderer", // name
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

  public static final Type_renderer e_renderer = new Class_renderer();
  public static final Type_renderer t_renderer = new Class_renderer();

  /**
   * type: rendermap
   * Map of render
   * (type rendermap)
   */
  public interface Type_rendermap extends Core.Type_map {
    public Ui.Type_rendermap vx_new(final Object... vals);
    public Ui.Type_rendermap vx_copy(final Object... vals);
    public Ui.Type_rendermap vx_empty();
    public Ui.Type_rendermap vx_type();
    public Map<String, Ui.Type_render> vx_maprender();
    public Ui.Type_render vx_render(final Core.Type_string key);
  }

  public static class Class_rendermap extends Core.Class_base implements Type_rendermap {

    protected Map<String, Ui.Type_render> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Ui.Type_render>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Ui.Type_render vx_render(final Core.Type_string key) {
      Ui.Type_render output = Ui.e_render;
      Class_rendermap map = this;
      String skey = key.vx_string();
      Map<String, Ui.Type_render> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Ui.e_render);
      return output;
    }

    @Override
    public Map<String, Ui.Type_render> vx_maprender() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_render(key);
    }

    @Override
    public Type_rendermap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_rendermap output = new Class_rendermap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Ui.Type_render> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Ui.Type_render) {
          Ui.Type_render castval = (Ui.Type_render)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("vx/ui/ui/rendermap", ":invalidvalue", val);
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
    public Type_rendermap vx_new(final Object... vals) {return e_rendermap.vx_copy(vals);}

    @Override
    public Type_rendermap vx_copy(final Object... vals) {
      Type_rendermap output = this;
      boolean ischanged = false;
      Class_rendermap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Ui.Type_render> mapval = new LinkedHashMap<>(val.vx_maprender());
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
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/ui/ui/rendermap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Ui.Type_render valany = null;
          if (valsub instanceof Ui.Type_render) {
            valany = (Ui.Type_render)valsub;
          } else if (valsub instanceof Ui.Type_render) {
            valany = (Ui.Type_render)valsub;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
            mapany.put("key", Core.vx_new_string(key));
            mapany.put("value", msgval);
            Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
            msg = Core.vx_msg_from_error("vx/ui/ui/rendermap", ":invalidkeyvalue", msgmap);
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
        Class_rendermap work = new Class_rendermap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_rendermap vx_empty() {return e_rendermap;}
    @Override
    public Type_rendermap vx_type() {return t_rendermap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/ui", // pkgname
        "rendermap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Ui.t_render), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_rendermap e_rendermap = new Class_rendermap();
  public static final Type_rendermap t_rendermap = new Class_rendermap();

  /**
   * type: ui
   * Universal UI Element
   * (type ui)
   */
  public interface Type_ui extends Core.Type_struct {
    public Ui.Type_ui vx_new(final Object... vals);
    public Ui.Type_ui vx_copy(final Object... vals);
    public Ui.Type_ui vx_empty();
    public Ui.Type_ui vx_type();
    public Core.Type_any data();
    public Core.Type_string path();
    public Ui.Type_render render();
    public Ui.Type_renderer renderer();
    public Core.Type_string uid();
    public Ui.Type_uimap uimap();
    public Ui.Type_uistyle uistyle();
    public Ui.Type_uistylesheet uistylesheet();
  }

  public static class Class_ui extends Core.Class_base implements Type_ui {

    protected Core.Type_any vx_p_data;

    @Override
    public Core.Type_any data() {
      return this.vx_p_data == null ? Core.e_any : this.vx_p_data;
    }

    protected Core.Type_string vx_p_path;

    @Override
    public Core.Type_string path() {
      return this.vx_p_path == null ? Core.e_string : this.vx_p_path;
    }

    protected Ui.Type_render vx_p_render;

    @Override
    public Ui.Type_render render() {
      return this.vx_p_render == null ? Ui.e_render : this.vx_p_render;
    }

    protected Ui.Type_renderer vx_p_renderer;

    @Override
    public Ui.Type_renderer renderer() {
      return this.vx_p_renderer == null ? Ui.e_renderer : this.vx_p_renderer;
    }

    protected Core.Type_string vx_p_uid;

    @Override
    public Core.Type_string uid() {
      return this.vx_p_uid == null ? Core.e_string : this.vx_p_uid;
    }

    protected Ui.Type_uimap vx_p_uimap;

    @Override
    public Ui.Type_uimap uimap() {
      return this.vx_p_uimap == null ? Ui.e_uimap : this.vx_p_uimap;
    }

    protected Ui.Type_uistyle vx_p_uistyle;

    @Override
    public Ui.Type_uistyle uistyle() {
      return this.vx_p_uistyle == null ? Ui.e_uistyle : this.vx_p_uistyle;
    }

    protected Ui.Type_uistylesheet vx_p_uistylesheet;

    @Override
    public Ui.Type_uistylesheet uistylesheet() {
      return this.vx_p_uistylesheet == null ? Ui.e_uistylesheet : this.vx_p_uistylesheet;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":data":
        output = this.data();
        break;
      case ":path":
        output = this.path();
        break;
      case ":render":
        output = this.render();
        break;
      case ":renderer":
        output = this.renderer();
        break;
      case ":uid":
        output = this.uid();
        break;
      case ":uimap":
        output = this.uimap();
        break;
      case ":uistyle":
        output = this.uistyle();
        break;
      case ":uistylesheet":
        output = this.uistylesheet();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":data", this.data());
      output.put(":path", this.path());
      output.put(":render", this.render());
      output.put(":renderer", this.renderer());
      output.put(":uid", this.uid());
      output.put(":uimap", this.uimap());
      output.put(":uistyle", this.uistyle());
      output.put(":uistylesheet", this.uistylesheet());
      return Core.immutablemap(output);
    }

    @Override
    public Type_ui vx_new(final Object... vals) {return e_ui.vx_copy(vals);}

    @Override
    public Type_ui vx_copy(final Object... vals) {
      Type_ui output = this;
      boolean ischanged = false;
      Class_ui val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_any vx_p_data = val.data();
      Core.Type_string vx_p_path = val.path();
      Ui.Type_render vx_p_render = val.render();
      Ui.Type_renderer vx_p_renderer = val.renderer();
      Core.Type_string vx_p_uid = val.uid();
      Ui.Type_uimap vx_p_uimap = val.uimap();
      Ui.Type_uistyle vx_p_uistyle = val.uistyle();
      Ui.Type_uistylesheet vx_p_uistylesheet = val.uistylesheet();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":data");
      validkeys.add(":path");
      validkeys.add(":render");
      validkeys.add(":renderer");
      validkeys.add(":uid");
      validkeys.add(":uimap");
      validkeys.add(":uistyle");
      validkeys.add(":uistylesheet");
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
            msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":data":
            if (valsub == vx_p_data) {
            } else if (valsub instanceof Core.Type_any) {
              ischanged = true;
              vx_p_data = (Core.Type_any)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("data"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":path":
            if (valsub == vx_p_path) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_path = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_path = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("path"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":render":
            if (valsub == vx_p_render) {
            } else if (valsub instanceof Ui.Type_render) {
              ischanged = true;
              vx_p_render = (Ui.Type_render)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("render"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":renderer":
            if (valsub == vx_p_renderer) {
            } else if (valsub instanceof Ui.Type_renderer) {
              ischanged = true;
              vx_p_renderer = (Ui.Type_renderer)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("renderer"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":uid":
            if (valsub == vx_p_uid) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_uid = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_uid = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("uid"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":uimap":
            if (valsub == vx_p_uimap) {
            } else if (valsub instanceof Ui.Type_uimap) {
              ischanged = true;
              vx_p_uimap = (Ui.Type_uimap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("uimap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":uistyle":
            if (valsub == vx_p_uistyle) {
            } else if (valsub instanceof Ui.Type_uistyle) {
              ischanged = true;
              vx_p_uistyle = (Ui.Type_uistyle)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("uistyle"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":uistylesheet":
            if (valsub == vx_p_uistylesheet) {
            } else if (valsub instanceof Ui.Type_uistylesheet) {
              ischanged = true;
              vx_p_uistylesheet = (Ui.Type_uistylesheet)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("uistylesheet"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_ui work = new Class_ui();
        work.vx_p_data = vx_p_data;
        work.vx_p_path = vx_p_path;
        work.vx_p_render = vx_p_render;
        work.vx_p_renderer = vx_p_renderer;
        work.vx_p_uid = vx_p_uid;
        work.vx_p_uimap = vx_p_uimap;
        work.vx_p_uistyle = vx_p_uistyle;
        work.vx_p_uistylesheet = vx_p_uistylesheet;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_ui vx_empty() {return e_ui;}
    @Override
    public Type_ui vx_type() {return t_ui;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
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
      );
    }

  }

  public static final Type_ui e_ui = new Class_ui();
  public static final Type_ui t_ui = new Class_ui();

  /**
   * type: uilayout
   * Universal Layout
   * (type uilayout)
   */
  public interface Type_uilayout extends Core.Type_struct {
    public Ui.Type_uilayout vx_new(final Object... vals);
    public Ui.Type_uilayout vx_copy(final Object... vals);
    public Ui.Type_uilayout vx_empty();
    public Ui.Type_uilayout vx_type();
  }

  public static class Class_uilayout extends Core.Class_base implements Type_uilayout {

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
    public Type_uilayout vx_new(final Object... vals) {return e_uilayout.vx_copy(vals);}

    @Override
    public Type_uilayout vx_copy(final Object... vals) {
      Type_uilayout output = this;
      boolean ischanged = false;
      Class_uilayout val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_uilayout work = new Class_uilayout();
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_uilayout vx_empty() {return e_uilayout;}
    @Override
    public Type_uilayout vx_type() {return t_uilayout;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/ui", // pkgname
        "uilayout", // name
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

  public static final Type_uilayout e_uilayout = new Class_uilayout();
  public static final Type_uilayout t_uilayout = new Class_uilayout();

  /**
   * type: uimap
   * (type uimap)
   */
  public interface Type_uimap extends Core.Type_map {
    public Ui.Type_uimap vx_new(final Object... vals);
    public Ui.Type_uimap vx_copy(final Object... vals);
    public Ui.Type_uimap vx_empty();
    public Ui.Type_uimap vx_type();
    public Map<String, Ui.Type_ui> vx_mapui();
    public Ui.Type_ui vx_ui(final Core.Type_string key);
  }

  public static class Class_uimap extends Core.Class_base implements Type_uimap {

    protected Map<String, Ui.Type_ui> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Ui.Type_ui>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Ui.Type_ui vx_ui(final Core.Type_string key) {
      Ui.Type_ui output = Ui.e_ui;
      Class_uimap map = this;
      String skey = key.vx_string();
      Map<String, Ui.Type_ui> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Ui.e_ui);
      return output;
    }

    @Override
    public Map<String, Ui.Type_ui> vx_mapui() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_ui(key);
    }

    @Override
    public Type_uimap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_uimap output = new Class_uimap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Ui.Type_ui> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Ui.Type_ui) {
          Ui.Type_ui castval = (Ui.Type_ui)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("vx/ui/ui/uimap", ":invalidvalue", val);
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
    public Type_uimap vx_new(final Object... vals) {return e_uimap.vx_copy(vals);}

    @Override
    public Type_uimap vx_copy(final Object... vals) {
      Type_uimap output = this;
      boolean ischanged = false;
      Class_uimap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Ui.Type_ui> mapval = new LinkedHashMap<>(val.vx_mapui());
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
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/ui/ui/uimap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Ui.Type_ui valany = null;
          if (valsub instanceof Ui.Type_ui) {
            valany = (Ui.Type_ui)valsub;
          } else if (valsub instanceof Ui.Type_ui) {
            valany = (Ui.Type_ui)valsub;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
            mapany.put("key", Core.vx_new_string(key));
            mapany.put("value", msgval);
            Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
            msg = Core.vx_msg_from_error("vx/ui/ui/uimap", ":invalidkeyvalue", msgmap);
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
        Class_uimap work = new Class_uimap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_uimap vx_empty() {return e_uimap;}
    @Override
    public Type_uimap vx_type() {return t_uimap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/ui", // pkgname
        "uimap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Ui.t_ui), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_uimap e_uimap = new Class_uimap();
  public static final Type_uimap t_uimap = new Class_uimap();

  /**
   * type: uistyle
   * (type uistyle)
   */
  public interface Type_uistyle extends Core.Type_struct {
    public Ui.Type_uistyle vx_new(final Object... vals);
    public Ui.Type_uistyle vx_copy(final Object... vals);
    public Ui.Type_uistyle vx_empty();
    public Ui.Type_uistyle vx_type();
  }

  public static class Class_uistyle extends Core.Class_base implements Type_uistyle {

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
    public Type_uistyle vx_new(final Object... vals) {return e_uistyle.vx_copy(vals);}

    @Override
    public Type_uistyle vx_copy(final Object... vals) {
      Type_uistyle output = this;
      boolean ischanged = false;
      Class_uistyle val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_uistyle work = new Class_uistyle();
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_uistyle vx_empty() {return e_uistyle;}
    @Override
    public Type_uistyle vx_type() {return t_uistyle;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
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
      );
    }

  }

  public static final Type_uistyle e_uistyle = new Class_uistyle();
  public static final Type_uistyle t_uistyle = new Class_uistyle();

  /**
   * type: uistylemap
   * Universal Stylemap
   * (type uistylemap)
   */
  public interface Type_uistylemap extends Core.Type_map {
    public Ui.Type_uistylemap vx_new(final Object... vals);
    public Ui.Type_uistylemap vx_copy(final Object... vals);
    public Ui.Type_uistylemap vx_empty();
    public Ui.Type_uistylemap vx_type();
    public Map<String, Ui.Type_uistyle> vx_mapuistyle();
    public Ui.Type_uistyle vx_uistyle(final Core.Type_string key);
  }

  public static class Class_uistylemap extends Core.Class_base implements Type_uistylemap {

    protected Map<String, Ui.Type_uistyle> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Ui.Type_uistyle>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Ui.Type_uistyle vx_uistyle(final Core.Type_string key) {
      Ui.Type_uistyle output = Ui.e_uistyle;
      Class_uistylemap map = this;
      String skey = key.vx_string();
      Map<String, Ui.Type_uistyle> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Ui.e_uistyle);
      return output;
    }

    @Override
    public Map<String, Ui.Type_uistyle> vx_mapuistyle() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_uistyle(key);
    }

    @Override
    public Type_uistylemap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_uistylemap output = new Class_uistylemap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Ui.Type_uistyle> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Ui.Type_uistyle) {
          Ui.Type_uistyle castval = (Ui.Type_uistyle)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("vx/ui/ui/uistylemap", ":invalidvalue", val);
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
    public Type_uistylemap vx_new(final Object... vals) {return e_uistylemap.vx_copy(vals);}

    @Override
    public Type_uistylemap vx_copy(final Object... vals) {
      Type_uistylemap output = this;
      boolean ischanged = false;
      Class_uistylemap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Ui.Type_uistyle> mapval = new LinkedHashMap<>(val.vx_mapuistyle());
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
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/ui/ui/uistylemap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Ui.Type_uistyle valany = null;
          if (valsub instanceof Ui.Type_uistyle) {
            valany = (Ui.Type_uistyle)valsub;
          } else if (valsub instanceof Ui.Type_uistyle) {
            valany = (Ui.Type_uistyle)valsub;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
            mapany.put("key", Core.vx_new_string(key));
            mapany.put("value", msgval);
            Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
            msg = Core.vx_msg_from_error("vx/ui/ui/uistylemap", ":invalidkeyvalue", msgmap);
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
        Class_uistylemap work = new Class_uistylemap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_uistylemap vx_empty() {return e_uistylemap;}
    @Override
    public Type_uistylemap vx_type() {return t_uistylemap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/ui", // pkgname
        "uistylemap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Ui.t_uistyle), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_uistylemap e_uistylemap = new Class_uistylemap();
  public static final Type_uistylemap t_uistylemap = new Class_uistylemap();

  /**
   * type: uistylesheet
   * Universal Stylesheet
   * (type uistylesheet)
   */
  public interface Type_uistylesheet extends Core.Type_struct {
    public Ui.Type_uistylesheet vx_new(final Object... vals);
    public Ui.Type_uistylesheet vx_copy(final Object... vals);
    public Ui.Type_uistylesheet vx_empty();
    public Ui.Type_uistylesheet vx_type();
    public Ui.Type_uistylemap uistylemap();
  }

  public static class Class_uistylesheet extends Core.Class_base implements Type_uistylesheet {

    protected Ui.Type_uistylemap vx_p_uistylemap;

    @Override
    public Ui.Type_uistylemap uistylemap() {
      return this.vx_p_uistylemap == null ? Ui.e_uistylemap : this.vx_p_uistylemap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":uistylemap":
        output = this.uistylemap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":uistylemap", this.uistylemap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_uistylesheet vx_new(final Object... vals) {return e_uistylesheet.vx_copy(vals);}

    @Override
    public Type_uistylesheet vx_copy(final Object... vals) {
      Type_uistylesheet output = this;
      boolean ischanged = false;
      Class_uistylesheet val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Ui.Type_uistylemap vx_p_uistylemap = val.uistylemap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":uistylemap");
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
            msg = Core.vx_msg_from_error("vx/ui/ui/uistylesheet", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/ui/ui/uistylesheet", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":uistylemap":
            if (valsub == vx_p_uistylemap) {
            } else if (valsub instanceof Ui.Type_uistylemap) {
              ischanged = true;
              vx_p_uistylemap = (Ui.Type_uistylemap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("uistylemap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/uistylesheet", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/ui/ui/uistylesheet", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_uistylesheet work = new Class_uistylesheet();
        work.vx_p_uistylemap = vx_p_uistylemap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_uistylesheet vx_empty() {return e_uistylesheet;}
    @Override
    public Type_uistylesheet vx_type() {return t_uistylesheet;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
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
      );
    }

  }

  public static final Type_uistylesheet e_uistylesheet = new Class_uistylesheet();
  public static final Type_uistylesheet t_uistylesheet = new Class_uistylesheet();

  /**
   * Constant: uilayout-app
   * {uilayout}
   */
  public static class Const_uilayout_app extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-app", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_app output) {
    }


  }

  public static final Const_uilayout_app c_uilayout_app = new Const_uilayout_app();


  /**
   * Constant: uilayout-background
   * {uilayout}
   */
  public static class Const_uilayout_background extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-background", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_background output) {
    }


  }

  public static final Const_uilayout_background c_uilayout_background = new Const_uilayout_background();


  /**
   * Constant: uilayout-combobox
   * {uilayout}
   */
  public static class Const_uilayout_combobox extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-combobox", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_combobox output) {
    }


  }

  public static final Const_uilayout_combobox c_uilayout_combobox = new Const_uilayout_combobox();


  /**
   * Constant: uilayout-flow-horizontal
   * {uilayout}
   */
  public static class Const_uilayout_flow_horizontal extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-flow-horizontal", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_flow_horizontal output) {
    }


  }

  public static final Const_uilayout_flow_horizontal c_uilayout_flow_horizontal = new Const_uilayout_flow_horizontal();


  /**
   * Constant: uilayout-flow-vertical
   * {uilayout}
   */
  public static class Const_uilayout_flow_vertical extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-flow-vertical", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_flow_vertical output) {
    }


  }

  public static final Const_uilayout_flow_vertical c_uilayout_flow_vertical = new Const_uilayout_flow_vertical();


  /**
   * Constant: uilayout-image
   * {uilayout}
   */
  public static class Const_uilayout_image extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-image", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_image output) {
    }


  }

  public static final Const_uilayout_image c_uilayout_image = new Const_uilayout_image();


  /**
   * Constant: uilayout-maxpanel
   * {uilayout}
   */
  public static class Const_uilayout_maxpanel extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-maxpanel", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_maxpanel output) {
    }


  }

  public static final Const_uilayout_maxpanel c_uilayout_maxpanel = new Const_uilayout_maxpanel();


  /**
   * Constant: uilayout-menubar
   * {uilayout}
   */
  public static class Const_uilayout_menubar extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-menubar", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_menubar output) {
    }


  }

  public static final Const_uilayout_menubar c_uilayout_menubar = new Const_uilayout_menubar();


  /**
   * Constant: uilayout-menudrawer
   * {uilayout}
   */
  public static class Const_uilayout_menudrawer extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-menudrawer", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_menudrawer output) {
    }


  }

  public static final Const_uilayout_menudrawer c_uilayout_menudrawer = new Const_uilayout_menudrawer();


  /**
   * Constant: uilayout-navbar
   * {uilayout}
   */
  public static class Const_uilayout_navbar extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-navbar", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_navbar output) {
    }


  }

  public static final Const_uilayout_navbar c_uilayout_navbar = new Const_uilayout_navbar();


  /**
   * Constant: uilayout-navdrawer
   * {uilayout}
   */
  public static class Const_uilayout_navdrawer extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-navdrawer", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_navdrawer output) {
    }


  }

  public static final Const_uilayout_navdrawer c_uilayout_navdrawer = new Const_uilayout_navdrawer();


  /**
   * Constant: uilayout-panel
   * {uilayout}
   */
  public static class Const_uilayout_panel extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-panel", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_panel output) {
    }


  }

  public static final Const_uilayout_panel c_uilayout_panel = new Const_uilayout_panel();


  /**
   * Constant: uilayout-parallax
   * {uilayout}
   */
  public static class Const_uilayout_parallax extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-parallax", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_parallax output) {
    }


  }

  public static final Const_uilayout_parallax c_uilayout_parallax = new Const_uilayout_parallax();


  /**
   * Constant: uilayout-scrollbox
   * {uilayout}
   */
  public static class Const_uilayout_scrollbox extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-scrollbox", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_scrollbox output) {
    }


  }

  public static final Const_uilayout_scrollbox c_uilayout_scrollbox = new Const_uilayout_scrollbox();


  /**
   * Constant: uilayout-scrollbox-horizontal
   * {uilayout}
   */
  public static class Const_uilayout_scrollbox_horizontal extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-scrollbox-horizontal", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_scrollbox_horizontal output) {
    }


  }

  public static final Const_uilayout_scrollbox_horizontal c_uilayout_scrollbox_horizontal = new Const_uilayout_scrollbox_horizontal();


  /**
   * Constant: uilayout-scrollbox-vertical
   * {uilayout}
   */
  public static class Const_uilayout_scrollbox_vertical extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-scrollbox-vertical", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_scrollbox_vertical output) {
    }


  }

  public static final Const_uilayout_scrollbox_vertical c_uilayout_scrollbox_vertical = new Const_uilayout_scrollbox_vertical();


  /**
   * Constant: uilayout-split-horizontal
   * {uilayout}
   */
  public static class Const_uilayout_split_horizontal extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-split-horizontal", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_split_horizontal output) {
    }


  }

  public static final Const_uilayout_split_horizontal c_uilayout_split_horizontal = new Const_uilayout_split_horizontal();


  /**
   * Constant: uilayout-split-vertical
   * {uilayout}
   */
  public static class Const_uilayout_split_vertical extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-split-vertical", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_split_vertical output) {
    }


  }

  public static final Const_uilayout_split_vertical c_uilayout_split_vertical = new Const_uilayout_split_vertical();


  /**
   * Constant: uilayout-statusbar
   * {uilayout}
   */
  public static class Const_uilayout_statusbar extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-statusbar", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_statusbar output) {
    }


  }

  public static final Const_uilayout_statusbar c_uilayout_statusbar = new Const_uilayout_statusbar();


  /**
   * Constant: uilayout-statusdrawer
   * {uilayout}
   */
  public static class Const_uilayout_statusdrawer extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-statusdrawer", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_statusdrawer output) {
    }


  }

  public static final Const_uilayout_statusdrawer c_uilayout_statusdrawer = new Const_uilayout_statusdrawer();


  /**
   * Constant: uilayout-text
   * {uilayout}
   */
  public static class Const_uilayout_text extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-text", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_text output) {
    }


  }

  public static final Const_uilayout_text c_uilayout_text = new Const_uilayout_text();


  /**
   * Constant: uilayout-textentry
   * {uilayout}
   */
  public static class Const_uilayout_textentry extends Ui.Class_uilayout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "uilayout-textentry", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "uilayout", // name
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

    public static void const_new(Const_uilayout_textentry output) {
    }


  }

  public static final Const_uilayout_textentry c_uilayout_textentry = new Const_uilayout_textentry();

  /**
   * @function render_from_fn_render_ui_orig
   * @param  {render<-ui-orig} fn-render
   * @param  {ui} uichg
   * @param  {ui} uiorig
   * @return {render}
   * (func render<-fn-render-ui-orig)
   */
  public static interface Func_render_from_fn_render_ui_orig extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_render vx_render_from_fn_render_ui_orig(final Ui.Func_render_from_ui_orig fn_render, final Ui.Type_ui uichg, final Ui.Type_ui uiorig);
  }

  public static class Class_render_from_fn_render_ui_orig extends Core.Class_base implements Func_render_from_fn_render_ui_orig {

    @Override
    public Func_render_from_fn_render_ui_orig vx_new(Object... vals) {
      Class_render_from_fn_render_ui_orig output = new Class_render_from_fn_render_ui_orig();
      return output;
    }

    @Override
    public Func_render_from_fn_render_ui_orig vx_copy(Object... vals) {
      Class_render_from_fn_render_ui_orig output = new Class_render_from_fn_render_ui_orig();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/ui", // pkgname
        "render<-fn-render-ui-orig", // name
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
    public Func_render_from_fn_render_ui_orig vx_empty() {return e_render_from_fn_render_ui_orig;}
    @Override
    public Func_render_from_fn_render_ui_orig vx_type() {return t_render_from_fn_render_ui_orig;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Func_render_from_ui_orig fn_render = Core.f_any_from_any(Ui.t_render_from_ui_orig, arglist.vx_any(Core.vx_new_int(0)));
      Ui.Type_ui uichg = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(1)));
      Ui.Type_ui uiorig = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(2)));
      output = Ui.f_render_from_fn_render_ui_orig(fn_render, uichg, uiorig);
      return output;
    }

    @Override
    public Ui.Type_render vx_render_from_fn_render_ui_orig(final Ui.Func_render_from_ui_orig fn_render, final Ui.Type_ui uichg, final Ui.Type_ui uiorig) {
      return Ui.f_render_from_fn_render_ui_orig(fn_render, uichg, uiorig);
    }

  }

  public static final Func_render_from_fn_render_ui_orig e_render_from_fn_render_ui_orig = new Ui.Class_render_from_fn_render_ui_orig();
  public static final Func_render_from_fn_render_ui_orig t_render_from_fn_render_ui_orig = new Ui.Class_render_from_fn_render_ui_orig();

  public static Ui.Type_render f_render_from_fn_render_ui_orig(final Ui.Func_render_from_ui_orig fn_render, final Ui.Type_ui uichg, final Ui.Type_ui uiorig) {
    Ui.Type_render output = Ui.e_render;
    output = Core.vx_any_from_func(Ui.t_render, fn_render, uichg, uiorig);
    return output;
  }

  /**
   * @function render_from_renderer_ui_orig
   * @param  {renderer} renderer
   * @param  {ui} uichg
   * @param  {ui} uiorig
   * @return {render}
   * (func render<-renderer-ui-orig)
   */
  public static interface Func_render_from_renderer_ui_orig extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_render vx_render_from_renderer_ui_orig(final Ui.Type_renderer renderer, final Ui.Type_ui uichg, final Ui.Type_ui uiorig);
  }

  public static class Class_render_from_renderer_ui_orig extends Core.Class_base implements Func_render_from_renderer_ui_orig {

    @Override
    public Func_render_from_renderer_ui_orig vx_new(Object... vals) {
      Class_render_from_renderer_ui_orig output = new Class_render_from_renderer_ui_orig();
      return output;
    }

    @Override
    public Func_render_from_renderer_ui_orig vx_copy(Object... vals) {
      Class_render_from_renderer_ui_orig output = new Class_render_from_renderer_ui_orig();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/ui", // pkgname
        "render<-renderer-ui-orig", // name
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
    public Func_render_from_renderer_ui_orig vx_empty() {return e_render_from_renderer_ui_orig;}
    @Override
    public Func_render_from_renderer_ui_orig vx_type() {return t_render_from_renderer_ui_orig;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Type_renderer renderer = Core.f_any_from_any(Ui.t_renderer, arglist.vx_any(Core.vx_new_int(0)));
      Ui.Type_ui uichg = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(1)));
      Ui.Type_ui uiorig = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(2)));
      output = Ui.f_render_from_renderer_ui_orig(renderer, uichg, uiorig);
      return output;
    }

    @Override
    public Ui.Type_render vx_render_from_renderer_ui_orig(final Ui.Type_renderer renderer, final Ui.Type_ui uichg, final Ui.Type_ui uiorig) {
      return Ui.f_render_from_renderer_ui_orig(renderer, uichg, uiorig);
    }

  }

  public static final Func_render_from_renderer_ui_orig e_render_from_renderer_ui_orig = new Ui.Class_render_from_renderer_ui_orig();
  public static final Func_render_from_renderer_ui_orig t_render_from_renderer_ui_orig = new Ui.Class_render_from_renderer_ui_orig();

  public static Ui.Type_render f_render_from_renderer_ui_orig(final Ui.Type_renderer renderer, final Ui.Type_ui uichg, final Ui.Type_ui uiorig) {
    Ui.Type_render output = Ui.e_render;
    output = Core.f_let(
      Ui.t_render,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Ui.Func_render_from_ui_orig fn_render = renderer.fn_render();
        final Ui.Type_render renderchg = Core.vx_any_from_func(Ui.t_render, fn_render, uichg, uiorig);
        return renderchg;
      })
    );
    return output;
  }

  /**
   * @function render_from_ui
   * Returns a rendered object from a UI Element.
   * @param  {ui} uichg
   * @return {render}
   * (func render<-ui)
   */
  public static interface Func_render_from_ui extends Core.Func_any_from_any {
    public Ui.Type_render vx_render_from_ui(final Ui.Type_ui uichg);
  }

  public static class Class_render_from_ui extends Core.Class_base implements Func_render_from_ui {

    @Override
    public Func_render_from_ui vx_new(Object... vals) {
      Class_render_from_ui output = new Class_render_from_ui();
      return output;
    }

    @Override
    public Func_render_from_ui vx_copy(Object... vals) {
      Class_render_from_ui output = new Class_render_from_ui();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/ui", // pkgname
        "render<-ui", // name
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
    public Func_render_from_ui vx_empty() {return e_render_from_ui;}
    @Override
    public Func_render_from_ui vx_type() {return t_render_from_ui;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Ui.Type_ui inputval = (Ui.Type_ui)value;
      Core.Type_any outputval = Ui.f_render_from_ui(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Type_ui uichg = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(0)));
      output = Ui.f_render_from_ui(uichg);
      return output;
    }

    @Override
    public Ui.Type_render vx_render_from_ui(final Ui.Type_ui uichg) {
      return Ui.f_render_from_ui(uichg);
    }

  }

  public static final Func_render_from_ui e_render_from_ui = new Ui.Class_render_from_ui();
  public static final Func_render_from_ui t_render_from_ui = new Ui.Class_render_from_ui();

  public static Ui.Type_render f_render_from_ui(final Ui.Type_ui uichg) {
    Ui.Type_render output = Ui.e_render;
    output = Ui.f_render_from_ui_orig(
      uichg,
      Core.f_empty(
        Ui.t_ui
      )
    );
    return output;
  }

  /**
   * @function render_from_ui_orig
   * Returns a rendered object from a UI Element.
   * @param  {ui} uichg
   * @param  {ui} uiorig
   * @return {render}
   * (func render<-ui-orig)
   */
  public static interface Func_render_from_ui_orig extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_render vx_render_from_ui_orig(final Ui.Type_ui uichg, final Ui.Type_ui uiorig);
  }

  public static class Class_render_from_ui_orig extends Core.Class_base implements Func_render_from_ui_orig {

    @Override
    public Func_render_from_ui_orig vx_new(Object... vals) {
      Class_render_from_ui_orig output = new Class_render_from_ui_orig();
      return output;
    }

    @Override
    public Func_render_from_ui_orig vx_copy(Object... vals) {
      Class_render_from_ui_orig output = new Class_render_from_ui_orig();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/ui", // pkgname
        "render<-ui-orig", // name
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
    public Func_render_from_ui_orig vx_empty() {return e_render_from_ui_orig;}
    @Override
    public Func_render_from_ui_orig vx_type() {return t_render_from_ui_orig;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Type_ui uichg = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(0)));
      Ui.Type_ui uiorig = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(1)));
      output = Ui.f_render_from_ui_orig(uichg, uiorig);
      return output;
    }

    @Override
    public Ui.Type_render vx_render_from_ui_orig(final Ui.Type_ui uichg, final Ui.Type_ui uiorig) {
      return Ui.f_render_from_ui_orig(uichg, uiorig);
    }

  }

  public static final Func_render_from_ui_orig e_render_from_ui_orig = new Ui.Class_render_from_ui_orig();
  public static final Func_render_from_ui_orig t_render_from_ui_orig = new Ui.Class_render_from_ui_orig();

  public static Ui.Type_render f_render_from_ui_orig(final Ui.Type_ui uichg, final Ui.Type_ui uiorig) {
    Ui.Type_render output = Ui.e_render;
    output = Core.f_if_2(
      Ui.t_render,
      Core.t_thenelselist.vx_new(
        Core.f_then(
          Core.t_boolean_from_func.vx_fn_new(() -> {
            return Core.f_eqeq(uichg, uiorig);
          }),
          Core.t_any_from_func.vx_fn_new(() -> {
            return uiorig;
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_let(
              Ui.t_render,
              Core.t_any_from_func.vx_fn_new(() -> {
                final Ui.Type_renderer renderer = Ui.t_ui.renderer();
                final Ui.Type_render renderchg = Core.f_empty(
                  Ui.t_render
                );
                return renderchg;
              })
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function rendermap_from_uimap
   * Renders a uimap and returns a rendermap.
   * @param  {uimap} uimap
   * @return {rendermap}
   * (func rendermap<-uimap)
   */
  public static interface Func_rendermap_from_uimap extends Core.Func_any_from_any {
    public Ui.Type_rendermap vx_rendermap_from_uimap(final Ui.Type_uimap uimap);
  }

  public static class Class_rendermap_from_uimap extends Core.Class_base implements Func_rendermap_from_uimap {

    @Override
    public Func_rendermap_from_uimap vx_new(Object... vals) {
      Class_rendermap_from_uimap output = new Class_rendermap_from_uimap();
      return output;
    }

    @Override
    public Func_rendermap_from_uimap vx_copy(Object... vals) {
      Class_rendermap_from_uimap output = new Class_rendermap_from_uimap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/ui", // pkgname
        "rendermap<-uimap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/ui/ui", // pkgname
          "rendermap", // name
          ":map", // extends
          Core.e_typelist, // traits
          Core.t_typelist.vx_new(Ui.t_render), // allowtypes
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
    public Func_rendermap_from_uimap vx_empty() {return e_rendermap_from_uimap;}
    @Override
    public Func_rendermap_from_uimap vx_type() {return t_rendermap_from_uimap;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Ui.Type_uimap inputval = (Ui.Type_uimap)value;
      Core.Type_any outputval = Ui.f_rendermap_from_uimap(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Type_uimap uimap = Core.f_any_from_any(Ui.t_uimap, arglist.vx_any(Core.vx_new_int(0)));
      output = Ui.f_rendermap_from_uimap(uimap);
      return output;
    }

    @Override
    public Ui.Type_rendermap vx_rendermap_from_uimap(final Ui.Type_uimap uimap) {
      return Ui.f_rendermap_from_uimap(uimap);
    }

  }

  public static final Func_rendermap_from_uimap e_rendermap_from_uimap = new Ui.Class_rendermap_from_uimap();
  public static final Func_rendermap_from_uimap t_rendermap_from_uimap = new Ui.Class_rendermap_from_uimap();

  public static Ui.Type_rendermap f_rendermap_from_uimap(final Ui.Type_uimap uimap) {
    Ui.Type_rendermap output = Ui.e_rendermap;
    return output;
  }

  /**
   * @function ui_render_from_ui_orig
   * Returns a rendered object from a UI Element.
   * @param  {ui} uichg
   * @param  {ui} uiorig
   * @return {ui}
   * (func ui-render<-ui-orig)
   */
  public static interface Func_ui_render_from_ui_orig extends Core.Type_func, Core.Type_replfunc {
    public Ui.Type_ui vx_ui_render_from_ui_orig(final Ui.Type_ui uichg, final Ui.Type_ui uiorig);
  }

  public static class Class_ui_render_from_ui_orig extends Core.Class_base implements Func_ui_render_from_ui_orig {

    @Override
    public Func_ui_render_from_ui_orig vx_new(Object... vals) {
      Class_ui_render_from_ui_orig output = new Class_ui_render_from_ui_orig();
      return output;
    }

    @Override
    public Func_ui_render_from_ui_orig vx_copy(Object... vals) {
      Class_ui_render_from_ui_orig output = new Class_ui_render_from_ui_orig();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/ui", // pkgname
        "ui-render<-ui-orig", // name
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
    public Func_ui_render_from_ui_orig vx_empty() {return e_ui_render_from_ui_orig;}
    @Override
    public Func_ui_render_from_ui_orig vx_type() {return t_ui_render_from_ui_orig;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Type_ui uichg = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(0)));
      Ui.Type_ui uiorig = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(1)));
      output = Ui.f_ui_render_from_ui_orig(uichg, uiorig);
      return output;
    }

    @Override
    public Ui.Type_ui vx_ui_render_from_ui_orig(final Ui.Type_ui uichg, final Ui.Type_ui uiorig) {
      return Ui.f_ui_render_from_ui_orig(uichg, uiorig);
    }

  }

  public static final Func_ui_render_from_ui_orig e_ui_render_from_ui_orig = new Ui.Class_ui_render_from_ui_orig();
  public static final Func_ui_render_from_ui_orig t_ui_render_from_ui_orig = new Ui.Class_ui_render_from_ui_orig();

  public static Ui.Type_ui f_ui_render_from_ui_orig(final Ui.Type_ui uichg, final Ui.Type_ui uiorig) {
    Ui.Type_ui output = Ui.e_ui;
    output = Core.f_if_2(
      Ui.t_ui,
      Core.t_thenelselist.vx_new(
        Core.f_then(
          Core.t_boolean_from_func.vx_fn_new(() -> {
            return Core.f_eqeq(uichg, uiorig);
          }),
          Core.t_any_from_func.vx_fn_new(() -> {
            return uiorig;
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_let(
              Ui.t_ui,
              Core.t_any_from_func.vx_fn_new(() -> {
                final Ui.Type_render rndr = Ui.f_render_from_ui_orig(uichg, uiorig);
                return Core.f_copy(
                  uichg,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":render"),
                    Ui.t_render
                  )
                );
              })
            );
          })
        )
      )
    );
    return output;
  }


  static {
    Const_uilayout_app.const_new(c_uilayout_app);
    Const_uilayout_background.const_new(c_uilayout_background);
    Const_uilayout_combobox.const_new(c_uilayout_combobox);
    Const_uilayout_flow_horizontal.const_new(c_uilayout_flow_horizontal);
    Const_uilayout_flow_vertical.const_new(c_uilayout_flow_vertical);
    Const_uilayout_image.const_new(c_uilayout_image);
    Const_uilayout_maxpanel.const_new(c_uilayout_maxpanel);
    Const_uilayout_menubar.const_new(c_uilayout_menubar);
    Const_uilayout_menudrawer.const_new(c_uilayout_menudrawer);
    Const_uilayout_navbar.const_new(c_uilayout_navbar);
    Const_uilayout_navdrawer.const_new(c_uilayout_navdrawer);
    Const_uilayout_panel.const_new(c_uilayout_panel);
    Const_uilayout_parallax.const_new(c_uilayout_parallax);
    Const_uilayout_scrollbox.const_new(c_uilayout_scrollbox);
    Const_uilayout_scrollbox_horizontal.const_new(c_uilayout_scrollbox_horizontal);
    Const_uilayout_scrollbox_vertical.const_new(c_uilayout_scrollbox_vertical);
    Const_uilayout_split_horizontal.const_new(c_uilayout_split_horizontal);
    Const_uilayout_split_vertical.const_new(c_uilayout_split_vertical);
    Const_uilayout_statusbar.const_new(c_uilayout_statusbar);
    Const_uilayout_statusdrawer.const_new(c_uilayout_statusdrawer);
    Const_uilayout_text.const_new(c_uilayout_text);
    Const_uilayout_textentry.const_new(c_uilayout_textentry);
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    maptype.put("render", Ui.t_render);
    maptype.put("renderer", Ui.t_renderer);
    maptype.put("rendermap", Ui.t_rendermap);
    maptype.put("ui", Ui.t_ui);
    maptype.put("uilayout", Ui.t_uilayout);
    maptype.put("uimap", Ui.t_uimap);
    maptype.put("uistyle", Ui.t_uistyle);
    maptype.put("uistylemap", Ui.t_uistylemap);
    maptype.put("uistylesheet", Ui.t_uistylesheet);
    mapconst.put("uilayout-app", Ui.c_uilayout_app);
    mapconst.put("uilayout-background", Ui.c_uilayout_background);
    mapconst.put("uilayout-combobox", Ui.c_uilayout_combobox);
    mapconst.put("uilayout-flow-horizontal", Ui.c_uilayout_flow_horizontal);
    mapconst.put("uilayout-flow-vertical", Ui.c_uilayout_flow_vertical);
    mapconst.put("uilayout-image", Ui.c_uilayout_image);
    mapconst.put("uilayout-maxpanel", Ui.c_uilayout_maxpanel);
    mapconst.put("uilayout-menubar", Ui.c_uilayout_menubar);
    mapconst.put("uilayout-menudrawer", Ui.c_uilayout_menudrawer);
    mapconst.put("uilayout-navbar", Ui.c_uilayout_navbar);
    mapconst.put("uilayout-navdrawer", Ui.c_uilayout_navdrawer);
    mapconst.put("uilayout-panel", Ui.c_uilayout_panel);
    mapconst.put("uilayout-parallax", Ui.c_uilayout_parallax);
    mapconst.put("uilayout-scrollbox", Ui.c_uilayout_scrollbox);
    mapconst.put("uilayout-scrollbox-horizontal", Ui.c_uilayout_scrollbox_horizontal);
    mapconst.put("uilayout-scrollbox-vertical", Ui.c_uilayout_scrollbox_vertical);
    mapconst.put("uilayout-split-horizontal", Ui.c_uilayout_split_horizontal);
    mapconst.put("uilayout-split-vertical", Ui.c_uilayout_split_vertical);
    mapconst.put("uilayout-statusbar", Ui.c_uilayout_statusbar);
    mapconst.put("uilayout-statusdrawer", Ui.c_uilayout_statusdrawer);
    mapconst.put("uilayout-text", Ui.c_uilayout_text);
    mapconst.put("uilayout-textentry", Ui.c_uilayout_textentry);
    mapfunc.put("render<-fn-render-ui-orig", Ui.t_render_from_fn_render_ui_orig);
    mapfunc.put("render<-renderer-ui-orig", Ui.t_render_from_renderer_ui_orig);
    mapfunc.put("render<-ui", Ui.t_render_from_ui);
    mapfunc.put("render<-ui-orig", Ui.t_render_from_ui_orig);
    mapfunc.put("rendermap<-uimap", Ui.t_rendermap_from_uimap);
    mapfunc.put("ui-render<-ui-orig", Ui.t_ui_render_from_ui_orig);
    Core.vx_global_package_set("vx/ui/ui", maptype, mapconst, mapfunc);
  }

}
