package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Age_of_sail {

  /**
   * @function chapter_age_of_sail_overview
   * @return {chapter}
   * (func chapter_age_of_sail_overview)
   */
  public static interface Func_chapter_age_of_sail_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_age_of_sail_overview();
  }

  public static class Class_chapter_age_of_sail_overview extends Core.Class_base implements Func_chapter_age_of_sail_overview {

    @Override
    public Func_chapter_age_of_sail_overview vx_new(Object... vals) {
      Class_chapter_age_of_sail_overview output = new Class_chapter_age_of_sail_overview();
      return output;
    }

    @Override
    public Func_chapter_age_of_sail_overview vx_copy(Object... vals) {
      Class_chapter_age_of_sail_overview output = new Class_chapter_age_of_sail_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_sail", // pkgname
        "chapter_age_of_sail_overview", // name
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
    public Func_chapter_age_of_sail_overview vx_empty() {return e_chapter_age_of_sail_overview;}
    @Override
    public Func_chapter_age_of_sail_overview vx_type() {return t_chapter_age_of_sail_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_sail.f_chapter_age_of_sail_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_age_of_sail_overview() {
      return Age_of_sail.f_chapter_age_of_sail_overview();
    }

  }

  public static final Func_chapter_age_of_sail_overview e_chapter_age_of_sail_overview = new Age_of_sail.Class_chapter_age_of_sail_overview();
  public static final Func_chapter_age_of_sail_overview t_chapter_age_of_sail_overview = new Age_of_sail.Class_chapter_age_of_sail_overview();

  public static Base.Type_chapter f_chapter_age_of_sail_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Age of Sail Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Age of Sail?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Age of Sail?"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("http://www.thepirateking.com/historical/cannon_projectiles.htm"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("The Age of Sail was the period in which international trade and naval warfare were dominated by sailing ships,\nlasting from the 16th to the mid 19th century.  This is a significant period during which square-rigged sailing\nships carried European settlers to many parts of the world in one of the most expansive human migrations in\nrecorded history.")
              )
            ),
            Core.vx_new_string("Age of Sail Land Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Land Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Infantry\n* Cavalry\n* Muskets\n* Cannons\n* Artillery\n* High Ground")
              )
            ),
            Core.vx_new_string("Age of Sail Naval Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Naval Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Wind\n* Large Ships\n* Small Ships\n* Solid Shot\n* Burning Shot\n* Chain Shot\n* Fortifications")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_age_of_sail_weaponry
   * @return {chapter}
   * (func chapter_age_of_sail_weaponry)
   */
  public static interface Func_chapter_age_of_sail_weaponry extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_age_of_sail_weaponry();
  }

  public static class Class_chapter_age_of_sail_weaponry extends Core.Class_base implements Func_chapter_age_of_sail_weaponry {

    @Override
    public Func_chapter_age_of_sail_weaponry vx_new(Object... vals) {
      Class_chapter_age_of_sail_weaponry output = new Class_chapter_age_of_sail_weaponry();
      return output;
    }

    @Override
    public Func_chapter_age_of_sail_weaponry vx_copy(Object... vals) {
      Class_chapter_age_of_sail_weaponry output = new Class_chapter_age_of_sail_weaponry();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_sail", // pkgname
        "chapter_age_of_sail_weaponry", // name
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
    public Func_chapter_age_of_sail_weaponry vx_empty() {return e_chapter_age_of_sail_weaponry;}
    @Override
    public Func_chapter_age_of_sail_weaponry vx_type() {return t_chapter_age_of_sail_weaponry;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_sail.f_chapter_age_of_sail_weaponry();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_age_of_sail_weaponry() {
      return Age_of_sail.f_chapter_age_of_sail_weaponry();
    }

  }

  public static final Func_chapter_age_of_sail_weaponry e_chapter_age_of_sail_weaponry = new Age_of_sail.Class_chapter_age_of_sail_weaponry();
  public static final Func_chapter_age_of_sail_weaponry t_chapter_age_of_sail_weaponry = new Age_of_sail.Class_chapter_age_of_sail_weaponry();

  public static Base.Type_chapter f_chapter_age_of_sail_weaponry() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Age of Sail Weaponry"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Age of Sail Pistols"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Pistols"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("20mm Dragon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("20mm Dragon"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The blunderbuss, and especially the shorter dragon, was typically issued to troops such as cavalry, who needed a\nlightweight, easily handled firearm.  The dragon became so associated with cavalry and mounted infantry that the\nterm dragoon became synonymous with mounted infantry."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A short, muzzle-loading, flintlock, hand shotgun"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("225m/s")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Age of Sail Rifles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Rifles"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("12mm Carbine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("12mm Carbine"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Short musket\n# Effective Range 60m\n# Muskets could regularly penetrate Plate Armor"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("438m/s")
                      )
                    ),
                    Core.vx_new_string("18mm Musket"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("18mm Musket"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Brown Bess was used in the era of the expansion of the British Empire.  It was used for a hundred years with\nincremental changes in its design."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("# Effective Range 60m\n# Muskets could regularly penetrate Plate Armor"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Brown Bess"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("320m/s")
                      )
                    ),
                    Core.vx_new_string("20mm Blunderbuss"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("20mm Blunderbuss"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("A blunderbuss is a muzzle-loading firearm with a flared, trumpet-like barrel and is the predecessor to the\nshotgun.  Most of these weapons are mid-sized, being smaller than most shoulder-fired arms, but larger than a\npistol.  The muzzle was flared not to increase the spread of the shot, but rather to funnel powder and shot into\nthe weapon, making it easier to reload on horseback or on a moving carriage."),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("225m/s")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Age of Sail Cannons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Cannons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Chainshot"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chainshot"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/Cannon_Chainshot.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Does no damage.  All [Hits] are [Disabled Tokens].  All [Critical Hits] are [Crippled Tokens].")
                      )
                    ),
                    Core.vx_new_string(":Grapeshot"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Grapeshot"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/Cannon_Grapeshot.jpg")
                      )
                    ),
                    Core.vx_new_string("Round shot"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Round shot"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/Cannon_Roundshot.jpg")
                      )
                    ),
                    Core.vx_new_string("140mm Field Culverin"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("140mm Field Culverin"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/Culverin.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("600,000J"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("4.5m"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("2.2tons"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("400m/s"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("450m")
                      )
                    ),
                    Core.vx_new_string("100mm Demi-culverin"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("100mm Demi-culverin"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/Demi-culverin.jpg"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("3.4m"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1.5tons"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("487m/s"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("300m"),
                        Core.vx_new_string(":rof"),
                        Core.vx_new_string(".75/min")
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
   * @function chapter_american_revolution
   * @return {chapter}
   * (func chapter_american_revolution)
   */
  public static interface Func_chapter_american_revolution extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_american_revolution();
  }

  public static class Class_chapter_american_revolution extends Core.Class_base implements Func_chapter_american_revolution {

    @Override
    public Func_chapter_american_revolution vx_new(Object... vals) {
      Class_chapter_american_revolution output = new Class_chapter_american_revolution();
      return output;
    }

    @Override
    public Func_chapter_american_revolution vx_copy(Object... vals) {
      Class_chapter_american_revolution output = new Class_chapter_american_revolution();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_sail", // pkgname
        "chapter_american_revolution", // name
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
    public Func_chapter_american_revolution vx_empty() {return e_chapter_american_revolution;}
    @Override
    public Func_chapter_american_revolution vx_type() {return t_chapter_american_revolution;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_sail.f_chapter_american_revolution();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_american_revolution() {
      return Age_of_sail.f_chapter_american_revolution();
    }

  }

  public static final Func_chapter_american_revolution e_chapter_american_revolution = new Age_of_sail.Class_chapter_american_revolution();
  public static final Func_chapter_american_revolution t_chapter_american_revolution = new Age_of_sail.Class_chapter_american_revolution();

  public static Base.Type_chapter f_chapter_american_revolution() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("American Revolution"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Age of Sail United States"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail United States"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("American Frigate"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("American Frigate"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/AmericanFrigate.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("USS Constitution, Old Ironsides"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("24kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Naval Vessel"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("2200tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("62m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("21 inches (530 mm/88mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("88mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("88mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("88mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Gunnery"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gunnery"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("30 x 24-pounder (11 kg) long gun\n20 x 32-pounder (15 kg) carronade\n2 x 24-pounder (11 kg) bow chasers"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Salvo"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Salvo")
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
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_french_revolution
   * @return {chapter}
   * (func chapter_french_revolution)
   */
  public static interface Func_chapter_french_revolution extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_french_revolution();
  }

  public static class Class_chapter_french_revolution extends Core.Class_base implements Func_chapter_french_revolution {

    @Override
    public Func_chapter_french_revolution vx_new(Object... vals) {
      Class_chapter_french_revolution output = new Class_chapter_french_revolution();
      return output;
    }

    @Override
    public Func_chapter_french_revolution vx_copy(Object... vals) {
      Class_chapter_french_revolution output = new Class_chapter_french_revolution();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_sail", // pkgname
        "chapter_french_revolution", // name
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
    public Func_chapter_french_revolution vx_empty() {return e_chapter_french_revolution;}
    @Override
    public Func_chapter_french_revolution vx_type() {return t_chapter_french_revolution;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_sail.f_chapter_french_revolution();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_french_revolution() {
      return Age_of_sail.f_chapter_french_revolution();
    }

  }

  public static final Func_chapter_french_revolution e_chapter_french_revolution = new Age_of_sail.Class_chapter_french_revolution();
  public static final Func_chapter_french_revolution t_chapter_french_revolution = new Age_of_sail.Class_chapter_french_revolution();

  public static Base.Type_chapter f_chapter_french_revolution() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("French Revolution")
      )
    );
    return output;
  }

  /**
   * @function chapter_golden_age_of_sail
   * @return {chapter}
   * (func chapter_golden_age_of_sail)
   */
  public static interface Func_chapter_golden_age_of_sail extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_golden_age_of_sail();
  }

  public static class Class_chapter_golden_age_of_sail extends Core.Class_base implements Func_chapter_golden_age_of_sail {

    @Override
    public Func_chapter_golden_age_of_sail vx_new(Object... vals) {
      Class_chapter_golden_age_of_sail output = new Class_chapter_golden_age_of_sail();
      return output;
    }

    @Override
    public Func_chapter_golden_age_of_sail vx_copy(Object... vals) {
      Class_chapter_golden_age_of_sail output = new Class_chapter_golden_age_of_sail();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_sail", // pkgname
        "chapter_golden_age_of_sail", // name
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
    public Func_chapter_golden_age_of_sail vx_empty() {return e_chapter_golden_age_of_sail;}
    @Override
    public Func_chapter_golden_age_of_sail vx_type() {return t_chapter_golden_age_of_sail;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_sail.f_chapter_golden_age_of_sail();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_golden_age_of_sail() {
      return Age_of_sail.f_chapter_golden_age_of_sail();
    }

  }

  public static final Func_chapter_golden_age_of_sail e_chapter_golden_age_of_sail = new Age_of_sail.Class_chapter_golden_age_of_sail();
  public static final Func_chapter_golden_age_of_sail t_chapter_golden_age_of_sail = new Age_of_sail.Class_chapter_golden_age_of_sail();

  public static Base.Type_chapter f_chapter_golden_age_of_sail() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Golden Age of Sail"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Age of Sail Scenarios"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Scenarios"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Pirates"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pirates")
                      )
                    ),
                    Core.vx_new_string(":Swashbucklers"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Swashbucklers")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Age of Sail Dutch"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Dutch")
              )
            ),
            Core.vx_new_string("Age of Sail British"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail British"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("British Musketeers"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("British Musketeers"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/British_Musketeers.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Musket Infantry"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Firearms"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firearms"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("18mm Musket"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("18mm Musket")
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
                    Core.vx_new_string("British Caravel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("British Caravel"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/BritishCaravel.png"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("15kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("20"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("150tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("25m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("9m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("British Frigate"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("British Frigate"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/BritishFrigate.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("A warship second only in size to the Ship-of-the-Line.  Frigates were three-masted with a raised forecastle\nand quarterdeck.  They had anywhere from 24 to 38 guns on her deck.  They were faster than the\nship-of-the-lines and were used for escort purposes.  They were sometimes used to hunt pirates.  Only a few\npirates were ever in command of a frigate as most pirates would flee from a frigate."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("20kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("14 inches (360 mm/60mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("60mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("British Man-O-War"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("British Man-O-War"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/BritishManOWar.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Naval Vessel"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1000tons"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("14 inches (360 mm/60mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("60mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("British Schooner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("British Schooner"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/BritishSchooner.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("80tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("18m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("6m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("British Racing Galleon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("British Racing Galleon"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Naval Vessel"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
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
            Core.vx_new_string("East India Company"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("East India Company")
              )
            ),
            Core.vx_new_string(":French"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("French"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Napoleon Bonaparte"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Napoleon Bonaparte"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/French_Napoleon.png")
                      )
                    ),
                    Core.vx_new_string("French Musketeers"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("French Musketeers"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/French_Musketeers.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Musket Infantry"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Firearms"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firearms"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("18mm Musket"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("18mm Musket")
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
                    Core.vx_new_string("French Carabiners"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("French Carabiners"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Light Cavalry carrying short Carbine rifles"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Firearms"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firearms"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("12mm Carbine"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("12mm Carbine")
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
                    Core.vx_new_string("French Dragoons"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("French Dragoons"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/French_Dragoons.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Musket Cavalry intending to ride into battle and dismount to fire."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Firearms"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firearms"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("18mm Musket"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("18mm Musket")
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
                    Core.vx_new_string("French Man-O-War"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("French Man-O-War"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("These ships were the heavy-guns of the fleet.  They resembled galleons in design, but had heavy fire-power.\nOnly the three major sea-powers of the time (Spain, England, and France) had many of these kind of ships."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Naval Vessel"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1000tons"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("14 inches (360 mm/60mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("60mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("French Schooner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("French Schooner"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/FrenchSchooner.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("80tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("18m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("6m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
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
            Core.vx_new_string(":Pirates"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Pirates"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("The era of piracy in the Caribbean Sea began in the 17th century and died out in\nthe 1720s after the navies of the nations of Western Europe with colonies in the\nCaribbean began combating pirates."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Pirate Crew"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pirate Crew"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/Pirate_Crew.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Boarding Party"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Boarding Party")
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
                    Core.vx_new_string("Pirate Caravel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pirate Caravel"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/PirateCaravel.png"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("15kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("20"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("150tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("25m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("9m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Pirate Schooner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pirate Schooner"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/PirateSchooner.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Schooner has a narrow hull, two masts and is less than 100 tons.  She is generally rigged with two large\nsails.  She had a shallow draft which allowed her to remain in shallow coves waiting for her prey.  The\nSchooner is very fast and large enough to carry a plentiful crew.  It was a favorite among both pirates and\nsmugglers."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("80tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("18m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("6m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Pirate Sloop"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pirate Sloop"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Sloop was fast, agile, and had a shallow draft.\nToday's sailing Yacht is essentially a sloop."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Naval Vessel"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("100tons"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Pirate Brigantine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pirate Brigantine"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The brigantine was a small ship carrying both sails and oars.  It was a favorite of Mediterranean pirates\nfrom whence it got its name Brigantine meaning Brigand Ship.  Later the ship referred to a two-masted sailing\nship with much greater sailing power."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
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
            Core.vx_new_string("Age of Sail Portuguese"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Portuguese"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Portuguese Caravel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Portuguese Caravel"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Nina was actually named the Santa Clara.  Nina was a pun on its owner's name: Juan Nino."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Nina, Pinta"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("15kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("20"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("150tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("25m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("9m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Portuguese Carrack"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Portuguese Carrack"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("All of Columbus' ships were second-hand (if not third or more) and were never meant for exploration."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Santa Maria"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("10kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("40"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("300tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("25m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
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
            Core.vx_new_string("Age of Sail Spanish"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Spanish"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Silver Train"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Silver Train")
                      )
                    ),
                    Core.vx_new_string("Treasure Fleet"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Treasure Fleet"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Naval Vessel")
                      )
                    ),
                    Core.vx_new_string("Spanish Caravel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spanish Caravel"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/SpanishCaravel.png"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("15kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("20"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("150tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("25m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("9m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7 inches (180 mm/30mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("30mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("30mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Spanish Galleon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spanish Galleon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/SpanishGalleon.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Large ships meant for transporting cargo.  The Spanish treasure fleets were made of these ships.  Although\nthey were sluggish, they weren't the easy target you would expect for they could carry heavy cannon which\nmade attacking them difficult.  They had two to three decks.  Most had three masts.  Some galleons sported 4\nmasts but these were an exception to the rule."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Naval Vessel"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("14 inches (360 mm/60mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("60mm")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Spanish Man-O-War"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spanish Man-O-War"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/SpanishManOWar.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Naval Vessel"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1000tons"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("14 inches (360 mm/60mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("60mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("60mm")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Spanish Schooner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spanish Schooner"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AgeOfSail/SpanishSchooner.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Naval Vessel"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("80tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("18m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("6m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Seamanship"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seamanship"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
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
   * @function chapter_renaissance
   * @return {chapter}
   * (func chapter_renaissance)
   */
  public static interface Func_chapter_renaissance extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_renaissance();
  }

  public static class Class_chapter_renaissance extends Core.Class_base implements Func_chapter_renaissance {

    @Override
    public Func_chapter_renaissance vx_new(Object... vals) {
      Class_chapter_renaissance output = new Class_chapter_renaissance();
      return output;
    }

    @Override
    public Func_chapter_renaissance vx_copy(Object... vals) {
      Class_chapter_renaissance output = new Class_chapter_renaissance();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_sail", // pkgname
        "chapter_renaissance", // name
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
    public Func_chapter_renaissance vx_empty() {return e_chapter_renaissance;}
    @Override
    public Func_chapter_renaissance vx_type() {return t_chapter_renaissance;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_sail.f_chapter_renaissance();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_renaissance() {
      return Age_of_sail.f_chapter_renaissance();
    }

  }

  public static final Func_chapter_renaissance e_chapter_renaissance = new Age_of_sail.Class_chapter_renaissance();
  public static final Func_chapter_renaissance t_chapter_renaissance = new Age_of_sail.Class_chapter_renaissance();

  public static Base.Type_chapter f_chapter_renaissance() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Renaissance")
      )
    );
    return output;
  }

  /**
   * @function chapter_tokugawa_shogunate
   * @return {chapter}
   * (func chapter_tokugawa_shogunate)
   */
  public static interface Func_chapter_tokugawa_shogunate extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_tokugawa_shogunate();
  }

  public static class Class_chapter_tokugawa_shogunate extends Core.Class_base implements Func_chapter_tokugawa_shogunate {

    @Override
    public Func_chapter_tokugawa_shogunate vx_new(Object... vals) {
      Class_chapter_tokugawa_shogunate output = new Class_chapter_tokugawa_shogunate();
      return output;
    }

    @Override
    public Func_chapter_tokugawa_shogunate vx_copy(Object... vals) {
      Class_chapter_tokugawa_shogunate output = new Class_chapter_tokugawa_shogunate();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_sail", // pkgname
        "chapter_tokugawa_shogunate", // name
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
    public Func_chapter_tokugawa_shogunate vx_empty() {return e_chapter_tokugawa_shogunate;}
    @Override
    public Func_chapter_tokugawa_shogunate vx_type() {return t_chapter_tokugawa_shogunate;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_sail.f_chapter_tokugawa_shogunate();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_tokugawa_shogunate() {
      return Age_of_sail.f_chapter_tokugawa_shogunate();
    }

  }

  public static final Func_chapter_tokugawa_shogunate e_chapter_tokugawa_shogunate = new Age_of_sail.Class_chapter_tokugawa_shogunate();
  public static final Func_chapter_tokugawa_shogunate t_chapter_tokugawa_shogunate = new Age_of_sail.Class_chapter_tokugawa_shogunate();

  public static Base.Type_chapter f_chapter_tokugawa_shogunate() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Tokugawa Shogunate"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Tokugawa Prefecture"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Tokugawa Prefecture"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Tokugawa Town"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tokugawa Town"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Daimyo chose to place his castle near a moderately-sized villiage.  He wanted the advantage of a town\nwithout having more people than could be kept track of.  The Daimyo's presense has brought an influx of trade, and\nthe town is surprisingly wealthy.\n* There is a cooper, a brewer, a courtesan house, an inn, a silk-maker, a woodworker, 2 woodcutters, 15 merchants,\n20 fishermen, over 100 farmers, and about 15 vagrants.\n* There are 2 police officers and many of the townspeople are in the reserve.\n* In addition, the Daimyo personally supports 25 samurai, a swordsmith, an armorer, a fletcher, 2 carpenters, 2\nadvisors, a scupltor, a jeweler, 2 fine weavers, 2 painters, 2 scribes, and a mistress.")
                      )
                    ),
                    Core.vx_new_string("Buddhist Temple"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Buddhist Temple"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A temple was established in the area long before the Daimyo located himself in the area.  The temple remains a\nsignificant political power, and with their Sohei and Budoka, they could be more than an annoyance to the Daimyo.\n* Besides the master, there are 4 senior priests (Gakusho) and 20 monks (12 Gakusho and 8 Budoka).  There are also\n5 Sohei that act as guards and trainers.  The temple is supported by donations and tithes.\n* Martial training is only allowed as it pertains to self-awareness.  Fighting people is a sin unless in the\nprotection of others.  Training has been a point of contention with the Daimyo, but the issue has died down.")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Daimyo"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Daimyo"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A gruff, no nonsense samurai.  He craved the power and pretige of this position, but now finds that life as a\nDaimyo is sheltered and dull.\n* He is convinced that there is a plot to take his life, though there is no evidence to support this.  He seems to\nenjoy the challenge of defending himself against this threat.  He does fear dying dishonorably.  For this reason,\nhe has his food rigorously tested and his bedchambers inordinately guarded.  He tries to leave himself more open to\na direct attack, so he is often poorly guarded when he is armed.\n* The Daimyo feels intellectually challenged by both the Temple Master and the Castellan.  He has become\nincreasingly interested in these mind games, and a good challenge is a sure way to the Daimyo's good favor."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Kenji Ginichi")
                      )
                    ),
                    Core.vx_new_string("Daimyo's Wife"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Daimyo's Wife"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Efficient, beautiful, and totally unimportant.  The Daimyo is not interested in her at all.  She is only a baby\nmachine to him (and not a very good one).  She does not aspire to higher station and is quite content with her\ncircle of friends from the villiage who visit often.")
                      )
                    ),
                    Core.vx_new_string("Daimyo's Son"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Daimyo's Son"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A bored an somewhat obnoxious teenager.  He revels in the past exploits of his illustrious father and is horrified\nby the inactive positon he is in now (a feeling shared by the Daimyo).  The idea of being a Daimyo (or a court\nsamural makes him ill.  He wants to be an adventurer or a a ronin.  He has studied with the samurai and budoka, but\nhe lacks incentive and discipline.  His most accomplished skill is distracting his guards so he can slip away.")
                      )
                    ),
                    Core.vx_new_string(":Castellan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Castellan"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A classic samurai, dedicated and loyal.  His main duties are to keep the province running, but more importantly he\nmust protect the Daimyo and his family.  This last task has proven very difficult.  The Daimyo and his son have\nproven very difficult to defend.  The Daimyo constantly reduces his guards, and his son tries to escape them.  The\ncastellan may not disobey the Daimyo, but he has prepared a long list of ways to manipulate the Daimyo into safer\ncourses of action.  When unable to control the Daimyo, he will send troops 'on patrol' in the Daimyo's area.  He\nwill delay or harry the Daimyo to make his movements less predictable.  The Daimyo is aware of these machinations\nand enjoys outsmarting the castellan wherever possible.  So far, the castellan is easily winning this battle of\nwits.")
                      )
                    ),
                    Core.vx_new_string("Temple Master"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temple Master"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The temple master is a man of great diplomatic skill, and the Daimyo has found himself outmatched in all but\nmilitary issues.  The Daimyo often does not grant the master an audience until he has brushed up on the matter at\nhand.")
                      )
                    ),
                    Core.vx_new_string(":Oyabun"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oyabun"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The head of the local Yakuza sees that the Daimyo is acting rather recklessly and is plotting an elaborate and\nsubtle scheme to take advantage of the situation.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Age of Sail Japan"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Japan"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Japanese Archer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Japanese Archer")
                      )
                    ),
                    Core.vx_new_string("Japanese Daimyo"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Japanese Daimyo")
                      )
                    ),
                    Core.vx_new_string("Japanese Emperor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Japanese Emperor")
                      )
                    ),
                    Core.vx_new_string("Japanese Rifleman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Japanese Rifleman")
                      )
                    ),
                    Core.vx_new_string("Japnese Samurai"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Japnese Samurai")
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
        "nx/tactics/books/age_of_sail", // pkgname
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
      output = Age_of_sail.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Age_of_sail.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Age_of_sail.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Age_of_sail.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Age Of Sail"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Age of Sail Overview"),
            Age_of_sail.f_chapter_age_of_sail_overview(),
            Core.vx_new_string("Age of Sail Weaponry"),
            Age_of_sail.f_chapter_age_of_sail_weaponry(),
            Core.vx_new_string("Renaissance"),
            Age_of_sail.f_chapter_renaissance(),
            Core.vx_new_string("Golden Age of Sail"),
            Age_of_sail.f_chapter_golden_age_of_sail(),
            Core.vx_new_string("American Revolution"),
            Age_of_sail.f_chapter_american_revolution(),
            Core.vx_new_string("French Revolution"),
            Age_of_sail.f_chapter_french_revolution(),
            Core.vx_new_string("Tokugawa Shogunate"),
            Age_of_sail.f_chapter_tokugawa_shogunate()
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
    mapfunc.put("chapter_age_of_sail_overview", Age_of_sail.t_chapter_age_of_sail_overview);
    mapfunc.put("chapter_age_of_sail_weaponry", Age_of_sail.t_chapter_age_of_sail_weaponry);
    mapfunc.put("chapter_american_revolution", Age_of_sail.t_chapter_american_revolution);
    mapfunc.put("chapter_french_revolution", Age_of_sail.t_chapter_french_revolution);
    mapfunc.put("chapter_golden_age_of_sail", Age_of_sail.t_chapter_golden_age_of_sail);
    mapfunc.put("chapter_renaissance", Age_of_sail.t_chapter_renaissance);
    mapfunc.put("chapter_tokugawa_shogunate", Age_of_sail.t_chapter_tokugawa_shogunate);
    mapfunc.put("tacticsbook", Age_of_sail.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/age_of_sail", maptype, mapconst, mapfunc);
  }

}
