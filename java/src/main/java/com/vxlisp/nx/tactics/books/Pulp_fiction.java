package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Pulp_fiction {

  /**
   * @function chapter_action_adventure
   * @return {chapter}
   * (func chapter_action_adventure)
   */
  public static interface Func_chapter_action_adventure extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_action_adventure();
  }

  public static class Class_chapter_action_adventure extends Core.Class_base implements Func_chapter_action_adventure {

    @Override
    public Func_chapter_action_adventure vx_new(Object... vals) {
      Class_chapter_action_adventure output = new Class_chapter_action_adventure();
      return output;
    }

    @Override
    public Func_chapter_action_adventure vx_copy(Object... vals) {
      Class_chapter_action_adventure output = new Class_chapter_action_adventure();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/pulp_fiction", // pkgname
        "chapter_action_adventure", // name
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
    public Func_chapter_action_adventure vx_empty() {return e_chapter_action_adventure;}
    @Override
    public Func_chapter_action_adventure vx_type() {return t_chapter_action_adventure;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Pulp_fiction.f_chapter_action_adventure();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_action_adventure() {
      return Pulp_fiction.f_chapter_action_adventure();
    }

  }

  public static final Func_chapter_action_adventure e_chapter_action_adventure = new Pulp_fiction.Class_chapter_action_adventure();
  public static final Func_chapter_action_adventure t_chapter_action_adventure = new Pulp_fiction.Class_chapter_action_adventure();

  public static Base.Type_chapter f_chapter_action_adventure() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Action/Adventure"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Government Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Government Units"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Government Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Government Agent"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("We have top men working on it now.  Who?  Top... men. - Raiders of the Lost Ark")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Treasure Hunters"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Treasure Hunters"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Indiana Jones"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Indiana Jones"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("PulpFiction/IndianaJones.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Knowledge"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knowledge"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Antiquities"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Antiquities")
                                      )
                                    ),
                                    Core.vx_new_string(":Archeology"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Archeology")
                                      )
                                    ),
                                    Core.vx_new_string("Ancient History"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Ancient History")
                                      )
                                    ),
                                    Core.vx_new_string("Religious Studies"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Religious Studies")
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
                    Core.vx_new_string("Lara Croft"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lara Croft"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("PulpFiction/LaraCroft.png"),
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
   * @function chapter_flash_gordon
   * @return {chapter}
   * (func chapter_flash_gordon)
   */
  public static interface Func_chapter_flash_gordon extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_flash_gordon();
  }

  public static class Class_chapter_flash_gordon extends Core.Class_base implements Func_chapter_flash_gordon {

    @Override
    public Func_chapter_flash_gordon vx_new(Object... vals) {
      Class_chapter_flash_gordon output = new Class_chapter_flash_gordon();
      return output;
    }

    @Override
    public Func_chapter_flash_gordon vx_copy(Object... vals) {
      Class_chapter_flash_gordon output = new Class_chapter_flash_gordon();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/pulp_fiction", // pkgname
        "chapter_flash_gordon", // name
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
    public Func_chapter_flash_gordon vx_empty() {return e_chapter_flash_gordon;}
    @Override
    public Func_chapter_flash_gordon vx_type() {return t_chapter_flash_gordon;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Pulp_fiction.f_chapter_flash_gordon();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_flash_gordon() {
      return Pulp_fiction.f_chapter_flash_gordon();
    }

  }

  public static final Func_chapter_flash_gordon e_chapter_flash_gordon = new Pulp_fiction.Class_chapter_flash_gordon();
  public static final Func_chapter_flash_gordon t_chapter_flash_gordon = new Pulp_fiction.Class_chapter_flash_gordon();

  public static Base.Type_chapter f_chapter_flash_gordon() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Flash Gordon")
      )
    );
    return output;
  }

  /**
   * @function chapter_hardboiled_detective
   * @return {chapter}
   * (func chapter_hardboiled_detective)
   */
  public static interface Func_chapter_hardboiled_detective extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_hardboiled_detective();
  }

  public static class Class_chapter_hardboiled_detective extends Core.Class_base implements Func_chapter_hardboiled_detective {

    @Override
    public Func_chapter_hardboiled_detective vx_new(Object... vals) {
      Class_chapter_hardboiled_detective output = new Class_chapter_hardboiled_detective();
      return output;
    }

    @Override
    public Func_chapter_hardboiled_detective vx_copy(Object... vals) {
      Class_chapter_hardboiled_detective output = new Class_chapter_hardboiled_detective();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/pulp_fiction", // pkgname
        "chapter_hardboiled_detective", // name
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
    public Func_chapter_hardboiled_detective vx_empty() {return e_chapter_hardboiled_detective;}
    @Override
    public Func_chapter_hardboiled_detective vx_type() {return t_chapter_hardboiled_detective;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Pulp_fiction.f_chapter_hardboiled_detective();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_hardboiled_detective() {
      return Pulp_fiction.f_chapter_hardboiled_detective();
    }

  }

  public static final Func_chapter_hardboiled_detective e_chapter_hardboiled_detective = new Pulp_fiction.Class_chapter_hardboiled_detective();
  public static final Func_chapter_hardboiled_detective t_chapter_hardboiled_detective = new Pulp_fiction.Class_chapter_hardboiled_detective();

  public static Base.Type_chapter f_chapter_hardboiled_detective() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Hardboiled Detective")
      )
    );
    return output;
  }

  /**
   * @function chapter_john_carter_on_mars
   * @return {chapter}
   * (func chapter_john_carter_on_mars)
   */
  public static interface Func_chapter_john_carter_on_mars extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_john_carter_on_mars();
  }

  public static class Class_chapter_john_carter_on_mars extends Core.Class_base implements Func_chapter_john_carter_on_mars {

    @Override
    public Func_chapter_john_carter_on_mars vx_new(Object... vals) {
      Class_chapter_john_carter_on_mars output = new Class_chapter_john_carter_on_mars();
      return output;
    }

    @Override
    public Func_chapter_john_carter_on_mars vx_copy(Object... vals) {
      Class_chapter_john_carter_on_mars output = new Class_chapter_john_carter_on_mars();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/pulp_fiction", // pkgname
        "chapter_john_carter_on_mars", // name
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
    public Func_chapter_john_carter_on_mars vx_empty() {return e_chapter_john_carter_on_mars;}
    @Override
    public Func_chapter_john_carter_on_mars vx_type() {return t_chapter_john_carter_on_mars;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Pulp_fiction.f_chapter_john_carter_on_mars();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_john_carter_on_mars() {
      return Pulp_fiction.f_chapter_john_carter_on_mars();
    }

  }

  public static final Func_chapter_john_carter_on_mars e_chapter_john_carter_on_mars = new Pulp_fiction.Class_chapter_john_carter_on_mars();
  public static final Func_chapter_john_carter_on_mars t_chapter_john_carter_on_mars = new Pulp_fiction.Class_chapter_john_carter_on_mars();

  public static Base.Type_chapter f_chapter_john_carter_on_mars() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("John Carter on Mars")
      )
    );
    return output;
  }

  /**
   * @function chapter_land_of_the_lost
   * @return {chapter}
   * (func chapter_land_of_the_lost)
   */
  public static interface Func_chapter_land_of_the_lost extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_land_of_the_lost();
  }

  public static class Class_chapter_land_of_the_lost extends Core.Class_base implements Func_chapter_land_of_the_lost {

    @Override
    public Func_chapter_land_of_the_lost vx_new(Object... vals) {
      Class_chapter_land_of_the_lost output = new Class_chapter_land_of_the_lost();
      return output;
    }

    @Override
    public Func_chapter_land_of_the_lost vx_copy(Object... vals) {
      Class_chapter_land_of_the_lost output = new Class_chapter_land_of_the_lost();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/pulp_fiction", // pkgname
        "chapter_land_of_the_lost", // name
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
    public Func_chapter_land_of_the_lost vx_empty() {return e_chapter_land_of_the_lost;}
    @Override
    public Func_chapter_land_of_the_lost vx_type() {return t_chapter_land_of_the_lost;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Pulp_fiction.f_chapter_land_of_the_lost();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_land_of_the_lost() {
      return Pulp_fiction.f_chapter_land_of_the_lost();
    }

  }

  public static final Func_chapter_land_of_the_lost e_chapter_land_of_the_lost = new Pulp_fiction.Class_chapter_land_of_the_lost();
  public static final Func_chapter_land_of_the_lost t_chapter_land_of_the_lost = new Pulp_fiction.Class_chapter_land_of_the_lost();

  public static Base.Type_chapter f_chapter_land_of_the_lost() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Land of the Lost"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Land of the Lost Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Land of the Lost Units"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Pylon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pylon")
                      )
                    ),
                    Core.vx_new_string(":Skylon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skylon")
                      )
                    ),
                    Core.vx_new_string(":Enik"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Enik")
                      )
                    ),
                    Core.vx_new_string(":Pakuni"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pakuni")
                      )
                    ),
                    Core.vx_new_string(":Sleestak"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sleestak")
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
   * @function chapter_lost_continent
   * @return {chapter}
   * (func chapter_lost_continent)
   */
  public static interface Func_chapter_lost_continent extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_lost_continent();
  }

  public static class Class_chapter_lost_continent extends Core.Class_base implements Func_chapter_lost_continent {

    @Override
    public Func_chapter_lost_continent vx_new(Object... vals) {
      Class_chapter_lost_continent output = new Class_chapter_lost_continent();
      return output;
    }

    @Override
    public Func_chapter_lost_continent vx_copy(Object... vals) {
      Class_chapter_lost_continent output = new Class_chapter_lost_continent();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/pulp_fiction", // pkgname
        "chapter_lost_continent", // name
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
    public Func_chapter_lost_continent vx_empty() {return e_chapter_lost_continent;}
    @Override
    public Func_chapter_lost_continent vx_type() {return t_chapter_lost_continent;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Pulp_fiction.f_chapter_lost_continent();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_lost_continent() {
      return Pulp_fiction.f_chapter_lost_continent();
    }

  }

  public static final Func_chapter_lost_continent e_chapter_lost_continent = new Pulp_fiction.Class_chapter_lost_continent();
  public static final Func_chapter_lost_continent t_chapter_lost_continent = new Pulp_fiction.Class_chapter_lost_continent();

  public static Base.Type_chapter f_chapter_lost_continent() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Lost Continent")
      )
    );
    return output;
  }

  /**
   * @function chapter_pulp_fiction_overview
   * @return {chapter}
   * (func chapter_pulp_fiction_overview)
   */
  public static interface Func_chapter_pulp_fiction_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_pulp_fiction_overview();
  }

  public static class Class_chapter_pulp_fiction_overview extends Core.Class_base implements Func_chapter_pulp_fiction_overview {

    @Override
    public Func_chapter_pulp_fiction_overview vx_new(Object... vals) {
      Class_chapter_pulp_fiction_overview output = new Class_chapter_pulp_fiction_overview();
      return output;
    }

    @Override
    public Func_chapter_pulp_fiction_overview vx_copy(Object... vals) {
      Class_chapter_pulp_fiction_overview output = new Class_chapter_pulp_fiction_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/pulp_fiction", // pkgname
        "chapter_pulp_fiction_overview", // name
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
    public Func_chapter_pulp_fiction_overview vx_empty() {return e_chapter_pulp_fiction_overview;}
    @Override
    public Func_chapter_pulp_fiction_overview vx_type() {return t_chapter_pulp_fiction_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Pulp_fiction.f_chapter_pulp_fiction_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_pulp_fiction_overview() {
      return Pulp_fiction.f_chapter_pulp_fiction_overview();
    }

  }

  public static final Func_chapter_pulp_fiction_overview e_chapter_pulp_fiction_overview = new Pulp_fiction.Class_chapter_pulp_fiction_overview();
  public static final Func_chapter_pulp_fiction_overview t_chapter_pulp_fiction_overview = new Pulp_fiction.Class_chapter_pulp_fiction_overview();

  public static Base.Type_chapter f_chapter_pulp_fiction_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Pulp Fiction Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Pulp Fiction?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Pulp Fiction?")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_true_grit___crime
   * @return {chapter}
   * (func chapter_true_grit___crime)
   */
  public static interface Func_chapter_true_grit___crime extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_true_grit___crime();
  }

  public static class Class_chapter_true_grit___crime extends Core.Class_base implements Func_chapter_true_grit___crime {

    @Override
    public Func_chapter_true_grit___crime vx_new(Object... vals) {
      Class_chapter_true_grit___crime output = new Class_chapter_true_grit___crime();
      return output;
    }

    @Override
    public Func_chapter_true_grit___crime vx_copy(Object... vals) {
      Class_chapter_true_grit___crime output = new Class_chapter_true_grit___crime();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/pulp_fiction", // pkgname
        "chapter_true_grit___crime", // name
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
    public Func_chapter_true_grit___crime vx_empty() {return e_chapter_true_grit___crime;}
    @Override
    public Func_chapter_true_grit___crime vx_type() {return t_chapter_true_grit___crime;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Pulp_fiction.f_chapter_true_grit___crime();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_true_grit___crime() {
      return Pulp_fiction.f_chapter_true_grit___crime();
    }

  }

  public static final Func_chapter_true_grit___crime e_chapter_true_grit___crime = new Pulp_fiction.Class_chapter_true_grit___crime();
  public static final Func_chapter_true_grit___crime t_chapter_true_grit___crime = new Pulp_fiction.Class_chapter_true_grit___crime();

  public static Base.Type_chapter f_chapter_true_grit___crime() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("True Grit / Crime")
      )
    );
    return output;
  }

  /**
   * @function chapter_war_of_the_worlds
   * @return {chapter}
   * (func chapter_war_of_the_worlds)
   */
  public static interface Func_chapter_war_of_the_worlds extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_war_of_the_worlds();
  }

  public static class Class_chapter_war_of_the_worlds extends Core.Class_base implements Func_chapter_war_of_the_worlds {

    @Override
    public Func_chapter_war_of_the_worlds vx_new(Object... vals) {
      Class_chapter_war_of_the_worlds output = new Class_chapter_war_of_the_worlds();
      return output;
    }

    @Override
    public Func_chapter_war_of_the_worlds vx_copy(Object... vals) {
      Class_chapter_war_of_the_worlds output = new Class_chapter_war_of_the_worlds();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/pulp_fiction", // pkgname
        "chapter_war_of_the_worlds", // name
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
    public Func_chapter_war_of_the_worlds vx_empty() {return e_chapter_war_of_the_worlds;}
    @Override
    public Func_chapter_war_of_the_worlds vx_type() {return t_chapter_war_of_the_worlds;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Pulp_fiction.f_chapter_war_of_the_worlds();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_war_of_the_worlds() {
      return Pulp_fiction.f_chapter_war_of_the_worlds();
    }

  }

  public static final Func_chapter_war_of_the_worlds e_chapter_war_of_the_worlds = new Pulp_fiction.Class_chapter_war_of_the_worlds();
  public static final Func_chapter_war_of_the_worlds t_chapter_war_of_the_worlds = new Pulp_fiction.Class_chapter_war_of_the_worlds();

  public static Base.Type_chapter f_chapter_war_of_the_worlds() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("War of the Worlds")
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
        "nx/tactics/books/pulp_fiction", // pkgname
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
      output = Pulp_fiction.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Pulp_fiction.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Pulp_fiction.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Pulp_fiction.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Pulp Fiction"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Pulp Fiction Overview"),
            Pulp_fiction.f_chapter_pulp_fiction_overview(),
            Core.vx_new_string("Action/Adventure"),
            Pulp_fiction.f_chapter_action_adventure(),
            Core.vx_new_string("Flash Gordon"),
            Pulp_fiction.f_chapter_flash_gordon(),
            Core.vx_new_string("Hardboiled Detective"),
            Pulp_fiction.f_chapter_hardboiled_detective(),
            Core.vx_new_string("John Carter on Mars"),
            Pulp_fiction.f_chapter_john_carter_on_mars(),
            Core.vx_new_string("Land of the Lost"),
            Pulp_fiction.f_chapter_land_of_the_lost(),
            Core.vx_new_string("Lost Continent"),
            Pulp_fiction.f_chapter_lost_continent(),
            Core.vx_new_string("True Grit / Crime"),
            Pulp_fiction.f_chapter_true_grit___crime(),
            Core.vx_new_string("War of the Worlds"),
            Pulp_fiction.f_chapter_war_of_the_worlds()
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
    mapfunc.put("chapter_action_adventure", Pulp_fiction.t_chapter_action_adventure);
    mapfunc.put("chapter_flash_gordon", Pulp_fiction.t_chapter_flash_gordon);
    mapfunc.put("chapter_hardboiled_detective", Pulp_fiction.t_chapter_hardboiled_detective);
    mapfunc.put("chapter_john_carter_on_mars", Pulp_fiction.t_chapter_john_carter_on_mars);
    mapfunc.put("chapter_land_of_the_lost", Pulp_fiction.t_chapter_land_of_the_lost);
    mapfunc.put("chapter_lost_continent", Pulp_fiction.t_chapter_lost_continent);
    mapfunc.put("chapter_pulp_fiction_overview", Pulp_fiction.t_chapter_pulp_fiction_overview);
    mapfunc.put("chapter_true_grit___crime", Pulp_fiction.t_chapter_true_grit___crime);
    mapfunc.put("chapter_war_of_the_worlds", Pulp_fiction.t_chapter_war_of_the_worlds);
    mapfunc.put("tacticsbook", Pulp_fiction.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/pulp_fiction", maptype, mapconst, mapfunc);
  }

}
