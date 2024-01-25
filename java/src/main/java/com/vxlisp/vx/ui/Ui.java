package com.vxlisp.vx.ui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import com.vxlisp.vx.*;

public final class Ui {


  /**
   * type: layout
   * Universal Layout
   * (type layout)
   */
  public interface Type_layout extends Core.Type_struct {
    public Ui.Type_layout vx_new(final Object... vals);
    public Ui.Type_layout vx_copy(final Object... vals);
    public Ui.Type_layout vx_empty();
    public Ui.Type_layout vx_type();
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
        "vx/ui/ui", // pkgname
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
   * type: ui
   * Universal UI Element
   * (type ui)
   */
  public interface Type_ui extends Core.Type_struct {
    public Ui.Type_ui vx_new(final Object... vals);
    public Ui.Type_ui vx_copy(final Object... vals);
    public Ui.Type_ui vx_empty();
    public Ui.Type_ui vx_type();
    public Core.Type_anymap datamap();
    public Core.Type_any rendered();
    public Ui.Func_any_render_from_ui render_fn();
    public Ui.Type_uimap uimap();
    public Ui.Type_uistyle uistyle();
  }

  public static class Class_ui extends Core.Class_base implements Type_ui {

    protected Core.Type_anymap vx_p_datamap;

    @Override
    public Core.Type_anymap datamap() {
      return this.vx_p_datamap == null ? Core.e_anymap : this.vx_p_datamap;
    }

    protected Core.Type_any vx_p_rendered;

    @Override
    public Core.Type_any rendered() {
      return this.vx_p_rendered == null ? Core.e_any : this.vx_p_rendered;
    }

    protected Ui.Func_any_render_from_ui vx_p_render_fn;

