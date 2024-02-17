package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Powers {

  /**
   * @function chapter_alteration_powers
   * @return {chapter}
   * (func chapter_alteration_powers)
   */
  public static interface Func_chapter_alteration_powers extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_alteration_powers();
  }

  public static class Class_chapter_alteration_powers extends Core.Class_base implements Func_chapter_alteration_powers {

    @Override
    public Func_chapter_alteration_powers vx_new(Object... vals) {
      Class_chapter_alteration_powers output = new Class_chapter_alteration_powers();
      return output;
    }

    @Override
    public Func_chapter_alteration_powers vx_copy(Object... vals) {
      Class_chapter_alteration_powers output = new Class_chapter_alteration_powers();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_alteration_powers", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_alteration_powers vx_empty() {return e_chapter_alteration_powers;}
    @Override
    public Func_chapter_alteration_powers vx_type() {return t_chapter_alteration_powers;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_alteration_powers();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_alteration_powers() {
      return Powers.f_chapter_alteration_powers();
    }

  }

  public static final Func_chapter_alteration_powers e_chapter_alteration_powers = new Powers.Class_chapter_alteration_powers();
  public static final Func_chapter_alteration_powers t_chapter_alteration_powers = new Powers.Class_chapter_alteration_powers();

  public static Base.Type_chapter f_chapter_alteration_powers() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Alteration Powers"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Material Control"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Material Control"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Atomic Control"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Atomic Control"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Disintegrate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Disintegrate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Causes wounds that are difficult to heal\n* A victim that takes Disintegrate Tokens equal to Body are completely destroyed.")
                              )
                            ),
                            Core.vx_new_string(":Destruction"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Destruction"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Effects only unliving objects\n* A target that takes Destruction Tokens equal to Body are completely destroyed.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Density Control"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Density Control")
                      )
                    ),
                    Core.vx_new_string(":Transfiguration"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Transfiguration"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The ability to transform others."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Fleshcrafting, Vissisitude"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Blinding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blinding")
                              )
                            ),
                            Core.vx_new_string("Body Morph"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Body Morph")
                              )
                            ),
                            Core.vx_new_string(":Deafening"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deafening")
                              )
                            ),
                            Core.vx_new_string(":Malleate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Malleate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Make target soft and malleable.")
                              )
                            ),
                            Core.vx_new_string(":Petrification"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Petrification"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Focus]: vs. Spirit and place [Petrification] counters on the target body location.\n* Any body location with a [Petrification] is encased in stone. It requires an [Action] to remove a [Petrification]. Any area that suffers 3 [Petrification] turns completely to stone. If any other area is so petrified, then complete petrification immediately spreads across the entire body and then the body and all its gear immediately converts to a stone statue.\n* Additioan Effects: A petrified arm cannot move. A petrified leg reduces Move by half. A petrified head is unable to see or hear. Other petrifed areas have no additional effect. Petrified Arms or legs can break off like a clean amputation without blood loss. \n* This ability can also be used to restore a petrified target back to its original form if the skill is at least equal to the original. Lost limbs may also be restored by reattaching the limb before restoration.\n* This ability can also be used on any sort of earth to harden the earth to equivalent stone.")
                              )
                            ),
                            Core.vx_new_string(":Polymorph"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Polymorph"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Roll vs. Spirit and place Black [Shapeshift] Tokens on target.\n* A unit with 0 Spirit due to polymorph changes into any creature desired of equal Body.  When the last Shapeshift Token is removed, a polymorphed unit returns to normal.")
                              )
                            ),
                            Core.vx_new_string("Sensory Deprivation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sensory Deprivation")
                              )
                            ),
                            Core.vx_new_string("Sensory Overload"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sensory Overload")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Transmutation"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Transmutation"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The ability to transform non-living matter."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Reality Warper, Shaper, Transmuter"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Molecular Alteration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Molecular Alteration")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Power Manipulation"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Power Manipulation"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Power Copy"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Copy")
                      )
                    ),
                    Core.vx_new_string("Power Disruption"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Disruption")
                      )
                    ),
                    Core.vx_new_string("Power Drain"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Drain")
                      )
                    ),
                    Core.vx_new_string("Power Feedback"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Feedback")
                      )
                    ),
                    Core.vx_new_string("Power Fluctuation"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Fluctuation")
                      )
                    ),
                    Core.vx_new_string("Power Reflection"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Reflection")
                      )
                    ),
                    Core.vx_new_string("Power Theft"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Theft")
                      )
                    ),
                    Core.vx_new_string("Power Vampire"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Vampire")
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_body_powers
   * @return {chapter}
   * (func chapter_body_powers)
   */
  public static interface Func_chapter_body_powers extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_body_powers();
  }

  public static class Class_chapter_body_powers extends Core.Class_base implements Func_chapter_body_powers {

    @Override
    public Func_chapter_body_powers vx_new(Object... vals) {
      Class_chapter_body_powers output = new Class_chapter_body_powers();
      return output;
    }

    @Override
    public Func_chapter_body_powers vx_copy(Object... vals) {
      Class_chapter_body_powers output = new Class_chapter_body_powers();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_body_powers", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_body_powers vx_empty() {return e_chapter_body_powers;}
    @Override
    public Func_chapter_body_powers vx_type() {return t_chapter_body_powers;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_body_powers();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_body_powers() {
      return Powers.f_chapter_body_powers();
    }

  }

  public static final Func_chapter_body_powers e_chapter_body_powers = new Powers.Class_chapter_body_powers();
  public static final Func_chapter_body_powers t_chapter_body_powers = new Powers.Class_chapter_body_powers();

  public static Base.Type_chapter f_chapter_body_powers() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Body Powers"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Alteration Powers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alteration Powers"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Adaptation"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Adaptation"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Ability to survive in hostile environments. Higher power levels ignore the effects of increasingly hostile environments."),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Adapt to Cold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Cold")
                              )
                            ),
                            Core.vx_new_string("Adapt to Desert"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Desert")
                              )
                            ),
                            Core.vx_new_string("Adapt to Electricity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Electricity")
                              )
                            ),
                            Core.vx_new_string("Adapt to Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Fire")
                              )
                            ),
                            Core.vx_new_string("Adapt to Fresh Water"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Fresh Water")
                              )
                            ),
                            Core.vx_new_string("Adapt to Heat"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Heat")
                              )
                            ),
                            Core.vx_new_string("Adapt to High Altitude"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to High Altitude")
                              )
                            ),
                            Core.vx_new_string("Adapt to High Gravity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to High Gravity")
                              )
                            ),
                            Core.vx_new_string("Adapt to High Pressure"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to High Pressure")
                              )
                            ),
                            Core.vx_new_string("Adapt to Low Gravity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Low Gravity")
                              )
                            ),
                            Core.vx_new_string("Adapt to Low Pressure"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Low Pressure")
                              )
                            ),
                            Core.vx_new_string("Adapt to Micro Impact"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Micro Impact"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can endure the impact of very small, high velocity particles like micro meterorites and small caliber bullets.")
                              )
                            ),
                            Core.vx_new_string("Adapt to Radiation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Radiation")
                              )
                            ),
                            Core.vx_new_string("Adapt to Salt Water"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Salt Water")
                              )
                            ),
                            Core.vx_new_string("Adapt to Vacuum"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Vacuum")
                              )
                            ),
                            Core.vx_new_string("Adapt to Zero Gravity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Zero Gravity")
                              )
                            ),
                            Core.vx_new_string("Adapt to Zero Pressure"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adapt to Zero Pressure")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Acidic"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Acidic"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Acid Bite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acid Bite")
                              )
                            ),
                            Core.vx_new_string("Acid Blood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acid Blood"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Gestates in a human host and has concentrated acid for blood - Aliens")
                              )
                            ),
                            Core.vx_new_string("Acid Spray"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acid Spray")
                              )
                            ),
                            Core.vx_new_string("Acid Spit"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acid Spit")
                              )
                            ),
                            Core.vx_new_string("Acid Sting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acid Sting")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Altered Skin"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Altered Skin"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Slippery Skin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Slippery Skin")
                              )
                            ),
                            Core.vx_new_string("Tar Baby"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tar Baby")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Animalism"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Animalism"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Beast Boy, Teen Titans"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Shapeshifter"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Adhesive Grip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adhesive Grip")
                              )
                            ),
                            Core.vx_new_string("Aspect of Wolf"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aspect of Wolf"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Everquest")
                              )
                            ),
                            Core.vx_new_string("Bat Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bat Sight")
                              )
                            ),
                            Core.vx_new_string("Bear Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bear Form")
                              )
                            ),
                            Core.vx_new_string("Bear Strength"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bear Strength")
                              )
                            ),
                            Core.vx_new_string("Cat Feet"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cat Feet"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduce damage from falls")
                              )
                            ),
                            Core.vx_new_string("Chameleon Skin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chameleon Skin")
                              )
                            ),
                            Core.vx_new_string("Extra Limbs"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Extra Limbs")
                              )
                            ),
                            Core.vx_new_string("Fish Eye"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fish Eye")
                              )
                            ),
                            Core.vx_new_string("Fish Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fish Form")
                              )
                            ),
                            Core.vx_new_string(":Gills"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gills")
                              )
                            ),
                            Core.vx_new_string("Hawk Eye"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hawk Eye"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Eagle Eye")
                              )
                            ),
                            Core.vx_new_string("Hawk Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hawk Form")
                              )
                            ),
                            Core.vx_new_string("Rat Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rat Form")
                              )
                            ),
                            Core.vx_new_string("Snake Bite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snake Bite")
                              )
                            ),
                            Core.vx_new_string("Snake Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snake Form")
                              )
                            ),
                            Core.vx_new_string("Spider Climb"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spider Climb")
                              )
                            ),
                            Core.vx_new_string(":Spines"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spines")
                              )
                            ),
                            Core.vx_new_string(":Tendrils"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tendrils")
                              )
                            ),
                            Core.vx_new_string(":Wings"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wings")
                              )
                            ),
                            Core.vx_new_string("Wolf Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wolf Form")
                              )
                            ),
                            Core.vx_new_string("Wolf Scent"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wolf Scent")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Demonic Power"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Demonic Power"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Yoki - 妖気, or 'demon essence' (the first character means demon, and second character is the same as the Chinese word commonly known as chi)."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Demon, Yoki, Yoma")
                      )
                    ),
                    Core.vx_new_string(":Diseases"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Diseases"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Fungal Growth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fungal Growth")
                              )
                            ),
                            Core.vx_new_string("Intestinal Parasite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Intestinal Parasite")
                              )
                            ),
                            Core.vx_new_string(":Rabid"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rabid")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Explosive"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Explosive"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Bombardier Spray"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bombardier Spray")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Flexible"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flexible"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Animated Hair"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Animated Hair")
                              )
                            ),
                            Core.vx_new_string("Arm Stretch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arm Stretch"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: May perform known [Punch] ability at range.")
                              )
                            ),
                            Core.vx_new_string("Body Stretch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Body Stretch"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* You need to be more ... flexible. - Elastigirl, The Incredibles")
                              )
                            ),
                            Core.vx_new_string("Bouncing Ball"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bouncing Ball")
                              )
                            ),
                            Core.vx_new_string(":Engulf"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engulf")
                              )
                            ),
                            Core.vx_new_string("Hair Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hair Whip")
                              )
                            ),
                            Core.vx_new_string("Leg Stretch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Leg Stretch"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: May perform known [Kick] ability at range.")
                              )
                            ),
                            Core.vx_new_string(":Tentacles"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tentacles")
                              )
                            ),
                            Core.vx_new_string("Tentacle Hammer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tentacle Hammer")
                              )
                            ),
                            Core.vx_new_string("Tentacle Spear"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tentacle Spear")
                              )
                            ),
                            Core.vx_new_string("Tentacle Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tentacle Whip")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Intangibility"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Intangibility"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Dematerialize"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dematerialize")
                              )
                            ),
                            Core.vx_new_string("Dematerialize Other"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dematerialize Other")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Invisibility"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Invisibility"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Invisible"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Invisible")
                              )
                            ),
                            Core.vx_new_string(":Transparency"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transparency")
                              )
                            ),
                            Core.vx_new_string(":Vanish"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vanish")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Longevity"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Longevity"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Eternal Youth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eternal Youth"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Ageless")
                              )
                            ),
                            Core.vx_new_string("Long Life"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Long Life")
                              )
                            ),
                            Core.vx_new_string(":Reincarnation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reincarnation"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Doctor Who")
                              )
                            ),
                            Core.vx_new_string("Reincarnation - Transference"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reincarnation - Transference")
                              )
                            ),
                            Core.vx_new_string("True Immortality"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("True Immortality")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Lycanthropy"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lycanthropy"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Lycanthropy is an inherited trait that normally lies dormant. It seems to be triggered by near death experiences with other Lycanthropes.\n!Traits\n* Permanent - Lycanthropy is an inherited trait and cannot be 'cured'.\n* Rage - Lycanthropes are easily angered and are subject to berserk rages.\n** [Anytime]: When taunted or after taking 2 or more damage, the unit must roll Lycanthropy vs. Spirit, gaining [Berserk] Tokens for each Hit. If the unit has any [Berserk] Tokens it immediately takes a non human Lycanthropy form on its next [Action].\n** [Daily]: On the first nights of the waxing and waning Moons or on any night under a Full Moon, the unit must check for going berserk as if taunted.\n* [Tooth and Claw]\n** Requires: Must be in a non human form.\n** Passive\n** +1 Melee or Close Combat for each [Rage] Token."),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Beast"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Animal Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Animal Form"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Action: Change to specific animal unit.\n** +1 Move, -2 Mind, +1 Spirit.\n** Clothes and Armor are destroyed or dropped.  All Equipment is dropped.\n** Gain [Natural Weaponry] and [Regeneration] Abilities.\n** Duration: Until sunrise.")
                              )
                            ),
                            Core.vx_new_string("Primal Animal Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Animal Form"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("American Werewolf in London")
                              )
                            ),
                            Core.vx_new_string("Beastman Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Beastman Form"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Wolfman or Mr. Hyde."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Action: Change to bestial humanoid unit.\n** +1 Body, -1 Mind.\n** Shirt and Armor is destroyed or dropped.\n** Gain [Regeneration] Ability.\n** Duration: Until sunrise.")
                              )
                            ),
                            Core.vx_new_string("Crinos Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crinos Form"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Howling"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Requires: [Animal Form], [Beastman Form]\n* Action: Change to specific Crinos unit.\n** +2 Body, -2 Mind, +1 Spirit.\n** Clothes and Armor are destroyed or dropped.\n** All Equipment not in hands is dropped.\n** Gain [Natural Weaponry], [Armor], and [Regeneration] Abilities.\n** Each [[Bleeding]] or [[Damage]] Token taken grants a [[Rage]] Token.\n** Each [[Bleeding]] Token inflicted grants a [[Rage]] Token.\n** Each adjacent Ally or Foe slain grants a [[Rage]] Token.\n** Remove a [[Rage]] Token instead of gaining a [[Hold]], [[Control]], [[Morale]], [[Despair]] or [[Fear]] Token.\n** If [[Rage]] Tokens exceed Spirit, then roll [[Rage]] vs [[Spirit]] or gain a [[Berserk]] Token.\n** Duration: Until sunrise.")
                              )
                            ),
                            Core.vx_new_string("Human Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Human Form"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Action: Change back to human unit from other Lycanthropy form.\n* Duration: Indefinite")
                              )
                            ),
                            Core.vx_new_string("Mark Territory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mark Territory"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By scenting an area, animals and supernatural beings will recognize the scent as a warning to stay away. Aggressive beings may be drawn to it.")
                              )
                            ),
                            Core.vx_new_string("Mirror Walk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mirror Walk"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Action: As a creature of spirit, Lycanthropes may enter the [Spirit Realm] merely by looking at their reflection in any surface.")
                              )
                            ),
                            Core.vx_new_string("Spirit Claw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spirit Claw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Allows unit to attack targets across the [Veil].")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Phasing"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phasing"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Phase Jump"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phase Jump"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The ability to move without travelling through the intervening space.\n* [Action]: Instantly move to any empty space up to 1/3 speed away without passing through any intervening spaces.")
                              )
                            ),
                            Core.vx_new_string("Phase Walk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phase Walk"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The ability to move through solid matter.\n* [Action]: Move at half speed ignoring terrain penalties or other objects. While Phase Walking, the user takes no physical damage (unless it is magical). If the move ends in a solid object, the user is still considered to be Phase Walking unitl it no longer ends it turn on a solid object. No attacks can be made this turn.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Reality Warping"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Reality Warping"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Franklin Richards"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Perhaps equal to Time Travel as the most powerful of all abilities. By altering reality, seemingly nothing is beyond possibility."),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Closed Universe"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Closed Universe"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* M.C. Escher, Relativity\n* Land of the Lost"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Exits from a location loop back upon themselves to leave a person back where they started.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Shape Change"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shape Change"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Shapeshifter"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Physical Imitation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physical Imitation"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* So, how do we know who's human? If I was an imitation, a perfect imitation, how would you know it was really me? - Childs, The Thing")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Size Control"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Size Control"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Growth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Growth")
                              )
                            ),
                            Core.vx_new_string(":Shrinking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shrinking")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Spawning"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spawning"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Copy Other"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Copy Other"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Split target into 2 copies, each with -1 on all abilities.")
                              )
                            ),
                            Core.vx_new_string("Copy Self"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Copy Self"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Split yourself into 2 copies, each with -1 on all abilities.")
                              )
                            ),
                            Core.vx_new_string("Detach Body Parts"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Detach Body Parts")
                              )
                            ),
                            Core.vx_new_string(":Offspring"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Offspring"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* A Cell gets out, and it will IMITATE EVERYTHING on the face of the EARTH! AND NOTHING CAN STOP IT! - Blair, The Thing")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Toxins"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Toxins"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Say 'ah'. Some poisons can kill people in the thousands with that amount. Like botulinum toxin. It inhibits acetylcholine release, causing loss of muscle tone, lethary, .. dizziness .., visual impairment.., heavy eyelids, intense thirst, loss of speech, vomiting, diarrhea, stomach distention, breathing difficulty.. then.. respiratory failure. - A.K.I, Street Fighter 6"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Poisonous, Venomous"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Blinding Spit"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blinding Spit")
                              )
                            ),
                            Core.vx_new_string("Blinding Toxin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blinding Toxin")
                              )
                            ),
                            Core.vx_new_string("Irritating Toxin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Irritating Toxin")
                              )
                            ),
                            Core.vx_new_string("Paralyzing Bite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paralyzing Bite")
                              )
                            ),
                            Core.vx_new_string("Paralyzing Spit"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paralyzing Spit")
                              )
                            ),
                            Core.vx_new_string("Paralyzing Spray"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paralyzing Spray")
                              )
                            ),
                            Core.vx_new_string("Paralyzing Sting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paralyzing Sting")
                              )
                            ),
                            Core.vx_new_string("Poison Bite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poison Bite")
                              )
                            ),
                            Core.vx_new_string("Poison Blood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poison Blood")
                              )
                            ),
                            Core.vx_new_string("Poison Spit"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poison Spit")
                              )
                            ),
                            Core.vx_new_string("Poison Spray"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poison Spray")
                              )
                            ),
                            Core.vx_new_string("Poison Sting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poison Sting")
                              )
                            ),
                            Core.vx_new_string("Poison Touch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poison Touch")
                              )
                            ),
                            Core.vx_new_string("Poisonous Flesh"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poisonous Flesh"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Poisonous if bitten")
                              )
                            ),
                            Core.vx_new_string("Poisonous Skin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poisonous Skin"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Poisonous to the touch")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Transformation"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Transformation"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Let me change into something a little more... Comfortable. - Elise, Runeterra"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Change Clothing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Change Clothing")
                              )
                            ),
                            Core.vx_new_string(":Combination"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Combination"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Form feet and legs; form arms and body; and I'll form the head! - Keith, Voltron"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Unit may combine with another unit with this ability to form a new unit with their combined value of Transformation skills or less.")
                              )
                            ),
                            Core.vx_new_string("Gaseous Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gaseous Form")
                              )
                            ),
                            Core.vx_new_string("Liquid Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Liquid Form")
                              )
                            ),
                            Core.vx_new_string("Matter Chameleon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Matter Chameleon"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Kevin from Ben 10"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Transform body into any material touched")
                              )
                            ),
                            Core.vx_new_string("Metal Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Metal Form"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Colossus - X-men\n* I'm bulletproof, nothing to lose...fire away, fire away...richochet, you take your aim... fire away, fire away...you shoot me down, but I won't fall...I am titanium - David Guetta, Titanium"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Transform body into any material touched")
                              )
                            ),
                            Core.vx_new_string("Plant Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plant Form"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Swamp Thing, Man-Thing")
                              )
                            ),
                            Core.vx_new_string("Quick Change"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Quick Change")
                              )
                            ),
                            Core.vx_new_string(":Transform"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transform"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("More Than Meets the Eye - Transformers"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Change into a new unit with skill points equal to Transform.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Vampirism"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vampirism"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Any unit with Vampirism is by definition a [Vampire].\n* [Deploy]: Start with [Vampire Blood] Tokens equal to Vampirisim.\n* Generations - When a Vampire is created, it automatically gains the Vampire Generation ability one less than the one who created them. A Vampire can only gain a lower Generation by [Diablerie].\n* Vitae - The blood\n* Hunger - Vampires are always hungry, unless they have recently killed."),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Beast"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Vampire: 15th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 15th Generation"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Stray")
                              )
                            ),
                            Core.vx_new_string("Vampire: 14th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 14th Generation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The last generation is known as thin-blooded vampires and start with only basic Vampiric powers. During the Dark Ages the Thirteenth Generation was believed to be the last, but in the Final Nights this is comprised of the 14th and 15th Generations."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Thin Blood")
                              )
                            ),
                            Core.vx_new_string("Vampire: 13th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 13th Generation")
                              )
                            ),
                            Core.vx_new_string("Vampire: 12th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 12th Generation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Although they lack the powers of the lower generations, the vampires of the 12th and 13th generations stand above men, capable of besting the strongest mortal knight in battle and wielding influence over barons, merchants and courts.")
                              )
                            ),
                            Core.vx_new_string("Vampire: 11th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 11th Generation")
                              )
                            ),
                            Core.vx_new_string("Vampire: 10th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 10th Generation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* While they are comparatively young, most vampires created within the last few centuries belong to the tenth and eleventh generation.")
                              )
                            ),
                            Core.vx_new_string("Vampire: 9th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 9th Generation")
                              )
                            ),
                            Core.vx_new_string("Vampire: 8th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 8th Generation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Achieving a delicate balance between age and generation, these vampires are the most visible ones of the 14th century. They are nowhere near as old as most Cainites of lower generation, which places them in a delicate position. Most Cainites of eighth and ninth generation overcome this disadvantage by siring large covens of childer.")
                              )
                            ),
                            Core.vx_new_string("Vampire: 7th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 7th Generation")
                              )
                            ),
                            Core.vx_new_string("Vampire: 6th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 6th Generation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Many of the vampires of the sixth and seventh generation are the self-styled lords of Cainite society. Although they are not as powerful as the Methuselahs, these Cainites are still formidable opponents, who gladly sacrifice mystical and spiritual power for temporal influence. These Cainites rule over vast kingdoms, donning the crown of monarchs and commanding armies of younger Cainites and mortal thralls.")
                              )
                            ),
                            Core.vx_new_string("Vampire: 5th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 5th Generation"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Methuselah")
                              )
                            ),
                            Core.vx_new_string("Vampire: 4th Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 4th Generation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Methsuselahs are the most powerful modern Vampires that have been encountered. They are terrifyingly alien and powerful. It is hard to imagine the power of the lower Generations, given the strenght of the 4th Generation."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Methuselah")
                              )
                            ),
                            Core.vx_new_string("Vampire: 3rd Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 3rd Generation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Thirteen ancient Vampires were thought to have survived past the great flood and to have started the existing clans. Presumably the Antediluvians are of such age and potency of blood that they possess nearly god-like power, and in fact some of them may be deities. Most believe these god-like beings to be either in torpor, manipulating the Jyhad, or dead. While some clans regard their progenitor favorably, as a whole the Antediluvians are often portrayed as boogeymen that will one day rise and devour their descendants in at time called Gehenna."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Antedeluvlain")
                              )
                            ),
                            Core.vx_new_string("Vampire: 2nd Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 2nd Generation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* It is said that there were three second generation Vampires: Enoch, the Wise (Caine's advisor), Irad, the Strong (Caine's general) and Zillah, the Beautiful (Caine's wife). They lived in the first city and presumably created the Antedeluvians, but nothing is known of them after their childer rose up against them in the final nights of the First City. Perhaps the Second Generation perished in the Deluge, or at the hands of their childer.")
                              )
                            ),
                            Core.vx_new_string("Vampire: 1st Generation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire: 1st Generation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Only Cain, the original Vampire, is 1st generation. After all this time, his abilities would be beyond imagination.")
                              )
                            ),
                            Core.vx_new_string("Blood Bond"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Bond")
                              )
                            ),
                            Core.vx_new_string("Blood Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Sight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* See blood through the skin.\n* With close observation, subtle blood characteristics can be detected including blood diseases, poisoning, or Diablerie")
                              )
                            ),
                            Core.vx_new_string("Consume Flesh"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Consume Flesh"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Consume the flesh of a grabbed unit. Gain a [Vampire Blood] token and target gains a [Damage] and a [Spirit Damage].\n* You may not gain more [Vampire Blood] than target has [Spirit], though you gain one more [Vampire Blood] if the target is slain by drinking its blood.\n* You may not have more [Vampire Blood] than [Vampirism].\n* You may not drink from the dead.")
                              )
                            ),
                            Core.vx_new_string("Drink Blood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drink Blood"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Drink blood from a grabbed unit. Gain a [Vampire Blood] token and target gains a [Damage] and a [Spirit Damage].\n* You may not gain more [Vampire Blood] than target has [Spirit], though you gain one more [Vampire Blood] if the target is slain by drinking its blood.\n* You may not have more [Vampire Blood] than [Vampirism].\n* You may not drink from the dead."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("The Kiss")
                              )
                            ),
                            Core.vx_new_string(":Embrace"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Embrace"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* It was magical. The surrender. The exquisite suicide of giving in ... words cannot encompass that experience ... I asked him ... 'What gives you the right?' ... My question had struck no chord of mercy ... Rather, I believe he wanted me to become as he was and see for myself what gave him the right - what gives all of our kind the right."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Sire - When a Vampire creates a another the creator is called its Sire.")
                              )
                            ),
                            Core.vx_new_string(":Torpor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Torpor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* If slain, but the body is not burned or the head severed, the vampire will not die but instead enter a deep sleep while his body slowly recovers.\n* It is said that very old Vampires may be sleeping for centuries in Torpor.")
                              )
                            )
                          )
                        ),
                        Core.f_new(
                          Core.t_msgblock,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":msgs"),
                            Core.f_new(
                              Core.t_msglist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Core.t_msg,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":code"),
                                    Core.vx_new_string(":invalidtagfound"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_power,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("weakness")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":msgblocks"),
                            Core.f_new(
                              Core.t_msgblocklist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Core.t_msgblock,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":msgs"),
                                    Core.f_new(
                                      Core.t_msglist,
                                      Core.t_anylist.vx_new(
                                        Core.f_new(
                                          Core.t_msg,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":code"),
                                            Core.vx_new_string(":invalidtagfound"),
                                            Core.vx_new_string(":detail"),
                                            Core.f_new(
                                              Core.t_anymap,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":type"),
                                                Base.t_power,
                                                Core.vx_new_string(":tag"),
                                                Core.vx_new_string("weakness")
                                              )
                                            ),
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Cybernetics"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cybernetics"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Metal is perfection. - Viktor, Runeterra"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Faux Flesh (Faux Skin) - The great breakthrough in cybernetics was not in machinery but in synthetic flesh. Faux Flesh is a foam that hardens into soft, realistic flesh that will not be rejected by user's immune system. Faux Flesh can be injected between machine parts and is used at all interface points between living tissue and cyberware. It seals wounds like chalking and is a staple of medical kits."),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Cybernetic Arm"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cybernetic Arm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* All abilities assume both arms are cybernetic. If only one is used all abilities are at -1."),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Cybernetic Blade"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Blade")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Claws"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Claws"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I'm the best at what I do - Wolverine")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Electrifier"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Electrifier"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Discharge a massive electric charge through the palms of the hands.")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Fingernails"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Fingernails")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Hammer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Hammer")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Knife"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Knife"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Punch Blade")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Knuckles"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Knuckles")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Saw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Saw")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Shredder"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Shredder")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Spike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Spike")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Strength"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Strength")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Weapon Arm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Weapon Arm"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Nonconsealable.\n* One or both arms may be replaced with heavy weapons from rifles, grenade launchers, micromissile launchers, up to miniguns.")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Weapon Hand"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Weapon Hand"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A regular pistol or SMG of any sort may be modified to fit into a cybernetic arm. This ability may be purchased for each arm.")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Whip")
                              )
                            ),
                            Core.vx_new_string("Extension Hand"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Extension Hand")
                              )
                            ),
                            Core.vx_new_string("Extra Cybernetic Arm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Extra Cybernetic Arm")
                              )
                            ),
                            Core.vx_new_string("False Fingerprints"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("False Fingerprints")
                              )
                            ),
                            Core.vx_new_string("False Palmprint"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("False Palmprint")
                              )
                            ),
                            Core.vx_new_string("Grapple Hand"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Grapple Hand")
                              )
                            ),
                            Core.vx_new_string("Monofilament Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Monofilament Whip")
                              )
                            ),
                            Core.vx_new_string("Smartgun Link"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Smartgun Link")
                              )
                            ),
                            Core.vx_new_string("Sonic Filter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sonic Filter"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces sonic damage")
                              )
                            ),
                            Core.vx_new_string("Tactile Enhancer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tactile Enhancer")
                              )
                            ),
                            Core.vx_new_string("Tool Hand"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tool Hand")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Cybernetic Hearing"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cybernetic Hearing"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* All abilities assume both ears are cybernetic.  If only one is used all abilities are at -1."),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Antideafening"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Antideafening")
                              )
                            ),
                            Core.vx_new_string("Bug Detector"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bug Detector")
                              )
                            ),
                            Core.vx_new_string("Enhanced Hearing Range"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enhanced Hearing Range"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can hear supersonic and subsonic sounds.")
                              )
                            ),
                            Core.vx_new_string("Noise Filter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Noise Filter")
                              )
                            ),
                            Core.vx_new_string("Parabolic Hearing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Parabolic Hearing")
                              )
                            ),
                            Core.vx_new_string("Radar Sensor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radar Sensor")
                              )
                            ),
                            Core.vx_new_string("Sonar Sensor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sonar Sensor")
                              )
                            ),
                            Core.vx_new_string("Stethoscope Hearing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stethoscope Hearing")
                              )
                            ),
                            Core.vx_new_string("Voice Stress Analyzer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Voice Stress Analyzer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Detects stress in the target's voice.  Often this means lying.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Cybernetic Implants"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cybernetic Implants"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Animated Tatoo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Animated Tatoo")
                              )
                            ),
                            Core.vx_new_string("Artificial Gills"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Artificial Gills")
                              )
                            ),
                            Core.vx_new_string("Biomesh Skin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Biomesh Skin")
                              )
                            ),
                            Core.vx_new_string("Breast Enhancement"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Breast Enhancement"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Size and shape may be changed at will")
                              )
                            ),
                            Core.vx_new_string("Body Plating"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Body Plating")
                              )
                            ),
                            Core.vx_new_string("Contraceptive Implant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Contraceptive Implant")
                              )
                            ),
                            Core.vx_new_string(":Cybersnake"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybersnake"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A visious close combat weapon that is implanted in mouth, stomach, or genitals! When in Close Combat range, the Cybersnake may lash out with surprise and land a potentially fatal blow.")
                              )
                            ),
                            Core.vx_new_string(":Cyberteeth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cyberteeth"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Jaws - Moonraker"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cyberfangs")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Rebreather"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Rebreather"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* May survive without fresh air for 10 minutes per level.")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Tail"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Tail"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Adds a tail")
                              )
                            ),
                            Core.vx_new_string("Disease Filter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Disease Filter")
                              )
                            ),
                            Core.vx_new_string("Drug Filter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drug Filter")
                              )
                            ),
                            Core.vx_new_string("False DNA"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("False DNA")
                              )
                            ),
                            Core.vx_new_string("Gas Filter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gas Filter"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Filters harmful gases from the particles from the air, so they never reach the lungs.")
                              )
                            ),
                            Core.vx_new_string("Hair Colorizing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hair Colorizing")
                              )
                            ),
                            Core.vx_new_string("Hair Styleshifting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hair Styleshifting")
                              )
                            ),
                            Core.vx_new_string("Jamming Transmitter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jamming Transmitter")
                              )
                            ),
                            Core.vx_new_string("Medical Injection System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Medical Injection System")
                              )
                            ),
                            Core.vx_new_string("Motion Sensor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Motion Sensor")
                              )
                            ),
                            Core.vx_new_string("Nasal Filter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nasal Filter"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Removes particles from the air including sand, dust, pollen, and other large particles.")
                              )
                            ),
                            Core.vx_new_string("Olfactory Enhancer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Olfactory Enhancer")
                              )
                            ),
                            Core.vx_new_string("Poison Sniffer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poison Sniffer")
                              )
                            ),
                            Core.vx_new_string("Poisonous Cyberteeth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poisonous Cyberteeth")
                              )
                            ),
                            Core.vx_new_string("Reflex Enhancer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reflex Enhancer")
                              )
                            ),
                            Core.vx_new_string("Reinforced Bones"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reinforced Bones")
                              )
                            ),
                            Core.vx_new_string("Sexual Implant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sexual Implant")
                              )
                            ),
                            Core.vx_new_string("Skin Colorizing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Skin Colorizing")
                              )
                            ),
                            Core.vx_new_string("Stimulant Injectors"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stimulant Injectors")
                              )
                            ),
                            Core.vx_new_string("Subdermal Holster"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Subdermal Holster")
                              )
                            ),
                            Core.vx_new_string("Subdermal Pouch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Subdermal Pouch")
                              )
                            ),
                            Core.vx_new_string("Subdermal Transponder"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Subdermal Transponder")
                              )
                            ),
                            Core.vx_new_string("Toxin Filter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Toxin Filter")
                              )
                            ),
                            Core.vx_new_string("Voice Amplifier"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Voice Amplifier")
                              )
                            ),
                            Core.vx_new_string("Voice Descrambler"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Voice Descrambler"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* May understand encrypted audio information if you know the key.")
                              )
                            ),
                            Core.vx_new_string("Voice Scrambler"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Voice Scrambler"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* May speak in encrypted phrases that only a descrambler with the key can understand.")
                              )
                            ),
                            Core.vx_new_string("Voice Synthesizer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Voice Synthesizer")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Cybernetic Interface"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cybernetic Interface"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Cybernetic Interface include mostly software-based sensors and systems."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Neuralware"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Co-processor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Co-processor")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Countermeasures"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Countermeasures"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hardens cybernetic computer components against attempts to hack or scramble it systems.")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Datapad"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Datapad")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Recorders"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Recorders"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can record or playback audio and video")
                              )
                            ),
                            Core.vx_new_string("Direct Comm Link"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Direct Comm Link"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Listen to your music collection or radio stations, watch television, surf the web, or make phone calls.\n* Because these are neural links, they do not actually require cybernetic eyes or ears.")
                              )
                            ),
                            Core.vx_new_string("Direct Neural Link"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Direct Neural Link"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Do you think that's air your breathing?")
                              )
                            ),
                            Core.vx_new_string("Medical Scanner"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Medical Scanner")
                              )
                            ),
                            Core.vx_new_string("Memory Chip Interface"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Memory Chip Interface")
                              )
                            ),
                            Core.vx_new_string("Pain Suppressor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pain Suppressor")
                              )
                            ),
                            Core.vx_new_string("Security Scanner"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Security Scanner")
                              )
                            ),
                            Core.vx_new_string("Skill Chip Interface"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Skill Chip Interface"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I know Kung Fu\n* Do you know how to fly that thing? Not yet. - The Matrix")
                              )
                            ),
                            Core.vx_new_string("Translation Software"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Translation Software")
                              )
                            ),
                            Core.vx_new_string("Vehicle Link"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vehicle Link")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Cybernetic Legs"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cybernetic Legs"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* All abilities assume both legs are cybernetic.  If only one is used all abilities are at -1."),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Cybernetic Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Kick")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Leap"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Leap")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Rocket Launcher"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Rocket Launcher")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Running"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Running")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Tractor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Tractor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Nonconsealable.\n* Replace both legs with wheels or treads.")
                              )
                            ),
                            Core.vx_new_string("Extra Cybernetic Leg"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Extra Cybernetic Leg")
                              )
                            ),
                            Core.vx_new_string("Prehensile Foot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prehensile Foot")
                              )
                            ),
                            Core.vx_new_string("Spike Foot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spike Foot")
                              )
                            ),
                            Core.vx_new_string("Talon Foot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Talon Foot")
                              )
                            ),
                            Core.vx_new_string("Webbed Foot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Webbed Foot"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Enhanced swimming")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Cybernetic Vision"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cybernetic Vision"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Colorizing Eyes"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Colorizing Eyes")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Antidazzle"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Antidazzle")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Camera"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Camera")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Eye Laser"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Eye Laser")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Heat Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Heat Vision")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Image Enhancement"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Image Enhancement")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Laser Pointer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Laser Pointer")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Microscopic Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Microscopic Vision")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Night Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Night Vision")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Rangefinder"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Rangefinder")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Targeting System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Targeting System")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Telescopic Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Telescopic Vision")
                              )
                            ),
                            Core.vx_new_string("False Retina"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("False Retina")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Netrunning"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Netrunning"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Do not try and bend the spoon. That's impossible. Instead, only try to realize the truth. What truth? There is no spoon. There is no spoon? Then you will see that it is not the spoon that bends. It is only yourself. - The Matrix\n* You must let it all go... Fear... Doubt... Disbelief. Free Your Mind. - Morpheus, The Matrix"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* By directly connecting the brain to a computer program, the user can greatly increase his reaction time and resourcefulness while travelling in cyberspace.\n* Netrunners - Outlaw computer jocks or hackers.\n* SysOps - Corporate or government computer system defenders.\n* ICE - Intrusion Countermeasures Electronics. Guardian software designed to thwart hackers and intrusion programs.\n* Black ICE - ICE programs designed to trap and harm the hackers or software it is defending against. This can range from induced system failures, data loss, or dangerous electric feedback. Numerous safeguards exist against such dangerous software, but Black ICE attempts to lure the user into believing that by lowering these safeguards that he will have the opportunity to steal information. Often to make this lure credible, actual information must be put at risk.\n* ICE Breker - Software designed to counter ICE.\n* Avatar - The digital representation of those in the NET."),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Code Breaker Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Code Breaker Program"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attempts to fool a [Gateway Program] that you are a legitimate user.")
                              )
                            ),
                            Core.vx_new_string("Crash Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crash Program")
                              )
                            ),
                            Core.vx_new_string("Denial Of Service Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Denial Of Service Program"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attempts to overwhelm the target program with millions of requests, thereby preventing legitimate users from accessing it until it can catch up with all of the requests."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("DOS")
                              )
                            ),
                            Core.vx_new_string("Feedback Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Feedback Program")
                              )
                            ),
                            Core.vx_new_string("Flatline Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flatline Program")
                              )
                            ),
                            Core.vx_new_string("Freeze Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Freeze Program"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attempts to alter the target program's internal clock, thereby slowing it or causing it to become non-responsive for a short about of time.")
                              )
                            ),
                            Core.vx_new_string("Jackhammer Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jackhammer Program"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attempts to damage a [Firewall Program]. Such blatant attempts immediately raise alarms and are often a tool of last resort.")
                              )
                            ),
                            Core.vx_new_string("Phishing Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phishing Program"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Password Research Program")
                              )
                            ),
                            Core.vx_new_string("Speedtrap Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Speedtrap Program")
                              )
                            ),
                            Core.vx_new_string("Stealth Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth Program")
                              )
                            ),
                            Core.vx_new_string("Succubus Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Succubus Program")
                              )
                            ),
                            Core.vx_new_string("Task Killer Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Task Killer Program")
                              )
                            ),
                            Core.vx_new_string("Tracer Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tracer Program"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bloodhound")
                              )
                            ),
                            Core.vx_new_string("Trojan Horse Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trojan Horse Program")
                              )
                            ),
                            Core.vx_new_string("Worm Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Worm Program")
                              )
                            ),
                            Core.vx_new_string("Camera Control Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Camera Control Program")
                              )
                            ),
                            Core.vx_new_string("Communications Uplink Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Communications Uplink Program")
                              )
                            ),
                            Core.vx_new_string("Elevator Control Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elevator Control Program")
                              )
                            ),
                            Core.vx_new_string("Engine Control Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engine Control Program")
                              )
                            ),
                            Core.vx_new_string("Factory Control Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Factory Control Program")
                              )
                            ),
                            Core.vx_new_string("Lock Control Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lock Control Program")
                              )
                            ),
                            Core.vx_new_string("Navigation Control Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Navigation Control Program")
                              )
                            ),
                            Core.vx_new_string("Printer Control Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Printer Control Program")
                              )
                            ),
                            Core.vx_new_string("Telecom Control Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telecom Control Program")
                              )
                            ),
                            Core.vx_new_string("Vehicle Control Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vehicle Control Program")
                              )
                            ),
                            Core.vx_new_string(":Firewall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firewall")
                              )
                            ),
                            Core.vx_new_string("Gateway Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gateway Program"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Login Screen, Padlock")
                              )
                            ),
                            Core.vx_new_string("Guardian Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Guardian Program"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Doberman")
                              )
                            ),
                            Core.vx_new_string("Intrusion Detection System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Intrusion Detection System"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Alarm, Watchdog")
                              )
                            ),
                            Core.vx_new_string("Worm Consumer Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Worm Consumer Program"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Aardvark, Robin")
                              )
                            ),
                            Core.vx_new_string("Daemon Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Daemon Program")
                              )
                            ),
                            Core.vx_new_string("Database Search Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Database Search Program")
                              )
                            ),
                            Core.vx_new_string("Decryption Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Decryption Program")
                              )
                            ),
                            Core.vx_new_string("Encryption Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Encryption Program")
                              )
                            ),
                            Core.vx_new_string("Filelocker Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Filelocker Program")
                              )
                            ),
                            Core.vx_new_string("Unerase Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unerase Program")
                              )
                            ),
                            Core.vx_new_string("Adware Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adware Program")
                              )
                            ),
                            Core.vx_new_string("Eraser Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eraser Program")
                              )
                            ),
                            Core.vx_new_string("Malware Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Malware Program")
                              )
                            ),
                            Core.vx_new_string("Memory Cosumer Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Memory Cosumer Program")
                              )
                            ),
                            Core.vx_new_string("Metamorphic Virus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Metamorphic Virus")
                              )
                            ),
                            Core.vx_new_string("Polymorphic Virus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Polymorphic Virus")
                              )
                            ),
                            Core.vx_new_string("Spyware Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spyware Program")
                              )
                            ),
                            Core.vx_new_string("Zombie Program"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zombie Program")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Attack Programs"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Attack Programs")
                              )
                            ),
                            Core.vx_new_string("Control Programs"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Programs")
                              )
                            ),
                            Core.vx_new_string("Protection Programs"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Protection Programs"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("ICE")
                              )
                            ),
                            Core.vx_new_string(":Utilities"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Utilities")
                              )
                            ),
                            Core.vx_new_string(":Viruses"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Viruses")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_energy_and_forces
   * @return {chapter}
   * (func chapter_energy_and_forces)
   */
  public static interface Func_chapter_energy_and_forces extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_energy_and_forces();
  }

  public static class Class_chapter_energy_and_forces extends Core.Class_base implements Func_chapter_energy_and_forces {

    @Override
    public Func_chapter_energy_and_forces vx_new(Object... vals) {
      Class_chapter_energy_and_forces output = new Class_chapter_energy_and_forces();
      return output;
    }

    @Override
    public Func_chapter_energy_and_forces vx_copy(Object... vals) {
      Class_chapter_energy_and_forces output = new Class_chapter_energy_and_forces();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_energy_and_forces", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_energy_and_forces vx_empty() {return e_chapter_energy_and_forces;}
    @Override
    public Func_chapter_energy_and_forces vx_type() {return t_chapter_energy_and_forces;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_energy_and_forces();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_energy_and_forces() {
      return Powers.f_chapter_energy_and_forces();
    }

  }

  public static final Func_chapter_energy_and_forces e_chapter_energy_and_forces = new Powers.Class_chapter_energy_and_forces();
  public static final Func_chapter_energy_and_forces t_chapter_energy_and_forces = new Powers.Class_chapter_energy_and_forces();

  public static Base.Type_chapter f_chapter_energy_and_forces() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Energy and Forces"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Elements"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Elements"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Air"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Air"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* But still the clever north wind was not satisfied. It spoke to Vianne of towns yet to be visited, friends in need yet to be discovered, battles yet to be fought... - Chocolat\n* You're really going to trust me ... My mind is like the wind on the waves. It could change in an instant. - Kazuha, Genshin Impact"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Air is the element of freedom. Air elementalists remain distant from worldly concerns. They are always in continous motion, moving from place to place and never putting down roots.\n* Symbol - White Swirling Wind\n* Personality - Airy, Flighty, Emphemeral, Ethereal, Gossamer"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aeromancer. Storm Lord, Storm Shaman, Weather Witch, Wind Rider, Wind Walker"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Acid Cloud"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acid Cloud")
                              )
                            ),
                            Core.vx_new_string("Acid Rain"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acid Rain"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Calls acid rain from an existing cloud.")
                              )
                            ),
                            Core.vx_new_string("Air Breathing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Air Breathing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can breath in any kind of air without ill effect including poison gases.")
                              )
                            ),
                            Core.vx_new_string("Alter Temperature"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alter Temperature")
                              )
                            ),
                            Core.vx_new_string("Alter Weather"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alter Weather")
                              )
                            ),
                            Core.vx_new_string("Call Storm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call Storm"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Calls a storm cloud.")
                              )
                            ),
                            Core.vx_new_string("Carried on the Wind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Carried on the Wind"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By focusing, the user can detect small things carried on the wind. Smoke, pollen, poison, unusual smells, ash, dust, faint sounds, etc. may be detected with uncanny ability. Higher levels detect more distanct and faint things.")
                              )
                            ),
                            Core.vx_new_string("Control Storm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Storm")
                              )
                            ),
                            Core.vx_new_string("Clean Air"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Clean Air")
                              )
                            ),
                            Core.vx_new_string("Choking Cloud"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Choking Cloud")
                              )
                            ),
                            Core.vx_new_string("Control Winds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Winds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Effect: Raise or lower Wind strength.")
                              )
                            ),
                            Core.vx_new_string(":Downdraft"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Downdraft")
                              )
                            ),
                            Core.vx_new_string("Eye of the Storm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eye of the Storm"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Create an eye in the storm that reduces [Wind Intensity] in 1 space radius for each Hit.\n* [Continue]: Reroll wind reduction and radius increases by 2 up to Level radius.\n* [Discontinue]: Wind returns to normal at same rate it was reduced.")
                              )
                            ),
                            Core.vx_new_string("Fan the Flames"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fan the Flames")
                              )
                            ),
                            Core.vx_new_string("Fog Bank"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fog Bank")
                              )
                            ),
                            Core.vx_new_string(":Hailstorm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hailstorm")
                              )
                            ),
                            Core.vx_new_string(":Hurricane"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hurricane"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Buildup"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Divine Wind")
                              )
                            ),
                            Core.vx_new_string("Lightning Charge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lightning Charge"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Imbue an item with electric charge that is discharged on contact.")
                              )
                            ),
                            Core.vx_new_string(":Smother"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Smother")
                              )
                            ),
                            Core.vx_new_string(":Spindrift"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spindrift"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wind generates a thick mist above any body of water.")
                              )
                            ),
                            Core.vx_new_string(":Suffocate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Suffocate")
                              )
                            ),
                            Core.vx_new_string("Summon Cloud"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Cloud"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Summons a large living cloud in moisture rich air. This can obscure vision.")
                              )
                            ),
                            Core.vx_new_string("Summon Djinn"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Djinn")
                              )
                            ),
                            Core.vx_new_string("Summon Gust"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Gust"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Summons a small living wind on items that may be blown in the breeze. Air elementals love nothing more than pushing things around.")
                              )
                            ),
                            Core.vx_new_string("Summon Slyph"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Slyph")
                              )
                            ),
                            Core.vx_new_string(":Swirl"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swirl")
                              )
                            ),
                            Core.vx_new_string("Temperature Control"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Temperature Control"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Effect: Raise or lower Temperature, Humidity.")
                              )
                            ),
                            Core.vx_new_string(":Tempest"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tempest")
                              )
                            ),
                            Core.vx_new_string("Tempest in a Teapot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tempest in a Teapot"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hits have no effect.  Criticals change Weather Intensity.")
                              )
                            ),
                            Core.vx_new_string(":Thunderstorm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Thunderstorm")
                              )
                            ),
                            Core.vx_new_string("Voices Carry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Voices Carry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Listen to conversation within line of sight.")
                              )
                            ),
                            Core.vx_new_string("Weather Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Weather Sight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Analyze and predict weather")
                              )
                            ),
                            Core.vx_new_string("Wind Lash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wind Lash"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Wind Whip")
                              )
                            ),
                            Core.vx_new_string(":Whirlwind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Whirlwind"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cyclone, Tornado")
                              )
                            ),
                            Core.vx_new_string("Whispering Winds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Whispering Winds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Speak to others (one way) over long distances.")
                              )
                            ),
                            Core.vx_new_string("Wind Blade"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wind Blade"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create an ephemeral Sword created from thin air. It acts as a normal sword except that it does [Knockback] instead of [Bleeding].")
                              )
                            ),
                            Core.vx_new_string("Wind Blast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wind Blast"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Where the two winds meet, there I will see the Wind Scar - Inuyasha")
                              )
                            ),
                            Core.vx_new_string("Wind Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wind Form"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Stand in a breeze.\n* [Action]: Gain attributes of Wind as well as [Wind Walk] for the turn.\n* [Continue]: May make [Strike] and [Grab] Wind Close Combat attacks at Level.")
                              )
                            ),
                            Core.vx_new_string("Wind Slash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wind Slash")
                              )
                            ),
                            Core.vx_new_string("Wind Walk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wind Walk")
                              )
                            ),
                            Core.vx_new_string("Wind Wall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wind Wall"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wall that deflects missles and strikes aerial units.")
                              )
                            ),
                            Core.vx_new_string(":Updraft"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Updraft"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Apply [Wind] in a radius around user, lift enemies off the ground with Level weight, and hurl them down, if they strike a surface they take Level damage .")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Aeromancy"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aeromancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Aero is the magical version of Air.\n* Aero effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Aero reacts with Pyro to produce the [Wildfire] effect.\n* Aero reacts with Cryo to produce the [Chill] effect.\n* Aero reacts with Hydro to produce the [Fog] effect.\n* Aero reacts with Electro to produce the [Ionized] effect.\n* Aero reacts with Geo to produce the [Weightess] effect.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Cold"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cold"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Cold Miser, Frozen"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Cold abilities slow the movement of particles in the target. This slowing causes heat to leave the target. Therefore, cold powers also trigger a rush of hot air to rise from the target swirling wind all around.\n* Symbol - Bluish White Snowflake\n* Personality: Cold Elementalist personalities are influenced by their link to Cold.\n** Examples: Cold, Icy, Chilly, Severe, Harsh, Brutal, Reserved"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Frost Lord, Ice Breaker, Ice Queen, Snow Queen, Ice Princess"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Avalanche"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Avalanche")
                              )
                            ),
                            Core.vx_new_string(":Blizzard"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blizzard")
                              )
                            ),
                            Core.vx_new_string("Call Cold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call Cold"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Coldsnap")
                              )
                            ),
                            Core.vx_new_string(":Chill"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chill"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Damage are Slow")
                              )
                            ),
                            Core.vx_new_string(":Comet"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Comet"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A massive ball of cold falls from the sky.")
                              )
                            ),
                            Core.vx_new_string("Control Cold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Cold"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect a cold effect to another target.")
                              )
                            ),
                            Core.vx_new_string("Frost Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Frost Whip"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Frost Lash")
                              )
                            ),
                            Core.vx_new_string("Frost Weapon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Frost Weapon"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Add cold damage to normal attack."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Freezing Strike")
                              )
                            ),
                            Core.vx_new_string("Glacial Wall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Glacial Wall")
                              )
                            ),
                            Core.vx_new_string("Ice Armor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Armor"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Frozen Man, Ice Form, Ice Man Cometh")
                              )
                            ),
                            Core.vx_new_string("Ice Blast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Blast"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Frost Bite")
                              )
                            ),
                            Core.vx_new_string("Ice Bridge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Bridge")
                              )
                            ),
                            Core.vx_new_string("Ice Castle"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Castle"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The cold never bothered me anyway. - Elsa, Frozen"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Snow Fort")
                              )
                            ),
                            Core.vx_new_string("Ice Flow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Flow"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A floating block of ice suitable for a raft rises to the water's surface.\n* [Requires]: May only be cast near water.")
                              )
                            ),
                            Core.vx_new_string("Ice Riding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Riding"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Provides [Skating] ability without the requirement of Skates."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Ice Walk")
                              )
                            ),
                            Core.vx_new_string("Ice Sculpture"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Sculpture")
                              )
                            ),
                            Core.vx_new_string("Ice Slide"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Slide")
                              )
                            ),
                            Core.vx_new_string("Ice Storm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Storm"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Hail Storm")
                              )
                            ),
                            Core.vx_new_string("Icy Prison"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Icy Prison")
                              )
                            ),
                            Core.vx_new_string(":Snowblind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snowblind")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Cryomancy"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cryomancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cryo is the magical version of Cold.\n* Cryo effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Cryo reacts with Pyro to produce the [Melt] effect.\n* Cryo reacts with Geo to produce the [Brittle] effect.\n* Cryo reacts with Hydro to produce the [Freeze] effect.\n* Cryo reacts with Electro to produce the [Superconduct] effect.\n* Cryo reacts with Aero to produce the [Chill] effect.")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Forces"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Forces"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Earth"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Earth"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Earth is the element of substance. Earth Elementalists must be persistent, stoic, strong and enduring. They must be subbornly immobile in mind and spirit.\n* Symbol - Brown Mountain"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Earth Lord, Earth Master, Geomancer"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Buried Alive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Buried Alive"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I've done far worse than kill you. I've hurt you. And I wish to go on hurting you. I shall leave you as you left me, as you left her; marooned for all eternity in the center of a dead planet... buried alive! Buried alive...! - Khan, Star Trek II: The Wrath of Khan"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Collapse earth to close an opening.")
                              )
                            ),
                            Core.vx_new_string("Call Rockslide"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call Rockslide")
                              )
                            ),
                            Core.vx_new_string("Control Earth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Earth"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect an earth effect to another target.")
                              )
                            ),
                            Core.vx_new_string(":Earthbind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earthbind"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Gravity increases for target flying unit. [-1 Altitude] for each success. No effect on units that are not flying."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Grip of Earth")
                              )
                            ),
                            Core.vx_new_string("Earth Move"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earth Move"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Pushes a mound of earth like a bulldozer.")
                              )
                            ),
                            Core.vx_new_string("Earth Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earth Sight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By touching the ground with bare skin, detect any object directly touching the ground in sight range regardless of intervening obstacle. This ability is particularly useful underground, for seeing through walls, and for indirect fire."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Earthsense")
                              )
                            ),
                            Core.vx_new_string("Earth Till"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earth Till"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Softens earth. Also can prepare earth for planting crops in a large area.")
                              )
                            ),
                            Core.vx_new_string("Earth Walk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earth Walk"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ignore movement penalties while travelling over natural earth or stone.")
                              )
                            ),
                            Core.vx_new_string("Earth Wall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earth Wall")
                              )
                            ),
                            Core.vx_new_string(":Earthquake"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earthquake")
                              )
                            ),
                            Core.vx_new_string(":Landslide"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Landslide"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Causes a weak section of earth or rock to collapse.")
                              )
                            ),
                            Core.vx_new_string("Mountain out of a Molehill"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mountain out of a Molehill"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Grow a small pile of earth bigger and bigger.")
                              )
                            ),
                            Core.vx_new_string("Pass Through Earth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pass Through Earth"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Allows the user to move through earth as if it were water.")
                              )
                            ),
                            Core.vx_new_string(":Quagmire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Quagmire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Any unit in the area is must spend double movement when moving."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Mudslide, Quicksand")
                              )
                            ),
                            Core.vx_new_string(":Sandstorm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sandstorm")
                              )
                            ),
                            Core.vx_new_string(":Shatter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shatter"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Attack] - Does no damage to the target, but instead damages its [Armor]."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Armor Break")
                              )
                            ),
                            Core.vx_new_string(":Sinkhole"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sinkhole"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A prone character on bare earth begins to sink."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dirt Nap")
                              )
                            ),
                            Core.vx_new_string(":Solidify"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Solidify"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Any liquified solid become solid again.")
                              )
                            ),
                            Core.vx_new_string("Stone Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stone Form"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Cover body in dust, dirt, or mud.\n* [Action]: Gain attributes of [Earth] as well as [Earth Walk] for the turn.\n* [Continue]: May make [Strike] and [Grab] [Earth] [Close Combat] attacks at Level.")
                              )
                            ),
                            Core.vx_new_string("Treacherous Ground"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Treacherous Ground"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Creates a patch of broken earth or rock that will trip anything moving across it at more than a slow walk.")
                              )
                            ),
                            Core.vx_new_string(":Tremor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tremor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Summons a small living earthquake in broken earth or rock. Earth elementals love nothing more than knocking things over.")
                              )
                            ),
                            Core.vx_new_string("Volcanic Eruption"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Volcanic Eruption")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Geomancy"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Geomancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Geo is the magical version of Earth.\n* Geo effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Geo reacts with Pyro to produce the [Overheat] effect.\n* Geo reacts with Cryo to produce the [Brittle] effect.\n* Geo reacts with Hydro to produce the [Quagmire] effect.\n* Geo reacts with Electro to produce the [Grounded] effect.\n* Geo reacts with Aero to produce the [Weightess] effect.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Electricity"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Electricity"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Lightning is eternal, the world is but shadow. - Raiden Shogun, the Electro Archon, Genshin Impact"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Electric Elementalist personalities are influenced by their link to Electricity.\n* Energetic, Explosive, Dynamic, Animated, Spark of Life, High Strung\n* Symbol - Yellow Lightning"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Electro, Lightning"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Arc Lightning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arc Lightning"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Lightning leaps from the target to others in range.")
                              )
                            ),
                            Core.vx_new_string("Body Electric"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Body Electric"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Electricity Form")
                              )
                            ),
                            Core.vx_new_string("Absorb Electricity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Absorb Electricity")
                              )
                            ),
                            Core.vx_new_string("Ball Lightning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ball Lightning")
                              )
                            ),
                            Core.vx_new_string("Call Lightning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call Lightning"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Calls a lightning strike from an existing storm cloud.")
                              )
                            ),
                            Core.vx_new_string("Control Lightning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Lightning"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect a lightning effect to another target.")
                              )
                            ),
                            Core.vx_new_string("Electromagnetic Pulse"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electromagnetic Pulse")
                              )
                            ),
                            Core.vx_new_string("Lightning Lash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lightning Lash"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Arc Lash, Lightning Whip")
                              )
                            ),
                            Core.vx_new_string("Lightning Warp"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lightning Warp"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Near instantaneous travel in a flash of lightning.\n* Level determines distance travelled.")
                              )
                            ),
                            Core.vx_new_string("Resist Electricity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Electricity")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Electromancy"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electromancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Electro is the magical version of Electricity.\n* Electro effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Electro reacts with Pyro to produce the [Overload] effect.\n* Electro reacts with Cryo to produce the [Superconduct] effect.\n* Electro reacts with Hydro to produce the [Electrocharged] effect.\n* Electro reacts with Geo to produce the [Grounded] effect.\n* Electro reacts with Aero to produce the [Ionized] effect.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Fire"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fire"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Fire. It's a living thing, Brian. It breathes, it eats, and it hates. The only way to beat it is to think like it. To know that this flame will spread this way across the door and up across the ceiling, not because of the physics of flammable liquids, but because it wants to. Some guys on this job, the fire owns them, makes 'em fight it on it's level, but the only way to truly kill it is to love it a little. - Donald Rimgate, Backdraft\n* Dry is good and wind is better. Count the years you always knew it. Strike a match go on and do it...Oh light the sky and hold on tight, the world is burning down. - Shawn Colvin, Sunny Came Home"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fire is the element of power. Fire Elementalists must have desire, passion, and the energy and drive to achieve it.\n* Symbol - Red Flame\n* Passionate, Fiery, Explosive, Incendiary, Violent"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Arsonist, Fire Lord, Firebomber, Firestarter, Firewalker, Pyrokinetic, Pyromancer, Pyromaniac, Volcanist"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Burning Eyes"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Burning Eyes"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Flaming eyes may see heat."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Fire Eyes")
                              )
                            ),
                            Core.vx_new_string("Control Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Fire"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Pyro - X-Force"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Change the shape of fire.\n* [Reaction]: Redirect a fire effect to another target.")
                              )
                            ),
                            Core.vx_new_string("Cinder Cloud"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cinder Cloud")
                              )
                            ),
                            Core.vx_new_string("Cleansing Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cleansing Fire")
                              )
                            ),
                            Core.vx_new_string(":Combustion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Combustion"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Summons a small living flame on combustible material. Fire elementals love nothing more than creating fires.")
                              )
                            ),
                            Core.vx_new_string("Eternal Flame"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eternal Flame"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Creates a flame that burns without fuel for as long as desired (only one at a time).")
                              )
                            ),
                            Core.vx_new_string("Fan the Flames"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fan the Flames")
                              )
                            ),
                            Core.vx_new_string("Fire Break"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire Break"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create an area where fire is smothered (does not effect existing heat).")
                              )
                            ),
                            Core.vx_new_string("Fire Breathing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire Breathing")
                              )
                            ),
                            Core.vx_new_string("Fire Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire Form"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Body becomes living flame.\n* [Action]: Gain attributes of [Fire] as well as [Fire Breathing] and [Fire Walk] for the turn.\n* [Continue]: May make [Strike] and [Grab] [Fire] [Close Combat] attacks at Level.")
                              )
                            ),
                            Core.vx_new_string("Fire Lore"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire Lore")
                              )
                            ),
                            Core.vx_new_string("Fire Storm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire Storm"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Rain of Fire")
                              )
                            ),
                            Core.vx_new_string("Fire Walk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire Walk"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I touch the fire and freezes me. I look into it and its black. Why can't I feel? My skin should crack and peel. I want the fire back. Now through the smoke, she calls to me, to make my way across the flame. To save the day or maybe melt away. I guess it's all the same. So I will walk through the fire, cause whereelse can I turn. I will walk through the fire and let it... The torch I bear is scorthing me, and Buffy's laughing I've no doubt. I hope she fries. I'm free if that bitch dies. I'd better help her out. Cause she is drawn to the fire. Some people never learn, and she will walk through the fire and let it... These endless days are finally ending in a blaze. And we are caught in the fire. The point of no return. So we will walk through the fire and let it burn. - Buffy the Vampire Slayer, Once More with Feeling"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Walk through flames. Gain [Armor] vs. Fire and ignore [Burning] effects.")
                              )
                            ),
                            Core.vx_new_string("Fire Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire Ward")
                              )
                            ),
                            Core.vx_new_string(":Fireworks"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fireworks")
                              )
                            ),
                            Core.vx_new_string("Flame Cage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flame Cage")
                              )
                            ),
                            Core.vx_new_string("Flame Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flame Whip"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Fire Lash")
                              )
                            ),
                            Core.vx_new_string("Flame Skin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flame Skin"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Immolate body in Fire\n* [Action]: Gain attributes of [Fire].\n* [Continue]: May make [Strike] and [Grab] [Fire] [Close Combat] attacks at Level."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Burning Man, Fire Armor, Immolate")
                              )
                            ),
                            Core.vx_new_string("Flaming Weapon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flaming Weapon"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Add the [Fire] trait to a weapon or to unarmed attacks."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Fire Fist, Flame Tongue, Flamebrand, Flaming Arrow, Flaming Sword")
                              )
                            ),
                            Core.vx_new_string(":Inferno"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Inferno"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Pyroclasm")
                              )
                            ),
                            Core.vx_new_string("Living Flame"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Living Flame")
                              )
                            ),
                            Core.vx_new_string("Pyroclastic Flow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pyroclastic Flow"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* A fast-moving current of volcanic hot gas and rock, which reaches speeds up to 700 km/h (450 mph). The gas can reach temperatures of about 1,000 °C (1,830 °F). Pyroclastic flows normally hug the ground and travel downhill, or spread laterally under gravity."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Pyrolclastic Cloud, Pyronado")
                              )
                            ),
                            Core.vx_new_string("Ring of Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ring of Fire")
                              )
                            ),
                            Core.vx_new_string(":Smother"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Smother")
                              )
                            ),
                            Core.vx_new_string("Summon Efreet"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Efreet")
                              )
                            ),
                            Core.vx_new_string("Summon Salamander"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Salamander")
                              )
                            ),
                            Core.vx_new_string("Wall of Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall of Fire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Forms a continuous [Wall] of [Fire].\n* [Requires]: A flammable fuel must exist for the whole length of the wall.")
                              )
                            ),
                            Core.vx_new_string(":Wildfire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wildfire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Air in the area becomes bone dry and overheated. +1 [Fire] or [Air] abilities.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Pyromancy"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pyromancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Pyro is the magical version of Earth.\n* Pyro effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Pyro reacts with Geo to produce the [Overheat] effect.\n* Pyro reacts with Cryo to produce the [Melt] effect.\n* Pyro reacts with Hydro to produce the [Vaporize] effect.\n* Pyro reacts with Electro to produce the [Overload] effect.\n* Pyro reacts with Aero to produce the [Wildfire] ability.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Water"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Water"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Davy Jones Locker\n* The power of water is its ability to change shape. - Genshin Impact"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Adaptable, Adjustable, Easy-going, Empathic, Flexible, Fluid, Patient, Serene, Versatile, Wrathful\n* Water is the element of change. Water elementalists must be adaptable, fluid, and flexible in their attitude (though not arbitrary). They are generally patient and empathetic, but they are also known for the intensity of their wrath. Their flexiblitity is often reflected in their sexuality.\n* Symbol - Blue Teardop\n* Water is the source of life and after Air it is the thing that we need most urgently to survive. Pure, unspoiled water can bestow many amazing benefits and has been the rise and fall of many empires. Of course, water can also be the source of a quick death.\n* Though Water washes away impurities, it does so by taking them unto itself and Water always remembers."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aquamancer, Hydromancer, Wave Rider"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Air Bubble"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Air Bubble")
                              )
                            ),
                            Core.vx_new_string("Call Water"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call Water"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Flashflood")
                              )
                            ),
                            Core.vx_new_string("Control Water"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Water"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect a water effect to another target.")
                              )
                            ),
                            Core.vx_new_string(":Extinguish"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Extinguish")
                              )
                            ),
                            Core.vx_new_string("Fountain of Youth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fountain of Youth")
                              )
                            ),
                            Core.vx_new_string(":Liquify"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Liquify"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Any solid becomes a liquid.")
                              )
                            ),
                            Core.vx_new_string("Part Water"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Part Water")
                              )
                            ),
                            Core.vx_new_string("Purify Water"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Purify Water")
                              )
                            ),
                            Core.vx_new_string("Ride the Wave"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ride the Wave"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Slide on water")
                              )
                            ),
                            Core.vx_new_string("Scrying Pool"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scrying Pool"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Look at your reflection in any pool of water, drop something in, and when the ripples recede you may see the current reflection from any other body of water that you have seen your reflection in.")
                              )
                            ),
                            Core.vx_new_string("Summon Current"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Current"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Summons a small living water flow in moving water. Water elementals love nothing more than pushing things around.")
                              )
                            ),
                            Core.vx_new_string("Summon Undine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Undine")
                              )
                            ),
                            Core.vx_new_string(":Tides"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tides"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Raise or lower water level.")
                              )
                            ),
                            Core.vx_new_string(":Tsunami"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tsunami")
                              )
                            ),
                            Core.vx_new_string(":Undertow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Undertow"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Creates a strong downward current that can suck things downward.")
                              )
                            ),
                            Core.vx_new_string("Wall of Water"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall of Water"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Effect]: [Wall] of Water\n* [Requires]: May only be cast in water.\n* [Anytime]: Turbulence strikes any surface or underwater unit that crosses it.")
                              )
                            ),
                            Core.vx_new_string("Water Breathing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Water Breathing")
                              )
                            ),
                            Core.vx_new_string("Water Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Water Form"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Douse body in at least a bucket of water.\n* [Continuous]: May make [Strike] and [Grab] Water Close Combat attacks at Level. Gain attributes of Water as well as [Water Breathing] and [Walk on Water]. [Pierce Resistance], [Slash Resisteance], [Fire Resistance], [Impact Vulnerable], [Heat Vulnerable], [Electric Vulnerable]."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Liquifiy")
                              )
                            ),
                            Core.vx_new_string("Water Spout"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Water Spout")
                              )
                            ),
                            Core.vx_new_string("Water Walk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Water Walk"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Move on or under water as if it were solid ground of any desired slope.")
                              )
                            ),
                            Core.vx_new_string("Waters of Life"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Waters of Life")
                              )
                            ),
                            Core.vx_new_string("Watery Grave"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Watery Grave")
                              )
                            ),
                            Core.vx_new_string(":Wave"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wave"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Intensifies existing waves or creates new waves.")
                              )
                            ),
                            Core.vx_new_string("Wave Ride"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wave Ride")
                              )
                            ),
                            Core.vx_new_string(":Whirlpool"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Whirlpool")
                              )
                            ),
                            Core.vx_new_string("Wishing Well"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wishing Well")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Hydromancy"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hydromancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hydro is the magical version of Water.\n* Hydro effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Hydro reacts with Pyro to produce the [Vaporize] effect.\n* Hydro reacts with Cryo to produce the [Freeze] effect.\n* Hydro reacts with Geo to produce the [Quagmire] effect.\n* Hydro reacts with Electro to produce the [Electrocharged] effect.\n* Hydro reacts with Aero to produce the [Fog] effect.")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Energy and Forces"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Energy and Forces"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Energy Manipulation"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Energy Manipulation"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Control Energy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Energy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect an energy effect to another target.")
                              )
                            ),
                            Core.vx_new_string("Energy Absorption"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Energy Absorption")
                              )
                            ),
                            Core.vx_new_string("Energy Drain"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Energy Drain")
                              )
                            ),
                            Core.vx_new_string("Energy Vampire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Energy Vampire")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Dimensional"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dimensional"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Faster than Light"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Faster than Light")
                              )
                            ),
                            Core.vx_new_string(":Gate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gate")
                              )
                            ),
                            Core.vx_new_string("Identify Dimension"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Identify Dimension"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ability to gain knowledge of the current dimension or the home dimension of an object or being from another dimension.")
                              )
                            ),
                            Core.vx_new_string(":Teleport"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Teleport"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Teleportation, Translocation")
                              )
                            ),
                            Core.vx_new_string(":Warp"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Warp")
                              )
                            ),
                            Core.vx_new_string(":Waypoint"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Waypoint")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Explosive"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Explosive")
                      )
                    ),
                    Core.vx_new_string(":Forces"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Forces"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Control Force"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Force"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect a force effect to another target.")
                              )
                            ),
                            Core.vx_new_string("Bands of Force"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bands of Force"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Crimson Bands of Cyttorak")
                              )
                            ),
                            Core.vx_new_string("Force Blast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Force Blast")
                              )
                            ),
                            Core.vx_new_string("Force Break"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Force Break")
                              )
                            ),
                            Core.vx_new_string("Force Wall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Force Wall")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Gravity"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gravity"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Call Anti-Gravity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call Anti-Gravity")
                              )
                            ),
                            Core.vx_new_string("Call Gravity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call Gravity")
                              )
                            ),
                            Core.vx_new_string("Control Gravity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Gravity"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect a gravity effect to another target.")
                              )
                            ),
                            Core.vx_new_string("Gravity Field"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gravity Field")
                              )
                            ),
                            Core.vx_new_string("Gravity Well"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gravity Well")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Heat"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heat"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Heat Miser"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Heat Mirage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heat Mirage"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create vague illusions in heated areas. The scale of the illusion is only limited by the size of the heated area.")
                              )
                            ),
                            Core.vx_new_string("Heat Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heat Vision"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* May see heat."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Thermal Vision")
                              )
                            ),
                            Core.vx_new_string(":Heatwave"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heatwave")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Inertia"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Inertia"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Impact Absorption"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Impact Absorption")
                              )
                            ),
                            Core.vx_new_string("Inertial Dampening"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Inertial Dampening")
                              )
                            ),
                            Core.vx_new_string(":Unstoppable"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unstoppable")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Light"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Light"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Blinding Light"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blinding Light")
                              )
                            ),
                            Core.vx_new_string("Call Light"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call Light")
                              )
                            ),
                            Core.vx_new_string("Control Light"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Light"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect a light effect to another target.")
                              )
                            ),
                            Core.vx_new_string(":Flash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flash")
                              )
                            ),
                            Core.vx_new_string(":Glow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Glow")
                              )
                            ),
                            Core.vx_new_string(":Laser"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Laser")
                              )
                            ),
                            Core.vx_new_string("Light Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Light Form")
                              )
                            ),
                            Core.vx_new_string("Project Image"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Project Image")
                              )
                            ),
                            Core.vx_new_string("Shine Down"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shine Down"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Raiden Shogun, Genshin Impact")
                              )
                            ),
                            Core.vx_new_string("Solar Beam"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Solar Beam")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Magnetism"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Magnetism"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Control Magnetism"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Magnetism"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect a magnetic effect to another target.")
                              )
                            ),
                            Core.vx_new_string("Magnetic Field"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magnetic Field")
                              )
                            ),
                            Core.vx_new_string("Magnetic Pull"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magnetic Pull")
                              )
                            ),
                            Core.vx_new_string(":Magnetize"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magnetize")
                              )
                            ),
                            Core.vx_new_string("Magnetic Storm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magnetic Storm")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Radiation"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Radiation"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Fallout"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fallout")
                              )
                            ),
                            Core.vx_new_string("Radiation Beam"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radiation Beam")
                              )
                            ),
                            Core.vx_new_string("Radiation Blast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radiation Blast")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Sound"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sound"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Sonic attacks are a form of vibration/explosive attack that generaly does [Concussive Damage]. They also can cause temporary or permanent deafness."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Sonic"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Mimicry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mimicry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Exactly duplicate sounds you have just heard or committed to memory.  At high levels, even modem communication can be duplicated.")
                              )
                            ),
                            Core.vx_new_string("Sonic Wave"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sonic Wave")
                              )
                            ),
                            Core.vx_new_string("Sound Carries"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sound Carries")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Temporal"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temporal"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Age Alteration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Age Alteration")
                              )
                            ),
                            Core.vx_new_string("Control Time"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Time"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect a time effect to another target.")
                              )
                            ),
                            Core.vx_new_string(":Postcognition"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Postcognition")
                              )
                            ),
                            Core.vx_new_string(":Precognition"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Precognition")
                              )
                            ),
                            Core.vx_new_string("Temporal Tracking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Temporal Tracking"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ability to track a time traveler to his/her destination.")
                              )
                            ),
                            Core.vx_new_string("Time Lapse"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Time Lapse")
                              )
                            ),
                            Core.vx_new_string("Time Loop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Time Loop")
                              )
                            ),
                            Core.vx_new_string("Time Slow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Time Slow")
                              )
                            ),
                            Core.vx_new_string("Time Stop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Time Stop"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ability to briefly exit the normal timestream. This effectively freezes time for a few seconds. The user is can move freely, but nothing but air can be moved or harmed. Note that doors cannot be opened and air is thick to move through or breathe."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Freeze Time, Time Slip")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Vibration"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vibration"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Tremors")
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_enhancement_powers
   * @return {chapter}
   * (func chapter_enhancement_powers)
   */
  public static interface Func_chapter_enhancement_powers extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_enhancement_powers();
  }

  public static class Class_chapter_enhancement_powers extends Core.Class_base implements Func_chapter_enhancement_powers {

    @Override
    public Func_chapter_enhancement_powers vx_new(Object... vals) {
      Class_chapter_enhancement_powers output = new Class_chapter_enhancement_powers();
      return output;
    }

    @Override
    public Func_chapter_enhancement_powers vx_copy(Object... vals) {
      Class_chapter_enhancement_powers output = new Class_chapter_enhancement_powers();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_enhancement_powers", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_enhancement_powers vx_empty() {return e_chapter_enhancement_powers;}
    @Override
    public Func_chapter_enhancement_powers vx_type() {return t_chapter_enhancement_powers;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_enhancement_powers();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_enhancement_powers() {
      return Powers.f_chapter_enhancement_powers();
    }

  }

  public static final Func_chapter_enhancement_powers e_chapter_enhancement_powers = new Powers.Class_chapter_enhancement_powers();
  public static final Func_chapter_enhancement_powers t_chapter_enhancement_powers = new Powers.Class_chapter_enhancement_powers();

  public static Base.Type_chapter f_chapter_enhancement_powers() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Enhancement Powers"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Physical Enhancement"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Physical Enhancement")
              )
            ),
            Core.vx_new_string("Mental Enhancement"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mental Enhancement"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Genius"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Genius"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Genius, Prodigy, Savant, Super Genius"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Analyze Weakness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Analyze Weakness")
                              )
                            ),
                            Core.vx_new_string("Calculator Mind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Calculator Mind")
                              )
                            ),
                            Core.vx_new_string("Engineering Genius"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering Genius")
                              )
                            ),
                            Core.vx_new_string("Financial Genius"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Financial Genius")
                              )
                            ),
                            Core.vx_new_string("Investigative Genius"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Investigative Genius")
                              )
                            ),
                            Core.vx_new_string("Linguistic Genius"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Linguistic Genius")
                              )
                            ),
                            Core.vx_new_string("Mathematical Genius"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mathematical Genius")
                              )
                            ),
                            Core.vx_new_string(":Multitasking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Multitasking")
                              )
                            ),
                            Core.vx_new_string("Photographic Memory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Photographic Memory")
                              )
                            ),
                            Core.vx_new_string("Scientific Genius"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scientific Genius")
                              )
                            ),
                            Core.vx_new_string("Speed Reading"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Speed Reading")
                              )
                            ),
                            Core.vx_new_string("Tactical Genius"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tactical Genius")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Psychic Enhancement"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Psychic Enhancement"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Charm"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Charm"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Commanding Presense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Commanding Presense")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_equipment_powers
   * @return {chapter}
   * (func chapter_equipment_powers)
   */
  public static interface Func_chapter_equipment_powers extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_equipment_powers();
  }

  public static class Class_chapter_equipment_powers extends Core.Class_base implements Func_chapter_equipment_powers {

    @Override
    public Func_chapter_equipment_powers vx_new(Object... vals) {
      Class_chapter_equipment_powers output = new Class_chapter_equipment_powers();
      return output;
    }

    @Override
    public Func_chapter_equipment_powers vx_copy(Object... vals) {
      Class_chapter_equipment_powers output = new Class_chapter_equipment_powers();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_equipment_powers", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_equipment_powers vx_empty() {return e_chapter_equipment_powers;}
    @Override
    public Func_chapter_equipment_powers vx_type() {return t_chapter_equipment_powers;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_equipment_powers();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_equipment_powers() {
      return Powers.f_chapter_equipment_powers();
    }

  }

  public static final Func_chapter_equipment_powers e_chapter_equipment_powers = new Powers.Class_chapter_equipment_powers();
  public static final Func_chapter_equipment_powers t_chapter_equipment_powers = new Powers.Class_chapter_equipment_powers();

  public static Base.Type_chapter f_chapter_equipment_powers() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Equipment Powers"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Item Powers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Item Powers"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Quality Item"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quality Item"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An item with this skill is of particularly high quality and possesses unusual abilities.\n* The level of quality effects the number of abilities as usual.\n* Each level of quality doubles the original price of the item."),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Fine Workmanship"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fine Workmanship"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This item possesses fine details that are particularly attractive to collectors.")
                              )
                            ),
                            Core.vx_new_string("Fire Resistant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire Resistant")
                              )
                            ),
                            Core.vx_new_string("High Durability"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("High Durability"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This item is exceptionally well constructed and can withstand a suprising amount of punishment compared to a normal item of its type.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Quality Weapon"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quality Weapon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A weapon with this skill is of particularly high quality and possesses unusual abilities.\n* The level of quality effects the number of abilities as usual.\n* Each level of quality doubles the original price of the item."),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Balanced for Throwing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Balanced for Throwing")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Vehicular Systems"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Vehicular Systems"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("** Atmospheric Engine\n** Sub-light Drive\n** FTL Drive\n\n* Science Lab w/Sensors\n* Air Locks\n** Magnetic Mooring Lines\n** Vacc Suits\n* Weapons Locker\n* Drop Chamber w/Drop Pods\n* Cloaking Device\n* Shields"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Hanger"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hanger"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A special ability of vehicles to carry other vehicles.\n* A unit may carry 1 small unit (1 space) per space it takes up.\n* Action: Move 1 unit into or out of the hanger. The unit may not Move or take any Action the turn it moves into or out of the hanger.\n* Ship's Boat\n* Air Raft\n* Starfighter\n* Starbomber\n* Repair Drones\n* Mobile Armor"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Vehicle Bay")
                      )
                    ),
                    Core.vx_new_string("Mission Section"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mission Section"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Determine the total hull size and then divide it as desired by the following abilities."),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Air Locks"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Air Locks")
                              )
                            ),
                            Core.vx_new_string("Boarding Equipment"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Boarding Equipment"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Grapple Launchers, Magnetic Mooring Lines")
                              )
                            ),
                            Core.vx_new_string("Cargo Hold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cargo Hold")
                              )
                            ),
                            Core.vx_new_string("Catapult Launcher"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Catapult Launcher"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("*")
                              )
                            ),
                            Core.vx_new_string("Catapult Hook Capture"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Catapult Hook Capture")
                              )
                            ),
                            Core.vx_new_string("Cloaking System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cloaking System")
                              )
                            ),
                            Core.vx_new_string("Cryogenic Chamber"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cryogenic Chamber"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Special ability of space craft to carry passengers in cryonic suspension.")
                              )
                            ),
                            Core.vx_new_string("Captain's Quarters"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Captain's Quarters")
                              )
                            ),
                            Core.vx_new_string("Centrifuge Chamber"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Centrifuge Chamber")
                              )
                            ),
                            Core.vx_new_string("Climbing Apparatus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Climbing Apparatus")
                              )
                            ),
                            Core.vx_new_string("Diving Wings"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Diving Wings"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("+1 when pulling out of a dive")
                              )
                            ),
                            Core.vx_new_string("Easy to Modify"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Easy to Modify")
                              )
                            ),
                            Core.vx_new_string(":ECM"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("ECM"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Electronic Countermeasures, Jamming")
                              )
                            ),
                            Core.vx_new_string(":ECCM"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("ECCM"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Electronic Counter-Countermeasures")
                              )
                            ),
                            Core.vx_new_string("Ejection System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ejection System")
                              )
                            ),
                            Core.vx_new_string("Escape Pods"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Escape Pods")
                              )
                            ),
                            Core.vx_new_string(":Factory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Factory")
                              )
                            ),
                            Core.vx_new_string("Fuel Scoop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fuel Scoop")
                              )
                            ),
                            Core.vx_new_string(":Glider"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Glider"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can glide without using power and may gain altitude when flying over hot air currents.")
                              )
                            ),
                            Core.vx_new_string("Gun Ports"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gun Ports"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Allows crew to use small arms fire without sacrificing armor protection.")
                              )
                            ),
                            Core.vx_new_string("Missile Decoys"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Missile Decoys"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Chaff Dispenser, Flares")
                              )
                            ),
                            Core.vx_new_string("Launch Catapult"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Launch Catapult"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Launching vehicle may begin move at up to full speed without using fuel.")
                              )
                            ),
                            Core.vx_new_string("Living Quarters"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Living Quarters"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Long range and luxury vessels offer more than the minimum crew quarters. This includes private rooms, mess, recreation areas, etc.\n* The larger the living space, the higher quality clientele may be brought aboard and the longer the ships range before shore leave is needed.\n* Includes Mess and Lounges")
                              )
                            ),
                            Core.vx_new_string("Luxury Facilities"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Luxury Facilities")
                              )
                            ),
                            Core.vx_new_string("Marine Ready Room"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Marine Ready Room")
                              )
                            ),
                            Core.vx_new_string("Marine Drop Pods"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Marine Drop Pods")
                              )
                            ),
                            Core.vx_new_string("Medical Facilities"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Medical Facilities"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Sick Bay")
                              )
                            ),
                            Core.vx_new_string(":Minelayer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Minelayer")
                              )
                            ),
                            Core.vx_new_string(":Minesweeper"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Minesweeper")
                              )
                            ),
                            Core.vx_new_string("Mining Facilities"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mining Facilities")
                              )
                            ),
                            Core.vx_new_string("Passenger Seating"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Passenger Seating")
                              )
                            ),
                            Core.vx_new_string("Prison Facilities"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prison Facilities"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Brig")
                              )
                            ),
                            Core.vx_new_string("Ram Plate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ram Plate")
                              )
                            ),
                            Core.vx_new_string(":Refinery"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Refinery")
                              )
                            ),
                            Core.vx_new_string("Science Lab"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Science Lab")
                              )
                            ),
                            Core.vx_new_string("Atmospheric Sensors"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Atmospheric Sensors")
                              )
                            ),
                            Core.vx_new_string("Biological Sensors"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Biological Sensors")
                              )
                            ),
                            Core.vx_new_string("Geological Sensors"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Geological Sensors")
                              )
                            ),
                            Core.vx_new_string("Stealth Equipment"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth Equipment")
                              )
                            ),
                            Core.vx_new_string("Storm Chamber"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Storm Chamber"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Specially shielded chamber designed to be a safe room for particularly dangerous events including radiation flares and decompression.")
                              )
                            ),
                            Core.vx_new_string("Tanker Hold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tanker Hold"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The hold is equipped to hold large amounts of liquids or gases at appropriate environments.  This can be used for long range vessels to carry their own fuel or act as a fuel tanker.")
                              )
                            ),
                            Core.vx_new_string("Towing Capacity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Towing Capacity")
                              )
                            ),
                            Core.vx_new_string("Training Facilities"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Training Facilities")
                              )
                            ),
                            Core.vx_new_string("Weapons Locker"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Weapons Locker")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Battleship"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Battleship"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A large (3 space) ship dedicated to being a battleship may carry a Spinal Mount weapon.\n* Spinal Mount")
                              )
                            ),
                            Core.vx_new_string("Colony Vessel"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Colony Vessel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cryogenic Chamber")
                              )
                            ),
                            Core.vx_new_string("Cargo Vessel"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cargo Vessel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cargo Hold\n* Tanker Hold")
                              )
                            ),
                            Core.vx_new_string("Factory Vessel"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Factory Vessel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Factory\n* Refinery\n* Tanker Hold")
                              )
                            ),
                            Core.vx_new_string("Heavy Bomber"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heavy Bomber")
                              )
                            ),
                            Core.vx_new_string("Heavy Carrier"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heavy Carrier"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A large (3 space) ship dedicated to being a carrier can carry 1 extra unit (4 units) in its Hanger.\n* Hanger\n* Launch Catapult")
                              )
                            ),
                            Core.vx_new_string("Luxury Vessel"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Luxury Vessel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Living Quarters\n* Luxury Facilities")
                              )
                            ),
                            Core.vx_new_string("Prison Vessel"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prison Vessel")
                              )
                            ),
                            Core.vx_new_string("Science Vessel"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Science Vessel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Science Lab\n* Sensor Arrays")
                              )
                            ),
                            Core.vx_new_string("Search and Rescue Vessel"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Search and Rescue Vessel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wide array of sensors\n* Multipurpse rescue vehicles\n* Heavy construction equipment\n* Emergency medical facilities\n* Space for evacuation and emergency supplies")
                              )
                            ),
                            Core.vx_new_string("Stealth Vessel"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth Vessel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cloaking Device\n* ECM\n* Stealth Equipment")
                              )
                            ),
                            Core.vx_new_string("Transport Vessel"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transport Vessel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Living Quarters")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Electronic Systems"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Electronic Systems"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Analyze Target"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Analyze Target")
                              )
                            ),
                            Core.vx_new_string("Detailed Scan"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Detailed Scan")
                              )
                            ),
                            Core.vx_new_string("Electronic Countermeasures"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electronic Countermeasures")
                              )
                            ),
                            Core.vx_new_string("Electronic Warfare"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electronic Warfare")
                              )
                            ),
                            Core.vx_new_string("Haywire Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Haywire Resistance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Resists the Haywire attack")
                              )
                            ),
                            Core.vx_new_string("Laser Link"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Laser Link")
                              )
                            ),
                            Core.vx_new_string("Locate Target"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Locate Target")
                              )
                            ),
                            Core.vx_new_string("Navigation System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Navigation System")
                              )
                            ),
                            Core.vx_new_string("Quantum Entanglement Comm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Quantum Entanglement Comm"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A technique used to transfer quantum information from one quantum system to another over vast distances.")
                              )
                            ),
                            Core.vx_new_string("Radio Comm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radio Comm")
                              )
                            ),
                            Core.vx_new_string("Radio Comm AM"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radio Comm AM")
                              )
                            ),
                            Core.vx_new_string("Radio Comm CB"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radio Comm CB")
                              )
                            ),
                            Core.vx_new_string("Radio Comm FM"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radio Comm FM")
                              )
                            ),
                            Core.vx_new_string("Scan for Life"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scan for Life")
                              )
                            ),
                            Core.vx_new_string("Scan for Weapons"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scan for Weapons")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Engineering"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Engineering"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Damage Control Team"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Damage Control Team"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("A crack team conducts emergency repairs.\n* [Action]: Roll vs. [Damage].  Each [Hit] removes a [White Token].  Each [Critical Hit] removes a [Black Token]. These repairs last until the end of the battle.")
                              )
                            ),
                            Core.vx_new_string("Gas Engine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gas Engine")
                              )
                            ),
                            Core.vx_new_string("Diesel Engine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Diesel Engine")
                              )
                            ),
                            Core.vx_new_string("Flex Fuel Engine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flex Fuel Engine")
                              )
                            ),
                            Core.vx_new_string("Electric Engine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electric Engine")
                              )
                            ),
                            Core.vx_new_string("Fission Engine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fission Engine")
                              )
                            ),
                            Core.vx_new_string("Fusion Engine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fusion Engine"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 'rockets point down' principle\n* Everything has a price. And the price of powerful rockets with nuclear propulsion is of course the dread horror of deadly atomic radiation. But the danger can be brought under control with appropriate\ncounter-measures, and by treating the power plant with the respect it deserves. And the same measures will come in handy if your ship may be facing hostile nuclear warheads.")
                              )
                            ),
                            Core.vx_new_string("Geared for Endurance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Geared for Endurance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Vehicle is designed for Endurance and can travel unusually long distances without resupply and is exceptionally rugged.")
                              )
                            ),
                            Core.vx_new_string("Geared for Power"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Geared for Power"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Vehicle is designed for Power and can tow, lift, or push 50% more load than usual.")
                              )
                            ),
                            Core.vx_new_string("Geared for Speed"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Geared for Speed"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Vehicle is designed for Speed and can accelerate faster and can temporarily exceed normal speed rating.")
                              )
                            ),
                            Core.vx_new_string("Red Line"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Red Line"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Engineering can push any of the ships' systems for extra performance, but run the risk of significant damage.\n* [Action]: Roll vs. the target system. Any [Hits] increase that system by 1 for [Hits] turns. Each [Critical Hit] increases that system by a further 1. Negative [Hits] reduce that system by the [Hits] for [Hits] turns. For each system [Critical Hit], the system takes a [System Damage Token].")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Factory"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Factory"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Gas Refinery"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gas Refinery")
                              )
                            ),
                            Core.vx_new_string("Oil Refinery"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Oil Refinery")
                              )
                            ),
                            Core.vx_new_string("Oil Rig"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Oil Rig")
                              )
                            ),
                            Core.vx_new_string("Manufacturing Factory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Manufacturing Factory")
                              )
                            ),
                            Core.vx_new_string("Mining Rig"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mining Rig")
                              )
                            ),
                            Core.vx_new_string("Pharmaceutical Manufacturing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pharmaceutical Manufacturing")
                              )
                            ),
                            Core.vx_new_string("Aircraft Factory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aircraft Factory")
                              )
                            ),
                            Core.vx_new_string("Mobile Shipyard"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mobile Shipyard")
                              )
                            ),
                            Core.vx_new_string("Naval Shipyard"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Naval Shipyard")
                              )
                            ),
                            Core.vx_new_string("Spacecraft Shipyard"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spacecraft Shipyard")
                              )
                            ),
                            Core.vx_new_string("Starship Shipyard"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Starship Shipyard")
                              )
                            ),
                            Core.vx_new_string("Tank Factory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tank Factory")
                              )
                            ),
                            Core.vx_new_string("Vehicle Factory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vehicle Factory")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Laboratory"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Laboratory"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Special labs for analyzing information. Science labs are very flexible and can be used for any number of quick analytics. Obviously, they are severly limited compared to proper research facilities."),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Chemical Lab"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chemical Lab")
                              )
                            ),
                            Core.vx_new_string("Biological Lab"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Biological Lab")
                              )
                            ),
                            Core.vx_new_string("Geological Lab"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Geological Lab")
                              )
                            ),
                            Core.vx_new_string("Physics Lab"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics Lab")
                              )
                            ),
                            Core.vx_new_string("Sick Bay"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sick Bay")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Life Support"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Life Support"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Acceleration Dampening"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acceleration Dampening")
                              )
                            ),
                            Core.vx_new_string("Air Filtration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Air Filtration")
                              )
                            ),
                            Core.vx_new_string("Artificial Gravity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Artificial Gravity")
                              )
                            ),
                            Core.vx_new_string("Ejection Systems"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ejection Systems")
                              )
                            ),
                            Core.vx_new_string("Food Production"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Food Production")
                              )
                            ),
                            Core.vx_new_string("Low Pressure Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Low Pressure Resistance")
                              )
                            ),
                            Core.vx_new_string("High Pressure Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("High Pressure Resistance")
                              )
                            ),
                            Core.vx_new_string("Radiation Shielding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radiation Shielding")
                              )
                            ),
                            Core.vx_new_string("Heat Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heat Resistance")
                              )
                            ),
                            Core.vx_new_string("Cold Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cold Resistance")
                              )
                            ),
                            Core.vx_new_string("Storm Cellar"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Storm Cellar"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The crew will occupy the cellar when the sun kicks up a solar storm of radiation. As these can last for days, one had better include a few crew-days worth of food, water, and tranquilizers. If you are relying upon algae for your oxygen, it deserves space in the storm cellar as well. This probably also applies to stored food too. Particle radiation can destroy a lot of the vitamins in food. Alas, computers and other digital electronics are also vulnerable to radiation. If there is a critical failure outside, thenit is time to start drawing straws to decide who gets to heroically commit suicide by saving the ship.")
                              )
                            ),
                            Core.vx_new_string("Water Filtration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Water Filtration")
                              )
                            ),
                            Core.vx_new_string(":Watertight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Watertight")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Vehicle Abilities"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vehicle Abilities"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Airlift Ready"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Airlift Ready"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ability to be quickly picked up and dropped by [Airlift] vehicles without them landing.")
                              )
                            ),
                            Core.vx_new_string("Alarm System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alarm System"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* When armed, this defensive system will raise a warning whenever a person gets too close.")
                              )
                            ),
                            Core.vx_new_string("Anti-Personnel Charges"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Anti-Personnel Charges"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* When armed, this defensive system will automatically detonate whenever a person gets too close.")
                              )
                            ),
                            Core.vx_new_string("Artificial Intelligence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Artificial Intelligence")
                              )
                            ),
                            Core.vx_new_string("Automated Combat System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Automated Combat System")
                              )
                            ),
                            Core.vx_new_string(":Autopilot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Autopilot")
                              )
                            ),
                            Core.vx_new_string("Camouflage Net"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Camouflage Net")
                              )
                            ),
                            Core.vx_new_string("Catapult Hook"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Catapult Hook"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can take off and land from carriers and gain the initial speed benefit of carrier catapults.")
                              )
                            ),
                            Core.vx_new_string(":Cloaking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cloaking")
                              )
                            ),
                            Core.vx_new_string("Crane Arm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crane Arm")
                              )
                            ),
                            Core.vx_new_string("Ejection System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ejection System")
                              )
                            ),
                            Core.vx_new_string("High Mobility"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("High Mobility"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Vehicles with this ability sacrifice overall speed for rapid turning. Movement systems are divided across the entire vehicle to maximize mobility, but this greatly reduces maximum speed.\n* -2 Speed, Unit may use Infantry movement rules.")
                              )
                            ),
                            Core.vx_new_string("Humanoid Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Humanoid Form")
                              )
                            ),
                            Core.vx_new_string("Long Range Package"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Long Range Package")
                              )
                            ),
                            Core.vx_new_string("Luxury Package"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Luxury Package")
                              )
                            ),
                            Core.vx_new_string("Off-Road Package"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Off-Road Package")
                              )
                            ),
                            Core.vx_new_string("Remote Controlled"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Remote Controlled")
                              )
                            ),
                            Core.vx_new_string("Sport Package"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sport Package")
                              )
                            ),
                            Core.vx_new_string("Stealth Technology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth Technology"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces detection by radar, heat and other similar vehicle detection systems.")
                              )
                            ),
                            Core.vx_new_string("Transformation System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transformation System"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Transformation allows a unit to switch into a different form. Each form must be designnated at creation time, and each form may have any or all of the units abilities. This is particularly useful for abilities that have penalties (e.g. High Mobility).")
                              )
                            ),
                            Core.vx_new_string("Vector Movement"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vector Movement"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Movement in frictionless environments follow Newton's first law, a object in motion tends to stay in motion.\n* Units will continue at their current speed.\n* [Speed] can used to increase or decrease current speed.\n* [Speed] can also be used to sideslip left or right by 1 space.\n* Facing can be changed by one side each space moved, but this does not change speed or direction.")
                              )
                            ),
                            Core.vx_new_string("Active Camoflage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Active Camoflage")
                              )
                            ),
                            Core.vx_new_string("Camo Netting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Camo Netting")
                              )
                            ),
                            Core.vx_new_string("Cold Protection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cold Protection")
                              )
                            ),
                            Core.vx_new_string("Desert Protection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Desert Protection")
                              )
                            ),
                            Core.vx_new_string("Escape Pods"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Escape Pods")
                              )
                            ),
                            Core.vx_new_string("Grapple Launcher"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Grapple Launcher")
                              )
                            ),
                            Core.vx_new_string("Manipulator Arm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Manipulator Arm")
                              )
                            ),
                            Core.vx_new_string("Landing Gear"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Landing Gear")
                              )
                            ),
                            Core.vx_new_string("Ram Plate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ram Plate")
                              )
                            ),
                            Core.vx_new_string(":Streamlining"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Streamlining")
                              )
                            ),
                            Core.vx_new_string("Stealth System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth System")
                              )
                            ),
                            Core.vx_new_string("Tool Arm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tool Arm")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                ),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Weapon Bay"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weapon Bay"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Main Turrets\n* Point Defense\n** Antiaircraft\n* Grenade Launcher\n* Laser\n* Mass Driver\n* Missiles\n** Micro-missiles\n** Mini-missiles\n** Heavy missiles\n* Particle Beam\n* Plasma Lance\n* Spinfuser\n* Taser\n* Payloads\n** Acid\n** Antimatter\n** Bioweaponry\n** Chemical\n** Explosive\n** Fusion\n** Incendiary\n** Nuclear\n** Nuclear Waste\n* Missile Bay\n* Torpedo Bay\n** Nuclear\n** Fusion\n** Antimatter\n** Planet Buster")
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_godlike_powers
   * @return {chapter}
   * (func chapter_godlike_powers)
   */
  public static interface Func_chapter_godlike_powers extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_godlike_powers();
  }

  public static class Class_chapter_godlike_powers extends Core.Class_base implements Func_chapter_godlike_powers {

    @Override
    public Func_chapter_godlike_powers vx_new(Object... vals) {
      Class_chapter_godlike_powers output = new Class_chapter_godlike_powers();
      return output;
    }

    @Override
    public Func_chapter_godlike_powers vx_copy(Object... vals) {
      Class_chapter_godlike_powers output = new Class_chapter_godlike_powers();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_godlike_powers", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_godlike_powers vx_empty() {return e_chapter_godlike_powers;}
    @Override
    public Func_chapter_godlike_powers vx_type() {return t_chapter_godlike_powers;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_godlike_powers();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_godlike_powers() {
      return Powers.f_chapter_godlike_powers();
    }

  }

  public static final Func_chapter_godlike_powers e_chapter_godlike_powers = new Powers.Class_chapter_godlike_powers();
  public static final Func_chapter_godlike_powers t_chapter_godlike_powers = new Powers.Class_chapter_godlike_powers();

  public static Base.Type_chapter f_chapter_godlike_powers() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Godlike Powers"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Primal Powers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Primal Powers"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Primal Order"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Primal Force"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Primal Force"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Primal energy is the most fundamental energy in existence. It is, at once, physical, mental, and spiritual. As the fundamental energy of the cosmos, those that wield it have a special connection to reality and can gain control over certain aspects of reality.\n* Though Primal is not innately more powerful than other forces, it makes other abilities a great deal more effective."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Arch Demon, Arch Fiend, Celestials, Deity, Demigod, Divine Power, Galactus, Godling, Godly, Godlike, Greater Deity, Lesser Deity, Planeswalker, Power Cosmic, Supreme Deity"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Channel Worship"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Channel Worship"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("A god cannot survive as a memory. - Apollo, Star Trek - Who Mourns for Adonais?"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* With this ability, the user may use the worship directed toward him, to recover [Primal].")
                              )
                            ),
                            Core.vx_new_string("Create Artifact"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Create Artifact"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Action]: Create [Skill] worth of artifacts of any sort desired. These are free to maintain on any Plane the user created. They require an additional [Primal] per day when up to [Skill] Artifacts are on any other Plane.")
                              )
                            ),
                            Core.vx_new_string("Create Servitors"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Create Servitors"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Action]: Create [Skill] worth of creatures of any sort desired. These are free to maintain on any Plane the user created. They require an additional [Primal] per day when up to [Skill] Servitors are on any other Plane. Such Servitors are usually fanatically loyal, though some users do not inspire loyalty.")
                              )
                            ),
                            Core.vx_new_string(":Planescaping"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Planescaping"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Action]: Create a small Plane (pocket dimension) in the [Etherial Realm] that lasts up to [Level] days. This Plane has a radius of [Skill] x 100 miles.\n* [Action]: Sustain a previously created Plane for an additional [Level] days.\n* [Action]: Make a single alteration to a previously create Plane. This alteration may be anything that the user chooses, has a radius of [Skill] miles, and is permanent.")
                              )
                            ),
                            Core.vx_new_string("Primal Accuracy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Accuracy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Free]: The current [Attack] ignores target [Defense]. It may also be targetted to affect only one type of material.")
                              )
                            ),
                            Core.vx_new_string("Primal Armor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Free]: For this turn, gain [Armor] equal to [Skill] vs. any type of attack including [Primal Strike].")
                              )
                            ),
                            Core.vx_new_string("Primal Avatar"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Avatar")
                              )
                            ),
                            Core.vx_new_string("Primal Awe"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Awe")
                              )
                            ),
                            Core.vx_new_string("Primal Defense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Defense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Free]: For this turn, gain [Defense] equal to [Skill] vs. any type of attack including [Primal Accuracy].")
                              )
                            ),
                            Core.vx_new_string("Primal Embodiment"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Embodiment"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Action]: For the next [Skill] turns, the user may use any ability through any willing target.")
                              )
                            ),
                            Core.vx_new_string("Primal Immortality"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Immortality"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Passive]: User does not age, does not require food, water or air.  User is immune to disease, gases, non-acidic poisons.")
                              )
                            ),
                            Core.vx_new_string("Primal Immunity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Immunity"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Free]: Enable survival in any environment for the next [Skill] days.")
                              )
                            ),
                            Core.vx_new_string("Primal Reach"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Reach"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Free]: Another ability has unlimited [Range] with no penalty for distance.  This can even apply to [Melee] and [Close Combat].")
                              )
                            ),
                            Core.vx_new_string("Primal Regeneration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Regeneration"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Action]: Immediately remove [Skill] damage tokens of any kind.")
                              )
                            ),
                            Core.vx_new_string("Primal Reincarnation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Reincarnation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Action]: Return from the dead in a new form.")
                              )
                            ),
                            Core.vx_new_string("Primal Resurrection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Resurrection"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Hmm, my heroic last stands never seem to stick. - Jax, Runeterra"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend all [Primal]\n* [Action]: Return from the dead.")
                              )
                            ),
                            Core.vx_new_string("Primal Sense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Sense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Detect any being with [Primal] or [Primal] used within the area within the last [Skill] days.")
                              )
                            ),
                            Core.vx_new_string("Primal Strength"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Strength"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Free]: Perform any feat of strength.")
                              )
                            ),
                            Core.vx_new_string("Primal Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Free]: The current [Attack] ignores target [Armor].")
                              )
                            ),
                            Core.vx_new_string("Primal Transfer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Transfer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Action]: Target gains a [Primal].")
                              )
                            ),
                            Core.vx_new_string("Primal Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Primal Vision"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spend a [Primal]\n* [Action]: View any area that is known or the area that a known person occupies.")
                              )
                            ),
                            Core.vx_new_string("Soul Binding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Soul Binding"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Capture a soul that has become separated from its body. This soul can be willing or unwilling.  It can then be bound to a body or other form on a Plane created by the user.")
                              )
                            ),
                            Core.vx_new_string("Sphere of Control"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sphere of Control"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Sphere of control is an idea, activity, or philosophy with which the user is strongly associated.\n* Developing a Sphere of Control is difficult, but allows the user to have far reaching powers whenever the Sphere is present. This benefits both the user and his followers.")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Projectiles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Projectiles"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Ropes"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ropes"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Entanglement"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Entanglement"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Reduces Movement"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Tanglers")
                              )
                            ),
                            Core.vx_new_string("Line Swinging"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Line Swinging"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Web Swinging")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Miscellaneous"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Miscellaneous"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Computer Control"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Computer Control"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Gives ability to control computers like Computer Science.")
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_mental_powers_and_weaknesses
   * @return {chapter}
   * (func chapter_mental_powers_and_weaknesses)
   */
  public static interface Func_chapter_mental_powers_and_weaknesses extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_mental_powers_and_weaknesses();
  }

  public static class Class_chapter_mental_powers_and_weaknesses extends Core.Class_base implements Func_chapter_mental_powers_and_weaknesses {

    @Override
    public Func_chapter_mental_powers_and_weaknesses vx_new(Object... vals) {
      Class_chapter_mental_powers_and_weaknesses output = new Class_chapter_mental_powers_and_weaknesses();
      return output;
    }

    @Override
    public Func_chapter_mental_powers_and_weaknesses vx_copy(Object... vals) {
      Class_chapter_mental_powers_and_weaknesses output = new Class_chapter_mental_powers_and_weaknesses();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_mental_powers_and_weaknesses", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_mental_powers_and_weaknesses vx_empty() {return e_chapter_mental_powers_and_weaknesses;}
    @Override
    public Func_chapter_mental_powers_and_weaknesses vx_type() {return t_chapter_mental_powers_and_weaknesses;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_mental_powers_and_weaknesses();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_mental_powers_and_weaknesses() {
      return Powers.f_chapter_mental_powers_and_weaknesses();
    }

  }

  public static final Func_chapter_mental_powers_and_weaknesses e_chapter_mental_powers_and_weaknesses = new Powers.Class_chapter_mental_powers_and_weaknesses();
  public static final Func_chapter_mental_powers_and_weaknesses t_chapter_mental_powers_and_weaknesses = new Powers.Class_chapter_mental_powers_and_weaknesses();

  public static Base.Type_chapter f_chapter_mental_powers_and_weaknesses() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Mental Powers and Weaknesses"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Mental Powers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mental Powers"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Domination"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Domination"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* We don't need no education.  We don't need no thought control. - Pink Floyd, The Wall\n* He accepted everything. The past was alterable. The past had never been altered. Oceania was at war with Eastasia. Oceania had always been at war with Eastasia. Jones, Aaronson, and Rutherford were guilty of the crimes they were charged with. He had never seen the photograph that disproved their guilt. It had never existed; he had invented it. He remembered remembering contradictory things, but those were false memories, products of self deception. How easy it all was! - 1984\n* Every move you make, every vow you break, every smile you fake, every claim you stake, I'll be watching you. Every single day... - Every Breath You Take, The Police\n* Your face will turn to alabaster. When you find your servant is your master. You'll be wrapped around my finger. - Wrapped around your Finger, The Police\n* I know this steak doesn't exist. I know that when I put it in my mouth, the Matrix is telling my brain that it is juicy and delicious. After nine years, you know what I realize? Ignorance is bliss. - Cypher, The Matrix"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dominator, Master, Puppet Master, Puppeteer"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Brainwashing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brainwashing")
                              )
                            ),
                            Core.vx_new_string(":Conditioning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Conditioning"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Manchurian Candidate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Low level success creates a confused zombie.\n* High level success creates fanatical loyalty.")
                              )
                            ),
                            Core.vx_new_string("Edit Memories"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Edit Memories")
                              )
                            ),
                            Core.vx_new_string(":Indoctrination"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Indoctrination"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Slowly convert a subject into a willing servant.")
                              )
                            ),
                            Core.vx_new_string("Induce Delusions"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Induce Delusions"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Create paranoid delusions in the target.")
                              )
                            ),
                            Core.vx_new_string("Past Life Regression"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Past Life Regression")
                              )
                            ),
                            Core.vx_new_string("Private World"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Private World"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Create a specific dream world that the subject believes is real.")
                              )
                            ),
                            Core.vx_new_string("Retrive Memories"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Retrive Memories")
                              )
                            ),
                            Core.vx_new_string("Subconscious Trigger"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Subconscious Trigger")
                              )
                            ),
                            Core.vx_new_string(":Subjugation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Subjugation")
                              )
                            ),
                            Core.vx_new_string("Subliminal Messaging"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Subliminal Messaging")
                              )
                            ),
                            Core.vx_new_string(":Suggestion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Suggestion"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Change")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Hypnotism"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hypnotism"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Past Life Regression]\n* [Retrive Memories]\n* [Subconscious Trigger]")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Empathy"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Empathy"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The ability to feel the joys and pains of others"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Empath"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Spirit"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Change of Heart"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Change of Heart")
                              )
                            ),
                            Core.vx_new_string(":Compulsion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Compulsion")
                              )
                            ),
                            Core.vx_new_string("Cure Insanity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cure Insanity")
                              )
                            ),
                            Core.vx_new_string(":Demoralize"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Demoralize")
                              )
                            ),
                            Core.vx_new_string(":Depression"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Depression")
                              )
                            ),
                            Core.vx_new_string(":Despair"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Despair")
                              )
                            ),
                            Core.vx_new_string("Ego Crush"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ego Crush"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduce the [Spirit] of the target to make them more ... pliable.")
                              )
                            ),
                            Core.vx_new_string("Empathic Bond"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Empathic Bond"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create a permanent empathic connection with a single target with an already established deep connection (typically lovers or longtime friends). Each senses the other's strong feelings over any distance. No effort is required to maintain the bond, but only one such bond can be maintained at a time.")
                              )
                            ),
                            Core.vx_new_string("Empathic Healing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Empathic Healing"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The Empath - Star Trek"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Feel the pain the target is experiencing. Slowly duplicate all the damage from a target onto yourself and then begin healing.\n* Continuous. Each turn, duplicate 1 damage or negative condition from the target onto yourself. Once all have been duplicated, instead remove a damage or condition from the target.")
                              )
                            ),
                            Core.vx_new_string("Empathic Link"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Empathic Link"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create an empathic connection with a target. Each senses the other's honest feelings. This ability creates trust if the parties are being honest, or mistrust if the parties are false."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Telesthesia")
                              )
                            ),
                            Core.vx_new_string("Empathic Sense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Empathic Sense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Sense nearby sentient creatures by their emotions. A general sense of the emotions can be determined as well.")
                              )
                            ),
                            Core.vx_new_string(":Enrage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enrage")
                              )
                            ),
                            Core.vx_new_string(":Enrapture"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enrapture"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Rapture")
                              )
                            ),
                            Core.vx_new_string(":Enthrall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enthrall")
                              )
                            ),
                            Core.vx_new_string("Fear Eater"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fear Eater"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Remove a [Fear] from the target and gain [Spirit].")
                              )
                            ),
                            Core.vx_new_string(":Guilt"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Guilt")
                              )
                            ),
                            Core.vx_new_string("Heal Mental Trauma"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heal Mental Trauma")
                              )
                            ),
                            Core.vx_new_string("Lie Detector"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lie Detector")
                              )
                            ),
                            Core.vx_new_string(":Nostalgia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nostalgia")
                              )
                            ),
                            Core.vx_new_string(":Obsession"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Obsession")
                              )
                            ),
                            Core.vx_new_string("Project Pain"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Project Pain"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Relive a past (or current) trauma and project those feelings on a target. If you have more than 1 damage you may move 1 to the target. If you have more than 1 negative condition, you may move 1 negative condition to the target."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Pain Shared is a Pain Doubled")
                              )
                            ),
                            Core.vx_new_string("Share Pain"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Share Pain"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Your pain runs deep. ... Share your pain with me... and gain strength from the sharing. - Sybok, Star Trek V: The Final Frontier"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Feel the pain the target is experiencing and create trust through the shared experience."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Pain Shared is Pain Halved")
                              )
                            ),
                            Core.vx_new_string(":Sympathy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sympathy")
                              )
                            ),
                            Core.vx_new_string(":Terrify"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Terrify")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Illusion"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Illusion"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Fantasy... can only survive with an underlying reality. Reality... is the stillness buried deep beneath the illusion. This is eternity. - Raiden Shogun, Genshin Impact"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Illusion is the art of fooling the target into believing in something that is not really there. Illusion is Limited by [Art].\n* Illusions\n** Alter the perceptions to see and hear things that do not exist.\n** Skill roll determines the difficulty to detect the illusion, but even those who detect the illusion cannot see through the illusion including the caster.\n** Illusions may be enormous, altering terrain and populating it with any number of creatures.\n** Illusions may cover real things, but cannot make them disappear.\n** Illusions may not do damage or take damage since they are not really there.\n** Note: unliving creatures cannot detect or be influenced by illusions.\n* Phantasms\n** Phantasmal objects appear real, but are only partially real and are destroyed with a single [Damage Token].\n** All [Phantasm]s are moved independently each time the unit Moves.  All [Phantasm]s perform the same actions as the unit but no effect. When [Phantasm]s are attacked they take effects normally but are uneffected by effects except [Damage] which immediately destroys them."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Illusionist"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Conjure Effigy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Conjure Effigy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create a phantasmal copy of an object touched. The Effigy appears real in most ways, but does not\nfunction as the original and will shatter to dust if force is applied to it.")
                              )
                            ),
                            Core.vx_new_string("Conjure Phantasmal Force"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Conjure Phantasmal Force"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Conjures a phantasmal minion.")
                              )
                            ),
                            Core.vx_new_string("Conjure Phantom Monster"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Conjure Phantom Monster")
                              )
                            ),
                            Core.vx_new_string("Conjure Simulacrum"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Conjure Simulacrum")
                              )
                            ),
                            Core.vx_new_string("Dazzling Beauty"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dazzling Beauty"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Raises the appearance of the caster.")
                              )
                            ),
                            Core.vx_new_string("Disembodied Voice"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Disembodied Voice")
                              )
                            ),
                            Core.vx_new_string(":Forgetfulness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Forgetfulness"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Roll vs. Spirit. Target forgets a specific fact or time period.")
                              )
                            ),
                            Core.vx_new_string(":Foxfire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Foxfire")
                              )
                            ),
                            Core.vx_new_string("Hidden Thing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hidden Thing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Phantasm may be placed on other objects making them partially or completely invisible.")
                              )
                            ),
                            Core.vx_new_string("Hypnotic Eyes"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hypnotic Eyes"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Criticals: [Fascination]")
                              )
                            ),
                            Core.vx_new_string("Illusion Shattered"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Illusion Shattered"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Raiden Shogun, Genshin Impact")
                              )
                            ),
                            Core.vx_new_string("Illusionary Meal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Illusionary Meal"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Creates a tasty meal out of other less appetizing things. The meal appears and tastes anyway the user wishes. The meal serves level squared human sized persons. The original ingredients may be unpleasant but cannot be harmful.")
                              )
                            ),
                            Core.vx_new_string("Illusionary Wall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Illusionary Wall"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Appears to be a real wall of any sort including magical ones, but has no real effect except to obscure or block line of sight.")
                              )
                            ),
                            Core.vx_new_string("Mental Block"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Block"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Roll vs. Spirit. Target becomes confused and forgets how to a chosen power for Hits Turns.")
                              )
                            ),
                            Core.vx_new_string(":Mirage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mirage"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Also known as Illusionary Terrain.")
                              )
                            ),
                            Core.vx_new_string("Mirror of the Soul"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mirror of the Soul"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A person's true nature can be ascertained by looking in his or her eyes.")
                              )
                            ),
                            Core.vx_new_string("Mirror Image"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mirror Image"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Mind]: Replace the unit with a [Phantasm] and place 1+Criticals additional [Phantasm]s 1 space\nfrom the unit.  Secretly mark one of these [Phantasm]s as the unit. When all other Mirror Images\nare destroyed, replace the final [Phantasm] with the unit.")
                              )
                            ),
                            Core.vx_new_string("Mistaken Identity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mistaken Identity"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Choose a willing unit of roughly equal size and switch places with that unit.\n* Range: [Mind]")
                              )
                            ),
                            Core.vx_new_string("Phantom Pain"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phantom Pain")
                              )
                            ),
                            Core.vx_new_string("Phantom Smell"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phantom Smell")
                              )
                            ),
                            Core.vx_new_string("Phantom Sound"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phantom Sound")
                              )
                            ),
                            Core.vx_new_string("Phantom Weapon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phantom Weapon")
                              )
                            ),
                            Core.vx_new_string("Shattered Image"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shattered Image"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Mind]: Destroy any number of [Illusion]s to cause [Stun] and [Confusion] to targets in the area."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Broken Mirror")
                              )
                            ),
                            Core.vx_new_string(":Shimmer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shimmer")
                              )
                            ),
                            Core.vx_new_string(":Simulacrum"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Simulacrum")
                              )
                            ),
                            Core.vx_new_string("Sleight of Mind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sleight of Mind"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Slow] [Even] [Mind]: +1 [Stress]. Create a distraction.")
                              )
                            ),
                            Core.vx_new_string("Smoke and Mirrors"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Smoke and Mirrors")
                              )
                            ),
                            Core.vx_new_string("Taste of Ambrosia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Taste of Ambrosia")
                              )
                            ),
                            Core.vx_new_string("Taste of Ashes"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Taste of Ashes")
                              )
                            ),
                            Core.vx_new_string(":Vertigo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vertigo")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Intuition"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Intuition"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Danger Sense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Danger Sense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Event]: Chance to detect a surprise attack.")
                              )
                            ),
                            Core.vx_new_string("Deja Vu"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deja Vu"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Event]: Chance to recognize a series of events as if they had happened before. This\ngives insight into how these events might play out.")
                              )
                            ),
                            Core.vx_new_string(":Insight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Insight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Synergy with a [Mind] ability.")
                              )
                            ),
                            Core.vx_new_string("Instinctive Defense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Instinctive Defense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Passive]: Synergy with Defense Rolls.")
                              )
                            ),
                            Core.vx_new_string("Paranormal Memory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paranormal Memory"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Attempt to remember events that happened in an\nalternate timeline or universe.")
                              )
                            ),
                            Core.vx_new_string(":Psychometry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Psychometry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Obtain information about an individual by making physical contact with an\nobject that belongs to them.\n* [Action]: Attempt to remember events associated with an object.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Mastermind"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mastermind"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Attempts to confuse by introducing misleading, paradoxical, or spurious logic into a discussion."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Mind Games"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Circular Logic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Circular Logic"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* If such actions were not illegal, then they would not be prohibited by the law."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A seemingly reasonable argument that is in fact based upon dependent information.\n* Such arguments are logically valid. That is, the conclusion does in fact follow from the premise, since it is already contained in the premise. They do not, however, aid in the proof of the statement or the premise.")
                              )
                            ),
                            Core.vx_new_string(":Compartmentalize"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Compartmentalize"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Separate a hidden thought process away from the normal mind.")
                              )
                            ),
                            Core.vx_new_string(":Cryptography"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cryptography")
                              )
                            ),
                            Core.vx_new_string(":Doublethink"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Doublethink"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* To tell deliberate lies while genuinely believing in them, to forget any fact that has become inconvenient, and then, when it becomes necessary again, to draw it back from oblivion for just so long as it is needed. - 1984 George Orwell"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Doublethink is the act of simultaneously holding two mutually contradictory beliefs while fervently fooling oneself into believing both.")
                              )
                            ),
                            Core.vx_new_string("Master Plan"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Master Plan")
                              )
                            ),
                            Core.vx_new_string("Maze of the Mind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Maze of the Mind"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Confuses the target's senses so it cannot accurately choose its direction. This can be extremely hazardous to fast moving units.\n* [Move]: Whenever the unit moves, its direction is randomized from among its normal movement options (including diving and climbing for air units).")
                              )
                            ),
                            Core.vx_new_string("Maze Mastery"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Maze Mastery"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The user knows thousands of mazes and can choose an optimal course through any maze with minimal trial and error.")
                              )
                            ),
                            Core.vx_new_string("Mind Blank"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mind Blank"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hide ones true thoughts.\n* Makes an excellent poker face.\n* Full defense against any attempt to detect the unit's mind.\n* Full defense against any attempt to detect lies.")
                              )
                            ),
                            Core.vx_new_string(":Misinformation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Misinformation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Spock: Logic is a little tweeting bird chirping in a meadow. Logic is a wreath of pretty flowers which smell BAD. Are you sure your circuits are functioning correctly? Your ears are green. - I, Mudd, Star Trek")
                              )
                            ),
                            Core.vx_new_string(":Puzzles"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Puzzles")
                              )
                            ),
                            Core.vx_new_string(":Rationalize"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rationalize"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Increases resistance to all forms of mental attack by reinterpreting and rationalizing commands to render them meaningless.")
                              )
                            ),
                            Core.vx_new_string("Simplify, Simplify, Simplify"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Simplify, Simplify, Simplify"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Progressively breakdown a problem into simpler problems which can each be resolved separately.")
                              )
                            ),
                            Core.vx_new_string("Unsolvable Problem"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unsolvable Problem"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Kirk: Everything Harry says is a lie. Remember that, Norman. *Everything* he says is a lie.\n* Mudd: Now I want you to listen to me very carefully, Norman. I'm... lying.\n* Norman: You say you are lying, but if everything you say is a lie, then you are telling the truth, but you cannot tell the truth because you always lie... illogical! Illogical - I, Mudd, Star Trek"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fool the target into trying to resolve a problem with no easy solution.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Madness"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Madness"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lunatic, Madman, Manic"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Delirium"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Delirium")
                              )
                            ),
                            Core.vx_new_string(":Delusions"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Delusions")
                              )
                            ),
                            Core.vx_new_string(":Dementia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dementia")
                              )
                            ),
                            Core.vx_new_string("False Memories"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("False Memories"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Alter the memories of the target.")
                              )
                            ),
                            Core.vx_new_string(":Hyteria"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hyteria")
                              )
                            ),
                            Core.vx_new_string("Induce Paranoia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Induce Paranoia")
                              )
                            ),
                            Core.vx_new_string("Mind Twist"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mind Twist")
                              )
                            ),
                            Core.vx_new_string("Through the Looking Glass"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Through the Looking Glass"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I'm sorry to tell you this, but you've suffered a schizoid embolism. We can't snap you out of your fantasy... and I've been sent in to try to talk you down. - Total Recall")
                              )
                            ),
                            Core.vx_new_string(":Tripping"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tripping")
                              )
                            ),
                            Core.vx_new_string("Twisted Words"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Twisted Words"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This subtle power is a sort of malicious therapy, and it requires nothing more than casual conversation. Its influence is hidden by inflections and suggestions. The victim finds themselves increasing agitated as their inner demons bubble to the surface. This can lead to confusion, a panic attack, nervous breakdown or even a psychotic break.")
                              )
                            ),
                            Core.vx_new_string("Warped Image"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Warped Image"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Share your own derangements with the target. This also rouses the Shadow.")
                              )
                            ),
                            Core.vx_new_string("Wave of Madness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wave of Madness")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Mental Fortitude"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mental Fortitude"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind, Spirit"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Gestalt"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gestalt"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The whole is greater than the sum of its parts - Gestalt Psychology"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This ability allows a unit to share knowledge with another unit that also has [Gestalt]. They may give information or loan an ability to the target."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Hive Mind")
                              )
                            ),
                            Core.vx_new_string("Intellect Fortress"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Intellect Fortress"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Ward")
                              )
                            ),
                            Core.vx_new_string(":Concentration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Concentration"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Buff Self]: Place X Concentration Tokens on the user, and place 1 negative token under each Concentration token. Covered tokens are treated as if they do not exist while covered.")
                              )
                            ),
                            Core.vx_new_string("Mirror Mind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mirror Mind"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Mental defense that creates Feedback.")
                              )
                            ),
                            Core.vx_new_string("Peace of Mind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Peace of Mind"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Find the Quiet Place in your mind")
                              )
                            ),
                            Core.vx_new_string("Tower of Iron Will"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tower of Iron Will"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Ward")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Mind Over Matter"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mind Over Matter"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Telekinesis, Psychokinesis"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Invisible Hand"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Invisible Hand"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Lift items from a distance.")
                              )
                            ),
                            Core.vx_new_string(":Levitate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Levitate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Lift oneself off the ground.")
                              )
                            ),
                            Core.vx_new_string("Mind Crush"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mind Crush"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hold an object in place and crush it.")
                              )
                            ),
                            Core.vx_new_string("Telekinetic Manipulation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telekinetic Manipulation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Perform delicate manipulation on items from a distance. An example would be to perform lock picking over distance.")
                              )
                            ),
                            Core.vx_new_string("Telekinetic Projectile"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telekinetic Projectile"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Throw a small object at high speed.")
                              )
                            ),
                            Core.vx_new_string("Telekinetic Push"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telekinetic Push"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Push items from a distance.")
                              )
                            ),
                            Core.vx_new_string("Telekinetic Shield"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telekinetic Shield")
                              )
                            ),
                            Core.vx_new_string("Telekinetic Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telekinetic Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attack unit from a distance.")
                              )
                            ),
                            Core.vx_new_string("Telekinetic Touch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telekinetic Touch"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Feel items from a distance.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Mental Combat"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mental Combat"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Psionic, Scanner"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Brain Drain"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brain Drain")
                              )
                            ),
                            Core.vx_new_string("Brain Freeze"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brain Freeze")
                              )
                            ),
                            Core.vx_new_string("Brain Storm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brain Storm")
                              )
                            ),
                            Core.vx_new_string("Ego Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ego Whip"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attack with [Mind] vs. [Spirit].")
                              )
                            ),
                            Core.vx_new_string(":Feeblemind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Feeblemind")
                              )
                            ),
                            Core.vx_new_string("Feedback Loop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Feedback Loop")
                              )
                            ),
                            Core.vx_new_string(":Lobotomy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lobotomy")
                              )
                            ),
                            Core.vx_new_string("Mental Blast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Blast"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Attacks Mind.  All tokens are stun.")
                              )
                            ),
                            Core.vx_new_string("Mental Prison"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Prison"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Trap a person's personality in a prison within their own mind."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Mind Prison, Prison of the Mind")
                              )
                            ),
                            Core.vx_new_string("Summon Id Monster"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Id Monster"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("[Call] [Id Monster]")
                              )
                            ),
                            Core.vx_new_string("Tabula Rasa"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tabula Rasa")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Mental Connection"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mental Connection"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Scanners"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Esper, Mentalist, Psionic, Scanner, Telepath"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Cloud Senses"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cloud Senses"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("These aren't the droids you're looking for... - Obi-Wan Kenobi, Star Wars"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Reduce chance that target will notice things.")
                              )
                            ),
                            Core.vx_new_string(":Confusion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Confusion")
                              )
                            ),
                            Core.vx_new_string(":Lingua-Franca"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lingua-Franca"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Synergy with [Linguistics]")
                              )
                            ),
                            Core.vx_new_string("Memory Lapse"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Memory Lapse")
                              )
                            ),
                            Core.vx_new_string("Memory Restoration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Memory Restoration"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Retrieve lost memories from a subject.")
                              )
                            ),
                            Core.vx_new_string("Mental Bond"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Bond")
                              )
                            ),
                            Core.vx_new_string("Mental Cloak"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Cloak"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("All living units must roll Mind vs Mental Cloak to target this unit.  Another target may not be chosen.")
                              )
                            ),
                            Core.vx_new_string("Mental Probe"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Probe"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Delve deeper into targets memories each turn."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Mind Probe")
                              )
                            ),
                            Core.vx_new_string("Mental Projection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Projection")
                              )
                            ),
                            Core.vx_new_string("Mind Reading"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mind Reading"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Owner of target unit must announce the next Hits movements and actions that unit will perform.  That unit must perform those actions if it is able.")
                              )
                            ),
                            Core.vx_new_string("Mind's Eye"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mind's Eye"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Eye - The caster can close his eyes and see into the astral world instead of the real world.")
                              )
                            ),
                            Core.vx_new_string("Store Consciousness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Store Consciousness"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: At the moment of another unit's death, capture its spirit within one's own mind.\n* [Action]: If the dead unit's body can somehow be restored (or a perfect duplicate can be found), transfer the captured spirit back into the body.")
                              )
                            ),
                            Core.vx_new_string(":Telepathy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telepathy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Unit owner may have up to a Hits minute secret conversation with anyone (Player or not, strategy or not). Clock starts once roll is made.")
                              )
                            ),
                            Core.vx_new_string("Transfer Consciousness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transfer Consciousness"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Change Now! - Captain Jinyu, Dragonball Z"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Body Swap")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Mental Weakness"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mental Weakness"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Note: Mental Weaknesses may be physical in nature, but they are grouped here because they effect mental function."),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Addle Minded"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Addle Minded"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Tendency to forget to do things or misplace things.  The missed things may be trival, important, or critical."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Absent Minded, Addle Minded, Airhead")
                              )
                            ),
                            Core.vx_new_string(":Addiction"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Addiction")
                              )
                            ),
                            Core.vx_new_string("Alien Thoughts"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alien Thoughts")
                              )
                            ),
                            Core.vx_new_string(":Amnesia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amnesia"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Memento"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Unit has strange lapses of memory. It may forget generally known facts, friends, family, or own identity.")
                              )
                            ),
                            Core.vx_new_string(":Anxious"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Anxious")
                              )
                            ),
                            Core.vx_new_string(":Bipolar"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bipolar"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Prone to fits of erratic up moods and severe depression. May be moody, lie around and mope, risk life and limb, or even suicidal."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Manic Depressive")
                              )
                            ),
                            Core.vx_new_string(":Bloodthirsty"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bloodthirsty"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Must attack Bleeding Enemies first. May attack Bleeding Allies if a Spirit roll fails.")
                              )
                            ),
                            Core.vx_new_string(":Brainwashed"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brainwashed")
                              )
                            ),
                            Core.vx_new_string(":Catatonia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Catatonia")
                              )
                            ),
                            Core.vx_new_string("Compulsive Liar"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Compulsive Liar")
                              )
                            ),
                            Core.vx_new_string(":Cleptomania"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cleptomania")
                              )
                            ),
                            Core.vx_new_string(":Cyberpsychosis"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cyberpsychosis"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Something happens when you start to add metal and plastic to people. They start to change. And it isn't pretty - Cyberpunk RPG"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A psychotic aberration suffered by excessive users of cyberware. It begins as a sense of loss for the portions of the body replaced with unfeeling machinery. Later it manifests as a Overconfidence and detachment from other people (sometimes in favor of machines). Extreme cases lead to more serious derangements such as: Martyr Syndrome, Megalomania, Delusions of Grandear, Inferiority Complex, and Messiah Complex.")
                              )
                            ),
                            Core.vx_new_string(":Delusional"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Delusional"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The walls of reality will come crashing down. One minute you'll be the savior of the rebel cause.  The next thing you know you'll be Cohagen's busom buddy. You'll even have fantasies of alien civilizations, as you requested, but in the end, back on Earth, you'll be lobotomized! - Dr. Edgemar, Total Recall"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Believe things that are not real.  May hear voices or see things."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Free-form Delusion, Schizoid Embelism")
                              )
                            ),
                            Core.vx_new_string(":Flashbacks"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flashbacks")
                              )
                            ),
                            Core.vx_new_string(":Frightened"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Frightened"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Lacks nerve, especially in combat.  May freeze or flee."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cowardly")
                              )
                            ),
                            Core.vx_new_string(":Hallucinations"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hallucinations")
                              )
                            ),
                            Core.vx_new_string(":Homicidal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Homicidal")
                              )
                            ),
                            Core.vx_new_string("Inferiority Complex"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Inferiority Complex")
                              )
                            ),
                            Core.vx_new_string(":Intolerant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Intolerant")
                              )
                            ),
                            Core.vx_new_string(":Manic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Manic")
                              )
                            ),
                            Core.vx_new_string("Martyr Syndrome"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Martyr Syndrome")
                              )
                            ),
                            Core.vx_new_string(":Masochism"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Masochism"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Dislikes self. Will go out of way to injure oneself. May seek verbal, physical, psychological, or sexual abuse. May seek life threatening abuse.")
                              )
                            ),
                            Core.vx_new_string(":Megalomania"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Megalomania"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A specific form of delusion that you are more important than you are. May believe you are destined for greatness, a Messiah, or even God."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Delusions of Grandeur, Messiah Complex")
                              )
                            ),
                            Core.vx_new_string("Mental Decay"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Decay"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Alzheimers")
                              )
                            ),
                            Core.vx_new_string("Multiple Personalities"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Multiple Personalities"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Sybil"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* More than one distinct personality. Personalities may change under stress or randomly.  Personalities may like, dislike, or be oblivious to each other. Some may be dangerous to self or others.")
                              )
                            ),
                            Core.vx_new_string(":Narssicist"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Narssicist")
                              )
                            ),
                            Core.vx_new_string(":Nightmares"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nightmares")
                              )
                            ),
                            Core.vx_new_string(":Obsessed"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Obsessed"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Focused on a single person or object and will talk about it all the time. May risk embarrassment, financial loss, or bodily harm to pursue it.")
                              )
                            ),
                            Core.vx_new_string("Obsessive Compulsive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Obsessive Compulsive"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Compulsively performs trivial activities."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("OCD")
                              )
                            ),
                            Core.vx_new_string(":Overcompensating"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Overcompensating"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Constantly attempt to draw attention away from preceived flaw.")
                              )
                            ),
                            Core.vx_new_string(":Overconfidence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Overconfidence")
                              )
                            ),
                            Core.vx_new_string(":Paranoia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paranoia"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Just because you're paranoid doesn't mean they aren't after you. - Catch 22"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Belief that enemies are everywhere. May rant endlessly about the conspiracy, compulsively work on defenses, risk everything to stop them.")
                              )
                            ),
                            Core.vx_new_string(":Phobia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phobia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Unreasoning fear of some common thing. Fear of dogs, heights, sounds, or colors. May feel discomfort, paralyzing fear, beserk fear, or catatonia.")
                              )
                            ),
                            Core.vx_new_string("Post Traumatic Stress Disorder"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Post Traumatic Stress Disorder")
                              )
                            ),
                            Core.vx_new_string(":Pyromania"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pyromania")
                              )
                            ),
                            Core.vx_new_string(":Robophobia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Robophobia"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Uncanny Valley - The theory that as a robot is made more humanlike in its appearance and motion, the emotional response from a human being to the robot will become increasingly positive, until a point is reached beyond which the response quickly becomes that of strong revulsion. However, as the appearance and motion continue to become less distinguishable from a human being, the emotional response becomes positive once more.\n* This area of repulsive response aroused by a robot with appearance and motion between a 'barely human' and 'fully human' entity is called the uncanny valley. The name captures the idea that a robot which is 'almost human' will seem overly strange and corpselike.\n* Not robots...walking dead.  They pretend we control them...but really... - Doctor Who, The Robots of Death\n* The name 'Grimwade's Syndrome' was an in-joke reference to production assistant Peter Grimwade who had bemoaned the fact that the stories on which he was assigned to work almost always involved robots. - Doctor Who, The Robots of Death"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fear of Robots"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Grimwade's Syndrome, Uncanny Valley")
                              )
                            ),
                            Core.vx_new_string("Refuses to Kill"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Refuses to Kill")
                              )
                            ),
                            Core.vx_new_string(":Sadistic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sadistic")
                              )
                            ),
                            Core.vx_new_string("Sex Crazed"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sex Crazed"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cassonova, Heartbreaker, Lady Killer, Libertine, Lothario, Romeo, Sex Addict")
                              )
                            ),
                            Core.vx_new_string(":Shy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hate dealing with others.  Avoid interactions with new people.  May need to retreat from others.")
                              )
                            ),
                            Core.vx_new_string(":Sociopath"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sociopath")
                              )
                            ),
                            Core.vx_new_string(":Stubborn"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stubborn"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Will not give in or compromise.  May risk embarrassment, financial loss, or injury to prove you're right.")
                              )
                            ),
                            Core.vx_new_string(":Tempermental"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tempermental"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* What do we have? Sea Bass. Riiiight? They are mutated Sea Bass. Really. Are they ill-tempered.  Absolutely. Well that's a start. - Dr. Evil and Number 2 - Austin Powers"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Constantly irritable. When temper flares will risk embarrassment, financial loss, incarceration, or life and limb."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bad Tempered, Hot Tempered")
                              )
                            ),
                            Core.vx_new_string("Unreasoning Hatred"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unreasoning Hatred")
                              )
                            ),
                            Core.vx_new_string(":Vengeful"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vengeful")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_movement_powers
   * @return {chapter}
   * (func chapter_movement_powers)
   */
  public static interface Func_chapter_movement_powers extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_movement_powers();
  }

  public static class Class_chapter_movement_powers extends Core.Class_base implements Func_chapter_movement_powers {

    @Override
    public Func_chapter_movement_powers vx_new(Object... vals) {
      Class_chapter_movement_powers output = new Class_chapter_movement_powers();
      return output;
    }

    @Override
    public Func_chapter_movement_powers vx_copy(Object... vals) {
      Class_chapter_movement_powers output = new Class_chapter_movement_powers();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_movement_powers", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_movement_powers vx_empty() {return e_chapter_movement_powers;}
    @Override
    public Func_chapter_movement_powers vx_type() {return t_chapter_movement_powers;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_movement_powers();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_movement_powers() {
      return Powers.f_chapter_movement_powers();
    }

  }

  public static final Func_chapter_movement_powers e_chapter_movement_powers = new Powers.Class_chapter_movement_powers();
  public static final Func_chapter_movement_powers t_chapter_movement_powers = new Powers.Class_chapter_movement_powers();

  public static Base.Type_chapter f_chapter_movement_powers() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Movement Powers"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Travel"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Travel"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Flight"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flight"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Rules/Images/MoveFlight.png"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Afterburner"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Afterburner")
                              )
                            ),
                            Core.vx_new_string("Air Droppable"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Air Droppable")
                              )
                            ),
                            Core.vx_new_string(":Airlift"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Airlift"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ability to pick up and drop cargo or [Airlift Ready] vehicles without landing.")
                              )
                            ),
                            Core.vx_new_string(":Atmospheric"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Atmospheric")
                              )
                            ),
                            Core.vx_new_string("Diving Attack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Diving Attack")
                              )
                            ),
                            Core.vx_new_string(":Glide"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Glide"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Glider, Parachute")
                              )
                            ),
                            Core.vx_new_string(":Levitate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Levitate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Levitate is a slow form of movement with a maximum speed of just half a normal Move. Levitating is very stable, silent, can move in any direction, and requires no concentration. Levitating causes no noise or movement related penalties and can avoid most terrain penalties as well.")
                              )
                            ),
                            Core.vx_new_string("Lighter Than Air"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lighter Than Air")
                              )
                            ),
                            Core.vx_new_string("Nape of Earth Flight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nape of Earth Flight")
                              )
                            ),
                            Core.vx_new_string(":Orbital"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Orbital")
                              )
                            ),
                            Core.vx_new_string("Reentry System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reentry System"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A heat shield (either inflatable or built in) for atmospheric reentry."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Ballute")
                              )
                            ),
                            Core.vx_new_string("Rocket Engine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rocket Engine")
                              )
                            ),
                            Core.vx_new_string("Stratospheric Flight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stratospheric Flight")
                              )
                            ),
                            Core.vx_new_string("Supersonic Flight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Supersonic Flight")
                              )
                            ),
                            Core.vx_new_string("Trans-atmospheric Flight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trans-atmospheric Flight")
                              )
                            ),
                            Core.vx_new_string(":VTOL"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("VTOL"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hovering units may [Move] backwards.\n* Hovering units may use [Vector Movement] rule.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Ground Movement"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ground Movement"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":2-Legged"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("2-Legged")
                              )
                            ),
                            Core.vx_new_string(":3-Legged"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("3-Legged")
                              )
                            ),
                            Core.vx_new_string(":4-Legged"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("4-Legged")
                              )
                            ),
                            Core.vx_new_string(":6-Legged"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("6-Legged")
                              )
                            ),
                            Core.vx_new_string(":8-Legged"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("8-Legged")
                              )
                            ),
                            Core.vx_new_string(":Hover"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hover"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hovering allows full movement speed over any flat terrain without actually touching the surface. Ground, Water, Sand, Ice, generally cause no penalty, but turning is difficult and imprecise especially at high speeds.\n* Hovering units may [Move] backwards.\n* Hovering units may use [Vector Movement] rule.")
                              )
                            ),
                            Core.vx_new_string("Jump Jets"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jump Jets")
                              )
                            ),
                            Core.vx_new_string("Off Roading"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Off Roading")
                              )
                            ),
                            Core.vx_new_string(":Snowcraft"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snowcraft"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Off Snow +1 Terrain Penalty.")
                              )
                            ),
                            Core.vx_new_string(":Tracked"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tracked")
                              )
                            ),
                            Core.vx_new_string(":Tunnelling"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tunnelling")
                              )
                            ),
                            Core.vx_new_string("Turbo Booster"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Turbo Booster"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Boost, Nitro, Turbo, Turbo Charger")
                              )
                            ),
                            Core.vx_new_string(":Wheeled"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wheeled")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Water Movement"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Water Movement"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Hydrofoil"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hydrofoil")
                              )
                            ),
                            Core.vx_new_string(":Sailed"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sailed"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Maps/Windsock.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Estimated 18ft Skiff speeds at 20mph winds:\n0 (180deg), 16mph (150deg), 26mph (120deg), 31mph (90deg), 32mph (60deg), 27mph (30deg), 19mph (0deg)\n\nEstimated ice yacht speeds at 30mph winds:\n0 (180deg), 95mph (150deg), 144mph (120deg), 165mph (90deg), 155mph (60deg), 115mph (30deg), 30mph (0deg)"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wind direction has an effect on all vehicles but it is most pronounced on sailing vessels.\n* [Setup] - Point Windsock in direction of the wind.  If wind direction is not already determined, roll a die to randomize the wind direction.\n* [Move] - [-1 Speed] when starting the turn against the wind at an angle.\n* [Move] - [-2 Speed] when starting the turn directly against the wind.\n\n* Sailing speed is based on Wind speed, direction, angle of motion and vesselsize.\n* Same direction as wind (Running Downwind): Max Speed = Wind Speed\n* 30 degrees off direction (Broad Reach): Max Speed = Wind Speed * 1.3 (* 4 on ice)\n* 60 degrees off direction (Broad Reach): Max Speed = Wind Speed * 1.5 (* 5 on ice)\n* 90 degrees off direction (Beam Reach): Max Speed = Wind Speed * 1.4  (* 5.5 on ice)\n* 120 degrees off direction (Close Reach): Max Speed = Wind Speed * 1.2 (* 4.8 on ice)\n* 150 degrees off direction (Close Hauled): Max Speed = Wind Speed * .7 (* 4 on ice)\n* 180 degrees (Head To Wind or In Irons): Max Speed = 0\n\n* Over distance, sailboats average speed over distance is further limited by their length at waterline:\n* This is estimated to be about 1.34 x the square root of the waterline length.\n* For a 144 ft sailboat at the waterline, the square root is 12, and the boat will probably not exceed 12 x 1.34, or about 16 knots/18mph/30kph.\n* A 100 footer should do 13.4 knots/15mph/25kph.\n* A 30 footer should do 7.34 knots/8mph/13kph.\n* A 16 footer should do 5.36 knots/6mph/10kph.")
                              )
                            ),
                            Core.vx_new_string(":Submersible"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Submersible")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Space Movement"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space Movement"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Chemical Rockets"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chemical Rockets")
                              )
                            ),
                            Core.vx_new_string("Impulse Drive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Impulse Drive"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Impulse Drive is a drive system based upon the concept that repeated energy releases at the same harmonic frequency will cause small ripples in the fabric of space.\n* By rhythmic repetition, the Drive can cause an action/reaction effect against the fabric of space itself, therefore no longer needing reaction mass to travel large distances.\n* Further, the ripples in space cause space itself to slightly change orientation on each wave. Anything crossing a wave will suffer minor disruption. Light, lasers, radio waves, radiation, and relativistic particles are increasingly scattered as they strike each wave effectively dispersing them.\n\n* This spatial effect has a number of implications on space travel:\n* High energy radiation becomes unfocused effectively creating radiation shielding proportionate to the distance from the source.\n* Energy weapons, relativistic particle weapons, and railguns become unfocused and scattered effectively increasing the armor of the vessel proportionate to the distance of the weapon.\n* At long distances, the energy detected by radar and other detection devices (even telescopes) become diffused. This effectively provides the vessel with increased stealth proportionate to the distance of the detector.\n* At closer distances, microcircuitry becomes prone to failure and damage. This makes computer chips, the foundation of modern computer science, next to useless. Therefore, computer systems must be turned off when the wave drive is active. Piloting, weaponry, and navigation must therefore be performed manually with limited automation."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Impulse, Ripple Drive, Wave Drive")
                              )
                            ),
                            Core.vx_new_string("Ion Drive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ion Drive")
                              )
                            ),
                            Core.vx_new_string("Nuclear Rockets"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nuclear Rockets")
                              )
                            ),
                            Core.vx_new_string("Reaction Mass"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reaction Mass")
                              )
                            ),
                            Core.vx_new_string("Subspace Drive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Subspace Drive"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Comet Empire Subspace Attack Submarine"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By creating a minor fold in space, a unit may drop almost completely out of normal space while maintaining a small window through which it may still interact with normal space.")
                              )
                            ),
                            Core.vx_new_string("Torch Drive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Torch Drive"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This drive creates a tight gravity well around the ship dropping it partially out of normal space. Because the ship is no longer in normal space, it does not actually move. What does move is the interface between normal space and the ship. Speed and direction are adjusted by controlling the depth and shape of the field.\n* There are a number of distinct advantages to this drive system. Because the ship in not moving, it is not subject to inertia or problems incurred at relativistic speeds.\n* Combat with the Torch drive is unique for several reasons. The occupants are not subject to the enormous stress of maneuvering at relativistic speeds. Conventional weapons have greatly reduced effect because only damage that crosses the interface has any effect on the ship.\n* Weaknesses - The Torch drive must also maintain a protective gravity bubble to defend against its own gravity well. Weapons designed to disrupt the Torch drive have a strong effect by making the ship more vulnerable to damage, by reducing its speed, by subjecting it to increased stress from travelling at relativistic speeds, and by exposing it to its own gravity well."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("TISA, Trans-Gravitic, Interphased, Sub-Light Anamoly Drive")
                              )
                            ),
                            Core.vx_new_string("Rocket Booster"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rocket Booster"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Boost, Turbo Booster")
                              )
                            ),
                            Core.vx_new_string("Vernier Thruster"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vernier Thruster"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Apogee Motor")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Interstellar Movement"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Interstellar Movement"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Hyperdrive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hyperdrive"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/Hyperspace.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Faster than light travel can be accomplished by warping space into a Wormhole/Black hole, dropping out of normal space and travelling through the parallel universe called Hyperspace/Tachyon Space where physical laws are not bound by the relationship between mass and the speed of light, and finally returning to normal space by creating another space warp.\n* Hyperspace/Tachyon Space - Tachyon Space, like other dimensions is at right angles to our existing 3 dimension. In Hyperspace, time and distance have different meanings, all particles are tachyons, and the speed of light is an absolute minimum speed instead of a maximum. Travelling through Hyperspace is exceptionally hazardous. In fact, any deviation from the calculated route cause the corridor to collapse leaving one stranded in Hyperpace forever with no way to calculate a return.\n* Calculating a Route - Once a destination is chosen, complex calculations must be performed to calculate a direct route from the current location to the destination through the shifting reality of Hyperspace. A successful route will be a 'straight' line through Hyperspace. Proximity to a gravity well makes these calculations next to impossible. Typically, all ship computer resources are required for this calculation and the larger the ship fewer the available routes and therefore the greater the complexity. Ships may only enter and exit hyperspace at the edge of a solar system and must use conventional sub light drives within the system. A day or more at sub-light speed is therefore required to reach or leave a planet in an inner solar system. Route calculation time is roughly light years x tons / 10secs e.g. 4 light years x 100 tons / 10 = 40sec.\n* Hyperspace Corridor - Once calculated, the ship must meet the speed defined by the calculation while modulating the Hyperdrive energy signature to match the bridge to Hyperspace. If all goes well, the vast energies in Tachyon Space will form a corridor directly to the destination. Errors in any of the steps usually involve intense gravitional shearing forces that will at best cause damage to the Hyperdrive and leave the traveller stranded in deep space, or worse, Hyperspace.\n* Travel in Hyperspace - Hyperspace travel is typically a boring affair. The Hyperspace corridor carries the ship to its destination, so no manuevering is needed. The time spent in Hyperspace varies, but is usually proportional to the distance. Transit time is roughly 2 hours per light year travelled (e.g. 4 light years x 2 = 8hours)\n* Tachyon Doppler Effect - When the Hyperspace Corridor is created, both ends of the corridor will start leaking Tachyons which can be detected by sensitive instruments. The amount of Tachyons increases with the size of the ship, the distance travelled and the closer the time of arrival.\n* Tachyon Relay Network - Satellites at the edge of stellar systems use Hyperspace Corridors to beam tranmissions through Hyperspace to their opposites in other systesm. Since these communications have negligible mass, the calculations are nearly instantaneous though the same transit times apply.\n* History - Imaginary Space, I-Space - While studying fusion plant efficiency using various algorithms, a surprising discovery was made: very rarely and seemingly at random, the plant would produce a tiny tachyon burst. After decades of study, a pattern began to emerge along with a shocking discovery: only algorithms using imaginary numbers could trigger a burst and a small amount of particles were actually disappearing during the event. Where the particles were going became the primary focus of astrophysics from then on. Eventually a hypothesis gathered momentum. The particles were leaving real space and traveling along trajectories plotted through so called imaginary space. This implied that the destination of the particles could be predicted. After much trial and error another breakthrough: a second tachyon burst moments after the first and many kilometers away. The particles had returned. Faster than light travel was possible. The implications for communications were immediately obvious, but could something larger make the trip? Research was slow because increased mass meant increased complexity. The power and computational needs were high but not unachievable. Only a decade later the first successful test craft made the trip. A decade later commercial hyperdrives became available. A decade later they were affordable on even modest starships."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("FTL Drive, Gravity Drive, Gravity Lens, Subspace Drive, T-Drive, Tachyon Drive, Warp Drive")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Jump Drive"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jump Drive"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Units/SpaceAndTime/Wormhole.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I created the Event Horizon to reach the stars, but she's gone much, much farther than that. She tore a hole in our universe, a gateway to another dimension. A dimension of pure chaos. Pure... evil. When she crossed over, she was just a ship. But when she came back... she was alive! - Dr. Weir, Event Horizon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Jump Drives generate energy pulses in the ship's drive to create ripples in the fabric of space.  Each pulse must be precisely timed to the apex of each ripple to create an increasing harmonic wave (the 'Wave Motion' effect). Eventually, the energy of the occillation becomes too great, a tear in space is produced, and the starship falls in."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gate Drive, Stargate, Wave Motion Engine, Wormhole"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Strategic Warp Jump"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Strategic Warp Jump"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A ship with a Warp Engine may perform a strategic warp jump and instantly remove itself from combat, returning to the strategic map.\n* A unit already on the strategic map may move [Skill] spaces on the strategic map.\n* [Requires]: The unit must cease maneuvering and must perform this ability for 3 consecutive turns.\n* [Action]: On the second consecutive action, the unit immediately removes all Vector tokens and moves the unit to any other space on the map.")
                              )
                            ),
                            Core.vx_new_string("Tactical Warp Jump"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tactical Warp Jump"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A ship with a Warp Engine may perform a tactical warp jump and instantly transport from any space on the map to any other.\n* [Requires]: The unit must cease maneuvering and must perform this ability for 2 consecutive turns.\n* [Action]: On the second consecutive action, the unit immediately removes all Vector tokens and moves the unit to any other space on the map.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Teleportation"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Teleportation"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Instant Transmission, Teleporter, Transporter"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Teleport Away"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Teleport Away"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Teleport an object/objects to a precisely known location.\n* Level determines size of object/objects and distance.\n* Tricks: Teleporting mines, bombs, fighters, drill missiles."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Smite")
                              )
                            ),
                            Core.vx_new_string("Teleport Self"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Teleport Self")
                              )
                            ),
                            Core.vx_new_string("Teleport Toward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Teleport Toward"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Beam me up Scotty"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Teleport an object/objects that you know the exact location of to your location.\n* Level determines size of object/objects and distance.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Dimensional Travel"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dimensional Travel"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I reject your reality and substitute my own. - Adam Savage, Mythbusters"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Dimension Drop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimension Drop"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Send a small object through a dimensional portal and immediately close it again. This is most practical for sending messages or explosives.")
                              )
                            ),
                            Core.vx_new_string("Dimensional Interference"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimensional Interference"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create an area that is more difficult to use dimensional or teleporting abilities.")
                              )
                            ),
                            Core.vx_new_string("Dimensional Portal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimensional Portal"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Gate")
                              )
                            ),
                            Core.vx_new_string("Dimensional Teleport"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimensional Teleport"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Move rapidly from one location to another by creating a wormhole between the locations.")
                              )
                            ),
                            Core.vx_new_string("Dimension Trace"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimension Trace"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Detect the origin of a Teleporter, Dimensional Portal, or an [Outsider].")
                              )
                            ),
                            Core.vx_new_string("Dimension Track"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimension Track"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Track the destination of someone who recently travelled using Teleport or Dimensional Travel. Also can be used to track an [Outsider] as if the user had [Tracking].")
                              )
                            ),
                            Core.vx_new_string("Dimensional Trap"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimensional Trap"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Open a Dimensional Portal that opens when a target enters the area, draws them through, and then closes behind.")
                              )
                            ),
                            Core.vx_new_string("Dimensional Walk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimensional Walk"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Move rapidly over terrain by quickly phasing in and out of the current space.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Time Travel"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Time Travel"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Units/SpaceAndTime/Vortex.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Vortex is a point of null space-time. It is a tunnel through which one can escape the bounds of space-time.\n* Here time and distance have no meaning. Travelers through the Vortex have no sense of their own body, but have a strong sense that they have been in the Vortex forever. Some suggest that this may actually be true.\n* Entering the Vortex is like dying. Leaving is like being born. Some suggest that this birth and death cycle is the reason why only living things may be brought through the Vortex."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Chronos, Eye of Harmony, Yog-Sothoth"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Freeze Time"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Freeze Time")
                              )
                            ),
                            Core.vx_new_string("Reverse Time"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reverse Time"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Rewind recent events within the surrounding area and possibly choose a different [Action].")
                              )
                            ),
                            Core.vx_new_string(":Rewind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rewind")
                              )
                            ),
                            Core.vx_new_string("Slow Time"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Slow Time")
                              )
                            ),
                            Core.vx_new_string("Time Shift"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Time Shift")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_physical_powers_and_weaknesses
   * @return {chapter}
   * (func chapter_physical_powers_and_weaknesses)
   */
  public static interface Func_chapter_physical_powers_and_weaknesses extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_physical_powers_and_weaknesses();
  }

  public static class Class_chapter_physical_powers_and_weaknesses extends Core.Class_base implements Func_chapter_physical_powers_and_weaknesses {

    @Override
    public Func_chapter_physical_powers_and_weaknesses vx_new(Object... vals) {
      Class_chapter_physical_powers_and_weaknesses output = new Class_chapter_physical_powers_and_weaknesses();
      return output;
    }

    @Override
    public Func_chapter_physical_powers_and_weaknesses vx_copy(Object... vals) {
      Class_chapter_physical_powers_and_weaknesses output = new Class_chapter_physical_powers_and_weaknesses();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_physical_powers_and_weaknesses", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_physical_powers_and_weaknesses vx_empty() {return e_chapter_physical_powers_and_weaknesses;}
    @Override
    public Func_chapter_physical_powers_and_weaknesses vx_type() {return t_chapter_physical_powers_and_weaknesses;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_physical_powers_and_weaknesses();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_physical_powers_and_weaknesses() {
      return Powers.f_chapter_physical_powers_and_weaknesses();
    }

  }

  public static final Func_chapter_physical_powers_and_weaknesses e_chapter_physical_powers_and_weaknesses = new Powers.Class_chapter_physical_powers_and_weaknesses();
  public static final Func_chapter_physical_powers_and_weaknesses t_chapter_physical_powers_and_weaknesses = new Powers.Class_chapter_physical_powers_and_weaknesses();

  public static Base.Type_chapter f_chapter_physical_powers_and_weaknesses() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Physical Powers and Weaknesses"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Physical Powers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Physical Powers"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Agility"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Agility"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Body")
                      )
                    ),
                    Core.vx_new_string(":Appearance"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Appearance"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Alter Appearance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alter Appearance")
                              )
                            ),
                            Core.vx_new_string("Another Face in the Crowd"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Another Face in the Crowd")
                              )
                            ),
                            Core.vx_new_string("Chameleon Skin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chameleon Skin")
                              )
                            ),
                            Core.vx_new_string(":Doppleganger"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Doppleganger"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Take on the appearance of someone else.")
                              )
                            ),
                            Core.vx_new_string("Enhanced Beauty"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enhanced Beauty")
                              )
                            ),
                            Core.vx_new_string("Eye of the Beholder"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eye of the Beholder"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Appear differently to different viewers.")
                              )
                            ),
                            Core.vx_new_string("Face of Terror"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Face of Terror")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Armored"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Armored"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Armor normally alters appearance and may be a permanent alteration or a suit that may be donned.\n* [+1 Value] for Armor that can appear on demand.\n* [+2 Value] for Armor that cannot be detected.\nBody Armor may be permanent or temporary.  If permanent, no time is needed to activate it, but is must either be donned and carried or it permanently alters appearance."),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Auto Med System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Auto Med System"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Detects severe damage to the wearer and automatically takes action to reduce shock and maintain suit integrity (sealing leaks or amputating if necessary).")
                              )
                            ),
                            Core.vx_new_string("Ablative Armor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ablative Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Armor that vaporizes when hit decreasing damage but also damaging the armor.\n* Ignore the first point of [Damage] and reduce [Armor] (on that facing) instead.")
                              )
                            ),
                            Core.vx_new_string("Hardened vs. Energy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hardened vs. Energy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Damage]: [+2 Armor] if attack is an [Energy Weapon]\n* Only 1 Hardened vs. ability may be taken")
                              )
                            ),
                            Core.vx_new_string("Body Flares"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Body Flares"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Detects and distracts heat seaking missiles,\n* [Passive] - +1 Defense vs. Heat-Seaking Missiles (3 uses)")
                              )
                            ),
                            Core.vx_new_string("Corrosion Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Corrosion Resistance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Passive] - +1 Armor vs. Corrosive Agents")
                              )
                            ),
                            Core.vx_new_string("Cyro Sleep System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cyro Sleep System"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can freeze the wearer into cryo-sleep and armor runs on minimal power to preserve the wearer from hostile environments or critical wounds for up to a month before power gives out.")
                              )
                            ),
                            Core.vx_new_string("Electrical Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electrical Resistance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Passive] - +1 Armor vs. Electricity")
                              )
                            ),
                            Core.vx_new_string("Environmental Containment"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Environmental Containment"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Suit is sealed against chemical and biological weapons except corrosive ones. It is also water-proof.")
                              )
                            ),
                            Core.vx_new_string("Environmental Independence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Environmental Independence"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Suit is sealed against most hostile environments including space. Does not include corrosive environments.\n* Requires - [Enviromental Containment]")
                              )
                            ),
                            Core.vx_new_string("Floation Device"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Floation Device"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* An emergency floatation device.")
                              )
                            ),
                            Core.vx_new_string("Grappling Hoist"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Grappling Hoist"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A grappling dart that is fired into stone or hooked onto any uneven surface. The attached winch can then pull the wearer to the target or vis versa depending on relative weight. This can be used for \n     climbing or towing. The darts can be recovered and reused, but they are often not recoverable. 2 replacement darts are included.")
                              )
                            ),
                            Core.vx_new_string("Hardened vs. Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hardened vs. Fire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Damage]: [+2 Armor] if attack produces [Fire] tokens\n* Only 1 Hardened vs. ability may be taken")
                              )
                            ),
                            Core.vx_new_string("Hardened vs. Projectiles"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hardened vs. Projectiles"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Damage]: [+2 Armor] if attack is a [Projectile]\n* Only 1 Hardened vs. ability may be taken")
                              )
                            ),
                            Core.vx_new_string("Infrared Dampener"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Infrared Dampener"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By activating this system, the armor reduces all heat signatures. Use of any system (even passive ones) will negate the stealth.\n* [Continuous Action] - Stealth vs. Infrared Sensors")
                              )
                            ),
                            Core.vx_new_string("Magnetic Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magnetic Resistance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces the chance that a magnetic attachment can hold on the armor (assuming it is metallic).\n* [Passive] - +1 Armor vs. Magnetism")
                              )
                            ),
                            Core.vx_new_string("Missile Mount"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Missile Mount"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A special mount to add a missile pack on the back of the armor.")
                              )
                            ),
                            Core.vx_new_string("Plasma Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plasma Resistance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Detects and disrupts the magnetic bottle surrounding plasma rounds causing them to detonate too early.\n* [Passive] - +1 Armor vs. Plasma")
                              )
                            ),
                            Core.vx_new_string("Pressure Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pressure Resistance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Passive] - +1 Armor vs. Pressure and Impact")
                              )
                            ),
                            Core.vx_new_string("Radar Dampener"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radar Dampener"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By activating this system, the armor reduces all radar signatures. Use of any system (even passive ones) will negate the stealth.\n* [Continuous Action] - Stealth vs. Radar")
                              )
                            ),
                            Core.vx_new_string("Radar Jammer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radar Jammer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By activating this system, the armor emits powerful radar white noise.\n* [Continuous Action] - [-Range] Radar sensors detection to any target within range.")
                              )
                            ),
                            Core.vx_new_string("Radiation Resistance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radiation Resistance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Passive] - +1 Armor vs. Radiation")
                              )
                            ),
                            Core.vx_new_string("Reactive Armor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reactive Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Exterior layer of armor explodes on impact reducing damage of the first hit but reduces armor rating for all subsequent hits.\n* [Passive] - +2 Armor vs. the first hit. -1 Armor for each subsequent hit.")
                              )
                            ),
                            Core.vx_new_string("Turret Mount"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Turret Mount"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A special mount to add a turreted weapon on the back of the armor.")
                              )
                            ),
                            Core.vx_new_string("Ultraviolet Jammer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ultraviolet Jammer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By activating this system, the armor emits a powerful blinding strobe in the ultraviolet band.\n* [Continuous Action] - [-Range] Ultraviolet sensors detection to any target within range.")
                              )
                            ),
                            Core.vx_new_string("Underwater Operation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Underwater Operation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Sealed against water and can operate underwater. Small thrusters allow slow movement underwater. Oxygen scrubbers allow extended underwater operation.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Fortitude"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fortitude"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Resistence, Toughness"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Body"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Resilience"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resilience")
                              )
                            ),
                            Core.vx_new_string("Resist Acid"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Acid")
                              )
                            ),
                            Core.vx_new_string("Resist Cold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Cold")
                              )
                            ),
                            Core.vx_new_string("Resist Disease"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Disease")
                              )
                            ),
                            Core.vx_new_string("Resist Electricity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Electricity")
                              )
                            ),
                            Core.vx_new_string("Resist Exposure"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Exposure")
                              )
                            ),
                            Core.vx_new_string("Resist Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Fire")
                              )
                            ),
                            Core.vx_new_string("Resist Gravity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Gravity")
                              )
                            ),
                            Core.vx_new_string("Resist Hunger"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Hunger")
                              )
                            ),
                            Core.vx_new_string("Resist Poison"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Poison")
                              )
                            ),
                            Core.vx_new_string("Resist Pressure"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Pressure")
                              )
                            ),
                            Core.vx_new_string("Resist Radiation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Radiation")
                              )
                            ),
                            Core.vx_new_string("Resist Space"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Space")
                              )
                            ),
                            Core.vx_new_string("Resist Thirst"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Thirst")
                              )
                            ),
                            Core.vx_new_string("Resist Vacuum"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Vacuum")
                              )
                            ),
                            Core.vx_new_string("Resist Water"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resist Water")
                              )
                            ),
                            Core.vx_new_string("Suspended Animation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Suspended Animation")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Healing"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Healing"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Lernaean Regeneration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lernaean Regeneration"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Activate]: If unit is Damaged, Remove a Damage Token and add a White Close Combat Token.")
                              )
                            ),
                            Core.vx_new_string(":Recover"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Recover"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* May roll extra dice when resisting [Disease] or [Poison].")
                              )
                            ),
                            Core.vx_new_string(":Regeneration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Regeneration"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Passive]\n* [Bleeding] and [Damage] Tokens are considered Yellow Tokens.")
                              )
                            ),
                            Core.vx_new_string(":Regrowth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Regrowth")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Movement"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Movement"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Wall Crawling"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall Crawling")
                              )
                            ),
                            Core.vx_new_string("Wall Running"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall Running"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Requires: [Wall Crawling]")
                              )
                            ),
                            Core.vx_new_string("Water Walking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Water Walking")
                              )
                            ),
                            Core.vx_new_string("Water Running"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Water Running"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Requires: [Water Walking]")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Natural Weaponry"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Natural Weaponry"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Bite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bite"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter savagely bites his opponent.\n* Criticals - [Piercing]")
                              )
                            ),
                            Core.vx_new_string("Bull Rush"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bull Rush"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Charge")
                              )
                            ),
                            Core.vx_new_string(":Burrowing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Burrowing")
                              )
                            ),
                            Core.vx_new_string(":Claw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Claw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter attacks with both claws.\n* Criticals - [Bleeding]")
                              )
                            ),
                            Core.vx_new_string("Claw Rake"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Claw Rake"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A quick raking claw attack with one set of claws.\n* +2 Initiative\n* -1 Accuracy\n* +1 Move\n* Criticals - [Bleeding]")
                              )
                            ),
                            Core.vx_new_string(":Constrict"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Constrict"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bear Hug")
                              )
                            ),
                            Core.vx_new_string("Death Roll"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Death Roll")
                              )
                            ),
                            Core.vx_new_string("Feather Blades"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Feather Blades"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Feathers become as hard as steel and may be used as swords.")
                              )
                            ),
                            Core.vx_new_string("Feather Knives"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Feather Knives"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Feathers become as hard as steel and may be thrown like knives.")
                              )
                            ),
                            Core.vx_new_string(":Horns"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Horns"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Usually they are worn as antlers, but may sprout form anywhere on the body.")
                              )
                            ),
                            Core.vx_new_string("Jaw Lock"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jaw Lock"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter locks his powerful jaws onto the opponent to immobilize.\n* Damage - [Slow]\n* Criticals - [Piercing]")
                              )
                            ),
                            Core.vx_new_string("Jaws of Death"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jaws of Death"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fericiously attack with huge bites.")
                              )
                            ),
                            Core.vx_new_string("Neck Bite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Neck Bite"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* After grabbing an opponent, the fighter bites the neck/shoulders of the opponents doing damage each turn.\n* Requires: [Hold], [Continuous Hold]\n* +1 Initiative\n* +1 Accuracy\n* Critcals - [Bleeding]")
                              )
                            ),
                            Core.vx_new_string(":Overwhelm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Overwhelm")
                              )
                            ),
                            Core.vx_new_string(":Pounce"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pounce"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter drops into a crouch and then explodes into a mighty leap at his prey attempting to knock down the opponent.\n* [Aerial]\n* +1 Accuracy\n* +1 Move\n* Criticals - [Knockdown]")
                              )
                            ),
                            Core.vx_new_string("Quill Attack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Quill Attack")
                              )
                            ),
                            Core.vx_new_string("Ripping Bite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ripping Bite"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter strikes a limb with the intention to disable his opponent.\n* -1 Initiative\n* -1 Damage\n* +1 Critical - [Bleeding] or [Weakness]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Jaws of Death")
                              )
                            ),
                            Core.vx_new_string("Savage Genitalia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Savage Genitalia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Male variations include excessive length, hardness, spines, and thorns.\n* Female variations include teeth, ripping suction, crushers, and grinders.\n* [Hidden Weapon]\n* -2 Initiative\n* -1 Accuracy\n* +1 Critical")
                              )
                            ),
                            Core.vx_new_string(":Spines"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spines")
                              )
                            ),
                            Core.vx_new_string(":Sting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sting")
                              )
                            ),
                            Core.vx_new_string("Swallow Whole"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swallow Whole")
                              )
                            ),
                            Core.vx_new_string("Tail Sweep"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tail Sweep")
                              )
                            ),
                            Core.vx_new_string("Tongue Lash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tongue Lash")
                              )
                            ),
                            Core.vx_new_string(":Tusk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tusk")
                              )
                            ),
                            Core.vx_new_string(":Trample"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trample")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Quickness"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quickness"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Celerity, Hyperspeed, Quickening, Speed"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("After Image"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("After Image"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Dragon Ball\n* Phantom Miria - Claymore"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Evade: Instantly make a Move without triggering Opportunity Attacks.")
                              )
                            ),
                            Core.vx_new_string("Fast Actions"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fast Actions"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Time to complete time consuming actions is dramatically reduced.")
                              )
                            ),
                            Core.vx_new_string("Hyper Punch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hyper Punch"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Action: Perform a basic [Attack] on a single target. If the attack succeeds, roll additional damage dice up to level.")
                              )
                            ),
                            Core.vx_new_string("Hyper Running"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hyper Running")
                              )
                            ),
                            Core.vx_new_string("Hyper Swimming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hyper Swimming")
                              )
                            ),
                            Core.vx_new_string("Hyper Storm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hyper Storm"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Action: Use a Move and perform a basic [Attack] up to 1 target per level on each target along your path. If the attack succeeds, roll additional damage dice up to level.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Senses"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Senses"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("360 Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("360 Vision")
                              )
                            ),
                            Core.vx_new_string("Blood Scent"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Scent")
                              )
                            ),
                            Core.vx_new_string("Cosmic Awareness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cosmic Awareness"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Captain Marvel, Gundam New Types")
                              )
                            ),
                            Core.vx_new_string("Death Sense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Death Sense")
                              )
                            ),
                            Core.vx_new_string("Electromagnetic Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electromagnetic Vision"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("See into radio and radiation band of electromagnetic spectrum")
                              )
                            ),
                            Core.vx_new_string("Enhanced Hearing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enhanced Hearing")
                              )
                            ),
                            Core.vx_new_string("Enhanced Smell"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enhanced Smell")
                              )
                            ),
                            Core.vx_new_string("Enhanced Taste"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enhanced Taste")
                              )
                            ),
                            Core.vx_new_string("Enhanced Touch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enhanced Touch")
                              )
                            ),
                            Core.vx_new_string("Microscopic Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Microscopic Vision")
                              )
                            ),
                            Core.vx_new_string("Motion Detection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Motion Detection")
                              )
                            ),
                            Core.vx_new_string("Night Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Night Vision"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Light Intensifying")
                              )
                            ),
                            Core.vx_new_string("Radar Sense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radar Sense")
                              )
                            ),
                            Core.vx_new_string("Radio Sense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radio Sense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* May hear radio, television, shortwave, and even cellular telephone communications when concentrating.")
                              )
                            ),
                            Core.vx_new_string(":Sonar"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sonar"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Echo Location")
                              )
                            ),
                            Core.vx_new_string("Telescopic Hearing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telescopic Hearing")
                              )
                            ),
                            Core.vx_new_string("Telescopic Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telescopic Vision")
                              )
                            ),
                            Core.vx_new_string("Thermal Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Thermal Vision")
                              )
                            ),
                            Core.vx_new_string("Tracking Sense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tracking Sense")
                              )
                            ),
                            Core.vx_new_string("Ultrasonic/Subsonic Hearing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ultrasonic/Subsonic Hearing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hear ultra high or low pitched sounds. Subsonic sounds can travel extreme distances and are some of the communication systems used by whales and elephants.")
                              )
                            ),
                            Core.vx_new_string("Ultraviolet Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ultraviolet Vision")
                              )
                            ),
                            Core.vx_new_string("X-Ray Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("X-Ray Vision"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Superman: Bruce Wayne? Batman: You peeked. - Superman and Batman, Superman: The Animated Series"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* See through solid objects. The higher the density the blurrier the vision.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Shielding"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shielding"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Shield Modulation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shield Modulation")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Strength"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Strength"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Technique is for lightweights. - Sett, Runeterra"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Body"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Power Leap"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Power Leap")
                              )
                            ),
                            Core.vx_new_string("Power Lift"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Power Lift"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Lift additional kg equal to Power Rating.")
                              )
                            ),
                            Core.vx_new_string("Power Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Power Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Add Power Rating to weapon damage using Melee, or Close Combat.")
                              )
                            ),
                            Core.vx_new_string("Power Throw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Power Throw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Add Power Rating to weapon damage when throwing any object or weapon.")
                              )
                            ),
                            Core.vx_new_string(":Shockwave"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shockwave")
                              )
                            ),
                            Core.vx_new_string(":Thunderclap"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Thunderclap")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_powers_overview
   * @return {chapter}
   * (func chapter_powers_overview)
   */
  public static interface Func_chapter_powers_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_powers_overview();
  }

  public static class Class_chapter_powers_overview extends Core.Class_base implements Func_chapter_powers_overview {

    @Override
    public Func_chapter_powers_overview vx_new(Object... vals) {
      Class_chapter_powers_overview output = new Class_chapter_powers_overview();
      return output;
    }

    @Override
    public Func_chapter_powers_overview vx_copy(Object... vals) {
      Class_chapter_powers_overview output = new Class_chapter_powers_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_powers_overview", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_powers_overview vx_empty() {return e_chapter_powers_overview;}
    @Override
    public Func_chapter_powers_overview vx_type() {return t_chapter_powers_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_powers_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_powers_overview() {
      return Powers.f_chapter_powers_overview();
    }

  }

  public static final Func_chapter_powers_overview e_chapter_powers_overview = new Powers.Class_chapter_powers_overview();
  public static final Func_chapter_powers_overview t_chapter_powers_overview = new Powers.Class_chapter_powers_overview();

  public static Base.Type_chapter f_chapter_powers_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Powers Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Powers?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Powers?")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_special_modifiers
   * @return {chapter}
   * (func chapter_special_modifiers)
   */
  public static interface Func_chapter_special_modifiers extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_special_modifiers();
  }

  public static class Class_chapter_special_modifiers extends Core.Class_base implements Func_chapter_special_modifiers {

    @Override
    public Func_chapter_special_modifiers vx_new(Object... vals) {
      Class_chapter_special_modifiers output = new Class_chapter_special_modifiers();
      return output;
    }

    @Override
    public Func_chapter_special_modifiers vx_copy(Object... vals) {
      Class_chapter_special_modifiers output = new Class_chapter_special_modifiers();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_special_modifiers", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_special_modifiers vx_empty() {return e_chapter_special_modifiers;}
    @Override
    public Func_chapter_special_modifiers vx_type() {return t_chapter_special_modifiers;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_special_modifiers();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_special_modifiers() {
      return Powers.f_chapter_special_modifiers();
    }

  }

  public static final Func_chapter_special_modifiers e_chapter_special_modifiers = new Powers.Class_chapter_special_modifiers();
  public static final Func_chapter_special_modifiers t_chapter_special_modifiers = new Powers.Class_chapter_special_modifiers();

  public static Base.Type_chapter f_chapter_special_modifiers() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Special Modifiers"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Buffs"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Buffs"),
                Core.vx_new_string(":modifiermap"),
                Core.f_new(
                  Base.t_modifiermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Arc"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Arc"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Triangle shaped effect starting at 3 spaces wide and widening by 1 additional space for each space of range.\n* [-2 Skill] for each Space of Range")
                      )
                    ),
                    Core.vx_new_string("Armor-Piercing (AP)"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Armor-Piercing (AP)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Specifically designed to target armored units.")
                      )
                    ),
                    Core.vx_new_string(":Anti-Armor"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Armor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Specifically designed to tear apart armor to leave target open to further attacks.")
                      )
                    ),
                    Core.vx_new_string(":Anti-Missile"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Missile"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Specifically designed to intercept high speed targets moving in a straight line.")
                      )
                    ),
                    Core.vx_new_string(":Anti-Personnel"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Personnel"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Specifically designed to attack man-sized targets.")
                      )
                    ),
                    Core.vx_new_string(":Anti-Shield"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Shield"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Specifically designed to reduced [Shielding].")
                      )
                    ),
                    Core.vx_new_string(":Aura"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aura"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Radial effect encompassing the current space and continuing for Level Range.")
                      )
                    ),
                    Core.vx_new_string(":Beam"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beam"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Rectangular shaped effect 1 space wide.\n* [-1 Skill] for each 2 Spaces of Range")
                      )
                    ),
                    Core.vx_new_string("Chain Reaction"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chain Reaction")
                      )
                    ),
                    Core.vx_new_string(":Cloud"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cloud")
                      )
                    ),
                    Core.vx_new_string(":Cluster"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cluster")
                      )
                    ),
                    Core.vx_new_string(":Column"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Column"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Rectangular shaped effect starting at 1 space wide and widening to 3 spaces.\n* [Action]: [-2 Skill] for each Space of Range")
                      )
                    ),
                    Core.vx_new_string(":Cone"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cone"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Triangle shaped effect starting at 1 space wide and widening by 1 additional space for every 2 spaces of range.\n* [Action]: [-2 Skill] for each Space of Range")
                      )
                    ),
                    Core.vx_new_string(":Fork"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fork")
                      )
                    ),
                    Core.vx_new_string(":Haywire"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Haywire"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Attack that damages electrical systems.")
                      )
                    ),
                    Core.vx_new_string("Hidden Effect"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hidden Effect"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Effect cannot be detected through normal means.")
                      )
                    ),
                    Core.vx_new_string("High-Explosive (HE)"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("High-Explosive (HE)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Targetting]: Target a space.  All units in that space and surrounding spaces are attacked.\n* [Damage]: All target's are [+2 Armor] against this attack.\n* [Damage]: Units surrounding the space are attacked at -1 Damage for each space distant.\n\nAdvanced:\n* Instead of standard [High Explosive (HE)] rules the following may be used to more accurately simulate the damage exponential decrease in energy of explosives.\n* [Targetting]: Target a space. All units in that space and surrounding spaces are attacked.\n* [Damage]: All target's are [+2 Armor] against this attack.\n* [Damage]: Units surrounding the space are attacked by dividing the energy (in Joules, or tons of TNT) using the following reduction pattern for each space distant: 1/1, 1/3, 1/10, 1/30, 1/100, 1/300, 1/1000, etc. Then look up the new damage based on the new energy level.")
                      )
                    ),
                    Core.vx_new_string(":Homing"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Homing"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Guided, Seeking")
                      )
                    ),
                    Core.vx_new_string(":Indirect"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Indirect"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* May use [Indirect Fire] ability to attack without [Line of Sight].")
                      )
                    ),
                    Core.vx_new_string("Pushing the Limits"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pushing the Limits"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Powers may be increased temporarily, but this runs a risk of damaging or permanently altering the subject or his powers in some way. This may even increase the power but may create [Aberrations].")
                      )
                    ),
                    Core.vx_new_string(":Ring"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ring"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Circle")
                      )
                    ),
                    Core.vx_new_string(":Sphere"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sphere"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Radial effect encompassing the current space.\n* [Action]: [-3 Skill] for each Space of Range")
                      )
                    ),
                    Core.vx_new_string(":Spray"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spray")
                      )
                    ),
                    Core.vx_new_string(":Swarm"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Swarm")
                      )
                    ),
                    Core.vx_new_string(":Touch"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Touch"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Requires]: Target must be within 1 space and be able to be touched.")
                      )
                    ),
                    Core.vx_new_string(":Wall"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wall"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Walls start on the edge of a space and spread outward one space in each direction on each of this unit's turns until the unit ceases concentration or the maximum size is reached. Maximum Size is one square space per level.")
                      )
                    ),
                    Core.vx_new_string(":Wave"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wave")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Power Weaknesses"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Power Weaknesses"),
                Core.vx_new_string(":modifiermap"),
                Core.f_new(
                  Base.t_modifiermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Activation"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Activation"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Activating the ability requires more than just desire")
                      )
                    ),
                    Core.vx_new_string("Always On"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Always On"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ability may not be turned off")
                      )
                    ),
                    Core.vx_new_string(":Annoying"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Annoying"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Tiny things that make using the ability frustrating.")
                      )
                    ),
                    Core.vx_new_string("Communications Broadcast Only"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Communications Broadcast Only")
                      )
                    ),
                    Core.vx_new_string("Communications None"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Communications None")
                      )
                    ),
                    Core.vx_new_string("Communications Receive Only"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Communications Receive Only")
                      )
                    ),
                    Core.vx_new_string("Conditional Use"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Conditional Use"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ability may only be used under specific circumstances")
                      )
                    ),
                    Core.vx_new_string("Energy Discharge"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Energy Discharge"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Cannot completely contain own energies and must allow them to leak out regularly. At low levels this just draws attention, but at higher levels becomes dangerous.")
                      )
                    ),
                    Core.vx_new_string("Focus Item"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Focus Item")
                      )
                    ),
                    Core.vx_new_string("Glider Only"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Glider Only")
                      )
                    ),
                    Core.vx_new_string(":Inefficient"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Inefficient"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Uses excessive energy.")
                      )
                    ),
                    Core.vx_new_string(":Internalize"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Internalize")
                      )
                    ),
                    Core.vx_new_string("Large Sensor Profile"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Large Sensor Profile")
                      )
                    ),
                    Core.vx_new_string("Limited Uses"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Limited Uses")
                      )
                    ),
                    Core.vx_new_string(":Overheats"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Overheats")
                      )
                    ),
                    Core.vx_new_string(":Overloads"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Overloads")
                      )
                    ),
                    Core.vx_new_string("Poor Climb Angle"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poor Climb Angle")
                      )
                    ),
                    Core.vx_new_string("Poor Ceiling"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poor Ceiling")
                      )
                    ),
                    Core.vx_new_string("Poor Towing Capacity"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poor Towing Capacity")
                      )
                    ),
                    Core.vx_new_string("Power Fluxuation"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Fluxuation"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Cannot completely control power level. At random, power use may be higher or lower than expected. High level powers may not be able to be turned off or may not turn on when needed.")
                      )
                    ),
                    Core.vx_new_string("Power Hungry"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Hungry"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Requires extra turns of inactivity to use.")
                      )
                    ),
                    Core.vx_new_string("Power Manifestation"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Manifestation"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("When powers are used, a visual or audible manifestation appears. The higher the power level the more obvious the manifestation.")
                      )
                    ),
                    Core.vx_new_string("Requires Airstrip"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Requires Airstrip")
                      )
                    ),
                    Core.vx_new_string("Sensor Dependent"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sensor Dependent"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Blind without Sensors")
                      )
                    ),
                    Core.vx_new_string("Traceable Emmissions"),
                    Core.f_new(
                      Base.t_modifier,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Traceable Emmissions")
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_strength_and_weaknesses
   * @return {chapter}
   * (func chapter_strength_and_weaknesses)
   */
  public static interface Func_chapter_strength_and_weaknesses extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_strength_and_weaknesses();
  }

  public static class Class_chapter_strength_and_weaknesses extends Core.Class_base implements Func_chapter_strength_and_weaknesses {

    @Override
    public Func_chapter_strength_and_weaknesses vx_new(Object... vals) {
      Class_chapter_strength_and_weaknesses output = new Class_chapter_strength_and_weaknesses();
      return output;
    }

    @Override
    public Func_chapter_strength_and_weaknesses vx_copy(Object... vals) {
      Class_chapter_strength_and_weaknesses output = new Class_chapter_strength_and_weaknesses();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "chapter_strength_and_weaknesses", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_chapter_strength_and_weaknesses vx_empty() {return e_chapter_strength_and_weaknesses;}
    @Override
    public Func_chapter_strength_and_weaknesses vx_type() {return t_chapter_strength_and_weaknesses;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_chapter_strength_and_weaknesses();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_strength_and_weaknesses() {
      return Powers.f_chapter_strength_and_weaknesses();
    }

  }

  public static final Func_chapter_strength_and_weaknesses e_chapter_strength_and_weaknesses = new Powers.Class_chapter_strength_and_weaknesses();
  public static final Func_chapter_strength_and_weaknesses t_chapter_strength_and_weaknesses = new Powers.Class_chapter_strength_and_weaknesses();

  public static Base.Type_chapter f_chapter_strength_and_weaknesses() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Strength and Weaknesses"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Special Skills"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Special Skills"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Special Ability"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Special Ability"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Cannibal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cannibal"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Close Combat\n* [Attack]: Each [Critical Hit] may remove a [Damage Token] from this unit.")
                              )
                            ),
                            Core.vx_new_string(":Chaotic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chaotic")
                              )
                            ),
                            Core.vx_new_string(":Corrupted"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Corrupted")
                              )
                            ),
                            Core.vx_new_string(":Ethereal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ethereal")
                              )
                            ),
                            Core.vx_new_string("Feeding Frenzy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Feeding Frenzy")
                              )
                            ),
                            Core.vx_new_string(":Giant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Giant")
                              )
                            ),
                            Core.vx_new_string(":Huge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Huge")
                              )
                            ),
                            Core.vx_new_string("Lernaean Poison"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lernaean Poison")
                              )
                            ),
                            Core.vx_new_string(":Mindless"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mindless"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 0 [Mind]\n* Cannot use any Mind Abilities\n* Immune to Abilities that target [Mind].")
                              )
                            ),
                            Core.vx_new_string(":Monstrous"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Monstrous")
                              )
                            ),
                            Core.vx_new_string("Nemean Invulnerability"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nemean Invulnerability")
                              )
                            ),
                            Core.vx_new_string("Rapid Metabolism"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rapid Metabolism")
                              )
                            ),
                            Core.vx_new_string(":Savage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Savage"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Must Attack if able.\n* Ignores Fear, Despair, and Morale")
                              )
                            ),
                            Core.vx_new_string(":Skeletal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Skeletal"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* +1 Body\n* Ignores [Bleeding], [Poison], and [Disease]")
                              )
                            ),
                            Core.vx_new_string(":Soulless"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Soulless"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A soulless unit is not truly alive.  It may not use or gain Spirit skills.")
                              )
                            ),
                            Core.vx_new_string(":Tainted"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tainted")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Weaknesses"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Weaknesses"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Physical Weakness"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Physical Weakness"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("A being that has a great deal of power becomes increasingly inhuman as power increases. Physical powers become harder to conceal growing increasingly monstrous and mentality leans more toward megalomania, messiah complex, or detached alien."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aberrations, Inhumanity, The Price of Power, Taint"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Allergy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Allergy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Affected by substances or energies that have little or no effect on normal people.")
                              )
                            ),
                            Core.vx_new_string(":Asthma"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Asthma")
                              )
                            ),
                            Core.vx_new_string(":Atrophy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Atrophy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* One or more limbs has limited mobility")
                              )
                            ),
                            Core.vx_new_string(":Blind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blind")
                              )
                            ),
                            Core.vx_new_string(":Brittle"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brittle")
                              )
                            ),
                            Core.vx_new_string(":Child"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Child"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* You are still a child and have difficulty getting others to take you seriously. This is usually taken with [Short].")
                              )
                            ),
                            Core.vx_new_string("Cold Blooded"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cold Blooded")
                              )
                            ),
                            Core.vx_new_string("Color Blindness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Color Blindness")
                              )
                            ),
                            Core.vx_new_string(":Contagious"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Contagious"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Spreads disease.")
                              )
                            ),
                            Core.vx_new_string(":Clumsy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Clumsy")
                              )
                            ),
                            Core.vx_new_string(":Deaf"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deaf")
                              )
                            ),
                            Core.vx_new_string(":Deformity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deformity"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces Social Skills and some Physical Skills.")
                              )
                            ),
                            Core.vx_new_string(":Disfigured"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Disfigured"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces Social Skills dramatically.")
                              )
                            ),
                            Core.vx_new_string("Extra Body Parts"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Extra Body Parts")
                              )
                            ),
                            Core.vx_new_string("Hard of Hearing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hard of Hearing")
                              )
                            ),
                            Core.vx_new_string(":Lame"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lame"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces Speed")
                              )
                            ),
                            Core.vx_new_string(":Leprosy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Leprosy")
                              )
                            ),
                            Core.vx_new_string("Missing Body Parts"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Missing Body Parts")
                              )
                            ),
                            Core.vx_new_string(":Mute"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mute")
                              )
                            ),
                            Core.vx_new_string(":Obvious"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Obvious"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Easy to detect and target"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Large Profile")
                              )
                            ),
                            Core.vx_new_string("Obvious Signature"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Obvious Signature"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Easy to identify and track"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Energy Signature, Heat Signature")
                              )
                            ),
                            Core.vx_new_string(":Numb"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Numb")
                              )
                            ),
                            Core.vx_new_string(":Old"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Old")
                              )
                            ),
                            Core.vx_new_string(":Paralyzed"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paralyzed")
                              )
                            ),
                            Core.vx_new_string("Parasitic Infection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Parasitic Infection")
                              )
                            ),
                            Core.vx_new_string("Peeling Skin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Peeling Skin")
                              )
                            ),
                            Core.vx_new_string("Poor Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poor Vision")
                              )
                            ),
                            Core.vx_new_string(":Short"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Short"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This minor weakness reduces vision over objects and movement speed.\n* It can, however, provide benefits to [Stealth].")
                              )
                            ),
                            Core.vx_new_string(":Sterile"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sterile"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* May not produce offspring")
                              )
                            ),
                            Core.vx_new_string(":Tasteless"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tasteless")
                              )
                            ),
                            Core.vx_new_string("Temperature Control Problem"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Temperature Control Problem"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cannot regulate temperature correctly")
                              )
                            ),
                            Core.vx_new_string("Terminal Condition"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Terminal Condition")
                              )
                            ),
                            Core.vx_new_string("Unusual Appearance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unusual Appearance")
                              )
                            ),
                            Core.vx_new_string("Unusual Diet"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unusual Diet"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Minor: Eat wood, garbage, hair, etc.\n* Major: Eat metal, energy\n* Extreme: Eat blood, human flesh, plutonium")
                              )
                            ),
                            Core.vx_new_string("Unusual Eyes"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unusual Eyes"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Minor: Strange colored\n* Major: Animal-like, or glowing eyes\n* Extreme: Bug-eyes, or no eyes")
                              )
                            ),
                            Core.vx_new_string("Unusual Limbs"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unusual Limbs"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Gnarled, segmented, snake-like, eloganted or other bizarre looking limbs")
                              )
                            ),
                            Core.vx_new_string("Unusual Musculature"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unusual Musculature"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Bulging muscles or wasted looking")
                              )
                            ),
                            Core.vx_new_string("Unusual Skin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unusual Skin"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Minor: Strange colored\n* Major: Furry, Striped, Glowing\n* Extreme: Translucent, Reptilian, Rock-like, Exoskeleton, Oozing")
                              )
                            ),
                            Core.vx_new_string("Unusual Vulnerability"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unusual Vulnerability"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Kryptonite, Severe Allergies"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Take damage from things that are not dangerous to ordinary people.")
                              )
                            ),
                            Core.vx_new_string(":Vulnerability"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vulnerability"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Take additional damage from certain effects")
                              )
                            ),
                            Core.vx_new_string("Vulnerable to Bleeding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vulnerable to Bleeding")
                              )
                            ),
                            Core.vx_new_string("Vulnerable to Electricity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vulnerable to Electricity")
                              )
                            ),
                            Core.vx_new_string("Vulnerable to Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vulnerable to Fire")
                              )
                            ),
                            Core.vx_new_string("Vulnerable to Heat"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vulnerable to Heat")
                              )
                            ),
                            Core.vx_new_string("Vulnerable to Impact"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vulnerable to Impact")
                              )
                            ),
                            Core.vx_new_string("Vulnerable to Piercing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vulnerable to Piercing")
                              )
                            ),
                            Core.vx_new_string("Vulnerable to Radiation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vulnerable to Radiation")
                              )
                            ),
                            Core.vx_new_string("Vulnerable to Slashing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vulnerable to Slashing")
                              )
                            ),
                            Core.vx_new_string(":Wasting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wasting")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Social Weakness"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Social Weakness"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Awkward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Awkward")
                              )
                            ),
                            Core.vx_new_string(":Hideous"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hideous")
                              )
                            ),
                            Core.vx_new_string(":Hunted"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hunted")
                              )
                            ),
                            Core.vx_new_string(":Naive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Naive")
                              )
                            ),
                            Core.vx_new_string(":Nemesis"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nemesis")
                              )
                            ),
                            Core.vx_new_string(":Noble"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Noble")
                              )
                            ),
                            Core.vx_new_string(":Notorious"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Notorious")
                              )
                            ),
                            Core.vx_new_string("Speech Impediment"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Speech Impediment")
                              )
                            ),
                            Core.vx_new_string(":Strangeness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Strangeness")
                              )
                            ),
                            Core.vx_new_string(":Terrifying"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Terrifying")
                              )
                            ),
                            Core.vx_new_string(":Timid"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Timid")
                              )
                            ),
                            Core.vx_new_string(":Ugly"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ugly")
                              )
                            ),
                            Core.vx_new_string("Unnatural Presense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unnatural Presense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Subtly disturbing, homely, or too perfect and inspires negative attention from others.")
                              )
                            ),
                            Core.vx_new_string(":Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* You are devoted to taking care of another (who happens to get into trouble a lot).")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Supernatural Weakness"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Supernatural Weakness"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Cursed"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cursed")
                              )
                            ),
                            Core.vx_new_string("Dark Fate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dark Fate")
                              )
                            ),
                            Core.vx_new_string(":Haunted"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Haunted")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function tacticsbook
   * @return {book}
   * (func tacticsbook)
   */
  public static interface Func_tacticsbook extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_tacticsbook();
  }

  public static class Class_tacticsbook extends Core.Class_base implements Func_tacticsbook {

    @Override
    public Func_tacticsbook vx_new(Object... vals) {
      Class_tacticsbook output = new Class_tacticsbook();
      return output;
    }

    @Override
    public Func_tacticsbook vx_copy(Object... vals) {
      Class_tacticsbook output = new Class_tacticsbook();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/powers", // pkgname
        "tacticsbook", // name
        0, // idx
        false, // async
        Core.typedef_new(
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
        ) // typedef
      );
    }

    @Override
    public Func_tacticsbook vx_empty() {return e_tacticsbook;}
    @Override
    public Func_tacticsbook vx_type() {return t_tacticsbook;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Powers.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Powers.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Powers.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Powers.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Powers"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Powers.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Powers Overview"),
            Powers.f_chapter_powers_overview(),
            Core.vx_new_string("Special Modifiers"),
            Powers.f_chapter_special_modifiers(),
            Core.vx_new_string("Equipment Powers"),
            Powers.f_chapter_equipment_powers(),
            Core.vx_new_string("Strength and Weaknesses"),
            Powers.f_chapter_strength_and_weaknesses(),
            Core.vx_new_string("Mental Powers and Weaknesses"),
            Powers.f_chapter_mental_powers_and_weaknesses(),
            Core.vx_new_string("Movement Powers"),
            Powers.f_chapter_movement_powers(),
            Core.vx_new_string("Physical Powers and Weaknesses"),
            Powers.f_chapter_physical_powers_and_weaknesses(),
            Core.vx_new_string("Body Powers"),
            Powers.f_chapter_body_powers(),
            Core.vx_new_string("Energy and Forces"),
            Powers.f_chapter_energy_and_forces(),
            Core.vx_new_string("Enhancement Powers"),
            Powers.f_chapter_enhancement_powers(),
            Core.vx_new_string("Alteration Powers"),
            Powers.f_chapter_alteration_powers(),
            Core.vx_new_string("Godlike Powers"),
            Powers.f_chapter_godlike_powers()
          )
        )
      )
    );
    return output;
  }


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    mapfunc.put("chapter_alteration_powers", Powers.t_chapter_alteration_powers);
    mapfunc.put("chapter_body_powers", Powers.t_chapter_body_powers);
    mapfunc.put("chapter_energy_and_forces", Powers.t_chapter_energy_and_forces);
    mapfunc.put("chapter_enhancement_powers", Powers.t_chapter_enhancement_powers);
    mapfunc.put("chapter_equipment_powers", Powers.t_chapter_equipment_powers);
    mapfunc.put("chapter_godlike_powers", Powers.t_chapter_godlike_powers);
    mapfunc.put("chapter_mental_powers_and_weaknesses", Powers.t_chapter_mental_powers_and_weaknesses);
    mapfunc.put("chapter_movement_powers", Powers.t_chapter_movement_powers);
    mapfunc.put("chapter_physical_powers_and_weaknesses", Powers.t_chapter_physical_powers_and_weaknesses);
    mapfunc.put("chapter_powers_overview", Powers.t_chapter_powers_overview);
    mapfunc.put("chapter_special_modifiers", Powers.t_chapter_special_modifiers);
    mapfunc.put("chapter_strength_and_weaknesses", Powers.t_chapter_strength_and_weaknesses);
    mapfunc.put("tacticsbook", Powers.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/powers", maptype, mapconst, mapfunc);
  }

}
