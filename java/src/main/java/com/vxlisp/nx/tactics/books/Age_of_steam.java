package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Age_of_steam {

  /**
   * @function bk
   * @return {book}
   * (func bk)
   */
  public static interface Func_bk extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_bk();
  }

  public static class Class_bk extends Core.Class_base implements Func_bk {

    @Override
    public Func_bk vx_new(Object... vals) {
      Class_bk output = new Class_bk();
      return output;
    }

    @Override
    public Func_bk vx_copy(Object... vals) {
      Class_bk output = new Class_bk();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_steam", // pkgname
        "bk", // name
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
    public Func_bk vx_empty() {return e_bk;}
    @Override
    public Func_bk vx_type() {return t_bk;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_steam.f_bk();
      return output;
    }

    @Override
    public Base.Type_book vx_bk() {
      return Age_of_steam.f_bk();
    }

  }

  public static final Func_bk e_bk = new Age_of_steam.Class_bk();
  public static final Func_bk t_bk = new Age_of_steam.Class_bk();

  public static Base.Type_book f_bk() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Age of Steam"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("WildWest.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Age of Steam Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Steam Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Why Tactics: Age of Steam?"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Why Tactics: Age of Steam?")
                      )
                    ),
                    Core.vx_new_string("Age of Steam Personal Combat"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Age of Steam Personal Combat"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Dueling\n* Civil War\n* Cowboys\n* Indians\n* Bandits\n* Cattle Rustlers\n* Marksman")
                      )
                    ),
                    Core.vx_new_string("Age of Steam Land Warfare"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Age of Steam Land Warfare"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Infantry\n* Cavalry\n* Pistols\n* Rifles\n* Cannons\n* Artillery\n* Gatling Guns\n* Trains")
                      )
                    ),
                    Core.vx_new_string("Age of Steam Naval Warfare"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Age of Steam Naval Warfare"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wind\n* Large Ships\n* Small Ships\n* Solid Shot\n* Burning Shot\n* Chain Shot")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Age of Steam Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Steam Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Age of Steam Weaponry"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Age of Steam Weaponry"),
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
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
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
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
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
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
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
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
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
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
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
                    ),
                    Core.vx_new_string("Steam Age Vehicles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Age Vehicles"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Horseless  Carriage"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Horseless  Carriage")
                              )
                            ),
                            Core.vx_new_string("Mailplane Biplane"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mailplane Biplane")
                              )
                            ),
                            Core.vx_new_string("Ocean Liner"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ocean Liner"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Liner, Steam Liner")
                              )
                            ),
                            Core.vx_new_string(":Stagecoach"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stagecoach")
                              )
                            ),
                            Core.vx_new_string("Steam Ferry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Steam Ferry")
                              )
                            ),
                            Core.vx_new_string("Steam Train Boxcar"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Steam Train Boxcar")
                              )
                            ),
                            Core.vx_new_string("Steam Train Caboose"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Steam Train Caboose")
                              )
                            ),
                            Core.vx_new_string("Steam Train Coach"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Steam Train Coach")
                              )
                            ),
                            Core.vx_new_string("Steam Train Locomotive"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Steam Train Locomotive")
                              )
                            ),
                            Core.vx_new_string("Steam Train Private Coach"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Steam Train Private Coach")
                              )
                            ),
                            Core.vx_new_string(":Steamboat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Steamboat")
                              )
                            ),
                            Core.vx_new_string("Tramp Freighter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tramp Freighter")
                              )
                            ),
                            Core.vx_new_string(":Zepplin"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zepplin"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dirigible")
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
            Core.vx_new_string("Steam Age Maps"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Steam Age Maps"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Steam Age Terrain"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Age Terrain"),
                        Core.vx_new_string(":rulemap"),
                        Core.f_new(
                          Base.t_rulemap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Mine"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mine")
                              )
                            ),
                            Core.vx_new_string(":Tumbleweed"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tumbleweed")
                              )
                            ),
                            Core.vx_new_string("Western Town"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Western Town")
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
            Core.vx_new_string("Civil War"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Civil War"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Civil War Scenarios"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Civil War Scenarios"),
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
                    ),
                    Core.vx_new_string("Confederate Army"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Confederate Army"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Confederate Cannon"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Confederate Cannon")
                              )
                            ),
                            Core.vx_new_string("Confederate Conscript"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Confederate Conscript")
                              )
                            ),
                            Core.vx_new_string("Confederate Gatling Gunner"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Confederate Gatling Gunner")
                              )
                            ),
                            Core.vx_new_string("Confederate Medic"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Confederate Medic")
                              )
                            ),
                            Core.vx_new_string("Confederate Officer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Confederate Officer")
                              )
                            ),
                            Core.vx_new_string("Confederate Veteran"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Confederate Veteran")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Confederate Navy"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Confederate Navy"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Merrimack"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Merrimack"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("CSS Virginia"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("4500tons"),
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
                                            Core.vx_new_string(":invalidproperty"),
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
                                                    Core.vx_new_string(":invalidproperty"),
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                                                    Core.vx_new_string(":invalidproperty"),
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                                                    Core.vx_new_string(":invalidproperty"),
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                    Core.vx_new_string("Union Army"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Union Army"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Union Cannon"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Union Cannon")
                              )
                            ),
                            Core.vx_new_string("Union Conscript"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Union Conscript")
                              )
                            ),
                            Core.vx_new_string("Union Gatling Gunner"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Union Gatling Gunner")
                              )
                            ),
                            Core.vx_new_string("Union Medic"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Union Medic")
                              )
                            ),
                            Core.vx_new_string("Union Officer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Union Officer")
                              )
                            ),
                            Core.vx_new_string("Union Veteran"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Union Veteran")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Union Navy"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Union Navy"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("USS Monitor"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("USS Monitor"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("1000tons"),
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
                                            Core.vx_new_string(":invalidproperty"),
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
                                                    Core.vx_new_string(":invalidproperty"),
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                                                    Core.vx_new_string(":invalidproperty"),
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                                                    Core.vx_new_string(":invalidproperty"),
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Victorian England"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Victorian England"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Victoraian Characters"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Victoraian Characters"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Dr. John Watson"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dr. John Watson")
                              )
                            ),
                            Core.vx_new_string("Herbert George Wells"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Herbert George Wells")
                              )
                            ),
                            Core.vx_new_string("Jack the Ripper"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jack the Ripper")
                              )
                            ),
                            Core.vx_new_string("Sherlock Holmes"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sherlock Holmes"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Watson: What made like this?\n* Sherlock: Oh, dear Watson. Nothing made me ... I made me.")
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
            Core.vx_new_string("Wild West"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Wild West"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Western Scenarios"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Western Scenarios"),
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
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Steam Age Outlaws"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Age Outlaws"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Bandito"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bandito"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Western/BanditoToken.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("You think you're better than I am?  Where we came from, if one did not want to die of poverty, one became a\npriest or a bandit! ...You became a priest because you were... too much of a coward to do what I do! - Tuco. The\nGood, the Bad, and the Ugly."),
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
                                            Core.vx_new_string(":invalidproperty"),
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                            ),
                            Core.vx_new_string(":Gunslinger"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gunslinger"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Western/GunslingerToken.png"),
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
                                            Core.vx_new_string(":invalidproperty"),
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                            ),
                            Core.vx_new_string("Man with No Name"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Man with No Name"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Western/ManWithNoNameToken.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* [to Tuco] Tut, tut. Such ingratitude after all the times I saved your life. - Blondie, The Good, the Bad, and\nthe Ugly\n* There are two kinds of people in the world...Those who have a loaded gun and those who dig. You dig! - Blondie,\nThe Good, the Bad, and the Ugly"),
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
                                            Core.vx_new_string(":invalidproperty"),
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                            ),
                            Core.vx_new_string("Professional Killer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Professional Killer"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Western/ProfessionalKiller.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("He paid me a thousand.  I think his idea was that I kill you.  But you know, the pity is when I'm paid, I always\nfollow my job through. - Angel Eyes, The Good, the Bad, and the Ugly"),
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
                                            Core.vx_new_string(":invalidproperty"),
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                    Core.vx_new_string("Steam Age Lawmen"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Age Lawmen"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Deputy"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deputy")
                              )
                            ),
                            Core.vx_new_string(":Sheriff"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sheriff")
                              )
                            ),
                            Core.vx_new_string("US Marshall"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("US Marshall"),
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                    Core.vx_new_string("Steam Age Indians"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Age Indians"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Sioux Gunfighter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sioux Gunfighter"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Western/IndianAxe.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Spotted Horse cannot be killed by a bullet! - Spotted Horse, The Quick and the Dead")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Steam Age Townsfolk"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Age Townsfolk"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Chinese Monk"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chinese Monk"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("I seek not to know the answers, but to understand the questions. - Kwai Chang Caine, Kung Fu TV Series")
                              )
                            ),
                            Core.vx_new_string("Chinese Rail worker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chinese Rail worker")
                              )
                            ),
                            Core.vx_new_string(":Cowboy"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cowboy")
                              )
                            ),
                            Core.vx_new_string(":Dentist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dentist")
                              )
                            ),
                            Core.vx_new_string(":Farmer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Farmer")
                              )
                            ),
                            Core.vx_new_string("General Store Owner"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("General Store Owner")
                              )
                            ),
                            Core.vx_new_string(":Judge"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Judge")
                              )
                            ),
                            Core.vx_new_string(":Preacher"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Preacher")
                              )
                            ),
                            Core.vx_new_string("Saloon Barkeep"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Saloon Barkeep")
                              )
                            ),
                            Core.vx_new_string(":Undertaker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Undertaker")
                              )
                            ),
                            Core.vx_new_string("Whore with a Heart of Gold"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Whore with a Heart of Gold")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Steam Age Travelers"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Age Travelers"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Carpet Bagger"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Carpet Bagger")
                              )
                            ),
                            Core.vx_new_string(":Gambler"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gambler"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("This is a very special pack.  See, I put an ace in every time I kill a man.  (The deck is all aces) - Ace, The Quick and the Dead")
                              )
                            ),
                            Core.vx_new_string(":Prospector"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prospector")
                              )
                            ),
                            Core.vx_new_string("Snake Oil Salesman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snake Oil Salesman")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Steam Age Tycoons"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Age Tycoons"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Banker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Banker")
                              )
                            ),
                            Core.vx_new_string("Land Baron"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Land Baron"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("All I hear from you...is how poor you are; how you can't afford my taxes.  Yet somehow, you managed to find the\nmoney to hire a gunfighter to kill me.  If ya got so much money, I'm just gonna have to take some more. - John\nHerod,  The Quick and the Dead"),
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
                                                    Core.vx_new_string(":severity"),
                                                    Core.vx_new_int(2)
                                                  )
                                                )
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
                            ),
                            Core.vx_new_string("Oil Baron"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Oil Baron")
                              )
                            ),
                            Core.vx_new_string("Railroad Tycoon"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Railroad Tycoon")
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
            Core.vx_new_string("Examples of Play"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Examples of Play"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Western Gunfight"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Western Gunfight"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Round 1 - Turn 1\nInitiative\nGunslinger player starts with the initiative, but the Marshall wants to 'Take the Initiative'\nEach Player rolls 2 dice.\n+1 for the player who currently holds initiative.\n+1 for highest skill.\n-1 if most Damaged or Stunned.\nA tie means simultaneous actions.\nGunslinger rolls 6 + 1 (holds initiative) = 7.\nMarshall rolls 8.  Marshall takes the initiative.\nMove\nMarshall is within range of his weapon, so chooses not to move to get the best chance to hit.\nAction\nFast Draw - Marshall is in weapon range and chooses to use Fast Draw to draw his weapon and fire.\nAttack - Fast Draw was a Free Action and Marshall chooses to fire.  He uses his Handgun Skill and any modifiers to determine attack dice.  5 (Handguns) +1 (Accuracy) - 1 (Hip Shoot) = 6 Dice\nMarshall rolls 6 dice and gets 1 (miss), 2 (miss), 2 (miss), 3 (miss), 5 (hit), and 6 (hit and bonus die).  He rolls the bonus die and gets another 6 (critical hit and bonus die).  He rolls the bonus die and gets a 3 (flag).\nMarshall's total roll is 1 hit, 1 critical, and a flag.\nDefense\nGunslinger now rolls dice equal to appropriate defense:  4 Body = 4 Dice\nGunslinger rolls 3 dice and gets 1 (miss), 3 (miss), 5 (hit), and 6 (hit and bonus die).  He rolls the bonus die and gets a 4 (critical hit).\nGunslinger's  total is 2 hits and 1 critical.\nGunslinger's 1 hit cancels one of  Marshall's hits and his 1 critical hit cancels one of Marshall's critical hits.  This leaves Marshall with only a single flag,  Gunslinger had rolled a second hit, but since it can only cancel other hits, it has no effect.\nEffects\nFlags - Gunslinger gains a Flag Token and must retreat one space for each flag.  He therefore retreats 1 space away from Marshall.\nAttack Damage - Since no damage was rolled, Marshall's turn is over.\nRound 1 - Turn 2\nInitiative\nGunslinger player regains the initiative.  Marshall has already taken a turn and cannot do so again this round.\nWhite Tokens - After initiative is determined, Gunslinger must remove a White Token if any.  He removes the Flag token.\nMove\nGunslinger was forced to back by the Flag but is still in his weapon's range, so he will not take an attack penalty.  However, if he moves closer he will take a penalty for moving, so he opts to stay still and fire.\nAction\nFast Draw - Gunslinger also uses Fast Draw to draw and fire.\nAttack - He uses his Handgun Skill and any modifiers to determine attack dice.  5 (Handguns) +1 (Accuracy)  -1 (Hip Shoot) = 5 Dice.\nGunslinger rolls 5 dice and gets 1 (miss), 3 (miss), 4 (hit), 5 (hit), and 5 (hit).  His total roll is 3 hits.  Nice.\nDefense\nMarshall now rolls dice equal to appropriate defense.  4 Body = 4 Dice.\nMarshall rolls 4 dice and gets 1 (miss), 1 (miss), 3 (miss), and 4 (hit).\nMarshall's total is 1 hit.\nMarshall cancels 1 of Gunslinger's hits.  This leaves Gunslinger with 2 hits.\nEffects\nDamage Rating - Since Gunslinger rolled at least 1 hit or critical hit (he scored 2), he checks the damage rating of his Schofield .45.  Its damage rating is 4.  If Gunslinger had rolled less than 4 dice, the Schofield would allow him to roll the difference in additional damage dice.  However, Gunslinger rolled 4 dice already, so he receives no additional dice.\nHits - The first hit is converted to a Stun Token.\nDamage - All subsequent hits are converted to Damage Tokens.\nDamage Summary - 1 Stun Token and 1 Damage Token.\nHit Location - Since we are using Hit Location and did some form of damage, roll 2 dice.  The first determines side of the body: 1-2 is left side, 3-4 is center, and 5-6 is right side.  The second die determines height on the body: 1-2 is low, 3-4 is middle, 5-6 is high.  Marshall rolls 6 (right), 2 (low): Right Shin/Foot.  The 1 Damage Token is therefore on Marshall's Right Shin.  This will limit his movement.\nTurn End\nRound End - Since all units have acted, the round ends.\nRound 2 - Turn 1\nInitiative\nMarshall has the initiative since Gunslinger player ended with the initiative, but Gunslinger predictably wants to 'Take the Initiative' back.  Marshall desperately needs to win initiative to recover a bit from the last hit.\nEach Player rolls 2 dice.\n+1 for the player who currently holds initiative.\n+1 for highest skill.\n-1 if most Damaged or Stunned.\nA tie means simultaneous actions.\nMarshall rolls 4 + 1 (holds initiative) -1 (most Damaged) = 4.\nGunslinger rolls 8 and takes the initiative.  Gunslinger grins.\nWhite Tokens - Gunslinger has no White Tokens.\nMove\nGunslinger presses his advantage and stays and fires hoping to finish this battle.\nAction\nSince their guns are already drawn, neither unit needs to fire from the hip anymore.\nAttack - Gunslinger determines attack dice.  5 (Handguns) +1 (Accuracy)  = 6 Dice.\nGunslinger rolls 6 dice and gets 1 (miss), 1 (miss), 3 (miss), 5 (hit), 5 (hit), and 6 (hit and bonus die).  He rolls the bonus and gets 1 (flag).  His total roll is 3 hits and a flag.  Looking good.\nDefense\nMarshall now rolls dice equal to appropriate defense.  4 Body -1 (Damage) -1 (Stun) = 2 Dice.  Need some good rolls about now.\nMarshall rolls 2 dice and gets 1 (miss) and 1 (miss).  Nothing.\nMarshall is hit dead-on by the Gunslinger.\nEffects\nDamage Rating - Since Gunslinger rolled at least 1 hit or critical hit (he scored 3), he checks the damage rating of his Schofield .45.  Its damage rating is 4 is not more than his 6 dice rolled so no additional dice.\nHits - The first hit is converted to a Stun Token.\nDamage - All subsequent hits are converted to Damage Tokens.\nDamage Summary - 1 Stun Token and 2 Damage Tokens.\nHit Location - Since we are using Hit Location and did some form of damage, roll 2 dice.  The first determines side of the body: 1-2 is left side, 3-4 is center, and 5-6 is right side.  The second die determines height on the body: 1-2 is low, 3-4 is middle, 5-6 is high.  Marshall rolls 2 (left), 4 (center): Left Thigh.  The 2 Damage Tokens are therefore on Marshall's Left Thigh.  This will limit his movement even more.\nDamage Total - 2 Stun Tokens and 3 Damage Tokens (1 on Right Shin, 2 on Left Thigh).  The total of -5 is greater than the Marshall's 4 Body, so he drops to the ground.\nRound 2 - Turn 2\nInitiative\nMarshall has the initiative since Gunslinger has already acted this round.\nWhite Tokens - Marshall removes a  White Token if any.  He removes 1 of the Stun tokens.\nMove\nMarshall is prone and has no Move left to even crawl (Move 4 - 1 (Stun) - 3 (Damage)).\nAction\nMarshall could attack with 5 (Handguns) + 1 (Accuracy) - 1 (Stun) - 3 (Damage) = 2 Dice, but he has no dice to defend next turn, he is Prone (+1) and Helpless (+1) for a total of 8 Gunslinger Dice against his own 0 Dice.  What's more the gunslinger doesn't have a scratch on him.\nThe duel is clearly over, and the Marshall drops his gun and begs for his life.")
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
    mapfunc.put("bk", Age_of_steam.t_bk);
    Core.vx_global_package_set("nx/tactics/books/age_of_steam", maptype, mapconst, mapfunc);
  }

}