    @Override
    public Ui.Func_any_render_from_ui render_fn() {
      return this.vx_p_render_fn == null ? Ui.e_any_render_from_ui : this.vx_p_render_fn;
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

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":datamap":
        output = this.datamap();
        break;
      case ":rendered":
        output = this.rendered();
        break;
      case ":render-fn":
        output = this.render_fn();
        break;
      case ":uimap":
        output = this.uimap();
        break;
      case ":uistyle":
        output = this.uistyle();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":datamap", this.datamap());
      output.put(":rendered", this.rendered());
      output.put(":render-fn", this.render_fn());
      output.put(":uimap", this.uimap());
      output.put(":uistyle", this.uistyle());
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
      Core.Type_anymap vx_p_datamap = val.datamap();
      Core.Type_any vx_p_rendered = val.rendered();
      Ui.Func_any_render_from_ui vx_p_render_fn = val.render_fn();
      Ui.Type_uimap vx_p_uimap = val.uimap();
      Ui.Type_uistyle vx_p_uistyle = val.uistyle();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":datamap");
      validkeys.add(":rendered");
      validkeys.add(":render-fn");
      validkeys.add(":uimap");
      validkeys.add(":uistyle");
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
          case ":datamap":
            if (valsub == vx_p_datamap) {
            } else if (valsub instanceof Core.Type_anymap) {
              ischanged = true;
              vx_p_datamap = (Core.Type_anymap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("datamap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":rendered":
            if (valsub == vx_p_rendered) {
            } else if (valsub instanceof Core.Type_any) {
              ischanged = true;
              vx_p_rendered = (Core.Type_any)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("rendered"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/ui", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":render-fn":
            if (valsub == vx_p_render_fn) {
            } else if (valsub instanceof Ui.Func_any_render_from_ui) {
              ischanged = true;
              vx_p_render_fn = (Ui.Func_any_render_from_ui)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("render-fn"));
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
        work.vx_p_datamap = vx_p_datamap;
        work.vx_p_rendered = vx_p_rendered;
        work.vx_p_render_fn = vx_p_render_fn;
        work.vx_p_uimap = vx_p_uimap;
        work.vx_p_uistyle = vx_p_uistyle;
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
    public Ui.Type_layout layout();
  }

  public static class Class_uistyle extends Core.Class_base implements Type_uistyle {

    protected Ui.Type_layout vx_p_layout;

    @Override
    public Ui.Type_layout layout() {
      return this.vx_p_layout == null ? Ui.e_layout : this.vx_p_layout;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":layout":
        output = this.layout();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":layout", this.layout());
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
      Ui.Type_layout vx_p_layout = val.layout();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":layout");
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
            msg = Core.vx_msg_from_error("vx/ui/ui/uistyle", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/ui/ui/uistyle", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":layout":
            if (valsub == vx_p_layout) {
            } else if (valsub instanceof Ui.Type_layout) {
              ischanged = true;
              vx_p_layout = (Ui.Type_layout)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("layout"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/ui/uistyle", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/ui/ui/uistyle", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_uistyle work = new Class_uistyle();
        work.vx_p_layout = vx_p_layout;
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
   * Constant: layout-app
   * {layout}
   */
  public static class Const_layout_app extends Ui.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "layout-app", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
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
  public static class Const_layout_background extends Ui.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "layout-background", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
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
  public static class Const_layout_navigation extends Ui.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "layout-navigation", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
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
  public static class Const_layout_split_horizontal extends Ui.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "layout-split-horizontal", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
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
  public static class Const_layout_split_vertical extends Ui.Class_layout implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "vx/ui/ui", // pkgname
        "layout-split-vertical", // name
        Core.typedef_new(
          "vx/ui/ui", // pkgname
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
   * @function any_render_from_ui
   * Returns a rendered object from a UI Element.
   * @param  {ui} ui
   * @return {any}
   * (func any-render<-ui)
   */
  public static interface Func_any_render_from_ui extends Core.Func_any_from_any {
    public Core.Type_any vx_any_render_from_ui(final Ui.Type_ui ui);
  }

  public static class Class_any_render_from_ui extends Core.Class_base implements Func_any_render_from_ui {

    @Override
    public Func_any_render_from_ui vx_new(Object... vals) {
      Class_any_render_from_ui output = new Class_any_render_from_ui();
      return output;
    }

    @Override
    public Func_any_render_from_ui vx_copy(Object... vals) {
      Class_any_render_from_ui output = new Class_any_render_from_ui();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/ui", // pkgname
        "any-render<-ui", // name
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
    public Func_any_render_from_ui vx_empty() {return e_any_render_from_ui;}
    @Override
    public Func_any_render_from_ui vx_type() {return t_any_render_from_ui;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Ui.Type_ui inputval = (Ui.Type_ui)value;
      Core.Type_any outputval = Ui.f_any_render_from_ui(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Type_ui ui = Core.f_any_from_any(Ui.t_ui, arglist.vx_any(Core.vx_new_int(0)));
      output = Ui.f_any_render_from_ui(ui);
      return output;
    }

    @Override
    public Core.Type_any vx_any_render_from_ui(final Ui.Type_ui ui) {
      return Ui.f_any_render_from_ui(ui);
    }

  }

  public static final Func_any_render_from_ui e_any_render_from_ui = new Ui.Class_any_render_from_ui();
  public static final Func_any_render_from_ui t_any_render_from_ui = new Ui.Class_any_render_from_ui();

  public static Core.Type_any f_any_render_from_ui(final Ui.Type_ui ui) {
    Core.Type_any output = Core.e_any;
    return output;
  }

  /**
   * @function anymap_render_from_uimap
   * Renders a uimap and returns the map of rendered elements.
   * @param  {uimap} uimap
   * @return {boolean}
   * (func anymap-render<-uimap)
   */
  public static interface Func_anymap_render_from_uimap extends Core.Func_any_from_any {
    public Core.Type_boolean vx_anymap_render_from_uimap(final Ui.Type_uimap uimap);
  }

  public static class Class_anymap_render_from_uimap extends Core.Class_base implements Func_anymap_render_from_uimap {

    @Override
    public Func_anymap_render_from_uimap vx_new(Object... vals) {
      Class_anymap_render_from_uimap output = new Class_anymap_render_from_uimap();
      return output;
    }

    @Override
    public Func_anymap_render_from_uimap vx_copy(Object... vals) {
      Class_anymap_render_from_uimap output = new Class_anymap_render_from_uimap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/ui/ui", // pkgname
        "anymap-render<-uimap", // name
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
    public Func_anymap_render_from_uimap vx_empty() {return e_anymap_render_from_uimap;}
    @Override
    public Func_anymap_render_from_uimap vx_type() {return t_anymap_render_from_uimap;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Ui.Type_uimap inputval = (Ui.Type_uimap)value;
      Core.Type_any outputval = Ui.f_anymap_render_from_uimap(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Ui.Type_uimap uimap = Core.f_any_from_any(Ui.t_uimap, arglist.vx_any(Core.vx_new_int(0)));
      output = Ui.f_anymap_render_from_uimap(uimap);
      return output;
    }

    @Override
    public Core.Type_boolean vx_anymap_render_from_uimap(final Ui.Type_uimap uimap) {
      return Ui.f_anymap_render_from_uimap(uimap);
    }

  }

  public static final Func_anymap_render_from_uimap e_anymap_render_from_uimap = new Ui.Class_anymap_render_from_uimap();
  public static final Func_anymap_render_from_uimap t_anymap_render_from_uimap = new Ui.Class_anymap_render_from_uimap();

  public static Core.Type_boolean f_anymap_render_from_uimap(final Ui.Type_uimap uimap) {
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
    maptype.put("layout", Ui.t_layout);
    maptype.put("ui", Ui.t_ui);
    maptype.put("uimap", Ui.t_uimap);
    maptype.put("uistyle", Ui.t_uistyle);
    mapconst.put("layout-app", Ui.c_layout_app);
    mapconst.put("layout-background", Ui.c_layout_background);
    mapconst.put("layout-navigation", Ui.c_layout_navigation);
    mapconst.put("layout-split-horizontal", Ui.c_layout_split_horizontal);
    mapconst.put("layout-split-vertical", Ui.c_layout_split_vertical);
    mapfunc.put("any-render<-ui", Ui.t_any_render_from_ui);
    mapfunc.put("anymap-render<-uimap", Ui.t_anymap_render_from_uimap);
    Core.vx_global_package_set("vx/ui/ui", maptype, mapconst, mapfunc);
  }

}
