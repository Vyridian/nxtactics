package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Medieval {

  /**
   * @function chapter_medieval_english
   * @return {chapter}
   * (func chapter_medieval_english)
   */
  public static interface Func_chapter_medieval_english extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_medieval_english();
  }

  public static class Class_chapter_medieval_english extends Core.Class_base implements Func_chapter_medieval_english {

    @Override
    public Func_chapter_medieval_english vx_new(Object... vals) {
      Class_chapter_medieval_english output = new Class_chapter_medieval_english();
      return output;
    }

    @Override
    public Func_chapter_medieval_english vx_copy(Object... vals) {
      Class_chapter_medieval_english output = new Class_chapter_medieval_english();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/medieval", // pkgname
        "chapter_medieval_english", // name
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
    public Func_chapter_medieval_english vx_empty() {return e_chapter_medieval_english;}
    @Override
    public Func_chapter_medieval_english vx_type() {return t_chapter_medieval_english;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Medieval.f_chapter_medieval_english();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_medieval_english() {
      return Medieval.f_chapter_medieval_english();
    }

  }

  public static final Func_chapter_medieval_english e_chapter_medieval_english = new Medieval.Class_chapter_medieval_english();
  public static final Func_chapter_medieval_english t_chapter_medieval_english = new Medieval.Class_chapter_medieval_english();

  public static Base.Type_chapter f_chapter_medieval_english() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Medieval English"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Medieval English Infantry"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Medieval English Infantry"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("English Longbowman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("English Longbowman")
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
   * @function chapter_medieval_french
   * @return {chapter}
   * (func chapter_medieval_french)
   */
  public static interface Func_chapter_medieval_french extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_medieval_french();
  }

  public static class Class_chapter_medieval_french extends Core.Class_base implements Func_chapter_medieval_french {

    @Override
    public Func_chapter_medieval_french vx_new(Object... vals) {
      Class_chapter_medieval_french output = new Class_chapter_medieval_french();
      return output;
    }

    @Override
    public Func_chapter_medieval_french vx_copy(Object... vals) {
      Class_chapter_medieval_french output = new Class_chapter_medieval_french();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/medieval", // pkgname
        "chapter_medieval_french", // name
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
    public Func_chapter_medieval_french vx_empty() {return e_chapter_medieval_french;}
    @Override
    public Func_chapter_medieval_french vx_type() {return t_chapter_medieval_french;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Medieval.f_chapter_medieval_french();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_medieval_french() {
      return Medieval.f_chapter_medieval_french();
    }

  }

  public static final Func_chapter_medieval_french e_chapter_medieval_french = new Medieval.Class_chapter_medieval_french();
  public static final Func_chapter_medieval_french t_chapter_medieval_french = new Medieval.Class_chapter_medieval_french();

  public static Base.Type_chapter f_chapter_medieval_french() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Medieval French"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Medieval French Infantry"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Medieval French Infantry"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("French Gendarme"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("French Gendarme"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Founded in 1400s."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Cavalry")
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
   * @function chapter_medieval_german
   * @return {chapter}
   * (func chapter_medieval_german)
   */
  public static interface Func_chapter_medieval_german extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_medieval_german();
  }

  public static class Class_chapter_medieval_german extends Core.Class_base implements Func_chapter_medieval_german {

    @Override
    public Func_chapter_medieval_german vx_new(Object... vals) {
      Class_chapter_medieval_german output = new Class_chapter_medieval_german();
      return output;
    }

    @Override
    public Func_chapter_medieval_german vx_copy(Object... vals) {
      Class_chapter_medieval_german output = new Class_chapter_medieval_german();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/medieval", // pkgname
        "chapter_medieval_german", // name
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
    public Func_chapter_medieval_german vx_empty() {return e_chapter_medieval_german;}
    @Override
    public Func_chapter_medieval_german vx_type() {return t_chapter_medieval_german;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Medieval.f_chapter_medieval_german();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_medieval_german() {
      return Medieval.f_chapter_medieval_german();
    }

  }

  public static final Func_chapter_medieval_german e_chapter_medieval_german = new Medieval.Class_chapter_medieval_german();
  public static final Func_chapter_medieval_german t_chapter_medieval_german = new Medieval.Class_chapter_medieval_german();

  public static Base.Type_chapter f_chapter_medieval_german() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Medieval German")
      )
    );
    return output;
  }

  /**
   * @function chapter_medieval_items
   * @return {chapter}
   * (func chapter_medieval_items)
   */
  public static interface Func_chapter_medieval_items extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_medieval_items();
  }

  public static class Class_chapter_medieval_items extends Core.Class_base implements Func_chapter_medieval_items {

    @Override
    public Func_chapter_medieval_items vx_new(Object... vals) {
      Class_chapter_medieval_items output = new Class_chapter_medieval_items();
      return output;
    }

    @Override
    public Func_chapter_medieval_items vx_copy(Object... vals) {
      Class_chapter_medieval_items output = new Class_chapter_medieval_items();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/medieval", // pkgname
        "chapter_medieval_items", // name
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
    public Func_chapter_medieval_items vx_empty() {return e_chapter_medieval_items;}
    @Override
    public Func_chapter_medieval_items vx_type() {return t_chapter_medieval_items;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Medieval.f_chapter_medieval_items();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_medieval_items() {
      return Medieval.f_chapter_medieval_items();
    }

  }

  public static final Func_chapter_medieval_items e_chapter_medieval_items = new Medieval.Class_chapter_medieval_items();
  public static final Func_chapter_medieval_items t_chapter_medieval_items = new Medieval.Class_chapter_medieval_items();

  public static Base.Type_chapter f_chapter_medieval_items() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Medieval Items"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Medieval Firearms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Medieval Firearms"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("760mm Arquebus"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("760mm Arquebus"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("In terms of accuracy, the arquebus was unable to match the accuracy of a bow in the hands of a highly-skilled archer. However, the arquebus had a faster rate of fire than the most powerful crossbow, had a shorter learning curve than a longbow, and was more powerful than either. An arquebusier could carry more ammunition and powder than a crossbowman or longbowman could with bolts or arrows. Once the methods were developed, powder and shot were relatively easy to mass-produce, while arrow making was a genuine craft requiring highly skilled labor. The weapon also had the added advantage of frightening enemies (and horses) with the noise. Wind can reduce the accuracy of archery, but has much less of an effect on an arquebusier. Perhaps most important, producing an effective arquebusier required much less training than producing an effective bowman.\n\nAs low-velocity firearms, they were used against enemies that were often partially or fully protected by steel-plate armour. Plate armour was standard in European combat from about 1400 until the middle of the 17th century. Good suits of plate would usually stop an arquebus ball at long range. It was a common practice to 'proof' (test) armour by firing a pistol or arquebus at a new breastplate. The small dent would be circled by engraving, to call attention to it. However, at close range, it was possible to pierce even the armor of knights and other heavy cavalry,"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("449m/s")
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
   * @function chapter_medieval_overview
   * @return {chapter}
   * (func chapter_medieval_overview)
   */
  public static interface Func_chapter_medieval_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_medieval_overview();
  }

  public static class Class_chapter_medieval_overview extends Core.Class_base implements Func_chapter_medieval_overview {

    @Override
    public Func_chapter_medieval_overview vx_new(Object... vals) {
      Class_chapter_medieval_overview output = new Class_chapter_medieval_overview();
      return output;
    }

    @Override
    public Func_chapter_medieval_overview vx_copy(Object... vals) {
      Class_chapter_medieval_overview output = new Class_chapter_medieval_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/medieval", // pkgname
        "chapter_medieval_overview", // name
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
    public Func_chapter_medieval_overview vx_empty() {return e_chapter_medieval_overview;}
    @Override
    public Func_chapter_medieval_overview vx_type() {return t_chapter_medieval_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Medieval.f_chapter_medieval_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_medieval_overview() {
      return Medieval.f_chapter_medieval_overview();
    }

  }

  public static final Func_chapter_medieval_overview e_chapter_medieval_overview = new Medieval.Class_chapter_medieval_overview();
  public static final Func_chapter_medieval_overview t_chapter_medieval_overview = new Medieval.Class_chapter_medieval_overview();

  public static Base.Type_chapter f_chapter_medieval_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Medieval Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Medieval?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Medieval?")
              )
            ),
            Core.vx_new_string("Medieval Land Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Medieval Land Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Infantry\n* Formations\n* Axemen\n* Polearms\n* Cavalry\n* Horse Archers\n* Armored Cavalry\n* Knights\n* Elephants\n* Chariots\n* Archers\n* Longbows\n* Crossbows\n* Siege\n* Ballista\n* Catapult\n* Fortifications")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_medieval_scenarios
   * @return {chapter}
   * (func chapter_medieval_scenarios)
   */
  public static interface Func_chapter_medieval_scenarios extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_medieval_scenarios();
  }

  public static class Class_chapter_medieval_scenarios extends Core.Class_base implements Func_chapter_medieval_scenarios {

    @Override
    public Func_chapter_medieval_scenarios vx_new(Object... vals) {
      Class_chapter_medieval_scenarios output = new Class_chapter_medieval_scenarios();
      return output;
    }

    @Override
    public Func_chapter_medieval_scenarios vx_copy(Object... vals) {
      Class_chapter_medieval_scenarios output = new Class_chapter_medieval_scenarios();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/medieval", // pkgname
        "chapter_medieval_scenarios", // name
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
    public Func_chapter_medieval_scenarios vx_empty() {return e_chapter_medieval_scenarios;}
    @Override
    public Func_chapter_medieval_scenarios vx_type() {return t_chapter_medieval_scenarios;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Medieval.f_chapter_medieval_scenarios();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_medieval_scenarios() {
      return Medieval.f_chapter_medieval_scenarios();
    }

  }

  public static final Func_chapter_medieval_scenarios e_chapter_medieval_scenarios = new Medieval.Class_chapter_medieval_scenarios();
  public static final Func_chapter_medieval_scenarios t_chapter_medieval_scenarios = new Medieval.Class_chapter_medieval_scenarios();

  public static Base.Type_chapter f_chapter_medieval_scenarios() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Medieval Scenarios"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Medieval Events"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Medieval Events"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Assassination"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Assassination")
                      )
                    ),
                    Core.vx_new_string("Bandit Raid"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bandit Raid"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Seven Samurai")
                      )
                    ),
                    Core.vx_new_string(":Battle"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Battle")
                      )
                    ),
                    Core.vx_new_string(":Ceremony"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ceremony")
                      )
                    ),
                    Core.vx_new_string(":Contest"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Contest")
                      )
                    ),
                    Core.vx_new_string(":Courier"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Courier")
                      )
                    ),
                    Core.vx_new_string(":Deserters"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Deserters")
                      )
                    ),
                    Core.vx_new_string(":Duel"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duel")
                      )
                    ),
                    Core.vx_new_string("Empty Battlefield"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Empty Battlefield")
                      )
                    ),
                    Core.vx_new_string(":Escort"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Escort")
                      )
                    ),
                    Core.vx_new_string("Fist Fight"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fist Fight")
                      )
                    ),
                    Core.vx_new_string(":Highwaymen"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Highwaymen")
                      )
                    ),
                    Core.vx_new_string(":Hunt"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hunt")
                      )
                    ),
                    Core.vx_new_string("Noble Hunt"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Noble Hunt")
                      )
                    ),
                    Core.vx_new_string("Noble Party"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Noble Party"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Cinderella")
                      )
                    ),
                    Core.vx_new_string("Peasant Demonstration"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Peasant Demonstration"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Put down or support minor uprisings.")
                      )
                    ),
                    Core.vx_new_string("Peasant Discontent"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Peasant Discontent"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Put down or support minor uprisings.")
                      )
                    ),
                    Core.vx_new_string("Peasant Uprising"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Peasant Uprising"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Put down or support a major uprising.")
                      )
                    ),
                    Core.vx_new_string(":Quest"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quest")
                      )
                    ),
                    Core.vx_new_string("Scouting Mission"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scouting Mission")
                      )
                    ),
                    Core.vx_new_string(":Spying"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spying")
                      )
                    ),
                    Core.vx_new_string("Visiting Dignitary"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Visiting Dignitary")
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
   * @function chapter_medieval_spanish
   * @return {chapter}
   * (func chapter_medieval_spanish)
   */
  public static interface Func_chapter_medieval_spanish extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_medieval_spanish();
  }

  public static class Class_chapter_medieval_spanish extends Core.Class_base implements Func_chapter_medieval_spanish {

    @Override
    public Func_chapter_medieval_spanish vx_new(Object... vals) {
      Class_chapter_medieval_spanish output = new Class_chapter_medieval_spanish();
      return output;
    }

    @Override
    public Func_chapter_medieval_spanish vx_copy(Object... vals) {
      Class_chapter_medieval_spanish output = new Class_chapter_medieval_spanish();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/medieval", // pkgname
        "chapter_medieval_spanish", // name
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
    public Func_chapter_medieval_spanish vx_empty() {return e_chapter_medieval_spanish;}
    @Override
    public Func_chapter_medieval_spanish vx_type() {return t_chapter_medieval_spanish;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Medieval.f_chapter_medieval_spanish();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_medieval_spanish() {
      return Medieval.f_chapter_medieval_spanish();
    }

  }

  public static final Func_chapter_medieval_spanish e_chapter_medieval_spanish = new Medieval.Class_chapter_medieval_spanish();
  public static final Func_chapter_medieval_spanish t_chapter_medieval_spanish = new Medieval.Class_chapter_medieval_spanish();

  public static Base.Type_chapter f_chapter_medieval_spanish() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Medieval Spanish")
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
        "nx/tactics/books/medieval", // pkgname
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
      output = Medieval.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Medieval.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Medieval.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Medieval.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Medieval"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Medieval-2-Total-War-Kingdoms-642.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Medieval Overview"),
            Medieval.f_chapter_medieval_overview(),
            Core.vx_new_string("Medieval Scenarios"),
            Medieval.f_chapter_medieval_scenarios(),
            Core.vx_new_string("Medieval Items"),
            Medieval.f_chapter_medieval_items(),
            Core.vx_new_string("Medieval English"),
            Medieval.f_chapter_medieval_english(),
            Core.vx_new_string("Medieval French"),
            Medieval.f_chapter_medieval_french(),
            Core.vx_new_string("Medieval German"),
            Medieval.f_chapter_medieval_german(),
            Core.vx_new_string("Medieval Spanish"),
            Medieval.f_chapter_medieval_spanish()
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
    mapfunc.put("chapter_medieval_english", Medieval.t_chapter_medieval_english);
    mapfunc.put("chapter_medieval_french", Medieval.t_chapter_medieval_french);
    mapfunc.put("chapter_medieval_german", Medieval.t_chapter_medieval_german);
    mapfunc.put("chapter_medieval_items", Medieval.t_chapter_medieval_items);
    mapfunc.put("chapter_medieval_overview", Medieval.t_chapter_medieval_overview);
    mapfunc.put("chapter_medieval_scenarios", Medieval.t_chapter_medieval_scenarios);
    mapfunc.put("chapter_medieval_spanish", Medieval.t_chapter_medieval_spanish);
    mapfunc.put("tacticsbook", Medieval.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/medieval", maptype, mapconst, mapfunc);
  }

}
