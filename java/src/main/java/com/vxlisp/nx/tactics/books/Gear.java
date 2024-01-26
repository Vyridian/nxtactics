package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Gear {

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
        "nx/tactics/books/gear", // pkgname
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
      output = Gear.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Gear.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Gear.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Gear.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Gear"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Gear Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gear Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Why Tactics: Gear?"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Why Tactics: Gear?")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Gear Construction"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gear Construction")
              )
            ),
            Core.vx_new_string("Gear Items"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gear Items"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Unfiled Gear"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Unfiled Gear"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Acid\n* Alabaster\n* Barricade\n* Blood\n* Cage\n* Chariot\n* Conch Horn\n* Fireworks\n* Trumpet\n* War Machine\n\n!Symbols\n* Banner\n* Coat of Arms\n* Crest\n* Crown\n* Fasces\n* Helix\n* Rod\n* Scepter\n* Signet\n* Standard\n* Thyrsus\n\n!Arcane Items\n* Airship\n* Armageddon Clock\n* Flying Carpet\n\n!Containers\n* Chest\n* Cauldron\n* Coffer\n* Goblet\n* Jar\n* Puzzle Box\n* Vat\n* Vessel\n\n!Technology\n* [Blinding Bulb]\n* [Phone Tap]]\n* [Shotgun Microphone]\n* [Sleepteacher]\n* [Subliminal Broadcaster]\n* [Surveillance Cameras]\n* [Telephoto Lens]"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Beast Claw"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Beast Claw")
                              )
                            ),
                            Core.vx_new_string(":Tooth"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tooth")
                              )
                            ),
                            Core.vx_new_string("Vampire Blood"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire Blood"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Black Token\n* Drinking Vampire Blood is addictive and creates a psychological dependency on the original Vampire called the [[Blood Bond]].\n* [Move] - Vampiric Healing - Remove a Vampire Blood Token and remove another Token of your choice.\n* [Move] - Vampiric Strength - Remove a Vampire Blood Token and gain +1 Melee for 3 turns.\n* [Move] - Vampiric Speed - Remove a Vampire Blood Token and gain +1 Initiative and +1 Move for 3 turns.\n* [Move] - Vampiric Fortitude - Remove a Vampire Blood Token and gain +1 Physical Armor for 3 turns.")
                              )
                            ),
                            Core.vx_new_string("Healing Salve"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Healing Salve")
                              )
                            ),
                            Core.vx_new_string(":Lattice"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lattice")
                              )
                            ),
                            Core.vx_new_string(":Mirror"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mirror")
                              )
                            ),
                            Core.vx_new_string(":Matrix"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Matrix")
                              )
                            ),
                            Core.vx_new_string(":Candle"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Candle")
                              )
                            ),
                            Core.vx_new_string(":Screen"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Screen")
                              )
                            ),
                            Core.vx_new_string(":Array"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Array")
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
    mapfunc.put("tacticsbook", Gear.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/gear", maptype, mapconst, mapfunc);
  }

}
