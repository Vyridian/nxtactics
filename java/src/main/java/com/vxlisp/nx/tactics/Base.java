package com.vxlisp.nx.tactics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.vxlisp.vx.*;

public final class Base {


  /**
   * type: ability
   * (type ability)
   */
  public interface Type_ability extends Core.Type_struct, Base.Type_card {
    public Base.Type_ability vx_new(final Object... vals);
    public Base.Type_ability vx_copy(final Object... vals);
    public Base.Type_ability vx_empty();
    public Base.Type_ability vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_ability extends Core.Class_base implements Type_ability {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_ability vx_new(final Object... vals) {return e_ability.vx_copy(vals);}

    @Override
    public Type_ability vx_copy(final Object... vals) {
      Type_ability output = this;
      boolean ischanged = false;
      Class_ability val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/ability", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/ability", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/ability", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/ability", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/ability", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/ability", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/ability", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/ability", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/ability", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_ability work = new Class_ability();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_ability vx_empty() {return e_ability;}
    @Override
    public Type_ability vx_type() {return t_ability;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "ability", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_ability e_ability = new Class_ability();
  public static final Type_ability t_ability = new Class_ability();

  /**
   * type: abilitymap
   * (type abilitymap)
   */
  public interface Type_abilitymap extends Core.Type_map {
    public Base.Type_abilitymap vx_new(final Object... vals);
    public Base.Type_abilitymap vx_copy(final Object... vals);
    public Base.Type_abilitymap vx_empty();
    public Base.Type_abilitymap vx_type();
    public Map<String, Base.Type_ability> vx_mapability();
    public Base.Type_ability vx_ability(final Core.Type_string key);
  }

  public static class Class_abilitymap extends Core.Class_base implements Type_abilitymap {

    protected Map<String, Base.Type_ability> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_ability>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_ability vx_ability(final Core.Type_string key) {
      Base.Type_ability output = Base.e_ability;
      Class_abilitymap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_ability> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_ability);
      return output;
    }

    @Override
    public Map<String, Base.Type_ability> vx_mapability() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_ability(key);
    }

    @Override
    public Type_abilitymap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_abilitymap output = new Class_abilitymap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_ability> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_ability) {
          Base.Type_ability castval = (Base.Type_ability)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/abilitymap", ":invalidvalue", val);
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
    public Type_abilitymap vx_new(final Object... vals) {return e_abilitymap.vx_copy(vals);}

    @Override
    public Type_abilitymap vx_copy(final Object... vals) {
      Type_abilitymap output = this;
      boolean ischanged = false;
      Class_abilitymap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_ability> mapval = new LinkedHashMap<>(val.vx_mapability());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/abilitymap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_ability valany = null;
          if (valsub instanceof Base.Type_ability) {
            valany = (Base.Type_ability)valsub;
          } else if (valsub instanceof Base.Type_ability) {
            valany = (Base.Type_ability)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/abilitymap", ":invalidkeyvalue", msgmap);
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
        Class_abilitymap work = new Class_abilitymap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_abilitymap vx_empty() {return e_abilitymap;}
    @Override
    public Type_abilitymap vx_type() {return t_abilitymap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "abilitymap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_ability), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_abilitymap e_abilitymap = new Class_abilitymap();
  public static final Type_abilitymap t_abilitymap = new Class_abilitymap();

  /**
   * type: book
   * (type book)
   */
  public interface Type_book extends Core.Type_struct, Base.Type_card {
    public Base.Type_book vx_new(final Object... vals);
    public Base.Type_book vx_copy(final Object... vals);
    public Base.Type_book vx_empty();
    public Base.Type_book vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Base.Type_chaptermap chaptermap();
  }

  public static class Class_book extends Core.Class_base implements Type_book {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Base.Type_chaptermap vx_p_chaptermap;

    @Override
    public Base.Type_chaptermap chaptermap() {
      return this.vx_p_chaptermap == null ? Base.e_chaptermap : this.vx_p_chaptermap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":chaptermap":
        output = this.chaptermap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":chaptermap", this.chaptermap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_book vx_new(final Object... vals) {return e_book.vx_copy(vals);}

    @Override
    public Type_book vx_copy(final Object... vals) {
      Type_book output = this;
      boolean ischanged = false;
      Class_book val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Base.Type_chaptermap vx_p_chaptermap = val.chaptermap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":chaptermap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":chaptermap":
            if (valsub == vx_p_chaptermap) {
            } else if (valsub instanceof Base.Type_chaptermap) {
              ischanged = true;
              vx_p_chaptermap = (Base.Type_chaptermap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("chaptermap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/book", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_book work = new Class_book();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_chaptermap = vx_p_chaptermap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_book vx_empty() {return e_book;}
    @Override
    public Type_book vx_type() {return t_book;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "book", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_book e_book = new Class_book();
  public static final Type_book t_book = new Class_book();

  /**
   * type: bookmap
   * (type bookmap)
   */
  public interface Type_bookmap extends Core.Type_map {
    public Base.Type_bookmap vx_new(final Object... vals);
    public Base.Type_bookmap vx_copy(final Object... vals);
    public Base.Type_bookmap vx_empty();
    public Base.Type_bookmap vx_type();
    public Map<String, Base.Type_book> vx_mapbook();
    public Base.Type_book vx_book(final Core.Type_string key);
  }

  public static class Class_bookmap extends Core.Class_base implements Type_bookmap {

    protected Map<String, Base.Type_book> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_book>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_book vx_book(final Core.Type_string key) {
      Base.Type_book output = Base.e_book;
      Class_bookmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_book> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_book);
      return output;
    }

    @Override
    public Map<String, Base.Type_book> vx_mapbook() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_book(key);
    }

    @Override
    public Type_bookmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_bookmap output = new Class_bookmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_book> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_book) {
          Base.Type_book castval = (Base.Type_book)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/bookmap", ":invalidvalue", val);
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
    public Type_bookmap vx_new(final Object... vals) {return e_bookmap.vx_copy(vals);}

    @Override
    public Type_bookmap vx_copy(final Object... vals) {
      Type_bookmap output = this;
      boolean ischanged = false;
      Class_bookmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_book> mapval = new LinkedHashMap<>(val.vx_mapbook());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/bookmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_book valany = null;
          if (valsub instanceof Base.Type_book) {
            valany = (Base.Type_book)valsub;
          } else if (valsub instanceof Base.Type_book) {
            valany = (Base.Type_book)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/bookmap", ":invalidkeyvalue", msgmap);
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
        Class_bookmap work = new Class_bookmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_bookmap vx_empty() {return e_bookmap;}
    @Override
    public Type_bookmap vx_type() {return t_bookmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "bookmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_book), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_bookmap e_bookmap = new Class_bookmap();
  public static final Type_bookmap t_bookmap = new Class_bookmap();

  /**
   * type: card
   * (type card)
   */
  public interface Type_card extends Core.Type_struct {
    public Base.Type_card vx_new(final Object... vals);
    public Base.Type_card vx_copy(final Object... vals);
    public Base.Type_card vx_empty();
    public Base.Type_card vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_card extends Core.Class_base implements Type_card {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_card vx_new(final Object... vals) {return e_card.vx_copy(vals);}

    @Override
    public Type_card vx_copy(final Object... vals) {
      Type_card output = this;
      boolean ischanged = false;
      Class_card val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/card", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/card", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/card", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/card", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/card", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/card", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/card", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/card", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/card", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_card work = new Class_card();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_card vx_empty() {return e_card;}
    @Override
    public Type_card vx_type() {return t_card;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "card", // name
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

  public static final Type_card e_card = new Class_card();
  public static final Type_card t_card = new Class_card();

  /**
   * type: cardlist
   * (type cardlist)
   */
  public interface Type_cardlist extends Core.Type_list {
    public Base.Type_cardlist vx_new(final Object... vals);
    public Base.Type_cardlist vx_copy(final Object... vals);
    public Base.Type_cardlist vx_empty();
    public Base.Type_cardlist vx_type();
    public List<Base.Type_card> vx_listcard();
    public Base.Type_card vx_card(final Core.Type_int index);
  }

  public static class Class_cardlist extends Core.Class_base implements Type_cardlist {

    protected List<Base.Type_card> vx_p_list = Core.immutablelist(new ArrayList<Base.Type_card>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Base.Type_card vx_card(final Core.Type_int index) {
      Base.Type_card output = Base.e_card;
      Class_cardlist list = this;
      int iindex = index.vx_int();
      List<Base.Type_card> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Base.Type_card> vx_listcard() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_card(index);
    }

    @Override
    public Type_cardlist vx_new(final Object... vals) {return e_cardlist.vx_copy(vals);}

    @Override
    public Type_cardlist vx_copy(final Object... vals) {
      Type_cardlist output = this;
      boolean ischanged = false;
      Class_cardlist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Base.Type_card> listval = new ArrayList<>(val.vx_listcard());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Base.Type_card) {
          ischanged = true;
          listval.add((Base.Type_card)valsub);
        } else if (valsub instanceof Base.Type_card) {
          ischanged = true;
          listval.add((Base.Type_card)valsub);
        } else if (valsub instanceof Type_cardlist) {
          Type_cardlist multi = (Type_cardlist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listcard());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Base.Type_card) {
              Base.Type_card valitem = (Base.Type_card)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("nx/tactics/base/cardlist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("nx/tactics/base/cardlist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_cardlist work = new Class_cardlist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_cardlist vx_empty() {return e_cardlist;}
    @Override
    public Type_cardlist vx_type() {return t_cardlist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "cardlist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_card), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_cardlist e_cardlist = new Class_cardlist();
  public static final Type_cardlist t_cardlist = new Class_cardlist();

  /**
   * type: cardmap
   * (type cardmap)
   */
  public interface Type_cardmap extends Core.Type_map {
    public Base.Type_cardmap vx_new(final Object... vals);
    public Base.Type_cardmap vx_copy(final Object... vals);
    public Base.Type_cardmap vx_empty();
    public Base.Type_cardmap vx_type();
    public Map<String, Base.Type_card> vx_mapcard();
    public Base.Type_card vx_card(final Core.Type_string key);
  }

  public static class Class_cardmap extends Core.Class_base implements Type_cardmap {

    protected Map<String, Base.Type_card> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_card>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_card vx_card(final Core.Type_string key) {
      Base.Type_card output = Base.e_card;
      Class_cardmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_card> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_card);
      return output;
    }

    @Override
    public Map<String, Base.Type_card> vx_mapcard() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_card(key);
    }

    @Override
    public Type_cardmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_cardmap output = new Class_cardmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_card> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_card) {
          Base.Type_card castval = (Base.Type_card)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/cardmap", ":invalidvalue", val);
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
    public Type_cardmap vx_new(final Object... vals) {return e_cardmap.vx_copy(vals);}

    @Override
    public Type_cardmap vx_copy(final Object... vals) {
      Type_cardmap output = this;
      boolean ischanged = false;
      Class_cardmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_card> mapval = new LinkedHashMap<>(val.vx_mapcard());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/cardmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_card valany = null;
          if (valsub instanceof Base.Type_card) {
            valany = (Base.Type_card)valsub;
          } else if (valsub instanceof Base.Type_card) {
            valany = (Base.Type_card)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/cardmap", ":invalidkeyvalue", msgmap);
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
        Class_cardmap work = new Class_cardmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_cardmap vx_empty() {return e_cardmap;}
    @Override
    public Type_cardmap vx_type() {return t_cardmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "cardmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_card), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_cardmap e_cardmap = new Class_cardmap();
  public static final Type_cardmap t_cardmap = new Class_cardmap();

  /**
   * type: chapter
   * (type chapter)
   */
  public interface Type_chapter extends Core.Type_struct, Base.Type_card {
    public Base.Type_chapter vx_new(final Object... vals);
    public Base.Type_chapter vx_copy(final Object... vals);
    public Base.Type_chapter vx_empty();
    public Base.Type_chapter vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Base.Type_sectionmap sectionmap();
  }

  public static class Class_chapter extends Core.Class_base implements Type_chapter {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Base.Type_sectionmap vx_p_sectionmap;

    @Override
    public Base.Type_sectionmap sectionmap() {
      return this.vx_p_sectionmap == null ? Base.e_sectionmap : this.vx_p_sectionmap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":sectionmap":
        output = this.sectionmap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":sectionmap", this.sectionmap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_chapter vx_new(final Object... vals) {return e_chapter.vx_copy(vals);}

    @Override
    public Type_chapter vx_copy(final Object... vals) {
      Type_chapter output = this;
      boolean ischanged = false;
      Class_chapter val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Base.Type_sectionmap vx_p_sectionmap = val.sectionmap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":sectionmap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":sectionmap":
            if (valsub == vx_p_sectionmap) {
            } else if (valsub instanceof Base.Type_sectionmap) {
              ischanged = true;
              vx_p_sectionmap = (Base.Type_sectionmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("sectionmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/chapter", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_chapter work = new Class_chapter();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_sectionmap = vx_p_sectionmap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_chapter vx_empty() {return e_chapter;}
    @Override
    public Type_chapter vx_type() {return t_chapter;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "chapter", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_chapter e_chapter = new Class_chapter();
  public static final Type_chapter t_chapter = new Class_chapter();

  /**
   * type: chapterlist
   * (type chapterlist)
   */
  public interface Type_chapterlist extends Core.Type_list {
    public Base.Type_chapterlist vx_new(final Object... vals);
    public Base.Type_chapterlist vx_copy(final Object... vals);
    public Base.Type_chapterlist vx_empty();
    public Base.Type_chapterlist vx_type();
    public List<Base.Type_chapter> vx_listchapter();
    public Base.Type_chapter vx_chapter(final Core.Type_int index);
  }

  public static class Class_chapterlist extends Core.Class_base implements Type_chapterlist {

    protected List<Base.Type_chapter> vx_p_list = Core.immutablelist(new ArrayList<Base.Type_chapter>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Base.Type_chapter vx_chapter(final Core.Type_int index) {
      Base.Type_chapter output = Base.e_chapter;
      Class_chapterlist list = this;
      int iindex = index.vx_int();
      List<Base.Type_chapter> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Base.Type_chapter> vx_listchapter() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_chapter(index);
    }

    @Override
    public Type_chapterlist vx_new(final Object... vals) {return e_chapterlist.vx_copy(vals);}

    @Override
    public Type_chapterlist vx_copy(final Object... vals) {
      Type_chapterlist output = this;
      boolean ischanged = false;
      Class_chapterlist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Base.Type_chapter> listval = new ArrayList<>(val.vx_listchapter());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Base.Type_chapter) {
          ischanged = true;
          listval.add((Base.Type_chapter)valsub);
        } else if (valsub instanceof Base.Type_chapter) {
          ischanged = true;
          listval.add((Base.Type_chapter)valsub);
        } else if (valsub instanceof Type_chapterlist) {
          Type_chapterlist multi = (Type_chapterlist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listchapter());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Base.Type_chapter) {
              Base.Type_chapter valitem = (Base.Type_chapter)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("nx/tactics/base/chapterlist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("nx/tactics/base/chapterlist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_chapterlist work = new Class_chapterlist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_chapterlist vx_empty() {return e_chapterlist;}
    @Override
    public Type_chapterlist vx_type() {return t_chapterlist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "chapterlist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_chapter), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_chapterlist e_chapterlist = new Class_chapterlist();
  public static final Type_chapterlist t_chapterlist = new Class_chapterlist();

  /**
   * type: chaptermap
   * (type chaptermap)
   */
  public interface Type_chaptermap extends Core.Type_map {
    public Base.Type_chaptermap vx_new(final Object... vals);
    public Base.Type_chaptermap vx_copy(final Object... vals);
    public Base.Type_chaptermap vx_empty();
    public Base.Type_chaptermap vx_type();
    public Map<String, Base.Type_chapter> vx_mapchapter();
    public Base.Type_chapter vx_chapter(final Core.Type_string key);
  }

  public static class Class_chaptermap extends Core.Class_base implements Type_chaptermap {

    protected Map<String, Base.Type_chapter> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_chapter>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_chapter vx_chapter(final Core.Type_string key) {
      Base.Type_chapter output = Base.e_chapter;
      Class_chaptermap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_chapter> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_chapter);
      return output;
    }

    @Override
    public Map<String, Base.Type_chapter> vx_mapchapter() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_chapter(key);
    }

    @Override
    public Type_chaptermap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_chaptermap output = new Class_chaptermap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_chapter> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_chapter) {
          Base.Type_chapter castval = (Base.Type_chapter)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/chaptermap", ":invalidvalue", val);
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
    public Type_chaptermap vx_new(final Object... vals) {return e_chaptermap.vx_copy(vals);}

    @Override
    public Type_chaptermap vx_copy(final Object... vals) {
      Type_chaptermap output = this;
      boolean ischanged = false;
      Class_chaptermap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_chapter> mapval = new LinkedHashMap<>(val.vx_mapchapter());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/chaptermap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_chapter valany = null;
          if (valsub instanceof Base.Type_chapter) {
            valany = (Base.Type_chapter)valsub;
          } else if (valsub instanceof Base.Type_chapter) {
            valany = (Base.Type_chapter)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/chaptermap", ":invalidkeyvalue", msgmap);
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
        Class_chaptermap work = new Class_chaptermap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_chaptermap vx_empty() {return e_chaptermap;}
    @Override
    public Type_chaptermap vx_type() {return t_chaptermap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "chaptermap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_chapter), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_chaptermap e_chaptermap = new Class_chaptermap();
  public static final Type_chaptermap t_chaptermap = new Class_chaptermap();

  /**
   * type: damage
   * (type damage)
   */
  public interface Type_damage extends Core.Type_struct, Base.Type_card {
    public Base.Type_damage vx_new(final Object... vals);
    public Base.Type_damage vx_copy(final Object... vals);
    public Base.Type_damage vx_empty();
    public Base.Type_damage vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_damage extends Core.Class_base implements Type_damage {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_damage vx_new(final Object... vals) {return e_damage.vx_copy(vals);}

    @Override
    public Type_damage vx_copy(final Object... vals) {
      Type_damage output = this;
      boolean ischanged = false;
      Class_damage val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/damage", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/damage", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/damage", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/damage", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/damage", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/damage", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/damage", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/damage", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/damage", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_damage work = new Class_damage();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_damage vx_empty() {return e_damage;}
    @Override
    public Type_damage vx_type() {return t_damage;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "damage", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_damage e_damage = new Class_damage();
  public static final Type_damage t_damage = new Class_damage();

  /**
   * type: damagelist
   * (type damagelist)
   */
  public interface Type_damagelist extends Core.Type_list {
    public Base.Type_damagelist vx_new(final Object... vals);
    public Base.Type_damagelist vx_copy(final Object... vals);
    public Base.Type_damagelist vx_empty();
    public Base.Type_damagelist vx_type();
    public List<Base.Type_damage> vx_listdamage();
    public Base.Type_damage vx_damage(final Core.Type_int index);
  }

  public static class Class_damagelist extends Core.Class_base implements Type_damagelist {

    protected List<Base.Type_damage> vx_p_list = Core.immutablelist(new ArrayList<Base.Type_damage>());

    @Override
    public List<Core.Type_any> vx_list() {return Core.immutablelist(new ArrayList<Core.Type_any>(this.vx_p_list));}

    @Override
    public Base.Type_damage vx_damage(final Core.Type_int index) {
      Base.Type_damage output = Base.e_damage;
      Class_damagelist list = this;
      int iindex = index.vx_int();
      List<Base.Type_damage> listval = list.vx_p_list;
      if (iindex < listval.size()) {
        output = listval.get(iindex);
      }
      return output;
    }

    @Override
    public List<Base.Type_damage> vx_listdamage() {return vx_p_list;}

    @Override
    public Core.Type_any vx_any(final Core.Type_int index) {
      return this.vx_damage(index);
    }

    @Override
    public Type_damagelist vx_new(final Object... vals) {return e_damagelist.vx_copy(vals);}

    @Override
    public Type_damagelist vx_copy(final Object... vals) {
      Type_damagelist output = this;
      boolean ischanged = false;
      Class_damagelist val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      List<Base.Type_damage> listval = new ArrayList<>(val.vx_listdamage());
      Core.Type_msg msg;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = msgblock.vx_copy(valsub);
        } else if (valsub instanceof Base.Type_damage) {
          ischanged = true;
          listval.add((Base.Type_damage)valsub);
        } else if (valsub instanceof Base.Type_damage) {
          ischanged = true;
          listval.add((Base.Type_damage)valsub);
        } else if (valsub instanceof Type_damagelist) {
          Type_damagelist multi = (Type_damagelist)valsub;
          ischanged = true;
          listval.addAll(multi.vx_listdamage());
        } else if (valsub instanceof List) {
          List<?> listunknown = (List<?>)valsub;
          for (Object item : listunknown) {
            if (item instanceof Base.Type_damage) {
              Base.Type_damage valitem = (Base.Type_damage)item;
              ischanged = true;
              listval.add(valitem);
            }
          }
        } else if (valsub instanceof Core.Type_any) {
          Core.Type_any anysub = (Core.Type_any)valsub;
          msg = Core.vx_msg_from_error("nx/tactics/base/damagelist", ":invalidtype", anysub);
          msgblock = msgblock.vx_copy(msg);
        } else {
          msg = Core.vx_msg_from_error("nx/tactics/base/damagelist", ":invalidtype", Core.vx_new_string(valsub.toString()));
          msgblock = msgblock.vx_copy(msg);
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_damagelist work = new Class_damagelist();
        work.vx_p_list = Core.immutablelist(listval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_damagelist vx_empty() {return e_damagelist;}
    @Override
    public Type_damagelist vx_type() {return t_damagelist;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "damagelist", // name
        ":list", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_damage), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_damagelist e_damagelist = new Class_damagelist();
  public static final Type_damagelist t_damagelist = new Class_damagelist();

  /**
   * type: damagemap
   * (type damagemap)
   */
  public interface Type_damagemap extends Core.Type_map {
    public Base.Type_damagemap vx_new(final Object... vals);
    public Base.Type_damagemap vx_copy(final Object... vals);
    public Base.Type_damagemap vx_empty();
    public Base.Type_damagemap vx_type();
    public Map<String, Base.Type_damage> vx_mapdamage();
    public Base.Type_damage vx_damage(final Core.Type_string key);
  }

  public static class Class_damagemap extends Core.Class_base implements Type_damagemap {

    protected Map<String, Base.Type_damage> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_damage>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_damage vx_damage(final Core.Type_string key) {
      Base.Type_damage output = Base.e_damage;
      Class_damagemap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_damage> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_damage);
      return output;
    }

    @Override
    public Map<String, Base.Type_damage> vx_mapdamage() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_damage(key);
    }

    @Override
    public Type_damagemap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_damagemap output = new Class_damagemap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_damage> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_damage) {
          Base.Type_damage castval = (Base.Type_damage)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/damagemap", ":invalidvalue", val);
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
    public Type_damagemap vx_new(final Object... vals) {return e_damagemap.vx_copy(vals);}

    @Override
    public Type_damagemap vx_copy(final Object... vals) {
      Type_damagemap output = this;
      boolean ischanged = false;
      Class_damagemap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_damage> mapval = new LinkedHashMap<>(val.vx_mapdamage());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/damagemap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_damage valany = null;
          if (valsub instanceof Base.Type_damage) {
            valany = (Base.Type_damage)valsub;
          } else if (valsub instanceof Base.Type_damage) {
            valany = (Base.Type_damage)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/damagemap", ":invalidkeyvalue", msgmap);
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
        Class_damagemap work = new Class_damagemap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_damagemap vx_empty() {return e_damagemap;}
    @Override
    public Type_damagemap vx_type() {return t_damagemap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "damagemap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_damage), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_damagemap e_damagemap = new Class_damagemap();
  public static final Type_damagemap t_damagemap = new Class_damagemap();

  /**
   * type: deck
   * (type deck)
   */
  public interface Type_deck extends Core.Type_struct, Base.Type_card {
    public Base.Type_deck vx_new(final Object... vals);
    public Base.Type_deck vx_copy(final Object... vals);
    public Base.Type_deck vx_empty();
    public Base.Type_deck vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Base.Type_cardmap cardmap();
  }

  public static class Class_deck extends Core.Class_base implements Type_deck {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Base.Type_cardmap vx_p_cardmap;

    @Override
    public Base.Type_cardmap cardmap() {
      return this.vx_p_cardmap == null ? Base.e_cardmap : this.vx_p_cardmap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":cardmap":
        output = this.cardmap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":cardmap", this.cardmap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_deck vx_new(final Object... vals) {return e_deck.vx_copy(vals);}

    @Override
    public Type_deck vx_copy(final Object... vals) {
      Type_deck output = this;
      boolean ischanged = false;
      Class_deck val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Base.Type_cardmap vx_p_cardmap = val.cardmap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":cardmap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":cardmap":
            if (valsub == vx_p_cardmap) {
            } else if (valsub instanceof Base.Type_cardmap) {
              ischanged = true;
              vx_p_cardmap = (Base.Type_cardmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("cardmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/deck", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_deck work = new Class_deck();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_cardmap = vx_p_cardmap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_deck vx_empty() {return e_deck;}
    @Override
    public Type_deck vx_type() {return t_deck;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "deck", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_deck e_deck = new Class_deck();
  public static final Type_deck t_deck = new Class_deck();

  /**
   * type: deckmap
   * (type deckmap)
   */
  public interface Type_deckmap extends Core.Type_map {
    public Base.Type_deckmap vx_new(final Object... vals);
    public Base.Type_deckmap vx_copy(final Object... vals);
    public Base.Type_deckmap vx_empty();
    public Base.Type_deckmap vx_type();
    public Map<String, Base.Type_deck> vx_mapdeck();
    public Base.Type_deck vx_deck(final Core.Type_string key);
  }

  public static class Class_deckmap extends Core.Class_base implements Type_deckmap {

    protected Map<String, Base.Type_deck> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_deck>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_deck vx_deck(final Core.Type_string key) {
      Base.Type_deck output = Base.e_deck;
      Class_deckmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_deck> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_deck);
      return output;
    }

    @Override
    public Map<String, Base.Type_deck> vx_mapdeck() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_deck(key);
    }

    @Override
    public Type_deckmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_deckmap output = new Class_deckmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_deck> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_deck) {
          Base.Type_deck castval = (Base.Type_deck)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/deckmap", ":invalidvalue", val);
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
    public Type_deckmap vx_new(final Object... vals) {return e_deckmap.vx_copy(vals);}

    @Override
    public Type_deckmap vx_copy(final Object... vals) {
      Type_deckmap output = this;
      boolean ischanged = false;
      Class_deckmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_deck> mapval = new LinkedHashMap<>(val.vx_mapdeck());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/deckmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_deck valany = null;
          if (valsub instanceof Base.Type_deck) {
            valany = (Base.Type_deck)valsub;
          } else if (valsub instanceof Base.Type_deck) {
            valany = (Base.Type_deck)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/deckmap", ":invalidkeyvalue", msgmap);
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
        Class_deckmap work = new Class_deckmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_deckmap vx_empty() {return e_deckmap;}
    @Override
    public Type_deckmap vx_type() {return t_deckmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "deckmap", // name
        ":map", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
        Core.t_typelist.vx_new(Base.t_deck), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_deckmap e_deckmap = new Class_deckmap();
  public static final Type_deckmap t_deckmap = new Class_deckmap();

  /**
   * type: goal
   * (type goal)
   */
  public interface Type_goal extends Core.Type_struct, Base.Type_card {
    public Base.Type_goal vx_new(final Object... vals);
    public Base.Type_goal vx_copy(final Object... vals);
    public Base.Type_goal vx_empty();
    public Base.Type_goal vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_string description();
    public Core.Type_int progress();
    public Core.Type_int complete();
    public Core.Type_string reward();
  }

  public static class Class_goal extends Core.Class_base implements Type_goal {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_string vx_p_description;

    @Override
    public Core.Type_string description() {
      return this.vx_p_description == null ? Core.e_string : this.vx_p_description;
    }

    protected Core.Type_int vx_p_progress;

    @Override
    public Core.Type_int progress() {
      return this.vx_p_progress == null ? Core.e_int : this.vx_p_progress;
    }

    protected Core.Type_int vx_p_complete;

    @Override
    public Core.Type_int complete() {
      return this.vx_p_complete == null ? Core.e_int : this.vx_p_complete;
    }

    protected Core.Type_string vx_p_reward;

    @Override
    public Core.Type_string reward() {
      return this.vx_p_reward == null ? Core.e_string : this.vx_p_reward;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":description":
        output = this.description();
        break;
      case ":progress":
        output = this.progress();
        break;
      case ":complete":
        output = this.complete();
        break;
      case ":reward":
        output = this.reward();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":description", this.description());
      output.put(":progress", this.progress());
      output.put(":complete", this.complete());
      output.put(":reward", this.reward());
      return Core.immutablemap(output);
    }

    @Override
    public Type_goal vx_new(final Object... vals) {return e_goal.vx_copy(vals);}

    @Override
    public Type_goal vx_copy(final Object... vals) {
      Type_goal output = this;
      boolean ischanged = false;
      Class_goal val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_string vx_p_description = val.description();
      Core.Type_int vx_p_progress = val.progress();
      Core.Type_int vx_p_complete = val.complete();
      Core.Type_string vx_p_reward = val.reward();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":description");
      validkeys.add(":progress");
      validkeys.add(":complete");
      validkeys.add(":reward");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":description":
            if (valsub == vx_p_description) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_description = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_description = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("description"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":progress":
            if (valsub == vx_p_progress) {
            } else if (valsub instanceof Core.Type_int) {
              ischanged = true;
              vx_p_progress = (Core.Type_int)valsub;
            } else if (valsub instanceof Integer) {
              ischanged = true;
              vx_p_progress = Core.t_int.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("progress"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":complete":
            if (valsub == vx_p_complete) {
            } else if (valsub instanceof Core.Type_int) {
              ischanged = true;
              vx_p_complete = (Core.Type_int)valsub;
            } else if (valsub instanceof Integer) {
              ischanged = true;
              vx_p_complete = Core.t_int.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("complete"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reward":
            if (valsub == vx_p_reward) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reward = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reward = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reward"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/goal", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_goal work = new Class_goal();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_description = vx_p_description;
        work.vx_p_progress = vx_p_progress;
        work.vx_p_complete = vx_p_complete;
        work.vx_p_reward = vx_p_reward;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_goal vx_empty() {return e_goal;}
    @Override
    public Type_goal vx_type() {return t_goal;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "goal", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_goal e_goal = new Class_goal();
  public static final Type_goal t_goal = new Class_goal();

  /**
   * type: item
   * (type item)
   */
  public interface Type_item extends Core.Type_struct, Base.Type_card {
    public Base.Type_item vx_new(final Object... vals);
    public Base.Type_item vx_copy(final Object... vals);
    public Base.Type_item vx_empty();
    public Base.Type_item vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Base.Type_rating body();
    public Base.Type_rating mind();
    public Base.Type_rating will();
    public Base.Type_rating speed();
    public Base.Type_rating shadow();
    public Base.Type_rating beast();
    public Core.Type_string classification();
    public Core.Type_string length();
    public Core.Type_string mass();
    public Core.Type_string modifiers();
    public Core.Type_string muzzlevelocity();
    public Core.Type_string range();
    public Core.Type_string rof();
    public Base.Type_rolemap rolemap();
    public Core.Type_string value();
  }

  public static class Class_item extends Core.Class_base implements Type_item {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Base.Type_rating vx_p_body;

    @Override
    public Base.Type_rating body() {
      return this.vx_p_body == null ? Base.e_rating : this.vx_p_body;
    }

    protected Base.Type_rating vx_p_mind;

    @Override
    public Base.Type_rating mind() {
      return this.vx_p_mind == null ? Base.e_rating : this.vx_p_mind;
    }

    protected Base.Type_rating vx_p_will;

    @Override
    public Base.Type_rating will() {
      return this.vx_p_will == null ? Base.e_rating : this.vx_p_will;
    }

    protected Base.Type_rating vx_p_speed;

    @Override
    public Base.Type_rating speed() {
      return this.vx_p_speed == null ? Base.e_rating : this.vx_p_speed;
    }

    protected Base.Type_rating vx_p_shadow;

    @Override
    public Base.Type_rating shadow() {
      return this.vx_p_shadow == null ? Base.e_rating : this.vx_p_shadow;
    }

    protected Base.Type_rating vx_p_beast;

    @Override
    public Base.Type_rating beast() {
      return this.vx_p_beast == null ? Base.e_rating : this.vx_p_beast;
    }

    protected Core.Type_string vx_p_classification;

    @Override
    public Core.Type_string classification() {
      return this.vx_p_classification == null ? Core.e_string : this.vx_p_classification;
    }

    protected Core.Type_string vx_p_length;

    @Override
    public Core.Type_string length() {
      return this.vx_p_length == null ? Core.e_string : this.vx_p_length;
    }

    protected Core.Type_string vx_p_mass;

    @Override
    public Core.Type_string mass() {
      return this.vx_p_mass == null ? Core.e_string : this.vx_p_mass;
    }

    protected Core.Type_string vx_p_modifiers;

    @Override
    public Core.Type_string modifiers() {
      return this.vx_p_modifiers == null ? Core.e_string : this.vx_p_modifiers;
    }

    protected Core.Type_string vx_p_muzzlevelocity;

    @Override
    public Core.Type_string muzzlevelocity() {
      return this.vx_p_muzzlevelocity == null ? Core.e_string : this.vx_p_muzzlevelocity;
    }

    protected Core.Type_string vx_p_range;

    @Override
    public Core.Type_string range() {
      return this.vx_p_range == null ? Core.e_string : this.vx_p_range;
    }

    protected Core.Type_string vx_p_rof;

    @Override
    public Core.Type_string rof() {
      return this.vx_p_rof == null ? Core.e_string : this.vx_p_rof;
    }

    protected Base.Type_rolemap vx_p_rolemap;

    @Override
    public Base.Type_rolemap rolemap() {
      return this.vx_p_rolemap == null ? Base.e_rolemap : this.vx_p_rolemap;
    }

    protected Core.Type_string vx_p_value;

    @Override
    public Core.Type_string value() {
      return this.vx_p_value == null ? Core.e_string : this.vx_p_value;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":body":
        output = this.body();
        break;
      case ":mind":
        output = this.mind();
        break;
      case ":will":
        output = this.will();
        break;
      case ":speed":
        output = this.speed();
        break;
      case ":shadow":
        output = this.shadow();
        break;
      case ":beast":
        output = this.beast();
        break;
      case ":classification":
        output = this.classification();
        break;
      case ":length":
        output = this.length();
        break;
      case ":mass":
        output = this.mass();
        break;
      case ":modifiers":
        output = this.modifiers();
        break;
      case ":muzzlevelocity":
        output = this.muzzlevelocity();
        break;
      case ":range":
        output = this.range();
        break;
      case ":rof":
        output = this.rof();
        break;
      case ":rolemap":
        output = this.rolemap();
        break;
      case ":value":
        output = this.value();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":body", this.body());
      output.put(":mind", this.mind());
      output.put(":will", this.will());
      output.put(":speed", this.speed());
      output.put(":shadow", this.shadow());
      output.put(":beast", this.beast());
      output.put(":classification", this.classification());
      output.put(":length", this.length());
      output.put(":mass", this.mass());
      output.put(":modifiers", this.modifiers());
      output.put(":muzzlevelocity", this.muzzlevelocity());
      output.put(":range", this.range());
      output.put(":rof", this.rof());
      output.put(":rolemap", this.rolemap());
      output.put(":value", this.value());
      return Core.immutablemap(output);
    }

    @Override
    public Type_item vx_new(final Object... vals) {return e_item.vx_copy(vals);}

    @Override
    public Type_item vx_copy(final Object... vals) {
      Type_item output = this;
      boolean ischanged = false;
      Class_item val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Base.Type_rating vx_p_body = val.body();
      Base.Type_rating vx_p_mind = val.mind();
      Base.Type_rating vx_p_will = val.will();
      Base.Type_rating vx_p_speed = val.speed();
      Base.Type_rating vx_p_shadow = val.shadow();
      Base.Type_rating vx_p_beast = val.beast();
      Core.Type_string vx_p_classification = val.classification();
      Core.Type_string vx_p_length = val.length();
      Core.Type_string vx_p_mass = val.mass();
      Core.Type_string vx_p_modifiers = val.modifiers();
      Core.Type_string vx_p_muzzlevelocity = val.muzzlevelocity();
      Core.Type_string vx_p_range = val.range();
      Core.Type_string vx_p_rof = val.rof();
      Base.Type_rolemap vx_p_rolemap = val.rolemap();
      Core.Type_string vx_p_value = val.value();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":body");
      validkeys.add(":mind");
      validkeys.add(":will");
      validkeys.add(":speed");
      validkeys.add(":shadow");
      validkeys.add(":beast");
      validkeys.add(":classification");
      validkeys.add(":length");
      validkeys.add(":mass");
      validkeys.add(":modifiers");
      validkeys.add(":muzzlevelocity");
      validkeys.add(":range");
      validkeys.add(":rof");
      validkeys.add(":rolemap");
      validkeys.add(":value");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":body":
            if (valsub == vx_p_body) {
            } else if (valsub instanceof Base.Type_rating) {
              ischanged = true;
              vx_p_body = (Base.Type_rating)valsub;
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
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":mind":
            if (valsub == vx_p_mind) {
            } else if (valsub instanceof Base.Type_rating) {
              ischanged = true;
              vx_p_mind = (Base.Type_rating)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("mind"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":will":
            if (valsub == vx_p_will) {
            } else if (valsub instanceof Base.Type_rating) {
              ischanged = true;
              vx_p_will = (Base.Type_rating)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("will"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":speed":
            if (valsub == vx_p_speed) {
            } else if (valsub instanceof Base.Type_rating) {
              ischanged = true;
              vx_p_speed = (Base.Type_rating)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("speed"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":shadow":
            if (valsub == vx_p_shadow) {
            } else if (valsub instanceof Base.Type_rating) {
              ischanged = true;
              vx_p_shadow = (Base.Type_rating)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("shadow"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":beast":
            if (valsub == vx_p_beast) {
            } else if (valsub instanceof Base.Type_rating) {
              ischanged = true;
              vx_p_beast = (Base.Type_rating)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("beast"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":classification":
            if (valsub == vx_p_classification) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_classification = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_classification = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("classification"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":length":
            if (valsub == vx_p_length) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_length = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_length = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("length"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":mass":
            if (valsub == vx_p_mass) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_mass = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_mass = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("mass"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":modifiers":
            if (valsub == vx_p_modifiers) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_modifiers = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_modifiers = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("modifiers"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":muzzlevelocity":
            if (valsub == vx_p_muzzlevelocity) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_muzzlevelocity = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_muzzlevelocity = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("muzzlevelocity"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":range":
            if (valsub == vx_p_range) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_range = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_range = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("range"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":rof":
            if (valsub == vx_p_rof) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_rof = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_rof = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("rof"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":rolemap":
            if (valsub == vx_p_rolemap) {
            } else if (valsub instanceof Base.Type_rolemap) {
              ischanged = true;
              vx_p_rolemap = (Base.Type_rolemap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("rolemap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":value":
            if (valsub == vx_p_value) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_value = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_value = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("value"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/item", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_item work = new Class_item();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_body = vx_p_body;
        work.vx_p_mind = vx_p_mind;
        work.vx_p_will = vx_p_will;
        work.vx_p_speed = vx_p_speed;
        work.vx_p_shadow = vx_p_shadow;
        work.vx_p_beast = vx_p_beast;
        work.vx_p_classification = vx_p_classification;
        work.vx_p_length = vx_p_length;
        work.vx_p_mass = vx_p_mass;
        work.vx_p_modifiers = vx_p_modifiers;
        work.vx_p_muzzlevelocity = vx_p_muzzlevelocity;
        work.vx_p_range = vx_p_range;
        work.vx_p_rof = vx_p_rof;
        work.vx_p_rolemap = vx_p_rolemap;
        work.vx_p_value = vx_p_value;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_item vx_empty() {return e_item;}
    @Override
    public Type_item vx_type() {return t_item;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "item", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_item e_item = new Class_item();
  public static final Type_item t_item = new Class_item();

  /**
   * type: itemmap
   * (type itemmap)
   */
  public interface Type_itemmap extends Core.Type_map {
    public Base.Type_itemmap vx_new(final Object... vals);
    public Base.Type_itemmap vx_copy(final Object... vals);
    public Base.Type_itemmap vx_empty();
    public Base.Type_itemmap vx_type();
    public Map<String, Base.Type_item> vx_mapitem();
    public Base.Type_item vx_item(final Core.Type_string key);
  }

  public static class Class_itemmap extends Core.Class_base implements Type_itemmap {

    protected Map<String, Base.Type_item> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_item>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_item vx_item(final Core.Type_string key) {
      Base.Type_item output = Base.e_item;
      Class_itemmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_item> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_item);
      return output;
    }

    @Override
    public Map<String, Base.Type_item> vx_mapitem() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_item(key);
    }

    @Override
    public Type_itemmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_itemmap output = new Class_itemmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_item> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_item) {
          Base.Type_item castval = (Base.Type_item)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/itemmap", ":invalidvalue", val);
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
    public Type_itemmap vx_new(final Object... vals) {return e_itemmap.vx_copy(vals);}

    @Override
    public Type_itemmap vx_copy(final Object... vals) {
      Type_itemmap output = this;
      boolean ischanged = false;
      Class_itemmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_item> mapval = new LinkedHashMap<>(val.vx_mapitem());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/itemmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_item valany = null;
          if (valsub instanceof Base.Type_item) {
            valany = (Base.Type_item)valsub;
          } else if (valsub instanceof Base.Type_item) {
            valany = (Base.Type_item)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/itemmap", ":invalidkeyvalue", msgmap);
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
        Class_itemmap work = new Class_itemmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_itemmap vx_empty() {return e_itemmap;}
    @Override
    public Type_itemmap vx_type() {return t_itemmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "itemmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_item), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_itemmap e_itemmap = new Class_itemmap();
  public static final Type_itemmap t_itemmap = new Class_itemmap();

  /**
   * type: location
   * (type location)
   */
  public interface Type_location extends Core.Type_struct, Base.Type_card {
    public Base.Type_location vx_new(final Object... vals);
    public Base.Type_location vx_copy(final Object... vals);
    public Base.Type_location vx_empty();
    public Base.Type_location vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Base.Type_locationmap locationmap();
    public Base.Type_unitmap unitmap();
  }

  public static class Class_location extends Core.Class_base implements Type_location {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Base.Type_locationmap vx_p_locationmap;

    @Override
    public Base.Type_locationmap locationmap() {
      return this.vx_p_locationmap == null ? Base.e_locationmap : this.vx_p_locationmap;
    }

    protected Base.Type_unitmap vx_p_unitmap;

    @Override
    public Base.Type_unitmap unitmap() {
      return this.vx_p_unitmap == null ? Base.e_unitmap : this.vx_p_unitmap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":locationmap":
        output = this.locationmap();
        break;
      case ":unitmap":
        output = this.unitmap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":locationmap", this.locationmap());
      output.put(":unitmap", this.unitmap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_location vx_new(final Object... vals) {return e_location.vx_copy(vals);}

    @Override
    public Type_location vx_copy(final Object... vals) {
      Type_location output = this;
      boolean ischanged = false;
      Class_location val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Base.Type_locationmap vx_p_locationmap = val.locationmap();
      Base.Type_unitmap vx_p_unitmap = val.unitmap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":locationmap");
      validkeys.add(":unitmap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":locationmap":
            if (valsub == vx_p_locationmap) {
            } else if (valsub instanceof Base.Type_locationmap) {
              ischanged = true;
              vx_p_locationmap = (Base.Type_locationmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("locationmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unitmap":
            if (valsub == vx_p_unitmap) {
            } else if (valsub instanceof Base.Type_unitmap) {
              ischanged = true;
              vx_p_unitmap = (Base.Type_unitmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unitmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/location", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_location work = new Class_location();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_locationmap = vx_p_locationmap;
        work.vx_p_unitmap = vx_p_unitmap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_location vx_empty() {return e_location;}
    @Override
    public Type_location vx_type() {return t_location;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "location", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_location e_location = new Class_location();
  public static final Type_location t_location = new Class_location();

  /**
   * type: locationmap
   * (type locationmap)
   */
  public interface Type_locationmap extends Core.Type_map {
    public Base.Type_locationmap vx_new(final Object... vals);
    public Base.Type_locationmap vx_copy(final Object... vals);
    public Base.Type_locationmap vx_empty();
    public Base.Type_locationmap vx_type();
    public Map<String, Base.Type_location> vx_maplocation();
    public Base.Type_location vx_location(final Core.Type_string key);
  }

  public static class Class_locationmap extends Core.Class_base implements Type_locationmap {

    protected Map<String, Base.Type_location> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_location>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_location vx_location(final Core.Type_string key) {
      Base.Type_location output = Base.e_location;
      Class_locationmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_location> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_location);
      return output;
    }

    @Override
    public Map<String, Base.Type_location> vx_maplocation() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_location(key);
    }

    @Override
    public Type_locationmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_locationmap output = new Class_locationmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_location> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_location) {
          Base.Type_location castval = (Base.Type_location)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/locationmap", ":invalidvalue", val);
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
    public Type_locationmap vx_new(final Object... vals) {return e_locationmap.vx_copy(vals);}

    @Override
    public Type_locationmap vx_copy(final Object... vals) {
      Type_locationmap output = this;
      boolean ischanged = false;
      Class_locationmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_location> mapval = new LinkedHashMap<>(val.vx_maplocation());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/locationmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_location valany = null;
          if (valsub instanceof Base.Type_location) {
            valany = (Base.Type_location)valsub;
          } else if (valsub instanceof Base.Type_location) {
            valany = (Base.Type_location)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/locationmap", ":invalidkeyvalue", msgmap);
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
        Class_locationmap work = new Class_locationmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_locationmap vx_empty() {return e_locationmap;}
    @Override
    public Type_locationmap vx_type() {return t_locationmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "locationmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_location), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_locationmap e_locationmap = new Class_locationmap();
  public static final Type_locationmap t_locationmap = new Class_locationmap();

  /**
   * type: mind
   * The ability to use rational thought to do tasks. This is the opposite of the [Shadow].
   * (type mind)
   */
  public interface Type_mind extends Core.Type_struct, Base.Type_card {
    public Base.Type_mind vx_new(final Object... vals);
    public Base.Type_mind vx_copy(final Object... vals);
    public Base.Type_mind vx_empty();
    public Base.Type_mind vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_mind extends Core.Class_base implements Type_mind {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_mind vx_new(final Object... vals) {return e_mind.vx_copy(vals);}

    @Override
    public Type_mind vx_copy(final Object... vals) {
      Type_mind output = this;
      boolean ischanged = false;
      Class_mind val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/mind", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/mind", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/mind", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/mind", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/mind", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/mind", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/mind", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/mind", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/mind", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_mind work = new Class_mind();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_mind vx_empty() {return e_mind;}
    @Override
    public Type_mind vx_type() {return t_mind;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "mind", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_mind e_mind = new Class_mind();
  public static final Type_mind t_mind = new Class_mind();

  /**
   * type: modifier
   * (type modifier)
   */
  public interface Type_modifier extends Core.Type_struct, Base.Type_card {
    public Base.Type_modifier vx_new(final Object... vals);
    public Base.Type_modifier vx_copy(final Object... vals);
    public Base.Type_modifier vx_empty();
    public Base.Type_modifier vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_modifier extends Core.Class_base implements Type_modifier {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_modifier vx_new(final Object... vals) {return e_modifier.vx_copy(vals);}

    @Override
    public Type_modifier vx_copy(final Object... vals) {
      Type_modifier output = this;
      boolean ischanged = false;
      Class_modifier val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/modifier", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/modifier", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/modifier", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/modifier", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/modifier", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/modifier", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/modifier", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/modifier", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/modifier", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_modifier work = new Class_modifier();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_modifier vx_empty() {return e_modifier;}
    @Override
    public Type_modifier vx_type() {return t_modifier;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "modifier", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_modifier e_modifier = new Class_modifier();
  public static final Type_modifier t_modifier = new Class_modifier();

  /**
   * type: playingcard
   * (type playingcard)
   */
  public interface Type_playingcard extends Core.Type_struct {
    public Base.Type_playingcard vx_new(final Object... vals);
    public Base.Type_playingcard vx_copy(final Object... vals);
    public Base.Type_playingcard vx_empty();
    public Base.Type_playingcard vx_type();
    public Base.Type_rank rank();
    public Base.Type_suit suit();
  }

  public static class Class_playingcard extends Core.Class_base implements Type_playingcard {

    protected Base.Type_rank vx_p_rank;

    @Override
    public Base.Type_rank rank() {
      return this.vx_p_rank == null ? Base.e_rank : this.vx_p_rank;
    }

    protected Base.Type_suit vx_p_suit;

    @Override
    public Base.Type_suit suit() {
      return this.vx_p_suit == null ? Base.e_suit : this.vx_p_suit;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":rank":
        output = this.rank();
        break;
      case ":suit":
        output = this.suit();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":rank", this.rank());
      output.put(":suit", this.suit());
      return Core.immutablemap(output);
    }

    @Override
    public Type_playingcard vx_new(final Object... vals) {return e_playingcard.vx_copy(vals);}

    @Override
    public Type_playingcard vx_copy(final Object... vals) {
      Type_playingcard output = this;
      boolean ischanged = false;
      Class_playingcard val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Base.Type_rank vx_p_rank = val.rank();
      Base.Type_suit vx_p_suit = val.suit();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":rank");
      validkeys.add(":suit");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/playingcard", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/playingcard", ":invalidkey", msgval);
              msgblock = msgblock.vx_copy(msg);
            }
          }
        } else {
          switch (key) {
          case ":rank":
            if (valsub == vx_p_rank) {
            } else if (valsub instanceof Base.Type_rank) {
              ischanged = true;
              vx_p_rank = (Base.Type_rank)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("rank"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/playingcard", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":suit":
            if (valsub == vx_p_suit) {
            } else if (valsub instanceof Base.Type_suit) {
              ischanged = true;
              vx_p_suit = (Base.Type_suit)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("suit"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/playingcard", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/playingcard", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_playingcard work = new Class_playingcard();
        work.vx_p_rank = vx_p_rank;
        work.vx_p_suit = vx_p_suit;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_playingcard vx_empty() {return e_playingcard;}
    @Override
    public Type_playingcard vx_type() {return t_playingcard;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "playingcard", // name
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

  public static final Type_playingcard e_playingcard = new Class_playingcard();
  public static final Type_playingcard t_playingcard = new Class_playingcard();

  /**
   * type: power
   * (type power)
   */
  public interface Type_power extends Core.Type_struct, Base.Type_card {
    public Base.Type_power vx_new(final Object... vals);
    public Base.Type_power vx_copy(final Object... vals);
    public Base.Type_power vx_empty();
    public Base.Type_power vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_string stat();
    public Base.Type_abilitymap abilitymap();
    public Base.Type_specialtymap specialtymap();
  }

  public static class Class_power extends Core.Class_base implements Type_power {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_string vx_p_stat;

    @Override
    public Core.Type_string stat() {
      return this.vx_p_stat == null ? Core.e_string : this.vx_p_stat;
    }

    protected Base.Type_abilitymap vx_p_abilitymap;

    @Override
    public Base.Type_abilitymap abilitymap() {
      return this.vx_p_abilitymap == null ? Base.e_abilitymap : this.vx_p_abilitymap;
    }

    protected Base.Type_specialtymap vx_p_specialtymap;

    @Override
    public Base.Type_specialtymap specialtymap() {
      return this.vx_p_specialtymap == null ? Base.e_specialtymap : this.vx_p_specialtymap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":stat":
        output = this.stat();
        break;
      case ":abilitymap":
        output = this.abilitymap();
        break;
      case ":specialtymap":
        output = this.specialtymap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":stat", this.stat());
      output.put(":abilitymap", this.abilitymap());
      output.put(":specialtymap", this.specialtymap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_power vx_new(final Object... vals) {return e_power.vx_copy(vals);}

    @Override
    public Type_power vx_copy(final Object... vals) {
      Type_power output = this;
      boolean ischanged = false;
      Class_power val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_string vx_p_stat = val.stat();
      Base.Type_abilitymap vx_p_abilitymap = val.abilitymap();
      Base.Type_specialtymap vx_p_specialtymap = val.specialtymap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":stat");
      validkeys.add(":abilitymap");
      validkeys.add(":specialtymap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":stat":
            if (valsub == vx_p_stat) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_stat = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_stat = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("stat"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":abilitymap":
            if (valsub == vx_p_abilitymap) {
            } else if (valsub instanceof Base.Type_abilitymap) {
              ischanged = true;
              vx_p_abilitymap = (Base.Type_abilitymap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("abilitymap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":specialtymap":
            if (valsub == vx_p_specialtymap) {
            } else if (valsub instanceof Base.Type_specialtymap) {
              ischanged = true;
              vx_p_specialtymap = (Base.Type_specialtymap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("specialtymap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/power", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_power work = new Class_power();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_stat = vx_p_stat;
        work.vx_p_abilitymap = vx_p_abilitymap;
        work.vx_p_specialtymap = vx_p_specialtymap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_power vx_empty() {return e_power;}
    @Override
    public Type_power vx_type() {return t_power;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "power", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_power e_power = new Class_power();
  public static final Type_power t_power = new Class_power();

  /**
   * type: powermap
   * (type powermap)
   */
  public interface Type_powermap extends Core.Type_map {
    public Base.Type_powermap vx_new(final Object... vals);
    public Base.Type_powermap vx_copy(final Object... vals);
    public Base.Type_powermap vx_empty();
    public Base.Type_powermap vx_type();
    public Map<String, Base.Type_power> vx_mappower();
    public Base.Type_power vx_power(final Core.Type_string key);
  }

  public static class Class_powermap extends Core.Class_base implements Type_powermap {

    protected Map<String, Base.Type_power> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_power>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_power vx_power(final Core.Type_string key) {
      Base.Type_power output = Base.e_power;
      Class_powermap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_power> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_power);
      return output;
    }

    @Override
    public Map<String, Base.Type_power> vx_mappower() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_power(key);
    }

    @Override
    public Type_powermap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_powermap output = new Class_powermap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_power> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_power) {
          Base.Type_power castval = (Base.Type_power)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/powermap", ":invalidvalue", val);
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
    public Type_powermap vx_new(final Object... vals) {return e_powermap.vx_copy(vals);}

    @Override
    public Type_powermap vx_copy(final Object... vals) {
      Type_powermap output = this;
      boolean ischanged = false;
      Class_powermap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_power> mapval = new LinkedHashMap<>(val.vx_mappower());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/powermap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_power valany = null;
          if (valsub instanceof Base.Type_power) {
            valany = (Base.Type_power)valsub;
          } else if (valsub instanceof Base.Type_power) {
            valany = (Base.Type_power)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/powermap", ":invalidkeyvalue", msgmap);
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
        Class_powermap work = new Class_powermap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_powermap vx_empty() {return e_powermap;}
    @Override
    public Type_powermap vx_type() {return t_powermap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "powermap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_power), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_powermap e_powermap = new Class_powermap();
  public static final Type_powermap t_powermap = new Class_powermap();

  /**
   * type: rank
   * (type rank)
   */
  public interface Type_rank extends Core.Type_struct, Base.Type_card {
    public Base.Type_rank vx_new(final Object... vals);
    public Base.Type_rank vx_copy(final Object... vals);
    public Base.Type_rank vx_empty();
    public Base.Type_rank vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_rank extends Core.Class_base implements Type_rank {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_rank vx_new(final Object... vals) {return e_rank.vx_copy(vals);}

    @Override
    public Type_rank vx_copy(final Object... vals) {
      Type_rank output = this;
      boolean ischanged = false;
      Class_rank val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/rank", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rank", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rank", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rank", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rank", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rank", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rank", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rank", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/rank", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_rank work = new Class_rank();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_rank vx_empty() {return e_rank;}
    @Override
    public Type_rank vx_type() {return t_rank;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "rank", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_rank e_rank = new Class_rank();
  public static final Type_rank t_rank = new Class_rank();

  /**
   * type: rating
   * Rating are displayed as level.part:scale.
   * (type rating)
   */
  public interface Type_rating extends Core.Type_struct, Base.Type_card {
    public Base.Type_rating vx_new(final Object... vals);
    public Base.Type_rating vx_copy(final Object... vals);
    public Base.Type_rating vx_empty();
    public Base.Type_rating vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_int level();
    public Core.Type_int part();
    public Core.Type_int scale();
  }

  public static class Class_rating extends Core.Class_base implements Type_rating {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_int vx_p_level;

    @Override
    public Core.Type_int level() {
      return this.vx_p_level == null ? Core.e_int : this.vx_p_level;
    }

    protected Core.Type_int vx_p_part;

    @Override
    public Core.Type_int part() {
      return this.vx_p_part == null ? Core.e_int : this.vx_p_part;
    }

    protected Core.Type_int vx_p_scale;

    @Override
    public Core.Type_int scale() {
      return this.vx_p_scale == null ? Core.e_int : this.vx_p_scale;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":level":
        output = this.level();
        break;
      case ":part":
        output = this.part();
        break;
      case ":scale":
        output = this.scale();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":level", this.level());
      output.put(":part", this.part());
      output.put(":scale", this.scale());
      return Core.immutablemap(output);
    }

    @Override
    public Type_rating vx_new(final Object... vals) {return e_rating.vx_copy(vals);}

    @Override
    public Type_rating vx_copy(final Object... vals) {
      Type_rating output = this;
      boolean ischanged = false;
      Class_rating val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_int vx_p_level = val.level();
      Core.Type_int vx_p_part = val.part();
      Core.Type_int vx_p_scale = val.scale();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":level");
      validkeys.add(":part");
      validkeys.add(":scale");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":level":
            if (valsub == vx_p_level) {
            } else if (valsub instanceof Core.Type_int) {
              ischanged = true;
              vx_p_level = (Core.Type_int)valsub;
            } else if (valsub instanceof Integer) {
              ischanged = true;
              vx_p_level = Core.t_int.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("level"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":part":
            if (valsub == vx_p_part) {
            } else if (valsub instanceof Core.Type_int) {
              ischanged = true;
              vx_p_part = (Core.Type_int)valsub;
            } else if (valsub instanceof Integer) {
              ischanged = true;
              vx_p_part = Core.t_int.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("part"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":scale":
            if (valsub == vx_p_scale) {
            } else if (valsub instanceof Core.Type_int) {
              ischanged = true;
              vx_p_scale = (Core.Type_int)valsub;
            } else if (valsub instanceof Integer) {
              ischanged = true;
              vx_p_scale = Core.t_int.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("scale"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/rating", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_rating work = new Class_rating();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_level = vx_p_level;
        work.vx_p_part = vx_p_part;
        work.vx_p_scale = vx_p_scale;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_rating vx_empty() {return e_rating;}
    @Override
    public Type_rating vx_type() {return t_rating;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "rating", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_rating e_rating = new Class_rating();
  public static final Type_rating t_rating = new Class_rating();

  /**
   * type: role
   * (type role)
   */
  public interface Type_role extends Core.Type_struct {
    public Base.Type_role vx_new(final Object... vals);
    public Base.Type_role vx_copy(final Object... vals);
    public Base.Type_role vx_empty();
    public Base.Type_role vx_type();
  }

  public static class Class_role extends Core.Class_base implements Type_role {

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
    public Type_role vx_new(final Object... vals) {return e_role.vx_copy(vals);}

    @Override
    public Type_role vx_copy(final Object... vals) {
      Type_role output = this;
      boolean ischanged = false;
      Class_role val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_role work = new Class_role();
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_role vx_empty() {return e_role;}
    @Override
    public Type_role vx_type() {return t_role;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "role", // name
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

  public static final Type_role e_role = new Class_role();
  public static final Type_role t_role = new Class_role();

  /**
   * type: rolemap
   * (type rolemap)
   */
  public interface Type_rolemap extends Core.Type_map {
    public Base.Type_rolemap vx_new(final Object... vals);
    public Base.Type_rolemap vx_copy(final Object... vals);
    public Base.Type_rolemap vx_empty();
    public Base.Type_rolemap vx_type();
    public Map<String, Base.Type_role> vx_maprole();
    public Base.Type_role vx_role(final Core.Type_string key);
  }

  public static class Class_rolemap extends Core.Class_base implements Type_rolemap {

    protected Map<String, Base.Type_role> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_role>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_role vx_role(final Core.Type_string key) {
      Base.Type_role output = Base.e_role;
      Class_rolemap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_role> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_role);
      return output;
    }

    @Override
    public Map<String, Base.Type_role> vx_maprole() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_role(key);
    }

    @Override
    public Type_rolemap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_rolemap output = new Class_rolemap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_role> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_role) {
          Base.Type_role castval = (Base.Type_role)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/rolemap", ":invalidvalue", val);
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
    public Type_rolemap vx_new(final Object... vals) {return e_rolemap.vx_copy(vals);}

    @Override
    public Type_rolemap vx_copy(final Object... vals) {
      Type_rolemap output = this;
      boolean ischanged = false;
      Class_rolemap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_role> mapval = new LinkedHashMap<>(val.vx_maprole());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/rolemap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_role valany = null;
          if (valsub instanceof Base.Type_role) {
            valany = (Base.Type_role)valsub;
          } else if (valsub instanceof Base.Type_role) {
            valany = (Base.Type_role)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/rolemap", ":invalidkeyvalue", msgmap);
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
        Class_rolemap work = new Class_rolemap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_rolemap vx_empty() {return e_rolemap;}
    @Override
    public Type_rolemap vx_type() {return t_rolemap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "rolemap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_role), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_rolemap e_rolemap = new Class_rolemap();
  public static final Type_rolemap t_rolemap = new Class_rolemap();

  /**
   * type: rule
   * (type rule)
   */
  public interface Type_rule extends Core.Type_struct, Base.Type_card {
    public Base.Type_rule vx_new(final Object... vals);
    public Base.Type_rule vx_copy(final Object... vals);
    public Base.Type_rule vx_empty();
    public Base.Type_rule vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_string classification();
  }

  public static class Class_rule extends Core.Class_base implements Type_rule {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_string vx_p_classification;

    @Override
    public Core.Type_string classification() {
      return this.vx_p_classification == null ? Core.e_string : this.vx_p_classification;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":classification":
        output = this.classification();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":classification", this.classification());
      return Core.immutablemap(output);
    }

    @Override
    public Type_rule vx_new(final Object... vals) {return e_rule.vx_copy(vals);}

    @Override
    public Type_rule vx_copy(final Object... vals) {
      Type_rule output = this;
      boolean ischanged = false;
      Class_rule val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_string vx_p_classification = val.classification();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":classification");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":classification":
            if (valsub == vx_p_classification) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_classification = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_classification = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("classification"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/rule", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_rule work = new Class_rule();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_classification = vx_p_classification;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_rule vx_empty() {return e_rule;}
    @Override
    public Type_rule vx_type() {return t_rule;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "rule", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_rule e_rule = new Class_rule();
  public static final Type_rule t_rule = new Class_rule();

  /**
   * type: rulemap
   * (type rulemap)
   */
  public interface Type_rulemap extends Core.Type_map {
    public Base.Type_rulemap vx_new(final Object... vals);
    public Base.Type_rulemap vx_copy(final Object... vals);
    public Base.Type_rulemap vx_empty();
    public Base.Type_rulemap vx_type();
    public Map<String, Base.Type_rule> vx_maprule();
    public Base.Type_rule vx_rule(final Core.Type_string key);
  }

  public static class Class_rulemap extends Core.Class_base implements Type_rulemap {

    protected Map<String, Base.Type_rule> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_rule>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_rule vx_rule(final Core.Type_string key) {
      Base.Type_rule output = Base.e_rule;
      Class_rulemap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_rule> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_rule);
      return output;
    }

    @Override
    public Map<String, Base.Type_rule> vx_maprule() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_rule(key);
    }

    @Override
    public Type_rulemap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_rulemap output = new Class_rulemap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_rule> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_rule) {
          Base.Type_rule castval = (Base.Type_rule)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/rulemap", ":invalidvalue", val);
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
    public Type_rulemap vx_new(final Object... vals) {return e_rulemap.vx_copy(vals);}

    @Override
    public Type_rulemap vx_copy(final Object... vals) {
      Type_rulemap output = this;
      boolean ischanged = false;
      Class_rulemap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_rule> mapval = new LinkedHashMap<>(val.vx_maprule());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/rulemap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_rule valany = null;
          if (valsub instanceof Base.Type_rule) {
            valany = (Base.Type_rule)valsub;
          } else if (valsub instanceof Base.Type_rule) {
            valany = (Base.Type_rule)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/rulemap", ":invalidkeyvalue", msgmap);
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
        Class_rulemap work = new Class_rulemap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_rulemap vx_empty() {return e_rulemap;}
    @Override
    public Type_rulemap vx_type() {return t_rulemap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "rulemap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_rule), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_rulemap e_rulemap = new Class_rulemap();
  public static final Type_rulemap t_rulemap = new Class_rulemap();

  /**
   * type: scenario
   * (type scenario)
   */
  public interface Type_scenario extends Core.Type_struct, Base.Type_card {
    public Base.Type_scenario vx_new(final Object... vals);
    public Base.Type_scenario vx_copy(final Object... vals);
    public Base.Type_scenario vx_empty();
    public Base.Type_scenario vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_scenario extends Core.Class_base implements Type_scenario {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_scenario vx_new(final Object... vals) {return e_scenario.vx_copy(vals);}

    @Override
    public Type_scenario vx_copy(final Object... vals) {
      Type_scenario output = this;
      boolean ischanged = false;
      Class_scenario val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/scenario", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/scenario", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/scenario", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/scenario", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/scenario", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/scenario", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/scenario", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/scenario", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/scenario", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_scenario work = new Class_scenario();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_scenario vx_empty() {return e_scenario;}
    @Override
    public Type_scenario vx_type() {return t_scenario;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "scenario", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_scenario e_scenario = new Class_scenario();
  public static final Type_scenario t_scenario = new Class_scenario();

  /**
   * type: scenariomap
   * (type scenariomap)
   */
  public interface Type_scenariomap extends Core.Type_map {
    public Base.Type_scenariomap vx_new(final Object... vals);
    public Base.Type_scenariomap vx_copy(final Object... vals);
    public Base.Type_scenariomap vx_empty();
    public Base.Type_scenariomap vx_type();
    public Map<String, Base.Type_scenario> vx_mapscenario();
    public Base.Type_scenario vx_scenario(final Core.Type_string key);
  }

  public static class Class_scenariomap extends Core.Class_base implements Type_scenariomap {

    protected Map<String, Base.Type_scenario> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_scenario>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_scenario vx_scenario(final Core.Type_string key) {
      Base.Type_scenario output = Base.e_scenario;
      Class_scenariomap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_scenario> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_scenario);
      return output;
    }

    @Override
    public Map<String, Base.Type_scenario> vx_mapscenario() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_scenario(key);
    }

    @Override
    public Type_scenariomap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_scenariomap output = new Class_scenariomap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_scenario> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_scenario) {
          Base.Type_scenario castval = (Base.Type_scenario)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/scenariomap", ":invalidvalue", val);
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
    public Type_scenariomap vx_new(final Object... vals) {return e_scenariomap.vx_copy(vals);}

    @Override
    public Type_scenariomap vx_copy(final Object... vals) {
      Type_scenariomap output = this;
      boolean ischanged = false;
      Class_scenariomap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_scenario> mapval = new LinkedHashMap<>(val.vx_mapscenario());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/scenariomap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_scenario valany = null;
          if (valsub instanceof Base.Type_scenario) {
            valany = (Base.Type_scenario)valsub;
          } else if (valsub instanceof Base.Type_scenario) {
            valany = (Base.Type_scenario)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/scenariomap", ":invalidkeyvalue", msgmap);
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
        Class_scenariomap work = new Class_scenariomap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_scenariomap vx_empty() {return e_scenariomap;}
    @Override
    public Type_scenariomap vx_type() {return t_scenariomap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "scenariomap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_scenario), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_scenariomap e_scenariomap = new Class_scenariomap();
  public static final Type_scenariomap t_scenariomap = new Class_scenariomap();

  /**
   * type: section
   * (type section)
   */
  public interface Type_section extends Core.Type_struct, Base.Type_card {
    public Base.Type_section vx_new(final Object... vals);
    public Base.Type_section vx_copy(final Object... vals);
    public Base.Type_section vx_empty();
    public Base.Type_section vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Base.Type_damagemap damagemap();
    public Base.Type_deckmap deckmap();
    public Base.Type_itemmap itemmap();
    public Base.Type_locationmap locationmap();
    public Base.Type_powermap powermap();
    public Base.Type_rulemap rulemap();
    public Base.Type_scenariomap scenariomap();
    public Base.Type_sectionmap sectionmap();
    public Base.Type_skillmap skillmap();
    public Base.Type_suitmap suitmap();
    public Base.Type_terrainmap terrainmap();
    public Base.Type_unitmap unitmap();
    public Base.Type_weaknessmap weaknessmap();
  }

  public static class Class_section extends Core.Class_base implements Type_section {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Base.Type_damagemap vx_p_damagemap;

    @Override
    public Base.Type_damagemap damagemap() {
      return this.vx_p_damagemap == null ? Base.e_damagemap : this.vx_p_damagemap;
    }

    protected Base.Type_deckmap vx_p_deckmap;

    @Override
    public Base.Type_deckmap deckmap() {
      return this.vx_p_deckmap == null ? Base.e_deckmap : this.vx_p_deckmap;
    }

    protected Base.Type_itemmap vx_p_itemmap;

    @Override
    public Base.Type_itemmap itemmap() {
      return this.vx_p_itemmap == null ? Base.e_itemmap : this.vx_p_itemmap;
    }

    protected Base.Type_locationmap vx_p_locationmap;

    @Override
    public Base.Type_locationmap locationmap() {
      return this.vx_p_locationmap == null ? Base.e_locationmap : this.vx_p_locationmap;
    }

    protected Base.Type_powermap vx_p_powermap;

    @Override
    public Base.Type_powermap powermap() {
      return this.vx_p_powermap == null ? Base.e_powermap : this.vx_p_powermap;
    }

    protected Base.Type_rulemap vx_p_rulemap;

    @Override
    public Base.Type_rulemap rulemap() {
      return this.vx_p_rulemap == null ? Base.e_rulemap : this.vx_p_rulemap;
    }

    protected Base.Type_scenariomap vx_p_scenariomap;

    @Override
    public Base.Type_scenariomap scenariomap() {
      return this.vx_p_scenariomap == null ? Base.e_scenariomap : this.vx_p_scenariomap;
    }

    protected Base.Type_sectionmap vx_p_sectionmap;

    @Override
    public Base.Type_sectionmap sectionmap() {
      return this.vx_p_sectionmap == null ? Base.e_sectionmap : this.vx_p_sectionmap;
    }

    protected Base.Type_skillmap vx_p_skillmap;

    @Override
    public Base.Type_skillmap skillmap() {
      return this.vx_p_skillmap == null ? Base.e_skillmap : this.vx_p_skillmap;
    }

    protected Base.Type_suitmap vx_p_suitmap;

    @Override
    public Base.Type_suitmap suitmap() {
      return this.vx_p_suitmap == null ? Base.e_suitmap : this.vx_p_suitmap;
    }

    protected Base.Type_terrainmap vx_p_terrainmap;

    @Override
    public Base.Type_terrainmap terrainmap() {
      return this.vx_p_terrainmap == null ? Base.e_terrainmap : this.vx_p_terrainmap;
    }

    protected Base.Type_unitmap vx_p_unitmap;

    @Override
    public Base.Type_unitmap unitmap() {
      return this.vx_p_unitmap == null ? Base.e_unitmap : this.vx_p_unitmap;
    }

    protected Base.Type_weaknessmap vx_p_weaknessmap;

    @Override
    public Base.Type_weaknessmap weaknessmap() {
      return this.vx_p_weaknessmap == null ? Base.e_weaknessmap : this.vx_p_weaknessmap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":damagemap":
        output = this.damagemap();
        break;
      case ":deckmap":
        output = this.deckmap();
        break;
      case ":itemmap":
        output = this.itemmap();
        break;
      case ":locationmap":
        output = this.locationmap();
        break;
      case ":powermap":
        output = this.powermap();
        break;
      case ":rulemap":
        output = this.rulemap();
        break;
      case ":scenariomap":
        output = this.scenariomap();
        break;
      case ":sectionmap":
        output = this.sectionmap();
        break;
      case ":skillmap":
        output = this.skillmap();
        break;
      case ":suitmap":
        output = this.suitmap();
        break;
      case ":terrainmap":
        output = this.terrainmap();
        break;
      case ":unitmap":
        output = this.unitmap();
        break;
      case ":weaknessmap":
        output = this.weaknessmap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":damagemap", this.damagemap());
      output.put(":deckmap", this.deckmap());
      output.put(":itemmap", this.itemmap());
      output.put(":locationmap", this.locationmap());
      output.put(":powermap", this.powermap());
      output.put(":rulemap", this.rulemap());
      output.put(":scenariomap", this.scenariomap());
      output.put(":sectionmap", this.sectionmap());
      output.put(":skillmap", this.skillmap());
      output.put(":suitmap", this.suitmap());
      output.put(":terrainmap", this.terrainmap());
      output.put(":unitmap", this.unitmap());
      output.put(":weaknessmap", this.weaknessmap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_section vx_new(final Object... vals) {return e_section.vx_copy(vals);}

    @Override
    public Type_section vx_copy(final Object... vals) {
      Type_section output = this;
      boolean ischanged = false;
      Class_section val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Base.Type_damagemap vx_p_damagemap = val.damagemap();
      Base.Type_deckmap vx_p_deckmap = val.deckmap();
      Base.Type_itemmap vx_p_itemmap = val.itemmap();
      Base.Type_locationmap vx_p_locationmap = val.locationmap();
      Base.Type_powermap vx_p_powermap = val.powermap();
      Base.Type_rulemap vx_p_rulemap = val.rulemap();
      Base.Type_scenariomap vx_p_scenariomap = val.scenariomap();
      Base.Type_sectionmap vx_p_sectionmap = val.sectionmap();
      Base.Type_skillmap vx_p_skillmap = val.skillmap();
      Base.Type_suitmap vx_p_suitmap = val.suitmap();
      Base.Type_terrainmap vx_p_terrainmap = val.terrainmap();
      Base.Type_unitmap vx_p_unitmap = val.unitmap();
      Base.Type_weaknessmap vx_p_weaknessmap = val.weaknessmap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":damagemap");
      validkeys.add(":deckmap");
      validkeys.add(":itemmap");
      validkeys.add(":locationmap");
      validkeys.add(":powermap");
      validkeys.add(":rulemap");
      validkeys.add(":scenariomap");
      validkeys.add(":sectionmap");
      validkeys.add(":skillmap");
      validkeys.add(":suitmap");
      validkeys.add(":terrainmap");
      validkeys.add(":unitmap");
      validkeys.add(":weaknessmap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":damagemap":
            if (valsub == vx_p_damagemap) {
            } else if (valsub instanceof Base.Type_damagemap) {
              ischanged = true;
              vx_p_damagemap = (Base.Type_damagemap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("damagemap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":deckmap":
            if (valsub == vx_p_deckmap) {
            } else if (valsub instanceof Base.Type_deckmap) {
              ischanged = true;
              vx_p_deckmap = (Base.Type_deckmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("deckmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":itemmap":
            if (valsub == vx_p_itemmap) {
            } else if (valsub instanceof Base.Type_itemmap) {
              ischanged = true;
              vx_p_itemmap = (Base.Type_itemmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("itemmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":locationmap":
            if (valsub == vx_p_locationmap) {
            } else if (valsub instanceof Base.Type_locationmap) {
              ischanged = true;
              vx_p_locationmap = (Base.Type_locationmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("locationmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":powermap":
            if (valsub == vx_p_powermap) {
            } else if (valsub instanceof Base.Type_powermap) {
              ischanged = true;
              vx_p_powermap = (Base.Type_powermap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("powermap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":rulemap":
            if (valsub == vx_p_rulemap) {
            } else if (valsub instanceof Base.Type_rulemap) {
              ischanged = true;
              vx_p_rulemap = (Base.Type_rulemap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("rulemap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":scenariomap":
            if (valsub == vx_p_scenariomap) {
            } else if (valsub instanceof Base.Type_scenariomap) {
              ischanged = true;
              vx_p_scenariomap = (Base.Type_scenariomap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("scenariomap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":sectionmap":
            if (valsub == vx_p_sectionmap) {
            } else if (valsub instanceof Base.Type_sectionmap) {
              ischanged = true;
              vx_p_sectionmap = (Base.Type_sectionmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("sectionmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":skillmap":
            if (valsub == vx_p_skillmap) {
            } else if (valsub instanceof Base.Type_skillmap) {
              ischanged = true;
              vx_p_skillmap = (Base.Type_skillmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("skillmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":suitmap":
            if (valsub == vx_p_suitmap) {
            } else if (valsub instanceof Base.Type_suitmap) {
              ischanged = true;
              vx_p_suitmap = (Base.Type_suitmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("suitmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":terrainmap":
            if (valsub == vx_p_terrainmap) {
            } else if (valsub instanceof Base.Type_terrainmap) {
              ischanged = true;
              vx_p_terrainmap = (Base.Type_terrainmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("terrainmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unitmap":
            if (valsub == vx_p_unitmap) {
            } else if (valsub instanceof Base.Type_unitmap) {
              ischanged = true;
              vx_p_unitmap = (Base.Type_unitmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unitmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":weaknessmap":
            if (valsub == vx_p_weaknessmap) {
            } else if (valsub instanceof Base.Type_weaknessmap) {
              ischanged = true;
              vx_p_weaknessmap = (Base.Type_weaknessmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("weaknessmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/section", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_section work = new Class_section();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_damagemap = vx_p_damagemap;
        work.vx_p_deckmap = vx_p_deckmap;
        work.vx_p_itemmap = vx_p_itemmap;
        work.vx_p_locationmap = vx_p_locationmap;
        work.vx_p_powermap = vx_p_powermap;
        work.vx_p_rulemap = vx_p_rulemap;
        work.vx_p_scenariomap = vx_p_scenariomap;
        work.vx_p_sectionmap = vx_p_sectionmap;
        work.vx_p_skillmap = vx_p_skillmap;
        work.vx_p_suitmap = vx_p_suitmap;
        work.vx_p_terrainmap = vx_p_terrainmap;
        work.vx_p_unitmap = vx_p_unitmap;
        work.vx_p_weaknessmap = vx_p_weaknessmap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_section vx_empty() {return e_section;}
    @Override
    public Type_section vx_type() {return t_section;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "section", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_section e_section = new Class_section();
  public static final Type_section t_section = new Class_section();

  /**
   * type: sectionmap
   * (type sectionmap)
   */
  public interface Type_sectionmap extends Core.Type_map {
    public Base.Type_sectionmap vx_new(final Object... vals);
    public Base.Type_sectionmap vx_copy(final Object... vals);
    public Base.Type_sectionmap vx_empty();
    public Base.Type_sectionmap vx_type();
    public Map<String, Base.Type_section> vx_mapsection();
    public Base.Type_section vx_section(final Core.Type_string key);
  }

  public static class Class_sectionmap extends Core.Class_base implements Type_sectionmap {

    protected Map<String, Base.Type_section> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_section>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_section vx_section(final Core.Type_string key) {
      Base.Type_section output = Base.e_section;
      Class_sectionmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_section> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_section);
      return output;
    }

    @Override
    public Map<String, Base.Type_section> vx_mapsection() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_section(key);
    }

    @Override
    public Type_sectionmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_sectionmap output = new Class_sectionmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_section> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_section) {
          Base.Type_section castval = (Base.Type_section)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/sectionmap", ":invalidvalue", val);
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
    public Type_sectionmap vx_new(final Object... vals) {return e_sectionmap.vx_copy(vals);}

    @Override
    public Type_sectionmap vx_copy(final Object... vals) {
      Type_sectionmap output = this;
      boolean ischanged = false;
      Class_sectionmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_section> mapval = new LinkedHashMap<>(val.vx_mapsection());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/sectionmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_section valany = null;
          if (valsub instanceof Base.Type_section) {
            valany = (Base.Type_section)valsub;
          } else if (valsub instanceof Base.Type_section) {
            valany = (Base.Type_section)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/sectionmap", ":invalidkeyvalue", msgmap);
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
        Class_sectionmap work = new Class_sectionmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_sectionmap vx_empty() {return e_sectionmap;}
    @Override
    public Type_sectionmap vx_type() {return t_sectionmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "sectionmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_section), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_sectionmap e_sectionmap = new Class_sectionmap();
  public static final Type_sectionmap t_sectionmap = new Class_sectionmap();

  /**
   * type: skill
   * (type skill)
   */
  public interface Type_skill extends Core.Type_struct, Base.Type_card {
    public Base.Type_skill vx_new(final Object... vals);
    public Base.Type_skill vx_copy(final Object... vals);
    public Base.Type_skill vx_empty();
    public Base.Type_skill vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_string stat();
    public Base.Type_abilitymap abilitymap();
    public Base.Type_specialtymap specialtymap();
  }

  public static class Class_skill extends Core.Class_base implements Type_skill {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_string vx_p_stat;

    @Override
    public Core.Type_string stat() {
      return this.vx_p_stat == null ? Core.e_string : this.vx_p_stat;
    }

    protected Base.Type_abilitymap vx_p_abilitymap;

    @Override
    public Base.Type_abilitymap abilitymap() {
      return this.vx_p_abilitymap == null ? Base.e_abilitymap : this.vx_p_abilitymap;
    }

    protected Base.Type_specialtymap vx_p_specialtymap;

    @Override
    public Base.Type_specialtymap specialtymap() {
      return this.vx_p_specialtymap == null ? Base.e_specialtymap : this.vx_p_specialtymap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":stat":
        output = this.stat();
        break;
      case ":abilitymap":
        output = this.abilitymap();
        break;
      case ":specialtymap":
        output = this.specialtymap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":stat", this.stat());
      output.put(":abilitymap", this.abilitymap());
      output.put(":specialtymap", this.specialtymap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_skill vx_new(final Object... vals) {return e_skill.vx_copy(vals);}

    @Override
    public Type_skill vx_copy(final Object... vals) {
      Type_skill output = this;
      boolean ischanged = false;
      Class_skill val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_string vx_p_stat = val.stat();
      Base.Type_abilitymap vx_p_abilitymap = val.abilitymap();
      Base.Type_specialtymap vx_p_specialtymap = val.specialtymap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":stat");
      validkeys.add(":abilitymap");
      validkeys.add(":specialtymap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":stat":
            if (valsub == vx_p_stat) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_stat = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_stat = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("stat"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":abilitymap":
            if (valsub == vx_p_abilitymap) {
            } else if (valsub instanceof Base.Type_abilitymap) {
              ischanged = true;
              vx_p_abilitymap = (Base.Type_abilitymap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("abilitymap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":specialtymap":
            if (valsub == vx_p_specialtymap) {
            } else if (valsub instanceof Base.Type_specialtymap) {
              ischanged = true;
              vx_p_specialtymap = (Base.Type_specialtymap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("specialtymap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/skill", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_skill work = new Class_skill();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_stat = vx_p_stat;
        work.vx_p_abilitymap = vx_p_abilitymap;
        work.vx_p_specialtymap = vx_p_specialtymap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_skill vx_empty() {return e_skill;}
    @Override
    public Type_skill vx_type() {return t_skill;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "skill", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_skill e_skill = new Class_skill();
  public static final Type_skill t_skill = new Class_skill();

  /**
   * type: skillmap
   * (type skillmap)
   */
  public interface Type_skillmap extends Core.Type_map {
    public Base.Type_skillmap vx_new(final Object... vals);
    public Base.Type_skillmap vx_copy(final Object... vals);
    public Base.Type_skillmap vx_empty();
    public Base.Type_skillmap vx_type();
    public Map<String, Base.Type_skill> vx_mapskill();
    public Base.Type_skill vx_skill(final Core.Type_string key);
  }

  public static class Class_skillmap extends Core.Class_base implements Type_skillmap {

    protected Map<String, Base.Type_skill> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_skill>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_skill vx_skill(final Core.Type_string key) {
      Base.Type_skill output = Base.e_skill;
      Class_skillmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_skill> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_skill);
      return output;
    }

    @Override
    public Map<String, Base.Type_skill> vx_mapskill() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_skill(key);
    }

    @Override
    public Type_skillmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_skillmap output = new Class_skillmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_skill> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_skill) {
          Base.Type_skill castval = (Base.Type_skill)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/skillmap", ":invalidvalue", val);
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
    public Type_skillmap vx_new(final Object... vals) {return e_skillmap.vx_copy(vals);}

    @Override
    public Type_skillmap vx_copy(final Object... vals) {
      Type_skillmap output = this;
      boolean ischanged = false;
      Class_skillmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_skill> mapval = new LinkedHashMap<>(val.vx_mapskill());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/skillmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_skill valany = null;
          if (valsub instanceof Base.Type_skill) {
            valany = (Base.Type_skill)valsub;
          } else if (valsub instanceof Base.Type_skill) {
            valany = (Base.Type_skill)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/skillmap", ":invalidkeyvalue", msgmap);
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
        Class_skillmap work = new Class_skillmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_skillmap vx_empty() {return e_skillmap;}
    @Override
    public Type_skillmap vx_type() {return t_skillmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "skillmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_skill), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_skillmap e_skillmap = new Class_skillmap();
  public static final Type_skillmap t_skillmap = new Class_skillmap();

  /**
   * type: specialty
   * (type specialty)
   */
  public interface Type_specialty extends Core.Type_struct, Base.Type_card {
    public Base.Type_specialty vx_new(final Object... vals);
    public Base.Type_specialty vx_copy(final Object... vals);
    public Base.Type_specialty vx_empty();
    public Base.Type_specialty vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_specialty extends Core.Class_base implements Type_specialty {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_specialty vx_new(final Object... vals) {return e_specialty.vx_copy(vals);}

    @Override
    public Type_specialty vx_copy(final Object... vals) {
      Type_specialty output = this;
      boolean ischanged = false;
      Class_specialty val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/specialty", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/specialty", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/specialty", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/specialty", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/specialty", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/specialty", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/specialty", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/specialty", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/specialty", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_specialty work = new Class_specialty();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_specialty vx_empty() {return e_specialty;}
    @Override
    public Type_specialty vx_type() {return t_specialty;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "specialty", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_specialty e_specialty = new Class_specialty();
  public static final Type_specialty t_specialty = new Class_specialty();

  /**
   * type: specialtymap
   * (type specialtymap)
   */
  public interface Type_specialtymap extends Core.Type_map {
    public Base.Type_specialtymap vx_new(final Object... vals);
    public Base.Type_specialtymap vx_copy(final Object... vals);
    public Base.Type_specialtymap vx_empty();
    public Base.Type_specialtymap vx_type();
    public Map<String, Base.Type_specialty> vx_mapspecialty();
    public Base.Type_specialty vx_specialty(final Core.Type_string key);
  }

  public static class Class_specialtymap extends Core.Class_base implements Type_specialtymap {

    protected Map<String, Base.Type_specialty> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_specialty>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_specialty vx_specialty(final Core.Type_string key) {
      Base.Type_specialty output = Base.e_specialty;
      Class_specialtymap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_specialty> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_specialty);
      return output;
    }

    @Override
    public Map<String, Base.Type_specialty> vx_mapspecialty() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_specialty(key);
    }

    @Override
    public Type_specialtymap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_specialtymap output = new Class_specialtymap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_specialty> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_specialty) {
          Base.Type_specialty castval = (Base.Type_specialty)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/specialtymap", ":invalidvalue", val);
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
    public Type_specialtymap vx_new(final Object... vals) {return e_specialtymap.vx_copy(vals);}

    @Override
    public Type_specialtymap vx_copy(final Object... vals) {
      Type_specialtymap output = this;
      boolean ischanged = false;
      Class_specialtymap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_specialty> mapval = new LinkedHashMap<>(val.vx_mapspecialty());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/specialtymap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_specialty valany = null;
          if (valsub instanceof Base.Type_specialty) {
            valany = (Base.Type_specialty)valsub;
          } else if (valsub instanceof Base.Type_specialty) {
            valany = (Base.Type_specialty)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/specialtymap", ":invalidkeyvalue", msgmap);
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
        Class_specialtymap work = new Class_specialtymap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_specialtymap vx_empty() {return e_specialtymap;}
    @Override
    public Type_specialtymap vx_type() {return t_specialtymap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "specialtymap", // name
        ":map", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
        Core.t_typelist.vx_new(Base.t_specialty), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_specialtymap e_specialtymap = new Class_specialtymap();
  public static final Type_specialtymap t_specialtymap = new Class_specialtymap();

  /**
   * type: stat
   * (type stat)
   */
  public interface Type_stat extends Core.Type_struct, Base.Type_card {
    public Base.Type_stat vx_new(final Object... vals);
    public Base.Type_stat vx_copy(final Object... vals);
    public Base.Type_stat vx_empty();
    public Base.Type_stat vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_stat extends Core.Class_base implements Type_stat {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_stat vx_new(final Object... vals) {return e_stat.vx_copy(vals);}

    @Override
    public Type_stat vx_copy(final Object... vals) {
      Type_stat output = this;
      boolean ischanged = false;
      Class_stat val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/stat", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/stat", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/stat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/stat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/stat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/stat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/stat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/stat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/stat", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_stat work = new Class_stat();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_stat vx_empty() {return e_stat;}
    @Override
    public Type_stat vx_type() {return t_stat;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "stat", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_stat e_stat = new Class_stat();
  public static final Type_stat t_stat = new Class_stat();

  /**
   * type: suit
   * (type suit)
   */
  public interface Type_suit extends Core.Type_struct, Base.Type_card {
    public Base.Type_suit vx_new(final Object... vals);
    public Base.Type_suit vx_copy(final Object... vals);
    public Base.Type_suit vx_empty();
    public Base.Type_suit vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_suit extends Core.Class_base implements Type_suit {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_suit vx_new(final Object... vals) {return e_suit.vx_copy(vals);}

    @Override
    public Type_suit vx_copy(final Object... vals) {
      Type_suit output = this;
      boolean ischanged = false;
      Class_suit val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/suit", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/suit", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/suit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/suit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/suit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/suit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/suit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/suit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/suit", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_suit work = new Class_suit();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_suit vx_empty() {return e_suit;}
    @Override
    public Type_suit vx_type() {return t_suit;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "suit", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_suit e_suit = new Class_suit();
  public static final Type_suit t_suit = new Class_suit();

  /**
   * type: suitmap
   * (type suitmap)
   */
  public interface Type_suitmap extends Core.Type_map {
    public Base.Type_suitmap vx_new(final Object... vals);
    public Base.Type_suitmap vx_copy(final Object... vals);
    public Base.Type_suitmap vx_empty();
    public Base.Type_suitmap vx_type();
    public Map<String, Base.Type_suit> vx_mapsuit();
    public Base.Type_suit vx_suit(final Core.Type_string key);
  }

  public static class Class_suitmap extends Core.Class_base implements Type_suitmap {

    protected Map<String, Base.Type_suit> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_suit>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_suit vx_suit(final Core.Type_string key) {
      Base.Type_suit output = Base.e_suit;
      Class_suitmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_suit> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_suit);
      return output;
    }

    @Override
    public Map<String, Base.Type_suit> vx_mapsuit() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_suit(key);
    }

    @Override
    public Type_suitmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_suitmap output = new Class_suitmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_suit> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_suit) {
          Base.Type_suit castval = (Base.Type_suit)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/suitmap", ":invalidvalue", val);
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
    public Type_suitmap vx_new(final Object... vals) {return e_suitmap.vx_copy(vals);}

    @Override
    public Type_suitmap vx_copy(final Object... vals) {
      Type_suitmap output = this;
      boolean ischanged = false;
      Class_suitmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_suit> mapval = new LinkedHashMap<>(val.vx_mapsuit());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/suitmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_suit valany = null;
          if (valsub instanceof Base.Type_suit) {
            valany = (Base.Type_suit)valsub;
          } else if (valsub instanceof Base.Type_suit) {
            valany = (Base.Type_suit)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/suitmap", ":invalidkeyvalue", msgmap);
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
        Class_suitmap work = new Class_suitmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_suitmap vx_empty() {return e_suitmap;}
    @Override
    public Type_suitmap vx_type() {return t_suitmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "suitmap", // name
        ":map", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
        Core.t_typelist.vx_new(Base.t_suit), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_suitmap e_suitmap = new Class_suitmap();
  public static final Type_suitmap t_suitmap = new Class_suitmap();

  /**
   * type: terrain
   * (type terrain)
   */
  public interface Type_terrain extends Core.Type_struct, Base.Type_card {
    public Base.Type_terrain vx_new(final Object... vals);
    public Base.Type_terrain vx_copy(final Object... vals);
    public Base.Type_terrain vx_empty();
    public Base.Type_terrain vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_terrain extends Core.Class_base implements Type_terrain {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_terrain vx_new(final Object... vals) {return e_terrain.vx_copy(vals);}

    @Override
    public Type_terrain vx_copy(final Object... vals) {
      Type_terrain output = this;
      boolean ischanged = false;
      Class_terrain val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/terrain", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/terrain", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/terrain", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/terrain", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/terrain", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/terrain", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/terrain", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/terrain", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/terrain", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_terrain work = new Class_terrain();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_terrain vx_empty() {return e_terrain;}
    @Override
    public Type_terrain vx_type() {return t_terrain;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "terrain", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_terrain e_terrain = new Class_terrain();
  public static final Type_terrain t_terrain = new Class_terrain();

  /**
   * type: terrainmap
   * (type terrainmap)
   */
  public interface Type_terrainmap extends Core.Type_map {
    public Base.Type_terrainmap vx_new(final Object... vals);
    public Base.Type_terrainmap vx_copy(final Object... vals);
    public Base.Type_terrainmap vx_empty();
    public Base.Type_terrainmap vx_type();
    public Map<String, Base.Type_terrain> vx_mapterrain();
    public Base.Type_terrain vx_terrain(final Core.Type_string key);
  }

  public static class Class_terrainmap extends Core.Class_base implements Type_terrainmap {

    protected Map<String, Base.Type_terrain> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_terrain>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_terrain vx_terrain(final Core.Type_string key) {
      Base.Type_terrain output = Base.e_terrain;
      Class_terrainmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_terrain> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_terrain);
      return output;
    }

    @Override
    public Map<String, Base.Type_terrain> vx_mapterrain() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_terrain(key);
    }

    @Override
    public Type_terrainmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_terrainmap output = new Class_terrainmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_terrain> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_terrain) {
          Base.Type_terrain castval = (Base.Type_terrain)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/terrainmap", ":invalidvalue", val);
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
    public Type_terrainmap vx_new(final Object... vals) {return e_terrainmap.vx_copy(vals);}

    @Override
    public Type_terrainmap vx_copy(final Object... vals) {
      Type_terrainmap output = this;
      boolean ischanged = false;
      Class_terrainmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_terrain> mapval = new LinkedHashMap<>(val.vx_mapterrain());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/terrainmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_terrain valany = null;
          if (valsub instanceof Base.Type_terrain) {
            valany = (Base.Type_terrain)valsub;
          } else if (valsub instanceof Base.Type_terrain) {
            valany = (Base.Type_terrain)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/terrainmap", ":invalidkeyvalue", msgmap);
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
        Class_terrainmap work = new Class_terrainmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_terrainmap vx_empty() {return e_terrainmap;}
    @Override
    public Type_terrainmap vx_type() {return t_terrainmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "terrainmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_terrain), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_terrainmap e_terrainmap = new Class_terrainmap();
  public static final Type_terrainmap t_terrainmap = new Class_terrainmap();

  /**
   * type: threat
   * (type threat)
   */
  public interface Type_threat extends Core.Type_struct, Base.Type_card {
    public Base.Type_threat vx_new(final Object... vals);
    public Base.Type_threat vx_copy(final Object... vals);
    public Base.Type_threat vx_empty();
    public Base.Type_threat vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_string description();
    public Core.Type_int progress();
    public Core.Type_int complete();
    public Core.Type_string consequences();
  }

  public static class Class_threat extends Core.Class_base implements Type_threat {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_string vx_p_description;

    @Override
    public Core.Type_string description() {
      return this.vx_p_description == null ? Core.e_string : this.vx_p_description;
    }

    protected Core.Type_int vx_p_progress;

    @Override
    public Core.Type_int progress() {
      return this.vx_p_progress == null ? Core.e_int : this.vx_p_progress;
    }

    protected Core.Type_int vx_p_complete;

    @Override
    public Core.Type_int complete() {
      return this.vx_p_complete == null ? Core.e_int : this.vx_p_complete;
    }

    protected Core.Type_string vx_p_consequences;

    @Override
    public Core.Type_string consequences() {
      return this.vx_p_consequences == null ? Core.e_string : this.vx_p_consequences;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":description":
        output = this.description();
        break;
      case ":progress":
        output = this.progress();
        break;
      case ":complete":
        output = this.complete();
        break;
      case ":consequences":
        output = this.consequences();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":description", this.description());
      output.put(":progress", this.progress());
      output.put(":complete", this.complete());
      output.put(":consequences", this.consequences());
      return Core.immutablemap(output);
    }

    @Override
    public Type_threat vx_new(final Object... vals) {return e_threat.vx_copy(vals);}

    @Override
    public Type_threat vx_copy(final Object... vals) {
      Type_threat output = this;
      boolean ischanged = false;
      Class_threat val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_string vx_p_description = val.description();
      Core.Type_int vx_p_progress = val.progress();
      Core.Type_int vx_p_complete = val.complete();
      Core.Type_string vx_p_consequences = val.consequences();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":description");
      validkeys.add(":progress");
      validkeys.add(":complete");
      validkeys.add(":consequences");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":description":
            if (valsub == vx_p_description) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_description = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_description = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("description"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":progress":
            if (valsub == vx_p_progress) {
            } else if (valsub instanceof Core.Type_int) {
              ischanged = true;
              vx_p_progress = (Core.Type_int)valsub;
            } else if (valsub instanceof Integer) {
              ischanged = true;
              vx_p_progress = Core.t_int.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("progress"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":complete":
            if (valsub == vx_p_complete) {
            } else if (valsub instanceof Core.Type_int) {
              ischanged = true;
              vx_p_complete = (Core.Type_int)valsub;
            } else if (valsub instanceof Integer) {
              ischanged = true;
              vx_p_complete = Core.t_int.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("complete"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":consequences":
            if (valsub == vx_p_consequences) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_consequences = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_consequences = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("consequences"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/threat", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_threat work = new Class_threat();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_description = vx_p_description;
        work.vx_p_progress = vx_p_progress;
        work.vx_p_complete = vx_p_complete;
        work.vx_p_consequences = vx_p_consequences;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_threat vx_empty() {return e_threat;}
    @Override
    public Type_threat vx_type() {return t_threat;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "threat", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_threat e_threat = new Class_threat();
  public static final Type_threat t_threat = new Class_threat();

  /**
   * type: unit
   * (type unit)
   */
  public interface Type_unit extends Core.Type_struct, Base.Type_card {
    public Base.Type_unit vx_new(final Object... vals);
    public Base.Type_unit vx_copy(final Object... vals);
    public Base.Type_unit vx_empty();
    public Base.Type_unit vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_string body();
    public Core.Type_string mind();
    public Core.Type_string will();
    public Core.Type_string speed();
    public Core.Type_string shadow();
    public Core.Type_string beast();
    public Core.Type_string demeanor();
    public Core.Type_string nature();
    public Core.Type_string classification();
    public Core.Type_string crew();
    public Core.Type_string mass();
    public Core.Type_string height();
    public Core.Type_string length();
    public Core.Type_string value();
    public Core.Type_string width();
    public Base.Type_damagelist damagelist();
    public Base.Type_rolemap rolemap();
    public Base.Type_unitpowermap unitpowermap();
    public Base.Type_unitskillmap unitskillmap();
    public Base.Type_unitweaknessmap unitweaknessmap();
  }

  public static class Class_unit extends Core.Class_base implements Type_unit {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_string vx_p_body;

    @Override
    public Core.Type_string body() {
      return this.vx_p_body == null ? Core.e_string : this.vx_p_body;
    }

    protected Core.Type_string vx_p_mind;

    @Override
    public Core.Type_string mind() {
      return this.vx_p_mind == null ? Core.e_string : this.vx_p_mind;
    }

    protected Core.Type_string vx_p_will;

    @Override
    public Core.Type_string will() {
      return this.vx_p_will == null ? Core.e_string : this.vx_p_will;
    }

    protected Core.Type_string vx_p_speed;

    @Override
    public Core.Type_string speed() {
      return this.vx_p_speed == null ? Core.e_string : this.vx_p_speed;
    }

    protected Core.Type_string vx_p_shadow;

    @Override
    public Core.Type_string shadow() {
      return this.vx_p_shadow == null ? Core.e_string : this.vx_p_shadow;
    }

    protected Core.Type_string vx_p_beast;

    @Override
    public Core.Type_string beast() {
      return this.vx_p_beast == null ? Core.e_string : this.vx_p_beast;
    }

    protected Core.Type_string vx_p_demeanor;

    @Override
    public Core.Type_string demeanor() {
      return this.vx_p_demeanor == null ? Core.e_string : this.vx_p_demeanor;
    }

    protected Core.Type_string vx_p_nature;

    @Override
    public Core.Type_string nature() {
      return this.vx_p_nature == null ? Core.e_string : this.vx_p_nature;
    }

    protected Core.Type_string vx_p_classification;

    @Override
    public Core.Type_string classification() {
      return this.vx_p_classification == null ? Core.e_string : this.vx_p_classification;
    }

    protected Core.Type_string vx_p_crew;

    @Override
    public Core.Type_string crew() {
      return this.vx_p_crew == null ? Core.e_string : this.vx_p_crew;
    }

    protected Core.Type_string vx_p_mass;

    @Override
    public Core.Type_string mass() {
      return this.vx_p_mass == null ? Core.e_string : this.vx_p_mass;
    }

    protected Core.Type_string vx_p_height;

    @Override
    public Core.Type_string height() {
      return this.vx_p_height == null ? Core.e_string : this.vx_p_height;
    }

    protected Core.Type_string vx_p_length;

    @Override
    public Core.Type_string length() {
      return this.vx_p_length == null ? Core.e_string : this.vx_p_length;
    }

    protected Core.Type_string vx_p_value;

    @Override
    public Core.Type_string value() {
      return this.vx_p_value == null ? Core.e_string : this.vx_p_value;
    }

    protected Core.Type_string vx_p_width;

    @Override
    public Core.Type_string width() {
      return this.vx_p_width == null ? Core.e_string : this.vx_p_width;
    }

    protected Base.Type_damagelist vx_p_damagelist;

    @Override
    public Base.Type_damagelist damagelist() {
      return this.vx_p_damagelist == null ? Base.e_damagelist : this.vx_p_damagelist;
    }

    protected Base.Type_rolemap vx_p_rolemap;

    @Override
    public Base.Type_rolemap rolemap() {
      return this.vx_p_rolemap == null ? Base.e_rolemap : this.vx_p_rolemap;
    }

    protected Base.Type_unitpowermap vx_p_unitpowermap;

    @Override
    public Base.Type_unitpowermap unitpowermap() {
      return this.vx_p_unitpowermap == null ? Base.e_unitpowermap : this.vx_p_unitpowermap;
    }

    protected Base.Type_unitskillmap vx_p_unitskillmap;

    @Override
    public Base.Type_unitskillmap unitskillmap() {
      return this.vx_p_unitskillmap == null ? Base.e_unitskillmap : this.vx_p_unitskillmap;
    }

    protected Base.Type_unitweaknessmap vx_p_unitweaknessmap;

    @Override
    public Base.Type_unitweaknessmap unitweaknessmap() {
      return this.vx_p_unitweaknessmap == null ? Base.e_unitweaknessmap : this.vx_p_unitweaknessmap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":body":
        output = this.body();
        break;
      case ":mind":
        output = this.mind();
        break;
      case ":will":
        output = this.will();
        break;
      case ":speed":
        output = this.speed();
        break;
      case ":shadow":
        output = this.shadow();
        break;
      case ":beast":
        output = this.beast();
        break;
      case ":demeanor":
        output = this.demeanor();
        break;
      case ":nature":
        output = this.nature();
        break;
      case ":classification":
        output = this.classification();
        break;
      case ":crew":
        output = this.crew();
        break;
      case ":mass":
        output = this.mass();
        break;
      case ":height":
        output = this.height();
        break;
      case ":length":
        output = this.length();
        break;
      case ":value":
        output = this.value();
        break;
      case ":width":
        output = this.width();
        break;
      case ":damagelist":
        output = this.damagelist();
        break;
      case ":rolemap":
        output = this.rolemap();
        break;
      case ":unitpowermap":
        output = this.unitpowermap();
        break;
      case ":unitskillmap":
        output = this.unitskillmap();
        break;
      case ":unitweaknessmap":
        output = this.unitweaknessmap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":body", this.body());
      output.put(":mind", this.mind());
      output.put(":will", this.will());
      output.put(":speed", this.speed());
      output.put(":shadow", this.shadow());
      output.put(":beast", this.beast());
      output.put(":demeanor", this.demeanor());
      output.put(":nature", this.nature());
      output.put(":classification", this.classification());
      output.put(":crew", this.crew());
      output.put(":mass", this.mass());
      output.put(":height", this.height());
      output.put(":length", this.length());
      output.put(":value", this.value());
      output.put(":width", this.width());
      output.put(":damagelist", this.damagelist());
      output.put(":rolemap", this.rolemap());
      output.put(":unitpowermap", this.unitpowermap());
      output.put(":unitskillmap", this.unitskillmap());
      output.put(":unitweaknessmap", this.unitweaknessmap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_unit vx_new(final Object... vals) {return e_unit.vx_copy(vals);}

    @Override
    public Type_unit vx_copy(final Object... vals) {
      Type_unit output = this;
      boolean ischanged = false;
      Class_unit val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_string vx_p_body = val.body();
      Core.Type_string vx_p_mind = val.mind();
      Core.Type_string vx_p_will = val.will();
      Core.Type_string vx_p_speed = val.speed();
      Core.Type_string vx_p_shadow = val.shadow();
      Core.Type_string vx_p_beast = val.beast();
      Core.Type_string vx_p_demeanor = val.demeanor();
      Core.Type_string vx_p_nature = val.nature();
      Core.Type_string vx_p_classification = val.classification();
      Core.Type_string vx_p_crew = val.crew();
      Core.Type_string vx_p_mass = val.mass();
      Core.Type_string vx_p_height = val.height();
      Core.Type_string vx_p_length = val.length();
      Core.Type_string vx_p_value = val.value();
      Core.Type_string vx_p_width = val.width();
      Base.Type_damagelist vx_p_damagelist = val.damagelist();
      Base.Type_rolemap vx_p_rolemap = val.rolemap();
      Base.Type_unitpowermap vx_p_unitpowermap = val.unitpowermap();
      Base.Type_unitskillmap vx_p_unitskillmap = val.unitskillmap();
      Base.Type_unitweaknessmap vx_p_unitweaknessmap = val.unitweaknessmap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":body");
      validkeys.add(":mind");
      validkeys.add(":will");
      validkeys.add(":speed");
      validkeys.add(":shadow");
      validkeys.add(":beast");
      validkeys.add(":demeanor");
      validkeys.add(":nature");
      validkeys.add(":classification");
      validkeys.add(":crew");
      validkeys.add(":mass");
      validkeys.add(":height");
      validkeys.add(":length");
      validkeys.add(":value");
      validkeys.add(":width");
      validkeys.add(":damagelist");
      validkeys.add(":rolemap");
      validkeys.add(":unitpowermap");
      validkeys.add(":unitskillmap");
      validkeys.add(":unitweaknessmap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":body":
            if (valsub == vx_p_body) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_body = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_body = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":mind":
            if (valsub == vx_p_mind) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_mind = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_mind = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("mind"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":will":
            if (valsub == vx_p_will) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_will = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_will = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("will"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":speed":
            if (valsub == vx_p_speed) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_speed = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_speed = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("speed"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":shadow":
            if (valsub == vx_p_shadow) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_shadow = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_shadow = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("shadow"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":beast":
            if (valsub == vx_p_beast) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_beast = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_beast = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("beast"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":demeanor":
            if (valsub == vx_p_demeanor) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_demeanor = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_demeanor = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("demeanor"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":nature":
            if (valsub == vx_p_nature) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_nature = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_nature = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("nature"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":classification":
            if (valsub == vx_p_classification) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_classification = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_classification = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("classification"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":crew":
            if (valsub == vx_p_crew) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_crew = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_crew = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("crew"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":mass":
            if (valsub == vx_p_mass) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_mass = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_mass = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("mass"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":height":
            if (valsub == vx_p_height) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_height = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_height = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("height"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":length":
            if (valsub == vx_p_length) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_length = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_length = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("length"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":value":
            if (valsub == vx_p_value) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_value = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_value = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("value"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":width":
            if (valsub == vx_p_width) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_width = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_width = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("width"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":damagelist":
            if (valsub == vx_p_damagelist) {
            } else if (valsub instanceof Base.Type_damagelist) {
              ischanged = true;
              vx_p_damagelist = (Base.Type_damagelist)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("damagelist"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":rolemap":
            if (valsub == vx_p_rolemap) {
            } else if (valsub instanceof Base.Type_rolemap) {
              ischanged = true;
              vx_p_rolemap = (Base.Type_rolemap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("rolemap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unitpowermap":
            if (valsub == vx_p_unitpowermap) {
            } else if (valsub instanceof Base.Type_unitpowermap) {
              ischanged = true;
              vx_p_unitpowermap = (Base.Type_unitpowermap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unitpowermap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unitskillmap":
            if (valsub == vx_p_unitskillmap) {
            } else if (valsub instanceof Base.Type_unitskillmap) {
              ischanged = true;
              vx_p_unitskillmap = (Base.Type_unitskillmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unitskillmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unitweaknessmap":
            if (valsub == vx_p_unitweaknessmap) {
            } else if (valsub instanceof Base.Type_unitweaknessmap) {
              ischanged = true;
              vx_p_unitweaknessmap = (Base.Type_unitweaknessmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unitweaknessmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/unit", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_unit work = new Class_unit();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_body = vx_p_body;
        work.vx_p_mind = vx_p_mind;
        work.vx_p_will = vx_p_will;
        work.vx_p_speed = vx_p_speed;
        work.vx_p_shadow = vx_p_shadow;
        work.vx_p_beast = vx_p_beast;
        work.vx_p_demeanor = vx_p_demeanor;
        work.vx_p_nature = vx_p_nature;
        work.vx_p_classification = vx_p_classification;
        work.vx_p_crew = vx_p_crew;
        work.vx_p_mass = vx_p_mass;
        work.vx_p_height = vx_p_height;
        work.vx_p_length = vx_p_length;
        work.vx_p_value = vx_p_value;
        work.vx_p_width = vx_p_width;
        work.vx_p_damagelist = vx_p_damagelist;
        work.vx_p_rolemap = vx_p_rolemap;
        work.vx_p_unitpowermap = vx_p_unitpowermap;
        work.vx_p_unitskillmap = vx_p_unitskillmap;
        work.vx_p_unitweaknessmap = vx_p_unitweaknessmap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unit vx_empty() {return e_unit;}
    @Override
    public Type_unit vx_type() {return t_unit;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unit", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_unit e_unit = new Class_unit();
  public static final Type_unit t_unit = new Class_unit();

  /**
   * type: unitability
   * (type unitability)
   */
  public interface Type_unitability extends Core.Type_struct {
    public Base.Type_unitability vx_new(final Object... vals);
    public Base.Type_unitability vx_copy(final Object... vals);
    public Base.Type_unitability vx_empty();
    public Base.Type_unitability vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
  }

  public static class Class_unitability extends Core.Class_base implements Type_unitability {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      return Core.immutablemap(output);
    }

    @Override
    public Type_unitability vx_new(final Object... vals) {return e_unitability.vx_copy(vals);}

    @Override
    public Type_unitability vx_copy(final Object... vals) {
      Type_unitability output = this;
      boolean ischanged = false;
      Class_unitability val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitability", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitability", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitability", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitability", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/unitability", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_unitability work = new Class_unitability();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitability vx_empty() {return e_unitability;}
    @Override
    public Type_unitability vx_type() {return t_unitability;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitability", // name
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

  public static final Type_unitability e_unitability = new Class_unitability();
  public static final Type_unitability t_unitability = new Class_unitability();

  /**
   * type: unitabilitymap
   * (type unitabilitymap)
   */
  public interface Type_unitabilitymap extends Core.Type_map {
    public Base.Type_unitabilitymap vx_new(final Object... vals);
    public Base.Type_unitabilitymap vx_copy(final Object... vals);
    public Base.Type_unitabilitymap vx_empty();
    public Base.Type_unitabilitymap vx_type();
    public Map<String, Base.Type_unitability> vx_mapunitability();
    public Base.Type_unitability vx_unitability(final Core.Type_string key);
  }

  public static class Class_unitabilitymap extends Core.Class_base implements Type_unitabilitymap {

    protected Map<String, Base.Type_unitability> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_unitability>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_unitability vx_unitability(final Core.Type_string key) {
      Base.Type_unitability output = Base.e_unitability;
      Class_unitabilitymap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_unitability> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_unitability);
      return output;
    }

    @Override
    public Map<String, Base.Type_unitability> vx_mapunitability() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_unitability(key);
    }

    @Override
    public Type_unitabilitymap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_unitabilitymap output = new Class_unitabilitymap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_unitability> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_unitability) {
          Base.Type_unitability castval = (Base.Type_unitability)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/unitabilitymap", ":invalidvalue", val);
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
    public Type_unitabilitymap vx_new(final Object... vals) {return e_unitabilitymap.vx_copy(vals);}

    @Override
    public Type_unitabilitymap vx_copy(final Object... vals) {
      Type_unitabilitymap output = this;
      boolean ischanged = false;
      Class_unitabilitymap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_unitability> mapval = new LinkedHashMap<>(val.vx_mapunitability());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitabilitymap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_unitability valany = null;
          if (valsub instanceof Base.Type_unitability) {
            valany = (Base.Type_unitability)valsub;
          } else if (valsub instanceof Base.Type_unitability) {
            valany = (Base.Type_unitability)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitabilitymap", ":invalidkeyvalue", msgmap);
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
        Class_unitabilitymap work = new Class_unitabilitymap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitabilitymap vx_empty() {return e_unitabilitymap;}
    @Override
    public Type_unitabilitymap vx_type() {return t_unitabilitymap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitabilitymap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_unitability), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_unitabilitymap e_unitabilitymap = new Class_unitabilitymap();
  public static final Type_unitabilitymap t_unitabilitymap = new Class_unitabilitymap();

  /**
   * type: unititem
   * (type unititem)
   */
  public interface Type_unititem extends Core.Type_struct, Base.Type_card {
    public Base.Type_unititem vx_new(final Object... vals);
    public Base.Type_unititem vx_copy(final Object... vals);
    public Base.Type_unititem vx_empty();
    public Base.Type_unititem vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_string facing();
    public Core.Type_string number();
    public Core.Type_string value();
  }

  public static class Class_unititem extends Core.Class_base implements Type_unititem {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_string vx_p_facing;

    @Override
    public Core.Type_string facing() {
      return this.vx_p_facing == null ? Core.e_string : this.vx_p_facing;
    }

    protected Core.Type_string vx_p_number;

    @Override
    public Core.Type_string number() {
      return this.vx_p_number == null ? Core.e_string : this.vx_p_number;
    }

    protected Core.Type_string vx_p_value;

    @Override
    public Core.Type_string value() {
      return this.vx_p_value == null ? Core.e_string : this.vx_p_value;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":facing":
        output = this.facing();
        break;
      case ":number":
        output = this.number();
        break;
      case ":value":
        output = this.value();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":facing", this.facing());
      output.put(":number", this.number());
      output.put(":value", this.value());
      return Core.immutablemap(output);
    }

    @Override
    public Type_unititem vx_new(final Object... vals) {return e_unititem.vx_copy(vals);}

    @Override
    public Type_unititem vx_copy(final Object... vals) {
      Type_unititem output = this;
      boolean ischanged = false;
      Class_unititem val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_string vx_p_facing = val.facing();
      Core.Type_string vx_p_number = val.number();
      Core.Type_string vx_p_value = val.value();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":facing");
      validkeys.add(":number");
      validkeys.add(":value");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":facing":
            if (valsub == vx_p_facing) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_facing = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_facing = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("facing"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":number":
            if (valsub == vx_p_number) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_number = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_number = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("number"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":value":
            if (valsub == vx_p_value) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_value = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_value = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("value"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/unititem", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_unititem work = new Class_unititem();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_facing = vx_p_facing;
        work.vx_p_number = vx_p_number;
        work.vx_p_value = vx_p_value;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unititem vx_empty() {return e_unititem;}
    @Override
    public Type_unititem vx_type() {return t_unititem;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unititem", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_unititem e_unititem = new Class_unititem();
  public static final Type_unititem t_unititem = new Class_unititem();

  /**
   * type: unititemmap
   * (type unititemmap)
   */
  public interface Type_unititemmap extends Core.Type_map {
    public Base.Type_unititemmap vx_new(final Object... vals);
    public Base.Type_unititemmap vx_copy(final Object... vals);
    public Base.Type_unititemmap vx_empty();
    public Base.Type_unititemmap vx_type();
    public Map<String, Base.Type_unititem> vx_mapunititem();
    public Base.Type_unititem vx_unititem(final Core.Type_string key);
  }

  public static class Class_unititemmap extends Core.Class_base implements Type_unititemmap {

    protected Map<String, Base.Type_unititem> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_unititem>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_unititem vx_unititem(final Core.Type_string key) {
      Base.Type_unititem output = Base.e_unititem;
      Class_unititemmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_unititem> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_unititem);
      return output;
    }

    @Override
    public Map<String, Base.Type_unititem> vx_mapunititem() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_unititem(key);
    }

    @Override
    public Type_unititemmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_unititemmap output = new Class_unititemmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_unititem> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_unititem) {
          Base.Type_unititem castval = (Base.Type_unititem)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/unititemmap", ":invalidvalue", val);
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
    public Type_unititemmap vx_new(final Object... vals) {return e_unititemmap.vx_copy(vals);}

    @Override
    public Type_unititemmap vx_copy(final Object... vals) {
      Type_unititemmap output = this;
      boolean ischanged = false;
      Class_unititemmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_unititem> mapval = new LinkedHashMap<>(val.vx_mapunititem());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unititemmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_unititem valany = null;
          if (valsub instanceof Base.Type_unititem) {
            valany = (Base.Type_unititem)valsub;
          } else if (valsub instanceof Base.Type_unititem) {
            valany = (Base.Type_unititem)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unititemmap", ":invalidkeyvalue", msgmap);
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
        Class_unititemmap work = new Class_unititemmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unititemmap vx_empty() {return e_unititemmap;}
    @Override
    public Type_unititemmap vx_type() {return t_unititemmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unititemmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_unititem), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_unititemmap e_unititemmap = new Class_unititemmap();
  public static final Type_unititemmap t_unititemmap = new Class_unititemmap();

  /**
   * type: unitmap
   * (type unitmap)
   */
  public interface Type_unitmap extends Core.Type_map {
    public Base.Type_unitmap vx_new(final Object... vals);
    public Base.Type_unitmap vx_copy(final Object... vals);
    public Base.Type_unitmap vx_empty();
    public Base.Type_unitmap vx_type();
    public Map<String, Base.Type_unit> vx_mapunit();
    public Base.Type_unit vx_unit(final Core.Type_string key);
  }

  public static class Class_unitmap extends Core.Class_base implements Type_unitmap {

    protected Map<String, Base.Type_unit> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_unit>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_unit vx_unit(final Core.Type_string key) {
      Base.Type_unit output = Base.e_unit;
      Class_unitmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_unit> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_unit);
      return output;
    }

    @Override
    public Map<String, Base.Type_unit> vx_mapunit() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_unit(key);
    }

    @Override
    public Type_unitmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_unitmap output = new Class_unitmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_unit> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_unit) {
          Base.Type_unit castval = (Base.Type_unit)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/unitmap", ":invalidvalue", val);
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
    public Type_unitmap vx_new(final Object... vals) {return e_unitmap.vx_copy(vals);}

    @Override
    public Type_unitmap vx_copy(final Object... vals) {
      Type_unitmap output = this;
      boolean ischanged = false;
      Class_unitmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_unit> mapval = new LinkedHashMap<>(val.vx_mapunit());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_unit valany = null;
          if (valsub instanceof Base.Type_unit) {
            valany = (Base.Type_unit)valsub;
          } else if (valsub instanceof Base.Type_unit) {
            valany = (Base.Type_unit)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitmap", ":invalidkeyvalue", msgmap);
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
        Class_unitmap work = new Class_unitmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitmap vx_empty() {return e_unitmap;}
    @Override
    public Type_unitmap vx_type() {return t_unitmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_unit), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_unitmap e_unitmap = new Class_unitmap();
  public static final Type_unitmap t_unitmap = new Class_unitmap();

  /**
   * type: unitpower
   * (type unitpower)
   */
  public interface Type_unitpower extends Core.Type_struct, Base.Type_card {
    public Base.Type_unitpower vx_new(final Object... vals);
    public Base.Type_unitpower vx_copy(final Object... vals);
    public Base.Type_unitpower vx_empty();
    public Base.Type_unitpower vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_string level();
    public Base.Type_power power();
    public Core.Type_string front();
    public Core.Type_string back();
    public Core.Type_string over();
    public Core.Type_string under();
    public Core.Type_string side();
    public Core.Type_string strength();
    public Base.Type_unitabilitymap unitabilitymap();
    public Base.Type_unititemmap unititemmap();
    public Base.Type_unitspecialtymap unitspecialtymap();
  }

  public static class Class_unitpower extends Core.Class_base implements Type_unitpower {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_string vx_p_level;

    @Override
    public Core.Type_string level() {
      return this.vx_p_level == null ? Core.e_string : this.vx_p_level;
    }

    protected Base.Type_power vx_p_power;

    @Override
    public Base.Type_power power() {
      return this.vx_p_power == null ? Base.e_power : this.vx_p_power;
    }

    protected Core.Type_string vx_p_front;

    @Override
    public Core.Type_string front() {
      return this.vx_p_front == null ? Core.e_string : this.vx_p_front;
    }

    protected Core.Type_string vx_p_back;

    @Override
    public Core.Type_string back() {
      return this.vx_p_back == null ? Core.e_string : this.vx_p_back;
    }

    protected Core.Type_string vx_p_over;

    @Override
    public Core.Type_string over() {
      return this.vx_p_over == null ? Core.e_string : this.vx_p_over;
    }

    protected Core.Type_string vx_p_under;

    @Override
    public Core.Type_string under() {
      return this.vx_p_under == null ? Core.e_string : this.vx_p_under;
    }

    protected Core.Type_string vx_p_side;

    @Override
    public Core.Type_string side() {
      return this.vx_p_side == null ? Core.e_string : this.vx_p_side;
    }

    protected Core.Type_string vx_p_strength;

    @Override
    public Core.Type_string strength() {
      return this.vx_p_strength == null ? Core.e_string : this.vx_p_strength;
    }

    protected Base.Type_unitabilitymap vx_p_unitabilitymap;

    @Override
    public Base.Type_unitabilitymap unitabilitymap() {
      return this.vx_p_unitabilitymap == null ? Base.e_unitabilitymap : this.vx_p_unitabilitymap;
    }

    protected Base.Type_unititemmap vx_p_unititemmap;

    @Override
    public Base.Type_unititemmap unititemmap() {
      return this.vx_p_unititemmap == null ? Base.e_unititemmap : this.vx_p_unititemmap;
    }

    protected Base.Type_unitspecialtymap vx_p_unitspecialtymap;

    @Override
    public Base.Type_unitspecialtymap unitspecialtymap() {
      return this.vx_p_unitspecialtymap == null ? Base.e_unitspecialtymap : this.vx_p_unitspecialtymap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":level":
        output = this.level();
        break;
      case ":power":
        output = this.power();
        break;
      case ":front":
        output = this.front();
        break;
      case ":back":
        output = this.back();
        break;
      case ":over":
        output = this.over();
        break;
      case ":under":
        output = this.under();
        break;
      case ":side":
        output = this.side();
        break;
      case ":strength":
        output = this.strength();
        break;
      case ":unitabilitymap":
        output = this.unitabilitymap();
        break;
      case ":unititemmap":
        output = this.unititemmap();
        break;
      case ":unitspecialtymap":
        output = this.unitspecialtymap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":level", this.level());
      output.put(":power", this.power());
      output.put(":front", this.front());
      output.put(":back", this.back());
      output.put(":over", this.over());
      output.put(":under", this.under());
      output.put(":side", this.side());
      output.put(":strength", this.strength());
      output.put(":unitabilitymap", this.unitabilitymap());
      output.put(":unititemmap", this.unititemmap());
      output.put(":unitspecialtymap", this.unitspecialtymap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_unitpower vx_new(final Object... vals) {return e_unitpower.vx_copy(vals);}

    @Override
    public Type_unitpower vx_copy(final Object... vals) {
      Type_unitpower output = this;
      boolean ischanged = false;
      Class_unitpower val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_string vx_p_level = val.level();
      Base.Type_power vx_p_power = val.power();
      Core.Type_string vx_p_front = val.front();
      Core.Type_string vx_p_back = val.back();
      Core.Type_string vx_p_over = val.over();
      Core.Type_string vx_p_under = val.under();
      Core.Type_string vx_p_side = val.side();
      Core.Type_string vx_p_strength = val.strength();
      Base.Type_unitabilitymap vx_p_unitabilitymap = val.unitabilitymap();
      Base.Type_unititemmap vx_p_unititemmap = val.unititemmap();
      Base.Type_unitspecialtymap vx_p_unitspecialtymap = val.unitspecialtymap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":level");
      validkeys.add(":power");
      validkeys.add(":front");
      validkeys.add(":back");
      validkeys.add(":over");
      validkeys.add(":under");
      validkeys.add(":side");
      validkeys.add(":strength");
      validkeys.add(":unitabilitymap");
      validkeys.add(":unititemmap");
      validkeys.add(":unitspecialtymap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":level":
            if (valsub == vx_p_level) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_level = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_level = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("level"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":power":
            if (valsub == vx_p_power) {
            } else if (valsub instanceof Base.Type_power) {
              ischanged = true;
              vx_p_power = (Base.Type_power)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("power"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":front":
            if (valsub == vx_p_front) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_front = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_front = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("front"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":back":
            if (valsub == vx_p_back) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_back = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_back = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("back"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":over":
            if (valsub == vx_p_over) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_over = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_over = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("over"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":under":
            if (valsub == vx_p_under) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_under = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_under = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("under"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":side":
            if (valsub == vx_p_side) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_side = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_side = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("side"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":strength":
            if (valsub == vx_p_strength) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_strength = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_strength = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("strength"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unitabilitymap":
            if (valsub == vx_p_unitabilitymap) {
            } else if (valsub instanceof Base.Type_unitabilitymap) {
              ischanged = true;
              vx_p_unitabilitymap = (Base.Type_unitabilitymap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unitabilitymap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unititemmap":
            if (valsub == vx_p_unititemmap) {
            } else if (valsub instanceof Base.Type_unititemmap) {
              ischanged = true;
              vx_p_unititemmap = (Base.Type_unititemmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unititemmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unitspecialtymap":
            if (valsub == vx_p_unitspecialtymap) {
            } else if (valsub instanceof Base.Type_unitspecialtymap) {
              ischanged = true;
              vx_p_unitspecialtymap = (Base.Type_unitspecialtymap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unitspecialtymap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/unitpower", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_unitpower work = new Class_unitpower();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_level = vx_p_level;
        work.vx_p_power = vx_p_power;
        work.vx_p_front = vx_p_front;
        work.vx_p_back = vx_p_back;
        work.vx_p_over = vx_p_over;
        work.vx_p_under = vx_p_under;
        work.vx_p_side = vx_p_side;
        work.vx_p_strength = vx_p_strength;
        work.vx_p_unitabilitymap = vx_p_unitabilitymap;
        work.vx_p_unititemmap = vx_p_unititemmap;
        work.vx_p_unitspecialtymap = vx_p_unitspecialtymap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitpower vx_empty() {return e_unitpower;}
    @Override
    public Type_unitpower vx_type() {return t_unitpower;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitpower", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_unitpower e_unitpower = new Class_unitpower();
  public static final Type_unitpower t_unitpower = new Class_unitpower();

  /**
   * type: unitpowermap
   * (type unitpowermap)
   */
  public interface Type_unitpowermap extends Core.Type_map {
    public Base.Type_unitpowermap vx_new(final Object... vals);
    public Base.Type_unitpowermap vx_copy(final Object... vals);
    public Base.Type_unitpowermap vx_empty();
    public Base.Type_unitpowermap vx_type();
    public Map<String, Base.Type_unitpower> vx_mapunitpower();
    public Base.Type_unitpower vx_unitpower(final Core.Type_string key);
  }

  public static class Class_unitpowermap extends Core.Class_base implements Type_unitpowermap {

    protected Map<String, Base.Type_unitpower> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_unitpower>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_unitpower vx_unitpower(final Core.Type_string key) {
      Base.Type_unitpower output = Base.e_unitpower;
      Class_unitpowermap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_unitpower> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_unitpower);
      return output;
    }

    @Override
    public Map<String, Base.Type_unitpower> vx_mapunitpower() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_unitpower(key);
    }

    @Override
    public Type_unitpowermap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_unitpowermap output = new Class_unitpowermap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_unitpower> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_unitpower) {
          Base.Type_unitpower castval = (Base.Type_unitpower)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/unitpowermap", ":invalidvalue", val);
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
    public Type_unitpowermap vx_new(final Object... vals) {return e_unitpowermap.vx_copy(vals);}

    @Override
    public Type_unitpowermap vx_copy(final Object... vals) {
      Type_unitpowermap output = this;
      boolean ischanged = false;
      Class_unitpowermap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_unitpower> mapval = new LinkedHashMap<>(val.vx_mapunitpower());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitpowermap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_unitpower valany = null;
          if (valsub instanceof Base.Type_unitpower) {
            valany = (Base.Type_unitpower)valsub;
          } else if (valsub instanceof Base.Type_unitpower) {
            valany = (Base.Type_unitpower)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitpowermap", ":invalidkeyvalue", msgmap);
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
        Class_unitpowermap work = new Class_unitpowermap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitpowermap vx_empty() {return e_unitpowermap;}
    @Override
    public Type_unitpowermap vx_type() {return t_unitpowermap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitpowermap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_unitpower), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_unitpowermap e_unitpowermap = new Class_unitpowermap();
  public static final Type_unitpowermap t_unitpowermap = new Class_unitpowermap();

  /**
   * type: unitskill
   * (type unitskill)
   */
  public interface Type_unitskill extends Core.Type_struct, Base.Type_card {
    public Base.Type_unitskill vx_new(final Object... vals);
    public Base.Type_unitskill vx_copy(final Object... vals);
    public Base.Type_unitskill vx_empty();
    public Base.Type_unitskill vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
    public Core.Type_string level();
    public Base.Type_skill skill();
    public Base.Type_unitabilitymap unitabilitymap();
    public Base.Type_unititemmap unititemmap();
    public Base.Type_unitspecialtymap unitspecialtymap();
  }

  public static class Class_unitskill extends Core.Class_base implements Type_unitskill {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    protected Core.Type_string vx_p_level;

    @Override
    public Core.Type_string level() {
      return this.vx_p_level == null ? Core.e_string : this.vx_p_level;
    }

    protected Base.Type_skill vx_p_skill;

    @Override
    public Base.Type_skill skill() {
      return this.vx_p_skill == null ? Base.e_skill : this.vx_p_skill;
    }

    protected Base.Type_unitabilitymap vx_p_unitabilitymap;

    @Override
    public Base.Type_unitabilitymap unitabilitymap() {
      return this.vx_p_unitabilitymap == null ? Base.e_unitabilitymap : this.vx_p_unitabilitymap;
    }

    protected Base.Type_unititemmap vx_p_unititemmap;

    @Override
    public Base.Type_unititemmap unititemmap() {
      return this.vx_p_unititemmap == null ? Base.e_unititemmap : this.vx_p_unititemmap;
    }

    protected Base.Type_unitspecialtymap vx_p_unitspecialtymap;

    @Override
    public Base.Type_unitspecialtymap unitspecialtymap() {
      return this.vx_p_unitspecialtymap == null ? Base.e_unitspecialtymap : this.vx_p_unitspecialtymap;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
        break;
      case ":orientation":
        output = this.orientation();
        break;
      case ":level":
        output = this.level();
        break;
      case ":skill":
        output = this.skill();
        break;
      case ":unitabilitymap":
        output = this.unitabilitymap();
        break;
      case ":unititemmap":
        output = this.unititemmap();
        break;
      case ":unitspecialtymap":
        output = this.unitspecialtymap();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      output.put(":level", this.level());
      output.put(":skill", this.skill());
      output.put(":unitabilitymap", this.unitabilitymap());
      output.put(":unititemmap", this.unititemmap());
      output.put(":unitspecialtymap", this.unitspecialtymap());
      return Core.immutablemap(output);
    }

    @Override
    public Type_unitskill vx_new(final Object... vals) {return e_unitskill.vx_copy(vals);}

    @Override
    public Type_unitskill vx_copy(final Object... vals) {
      Type_unitskill output = this;
      boolean ischanged = false;
      Class_unitskill val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      Core.Type_string vx_p_level = val.level();
      Base.Type_skill vx_p_skill = val.skill();
      Base.Type_unitabilitymap vx_p_unitabilitymap = val.unitabilitymap();
      Base.Type_unititemmap vx_p_unititemmap = val.unititemmap();
      Base.Type_unitspecialtymap vx_p_unitspecialtymap = val.unitspecialtymap();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
      validkeys.add(":orientation");
      validkeys.add(":level");
      validkeys.add(":skill");
      validkeys.add(":unitabilitymap");
      validkeys.add(":unititemmap");
      validkeys.add(":unitspecialtymap");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":level":
            if (valsub == vx_p_level) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_level = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_level = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("level"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":skill":
            if (valsub == vx_p_skill) {
            } else if (valsub instanceof Base.Type_skill) {
              ischanged = true;
              vx_p_skill = (Base.Type_skill)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("skill"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unitabilitymap":
            if (valsub == vx_p_unitabilitymap) {
            } else if (valsub instanceof Base.Type_unitabilitymap) {
              ischanged = true;
              vx_p_unitabilitymap = (Base.Type_unitabilitymap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unitabilitymap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unititemmap":
            if (valsub == vx_p_unititemmap) {
            } else if (valsub instanceof Base.Type_unititemmap) {
              ischanged = true;
              vx_p_unititemmap = (Base.Type_unititemmap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unititemmap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":unitspecialtymap":
            if (valsub == vx_p_unitspecialtymap) {
            } else if (valsub instanceof Base.Type_unitspecialtymap) {
              ischanged = true;
              vx_p_unitspecialtymap = (Base.Type_unitspecialtymap)valsub;
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("unitspecialtymap"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/unitskill", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_unitskill work = new Class_unitskill();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        work.vx_p_level = vx_p_level;
        work.vx_p_skill = vx_p_skill;
        work.vx_p_unitabilitymap = vx_p_unitabilitymap;
        work.vx_p_unititemmap = vx_p_unititemmap;
        work.vx_p_unitspecialtymap = vx_p_unitspecialtymap;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitskill vx_empty() {return e_unitskill;}
    @Override
    public Type_unitskill vx_type() {return t_unitskill;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitskill", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_unitskill e_unitskill = new Class_unitskill();
  public static final Type_unitskill t_unitskill = new Class_unitskill();

  /**
   * type: unitskillmap
   * (type unitskillmap)
   */
  public interface Type_unitskillmap extends Core.Type_map {
    public Base.Type_unitskillmap vx_new(final Object... vals);
    public Base.Type_unitskillmap vx_copy(final Object... vals);
    public Base.Type_unitskillmap vx_empty();
    public Base.Type_unitskillmap vx_type();
    public Map<String, Base.Type_unitskill> vx_mapunitskill();
    public Base.Type_unitskill vx_unitskill(final Core.Type_string key);
  }

  public static class Class_unitskillmap extends Core.Class_base implements Type_unitskillmap {

    protected Map<String, Base.Type_unitskill> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_unitskill>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_unitskill vx_unitskill(final Core.Type_string key) {
      Base.Type_unitskill output = Base.e_unitskill;
      Class_unitskillmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_unitskill> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_unitskill);
      return output;
    }

    @Override
    public Map<String, Base.Type_unitskill> vx_mapunitskill() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_unitskill(key);
    }

    @Override
    public Type_unitskillmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_unitskillmap output = new Class_unitskillmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_unitskill> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_unitskill) {
          Base.Type_unitskill castval = (Base.Type_unitskill)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/unitskillmap", ":invalidvalue", val);
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
    public Type_unitskillmap vx_new(final Object... vals) {return e_unitskillmap.vx_copy(vals);}

    @Override
    public Type_unitskillmap vx_copy(final Object... vals) {
      Type_unitskillmap output = this;
      boolean ischanged = false;
      Class_unitskillmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_unitskill> mapval = new LinkedHashMap<>(val.vx_mapunitskill());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitskillmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_unitskill valany = null;
          if (valsub instanceof Base.Type_unitskill) {
            valany = (Base.Type_unitskill)valsub;
          } else if (valsub instanceof Base.Type_unitskill) {
            valany = (Base.Type_unitskill)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitskillmap", ":invalidkeyvalue", msgmap);
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
        Class_unitskillmap work = new Class_unitskillmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitskillmap vx_empty() {return e_unitskillmap;}
    @Override
    public Type_unitskillmap vx_type() {return t_unitskillmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitskillmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_unitskill), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_unitskillmap e_unitskillmap = new Class_unitskillmap();
  public static final Type_unitskillmap t_unitskillmap = new Class_unitskillmap();

  /**
   * type: unitspecialty
   * (type unitspecialty)
   */
  public interface Type_unitspecialty extends Core.Type_struct {
    public Base.Type_unitspecialty vx_new(final Object... vals);
    public Base.Type_unitspecialty vx_copy(final Object... vals);
    public Base.Type_unitspecialty vx_empty();
    public Base.Type_unitspecialty vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
  }

  public static class Class_unitspecialty extends Core.Class_base implements Type_unitspecialty {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> output = new LinkedHashMap<>();
      output.put(":name", this.name());
      output.put(":image", this.image());
      return Core.immutablemap(output);
    }

    @Override
    public Type_unitspecialty vx_new(final Object... vals) {return e_unitspecialty.vx_copy(vals);}

    @Override
    public Type_unitspecialty vx_copy(final Object... vals) {
      Type_unitspecialty output = this;
      boolean ischanged = false;
      Class_unitspecialty val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitspecialty", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitspecialty", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitspecialty", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitspecialty", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/unitspecialty", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_unitspecialty work = new Class_unitspecialty();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitspecialty vx_empty() {return e_unitspecialty;}
    @Override
    public Type_unitspecialty vx_type() {return t_unitspecialty;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitspecialty", // name
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

  public static final Type_unitspecialty e_unitspecialty = new Class_unitspecialty();
  public static final Type_unitspecialty t_unitspecialty = new Class_unitspecialty();

  /**
   * type: unitspecialtymap
   * (type unitspecialtymap)
   */
  public interface Type_unitspecialtymap extends Core.Type_map {
    public Base.Type_unitspecialtymap vx_new(final Object... vals);
    public Base.Type_unitspecialtymap vx_copy(final Object... vals);
    public Base.Type_unitspecialtymap vx_empty();
    public Base.Type_unitspecialtymap vx_type();
    public Map<String, Base.Type_unitspecialty> vx_mapunitspecialty();
    public Base.Type_unitspecialty vx_unitspecialty(final Core.Type_string key);
  }

  public static class Class_unitspecialtymap extends Core.Class_base implements Type_unitspecialtymap {

    protected Map<String, Base.Type_unitspecialty> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_unitspecialty>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_unitspecialty vx_unitspecialty(final Core.Type_string key) {
      Base.Type_unitspecialty output = Base.e_unitspecialty;
      Class_unitspecialtymap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_unitspecialty> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_unitspecialty);
      return output;
    }

    @Override
    public Map<String, Base.Type_unitspecialty> vx_mapunitspecialty() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_unitspecialty(key);
    }

    @Override
    public Type_unitspecialtymap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_unitspecialtymap output = new Class_unitspecialtymap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_unitspecialty> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_unitspecialty) {
          Base.Type_unitspecialty castval = (Base.Type_unitspecialty)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/unitspecialtymap", ":invalidvalue", val);
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
    public Type_unitspecialtymap vx_new(final Object... vals) {return e_unitspecialtymap.vx_copy(vals);}

    @Override
    public Type_unitspecialtymap vx_copy(final Object... vals) {
      Type_unitspecialtymap output = this;
      boolean ischanged = false;
      Class_unitspecialtymap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_unitspecialty> mapval = new LinkedHashMap<>(val.vx_mapunitspecialty());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitspecialtymap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_unitspecialty valany = null;
          if (valsub instanceof Base.Type_unitspecialty) {
            valany = (Base.Type_unitspecialty)valsub;
          } else if (valsub instanceof Base.Type_unitspecialty) {
            valany = (Base.Type_unitspecialty)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitspecialtymap", ":invalidkeyvalue", msgmap);
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
        Class_unitspecialtymap work = new Class_unitspecialtymap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitspecialtymap vx_empty() {return e_unitspecialtymap;}
    @Override
    public Type_unitspecialtymap vx_type() {return t_unitspecialtymap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitspecialtymap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_unitspecialty), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_unitspecialtymap e_unitspecialtymap = new Class_unitspecialtymap();
  public static final Type_unitspecialtymap t_unitspecialtymap = new Class_unitspecialtymap();

  /**
   * type: unitweakness
   * (type unitweakness)
   */
  public interface Type_unitweakness extends Core.Type_struct, Base.Type_card {
    public Base.Type_unitweakness vx_new(final Object... vals);
    public Base.Type_unitweakness vx_copy(final Object... vals);
    public Base.Type_unitweakness vx_empty();
    public Base.Type_unitweakness vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_unitweakness extends Core.Class_base implements Type_unitweakness {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_unitweakness vx_new(final Object... vals) {return e_unitweakness.vx_copy(vals);}

    @Override
    public Type_unitweakness vx_copy(final Object... vals) {
      Type_unitweakness output = this;
      boolean ischanged = false;
      Class_unitweakness val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitweakness", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitweakness", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitweakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitweakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitweakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitweakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/unitweakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/unitweakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/unitweakness", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_unitweakness work = new Class_unitweakness();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitweakness vx_empty() {return e_unitweakness;}
    @Override
    public Type_unitweakness vx_type() {return t_unitweakness;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitweakness", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_unitweakness e_unitweakness = new Class_unitweakness();
  public static final Type_unitweakness t_unitweakness = new Class_unitweakness();

  /**
   * type: unitweaknessmap
   * (type unitweaknessmap)
   */
  public interface Type_unitweaknessmap extends Core.Type_map {
    public Base.Type_unitweaknessmap vx_new(final Object... vals);
    public Base.Type_unitweaknessmap vx_copy(final Object... vals);
    public Base.Type_unitweaknessmap vx_empty();
    public Base.Type_unitweaknessmap vx_type();
    public Map<String, Base.Type_unitweakness> vx_mapunitweakness();
    public Base.Type_unitweakness vx_unitweakness(final Core.Type_string key);
  }

  public static class Class_unitweaknessmap extends Core.Class_base implements Type_unitweaknessmap {

    protected Map<String, Base.Type_unitweakness> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_unitweakness>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_unitweakness vx_unitweakness(final Core.Type_string key) {
      Base.Type_unitweakness output = Base.e_unitweakness;
      Class_unitweaknessmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_unitweakness> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_unitweakness);
      return output;
    }

    @Override
    public Map<String, Base.Type_unitweakness> vx_mapunitweakness() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_unitweakness(key);
    }

    @Override
    public Type_unitweaknessmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_unitweaknessmap output = new Class_unitweaknessmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_unitweakness> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_unitweakness) {
          Base.Type_unitweakness castval = (Base.Type_unitweakness)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/unitweaknessmap", ":invalidvalue", val);
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
    public Type_unitweaknessmap vx_new(final Object... vals) {return e_unitweaknessmap.vx_copy(vals);}

    @Override
    public Type_unitweaknessmap vx_copy(final Object... vals) {
      Type_unitweaknessmap output = this;
      boolean ischanged = false;
      Class_unitweaknessmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_unitweakness> mapval = new LinkedHashMap<>(val.vx_mapunitweakness());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitweaknessmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_unitweakness valany = null;
          if (valsub instanceof Base.Type_unitweakness) {
            valany = (Base.Type_unitweakness)valsub;
          } else if (valsub instanceof Base.Type_unitweakness) {
            valany = (Base.Type_unitweakness)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/unitweaknessmap", ":invalidkeyvalue", msgmap);
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
        Class_unitweaknessmap work = new Class_unitweaknessmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_unitweaknessmap vx_empty() {return e_unitweaknessmap;}
    @Override
    public Type_unitweaknessmap vx_type() {return t_unitweaknessmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "unitweaknessmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_unitweakness), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_unitweaknessmap e_unitweaknessmap = new Class_unitweaknessmap();
  public static final Type_unitweaknessmap t_unitweaknessmap = new Class_unitweaknessmap();

  /**
   * type: weakness
   * (type weakness)
   */
  public interface Type_weakness extends Core.Type_struct, Base.Type_card {
    public Base.Type_weakness vx_new(final Object... vals);
    public Base.Type_weakness vx_copy(final Object... vals);
    public Base.Type_weakness vx_empty();
    public Base.Type_weakness vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_weakness extends Core.Class_base implements Type_weakness {

    protected Core.Type_string vx_p_name;

    @Override
    public Core.Type_string name() {
      return this.vx_p_name == null ? Core.e_string : this.vx_p_name;
    }

    protected Core.Type_string vx_p_image;

    @Override
    public Core.Type_string image() {
      return this.vx_p_image == null ? Core.e_string : this.vx_p_image;
    }

    protected Core.Type_string vx_p_reference;

    @Override
    public Core.Type_string reference() {
      return this.vx_p_reference == null ? Core.e_string : this.vx_p_reference;
    }

    protected Core.Type_string vx_p_summary;

    @Override
    public Core.Type_string summary() {
      return this.vx_p_summary == null ? Core.e_string : this.vx_p_summary;
    }

    protected Core.Type_string vx_p_titles;

    @Override
    public Core.Type_string titles() {
      return this.vx_p_titles == null ? Core.e_string : this.vx_p_titles;
    }

    protected Core.Type_string vx_p_orientation;

    @Override
    public Core.Type_string orientation() {
      return this.vx_p_orientation == null ? Core.e_string : this.vx_p_orientation;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      switch (skey) {
      case ":name":
        output = this.name();
        break;
      case ":image":
        output = this.image();
        break;
      case ":reference":
        output = this.reference();
        break;
      case ":summary":
        output = this.summary();
        break;
      case ":titles":
        output = this.titles();
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
      output.put(":image", this.image());
      output.put(":reference", this.reference());
      output.put(":summary", this.summary());
      output.put(":titles", this.titles());
      output.put(":orientation", this.orientation());
      return Core.immutablemap(output);
    }

    @Override
    public Type_weakness vx_new(final Object... vals) {return e_weakness.vx_copy(vals);}

    @Override
    public Type_weakness vx_copy(final Object... vals) {
      Type_weakness output = this;
      boolean ischanged = false;
      Class_weakness val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Core.Type_string vx_p_name = val.name();
      Core.Type_string vx_p_image = val.image();
      Core.Type_string vx_p_reference = val.reference();
      Core.Type_string vx_p_summary = val.summary();
      Core.Type_string vx_p_titles = val.titles();
      Core.Type_string vx_p_orientation = val.orientation();
      ArrayList<String> validkeys = new ArrayList<>();
      validkeys.add(":name");
      validkeys.add(":image");
      validkeys.add(":reference");
      validkeys.add(":summary");
      validkeys.add(":titles");
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
            msg = Core.vx_msg_from_error("nx/tactics/base/weakness", ":invalidkeytype", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/weakness", ":invalidkey", msgval);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/weakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":image":
            if (valsub == vx_p_image) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_image = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_image = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("image"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/weakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":reference":
            if (valsub == vx_p_reference) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_reference = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_reference = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("reference"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/weakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":summary":
            if (valsub == vx_p_summary) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_summary = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_summary = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/weakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":titles":
            if (valsub == vx_p_titles) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_titles = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_titles = Core.t_string.vx_new(valsub);
            } else {
              Core.Type_any msgval;
              if (valsub instanceof Core.Type_any) {
                msgval = (Core.Type_any)valsub;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<>();
              mapany.put("key", Core.vx_new_string("titles"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("nx/tactics/base/weakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          case ":orientation":
            if (valsub == vx_p_orientation) {
            } else if (valsub instanceof Core.Type_string) {
              ischanged = true;
              vx_p_orientation = (Core.Type_string)valsub;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_orientation = Core.t_string.vx_new(valsub);
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
              msg = Core.vx_msg_from_error("nx/tactics/base/weakness", ":invalidvalue", msgmap);
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            Core.Type_any msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("nx/tactics/base/weakness", ":invalidkey", msgval);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_weakness work = new Class_weakness();
        work.vx_p_name = vx_p_name;
        work.vx_p_image = vx_p_image;
        work.vx_p_reference = vx_p_reference;
        work.vx_p_summary = vx_p_summary;
        work.vx_p_titles = vx_p_titles;
        work.vx_p_orientation = vx_p_orientation;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_weakness vx_empty() {return e_weakness;}
    @Override
    public Type_weakness vx_type() {return t_weakness;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "weakness", // name
        ":struct", // extends
        Core.t_typelist.vx_new(Base.t_card), // traits
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

  public static final Type_weakness e_weakness = new Class_weakness();
  public static final Type_weakness t_weakness = new Class_weakness();

  /**
   * type: weaknessmap
   * (type weaknessmap)
   */
  public interface Type_weaknessmap extends Core.Type_map {
    public Base.Type_weaknessmap vx_new(final Object... vals);
    public Base.Type_weaknessmap vx_copy(final Object... vals);
    public Base.Type_weaknessmap vx_empty();
    public Base.Type_weaknessmap vx_type();
    public Map<String, Base.Type_weakness> vx_mapweakness();
    public Base.Type_weakness vx_weakness(final Core.Type_string key);
  }

  public static class Class_weaknessmap extends Core.Class_base implements Type_weaknessmap {

    protected Map<String, Base.Type_weakness> vx_p_map = Core.immutablemap(new LinkedHashMap<String, Base.Type_weakness>());

    @Override
    public Map<String, Core.Type_any> vx_map() {return Core.immutablemap(new LinkedHashMap<String, Core.Type_any>(this.vx_p_map));}

    @Override
    public Base.Type_weakness vx_weakness(final Core.Type_string key) {
      Base.Type_weakness output = Base.e_weakness;
      Class_weaknessmap map = this;
      String skey = key.vx_string();
      Map<String, Base.Type_weakness> mapval = map.vx_p_map;
      output = mapval.getOrDefault(skey, Base.e_weakness);
      return output;
    }

    @Override
    public Map<String, Base.Type_weakness> vx_mapweakness() {return vx_p_map;}

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      return this.vx_weakness(key);
    }

    @Override
    public Type_weaknessmap vx_new_from_map(final Map<String, Core.Type_any> mapval) {
      Class_weaknessmap output = new Class_weaknessmap();
      Core.Type_msgblock msgblock = Core.e_msgblock;
      Map<String, Base.Type_weakness> map = new LinkedHashMap<>();
      Set<String> keys = mapval.keySet();
      for (String key : keys) {
        Core.Type_any val = mapval.get(key);
        if (val instanceof Base.Type_weakness) {
          Base.Type_weakness castval = (Base.Type_weakness)val;
          map.put(key, castval);
        } else {
          Core.Type_msg msg = Core.vx_msg_from_error("nx/tactics/base/weaknessmap", ":invalidvalue", val);
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
    public Type_weaknessmap vx_new(final Object... vals) {return e_weaknessmap.vx_copy(vals);}

    @Override
    public Type_weaknessmap vx_copy(final Object... vals) {
      Type_weaknessmap output = this;
      boolean ischanged = false;
      Class_weaknessmap val = this;
      Core.Type_msgblock msgblock = Core.t_msgblock.vx_msgblock_from_copy_arrayval(val, vals);
      if (this instanceof Core.vx_Type_const) {
        ischanged = true;
      }
      Map<String, Base.Type_weakness> mapval = new LinkedHashMap<>(val.vx_mapweakness());
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
            msg = Core.vx_msg_from_error("nx/tactics/base/weaknessmap", ":keyexpected", msgval);
            msgblock = Core.t_msgblock.vx_copy(msgblock, msg);
          }
        } else {
          Base.Type_weakness valany = null;
          if (valsub instanceof Base.Type_weakness) {
            valany = (Base.Type_weakness)valsub;
          } else if (valsub instanceof Base.Type_weakness) {
            valany = (Base.Type_weakness)valsub;
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
            msg = Core.vx_msg_from_error("nx/tactics/base/weaknessmap", ":invalidkeyvalue", msgmap);
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
        Class_weaknessmap work = new Class_weaknessmap();
        work.vx_p_map = Core.immutablemap(mapval);
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Type_weaknessmap vx_empty() {return e_weaknessmap;}
    @Override
    public Type_weaknessmap vx_type() {return t_weaknessmap;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/base", // pkgname
        "weaknessmap", // name
        ":map", // extends
        Core.e_typelist, // traits
        Core.t_typelist.vx_new(Base.t_weakness), // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
    }

  }

  public static final Type_weaknessmap e_weaknessmap = new Class_weaknessmap();
  public static final Type_weaknessmap t_weaknessmap = new Class_weaknessmap();

  /**
   * Constant: rank-10
   * {rank}
   */
  public static class Const_rank_10 extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-10", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_10 output) {
    }


  }

  public static final Const_rank_10 c_rank_10 = new Const_rank_10();


  /**
   * Constant: rank-2
   * {rank}
   */
  public static class Const_rank_2 extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-2", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_2 output) {
    }


  }

  public static final Const_rank_2 c_rank_2 = new Const_rank_2();


  /**
   * Constant: rank-3
   * {rank}
   */
  public static class Const_rank_3 extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-3", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_3 output) {
    }


  }

  public static final Const_rank_3 c_rank_3 = new Const_rank_3();


  /**
   * Constant: rank-4
   * {rank}
   */
  public static class Const_rank_4 extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-4", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_4 output) {
    }


  }

  public static final Const_rank_4 c_rank_4 = new Const_rank_4();


  /**
   * Constant: rank-5
   * {rank}
   */
  public static class Const_rank_5 extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-5", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_5 output) {
    }


  }

  public static final Const_rank_5 c_rank_5 = new Const_rank_5();


  /**
   * Constant: rank-6
   * {rank}
   */
  public static class Const_rank_6 extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-6", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_6 output) {
    }


  }

  public static final Const_rank_6 c_rank_6 = new Const_rank_6();


  /**
   * Constant: rank-7
   * {rank}
   */
  public static class Const_rank_7 extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-7", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_7 output) {
    }


  }

  public static final Const_rank_7 c_rank_7 = new Const_rank_7();


  /**
   * Constant: rank-8
   * {rank}
   */
  public static class Const_rank_8 extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-8", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_8 output) {
    }


  }

  public static final Const_rank_8 c_rank_8 = new Const_rank_8();


  /**
   * Constant: rank-9
   * {rank}
   */
  public static class Const_rank_9 extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-9", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_9 output) {
    }


  }

  public static final Const_rank_9 c_rank_9 = new Const_rank_9();


  /**
   * Constant: rank-ace
   * {rank}
   */
  public static class Const_rank_ace extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-ace", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_ace output) {
    }


  }

  public static final Const_rank_ace c_rank_ace = new Const_rank_ace();


  /**
   * Constant: rank-jack
   * {rank}
   */
  public static class Const_rank_jack extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-jack", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_jack output) {
    }


  }

  public static final Const_rank_jack c_rank_jack = new Const_rank_jack();


  /**
   * Constant: rank-joker
   * {rank}
   */
  public static class Const_rank_joker extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-joker", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_joker output) {
    }


  }

  public static final Const_rank_joker c_rank_joker = new Const_rank_joker();


  /**
   * Constant: rank-king
   * {rank}
   */
  public static class Const_rank_king extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-king", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_king output) {
    }


  }

  public static final Const_rank_king c_rank_king = new Const_rank_king();


  /**
   * Constant: rank-queen
   * {rank}
   */
  public static class Const_rank_queen extends Base.Class_rank implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "rank-queen", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rank", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_rank_queen output) {
    }


  }

  public static final Const_rank_queen c_rank_queen = new Const_rank_queen();


  /**
   * Constant: role-aoe
   * {role}
   */
  public static class Const_role_aoe extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-aoe", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_aoe output) {
    }


  }

  public static final Const_role_aoe c_role_aoe = new Const_role_aoe();


  /**
   * Constant: role-bosskiller
   * {role}
   */
  public static class Const_role_bosskiller extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-bosskiller", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_bosskiller output) {
    }


  }

  public static final Const_role_bosskiller c_role_bosskiller = new Const_role_bosskiller();


  /**
   * Constant: role-buffer
   * {role}
   */
  public static class Const_role_buffer extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-buffer", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_buffer output) {
    }


  }

  public static final Const_role_buffer c_role_buffer = new Const_role_buffer();


  /**
   * Constant: role-crowdcontrol
   * {role}
   */
  public static class Const_role_crowdcontrol extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-crowdcontrol", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_crowdcontrol output) {
    }


  }

  public static final Const_role_crowdcontrol c_role_crowdcontrol = new Const_role_crowdcontrol();


  /**
   * Constant: role-distracter
   * {role}
   */
  public static class Const_role_distracter extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-distracter", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_distracter output) {
    }


  }

  public static final Const_role_distracter c_role_distracter = new Const_role_distracter();


  /**
   * Constant: role-healer
   * {role}
   */
  public static class Const_role_healer extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-healer", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_healer output) {
    }


  }

  public static final Const_role_healer c_role_healer = new Const_role_healer();


  /**
   * Constant: role-sniper
   * {role}
   */
  public static class Const_role_sniper extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-sniper", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_sniper output) {
    }


  }

  public static final Const_role_sniper c_role_sniper = new Const_role_sniper();


  /**
   * Constant: role-tank
   * {role}
   */
  public static class Const_role_tank extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-tank", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_tank output) {
    }


  }

  public static final Const_role_tank c_role_tank = new Const_role_tank();


  /**
   * Constant: role-trapper
   * {role}
   */
  public static class Const_role_trapper extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-trapper", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_trapper output) {
    }


  }

  public static final Const_role_trapper c_role_trapper = new Const_role_trapper();


  /**
   * Constant: role-utility
   * {role}
   */
  public static class Const_role_utility extends Base.Class_role implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "role-utility", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "role", // name
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

    public static void const_new(Const_role_utility output) {
    }


  }

  public static final Const_role_utility c_role_utility = new Const_role_utility();


  /**
   * Constant: stat-beast
   * The ability to use wild rage or terror to lash out or flee. This is the opposite of the [Will].
   * {stat}
   */
  public static class Const_stat_beast extends Base.Class_stat implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "stat-beast", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "stat", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_stat_beast output) {
    }


  }

  public static final Const_stat_beast c_stat_beast = new Const_stat_beast();


  /**
   * Constant: stat-body
   * {stat}
   */
  public static class Const_stat_body extends Base.Class_stat implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "stat-body", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "stat", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_stat_body output) {
    }


  }

  public static final Const_stat_body c_stat_body = new Const_stat_body();


  /**
   * Constant: stat-mind
   * {stat}
   */
  public static class Const_stat_mind extends Base.Class_stat implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "stat-mind", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "stat", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_stat_mind output) {
    }


  }

  public static final Const_stat_mind c_stat_mind = new Const_stat_mind();


  /**
   * Constant: stat-shadow
   * The ability to use rational thought to do selfish/impulsive acts. This is the opposite of the [Mind].
   * {stat}
   */
  public static class Const_stat_shadow extends Base.Class_stat implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "stat-shadow", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "stat", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_stat_shadow output) {
    }


  }

  public static final Const_stat_shadow c_stat_shadow = new Const_stat_shadow();


  /**
   * Constant: stat-speed
   * {stat}
   */
  public static class Const_stat_speed extends Base.Class_stat implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "stat-speed", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "stat", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_stat_speed output) {
    }


  }

  public static final Const_stat_speed c_stat_speed = new Const_stat_speed();


  /**
   * Constant: stat-will
   * {stat}
   */
  public static class Const_stat_will extends Base.Class_stat implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "stat-will", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "stat", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_stat_will output) {
    }


  }

  public static final Const_stat_will c_stat_will = new Const_stat_will();


  /**
   * Constant: suit-club
   * {suit}
   */
  public static class Const_suit_club extends Base.Class_suit implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "suit-club", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "suit", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_suit_club output) {
    }


  }

  public static final Const_suit_club c_suit_club = new Const_suit_club();


  /**
   * Constant: suit-diamond
   * {suit}
   */
  public static class Const_suit_diamond extends Base.Class_suit implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "suit-diamond", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "suit", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_suit_diamond output) {
    }


  }

  public static final Const_suit_diamond c_suit_diamond = new Const_suit_diamond();


  /**
   * Constant: suit-heart
   * {suit}
   */
  public static class Const_suit_heart extends Base.Class_suit implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "suit-heart", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "suit", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_suit_heart output) {
    }


  }

  public static final Const_suit_heart c_suit_heart = new Const_suit_heart();


  /**
   * Constant: suit-spade
   * {suit}
   */
  public static class Const_suit_spade extends Base.Class_suit implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/base", // pkgname
        "suit-spade", // name
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "suit", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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

    public static void const_new(Const_suit_spade output) {
    }


  }

  public static final Const_suit_spade c_suit_spade = new Const_suit_spade();

  /**
   * @function rating_from_mass
   * Return a rating from a mass.
   * @param  {string} mass
   * @return {rating}
   * (func rating<-mass)
   */
  public static interface Func_rating_from_mass extends Core.Func_any_from_any {
    public Base.Type_rating vx_rating_from_mass(final Core.Type_string mass);
  }

  public static class Class_rating_from_mass extends Core.Class_base implements Func_rating_from_mass {

    @Override
    public Func_rating_from_mass vx_new(Object... vals) {
      Class_rating_from_mass output = new Class_rating_from_mass();
      return output;
    }

    @Override
    public Func_rating_from_mass vx_copy(Object... vals) {
      Class_rating_from_mass output = new Class_rating_from_mass();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/base", // pkgname
        "rating<-mass", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rating", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
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
    public Func_rating_from_mass vx_empty() {return e_rating_from_mass;}
    @Override
    public Func_rating_from_mass vx_type() {return t_rating_from_mass;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Base.f_rating_from_mass(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string mass = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Base.f_rating_from_mass(mass);
      return output;
    }

    @Override
    public Base.Type_rating vx_rating_from_mass(final Core.Type_string mass) {
      return Base.f_rating_from_mass(mass);
    }

  }

  public static final Func_rating_from_mass e_rating_from_mass = new Base.Class_rating_from_mass();
  public static final Func_rating_from_mass t_rating_from_mass = new Base.Class_rating_from_mass();

  public static Base.Type_rating f_rating_from_mass(final Core.Type_string mass) {
    Base.Type_rating output = Base.e_rating;
    return output;
  }


  static {
    Const_rank_10.const_new(c_rank_10);
    Const_rank_2.const_new(c_rank_2);
    Const_rank_3.const_new(c_rank_3);
    Const_rank_4.const_new(c_rank_4);
    Const_rank_5.const_new(c_rank_5);
    Const_rank_6.const_new(c_rank_6);
    Const_rank_7.const_new(c_rank_7);
    Const_rank_8.const_new(c_rank_8);
    Const_rank_9.const_new(c_rank_9);
    Const_rank_ace.const_new(c_rank_ace);
    Const_rank_jack.const_new(c_rank_jack);
    Const_rank_joker.const_new(c_rank_joker);
    Const_rank_king.const_new(c_rank_king);
    Const_rank_queen.const_new(c_rank_queen);
    Const_role_aoe.const_new(c_role_aoe);
    Const_role_bosskiller.const_new(c_role_bosskiller);
    Const_role_buffer.const_new(c_role_buffer);
    Const_role_crowdcontrol.const_new(c_role_crowdcontrol);
    Const_role_distracter.const_new(c_role_distracter);
    Const_role_healer.const_new(c_role_healer);
    Const_role_sniper.const_new(c_role_sniper);
    Const_role_tank.const_new(c_role_tank);
    Const_role_trapper.const_new(c_role_trapper);
    Const_role_utility.const_new(c_role_utility);
    Const_stat_beast.const_new(c_stat_beast);
    Const_stat_body.const_new(c_stat_body);
    Const_stat_mind.const_new(c_stat_mind);
    Const_stat_shadow.const_new(c_stat_shadow);
    Const_stat_speed.const_new(c_stat_speed);
    Const_stat_will.const_new(c_stat_will);
    Const_suit_club.const_new(c_suit_club);
    Const_suit_diamond.const_new(c_suit_diamond);
    Const_suit_heart.const_new(c_suit_heart);
    Const_suit_spade.const_new(c_suit_spade);
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    maptype.put("ability", Base.t_ability);
    maptype.put("abilitymap", Base.t_abilitymap);
    maptype.put("book", Base.t_book);
    maptype.put("bookmap", Base.t_bookmap);
    maptype.put("card", Base.t_card);
    maptype.put("cardlist", Base.t_cardlist);
    maptype.put("cardmap", Base.t_cardmap);
    maptype.put("chapter", Base.t_chapter);
    maptype.put("chapterlist", Base.t_chapterlist);
    maptype.put("chaptermap", Base.t_chaptermap);
    maptype.put("damage", Base.t_damage);
    maptype.put("damagelist", Base.t_damagelist);
    maptype.put("damagemap", Base.t_damagemap);
    maptype.put("deck", Base.t_deck);
    maptype.put("deckmap", Base.t_deckmap);
    maptype.put("goal", Base.t_goal);
    maptype.put("item", Base.t_item);
    maptype.put("itemmap", Base.t_itemmap);
    maptype.put("location", Base.t_location);
    maptype.put("locationmap", Base.t_locationmap);
    maptype.put("mind", Base.t_mind);
    maptype.put("modifier", Base.t_modifier);
    maptype.put("playingcard", Base.t_playingcard);
    maptype.put("power", Base.t_power);
    maptype.put("powermap", Base.t_powermap);
    maptype.put("rank", Base.t_rank);
    maptype.put("rating", Base.t_rating);
    maptype.put("role", Base.t_role);
    maptype.put("rolemap", Base.t_rolemap);
    maptype.put("rule", Base.t_rule);
    maptype.put("rulemap", Base.t_rulemap);
    maptype.put("scenario", Base.t_scenario);
    maptype.put("scenariomap", Base.t_scenariomap);
    maptype.put("section", Base.t_section);
    maptype.put("sectionmap", Base.t_sectionmap);
    maptype.put("skill", Base.t_skill);
    maptype.put("skillmap", Base.t_skillmap);
    maptype.put("specialty", Base.t_specialty);
    maptype.put("specialtymap", Base.t_specialtymap);
    maptype.put("stat", Base.t_stat);
    maptype.put("suit", Base.t_suit);
    maptype.put("suitmap", Base.t_suitmap);
    maptype.put("terrain", Base.t_terrain);
    maptype.put("terrainmap", Base.t_terrainmap);
    maptype.put("threat", Base.t_threat);
    maptype.put("unit", Base.t_unit);
    maptype.put("unitability", Base.t_unitability);
    maptype.put("unitabilitymap", Base.t_unitabilitymap);
    maptype.put("unititem", Base.t_unititem);
    maptype.put("unititemmap", Base.t_unititemmap);
    maptype.put("unitmap", Base.t_unitmap);
    maptype.put("unitpower", Base.t_unitpower);
    maptype.put("unitpowermap", Base.t_unitpowermap);
    maptype.put("unitskill", Base.t_unitskill);
    maptype.put("unitskillmap", Base.t_unitskillmap);
    maptype.put("unitspecialty", Base.t_unitspecialty);
    maptype.put("unitspecialtymap", Base.t_unitspecialtymap);
    maptype.put("unitweakness", Base.t_unitweakness);
    maptype.put("unitweaknessmap", Base.t_unitweaknessmap);
    maptype.put("weakness", Base.t_weakness);
    maptype.put("weaknessmap", Base.t_weaknessmap);
    mapconst.put("rank-10", Base.c_rank_10);
    mapconst.put("rank-2", Base.c_rank_2);
    mapconst.put("rank-3", Base.c_rank_3);
    mapconst.put("rank-4", Base.c_rank_4);
    mapconst.put("rank-5", Base.c_rank_5);
    mapconst.put("rank-6", Base.c_rank_6);
    mapconst.put("rank-7", Base.c_rank_7);
    mapconst.put("rank-8", Base.c_rank_8);
    mapconst.put("rank-9", Base.c_rank_9);
    mapconst.put("rank-ace", Base.c_rank_ace);
    mapconst.put("rank-jack", Base.c_rank_jack);
    mapconst.put("rank-joker", Base.c_rank_joker);
    mapconst.put("rank-king", Base.c_rank_king);
    mapconst.put("rank-queen", Base.c_rank_queen);
    mapconst.put("role-aoe", Base.c_role_aoe);
    mapconst.put("role-bosskiller", Base.c_role_bosskiller);
    mapconst.put("role-buffer", Base.c_role_buffer);
    mapconst.put("role-crowdcontrol", Base.c_role_crowdcontrol);
    mapconst.put("role-distracter", Base.c_role_distracter);
    mapconst.put("role-healer", Base.c_role_healer);
    mapconst.put("role-sniper", Base.c_role_sniper);
    mapconst.put("role-tank", Base.c_role_tank);
    mapconst.put("role-trapper", Base.c_role_trapper);
    mapconst.put("role-utility", Base.c_role_utility);
    mapconst.put("stat-beast", Base.c_stat_beast);
    mapconst.put("stat-body", Base.c_stat_body);
    mapconst.put("stat-mind", Base.c_stat_mind);
    mapconst.put("stat-shadow", Base.c_stat_shadow);
    mapconst.put("stat-speed", Base.c_stat_speed);
    mapconst.put("stat-will", Base.c_stat_will);
    mapconst.put("suit-club", Base.c_suit_club);
    mapconst.put("suit-diamond", Base.c_suit_diamond);
    mapconst.put("suit-heart", Base.c_suit_heart);
    mapconst.put("suit-spade", Base.c_suit_spade);
    mapfunc.put("rating<-mass", Base.t_rating_from_mass);
    Core.vx_global_package_set("nx/tactics/base", maptype, mapconst, mapfunc);
  }

}
