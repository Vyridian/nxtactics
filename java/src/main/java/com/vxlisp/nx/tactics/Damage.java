package com.vxlisp.nx.tactics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;

public final class Damage {


  /**
   * type: wound
   * Lasting Body Damage
   * (type wound)
   */
  public interface Type_wound extends Core.Type_struct, Base.Type_card {
    public Damage.Type_wound vx_new(final Object... vals);
    public Damage.Type_wound vx_copy(final Object... vals);
    public Damage.Type_wound vx_empty();
    public Damage.Type_wound vx_type();
    public Core.Type_string name();
    public Core.Type_string image();
    public Core.Type_string reference();
    public Core.Type_string summary();
    public Core.Type_string titles();
    public Core.Type_string orientation();
  }

  public static class Class_wound extends Core.Class_base implements Type_wound {

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
    public Type_wound vx_new(final Object... vals) {return e_wound.vx_copy(vals);}

    @Override
    public Type_wound vx_copy(final Object... vals) {
      Type_wound output = this;
      boolean ischanged = false;
      Class_wound val = this;
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
            String svalsub;
            if (valsub instanceof Core.Type_any) {
              Core.Type_any anyvalsub = (Core.Type_any)valsub;
              svalsub = Core.vx_string_from_any(anyvalsub);
            } else {
              svalsub = valsub.toString();
            }
            msg = Core.vx_msg_from_error(":invalidkeytype (new wound) " + svalsub);
            msgblock = msgblock.vx_copy(msg);
          }
          if (istestkey) {
            boolean isvalidkey = validkeys.contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else {
              msg = Core.vx_msg_from_error(":invalidkey (new wound) " + testkey);
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
              msg = Core.vx_msg_from_error(":invalidvalue (new wound :name " + valsub.toString() + ")");
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
              msg = Core.vx_msg_from_error(":invalidvalue (new wound :image " + valsub.toString() + ")");
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
              msg = Core.vx_msg_from_error(":invalidvalue (new wound :reference " + valsub.toString() + ")");
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
              msg = Core.vx_msg_from_error(":invalidvalue (new wound :summary " + valsub.toString() + ")");
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
              msg = Core.vx_msg_from_error(":invalidvalue (new wound :titles " + valsub.toString() + ")");
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
              msg = Core.vx_msg_from_error(":invalidvalue (new wound :orientation " + valsub.toString() + ")");
              msgblock = msgblock.vx_copy(msg);
            }
            break;
          default:
            msg = Core.vx_msg_from_error(":invalidkey (new wound) " + key);
            msgblock = msgblock.vx_copy(msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Class_wound work = new Class_wound();
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
    public Type_wound vx_empty() {return e_wound;}
    @Override
    public Type_wound vx_type() {return t_wound;}

    @Override
    public Core.Type_typedef vx_typedef() {
      return Core.typedef_new(
        "nx/tactics/damage", // pkgname
        "wound", // name
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

  public static final Type_wound e_wound = new Class_wound();
  public static final Type_wound t_wound = new Class_wound();

  /**
   * Constant: breakdown
   * Lasting Mind Damage
   * {card}
   */
  public static class Const_breakdown extends Base.Class_card implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "breakdown", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_breakdown output) {
      Base.Type_card val = Core.f_new(
        Base.t_card,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Breakdown")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_breakdown c_breakdown = new Const_breakdown();


  /**
   * Constant: duress
   * * Temporary Will Damage/Fear/Horror. Doing things against your beliefs causes Duress.
   * * While you have more Duress than Will, you are Shaken.
   * * Shaken: Cannot play odd [Defend] cards and your second action may only be [Recover]
   * {card}
   */
  public static class Const_duress extends Base.Class_card implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "duress", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_duress output) {
      Base.Type_card val = Core.f_new(
        Base.t_card,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Duress"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Doubt")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_duress c_duress = new Const_duress();


  /**
   * Constant: fatigue
   * * Temporary Body Damage. Hard work and strikes in combat cause Fatigue.
   * * While you have more Fatigue than [Body], you are Exhausted.
   * * Exhausted: Cannot play odd [Attack] cards and your second action may only be [Recover].
   * {card}
   */
  public static class Const_fatigue extends Base.Class_card implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "fatigue", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_fatigue output) {
      Base.Type_card val = Core.f_new(
        Base.t_card,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fatigue")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_fatigue c_fatigue = new Const_fatigue();


  /**
   * Constant: irrationaldeck
   * Damage to the Mind
   * {deck}
   */
  public static class Const_irrationaldeck extends Base.Class_deck implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "irrationaldeck", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_irrationaldeck output) {
      Base.Type_deck val = Core.f_new(
        Base.t_deck,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Irrational"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Crazed, Insane, Nonsensical, Obsessed, Unhinged"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* S-Hack Blood/Gore/Dismember/Doubt\n* H-Slash Blood/Slow\n* C-Bash/Fatigue/Push\n* D-Pierce/Shock/Stun/Pin/Disable/Stress")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
      output.vx_p_cardmap = val.cardmap();
    }


  }

  public static final Const_irrationaldeck c_irrationaldeck = new Const_irrationaldeck();


  /**
   * Constant: stagger
   * * Temporary Speed Damage/Restraint.
   * * While you have more Stagger than [Speed], you are Slowed.
   * * Slowed: [Move] actions are halved (rounded up).
   * {card}
   */
  public static class Const_stagger extends Base.Class_card implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "stagger", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_stagger output) {
      Base.Type_card val = Core.f_new(
        Base.t_card,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Stagger")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_stagger c_stagger = new Const_stagger();


  /**
   * Constant: stress
   * * Temporary Mind Damage/Distraction/Surprise/Shock.
   * * While you have more Stress than [Mind], you are Stunned.
   * * Stunned: Cannot play odd [Focus] cards and your second action may only be [Recover].
   * {card}
   */
  public static class Const_stress extends Base.Class_card implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "stress", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_stress output) {
      Base.Type_card val = Core.f_new(
        Base.t_card,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Stress")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_stress c_stress = new Const_stress();


  /**
   * Constant: trauma
   * Lasting Will Damage
   * {card}
   */
  public static class Const_trauma extends Base.Class_card implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "trauma", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_trauma output) {
    }


  }

  public static final Const_trauma c_trauma = new Const_trauma();


  /**
   * Constant: unwillingdeck
   * Damage to the Will
   * {deck}
   */
  public static class Const_unwillingdeck extends Base.Class_deck implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "unwillingdeck", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_unwillingdeck output) {
      Base.Type_deck val = Core.f_new(
        Base.t_deck,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Unwilling"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Apathy, Cowed, Berserk, Broken, Depression, Servitude, Surly"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* S-Hack Blood/Gore/Dismember\n* H-Slash Blood/Slow\n* C-Bash/Fatigue/Push\n* D-Pierce/Stun/Pin/Disable")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
      output.vx_p_cardmap = val.cardmap();
    }


  }

  public static final Const_unwillingdeck c_unwillingdeck = new Const_unwillingdeck();


  /**
   * Constant: wound-ca
   * {wound}
   */
  public static class Const_wound_ca extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-ca", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_ca output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Bash: Head"),
                Core.vx_new_string(":rank"),
                Base.c_rank_ace,
                Core.vx_new_string(":suit"),
                Base.c_suit_club,
                Core.vx_new_string(":doc"),
                Core.vx_new_string("* 1 Damage: Head Ringing. [Stun]: 1.\n* 2 Damage: Concussion. [Fatigue]: 1. [Push]: 1.\n* 3 Damage: Skull Fracture. [Unconscious]. [Fatigue]: 2. [Push]: 1. [Knockdown]: 1.\n* 4 Damage: Skull Crushed. [Dead].")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_ca c_wound_ca = new Const_wound_ca();


  /**
   * Constant: wound-da
   * {wound}
   */
  public static class Const_wound_da extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-da", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_da output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Pierce: Head"),
                Core.vx_new_string(":rank"),
                Base.c_rank_ace,
                Core.vx_new_string(":suit"),
                Base.c_suit_diamond,
                Core.vx_new_string(":doc"),
                Core.vx_new_string("* 1 Damage: Head Grazed. [Stun]: 1.\n* 2 Damage: Pierced Throat. [Can't speak]. [Stun]: 1.\n* 3 Damage: Blinded in one Eye. [Partly Blind]. [Stun]: 2. [Horror]: 1.\n* 4 Damage: Skull Pierced. Dying.")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_da c_wound_da = new Const_wound_da();


  /**
   * Constant: wound-ha
   * {wound}
   */
  public static class Const_wound_ha extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-ha", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_ha output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Slash: Head"),
                Core.vx_new_string(":rank"),
                Base.c_rank_ace,
                Core.vx_new_string(":suit"),
                Base.c_suit_heart,
                Core.vx_new_string(":doc"),
                Core.vx_new_string("* 1 Damage: Head Cut. [Bleeding]: 1.\n* 2 Damage: Face Gash. [Horror]: 1. [Bleeding]: 1.\n* 3 Damage: Throat Sliced Open. [Bleeding]: 3, [Horror]: 2.\n* 4 Damage: Spine Severed. [Paralyzed]. [Horror]: 3. [Bleeding]: 2.")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_ha c_wound_ha = new Const_wound_ha();


  /**
   * Constant: wound-j1
   * {wound}
   */
  public static class Const_wound_j1 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-j1", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_j1 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Wild"),
                Core.vx_new_string(":doc"),
                Core.vx_new_string("* Search the Deck for any card and play that instead.\n* Shuffle Discards into Deck.")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_j1 c_wound_j1 = new Const_wound_j1();


