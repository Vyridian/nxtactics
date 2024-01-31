package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Ancients {

  /**
   * @function chapter_ancients_overview
   * @return {chapter}
   * (func chapter_ancients_overview)
   */
  public static interface Func_chapter_ancients_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_ancients_overview();
  }

  public static class Class_chapter_ancients_overview extends Core.Class_base implements Func_chapter_ancients_overview {

    @Override
    public Func_chapter_ancients_overview vx_new(Object... vals) {
      Class_chapter_ancients_overview output = new Class_chapter_ancients_overview();
      return output;
    }

    @Override
    public Func_chapter_ancients_overview vx_copy(Object... vals) {
      Class_chapter_ancients_overview output = new Class_chapter_ancients_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_ancients_overview", // name
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
    public Func_chapter_ancients_overview vx_empty() {return e_chapter_ancients_overview;}
    @Override
    public Func_chapter_ancients_overview vx_type() {return t_chapter_ancients_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_ancients_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_ancients_overview() {
      return Ancients.f_chapter_ancients_overview();
    }

  }

  public static final Func_chapter_ancients_overview e_chapter_ancients_overview = new Ancients.Class_chapter_ancients_overview();
  public static final Func_chapter_ancients_overview t_chapter_ancients_overview = new Ancients.Class_chapter_ancients_overview();

  public static Base.Type_chapter f_chapter_ancients_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Ancients Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Ancients?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Ancients?")
              )
            ),
            Core.vx_new_string("Ancients Land Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Ancients Land Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Infantry\n* Formations\n* Axemen\n* Polearms\n* Cavalry\n* Horse Archers\n* Armored Cavalry\n* Elephants\n* Chariots\n* Archers\n* Longbows\n* Crossbows\n* Siege\n* Ballista\n* Catapult\n* Fortifications")
              )
            ),
            Core.vx_new_string("Ancients Naval Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Ancients Naval Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Wind\n* Large Ships\n* Small Ships\n* War Barge\n* Ballista")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_ancients_scenarios
   * @return {chapter}
   * (func chapter_ancients_scenarios)
   */
  public static interface Func_chapter_ancients_scenarios extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_ancients_scenarios();
  }

  public static class Class_chapter_ancients_scenarios extends Core.Class_base implements Func_chapter_ancients_scenarios {

    @Override
    public Func_chapter_ancients_scenarios vx_new(Object... vals) {
      Class_chapter_ancients_scenarios output = new Class_chapter_ancients_scenarios();
      return output;
    }

    @Override
    public Func_chapter_ancients_scenarios vx_copy(Object... vals) {
      Class_chapter_ancients_scenarios output = new Class_chapter_ancients_scenarios();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_ancients_scenarios", // name
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
    public Func_chapter_ancients_scenarios vx_empty() {return e_chapter_ancients_scenarios;}
    @Override
    public Func_chapter_ancients_scenarios vx_type() {return t_chapter_ancients_scenarios;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_ancients_scenarios();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_ancients_scenarios() {
      return Ancients.f_chapter_ancients_scenarios();
    }

  }

  public static final Func_chapter_ancients_scenarios e_chapter_ancients_scenarios = new Ancients.Class_chapter_ancients_scenarios();
  public static final Func_chapter_ancients_scenarios t_chapter_ancients_scenarios = new Ancients.Class_chapter_ancients_scenarios();

  public static Base.Type_chapter f_chapter_ancients_scenarios() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Ancients Scenarios"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Ancient Scenarios"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Ancient Scenarios"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Flush Them Out"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flush Them Out"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 10 Turns"),
                        Core.vx_new_string(":teammap"),
                        Core.f_new(
                          Base.t_teammap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Germanics"),
                            Core.f_new(
                              Base.t_team,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Germanics"),
                                Core.vx_new_string(":completevictory"),
                                Core.vx_new_string("Half of Roman units are lost."),
                                Core.vx_new_string(":deploy"),
                                Core.vx_new_string("1) Tactical Map\n2) 6 Forest Terrain on Germanic side of map\n3) Deploy units anywhere on Germanic side of map"),
                                Core.vx_new_string(":forces"),
                                Core.vx_new_string("* 20 Levels of units"),
                                Core.vx_new_string(":partialvictory"),
                                Core.vx_new_string("Romans lose more units than Germanics.")
                              )
                            ),
                            Core.vx_new_string(":Romans*"),
                            Core.f_new(
                              Base.t_team,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Romans*"),
                                Core.vx_new_string(":completevictory"),
                                Core.vx_new_string("Half of Germanics are lost."),
                                Core.vx_new_string(":deploy"),
                                Core.vx_new_string("1) Tactical Map\n2) 3 Forest Terrain on Roman side of map.\n3) Deploy units along Roman players edge of the map."),
                                Core.vx_new_string(":forces"),
                                Core.vx_new_string("* 20 Levels of units"),
                                Core.vx_new_string(":partialvictory"),
                                Core.vx_new_string("Germanics lose more units than Romans.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Roman Gladiators"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Gladiators")
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
   * @function chapter_anglo_saxons
   * @return {chapter}
   * (func chapter_anglo_saxons)
   */
  public static interface Func_chapter_anglo_saxons extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_anglo_saxons();
  }

  public static class Class_chapter_anglo_saxons extends Core.Class_base implements Func_chapter_anglo_saxons {

    @Override
    public Func_chapter_anglo_saxons vx_new(Object... vals) {
      Class_chapter_anglo_saxons output = new Class_chapter_anglo_saxons();
      return output;
    }

    @Override
    public Func_chapter_anglo_saxons vx_copy(Object... vals) {
      Class_chapter_anglo_saxons output = new Class_chapter_anglo_saxons();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_anglo_saxons", // name
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
    public Func_chapter_anglo_saxons vx_empty() {return e_chapter_anglo_saxons;}
    @Override
    public Func_chapter_anglo_saxons vx_type() {return t_chapter_anglo_saxons;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_anglo_saxons();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_anglo_saxons() {
      return Ancients.f_chapter_anglo_saxons();
    }

  }

  public static final Func_chapter_anglo_saxons e_chapter_anglo_saxons = new Ancients.Class_chapter_anglo_saxons();
  public static final Func_chapter_anglo_saxons t_chapter_anglo_saxons = new Ancients.Class_chapter_anglo_saxons();

  public static Base.Type_chapter f_chapter_anglo_saxons() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Anglo/Saxons"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Anglo/Saxon Armies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Anglo/Saxon Armies")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_carthaginians
   * @return {chapter}
   * (func chapter_carthaginians)
   */
  public static interface Func_chapter_carthaginians extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_carthaginians();
  }

  public static class Class_chapter_carthaginians extends Core.Class_base implements Func_chapter_carthaginians {

    @Override
    public Func_chapter_carthaginians vx_new(Object... vals) {
      Class_chapter_carthaginians output = new Class_chapter_carthaginians();
      return output;
    }

    @Override
    public Func_chapter_carthaginians vx_copy(Object... vals) {
      Class_chapter_carthaginians output = new Class_chapter_carthaginians();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_carthaginians", // name
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
    public Func_chapter_carthaginians vx_empty() {return e_chapter_carthaginians;}
    @Override
    public Func_chapter_carthaginians vx_type() {return t_chapter_carthaginians;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_carthaginians();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_carthaginians() {
      return Ancients.f_chapter_carthaginians();
    }

  }

  public static final Func_chapter_carthaginians e_chapter_carthaginians = new Ancients.Class_chapter_carthaginians();
  public static final Func_chapter_carthaginians t_chapter_carthaginians = new Ancients.Class_chapter_carthaginians();

  public static Base.Type_chapter f_chapter_carthaginians() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Carthaginians"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Carthaginian Armies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Carthaginian Armies"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Carthaginian Elephant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Carthaginian Elephant"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("40kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("10tons")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Carhaginian Naval Vessels"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Carhaginian Naval Vessels"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Carthaginian Quinquereme"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Carthaginian Quinquereme")
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
   * @function chapter_chinese_dynasty
   * @return {chapter}
   * (func chapter_chinese_dynasty)
   */
  public static interface Func_chapter_chinese_dynasty extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_chinese_dynasty();
  }

  public static class Class_chapter_chinese_dynasty extends Core.Class_base implements Func_chapter_chinese_dynasty {

    @Override
    public Func_chapter_chinese_dynasty vx_new(Object... vals) {
      Class_chapter_chinese_dynasty output = new Class_chapter_chinese_dynasty();
      return output;
    }

    @Override
    public Func_chapter_chinese_dynasty vx_copy(Object... vals) {
      Class_chapter_chinese_dynasty output = new Class_chapter_chinese_dynasty();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_chinese_dynasty", // name
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
    public Func_chapter_chinese_dynasty vx_empty() {return e_chapter_chinese_dynasty;}
    @Override
    public Func_chapter_chinese_dynasty vx_type() {return t_chapter_chinese_dynasty;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_chinese_dynasty();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_chinese_dynasty() {
      return Ancients.f_chapter_chinese_dynasty();
    }

  }

  public static final Func_chapter_chinese_dynasty e_chapter_chinese_dynasty = new Ancients.Class_chapter_chinese_dynasty();
  public static final Func_chapter_chinese_dynasty t_chapter_chinese_dynasty = new Ancients.Class_chapter_chinese_dynasty();

  public static Base.Type_chapter f_chapter_chinese_dynasty() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Chinese Dynasty")
      )
    );
    return output;
  }

  /**
   * @function chapter_egyptian_dynasty
   * @return {chapter}
   * (func chapter_egyptian_dynasty)
   */
  public static interface Func_chapter_egyptian_dynasty extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_egyptian_dynasty();
  }

  public static class Class_chapter_egyptian_dynasty extends Core.Class_base implements Func_chapter_egyptian_dynasty {

    @Override
    public Func_chapter_egyptian_dynasty vx_new(Object... vals) {
      Class_chapter_egyptian_dynasty output = new Class_chapter_egyptian_dynasty();
      return output;
    }

    @Override
    public Func_chapter_egyptian_dynasty vx_copy(Object... vals) {
      Class_chapter_egyptian_dynasty output = new Class_chapter_egyptian_dynasty();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_egyptian_dynasty", // name
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
    public Func_chapter_egyptian_dynasty vx_empty() {return e_chapter_egyptian_dynasty;}
    @Override
    public Func_chapter_egyptian_dynasty vx_type() {return t_chapter_egyptian_dynasty;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_egyptian_dynasty();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_egyptian_dynasty() {
      return Ancients.f_chapter_egyptian_dynasty();
    }

  }

  public static final Func_chapter_egyptian_dynasty e_chapter_egyptian_dynasty = new Ancients.Class_chapter_egyptian_dynasty();
  public static final Func_chapter_egyptian_dynasty t_chapter_egyptian_dynasty = new Ancients.Class_chapter_egyptian_dynasty();

  public static Base.Type_chapter f_chapter_egyptian_dynasty() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Egyptian Dynasty"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Egyptian Armies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Egyptian Armies"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Egyptian Archer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Egyptian Archer")
                      )
                    ),
                    Core.vx_new_string("Egyptian Charioteer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Egyptian Charioteer")
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
   * @function chapter_germanic_tribes
   * @return {chapter}
   * (func chapter_germanic_tribes)
   */
  public static interface Func_chapter_germanic_tribes extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_germanic_tribes();
  }

  public static class Class_chapter_germanic_tribes extends Core.Class_base implements Func_chapter_germanic_tribes {

    @Override
    public Func_chapter_germanic_tribes vx_new(Object... vals) {
      Class_chapter_germanic_tribes output = new Class_chapter_germanic_tribes();
      return output;
    }

    @Override
    public Func_chapter_germanic_tribes vx_copy(Object... vals) {
      Class_chapter_germanic_tribes output = new Class_chapter_germanic_tribes();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_germanic_tribes", // name
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
    public Func_chapter_germanic_tribes vx_empty() {return e_chapter_germanic_tribes;}
    @Override
    public Func_chapter_germanic_tribes vx_type() {return t_chapter_germanic_tribes;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_germanic_tribes();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_germanic_tribes() {
      return Ancients.f_chapter_germanic_tribes();
    }

  }

  public static final Func_chapter_germanic_tribes e_chapter_germanic_tribes = new Ancients.Class_chapter_germanic_tribes();
  public static final Func_chapter_germanic_tribes t_chapter_germanic_tribes = new Ancients.Class_chapter_germanic_tribes();

  public static Base.Type_chapter f_chapter_germanic_tribes() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Germanic Tribes"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Germanic Armies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Germanic Armies"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Free Spears"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Free Spears"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanLevySpearmen.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Free Spears are farmers and hunters.  According to Germanic tradition, as soon as these men receive their\nspear and shield, they are 'free' adults.  Though lacking in the organized training of the warbands, they\nare veterans of the ritualized tribal warfare of German tribes, and fight with a force and fury superior to\ntheir neighbors militia."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Youth Skirmishers"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Youth Skirmishers"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanSkirmishers.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Young skirmishers break up and harass enemy formations before the main battle lines meet, and act as a screen\nfor heavy troops, taking losses in order to increase the odds of survival of more valuable 'proven' warriors.\nThey must first prove themselves in battle in order to earn status.  Each warrior is armed with a bundle of\nthrowing spears, a slightly longer spear for melee and a stout ovular shield, but they do not wear armor,\nbeing poor and of low status, but also choosing speed over protection."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Survival"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Survival"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Forestry"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Forestry")
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
                    Core.vx_new_string("Proven Spearmen"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Proven Spearmen"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanTrustedSpearmen.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Proud and experienced, 'proven' warriors steeled by years of constant warfare and veterans of numerous\nconflicts.  These men are hardened for battle and unlikely to flee from conflict, and are trained through\nlong experience to work in close or open formation, and even the shieldwall."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Shield Wall"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Shield Wall")
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
                    Core.vx_new_string("German Slayers"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("German Slayers"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanSlayers.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("By shaping heavy boughs of oak and inserting bone spikes, these Cudgels can be used to maim both armored\nand unarmored foes alike.  Cudgels are cheap, easy to make, and replaceable on campaign, while also being\nable to smash or punch through armor.  Although this weapon may seem primitive to untrained eyes, against\narmored opponents it is more effective than any other at their disposal.  These light armored club warriors\nwere recorded to have taken down units of the feared and notoriously lethal kataphraktoi."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("German Shooters"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("German Shooters"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanShooters.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Equipped to harass and break up enemy formations so more experienced and valuable melee warriors can finish\nthem.  Shooters are often untrained or uncapable warriors, but many are also excellect hunters.  They are\nalso armed with the spear and can act as light infantry, but they will not last long in melee.  In the woods,\ntheir superior ambush skills can be put to best use.\n\nHistorically, Germanic bowmen on the battlefield were few in numbers, because weapons were status symbols,\nand common multipurpose tools, such as the axe or bow were looked down upon."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Skirmish"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Skirmish")
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
                    Core.vx_new_string("Sword Possessors"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sword Possessors"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanSwordPossessors.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Sword Possessors are well trained, experienced and armed with superior quality swords and javelins to\nsoften the enemy before their furious charge.\n\nHistorically, swords were not plentiful in Germanic lands because of the cost of iron, so those fierce and\nvaliant warriors carried their highly valued swords with pride."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Shield Wall"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Shield Wall")
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
                    Core.vx_new_string("Night Walkers"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Night Walkers"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanNightWalkers.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Night-Walkers are unconventional warriors who specialize in ambush.  They display their zeal and ferocity\nwith the help of pitch and dye by blackening their shields and bodies.  They choose dark nights for their\nbattles and when the moment is right, they charge wildly, wide-eyed and screaming at their foes.  Any who\nsurvive assaults by these maniacal warriors are convinced they are spirits sent from the otherworld."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Intimidation"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Intimidation"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Terrorize"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Terrorize")
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
                    Core.vx_new_string("Pike Fence"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pike Fence"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanPikeFence.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The Pike Fence are hard-nosed, disciplined warriors that fight together in a\nvery dense formation, unlike most other Germanic warbands. They are trained in\nthe Shield Wall and are universally feared by cavalry."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Shield Wall"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Shield Wall")
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
                    Core.vx_new_string("Hearth Companions"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hearth Companions"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanHearthCompanion.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("These are the Germanic tribes' best warriors. Germans respect their leader's\nbravery, not their rank, and it is a disgrace for a leader to be surpassed in\nbravery. They are wealthy, powerful men, fiercely loyal to their lord, often\nheavily scarred by years of warfare. Their weapons and armor are the best. To\nleave a battlefield alive while their lord lay dead meant a life of shame and\nscorn. To defend and protect him, to assign one's own acts of heroism to his\ncredit-that's what is truly meant by allegiance."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Command"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Command"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Chain of Command"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Chain of Command")
                                      )
                                    ),
                                    Core.vx_new_string(":Rally"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Rally")
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
                    Core.vx_new_string("Germanic Riders"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Germanic Riders"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanRiders.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Riders ride small, poor quality horses, though they are excellent light cavalry.  Like many Germanic warriors,\nhowever, they can lack battle-discipline and be over-keen to enter battle for glory.\n\nThey were mostly armed with shield and spear and were supported by fast-moving light infantry - this light\ncavalry combined with light infantry allowed great tactical speed and versatility on the battlefield.\n\nHistorically, Germanic tribes did not frequently use cavalry, however, some tribes were known for their\ncavalry and many peoples praised the good quality of Germanic cavalry.  Though their horses were not\nexceptional, Germanic horsemen could still maneuver very well and operated as a unit, rather than as an\nunorganized band."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Germ. Companion Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Germ. Companion Cavalry"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Germanics/GermanCompanionCavalry.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The Companion Cavalry are extremely wealthy and powerful men, but still fiercely loyal to their lord who\nprovides them the finest warhorses and wargear at his disposal.\n\nThey can be used most effectively as shock troops whose charges can break the enemy line and destory their\nflanks, but they are also useful for overrunning heavy infantry and slaughtering lighter cavalry."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Command"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Command"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Chain of Command"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Chain of Command")
                                      )
                                    ),
                                    Core.vx_new_string(":Rally"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Rally")
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
   * @function chapter_greek_city_states
   * @return {chapter}
   * (func chapter_greek_city_states)
   */
  public static interface Func_chapter_greek_city_states extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_greek_city_states();
  }

  public static class Class_chapter_greek_city_states extends Core.Class_base implements Func_chapter_greek_city_states {

    @Override
    public Func_chapter_greek_city_states vx_new(Object... vals) {
      Class_chapter_greek_city_states output = new Class_chapter_greek_city_states();
      return output;
    }

    @Override
    public Func_chapter_greek_city_states vx_copy(Object... vals) {
      Class_chapter_greek_city_states output = new Class_chapter_greek_city_states();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_greek_city_states", // name
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
    public Func_chapter_greek_city_states vx_empty() {return e_chapter_greek_city_states;}
    @Override
    public Func_chapter_greek_city_states vx_type() {return t_chapter_greek_city_states;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_greek_city_states();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_greek_city_states() {
      return Ancients.f_chapter_greek_city_states();
    }

  }

  public static final Func_chapter_greek_city_states e_chapter_greek_city_states = new Ancients.Class_chapter_greek_city_states();
  public static final Func_chapter_greek_city_states t_chapter_greek_city_states = new Ancients.Class_chapter_greek_city_states();

  public static Base.Type_chapter f_chapter_greek_city_states() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Greek City States"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Greek Armies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Greek Armies"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Greek Hoplite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Hoplite"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Greeks/GreekHopliteToken.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Phalanx"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Phalanx")
                                      )
                                    ),
                                    Core.vx_new_string("Formation: Shield Wall"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Shield Wall")
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
                    Core.vx_new_string("Spartan Hoplite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spartan Hoplite"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Greeks/GreekSpartanToken.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* From the age of seven onwards, Spartan males were trained for a life of warfare.  They were taught iron\ndiscipline, and almost programmed to forget about their individuality.\n* The strenuous training and comradeship engendered between Spartans made them ideally suited to hoplite warfare\nwhich required high levels of discipline and selflessness."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Command"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Command"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Chain of Command"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Chain of Command")
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
                    Core.vx_new_string("Greek General"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek General"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Greeks/GreekGeneralToken.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Command"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Command"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Chain of Command"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Chain of Command")
                                      )
                                    ),
                                    Core.vx_new_string(":Rally"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Rally")
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
                    Core.vx_new_string("Thracian Peltast"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Thracian Peltast"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* When faced by hoplites peltasts operated by throwing javelins at short range.  If the hoplites charged they\nwould flee.  As they carried considerably lighter equipment than the hoplites they were usually able to evade\nsuccessfully especially in difficult terrain.\n* Peltasts were usually deployed on the flanks of the phalanx providing a link with any cavalry."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Skirmish"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Skirmish")
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
                    Core.vx_new_string("Greek Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Cavalry"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The utility of the Greek Citizen Cavalry was small on account of their heavy armor."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Greek Cataphracts"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Cataphracts"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Command"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Command"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Chain of Command"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Chain of Command")
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
                    Core.vx_new_string("Greek Philosopher"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Philosopher")
                      )
                    ),
                    Core.vx_new_string("Greek Senator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Senator")
                      )
                    ),
                    Core.vx_new_string("Greek Wrestler"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Wrestler")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Greek Naval Vessels"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Greek Naval Vessels"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Greek Galley"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Galley")
                      )
                    ),
                    Core.vx_new_string("Greek Trireme"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Trireme")
                      )
                    ),
                    Core.vx_new_string("Greek Quinquereme"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Quinquereme")
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
   * @function chapter_macedon
   * @return {chapter}
   * (func chapter_macedon)
   */
  public static interface Func_chapter_macedon extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_macedon();
  }

  public static class Class_chapter_macedon extends Core.Class_base implements Func_chapter_macedon {

    @Override
    public Func_chapter_macedon vx_new(Object... vals) {
      Class_chapter_macedon output = new Class_chapter_macedon();
      return output;
    }

    @Override
    public Func_chapter_macedon vx_copy(Object... vals) {
      Class_chapter_macedon output = new Class_chapter_macedon();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_macedon", // name
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
    public Func_chapter_macedon vx_empty() {return e_chapter_macedon;}
    @Override
    public Func_chapter_macedon vx_type() {return t_chapter_macedon;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_macedon();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_macedon() {
      return Ancients.f_chapter_macedon();
    }

  }

  public static final Func_chapter_macedon e_chapter_macedon = new Ancients.Class_chapter_macedon();
  public static final Func_chapter_macedon t_chapter_macedon = new Ancients.Class_chapter_macedon();

  public static Base.Type_chapter f_chapter_macedon() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Macedon"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Macedonian Armies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Macedonian Armies"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Macedonian Prodromoi Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Macedonian Prodromoi Cavalry"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The utility of the Greek Citizen Cavalry was small on account of their heavy armor."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Skirmish"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Skirmish")
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
                    Core.vx_new_string("Macedonian Companion Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Macedonian Companion Cavalry"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
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
            Core.vx_new_string("Macedonian Naval Vessels"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Macedonian Naval Vessels"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Macedonian Galley"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Macedonian Galley")
                      )
                    ),
                    Core.vx_new_string("Macedonian Trireme"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Macedonian Trireme")
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
   * @function chapter_norsemen
   * @return {chapter}
   * (func chapter_norsemen)
   */
  public static interface Func_chapter_norsemen extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_norsemen();
  }

  public static class Class_chapter_norsemen extends Core.Class_base implements Func_chapter_norsemen {

    @Override
    public Func_chapter_norsemen vx_new(Object... vals) {
      Class_chapter_norsemen output = new Class_chapter_norsemen();
      return output;
    }

    @Override
    public Func_chapter_norsemen vx_copy(Object... vals) {
      Class_chapter_norsemen output = new Class_chapter_norsemen();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_norsemen", // name
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
    public Func_chapter_norsemen vx_empty() {return e_chapter_norsemen;}
    @Override
    public Func_chapter_norsemen vx_type() {return t_chapter_norsemen;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_norsemen();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_norsemen() {
      return Ancients.f_chapter_norsemen();
    }

  }

  public static final Func_chapter_norsemen e_chapter_norsemen = new Ancients.Class_chapter_norsemen();
  public static final Func_chapter_norsemen t_chapter_norsemen = new Ancients.Class_chapter_norsemen();

  public static Base.Type_chapter f_chapter_norsemen() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Norsemen"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Viking Armies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Viking Armies"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Viking Axeman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Viking Axeman"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Frenzy"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Frenzy"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Berserker"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Berserker")
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
                    Core.vx_new_string("Viking Swordsman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Viking Swordsman")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Viking Naval Vessels"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Viking Naval Vessels"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Viking War Galley"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Viking War Galley")
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
   * @function chapter_persians
   * @return {chapter}
   * (func chapter_persians)
   */
  public static interface Func_chapter_persians extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_persians();
  }

  public static class Class_chapter_persians extends Core.Class_base implements Func_chapter_persians {

    @Override
    public Func_chapter_persians vx_new(Object... vals) {
      Class_chapter_persians output = new Class_chapter_persians();
      return output;
    }

    @Override
    public Func_chapter_persians vx_copy(Object... vals) {
      Class_chapter_persians output = new Class_chapter_persians();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_persians", // name
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
    public Func_chapter_persians vx_empty() {return e_chapter_persians;}
    @Override
    public Func_chapter_persians vx_type() {return t_chapter_persians;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_persians();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_persians() {
      return Ancients.f_chapter_persians();
    }

  }

  public static final Func_chapter_persians e_chapter_persians = new Ancients.Class_chapter_persians();
  public static final Func_chapter_persians t_chapter_persians = new Ancients.Class_chapter_persians();

  public static Base.Type_chapter f_chapter_persians() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Persians"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Persian Armies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Persian Armies"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Persian Lt. Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Persian Lt. Cavalry")
                      )
                    ),
                    Core.vx_new_string("Persian Horse Archer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Persian Horse Archer")
                      )
                    ),
                    Core.vx_new_string("Persian Scythed Chariot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Persian Scythed Chariot")
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
   * @function chapter_roman_empire
   * @return {chapter}
   * (func chapter_roman_empire)
   */
  public static interface Func_chapter_roman_empire extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_roman_empire();
  }

  public static class Class_chapter_roman_empire extends Core.Class_base implements Func_chapter_roman_empire {

    @Override
    public Func_chapter_roman_empire vx_new(Object... vals) {
      Class_chapter_roman_empire output = new Class_chapter_roman_empire();
      return output;
    }

    @Override
    public Func_chapter_roman_empire vx_copy(Object... vals) {
      Class_chapter_roman_empire output = new Class_chapter_roman_empire();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_roman_empire", // name
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
    public Func_chapter_roman_empire vx_empty() {return e_chapter_roman_empire;}
    @Override
    public Func_chapter_roman_empire vx_type() {return t_chapter_roman_empire;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_roman_empire();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_roman_empire() {
      return Ancients.f_chapter_roman_empire();
    }

  }

  public static final Func_chapter_roman_empire e_chapter_roman_empire = new Ancients.Class_chapter_roman_empire();
  public static final Func_chapter_roman_empire t_chapter_roman_empire = new Ancients.Class_chapter_roman_empire();

  public static Base.Type_chapter f_chapter_roman_empire() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Roman Empire"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Legionnaries"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Legionnaries"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Roman Legions were the official fighting force of the empire and were divided in the following way:\n\n* Each Legion consisted of 4800 men\n* Each Legion was divided into 10 cohorts of 480 legionaries\n* Each Cohort was divided into 6 centuries of 80 men each.  The 6 centuries were: Forward Hastati, Rear Hastati,\nForward Pricipes, Rear Pricipes, Forward Triarii, and Rear Triarii.\n* Each Century was divided into 10 octets of 8 men.  Soldiers of an octet shared a tent, and were rewarded or\npunished together.  If one member acted dishonorably in battle, that contubernium would suffer\ndecimation, whereby the group would be required to draw straws, the soldier unlucky enough to draw the short straw\nthen being stoned to death by the others."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Hastati"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hastati"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanLegionaireToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("These were the first line of the Roman heavy infantry and were made up of the relatively young\n(inexperienced), but wealthier citizens.  The Hastati were the primary engaging force of the\nlegion and always met the enemy first in melee combat. If things went badly, or they simply needed\nto rest and regroup, the Hastati would roll behind the Princeps."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Shield Wall"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Shield Wall")
                                      )
                                    ),
                                    Core.vx_new_string("Formation: Testudo"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Testudo")
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
                    Core.vx_new_string(":Princeps"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Princeps"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanPrincepToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The elite of the legion, in the prime of their careers for age and experience, and constituted the\nwealthier class.  It was simply the obligation of the Princeps to win the battle.  First they would\nact in relief of the Hastati, but then would carry the fight in earnest.  It was a successful tactic,\nwearing down the enemy with good, but not your best forces, than hitting with your best men right in\nthe middle of the fight."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Shield Wall"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Shield Wall")
                                      )
                                    ),
                                    Core.vx_new_string("Formation: Testudo"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Testudo")
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
                    Core.vx_new_string(":Triarii"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Triarii"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanLegionaire2Token.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Though the triarii were similarly armored as the Hastatii and Princeps, they played a much different\nrole and were more akin to the Greek hoplites than Roman heavy infantry.  The Triarii were the oldest\nand very experienced of the Roman army, and their job was to defend against disaster as a last resort,\nor to shock the enemy with a different look at the right moment.  If the heavy infantry were pushed\nback, the Triarii would charge forward with their spears, hopefully with the effect of shocking the\nenemy and allowing the Princeps and Hastati time to regroup.  They were used as a last resort, and the\nLatin expression 'ad triarios redisse', or it has come to the triarii, became a general phrase meaning\nthat something was in a desperate situation."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Phalanx"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Phalanx")
                                      )
                                    ),
                                    Core.vx_new_string("Formation: Shield Wall"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Shield Wall")
                                      )
                                    ),
                                    Core.vx_new_string("Formation: Testudo"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Testudo")
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
                    Core.vx_new_string(":Centurion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Centurion"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanCenturionToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Each Centurion commanded the 80 men in a single century (Forward Hastati, etc)."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Command"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Command"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Chain of Command"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Chain of Command")
                                      )
                                    ),
                                    Core.vx_new_string(":Rally"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Rally")
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
                    Core.vx_new_string("Praetorian Guard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Praetorian Guard"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Initially, the guard for a general, the title was later used for the Emperor's personal army.  These men were\nhandpicked from the legions and represent the best warriors in Rome."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Phalanx"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Phalanx")
                                      )
                                    ),
                                    Core.vx_new_string("Formation: Shield Wall"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Shield Wall")
                                      )
                                    ),
                                    Core.vx_new_string("Formation: Testudo"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Testudo")
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
                    Core.vx_new_string(":Velites"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Velites"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanVeliteToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The poorest citizen class allowed to serve, these units were lightly armed skirmishers who were\ndeployed en masse on the battlefield in front of the heavier infantry lines, but moved back beyond\nthe Hastati after discharging their javelins as the enemy approached. The Velites were also an\nimportant part of defense against war elephants.  Using their greater mobility, due to lighter\narmament, Velites could avoid elephant charges and flank them."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Skirmish"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Skirmish")
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
                    Core.vx_new_string("Equites Legionis"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Equites Legionis"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanHeavyCavalryToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The Republican cavalry was designed for speed of movement, and were similarly equipped to the Hastati.  Their\nduty was to provide scouting and potential fast moving support to weakening parts of a battle line.  At times\nthe cavalry could be used to turn a flank or deliver a shock at the right moment, but their limited number\ngenerally made their capabilities limited.  As the Romans were not considered great natural horsemen, the great\neffectiveness of cavalry in the Roman army didn't come until the inclusion of various auxilia cavalry like that\nof the Gauls and Germanics."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Riding"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Riding"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Run Down"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Run Down")
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
            Core.vx_new_string(":Auxilia"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Auxilia"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Roman Auxilia are support troops and specialized units.  By the 2nd century, the auxilia contained the same number of\ninfantry as the legions and in addition provided almost all the Roman army's cavalry and more specialised troops\n(especially light cavalry and archers).  The auxilia thus represented three-fifths of Rome's regular land forces.\nLike their legionary counterparts, auxiliary recruits were mostly volunteers, not conscripts, but unlike the legion\nthe auxilia accepted non-Romans (which represented 90% of the empire)."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Cohors Peditata"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cohors Peditata"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanAuxiliaToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Most auxiliary cohortes contained heavy infantry similar to legionaries."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Cohortes Sagittariorum"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cohortes Sagittariorum"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanArcherAuxiliaToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Most Sagittarii were from Syria."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Skirmish"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Skirmish")
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
                    Core.vx_new_string(":Funditores"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Funditores"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Slingers wore no armor."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Skirmish"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Skirmish")
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
                    Core.vx_new_string("Eques Alaris"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Eques Alaris"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanLightCavalryToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Auxiliary Cavalryman"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Alae Sagittariorum"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alae Sagittariorum"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mounted Archers"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Military"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Formation: Skirmish"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Formation: Skirmish")
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
                    Core.vx_new_string(":Cataphractarii"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cataphractarii"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Cavalry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Command"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Command"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Chain of Command"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Chain of Command")
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
                    Core.vx_new_string("Roman Charioteer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Charioteer"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanCharioteer.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Cavalry")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Civilians"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Civilians"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Roman Gladiator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Gladiator"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Romans/RomanGladiatorToken.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Round Shield"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Round Shield")
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
                    Core.vx_new_string("Roman Senator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Senator")
                      )
                    ),
                    Core.vx_new_string("Roman Slave"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Slave")
                      )
                    ),
                    Core.vx_new_string("Roman Slaver"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Slaver")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Roman Naval Vessels"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Roman Naval Vessels"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Roman Galley"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Galley")
                      )
                    ),
                    Core.vx_new_string("Roman Trireme"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Trireme")
                      )
                    ),
                    Core.vx_new_string("Roman Quinquereme"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Quinquereme")
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
   * @function chapter_unfiled_ancient
   * @return {chapter}
   * (func chapter_unfiled_ancient)
   */
  public static interface Func_chapter_unfiled_ancient extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_unfiled_ancient();
  }

  public static class Class_chapter_unfiled_ancient extends Core.Class_base implements Func_chapter_unfiled_ancient {

    @Override
    public Func_chapter_unfiled_ancient vx_new(Object... vals) {
      Class_chapter_unfiled_ancient output = new Class_chapter_unfiled_ancient();
      return output;
    }

    @Override
    public Func_chapter_unfiled_ancient vx_copy(Object... vals) {
      Class_chapter_unfiled_ancient output = new Class_chapter_unfiled_ancient();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/ancients", // pkgname
        "chapter_unfiled_ancient", // name
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
    public Func_chapter_unfiled_ancient vx_empty() {return e_chapter_unfiled_ancient;}
    @Override
    public Func_chapter_unfiled_ancient vx_type() {return t_chapter_unfiled_ancient;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Ancients.f_chapter_unfiled_ancient();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_unfiled_ancient() {
      return Ancients.f_chapter_unfiled_ancient();
    }

  }

  public static final Func_chapter_unfiled_ancient e_chapter_unfiled_ancient = new Ancients.Class_chapter_unfiled_ancient();
  public static final Func_chapter_unfiled_ancient t_chapter_unfiled_ancient = new Ancients.Class_chapter_unfiled_ancient();

  public static Base.Type_chapter f_chapter_unfiled_ancient() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Unfiled Ancient"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("Examples of Play\nRomans vs. Greeks\nCombat Example:\n\nCombat Cards:\nSurprise\nUse when:\n	Opponent must be unaware\nEffects:\n	+4 Attack\n	Opponent can only defend\n\nHold Off\nUse when:\n	Longer Reach\n	In Melee Combat\n	Not in Close Combat\nEffects:\n	First Strike\n	+2 Attack\n	+4 Damage Vs Charge\n	Opponent cannot move into Close Combat if you hit.\n\nCharge:\nEffect:\nUse when:\n	Not in Melee Combat\nEffect:\n	Full Move Attack\n	+2 Damage\n	Moves into Close Combat\n\nGuard:\nEffect:\n	+2 Defense\n	All hits taken are shield hits\n\nExample:\nHuman attacks the Orc in the open.\nThe Orc has longer reach an chooses Hold Off.\nThe Human is wary of the spear and plays Guard and Close Combat.\n\nRound 1:\nOrc roll: 12 + 9 Spear + 2 Hold Off = 23\nHuman roll: 9 + 8 Sword + 2 Guard - 1 Encumberance = 18\n\nOrc scores a hit for 5 + 3 Spear = 8 Damage\n\nGuard makes the damage a shield hit.\nDetermine hit location.\n8 (Piercing) - 3 (Shield) - 3 (Armor) = 2 (Piercing) Wound.\n\nBody reduces by 2 to 10 not enough to change bonus.\n\nThe successful Hold Off means the Human's Close Combat Movement fails.")
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
        "nx/tactics/books/ancients", // pkgname
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
      output = Ancients.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Ancients.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Ancients.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Ancients.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Ancients"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("300_phalanx.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Ancients Overview"),
            Ancients.f_chapter_ancients_overview(),
            Core.vx_new_string("Ancients Scenarios"),
            Ancients.f_chapter_ancients_scenarios(),
            Core.vx_new_string("Anglo/Saxons"),
            Ancients.f_chapter_anglo_saxons(),
            Core.vx_new_string("Carthaginians"),
            Ancients.f_chapter_carthaginians(),
            Core.vx_new_string("Chinese Dynasty"),
            Ancients.f_chapter_chinese_dynasty(),
            Core.vx_new_string("Egyptian Dynasty"),
            Ancients.f_chapter_egyptian_dynasty(),
            Core.vx_new_string("Germanic Tribes"),
            Ancients.f_chapter_germanic_tribes(),
            Core.vx_new_string("Greek City States"),
            Ancients.f_chapter_greek_city_states(),
            Core.vx_new_string("Macedon"),
            Ancients.f_chapter_macedon(),
            Core.vx_new_string("Norsemen"),
            Ancients.f_chapter_norsemen(),
            Core.vx_new_string("Persians"),
            Ancients.f_chapter_persians(),
            Core.vx_new_string("Roman Empire"),
            Ancients.f_chapter_roman_empire(),
            Core.vx_new_string("Unfiled Ancient"),
            Ancients.f_chapter_unfiled_ancient()
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
    mapfunc.put("chapter_ancients_overview", Ancients.t_chapter_ancients_overview);
    mapfunc.put("chapter_ancients_scenarios", Ancients.t_chapter_ancients_scenarios);
    mapfunc.put("chapter_anglo_saxons", Ancients.t_chapter_anglo_saxons);
    mapfunc.put("chapter_carthaginians", Ancients.t_chapter_carthaginians);
    mapfunc.put("chapter_chinese_dynasty", Ancients.t_chapter_chinese_dynasty);
    mapfunc.put("chapter_egyptian_dynasty", Ancients.t_chapter_egyptian_dynasty);
    mapfunc.put("chapter_germanic_tribes", Ancients.t_chapter_germanic_tribes);
    mapfunc.put("chapter_greek_city_states", Ancients.t_chapter_greek_city_states);
    mapfunc.put("chapter_macedon", Ancients.t_chapter_macedon);
    mapfunc.put("chapter_norsemen", Ancients.t_chapter_norsemen);
    mapfunc.put("chapter_persians", Ancients.t_chapter_persians);
    mapfunc.put("chapter_roman_empire", Ancients.t_chapter_roman_empire);
    mapfunc.put("chapter_unfiled_ancient", Ancients.t_chapter_unfiled_ancient);
    mapfunc.put("tacticsbook", Ancients.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/ancients", maptype, mapconst, mapfunc);
  }

}
