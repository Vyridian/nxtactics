package com.vxlisp.vx.web;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.vxlisp.vx.*;

public final class Html {


  /**
   * type: body
   * Body Tag
   * (type body)
   */
  public interface Type_body extends Core.Type_struct {
    public Html.Type_body vx_new(final Object... vals);
    public Html.Type_body vx_copy(final Object... vals);
    public Html.Type_body vx_empty();
    public Html.Type_body vx_type();
    public Html.Type_divchildlist nodes();
  }

  public static class Class_body extends Core.Class_base implements Type_body {

    protected Html.Type_divchildlist vx_p_nodes;

    @Override
    public Html.Type_divchildlist nodes() {
      return this.vx_p_nodes == null ? Html.e_divchildlist : this.vx_p_nodes;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":nodes":
        output = this.nodes();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":nodes", this.nodes());
      return Core.immutablemap(output);
    }

    @Override
    public Type_body vx_new(final Object... vals) {return e_body.vx_copy(vals);}

    @Override
    public Type_body vx_copy(final Object... vals) {
      Type_body output = this;
      boolean ischanged = false;
      Class_body val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Html.Type_divchildlist vx_p_nodes = val.nodes();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":nodes");
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
          } else if (valsub instanceof Html.Type_divchildlist) { // default property
            ischanged = true;
            vx_p_nodes = (Html.Type_divchildlist)valsub;
          } else if (valsub instanceof Html.Type_divchild) { // default property
            Html.Type_divchild valdefault = (Html.Type_divchild)valsub;
            Html.Type_divchildlist vallist = vx_p_nodes;
            if (vallist == null) {
              vallist = Html.t_divchildlist.vx_new(valdefault);
            } else {
              vallist = vallist.vx_copy(valdefault);
            }
            ischanged = true;
            vx_p_nodes = vallist;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/body", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/body", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":nodes":
            if (valsub == vx_p_nodes) {
            } else if (valsub instanceof Html.Type_divchildlist) {
              ischanged = true;
              vx_p_nodes = (Html.Type_divchildlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nodes"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/body", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/body", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_body work = new Class_body();
        work.vx_p_nodes = vx_p_nodes;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_body vx_empty() {return e_body;}
    @Override
    public Type_body vx_type() {return t_body;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "body", // name
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

  public static final Type_body e_body = new Class_body();
  public static final Type_body t_body = new Class_body();

  /**
   * type: details
   * Details Tag
   * (type details)
   */
  public interface Type_details extends Core.Type_struct, Html.Type_node, Html.Type_divchild {
    public Html.Type_details vx_new(final Object... vals);
    public Html.Type_details vx_copy(final Object... vals);
    public Html.Type_details vx_empty();
    public Html.Type_details vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Html.Type_divchildlist summary();
    public Html.Type_divchildlist nodes();
  }

  public static class Class_details extends Core.Class_base implements Type_details {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Html.Type_divchildlist vx_p_summary;

    @Override
    public Html.Type_divchildlist summary() {
      return this.vx_p_summary == null ? Html.e_divchildlist : this.vx_p_summary;
    }

    protected Html.Type_divchildlist vx_p_nodes;

    @Override
    public Html.Type_divchildlist nodes() {
      return this.vx_p_nodes == null ? Html.e_divchildlist : this.vx_p_nodes;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":nodes":
        output = this.nodes();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":summary", this.summary());
      output.put(":nodes", this.nodes());
      return Core.immutablemap(output);
    }

    @Override
    public Type_details vx_new(final Object... vals) {return e_details.vx_copy(vals);}

    @Override
    public Type_details vx_copy(final Object... vals) {
      Type_details output = this;
      boolean ischanged = false;
      Class_details val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Html.Type_divchildlist vx_p_summary = val.summary();
      Html.Type_divchildlist vx_p_nodes = val.nodes();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":summary");
      validkeys.add(":nodes");
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
            msg = Core.vx_msg_from_error("vx/web/html/details", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/details", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/details", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/details", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Html.Type_divchildlist) {
              ischanged = true;
              vx_p_summary = (Html.Type_divchildlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("summary"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/details", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":nodes":
            if (valsub == vx_p_nodes) {
            } else if (valsub instanceof Html.Type_divchildlist) {
              ischanged = true;
              vx_p_nodes = (Html.Type_divchildlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nodes"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/details", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/details", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_details work = new Class_details();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_nodes = vx_p_nodes;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_details vx_empty() {return e_details;}
    @Override
    public Type_details vx_type() {return t_details;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "details", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_divchild), // traits
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

  public static final Type_details e_details = new Class_details();
  public static final Type_details t_details = new Class_details();

  /**
   * type: div
   * Div Tag
   * (type div)
   */
  public interface Type_div extends Core.Type_struct, Html.Type_node, Html.Type_divchild {
    public Html.Type_div vx_new(final Object... vals);
    public Html.Type_div vx_copy(final Object... vals);
    public Html.Type_div vx_empty();
    public Html.Type_div vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Html.Type_divchildlist nodes();
  }

  public static class Class_div extends Core.Class_base implements Type_div {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Html.Type_divchildlist vx_p_nodes;

    @Override
    public Html.Type_divchildlist nodes() {
      return this.vx_p_nodes == null ? Html.e_divchildlist : this.vx_p_nodes;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":nodes":
        output = this.nodes();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":nodes", this.nodes());
      return Core.immutablemap(output);
    }

    @Override
    public Type_div vx_new(final Object... vals) {return e_div.vx_copy(vals);}

    @Override
    public Type_div vx_copy(final Object... vals) {
      Type_div output = this;
      boolean ischanged = false;
      Class_div val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Html.Type_divchildlist vx_p_nodes = val.nodes();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":nodes");
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
          } else if (valsub instanceof Html.Type_divchildlist) { // default property
            ischanged = true;
            vx_p_nodes = (Html.Type_divchildlist)valsub;
          } else if (valsub instanceof Html.Type_divchild) { // default property
            Html.Type_divchild valdefault = (Html.Type_divchild)valsub;
            Html.Type_divchildlist vallist = vx_p_nodes;
            if (vallist == null) {
              vallist = Html.t_divchildlist.vx_new(valdefault);
            } else {
              vallist = vallist.vx_copy(valdefault);
            }
            ischanged = true;
            vx_p_nodes = vallist;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/div", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/div", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/div", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/div", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":nodes":
            if (valsub == vx_p_nodes) {
            } else if (valsub instanceof Html.Type_divchildlist) {
              ischanged = true;
              vx_p_nodes = (Html.Type_divchildlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nodes"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/div", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/div", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_div work = new Class_div();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_nodes = vx_p_nodes;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_div vx_empty() {return e_div;}
    @Override
    public Type_div vx_type() {return t_div;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "div", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_divchild), // traits
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

  public static final Type_div e_div = new Class_div();
  public static final Type_div t_div = new Class_div();

  /**
   * type: divchild
   * Div Child Trait
   * (type divchild)
   */
  public interface Type_divchild extends Core.Type_struct {
    public Html.Type_divchild vx_new(final Object... vals);
    public Html.Type_divchild vx_copy(final Object... vals);
    public Html.Type_divchild vx_empty();
    public Html.Type_divchild vx_type();
  }

  public static class Class_divchild extends Core.Class_base implements Type_divchild {

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
    public Type_divchild vx_new(final Object... vals) {return e_divchild.vx_copy(vals);}

    @Override
    public Type_divchild vx_copy(final Object... vals) {
      Type_divchild output = this;
      boolean ischanged = false;
      Class_divchild val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_divchild work = new Class_divchild();
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_divchild vx_empty() {return e_divchild;}
    @Override
    public Type_divchild vx_type() {return t_divchild;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "divchild", // name
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

  public static final Type_divchild e_divchild = new Class_divchild();
  public static final Type_divchild t_divchild = new Class_divchild();

  /**
   * type: divchildlist
   * List of divchild
   * (type divchildlist)
   */
  public interface Type_divchildlist extends Core.Type_list {
    public Html.Type_divchildlist vx_new(final Object... vals);
    public Html.Type_divchildlist vx_copy(final Object... vals);
    public Html.Type_divchildlist vx_empty();
    public Html.Type_divchildlist vx_type();
    public List<Html.Type_divchild> vx_listdivchild();
    public Html.Type_divchild vx_divchild(final Core.Type_int index);
  }

  public static class Class_divchildlist extends Core.Class_base implements Type_divchildlist {

    protected List<Html.Type_divchild> vx_p_list = Core.immutablelist(new ArrayList<Html.Type_divchild>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Html.Type_divchild vx_divchild(final Core.Type_int index) {
      Html.Type_divchild output = Html.e_divchild;
      Class_divchildlist list = this;
      int iindex = index.vx_int();
      List<Html.Type_divchild> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Html.Type_divchild> vx_listdivchild() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_divchild(index);
    }

    @Override
    public Type_divchildlist vx_new(final Object... vals) {return e_divchildlist.vx_copy(vals);}

    @Override
    public Type_divchildlist vx_copy(final Object... vals) {
      Type_divchildlist output = this;
      boolean ischanged = false;
      Class_divchildlist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Html.Type_divchild> listval = new ArrayList<>(val.vx_listdivchild());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Html.Type_divchild) {
          ischanged = true;
          listval.add((Html.Type_divchild)valsub);
        } else if (valsub instanceof Html.Type_divchild) {
          ischanged = true;
          listval.add((Html.Type_divchild)valsub);
        } else if (valsub instanceof Type_divchildlist) {
          Type_divchildlist multi = (Type_divchildlist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listdivchild());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Html.Type_divchild) {
              Html.Type_divchild valitem = (Html.Type_divchild)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("vx/web/html/divchildlist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("vx/web/html/divchildlist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_divchildlist work = new Class_divchildlist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_divchildlist vx_empty() {return e_divchildlist;}
    @Override
    public Type_divchildlist vx_type() {return t_divchildlist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "divchildlist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Html.t_divchild), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_divchildlist e_divchildlist = new Class_divchildlist();
  public static final Type_divchildlist t_divchildlist = new Class_divchildlist();

  /**
   * type: divlist
   * List of div
   * (type divlist)
   */
  public interface Type_divlist extends Core.Type_list {
    public Html.Type_divlist vx_new(final Object... vals);
    public Html.Type_divlist vx_copy(final Object... vals);
    public Html.Type_divlist vx_empty();
    public Html.Type_divlist vx_type();
    public List<Html.Type_div> vx_listdiv();
    public Html.Type_div vx_div(final Core.Type_int index);
  }

  public static class Class_divlist extends Core.Class_base implements Type_divlist {

    protected List<Html.Type_div> vx_p_list = Core.immutablelist(new ArrayList<Html.Type_div>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Html.Type_div vx_div(final Core.Type_int index) {
      Html.Type_div output = Html.e_div;
      Class_divlist list = this;
      int iindex = index.vx_int();
      List<Html.Type_div> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Html.Type_div> vx_listdiv() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_div(index);
    }

    @Override
    public Type_divlist vx_new(final Object... vals) {return e_divlist.vx_copy(vals);}

    @Override
    public Type_divlist vx_copy(final Object... vals) {
      Type_divlist output = this;
      boolean ischanged = false;
      Class_divlist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Html.Type_div> listval = new ArrayList<>(val.vx_listdiv());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Html.Type_div) {
          ischanged = true;
          listval.add((Html.Type_div)valsub);
        } else if (valsub instanceof Html.Type_div) {
          ischanged = true;
          listval.add((Html.Type_div)valsub);
        } else if (valsub instanceof Type_divlist) {
          Type_divlist multi = (Type_divlist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listdiv());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Html.Type_div) {
              Html.Type_div valitem = (Html.Type_div)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("vx/web/html/divlist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("vx/web/html/divlist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_divlist work = new Class_divlist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_divlist vx_empty() {return e_divlist;}
    @Override
    public Type_divlist vx_type() {return t_divlist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "divlist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Html.t_div), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_divlist e_divlist = new Class_divlist();
  public static final Type_divlist t_divlist = new Class_divlist();

  /**
   * type: footer
   * Body Tag
   * (type footer)
   */
  public interface Type_footer extends Core.Type_struct {
    public Html.Type_footer vx_new(final Object... vals);
    public Html.Type_footer vx_copy(final Object... vals);
    public Html.Type_footer vx_empty();
    public Html.Type_footer vx_type();
    public Html.Type_divchildlist nodes();
  }

  public static class Class_footer extends Core.Class_base implements Type_footer {

    protected Html.Type_divchildlist vx_p_nodes;

    @Override
    public Html.Type_divchildlist nodes() {
      return this.vx_p_nodes == null ? Html.e_divchildlist : this.vx_p_nodes;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":nodes":
        output = this.nodes();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":nodes", this.nodes());
      return Core.immutablemap(output);
    }

    @Override
    public Type_footer vx_new(final Object... vals) {return e_footer.vx_copy(vals);}

    @Override
    public Type_footer vx_copy(final Object... vals) {
      Type_footer output = this;
      boolean ischanged = false;
      Class_footer val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Html.Type_divchildlist vx_p_nodes = val.nodes();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":nodes");
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
          } else if (valsub instanceof Html.Type_divchildlist) { // default property
            ischanged = true;
            vx_p_nodes = (Html.Type_divchildlist)valsub;
          } else if (valsub instanceof Html.Type_divchild) { // default property
            Html.Type_divchild valdefault = (Html.Type_divchild)valsub;
            Html.Type_divchildlist vallist = vx_p_nodes;
            if (vallist == null) {
              vallist = Html.t_divchildlist.vx_new(valdefault);
            } else {
              vallist = vallist.vx_copy(valdefault);
            }
            ischanged = true;
            vx_p_nodes = vallist;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/footer", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/footer", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":nodes":
            if (valsub == vx_p_nodes) {
            } else if (valsub instanceof Html.Type_divchildlist) {
              ischanged = true;
              vx_p_nodes = (Html.Type_divchildlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nodes"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/footer", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/footer", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_footer work = new Class_footer();
        work.vx_p_nodes = vx_p_nodes;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_footer vx_empty() {return e_footer;}
    @Override
    public Type_footer vx_type() {return t_footer;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "footer", // name
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

  public static final Type_footer e_footer = new Class_footer();
  public static final Type_footer t_footer = new Class_footer();

  /**
   * type: h1
   * Header 1 Tag
   * (type h1)
   */
  public interface Type_h1 extends Core.Type_struct, Html.Type_node, Html.Type_divchild {
    public Html.Type_h1 vx_new(final Object... vals);
    public Html.Type_h1 vx_copy(final Object... vals);
    public Html.Type_h1 vx_empty();
    public Html.Type_h1 vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Core.Type_string text();
  }

  public static class Class_h1 extends Core.Class_base implements Type_h1 {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Core.Type_string vx_p_text;

    @Override
    public Core.Type_string text() {
      return this.vx_p_text == null ? Core.e_string : this.vx_p_text;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":text":
        output = this.text();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":text", this.text());
      return Core.immutablemap(output);
    }

    @Override
    public Type_h1 vx_new(final Object... vals) {return e_h1.vx_copy(vals);}

    @Override
    public Type_h1 vx_copy(final Object... vals) {
      Type_h1 output = this;
      boolean ischanged = false;
      Class_h1 val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Core.Type_string vx_p_text = val.text();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":text");
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
          } else if (valsub instanceof Core.Type_string) { // default property
            ischanged = true;
            vx_p_text = (Core.Type_string)valsub;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/h1", ":invalidkeytype", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          if (istestkey) {
            if (!testkey.startsWith(":")) {
              testkey = ":" + testkey;
            }
            boolean isvalidkey = validkeys.contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else if (valsub instanceof Core.Type_string) { // default property
              ischanged = true;
              vx_p_text = (Core.Type_string)valsub;
            } else if (valsub instanceof String) { // default property
              ischanged = true;
              vx_p_text = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval = Core.vx_new_string(testkey);
              msg = Core.vx_msg_from_error("vx/web/html/h1", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/h1", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/h1", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":text":
            if (valsub == vx_p_text) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_text = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_text = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("text"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/h1", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/h1", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_h1 work = new Class_h1();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_text = vx_p_text;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_h1 vx_empty() {return e_h1;}
    @Override
    public Type_h1 vx_type() {return t_h1;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "h1", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_divchild), // traits
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

  public static final Type_h1 e_h1 = new Class_h1();
  public static final Type_h1 t_h1 = new Class_h1();

  /**
   * type: h2
   * Header 2 Tag
   * (type h2)
   */
  public interface Type_h2 extends Core.Type_struct, Html.Type_node, Html.Type_divchild {
    public Html.Type_h2 vx_new(final Object... vals);
    public Html.Type_h2 vx_copy(final Object... vals);
    public Html.Type_h2 vx_empty();
    public Html.Type_h2 vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Core.Type_string text();
  }

  public static class Class_h2 extends Core.Class_base implements Type_h2 {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Core.Type_string vx_p_text;

    @Override
    public Core.Type_string text() {
      return this.vx_p_text == null ? Core.e_string : this.vx_p_text;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":text":
        output = this.text();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":text", this.text());
      return Core.immutablemap(output);
    }

    @Override
    public Type_h2 vx_new(final Object... vals) {return e_h2.vx_copy(vals);}

    @Override
    public Type_h2 vx_copy(final Object... vals) {
      Type_h2 output = this;
      boolean ischanged = false;
      Class_h2 val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Core.Type_string vx_p_text = val.text();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":text");
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
          } else if (valsub instanceof Core.Type_string) { // default property
            ischanged = true;
            vx_p_text = (Core.Type_string)valsub;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/h2", ":invalidkeytype", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          if (istestkey) {
            if (!testkey.startsWith(":")) {
              testkey = ":" + testkey;
            }
            boolean isvalidkey = validkeys.contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else if (valsub instanceof Core.Type_string) { // default property
              ischanged = true;
              vx_p_text = (Core.Type_string)valsub;
            } else if (valsub instanceof String) { // default property
              ischanged = true;
              vx_p_text = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval = Core.vx_new_string(testkey);
              msg = Core.vx_msg_from_error("vx/web/html/h2", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/h2", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/h2", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":text":
            if (valsub == vx_p_text) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_text = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_text = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("text"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/h2", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/h2", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_h2 work = new Class_h2();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_text = vx_p_text;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_h2 vx_empty() {return e_h2;}
    @Override
    public Type_h2 vx_type() {return t_h2;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "h2", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_divchild), // traits
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

  public static final Type_h2 e_h2 = new Class_h2();
  public static final Type_h2 t_h2 = new Class_h2();

  /**
   * type: h3
   * Header 3 Tag
   * (type h3)
   */
  public interface Type_h3 extends Core.Type_struct, Html.Type_node, Html.Type_divchild {
    public Html.Type_h3 vx_new(final Object... vals);
    public Html.Type_h3 vx_copy(final Object... vals);
    public Html.Type_h3 vx_empty();
    public Html.Type_h3 vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Core.Type_string text();
  }

  public static class Class_h3 extends Core.Class_base implements Type_h3 {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Core.Type_string vx_p_text;

    @Override
    public Core.Type_string text() {
      return this.vx_p_text == null ? Core.e_string : this.vx_p_text;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":text":
        output = this.text();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":text", this.text());
      return Core.immutablemap(output);
    }

    @Override
    public Type_h3 vx_new(final Object... vals) {return e_h3.vx_copy(vals);}

    @Override
    public Type_h3 vx_copy(final Object... vals) {
      Type_h3 output = this;
      boolean ischanged = false;
      Class_h3 val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Core.Type_string vx_p_text = val.text();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":text");
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
          } else if (valsub instanceof Core.Type_string) { // default property
            ischanged = true;
            vx_p_text = (Core.Type_string)valsub;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/h3", ":invalidkeytype", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          if (istestkey) {
            if (!testkey.startsWith(":")) {
              testkey = ":" + testkey;
            }
            boolean isvalidkey = validkeys.contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else if (valsub instanceof Core.Type_string) { // default property
              ischanged = true;
              vx_p_text = (Core.Type_string)valsub;
            } else if (valsub instanceof String) { // default property
              ischanged = true;
              vx_p_text = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval = Core.vx_new_string(testkey);
              msg = Core.vx_msg_from_error("vx/web/html/h3", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/h3", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/h3", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":text":
            if (valsub == vx_p_text) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_text = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_text = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("text"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/h3", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/h3", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_h3 work = new Class_h3();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_text = vx_p_text;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_h3 vx_empty() {return e_h3;}
    @Override
    public Type_h3 vx_type() {return t_h3;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "h3", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_divchild), // traits
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

  public static final Type_h3 e_h3 = new Class_h3();
  public static final Type_h3 t_h3 = new Class_h3();

  /**
   * type: head
   * Head Tag
   * (type head)
   */
  public interface Type_head extends Core.Type_struct {
    public Html.Type_head vx_new(final Object... vals);
    public Html.Type_head vx_copy(final Object... vals);
    public Html.Type_head vx_empty();
    public Html.Type_head vx_type();
    public Html.Type_headchildlist nodes();
  }

  public static class Class_head extends Core.Class_base implements Type_head {

    protected Html.Type_headchildlist vx_p_nodes;

    @Override
    public Html.Type_headchildlist nodes() {
      return this.vx_p_nodes == null ? Html.e_headchildlist : this.vx_p_nodes;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":nodes":
        output = this.nodes();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":nodes", this.nodes());
      return Core.immutablemap(output);
    }

    @Override
    public Type_head vx_new(final Object... vals) {return e_head.vx_copy(vals);}

    @Override
    public Type_head vx_copy(final Object... vals) {
      Type_head output = this;
      boolean ischanged = false;
      Class_head val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Html.Type_headchildlist vx_p_nodes = val.nodes();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":nodes");
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
          } else if (valsub instanceof Html.Type_headchildlist) { // default property
            ischanged = true;
            vx_p_nodes = (Html.Type_headchildlist)valsub;
          } else if (valsub instanceof Html.Type_headchild) { // default property
            Html.Type_headchild valdefault = (Html.Type_headchild)valsub;
            Html.Type_headchildlist vallist = vx_p_nodes;
            if (vallist == null) {
              vallist = Html.t_headchildlist.vx_new(valdefault);
            } else {
              vallist = vallist.vx_copy(valdefault);
            }
            ischanged = true;
            vx_p_nodes = vallist;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/head", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/head", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":nodes":
            if (valsub == vx_p_nodes) {
            } else if (valsub instanceof Html.Type_headchildlist) {
              ischanged = true;
              vx_p_nodes = (Html.Type_headchildlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nodes"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/head", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/head", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_head work = new Class_head();
        work.vx_p_nodes = vx_p_nodes;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_head vx_empty() {return e_head;}
    @Override
    public Type_head vx_type() {return t_head;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "head", // name
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

  public static final Type_head e_head = new Class_head();
  public static final Type_head t_head = new Class_head();

  /**
   * type: headchild
   * Head Child Trait
   * (type headchild)
   */
  public interface Type_headchild extends Core.Type_struct {
    public Html.Type_headchild vx_new(final Object... vals);
    public Html.Type_headchild vx_copy(final Object... vals);
    public Html.Type_headchild vx_empty();
    public Html.Type_headchild vx_type();
  }

  public static class Class_headchild extends Core.Class_base implements Type_headchild {

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
    public Type_headchild vx_new(final Object... vals) {return e_headchild.vx_copy(vals);}

    @Override
    public Type_headchild vx_copy(final Object... vals) {
      Type_headchild output = this;
      boolean ischanged = false;
      Class_headchild val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_headchild work = new Class_headchild();
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_headchild vx_empty() {return e_headchild;}
    @Override
    public Type_headchild vx_type() {return t_headchild;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "headchild", // name
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

  public static final Type_headchild e_headchild = new Class_headchild();
  public static final Type_headchild t_headchild = new Class_headchild();

  /**
   * type: headchildlist
   * List of headchild
   * (type headchildlist)
   */
  public interface Type_headchildlist extends Core.Type_list {
    public Html.Type_headchildlist vx_new(final Object... vals);
    public Html.Type_headchildlist vx_copy(final Object... vals);
    public Html.Type_headchildlist vx_empty();
    public Html.Type_headchildlist vx_type();
    public List<Html.Type_headchild> vx_listheadchild();
    public Html.Type_headchild vx_headchild(final Core.Type_int index);
  }

  public static class Class_headchildlist extends Core.Class_base implements Type_headchildlist {

    protected List<Html.Type_headchild> vx_p_list = Core.immutablelist(new ArrayList<Html.Type_headchild>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Html.Type_headchild vx_headchild(final Core.Type_int index) {
      Html.Type_headchild output = Html.e_headchild;
      Class_headchildlist list = this;
      int iindex = index.vx_int();
      List<Html.Type_headchild> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Html.Type_headchild> vx_listheadchild() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_headchild(index);
    }

    @Override
    public Type_headchildlist vx_new(final Object... vals) {return e_headchildlist.vx_copy(vals);}

    @Override
    public Type_headchildlist vx_copy(final Object... vals) {
      Type_headchildlist output = this;
      boolean ischanged = false;
      Class_headchildlist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Html.Type_headchild> listval = new ArrayList<>(val.vx_listheadchild());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Html.Type_headchild) {
          ischanged = true;
          listval.add((Html.Type_headchild)valsub);
        } else if (valsub instanceof Html.Type_headchild) {
          ischanged = true;
          listval.add((Html.Type_headchild)valsub);
        } else if (valsub instanceof Type_headchildlist) {
          Type_headchildlist multi = (Type_headchildlist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listheadchild());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Html.Type_headchild) {
              Html.Type_headchild valitem = (Html.Type_headchild)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("vx/web/html/headchildlist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("vx/web/html/headchildlist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_headchildlist work = new Class_headchildlist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_headchildlist vx_empty() {return e_headchildlist;}
    @Override
    public Type_headchildlist vx_type() {return t_headchildlist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "headchildlist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Html.t_headchild), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_headchildlist e_headchildlist = new Class_headchildlist();
  public static final Type_headchildlist t_headchildlist = new Class_headchildlist();

  /**
   * type: html
   * Html Tag
   * (type html)
   */
  public interface Type_html extends Core.Type_struct {
    public Html.Type_html vx_new(final Object... vals);
    public Html.Type_html vx_copy(final Object... vals);
    public Html.Type_html vx_empty();
    public Html.Type_html vx_type();
    public Core.Type_string lang();
    public Html.Type_head head();
    public Html.Type_body body();
    public Html.Type_footer footer();
  }

  public static class Class_html extends Core.Class_base implements Type_html {

    protected Core.Type_string vx_p_lang;

    @Override
    public Core.Type_string lang() {
      return this.vx_p_lang == null ? Core.e_string : this.vx_p_lang;
    }

    protected Html.Type_head vx_p_head;

    @Override
    public Html.Type_head head() {
      return this.vx_p_head == null ? Html.e_head : this.vx_p_head;
    }

    protected Html.Type_body vx_p_body;

    @Override
    public Html.Type_body body() {
      return this.vx_p_body == null ? Html.e_body : this.vx_p_body;
    }

    protected Html.Type_footer vx_p_footer;

    @Override
    public Html.Type_footer footer() {
      return this.vx_p_footer == null ? Html.e_footer : this.vx_p_footer;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":lang":
        output = this.lang();
        break;
      case ":head":
        output = this.head();
        break;
      case ":body":
        output = this.body();
        break;
      case ":footer":
        output = this.footer();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":lang", this.lang());
      output.put(":head", this.head());
      output.put(":body", this.body());
      output.put(":footer", this.footer());
      return Core.immutablemap(output);
    }

    @Override
    public Type_html vx_new(final Object... vals) {return e_html.vx_copy(vals);}

    @Override
    public Type_html vx_copy(final Object... vals) {
      Type_html output = this;
      boolean ischanged = false;
      Class_html val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_lang = val.lang();
      Html.Type_head vx_p_head = val.head();
      Html.Type_body vx_p_body = val.body();
      Html.Type_footer vx_p_footer = val.footer();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":lang");
      validkeys.add(":head");
      validkeys.add(":body");
      validkeys.add(":footer");
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
            msg = Core.vx_msg_from_error("vx/web/html/html", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/html", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":lang":
            if (valsub == vx_p_lang) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_lang = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_lang = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("lang"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/html", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":head":
            if (valsub == vx_p_head) {
            } else if (valsub instanceof Html.Type_head) {
              ischanged = true;
              vx_p_head = (Html.Type_head)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("head"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/html", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":body":
            if (valsub == vx_p_body) {
            } else if (valsub instanceof Html.Type_body) {
              ischanged = true;
              vx_p_body = (Html.Type_body)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("body"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/html", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":footer":
            if (valsub == vx_p_footer) {
            } else if (valsub instanceof Html.Type_footer) {
              ischanged = true;
              vx_p_footer = (Html.Type_footer)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("footer"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/html", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/html", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_html work = new Class_html();
        work.vx_p_lang = vx_p_lang;
        work.vx_p_head = vx_p_head;
        work.vx_p_body = vx_p_body;
        work.vx_p_footer = vx_p_footer;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_html vx_empty() {return e_html;}
    @Override
    public Type_html vx_type() {return t_html;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "html", // name
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

  public static final Type_html e_html = new Class_html();
  public static final Type_html t_html = new Class_html();

  /**
   * type: meta
   * Meta Tag
   * (type meta)
   */
  public interface Type_meta extends Core.Type_struct, Html.Type_node, Html.Type_headchild {
    public Html.Type_meta vx_new(final Object... vals);
    public Html.Type_meta vx_copy(final Object... vals);
    public Html.Type_meta vx_empty();
    public Html.Type_meta vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Core.Type_string charset();
  }

  public static class Class_meta extends Core.Class_base implements Type_meta {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Core.Type_string vx_p_charset;

    @Override
    public Core.Type_string charset() {
      return this.vx_p_charset == null ? Core.e_string : this.vx_p_charset;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":charset":
        output = this.charset();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":charset", this.charset());
      return Core.immutablemap(output);
    }

    @Override
    public Type_meta vx_new(final Object... vals) {return e_meta.vx_copy(vals);}

    @Override
    public Type_meta vx_copy(final Object... vals) {
      Type_meta output = this;
      boolean ischanged = false;
      Class_meta val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Core.Type_string vx_p_charset = val.charset();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":charset");
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
            msg = Core.vx_msg_from_error("vx/web/html/meta", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/meta", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/meta", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/meta", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":charset":
            if (valsub == vx_p_charset) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_charset = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_charset = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("charset"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/meta", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/meta", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_meta work = new Class_meta();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_charset = vx_p_charset;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_meta vx_empty() {return e_meta;}
    @Override
    public Type_meta vx_type() {return t_meta;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "meta", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_headchild), // traits
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

  public static final Type_meta e_meta = new Class_meta();
  public static final Type_meta t_meta = new Class_meta();

  /**
   * type: node
   * Common Html Node Trait
   * (type node)
   */
  public interface Type_node extends Core.Type_struct {
    public Html.Type_node vx_new(final Object... vals);
    public Html.Type_node vx_copy(final Object... vals);
    public Html.Type_node vx_empty();
    public Html.Type_node vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
  }

  public static class Class_node extends Core.Class_base implements Type_node {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
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
      output.put(":id", this.id());
      output.put(":style", this.style());
      return Core.immutablemap(output);
    }

    @Override
    public Type_node vx_new(final Object... vals) {return e_node.vx_copy(vals);}

    @Override
    public Type_node vx_copy(final Object... vals) {
      Type_node output = this;
      boolean ischanged = false;
      Class_node val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
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
            msg = Core.vx_msg_from_error("vx/web/html/node", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/node", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/node", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/node", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/node", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_node work = new Class_node();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_node vx_empty() {return e_node;}
    @Override
    public Type_node vx_type() {return t_node;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
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
      );
    }

  }

  public static final Type_node e_node = new Class_node();
  public static final Type_node t_node = new Class_node();

  /**
   * type: nodelist
   * List of node
   * (type nodelist)
   */
  public interface Type_nodelist extends Core.Type_list {
    public Html.Type_nodelist vx_new(final Object... vals);
    public Html.Type_nodelist vx_copy(final Object... vals);
    public Html.Type_nodelist vx_empty();
    public Html.Type_nodelist vx_type();
    public List<Html.Type_node> vx_listnode();
    public Html.Type_node vx_node(final Core.Type_int index);
  }

  public static class Class_nodelist extends Core.Class_base implements Type_nodelist {

    protected List<Html.Type_node> vx_p_list = Core.immutablelist(new ArrayList<Html.Type_node>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Html.Type_node vx_node(final Core.Type_int index) {
      Html.Type_node output = Html.e_node;
      Class_nodelist list = this;
      int iindex = index.vx_int();
      List<Html.Type_node> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Html.Type_node> vx_listnode() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_node(index);
    }

    @Override
    public Type_nodelist vx_new(final Object... vals) {return e_nodelist.vx_copy(vals);}

    @Override
    public Type_nodelist vx_copy(final Object... vals) {
      Type_nodelist output = this;
      boolean ischanged = false;
      Class_nodelist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Html.Type_node> listval = new ArrayList<>(val.vx_listnode());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Html.Type_node) {
          ischanged = true;
          listval.add((Html.Type_node)valsub);
        } else if (valsub instanceof Html.Type_node) {
          ischanged = true;
          listval.add((Html.Type_node)valsub);
        } else if (valsub instanceof Type_nodelist) {
          Type_nodelist multi = (Type_nodelist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listnode());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Html.Type_node) {
              Html.Type_node valitem = (Html.Type_node)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("vx/web/html/nodelist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("vx/web/html/nodelist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_nodelist work = new Class_nodelist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_nodelist vx_empty() {return e_nodelist;}
    @Override
    public Type_nodelist vx_type() {return t_nodelist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "nodelist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Html.t_node), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_nodelist e_nodelist = new Class_nodelist();
  public static final Type_nodelist t_nodelist = new Class_nodelist();

  /**
   * type: p
   * Paragraph Tag
   * (type p)
   */
  public interface Type_p extends Core.Type_struct, Html.Type_node, Html.Type_divchild {
    public Html.Type_p vx_new(final Object... vals);
    public Html.Type_p vx_copy(final Object... vals);
    public Html.Type_p vx_empty();
    public Html.Type_p vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Core.Type_string text();
  }

  public static class Class_p extends Core.Class_base implements Type_p {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Core.Type_string vx_p_text;

    @Override
    public Core.Type_string text() {
      return this.vx_p_text == null ? Core.e_string : this.vx_p_text;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":text":
        output = this.text();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":text", this.text());
      return Core.immutablemap(output);
    }

    @Override
    public Type_p vx_new(final Object... vals) {return e_p.vx_copy(vals);}

    @Override
    public Type_p vx_copy(final Object... vals) {
      Type_p output = this;
      boolean ischanged = false;
      Class_p val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Core.Type_string vx_p_text = val.text();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":text");
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
          } else if (valsub instanceof Core.Type_string) { // default property
            ischanged = true;
            vx_p_text = (Core.Type_string)valsub;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/p", ":invalidkeytype", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          if (istestkey) {
            if (!testkey.startsWith(":")) {
              testkey = ":" + testkey;
            }
            boolean isvalidkey = validkeys.contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else if (valsub instanceof Core.Type_string) { // default property
              ischanged = true;
              vx_p_text = (Core.Type_string)valsub;
            } else if (valsub instanceof String) { // default property
              ischanged = true;
              vx_p_text = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval = Core.vx_new_string(testkey);
              msg = Core.vx_msg_from_error("vx/web/html/p", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/p", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/p", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":text":
            if (valsub == vx_p_text) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_text = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_text = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("text"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/p", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/p", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_p work = new Class_p();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_text = vx_p_text;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_p vx_empty() {return e_p;}
    @Override
    public Type_p vx_type() {return t_p;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "p", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_divchild), // traits
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

  public static final Type_p e_p = new Class_p();
  public static final Type_p t_p = new Class_p();

  /**
   * type: propmap
   * Map of props
   * (type propmap)
   */
  public interface Type_propmap extends Core.Type_map {
    public Html.Type_propmap vx_new(final Object... vals);
    public Html.Type_propmap vx_copy(final Object... vals);
    public Html.Type_propmap vx_empty();
    public Html.Type_propmap vx_type();
    public Map<String, Core.Type_string> vx_mapstring();
    public Core.Type_string vx_string(final Core.Type_string key);
  }

  public static class Class_propmap extends Core.Class_base implements Type_propmap {

    protected Map<String, Core.Type_string> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Core.Type_string>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Core.Type_string vx_string(final Core.Type_string key) {
      Core.Type_string output = Core.e_string;
      Class_propmap map = this;
      String skey = key.vx_string();
      Map<String, Core.Type_string> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Core.e_string);
      return output;
    }

    @Override
    public Map<String, Core.Type_string> vx_mapstring() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_string(key);
    }

    @Override
    public Type_propmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_propmap output = new Class_propmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Core.Type_string> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Core.Type_string) {
          Core.Type_string castval = (Core.Type_string)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("vx/web/html/propmap", ":invalidvalue", val);
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
    public Type_propmap vx_new(final Object... vals) {return e_propmap.vx_copy(vals);}

    @Override
    public Type_propmap vx_copy(final Object... vals) {
      Type_propmap output = this;
      boolean ischanged = false;
      Class_propmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Core.Type_string> mapval = new LinkedHashMap<>(val.vx_mapstring());
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
            msg = Core.vx_msg_from_error("vx/web/html/propmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Core.Type_string valany = null;
          if (valsub instanceof Core.Type_string) {
            valany = (Core.Type_string)valsub;
          } else if (valsub instanceof String) {
            valany = Core.t_string.vx_new(valsub);;
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
            msg = Core.vx_msg_from_error("vx/web/html/propmap", ":invalidkeyvalue", msgmap);
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
        Class_propmap work = new Class_propmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_propmap vx_empty() {return e_propmap;}
    @Override
    public Type_propmap vx_type() {return t_propmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "propmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Core.t_string), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_propmap e_propmap = new Class_propmap();
  public static final Type_propmap t_propmap = new Class_propmap();

  /**
   * type: style
   * Programmable Cascading Style
   * (type style)
   */
  public interface Type_style extends Core.Type_struct {
    public Html.Type_style vx_new(final Object... vals);
    public Html.Type_style vx_copy(final Object... vals);
    public Html.Type_style vx_empty();
    public Html.Type_style vx_type();
    public Core.Type_string name();
    public Html.Type_propmap props();
  }

  public static class Class_style extends Core.Class_base implements Type_style {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Html.Type_propmap vx_p_props;

    @Override
    public Html.Type_propmap props() {
      return this.vx_p_props == null ? Html.e_propmap : this.vx_p_props;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":props":
        output = this.props();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":props", this.props());
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
      Html.Type_propmap vx_p_props = val.props();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":props");
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
            msg = Core.vx_msg_from_error("vx/web/html/style", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/style", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/style", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":props":
            if (valsub == vx_p_props) {
            } else if (valsub instanceof Html.Type_propmap) {
              ischanged = true;
              vx_p_props = (Html.Type_propmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("props"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/style", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/style", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_style work = new Class_style();
        work.vx_p_name = vx_p_name;
        work.vx_p_props = vx_p_props;
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
        "vx/web/html", // pkgname
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

  /**
   * type: stylelist
   * List of style
   * (type stylelist)
   */
  public interface Type_stylelist extends Core.Type_list {
    public Html.Type_stylelist vx_new(final Object... vals);
    public Html.Type_stylelist vx_copy(final Object... vals);
    public Html.Type_stylelist vx_empty();
    public Html.Type_stylelist vx_type();
    public List<Html.Type_style> vx_liststyle();
    public Html.Type_style vx_style(final Core.Type_int index);
  }

  public static class Class_stylelist extends Core.Class_base implements Type_stylelist {

    protected List<Html.Type_style> vx_p_list = Core.immutablelist(new ArrayList<Html.Type_style>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Html.Type_style vx_style(final Core.Type_int index) {
      Html.Type_style output = Html.e_style;
      Class_stylelist list = this;
      int iindex = index.vx_int();
      List<Html.Type_style> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Html.Type_style> vx_liststyle() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_style(index);
    }

    @Override
    public Type_stylelist vx_new(final Object... vals) {return e_stylelist.vx_copy(vals);}

    @Override
    public Type_stylelist vx_copy(final Object... vals) {
      Type_stylelist output = this;
      boolean ischanged = false;
      Class_stylelist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Html.Type_style> listval = new ArrayList<>(val.vx_liststyle());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Html.Type_style) {
          ischanged = true;
          listval.add((Html.Type_style)valsub);
        } else if (valsub instanceof Html.Type_style) {
          ischanged = true;
          listval.add((Html.Type_style)valsub);
        } else if (valsub instanceof Type_stylelist) {
          Type_stylelist multi = (Type_stylelist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_liststyle());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Html.Type_style) {
              Html.Type_style valitem = (Html.Type_style)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("vx/web/html/stylelist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("vx/web/html/stylelist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_stylelist work = new Class_stylelist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_stylelist vx_empty() {return e_stylelist;}
    @Override
    public Type_stylelist vx_type() {return t_stylelist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "stylelist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Html.t_style), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_stylelist e_stylelist = new Class_stylelist();
  public static final Type_stylelist t_stylelist = new Class_stylelist();

  /**
   * type: stylemap
   * Map of style
   * (type stylemap)
   */
  public interface Type_stylemap extends Core.Type_map {
    public Html.Type_stylemap vx_new(final Object... vals);
    public Html.Type_stylemap vx_copy(final Object... vals);
    public Html.Type_stylemap vx_empty();
    public Html.Type_stylemap vx_type();
    public Map<String, Html.Type_style> vx_mapstyle();
    public Html.Type_style vx_style(final Core.Type_string key);
  }

  public static class Class_stylemap extends Core.Class_base implements Type_stylemap {

    protected Map<String, Html.Type_style> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Html.Type_style>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Html.Type_style vx_style(final Core.Type_string key) {
      Html.Type_style output = Html.e_style;
      Class_stylemap map = this;
      String skey = key.vx_string();
      Map<String, Html.Type_style> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Html.e_style);
      return output;
    }

    @Override
    public Map<String, Html.Type_style> vx_mapstyle() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_style(key);
    }

    @Override
    public Type_stylemap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_stylemap output = new Class_stylemap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Html.Type_style> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Html.Type_style) {
          Html.Type_style castval = (Html.Type_style)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("vx/web/html/stylemap", ":invalidvalue", val);
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
    public Type_stylemap vx_new(final Object... vals) {return e_stylemap.vx_copy(vals);}

    @Override
    public Type_stylemap vx_copy(final Object... vals) {
      Type_stylemap output = this;
      boolean ischanged = false;
      Class_stylemap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Html.Type_style> mapval = new LinkedHashMap<>(val.vx_mapstyle());
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
            msg = Core.vx_msg_from_error("vx/web/html/stylemap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Html.Type_style valany = null;
          if (valsub instanceof Html.Type_style) {
            valany = (Html.Type_style)valsub;
          } else if (valsub instanceof Html.Type_style) {
            valany = (Html.Type_style)valsub;
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
            msg = Core.vx_msg_from_error("vx/web/html/stylemap", ":invalidkeyvalue", msgmap);
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
        Class_stylemap work = new Class_stylemap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_stylemap vx_empty() {return e_stylemap;}
    @Override
    public Type_stylemap vx_type() {return t_stylemap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "stylemap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Html.t_style), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_stylemap e_stylemap = new Class_stylemap();
  public static final Type_stylemap t_stylemap = new Class_stylemap();

  /**
   * type: stylesheet
   * Programmable Cascading Style Sheet CSS type
   * (type stylesheet)
   */
  public interface Type_stylesheet extends Core.Type_struct, Html.Type_node, Html.Type_headchild {
    public Html.Type_stylesheet vx_new(final Object... vals);
    public Html.Type_stylesheet vx_copy(final Object... vals);
    public Html.Type_stylesheet vx_empty();
    public Html.Type_stylesheet vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Core.Type_string name();
    public Html.Type_stylelist styles();
    public Html.Type_stylemap stylemap();
  }

  public static class Class_stylesheet extends Core.Class_base implements Type_stylesheet {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Html.Type_stylelist vx_p_styles;

    @Override
    public Html.Type_stylelist styles() {
      return this.vx_p_styles == null ? Html.e_stylelist : this.vx_p_styles;
    }

    protected Html.Type_stylemap vx_p_stylemap;

    @Override
    public Html.Type_stylemap stylemap() {
      return this.vx_p_stylemap == null ? Html.e_stylemap : this.vx_p_stylemap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":name":
        output = this.name();
        break;
      case ":styles":
        output = this.styles();
        break;
      case ":stylemap":
        output = this.stylemap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":name", this.name());
      output.put(":styles", this.styles());
      output.put(":stylemap", this.stylemap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_stylesheet vx_new(final Object... vals) {return e_stylesheet.vx_copy(vals);}

    @Override
    public Type_stylesheet vx_copy(final Object... vals) {
      Type_stylesheet output = this;
      boolean ischanged = false;
      Class_stylesheet val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Core.Type_string vx_p_name = val.name();
      Html.Type_stylelist vx_p_styles = val.styles();
      Html.Type_stylemap vx_p_stylemap = val.stylemap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":name");
      validkeys.add(":styles");
      validkeys.add(":stylemap");
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
            msg = Core.vx_msg_from_error("vx/web/html/stylesheet", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/stylesheet", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/stylesheet", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/stylesheet", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
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
              msg = Core.vx_msg_from_error("vx/web/html/stylesheet", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":styles":
            if (valsub == vx_p_styles) {
            } else if (valsub instanceof Html.Type_stylelist) {
              ischanged = true;
              vx_p_styles = (Html.Type_stylelist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("styles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/stylesheet", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":stylemap":
            if (valsub == vx_p_stylemap) {
            } else if (valsub instanceof Html.Type_stylemap) {
              ischanged = true;
              vx_p_stylemap = (Html.Type_stylemap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("stylemap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/stylesheet", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/stylesheet", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_stylesheet work = new Class_stylesheet();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_name = vx_p_name;
        work.vx_p_styles = vx_p_styles;
        work.vx_p_stylemap = vx_p_stylemap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_stylesheet vx_empty() {return e_stylesheet;}
    @Override
    public Type_stylesheet vx_type() {return t_stylesheet;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "stylesheet", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_headchild), // traits
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

  public static final Type_stylesheet e_stylesheet = new Class_stylesheet();
  public static final Type_stylesheet t_stylesheet = new Class_stylesheet();

  /**
   * type: table
   * <table> Tag
   * (type table)
   */
  public interface Type_table extends Core.Type_struct, Html.Type_node, Html.Type_divchild {
    public Html.Type_table vx_new(final Object... vals);
    public Html.Type_table vx_copy(final Object... vals);
    public Html.Type_table vx_empty();
    public Html.Type_table vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Html.Type_tbody tbody();
    public Html.Type_thead thead();
  }

  public static class Class_table extends Core.Class_base implements Type_table {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Html.Type_tbody vx_p_tbody;

    @Override
    public Html.Type_tbody tbody() {
      return this.vx_p_tbody == null ? Html.e_tbody : this.vx_p_tbody;
    }

    protected Html.Type_thead vx_p_thead;

    @Override
    public Html.Type_thead thead() {
      return this.vx_p_thead == null ? Html.e_thead : this.vx_p_thead;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":tbody":
        output = this.tbody();
        break;
      case ":thead":
        output = this.thead();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":tbody", this.tbody());
      output.put(":thead", this.thead());
      return Core.immutablemap(output);
    }

    @Override
    public Type_table vx_new(final Object... vals) {return e_table.vx_copy(vals);}

    @Override
    public Type_table vx_copy(final Object... vals) {
      Type_table output = this;
      boolean ischanged = false;
      Class_table val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Html.Type_tbody vx_p_tbody = val.tbody();
      Html.Type_thead vx_p_thead = val.thead();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":tbody");
      validkeys.add(":thead");
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
            msg = Core.vx_msg_from_error("vx/web/html/table", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/table", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/table", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/table", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":tbody":
            if (valsub == vx_p_tbody) {
            } else if (valsub instanceof Html.Type_tbody) {
              ischanged = true;
              vx_p_tbody = (Html.Type_tbody)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("tbody"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/table", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":thead":
            if (valsub == vx_p_thead) {
            } else if (valsub instanceof Html.Type_thead) {
              ischanged = true;
              vx_p_thead = (Html.Type_thead)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("thead"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/table", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/table", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_table work = new Class_table();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_tbody = vx_p_tbody;
        work.vx_p_thead = vx_p_thead;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_table vx_empty() {return e_table;}
    @Override
    public Type_table vx_type() {return t_table;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "table", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_divchild), // traits
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

  public static final Type_table e_table = new Class_table();
  public static final Type_table t_table = new Class_table();

  /**
   * type: tbody
   * <tbody> Tag
   * (type tbody)
   */
  public interface Type_tbody extends Core.Type_struct, Html.Type_node {
    public Html.Type_tbody vx_new(final Object... vals);
    public Html.Type_tbody vx_copy(final Object... vals);
    public Html.Type_tbody vx_empty();
    public Html.Type_tbody vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Html.Type_trlist nodes();
  }

  public static class Class_tbody extends Core.Class_base implements Type_tbody {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Html.Type_trlist vx_p_nodes;

    @Override
    public Html.Type_trlist nodes() {
      return this.vx_p_nodes == null ? Html.e_trlist : this.vx_p_nodes;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":nodes":
        output = this.nodes();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":nodes", this.nodes());
      return Core.immutablemap(output);
    }

    @Override
    public Type_tbody vx_new(final Object... vals) {return e_tbody.vx_copy(vals);}

    @Override
    public Type_tbody vx_copy(final Object... vals) {
      Type_tbody output = this;
      boolean ischanged = false;
      Class_tbody val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Html.Type_trlist vx_p_nodes = val.nodes();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":nodes");
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
          } else if (valsub instanceof Html.Type_trlist) { // default property
            ischanged = true;
            vx_p_nodes = (Html.Type_trlist)valsub;
          } else if (valsub instanceof Html.Type_tr) { // default property
            Html.Type_tr valdefault = (Html.Type_tr)valsub;
            Html.Type_trlist vallist = vx_p_nodes;
            if (vallist == null) {
              vallist = Html.t_trlist.vx_new(valdefault);
            } else {
              vallist = vallist.vx_copy(valdefault);
            }
            ischanged = true;
            vx_p_nodes = vallist;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/tbody", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/tbody", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/tbody", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/tbody", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":nodes":
            if (valsub == vx_p_nodes) {
            } else if (valsub instanceof Html.Type_trlist) {
              ischanged = true;
              vx_p_nodes = (Html.Type_trlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nodes"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/tbody", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/tbody", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_tbody work = new Class_tbody();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_nodes = vx_p_nodes;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_tbody vx_empty() {return e_tbody;}
    @Override
    public Type_tbody vx_type() {return t_tbody;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "tbody", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node), // traits
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

  public static final Type_tbody e_tbody = new Class_tbody();
  public static final Type_tbody t_tbody = new Class_tbody();

  /**
   * type: td
   * <tr> Tag
   * (type td)
   */
  public interface Type_td extends Core.Type_struct, Html.Type_node {
    public Html.Type_td vx_new(final Object... vals);
    public Html.Type_td vx_copy(final Object... vals);
    public Html.Type_td vx_empty();
    public Html.Type_td vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Html.Type_divchildlist nodes();
  }

  public static class Class_td extends Core.Class_base implements Type_td {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Html.Type_divchildlist vx_p_nodes;

    @Override
    public Html.Type_divchildlist nodes() {
      return this.vx_p_nodes == null ? Html.e_divchildlist : this.vx_p_nodes;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":nodes":
        output = this.nodes();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":nodes", this.nodes());
      return Core.immutablemap(output);
    }

    @Override
    public Type_td vx_new(final Object... vals) {return e_td.vx_copy(vals);}

    @Override
    public Type_td vx_copy(final Object... vals) {
      Type_td output = this;
      boolean ischanged = false;
      Class_td val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Html.Type_divchildlist vx_p_nodes = val.nodes();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":nodes");
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
          } else if (valsub instanceof Html.Type_divchildlist) { // default property
            ischanged = true;
            vx_p_nodes = (Html.Type_divchildlist)valsub;
          } else if (valsub instanceof Html.Type_divchild) { // default property
            Html.Type_divchild valdefault = (Html.Type_divchild)valsub;
            Html.Type_divchildlist vallist = vx_p_nodes;
            if (vallist == null) {
              vallist = Html.t_divchildlist.vx_new(valdefault);
            } else {
              vallist = vallist.vx_copy(valdefault);
            }
            ischanged = true;
            vx_p_nodes = vallist;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/td", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/td", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/td", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/td", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":nodes":
            if (valsub == vx_p_nodes) {
            } else if (valsub instanceof Html.Type_divchildlist) {
              ischanged = true;
              vx_p_nodes = (Html.Type_divchildlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nodes"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/td", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/td", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_td work = new Class_td();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_nodes = vx_p_nodes;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_td vx_empty() {return e_td;}
    @Override
    public Type_td vx_type() {return t_td;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "td", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node), // traits
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

  public static final Type_td e_td = new Class_td();
  public static final Type_td t_td = new Class_td();

  /**
   * type: tdlist
   * List of td
   * (type tdlist)
   */
  public interface Type_tdlist extends Core.Type_list {
    public Html.Type_tdlist vx_new(final Object... vals);
    public Html.Type_tdlist vx_copy(final Object... vals);
    public Html.Type_tdlist vx_empty();
    public Html.Type_tdlist vx_type();
    public List<Html.Type_td> vx_listtd();
    public Html.Type_td vx_td(final Core.Type_int index);
  }

  public static class Class_tdlist extends Core.Class_base implements Type_tdlist {

    protected List<Html.Type_td> vx_p_list = Core.immutablelist(new ArrayList<Html.Type_td>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Html.Type_td vx_td(final Core.Type_int index) {
      Html.Type_td output = Html.e_td;
      Class_tdlist list = this;
      int iindex = index.vx_int();
      List<Html.Type_td> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Html.Type_td> vx_listtd() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_td(index);
    }

    @Override
    public Type_tdlist vx_new(final Object... vals) {return e_tdlist.vx_copy(vals);}

    @Override
    public Type_tdlist vx_copy(final Object... vals) {
      Type_tdlist output = this;
      boolean ischanged = false;
      Class_tdlist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Html.Type_td> listval = new ArrayList<>(val.vx_listtd());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Html.Type_td) {
          ischanged = true;
          listval.add((Html.Type_td)valsub);
        } else if (valsub instanceof Html.Type_td) {
          ischanged = true;
          listval.add((Html.Type_td)valsub);
        } else if (valsub instanceof Type_tdlist) {
          Type_tdlist multi = (Type_tdlist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listtd());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Html.Type_td) {
              Html.Type_td valitem = (Html.Type_td)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("vx/web/html/tdlist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("vx/web/html/tdlist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_tdlist work = new Class_tdlist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_tdlist vx_empty() {return e_tdlist;}
    @Override
    public Type_tdlist vx_type() {return t_tdlist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "tdlist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Html.t_td), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_tdlist e_tdlist = new Class_tdlist();
  public static final Type_tdlist t_tdlist = new Class_tdlist();

  /**
   * type: thead
   * <thead> Tag
   * (type thead)
   */
  public interface Type_thead extends Core.Type_struct, Html.Type_node {
    public Html.Type_thead vx_new(final Object... vals);
    public Html.Type_thead vx_copy(final Object... vals);
    public Html.Type_thead vx_empty();
    public Html.Type_thead vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Html.Type_trlist nodes();
  }

  public static class Class_thead extends Core.Class_base implements Type_thead {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Html.Type_trlist vx_p_nodes;

    @Override
    public Html.Type_trlist nodes() {
      return this.vx_p_nodes == null ? Html.e_trlist : this.vx_p_nodes;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":nodes":
        output = this.nodes();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":nodes", this.nodes());
      return Core.immutablemap(output);
    }

    @Override
    public Type_thead vx_new(final Object... vals) {return e_thead.vx_copy(vals);}

    @Override
    public Type_thead vx_copy(final Object... vals) {
      Type_thead output = this;
      boolean ischanged = false;
      Class_thead val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Html.Type_trlist vx_p_nodes = val.nodes();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":nodes");
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
          } else if (valsub instanceof Html.Type_trlist) { // default property
            ischanged = true;
            vx_p_nodes = (Html.Type_trlist)valsub;
          } else if (valsub instanceof Html.Type_tr) { // default property
            Html.Type_tr valdefault = (Html.Type_tr)valsub;
            Html.Type_trlist vallist = vx_p_nodes;
            if (vallist == null) {
              vallist = Html.t_trlist.vx_new(valdefault);
            } else {
              vallist = vallist.vx_copy(valdefault);
            }
            ischanged = true;
            vx_p_nodes = vallist;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/thead", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/thead", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/thead", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/thead", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":nodes":
            if (valsub == vx_p_nodes) {
            } else if (valsub instanceof Html.Type_trlist) {
              ischanged = true;
              vx_p_nodes = (Html.Type_trlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nodes"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/thead", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/thead", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_thead work = new Class_thead();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_nodes = vx_p_nodes;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_thead vx_empty() {return e_thead;}
    @Override
    public Type_thead vx_type() {return t_thead;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "thead", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node), // traits
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

  public static final Type_thead e_thead = new Class_thead();
  public static final Type_thead t_thead = new Class_thead();

  /**
   * type: title
   * Title Tag
   * (type title)
   */
  public interface Type_title extends Core.Type_struct, Html.Type_node, Html.Type_headchild {
    public Html.Type_title vx_new(final Object... vals);
    public Html.Type_title vx_copy(final Object... vals);
    public Html.Type_title vx_empty();
    public Html.Type_title vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Core.Type_string text();
  }

  public static class Class_title extends Core.Class_base implements Type_title {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Core.Type_string vx_p_text;

    @Override
    public Core.Type_string text() {
      return this.vx_p_text == null ? Core.e_string : this.vx_p_text;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":text":
        output = this.text();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":text", this.text());
      return Core.immutablemap(output);
    }

    @Override
    public Type_title vx_new(final Object... vals) {return e_title.vx_copy(vals);}

    @Override
    public Type_title vx_copy(final Object... vals) {
      Type_title output = this;
      boolean ischanged = false;
      Class_title val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Core.Type_string vx_p_text = val.text();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":text");
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
            msg = Core.vx_msg_from_error("vx/web/html/title", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/title", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/title", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/title", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":text":
            if (valsub == vx_p_text) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_text = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_text = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("text"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/title", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/title", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_title work = new Class_title();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_text = vx_p_text;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_title vx_empty() {return e_title;}
    @Override
    public Type_title vx_type() {return t_title;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "title", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node, Html.t_headchild), // traits
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

  public static final Type_title e_title = new Class_title();
  public static final Type_title t_title = new Class_title();

  /**
   * type: tr
   * <tr> Tag
   * (type tr)
   */
  public interface Type_tr extends Core.Type_struct, Html.Type_node {
    public Html.Type_tr vx_new(final Object... vals);
    public Html.Type_tr vx_copy(final Object... vals);
    public Html.Type_tr vx_empty();
    public Html.Type_tr vx_type();
    public Core.Type_string id();
    public Html.Type_style style();
    public Html.Type_tdlist nodes();
  }

  public static class Class_tr extends Core.Class_base implements Type_tr {

    protected Core.Type_string vx_p_id;

    @Override
    public Core.Type_string id() {
      return this.vx_p_id == null ? Core.e_string : this.vx_p_id;
    }

    protected Html.Type_style vx_p_style;

    @Override
    public Html.Type_style style() {
      return this.vx_p_style == null ? Html.e_style : this.vx_p_style;
    }

    protected Html.Type_tdlist vx_p_nodes;

    @Override
    public Html.Type_tdlist nodes() {
      return this.vx_p_nodes == null ? Html.e_tdlist : this.vx_p_nodes;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":id":
        output = this.id();
        break;
      case ":style":
        output = this.style();
        break;
      case ":nodes":
        output = this.nodes();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":id", this.id());
      output.put(":style", this.style());
      output.put(":nodes", this.nodes());
      return Core.immutablemap(output);
    }

    @Override
    public Type_tr vx_new(final Object... vals) {return e_tr.vx_copy(vals);}

    @Override
    public Type_tr vx_copy(final Object... vals) {
      Type_tr output = this;
      boolean ischanged = false;
      Class_tr val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_id = val.id();
      Html.Type_style vx_p_style = val.style();
      Html.Type_tdlist vx_p_nodes = val.nodes();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":id");
      validkeys.add(":style");
      validkeys.add(":nodes");
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
          } else if (valsub instanceof Html.Type_tdlist) { // default property
            ischanged = true;
            vx_p_nodes = (Html.Type_tdlist)valsub;
          } else if (valsub instanceof Html.Type_td) { // default property
            Html.Type_td valdefault = (Html.Type_td)valsub;
            Html.Type_tdlist vallist = vx_p_nodes;
            if (vallist == null) {
              vallist = Html.t_tdlist.vx_new(valdefault);
            } else {
              vallist = vallist.vx_copy(valdefault);
            }
            ischanged = true;
            vx_p_nodes = vallist;
          } else {
            Core.Type_any msgval;
            if (valsub instanceof Core.Type_any) {
              msgval = (Core.Type_any)valsub;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("vx/web/html/tr", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("vx/web/html/tr", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":id":
            if (valsub == vx_p_id) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_id = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_id = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("id"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/tr", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":style":
            if (valsub == vx_p_style) {
            } else if (valsub instanceof Html.Type_style) {
              ischanged = true;
              vx_p_style = (Html.Type_style)valsub;
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
              msg = Core.vx_msg_from_error("vx/web/html/tr", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":nodes":
            if (valsub == vx_p_nodes) {
            } else if (valsub instanceof Html.Type_tdlist) {
              ischanged = true;
              vx_p_nodes = (Html.Type_tdlist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nodes"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("vx/web/html/tr", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("vx/web/html/tr", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_tr work = new Class_tr();
        work.vx_p_id = vx_p_id;
        work.vx_p_style = vx_p_style;
        work.vx_p_nodes = vx_p_nodes;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_tr vx_empty() {return e_tr;}
    @Override
    public Type_tr vx_type() {return t_tr;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "tr", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Html.t_node), // traits
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

  public static final Type_tr e_tr = new Class_tr();
  public static final Type_tr t_tr = new Class_tr();

  /**
   * type: trlist
   * List of tr
   * (type trlist)
   */
  public interface Type_trlist extends Core.Type_list {
    public Html.Type_trlist vx_new(final Object... vals);
    public Html.Type_trlist vx_copy(final Object... vals);
    public Html.Type_trlist vx_empty();
    public Html.Type_trlist vx_type();
    public List<Html.Type_tr> vx_listtr();
    public Html.Type_tr vx_tr(final Core.Type_int index);
  }

  public static class Class_trlist extends Core.Class_base implements Type_trlist {

    protected List<Html.Type_tr> vx_p_list = Core.immutablelist(new ArrayList<Html.Type_tr>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Html.Type_tr vx_tr(final Core.Type_int index) {
      Html.Type_tr output = Html.e_tr;
      Class_trlist list = this;
      int iindex = index.vx_int();
      List<Html.Type_tr> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Html.Type_tr> vx_listtr() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_tr(index);
    }

    @Override
    public Type_trlist vx_new(final Object... vals) {return e_trlist.vx_copy(vals);}

    @Override
    public Type_trlist vx_copy(final Object... vals) {
      Type_trlist output = this;
      boolean ischanged = false;
      Class_trlist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Html.Type_tr> listval = new ArrayList<>(val.vx_listtr());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Html.Type_tr) {
          ischanged = true;
          listval.add((Html.Type_tr)valsub);
        } else if (valsub instanceof Html.Type_tr) {
          ischanged = true;
          listval.add((Html.Type_tr)valsub);
        } else if (valsub instanceof Type_trlist) {
          Type_trlist multi = (Type_trlist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listtr());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Html.Type_tr) {
              Html.Type_tr valitem = (Html.Type_tr)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("vx/web/html/trlist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("vx/web/html/trlist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_trlist work = new Class_trlist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_trlist vx_empty() {return e_trlist;}
    @Override
    public Type_trlist vx_type() {return t_trlist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "vx/web/html", // pkgname
        "trlist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Html.t_tr), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_trlist e_trlist = new Class_trlist();
  public static final Type_trlist t_trlist = new Class_trlist();
  /**
   * @function htmlstring_from_string
   * Convert text to HTML string
   * @param  {string} text
   * @return {string}
   * (func htmlstring<-string)
   */
  public static interface Func_htmlstring_from_string extends Core.Func_any_from_any {
    public Core.Type_string vx_htmlstring_from_string(final Core.Type_string text);
  }

  public static class Class_htmlstring_from_string extends Core.Class_base implements Func_htmlstring_from_string {

    @Override
    public Func_htmlstring_from_string vx_new(Object... vals) {
      Class_htmlstring_from_string output = new Class_htmlstring_from_string();
      return output;
    }

    @Override
    public Func_htmlstring_from_string vx_copy(Object... vals) {
      Class_htmlstring_from_string output = new Class_htmlstring_from_string();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "htmlstring<-string", // name
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
    public Func_htmlstring_from_string vx_empty() {return e_htmlstring_from_string;}
    @Override
    public Func_htmlstring_from_string vx_type() {return t_htmlstring_from_string;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Html.f_htmlstring_from_string(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string text = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_htmlstring_from_string(text);
      return output;
    }

    @Override
    public Core.Type_string vx_htmlstring_from_string(final Core.Type_string text) {
      return Html.f_htmlstring_from_string(text);
    }

  }

  public static final Func_htmlstring_from_string e_htmlstring_from_string = new Html.Class_htmlstring_from_string();
  public static final Func_htmlstring_from_string t_htmlstring_from_string = new Html.Class_htmlstring_from_string();

  public static Core.Type_string f_htmlstring_from_string(final Core.Type_string text) {
    Core.Type_string output = Core.e_string;
    String str = text.vx_string();
    str = str
      .replaceAll("&", "&amp;")
      .replaceAll("'", "\'")
      .replaceAll(">", "&gt;")   
      .replaceAll("<", "&lt;");
    output = Core.vx_new_string(str);
    return output;
  }

  /**
   * @function string_indent
   * @param  {int} indent
   * @return {string}
   * (func string-indent)
   */
  public static interface Func_string_indent extends Core.Func_any_from_any {
    public Core.Type_string vx_string_indent(final Core.Type_int indent);
  }

  public static class Class_string_indent extends Core.Class_base implements Func_string_indent {

    @Override
    public Func_string_indent vx_new(Object... vals) {
      Class_string_indent output = new Class_string_indent();
      return output;
    }

    @Override
    public Func_string_indent vx_copy(Object... vals) {
      Class_string_indent output = new Class_string_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string-indent", // name
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
    public Func_string_indent vx_empty() {return e_string_indent;}
    @Override
    public Func_string_indent vx_type() {return t_string_indent;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_int inputval = (Core.Type_int)value;
      Core.Type_any outputval = Html.f_string_indent(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_string_indent(indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_indent(final Core.Type_int indent) {
      return Html.f_string_indent(indent);
    }

  }

  public static final Func_string_indent e_string_indent = new Html.Class_string_indent();
  public static final Func_string_indent t_string_indent = new Html.Class_string_indent();

  public static Core.Type_string f_string_indent(final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_string_repeat(Core.vx_new_string("  "), indent);
    return output;
  }

  /**
   * @function string_from_body_indent
   * Returns string from body
   * @param  {body} body
   * @param  {int} indent
   * @return {string}
   * (func string<-body-indent)
   */
  public static interface Func_string_from_body_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_body_indent(final Html.Type_body body, final Core.Type_int indent);
  }

  public static class Class_string_from_body_indent extends Core.Class_base implements Func_string_from_body_indent {

    @Override
    public Func_string_from_body_indent vx_new(Object... vals) {
      Class_string_from_body_indent output = new Class_string_from_body_indent();
      return output;
    }

    @Override
    public Func_string_from_body_indent vx_copy(Object... vals) {
      Class_string_from_body_indent output = new Class_string_from_body_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-body-indent", // name
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
    public Func_string_from_body_indent vx_empty() {return e_string_from_body_indent;}
    @Override
    public Func_string_from_body_indent vx_type() {return t_string_from_body_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_body body = Core.f_any_from_any(Html.t_body, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_body_indent(body, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_body_indent(final Html.Type_body body, final Core.Type_int indent) {
      return Html.f_string_from_body_indent(body, indent);
    }

  }

  public static final Func_string_from_body_indent e_string_from_body_indent = new Html.Class_string_from_body_indent();
  public static final Func_string_from_body_indent t_string_from_body_indent = new Html.Class_string_from_body_indent();

  public static Core.Type_string f_string_from_body_indent(final Html.Type_body body, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Html.Type_divchildlist nodes = body.nodes();
        return Html.f_string_from_nodelist_tag_prop_indent(nodes, Core.vx_new_string("body"), Core.vx_new_string(""), indent);
      })
    );
    return output;
  }

  /**
   * @function string_from_details_indent
   * Returns string from details
   * @param  {details} details
   * @param  {int} indent
   * @return {string}
   * (func string<-details-indent)
   */
  public static interface Func_string_from_details_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_details_indent(final Html.Type_details details, final Core.Type_int indent);
  }

  public static class Class_string_from_details_indent extends Core.Class_base implements Func_string_from_details_indent {

    @Override
    public Func_string_from_details_indent vx_new(Object... vals) {
      Class_string_from_details_indent output = new Class_string_from_details_indent();
      return output;
    }

    @Override
    public Func_string_from_details_indent vx_copy(Object... vals) {
      Class_string_from_details_indent output = new Class_string_from_details_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-details-indent", // name
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
    public Func_string_from_details_indent vx_empty() {return e_string_from_details_indent;}
    @Override
    public Func_string_from_details_indent vx_type() {return t_string_from_details_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_details details = Core.f_any_from_any(Html.t_details, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_details_indent(details, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_details_indent(final Html.Type_details details, final Core.Type_int indent) {
      return Html.f_string_from_details_indent(details, indent);
    }

  }

  public static final Func_string_from_details_indent e_string_from_details_indent = new Html.Class_string_from_details_indent();
  public static final Func_string_from_details_indent t_string_from_details_indent = new Html.Class_string_from_details_indent();

  public static Core.Type_string f_string_from_details_indent(final Html.Type_details details, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Html.Type_divchildlist summary = details.summary();
        final Html.Type_divchildlist nodes = details.nodes();
        final Core.Type_string ssummary = Html.f_string_from_nodelist_indent(
          summary,
          Core.f_plus(indent, Core.vx_new_int(2))
        );
        final Core.Type_string snodes = Html.f_string_from_nodelist_indent(
          nodes,
          Core.f_plus(indent, Core.vx_new_int(1))
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<details>"),
            sindent,
            Core.vx_new_string("  <summary>"),
            ssummary,
            sindent,
            Core.vx_new_string("  </summary>"),
            snodes,
            sindent,
            Core.vx_new_string("</details>")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_div_indent
   * Returns string from div
   * @param  {div} div
   * @param  {int} indent
   * @return {string}
   * (func string<-div-indent)
   */
  public static interface Func_string_from_div_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_div_indent(final Html.Type_div div, final Core.Type_int indent);
  }

  public static class Class_string_from_div_indent extends Core.Class_base implements Func_string_from_div_indent {

    @Override
    public Func_string_from_div_indent vx_new(Object... vals) {
      Class_string_from_div_indent output = new Class_string_from_div_indent();
      return output;
    }

    @Override
    public Func_string_from_div_indent vx_copy(Object... vals) {
      Class_string_from_div_indent output = new Class_string_from_div_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-div-indent", // name
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
    public Func_string_from_div_indent vx_empty() {return e_string_from_div_indent;}
    @Override
    public Func_string_from_div_indent vx_type() {return t_string_from_div_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_div div = Core.f_any_from_any(Html.t_div, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_div_indent(div, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_div_indent(final Html.Type_div div, final Core.Type_int indent) {
      return Html.f_string_from_div_indent(div, indent);
    }

  }

  public static final Func_string_from_div_indent e_string_from_div_indent = new Html.Class_string_from_div_indent();
  public static final Func_string_from_div_indent t_string_from_div_indent = new Html.Class_string_from_div_indent();

  public static Core.Type_string f_string_from_div_indent(final Html.Type_div div, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Html.Type_divchildlist nodes = div.nodes();
        final Core.Type_string sid = Html.f_string_from_propname_val(
          Core.vx_new_string("id"),
          div.id()
        );
        final Core.Type_string sstyle = Html.f_string_from_propstyle(
          div.style()
        );
        return Html.f_string_from_nodelist_tag_prop_indent(
          nodes,
          Core.vx_new_string("div"),
          Core.f_new(
            Core.t_string,
            Core.t_anylist.vx_new(
              sid,
              sstyle
            )
          ),
          indent
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_footer_indent
   * Returns string from footer
   * @param  {footer} footer
   * @param  {int} indent
   * @return {string}
   * (func string<-footer-indent)
   */
  public static interface Func_string_from_footer_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_footer_indent(final Html.Type_footer footer, final Core.Type_int indent);
  }

  public static class Class_string_from_footer_indent extends Core.Class_base implements Func_string_from_footer_indent {

    @Override
    public Func_string_from_footer_indent vx_new(Object... vals) {
      Class_string_from_footer_indent output = new Class_string_from_footer_indent();
      return output;
    }

    @Override
    public Func_string_from_footer_indent vx_copy(Object... vals) {
      Class_string_from_footer_indent output = new Class_string_from_footer_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-footer-indent", // name
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
    public Func_string_from_footer_indent vx_empty() {return e_string_from_footer_indent;}
    @Override
    public Func_string_from_footer_indent vx_type() {return t_string_from_footer_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_footer footer = Core.f_any_from_any(Html.t_footer, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_footer_indent(footer, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_footer_indent(final Html.Type_footer footer, final Core.Type_int indent) {
      return Html.f_string_from_footer_indent(footer, indent);
    }

  }

  public static final Func_string_from_footer_indent e_string_from_footer_indent = new Html.Class_string_from_footer_indent();
  public static final Func_string_from_footer_indent t_string_from_footer_indent = new Html.Class_string_from_footer_indent();

  public static Core.Type_string f_string_from_footer_indent(final Html.Type_footer footer, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Html.Type_divchildlist nodes = footer.nodes();
        return Html.f_string_from_nodelist_tag_prop_indent(nodes, Core.vx_new_string("footer"), Core.vx_new_string(""), indent);
      })
    );
    return output;
  }

  /**
   * @function string_from_h1_indent
   * Returns string from h1
   * @param  {h1} h1
   * @param  {int} indent
   * @return {string}
   * (func string<-h1-indent)
   */
  public static interface Func_string_from_h1_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_h1_indent(final Html.Type_h1 h1, final Core.Type_int indent);
  }

  public static class Class_string_from_h1_indent extends Core.Class_base implements Func_string_from_h1_indent {

    @Override
    public Func_string_from_h1_indent vx_new(Object... vals) {
      Class_string_from_h1_indent output = new Class_string_from_h1_indent();
      return output;
    }

    @Override
    public Func_string_from_h1_indent vx_copy(Object... vals) {
      Class_string_from_h1_indent output = new Class_string_from_h1_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-h1-indent", // name
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
    public Func_string_from_h1_indent vx_empty() {return e_string_from_h1_indent;}
    @Override
    public Func_string_from_h1_indent vx_type() {return t_string_from_h1_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_h1 h1 = Core.f_any_from_any(Html.t_h1, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_h1_indent(h1, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_h1_indent(final Html.Type_h1 h1, final Core.Type_int indent) {
      return Html.f_string_from_h1_indent(h1, indent);
    }

  }

  public static final Func_string_from_h1_indent e_string_from_h1_indent = new Html.Class_string_from_h1_indent();
  public static final Func_string_from_h1_indent t_string_from_h1_indent = new Html.Class_string_from_h1_indent();

  public static Core.Type_string f_string_from_h1_indent(final Html.Type_h1 h1, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string text = h1.text();
        final Core.Type_string sid = Html.f_string_from_propname_val(
          Core.vx_new_string("id"),
          h1.id()
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<h1"),
            sid,
            Core.vx_new_string(">"),
            text,
            Core.vx_new_string("</h1>")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_h2_indent
   * Returns string from h2
   * @param  {h2} h2
   * @param  {int} indent
   * @return {string}
   * (func string<-h2-indent)
   */
  public static interface Func_string_from_h2_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_h2_indent(final Html.Type_h2 h2, final Core.Type_int indent);
  }

  public static class Class_string_from_h2_indent extends Core.Class_base implements Func_string_from_h2_indent {

    @Override
    public Func_string_from_h2_indent vx_new(Object... vals) {
      Class_string_from_h2_indent output = new Class_string_from_h2_indent();
      return output;
    }

    @Override
    public Func_string_from_h2_indent vx_copy(Object... vals) {
      Class_string_from_h2_indent output = new Class_string_from_h2_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-h2-indent", // name
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
    public Func_string_from_h2_indent vx_empty() {return e_string_from_h2_indent;}
    @Override
    public Func_string_from_h2_indent vx_type() {return t_string_from_h2_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_h2 h2 = Core.f_any_from_any(Html.t_h2, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_h2_indent(h2, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_h2_indent(final Html.Type_h2 h2, final Core.Type_int indent) {
      return Html.f_string_from_h2_indent(h2, indent);
    }

  }

  public static final Func_string_from_h2_indent e_string_from_h2_indent = new Html.Class_string_from_h2_indent();
  public static final Func_string_from_h2_indent t_string_from_h2_indent = new Html.Class_string_from_h2_indent();

  public static Core.Type_string f_string_from_h2_indent(final Html.Type_h2 h2, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string text = h2.text();
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string sid = Html.f_string_from_propname_val(
          Core.vx_new_string("id"),
          h2.id()
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<h2"),
            sid,
            Core.vx_new_string(">"),
            text,
            Core.vx_new_string("</h2>")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_h3_indent
   * Returns string from h3
   * @param  {h3} h3
   * @param  {int} indent
   * @return {string}
   * (func string<-h3-indent)
   */
  public static interface Func_string_from_h3_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_h3_indent(final Html.Type_h3 h3, final Core.Type_int indent);
  }

  public static class Class_string_from_h3_indent extends Core.Class_base implements Func_string_from_h3_indent {

    @Override
    public Func_string_from_h3_indent vx_new(Object... vals) {
      Class_string_from_h3_indent output = new Class_string_from_h3_indent();
      return output;
    }

    @Override
    public Func_string_from_h3_indent vx_copy(Object... vals) {
      Class_string_from_h3_indent output = new Class_string_from_h3_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-h3-indent", // name
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
    public Func_string_from_h3_indent vx_empty() {return e_string_from_h3_indent;}
    @Override
    public Func_string_from_h3_indent vx_type() {return t_string_from_h3_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_h3 h3 = Core.f_any_from_any(Html.t_h3, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_h3_indent(h3, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_h3_indent(final Html.Type_h3 h3, final Core.Type_int indent) {
      return Html.f_string_from_h3_indent(h3, indent);
    }

  }

  public static final Func_string_from_h3_indent e_string_from_h3_indent = new Html.Class_string_from_h3_indent();
  public static final Func_string_from_h3_indent t_string_from_h3_indent = new Html.Class_string_from_h3_indent();

  public static Core.Type_string f_string_from_h3_indent(final Html.Type_h3 h3, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string text = h3.text();
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string sid = Html.f_string_from_propname_val(
          Core.vx_new_string("id"),
          h3.id()
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<h3"),
            sid,
            Core.vx_new_string(">"),
            text,
            Core.vx_new_string("</h3>")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_head_indent
   * Returns string from head
   * @param  {head} head
   * @param  {int} indent
   * @return {string}
   * (func string<-head-indent)
   */
  public static interface Func_string_from_head_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_head_indent(final Html.Type_head head, final Core.Type_int indent);
  }

  public static class Class_string_from_head_indent extends Core.Class_base implements Func_string_from_head_indent {

    @Override
    public Func_string_from_head_indent vx_new(Object... vals) {
      Class_string_from_head_indent output = new Class_string_from_head_indent();
      return output;
    }

    @Override
    public Func_string_from_head_indent vx_copy(Object... vals) {
      Class_string_from_head_indent output = new Class_string_from_head_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-head-indent", // name
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
    public Func_string_from_head_indent vx_empty() {return e_string_from_head_indent;}
    @Override
    public Func_string_from_head_indent vx_type() {return t_string_from_head_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_head head = Core.f_any_from_any(Html.t_head, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_head_indent(head, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_head_indent(final Html.Type_head head, final Core.Type_int indent) {
      return Html.f_string_from_head_indent(head, indent);
    }

  }

  public static final Func_string_from_head_indent e_string_from_head_indent = new Html.Class_string_from_head_indent();
  public static final Func_string_from_head_indent t_string_from_head_indent = new Html.Class_string_from_head_indent();

  public static Core.Type_string f_string_from_head_indent(final Html.Type_head head, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Html.Type_headchildlist nodes = head.nodes();
        return Html.f_string_from_nodelist_tag_prop_indent(nodes, Core.vx_new_string("head"), Core.vx_new_string(""), indent);
      })
    );
    return output;
  }

  /**
   * @function string_from_html
   * Returns string from html
   * @param  {html} html
   * @return {string}
   * (func string<-html)
   */
  public static interface Func_string_from_html extends Core.Func_any_from_any {
    public Core.Type_string vx_string_from_html(final Html.Type_html html);
  }

  public static class Class_string_from_html extends Core.Class_base implements Func_string_from_html {

    @Override
    public Func_string_from_html vx_new(Object... vals) {
      Class_string_from_html output = new Class_string_from_html();
      return output;
    }

    @Override
    public Func_string_from_html vx_copy(Object... vals) {
      Class_string_from_html output = new Class_string_from_html();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-html", // name
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
    public Func_string_from_html vx_empty() {return e_string_from_html;}
    @Override
    public Func_string_from_html vx_type() {return t_string_from_html;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Html.Type_html inputval = (Html.Type_html)value;
      Core.Type_any outputval = Html.f_string_from_html(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_html html = Core.f_any_from_any(Html.t_html, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_string_from_html(html);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_html(final Html.Type_html html) {
      return Html.f_string_from_html(html);
    }

  }

  public static final Func_string_from_html e_string_from_html = new Html.Class_string_from_html();
  public static final Func_string_from_html t_string_from_html = new Html.Class_string_from_html();

  public static Core.Type_string f_string_from_html(final Html.Type_html html) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string lang = Html.f_string_from_propname_val(
          Core.vx_new_string("lang"),
          html.lang()
        );
        final Html.Type_head head = html.head();
        final Html.Type_body body = html.body();
        final Html.Type_footer footer = html.footer();
        final Core.Type_string shead = Html.f_string_from_head_indent(head, Core.vx_new_int(1));
        final Core.Type_string sbody = Html.f_string_from_body_indent(body, Core.vx_new_int(1));
        final Core.Type_string sfooter = Html.f_string_from_footer_indent(footer, Core.vx_new_int(1));
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            Core.vx_new_string("<!DOCTYPE html>"),
            Core.c_newline,
            Core.vx_new_string("<html"),
            lang,
            Core.vx_new_string(">"),
            shead,
            sbody,
            sfooter,
            Core.c_newline,
            Core.vx_new_string("</html>")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_indent
   * Returns a string to do indentation for a given indent count.
   * @param  {int} indent
   * @return {string}
   * (func string<-indent)
   */
  public static interface Func_string_from_indent extends Core.Func_any_from_any {
    public Core.Type_string vx_string_from_indent(final Core.Type_int indent);
  }

  public static class Class_string_from_indent extends Core.Class_base implements Func_string_from_indent {

    @Override
    public Func_string_from_indent vx_new(Object... vals) {
      Class_string_from_indent output = new Class_string_from_indent();
      return output;
    }

    @Override
    public Func_string_from_indent vx_copy(Object... vals) {
      Class_string_from_indent output = new Class_string_from_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-indent", // name
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
    public Func_string_from_indent vx_empty() {return e_string_from_indent;}
    @Override
    public Func_string_from_indent vx_type() {return t_string_from_indent;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_int inputval = (Core.Type_int)value;
      Core.Type_any outputval = Html.f_string_from_indent(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_string_from_indent(indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_indent(final Core.Type_int indent) {
      return Html.f_string_from_indent(indent);
    }

  }

  public static final Func_string_from_indent e_string_from_indent = new Html.Class_string_from_indent();
  public static final Func_string_from_indent t_string_from_indent = new Html.Class_string_from_indent();

  public static Core.Type_string f_string_from_indent(final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_if_1(
      Core.t_string,
      Core.f_eq(indent, Core.vx_new_int(0)),
      Core.vx_new_string(""),
      Core.f_new(
        Core.t_string,
        Core.t_anylist.vx_new(
          Core.c_newline,
          Html.f_string_indent(indent)
        )
      )
    );
    return output;
  }

  /**
   * @function string_from_meta_indent
   * Returns string from head
   * @param  {meta} meta
   * @param  {int} indent
   * @return {string}
   * (func string<-meta-indent)
   */
  public static interface Func_string_from_meta_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_meta_indent(final Html.Type_meta meta, final Core.Type_int indent);
  }

  public static class Class_string_from_meta_indent extends Core.Class_base implements Func_string_from_meta_indent {

    @Override
    public Func_string_from_meta_indent vx_new(Object... vals) {
      Class_string_from_meta_indent output = new Class_string_from_meta_indent();
      return output;
    }

    @Override
    public Func_string_from_meta_indent vx_copy(Object... vals) {
      Class_string_from_meta_indent output = new Class_string_from_meta_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-meta-indent", // name
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
    public Func_string_from_meta_indent vx_empty() {return e_string_from_meta_indent;}
    @Override
    public Func_string_from_meta_indent vx_type() {return t_string_from_meta_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_meta meta = Core.f_any_from_any(Html.t_meta, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_meta_indent(meta, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_meta_indent(final Html.Type_meta meta, final Core.Type_int indent) {
      return Html.f_string_from_meta_indent(meta, indent);
    }

  }

  public static final Func_string_from_meta_indent e_string_from_meta_indent = new Html.Class_string_from_meta_indent();
  public static final Func_string_from_meta_indent t_string_from_meta_indent = new Html.Class_string_from_meta_indent();

  public static Core.Type_string f_string_from_meta_indent(final Html.Type_meta meta, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string charset = Html.f_string_from_propname_val(
          Core.vx_new_string("charset"),
          meta.charset()
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<meta"),
            charset,
            Core.vx_new_string(" />")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_node_indent
   * Returns a string from any node
   * @param  {any-1} node
   * @param  {int} indent
   * @return {string}
   * (func string<-node-indent)
   */
  public static interface Func_string_from_node_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_node_indent(final Core.Type_any node, final Core.Type_int indent);
  }

  public static class Class_string_from_node_indent extends Core.Class_base implements Func_string_from_node_indent {

    @Override
    public Func_string_from_node_indent vx_new(Object... vals) {
      Class_string_from_node_indent output = new Class_string_from_node_indent();
      return output;
    }

    @Override
    public Func_string_from_node_indent vx_copy(Object... vals) {
      Class_string_from_node_indent output = new Class_string_from_node_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-node-indent", // name
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
    public Func_string_from_node_indent vx_empty() {return e_string_from_node_indent;}
    @Override
    public Func_string_from_node_indent vx_type() {return t_string_from_node_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_any node = Core.f_any_from_any(Core.t_any, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_node_indent(node, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_node_indent(final Core.Type_any node, final Core.Type_int indent) {
      return Html.f_string_from_node_indent(node, indent);
    }

  }

  public static final Func_string_from_node_indent e_string_from_node_indent = new Html.Class_string_from_node_indent();
  public static final Func_string_from_node_indent t_string_from_node_indent = new Html.Class_string_from_node_indent();

  public static Core.Type_string f_string_from_node_indent(final Core.Type_any node, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_switch(
      Core.t_string,
      Core.f_type_from_any(node),
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Html.t_body,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_body_indent(
              Core.f_any_from_any(Html.t_body, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_details,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_details_indent(
              Core.f_any_from_any(Html.t_details, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_div,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_div_indent(
              Core.f_any_from_any(Html.t_div, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_h1,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_h1_indent(
              Core.f_any_from_any(Html.t_h1, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_h2,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_h2_indent(
              Core.f_any_from_any(Html.t_h2, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_h3,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_h3_indent(
              Core.f_any_from_any(Html.t_h3, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_head,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_head_indent(
              Core.f_any_from_any(Html.t_head, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_footer,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_footer_indent(
              Core.f_any_from_any(Html.t_footer, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_meta,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_meta_indent(
              Core.f_any_from_any(Html.t_meta, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_p,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_p_indent(
              Core.f_any_from_any(Html.t_p, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_stylesheet,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_stylesheet_indent(
              Core.f_any_from_any(Html.t_stylesheet, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_table,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_table_indent(
              Core.f_any_from_any(Html.t_table, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_title,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_title_indent(
              Core.f_any_from_any(Html.t_title, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_tbody,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_tbody_indent(
              Core.f_any_from_any(Html.t_tbody, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_thead,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_thead_indent(
              Core.f_any_from_any(Html.t_thead, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_td,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_td_indent(
              Core.f_any_from_any(Html.t_td, node),
              indent
            );
          })
        ),
        Core.f_case_1(
          Html.t_tr,
          Core.t_any_from_func.vx_fn_new(() -> {
            return Html.f_string_from_tr_indent(
              Core.f_any_from_any(Html.t_tr, node),
              indent
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function string_from_nodelist_indent
   * Returns a string from any node
   * @param  {list-1} nodelist
   * @param  {int} indent
   * @return {string}
   * (func string<-nodelist-indent)
   */
  public static interface Func_string_from_nodelist_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_nodelist_indent(final Core.Type_list nodelist, final Core.Type_int indent);
  }

  public static class Class_string_from_nodelist_indent extends Core.Class_base implements Func_string_from_nodelist_indent {

    @Override
    public Func_string_from_nodelist_indent vx_new(Object... vals) {
      Class_string_from_nodelist_indent output = new Class_string_from_nodelist_indent();
      return output;
    }

    @Override
    public Func_string_from_nodelist_indent vx_copy(Object... vals) {
      Class_string_from_nodelist_indent output = new Class_string_from_nodelist_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-nodelist-indent", // name
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
    public Func_string_from_nodelist_indent vx_empty() {return e_string_from_nodelist_indent;}
    @Override
    public Func_string_from_nodelist_indent vx_type() {return t_string_from_nodelist_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_list nodelist = Core.f_any_from_any(Core.t_list, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_nodelist_indent(nodelist, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_nodelist_indent(final Core.Type_list nodelist, final Core.Type_int indent) {
      return Html.f_string_from_nodelist_indent(nodelist, indent);
    }

  }

  public static final Func_string_from_nodelist_indent e_string_from_nodelist_indent = new Html.Class_string_from_nodelist_indent();
  public static final Func_string_from_nodelist_indent t_string_from_nodelist_indent = new Html.Class_string_from_nodelist_indent();

  public static Core.Type_string f_string_from_nodelist_indent(final Core.Type_list nodelist, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringlist textlist = Core.f_list_from_list(
          Core.t_stringlist,
          nodelist,
          Core.t_any_from_any.vx_fn_new((node_any) -> {
            Html.Type_node node = Core.f_any_from_any(Html.t_node, node_any);
            return 
                Html.f_string_from_node_indent(node, indent);
          })
        );
        return Type.f_string_from_stringlist_join(textlist, Core.vx_new_string(""));
      })
    );
    return output;
  }

  /**
   * @function string_from_nodelist_tag_prop_indent
   * Returns string from generic nodelist
   * @param  {list-1} nodes
   * @param  {string} tag
   * @param  {string} prop
   * @param  {int} indent
   * @return {string}
   * (func string<-nodelist-tag-prop-indent)
   */
  public static interface Func_string_from_nodelist_tag_prop_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_nodelist_tag_prop_indent(final Core.Type_list nodes, final Core.Type_string tag, final Core.Type_string prop, final Core.Type_int indent);
  }

  public static class Class_string_from_nodelist_tag_prop_indent extends Core.Class_base implements Func_string_from_nodelist_tag_prop_indent {

    @Override
    public Func_string_from_nodelist_tag_prop_indent vx_new(Object... vals) {
      Class_string_from_nodelist_tag_prop_indent output = new Class_string_from_nodelist_tag_prop_indent();
      return output;
    }

    @Override
    public Func_string_from_nodelist_tag_prop_indent vx_copy(Object... vals) {
      Class_string_from_nodelist_tag_prop_indent output = new Class_string_from_nodelist_tag_prop_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-nodelist-tag-prop-indent", // name
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
    public Func_string_from_nodelist_tag_prop_indent vx_empty() {return e_string_from_nodelist_tag_prop_indent;}
    @Override
    public Func_string_from_nodelist_tag_prop_indent vx_type() {return t_string_from_nodelist_tag_prop_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_list nodes = Core.f_any_from_any(Core.t_list, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string tag = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string prop = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(3)));
      output = Html.f_string_from_nodelist_tag_prop_indent(nodes, tag, prop, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_nodelist_tag_prop_indent(final Core.Type_list nodes, final Core.Type_string tag, final Core.Type_string prop, final Core.Type_int indent) {
      return Html.f_string_from_nodelist_tag_prop_indent(nodes, tag, prop, indent);
    }

  }

  public static final Func_string_from_nodelist_tag_prop_indent e_string_from_nodelist_tag_prop_indent = new Html.Class_string_from_nodelist_tag_prop_indent();
  public static final Func_string_from_nodelist_tag_prop_indent t_string_from_nodelist_tag_prop_indent = new Html.Class_string_from_nodelist_tag_prop_indent();

  public static Core.Type_string f_string_from_nodelist_tag_prop_indent(final Core.Type_list nodes, final Core.Type_string tag, final Core.Type_string prop, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string text = Html.f_string_from_nodelist_indent(
          nodes,
          Core.f_plus1(indent)
        );
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string eindent = Core.f_if_2(
          Core.t_string,
          Core.t_thenelselist.vx_new(
              Core.f_then(
                Core.t_boolean_from_func.vx_fn_new(() -> {
                  return Core.f_is_empty(text);
                }),
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.vx_new_string("");
                })
              ),
              Core.f_then(
                Core.t_boolean_from_func.vx_fn_new(() -> {
                  return Core.f_is_empty(sindent);
                }),
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.c_newline;
                })
              ),
              Core.f_else(
                Core.t_any_from_func.vx_fn_new(() -> {
                  return sindent;
                })
              )
          )
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<"),
            tag,
            prop,
            Core.vx_new_string(">"),
            text,
            eindent,
            Core.vx_new_string("</"),
            tag,
            Core.vx_new_string(">")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_p_indent
   * Returns string from p
   * @param  {p} p
   * @param  {int} indent
   * @return {string}
   * (func string<-p-indent)
   */
  public static interface Func_string_from_p_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_p_indent(final Html.Type_p p, final Core.Type_int indent);
  }

  public static class Class_string_from_p_indent extends Core.Class_base implements Func_string_from_p_indent {

    @Override
    public Func_string_from_p_indent vx_new(Object... vals) {
      Class_string_from_p_indent output = new Class_string_from_p_indent();
      return output;
    }

    @Override
    public Func_string_from_p_indent vx_copy(Object... vals) {
      Class_string_from_p_indent output = new Class_string_from_p_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-p-indent", // name
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
    public Func_string_from_p_indent vx_empty() {return e_string_from_p_indent;}
    @Override
    public Func_string_from_p_indent vx_type() {return t_string_from_p_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_p p = Core.f_any_from_any(Html.t_p, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_p_indent(p, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_p_indent(final Html.Type_p p, final Core.Type_int indent) {
      return Html.f_string_from_p_indent(p, indent);
    }

  }

  public static final Func_string_from_p_indent e_string_from_p_indent = new Html.Class_string_from_p_indent();
  public static final Func_string_from_p_indent t_string_from_p_indent = new Html.Class_string_from_p_indent();

  public static Core.Type_string f_string_from_p_indent(final Html.Type_p p, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string text = Html.f_htmlstring_from_string(
          p.text()
        );
        final Core.Type_string sid = Html.f_string_from_propname_val(
          Core.vx_new_string("id"),
          p.id()
        );
        final Core.Type_string sstyle = Html.f_string_from_propstyle(
          p.style()
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<p"),
            sid,
            sstyle,
            Core.vx_new_string(">"),
            text,
            Core.vx_new_string("</p>")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_propname_val
   * Returns ' key=\"val\"' if val is not blank.
   * @param  {string} key
   * @param  {string} val
   * @return {string}
   * (func string<-propname-val)
   */
  public static interface Func_string_from_propname_val extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_propname_val(final Core.Type_string key, final Core.Type_string val);
  }

  public static class Class_string_from_propname_val extends Core.Class_base implements Func_string_from_propname_val {

    @Override
    public Func_string_from_propname_val vx_new(Object... vals) {
      Class_string_from_propname_val output = new Class_string_from_propname_val();
      return output;
    }

    @Override
    public Func_string_from_propname_val vx_copy(Object... vals) {
      Class_string_from_propname_val output = new Class_string_from_propname_val();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-propname-val", // name
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
    public Func_string_from_propname_val vx_empty() {return e_string_from_propname_val;}
    @Override
    public Func_string_from_propname_val vx_type() {return t_string_from_propname_val;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string val = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_propname_val(key, val);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_propname_val(final Core.Type_string key, final Core.Type_string val) {
      return Html.f_string_from_propname_val(key, val);
    }

  }

  public static final Func_string_from_propname_val e_string_from_propname_val = new Html.Class_string_from_propname_val();
  public static final Func_string_from_propname_val t_string_from_propname_val = new Html.Class_string_from_propname_val();

  public static Core.Type_string f_string_from_propname_val(final Core.Type_string key, final Core.Type_string val) {
    Core.Type_string output = Core.e_string;
    output = Core.f_if(
      Core.t_string,
      Core.f_notempty(val),
      Core.f_new(
        Core.t_string,
        Core.t_anylist.vx_new(
          Core.vx_new_string(" "),
          key,
          Core.vx_new_string("="),
          Core.c_quote,
          val,
          Core.c_quote
        )
      )
    );
    return output;
  }

  /**
   * @function string_from_propstyle
   * Returns ' class=\"style.name\"' if style is not empty.
   * @param  {style} style
   * @return {string}
   * (func string<-propstyle)
   */
  public static interface Func_string_from_propstyle extends Core.Func_any_from_any {
    public Core.Type_string vx_string_from_propstyle(final Html.Type_style style);
  }

  public static class Class_string_from_propstyle extends Core.Class_base implements Func_string_from_propstyle {

    @Override
    public Func_string_from_propstyle vx_new(Object... vals) {
      Class_string_from_propstyle output = new Class_string_from_propstyle();
      return output;
    }

    @Override
    public Func_string_from_propstyle vx_copy(Object... vals) {
      Class_string_from_propstyle output = new Class_string_from_propstyle();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-propstyle", // name
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
    public Func_string_from_propstyle vx_empty() {return e_string_from_propstyle;}
    @Override
    public Func_string_from_propstyle vx_type() {return t_string_from_propstyle;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Html.Type_style inputval = (Html.Type_style)value;
      Core.Type_any outputval = Html.f_string_from_propstyle(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_style style = Core.f_any_from_any(Html.t_style, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_string_from_propstyle(style);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_propstyle(final Html.Type_style style) {
      return Html.f_string_from_propstyle(style);
    }

  }

  public static final Func_string_from_propstyle e_string_from_propstyle = new Html.Class_string_from_propstyle();
  public static final Func_string_from_propstyle t_string_from_propstyle = new Html.Class_string_from_propstyle();

  public static Core.Type_string f_string_from_propstyle(final Html.Type_style style) {
    Core.Type_string output = Core.e_string;
    output = Core.f_if(
      Core.t_string,
      Core.f_notempty_1(style),
      Core.f_new(
        Core.t_string,
        Core.t_anylist.vx_new(
          Core.vx_new_string(" class="),
          Core.c_quote,
          Type.f_string_from_string_start(
            style.name(),
            Core.vx_new_int(2)
          ),
          Core.c_quote
        )
      )
    );
    return output;
  }

  /**
   * @function string_from_style_indent
   * Returns indent'name {key: val;}' for each style.
   * @param  {style} style
   * @param  {int} indent
   * @return {string}
   * (func string<-style-indent)
   */
  public static interface Func_string_from_style_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_style_indent(final Html.Type_style style, final Core.Type_int indent);
  }

  public static class Class_string_from_style_indent extends Core.Class_base implements Func_string_from_style_indent {

    @Override
    public Func_string_from_style_indent vx_new(Object... vals) {
      Class_string_from_style_indent output = new Class_string_from_style_indent();
      return output;
    }

    @Override
    public Func_string_from_style_indent vx_copy(Object... vals) {
      Class_string_from_style_indent output = new Class_string_from_style_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-style-indent", // name
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
    public Func_string_from_style_indent vx_empty() {return e_string_from_style_indent;}
    @Override
    public Func_string_from_style_indent vx_type() {return t_string_from_style_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_style style = Core.f_any_from_any(Html.t_style, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_style_indent(style, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_style_indent(final Html.Type_style style, final Core.Type_int indent) {
      return Html.f_string_from_style_indent(style, indent);
    }

  }

  public static final Func_string_from_style_indent e_string_from_style_indent = new Html.Class_string_from_style_indent();
  public static final Func_string_from_style_indent t_string_from_style_indent = new Html.Class_string_from_style_indent();

  public static Core.Type_string f_string_from_style_indent(final Html.Type_style style, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string name = style.name();
        final Html.Type_propmap propmap = style.props();
        final Core.Type_string stext = Html.f_string_from_stylepropmap_indent(
          propmap,
          Core.f_plus1(indent)
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            name,
            Core.vx_new_string(" {"),
            stext,
            sindent,
            Core.vx_new_string("}")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_stylelist_indent
   * Return a string from a stylelist
   * @param  {stylelist} stylelist
   * @param  {int} indent
   * @return {string}
   * (func string<-stylelist-indent)
   */
  public static interface Func_string_from_stylelist_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_stylelist_indent(final Html.Type_stylelist stylelist, final Core.Type_int indent);
  }

  public static class Class_string_from_stylelist_indent extends Core.Class_base implements Func_string_from_stylelist_indent {

    @Override
    public Func_string_from_stylelist_indent vx_new(Object... vals) {
      Class_string_from_stylelist_indent output = new Class_string_from_stylelist_indent();
      return output;
    }

    @Override
    public Func_string_from_stylelist_indent vx_copy(Object... vals) {
      Class_string_from_stylelist_indent output = new Class_string_from_stylelist_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-stylelist-indent", // name
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
    public Func_string_from_stylelist_indent vx_empty() {return e_string_from_stylelist_indent;}
    @Override
    public Func_string_from_stylelist_indent vx_type() {return t_string_from_stylelist_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_stylelist stylelist = Core.f_any_from_any(Html.t_stylelist, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_stylelist_indent(stylelist, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_stylelist_indent(final Html.Type_stylelist stylelist, final Core.Type_int indent) {
      return Html.f_string_from_stylelist_indent(stylelist, indent);
    }

  }

  public static final Func_string_from_stylelist_indent e_string_from_stylelist_indent = new Html.Class_string_from_stylelist_indent();
  public static final Func_string_from_stylelist_indent t_string_from_stylelist_indent = new Html.Class_string_from_stylelist_indent();

  public static Core.Type_string f_string_from_stylelist_indent(final Html.Type_stylelist stylelist, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringlist sstyles = Core.f_list_from_list(
          Core.t_stringlist,
          stylelist,
          Core.t_any_from_any.vx_fn_new((substyle_any) -> {
            Html.Type_style substyle = Core.f_any_from_any(Html.t_style, substyle_any);
            return 
                Html.f_string_from_style_indent(substyle, indent);
          })
        );
        return Type.f_string_from_stringlist_join(sstyles, Core.vx_new_string(""));
      })
    );
    return output;
  }

  /**
   * @function string_from_stylepropmap_indent
   * Returns indent'key: val;' for each prop.
   * @param  {propmap} propmap
   * @param  {int} indent
   * @return {string}
   * (func string<-stylepropmap-indent)
   */
  public static interface Func_string_from_stylepropmap_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_stylepropmap_indent(final Html.Type_propmap propmap, final Core.Type_int indent);
  }

  public static class Class_string_from_stylepropmap_indent extends Core.Class_base implements Func_string_from_stylepropmap_indent {

    @Override
    public Func_string_from_stylepropmap_indent vx_new(Object... vals) {
      Class_string_from_stylepropmap_indent output = new Class_string_from_stylepropmap_indent();
      return output;
    }

    @Override
    public Func_string_from_stylepropmap_indent vx_copy(Object... vals) {
      Class_string_from_stylepropmap_indent output = new Class_string_from_stylepropmap_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-stylepropmap-indent", // name
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
    public Func_string_from_stylepropmap_indent vx_empty() {return e_string_from_stylepropmap_indent;}
    @Override
    public Func_string_from_stylepropmap_indent vx_type() {return t_string_from_stylepropmap_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_propmap propmap = Core.f_any_from_any(Html.t_propmap, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_stylepropmap_indent(propmap, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_stylepropmap_indent(final Html.Type_propmap propmap, final Core.Type_int indent) {
      return Html.f_string_from_stylepropmap_indent(propmap, indent);
    }

  }

  public static final Func_string_from_stylepropmap_indent e_string_from_stylepropmap_indent = new Html.Class_string_from_stylepropmap_indent();
  public static final Func_string_from_stylepropmap_indent t_string_from_stylepropmap_indent = new Html.Class_string_from_stylepropmap_indent();

  public static Core.Type_string f_string_from_stylepropmap_indent(final Html.Type_propmap propmap, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_stringlist sprops = Core.f_list_from_map(
          Core.t_stringlist,
          propmap,
          Core.t_any_from_key_value.vx_fn_new((key_any, val_any) -> {
            Core.Type_string key = Core.f_any_from_any(Core.t_string, key_any);
            Core.Type_string val = Core.f_any_from_any(Core.t_string, val_any);
            return 
                Core.f_new(
                  Core.t_string,
                  Core.t_anylist.vx_new(
                    sindent,
                    key,
                    Core.vx_new_string(": "),
                    val,
                    Core.vx_new_string(";")
                  )
                );
          })
        );
        return Type.f_string_from_stringlist_join(sprops, Core.vx_new_string(""));
      })
    );
    return output;
  }

  /**
   * @function string_from_stylesheet_indent
   * Returns string representation of given stylesheet.
   * @param  {stylesheet} stylesheet
   * @param  {int} indent
   * @return {string}
   * (func string<-stylesheet-indent)
   */
  public static interface Func_string_from_stylesheet_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_stylesheet_indent(final Html.Type_stylesheet stylesheet, final Core.Type_int indent);
  }

  public static class Class_string_from_stylesheet_indent extends Core.Class_base implements Func_string_from_stylesheet_indent {

    @Override
    public Func_string_from_stylesheet_indent vx_new(Object... vals) {
      Class_string_from_stylesheet_indent output = new Class_string_from_stylesheet_indent();
      return output;
    }

    @Override
    public Func_string_from_stylesheet_indent vx_copy(Object... vals) {
      Class_string_from_stylesheet_indent output = new Class_string_from_stylesheet_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-stylesheet-indent", // name
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
    public Func_string_from_stylesheet_indent vx_empty() {return e_string_from_stylesheet_indent;}
    @Override
    public Func_string_from_stylesheet_indent vx_type() {return t_string_from_stylesheet_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_stylesheet stylesheet = Core.f_any_from_any(Html.t_stylesheet, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_stylesheet_indent(stylesheet, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_stylesheet_indent(final Html.Type_stylesheet stylesheet, final Core.Type_int indent) {
      return Html.f_string_from_stylesheet_indent(stylesheet, indent);
    }

  }

  public static final Func_string_from_stylesheet_indent e_string_from_stylesheet_indent = new Html.Class_string_from_stylesheet_indent();
  public static final Func_string_from_stylesheet_indent t_string_from_stylesheet_indent = new Html.Class_string_from_stylesheet_indent();

  public static Core.Type_string f_string_from_stylesheet_indent(final Html.Type_stylesheet stylesheet, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string text = Html.f_string_from_stylelist_indent(
          stylesheet.styles(),
          Core.f_plus1(indent)
        );
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string eindent = Core.f_if(
          Core.t_string,
          Core.f_notempty(text),
          sindent
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<style>"),
            text,
            eindent,
            Core.vx_new_string("</style>")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_table_indent
   * Returns string from table
   * @param  {table} table
   * @param  {int} indent
   * @return {string}
   * (func string<-table-indent)
   */
  public static interface Func_string_from_table_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_table_indent(final Html.Type_table table, final Core.Type_int indent);
  }

  public static class Class_string_from_table_indent extends Core.Class_base implements Func_string_from_table_indent {

    @Override
    public Func_string_from_table_indent vx_new(Object... vals) {
      Class_string_from_table_indent output = new Class_string_from_table_indent();
      return output;
    }

    @Override
    public Func_string_from_table_indent vx_copy(Object... vals) {
      Class_string_from_table_indent output = new Class_string_from_table_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-table-indent", // name
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
    public Func_string_from_table_indent vx_empty() {return e_string_from_table_indent;}
    @Override
    public Func_string_from_table_indent vx_type() {return t_string_from_table_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_table table = Core.f_any_from_any(Html.t_table, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_table_indent(table, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_table_indent(final Html.Type_table table, final Core.Type_int indent) {
      return Html.f_string_from_table_indent(table, indent);
    }

  }

  public static final Func_string_from_table_indent e_string_from_table_indent = new Html.Class_string_from_table_indent();
  public static final Func_string_from_table_indent t_string_from_table_indent = new Html.Class_string_from_table_indent();

  public static Core.Type_string f_string_from_table_indent(final Html.Type_table table, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string sid = Html.f_string_from_propname_val(
          Core.vx_new_string("id"),
          table.id()
        );
        final Html.Type_thead thead = table.thead();
        final Html.Type_tbody tbody = table.tbody();
        final Core.Type_string shead = Html.f_string_from_thead_indent(
          thead,
          Core.f_plus1(indent)
        );
        final Core.Type_string sbody = Html.f_string_from_tbody_indent(
          tbody,
          Core.f_plus1(indent)
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<table"),
            sid,
            Core.vx_new_string(">"),
            shead,
            sbody,
            sindent,
            Core.vx_new_string("</table>")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_tbody_indent
   * Returns string from tbody
   * @param  {tbody} tbody
   * @param  {int} indent
   * @return {string}
   * (func string<-tbody-indent)
   */
  public static interface Func_string_from_tbody_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_tbody_indent(final Html.Type_tbody tbody, final Core.Type_int indent);
  }

  public static class Class_string_from_tbody_indent extends Core.Class_base implements Func_string_from_tbody_indent {

    @Override
    public Func_string_from_tbody_indent vx_new(Object... vals) {
      Class_string_from_tbody_indent output = new Class_string_from_tbody_indent();
      return output;
    }

    @Override
    public Func_string_from_tbody_indent vx_copy(Object... vals) {
      Class_string_from_tbody_indent output = new Class_string_from_tbody_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-tbody-indent", // name
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
    public Func_string_from_tbody_indent vx_empty() {return e_string_from_tbody_indent;}
    @Override
    public Func_string_from_tbody_indent vx_type() {return t_string_from_tbody_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_tbody tbody = Core.f_any_from_any(Html.t_tbody, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_tbody_indent(tbody, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_tbody_indent(final Html.Type_tbody tbody, final Core.Type_int indent) {
      return Html.f_string_from_tbody_indent(tbody, indent);
    }

  }

  public static final Func_string_from_tbody_indent e_string_from_tbody_indent = new Html.Class_string_from_tbody_indent();
  public static final Func_string_from_tbody_indent t_string_from_tbody_indent = new Html.Class_string_from_tbody_indent();

  public static Core.Type_string f_string_from_tbody_indent(final Html.Type_tbody tbody, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Html.Type_trlist nodes = tbody.nodes();
        return Html.f_string_from_nodelist_tag_prop_indent(nodes, Core.vx_new_string("tbody"), Core.vx_new_string(""), indent);
      })
    );
    return output;
  }

  /**
   * @function string_from_td_indent
   * Returns string from td
   * @param  {td} td
   * @param  {int} indent
   * @return {string}
   * (func string<-td-indent)
   */
  public static interface Func_string_from_td_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_td_indent(final Html.Type_td td, final Core.Type_int indent);
  }

  public static class Class_string_from_td_indent extends Core.Class_base implements Func_string_from_td_indent {

    @Override
    public Func_string_from_td_indent vx_new(Object... vals) {
      Class_string_from_td_indent output = new Class_string_from_td_indent();
      return output;
    }

    @Override
    public Func_string_from_td_indent vx_copy(Object... vals) {
      Class_string_from_td_indent output = new Class_string_from_td_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-td-indent", // name
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
    public Func_string_from_td_indent vx_empty() {return e_string_from_td_indent;}
    @Override
    public Func_string_from_td_indent vx_type() {return t_string_from_td_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_td td = Core.f_any_from_any(Html.t_td, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_td_indent(td, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_td_indent(final Html.Type_td td, final Core.Type_int indent) {
      return Html.f_string_from_td_indent(td, indent);
    }

  }

  public static final Func_string_from_td_indent e_string_from_td_indent = new Html.Class_string_from_td_indent();
  public static final Func_string_from_td_indent t_string_from_td_indent = new Html.Class_string_from_td_indent();

  public static Core.Type_string f_string_from_td_indent(final Html.Type_td td, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Html.Type_divchildlist nodes = td.nodes();
        return Html.f_string_from_nodelist_tag_prop_indent(nodes, Core.vx_new_string("td"), Core.vx_new_string(""), indent);
      })
    );
    return output;
  }

  /**
   * @function string_from_thead_indent
   * Returns string from thead
   * @param  {thead} thead
   * @param  {int} indent
   * @return {string}
   * (func string<-thead-indent)
   */
  public static interface Func_string_from_thead_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_thead_indent(final Html.Type_thead thead, final Core.Type_int indent);
  }

  public static class Class_string_from_thead_indent extends Core.Class_base implements Func_string_from_thead_indent {

    @Override
    public Func_string_from_thead_indent vx_new(Object... vals) {
      Class_string_from_thead_indent output = new Class_string_from_thead_indent();
      return output;
    }

    @Override
    public Func_string_from_thead_indent vx_copy(Object... vals) {
      Class_string_from_thead_indent output = new Class_string_from_thead_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-thead-indent", // name
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
    public Func_string_from_thead_indent vx_empty() {return e_string_from_thead_indent;}
    @Override
    public Func_string_from_thead_indent vx_type() {return t_string_from_thead_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_thead thead = Core.f_any_from_any(Html.t_thead, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_thead_indent(thead, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_thead_indent(final Html.Type_thead thead, final Core.Type_int indent) {
      return Html.f_string_from_thead_indent(thead, indent);
    }

  }

  public static final Func_string_from_thead_indent e_string_from_thead_indent = new Html.Class_string_from_thead_indent();
  public static final Func_string_from_thead_indent t_string_from_thead_indent = new Html.Class_string_from_thead_indent();

  public static Core.Type_string f_string_from_thead_indent(final Html.Type_thead thead, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Html.Type_trlist nodes = thead.nodes();
        return Html.f_string_from_nodelist_tag_prop_indent(nodes, Core.vx_new_string("thead"), Core.vx_new_string(""), indent);
      })
    );
    return output;
  }

  /**
   * @function string_from_title_indent
   * Returns string from h2
   * @param  {title} title
   * @param  {int} indent
   * @return {string}
   * (func string<-title-indent)
   */
  public static interface Func_string_from_title_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_title_indent(final Html.Type_title title, final Core.Type_int indent);
  }

  public static class Class_string_from_title_indent extends Core.Class_base implements Func_string_from_title_indent {

    @Override
    public Func_string_from_title_indent vx_new(Object... vals) {
      Class_string_from_title_indent output = new Class_string_from_title_indent();
      return output;
    }

    @Override
    public Func_string_from_title_indent vx_copy(Object... vals) {
      Class_string_from_title_indent output = new Class_string_from_title_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-title-indent", // name
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
    public Func_string_from_title_indent vx_empty() {return e_string_from_title_indent;}
    @Override
    public Func_string_from_title_indent vx_type() {return t_string_from_title_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_title title = Core.f_any_from_any(Html.t_title, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_title_indent(title, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_title_indent(final Html.Type_title title, final Core.Type_int indent) {
      return Html.f_string_from_title_indent(title, indent);
    }

  }

  public static final Func_string_from_title_indent e_string_from_title_indent = new Html.Class_string_from_title_indent();
  public static final Func_string_from_title_indent t_string_from_title_indent = new Html.Class_string_from_title_indent();

  public static Core.Type_string f_string_from_title_indent(final Html.Type_title title, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string sindent = Html.f_string_from_indent(indent);
        final Core.Type_string text = title.text();
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            sindent,
            Core.vx_new_string("<title>"),
            text,
            Core.vx_new_string("</title>")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_from_tr_indent
   * Returns string from tr
   * @param  {tr} tr
   * @param  {int} indent
   * @return {string}
   * (func string<-tr-indent)
   */
  public static interface Func_string_from_tr_indent extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_string vx_string_from_tr_indent(final Html.Type_tr tr, final Core.Type_int indent);
  }

  public static class Class_string_from_tr_indent extends Core.Class_base implements Func_string_from_tr_indent {

    @Override
    public Func_string_from_tr_indent vx_new(Object... vals) {
      Class_string_from_tr_indent output = new Class_string_from_tr_indent();
      return output;
    }

    @Override
    public Func_string_from_tr_indent vx_copy(Object... vals) {
      Class_string_from_tr_indent output = new Class_string_from_tr_indent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-tr-indent", // name
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
    public Func_string_from_tr_indent vx_empty() {return e_string_from_tr_indent;}
    @Override
    public Func_string_from_tr_indent vx_type() {return t_string_from_tr_indent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_tr tr = Core.f_any_from_any(Html.t_tr, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int indent = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_string_from_tr_indent(tr, indent);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_tr_indent(final Html.Type_tr tr, final Core.Type_int indent) {
      return Html.f_string_from_tr_indent(tr, indent);
    }

  }

  public static final Func_string_from_tr_indent e_string_from_tr_indent = new Html.Class_string_from_tr_indent();
  public static final Func_string_from_tr_indent t_string_from_tr_indent = new Html.Class_string_from_tr_indent();

  public static Core.Type_string f_string_from_tr_indent(final Html.Type_tr tr, final Core.Type_int indent) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Html.Type_tdlist nodes = tr.nodes();
        return Html.f_string_from_nodelist_tag_prop_indent(nodes, Core.vx_new_string("tr"), Core.vx_new_string(""), indent);
      })
    );
    return output;
  }

  /**
   * @function string_from_uri
   * Decode a URI string
   * @param  {string} uri
   * @return {string}
   * (func string<-uri)
   */
  public static interface Func_string_from_uri extends Core.Func_any_from_any {
    public Core.Type_string vx_string_from_uri(final Core.Type_string uri);
  }

  public static class Class_string_from_uri extends Core.Class_base implements Func_string_from_uri {

    @Override
    public Func_string_from_uri vx_new(Object... vals) {
      Class_string_from_uri output = new Class_string_from_uri();
      return output;
    }

    @Override
    public Func_string_from_uri vx_copy(Object... vals) {
      Class_string_from_uri output = new Class_string_from_uri();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "string<-uri", // name
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
    public Func_string_from_uri vx_empty() {return e_string_from_uri;}
    @Override
    public Func_string_from_uri vx_type() {return t_string_from_uri;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Html.f_string_from_uri(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string uri = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_string_from_uri(uri);
      return output;
    }

    @Override
    public Core.Type_string vx_string_from_uri(final Core.Type_string uri) {
      return Html.f_string_from_uri(uri);
    }

  }

  public static final Func_string_from_uri e_string_from_uri = new Html.Class_string_from_uri();
  public static final Func_string_from_uri t_string_from_uri = new Html.Class_string_from_uri();

  public static Core.Type_string f_string_from_uri(final Core.Type_string uri) {
    Core.Type_string output = Core.e_string;
    return output;
  }

  /**
   * @function style_from_stylesheet_name
   * Return style from stylesheet.stylemap
   * @param  {stylesheet} stylesheet
   * @param  {string} name
   * @return {style}
   * (func style<-stylesheet-name)
   */
  public static interface Func_style_from_stylesheet_name extends Core.Type_func, Core.Type_replfunc {
    public Html.Type_style vx_style_from_stylesheet_name(final Html.Type_stylesheet stylesheet, final Core.Type_string name);
  }

  public static class Class_style_from_stylesheet_name extends Core.Class_base implements Func_style_from_stylesheet_name {

    @Override
    public Func_style_from_stylesheet_name vx_new(Object... vals) {
      Class_style_from_stylesheet_name output = new Class_style_from_stylesheet_name();
      return output;
    }

    @Override
    public Func_style_from_stylesheet_name vx_copy(Object... vals) {
      Class_style_from_stylesheet_name output = new Class_style_from_stylesheet_name();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "style<-stylesheet-name", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/web/html", // pkgname
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
        ) // typedef
      );
    }

    @Override
    public Func_style_from_stylesheet_name vx_empty() {return e_style_from_stylesheet_name;}
    @Override
    public Func_style_from_stylesheet_name vx_type() {return t_style_from_stylesheet_name;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_stylesheet stylesheet = Core.f_any_from_any(Html.t_stylesheet, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string name = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      output = Html.f_style_from_stylesheet_name(stylesheet, name);
      return output;
    }

    @Override
    public Html.Type_style vx_style_from_stylesheet_name(final Html.Type_stylesheet stylesheet, final Core.Type_string name) {
      return Html.f_style_from_stylesheet_name(stylesheet, name);
    }

  }

  public static final Func_style_from_stylesheet_name e_style_from_stylesheet_name = new Html.Class_style_from_stylesheet_name();
  public static final Func_style_from_stylesheet_name t_style_from_stylesheet_name = new Html.Class_style_from_stylesheet_name();

  public static Html.Type_style f_style_from_stylesheet_name(final Html.Type_stylesheet stylesheet, final Core.Type_string name) {
    Html.Type_style output = Html.e_style;
    output = Core.f_any_from_map(
      Html.t_style,
      Html.f_stylemap_from_stylesheet(stylesheet),
      name
    );
    return output;
  }

  /**
   * @function stylemap_from_stylelist
   * Returns a stylemap from a given stylelist
   * @param  {stylelist} stylelist
   * @return {stylemap}
   * (func stylemap<-stylelist)
   */
  public static interface Func_stylemap_from_stylelist extends Core.Func_any_from_any {
    public Html.Type_stylemap vx_stylemap_from_stylelist(final Html.Type_stylelist stylelist);
  }

  public static class Class_stylemap_from_stylelist extends Core.Class_base implements Func_stylemap_from_stylelist {

    @Override
    public Func_stylemap_from_stylelist vx_new(Object... vals) {
      Class_stylemap_from_stylelist output = new Class_stylemap_from_stylelist();
      return output;
    }

    @Override
    public Func_stylemap_from_stylelist vx_copy(Object... vals) {
      Class_stylemap_from_stylelist output = new Class_stylemap_from_stylelist();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "stylemap<-stylelist", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/web/html", // pkgname
          "stylemap", // name
          ":map", // extends
          Core.e_typelist, // traits
          Core.t_typelist.vx_new(Html.t_style), // allowtypes
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
    public Func_stylemap_from_stylelist vx_empty() {return e_stylemap_from_stylelist;}
    @Override
    public Func_stylemap_from_stylelist vx_type() {return t_stylemap_from_stylelist;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Html.Type_stylelist inputval = (Html.Type_stylelist)value;
      Core.Type_any outputval = Html.f_stylemap_from_stylelist(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_stylelist stylelist = Core.f_any_from_any(Html.t_stylelist, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_stylemap_from_stylelist(stylelist);
      return output;
    }

    @Override
    public Html.Type_stylemap vx_stylemap_from_stylelist(final Html.Type_stylelist stylelist) {
      return Html.f_stylemap_from_stylelist(stylelist);
    }

  }

  public static final Func_stylemap_from_stylelist e_stylemap_from_stylelist = new Html.Class_stylemap_from_stylelist();
  public static final Func_stylemap_from_stylelist t_stylemap_from_stylelist = new Html.Class_stylemap_from_stylelist();

  public static Html.Type_stylemap f_stylemap_from_stylelist(final Html.Type_stylelist stylelist) {
    Html.Type_stylemap output = Html.e_stylemap;
    output = Core.f_map_from_list(
      Html.t_stylemap,
      stylelist,
      Core.t_any_from_any.vx_fn_new((style_any) -> {
        Html.Type_style style = Core.f_any_from_any(Html.t_style, style_any);
        return 
          style.name();
      })
    );
    return output;
  }

  /**
   * @function stylemap_from_stylesheet
   * Return stylemap from stylesheet
   * @param  {stylesheet} stylesheet
   * @return {stylemap}
   * (func stylemap<-stylesheet)
   */
  public static interface Func_stylemap_from_stylesheet extends Core.Func_any_from_any {
    public Html.Type_stylemap vx_stylemap_from_stylesheet(final Html.Type_stylesheet stylesheet);
  }

  public static class Class_stylemap_from_stylesheet extends Core.Class_base implements Func_stylemap_from_stylesheet {

    @Override
    public Func_stylemap_from_stylesheet vx_new(Object... vals) {
      Class_stylemap_from_stylesheet output = new Class_stylemap_from_stylesheet();
      return output;
    }

    @Override
    public Func_stylemap_from_stylesheet vx_copy(Object... vals) {
      Class_stylemap_from_stylesheet output = new Class_stylemap_from_stylesheet();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "stylemap<-stylesheet", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/web/html", // pkgname
          "stylemap", // name
          ":map", // extends
          Core.e_typelist, // traits
          Core.t_typelist.vx_new(Html.t_style), // allowtypes
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
    public Func_stylemap_from_stylesheet vx_empty() {return e_stylemap_from_stylesheet;}
    @Override
    public Func_stylemap_from_stylesheet vx_type() {return t_stylemap_from_stylesheet;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Html.Type_stylesheet inputval = (Html.Type_stylesheet)value;
      Core.Type_any outputval = Html.f_stylemap_from_stylesheet(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_stylesheet stylesheet = Core.f_any_from_any(Html.t_stylesheet, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_stylemap_from_stylesheet(stylesheet);
      return output;
    }

    @Override
    public Html.Type_stylemap vx_stylemap_from_stylesheet(final Html.Type_stylesheet stylesheet) {
      return Html.f_stylemap_from_stylesheet(stylesheet);
    }

  }

  public static final Func_stylemap_from_stylesheet e_stylemap_from_stylesheet = new Html.Class_stylemap_from_stylesheet();
  public static final Func_stylemap_from_stylesheet t_stylemap_from_stylesheet = new Html.Class_stylemap_from_stylesheet();

  public static Html.Type_stylemap f_stylemap_from_stylesheet(final Html.Type_stylesheet stylesheet) {
    Html.Type_stylemap output = Html.e_stylemap;
    output = stylesheet.stylemap();
    return output;
  }

  /**
   * @function styles_from_stylesheet
   * Return style from stylesheet.stylemap
   * @param  {stylesheet} stylesheet
   * @return {stylelist}
   * (func styles<-stylesheet)
   */
  public static interface Func_styles_from_stylesheet extends Core.Func_any_from_any {
    public Html.Type_stylelist vx_styles_from_stylesheet(final Html.Type_stylesheet stylesheet);
  }

  public static class Class_styles_from_stylesheet extends Core.Class_base implements Func_styles_from_stylesheet {

    @Override
    public Func_styles_from_stylesheet vx_new(Object... vals) {
      Class_styles_from_stylesheet output = new Class_styles_from_stylesheet();
      return output;
    }

    @Override
    public Func_styles_from_stylesheet vx_copy(Object... vals) {
      Class_styles_from_stylesheet output = new Class_styles_from_stylesheet();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "styles<-stylesheet", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/web/html", // pkgname
          "stylelist", // name
          ":list", // extends
          Core.e_typelist, // traits
          Core.t_typelist.vx_new(Html.t_style), // allowtypes
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
    public Func_styles_from_stylesheet vx_empty() {return e_styles_from_stylesheet;}
    @Override
    public Func_styles_from_stylesheet vx_type() {return t_styles_from_stylesheet;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Html.Type_stylesheet inputval = (Html.Type_stylesheet)value;
      Core.Type_any outputval = Html.f_styles_from_stylesheet(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_stylesheet stylesheet = Core.f_any_from_any(Html.t_stylesheet, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_styles_from_stylesheet(stylesheet);
      return output;
    }

    @Override
    public Html.Type_stylelist vx_styles_from_stylesheet(final Html.Type_stylesheet stylesheet) {
      return Html.f_styles_from_stylesheet(stylesheet);
    }

  }

  public static final Func_styles_from_stylesheet e_styles_from_stylesheet = new Html.Class_styles_from_stylesheet();
  public static final Func_styles_from_stylesheet t_styles_from_stylesheet = new Html.Class_styles_from_stylesheet();

  public static Html.Type_stylelist f_styles_from_stylesheet(final Html.Type_stylesheet stylesheet) {
    Html.Type_stylelist output = Html.e_stylelist;
    output = stylesheet.styles();
    return output;
  }

  /**
   * @function stylesheet_loadmap
   * Decode a URI string
   * @param  {stylesheet} stylesheet
   * @return {stylesheet}
   * (func stylesheet-loadmap)
   */
  public static interface Func_stylesheet_loadmap extends Core.Func_any_from_any {
    public Html.Type_stylesheet vx_stylesheet_loadmap(final Html.Type_stylesheet stylesheet);
  }

  public static class Class_stylesheet_loadmap extends Core.Class_base implements Func_stylesheet_loadmap {

    @Override
    public Func_stylesheet_loadmap vx_new(Object... vals) {
      Class_stylesheet_loadmap output = new Class_stylesheet_loadmap();
      return output;
    }

    @Override
    public Func_stylesheet_loadmap vx_copy(Object... vals) {
      Class_stylesheet_loadmap output = new Class_stylesheet_loadmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "stylesheet-loadmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/web/html", // pkgname
          "stylesheet", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Html.t_node, Html.t_headchild), // traits
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
    public Func_stylesheet_loadmap vx_empty() {return e_stylesheet_loadmap;}
    @Override
    public Func_stylesheet_loadmap vx_type() {return t_stylesheet_loadmap;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Html.Type_stylesheet inputval = (Html.Type_stylesheet)value;
      Core.Type_any outputval = Html.f_stylesheet_loadmap(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Html.Type_stylesheet stylesheet = Core.f_any_from_any(Html.t_stylesheet, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_stylesheet_loadmap(stylesheet);
      return output;
    }

    @Override
    public Html.Type_stylesheet vx_stylesheet_loadmap(final Html.Type_stylesheet stylesheet) {
      return Html.f_stylesheet_loadmap(stylesheet);
    }

  }

  public static final Func_stylesheet_loadmap e_stylesheet_loadmap = new Html.Class_stylesheet_loadmap();
  public static final Func_stylesheet_loadmap t_stylesheet_loadmap = new Html.Class_stylesheet_loadmap();

  public static Html.Type_stylesheet f_stylesheet_loadmap(final Html.Type_stylesheet stylesheet) {
    Html.Type_stylesheet output = Html.e_stylesheet;
    output = Core.f_copy(
      stylesheet,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":stylemap"),
        Html.f_stylemap_from_stylelist(
          stylesheet.styles()
        )
      )
    );
    return output;
  }

  /**
   * @function uri_from_string
   * Encode a URI string
   * @param  {string} text
   * @return {string}
   * (func uri<-string)
   */
  public static interface Func_uri_from_string extends Core.Func_any_from_any {
    public Core.Type_string vx_uri_from_string(final Core.Type_string text);
  }

  public static class Class_uri_from_string extends Core.Class_base implements Func_uri_from_string {

    @Override
    public Func_uri_from_string vx_new(Object... vals) {
      Class_uri_from_string output = new Class_uri_from_string();
      return output;
    }

    @Override
    public Func_uri_from_string vx_copy(Object... vals) {
      Class_uri_from_string output = new Class_uri_from_string();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "vx/web/html", // pkgname
        "uri<-string", // name
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
    public Func_uri_from_string vx_empty() {return e_uri_from_string;}
    @Override
    public Func_uri_from_string vx_type() {return t_uri_from_string;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Html.f_uri_from_string(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string text = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Html.f_uri_from_string(text);
      return output;
    }

    @Override
    public Core.Type_string vx_uri_from_string(final Core.Type_string text) {
      return Html.f_uri_from_string(text);
    }

  }

  public static final Func_uri_from_string e_uri_from_string = new Html.Class_uri_from_string();
  public static final Func_uri_from_string t_uri_from_string = new Html.Class_uri_from_string();

  public static Core.Type_string f_uri_from_string(final Core.Type_string text) {
    Core.Type_string output = Core.e_string;
    return output;
  }


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    maptype.put("body", Html.t_body);
    maptype.put("details", Html.t_details);
    maptype.put("div", Html.t_div);
    maptype.put("divchild", Html.t_divchild);
    maptype.put("divchildlist", Html.t_divchildlist);
    maptype.put("divlist", Html.t_divlist);
    maptype.put("footer", Html.t_footer);
    maptype.put("h1", Html.t_h1);
    maptype.put("h2", Html.t_h2);
    maptype.put("h3", Html.t_h3);
    maptype.put("head", Html.t_head);
    maptype.put("headchild", Html.t_headchild);
    maptype.put("headchildlist", Html.t_headchildlist);
    maptype.put("html", Html.t_html);
    maptype.put("meta", Html.t_meta);
    maptype.put("node", Html.t_node);
    maptype.put("nodelist", Html.t_nodelist);
    maptype.put("p", Html.t_p);
    maptype.put("propmap", Html.t_propmap);
    maptype.put("style", Html.t_style);
    maptype.put("stylelist", Html.t_stylelist);
    maptype.put("stylemap", Html.t_stylemap);
    maptype.put("stylesheet", Html.t_stylesheet);
    maptype.put("table", Html.t_table);
    maptype.put("tbody", Html.t_tbody);
    maptype.put("td", Html.t_td);
    maptype.put("tdlist", Html.t_tdlist);
    maptype.put("thead", Html.t_thead);
    maptype.put("title", Html.t_title);
    maptype.put("tr", Html.t_tr);
    maptype.put("trlist", Html.t_trlist);
    mapfunc.put("htmlstring<-string", Html.t_htmlstring_from_string);
    mapfunc.put("string-indent", Html.t_string_indent);
    mapfunc.put("string<-body-indent", Html.t_string_from_body_indent);
    mapfunc.put("string<-details-indent", Html.t_string_from_details_indent);
    mapfunc.put("string<-div-indent", Html.t_string_from_div_indent);
    mapfunc.put("string<-footer-indent", Html.t_string_from_footer_indent);
    mapfunc.put("string<-h1-indent", Html.t_string_from_h1_indent);
    mapfunc.put("string<-h2-indent", Html.t_string_from_h2_indent);
    mapfunc.put("string<-h3-indent", Html.t_string_from_h3_indent);
    mapfunc.put("string<-head-indent", Html.t_string_from_head_indent);
    mapfunc.put("string<-html", Html.t_string_from_html);
    mapfunc.put("string<-indent", Html.t_string_from_indent);
    mapfunc.put("string<-meta-indent", Html.t_string_from_meta_indent);
    mapfunc.put("string<-node-indent", Html.t_string_from_node_indent);
    mapfunc.put("string<-nodelist-indent", Html.t_string_from_nodelist_indent);
    mapfunc.put("string<-nodelist-tag-prop-indent", Html.t_string_from_nodelist_tag_prop_indent);
    mapfunc.put("string<-p-indent", Html.t_string_from_p_indent);
    mapfunc.put("string<-propname-val", Html.t_string_from_propname_val);
    mapfunc.put("string<-propstyle", Html.t_string_from_propstyle);
    mapfunc.put("string<-style-indent", Html.t_string_from_style_indent);
    mapfunc.put("string<-stylelist-indent", Html.t_string_from_stylelist_indent);
    mapfunc.put("string<-stylepropmap-indent", Html.t_string_from_stylepropmap_indent);
    mapfunc.put("string<-stylesheet-indent", Html.t_string_from_stylesheet_indent);
    mapfunc.put("string<-table-indent", Html.t_string_from_table_indent);
    mapfunc.put("string<-tbody-indent", Html.t_string_from_tbody_indent);
    mapfunc.put("string<-td-indent", Html.t_string_from_td_indent);
    mapfunc.put("string<-thead-indent", Html.t_string_from_thead_indent);
    mapfunc.put("string<-title-indent", Html.t_string_from_title_indent);
    mapfunc.put("string<-tr-indent", Html.t_string_from_tr_indent);
    mapfunc.put("string<-uri", Html.t_string_from_uri);
    mapfunc.put("style<-stylesheet-name", Html.t_style_from_stylesheet_name);
    mapfunc.put("stylemap<-stylelist", Html.t_stylemap_from_stylelist);
    mapfunc.put("stylemap<-stylesheet", Html.t_stylemap_from_stylesheet);
    mapfunc.put("styles<-stylesheet", Html.t_styles_from_stylesheet);
    mapfunc.put("stylesheet-loadmap", Html.t_stylesheet_loadmap);
    mapfunc.put("uri<-string", Html.t_uri_from_string);
    Core.vx_global_package_set("vx/web/html", maptype, mapconst, mapfunc);
  }

}
