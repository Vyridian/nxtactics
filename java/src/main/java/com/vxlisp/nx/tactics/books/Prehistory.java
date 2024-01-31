package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Prehistory {

  /**
   * @function chapter_prehistoric_creatures
   * @return {chapter}
   * (func chapter_prehistoric_creatures)
   */
  public static interface Func_chapter_prehistoric_creatures extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_prehistoric_creatures();
  }

  public static class Class_chapter_prehistoric_creatures extends Core.Class_base implements Func_chapter_prehistoric_creatures {

    @Override
    public Func_chapter_prehistoric_creatures vx_new(Object... vals) {
      Class_chapter_prehistoric_creatures output = new Class_chapter_prehistoric_creatures();
      return output;
    }

    @Override
    public Func_chapter_prehistoric_creatures vx_copy(Object... vals) {
      Class_chapter_prehistoric_creatures output = new Class_chapter_prehistoric_creatures();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/prehistory", // pkgname
        "chapter_prehistoric_creatures", // name
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
    public Func_chapter_prehistoric_creatures vx_empty() {return e_chapter_prehistoric_creatures;}
    @Override
    public Func_chapter_prehistoric_creatures vx_type() {return t_chapter_prehistoric_creatures;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Prehistory.f_chapter_prehistoric_creatures();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_prehistoric_creatures() {
      return Prehistory.f_chapter_prehistoric_creatures();
    }

  }

  public static final Func_chapter_prehistoric_creatures e_chapter_prehistoric_creatures = new Prehistory.Class_chapter_prehistoric_creatures();
  public static final Func_chapter_prehistoric_creatures t_chapter_prehistoric_creatures = new Prehistory.Class_chapter_prehistoric_creatures();

  public static Base.Type_chapter f_chapter_prehistoric_creatures() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Prehistoric Creatures"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Dinosaurs"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Dinosaurs"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Allosaurus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Allosaurus")
                      )
                    ),
                    Core.vx_new_string(":Ankylosaur"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ankylosaur")
                      )
                    ),
                    Core.vx_new_string("Brontosaur (Apatosaurus)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brontosaur (Apatosaurus)")
                      )
                    ),
                    Core.vx_new_string(":Protoceratops"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Protoceratops")
                      )
                    ),
                    Core.vx_new_string(":Stegosaurus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stegosaurus")
                      )
                    ),
                    Core.vx_new_string(":Triceratops"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Triceratops")
                      )
                    ),
                    Core.vx_new_string(":Velociraptor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Velociraptor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Turkey sized carnivore"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Jaws of Death"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Jaws of Death")
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
                    Core.vx_new_string("Tyrannosaurus Rex"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tyrannosaurus Rex"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Jaws of Death"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Jaws of Death")
                                      )
                                    ),
                                    Core.vx_new_string("Swallow Whole"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Swallow Whole")
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
            Core.vx_new_string("Prehistoric Avian Creatures"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Prehistoric Avian Creatures"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Pterodactyl"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pterodactyl")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Prehistoric Insects"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Prehistoric Insects"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Giant Dragonfly"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Dragonfly")
                      )
                    ),
                    Core.vx_new_string("Giant Mosquito"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Mosquito")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Prehistoric Marine Creatures"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Prehistoric Marine Creatures"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Giant Gar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Gar")
                      )
                    ),
                    Core.vx_new_string("Giant Turtle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Turtle")
                      )
                    ),
                    Core.vx_new_string(":Megaladon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Megaladon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("70 ft shark.  Highly developed killing machine kills with no remorse, no pity, no feeling of satisfaction.  Their only apparent emotion is [[Bloodlust]]."),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Jaws of Death"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Jaws of Death")
                                      )
                                    ),
                                    Core.vx_new_string("Swallow Whole"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Swallow Whole")
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
                    Core.vx_new_string(":Plesiosaur"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Plesiosaur")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Prehistoric Mammals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Prehistoric Mammals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Megatherium"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Megatherium"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Elephant-sized ground sloth")
                      )
                    ),
                    Core.vx_new_string(":Sabrelion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sabrelion")
                      )
                    ),
                    Core.vx_new_string("Sabretooth Tiger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sabretooth Tiger")
                      )
                    ),
                    Core.vx_new_string("Woolly Mammoth"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Woolly Mammoth")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Primitive Man"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Primitive Man"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Hunter/Gatherer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hunter/Gatherer")
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
   * @function chapter_prehistory_overview
   * @return {chapter}
   * (func chapter_prehistory_overview)
   */
  public static interface Func_chapter_prehistory_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_prehistory_overview();
  }

  public static class Class_chapter_prehistory_overview extends Core.Class_base implements Func_chapter_prehistory_overview {

    @Override
    public Func_chapter_prehistory_overview vx_new(Object... vals) {
      Class_chapter_prehistory_overview output = new Class_chapter_prehistory_overview();
      return output;
    }

    @Override
    public Func_chapter_prehistory_overview vx_copy(Object... vals) {
      Class_chapter_prehistory_overview output = new Class_chapter_prehistory_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/prehistory", // pkgname
        "chapter_prehistory_overview", // name
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
    public Func_chapter_prehistory_overview vx_empty() {return e_chapter_prehistory_overview;}
    @Override
    public Func_chapter_prehistory_overview vx_type() {return t_chapter_prehistory_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Prehistory.f_chapter_prehistory_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_prehistory_overview() {
      return Prehistory.f_chapter_prehistory_overview();
    }

  }

  public static final Func_chapter_prehistory_overview e_chapter_prehistory_overview = new Prehistory.Class_chapter_prehistory_overview();
  public static final Func_chapter_prehistory_overview t_chapter_prehistory_overview = new Prehistory.Class_chapter_prehistory_overview();

  public static Base.Type_chapter f_chapter_prehistory_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Prehistory Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Prehistory?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Prehistory?")
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
        "nx/tactics/books/prehistory", // pkgname
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
      output = Prehistory.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Prehistory.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Prehistory.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Prehistory.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Prehistory"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Prehistory Overview"),
            Prehistory.f_chapter_prehistory_overview(),
            Core.vx_new_string("Prehistoric Creatures"),
            Prehistory.f_chapter_prehistoric_creatures()
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
    mapfunc.put("chapter_prehistoric_creatures", Prehistory.t_chapter_prehistoric_creatures);
    mapfunc.put("chapter_prehistory_overview", Prehistory.t_chapter_prehistory_overview);
    mapfunc.put("tacticsbook", Prehistory.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/prehistory", maptype, mapconst, mapfunc);
  }

}
