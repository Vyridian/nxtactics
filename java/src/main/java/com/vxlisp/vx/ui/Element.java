package com.vxlisp.vx.ui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.vxlisp.vx.*;

public final class Element {


  /**
   * type: element
   * (type element)
   */
  public interface Type_element extends Core.Type_struct {
    public Element.Type_element vx_new(final Object... vals);
    public Element.Type_element vx_copy(final Object... vals);
    public Element.Type_element vx_empty();
    public Element.Type_element vx_type();
    public Core.Type_string name();
    public Element.Type_style style();
  }

  public static class Class_element extends Core.Class_base implements Type_element {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Element.Type_style vx_p_style;

    @Override
    public Element.Type_style style() {
      return this.vx_p_style == null ? Element.e_style : this.vx_p_style;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":style":
        output = this.style();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":style", this.style());
      return Core.immutablemap(output);
    }

    @Override
    public Type_element vx_new(final Object... vals) {return e_element.vx_copy(vals);}

    @Override
    public Type_element vx_copy(final Object... vals) {
      Type_element output = this;
      boolean ischanged = false;
      Class_element val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Element.Type_style vx_p_style = val.style();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":style");
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
            msg = Core.vx_msg_from_error("vx/ui/element/element", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/ui/element/element", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":name":
            if (valsub == vx_p_name) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_name = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_name = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("name"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/element", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Element.Type_style) {
              ischanged = true;
              vx_p_style = (Element.Type_style)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("style"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/element", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/ui/element/element", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_element work = new Class_element();
        work.vx_p_name = vx_p_name;
        work.vx_p_style = vx_p_style;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_element vx_empty() {return e_element;}
    @Override
    public Type_element vx_type() {return t_element;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/element", // pkgname
        "element", // name
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

  public static final Type_element e_element = new Class_element();
  public static final Type_element t_element = new Class_element();

  /**
   * type: orientation
   * (type orientation)
   */
  public interface Type_orientation extends Core.Type_struct {
    public Element.Type_orientation vx_new(final Object... vals);
    public Element.Type_orientation vx_copy(final Object... vals);
    public Element.Type_orientation vx_empty();
    public Element.Type_orientation vx_type();
    public Core.Type_float rotate_x();
    public Core.Type_float rotate_y();
    public Core.Type_float rotate_z();
  }

  public static class Class_orientation extends Core.Class_base implements Type_orientation {

    protected Core.Type_float vx_p_rotate_x;

    @Override
    public Core.Type_float rotate_x() {
      return this.vx_p_rotate_x == null ? Core.e_float : this.vx_p_rotate_x;
    }

    protected Core.Type_float vx_p_rotate_y;

    @Override
    public Core.Type_float rotate_y() {
      return this.vx_p_rotate_y == null ? Core.e_float : this.vx_p_rotate_y;
    }

    protected Core.Type_float vx_p_rotate_z;

    @Override
    public Core.Type_float rotate_z() {
      return this.vx_p_rotate_z == null ? Core.e_float : this.vx_p_rotate_z;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":rotate-x":
        output = this.rotate_x();
        break;
      case ":rotate-y":
        output = this.rotate_y();
        break;
      case ":rotate-z":
        output = this.rotate_z();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":rotate-x", this.rotate_x());
      output.put(":rotate-y", this.rotate_y());
      output.put(":rotate-z", this.rotate_z());
      return Core.immutablemap(output);
    }

    @Override
    public Type_orientation vx_new(final Object... vals) {return e_orientation.vx_copy(vals);}

    @Override
    public Type_orientation vx_copy(final Object... vals) {
      Type_orientation output = this;
      boolean ischanged = false;
      Class_orientation val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_float vx_p_rotate_x = val.rotate_x();
      Core.Type_float vx_p_rotate_y = val.rotate_y();
      Core.Type_float vx_p_rotate_z = val.rotate_z();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":rotate-x");
      validkeys.add(":rotate-y");
      validkeys.add(":rotate-z");
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
            msg = Core.vx_msg_from_error("vx/ui/element/orientation", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/ui/element/orientation", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":rotate-x":
            if (valsub == vx_p_rotate_x) {
            } else if (valsub instanceof Core.Type_float) {
              ischanged = true;
              vx_p_rotate_x = (Core.Type_float)valsub;
            } else if (valsub instanceof Float) {
              ischanged = true;
              vx_p_rotate_x = Core.t_float.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("rotate-x"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/orientation", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":rotate-y":
            if (valsub == vx_p_rotate_y) {
            } else if (valsub instanceof Core.Type_float) {
              ischanged = true;
              vx_p_rotate_y = (Core.Type_float)valsub;
            } else if (valsub instanceof Float) {
              ischanged = true;
              vx_p_rotate_y = Core.t_float.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("rotate-y"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/orientation", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":rotate-z":
            if (valsub == vx_p_rotate_z) {
            } else if (valsub instanceof Core.Type_float) {
              ischanged = true;
              vx_p_rotate_z = (Core.Type_float)valsub;
            } else if (valsub instanceof Float) {
              ischanged = true;
              vx_p_rotate_z = Core.t_float.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("rotate-z"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/orientation", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/ui/element/orientation", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_orientation work = new Class_orientation();
        work.vx_p_rotate_x = vx_p_rotate_x;
        work.vx_p_rotate_y = vx_p_rotate_y;
        work.vx_p_rotate_z = vx_p_rotate_z;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_orientation vx_empty() {return e_orientation;}
    @Override
    public Type_orientation vx_type() {return t_orientation;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/element", // pkgname
        "orientation", // name
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

  public static final Type_orientation e_orientation = new Class_orientation();
  public static final Type_orientation t_orientation = new Class_orientation();

  /**
   * type: point
   * (type point)
   */
  public interface Type_point extends Core.Type_struct {
    public Element.Type_point vx_new(final Object... vals);
    public Element.Type_point vx_copy(final Object... vals);
    public Element.Type_point vx_empty();
    public Element.Type_point vx_type();
    public Core.Type_float x();
    public Core.Type_float y();
    public Core.Type_float z();
  }

  public static class Class_point extends Core.Class_base implements Type_point {

    protected Core.Type_float vx_p_x;

    @Override
    public Core.Type_float x() {
      return this.vx_p_x == null ? Core.e_float : this.vx_p_x;
    }

    protected Core.Type_float vx_p_y;

    @Override
    public Core.Type_float y() {
      return this.vx_p_y == null ? Core.e_float : this.vx_p_y;
    }

    protected Core.Type_float vx_p_z;

    @Override
    public Core.Type_float z() {
      return this.vx_p_z == null ? Core.e_float : this.vx_p_z;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":x":
        output = this.x();
        break;
      case ":y":
        output = this.y();
        break;
      case ":z":
        output = this.z();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":x", this.x());
      output.put(":y", this.y());
      output.put(":z", this.z());
      return Core.immutablemap(output);
    }

    @Override
    public Type_point vx_new(final Object... vals) {return e_point.vx_copy(vals);}

    @Override
    public Type_point vx_copy(final Object... vals) {
      Type_point output = this;
      boolean ischanged = false;
      Class_point val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_float vx_p_x = val.x();
      Core.Type_float vx_p_y = val.y();
      Core.Type_float vx_p_z = val.z();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":x");
      validkeys.add(":y");
      validkeys.add(":z");
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
            msg = Core.vx_msg_from_error("vx/ui/element/point", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/ui/element/point", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":x":
            if (valsub == vx_p_x) {
            } else if (valsub instanceof Core.Type_float) {
              ischanged = true;
              vx_p_x = (Core.Type_float)valsub;
            } else if (valsub instanceof Float) {
              ischanged = true;
              vx_p_x = Core.t_float.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("x"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/point", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":y":
            if (valsub == vx_p_y) {
            } else if (valsub instanceof Core.Type_float) {
              ischanged = true;
              vx_p_y = (Core.Type_float)valsub;
            } else if (valsub instanceof Float) {
              ischanged = true;
              vx_p_y = Core.t_float.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("y"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/point", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":z":
            if (valsub == vx_p_z) {
            } else if (valsub instanceof Core.Type_float) {
              ischanged = true;
              vx_p_z = (Core.Type_float)valsub;
            } else if (valsub instanceof Float) {
              ischanged = true;
              vx_p_z = Core.t_float.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("z"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/point", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/ui/element/point", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_point work = new Class_point();
        work.vx_p_x = vx_p_x;
        work.vx_p_y = vx_p_y;
        work.vx_p_z = vx_p_z;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_point vx_empty() {return e_point;}
    @Override
    public Type_point vx_type() {return t_point;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/element", // pkgname
        "point", // name
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

  public static final Type_point e_point = new Class_point();
  public static final Type_point t_point = new Class_point();

  /**
   * type: pointlist
   * (type pointlist)
   */
  public interface Type_pointlist extends Core.Type_list {
    public Element.Type_pointlist vx_new(final Object... vals);
    public Element.Type_pointlist vx_copy(final Object... vals);
    public Element.Type_pointlist vx_empty();
    public Element.Type_pointlist vx_type();
    public List<Element.Type_point> vx_listpoint();
    public Element.Type_point vx_point(final Core.Type_int index);
  }

  public static class Class_pointlist extends Core.Class_base implements Type_pointlist {

    protected List<Element.Type_point> vx_p_list = Core.immutablelist(new ArrayList<Element.Type_point>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Element.Type_point vx_point(final Core.Type_int index) {
      Element.Type_point output = Element.e_point;
      Class_pointlist list = this;
      int iindex = index.vx_int();
      List<Element.Type_point> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Element.Type_point> vx_listpoint() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_point(index);
    }

    @Override
    public Type_pointlist vx_new(final Object... vals) {return e_pointlist.vx_copy(vals);}

    @Override
    public Type_pointlist vx_copy(final Object... vals) {
      Type_pointlist output = this;
      boolean ischanged = false;
      Class_pointlist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Element.Type_point> listval = new ArrayList<>(val.vx_listpoint());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Element.Type_point) {
          ischanged = true;
          listval.add((Element.Type_point)valsub);
        } else if (valsub instanceof Element.Type_point) {
          ischanged = true;
          listval.add((Element.Type_point)valsub);
        } else if (valsub instanceof Type_pointlist) {
          Type_pointlist multi = (Type_pointlist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listpoint());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Element.Type_point) {
              Element.Type_point valitem = (Element.Type_point)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("vx/ui/element/pointlist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("vx/ui/element/pointlist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_pointlist work = new Class_pointlist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_pointlist vx_empty() {return e_pointlist;}
    @Override
    public Type_pointlist vx_type() {return t_pointlist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/element", // pkgname
        "pointlist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Element.t_point), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_pointlist e_pointlist = new Class_pointlist();
  public static final Type_pointlist t_pointlist = new Class_pointlist();

  /**
   * type: style
   * (type style)
   */
  public interface Type_style extends Core.Type_struct {
    public Element.Type_style vx_new(final Object... vals);
    public Element.Type_style vx_copy(final Object... vals);
    public Element.Type_style vx_empty();
    public Element.Type_style vx_type();
    public Core.Type_string name();
    public Element.Type_pointlist pointlist();
    public Element.Type_orientation orientation();
  }

  public static class Class_style extends Core.Class_base implements Type_style {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Element.Type_pointlist vx_p_pointlist;

    @Override
    public Element.Type_pointlist pointlist() {
      return this.vx_p_pointlist == null ? Element.e_pointlist : this.vx_p_pointlist;
    }

    protected Element.Type_orientation vx_p_orientation;

    @Override
    public Element.Type_orientation orientation() {
      return this.vx_p_orientation == null ? Element.e_orientation : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":pointlist":
        output = this.pointlist();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":pointlist", this.pointlist());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_style vx_new(final Object... vals) {return e_style.vx_copy(vals);}

    @Override
    public Type_style vx_copy(final Object... vals) {
      Type_style output = this;
      boolean ischanged = false;
      Class_style val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Element.Type_pointlist vx_p_pointlist = val.pointlist();
      Element.Type_orientation vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":pointlist");
      validkeys.add(":orientation");
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
            msg = Core.vx_msg_from_error("vx/ui/element/style", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/ui/element/style", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":name":
            if (valsub == vx_p_name) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_name = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_name = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("name"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/style", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":pointlist":
            if (valsub == vx_p_pointlist) {
            } else if (valsub instanceof Element.Type_pointlist) {
              ischanged = true;
              vx_p_pointlist = (Element.Type_pointlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("pointlist"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/style", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Element.Type_orientation) {
              ischanged = true;
              vx_p_orientation = (Element.Type_orientation)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("orientation"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/ui/element/style", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/ui/element/style", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_style work = new Class_style();
        work.vx_p_name = vx_p_name;
        work.vx_p_pointlist = vx_p_pointlist;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_style vx_empty() {return e_style;}
    @Override
    public Type_style vx_type() {return t_style;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/ui/element", // pkgname
        "style", // name
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

  public static final Type_style e_style = new Class_style();
  public static final Type_style t_style = new Class_style();

  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    maptype.put("element", Element.t_element);
    maptype.put("orientation", Element.t_orientation);
    maptype.put("point", Element.t_point);
    maptype.put("pointlist", Element.t_pointlist);
    maptype.put("style", Element.t_style);
    Core.vx_global_package_set("vx/ui/element", maptype, mapconst, mapfunc);
  }

}
