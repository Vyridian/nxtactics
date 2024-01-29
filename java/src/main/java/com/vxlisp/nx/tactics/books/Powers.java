package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Powers {

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
            Core.f_new(
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
            ),
            Core.vx_new_string("Special Modifiers"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Special Modifiers"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Special Powers"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Special Powers"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            )
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
    mapfunc.put("tacticsbook", Powers.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/powers", maptype, mapconst, mapfunc);
  }

}