  /**
   * Constant: wound-j2
   * {wound}
   */
  public static class Const_wound_j2 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-j2", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_j2 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Wild"),
                Core.vx_new_string(":doc"),
                Core.vx_new_string("* Search the Discards for any card and play that instead or play the next card instead.\n* Shuffle Discards into Deck.")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_j2 c_wound_j2 = new Const_wound_j2();


  /**
   * Constant: wound-s10
   * {wound}
   */
  public static class Const_wound_s10 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-s10", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_s10 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Hips/Groin")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_s10 c_wound_s10 = new Const_wound_s10();


  /**
   * Constant: wound-s2
   * {wound}
   */
  public static class Const_wound_s2 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-s2", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_s2 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Left Lower Leg/Shin/Ankle/Foot")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_s2 c_wound_s2 = new Const_wound_s2();


  /**
   * Constant: wound-s3
   * {damage}
   */
  public static class Const_wound_s3 extends Base.Class_damage implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-s3", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_wound_s3 output) {
      Base.Type_damage val = Core.f_new(
        Base.t_damage,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Right Lower Leg/Shin/Ankle/Foot")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_s3 c_wound_s3 = new Const_wound_s3();


  /**
   * Constant: wound-s4
   * {wound}
   */
  public static class Const_wound_s4 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-s4", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_s4 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Left Upper Leg/Thigh/Knee")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_s4 c_wound_s4 = new Const_wound_s4();


  /**
   * Constant: wound-s5
   * {wound}
   */
  public static class Const_wound_s5 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-s5", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_s5 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Right Upper Leg/Thigh/Knee")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_s5 c_wound_s5 = new Const_wound_s5();


  /**
   * Constant: wound-s6
   * {wound}
   */
  public static class Const_wound_s6 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-s6", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_s6 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Left Lower Arm/Wrist/Hand")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_s6 c_wound_s6 = new Const_wound_s6();


  /**
   * Constant: wound-s7
   * {wound}
   */
  public static class Const_wound_s7 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-s7", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_s7 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Right Lower Arm/Wrist/Hand")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_s7 c_wound_s7 = new Const_wound_s7();


  /**
   * Constant: wound-s8
   * {wound}
   */
  public static class Const_wound_s8 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-s8", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_s8 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Left Upper Arm/Elbow")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_s8 c_wound_s8 = new Const_wound_s8();


  /**
   * Constant: wound-s9
   * {wound}
   */
  public static class Const_wound_s9 extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-s9", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_s9 output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Right Upper Arm/Elbow")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_s9 c_wound_s9 = new Const_wound_s9();


  /**
   * Constant: wound-sa
   * {wound}
   */
  public static class Const_wound_sa extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-sa", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_sa output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Hack: Head/Neck/Face/Skull"),
                Core.vx_new_string(":rank"),
                Base.c_rank_ace,
                Core.vx_new_string(":suit"),
                Base.c_suit_spade,
                Core.vx_new_string(":doc"),
                Core.vx_new_string("1 Damage: Deflected off Skull. [Slow]: 1.\n2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n3 Damage: Neck Fracture. [Immobilized]. [Slow]: 2. [Bleeding]: 1.\n4 Damage: Head Severed. [Dead].")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_sa c_wound_sa = new Const_wound_sa();


  /**
   * Constant: wound-sj
   * {wound}
   */
  public static class Const_wound_sj extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-sj", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_sj output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Abdomen/Lower Back")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_sj c_wound_sj = new Const_wound_sj();


  /**
   * Constant: wound-sk
   * {wound}
   */
  public static class Const_wound_sk extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-sk", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_sk output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Upper Chest/Upper Back/Shoulders/Ribs")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_sk c_wound_sk = new Const_wound_sk();


  /**
   * Constant: wound-sq
   * {wound}
   */
  public static class Const_wound_sq extends Damage.Class_wound implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wound-sq", // name
        Core.typedef_new(
          "nx/tactics/damage", // pkgname
          "wound", // name
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

    public static void const_new(Const_wound_sq output) {
      Damage.Type_wound val = Core.f_new(
        Damage.t_wound,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":doc"),
                Core.vx_new_string("Hack: Lower Chest/Middle Back/Lungs/Heart")
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
    }


  }

  public static final Const_wound_sq c_wound_sq = new Const_wound_sq();


  /**
   * Constant: wounddeck
   * Physical Damage Deck
   * {deck}
   */
  public static class Const_wounddeck extends Base.Class_deck implements Core.vx_Type_const {

    @Override
    public Core.Type_constdef vx_constdef() {
      return Core.constdef_new(
        "nx/tactics/damage", // pkgname
        "wounddeck", // name
        Core.typedef_new(
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
        )
      );
    }

    public static void const_new(Const_wounddeck output) {
      Base.Type_deck val = Core.f_new(
        Base.t_deck,
        Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Wound Deck"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* S-Hack Blood/Gore/Dismember\n* H-Slash Blood/Slow\n* C-Bash/Fatigue/Push\n* D-Stab/Pierce/Stun/Pin/Disable"),
                Core.vx_new_string(":cardlist"),
                Core.f_new(
                  Base.t_cardlist,
                  Core.t_anylist.vx_new(
                    Damage.c_wound_j1,
                    Damage.c_wound_j2,
                    Damage.c_wound_ca,
                    Damage.c_wound_da,
                    Damage.c_wound_ha,
                    Damage.c_wound_sa,
                    Damage.c_wound_sk,
                    Damage.c_wound_sq,
                    Damage.c_wound_sj,
                    Damage.c_wound_s5,
                    Damage.c_wound_s4,
                    Damage.c_wound_s3,
                    Damage.c_wound_s2
                  )
                )
        )
      );
      output.vx_p_name = val.name();
      output.vx_p_image = val.image();
      output.vx_p_reference = val.reference();
      output.vx_p_summary = val.summary();
      output.vx_p_titles = val.titles();
      output.vx_p_orientation = val.orientation();
      output.vx_p_cardmap = val.cardmap();
    }


  }

  public static final Const_wounddeck c_wounddeck = new Const_wounddeck();


  static {
    Const_breakdown.const_new(c_breakdown);
    Const_duress.const_new(c_duress);
    Const_fatigue.const_new(c_fatigue);
    Const_irrationaldeck.const_new(c_irrationaldeck);
    Const_stagger.const_new(c_stagger);
    Const_stress.const_new(c_stress);
    Const_trauma.const_new(c_trauma);
    Const_unwillingdeck.const_new(c_unwillingdeck);
    Const_wound_ca.const_new(c_wound_ca);
    Const_wound_da.const_new(c_wound_da);
    Const_wound_ha.const_new(c_wound_ha);
    Const_wound_j1.const_new(c_wound_j1);
    Const_wound_j2.const_new(c_wound_j2);
    Const_wound_s10.const_new(c_wound_s10);
    Const_wound_s2.const_new(c_wound_s2);
    Const_wound_s3.const_new(c_wound_s3);
    Const_wound_s4.const_new(c_wound_s4);
    Const_wound_s5.const_new(c_wound_s5);
    Const_wound_s6.const_new(c_wound_s6);
    Const_wound_s7.const_new(c_wound_s7);
    Const_wound_s8.const_new(c_wound_s8);
    Const_wound_s9.const_new(c_wound_s9);
    Const_wound_sa.const_new(c_wound_sa);
    Const_wound_sj.const_new(c_wound_sj);
    Const_wound_sk.const_new(c_wound_sk);
    Const_wound_sq.const_new(c_wound_sq);
    Const_wounddeck.const_new(c_wounddeck);
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    maptype.put("wound", Damage.t_wound);
    mapconst.put("breakdown", Damage.c_breakdown);
    mapconst.put("duress", Damage.c_duress);
    mapconst.put("fatigue", Damage.c_fatigue);
    mapconst.put("irrationaldeck", Damage.c_irrationaldeck);
    mapconst.put("stagger", Damage.c_stagger);
    mapconst.put("stress", Damage.c_stress);
    mapconst.put("trauma", Damage.c_trauma);
    mapconst.put("unwillingdeck", Damage.c_unwillingdeck);
    mapconst.put("wound-ca", Damage.c_wound_ca);
    mapconst.put("wound-da", Damage.c_wound_da);
    mapconst.put("wound-ha", Damage.c_wound_ha);
    mapconst.put("wound-j1", Damage.c_wound_j1);
    mapconst.put("wound-j2", Damage.c_wound_j2);
    mapconst.put("wound-s10", Damage.c_wound_s10);
    mapconst.put("wound-s2", Damage.c_wound_s2);
    mapconst.put("wound-s3", Damage.c_wound_s3);
    mapconst.put("wound-s4", Damage.c_wound_s4);
    mapconst.put("wound-s5", Damage.c_wound_s5);
    mapconst.put("wound-s6", Damage.c_wound_s6);
    mapconst.put("wound-s7", Damage.c_wound_s7);
    mapconst.put("wound-s8", Damage.c_wound_s8);
    mapconst.put("wound-s9", Damage.c_wound_s9);
    mapconst.put("wound-sa", Damage.c_wound_sa);
    mapconst.put("wound-sj", Damage.c_wound_sj);
    mapconst.put("wound-sk", Damage.c_wound_sk);
    mapconst.put("wound-sq", Damage.c_wound_sq);
    mapconst.put("wounddeck", Damage.c_wounddeck);
    Core.vx_global_package_set("nx/tactics/damage", maptype, mapconst, mapfunc);
  }

}
