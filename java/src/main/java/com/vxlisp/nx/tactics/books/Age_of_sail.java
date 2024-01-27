package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Age_of_sail {

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
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Age of Sail Weaponry"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Sail Weaponry"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Renaissance"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Renaissance")
              )
            ),
            Core.vx_new_string("Golden Age of Sail"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Golden Age of Sail"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
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
                                        ),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("100mm Demi-culverin"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("100mm Demi-culverin"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("20")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
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
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
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
                                        ),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("100mm Demi-culverin"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("100mm Demi-culverin"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("100")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
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
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
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
                                        ),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("100mm Demi-culverin"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("100mm Demi-culverin"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("8")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
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
            ),
            Core.vx_new_string("American Revolution"),
            Core.f_new(
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
            ),
            Core.vx_new_string("French Revolution"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("French Revolution")
              )
            ),
            Core.vx_new_string("Tokugawa Shogunate"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Tokugawa Shogunate"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
    mapfunc.put("tacticsbook", Age_of_sail.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/age_of_sail", maptype, mapconst, mapfunc);
  }

}
