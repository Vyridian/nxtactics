package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Modern {

  /**
   * @function chapter_cold_war
   * @return {chapter}
   * (func chapter_cold_war)
   */
  public static interface Func_chapter_cold_war extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_cold_war();
  }

  public static class Class_chapter_cold_war extends Core.Class_base implements Func_chapter_cold_war {

    @Override
    public Func_chapter_cold_war vx_new(Object... vals) {
      Class_chapter_cold_war output = new Class_chapter_cold_war();
      return output;
    }

    @Override
    public Func_chapter_cold_war vx_copy(Object... vals) {
      Class_chapter_cold_war output = new Class_chapter_cold_war();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_cold_war", // name
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
    public Func_chapter_cold_war vx_empty() {return e_chapter_cold_war;}
    @Override
    public Func_chapter_cold_war vx_type() {return t_chapter_cold_war;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_cold_war();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_cold_war() {
      return Modern.f_chapter_cold_war();
    }

  }

  public static final Func_chapter_cold_war e_chapter_cold_war = new Modern.Class_chapter_cold_war();
  public static final Func_chapter_cold_war t_chapter_cold_war = new Modern.Class_chapter_cold_war();

  public static Base.Type_chapter f_chapter_cold_war() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Cold War"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("American Aircraft"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("American Aircraft"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("A-10 Warthog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("A-10 Warthog"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Aircraft"),
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
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("30mm GAU-8 Avenger"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("30mm GAU-8 Avenger")
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
                    Core.vx_new_string("AH-1 Cobra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("AH-1 Cobra"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/American_Helicopter_Cobra.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("2x 7.62mm Miniguns\n2x 7-round 70mm Rocket Pods\n20mm XM195 Vulcan Cannon"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("350kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Aircraft"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("4tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("4m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("13m"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("570km")
                      )
                    ),
                    Core.vx_new_string("Candy Bomber"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Candy Bomber"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Aircraft")
                      )
                    ),
                    Core.vx_new_string("UH-1 Iroquois (Huey)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UH-1 Iroquois (Huey)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/American_Helicopter_Huey.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("2x 7.62mm M60 Machine Gun\n2x 7-round 70mm Rocket Pods"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("200kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Aircraft"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+14"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("4tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("4m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("17m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("3m")
                      )
                    ),
                    Core.vx_new_string("SR-71 Blackbird"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("SR-71 Blackbird"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/American_SpyPlane_SR71Blackbird.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Aircraft")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("American Ground Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("American Ground Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("M46 Patton"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("M46 Patton"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An improved Pershing sometimes called Pershing II, was used extensively in Korean War.\n* 90mm Cannon"),
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
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("M48 Patton"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("M48 Patton"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A completely redesigned Pershing based Vietnam Era Tank\n4 Gunnery\n105mm Cannon\nArmor\n120mm\n.50 cal MG\n7.62mm MG"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("50tons"),
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
            Core.vx_new_string("American Missles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("American Missles"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":ICBM"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("ICBM")
                      )
                    ),
                    Core.vx_new_string("Polaris Submarine Missile"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Polaris Submarine Missile")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("British Ground Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("British Ground Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("QF 20 Pounder"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("QF 20 Pounder")
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
   * @function chapter_modern_cops_and_robbers
   * @return {chapter}
   * (func chapter_modern_cops_and_robbers)
   */
  public static interface Func_chapter_modern_cops_and_robbers extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_cops_and_robbers();
  }

  public static class Class_chapter_modern_cops_and_robbers extends Core.Class_base implements Func_chapter_modern_cops_and_robbers {

    @Override
    public Func_chapter_modern_cops_and_robbers vx_new(Object... vals) {
      Class_chapter_modern_cops_and_robbers output = new Class_chapter_modern_cops_and_robbers();
      return output;
    }

    @Override
    public Func_chapter_modern_cops_and_robbers vx_copy(Object... vals) {
      Class_chapter_modern_cops_and_robbers output = new Class_chapter_modern_cops_and_robbers();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_modern_cops_and_robbers", // name
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
    public Func_chapter_modern_cops_and_robbers vx_empty() {return e_chapter_modern_cops_and_robbers;}
    @Override
    public Func_chapter_modern_cops_and_robbers vx_type() {return t_chapter_modern_cops_and_robbers;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_modern_cops_and_robbers();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_cops_and_robbers() {
      return Modern.f_chapter_modern_cops_and_robbers();
    }

  }

  public static final Func_chapter_modern_cops_and_robbers e_chapter_modern_cops_and_robbers = new Modern.Class_chapter_modern_cops_and_robbers();
  public static final Func_chapter_modern_cops_and_robbers t_chapter_modern_cops_and_robbers = new Modern.Class_chapter_modern_cops_and_robbers();

  public static Base.Type_chapter f_chapter_modern_cops_and_robbers() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Cops and Robbers"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Modern Government"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Government"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Administrator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Administrator")
                      )
                    ),
                    Core.vx_new_string("ATF Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("ATF Agent")
                      )
                    ),
                    Core.vx_new_string(":Congressman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Congressman")
                      )
                    ),
                    Core.vx_new_string("DEA Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("DEA Agent")
                      )
                    ),
                    Core.vx_new_string(":Diplomat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Diplomat"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Communications"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Communications"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Negotiation"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Negotiation")
                                      )
                                    ),
                                    Core.vx_new_string(":Politics"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Politics")
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
                    Core.vx_new_string("FBI Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("FBI Agent")
                      )
                    ),
                    Core.vx_new_string(":Monarch"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Monarch")
                      )
                    ),
                    Core.vx_new_string(":Noble"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Noble"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Influence"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Influence")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Senator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Senator")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Police"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Police"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Police Officer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Police Officer"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Beat Cop, Pig (derogatory), Thin Blue Line")
                      )
                    ),
                    Core.vx_new_string(":Detective"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Detective")
                      )
                    ),
                    Core.vx_new_string("Forensics Investigator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Forensics Investigator")
                      )
                    ),
                    Core.vx_new_string("Internal Affair Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Internal Affair Agent")
                      )
                    ),
                    Core.vx_new_string(":S.W.A.T."),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("S.W.A.T.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Criminals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Criminals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Armed Robber"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Armed Robber")
                      )
                    ),
                    Core.vx_new_string(":Informant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Informant")
                      )
                    ),
                    Core.vx_new_string("Purse Snatcher"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Purse Snatcher")
                      )
                    ),
                    Core.vx_new_string("Serial Killer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Serial Killer")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Crime Gangs"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Crime Gangs"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Mafia"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mafia")
                      )
                    ),
                    Core.vx_new_string("Tong Gangs"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tong Gangs"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Tongs are local street gangs.")
                      )
                    ),
                    Core.vx_new_string(":Triads"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Triads"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The Triads are like the [Yakuza] offering protection to the locals.  This protection normally comes in the form of crushing the competition on the triad's businesses.  Unlike the [Yakuza], the triads deal in slavery and are more open in their illegal dealings.  Enforcement is very brutal.")
                      )
                    ),
                    Core.vx_new_string(":Yakuza"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Yakuza"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Besides weapons and drugs, the Yakuza are the neighborhood protection in many areas and do so far more efficiently than the police. Contrary to the attitudes protrayed in Hollywood, the Yakuza make justice swift and fair for the people they deal with. It has done this way for longer than the United States has been around. The Yakuza is not about random violence and mayhem. It is about order and discipline. Of course, many of the younger members have cast aside traditions and have become violent thugs. Like the Triads, the Yakuza was originally a response to the feudal lords when those who were not samurai had no rights or safety.")
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
   * @function chapter_modern_ground_vehicles
   * @return {chapter}
   * (func chapter_modern_ground_vehicles)
   */
  public static interface Func_chapter_modern_ground_vehicles extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_ground_vehicles();
  }

  public static class Class_chapter_modern_ground_vehicles extends Core.Class_base implements Func_chapter_modern_ground_vehicles {

    @Override
    public Func_chapter_modern_ground_vehicles vx_new(Object... vals) {
      Class_chapter_modern_ground_vehicles output = new Class_chapter_modern_ground_vehicles();
      return output;
    }

    @Override
    public Func_chapter_modern_ground_vehicles vx_copy(Object... vals) {
      Class_chapter_modern_ground_vehicles output = new Class_chapter_modern_ground_vehicles();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_modern_ground_vehicles", // name
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
    public Func_chapter_modern_ground_vehicles vx_empty() {return e_chapter_modern_ground_vehicles;}
    @Override
    public Func_chapter_modern_ground_vehicles vx_type() {return t_chapter_modern_ground_vehicles;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_modern_ground_vehicles();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_ground_vehicles() {
      return Modern.f_chapter_modern_ground_vehicles();
    }

  }

  public static final Func_chapter_modern_ground_vehicles e_chapter_modern_ground_vehicles = new Modern.Class_chapter_modern_ground_vehicles();
  public static final Func_chapter_modern_ground_vehicles t_chapter_modern_ground_vehicles = new Modern.Class_chapter_modern_ground_vehicles();

  public static Base.Type_chapter f_chapter_modern_ground_vehicles() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Ground Vehicles"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Modern Cycles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Cycles")
              )
            ),
            Core.vx_new_string("Modern Cars"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Cars"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Compact"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Compact"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Civilian_Compact.png")
                      )
                    ),
                    Core.vx_new_string("Luxury Sedan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Luxury Sedan")
                      )
                    ),
                    Core.vx_new_string(":Minivan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Minivan"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Civilian_Minivan.png")
                      )
                    ),
                    Core.vx_new_string(":Sedan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sedan"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Civilian_Sedan.png")
                      )
                    ),
                    Core.vx_new_string("Sports Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sports Car"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Civilian_SportsCar.png")
                      )
                    ),
                    Core.vx_new_string(":Subcompact"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Subcompact"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Econobox")
                      )
                    ),
                    Core.vx_new_string("Station Wagon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Station Wagon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Civilian_StationWagon.png")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Trucks"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Trucks"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Armored Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Armored Car"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* RWD. 200 hp engine [20], 20 gallon tank [4], driver, gunner, SR 6, TS 80, AC 4 (max 8), 16 mpg @65.\nFP Armor: F30, L30, R30, B30, T30, U20. Cargo 200 cf. Max load 2000 lb. $70,000, 8500 lb.")
                      )
                    ),
                    Core.vx_new_string(":HummVee"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("HummVee")
                      )
                    ),
                    Core.vx_new_string(":Jeep"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jeep")
                      )
                    ),
                    Core.vx_new_string("Land Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Land Cruiser")
                      )
                    ),
                    Core.vx_new_string("Pickup Truck"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pickup Truck"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Civilian_PickupTruck.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Same as Sport Utility except: two to three passengers. Cargo 160 cf. Max load 1000-3000 lb. $20,000 3300 lb.")
                      )
                    ),
                    Core.vx_new_string("Sport Utility"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sport Utility"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Civilian_SUV.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* RWD or AWD with around 180 hp, two- or four-door with two to eight passengers.  SR 6, TS 110, AC 6 (max 10), 18 mpg@65. Cargo 20-70 cf. Max load 500-1000 lb. $30,000 3500 lb.")
                      )
                    ),
                    Core.vx_new_string(":Van"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Van")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Heavy Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Heavy Vehicles"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("150% Cost, 150% Load, 75% Speed, -1 Handling"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bus"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("School Bus")
                      )
                    ),
                    Core.vx_new_string("Bus, Luxury"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bus, Luxury"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Charter Bus")
                      )
                    ),
                    Core.vx_new_string(":Backhoe"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Backhoe")
                      )
                    ),
                    Core.vx_new_string("Bobcat Loader"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bobcat Loader")
                      )
                    ),
                    Core.vx_new_string(":Bulldozer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bulldozer")
                      )
                    ),
                    Core.vx_new_string(":Camper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Camper")
                      )
                    ),
                    Core.vx_new_string("Cargo Truck"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cargo Truck")
                      )
                    ),
                    Core.vx_new_string("Construction Crane"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Construction Crane")
                      )
                    ),
                    Core.vx_new_string("Dump Truck"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dump Truck")
                      )
                    ),
                    Core.vx_new_string("Garbage Truck"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Garbage Truck")
                      )
                    ),
                    Core.vx_new_string("Giant Dump Truck"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Dump Truck")
                      )
                    ),
                    Core.vx_new_string("Giant Shovel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Shovel")
                      )
                    ),
                    Core.vx_new_string("Recreational Vehicle (RV)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Recreational Vehicle (RV)")
                      )
                    ),
                    Core.vx_new_string("Tractor Trailer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tractor Trailer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 200 gallon tank, driver, 2 passengers. SR 5.75, TS 125, AC 3 (max 6), 12 mpg@65. No Armor.\nCargo 5000 cf. Max load 30 tons. $300,000, 10 tons.  Tractor trailers use two overlapping vehicle counters.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Police Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Police Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Police Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Police Cruiser")
                      )
                    ),
                    Core.vx_new_string("SWAT Truck"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("SWAT Truck")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Military Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Military Vehicles"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Amphibious Vehicles\n* Artillery\n** Light Tank\n** Heavy Tank\n*** Tracked. 2000 hp supercharged engine [70], 120 gallon self-sealing armored tank [20], driver, commander, 2 gunners, 120 mm tank gun [15] in turret (50), MG50 [4] in turret (50), SS [3] front and back (5|5), targeting computer. SR 2, TS 50, AC 3 (max 20), 1 mpg@50. Military-grade Armor: F500, L350, R350, B300, T140, U170. Cargo 10 cf. Max load 4000 lb. $5 million, 40 tons. Each tread has 80 hits. The 120 mm cannon does 25d +\n30 damage, and has a to-hit of 13, but requires one round to reload.\n* Hovertank"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Armored Personal Carrier (APC)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Armored Personal Carrier (APC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wheeled. 500 hp engine, 60 gallon selfsealing tank, driver, gunner, MG50 also in turret (50), SS [3] back (5),\nSR 2, TS 50, AC 3 (max 20), 3 mpg@50. Militarygrade Armor: F100, L80, R80, B70, T40, U50.  Cargo 10 soldiers with\nfull gear.  Max load 2000 lb. $250,000, 10 tons.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Trailers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Trailers")
              )
            ),
            Core.vx_new_string("Modern Hovercraft"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Hovercraft")
              )
            ),
            Core.vx_new_string("Modern Trains"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Trains"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* 150% Cost, 200% Load\n* With a maximum AC of less than one and silly amounts of weight, a train does not stop for anything.  When a\nsteadily moving train collides with a vehicle it does as much damage as the vehicle can take: even a tank would be\ncompletely shattered if a train struck it.  A train is very hard to destroy, also... it would derail before\nactually turning into rubble."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Armored Boxcar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Armored Boxcar")
                      )
                    ),
                    Core.vx_new_string("Automobile Cargo Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Automobile Cargo Car")
                      )
                    ),
                    Core.vx_new_string(":Boxcar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boxcar")
                      )
                    ),
                    Core.vx_new_string(":Caboose"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Caboose")
                      )
                    ),
                    Core.vx_new_string("Dining Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dining Car")
                      )
                    ),
                    Core.vx_new_string("Flatbed Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flatbed Car")
                      )
                    ),
                    Core.vx_new_string("Hand Cart"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hand Cart")
                      )
                    ),
                    Core.vx_new_string(":Locomotive"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Locomotive")
                      )
                    ),
                    Core.vx_new_string(":Monorail"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Monorail")
                      )
                    ),
                    Core.vx_new_string("Passenger Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Passenger Car")
                      )
                    ),
                    Core.vx_new_string("Sleeping Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sleeping Car")
                      )
                    ),
                    Core.vx_new_string(":Streetcar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Streetcar")
                      )
                    ),
                    Core.vx_new_string("Tanker Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tanker Car")
                      )
                    ),
                    Core.vx_new_string(":Tram"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tram")
                      )
                    ),
                    Core.vx_new_string("Weapon Mount Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weapon Mount Car")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Snowcraft"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Snowcraft"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* 75% Load, on Snow no Terrain Penalty and 150% Speed, off Snow +1 Terrain Penalty.\n* Icecraft - On Ice no Terrain Penalty and 200% Speed, off Ice cannot move."),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Iceskates"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iceskates"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Personal, Unpowered, Icecraft")
                      )
                    ),
                    Core.vx_new_string("Ice sailboat"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ice sailboat"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Medium, Sail, Icecraft")
                      )
                    ),
                    Core.vx_new_string(":Skis"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skis"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Personal, Unpowered, Snowcraft")
                      )
                    ),
                    Core.vx_new_string(":Snowboard"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snowboard"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Personal, Unpowered, Snowcraft")
                      )
                    ),
                    Core.vx_new_string(":Snowshoes"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snowshoes"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Personal, Unpowered, Snowcraft")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Dog Sled"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dog Sled"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Unpowered, Offroad, Snowcraft")
                      )
                    ),
                    Core.vx_new_string(":Snowmobile"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snowmobile"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Offroad, Snowcraft")
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
   * @function chapter_modern_mercenaries
   * @return {chapter}
   * (func chapter_modern_mercenaries)
   */
  public static interface Func_chapter_modern_mercenaries extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_mercenaries();
  }

  public static class Class_chapter_modern_mercenaries extends Core.Class_base implements Func_chapter_modern_mercenaries {

    @Override
    public Func_chapter_modern_mercenaries vx_new(Object... vals) {
      Class_chapter_modern_mercenaries output = new Class_chapter_modern_mercenaries();
      return output;
    }

    @Override
    public Func_chapter_modern_mercenaries vx_copy(Object... vals) {
      Class_chapter_modern_mercenaries output = new Class_chapter_modern_mercenaries();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_modern_mercenaries", // name
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
    public Func_chapter_modern_mercenaries vx_empty() {return e_chapter_modern_mercenaries;}
    @Override
    public Func_chapter_modern_mercenaries vx_type() {return t_chapter_modern_mercenaries;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_modern_mercenaries();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_mercenaries() {
      return Modern.f_chapter_modern_mercenaries();
    }

  }

  public static final Func_chapter_modern_mercenaries e_chapter_modern_mercenaries = new Modern.Class_chapter_modern_mercenaries();
  public static final Func_chapter_modern_mercenaries t_chapter_modern_mercenaries = new Modern.Class_chapter_modern_mercenaries();

  public static Base.Type_chapter f_chapter_modern_mercenaries() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Mercenaries"),
        Core.vx_new_string(":reference"),
        Core.vx_new_string("* Blackrock\n* Millenium's End"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("Mercenaries\nSmuggling\nSoldiers of Fortune\nVIP Bodyguards"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Black Eagle Security"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Black Eagle Security"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Black Eagle is a large security firm offering 'specialists for hire'. They maintain a strong reputation for effectiveness, discipline, and discretion. Their fees are high, but they are the gold standard when dealing with critical situations on a moment's notice.\n* Black Eagle is based in Atlanta, Georgia. It maintains branch facilities in Miami, Dubai, the Phillipines, and South Africa.\n* Black Eagle provides contract security teams to guard embassies for major countries. They also can be engaged for\ndeniable covert actions including: smash and grab, target removal, and cyber espianoge.\n* Black Eagle is very careful to maintain deniability in all of its activities. It does not have business cards or\nletter-head or logos. Its personnel are all independent contractors who are always paid by the job, in cash. There is 	always a risk that Black Eagle personnel will be captured, killed, or imprisoned. Black Eagle values loyalty above all\nelse and will go to great lengths to prove itself when its own people get in trouble.\n* The true secret to Black Eagle's success is its information network. The company maintains a large database of 'persons of interest' along with psychological profiles and potential future value. Whenever possible, Black Eagle will trade favors instead of cash. They proactively offer help to key individuals who are in trouble, so they can count on those people for help in the future. Black Eagle has influence among numerous politicians, lobbyists, lawyers, judges, military personnel, police, prison guards, prisoners, criminal informants, as well as numerous ordinary people who serve as their eyes and ears on the street.")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_modern_overview
   * @return {chapter}
   * (func chapter_modern_overview)
   */
  public static interface Func_chapter_modern_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_overview();
  }

  public static class Class_chapter_modern_overview extends Core.Class_base implements Func_chapter_modern_overview {

    @Override
    public Func_chapter_modern_overview vx_new(Object... vals) {
      Class_chapter_modern_overview output = new Class_chapter_modern_overview();
      return output;
    }

    @Override
    public Func_chapter_modern_overview vx_copy(Object... vals) {
      Class_chapter_modern_overview output = new Class_chapter_modern_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_modern_overview", // name
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
    public Func_chapter_modern_overview vx_empty() {return e_chapter_modern_overview;}
    @Override
    public Func_chapter_modern_overview vx_type() {return t_chapter_modern_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_modern_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_overview() {
      return Modern.f_chapter_modern_overview();
    }

  }

  public static final Func_chapter_modern_overview e_chapter_modern_overview = new Modern.Class_chapter_modern_overview();
  public static final Func_chapter_modern_overview t_chapter_modern_overview = new Modern.Class_chapter_modern_overview();

  public static Base.Type_chapter f_chapter_modern_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Modern Naval Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Naval Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Aircraft Carriers\n* Destroyers\n* Cruisers\n* Torpedo Boats\n* Radar\n* Naval Cannons\n* Stealth Fighters\n* Unmanned Naval Vehicles\n* Nuclear Submarines\n* Attack Submarines")
              )
            ),
            Core.vx_new_string("Modern Aerial Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Aerial Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Jet Planes\n* Stealth Fighters\n* Unmanned Aerial Vehicles (UAV)\n* Air Cavalry\n* Flying Fortress\n* Landing Strips\n* Aircraft Carriers\n* Machine Guns\n* Strafing\n* Tank Killing\n* Stealth Bombing\n* Strategic Bombing\n* Nuclear Bombing\n* Cruise Missiles\n* Fuel Air Explosives\n* Intercontinental Ballistic Missiles (ICBM)")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_modern_space
   * @return {chapter}
   * (func chapter_modern_space)
   */
  public static interface Func_chapter_modern_space extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_space();
  }

  public static class Class_chapter_modern_space extends Core.Class_base implements Func_chapter_modern_space {

    @Override
    public Func_chapter_modern_space vx_new(Object... vals) {
      Class_chapter_modern_space output = new Class_chapter_modern_space();
      return output;
    }

    @Override
    public Func_chapter_modern_space vx_copy(Object... vals) {
      Class_chapter_modern_space output = new Class_chapter_modern_space();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_modern_space", // name
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
    public Func_chapter_modern_space vx_empty() {return e_chapter_modern_space;}
    @Override
    public Func_chapter_modern_space vx_type() {return t_chapter_modern_space;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_modern_space();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_space() {
      return Modern.f_chapter_modern_space();
    }

  }

  public static final Func_chapter_modern_space e_chapter_modern_space = new Modern.Class_chapter_modern_space();
  public static final Func_chapter_modern_space t_chapter_modern_space = new Modern.Class_chapter_modern_space();

  public static Base.Type_chapter f_chapter_modern_space() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Space"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Modern Space Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Space Units"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Astronaut"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Astronaut")
                      )
                    ),
                    Core.vx_new_string("International Space Station"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("International Space Station")
                      )
                    ),
                    Core.vx_new_string("Space Shuttle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space Shuttle")
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
   * @function chapter_modern_spies
   * @return {chapter}
   * (func chapter_modern_spies)
   */
  public static interface Func_chapter_modern_spies extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_spies();
  }

  public static class Class_chapter_modern_spies extends Core.Class_base implements Func_chapter_modern_spies {

    @Override
    public Func_chapter_modern_spies vx_new(Object... vals) {
      Class_chapter_modern_spies output = new Class_chapter_modern_spies();
      return output;
    }

    @Override
    public Func_chapter_modern_spies vx_copy(Object... vals) {
      Class_chapter_modern_spies output = new Class_chapter_modern_spies();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_modern_spies", // name
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
    public Func_chapter_modern_spies vx_empty() {return e_chapter_modern_spies;}
    @Override
    public Func_chapter_modern_spies vx_type() {return t_chapter_modern_spies;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_modern_spies();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_spies() {
      return Modern.f_chapter_modern_spies();
    }

  }

  public static final Func_chapter_modern_spies e_chapter_modern_spies = new Modern.Class_chapter_modern_spies();
  public static final Func_chapter_modern_spies t_chapter_modern_spies = new Modern.Class_chapter_modern_spies();

  public static Base.Type_chapter f_chapter_modern_spies() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Spies"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Spy Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Spy Units"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("CIA Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("CIA Agent")
                      )
                    ),
                    Core.vx_new_string("NSA Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("NSA Agent")
                      )
                    ),
                    Core.vx_new_string(":Terrorist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terrorist")
                      )
                    ),
                    Core.vx_new_string("Aaron Jorgenson"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aaron Jorgenson"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wealthy Norwegian shipping magnate with subsidiaries in petroleum products, trucking, and pharmaceuticals.\n* He is an ultra-conservative and has served several terms in public office.\n* He was married and divorced (his wife died of natural causes soon after the divorce).\n* He has no heirs or family.\n* At 56, he is also dying of an inoperable brain tumor.\n* His greatest possessions are his fabulous collection of artwork in his luxurious mansion.\n* Personality - Mr. Jorgenson is an arrogant and selfish man. He is a self-made man and believes that the strong deserve to take what they can and that the weak deserve their lot. He idolizes men of action, especially his Viking ancestors. With only a short time left to live, he has dedicated his fortune to a spectacular plan that would make him a modern day Viking.")
                      )
                    ),
                    Core.vx_new_string("James Bond"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("James Bond"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mr. Bond, you persist in defying my efforts to provide an amusing death for you. - Hugo Drax, Moonraker\n* Do you expect me to talk. No, Mr. Bond. I expect you to die. - Auric Goldfinger and James Bond, Goldfinger"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("007")
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
   * @function chapter_modern_sports
   * @return {chapter}
   * (func chapter_modern_sports)
   */
  public static interface Func_chapter_modern_sports extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_sports();
  }

  public static class Class_chapter_modern_sports extends Core.Class_base implements Func_chapter_modern_sports {

    @Override
    public Func_chapter_modern_sports vx_new(Object... vals) {
      Class_chapter_modern_sports output = new Class_chapter_modern_sports();
      return output;
    }

    @Override
    public Func_chapter_modern_sports vx_copy(Object... vals) {
      Class_chapter_modern_sports output = new Class_chapter_modern_sports();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_modern_sports", // name
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
    public Func_chapter_modern_sports vx_empty() {return e_chapter_modern_sports;}
    @Override
    public Func_chapter_modern_sports vx_type() {return t_chapter_modern_sports;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_modern_sports();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_sports() {
      return Modern.f_chapter_modern_sports();
    }

  }

  public static final Func_chapter_modern_sports e_chapter_modern_sports = new Modern.Class_chapter_modern_sports();
  public static final Func_chapter_modern_sports t_chapter_modern_sports = new Modern.Class_chapter_modern_sports();

  public static Base.Type_chapter f_chapter_modern_sports() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Sports"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Soccer"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Soccer"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Soccer Ball"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Soccer Ball"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Soccer_Ball.png")
                      )
                    ),
                    Core.vx_new_string("Soccer Player (Blue)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Soccer Player (Blue)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Soccer_PlayerBlue.png")
                      )
                    ),
                    Core.vx_new_string("Soccer Player (Red)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Soccer Player (Red)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Soccer_PlayerRed.png")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Soccer Goal"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Soccer Goal"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Units/Modern/Soccer_Goal.png")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Football"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Football"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Football Field"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Football Field"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Units/Modern/Football_Field.jpg")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Linebacker (Blue)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Linebacker (Blue)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Football_LinebackerBlue.png")
                      )
                    ),
                    Core.vx_new_string("Linebacker (Red)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Linebacker (Red)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Football_LinebackerRed.png")
                      )
                    ),
                    Core.vx_new_string("Quarterback (Blue)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quarterback (Blue)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Football_QuarterbackBlue.png")
                      )
                    ),
                    Core.vx_new_string("Quarterback (Red)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quarterback (Red)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Football_QuarterbackRed.png")
                      )
                    ),
                    Core.vx_new_string("Receiver (Blue)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Receiver (Blue)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Football_ReceiverBlue.png")
                      )
                    ),
                    Core.vx_new_string("Receiver (Red)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Receiver (Red)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Football_ReceiverRed.png")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Underground Sports"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Underground Sports"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Pit Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pit Fighter")
                      )
                    ),
                    Core.vx_new_string("Rollerball Player"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rollerball Player")
                      )
                    ),
                    Core.vx_new_string("Street Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Street Fighter")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Other Sports"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Other Sports"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Baseball Player"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Baseball Player")
                      )
                    ),
                    Core.vx_new_string(":Boxer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boxer")
                      )
                    ),
                    Core.vx_new_string("Hockey Player"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hockey Player")
                      )
                    ),
                    Core.vx_new_string("Ping Pong Player"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ping Pong Player")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Scenarios"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Scenarios"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Boxing Match"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boxing Match")
                      )
                    ),
                    Core.vx_new_string("Soccer Game"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Soccer Game")
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
   * @function chapter_modern_warfare
   * @return {chapter}
   * (func chapter_modern_warfare)
   */
  public static interface Func_chapter_modern_warfare extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_warfare();
  }

  public static class Class_chapter_modern_warfare extends Core.Class_base implements Func_chapter_modern_warfare {

    @Override
    public Func_chapter_modern_warfare vx_new(Object... vals) {
      Class_chapter_modern_warfare output = new Class_chapter_modern_warfare();
      return output;
    }

    @Override
    public Func_chapter_modern_warfare vx_copy(Object... vals) {
      Class_chapter_modern_warfare output = new Class_chapter_modern_warfare();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_modern_warfare", // name
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
    public Func_chapter_modern_warfare vx_empty() {return e_chapter_modern_warfare;}
    @Override
    public Func_chapter_modern_warfare vx_type() {return t_chapter_modern_warfare;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_modern_warfare();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_warfare() {
      return Modern.f_chapter_modern_warfare();
    }

  }

  public static final Func_chapter_modern_warfare e_chapter_modern_warfare = new Modern.Class_chapter_modern_warfare();
  public static final Func_chapter_modern_warfare t_chapter_modern_warfare = new Modern.Class_chapter_modern_warfare();

  public static Base.Type_chapter f_chapter_modern_warfare() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Warfare"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Modern America"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern America"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* I'm going to make it up for all of the Sunday Times. I am going to make it up for all of the nusery rhymes. They never really wanted to tell the truth. I'm so tired of you America. ... Tell me, do you really think you go to hell for having loved? Tell me, enough of thinking everything that you've done is good. I really need to know. After soaking the body of Jesus Christ in blood. I 'm so tired of America. ... You took advantage of a world that loved you well. I'm going to a town that has already been burnt down. I'm so tired of you America - Rufus Wainwright, Going To a Town")
              )
            ),
            Core.vx_new_string("Modern American Aircraft"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern American Aircraft"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Advanced Tactical Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Advanced Tactical Fighter")
                      )
                    ),
                    Core.vx_new_string("B-1 Bomber"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("B-1 Bomber")
                      )
                    ),
                    Core.vx_new_string("B-2 Stealth Bomber"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("B-2 Stealth Bomber")
                      )
                    ),
                    Core.vx_new_string("Predator UAV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Predator UAV")
                      )
                    ),
                    Core.vx_new_string("Stealth Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stealth Fighter")
                      )
                    ),
                    Core.vx_new_string("SH-60 Seahawk Helicopter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("SH-60 Seahawk Helicopter")
                      )
                    ),
                    Core.vx_new_string("Blackhawk Helicopter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blackhawk Helicopter")
                      )
                    ),
                    Core.vx_new_string("Apache Helicopter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Apache Helicopter")
                      )
                    ),
                    Core.vx_new_string("C-5 Galaxy"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("C-5 Galaxy")
                      )
                    ),
                    Core.vx_new_string("C-17 Globemaster III"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("C-17 Globemaster III")
                      )
                    ),
                    Core.vx_new_string("BGM-109 Tomahawk Cruise Missile"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("BGM-109 Tomahawk Cruise Missile"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Conventional: 1,000 lb (450 kg) Bullpup, or submunitions dispenser with BLU-97/B Combined Effects Bomb, or a 200 kiloton of TNT (840 terajoule) W80 nuclear device (inactivated per SALT)")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern American Ground Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern American Ground Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("M1A2 Abrams Tank"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("M1A2 Abrams Tank"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Turbine Engine: takes any fuel, typically Jet Fuel, starting the engine consumes nearly 11 gallons of fuel and it emits a jet blast behind it. Can survive multiple hits from the most powerful tank munitions including 120mm DU APFSDS and anti-tank missiles. Its own weapons are unable to penetrate front or side armor even at close range in friendly fire incidents.\n\n4 Gunnery\n120mm smoothbore: APFSDS, HEAT, Anti-Personnel\n.50 MG, 2 x 7.62mm MG\nSmoke Grenades, Smoke Screen\nArmor\n610mm Composite DU, 1500mm vs HEAT, 950mm vs APDS Front\nMissile Countermeasures"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("72kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("70tons"),
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
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("M2A2 Bradley AFV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("M2A2 Bradley AFV"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("25mm Chain Gun, 900 rounds, APDS, HEI\n7.62mm MG, 2200 rounds\nTOWII Missiles\nSmoke Grenades, Smoke Screen"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("66kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("33tons"),
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
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Patriot Missile System"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Patriot Missile System")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("American Naval Vessels"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("American Naval Vessels"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Ticonderoga Missile Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ticonderoga Missile Cruiser"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Aegis Combat System\n2 x 61 cell Mk41 vertical launch systems\n122 x RIM-66 SM-2, RIM-162 ESSM, BGM-109 Tomahawk, or RUM-139 VL-Asroc\n8 x RGM-84 Harpoon missiles\n2 x Mark 45 5in / 54cal lightweight gun\n2 x 25mm\n24 x .50cal (12.7mm) gun\n2 x Phalanx CIWS\n2 x Mk32 12.75in (324mm) triple torpedo tubes")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern British Ground Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern British Ground Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Challenger 2"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Challenger 2"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Comparable to the M1 Abrams, though it uses a diesel engine.\nOne near Basra survived being hit by 70 RPGs.\n105mm L7 Gun")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern German Ground Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern German Ground Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Leopard 2A6"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leopard 2A6"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Comparable to the M1 Abrams, it carries a heavier gun and uses a diesel engine which increases reliability.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Israeli Ground Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Israeli Ground Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Merkava Mark IV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Merkava Mark IV")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern African Ground Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern African Ground Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Technical"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Technical")
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
   * @function chapter_special_ops
   * @return {chapter}
   * (func chapter_special_ops)
   */
  public static interface Func_chapter_special_ops extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_special_ops();
  }

  public static class Class_chapter_special_ops extends Core.Class_base implements Func_chapter_special_ops {

    @Override
    public Func_chapter_special_ops vx_new(Object... vals) {
      Class_chapter_special_ops output = new Class_chapter_special_ops();
      return output;
    }

    @Override
    public Func_chapter_special_ops vx_copy(Object... vals) {
      Class_chapter_special_ops output = new Class_chapter_special_ops();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_special_ops", // name
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
    public Func_chapter_special_ops vx_empty() {return e_chapter_special_ops;}
    @Override
    public Func_chapter_special_ops vx_type() {return t_chapter_special_ops;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_special_ops();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_special_ops() {
      return Modern.f_chapter_special_ops();
    }

  }

  public static final Func_chapter_special_ops e_chapter_special_ops = new Modern.Class_chapter_special_ops();
  public static final Func_chapter_special_ops t_chapter_special_ops = new Modern.Class_chapter_special_ops();

  public static Base.Type_chapter f_chapter_special_ops() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Special Ops"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("Special Ops\nBlack Ops\nDeniable Insurgencies\nImpossible Missions\nHostage Rescue")
      )
    );
    return output;
  }

  /**
   * @function chapter_the_abyss
   * @return {chapter}
   * (func chapter_the_abyss)
   */
  public static interface Func_chapter_the_abyss extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_the_abyss();
  }

  public static class Class_chapter_the_abyss extends Core.Class_base implements Func_chapter_the_abyss {

    @Override
    public Func_chapter_the_abyss vx_new(Object... vals) {
      Class_chapter_the_abyss output = new Class_chapter_the_abyss();
      return output;
    }

    @Override
    public Func_chapter_the_abyss vx_copy(Object... vals) {
      Class_chapter_the_abyss output = new Class_chapter_the_abyss();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_the_abyss", // name
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
    public Func_chapter_the_abyss vx_empty() {return e_chapter_the_abyss;}
    @Override
    public Func_chapter_the_abyss vx_type() {return t_chapter_the_abyss;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_the_abyss();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_the_abyss() {
      return Modern.f_chapter_the_abyss();
    }

  }

  public static final Func_chapter_the_abyss e_chapter_the_abyss = new Modern.Class_chapter_the_abyss();
  public static final Func_chapter_the_abyss t_chapter_the_abyss = new Modern.Class_chapter_the_abyss();

  public static Base.Type_chapter f_chapter_the_abyss() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("The Abyss"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Abyss Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Abyss Units"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Construction Submarine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Construction Submarine")
                      )
                    ),
                    Core.vx_new_string("Big Geek"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Big Geek")
                      )
                    ),
                    Core.vx_new_string("Little Geek"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Little Geek")
                      )
                    ),
                    Core.vx_new_string("Navy Seal"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Navy Seal")
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
   * @function chapter_the_prisoner
   * @return {chapter}
   * (func chapter_the_prisoner)
   */
  public static interface Func_chapter_the_prisoner extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_the_prisoner();
  }

  public static class Class_chapter_the_prisoner extends Core.Class_base implements Func_chapter_the_prisoner {

    @Override
    public Func_chapter_the_prisoner vx_new(Object... vals) {
      Class_chapter_the_prisoner output = new Class_chapter_the_prisoner();
      return output;
    }

    @Override
    public Func_chapter_the_prisoner vx_copy(Object... vals) {
      Class_chapter_the_prisoner output = new Class_chapter_the_prisoner();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern", // pkgname
        "chapter_the_prisoner", // name
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
    public Func_chapter_the_prisoner vx_empty() {return e_chapter_the_prisoner;}
    @Override
    public Func_chapter_the_prisoner vx_type() {return t_chapter_the_prisoner;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern.f_chapter_the_prisoner();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_the_prisoner() {
      return Modern.f_chapter_the_prisoner();
    }

  }

  public static final Func_chapter_the_prisoner e_chapter_the_prisoner = new Modern.Class_chapter_the_prisoner();
  public static final Func_chapter_the_prisoner t_chapter_the_prisoner = new Modern.Class_chapter_the_prisoner();

  public static Base.Type_chapter f_chapter_the_prisoner() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("The Prisoner"),
        Core.vx_new_string(":reference"),
        Core.vx_new_string("* Where am I? You are at the village. Who do you work for?  That would be telling. What do you want? Information. You won't get it. By hook or by crook, we will. Who are you?  I am number 2. Who is number 1? You are number 6. I am not a number. I am a free man. Ha ha ha ha. - The Prisoner\n* Be seeing you. - The Prisoner")
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
        "nx/tactics/books/modern", // pkgname
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
      output = Modern.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Modern.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Modern.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Modern.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Modern.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Modern Overview"),
            Modern.f_chapter_modern_overview(),
            Core.vx_new_string("Cold War"),
            Modern.f_chapter_cold_war(),
            Core.vx_new_string("Modern Ground Vehicles"),
            Modern.f_chapter_modern_ground_vehicles(),
            Core.vx_new_string("The Abyss"),
            Modern.f_chapter_the_abyss(),
            Core.vx_new_string("Modern Space"),
            Modern.f_chapter_modern_space(),
            Core.vx_new_string("Modern Cops and Robbers"),
            Modern.f_chapter_modern_cops_and_robbers(),
            Core.vx_new_string("Modern Mercenaries"),
            Modern.f_chapter_modern_mercenaries(),
            Core.vx_new_string("The Prisoner"),
            Modern.f_chapter_the_prisoner(),
            Core.vx_new_string("Special Ops"),
            Modern.f_chapter_special_ops(),
            Core.vx_new_string("Modern Spies"),
            Modern.f_chapter_modern_spies(),
            Core.vx_new_string("Modern Sports"),
            Modern.f_chapter_modern_sports(),
            Core.vx_new_string("Modern Warfare"),
            Modern.f_chapter_modern_warfare()
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
    mapfunc.put("chapter_cold_war", Modern.t_chapter_cold_war);
    mapfunc.put("chapter_modern_cops_and_robbers", Modern.t_chapter_modern_cops_and_robbers);
    mapfunc.put("chapter_modern_ground_vehicles", Modern.t_chapter_modern_ground_vehicles);
    mapfunc.put("chapter_modern_mercenaries", Modern.t_chapter_modern_mercenaries);
    mapfunc.put("chapter_modern_overview", Modern.t_chapter_modern_overview);
    mapfunc.put("chapter_modern_space", Modern.t_chapter_modern_space);
    mapfunc.put("chapter_modern_spies", Modern.t_chapter_modern_spies);
    mapfunc.put("chapter_modern_sports", Modern.t_chapter_modern_sports);
    mapfunc.put("chapter_modern_warfare", Modern.t_chapter_modern_warfare);
    mapfunc.put("chapter_special_ops", Modern.t_chapter_special_ops);
    mapfunc.put("chapter_the_abyss", Modern.t_chapter_the_abyss);
    mapfunc.put("chapter_the_prisoner", Modern.t_chapter_the_prisoner);
    mapfunc.put("tacticsbook", Modern.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/modern", maptype, mapconst, mapfunc);
  }

}
