package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Bestiary {

  /**
   * @function chapter_amphibians
   * @return {chapter}
   * (func chapter_amphibians)
   */
  public static interface Func_chapter_amphibians extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_amphibians();
  }

  public static class Class_chapter_amphibians extends Core.Class_base implements Func_chapter_amphibians {

    @Override
    public Func_chapter_amphibians vx_new(Object... vals) {
      Class_chapter_amphibians output = new Class_chapter_amphibians();
      return output;
    }

    @Override
    public Func_chapter_amphibians vx_copy(Object... vals) {
      Class_chapter_amphibians output = new Class_chapter_amphibians();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_amphibians", // name
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
    public Func_chapter_amphibians vx_empty() {return e_chapter_amphibians;}
    @Override
    public Func_chapter_amphibians vx_type() {return t_chapter_amphibians;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_amphibians();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_amphibians() {
      return Bestiary.f_chapter_amphibians();
    }

  }

  public static final Func_chapter_amphibians e_chapter_amphibians = new Bestiary.Class_chapter_amphibians();
  public static final Func_chapter_amphibians t_chapter_amphibians = new Bestiary.Class_chapter_amphibians();

  public static Base.Type_chapter f_chapter_amphibians() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Amphibians"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Common Amphibians"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Common Amphibians"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Frog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Frog")
                      )
                    ),
                    Core.vx_new_string(":Salamander"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Salamander")
                      )
                    ),
                    Core.vx_new_string(":Toad"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Toad")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Amphibians"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Amphibians"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Frog, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Frog, Giant")
                      )
                    ),
                    Core.vx_new_string("Toad, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Toad, Giant")
                      )
                    ),
                    Core.vx_new_string("Toad, Giant Poisonous"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Toad, Giant Poisonous")
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
   * @function chapter_arthropods
   * @return {chapter}
   * (func chapter_arthropods)
   */
  public static interface Func_chapter_arthropods extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_arthropods();
  }

  public static class Class_chapter_arthropods extends Core.Class_base implements Func_chapter_arthropods {

    @Override
    public Func_chapter_arthropods vx_new(Object... vals) {
      Class_chapter_arthropods output = new Class_chapter_arthropods();
      return output;
    }

    @Override
    public Func_chapter_arthropods vx_copy(Object... vals) {
      Class_chapter_arthropods output = new Class_chapter_arthropods();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_arthropods", // name
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
    public Func_chapter_arthropods vx_empty() {return e_chapter_arthropods;}
    @Override
    public Func_chapter_arthropods vx_type() {return t_chapter_arthropods;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_arthropods();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_arthropods() {
      return Bestiary.f_chapter_arthropods();
    }

  }

  public static final Func_chapter_arthropods e_chapter_arthropods = new Bestiary.Class_chapter_arthropods();
  public static final Func_chapter_arthropods t_chapter_arthropods = new Bestiary.Class_chapter_arthropods();

  public static Base.Type_chapter f_chapter_arthropods() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Arthropods"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Ants"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Ants"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Army Ants"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Army Ants")
                      )
                    ),
                    Core.vx_new_string("Black Ants"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Black Ants")
                      )
                    ),
                    Core.vx_new_string("Fire Ants"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fire Ants")
                      )
                    ),
                    Core.vx_new_string("Red Ants"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Red Ants")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Arachnids"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Arachnids"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Scorpion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scorpion")
                      )
                    ),
                    Core.vx_new_string("Canopy Spider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Canopy Spider")
                      )
                    ),
                    Core.vx_new_string(":Tarantula"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tarantula")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Bees"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Bees"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Honey Bees"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Honey Bees")
                      )
                    ),
                    Core.vx_new_string("Killer Bees"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Killer Bees")
                      )
                    ),
                    Core.vx_new_string(":Wasp"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wasp")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Beetles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Beetles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bombardier Beetle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bombardier Beetle")
                      )
                    ),
                    Core.vx_new_string("Carrion Beetle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Carrion Beetle")
                      )
                    ),
                    Core.vx_new_string("Fire Beetle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fire Beetle")
                      )
                    ),
                    Core.vx_new_string("Stag Beetle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stag Beetle")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Flying Insects"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Flying Insects"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Firefly"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Firefly"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lightning Bug")
                      )
                    ),
                    Core.vx_new_string(":Horsefly"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Horsefly")
                      )
                    ),
                    Core.vx_new_string("Praying Mantis"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Praying Mantis")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Arthropods"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Arthropods"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Ant, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ant, Giant")
                      )
                    ),
                    Core.vx_new_string("Ant, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ant, Huge")
                      )
                    ),
                    Core.vx_new_string("Ant, Huge Fire"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ant, Huge Fire")
                      )
                    ),
                    Core.vx_new_string("Ant Lion, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ant Lion, Giant")
                      )
                    ),
                    Core.vx_new_string("Ant Lion, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ant Lion, Huge")
                      )
                    ),
                    Core.vx_new_string("Beetle, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beetle, Giant")
                      )
                    ),
                    Core.vx_new_string("Beetle, Giant Pincher"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beetle, Giant Pincher")
                      )
                    ),
                    Core.vx_new_string("Beetle, Giant Rinoceros"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beetle, Giant Rinoceros")
                      )
                    ),
                    Core.vx_new_string("Beetle, Hugh"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beetle, Hugh")
                      )
                    ),
                    Core.vx_new_string("Beetle, Hugh Fire"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beetle, Hugh Fire")
                      )
                    ),
                    Core.vx_new_string("Caterpillar, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Caterpillar, Giant")
                      )
                    ),
                    Core.vx_new_string("Centipede, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Centipede, Giant")
                      )
                    ),
                    Core.vx_new_string("Centipede, Hugh Poisonous"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Centipede, Hugh Poisonous")
                      )
                    ),
                    Core.vx_new_string("Cockroach, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cockroach, Giant")
                      )
                    ),
                    Core.vx_new_string("Dragonfly, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dragonfly, Giant")
                      )
                    ),
                    Core.vx_new_string("Dragonfly, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dragonfly, Huge")
                      )
                    ),
                    Core.vx_new_string("Fire Bug"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fire Bug")
                      )
                    ),
                    Core.vx_new_string("Firefly, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Firefly, Huge")
                      )
                    ),
                    Core.vx_new_string("Lightning Bug, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lightning Bug, Huge")
                      )
                    ),
                    Core.vx_new_string("Mantis, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mantis, Giant")
                      )
                    ),
                    Core.vx_new_string("Mantis, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mantis, Huge")
                      )
                    ),
                    Core.vx_new_string("Mosquito, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mosquito, Giant")
                      )
                    ),
                    Core.vx_new_string("Mosquito, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mosquito, Huge")
                      )
                    ),
                    Core.vx_new_string("Scarab, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scarab, Huge")
                      )
                    ),
                    Core.vx_new_string("Scorpion, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scorpion, Giant")
                      )
                    ),
                    Core.vx_new_string("Scorpion, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scorpion, Huge")
                      )
                    ),
                    Core.vx_new_string("Spider, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spider, Giant")
                      )
                    ),
                    Core.vx_new_string("Spider, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spider, Huge")
                      )
                    ),
                    Core.vx_new_string("Spider, Huge Spitting"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spider, Huge Spitting")
                      )
                    ),
                    Core.vx_new_string("Spider, Huge Trap Door"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spider, Huge Trap Door")
                      )
                    ),
                    Core.vx_new_string("Spider, Huge Water"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spider, Huge Water")
                      )
                    ),
                    Core.vx_new_string("Spider, Phase"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spider, Phase"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dimension Spider")
                      )
                    ),
                    Core.vx_new_string(":Vasp"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vasp"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Vasp is a giant predatory insectoid. They stand 10 feet tall with segmented bodies covered with metallic scales. Despite their size and ungainly appearance, they are surprisingly quick and can leap 30 feet.\n* Vasps are solitary nocturnal creatures that usually attack by leaping on its victim, pining it to the ground, and stinging it to death with its tail. Its stinger exudes a caustic venom that slowly dissolves the internal organs. While the toxin is taking effect, the Vasp wraps it prey in a silky cocoon and drags it back to its lair."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("250kg"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("3m")
                      )
                    ),
                    Core.vx_new_string("Wasp, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wasp, Huge")
                      )
                    ),
                    Core.vx_new_string("Wasp, Parasite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wasp, Parasite")
                      )
                    ),
                    Core.vx_new_string("Worm, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Worm, Giant")
                      )
                    ),
                    Core.vx_new_string("Worm, Giant Sand"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Worm, Giant Sand")
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
   * @function chapter_avians
   * @return {chapter}
   * (func chapter_avians)
   */
  public static interface Func_chapter_avians extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_avians();
  }

  public static class Class_chapter_avians extends Core.Class_base implements Func_chapter_avians {

    @Override
    public Func_chapter_avians vx_new(Object... vals) {
      Class_chapter_avians output = new Class_chapter_avians();
      return output;
    }

    @Override
    public Func_chapter_avians vx_copy(Object... vals) {
      Class_chapter_avians output = new Class_chapter_avians();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_avians", // name
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
    public Func_chapter_avians vx_empty() {return e_chapter_avians;}
    @Override
    public Func_chapter_avians vx_type() {return t_chapter_avians;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_avians();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_avians() {
      return Bestiary.f_chapter_avians();
    }

  }

  public static final Func_chapter_avians e_chapter_avians = new Bestiary.Class_chapter_avians();
  public static final Func_chapter_avians t_chapter_avians = new Bestiary.Class_chapter_avians();

  public static Base.Type_chapter f_chapter_avians() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Avians"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Birds"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Birds"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Crane"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crane")
                      )
                    ),
                    Core.vx_new_string(":Eagle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Eagle")
                      )
                    ),
                    Core.vx_new_string(":Falcon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Falcon")
                      )
                    ),
                    Core.vx_new_string(":Hawk"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hawk")
                      )
                    ),
                    Core.vx_new_string(":Owl"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Owl")
                      )
                    ),
                    Core.vx_new_string(":Parrot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Parrot")
                      )
                    ),
                    Core.vx_new_string(":Raven"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Raven")
                      )
                    ),
                    Core.vx_new_string(":Shrike"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shrike")
                      )
                    ),
                    Core.vx_new_string(":Vulture"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vulture")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Avians"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Avians"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Hekler"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hekler"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Hekler is a pestiferous variety of bird identified by its spiked plummage and awful, shrill cry they produce when hungry. Heklers have the annoying habit of following travellers scrounging for handouts and leftovers. They are extremely persistent and will pursue their victims for miles, swawking incessently. Worse, the call is audible for two miles and is known to attract predatory beasts. If fed, they become silent while they eat, providing an opportunity to escape."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Nag-Bird")
                      )
                    ),
                    Core.vx_new_string("Iron Shrike"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Shrike"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A long beaked bird with metallic plumage. Their metallic feathers make them very hardy but also poor flyers. They hunt by diving at full speed from high altitudes and impaling their prey on their dagger-like beaks.")
                      )
                    ),
                    Core.vx_new_string("Sky Jelly"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sky Jelly")
                      )
                    ),
                    Core.vx_new_string("Sky Pufferfish"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sky Pufferfish")
                      )
                    ),
                    Core.vx_new_string("Sky Shark"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sky Shark")
                      )
                    ),
                    Core.vx_new_string("Sky Squid"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sky Squid")
                      )
                    ),
                    Core.vx_new_string(":Skyfish"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skyfish"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Skyfish have developed their flotation bladders to hold lighter than air gases. Their bodies and bones are porous and very lightweight, so they are somewhat more vulnerable to impact damage. If their flotation bladder is ruptured, they will sink. Some skyfish have adapted to live at very high altitudes to avoid predators.")
                      )
                    ),
                    Core.vx_new_string("Winged Viper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Winged Viper"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A snake with feathered wings and a mildly poisonous bite. They are generally small but can grow to 10 feet. They feed on small creatures, but will attack larger targets when hungry or disturbed.")
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
   * @function chapter_beastmen
   * @return {chapter}
   * (func chapter_beastmen)
   */
  public static interface Func_chapter_beastmen extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_beastmen();
  }

  public static class Class_chapter_beastmen extends Core.Class_base implements Func_chapter_beastmen {

    @Override
    public Func_chapter_beastmen vx_new(Object... vals) {
      Class_chapter_beastmen output = new Class_chapter_beastmen();
      return output;
    }

    @Override
    public Func_chapter_beastmen vx_copy(Object... vals) {
      Class_chapter_beastmen output = new Class_chapter_beastmen();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_beastmen", // name
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
    public Func_chapter_beastmen vx_empty() {return e_chapter_beastmen;}
    @Override
    public Func_chapter_beastmen vx_type() {return t_chapter_beastmen;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_beastmen();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_beastmen() {
      return Bestiary.f_chapter_beastmen();
    }

  }

  public static final Func_chapter_beastmen e_chapter_beastmen = new Bestiary.Class_chapter_beastmen();
  public static final Func_chapter_beastmen t_chapter_beastmen = new Bestiary.Class_chapter_beastmen();

  public static Base.Type_chapter f_chapter_beastmen() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Beastmen"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Draconian"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Draconian"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Draconians are a bulky reptilian race of humanoids that claim shared ancestrey with Greater Dragons. The Draconians are a very old race with a long hostility toward mammals of all kinds which they see as out of control vermin. They see no distinction between the races or cultures of men.\n* Draconian Code - Draconians have always been a warrior race. They relish battle, but must always live by the Draconian Code of Honor which prevents them from acts of wanton destruction. The code requires them to spare the defenseless.\n* Draconian Law - Draconian law is particularly harsh: For example, any debtor whose status was lower than that of his creditor is forced into slavery. The death penalty is the punishment for even minor offenses. It is said that Drakon himself, when asked why he had fixed the punishment of death for most offences, answered that he considered these lesser crimes to deserve it, and he had no greater punishment for more important ones."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Drakken"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Draconian Dragoon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Draconian Dragoon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Draconian.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Elite Draconians are awarded Dractyl steeds. The Dractyl are unwieldy flyers and may only fly short distances with a heavy Draconian soldier.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Gryphon"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gryphon"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* An impressive race of winged, man-like beings. They stand up to seven feet tall, with wingspans in excess of 24 feet. Their bodies are covered with thick feathery down, and they have hawk-like visages and bright, piercing eyes.\n* Like the birds of prey they resemble, the Gryphons are hunters by nature. They have exceptionally keen vision which enables them to spot the slightest movement at great distances.\n* Gryphons live in eyries built on cliffsides or at the tops of high trees. Their dwellings resemble great bird's nests composed of woven vines and leafy canopies.\n* Occassionally the avians will take to adventuring for profit, accepting mercenary posts as scouts, guides, or bouty hunters. The majority, however, would never consider leaving their homes. Gryphons are an independent, strong-willed race that values freedom above all else which can make them difficult employees.\n* Morale - Normal"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Gryph, Harpy"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Gryphon Javelineer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gryphon Javelineer")
                      )
                    ),
                    Core.vx_new_string("Gryphon Light Infantry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gryphon Light Infantry")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Krokan"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Krokan"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Krokans are heavy, intelligent frog creatures. They appear very similar to enormous bullfrogs. Seated they are about 5ft all around. They possess manipulative fingers, powerful legs, and long tongues. Their weight and leg strength make them dangerous combatants. They are also notorious for attempting to swallow victims alive.\n* Society - Their culture is tribal and semi-nomadic with many small emcampments both above and below the water.\n* It is said that a purely land-based version exists that more resemble toads."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Bullywug, Croaker, Froglok"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bull Krokan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bull Krokan"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I don't believe I require a menu. - Tahm Kench, Runeterra"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
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
                    Core.vx_new_string("Poison Krokan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poison Krokan"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Venomous"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Venomous")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Krokan Chemist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Krokan Chemist"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Alchemy"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alchemy")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Krokan Shaman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Krokan Shaman")
                      )
                    ),
                    Core.vx_new_string("Krokan Skirmisher"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Krokan Skirmisher")
                      )
                    ),
                    Core.vx_new_string("Krokan Trapper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Krokan Trapper")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Mantids"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mantids"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Mantids are a warlike, insectoid race. They walk on four legs and have large sickle-like claws with limited dexterity. They are capable of relatively fine work using the mandibles about their mouths.\n* Civilization - They live in large complexes deep underground where they wage war on other species including other tribes of Mantids.\n* Combat - They mostly rely on their natural weaponry, but they have been seen using simple spears and axes. There are also many specialized warriors capable of spitting poison or acid or explosives."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Ant Men, Insect Men, Mantis Men")
              )
            ),
            Core.vx_new_string(":Mycans"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mycans"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Puffcap Peddler: Oh, if mushrooms could talk. Teemo: I'll have what he's having. - Runeterra"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Mycans are a fungal race.\n* Life Cycle - They mostly live underground as a vast fungal network, but during spring months the networks spawns small mushroom men that work to improve their living area and seek mates. At the end of the fall, these mushrooms collapse and break down. Each year, the same personalities are resurrected, but they are born anew and have no memories of their previous life, though all of their memories are permanently stored in the network.\n* Appearance - Mycans are generally up to 5 feet tall with a narrow stem and a large cone-shaped cap. They move by splitting their stem into 2 or more smaller stems.\n* Senses - Mycans have no eyes, ears, or mouths. They have a keen sense of smell, and they hear and feel through vibrations, mostly coming through the ground.\n* Spores - Mycans can 'exhale' hallucinogenic spores to confuse and incapacitate opponents. They can also use their spores to create images and impressions in other creatures.\n* Communication - Mycans do not speak. Instead they communicate with each other through the mycelial network underground. In fact, they communicate so much information through this network that all Mycans in a colony immediately know everything every other member knows.\n* Intelligence - Mycans are fairly intelligent, but they are a simple folk and have little interest in things that don't directly affect their lives. They do build simple shelters and are expert farmers.\n* Personalities - Mycans are generally friendly and quite pleasent to those who do not threaten them. They are grimly militaristic against threats, however. Though they are individuals with their own personalities, Mycans are a colony organism and are not overly concerned about their safety or deaths. They also see time in a more long term way than most creatures."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Fungus Men, Mushrooms, Mushroom Men, Shrooms")
              )
            ),
            Core.vx_new_string(":Naga"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Naga"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Naga are large serpent people resembling huge cobras with short arms. They stand about 5 feet high, but 2/3 of their length is in their tail behind them. Clans are named after the current clan leader and the Naga use clan name as a last name. Like their snake and crocodile brethren, they are slow moving and lazy except while hunting. Their fangs produce a mild venom, but its lack of potency is a point of embarrassment to the Naga. They prefer the spear as a weapon because they can use it as a walking staff to aid them when they are not waist deep in water (their natural habitat). They sleep with their eyes open which makes them seem to always be on the alert.\n* Maximum Body - 6"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Lamia, Serpent People"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Naga Chieftan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Naga Chieftan")
                      )
                    ),
                    Core.vx_new_string("Naga Enforcer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Naga Enforcer")
                      )
                    ),
                    Core.vx_new_string("Naga Hunter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Naga Hunter")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Sagittarians"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Sagittarians"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Maximum Body - 7\n* Morale - Normal\n* Preferred Skills (Sagittarian) - Melee (Spear), Ranged (Javelin, Short Bow)"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Centaur, Minotaur"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Sagittarian Horse Archer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sagittarian Horse Archer")
                      )
                    ),
                    Core.vx_new_string("Sagittarian Light Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sagittarian Light Cavalry")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Saurids"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Saurids"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Mezoamerican tribes"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Morale - High\n* Preferred Skills - Necromancy\n* Units - Light Infantry, Light Spearmen, Light Archers, Heavy Cavalry (Striders)\n* Saurids dress in hides and robes and wear feathered ornaments as a symbol of rank."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Iksar, Lizardman, Saurian. Sleestak"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Saurid Archer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Saurid Archer")
                      )
                    ),
                    Core.vx_new_string("Saurid Hatchetman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Saurid Hatchetman")
                      )
                    ),
                    Core.vx_new_string("Saurid Spearman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Saurid Spearman")
                      )
                    ),
                    Core.vx_new_string("Saurid Swordsman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Saurid Swordsman")
                      )
                    ),
                    Core.vx_new_string("Saurid Heavy Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Saurid Heavy Cavalry"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Saurid ride large Desert Strider lizards into battle.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Tauran"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Tauran"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Tauran Axeman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tauran Axeman")
                      )
                    ),
                    Core.vx_new_string("Tauran Hammerman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tauran Hammerman")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Stryx"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Stryx"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* A race of man-like beings resembling a cross between a vulture and a horned devil. They stand under six feet tall with a 20 foot wingspan. They excel at gliding and can cover great distances and remain aloft for hours. They have superior nightvision but see poorly in daylight. They feed on carrion and have little appetite for fighting. Their manual dexerity is limited, but they can use simple spears and polearms when necessary using either their hands on land or their feet in the air.")
              )
            ),
            Core.vx_new_string(":Tritons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Tritons"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Little Mermaid"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Tritons are group of aquatic species distantly related to man. They are adapted to life underwater, but are still able to breathe air for a few minutes. They have innumerable sub species with drastically different appearances, some human-like, some fish-like, some with tentacles."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Melusine, Mermaid, Merman"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Merrow Hydromancer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Merrow Hydromancer")
                      )
                    ),
                    Core.vx_new_string("Merrow Necromancer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Merrow Necromancer")
                      )
                    ),
                    Core.vx_new_string("Merrow Soldier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Merrow Soldier"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Merrow have sloping shoulders, scaly yellow-green skin and dark deep-set eyes. Their hands and feet are webbed, and their powerful jaws are lined with a double row of sharp teeth. Having both gills and rudimentary lungs, the amphibians are capable of living on land or sea though the land tires them. They are powerful swimmers but are somewhat slow and awkward on land.\n* Slavers by trade, they prey upon the primitive tribes which dwell along the coasts and islands. Their weapons are mostly designed to capture instead of kill. They also traffic in narcotic herbs, exotic beasts and all manner of contraband.\n* Merrow tradition states that long ago, a merrow hunting party discovered a great forgotten city in a deep trench. The discovery brought madness and destruction to the merrow city. The survivors of those nights moved from their city, abandoned their gods, and faithfully serve the Old Ones that dwell in that forgotten city of madnesss. Their descendants are known as the Deep Ones. They are primitive, blasphemous, deformed fish creatures and are known to kidnap both Merrow and Humans for slaves and breeding."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Deep One, Deeper, Imrian")
                      )
                    ),
                    Core.vx_new_string("Merrow Slaver"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Merrow Slaver")
                      )
                    ),
                    Core.vx_new_string(":Siren"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Siren"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Persuasion"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Persuasion")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Selkie"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Selkie"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A seal that can shed its skin and appear human. In human form, the Selkie can only breathe air. If its seal skin is lost or destroyed, the Selkie cannot resume seal form.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Wildman"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Wildman"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Chewbacca"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The wildmen are close relatives to normal humans but have distinctly animalistic qualities including fur and fangs."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Jaka Manhunter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jaka Manhunter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Jaka are a race of intelligent man-like beings with features resembling a cross between man, wolf, and panther. They are a striking people with sleek black fur and yellow/green eyes.\n* Personality - The Jaka are solitary beings, sullen and introspective in nature. They have been known to become steadfast companions to those they trust, but have also been known to become cold-blooded killers to those who cross them.\n* Lifestyle - They are cunning and have excellent senses, so they make are superb hunters. They typically live off the land but also trade their extra hides and animal parts for useful gear. Some have extended their tracking and hunting skills to become bounty hunters: tracking and capturing fugitives from justice and living off the bounty.")
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
   * @function chapter_bestiary_overview
   * @return {chapter}
   * (func chapter_bestiary_overview)
   */
  public static interface Func_chapter_bestiary_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_bestiary_overview();
  }

  public static class Class_chapter_bestiary_overview extends Core.Class_base implements Func_chapter_bestiary_overview {

    @Override
    public Func_chapter_bestiary_overview vx_new(Object... vals) {
      Class_chapter_bestiary_overview output = new Class_chapter_bestiary_overview();
      return output;
    }

    @Override
    public Func_chapter_bestiary_overview vx_copy(Object... vals) {
      Class_chapter_bestiary_overview output = new Class_chapter_bestiary_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_bestiary_overview", // name
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
    public Func_chapter_bestiary_overview vx_empty() {return e_chapter_bestiary_overview;}
    @Override
    public Func_chapter_bestiary_overview vx_type() {return t_chapter_bestiary_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_bestiary_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_bestiary_overview() {
      return Bestiary.f_chapter_bestiary_overview();
    }

  }

  public static final Func_chapter_bestiary_overview e_chapter_bestiary_overview = new Bestiary.Class_chapter_bestiary_overview();
  public static final Func_chapter_bestiary_overview t_chapter_bestiary_overview = new Bestiary.Class_chapter_bestiary_overview();

  public static Base.Type_chapter f_chapter_bestiary_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Bestiary Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Bestiary?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Bestiary?")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_constructs
   * @return {chapter}
   * (func chapter_constructs)
   */
  public static interface Func_chapter_constructs extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_constructs();
  }

  public static class Class_chapter_constructs extends Core.Class_base implements Func_chapter_constructs {

    @Override
    public Func_chapter_constructs vx_new(Object... vals) {
      Class_chapter_constructs output = new Class_chapter_constructs();
      return output;
    }

    @Override
    public Func_chapter_constructs vx_copy(Object... vals) {
      Class_chapter_constructs output = new Class_chapter_constructs();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_constructs", // name
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
    public Func_chapter_constructs vx_empty() {return e_chapter_constructs;}
    @Override
    public Func_chapter_constructs vx_type() {return t_chapter_constructs;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_constructs();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_constructs() {
      return Bestiary.f_chapter_constructs();
    }

  }

  public static final Func_chapter_constructs e_chapter_constructs = new Bestiary.Class_chapter_constructs();
  public static final Func_chapter_constructs t_chapter_constructs = new Bestiary.Class_chapter_constructs();

  public static Base.Type_chapter f_chapter_constructs() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Constructs"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Alchemical"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alchemical"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Homunculus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Homunculus")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Animated"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Animated"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Created though [Alchemy] or [Sympathetic Magic]"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Animated Armor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Animated Armor")
                      )
                    ),
                    Core.vx_new_string("Animated Furniture"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Animated Furniture")
                      )
                    ),
                    Core.vx_new_string("Flying Carpet"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flying Carpet")
                      )
                    ),
                    Core.vx_new_string("Flying Boat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flying Boat")
                      )
                    ),
                    Core.vx_new_string("Living Statue"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Living Statue")
                      )
                    ),
                    Core.vx_new_string("Terra Cotta Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terra Cotta Warrior")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Dreams"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Dreams"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Sandman"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Apparition"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Apparition"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Apparitions are drem entities that are created from terrifying nightmares. As such they seem to be creatures of fear that attempt to strike terror in anyone they encounter. They normally appear as frightful humanoids composed of swirling black vapors, however, they may change their form into anything that will strike fear in their target. Though powerful and terrifying, Apparitions do not actually want to kill their prey. Instead they want to terrify them endlessly, though sometimes this leads to madness or suicide, and the Apparition may accidentally kill its prey. A dead or fearless victim is boring to the Apparition, and they will seek easier prey when frustrated.")
                      )
                    ),
                    Core.vx_new_string(":Dream"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dream")
                      )
                    ),
                    Core.vx_new_string(":Figment"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Figment"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Teacups - Beauty and the Beast\n* Brooms - Fantasia"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Figments are minor dream entities that are created from imagination. They typically only exist in the Dream Realm where they possess and animate small normally inanimate objects in dreams. They must inhabit a single object or group of like objects, but they are physically weak and are dispelled if the object is destroyed. They do not normally speak, but they can if they so choose. Figments can be summoned into the material world where they inhabit and animate a physical object. They are typically friendly and make excellent companions, familiars, or spies.")
                      )
                    ),
                    Core.vx_new_string(":Nightstalker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nightstalker"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The mara was thought of as an immaterial being, capable of moving through a keyhole or the opening under a door, who seated herself at the chest of a sleeping person and 'rode' him or her, thus causing nightmares.\n* In Norwegian/Danish, the word for nightmare is mareritt/mareridt, meaning 'mareride'."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Nightstalkers are predators in the dream world. Their form varies but it is always some kind of terrifying monster with sharp claws. They prey on dreamers and will torment a dreamer through the night until they are exhausted at which point it will slay the dream form and consume it. In the waking world, the victim will appear to have violent nightmares and cannot be awakened. If the dream form is killed, the waking form dies in its sleep, apparently of natural causes though some telltale marks remain."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dream Killer, Living Nightmare, Mara")
                      )
                    ),
                    Core.vx_new_string(":Sandman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sandman")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Golems"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Golems"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Blood Golem"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blood Golem"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Blood Golem is created using [Blood Magic] instead of [Artifice].\n* A Blood Golem is a large humanoid composed of animated blood. All of its attacks cause [Bleeding] and whenever a [Bleeding] critical inflicts [Damage] on a nearby unit, the Blood Golem may heal a [Damage] or [Critical].\n* When created, the summoner must be suffering from at least 4 [Bleeding] criticals from other sources or self-inflicted. These wounds may be bound or the summoner may allow the Blood Golem to draw from the wounds.")
                      )
                    ),
                    Core.vx_new_string("Clay Golem"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clay Golem")
                      )
                    ),
                    Core.vx_new_string("Flesh Golem"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flesh Golem"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Franenstein's Monster"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Flesh Golem is created using [Necromancy] instead of [Artifice]."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Corpse Golem")
                      )
                    ),
                    Core.vx_new_string("Iron Golem"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Golem")
                      )
                    ),
                    Core.vx_new_string(":Colossus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Colossus"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Colossus of Rhodes\n* Colossus of Sardia\n* Pygmalion\n* Talos"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Animated Statue, Stone Golem"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("30m")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Machina"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Machina"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Created though [Artifice]. These magical constructs a slow and powerful. Their abilities are increased if using rare or expensive materials (e.g. Gold, Meteor Metals, etc.)."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Auton, Clockwork, Mech, Mek, Mekton"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Automaton"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Automaton")
                      )
                    ),
                    Core.vx_new_string("Bronze Bull"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bronze Bull")
                      )
                    ),
                    Core.vx_new_string("Bronze Horse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bronze Horse")
                      )
                    ),
                    Core.vx_new_string("Clockwork Avian"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clockwork Avian")
                      )
                    ),
                    Core.vx_new_string("Clockwork Cobra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clockwork Cobra"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Iron Cobra")
                      )
                    ),
                    Core.vx_new_string("Clockwork Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clockwork Dragon"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Iron Dragon")
                      )
                    ),
                    Core.vx_new_string("Clockwork Golem"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clockwork Golem"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Ruin Grader, Ruin Guard")
                      )
                    ),
                    Core.vx_new_string("Clockwork Owl"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clockwork Owl"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Bubo - Clash of the Titans"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Clockwork Owls have excellent vision and make fair spys and messengers. However, they are not at all fast, stealthy, or agile, so some feel that they are far from practical.")
                      )
                    ),
                    Core.vx_new_string("Clockwork Minotaur"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clockwork Minotaur"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Minoton - Sinbad and the Eye of the Tiger")
                      )
                    ),
                    Core.vx_new_string("Clockwork Scorpion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clockwork Scorpion"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Iron Scorpion")
                      )
                    ),
                    Core.vx_new_string("Clockwork Spider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clockwork Spider"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Iron Spider, Spiderbot")
                      )
                    ),
                    Core.vx_new_string("Clockwork Steed"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clockwork Steed"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Iron Horse")
                      )
                    ),
                    Core.vx_new_string("Dragon Engine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dragon Engine"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Steam Engine")
                      )
                    ),
                    Core.vx_new_string("Iron Maiden"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Maiden"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A semi-humanoid automaton whose lower body is a giant spiked maw that engulfs its target. It is used as an intimidation and torture device.")
                      )
                    ),
                    Core.vx_new_string(":Juggernaut"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Juggernaut")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Miniatures"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Miniatures"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Minature Animal"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Minature Animal")
                      )
                    ),
                    Core.vx_new_string("Miniature Boat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Miniature Boat")
                      )
                    ),
                    Core.vx_new_string("Miniature House"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Miniature House")
                      )
                    ),
                    Core.vx_new_string("Miniature Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Miniature Warrior")
                      )
                    ),
                    Core.vx_new_string("Miniature Worker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Miniature Worker")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Phantasms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Phantasms"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Phantasms are created through powerful [Illusion]."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Phantasmal Force"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phantasmal Force")
                      )
                    ),
                    Core.vx_new_string("Phantasmal Mount"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phantasmal Mount")
                      )
                    ),
                    Core.vx_new_string("Phantasmal Monster"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phantasmal Monster")
                      )
                    ),
                    Core.vx_new_string("Phantasm Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phantasm Warrior")
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
   * @function chapter_darkling
   * @return {chapter}
   * (func chapter_darkling)
   */
  public static interface Func_chapter_darkling extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_darkling();
  }

  public static class Class_chapter_darkling extends Core.Class_base implements Func_chapter_darkling {

    @Override
    public Func_chapter_darkling vx_new(Object... vals) {
      Class_chapter_darkling output = new Class_chapter_darkling();
      return output;
    }

    @Override
    public Func_chapter_darkling vx_copy(Object... vals) {
      Class_chapter_darkling output = new Class_chapter_darkling();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_darkling", // name
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
    public Func_chapter_darkling vx_empty() {return e_chapter_darkling;}
    @Override
    public Func_chapter_darkling vx_type() {return t_chapter_darkling;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_darkling();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_darkling() {
      return Bestiary.f_chapter_darkling();
    }

  }

  public static final Func_chapter_darkling e_chapter_darkling = new Bestiary.Class_chapter_darkling();
  public static final Func_chapter_darkling t_chapter_darkling = new Bestiary.Class_chapter_darkling();

  public static Base.Type_chapter f_chapter_darkling() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Darkling"),
        Core.vx_new_string(":titles"),
        Core.vx_new_string("Goblinoid"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Bugbear"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Bugbear"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Serial Killer"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Appearance - Bugbears are the largest of the goblin races. They are 7ft tall, are covered in fur, have long ears, and have long fangs. They have a tough hide and dislike armor.\n* Personality - Brutal hunters and survivalists. They are butish like other goblins, but they are shrewd hunters and trappers. They are strictly carnivorous and treat everything as prey. They have been known to eat goblin in a pinch and would probably do so more if the flavor agreed with them more. They have little patience and are easily provoked. They are usually encountered alone while hunting or in a goblin nest acting as champion or leader.\n* Morale - Normal\n* Units - Skimisher, Trapper, Berserker, Light Axeman, Light Spearman, Light Polearm\n* Skills - Melee, Spear, Axe, Net, Hunting, Stealth, Survival, Close Combat, Knife\n* 7ft 400lbs."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Babau, Bogy, Bogey, Bogeyman, Bogill, Boogeyman, Bugaboo")
              )
            ),
            Core.vx_new_string(":Caprians"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Caprians"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Goatmen")
              )
            ),
            Core.vx_new_string(":Gnolls"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gnolls"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Seven Deadly Sins: Sloth\n* Typical Gnolls... strong to the weak, weak to the strong. - Roi, King's Raid"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Personality - Slothful by nature, they do anything they can to avoid work in any form. The slave trade comes naturally to gnolls, though they are poor guards.\n* Morale - Low\n* Units - Light Infantry, Elite Pikemen, Enslaved Siege Crews\n* The largest of gnolls can grow to the size of an ogre."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Gnoll Axeman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gnoll Axeman"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Gnoll_Axeman.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Melee"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melee"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Pike"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Pike")
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
                    Core.vx_new_string("Gnoll Chieftain"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gnoll Chieftain"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Gnoll leadership is determined through intimidation and power. Gnoll leaders are usually the largest and strongest of their breed. Like bull walruses they maintain a harem of brides, so the position is coveted by upstarts. Challenges to a Chief's rule are usually not fatal, but the loser must put himself at the mercy of the victor. A good leader is expected to accept the subservient gesture, but some victors will commit a political faux pas to permanently remove a rival."),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Melee"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melee"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("7"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("War Hammer"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("War Hammer")
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
                    Core.vx_new_string("Gnoll Pikeman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gnoll Pikeman"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Melee"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melee"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Pike"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Pike")
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
                    Core.vx_new_string("Gnoll Skirmisher"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gnoll Skirmisher"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Hunting"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hunting"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Scouting"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Scouting")
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
                    Core.vx_new_string("Gnoll Slaver"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gnoll Slaver"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Ranged"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ranged"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Net"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Net")
                                      )
                                    ),
                                    Core.vx_new_string(":Whip"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Whip")
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
            Core.vx_new_string(":Goblins"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Goblins"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Seven Deadly Sins: Gluttony\n* So raise your glass if you are wrong, in all the right ways.  All my underdogs, we will never be, never be anything\nbut loud and nitty-gritty, dirty, little freaks - Pink, Raise Your Glass.\n* Gremlins (1984)\n* Descent\n* Nezumi-Kozo\n* Gollum"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - Goblins are a small, savage, cave-dwelling humanoid species common to many mountainous regions. They live primarily underground and are very sensitive to bright light. They are the most numerous of the humanoid races (far outnumbering humans), though most Goblins are found underground where they wage war with their age old enemies, the Dwarves. These wretched man-like creatures are short and wiry, rarely exceeding 4 feet tall. They have soot-grey skin, large pointed ears, sharp fangs, and distorted features. They are physically weak and lack personal hygene. They do, however, have keen senses including superb night vision.\n* Personality - Goblins are hedonistic and brash. They are generally quirky and obsessive with their personal interests. This makes them excellent inventors, but they lack patience with details, so their inventions are usually highly flawed especially with regards to safety for which they have no consideration. They seem to have no recognizable morals and have been known to resort to any number of deviant behaviors including torture, cannibalism, and diabolism. They have a particular obsession with eating and will talk about food and preparation endlessly even when not hungry. They prefer knives and cleavers as weapons. They have no restrictions on what they eat, and they do not hold prisoners for long.... Selfish, undisciplined cowards by nature, they only gain confidence in numbers, and they always fight as a mob. Even their allies consider them to be reprehensible and ultimately expendable. The goblins are aware of how their allies and masters view them, so they show no real respect to power and are total anarchists by nature. Many races try to enlist or impress the goblins into service, but these relationships never last, because the goblins are unmanageable.\n* Preferred Skills - They have excellent manual dexterity and good at Ranged Combat and Thievery. They also have a talent for Kitbashing which they use to supplement their Artifice, Alchemy and Siegecraft. Their reliance on Kitbashing unfortunately makes their inventions extremely unreliable, but the goblins seem to have complete confidence in their own work.\n* Morale - Low\n* Units - Light Infantry, Light Spearmen, Light Archers, Elite Worg Cavalry, Siege Crews\n* History - The goblins once had a sophisticated society and ancient goblins are responsible for most of the finely worked tunnels throughout the land, but they are becoming increasing barbaric from generation to generation."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Goblin Aeronaut"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Aeronaut"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Goblin Balloonisht, Goblin Flyer, Goblin Kite Rider")
                      )
                    ),
                    Core.vx_new_string("Goblin Artillerist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Artillerist"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Siegecraft"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Siegecraft"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Ballista"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Ballista")
                                      )
                                    ),
                                    Core.vx_new_string(":Catapult"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Catapult")
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
                    Core.vx_new_string("Goblin Captain"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Captain"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Goblin_Captain.png"),
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
                    Core.vx_new_string("Goblin Champion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Champion")
                      )
                    ),
                    Core.vx_new_string("Goblin Chirurgeon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Chirurgeon")
                      )
                    ),
                    Core.vx_new_string("Goblin Hunter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Hunter"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Ranged"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ranged"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Short Bow"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Short Bow")
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
                    Core.vx_new_string("Goblin King"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin King")
                      )
                    ),
                    Core.vx_new_string("Goblin Lord"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Lord")
                      )
                    ),
                    Core.vx_new_string("Goblin Miner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Miner"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Siegecraft"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Siegecraft"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Sapping"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sapping")
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
                    Core.vx_new_string("Goblin Raider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Raider"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Goblin_Raider.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Melee"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melee"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Knife"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Knife")
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
                    Core.vx_new_string("Goblin Scout"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Scout"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Goblin_Scout.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Hunting"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hunting"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Scouting"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Scouting")
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
                    Core.vx_new_string("Goblin Saboteur"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Saboteur")
                      )
                    ),
                    Core.vx_new_string("Goblin Shaman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Shaman")
                      )
                    ),
                    Core.vx_new_string("Goblin Soothsayer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Soothsayer")
                      )
                    ),
                    Core.vx_new_string("Goblin Tinker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Tinker"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Artifice"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Artifice"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Mechanics"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mechanics"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Goblin War Drummer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin War Drummer")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Hobgoblins"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Hobgoblins"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - The military elite of the goblin race. They are a rare genetic throwback to the days when the Goblins were an advanced race. They appear less and less frequently as the Goblins regress to barbarism.\n* Personality - Brave, militaristic, and orderly, they are everything their goblin kin are not. Highly disciplined, they are considered to be natural leaders in goblin society, rising quickly in goblin ranks. Though goblin prejudices keep them from ultimate leadership, they frequently are the power behind goblin kings.\n* Preferred Skills - Military, Melee, Strategy\n* Morale - High\n* Units - Elite Light Infantry, Light Pikemen, Elite Light Archers, Elite Worg Cavalry (Note: Full units are very rare)"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Hob"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Hobgoblin Archer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hobgoblin Archer")
                      )
                    ),
                    Core.vx_new_string("Hobgoblin Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hobgoblin Cavalry")
                      )
                    ),
                    Core.vx_new_string("Hobgoblin Lord"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hobgoblin Lord")
                      )
                    ),
                    Core.vx_new_string("Hobgoblin Spearman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hobgoblin Spearman")
                      )
                    ),
                    Core.vx_new_string("Hobgoblin Strategist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hobgoblin Strategist")
                      )
                    ),
                    Core.vx_new_string("Hobgoblin Tracker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hobgoblin Tracker"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hobgoblins are reknowned less for their skill (their dogs do the actual tracking) than their tenacity and merciless efficiency. They are employed as scouts, border troops, and to hunt down criminals, dissidents, and escaped slaves.")
                      )
                    ),
                    Core.vx_new_string("Hobgoblin Swordsman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hobgoblin Swordsman"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Hobgoblin_Swordsman.png"),
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
            Core.vx_new_string(":Kobolds"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Kobolds"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - Kobolds are small relatives of goblins. They have bright blue skin and the color Cobalt is named after them.\n* Personality - Viscious opportunists readily attack anyone perceived as a weaker opponent. Their favorite skill is [Backstab].\n* Preferred Skills - Mechanics (Traps), Stealth, Military\n* Morale - Normal\n* Units - Scout, Spy, Light Spearmen, Light Wolf Cavalry"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Kobold Slinger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kobold Slinger"),
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
                                Core.vx_new_string("1")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Kobold Spearman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kobold Spearman"),
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
                                Core.vx_new_string("1")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Kobold Trapper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kobold Trapper"),
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
                                Core.vx_new_string("1")
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
            Core.vx_new_string(":Trogladytes"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Trogladytes"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* In choosing the name 'Morlocks', Wells may have been inspired by Moloch, the Caananite god of child sacrifice, with the Eloi analogous to children. Alternatively, he may have also been inspired by the Morlachs, an ethnic group in the Balkans which attracted attention from Western travellers as a perceived archetype of barbarism and backwardness... The Time Traveller speculates that the relationship developed from a class distinction present in his own time: the Morlocks are the working class who were relegated to working and living underground so that the rich upper class could live in luxury on the surface. - H.G. Wells, The Time Machine\n* The Descent"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - Trogladytes have dull grey-to-white skin, chinless faces, large greyish-red eyes that reflect light, reflecting light, and flaxen hair on the head and back. They are highly adapted to living in the dark with keen sense of hearing and smell but poor eyesight, and they cannot tolerate bright light. They are exceedingly primitive, but they are cunning and have learning to cultivate mushrooms, grubs and fishing pools. They do not bathe and their dens are notorious for their stench. Trogladytes recognize each other by smell.\n* History - Trogladytes are an offshoot of mankind that lived in large cavern systems but were cut off from the surface. Since then they have adapted to underground life. Sparse living has made them merciless and cannibalistic."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Crawlers, Morlocks")
              )
            ),
            Core.vx_new_string(":Uruks"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Uruks"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Cro-magnon Man, Goths, Huns, Mongols, Vandals\n* Seven Deadly Sins: Wrath"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - Uruks are a relatively primitive species of barrel-chested humanoids distantly related to Humans. They are sturdy and imposing figures, trained by hard labor and warfare since birth. They range in height from 5 feet to 7 feet tall and typically have yellowish/grey/green skin, red/black/brown eyes, and long black/grey/white hair. Their noses are flat and they have a notably large mouth with uneven teeth.\n* Personality - Uruks are typically violent, impatient, and crude. They take what they want by force and are difficult to bargain with. Their culture and leaders claim that they are destined to take over the world and take back all that has been taken from them. Now they are consumed with wrath and envy of the achievements of other races and other orc tribes.\n* Culture - Their civilization is still in a hunter/gatherer stage. They lack the patience and desire to read, cultivate crops, domesticate herd animals, or invent sophisticated equipment. They live a semi-nomadic existence depending on the availability of resources and the charisma of their leaders. Uruk 'kingdoms' are short lived. The race's genius for battle does not extend itself to statecraft, and their conquests inevitably collapse under a struggle for power between rival leaders. Uruk society is completely male dominated. Females are expected to find a male to support them and begin their life's purpose: breeding. Any female of breeding age that has no male protector is considered available to any male that chooses to take her and support her. Other cultures consider this to be rape. Uruks call it marriage. They extend this practice to captured females from other races.\n* Warfare - Uruks wage constant war on any group near them until they take what is 'rightfully' theirs. When warbands grow large enough, they spill down into neighboring settlements to rape, murder, raid, and pillage. These bands can take on the proportions of a large town or small city, and roll across the countryside leaving burning wreckage in their wake.\n* Language - Uruks speak the rough and unflattering Uruk tongue, which has no alphabet. Uruk culture and history is passed along in an oral tradition.\n* Morale - Normal\n* Preferred Skills - Melee, Rage\n* Units - Light Infantry, Light Spearmen, Light Archers, Light Cavalry, King\n* Factions - Skullsplitter, Bonegrinder"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Orc"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Uruk Butcher"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Uruk Butcher"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Orc Butchers deal in all things meat. They serve as cooks, surgeons, undertakers, and torturers.\n* They prefer cleavers, hand axes, and knives in combat.")
                      )
                    ),
                    Core.vx_new_string("Uruk-hai Champion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Uruk-hai Champion"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Brawler, Bodyguard")
                      )
                    ),
                    Core.vx_new_string("Uruk Raider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Uruk Raider")
                      )
                    ),
                    Core.vx_new_string("Uruk Shaman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Uruk Shaman"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Uruk Shamans teach that everything the Uruks once had was stolen by the other races, and urges them on\nto ever-greater acts of violence and revenge.")
                      )
                    ),
                    Core.vx_new_string("Uruk Taskmaster"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Uruk Taskmaster")
                      )
                    ),
                    Core.vx_new_string("Uruk Veteran"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Uruk Veteran")
                      )
                    ),
                    Core.vx_new_string("Uruk War Chief"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Uruk War Chief")
                      )
                    ),
                    Core.vx_new_string("Uruk Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Uruk Warrior"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Orc_Warrior.png"),
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
   * @function chapter_dragons
   * @return {chapter}
   * (func chapter_dragons)
   */
  public static interface Func_chapter_dragons extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_dragons();
  }

  public static class Class_chapter_dragons extends Core.Class_base implements Func_chapter_dragons {

    @Override
    public Func_chapter_dragons vx_new(Object... vals) {
      Class_chapter_dragons output = new Class_chapter_dragons();
      return output;
    }

    @Override
    public Func_chapter_dragons vx_copy(Object... vals) {
      Class_chapter_dragons output = new Class_chapter_dragons();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_dragons", // name
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
    public Func_chapter_dragons vx_empty() {return e_chapter_dragons;}
    @Override
    public Func_chapter_dragons vx_type() {return t_chapter_dragons;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_dragons();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_dragons() {
      return Bestiary.f_chapter_dragons();
    }

  }

  public static final Func_chapter_dragons e_chapter_dragons = new Bestiary.Class_chapter_dragons();
  public static final Func_chapter_dragons t_chapter_dragons = new Bestiary.Class_chapter_dragons();

  public static Base.Type_chapter f_chapter_dragons() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Dragons"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* Morale - Normal\n* Units - Individuals\n* Dragons are ancient beings and remember the time, before men, when their kind ruled the world."),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Lesser Dragons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Lesser Dragons"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Thank you for nothing, you useless reptile. - Hiccup, How to Train Your Dragon"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Dractyl"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dractyl"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Dractyl are horse-sized lesser dragons. They have a greyish scaly hide and large membranous wings. They live on cliffs and normally eat insects and vermin but will eat almost anything that does not require too much work. They can be trained as steeds, but they are clumsy flyers and only obey under duress so they cannot be relied on in battle. They have been known to throw their riders from altitudes to escape their servitude.")
                      )
                    ),
                    Core.vx_new_string("Fire Drake"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fire Drake")
                      )
                    ),
                    Core.vx_new_string(":Lindwyrm"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lindwyrm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Lindwyrm are forest serpents that are connected with the forest. Everything around a Lindwyrm slowly grows, supposedly including treasure."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lindworm")
                      )
                    ),
                    Core.vx_new_string("Spindrift Drake"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spindrift Drake"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Spindrift Drakes are aquatic, horse-sized, lesser dragons. They hunt the near the surface of large water bodies. Their beautiful, thin, irridescent wings are adapted to swimming, but they are known to launch themselves from the seas and glide close to the surface at high speeds. Their preferred tactic is to burst from the waves, build up speed, and then knock their prey into the water and kill them underwater."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Spindrake")
                      )
                    ),
                    Core.vx_new_string("Storm Drake"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Storm Drake"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Azure Drake")
                      )
                    ),
                    Core.vx_new_string(":Wurm"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wurm")
                      )
                    ),
                    Core.vx_new_string(":Wyvern"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wyvern")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Greater Dragons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Greater Dragons"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Seven Deadly Sins: Greed"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The greater dragons are apparently the last remnants of a ancient time before man when enormous monsters roamed the world. The greater dragons are immensely powerful, even more than their great size would indicate. Greater dragons are extremely rare and solitary. They all appear to be millenia old, and no young greater dragons have been observed. It is possible that there are no longer any mated pairs of dragons, so the ones observed may be the last of greater dragons.\n* They tend to live near ley lines (dragon lines) to accumulate magical energy. They further collect precious things to bask in their spiritual energy."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Celestial Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Celestial Dragon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Dragon_Celestial.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Shenron - Dragon Ball"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gilded Dragon, Gold Dragon, Silver Dragon")
                      )
                    ),
                    Core.vx_new_string("Dragon Turtle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dragon Turtle"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Gamera\n* Lion Turtle - Avatar The Last Airbender"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Dragon Turtles are enormous turtles that live most of their lives at sea and are sometimes mistaken for small islands. They are extremely long lived and are among the most ancient creatures living. They will occasionally float on the surface so long that plants and even trees grow on them.\n* Steam Breath - They produce extreme heat inside their bodies that can be expelled as steam, a boiling geyser, or fire."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Zaratan")
                      )
                    ),
                    Core.vx_new_string("Earth Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Earth Dragon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Earth Dragons are physically more like worms than typical dragons.\n* Heat Breath - The body of an Earth Dragon is scorching hot from friction as it moves. If it exhales strongly, that heat is released as a scorching blast.\n* Earth Moving - They move through sand by breathing in air and sand and blowing it out through the gaps in their long body in a similar way to gills. The air liquifies the surrounding sand and allows the Dragon to slide through the ground at relatively high speeds."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Desert Dragon, Dune Dragon, Earth Wyrm, Sand Dragon, Sand Wyrm")
                      )
                    ),
                    Core.vx_new_string("Forest Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Forest Dragon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Poison Spit - Has poison glands in its mouth that let it spit [Poison] like a Cobra.\n* Poison Cloud - Exhales while emitting poison from its glands to create a deadly poison cloud. This cloud provides cover and can be dropped behind the dragon while flying.\n* Poison Immunity - The dragon is immune to its own poison."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Green Dragon, Emerald Dragon")
                      )
                    ),
                    Core.vx_new_string("Frost Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Frost Dragon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Dragon_Frost.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Inhales Heat - The Frost Dragon survives by draining heat sources. Its lair is always incredibly cold with its own body temperature matching the surroundings.\n* Absorb Heat - The body of the Frost Dragon absorbs heat around it creating intense cold around its body.\n* Cold Immunity - Cold has no effect on Frost Dragons\n* Heat Vulnerability - Heat attacks overwhelm its heat absorption ability."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Chromium, Ice Dragon, Whiteflame")
                      )
                    ),
                    Core.vx_new_string("Mountain Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mountain Dragon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Red/Orange, Lives in Volcanic regions\n* Firebreathing: The dragon produces 2 fluids in venom sacs in its neck. When released during an exhale, these combine and ignite to form a napalm-like cloud."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Crimson Dragon, Fire Dragon, Lava Dragon")
                      )
                    ),
                    Core.vx_new_string("Sea Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sea Dragon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Sea dragons are gigantic serpentine sea creatures with lengths over 60 feet. The great jaws of these creatures are lined with 10 inch teeth and can swallow longboats whole. They are the apex predators of the sea and they consume almost everything they encounter.\n* They are the oldest (along with Dragon Turtles) and largest of the dragon species but also the most primitive. Some have learned to communicate though they have little need to interact with others. Some believe that Sea Dragons may be incredibly ancient, predating almost every other creature of the world.\n* Sonic Roar - The roar of a Sea Dragon can be heard for leagues. It causes deafness and massive internal damage to anything in front of its maw. Like other sonic attacks, the roar has increased effect underwater."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Sea Serpent")
                      )
                    ),
                    Core.vx_new_string("Shadow Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shadow Dragon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Dragon_Obsidian.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Spits Acid - The Shadow Dragon can belch stomach acid from its mouth to burn targets.\n* Acid Cloud - By exhaling while belching acid, the Shadow Dragon can"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Black Dragon, Marsh Dragon, Obsidian Dragon, Swamp Dragon")
                      )
                    ),
                    Core.vx_new_string("Sky Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sky Dragon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Sky Dragons make their homes high in the clouds. Their massive wings allow them to fly without ever landing and they sleep while soaring. They are drawn to storms where their unique metallic scales attract and absorb lightning strikes and static electricity. It is unclear what these massive creatures consume, but their large teeth implies they are carnivorous.\n* Lightning Breath - When angered, their scales become ionized and they spit a conductive spray that carries enormous electric potential.\n* Lightning Armor - As might be expected, their scales also carry deadly electric charge which releases on contact.\n* Lightning Immunity\n* If forged into armor, their scales absorb electricity while their hide protects the wearer from that same electricity. Scales can also be used as alchemical batteries and magical focuses."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Blue-Eyes White Dragon, Night Fury, Rodan, Slifer the Sky Dragon, Cloud Dragon, Storm Dragon"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Electricity"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electricity"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Absorb Electricity"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Absorb Electricity")
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
                    Core.vx_new_string(":Underdragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Underdragon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Dragons are bursting with magical energies, so even dead dragons can become undead (either purposely or accidentally). Since corpse dragons are no longer living, their normal breath weapon is usually lost, but instead they can exhale a billowing, decaying mist."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Corpse Dragon, Skeletal Dragon, Necrodragon, Undead Dragon, Zombie Dragon")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Monstrous Dragons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Monstrous Dragons"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Apophis"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Apophis"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Egyptian Mythology")
                      )
                    ),
                    Core.vx_new_string(":Ladon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ladon")
                      )
                    ),
                    Core.vx_new_string("Midgard Serpent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Midgard Serpent"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Norse Mythology")
                      )
                    ),
                    Core.vx_new_string(":Pytho"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pytho")
                      )
                    ),
                    Core.vx_new_string(":Stoorworm"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stoorworm")
                      )
                    ),
                    Core.vx_new_string(":Tiamat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tiamat"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Babylonian Mythology"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Avatar of Chaos, Avatar of the Wyrm, The Beast, Mother of All Life")
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
   * @function chapter_elementals
   * @return {chapter}
   * (func chapter_elementals)
   */
  public static interface Func_chapter_elementals extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_elementals();
  }

  public static class Class_chapter_elementals extends Core.Class_base implements Func_chapter_elementals {

    @Override
    public Func_chapter_elementals vx_new(Object... vals) {
      Class_chapter_elementals output = new Class_chapter_elementals();
      return output;
    }

    @Override
    public Func_chapter_elementals vx_copy(Object... vals) {
      Class_chapter_elementals output = new Class_chapter_elementals();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_elementals", // name
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
    public Func_chapter_elementals vx_empty() {return e_chapter_elementals;}
    @Override
    public Func_chapter_elementals vx_type() {return t_chapter_elementals;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_elementals();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_elementals() {
      return Bestiary.f_chapter_elementals();
    }

  }

  public static final Func_chapter_elementals e_chapter_elementals = new Bestiary.Class_chapter_elementals();
  public static final Func_chapter_elementals t_chapter_elementals = new Bestiary.Class_chapter_elementals();

  public static Base.Type_chapter f_chapter_elementals() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Elementals"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* All summoned Elementals are tied to their summoning point. If at any time, the elemental cannot trace a continuous line through their element to the summoning point, they are immediately banished back to their home plane. This is easiest for Air and Earth Elementals and hardest for Water and Fire Elementals. The most straightforward way to leverage this weakness is to isolate the summoning point using a different element."),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Air Elementals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Air Elementals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Aero Essence"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aero Essence"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A mindless, condensed blob of Aero energy.\n* Since slimes store magical energy they are highly sought after by mages and alchemists."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aero Slime, Aerolon, Wind Slime")
                      )
                    ),
                    Core.vx_new_string("Air Elemental"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Air Elemental")
                      )
                    ),
                    Core.vx_new_string("Air Elemental Lord"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Air Elemental Lord"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Greater Air Elementals are enormous creatures that can fill the sky. They appear as cloudbanks or can be completely invisible depending on their mood. They have complete mastery over the Air, can perform any Air Power at maximum ability and can cancel any other being attempting to use Air."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Air"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Air"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("20")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Jinn"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jinn"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Jinn are powerful, giant, invisible wind spirits that can take humanoid form. They are driven by their passions and are known to love and hate with extreme intensity. Tales of the Jinn are filled with love, scheming, betrayal, hatred, revenge, murder, retribution, and madness. For the Jinn who do not age, every betrayal can never be forgiven, so revenge never ends in an endless cycle of retributions until all is lost.\n* Description - Jinn are naturally formless and invisible to mortals, but can will themselves to be visible. The can take any shape but they prefer long snake-like forms or tall, thin mortal forms.\n* Powers - Invisibility, Flight, Shapeshift, Air\n* True Name - Jinn keep their true name a secret. They share this name only with those they truly love and trust and commit to do anything for those who know their name until the end of time. The greatest betrayal would be to share this name to be honor bound to another.\n* Society - Jinn live in large desert tribes with strong family bonds. The greatest of these tribes are Sultanates."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Djinn")
                      )
                    ),
                    Core.vx_new_string(":Sylyph"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sylyph")
                      )
                    ),
                    Core.vx_new_string(":Zephyr"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zephyr"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Wind Sprite")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Earth Elementals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Earth Elementals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Earth Elemental"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Earth Elemental")
                      )
                    ),
                    Core.vx_new_string("Earth Elemental Lord"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Earth Elemental Lord"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Greater Earth Elementals are enormous creatures that can appear as a mountain or a range of hills. They have complete mastery over the Earth, can perform any Earth Power at maximum ability and can cancel any other being attempting to use Earth."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Earth"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earth"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("20")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Earth Gnome"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Earth Gnome")
                      )
                    ),
                    Core.vx_new_string("Earth Sprite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Earth Sprite")
                      )
                    ),
                    Core.vx_new_string("Geo Essence"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Geo Essence"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A mindless, condensed blob of Geo energy.\n* Since slimes store magical energy they are highly sought after by mages and alchemists."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Earth Slime, Geo Slime, Geolon")
                      )
                    ),
                    Core.vx_new_string(":Monolith"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Monolith")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fire Elementals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fire Elementals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Firebird"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Firebird"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Firebirds are Flame spirits that fly. Though they can move through the air with ease, they enjoy igniting combustibles so much that they land frequently to spread the flames."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Ember")
                      )
                    ),
                    Core.vx_new_string("Flame Elemental"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flame Elemental")
                      )
                    ),
                    Core.vx_new_string("Flame Elemental Lord"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flame Elemental Lord"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Greater Fire Elementals are enormous creatures that can appear as a lava pit or a forest fire. They have complete mastery over the Fire, can perform any Fire Power at maximum ability and can cancel any other being attempting to use Fire."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Fire"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("20")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Flame Salamander"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flame Salamander"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Salamanders are pools of flame that vaguely appear in lizard form. They crawl about and split into additional Salamanders if sufficient flammable material is available."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lava Lizard")
                      )
                    ),
                    Core.vx_new_string("Flame Sprite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flame Sprite"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Fire Imp")
                      )
                    ),
                    Core.vx_new_string(":Ifrit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ifrit"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Ifrit are a fiery tribe related to the [Jinn]. They are just as passionate, but are perhaps more sinister."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Efreet")
                      )
                    ),
                    Core.vx_new_string("Pyro Essence"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pyro Essence"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A mindless, condensed blob of Pyro energy.\n* Since slimes store magical energy they are highly sought after by mages and alchemists."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Fire Slime, Pyro Slime, Pyrolon")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Lightning Elementals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Lightning Elementals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Electro Essence"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Electro Essence"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A mindless, condensed blob of Electro energy.\n* Since slimes store magical energy they are highly sought after by mages and alchemists."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Electro Slime, Electrolon, Lightning Slime, Lightning in a Bottle")
                      )
                    ),
                    Core.vx_new_string("Lightning Elemental"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lightning Elemental")
                      )
                    ),
                    Core.vx_new_string("Lightning Elemental Lord"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lightning Elemental Lord")
                      )
                    ),
                    Core.vx_new_string(":Raijin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Raijin"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("God of Lightning, Narukami, Raiden")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Water Elementals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Water Elementals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Hydro Essence"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hydro Essence"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A mindless, condensed blob of Hydro energy.\n* Since slimes store magical energy they are highly sought after by mages and alchemists."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hydro Slime, Hydrolon, Water Slime")
                      )
                    ),
                    Core.vx_new_string(":Naiad"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Naiad"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Nereid, Nyad")
                      )
                    ),
                    Core.vx_new_string(":Undine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Undine")
                      )
                    ),
                    Core.vx_new_string("Water Elemental"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Water Elemental")
                      )
                    ),
                    Core.vx_new_string("Water Elemental Lord"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Water Elemental Lord"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Greater Water Elementals are enormous creatures that can appear as a lake, a whirlpool, or a tidal wave. They have complete mastery over the Water, can perform any Water Power at maximum ability and can cancel any other being attempting to use Fire."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Water"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Water"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("20")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Water Sprite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Water Sprite")
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
   * @function chapter_extra_dimensional
   * @return {chapter}
   * (func chapter_extra-dimensional)
   */
  public static interface Func_chapter_extra_dimensional extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_extra_dimensional();
  }

  public static class Class_chapter_extra_dimensional extends Core.Class_base implements Func_chapter_extra_dimensional {

    @Override
    public Func_chapter_extra_dimensional vx_new(Object... vals) {
      Class_chapter_extra_dimensional output = new Class_chapter_extra_dimensional();
      return output;
    }

    @Override
    public Func_chapter_extra_dimensional vx_copy(Object... vals) {
      Class_chapter_extra_dimensional output = new Class_chapter_extra_dimensional();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_extra-dimensional", // name
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
    public Func_chapter_extra_dimensional vx_empty() {return e_chapter_extra_dimensional;}
    @Override
    public Func_chapter_extra_dimensional vx_type() {return t_chapter_extra_dimensional;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_extra_dimensional();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_extra_dimensional() {
      return Bestiary.f_chapter_extra_dimensional();
    }

  }

  public static final Func_chapter_extra_dimensional e_chapter_extra_dimensional = new Bestiary.Class_chapter_extra_dimensional();
  public static final Func_chapter_extra_dimensional t_chapter_extra_dimensional = new Bestiary.Class_chapter_extra_dimensional();

  public static Base.Type_chapter f_chapter_extra_dimensional() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Extra-Dimensional"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Celestine"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Celestine"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Angels have been fighting a cold war against the Fiends for millenia. Each side claims their right over the mortal realm, and each side recruits souls to increase their faction's power.\n* The Archangels are the oldest and most powerful of the Angels. Individually, they can lay waste to armies.\n* The Aeons are the primal concepts of divinity and are beyond physicality."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Archons, Aeons, Angels, Angelics, Devas, Malaikah, Watchers"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Aeon Demiurge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aeon Demiurge")
                      )
                    ),
                    Core.vx_new_string("Aeon Great Archon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aeon Great Archon")
                      )
                    ),
                    Core.vx_new_string("Aeon Sophia"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aeon Sophia")
                      )
                    ),
                    Core.vx_new_string("Archangel Auriel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Auriel"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Diablo 3"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Al'maiesh, the Cord of Hope - Twin whips of burning light."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Archangel of Hope")
                      )
                    ),
                    Core.vx_new_string("Archangel Gabriel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Gabriel"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Performs acts of justice and power"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Translation: God is my strength")
                      )
                    ),
                    Core.vx_new_string("Archangel Itherael"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Itherael"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Diablo 3"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Neither male nor female, Itherael remains neutral at all times.\n* He always teleport instead of moving.\n* Talus'ar, the Scroll of Fate - Allows him to predict the actions of others.\n* Presides over the Library of Fate where possible futures are divined."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Archangel of Fate, Archangel of Balance")
                      )
                    ),
                    Core.vx_new_string("Archangel Jophiel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Jophiel"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Expelled Adam and Eve from the Garden of Eden holding a flaming sword and punishes those who  transgress against God."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Translation: Beauty of God")
                      )
                    ),
                    Core.vx_new_string("Archangel Malthael"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Malthael"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Diablo 3"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wields twin sickle swords and can deflect and redirect enemy attack with only the slightest use of force.\n* Calad'ar, the Chalice of Wisdom - Allows him to see all things."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Archangel of Wisdom")
                      )
                    ),
                    Core.vx_new_string("Archangel Michael"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Michael"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Stands up for the children of mankind"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Translation: Who is like God?, Kindness of God")
                      )
                    ),
                    Core.vx_new_string("Archangel Raphael"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Raphael"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* God's healing force"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Translation: It is God who heals")
                      )
                    ),
                    Core.vx_new_string("Archangel Samael"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Samael"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Translation: Venom of God, Angel of Death, Azrael")
                      )
                    ),
                    Core.vx_new_string("Archangel Sandalphon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Sandalphon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Battles Samael and brings mankind together"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Translation: Bringing Together")
                      )
                    ),
                    Core.vx_new_string("Archangel Uriel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Uriel"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Leads us to destiny"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Translation: God is my light")
                      )
                    ),
                    Core.vx_new_string("Archangel Tyrael"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archangel Tyrael"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Diablo 3"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* El'durin, the Sword of Justice - Twin whips of burning light."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Archangel of Justice")
                      )
                    ),
                    Core.vx_new_string(":Cherubim"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cherubim")
                      )
                    ),
                    Core.vx_new_string(":Deva"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Deva")
                      )
                    ),
                    Core.vx_new_string("Fallen Angel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fallen Angel"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An angel who loses faith in his/her god.\n* Its wings change from white to black like a raven's.\n* Like mortals, their personalities and goals are much more varied than the angels.\n* Fallen angels are persecuted by other angels for their impurity."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Fallen")
                      )
                    ),
                    Core.vx_new_string(":Grace"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Grace")
                      )
                    ),
                    Core.vx_new_string("Guardian Angel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Guardian Angel")
                      )
                    ),
                    Core.vx_new_string(":Irin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Irin"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Irin - In the Book of Enoch, the Watchers, are angels dispatched to Earth to watch over the humans. They soon begin to lust for human women and, at the prodding of their leader Samyaza, defect en masse to illicitly instruct humanity and procreate among them. The offspring of these unions are the Nephilim, savage giants who pillage the earth and endanger humanity. Samyaza and his associates further taught their human charges arts and technologies such as weaponry, cosmetics, mirrors, sorcery, and other techniques that would otherwise be discovered gradually over time by humans, not foisted upon them all at once. Eventually God allows a Great Flood to rid the earth of the Nephilim, but first sends Uriel to warn Noah so as not to eradicate the human race. The Watchers are bound 'in the valleys of the Earth' until Judgment Day."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Araqiel (also Arakiel, Araqael, Araciel, Arqael, Sarquael, Arkiel, Arkas) taught humans the signs of the earth. However, in the Sibylline Oracles, Araqiel is referred to not as a fallen angel, or Watcher, but as one of the 5 angels who lead the souls of men to judgement, the other 4 being Ramiel, Uriel, Samiel, and Azazel.\n* Armaros (also Amaros) in Enoch I taught men the resolving of enchantments.\n* Azazel taught men to make knives, swords, shields, and how to devise ornaments and cosmetics.\n* Gadreel (or Gader'el) taught the art of cosmetics, the use of weapons and killing blows. It was he who led Eve astray in the garden of eden.[citation needed]\n* Baraqel (Baraqiel) taught men astrology\n* Bezaliel mentioned in Enoch I, left out of most translations because of damaged manuscripts and problematic transmission of the text.\n* Chazaqiel (sometimes Ezeqeel or Cambriel) taught men the signs of the clouds (meteorology).\n* Kokabiel (also Kakabel, Kochbiel, Kokbiel, Kabaiel, and Kochab), In the Book of Raziel he is a high-ranking, holy angel. In Enoch I, he is a fallen Watcher, resident of the nether realms, and commands 365,000 surrogate spirits to do his bidding. Among other duties, he instructs his fellows in astrology.\n* Penemue taught mankind the art of writing with ink and paper, and taught the children of men the bitter and the sweet and the secrets of wisdom. (I Enoch 69.8)\n* Sariel (also Suriel) taught mankind about the courses of the moon (at one time regarded as forbidden knowledge).\n* Samyaza (also Shemyazaz, Shamazya, Semiaza, Shemhazi, Semyaza and Amezyarak) is one of the leaders of the fall from heaven in Vocabulaire de l' Angelologie.\n* Shamsiel, once a guardian of Eden as stated in the Zohar, served as one of the two chief aides to the archangel Uriel (the other aide being Hasdiel) when Uriel bore his standard into battle, and is the head of 365 legions of angels and also crowns prayers, accompanying them to the 5th heaven. In Jubilees, he is referred to as one of the Watchers. He is a fallen angel who teaches the signs of the sun.\n* Yeqon (also Jeqon or Yaqum, he shall rise) was the ringleader who first tempted the other Watchers into having sexual relations with humans. His accomplices were Asbeel, Gadreel, Penemue, and Kasdaye (or Kasadya), who were all identified as individual satans."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Watchers")
                      )
                    ),
                    Core.vx_new_string(":Ophanim"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ophanim"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Ezekiel saw the wheel\nWay up in the middle of the air\nEzekiel saw the wheel\nWay up in the middle of the air\n\nAnd the little wheel run by faith\nAnd the big wheel run by the grace of God\nA wheel in a wheel\nWay up in the middle of the air"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Chariots for the Seraphim.\n* Four eye-covered interlocking wheels"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Many Eyed Ones")
                      )
                    ),
                    Core.vx_new_string(":Seraphim"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Seraphim"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Six Winged")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Abyssal"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Abyssal"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Demons are creatures of Chaos from the swirling outer void where reality itself is fluid. Unlike Fiends, there are an infinite number and variety of Demons. Some believe our universe is a tiny light of order in a sea of Demons and Chaos. Like the Chaos that spawned them, demons are creatures of destruction and random mayhem. They delight in carnage and fear and have little concern for their own safety. Though Demons are sometimes cunning, they generally have little patience for communication or study, preferring to take action. They do not create tools or clothing of any kind, though they might be able to use those they pick up (especially weapons). They value free will above all things and will not tolerate servitude including contracts, deals or agreements of any kind.\n* Demons are dominated by their [Beast]s.\n* Preferred Skills: [Demonic Power], [Natural Weaponry]\n\n* Description - Demons take any number of monstrous forms and are among the most powerful beings in existence. As beings of chaos, their appearance is often unsettling and asymetrical. They eat any living creature including humans though they don't require ordinary sustanence. Most are larger and more muscular than humans and can be enormous. Many have rows of stubby spikes growing from their upper backs, with elongated limbs that end in clawed digits, large fang-filled jaws and pointed ears, giving them a bestial appearance. Some have bat-like wings. Others burrow in the earth.\n* Personality - Demons are wildly arrogant and destructive and have no sense of consequences for their actions. Unlike Fiends who secretly harbor intense guilt and long for the souls they have lost, Demons are enthralled by their excess. Demons are sustained by chaos; if they are not surrounded by chaos, they will wither and die. Demons care nothing for life, least of all their own; they think only in the moment and cannot tolerate sitting still. They treat everything as if they were in a fictional world where nothing matters except their own immediate gratification.\n* Control - As beings of chaos, Demons can never be controlled. Attempts to control them damage them instead.\n* Abilities - Demons have the most varied abilities among all creatures. They generally have great strength, speed, and durability and can regenerate wounds. Some can extend their limbs and digits. All Demons can be identified by their [Demonic Power]."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Demonic"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Abyssal Horror"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Abyssal Horror")
                      )
                    ),
                    Core.vx_new_string("Abyssal Hound"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Abyssal Hound"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Resembles large muscular bulldog/pit bull 3ft at the shoulder. Their eyes pulse a faint red with their heartbeat. They love to chase prey and are completely silent in pursuit. They are aggressive bullies, but will flee a determined foe unless the scent of blood drives them into a murderous frenzy."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Demon Dog")
                      )
                    ),
                    Core.vx_new_string("Abyssal Hunter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Abyssal Hunter")
                      )
                    ),
                    Core.vx_new_string("Chaos Demon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chaos Demon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Chaos Demon is a creature drawn from the stuff of Chaos. The results of summoning a Chaos Demon are necessarily difficult to predict. Randomly select each Body Part. For each [Hit], add one random ability. For each [Critical Hit], add one ability of your choice.\n** Body Parts\n*** Head\n**** Headless\n**** Mindless\n**** Cunning\n**** Brilliant\n*** Mouth\n**** Mouthless\n**** Taste\n*** Ears\n**** Deaf\n**** Big Ears\n**** Sonar\n*** Eyes\n**** Blind\n**** Bug Eyes\n**** Eye Stalks\n*** Nose\n**** Snout\n*** Body\n**** Armor\n**** Acid Blood\n**** Blob\n**** Boat\n**** Mist\n**** Slime\n**** Spines\n*** Arms\n**** Armless\n**** Claws\n**** Hands\n*** Wings\n**** Bat Wings\n**** Bird Wings\n**** Insect Wings\n**** Wingless\n*** Legs\n**** Caterpillar Legs\n**** Hopping\n**** Insect Legs\n**** Legless\n**** Slug\n**** Spider Legs\n** Abilities\n*** Burrowing\n*** Clairvoyance\n*** Confusion\n*** [[Darkness]]\n*** Darts\n*** Disease\n*** Dust Cloud\n*** Emotion Control\n*** Empathy\n*** Ethereal\n*** Freezing Attack\n*** Hellfire\n*** Horde\n*** Insect Plague\n*** Lore\n*** Poison\n*** Shape Change\n*** Shock\n*** Stinger\n*** Telekinesis\n*** Web")
                      )
                    ),
                    Core.vx_new_string(":Empusa"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Empusa")
                      )
                    ),
                    Core.vx_new_string(":Lilin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lilin")
                      )
                    ),
                    Core.vx_new_string("Mist Demon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mist Demon")
                      )
                    ),
                    Core.vx_new_string(":Pazuzu"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pazuzu"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Exorcist, Exorcist II"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Dark Angel of the Four Winds with rotting genitals from which he howls through sharpened teeth over stricken cities."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lord of Fevers and Plagues")
                      )
                    ),
                    Core.vx_new_string(":Orcus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Orcus"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("John Milton's Paradise Lost")
                      )
                    ),
                    Core.vx_new_string(":Ades"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ades"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("John Milton's Paradise Lost")
                      )
                    ),
                    Core.vx_new_string(":Demogorgon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Demogorgon"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("John Milton's Paradise Lost")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Infernal"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Infernal"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* The greatest trick the Devil ever pulled was convincing the world he didn't exist. - Verbal, The Usual Suspects"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Fiends are dangerous creatures both physically and mentally. They are sometimes mistaken for Demons, but Demons are forces of random destruction while Fiends possess a sinister intellect and seek to install their own order on the mortal realm.\n* Conflict - Fiends are powerful creatures that have been engaged in a cold war with the Angels for millenia. As in any longstanding dipute, their history is convuluted and both sides maintain conflicting claims why their causes are just. They both seek to recruit souls from the mortal realm to increase their faction's power. The Angels promise protection while the Fiends see this protection as oppressive control. The Fiends promise freedom while the Angels see this as freedom to suffer. Essentially, their conflict is socialism vs. capitalism.\n* Soul Collection - The prime motivation for fiends is collecting corrupted souls. Fiends cannot corrupt a soul by forcing one to do evil. Instead they must manipulate and tempt. Therefore, fiends spend most of their time on earth in mortal form stalking people, learning their secrets, poisoning their emotions, and gaining their trust in any way they can. The best minions of Hell are never noticed at all. With their powers, fiends could cause tremendous destruction, but that would drive people away. They would have the corpses but not the souls.\n* Contract - Devil's Bargain. Fiends are willing to engage in contracts with mortals, usually in exchange for their soul but sometimes for lesser mischief. The fiend hierarchy ensures that these contracts are always binding to both parties. Some magi believe they can deal with fiends, learn from them, and not be corrupted themselves. This rarely goes to plan and fiends are more than willing to pit their intelligence against a mage's.\n* Deceiver - Fiends are deceivers first and foremost. No ability can reveal whether they are telling the truth.\n* Corrupted - No ability can change them into virtuous beings. They are too far gone to turn.\n* Tormented - Though fiends appear to be all-powerful embodiments of evil, they are ruled by their [Shadow] and forever tormented by the remnants of their [Spirit]. They are secretly filled with regret and self-loathing and have even been known to strangely act in ways that lead to their own defeat.\n* Shaitan are the original and most powerful fiends. Most are ancient fallen angels, who through millenia of worship now possess godlike power.\n* Archfiends are the most powerful sorts of Fiends below the godlike Shaitan. They stand 10 to 20 feet tall and have red or coal black skin. They live in stone castles and observe a medieval heirarchy of princes, 	princesses, barons, ministers, and knights. They profess undying loyalty to the Shaitan, though, in fact, they crave power, wealth, and position and are throughly unscrupulous and untrustworthy in all their dealings."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Devilish, Devils, Diabolic, Fiends, Shaitan, Shayatin"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Baphomet"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Baphomet")
                      )
                    ),
                    Core.vx_new_string("Count Andromalius"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Count Andromalius")
                      )
                    ),
                    Core.vx_new_string("Count Bifrons"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Count Bifrons")
                      )
                    ),
                    Core.vx_new_string("Count Furfur"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Count Furfur")
                      )
                    ),
                    Core.vx_new_string("Count Halphas"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Count Halphas")
                      )
                    ),
                    Core.vx_new_string("Count Räum"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Count Räum")
                      )
                    ),
                    Core.vx_new_string("Duke Agares"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Agares")
                      )
                    ),
                    Core.vx_new_string("Duke Aim"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Aim")
                      )
                    ),
                    Core.vx_new_string("Duke Alloces"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Alloces")
                      )
                    ),
                    Core.vx_new_string("Duke Amdusias"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Amdusias")
                      )
                    ),
                    Core.vx_new_string("Duke Astaroth"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Astaroth")
                      )
                    ),
                    Core.vx_new_string("Duke Barbatos"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Barbatos")
                      )
                    ),
                    Core.vx_new_string("Duke Bathin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Bathin")
                      )
                    ),
                    Core.vx_new_string("Duke Buné"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Buné")
                      )
                    ),
                    Core.vx_new_string("Duke Berith"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Berith")
                      )
                    ),
                    Core.vx_new_string("Duke Crocell"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Crocell")
                      )
                    ),
                    Core.vx_new_string("Duke Dantalion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Dantalion")
                      )
                    ),
                    Core.vx_new_string("Duke Eligos"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Eligos")
                      )
                    ),
                    Core.vx_new_string("Duke Focalor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Focalor")
                      )
                    ),
                    Core.vx_new_string("Duke Gremory"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Gremory")
                      )
                    ),
                    Core.vx_new_string("Duke Gusion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Gusion")
                      )
                    ),
                    Core.vx_new_string("Duke Haures"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Haures")
                      )
                    ),
                    Core.vx_new_string("Duke Murmur"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Murmur")
                      )
                    ),
                    Core.vx_new_string("Duke Sallos"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Sallos")
                      )
                    ),
                    Core.vx_new_string("Duke Valefor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Valefor")
                      )
                    ),
                    Core.vx_new_string("Duke Vapula"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Vapula")
                      )
                    ),
                    Core.vx_new_string("Duke Vepar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Vepar")
                      )
                    ),
                    Core.vx_new_string("Duke Vual"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Vual")
                      )
                    ),
                    Core.vx_new_string("Duke Zepar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duke Zepar")
                      )
                    ),
                    Core.vx_new_string("Dust Devil"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dust Devil")
                      )
                    ),
                    Core.vx_new_string("Fury Devil"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fury Devil"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Erinyes")
                      )
                    ),
                    Core.vx_new_string(":Grimalkin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Grimalkin"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* During the early modern period, the name grimalkin, and cats in general, became associated with the devil and witchcraft. Women tried as witches were often accused of having a familiar, frequently a grimalkin."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Grimalkin is a small, black, furry devil with glowing eyes and sharp claws. It is wickedly, intelligent but lazy and weak, so it prefers to get involved in the schemes of others. It takes the role of scout, messenger, and advisor. It enjoys providing information that causes suffering and sitting 	back and watching their handiwork unfold.\n* The Grimalkin is commonly used as a familiar by black magicians. In order to remain on the mortal plane, it must possess a small animal. It will choose a creature which closely suits its personality, often an old or evil-looking female cat."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Greymalkin, Shadowcat")
                      )
                    ),
                    Core.vx_new_string(":Hellhound"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hellhound"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hellhounds may appear as ordinary large dogs with black coats (usually Dobermans).\n* In combat, they may take a more monstrous form and may spawn up to 2 additional heads and have been known to breathe fire.\n* Be aware that Hellhounds only appear as dogs. Like all devils, they are corrupted souls of humanoids and possess a calm, calculating intelligence. They often work as a pack, creating ambushes and using decoys to lure their prey to their doom."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cereberus, Devil Dog, Fenris Wolf, Garm, Kerberos")
                      )
                    ),
                    Core.vx_new_string(":Hellion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hellion"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hellcat")
                      )
                    ),
                    Core.vx_new_string(":Hellspawn"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hellspawn"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lemure")
                      )
                    ),
                    Core.vx_new_string("Ice Devil"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ice Devil")
                      )
                    ),
                    Core.vx_new_string(":Imp"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imp"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Imp is a foot tall, bat-winged minor Devil with a long forked tail that can be used for grasping. Imps can find and squeeze through the tiniest dimensional cracks and are therefore the most common of all of Hell's legions infesting the world. They can speak, but are mostly incoherent, muttering, lunatics. Their flesh is rubbery and their bones are soft, so they can withstand the massive physical abuse that greater devils heap on them. Though physically weak, they are fast flyers with keen vision and make excellent messengers.\n* Origin - Imps are the Fiend form of cruel children who chose to go to hell to continue their cruelty. Of course, this does not go well for evil child.\n* Personality - They are clever and may try to design intricate plans, or they may just cause trouble and hope that will please their masters.\n* Powers - They may communicate mentally with other devils and it is in this way that they are the most useful. Powerful diabolists have been known to capture Imps and cram them into magical bottles. Anyone who possesess the bottle may converse with the Imp inside. Though the Imp is troublesome and somewhat incoherent, it may be used as a go between to converse with greater devils to negotiate for knowledge or power. While channelling greater devils, the Imp becomes immeditately conherent and possesses a dark intelligence that it uses to conspire with its master.\n 				* In their home realm, Imps occupy the unenviable position at the bottom of the devil hierarchy. At best, servitors may be employed as scullery workers or menial laborers. Worse they are used as living tools serving as a plunger, polishing, or scrapping instrument. Devils sometimes amuse themselves by squeezing an imp's head into funny faces."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bottle Imp, Sardonicus")
                      )
                    ),
                    Core.vx_new_string("King Baal Moloch"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Baal Moloch"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A King of [Devils] with [Godlike] power.\n* Baal appears as a man with a bull's head.\n* Worship involves child sacrifice by fire (to Moloch)."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bael")
                      )
                    ),
                    Core.vx_new_string("King Balam"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Balam")
                      )
                    ),
                    Core.vx_new_string("King Beleth"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Beleth")
                      )
                    ),
                    Core.vx_new_string("King Belial"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Belial")
                      )
                    ),
                    Core.vx_new_string("King Paimon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Paimon")
                      )
                    ),
                    Core.vx_new_string("King Purson"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Purson")
                      )
                    ),
                    Core.vx_new_string("King Viné"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Viné")
                      )
                    ),
                    Core.vx_new_string("King Zagan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Zagan")
                      )
                    ),
                    Core.vx_new_string("Knight Furcas"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Knight Furcas")
                      )
                    ),
                    Core.vx_new_string("Marquis Amon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Amon")
                      )
                    ),
                    Core.vx_new_string("Marquis Andras"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Andras")
                      )
                    ),
                    Core.vx_new_string("Marquis Andrealphus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Andrealphus")
                      )
                    ),
                    Core.vx_new_string("Marquis Cimeies"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Cimeies")
                      )
                    ),
                    Core.vx_new_string("Marquis Decarabia"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Decarabia")
                      )
                    ),
                    Core.vx_new_string("Marquis Leraje"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Leraje")
                      )
                    ),
                    Core.vx_new_string("Marquis Forneus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Forneus")
                      )
                    ),
                    Core.vx_new_string("Marquis Marchosias"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Marchosias")
                      )
                    ),
                    Core.vx_new_string("Marquis Naberius"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Naberius")
                      )
                    ),
                    Core.vx_new_string("Marquis Oriax"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Oriax"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Orias")
                      )
                    ),
                    Core.vx_new_string("Marquis Phenex"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Phenex")
                      )
                    ),
                    Core.vx_new_string("Marquis Ronové"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Ronové")
                      )
                    ),
                    Core.vx_new_string("Marquis Samigina"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Samigina")
                      )
                    ),
                    Core.vx_new_string("Marquis Shax"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Shax")
                      )
                    ),
                    Core.vx_new_string("Marquis Sabnock"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marquis Sabnock")
                      )
                    ),
                    Core.vx_new_string(":Nightmare"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nightmare"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Shadowmane")
                      )
                    ),
                    Core.vx_new_string("Pit Fiend"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pit Fiend"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Balrog, Fiend, Lord of the Pit")
                      )
                    ),
                    Core.vx_new_string("Pit Wyrm"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pit Wyrm")
                      )
                    ),
                    Core.vx_new_string("President Amy"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Amy")
                      )
                    ),
                    Core.vx_new_string("President Botis"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Botis")
                      )
                    ),
                    Core.vx_new_string("President Buer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Buer")
                      )
                    ),
                    Core.vx_new_string("President Caim"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Caim")
                      )
                    ),
                    Core.vx_new_string("President Foras"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Foras")
                      )
                    ),
                    Core.vx_new_string("President Glasya-Labolas"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Glasya-Labolas")
                      )
                    ),
                    Core.vx_new_string("President Haagenti"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Haagenti")
                      )
                    ),
                    Core.vx_new_string("President Malphas"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Malphas")
                      )
                    ),
                    Core.vx_new_string("President Marbas"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Marbas")
                      )
                    ),
                    Core.vx_new_string("President Marax"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Marax")
                      )
                    ),
                    Core.vx_new_string("President Ose"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Ose")
                      )
                    ),
                    Core.vx_new_string("President Valac"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("President Valac")
                      )
                    ),
                    Core.vx_new_string(":Azazel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Azazel")
                      )
                    ),
                    Core.vx_new_string("Prince Asmodeus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Asmodeus"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Spreads lust through the land. Embodies the sin of lust.\n* Part man part animal hybrid."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Asmoday")
                      )
                    ),
                    Core.vx_new_string("Prince Beelzebub"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Beelzebub"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fallen angel second only to Lucifer. Demon of pestilences. Consumes everything in his path."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lord of Gluttony, Lord of Flies, Lord of Flyers")
                      )
                    ),
                    Core.vx_new_string("Prince Belphagor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Belphagor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The lord of fire and laziness. Prince of manipulation and deceit. He embodies the sin of sloth.\n* Formerly the Archangel Belpior, he took no side during Lucifer's rebellion and was cast down for his inaction.\n* He is a shape changer."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lord of Sloth")
                      )
                    ),
                    Core.vx_new_string("Prince Gäap"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Gäap")
                      )
                    ),
                    Core.vx_new_string("Prince Ipos"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Ipos")
                      )
                    ),
                    Core.vx_new_string("Prince Leviathan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Leviathan"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Swallows whole those consumed with envy. Embodies the sin of envy."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gates of Hell, Hellmouth, Lord of Envy")
                      )
                    ),
                    Core.vx_new_string("Prince Lucifer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Lucifer"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The are very few things that I will defend with true passion: medical marijuana, the biblical Satan as a metaphor against tyranny, and motherfucking, goddamn cryptocurrency. - Gilfoyle, Silicon Valley\n* Guilt is like a bag of fuckin' bricks. All you gotta do is set it down. ... Who are you carrying all those bricks for anyway? God. ... God likes to watch. He's a prankster. .. He gives man instincts ... He sets the rules in opposition. It's the goof of all time. Look but don't touch. Touch but don't taste. Taste but don't swallow. ... And while you're jumping from one foot to the other, what is he doing? He's laughing his sick, fucking ass off. ... He's a sadist. He's an absentee landlord. Worship that? Never. ... Freedom, baby is never having to say you're sorry. - Devil's Advocate"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The archangel who rebelled and was cast out. He embodies the sin of pride."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lord of Pride")
                      )
                    ),
                    Core.vx_new_string("Prince Mammon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Mammon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Enslaves those who pursue wealth. Embodies the sin of greed."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lord of Greed")
                      )
                    ),
                    Core.vx_new_string("Prince Orobas"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Orobas")
                      )
                    ),
                    Core.vx_new_string("Prince Satan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Satan"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lord of Wrath")
                      )
                    ),
                    Core.vx_new_string("Prince Seere"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Seere")
                      )
                    ),
                    Core.vx_new_string("Prince Sitri"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Sitri")
                      )
                    ),
                    Core.vx_new_string("Prince Stolas"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Stolas")
                      )
                    ),
                    Core.vx_new_string("Prince Vassago"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Vassago")
                      )
                    ),
                    Core.vx_new_string("Shaitan, Devil"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shaitan, Devil")
                      )
                    ),
                    Core.vx_new_string(":Succubus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Succubus"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Appearance - A powerful Devil who appears as an alluring person with unearthly beauty. In their true form they have a terrifying regal presense with glowing eyes, sharp fangs, bat-like wings, elegant horns like a tiara, and cloven feet. They have distinct male and female genders, but they have no sexual preference (a soul is a soul after all).\n* Energy Drain - They seduce people to have intercourse, providing untold pleasures while drawing their energy, often to the point of exhaustion or death.\n* Illusion - They are masters of [Illusion] and will almost never appear in their true form in the mortal realm.\n* Strength - They are physically powerful with strength similar to a bear or gorilla, but despite their power, they consider violence to be beneath them and will negotiate or flee if given the chance.\n* Patience - They are patient, sophisticated, and knowledgeable. Their seduction talents go far beyond sex, and they will often offer aid or information to befriend and manipulate their target. They are in no rush to accomplish their mission."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Incubus, Sex Fiend, Temptress")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Flatlands"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Flatlands"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* A bizarre two-dimensional realm."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Ribbon Guard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ribbon Guard"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ribbons are unusual, two-dimensional entities. They never communicate, but they understand orders and always follow them accurately without concern for their own safety, so they are favored as guards or servants.\n* Description - They appear as floating banners of fabric of varying colors, but they have no actual depth. They ripple slowly through air or water like snakes and may strike or grapple opponents. They do not seem to eat, sleep or even breathe. It is unclear if they have independent thought or are merely automatons.\n* Powers:\n** [Resistance]: [Resist Impact], [Resist Pierce], [Resist Electricity], [Resist Vacuum], [Resist Radiation], [Immune Vaccuum], [Cannot Eat], [Cannot Sleep]\n** [Vulnerability]: [Vulnerable to Slash], [Vulnerable to Fire], [Vulnerable to Cold]")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Mirrorlands"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mirrorlands"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Mirror Reflection"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mirror Reflection"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Mirror Reflection is being from the Mirrorlands that has no personal definition but longs for the definition of others. To this end, they become a mirror image of another being and try to impersonate the person though they lack any memories of the original. It would be practical to dispose of the original, but they are always only a reflection so they would die as well.")
                      )
                    ),
                    Core.vx_new_string("Mirror Shard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mirror Shard"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Mirror Shard is a weaker form of a [Mirror Reflection]. It copies some single aspect of the original but is otherwise an empty shell. This incompleteness drives them mad with desperation. They are always drawn to the those they copy and are usually irrationally destructive.\n* [Action] [Target]: The Mirror Shard becomes the same [Mass] as the target. Then choose one [Skill] or [Power] to copy. The Mirror Shard gains that Skill/Power and loses all other Skills and Powers. It [Body], [Mind], and [Will] are altered accordingly.")
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
   * @function chapter_giant_races
   * @return {chapter}
   * (func chapter_giant_races)
   */
  public static interface Func_chapter_giant_races extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_giant_races();
  }

  public static class Class_chapter_giant_races extends Core.Class_base implements Func_chapter_giant_races {

    @Override
    public Func_chapter_giant_races vx_new(Object... vals) {
      Class_chapter_giant_races output = new Class_chapter_giant_races();
      return output;
    }

    @Override
    public Func_chapter_giant_races vx_copy(Object... vals) {
      Class_chapter_giant_races output = new Class_chapter_giant_races();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_giant_races", // name
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
    public Func_chapter_giant_races vx_empty() {return e_chapter_giant_races;}
    @Override
    public Func_chapter_giant_races vx_type() {return t_chapter_giant_races;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_giant_races();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_giant_races() {
      return Bestiary.f_chapter_giant_races();
    }

  }

  public static final Func_chapter_giant_races e_chapter_giant_races = new Bestiary.Class_chapter_giant_races();
  public static final Func_chapter_giant_races t_chapter_giant_races = new Bestiary.Class_chapter_giant_races();

  public static Base.Type_chapter f_chapter_giant_races() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Giant Races"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Lesser Giants"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Lesser Giants"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Ogre"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ogre"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Gluttony, Wrath\n				* Preferred Skills - Close Combat, Hunting\n				* Morale - Low\n				* Units - Elite Heavy Infantry (Note: Full units are very rare)\n* Description - Ogres appear as huge, overweight, hairless humanoids.\n* Personality - Ogres are perpetually hungry. However, they are limited by their extremely low intelligence and short tempers."),
                        Core.vx_new_string(":mind"),
                        Core.vx_new_string("2:1"),
                        Core.vx_new_string(":will"),
                        Core.vx_new_string("3:1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("300kg"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("3m")
                      )
                    ),
                    Core.vx_new_string(":Oni"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oni")
                      )
                    ),
                    Core.vx_new_string(":Troll"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Troll"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Preferred Skills - Close Combat, Hunting\n* Morale - Normal\n* Units - Elite Heavy Infantry (Note: Full units are very rare)")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Greater Giants"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Greater Giants"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Units - Elite Heavy Infantry (Note: Full units are very rare)"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Cloud Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cloud Giant")
                      )
                    ),
                    Core.vx_new_string(":Cyclops"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cyclops")
                      )
                    ),
                    Core.vx_new_string("Fire Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fire Giant"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Eldjotunn")
                      )
                    ),
                    Core.vx_new_string("Hill Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hill Giant")
                      )
                    ),
                    Core.vx_new_string("Ice Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ice Giant"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Frost Giant, Jotunn")
                      )
                    ),
                    Core.vx_new_string("Mountain Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mountain Giant")
                      )
                    ),
                    Core.vx_new_string("Stone Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stone Giant")
                      )
                    ),
                    Core.vx_new_string("Storm Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Storm Giant")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Unique Giants"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Unique Giants"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Surtr"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Surtr"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Surtr is foretold as being a major figure during the events of Ragnarok; carrying his bright sword, he will go to battle against the Aesir, he will do battle with the major god Freyr, and afterward the flames that he brings forth will engulf the earth."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Black One")
                      )
                    ),
                    Core.vx_new_string(":Ymir"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ymir"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Ymir was the founder of the race of frost giants and an important figure in Norse cosmology. Odin and his brothers killed Ymir, and when Ymir fell the blood from his wounds drowned almost the entire tribe of frost giants or jotuns. Then they used Ymir's body to create Midgard, the earth. His flesh became the earth. His blood formed seas and lakes. From his bones mountains were erected. From his hair grew trees and maggots from his flesh became the race of dwarfs. The gods set Ymir's skull above Ginnungagap and made the sky."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Jotunheim")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Titans"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Titans"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Atlas"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Atlas")
                      )
                    ),
                    Core.vx_new_string(":Chronos"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chronos"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Yog-Sothoth")
                      )
                    ),
                    Core.vx_new_string(":Echidna"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Echidna"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mother of Monsters\n* Children - Cerberus, Chimera, Ethon, Gorgon, Graeae, Gelonus, Ladon, Lernaean Hydra, Nemean Lion, Orthrus, Phaea, Scylla, Sphinx"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Shub-Niggurath")
                      )
                    ),
                    Core.vx_new_string(":Gaia"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gaia"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Mother Earth, Wyld, Azathoth")
                      )
                    ),
                    Core.vx_new_string(":Helios"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Helios"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Sun")
                      )
                    ),
                    Core.vx_new_string(":Mene"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mene"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Selene, The Moon")
                      )
                    ),
                    Core.vx_new_string(":Oceanus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oceanus")
                      )
                    ),
                    Core.vx_new_string(":Prometheus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prometheus"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Serpent, Nyarlathotep, Phoenix")
                      )
                    ),
                    Core.vx_new_string(":Tartarus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tartarus"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Oblivion")
                      )
                    ),
                    Core.vx_new_string(":Typhon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Typhon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The enemy of Zeus\n* A vast grisly monster with a hundred snakelike heads that extends in serpentine coils from the waist down.")
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
   * @function chapter_humanoids
   * @return {chapter}
   * (func chapter_humanoids)
   */
  public static interface Func_chapter_humanoids extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_humanoids();
  }

  public static class Class_chapter_humanoids extends Core.Class_base implements Func_chapter_humanoids {

    @Override
    public Func_chapter_humanoids vx_new(Object... vals) {
      Class_chapter_humanoids output = new Class_chapter_humanoids();
      return output;
    }

    @Override
    public Func_chapter_humanoids vx_copy(Object... vals) {
      Class_chapter_humanoids output = new Class_chapter_humanoids();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_humanoids", // name
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
    public Func_chapter_humanoids vx_empty() {return e_chapter_humanoids;}
    @Override
    public Func_chapter_humanoids vx_type() {return t_chapter_humanoids;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_humanoids();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_humanoids() {
      return Bestiary.f_chapter_humanoids();
    }

  }

  public static final Func_chapter_humanoids e_chapter_humanoids = new Bestiary.Class_chapter_humanoids();
  public static final Func_chapter_humanoids t_chapter_humanoids = new Bestiary.Class_chapter_humanoids();

  public static Base.Type_chapter f_chapter_humanoids() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Humanoids"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Humans"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Humans"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Human Female"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Human Female"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Their extra [Mind] represents their extra need to work the system instead of using force.\n* Their extra [Will] represents their ability to endure hardship without breaking."),
                        Core.vx_new_string(":mind"),
                        Core.vx_new_string("6:1"),
                        Core.vx_new_string(":will"),
                        Core.vx_new_string("6:1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("60kg")
                      )
                    ),
                    Core.vx_new_string("Human Male"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Human Male"),
                        Core.vx_new_string(":mind"),
                        Core.vx_new_string("5:1"),
                        Core.vx_new_string(":will"),
                        Core.vx_new_string("5:1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("80kg")
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
   * @function chapter_humanoids_fantastic
   * @return {chapter}
   * (func chapter_humanoids_fantastic)
   */
  public static interface Func_chapter_humanoids_fantastic extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_humanoids_fantastic();
  }

  public static class Class_chapter_humanoids_fantastic extends Core.Class_base implements Func_chapter_humanoids_fantastic {

    @Override
    public Func_chapter_humanoids_fantastic vx_new(Object... vals) {
      Class_chapter_humanoids_fantastic output = new Class_chapter_humanoids_fantastic();
      return output;
    }

    @Override
    public Func_chapter_humanoids_fantastic vx_copy(Object... vals) {
      Class_chapter_humanoids_fantastic output = new Class_chapter_humanoids_fantastic();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_humanoids_fantastic", // name
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
    public Func_chapter_humanoids_fantastic vx_empty() {return e_chapter_humanoids_fantastic;}
    @Override
    public Func_chapter_humanoids_fantastic vx_type() {return t_chapter_humanoids_fantastic;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_humanoids_fantastic();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_humanoids_fantastic() {
      return Bestiary.f_chapter_humanoids_fantastic();
    }

  }

  public static final Func_chapter_humanoids_fantastic e_chapter_humanoids_fantastic = new Bestiary.Class_chapter_humanoids_fantastic();
  public static final Func_chapter_humanoids_fantastic t_chapter_humanoids_fantastic = new Bestiary.Class_chapter_humanoids_fantastic();

  public static Base.Type_chapter f_chapter_humanoids_fantastic() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Humanoids, Fantastic"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("This book subscribes to a more nuanced version of humanoid creatures than the classic Elves and Dwarves:\n* Like Great Danes and Poodles are just dogs that have rapidly changed in the face of selective breeding, these beings are still human.\n* They have minor differences in abilities, but these are cultural.\n* In this book, their physical and cultural differences are meant to be analogies for modern cultural differences and intolerance.\n* Languages:\n** Each nation has its own language. Most travellers learn many languages in addition to tradespeak.\n** Tradespeak - Merchants have created this simple language to facilitate trade. It is a very limited language, but can be used for basic communication if there is no alternative. It uses a simple format with no plurals, conjegation or tense: {Adjective(s)} {Subject Noun} {Adverb(s)} {Verb} {Adjective(s)} {Object Noun}. Examples: Trustworthy me offer 10 healthy sheep. Honorable you please each pay 20 silver.\n** Thieves' Cant - A variant on Tradespeak that emphasizes secret or silent communication to mask criminal activity."),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Claymores"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Claymores"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Claymores are a group of mostly female mercenary who wield large Claymore swords. The are tasked with killing demonic Yoma or die trying.\n* Creation - The Claymores are created to fight the Demonic Yoma. By consuming demon flesh and blood into humans, they are able to create a hybrid that is faster than the source Yoma with their original human combat training and intelligence.\n* Appearance - The hybridization process changes the human's hair to a light-blond or white, their eyes to silver, and sometimes they develop elf-like ears.\n* Skills - Even without activating their Yoki power, Claymores are highly skilled fighters with strength and speed exceeding human abilities.\n* Powers - Claymores are stronger than typical humans and can smell Yoma. By activating the Yoki power within them they can heal themselves or increase their abilities. However, each time they use Yoki power, that power increases until they become like Yoma themselves. As their Yoki power grows, the Claymore undergoes a physical transformation, beginning with their eyes turning gold, at 10% of their power, their faces transforming at 30%, and their bodies changing at 50% by which time they closely resemble Yoma themselves.\n* Male Claymores - Claymores used to be of both genders, but all the males quickly lost control of their Yoma power and were killed or became Awakened Beings. It is thought that the act of using Yoma powers is similar to sexual satisfaction, so males were unable to resist awakening."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Silver-Eyed Witch"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Black Card"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Black Card"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* When a Claymore can no longer control the Yoma power inside and it needs to be put down, it sends its card to another Claymore to finish the job.")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Awakened Being"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Awakened Being"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Claymores are in danger of losing control of their powers if they activate more than 80% of their demon strength, changing them into a form of yoma called an 'Awakened Being'. The majority of Claymores are female, as human males who are changed to hybrids tend to 'awaken' more quickly. In an attempt to avoid this fate, Claymores will ask a friend, usually another Claymore, to kill them if they begin to awaken.\n* Change - When a Claymore's Shadow or Beast exceeds its Spirit it becomes an awakened being.\n* Physicality - An Awakened Being is a terrifying monstrosity with awesome power and speed. They can also transform their bodies at will, often becoming gigantic and growing weapons from their bodies.\n* Mentality - Awakened Beings are mentally deranged and often confuse people with those from their memories. They often don't understand that they have changed at all."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Voracious Eater")
                      )
                    ),
                    Core.vx_new_string(":Clare"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clare"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I'm Clare, number 47. I've taken Teresa's flesh and Ilena's right arm. I'm the one who's going to take...the head of that one horned monster Priscilla. Forgive me but I have to take your soul too. - Clare, Claymore Manga"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* She is the only known Claymore to have taken the flesh and blood of a fellow Claymore rather than that of a Yoma, making her a 3/4 human and 1/4 Yoma, as opposed to 1/2 human and 1/2 Yoma. As such, she was considered weak and was given the last rank of 47.\n* Yoki Aura Detection - Like Teresa, Clare has the ability to see Yoki auras. This allows her to predict Yoki attacks against her and avoid them. The more powerful the Yoki enemy the easier it is to predict their actions."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Number 47"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Demon Soul"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Demon Soul"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Demonic Defense"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Demonic Defense")
                                      )
                                    ),
                                    Core.vx_new_string("Demonic Perception"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Demonic Perception")
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
                    Core.vx_new_string(":Miria"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Miria"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Phantom Miria"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Demon Soul"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Demon Soul")
                              )
                            ),
                            Core.vx_new_string("Hyper Speed"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hyper Speed"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("After Image"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("After Image")
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
                    Core.vx_new_string("Organization, The"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Organization, The"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The term Claymore is an informal one given by common folk. The Claymore warriors are actually part of a group known only as The Organization. The Organization assigns Claymores to missions, takes payment, and provides for the Claymore's basic needs.")
                      )
                    ),
                    Core.vx_new_string(":Teresa"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Teresa"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Personality - Before Teresa met Clare, she was a merciless, solitary killer who would accept any assignment without complaint. She seemed to enjoy intimidating the townsfolk and made it sound as if the Organization was responsible for sending Yoma to the towns that failed to pay the required fees.\n* Nickname - She was nicknamed 'Teresa of the Faint Smile' for the faint smiles that graced her face as she effortlessly slaughtered her enemies.\n* Skills - Teresa is so skillful, that she rarely activates her Yoki power to fight opponents.\n			    * Yoki Aura Detection - Like Clare who has taken her flesh, Teresa has the ability to see Yoki auras. This allows her to predict Yoki attacks against her and avoid them. The more powerful the Yoki enemy the easier it is to predict their actions."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Teresa of the Faint Smile, Number 1"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Demon Soul"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Demon Soul"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Demonic Defense"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Demonic Defense")
                                      )
                                    ),
                                    Core.vx_new_string("Demonic Perception"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Demonic Perception")
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
                    Core.vx_new_string(":Yoma"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Yoma"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Yoma are demonic beings that can shapechange into the form of humans. If they eat a human they may take their exact form. If they also eat the brain, they have most of the memories of that person.\n* Size - Yoma are slightly larger than human size.\n* Stength - All Yoma are monstrously strong, able to kill most humans in a single blow and tear them limb from limb.\n* Claws - Yoma have sharp piercing claws that they often use to stab or slice off limbs.\n* Wings - Rarely, Yoma develop usable wings to fly.\n* Personality - Yoma consider themselves to be predators among humans, but they are excessively cruel rejoicing in the pain and misery of others.")
                      )
                    ),
                    Core.vx_new_string("Voracious Eater"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Voracious Eater"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Yoma that live for a long time grow to enormous size and need to eat more humans to survive.\n* Size - Voracious Eaters are hulking giants easily 15ft/3m tall.\n* Stretching - Voracious Eaters have more control of their bodies and can stretch parts of themselves to create spearlike stabbing weapons that can attack in a large area.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Stone Kingdoms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Stone Kingdoms"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Down and down into the deep,\nWho knows what we'll find beneath,\nDiamonds, rubys, gold and more,\nHidden in the mountain store,\nBorn underground, suckled from a teat of stone,\nRaised in the dark, the safety of our mountain home,\nSkin made of iron, steel in our bones,\nTo dig and dig makes us free,\nCome on brothers sing with me!\nI am a dwarf and I'm digging a hole,\nDiggy, diggy hole, diggy, diggy hole,\nI am a dwarf and I'm digging a hole,\nDiggy, diggy hole, digging a hole,\nThe sunlight will not reach this low,\nDeep, deep in the mine,\nNever seen the blue moon glow,\nDwarves won't fly so high,\nFill a glass and down some mead!\nStuff your bellies at the feast!\nStumble home and fall asleep,\nDreaming in our mountain keep,\nBorn underground, grown inside a rocky womb,\nThe earth is our cradle; the mountain shall become our tomb,\nFace us on the battlefield; you will meet your doom,\nWe do not fear what lies beneath,\nWe can never dig too deep,\nI am a dwarf and I'm digging a hole,\nDiggy, diggy hole, diggy, diggy hole - Diggy Diggy Hole, Wind Rose"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Stone Kingdom is an old race of stout humanoids. They live almost exclusively in subterranean complexes spanning across mountainous regions. They are shorter but much broader than regular humans.\n* Maximum Body - 1:0\n* Morale - Very High\n* Preferred Skills - Caving, Armor, Melee, Siegecraft, Tradeskills - Blacksmithing, Armorsmithing, Animal Handling, Farming\n* Personality - They are generally a proud and boisterous folk who use drink and bravado to conceal a grim fatalism. Their obsession with gems and ore sends them ever deeper in their mines, though their long history is filled with the horrors they encountered below.\n* Units - Heavy Axeman, Heavy Hammerman, Heavy Pickman, Pikeman, Heavy Spearman, Light Archer, Siege Engineer\n* Svartalfheim\n* Society - The Stone Kingdom is divided by profession. Warriors are Iron. Miners, builders and other stone workers are Rock. All other civilians are Stone including the nobility which are 'of the people'. Social mobility exists but is rare in practice as most professions are inherited and kept for life.\n* History - Their civilization used to be much more extensive, but over the millenia of battling goblins and trolls, they have steadily lost territory and suffered horrific loses. If nothing changes, they may eventually face extinction. Their ongoing warfare has hardened the Stone Kingdom and their history is filled with tales of battle and loss. There are also tragic tales of missed opportunites when the war with the goblins could have been won.\n* Food - Herd animals, mushrooms, roots, fish, and largs crustaceans and insects make up their diet.\n* Politics - The Stone Kingdom is spread out among distant mountain ranges each with their own Stone King. These kingdoms have become so separated and the trip so treacherous that there is no competition over power between them and they rarely even communicate. Politics amoung local lords, however, is filled with typical castle intrigue and long knives.\n* Deep Roads - The various Kingdoms are connected by vast underground tunnels called the Deep Roads. The Deep Roads represent a phenomenal achievement of man power and artistry that clearly display the heights of the Stone Kingdom's power. It is also telling, that the current generations lack the manpower to even police these tunnels, let alone construct more. They are now more used by the dark enemies of the Stone Kingdom than the Kingdom itself.\n* Deep Rivers - Among the Deep Roads are underground rivers that can be traversed with rafts or longboats."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Delvers, Dwarv, Duergar, Dvergar, Dwarves"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Stone King"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stone King")
                      )
                    ),
                    Core.vx_new_string("Stone Lord"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stone Lord"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The highest circle of League society, they represent the wealthiest and most influencial families.  Many are mostly politicians, but all are expected to lead their troops in battle.")
                      )
                    ),
                    Core.vx_new_string("Iron Knight"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Knight"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Heavy Infantry outfitted in full plate armor.\n* Plate is extremely expensive, so it is only awarded to the finest warriors and is a symbol of high status. Of course the wealthy can simply buy it.")
                      )
                    ),
                    Core.vx_new_string("Iron Guard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Guard"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Heavy Pikeman skilled in Phalanx Formation.\n* Javelins are preferred for short range combat.\n* The Iron Legion lives in the mountains and has no tradition of horsemanship, so they use heavy phalanx\nformations to counter enemy cavalry."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Iron Maiden")
                      )
                    ),
                    Core.vx_new_string("Iron Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Warrior"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Footman with pick, sword or axe and shield.\n* Throwing axes and Javelins are preferred for short range combat.")
                      )
                    ),
                    Core.vx_new_string("Iron Hammer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Hammer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Iron League smiths are renowned as the greatest in the world.\n* When called to military duty, they carry heavy war hammers and wield them with well though their military training is nominal."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Iron Smith")
                      )
                    ),
                    Core.vx_new_string("Iron Siege Crew"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Siege Crew")
                      )
                    ),
                    Core.vx_new_string("Iron Dead Legionnaire"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Dead Legionnaire"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Stone Kingdom has little tolerance for prisoners. They are either fined and released or sentenced to death in the Dead Legion. The Dead Legion is a unique, fighting force of criminals stationed in abandoned forts deep underground. They are already considered dead and, as final atonement, they are assigned the most hazardous missions and consequently have a high attrition rate. Proof of death in combat while serving in the Dead Legion absolves a person of all crimes including family debts, so it also serves as a way out of bankruptcy.")
                      )
                    ),
                    Core.vx_new_string("Rock Delver"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rock Delver"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The underground equivalent of a Scout, the Delvers search the deep caverns for ore deposits and enemy\nstrongholds. They are a courageous lot with a short life expectancy.")
                      )
                    ),
                    Core.vx_new_string("Rock Miner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rock Miner"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Snow White and the 7 Dwarfs"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Stone Kingdom miners are powerfully strong sappers and cavers.\n* When called to military duty, they carry military picks and wield them with very well though their other military training is nominal."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Sapper, Stone Miner")
                      )
                    ),
                    Core.vx_new_string("Stone Archivist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stone Archivist"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Stone Kingdom has a long history, and it is the Archivist task to maintain that history on stone tablets. The Stone Kingdom reveres their ancestors like demigods, so the Archivist is also a sort of religious figure. In battle, they act as medics and healers.")
                      )
                    ),
                    Core.vx_new_string("Stone Mason"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stone Mason"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Stone Masons serve several purposes in society. They are stoneworkers, artisans, scribes,\narchivists, and religious figures. They are responsible for finishing the walls and tunnels both\nfunctionally and artistically. The walls are carved with stories from the archives and serve as a public\nlibrary for anyone to read. The specific story and artwork being appropriate to the location of the wall.")
                      )
                    ),
                    Core.vx_new_string("Stone Merchant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stone Merchant"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Merchants are one of the lowest classes of society. Selling the riches of the Kingdom instead of working with your hands is considered a cowardly profession. The merchants are also the most likely profession that outsiders might encounter.")
                      )
                    ),
                    Core.vx_new_string("Stone Skald"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stone Skald"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Dwarves love tales of their history, so Skald sing and tell these tales for coin. During battle they play wardrums, anvils, or horns to boost morale.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Alfar, Dark"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alfar, Dark"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Norse Dökkálfar (Dark Elf), or Svartalfar (Black Elf) - Subterranean creatures who dwell in the world of Svartalfaheim. Dark elves are often said to be responsible for many of the maladies befalling humanity.  In particular, bad dreams are said to be within the domain of the Dökkálfar, as indicated by the German word for nightmare, Albtraum ('Elf-dream').\n* Drow - Shetland Islands malicious troll-like creatures\n* Seven Deadly Sins: Pride"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Maximum Body - 4\n* Preferred Skills - Ranged (Archery), Art, Music, Darkness, Survival\n* Morale - Normal\n* Units - Elite Spies, Light Infantry, Heavy Infantry, Elite Light Archers, Heavy Cavalry, Siege Crews\n* Long ago, Elvish scholars came to the conclusion that the seaons of the world were changing and that the race of man would eventually drive the Elves from the world. The majority grudgingly accepted this as the way of things, but a vocal minority refused to accept their fate. They began searching for the tools to battle back against men. This search led them to release mind shattering demonic forces. The rest of the elves were horrified by this blashphemy and called the Great Hunt to systematically eradicate the renegades and put an end to their abominations. The renegades fled, but the hunters relentlessly pursued them, until the renegades bargained with the Dwarves for asylum in their caverns. These activities created a deep hatred between the Elves and Dark Elves as well as the deep distrust between the Elves and Dwarves."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Dark Elf, Dark Elv, Dökkálfar, Drow, Svartalfar")
              )
            ),
            Core.vx_new_string("Alfar, Light"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alfar, Light"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Seven Deadly Sins: Pride"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Maximum Body - 4\n* Morale - High\n* Preferred Skills - Ranged (Archery), Art, Music, Wild Magic, Survival\n* Units - Elite Scouts, Light Infantry, Elite Light Archers, Elite Longbow Archers\n\n* Norse Ljósálfar (Light Elf) or Hvítálfar (White Elf)\n* Personality - Whatever the Sidhe choose to do, they do it with grace and refinement. They have a strong sense of nobility and will not abide dishonorable acts. For this reason, they have little trust in Humans or Uruks. \n* Biology - Sidhe infants will often wander into the Dreaming to play with fae folk for their childhood years. Some Sidhe never grow up and stay with the fae, but most become teenagers and return to their community. They age and develop very slowly and can live for over 1000 years.\n* Personalties - Though they seem severe from an outsiders' perspective, this is because of their deep distrust of others. They are actually a very happy people who remember the lessons of the fae to always keep music and joy in their hearts. Unfortunately, their long lives sometimes make them make decisions slowly as well. They are often surprised by rapidly changing circumstances.\n* Abilities - Alfar have long ears with heightened sensitivity. This makes them keenly aware of intruders. Though their vision is unremarkable, they are accustomed to operating at night especially under moonlight.\n* Wild Alfar - Traditional Sidhe culture is closely connected to the woods. They live in semi-permanent settlements an live off the land similar to many native peoples.\n* High Alfar - Some Sidhe have settled down to build beautiful towns of stone and wood. Here they study the arts, sciences, and magick. The two cultures have grown distrustful of each other over their fundamentally different outlooks on life."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Eld, Eldar, Elf, Elv, Elves, Ljósálfar, Sidhe, Sylvan")
              )
            ),
            Core.vx_new_string(":Fae"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fae"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* All the world's a stage, And all the men and women merely players: They have their exits and their entrances - William Shakespere, As You Like It"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - Faeries are creatures of dreams. They are creative imagination personified, stories come to life. They represent ideals and are beyond mortal limitations. They do not age and have no require food or shelter. When they die, they eventually reincarnate in their original form (returning again and again like the seasons).\n* Nature faeries are intimately connected with nature and are in ways the spiritual manifestations of nature itself. They take on certain aspects of the area in which they are found. Mountain faeries are sturdy, sullen, and strong. Water faeries are mysterious and helpful with a hint of danger. Woodland faeries are good natured but touched with the spirit of the beast.\n* Location - The Fae folk live in [Arcadia], the ancestral realm of the Fae and in natural settings all over the world.\n* Personality - The goals of the faeries are mostly incomprehensible to mortals (who they call Children of Dust or Dustlings). Their ability to reincarnate makes them see life and death as cyclical. They see their actions as infinitely repeating, so they play their parts like actors on the stage. Some see themselves as villians or heroes, but all see everyone as characters playing their parts in the grand design. While playing their roles, fae are ritualistic and rigid in their actions since they are playing a game with specific rules (even to the point of death). Clever mortals can use these rules against them. Many Fae have lived for ages, but they only remember the epic repeating patterns that they live and are unconcerned with the fleeting lives of mortals.\n* On special nights almost all the wilderness falls under the the sway of Fae power. At such times it is best for normal folk to stay locked in their homes.\n* Chimera - Creatures or items formed from Dreams. They are powerful and dramatic to supernatural beings and dreamers, but they are invisible and have no effect on ordinary non-believers. People wielding make-believe swords fighting pretend monsters can appear rather silly to regular observers. If a chimera performs a feat that cannot be explained away by a viewing non-believer (e.g. riding a chimerical horse), the chimera will immediately vanish. Chimerical damage only affects the spirit, but it will appear as normal damage on supernatural creatures.\n* Glamour - The whole being of the Fae is suffused with magical energy of Dreams called Glamour. Fae use Glamour to alter the Dreaming and to create Chimera. Glamour is usually invisible ordinary people, but the Fae can sense it instinctively using an ability called 'Kenning'.\n* Epiphany - Fae seek Glamour constantly, discover mortals who possess and create it, and then somehow wrest, tear, or tease it out of them. When a Fae is present for a moment of creative genius or intense passion, the Fae experiences a moment of intense delight and revelation called an Epiphany. During an Epiphany, truths are revealed, connections made, and lifetimes relived. Epiphanies drive down their Banality and can also cause major changes to personality, court affiliation, or goals.\n* Banality - The Fae are creatures of dream and wonder. Banality is the force of cold reason, cynicism, and disbelief. If a Fae becomes too ordinary, it becomes overwhelmed by Banality in an event called the Undoing. After that, the Fae forgets its connection to the Dreaming and becomes forever mortal.\n* Mists - The Fae survived the Scourge of Banality by hiding their Fae nature in mortal form. Part of this disguise it to forget much of the Fae's true nature. When in mortal form, almost anything experienced beyond\nnormal mortal existence is forgotten like a dream. Robbed of their memories, changlings who assume mortal form understandably live frustrated, bitter lives, searching constantly for clues to their true identities.\n* Cold Iron - Wrought iron is the ultimate sign of Banality to changelings with a history lost in the Iron Age. Its presence makes Fae ill at ease and cold iron weapons cause horrible, smoking wounds that rob changelings of Glamour and threaten their very existence. It is so distasteful to changelings that they can sense cold iron in their immediate presence. Fortunately for the Fae, steel does not have the same affect on them, and primitive wrought iron is rarely used in modern times. A Fae who possesses cold iron receives a 	-1 penalty to to all actions.\n* Barter - Money in any form is the ultimate in Banality (the quantification of life), and the Fae will not have anything to do with it. Instead they practice the age old system of Barter, trading goods or services directly. Necessarily, haggling is a required skill among the Fae.\n* Quests - The idea of a quest if very alluring to the theatrical nature of the Fae. Even mundane activities are made more exciting when turned into a quest and holds off Banality. This does tend to make the Fae\nseem obsessive about small tasks and will go to great lengths to complete semmingly insignificat tasks. This can appear obsessive compulsive or even insane to others.\n* Oaths - Like Quests, the Fae take Oaths very seriously. They are pure lasting gifts that they can give to others. Even the chaotic Unseelie are loath to break an oath. Oathbreakers become outcasts. Breaking an oath is a sign of relativism and leads to Banality.\n* Festivals - The Fae calendar is marked by all sorts of festivals and holidays. The Fae are especially mindful of the seasons, but they don't need a big reason to celebrate. Fancy dress, costumes, drinking, and dancing are favorite activites.\n** Imbolc, February 2 - A festival celebrating the balefire surviving the long darkness of winter. At midwinter, couriers called firebrands carry balefire torches to each freehold. If is considered a very bad omen if a balefire is not replenished by the courier by Imbolc.\n** Carnival, February 28 - This day during human Mardi Gra, celebrates the relationship between nobles and commoners. Lords dress as jesters and common drunks are dressed as nobles. The public is free to mock the nobles and must dutifully follow the commands of the drunks. This time is meant to show the nobles are humble and understand their people, so no retribution is allowed for any affronts.\n** The Greening, April 4 - A loose celebration of spring with flowers and crowns of woven grass.\n** Beltaine, May 2 - The formal celebration of Spring and the switch of control from Unseelie to Seelie courts. It is a time of rebirth. Bonfires are lit and passions are let loose. It is considered a good omen for children to be conceived on Beltaine.\n** Highsummer Night, July 17 - A night of pranking on humans with competitions for the most outrageous pranks. Nicknamed Pranksgiving.\n** Pennons, October 4 - A martial festival with jousts, mock combats, and chimerical beasts. Musicians, artisans, and storytellers also gather to display their talents.\n** Samhain, October 31 - On Samhain Eve, the veil between worlds grows thin. It is a solemn time for Fae. It is a time to remember the fallen and the lost. Like Beltaine, the Fae court changes hande, in this case the Unseelie take control. The Unseelie celebrate by mocking the Seelie tournaments and courts.\n* Coutly Love - Love is one of the their favorite games filled with passion, high romance, and intrigue. It is considered impolite to reject a suitor out of hand, though some may send a suitor on a quest before entertaining the suitor. The courting process is essentially about flirting. It alternately involves granting favors and rejecting the suitor's efforts. The suitor has no rights except what their beloved grants, and proof of ardency is always required. Poems, songs, heroic deeds, wit, cunning, charm, and patience are all necessities of wooing. If a couple ever discover their true love, they swear Oaths of Love to each other and from then on will go to any lengths to protect one another.\n\nHistory\n* Prehistory - The Fae were born from mortal dreams and mostly dwell in Arcadia in the dreamlands.\n** Sundering - As mortals civilizations developed, reason overcomes both fear and wonder, and the Fae began their decline. During the Iron Age, a major shift like an earthquake occurred across Arcadia called the Sundering. Since the Sundering, the pathways to Arcadia became much more difficult and dangeerous and Cold Iron became the bane of Fae existence. Most noble Fae returned to Arcadia never to return while most common Fae were trapped on the mortal plane.\n** Shattering - The Fae had been in decline for millenia since the Sundering, but the devastation and hopelessness of Black Plague in the mortal world caused another tremendous breach between the mortal world and Arcadia. The Shattering refers to the breaking of all gates to Arcadia across the world. Physical travel between the realms has since become impossible.\n** Scourge - For years after the Shattering, waves of increasing Banality crossed the world, like a rising tide, threatening to slay every Fae remaining on the mortal realm. The only way to survive was hide in the few untouched wildernesses or to merge with human infants and forget their Fae nature. Most Fae could not or would not accept the sacrifice and simply faded away. The remaining few that chose to merge with human infants are called Changelings.\n** Changelings - Modern Fae on the mortal world are normal mortals most of the time, but their Fae nature comes out while dreaming. In dreams, they can return to Arcadia. While their mortal mind sleeps, the Fae mind awakens and can act in the mortal body. To those who can see Glamor, the original Fae form is visible. To others only the ordinary mortal form can be seen. Mortal life is a horrid prison to the Fae who must live in mortal drudgery while they slowly age and die. However, they may still create and experience wonder, and it is this touch of dream that the survivors cling to. Those who surrender to Banality, simply never awaken as Fae again and become normal mortals for the rest of their lives.\n** Resurgence - For hundreds of years the Changelings lived humble lives without contact with Arcadia. Then in 1969, man landed on the moon which fueled the imagination of nearly every person on Earth. An overwhelming\nstream of Glamour reopened the pathways to Arcadia and through these pathways a number of nobles returned.\n** The Final Season - Though the Fae are cyclical, they see that the Dreaming is slowly dying and eventually there will be no room for Fae in the world. They feel that the world is in the Autumn of its existence and an endless Winter lies ahead. Idealists insist that the Winter must inevitably lead to a glorious Spring, but there is little evidence to support this belief.\n\n* Change - Fae are never one thing. They are in constant change. Kind Fae are sometimes cruel. Cruel Fae are sometimes kind.\n\n* Courts - Most fae align themselves with either the Seelie or the Unseelie courts. The Seelie are honor tradition, peace, love, and chivalry. The Unseelie mock tradition, bring war and change, and uphold  individual freedoms and impulses. Though the courts are very different, they understand that everything has its season. Seelie Courts rule the Fae during the Spring and Summer. Unseelie Courts rule during the Fall and Winter.\n\nSeelie Court\n* The Seelie Court is composed of noble, regal, beautiful faeries who (at times) aid mortals.  Though mortals can be seen as irrelevant or annoying.\n* The Seelie have a reputation as the guardians of fae traditions. They are the peacekeepers, protectors of the weak, and the ideals of chivalry.\n* They are incomparable masters of music and song.\n* The Seelie Code\n** Death before dishonor - Honor is the most important virtue, the source of all glory.\n** Love conquers all - Love lies at the heart of the dreaming. True love transcends all and epitomizes what it means to be Seelie.\n** Beauty is life - Beauty is a timeless, objective quality that, while it cannot be defined, is always recognized for itself.\n** Never forget a debt - One gift deserves another. The recipient of a gift is obliged to return the favor.\n\nUnseelie Court\n* The Unseelie court is considered more rebellious, more democratic, and more rambunctious (aka murderous). They hold stagnation, repression, narrowmindedness, censorship, weakness, and traditionalism to be the worst crimes.\n* Where the Seelie dedicate themselves to preserving the traditions of the fae, the Unseelie style themselves as mockers of those traditions. The unseelie see themselves as radical visionaries, bringing about vital change and transformation through whatever means necessary, including violence.\n* The Unseelie Code\n** Change is good - Security does not exist. The slightest of circumstances can transform a king into a peasant. Chaos and discord rule the universe. Adapt or die.\n** Honor is a lie - Honor has no place in the modern world. It is a fairy tale constructed to cover the essential emptiness behind most traditions.\n** Passion before duty - Passion is the truest state of the fae spirit. Follow your instincts and act on your impulses. Live life to the fullest without regard to the consequences, they will come about regardless of what you do. Youth passes quickly, so have fun while you can. Death can come at any time, so live without regret.\n\nAttributes\n* [[Vulnerable]] to [[Iron]]\n* +2 [[Dreaming]]\n* +1 [[Illusion]]\n* -1 [[Melee Combat]]\n* -1 [[Close Combat]]"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Daoine maite, Fairies, Fey"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bane Spirit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bane Spirit"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("A corrupted Nymph")
                      )
                    ),
                    Core.vx_new_string(":Banshee"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Banshee"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Faerie Woman")
                      )
                    ),
                    Core.vx_new_string(":Boggart"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boggart"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A boggart (or bogart) is a household fairy which causes things to disappear, milk to sour, and dogs to go lame. Always malevolent, the boggart will follow its family wherever they flee.\n* It is said that the boggart crawls into people's beds at night and puts a clammy hand on their faces. Sometimes he strips the bedsheets off them. Sometimes a boggart will also pull on a person's ears.\n* Hanging a horseshoe on the door of a house is said to keep a boggart away."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bogart, Bogle, Boggle")
                      )
                    ),
                    Core.vx_new_string(":Brownie"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brownie"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Brownies are said to inhabit houses and aid in tasks around the house.  However, they do not like to be seen and will usually work at night.\n* Brownies are highly skilled craftsman and if unobserved or interrupted can perform tasks at extemely high speeds.\n* Description - They are short with thick downy hair and tend toward plumpness. They have large noses and small eyes. Their hands are large and callused, with gnarled knuckles but are very nimble.\n* They can be happy helping types, or selfish rumor mongers and schemers. Brownies are born of dreams of the comforts of home and hearth, and dreams of labour and reward. They prefer comfort over fancy things and tend to be plump and short with bushy hair and eyebrows.\n* Brownies tend to be obsessive compulsive regarding cleaning and chores and find great difficulty leaving anything incomplete or untidy. If a brownie becomes unhappy, it plays nasty tricks on the members of the household. Those include moving and rattling small objects, breaking dishes, leaving muddy little footprints, causing the walls of a house to creak, banging on pots and moaning.\n\n* +2 [Tradeskills]\n** [Cleaning]\n** [Cobbling]\n** [Leatherworking]\n** [Sewing]"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Domovoi, Tomte, Nisse")
                      )
                    ),
                    Core.vx_new_string(":Cat-sith"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cat-sith"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* My Plans! Roww! ... Slip through my paws! Roww! ... Just out of reeeeach!... The Hexite Crystal! Roww! - Fallen Feline, Runeterra\n* Alice: I'm not come back here looking for a fight. Cat: Really? That's a pity. One's certainly looking for you. - Alice: Madness Returns\n* Here's a tiny brain teaser for a tiny... well for you. - Cat, Alice: Madness Returns\n* Ah Alice. You can't go home again. No suprise really. Only a very few find the way and most of them don't recognize it when they do. Delusions too die hard. Only the savage regard the endurance of pain as the measure of worth. Forgetting pain is convenient, remembering it agonizing. But recovering the truth is worth the suffering. - Cat, Alice: Madness Returns"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The cat-sìth is all black with the exception of a white spot on its chest. It is as large as a dog and chooses to display itself with its back arched and bristles erect."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cheshire Cat, Fairy Cat (pronounced caught shee)")
                      )
                    ),
                    Core.vx_new_string(":Changeling"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Changeling"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The most unusual Fae are Changelings who are Fae Spirits that reincarnate within mortal children in the womb. These Changeling children usually do not remember their Fae self until an event of self realization called the Chrysalis when they become aware of their Fae heritage. The Chrysalis is a turmultuous time for the Fae that attracts others attuned to the Dreaming. Other Fae are obliged to assist the Changeling in their self-discovery. Since Fae are perpetually reincarnated, their Fae form may be millenia old while their mortal form may be just a child. As Changelings grow older the weight of mortal life tends to make it increasingly difficult to manifest their Fae form. Eventually, they tend to forget they were ever Fae at all, and their Fae form is trapped until their mortal body dies and they can reincarnate again.\n* Seeming - Changelings appear as normal people most of the time. Their Fae self can become aware accidentally during dreams and with practice can be called at will. When the Fae self is aware, the Changeling appears in their Fae form to other supernatural beings and those with strong imaginations (like young children). To others the Changeling aways appears as a normal person. Changeling activities are often mistaken for sleepwalking or psychotic behavior by normal people.")
                      )
                    ),
                    Core.vx_new_string(":Gremlin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gremlin"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Gremlin originated amongst R.A.F. aviators. The story attempted to explain the accidents which often occurred during their flights. Gremlins were also thought to have enemy sympathies, but investigation revealed that the enemy also had similar problems, so the gremlins were not taking sides in the conflict. In reality, the gremlins were a form of buck passing or deflecting blame."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Gremlins are generally short and green with rows of small, sharp teeth.\n* Gremlins have a close affinity with machines, and can intimidate machines into working correctly simply by yelling at it.\n* All Gremlins cannot resist machinery, tinkering, tearing apart and recreating trying to understand and improve. Despite their affinity for machines, anything they make will always have a small blemish or malfunction that they cannot remedy. Gremlins are obsessed with perfection and are constantly hammering on things to check for defects. Given this, their inability to create a flawless machine is a constant source of frustration.\n* As well as their knack for machinery, Gremlins are known for swearing continuously. It is virtually impossible for them to prevent an endless stream of curses and blasphemy from issuing forth from their lips, which puts them at something of a social disadvantage. To Gremlins, however, swearing can be considered an art form, and many Gremlins pride themselves on their creative profanity. Gremlins use their profanity and abrasive temperaments to test their fellow Fae as they test machines, to see what their breaking points are.\n* Preferred Skills - Artifice, Mechanics")
                      )
                    ),
                    Core.vx_new_string(":Knocker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Knocker"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Their name comes from the knocking on the mine walls that happens just before cave-ins, actually the creaking of earth and timbers before giving way. To some of the miners, the knockers were malevolent spirits and the knocking was the sound of them hammering at walls and supports to cause the cave-in. To others, who saw them as essentially well-meaning practical jokers, the knocking was their way of warning the miners that a life-threatening collapse was imminent."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Small [Fae] about two feet tall and grizzled, but not misshapen, they live beneath the ground. Here they wear tiny versions of standard miner's garb and commit random mischief, such as stealing unattended tools and food."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Knackers, Bwca (Welsh), Bucca (Cornish) or Tommyknockers (US)")
                      )
                    ),
                    Core.vx_new_string(":Leprechan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leprechan")
                      )
                    ),
                    Core.vx_new_string(":Muse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Muse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A beautiful [Fae] who offers inspiration to an artist to help drive them to further creative genius. However, this inspiration has often resulted in madness and premature death for the artist."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Leanan Sidhe (fairy mistress)")
                      )
                    ),
                    Core.vx_new_string(":Nymph"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nymph"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Nature beings tied to a specific locale.\n* Dryad - Trees\n* Hag - Shadowy Places\n* Naiad - Streams and Ponds\n* Oread - Hills and Mountains\n\n* Nymphs dislike leaving their natural locations.  When situations or politics demand that a Nymph take a\nleadership role, they draw straws with the short straw forced to assume leadership.")
                      )
                    ),
                    Core.vx_new_string(":Pixie"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pixie")
                      )
                    ),
                    Core.vx_new_string(":Pooka"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pooka"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Overview - Pooka are trickster shapeshifters. They are scoundrels and are perhaps the most charming and congenial of the Fae. Extremely lazy, Pooka hate work and love to play. Though generally well-intentioned, they are deceitful, devious, and more than a little goofy. Mundaneness disturbs them, and they have a particular fear of Banality.\n* Empathy - Though they seem immature, they are capable of great sadness and empathy, which they try to assuage by telling jokes and playing pranks. Lack of humor mystifies them and usually drives them to 'cheer up' their quarry with more manic pranks. Naturally, Unseelie pranks tend to be sick and twisted. For all their mischief, they have a strong sense of nobility and are loyal to friends and courageous in battle.\n* Deceitful - Truth is boring to Pooka, so they will pepper it with lies to make it more interesting. 	Because of their trickster nature, they are actually unable to tell a completely true statement. Though pookas never tell the entire truth, they also never lie completely which is crass and banal. Partially truths and partial lies are what pookas enjoy.\n* Manipulating - Pooka are masters of manipulation. While their actions appear random and sometimes comical, events seem to play out toward their grand designs.\n* Unpredictable - Pooka are never one thing. They are usually calm and humorous, but they are very capable of being cunning and cruel and can change moods in an instant.\n* Limited Shapechange - A pooka naturally has an animal form but may change to human form when no one is watching. They may stay in either form indefinitely with no effort, but a part of them always hints at their true nature. Sometimes a tail or fur remains. Sometimes hair can appear like long ears. Sometimes they hide a large animal tattoo.\n* Tails - Powerful Pooka have additional tails. The most powerful have nine. They start with 1 tail at level 1 and gain a tail every odd level up to 9 tails at level 17.\n* Illusion - Pooka are practiced illusionists and love using illusions for pranks and generally harmless fun. Consistent with their nature, Pooka illusions always have some truth mixed with lies. Their illusions always have hidden flaws that the Pooka purposely addes for their own entertainment.\n* Traps -"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Badger, Fox Spirit, Kitsune, Nine-tailed Fox, Tanuki"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Illusion"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Illusion")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Persuasion"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Persuasion")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Redcap"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Redcap"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hideous and vile, redcaps are the stuff of nightmares. Their cruel nature makes them rare in Seelie courts.\n* Description - Redcaps have stocky builds with grayish mottled skin and thick, bandy legs. They have horrid, bloodshot eyes, skeletal noses, and rubbery wrinkled faces. Worst of all are their ghoulish mouths, filled with yellowed, crooked, flat teeth used for grinding their prey to a pulp.\n* Redcaps are fierce in combat and use their flat teeth to deliver hideous, crushing wounds. They have a special ability to be able to eat enormous quantities of almost anything.\n* Redcaps are said to murder travelers who stray into their homes and dye their hats with their victims' blood (from which they get their name)."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
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
                    Core.vx_new_string(":Satyr"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Satyr"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* In mythology they are often associated with sex drive."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Description - Satyrs are lean and furry with long hair and rarely shave. They have furry legs, cloven hooves, and small horns jutting from their foreheads.\n* Personality - Satyrs are roguish fae. They speak in riddles and satisfy every lust with abandon. They have little restraint and will act impulsively most of the time. They are shamelessly forward, have fantastic stamina, and are notorious lovers of wine, women, music, drinking, wrestling, bragging, and are ready for every physical pleasure. They roam to the music of pipes and love to dance with the [Nymph]s (with whom they are obsessed, and whom they often pursue). Rarely they will go on raids into villages for women and booty.\n* Passion's Curse - Being impulsive, Satyrs are subject to rapid mood swings especially when drunk and"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Faun"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Bull Rush"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Bull Rush")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Performance"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Performance"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Captivating Song"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Captivating Song")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Pipes"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Pipes")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitspecialtymap"),
                                Core.f_new(
                                  Base.t_unitspecialtymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Music"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Music")
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
                    Core.vx_new_string(":Sprite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sprite")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Unique Fae"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Unique Fae"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("King Oberon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Oberon"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Seelie King")
                      )
                    ),
                    Core.vx_new_string("Queen Titania"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Queen Titania"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Seelie Queen")
                      )
                    ),
                    Core.vx_new_string(":Pan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pan")
                      )
                    ),
                    Core.vx_new_string(":Puck"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Puck"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Lord, what fools these mortals be! - Puck, A Midsummer Night's Dream")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Curses"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Curses"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Curse Spirit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Curse Spirit"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* What are cursed spirits to begin with? They're creatures that take shape when cursed energy, leaking from humans builds up like sediment... Compared to non-sorcerers, Jujutsu Sorcerers leak extremely little cursed energy... Jujutsu Sorcerers circulate cursed energy through their bodies well... If all of mankind were Jujutsu Sorcerers, then curses wouldn't be born. Then you could solve it simply by killing all non-sorcerers. Geto, Yuki - Jujutsu Kaisen\n* Nightmare on Elm Street"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Curses are manifestations of strong emotions such as love, hate, longing, fear, loneliness, trauma and dread. They are everywhere around us, but they exist on the [Spirit Periphery], so they are invisible except to those with spirit sight. Powerful Curses can effect changes in the physical world or even manifest a physical form. In this way they are similar to Undead spirits.\n* Creation - Curses are created from the Spirit Realm ([Fade, The]) from desires and compulsions. The stronger the desires and the more people with the same desires, the stronger the curse.\n* Power - Most Curses are weak and undetectable to those without high Spirit. The power of the Spirit is based on the concentration of negativity, so the most powerful appear in cities and in areas like graveyards, prisons, and asylums. They are defined by the emotions that created them, and seek to expand those emotions.\n* Curses gather in places with high emotions like schools, hospitals, asylums, prisons, graveyards, torture chambers, refugee camps, etc.\n* Curses can be exorcised, destroyed with magick, resolved by catharsis, or resolved by therapy."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bane")
                      )
                    ),
                    Core.vx_new_string(":Cursed"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cursed"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Princess Mononoke\n* Jason Voorhees\n* Monsterization... is a mental illness... It gets you engulfed in your own desires and traps you in a world your mind creates. It's a special type of mental illness that leads to physical metamorphosis. - Sweet Home"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Cursed being is a mortal corrupted by a [Curse Spirit] and usually transformed in a shocking way.\n* Creation - It is created when a Curse enters a person via a spiritual weakness created by some form of sin, obsession, anger, fear, guilt, hatred, or other strong emotion. The Curse strengthens the person's [Shadow] which will begin appearing to the person to tempt them with their desire. If the person succumbs to temptation, the Curse creates a fantasy world for the person while transforming its body into a twisted mirror of their desire. This transformation is permanent.\n* Madness - The Cursed being has a distorted view of existence filtered by their desire which has become an obsession. Their inability to discern fantasy from reality makes them exceptionally dangerous, but though the changes to their body cannot be reversed, their mental state can be improved.\n* Appearance - Cursed appearances are typically horrific though that can be subjective. Each appearance is unique to the individual and is based on the nature of their weakness.\n* Powers - Cursed powers are unique to the individual and are based on the nature of their weakness."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Corrupted, Corruption, Cursed, Formor, Formori, Freak, Monsterization")
                      )
                    ),
                    Core.vx_new_string("Adoration Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Adoration Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to follow someone without question.")
                      )
                    ),
                    Core.vx_new_string("Cruelty Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cruelty Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to enjoy being cruel to others.")
                      )
                    ),
                    Core.vx_new_string("Envy Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Envy Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to become intensely envious of others.")
                      )
                    ),
                    Core.vx_new_string("Fear Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fear Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to become overwhelmed by fear.")
                      )
                    ),
                    Core.vx_new_string("Generosity Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Generosity Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to give away everything they possess.")
                      )
                    ),
                    Core.vx_new_string("Greed Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greed Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to hoard or steal.")
                      )
                    ),
                    Core.vx_new_string("Grief Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Grief Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to endure unacceptable treatment.")
                      )
                    ),
                    Core.vx_new_string("Joy Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Joy Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to become overwhelmed by joy. This intense joy leaves them with no desire to do anything.")
                      )
                    ),
                    Core.vx_new_string("Love Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Love Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to seek nothing but true love.")
                      )
                    ),
                    Core.vx_new_string("Lust Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lust Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to seek unbridled romantic encounters.")
                      )
                    ),
                    Core.vx_new_string("Misery Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Misery Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to become miserable.")
                      )
                    ),
                    Core.vx_new_string("Rage Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rage Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to become enraged.")
                      )
                    ),
                    Core.vx_new_string("Stoic Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stoic Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to endure unacceptable treatment.")
                      )
                    ),
                    Core.vx_new_string("Suspicion Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Suspicion Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to become suspiscious of everyone.")
                      )
                    ),
                    Core.vx_new_string("Trust Curse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Trust Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Causes people to trust others without reservation.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Gnomes"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gnomes"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Gnomes of Zurich, Jewish Sterotypes (Short, Miserly, Balding, Moneylenders, Jewelers)"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Physical - Gnomes are a small race of men that have a tendancy to obsess over their chosen fields.\n* Personality - An obsessive race, Gnomes tend to choose a field of study and specializing deeply becoming leaders in their fields. Favorite areas of pursuit are finance, jewelry, mechanics, traps, artifice, and alchemy. They are sometimes very friendly, but they are extremely possessive of their knowledge and treasures. Their paranoid of thieves and competitors often prevents them from trusting others.\n* Morale - Normal\n* Units - Elite Observers, Light Infantry, Light Pikemen, Heavy Pikemen, Light Crossbow, Heavy Crossbow, Light Cavalry, Elite Siege Crews, Balloon Crews, Sorcerous")
              )
            ),
            Core.vx_new_string(":Halflings"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Halflings"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Lord of the Rings"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Morale - Low\n* Units - Elite Scouts, Elite Spies, Light Infantry, Light Spearmen, Light Archers, Light Pony Cavalry")
              )
            ),
            Core.vx_new_string(":Seraphim"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Seraphim"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Aerie"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Zephyr")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_mammals_marsupials
   * @return {chapter}
   * (func chapter_mammals_marsupials)
   */
  public static interface Func_chapter_mammals_marsupials extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_mammals_marsupials();
  }

  public static class Class_chapter_mammals_marsupials extends Core.Class_base implements Func_chapter_mammals_marsupials {

    @Override
    public Func_chapter_mammals_marsupials vx_new(Object... vals) {
      Class_chapter_mammals_marsupials output = new Class_chapter_mammals_marsupials();
      return output;
    }

    @Override
    public Func_chapter_mammals_marsupials vx_copy(Object... vals) {
      Class_chapter_mammals_marsupials output = new Class_chapter_mammals_marsupials();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_mammals_marsupials", // name
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
    public Func_chapter_mammals_marsupials vx_empty() {return e_chapter_mammals_marsupials;}
    @Override
    public Func_chapter_mammals_marsupials vx_type() {return t_chapter_mammals_marsupials;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_mammals_marsupials();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_mammals_marsupials() {
      return Bestiary.f_chapter_mammals_marsupials();
    }

  }

  public static final Func_chapter_mammals_marsupials e_chapter_mammals_marsupials = new Bestiary.Class_chapter_mammals_marsupials();
  public static final Func_chapter_mammals_marsupials t_chapter_mammals_marsupials = new Bestiary.Class_chapter_mammals_marsupials();

  public static Base.Type_chapter f_chapter_mammals_marsupials() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Mammals/Marsupials"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Apes"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Apes"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Ape"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ape")
                      )
                    ),
                    Core.vx_new_string(":Baboon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Baboon")
                      )
                    ),
                    Core.vx_new_string(":Chimpanzee"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chimpanzee")
                      )
                    ),
                    Core.vx_new_string(":Gibbon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gibbon")
                      )
                    ),
                    Core.vx_new_string(":Gorilla"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gorilla")
                      )
                    ),
                    Core.vx_new_string(":Orangutan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Orangutan")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Bats"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Bats"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Fruit Bat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fruit Bat")
                      )
                    ),
                    Core.vx_new_string("Vampire Bat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vampire Bat")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Bears"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Bears"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Black Bear"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Black Bear")
                      )
                    ),
                    Core.vx_new_string("Brown Bear"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brown Bear")
                      )
                    ),
                    Core.vx_new_string("Grizzly Bear"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Grizzly Bear"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* It has been estimated that a bite from a grizzly could crush a bowling ball."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("600kg")
                      )
                    ),
                    Core.vx_new_string("Polar Bear"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Polar Bear")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Cats"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cats"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bobcat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bobcat")
                      )
                    ),
                    Core.vx_new_string(":Cheetah"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cheetah")
                      )
                    ),
                    Core.vx_new_string(":Cougar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cougar")
                      )
                    ),
                    Core.vx_new_string("House cat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("House cat")
                      )
                    ),
                    Core.vx_new_string(":Jaguar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jaguar")
                      )
                    ),
                    Core.vx_new_string(":Leopard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leopard"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Panther, King Leopard - a [Large] Leopard with distinctive patterns of spots."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Neck Bite"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Neck Bite")
                                      )
                                    ),
                                    Core.vx_new_string(":Pounce"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Pounce")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Jungle Survival"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Jungle Survival")
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
                    Core.vx_new_string(":Lion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lion")
                      )
                    ),
                    Core.vx_new_string(":Lynx"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lynx")
                      )
                    ),
                    Core.vx_new_string(":Panther"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Panther")
                      )
                    ),
                    Core.vx_new_string(":Tiger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tiger"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Tora")
                      )
                    ),
                    Core.vx_new_string(":Wildcat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wildcat")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Canines"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Canines"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Akita"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Akita")
                      )
                    ),
                    Core.vx_new_string(":Bloodhound"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bloodhound")
                      )
                    ),
                    Core.vx_new_string(":Doberman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Doberman")
                      )
                    ),
                    Core.vx_new_string("German Shepherd"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("German Shepherd"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("40kg")
                      )
                    ),
                    Core.vx_new_string("Guard Dog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Guard Dog")
                      )
                    ),
                    Core.vx_new_string(":Husky"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Husky")
                      )
                    ),
                    Core.vx_new_string("Mad Dog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mad Dog")
                      )
                    ),
                    Core.vx_new_string(":Sheepdog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sheepdog")
                      )
                    ),
                    Core.vx_new_string("War Dog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("War Dog")
                      )
                    ),
                    Core.vx_new_string("Wild Dog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wild Dog")
                      )
                    ),
                    Core.vx_new_string(":Wolf"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wolf"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hearing - The upper range of a wolfs' hearing is upwards of 80 kHz. The upper range of humans is only 20 kHz. A wolf can hear up to 6 miles away in forest and 10 miles in open areas, including some high-pitched sounds that a human can't hear. Even when it sleeps, a wolf's ears stand straight up so it can catch sounds. Unlike humans, wolves can easily tell what direction sound is coming from by turning their ears from side to side.\n* Smell - The wolf's sense of smell is about 100 times better than a human's. It can smell prey more than a mile away if the wind is right. It can sense an animal three days after it's gone. Wolves finished a test to locate hidden food in five minutes that domestic dogs took over an hour to finish.\n* Vision - Beyond a short distance their vision must be somewhat blurred. Nevertheless, wolves can see shapes and, especially, movement over long distances, and their peripheral vision is extremely accurate.  They are able to detect even the slightest movements of very small animals, such as a mosquito, at a distance of more than ten feet. There is some controversy as to whether wolves see in color or black and white. Regardless, it is unlikely that they see the various hues of the spectrum as humans see them, because the physical makeup of the eye is different. Nighttime vision for wolves is many times better than human vision in the day or night. Wolves can actually see much better and even much more clearly at night. The eyes of the wolf are like most predators, with a sight-field of nearly 180 degrees and pointed forward."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lone Wolf")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Elephants"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Elephants"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("African Elephant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("African Elephant"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("40kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("10tons")
                      )
                    ),
                    Core.vx_new_string("Asian Elephant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Asian Elephant"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("40kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("5tons")
                      )
                    ),
                    Core.vx_new_string("Rogue Elephant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rogue Elephant")
                      )
                    ),
                    Core.vx_new_string("War Elephant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("War Elephant")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Herd Animals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Herd Animals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bison"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bison")
                      )
                    ),
                    Core.vx_new_string(":Camel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Camel"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Trot: 10mph / 16kph\n* Canter 17mph / 27kph\n* Gallop 22mph / 35kph (10km+)\n* Gallop 25mph / 40kph (1km burst)\n* These speeds are consistent with a horse. In terms of war, camels are probably superior given their better stamina and load capacity."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("35kph")
                      )
                    ),
                    Core.vx_new_string(":Cattle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cattle")
                      )
                    ),
                    Core.vx_new_string(":Deer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Deer")
                      )
                    ),
                    Core.vx_new_string("Draft Horse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Draft Horse"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("800kg")
                      )
                    ),
                    Core.vx_new_string(":Elk"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elk")
                      )
                    ),
                    Core.vx_new_string(":Moose"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Moose")
                      )
                    ),
                    Core.vx_new_string(":Reindeer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Reindeer")
                      )
                    ),
                    Core.vx_new_string(":Horse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Horse"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Trot: 10mph / 16kph (Cataphracts)\n* Canter 12mph / 19kph (Heavy Cavalry, Cataphracts Charge)\n* Gallop 20mph / 32kph (Light Cavalry, Heavy Cavalry Charge)\n* Gallop 25mph / 40kph (1km burst)\n* The U.S. Calvary in 1941 recommended that the collective weight of rider and gear not exceed 20% of the total weight of the horse."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Charger, Courser, Draft, Maverick, Pony, Stallion, War Horse"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("32kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("600kg")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Marsupials"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Marsupials"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Kangaroo"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kangaroo")
                      )
                    ),
                    Core.vx_new_string(":Koala"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Koala")
                      )
                    ),
                    Core.vx_new_string(":Opossum"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Opossum")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Rodents"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Rodents"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Beaver"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beaver")
                      )
                    ),
                    Core.vx_new_string(":Gerbil"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gerbil")
                      )
                    ),
                    Core.vx_new_string(":Ferret"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ferret")
                      )
                    ),
                    Core.vx_new_string(":Hamster"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hamster")
                      )
                    ),
                    Core.vx_new_string("Huge Rat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Huge Rat"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* What about the R.O.U.S.'s? Rodents Of Unusual Size? I don't think they exist. Raghh! - Westley, Buttercup, and ROUS - The Princess Bride")
                      )
                    ),
                    Core.vx_new_string(":Mouse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mouse")
                      )
                    ),
                    Core.vx_new_string("Plague Rat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Plague Rat")
                      )
                    ),
                    Core.vx_new_string(":Rabbit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rabbit")
                      )
                    ),
                    Core.vx_new_string("Rabid Rat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rabid Rat")
                      )
                    ),
                    Core.vx_new_string(":Rat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rat")
                      )
                    ),
                    Core.vx_new_string("Sewer Rat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sewer Rat")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Swine"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Swine"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Boar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boar")
                      )
                    ),
                    Core.vx_new_string(":Pig"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pig")
                      )
                    ),
                    Core.vx_new_string(":Razorback"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Razorback")
                      )
                    ),
                    Core.vx_new_string(":Warthog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Warthog")
                      )
                    ),
                    Core.vx_new_string("Wild Boar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wild Boar")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Other Mammals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Other Mammals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Badger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Badger")
                      )
                    ),
                    Core.vx_new_string(":Donkey"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Donkey")
                      )
                    ),
                    Core.vx_new_string(":Mule"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mule")
                      )
                    ),
                    Core.vx_new_string(":Hippopotamus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hippopotamus"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1.5tons")
                      )
                    ),
                    Core.vx_new_string(":Hyena"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hyena")
                      )
                    ),
                    Core.vx_new_string(":Porcupine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Porcupine"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hedgehog")
                      )
                    ),
                    Core.vx_new_string(":Rhinoceros"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rhinoceros"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Black Rhino, White Rhino")
                      )
                    ),
                    Core.vx_new_string(":Weasel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weasel")
                      )
                    ),
                    Core.vx_new_string(":Wolverine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wolverine")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Mammals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Mammals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bat, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bat, Huge")
                      )
                    ),
                    Core.vx_new_string("Boar, Great"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boar, Great")
                      )
                    ),
                    Core.vx_new_string("Ferret, Keen"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ferret, Keen"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* These furred scavengers are hoarders and theives by nature robbing nests and homes alike.  They have uncanny manual dexterity and are natural thieves able to squeeze into tight places, evade detection, and untie knots.\n* If caputured at infancy, they can be raised as pets and taught to steal for its master.  For this reason, they are valuable to professional thieves.\n* With training they can be taught to pick pockets and even pick simple locks."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("2kg"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string(".5m")
                      )
                    ),
                    Core.vx_new_string("Rat, Bog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rat, Bog")
                      )
                    ),
                    Core.vx_new_string("Rat, Crypt"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rat, Crypt")
                      )
                    ),
                    Core.vx_new_string("Rat, Plague"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rat, Plague")
                      )
                    ),
                    Core.vx_new_string(":Terrorphant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terrorphant"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A giant, carnivorous elephant. An evily, intelligent alpha predator.")
                      )
                    ),
                    Core.vx_new_string(":Terrorpotmus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terrorpotmus"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A giant, carnivorous hippopotamus. An keenly intelligent alpha predator.")
                      )
                    ),
                    Core.vx_new_string("Wolf, Dire"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wolf, Dire")
                      )
                    ),
                    Core.vx_new_string("Wolf, Warg"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wolf, Warg")
                      )
                    ),
                    Core.vx_new_string("Wolverine, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wolverine, Huge")
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
   * @function chapter_marine_creatures
   * @return {chapter}
   * (func chapter_marine_creatures)
   */
  public static interface Func_chapter_marine_creatures extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_marine_creatures();
  }

  public static class Class_chapter_marine_creatures extends Core.Class_base implements Func_chapter_marine_creatures {

    @Override
    public Func_chapter_marine_creatures vx_new(Object... vals) {
      Class_chapter_marine_creatures output = new Class_chapter_marine_creatures();
      return output;
    }

    @Override
    public Func_chapter_marine_creatures vx_copy(Object... vals) {
      Class_chapter_marine_creatures output = new Class_chapter_marine_creatures();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_marine_creatures", // name
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
    public Func_chapter_marine_creatures vx_empty() {return e_chapter_marine_creatures;}
    @Override
    public Func_chapter_marine_creatures vx_type() {return t_chapter_marine_creatures;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_marine_creatures();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_marine_creatures() {
      return Bestiary.f_chapter_marine_creatures();
    }

  }

  public static final Func_chapter_marine_creatures e_chapter_marine_creatures = new Bestiary.Class_chapter_marine_creatures();
  public static final Func_chapter_marine_creatures t_chapter_marine_creatures = new Bestiary.Class_chapter_marine_creatures();

  public static Base.Type_chapter f_chapter_marine_creatures() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Marine Creatures"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Crustaceans"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Crustaceans"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Crab"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crab")
                      )
                    ),
                    Core.vx_new_string("Giant Clam"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Clam")
                      )
                    ),
                    Core.vx_new_string("King Crab"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Crab")
                      )
                    ),
                    Core.vx_new_string(":Lobster"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lobster")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Fish"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fish"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Alligator Gar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alligator Gar")
                      )
                    ),
                    Core.vx_new_string(":Barracuda"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Barracuda")
                      )
                    ),
                    Core.vx_new_string(":Eel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Eel")
                      )
                    ),
                    Core.vx_new_string("Electic Eel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Electic Eel")
                      )
                    ),
                    Core.vx_new_string("Manta Ray"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Manta Ray")
                      )
                    ),
                    Core.vx_new_string("Moray Eel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Moray Eel")
                      )
                    ),
                    Core.vx_new_string(":Piranha"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Piranha")
                      )
                    ),
                    Core.vx_new_string("Sting Ray"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sting Ray")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Marine Mammals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Marine Mammals"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Blue Whale"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blue Whale")
                      )
                    ),
                    Core.vx_new_string(":Dolphin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dolphin"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Man had always assumed that he was more intelligent than dolphins because he had a achieved so much: the wheel, New York, Wars. Whilst all the dolphins had ever done was muck about in the water having a good time. But conversely, the dolphin thought they were more intelligent than man for precisely same reasonse. - Hitchhikers Guide to the Galaxy")
                      )
                    ),
                    Core.vx_new_string("Killer Whale"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Killer Whale")
                      )
                    ),
                    Core.vx_new_string("Sea Elephant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sea Elephant")
                      )
                    ),
                    Core.vx_new_string("Sea Lion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sea Lion")
                      )
                    ),
                    Core.vx_new_string(":Seal"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Seal")
                      )
                    ),
                    Core.vx_new_string("Sperm Whale"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sperm Whale")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Sharks"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Sharks"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Great White Shark"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Great White Shark"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
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
                            ),
                            Core.vx_new_string(":Senses"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Senses"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Blood Scent"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Blood Scent")
                                      )
                                    ),
                                    Core.vx_new_string("Electromagnetic Vision"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Electromagnetic Vision")
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
                    Core.vx_new_string("Tiger Shark"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tiger Shark"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Senses"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Senses"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Blood Scent"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Blood Scent")
                                      )
                                    ),
                                    Core.vx_new_string("Electromagnetic Vision"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Electromagnetic Vision")
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
            Core.vx_new_string("Other Marine"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Other Marine"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Coral"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Coral")
                      )
                    ),
                    Core.vx_new_string(":Octopus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Octopus")
                      )
                    ),
                    Core.vx_new_string("Giant Octopus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Octopus")
                      )
                    ),
                    Core.vx_new_string(":Squid"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Squid")
                      )
                    ),
                    Core.vx_new_string("Giant Squid"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Squid")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Marine Creatures"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Marine Creatures"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Crab, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crab, Giant")
                      )
                    ),
                    Core.vx_new_string("Maray Eel, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Maray Eel, Giant"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Giant, sightless eels native to deep undersea caves and grottos. These aggressive predators measure over 20 feet and have rows of sharp jagged teeth."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Kra")
                      )
                    ),
                    Core.vx_new_string("Kingfisher, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kingfisher, Giant")
                      )
                    ),
                    Core.vx_new_string("Lamprey, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lamprey, Huge")
                      )
                    ),
                    Core.vx_new_string("Octopus, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Octopus, Giant")
                      )
                    ),
                    Core.vx_new_string("Red Tide"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Red Tide")
                      )
                    ),
                    Core.vx_new_string("Sea Serpent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sea Serpent")
                      )
                    ),
                    Core.vx_new_string("Seahorse, Huge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Seahorse, Huge")
                      )
                    ),
                    Core.vx_new_string("Shark, Megalodon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shark, Megalodon")
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
   * @function chapter_microorganisms
   * @return {chapter}
   * (func chapter_microorganisms)
   */
  public static interface Func_chapter_microorganisms extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_microorganisms();
  }

  public static class Class_chapter_microorganisms extends Core.Class_base implements Func_chapter_microorganisms {

    @Override
    public Func_chapter_microorganisms vx_new(Object... vals) {
      Class_chapter_microorganisms output = new Class_chapter_microorganisms();
      return output;
    }

    @Override
    public Func_chapter_microorganisms vx_copy(Object... vals) {
      Class_chapter_microorganisms output = new Class_chapter_microorganisms();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_microorganisms", // name
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
    public Func_chapter_microorganisms vx_empty() {return e_chapter_microorganisms;}
    @Override
    public Func_chapter_microorganisms vx_type() {return t_chapter_microorganisms;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_microorganisms();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_microorganisms() {
      return Bestiary.f_chapter_microorganisms();
    }

  }

  public static final Func_chapter_microorganisms e_chapter_microorganisms = new Bestiary.Class_chapter_microorganisms();
  public static final Func_chapter_microorganisms t_chapter_microorganisms = new Bestiary.Class_chapter_microorganisms();

  public static Base.Type_chapter f_chapter_microorganisms() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Microorganisms"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Diseases"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Diseases"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bubonic Plague"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bubonic Plague")
                      )
                    ),
                    Core.vx_new_string(":Ebola"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ebola")
                      )
                    ),
                    Core.vx_new_string(":Gangrene"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gangrene")
                      )
                    ),
                    Core.vx_new_string(":Prion"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prion")
                      )
                    ),
                    Core.vx_new_string("Small Pox"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Small Pox")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Diseases"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Diseases"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Corpse Rot"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corpse Rot"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Disease transmitted by the bite of Ghouls/Necrophages. Symptoms include fever, severe weakness, unconsciousness, and a gradual blackening and swelling of the limbs starting at the site of the wound and spreading across the body. The disease only affects humans")
                      )
                    ),
                    Core.vx_new_string("Swamp Fever"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Swamp Fever"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A water-borne disease appearing only in hot weather. It causes irrational behavior, constant thirsting and a tendency to lean to one side while walking or standing. The irrational behavior gradually becomes permanent raving madness.")
                      )
                    ),
                    Core.vx_new_string(":Yakuk"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Yakuk"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A disease common in jungle regions, it causes the gradual loss of sight, hearing, smell, taste, and speech, one at a time over a 2 week period. The effect becomes permanent but is not fatal, though the sensory deprivation usually ends in madness.")
                      )
                    ),
                    Core.vx_new_string("Yellow Tinge"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Yellow Tinge"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An infectious disease that affects water breathers. The victim's gills slowly become clogged with a sticky, yellow secretion that interferes with breathing can kill if not treated.")
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
   * @function chapter_mythical_beasts
   * @return {chapter}
   * (func chapter_mythical_beasts)
   */
  public static interface Func_chapter_mythical_beasts extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_mythical_beasts();
  }

  public static class Class_chapter_mythical_beasts extends Core.Class_base implements Func_chapter_mythical_beasts {

    @Override
    public Func_chapter_mythical_beasts vx_new(Object... vals) {
      Class_chapter_mythical_beasts output = new Class_chapter_mythical_beasts();
      return output;
    }

    @Override
    public Func_chapter_mythical_beasts vx_copy(Object... vals) {
      Class_chapter_mythical_beasts output = new Class_chapter_mythical_beasts();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_mythical_beasts", // name
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
    public Func_chapter_mythical_beasts vx_empty() {return e_chapter_mythical_beasts;}
    @Override
    public Func_chapter_mythical_beasts vx_type() {return t_chapter_mythical_beasts;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_mythical_beasts();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_mythical_beasts() {
      return Bestiary.f_chapter_mythical_beasts();
    }

  }

  public static final Func_chapter_mythical_beasts e_chapter_mythical_beasts = new Bestiary.Class_chapter_mythical_beasts();
  public static final Func_chapter_mythical_beasts t_chapter_mythical_beasts = new Bestiary.Class_chapter_mythical_beasts();

  public static Base.Type_chapter f_chapter_mythical_beasts() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Mythical Beasts"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Beasts"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Beasts"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Aeroplasm"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aeroplasm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Aeroplasm is an unusual 15 foot tall invertibrate that lives entirely in the sky. It floats by means of air bladders filled with hydrogen gas which makes them spectacularly flammable if their bladders are ruptured by fire. They have long tendrils that contain a potent neurotoxin which they use to paralyze the birds and insects that they prey upon. During the Aeroplasm mating season, the males produce a luminous secretion that makes them glow in various colors to attract females. It is said that the sight of hundreds of Aeroplasms glowing in different shades in the night sky is a spectacular sight."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Floating Jellyfish")
                      )
                    ),
                    Core.vx_new_string(":Basilisk"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Basilisk")
                      )
                    ),
                    Core.vx_new_string(":Behemoth"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Behemoth")
                      )
                    ),
                    Core.vx_new_string("Boo Hag"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boo Hag")
                      )
                    ),
                    Core.vx_new_string(":Catoblepas"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Catoblepas"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The catoblepas (from the Greek 'to look downwards') is a legendary creature from Ethiopia. It is thought to be based on real-life encounters with wildebeest."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* It is said to resemble a cape buffalo, with its head always pointing downwards due to its great weight. Its stare or breath could either turn people into stone, or kill them."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Transform Other"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transform Other"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Petrification"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Petrification")
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
                    Core.vx_new_string(":Chimera"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chimera"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Chimera.png")
                      )
                    ),
                    Core.vx_new_string(":Chonchon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chonchon")
                      )
                    ),
                    Core.vx_new_string(":Cockatrice"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cockatrice")
                      )
                    ),
                    Core.vx_new_string(":Doppelganger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Doppelganger")
                      )
                    ),
                    Core.vx_new_string("Floating Eye"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Floating Eye"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Beholder, Evil Eye, Eye Killer, Eye of the Beholder")
                      )
                    ),
                    Core.vx_new_string(":Gargoyle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gargoyle")
                      )
                    ),
                    Core.vx_new_string(":Griffin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Griffin"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Griffin.png")
                      )
                    ),
                    Core.vx_new_string("Goblin Spider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblin Spider"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Traditional Japanese folk-lore understood that goblin-spiders had the power to transform from ordinary spiders to assume the form of men when night fell.")
                      )
                    ),
                    Core.vx_new_string(":Gorgon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gorgon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Medusa.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Medusa"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Transform Other"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transform Other"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Petrification"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Petrification")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Ranged"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ranged"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Short Bow"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Short Bow")
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
                    Core.vx_new_string(":Hippogriff"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hippogriff")
                      )
                    ),
                    Core.vx_new_string(":Hydra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hydra")
                      )
                    ),
                    Core.vx_new_string(":Jabberwocky"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jabberwocky")
                      )
                    ),
                    Core.vx_new_string(":Kirin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kirin"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dragon Horse")
                      )
                    ),
                    Core.vx_new_string(":Kraken"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kraken")
                      )
                    ),
                    Core.vx_new_string(":Lamassu"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lamassu"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Protective winged bull or lion; with the head of a human female.  Shedu is the male equivalent."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Shedu")
                      )
                    ),
                    Core.vx_new_string(":Manticore"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Manticore"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Persian Mythology"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A savage predator with the body of a lion, the tail of a scorpion, and the wings of a bat.\n* It has rows of razor sharp teeth and will bite off limbs and eat victims whole, bones and all.\n* Its tail stinger is, of course, poisonous. The poison is not especially deadly, but the shear amount of toxin injected from the large stinger makes survival unlikely.\n* It also has non-poisonous quills on its tail that can be flung at a target with a tail whip.")
                      )
                    ),
                    Core.vx_new_string(":Minotaur"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Minotaur")
                      )
                    ),
                    Core.vx_new_string(":Pegasus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pegasus")
                      )
                    ),
                    Core.vx_new_string(":Phoenix"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phoenix")
                      )
                    ),
                    Core.vx_new_string("Primal Ooze"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Primal Ooze"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Blob, Slime Beast")
                      )
                    ),
                    Core.vx_new_string(":Rukh"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rukh"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Rukh Egg - Magic the Gathering\n* Sindbad observed that when a karkadann spears an elephant on its horn, the elephant’s fat runs into the rhino’s eyes and blinds it; a rukh will then swoop down and carry both combatants off to feed its chicks."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Appearance - Rukhs are monstrously large birds vaguely similar in a appearance to a vulture.\n* Feeding - Rukhs are uncontested predators capable of feeding on the largest and most dangerous land animals. They have a particular fondness for giant serpents, elephants, and karkadanns or rhinoceroses.\n* Intelligence - Rukhs also appear to have some degree of intelligence, using boulders to smash prey."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Roc")
                      )
                    ),
                    Core.vx_new_string("Roc Hatchling"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roc Hatchling")
                      )
                    ),
                    Core.vx_new_string("Sea Horse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sea Horse")
                      )
                    ),
                    Core.vx_new_string(":Sphinx"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sphinx"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Highly intelligent")
                      )
                    ),
                    Core.vx_new_string("Tentacle Terror"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tentacle Terror"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Cthulu Mythos\n* Hentai"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A formless mass that can create writhing tentacles, eyes, and mouths from its body."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Roper, Tentacle Beast")
                      )
                    ),
                    Core.vx_new_string(":Terraphant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terraphant"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A hulking beast the size of an elephant with a head like an octopus.")
                      )
                    ),
                    Core.vx_new_string(":Thunderbird"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Thunderbird"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Thunderbird is a large bird with a special affinity for electricity. When a storm is present, the Thunderbirds true power is awakened.\n* The wings of Thunderbirds generate increasing static electricity with each flap.\n* Thunder Shield - Touching the Thunderbird triggers an electric shock and a sonic area attack.\n* Thunderstrike - With a shriek, the Thunderbird calls a lightning strike unto itself which is instantly redirected in the direction it is facing as if the lightning came from its mouth.\n* Thunderclap - When the Thunderbird claps its wings together a lightning bolt strikes it and produces a deafening sonic area attack around it.\n* Thunder Storm - By spreading its wings, the Thunderbird calls a lightning strike onto itself which is then split into multiple strikes that rain lightning down below it."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Stormcrow, Stormraptor")
                      )
                    ),
                    Core.vx_new_string(":Unicorn"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Unicorn")
                      )
                    ),
                    Core.vx_new_string(":Yeti"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Yeti")
                      )
                    ),
                    Core.vx_new_string("Wandering Eye"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wandering Eye"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Thw Wandering Eye is a bizarre, eel-like creature with a single, large, humanoid eye where a mouth and face would normally be. Eyes live in large groups underground and slowly float through the air like schools of fish. Their skin is a dark matte brown while their eye is highly reflective white, so usually the first view of Wandering Eyes is of a dozen disembodied eyes moving and blinking independently of one another in the dark.\n* Motivation - The Eyes are not intelligent nor malicious. They simply seek food, and will flee if startled or they are losing.\n* Levitation - Eyes produce a lighter than air gas that is stored in sacs down its body. These allow The creature to float and it can slowly propel itself through the air by making swimming motions.\n* Confusion - The creature's single, large eye doesn't seem to focus on anything and keeps moving about randomly. When a group of Wandering Eyes are seen, their weird, random eyes cause vertigo, confusion, fear, and sometimes madness. The Wandering Eye somehow feeds on this confusion and will attempt to trap victims and keep them in an intense state of confusion until they expire.\n* Weakness - Eyes are adjusted to life in the dark and are blinded by bright lights and large fires."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Eye Killer")
                      )
                    ),
                    Core.vx_new_string(":Ziz"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ziz")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Unique Beasts"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Unique Beasts"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Cerberus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cerberus")
                      )
                    ),
                    Core.vx_new_string(":Charybdis"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Charybdis"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Scylla and Charybdis are two sea monsters situated on opposite sides of a narrow channel of water, so close that sailors avoiding Charybdis will pass too close to Scylla and vice versa.\n* She takes form as a monstrous mouth. She swallows huge amounts of water three times a day and then belches them back out again creating whirlpools.")
                      )
                    ),
                    Core.vx_new_string(":Scylla"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scylla"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* You consider me the young apprentice...Caught between the Scylla and Charybdis...Hypnotized by you if I should linger...Staring at the ring around your finger - The Police, Wrapped around your Finger"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Scylla and Charybdis are two sea monsters situated on opposite sides of a narrow channel of water, so close that sailors avoiding Charybdis will pass too close to Scylla and vice versa.\n* Scylla is a horribly grotesque sea monster, with six long necks equipped with grisly heads, each of which contained three rows of sharp teeth. Her body consisted of twelve canine legs and a fish's tail.")
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
   * @function chapter_plants
   * @return {chapter}
   * (func chapter_plants)
   */
  public static interface Func_chapter_plants extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_plants();
  }

  public static class Class_chapter_plants extends Core.Class_base implements Func_chapter_plants {

    @Override
    public Func_chapter_plants vx_new(Object... vals) {
      Class_chapter_plants output = new Class_chapter_plants();
      return output;
    }

    @Override
    public Func_chapter_plants vx_copy(Object... vals) {
      Class_chapter_plants output = new Class_chapter_plants();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_plants", // name
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
    public Func_chapter_plants vx_empty() {return e_chapter_plants;}
    @Override
    public Func_chapter_plants vx_type() {return t_chapter_plants;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_plants();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_plants() {
      return Bestiary.f_chapter_plants();
    }

  }

  public static final Func_chapter_plants e_chapter_plants = new Bestiary.Class_chapter_plants();
  public static final Func_chapter_plants t_chapter_plants = new Bestiary.Class_chapter_plants();

  public static Base.Type_chapter f_chapter_plants() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Plants"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Herbs"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Herbs"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Acacia - aka gum arabic. Protection, Psychic Powers. Burn with sandalwood to open psychic centers. Parts used: dried gum, leaves, wood\n* Aconite - aka wolfsbane, monkshood, blue rocket *POISON* Don't ingest. Protection, Invisibility. Use this herb with great caution to consecrate the athame or ritual knife. Make an infusion with the leaves or root to banish prior energy from magickal blades and to infuse it with protection. The root or leaves may be burned as incense for the same purpose. Gather the fresh flowers to make a tincture to refresh the power of the knives. Use an infusion as a magickal wash for ritual tools or sacred space. Brings protection and magickal watchfulness against negative energies in ritual. Wash a new cauldron in the infusion or burn aconite in its first fire. Used to invoke Hecate. Wrap the seed in a lizard skin and carry to become invisible at will. Used to poison arrow tips in early times. Also as protection from and a cure for werewolves.\n* African Violet - Spirituality, Protection. Promotes spirituality when grown in the home.\n* Agaric - aka magic mushroom, redcap, death angel, death cap Fertility. Place on the altar or in the bedroom to increase fertility.\n* Agrimony - aka Church steeples, cocklebur, stickwort, sticklewort Protection, Sleep. Agrimony is best known for its sleep-inducing qualities, therefore it is excellent in dream pillows, especially mixed with mugwort. Enhances magickal healing. A wash or oil increases effectiveness of all forms of ritual healing, psychic healing, or distance healing. Anoint hands with oil to cleanse auras. Creates a barrier against negative energies. Use if you feel to be under psychic attack. A counter-magick herb, it not only breaks hexes, but sends them back to the hexer.\n* Alfalfa - Prosperity, Anti-hunger, Money. Brings in money and protects against financial misfortune. Harvest a small quantity at the full moon. Dry and burn in the cauldron. Place ashes in an magickal amulet.\n* Allspice - Money, Luck, Healing.\n* Almond - Money, Prosperity, Wisdom. Use oil, wash, or incense to anoint magickal wands or ritual candlesticks. (Almond wood makes excellent wands, especially for use in love magick). Excellent herbs for handfastings or other rituals of union. Also good for overcoming alcohol dependency. Almonds, leaves, and wood may be used in money magick. Placing almonds in your pocket will lead you to treasures.\nAloe -- aka burn plant, medicine plant Protection, Luck. Guards against evil influences and prevents household accidents. Plant aloe on the graves of loved ones to promote a peaceful existence until the deceased is reborn. Use for success in the world. Prevents feelings of loneliness.\nAloes, Wood -- aka Lignum aloes Love, Spirituality.\nAlthea -- aka marshmallow, sweet weed, wymote Protection, Psychic Powers. Burn as incense or carry as a sachet for a good psychic power stimulator. A good 'spirit puller.' It draws good spirits into workings and rituals when placed on the altar. An aphrodisiac -- make an oil from seeds gathered under the full moon to use on the genitals. An amulet made of the leaf or root worn near the genitals will accomplish the same ends.\nAlyssum -- aka Alison, Madwort Protection, Moderating Anger\nAmaranth -- Love-lies-bleeding, red cockscomb, velvet flower Healing, Protection, Invisibility. Used in pagan burial ritutals. Mends a broken heart.\nAnemone -- aka Meadow Anemone, Wind Flower, Pasque Flower Health, Protection, Healing. Use the blossoms in all healing rituals. Grow red anemones in the garden to protect the garden and the home. Wrap flowers in a red cloth and wear or carry to prevent disease. Use the flowers to color Ostara eggs.\nAnemone (Wood) -- aka crowfoot, windflower Healing.Used to invoke elemental air. Maturing flower is ideal nesting place for faeries. A charm against fevers. Use during rituals of death and dying.\nAngelica -- aka archangel, masterwort Exorcism, Protection, Healing, Visions. Use in all protection and exorcism incenses. Angelica protects in two ways: it creates a barrier against negative energy and fills you with good, radiant energy. Removes curses, hexes, or spells that have been cast against you. Enhances the aura. Gives a joyful outlook on life.\nAnise Seed -- aka aniseed, anneys Protection. Purification. Youth. Deals with inner, personal issues related to lack of fulfillment. Helps one to become more open to happiness and enjoy company of others. Put in dream pillows to protect from nightmares. Brings protection when traveling in the astral. Include anise in handfasting and wedding cakes.\nAnise, Star -- aka Chinese anise Use to consecrate ritual cups and chalices. Powdered stars may be used as incense to invoke your Deities or banish negative energy. Used in death and dying rituals.\nApple -- aka Silver bough, silver branch, tree of love Love, Healing, Garden Magick, Immortality. Use apple branches to make wands ideally suited for emotional and love magick. The apple branch will gain one admittance to the faery underworld. For healing, cut an apple into three pieces, rub on the afflicted part of the body, and bury outside. Do this during the waning moon to banish illness. Apples can be used for poppets or the apple wood carved into a poppet. Powder dried seeds and bark to burn as incense. (Caution: more than a few apple seeds can be poisonous). Apples are associated with the dead and Samhain, which is often called the Feast of Apples.\nApricot -- Love. Use juice in love spells or potions. Eat fruit to obtain a sweet disposition. Leaves and flowers can be added to love sachets and the pits carried to attract love.\nArabic Gum -- aka Arabic, Egyptian gum, Indian gum Purifies negativity and evil. Add to incense for good vibrations.See Acacia.\nArbutus -- Exorcism, Protection. Protects little children.\nArrow Root -- Increases one's good fortune and makes opportunity more visible on the horizon.\nAsafoetida -- aka Devil's dung, food of the gods Exorcism, Purification, Protection. Horrid odor. Use with caution. Used by those seeking the mysteries of the Horned God. Helps us break free of our negative desires. Increases the power of any ritual.\nAsh aka Nion Protection, Prosperity, Sea Rituals, Health. The Teutonic World Tree, Yggdrasil, is said to be an ash tree. An ash staff wards off evil. Healing wands should be made of ash wood. Carve poppets from the roots of the ash tree. Burning ash at Yule brings prosperity. Carry the leaves to gain love.\nAspen -- Eloquence, Anti-Theft.\nAster -- aka China Aster, Michaelmas Daisy, Starwort Use in love sachets, or carry the bloom to win love. Grow in the garden with a wish for love.\nAvens -- aka bennet, blessed herb, clove root, golden star, harefoot Exorcism, Purification, Love. Brings protection to the home, kindred, and self. A whole root is needed for an amulet. Burn ground or cut root to promote blessings and keep out negativity.\nAvocado -- aka alligator pear Love, Beauty, Lust. Grow a plant from the pit of an avocado to bring love into it. Wands made from avocado wood make potent all-purpose instruments.\nBachelor's Buttons -- aka devil's flower, red campion Love. Women wear this flower on their breast to attract love.\nBalm, Lemon -- aka bee balm, lemon basalm, melissa, sweet balm, sweet melissa Love. Success. Healing, especially for those with mental or nervous disorders. Use in love charms and spells to attract a partner. Opens one to the divine love of the Goddess. Gives energy to make one more desirable to the opposite sex.\nBalm of Gilead -- aka balsam tree Love, Manifestations, Protection, Healing. Carry the buds to mend a broken heart. Also steep them in red wine for a love potion. One of the best forms of magickal oils to be used to dress candles in magickal healing.\nBamboo -- Protection, Luck, Hex-Breaking, Wishes. Excellent for magick wands, representing all four elements. 'Growing up from the earth through water, it passes through the sky as it reaches toward the fire of the Sun.' Crush the wood to a powder and burn for protection -- or grow by the house for good fortune.\nBanana -- Fertility. Cures impotency. Use leaves, flowers, and fruits in prosperity and money spells.\nBanyan -- aka Indian fig tree, vada tree Luck.\nBarley -- Love, Healing, Protection. Use the grain or barley water in love spells.\nBasil -- aka Witches herb, American dittany, St. Joseph's herb Love, Exorcism, Wealth, Flying, Protection. Causes sympathy between two people and soothes tempers between lovers. Add to love sachets and incenses. Place in cash register or on doorsill of business to attract customers. Use when invoking elemental salamanders or communing with dragons. Also used for courage.\nBay -- aka bay laurel, laurel, sweet bay Protection, Psychic Powers, Healing, Purification, Strength. Used in clairvoyance and wisdom brews. Place leaves under pillow for prophetic dreams. Burn to cause vision. Attracts love and romance. Use to consecrate musical instruments. Bay leaves impart strength to athletes. Write wishes on bay leaves and burn.\nBean -- Protection, Exorcism, Wart Charming, Reconciliations, Potency, Love. Used in rattles, they scare away bad spirits. Rub a dried bean on warts during the waning Moon. As you do so, say 'As this bean decays, So wort, fall away!'\nBedstraw -- Worn or carried to attract love.\nBeech -- Wishes\nBeet -- Love. Use as an ink in love magick, also as a blood substitute.\nBelladonna -- aka banewort, witches berry, sorcerer's berry, deadly nightshade, death's herb, devil's cherries *Poison* Highly toxic. All parts of the plant are extremely poisonous. Encourages astral projection and produces visions, but belladonna is best avoided. A primary ingredient in flying ointments. Used in funeral rituals to aspurge the circle, helping the deceased to let go and move forward. Used to invoke Circe. Gather berries when they are ripe (around Samhain.) Store with onyx. Medicinally, it has been used as a sedative. As every part of the plant is extremely poisonous, neither leaves, berries, nor root should be handled if there are any cuts or abrasions on the hands. The root is the most poisonous, the leaves and flowers less so, and the berries, except to children, least of all. It is said that an adult may eat two or three berries without injury, but dangerous symptoms appear if more are taken, and it is wiser not to attempt the experiment. Though so powerful in its action on the human body, the plant seems to affect some of the lower animals but little. Rabbits, sheep, goats and swine eat the leaves with impunity, and birds often eat the seeds without any apparent effect, but cats and dogs are very susceptible to the poison. -- Grieve's Modern Herbal\nBenzoin -- Purification, Prosperity. Provides focus. Enhances concentration. Useful in astral travel (protects spirit while travelling). Promotes generosity. Brings increased success to any magickal working or to attain magickal goals. Used as a base for incense. Make an incense of benzoin, cinnamon, and basil to attract customers to your place of business.\nBergamot, Orange -- aka orange mint, bergamot Money. Put leaves in wallet or purse to attract money. Rub fresh leaves on money before spending.\nBe-Still -- aka trumpet flower, yellow oleander *POISON* Wear beans as a talisan to attract luck.\nBetony, Wood -- aka bishopwort, lousewort, purple betony Protection, Purification, Love. Placed under the pillow, it shields the sleeper from dreams. Throw in the Midsummer fire and jump through the smoke to purify the body. Very powerful in its ability to protect against dark and negative energy.\nBirch -- Protection, Exorcism, Purification. The traditional broom of the witch is made from birch twigs. Since birch is sacred to Thor, it is best to take the bark after the tree has been kissed by Thor, that is, hit by lightning. A circular grove of oak trees is among the most magickal of sites.\nBistort -- aka dragonwort, snakeweed, sweet dock Psychic Powers, Fertility. Carry bistort if you wish to conceive. Burn with frankincense to increase psychic powers or when using divination. Add to money and wealth incenses.\nBittersweet -- Protection, Healing\nBlackberry -- Healing, Money, Protection. Bake blackberry pies at Lammas. Use leaves and berries in spells of wealth. Dry fruit and powder it for use in magickal healing potions. Weave pentagrams from the brambles to hang in the home for protection.\nBladderwrack -- aka kelp, sea spirit, seawrack Protection, Sea Spells, Wind Spells, Money, Psychic Powers. Fill a small jar with whiskey, add kelp and cap tightly. Place in kitchen window to ensure a steady flow of money in the household.\nBleeding Heart -- Love. When grown, the plant brings love. If growing indoors, plant a penny in the soil to offset negative vibrations. (For some reason, this plant emits negativity when grown indoors -- maybe because love needs freedom to grow?) Lore: crush the flower. If the juice is red, your love has a heart full of love for you. If it is white, he or she does not.\nBloodroot -- aka king root, red root *POISON* Love, Protection, Purification. Wear or carry the root to draw love and to avert evil spells and negativity.\nBluebell -- aka harebell Luck, Truth. Anyone who wears a bluebell is compelled to tell the truth in all matters. Plant on graves. Comforts those left behind.\nBlueberry -- aka bilberry Protection. Keeping blueberries under the doormat will keep away undesirables. Eat blueberry pie when under attack. This gets the protection inside you and increases the herb's protectiveness.\nBlue Flag -- aka iris, liver lily, poison lily, flag lily, fleur-de-lys *POISON* Money. Carry the root for financial gain. Place in cash registers to increase business.\nBodhi -- aka bo-tree, peepul tree, pipul Fertility, Protection, Wisdom, Meditation.\nBoneset -- aka Indian sage, feverwort, sweating plant, teasel, wood boneset Protection. Exorcism.\nBorage -- Courage. Drink a tea for psychic powers. No matter how difficult the times, borage will always lift spirits.\nBracken -- Healing, Rain Magick, Prophetic Dreams. If bracken is burned outside, rain will fall. Place the root under the pillow and solutions to problems will appear in dreams. Also used for fertility and protection.\nBrazil Nut -- Carry as a talisman for love.\nBriony -- aka wild hops, wild vine, wood vine, gout root, mad root, snake grape Image Magick, Money, Protection.Often used as a substitute for the rare mandrake root in poppet magick. Money placed near briony root will increase, as long as it is left there. Hang in houses to protect against bad weather.\nBromeliad -- aka chameleon star, Earth star Protection, Money. Grow in the home for protection, money, and luxuries.\nBroom -- aka besom, basam, broom tops, Irish broom, Scotch broom *POISON* Purification, Protection, Wind Spells, Divination. Makes an excellent ritual or handfasting broom. Use to create sacred space. Blooms bring good fortune and plenty. To raise the winds, throw broom into the air while invoking the spirits of the Air. To calm the winds, burn broom and bury the ashes. An infusion sprinkled throughout the house exorcises poltergists.\nBuchu -- aka buku, oval buchu, short buchu Psychic Powers, Prophetic Dreams. Drink to foretell the future. Mix with frankincense and burn before sleep for prophetic dreams (only a small amount in the bedroom).\nBuckthorn -- Protection, Exorcism, Wishes, Legal Matters.\nBuckwheat -- aka beechwheat, French wheat, Saracen corn Money, Protection. Form magick circles with the flour for protection. Add a few grains to money incenses and keep in the kitchen to guard against poverty.\nBurdock -- aka beggar's buttons, cockleburr, great burdock Protection, Healing\nCactus -- Protection, Chastity. Cactus spines are used in witches bottles for protection. Carry or bury to release their protective powers.\nCalamus -- aka myrtle flag, sweet cane, sedge, sweet flag, sweet grass, sweet sedge *POISON* Luck, Healing, Money, Protection. String beads and wear for healing. Use powdered root in incenses and sachets. Used to strengthen and bind spells. Growing the plant brings good luck.\nCamellia -- Brings riches and luxury. Place fresh blossoms in water on altar during money and prosperity riches.\nCamphor -- Chastity, Health, Divination. A bag of camphor hung around the neck keeps flus and colds away. Use in divinatory incenses.\nCaraway -- Protection, Lust, Health, Anti-Theft, Mental Powers. Any object which holds some caraway seeds is theft-free. Induces lust when baked into breads, cookies, or cakes. The seeds strengthen the memory.\nCardamom -- Lust, Love. Add ground seeds to warmed wine for a quick lust potion. Bake in apple pies and add to sachets and incenses to induce love.\nCarnation -- aka jove's flower, gillies, gilliflower, sops-in-wine Protection, Strength, Healing. Use in all-purpose protection spells. Gives strength and energy to the sick. Place fresh carnation on the altar during healing spells and add dried flowers to healing sachets and incenses.\nCarob -- aka caroba, carobina, carobinha Protection, Health. Wear or carry.\nCarrot -- Fertility, Lust. Women should eat the seeds to become pregnant. Eat carrots to promote lust and cure impotence.\nCascara Sagrada -- aka sacred bark Legal Matters, Money, Protection. Sprinkle infusion around your home before going to court. It will help you win your case.\nCashew -- Money.\nCastor -- aka palma christi, palms christi root *POISON* Protection.\nCatnip -- aka catmint, cat's wort, field balm, nepeta, nip, catnep Cat Magick, Love, Beauty, Happiness. Give to your cat to create a psychic bond between the two of you. Use in love sachets with rose petals. Attracts good spirits and great luck. Used in beauty and happiness spells. Large pressed leaves are used for bookmarks in magickal texts. Mix with dragon's blood in an incense to rid oneself of bad habits or behavioral problems.\nCattail -- Lust. Carry if you don't like sex, but want to.\nCedar -- Healing, Purification, Money, Protection. The smoke is purifying and chases away bad dreams. Keep a piece in the wallet to draw money and in all money incenses. Add to love sachets and Burn for psychic powers.\nCelandine -- aka devil's milk, kenning wort, swallow-wort, tetterwort Protection, Escape, Happiness, Legal Matters. Aids in escaping unwarranted imprisonment or entrapment. Wear next to the skin and replace every three days. Cures depression, brings happiness when worn. Wear to court to win the favor of the jury.\nCelery -- Mental Powers, Lust, Psychic Powers. Chew seeds to aid concentration or in dream pillows to induce sleep. Burned with orris root, seeds increase psychic powers. Eat stalk to induce lust.\nCentaury -- aka christ's ladder, feverwort Burn to drive off snakes.\nChamomile -- aka ground apple, roman camomile, maythn, whig plant Money, Sleep, Love, Purification. Sprinkle around property to remove curses and spells cast against you.\nCherry -- aka sweet cherry Love, Divination.\nChestnut -- Love.\nChickweed -- aka adder's mouth, starweed, starwort, stitchwort, tongue grass Fertility, Love\nChicory -- aka succory, wild cherry, wild succory Removing Obstacles, Invisibility, Favors, Frugality. Carry to remove all obstacles that might crop up in your life. Rub juice on body to obtain favors from great persons.\nChili Pepper -- aka red pepper Fidelity, Hex Breaking, Love.\nChina Berry -- *POISON* Carry seeds for luck and to bring change into your life.\nChrysanthemum -- aka mum Protection. Promotes mental health. Use in rituals of death and dying.\nCinnamon -- aka sweet wood Spirituality, Success, Healing, Power, Psychic Powers, Lust, Protection, Love. Empower with tourmaline. Enhancing skills of prophecy through channeling, working through an oracle, or through divination. When burned as an incense, it raises high spiritual vibrations. Aids in healing. Draws money. Stimulates psychic power and produces protective vibrations. Great in sachets and amulets.\nCinquefoil -- aka crampweed, five finger blossom, five finger grass, goosegrass, silverweed, potentilla The five points of the leaves represent love, money, health, power, and wisdom. If carried, all these will be granted. Good for love magick and to promote an abundant harvest. Contains the energy to manifest one's ideas. An ingredient in mediaeval flying ointments.\nCitron -- Psychic Powers, Healing.\nClove -- Protection, Exorcism, Love, Money. Burn as an incense. Worn or carried, they attract the opposite sex.\nClover -- aka shamrock, trefoil, three-leaved grass Protection, Love, Money, Fidelity, Exorcism, Success.\nCoconut -- Purification, Protection, Chastity\nCoffee -- Ritual stimulant. Aztec, Mayan, and Incan peoples all revered the berry of this plant.\nCohosh, Black -- aka black snake root, bugbane, squawroot Love, Courage, Protection, Potency\nColtsfoot -- aka ass's foot, British tobacco, bull's foot, butterbur, Coughwort Use in love sachets and spells of peace and tranquility. Love, Visions.\nColumbine -- Love, Courage. Rub on hands for courage and daring or carry it. Seeds can be used in love perfume. Pulverize seeds and rub on hands to attract love. Practitioners of animal magick, those working with eagles (aquila=eagle), or those wishing to invoke the protection of deity through the realm of birds may work with this herb.\nComfrey -- aka boneset, bruisewort, knit back, knit bone, slippery root Good for any magickal healing. Worn or carried, it ensures safety during travel. The root is used in money spells.\nCopal -- Love, Purification. Added to love and purification incenses. A piece of copal can represent the heart in poppets.\nCoriander -- aka Chinese parsley, cilantro Love, Health, Healing. Used in love sachets and spells. Add the powdered seeds to warm wine to make a lust potion. Protects gardeners and all in their households. Gather at harvest and hang in the home for protection. The seeds promote peace between people who are unable to get along. Use it in drinks or crushed in incense. Helps one find romance and is an excellent herb to add to an elixir when the Great Rite is celebrated. Throw instead of rice at handfastings or add to the handfasting cake.\nCorn -- aka maize, seed of seeds, sacred mother Protection, Luck, Divination. Represents fertility and is used to invoke Mother Earth. Used at Mabon and Lammas in ritual, it teaches the mystery of life, death, and rebirth.\nCornflower -- aka blue bottle, bluecap, bluet Patron herb of herbalists. Blue leaves make a lovely ink for Book of Shadows.\nCotton -- Luck, Healing, Protection, Rain, Fishing Magick. Place cotton on an aching tooth to take away pain. Planted or scattered in yard, it keeps ghosts away. Burning cotton causes rain.\nCowslip -- aka arthritica, fairy cup, lady's key, buckles Healing, Youth, Treasure Finding. Place it beneath the front porch to discourage visitors. Preserves youth, and restores it when lost. The odor is healing, and holding a bunch will locate hidden treasure. Sacred to Freya, and can be used to invoke her. Some believe the path to Freya will lead one to earthbound treasures and abundance.\nCrocus -- Burn in a censor with alum to see a vision of the thief who robbed you. Love, Visions.\nCucumber -- aka cowcucumber Chastity, Healing, Fertility. Cooling and soothing to the psyche. Slices laid on eyes assists astral travel. Fruit hinders lust. Peel on head relieves pain of headache.\nCumin -- aka cumino, cumino aigro Protection, Fidelity, Exorcism, Anti-theft. Burned with frankincense for protection and scattered on the floor (sometimes with salt) to drive out evil. Used in love spells. When given to a lover, promotes fidelity. Cumin seed steeped in wine makes a lust potion.\nCurry -- Protection. Burn the specific plant, not the mixture of spices, to repel evil at night.\nCyclamen -- aka groundbread, sow bread, swine bread Fertility, Protection, Happiness, Lust. Add to handfasting or wedding cake.\nCypress -- aka Tree of Death Longevity, Healing, Comfort, Protection. Wear at time of crisis. Taken to funerals, eases grief and calms mind. Throw a sprig of cypress into a grave to give the deceased luck and love in the hereafter.\nDaffodil -- Love, Fertility, Luck\nDaisy -- Lust, Luck\nDamiana -- Lust, Love, Visions\nDandelion -- Divination, Wishes, Calling Spirits\nDeerstongue -- Lust, Psychic Powers\nDill -- Protection, Money, Lust, Luck\nDock -- Healing, Fertility, Money\nDogbane -- Use the flowers in magickal love mixtures.\nDogwood -- Wishes, Protection. Keeps writings and meetings secret, therefore is an excellent herb for the Book of Shadows. An oil of the flowers is priceless in sealing letters and keeping unintended eyes from secret writings. Powdered flowers and dried bark may be used as incense. Place the sap of the dogwood onto a handkerchief on Midsummer Eve. This will grant any wish you have as long as you carry it faithfully. Dogwood leaves or wood can be placed in protective amulets.\nDragon's Blood -- Love, Protection, Exorcism, Potency. Used in homemade magickal inks. Burn the resin to entice errant lovers to return. A stick placed under the pillow will cure impotency. A powerful protectant when sprinkled around the house or burned as incense. A pinch added to to other incenses will increase their potency.\nDulse -- Lust, Harmony\nDutchman's Britches -- Love\nEbony -- Protection, Power\nEchinacea -- Strengthening Spells\nEdelwiess -- Invisibility, Bullet-Proofing\nElder -- Exorcism, Protection, Healing, Prosperity, Peace\nElecampane -- Love, Protection, Psychic Powers\nElm -- Love\nEndive -- Love, Lust\nEucalyptus -- Healing, Protection\nEyebright -- Mental Powers, Psychic Powers\nFennel -- Protection, Healing, Purification\nFenugreek -- Money\nFern -- Rain Making, Protection, Luck, Riches, Health, Exorcism\nFeverfew -- Protection\nFig -- Divination, Fertility, Love\nFigwort -- Health, Protection\nFlax -- Money, Protection, Beauty, Psychic Powers, Healing\nFleabane -- Exorcism, Protection, Chastity\nFoxglove -- aka deadmen's bells, dog's finger, fairy thimbles, fox bells, witches bells, witches thimbles *POISON* Protection. Brings true magick to your garden by attracting faeries and plant devas. Assists in communion with the Underworld. Collect the juice of the herb under a favorable moon sign. Mark the very center of your circle with the juice and wait there to see the realm of faery.\nFrankincense -- Protection, Exorcism, Spirituality\nGardenia -- Love, Peace, Healing, Spirituality\nGarlic -- Protection, Healing, Exorcism, Lust, Anti-Theft\nGentian -- Love, Power\nGeranium -- Fertility, Love, Health, Protection\nGinger -- Love, Money, Success, Power\nGinseng -- Love, Wishes, Healing, Beauty, Protection, Lust\nGoats Rue -- Healing, Health\nGoldenrod -- Money, Divination\nGoldenseal -- Healing, Money\nGorse -- Protection, Money\nGotu Kola -- Meditation\nGourd -- Protection\nGrain -- Protection\nGrape -- Fertility, Garden Magick, Mental Powers, Money\nGrass -- Psychic Powers, Protection\nGround Ivy -- Divination\nGroundsel -- Health, Healing\nHawthorn -- Fertility, Chastity, Fishing Magick, Happiness\nHazel -- Luck, Fertility, Anti-Lightning, Protection, Wishes\nHeather -- aka heath Protection, Rain Making, Luck. Robert Graves said heather is a suitable tree for the inititation of Scottish witches. Brings one in touch with divinity and increases physical beauty. Wearing an amulet of the wood will bring a long physical life and put one in touch with the truly immortal soul. A valuable herb for those who pursue initiatory paths. Unfolds the inner self. Carried, it will guard against rape or other violent crimes or just to bring good luck. (White heather is best here.) When burned with fern will attract rain.\nHeliotrope -- Exorcism, Prophetic Dreams, Healing, Wealth, Invisibility\nHellebore, Black -- aka Melampode *Poison* Protection. Provides an aura or mantle of invisibility. The safest use of this herb is to place pieces of the root or dried berries in an amulet or magick pouch. Used to bless farm animals and pets. Good for working with familiars -- but please don't breathe the fumes or ingest!\nHemlock -- aka herb bennet, poison parsley, spotted hemlock, water parsley *Poison* Destroys sexual drive. Induces astral projection. Juice rubbed on magickal blades empower and purify them.Used in medievel flying ointments.\nHemp -- Healing, Love, Vision, Meditation\nHenbane -- aka black nightshade, devil's eye, henbells, poison tobacco, hogsbean *Poison* A love-bringing herb when worn. Traditionally used in ointments and brews. Induces delirium. Used with wisdom, it could be an excellent herb for consecrating ceremonial vessels. Attracts hares, therefore would be an excellent herb for those who raise rabbits.\nHenna -- Healing. Place on forehead to relieve headache. Attracts love if worn near the heart. Protects from illness and from evil eye. A body adornment originating in the Mediterranean. Modern witches use as a ritual adornment, especially for the Great Rite and other important ritual occasions. Henna mixed with olive oil, massaged on the penis at the rising and setting suns promotes virility.\nHibiscus -- Lust, Love, Divination\nHickory -- Legal Matters\nHigh John the Conqueror -- Money, Love, Success, Happiness\nHolly -- Protection, Anti-Lightning, Luck, Dream Magick. One of the best protective herbs. The wood of the holly is very well suited for the handle of the ritual knife as it both attracts and repels energies. It is powerful when defense is needed in circle while preserving the gentleness within it. Holly water is sprinkled on newborn babies to protect them. Carried by men, it promotes luck. (Ivy is the corresponding plant of luck for women). Decorate the house with it at Yule for good luck. After midnight on a Friday, without making a sound, gather nine holly leaves, preferably from a non-spiny plant (one that has smooth leaves). Wrap these up in a white cloth using nine knots to tie the ends together. Place this beneath your pillow, and your dreams will come true. -- Cunningham's Encyclopedia of Magickal Herbs\nHonesty -- Money, Repelling Monsters\nHoneysuckle -- aka goat's leaf, woodbine Money, Psychic Powers, Protection. Ring green candles with honeysuckle flowers to attract money or place them in a vase in the house for the same purpose. Lightly crush flowers and rub on forehead to heighten psychic powers. The extracted oil is best for increasing spiritual sight. It enhances understanding of images and impressions collected in the astral. Connects one with the mysteries of the Cauldron of Cerridwen. In ritual, dried, powdered bark may be used as incense.\nHops -- Healing, Sleep\nHorehound -- Protection, Mental Powers, Exorcism, Healing\nHorse Chestnut -- Money, Healing\nHorseradish -- Purification, Exorcism\nHorsetail -- Snake Charming, Fertility\nHouseleek -- Luck, Protection, Love\nHuckleberry -- Luck, Protection, Dream Magick, Hex Breaking\nHyacinth -- Love, Protection, Happiness\nHydrangea -- Hex Breaking\nHyssop -- Purification, Protection\nIndian Paint Brush -- Love\nIris -- Purification, Wisdom\nIrish Moss -- Money, Luck, Protection\nIvy -- Protection, Healing\nJasmine -- Love, Money, Prophetic Dreams\nJobs Tears -- Healing, Wishes, Luck\nJoe Pye Weed -- Love, Respect\nJuniper -- Protection, Anti-Theft, Love, Exorcism, Health\nKava-Kava -- Visions, Protection, Luck\nKnotweed -- Binding, Health\nLady's Mantle -- Love\nLady's Slipper -- Protection\nLarch -- Protection, Anti-Theft\nLarkspur -- Health, Protection\nLavender -- Love, Protection, Sleep, Chastity (with rosemary), Longevity, Purification, Happiness, Peace\nLeek -- Love, Protection, Exorcism\nLemon -- Longevity, Purification, Love, Friendship\nLemongrass -- Repel Snakes, Lust, Psychic Powers\nLemon Verbena -- Purification, Love\nLettuce -- Chastity, Protection, Love, Divination, Sleep\nLicorice -- Love, Lust, Fidelity\nLife Everlasting -- Longevity, Health, Healing\nLilac -- Exorcism, Protection\nLily -- Protection, Breaking Love Spells\nLily of the Valley -- Mental Powers, Happiness\nLime -- Healing, Love, Protection\nLinden -- Protection, Immortality, Luck, Love, Sleep\nLiverwort -- Protection, Love\nLoosestrife -- Peace, Protection\nLotus -- Protection, Lock-Opening\nLovage -- Love\nLove Seed -- Friendship, Love\nLucky Hand -- Employment, Luck, Protection, Money, Travel\nMace -- Psychic Powers, Mental Powers\nMagnolia -- Fidelity\nMaidenhair -- Beauty, Love\nMale Fern -- Luck, Love\nMallow -- Love, Protection, Exorcism\nMandrake -- aka herb of Circe, witches mannikin, wild lemon, sorceror's root *Poison* Protection, Love, Money, Fertility, Health. Few herbs are as steeped in magickal lore as mandrake. It is associated with the most intense practices of magick and especially well suited for love magick. It has great power as a visionary herb. It empowers visions, providing the impetus to bring them into manifestation. It intensifies the magick of any situation. A whole mandrake root placed in the home will bring protection and prosperity. Carried, it will attract love. The human shape of the root makes it well suited for use as poppet. (Substitute ash roots, apples, root of the briony, or the American may apple if the cost is prohibitive). To activate a dried mandrake, place it on the altar undisturbed for three days. Then place it in warm water overnight. The root will then be activated and ready for any magickal purpose.\nMaple -- Love, Longevity, Money\nMarigold -- aka calendula, drunkard, marybud, marygold Protection, Prophetic Dreams, Legal Matters, Psychic Powers. Aids visionary sight and helps find stolen property by producing a vision of the thief in the mind and the location of the stolen property. Dried petals may be used alone or mixed with dried incense to consecrate divination tools. Petals may be macerated in sunflower oil to make an oil of consecration. Adds a special, loving magick to rituals of death and dying. Carry marigold petals with a bay leaf to quiet gossip.\nMarjoram -- Protection, Love, Happiness, Health, Money\nMastic -- Psychic Powers, Manifestations, Lust\nMay Apple -- aka American mandrake, duck's foot, hog apple, racoon berry *Poison* Money. Generally used as a substitution for European (true) mandrake. Its uses are practically identical, although the may apple is not related to the true mandrake.\nMeadow Rue -- Divination\nMeadowsweet -- Love, Divination, Peace, Happiness\nMesquite -- Healing\nMimosa -- Protection, Love, Prophetic Dreams, Purification\nMint -- Money, Love, Lust, Healing, Exorcism, Travel, Protection\nMistletoe -- aka Witches broom, Thunderbesom, Holy wood, Golden bough Protection, Love, Hunting, Fertility, Health, Exorcism.\nMoonwort -- Money, Love\nMoss -- Luck, Money\nMugwort -- aka Artemis herb, Artemisia, Felon herb, Muggons, Naughty Man, Sailor's Tobacco, St. John's Plant Strength, Psychic Powers, Protection, Prophetic Dreams, Healing, Astral Projection. Use a wash or the oil to consecrate or anoint crystal balls or any tool of divination. Produces visionary dreams and is a prime ingredient in dream pillows. Keeps one safe from dark forces. Protects children. Incense brings protection. Carried, it brings loved ones safely home from journeys. A tonic for the soul, it keeps us aware of our spiritual direction. Burn with sandalwood or wormwood during scrying sessions. A mugwort infusion sweetened with honey will enhance divination. Carried, it also increases lust and fertility.\nMulberry -- Protection, Strength\nMullein -- Courage, Protection, Health, Love, Divination, Exorcism\nMustard -- Fertility, Protection, Mental Powers\nMyrrh -- Protection, Exorcism, Healing, Spirituality\nMyrtle -- Love, Fertility, Youth, Peace, Money\nNettle -- Exorcism, Protection, Healing, Lust\nNorfolk Island Pine -- Protection, Anti-Hunger\nNuts -- Fertility, Prosperity, Love, Luck\nOak -- Protection, Health, Money, Healing, Potency, Fertility, Luck\nOats -- Money\nOlive -- Healing, Peace, Fertility, Potency, Protection, Lust\nOnion -- Protection, Exorcism, Healing, Money, Prophetic Dreams, Lust\nOrange -- Love, Divination, Luck, Money\nOrchid -- Love\nOregon Grape -- Money, Prosperity\nOrris -- aka Florentine Iris, Queen Elizabeth Root Love, Protection, Divination. The root is used to find and hold love. The root powder is known as Love Drawing Powder. Protects from evil spirits. The roots and leaves hung in the house and added to the bath are good for personal protection. Make a pendulum with a small piece of the wood.\nPalm, Date -- Fertility, Potency\nPansy -- Love, Rain Magick, Love, Divination\nPapaya -- Love, Protection\nParsley -- Love, Protection, Purification\nPassion Flower -- Peace, Sleep, Friendship\nPatchouly -- Money, Fertility, Lust\nPea -- Money, Love\nPeach -- Love, Exorcism, Longevity, Fertility, Wishes\nPear -- Lust, Love\nPecan -- Money, Employment\nPennyroyal -- Strength, Protection, Peace\nPeony -- Protection, Exorcism\nPepper -- Protection, Exorcism\nPeppermint -- Purification, Sleep, Love, Healing, Psychic Powers\nPeriwinkle -- aka Sorcerer's Violet, Blue Buttons *POISON* Patron herb of Wiccans. Love, Lust, Mental Powers, Money, Protection. Best when gathered when the moon is one night old, nine nights old, 11 nights old, 13 nights old, or 30 nights old. The dried flowers may be added to any magickal mixture to enhance the working. Banishes negative energy. Makes one feel desirable. Add dried flowers or root to amulets to bring necessary changes to one's life to attract a loving partner. Plant on graves of children. Helps grieving parents heal from their loss. Keeps memory of lost child alive without unhealthy attachments.\nPersimmon -- Healing, Lust\nPimento -- Love\nPine -- Healing, Fertility, Protection, Exorcism, Money\nPineapple -- Luck, Money, Chastity\nPistachio -- Breaking Love Spells\nPlum -- Healing\nPoke -- Courage, Hex Breaking\nPomegranate -- Divination, Luck, Wishes, Wealth, Fertility\nPoplar -- Money, Flying\nPoppy -- Fertility, Love, Sleep, Money, Luck, Invisibility\nPotato -- Image Magick, Healing\nPrickly Ash -- Love\nPrimrose -- Protection, Love\nPurslane -- Sleep, Love, Luck, Protection, Happiness\nQuince -- Protection, Love, Happiness\nRadish -- Protection, Lust\nRagweed -- Courage\nRaspberry -- Protection, Love\nRattlesnake Root -- Protection, Money\nRhubarb -- Protection, Fidelity\nRice -- Protection, Fidelity\nRoots -- Protection, Power, Divination\nRose -- Love, Psychic Powers, Healing, Love, Divination, Luck, Protection\nRosemary -- Protection, Love, Lust, Mental Powers, Exorcism, Purification, Healing, Sleep, Youth\nRowan -- Psychic Powers, Healing, Protection, Success\nRue -- Healing, Health, Mental Powers, Exorcism, Love\nRye -- Love, Fertility\nSaffron -- Love, Healing, Happiness, Wind Raising, Lust, Strength, Psychic Powers\nSage -- Immortality, Longevity, Wisdom, Protection, Wishes\nSagebrush -- Purification, Exorcism\nSt. John's Wort -- Health, Power, Protection, Strength, Love, Divination, Happiness\nSandalwood -- Protection, Healing, Exorcism, Spirituality\nSarsaparilla -- Love, Money\nSassafras -- Health, Money\nSavory, Summer -- Mental Powers\nSkullcap -- Love, Fidelity, Peace\nSenna -- Love\nSesame -- Money, Lust\nShallot -- Purification\nSkunk Cabbage -- Legal Matters\nSlippery Elm -- Halts Gossip\nSnakeroot -- Luck, Money\nSnakeroot, Black -- Love, Lust, Money\nSnapdragon -- Protection\nSolomon's Seal -- Protection, Exorcism\nSorrel Wood -- Healing, Health\nSouthern Wood -- Love, Lust, Protection\nSpanish Moss -- Protection\nSpearmint -- Healing, Love, Mental Powers\nSpiderwort -- Love\nSpikenard -- Love\nStar Anise -- Psychic Powers, Luck\nStrawberry -- Love, Luck\nSugar Cane -- Love, Lust\nSunflower -- Fertility, Wishes, Health, Wisdom\nSweetgrass -- Calling Spirits\nSweetpea -- Friendship, Chastity, Courage, Strength\nTansy -- Health, Longevity\nTea -- Riches, Courage, Strength\nThistle -- Strength, Protection, Hex Breaking, Healing\nThistle, Holy -- Purification, Hex Breaking\nThistle, Milk -- Snake enraging\nThyme -- Health, Healing, Sleep, Psychic Powers, Love, Purification, Courage\nToadflax -- Protection, Hex Breaking\nToadstool -- Rain Making\nTobacco -- Healing, Purification\nTonka Bean -- aka Coumaria Nut, Tonqua, Tonquin Bean *DO NOT CONSUME. BELIEVED TO CAUSE CANCER* Love. Money. Courage. Wishes. Used extensively in love sachets and mixtures, and carried to attract love. Also worn or carried to attract money, bring luck, grant courage, and ward off illness.\nTurmeric -- Purification\nTurnip -- Protection, Ending Relationships\nUva Ursa -- Psychic Workings\nValerian -- Love, Sleep, Purification, Protection\nVanilla -- Love, Lust, Mental Powers\nVenus Flytrap -- Protection, Love\nVervain -- The Witches Herb. Love, Protection, Purification, Peace, Money, Youth, Chastity, Sleep. Healing. Empowers any magick, especially love spells. Enhances the dreaming process and is recommended for dream quests. Used to consecrate and empower any ritual tools. Protects from negative emotions and depression. Used in house and home blessings. Turns back negativity. In love spells: add to recipes to attract mates, find true love, achieve sexual fulfilment, work sexual magick, an for bringing extra bliss on the wedding night. The herb of poets, singers, and bards. Inspires artistry. Instills a love of learning. Best when gathered at Midsummer.\nVetch, Giant -- Fidelity\nVetivert -- Love, Hex Breaking, Luck, Money, Anti-Theft\nViolet -- Protection, Love, Lust, Luck, Wishes, Peace, Healing\nWalnut -- Health, Mental Powers, Infertility, Wishes\nWheat -- Fertility, Money\nWillow -- Love, Divination, Protection, Healing\nWintergreen -- Protection, Healing, Hex Breaking\nWitch Hazel -- Protection, Chastity\nWolf's Bane -- see Aconite\nWood Rose -- Luck\nWoodruff -- Victory, Protection, Money\nWormwood -- Psychic Powers, Protection, Love, Calling Spirits\nYarrow -- Courage, Love, Psychic Powers, Exorcism\nYellow Evening Primrose -- Hunting\nYerba Mate -- Fidelity, Love, Lust\nYerba Santa -- Beauty, Healing, Psychic Powers, Protection\nYucca -- Transmutation, Protection, Purification"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Belladonna"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Belladonna"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Optometrists and ophthalmologists use atropine for pupil dilation in eye examinations."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Deadly Nightshade - Plant with highly toxic and hallucinogenic berries.\n* Belladonna is one of the most toxic plants found in the Western hemisphere. Children have been poisoned by eating as few as three berries. Ingestion of a leaf of the Belladonna can be fatal to an adult. The root of the plant is generally the most toxic part.")
                      )
                    ),
                    Core.vx_new_string(":Cannabis"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cannabis"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Marijuana and Hashish plant.")
                      )
                    ),
                    Core.vx_new_string(":Curare"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Curare")
                      )
                    ),
                    Core.vx_new_string("Fertility Herb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fertility Herb")
                      )
                    ),
                    Core.vx_new_string("Fly Agaric"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fly Agaric"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Hallucinogenic Mushroom")
                      )
                    ),
                    Core.vx_new_string(":Hemlock"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hemlock")
                      )
                    ),
                    Core.vx_new_string(":Henbane"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Henbane"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Hallucinogenic Plant which can be toxic (hen killer)")
                      )
                    ),
                    Core.vx_new_string(":Holly"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Holly"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Holly is a shrub or tree growing up to 25m high. Holly berries are mildly toxic and will cause vomiting and/or diarrhea when ingested by people. However they are extremely important food for numerous species of birds, and also are eaten by other wild animals.\n* The wood is heavy, hard and white; one traditional use is for chess pieces, with holly for the white pieces, and ebony for the black.\n* The leaves can be used to make caffeine rich teas.")
                      )
                    ),
                    Core.vx_new_string(":Kava"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kava"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Tranquilizing Leaves")
                      )
                    ),
                    Core.vx_new_string(":Lotus"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lotus")
                      )
                    ),
                    Core.vx_new_string(":Mescal"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mescal")
                      )
                    ),
                    Core.vx_new_string("Hallucinogenic Bean"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hallucinogenic Bean")
                      )
                    ),
                    Core.vx_new_string(":Mistletoe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mistletoe"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A parasitic plant on the branches of a tree or shrub. The appearance and nature of the fruit's content is very similar or suggestive of human semen and is therefore popular in fertility rites (e.g. kissing under the mistletoe).\n* It can be used in treating circulatory and respiratory system problems, and cancer.\n* It is popularly thought to be an antidote for [Poison], though it is sometimes poisonous itself.")
                      )
                    ),
                    Core.vx_new_string("Opium Poppy"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Opium Poppy"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Flowering plant used in Opium and poppy seeds.")
                      )
                    ),
                    Core.vx_new_string(":Orchid"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Orchid")
                      )
                    ),
                    Core.vx_new_string(":Peyote"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Peyote"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Hallucinogenic Cactus")
                      )
                    ),
                    Core.vx_new_string(":Tobacco"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tobacco")
                      )
                    ),
                    Core.vx_new_string(":Wolfsbane"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wolfsbane"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wolfsbane (aka Aconitum) is a genus of flowering plant belonging to the buttercup family.\n* Aconitine is a potent neurotoxin.\n* Oral Poisoning - In a few minutes ingesting a poisonous dose of aconite, marked symptoms supervene. There is a sensation of burning, tingling, and numbness in the mouth, and of burning in the abdomen. After about an hour, there is severe vomiting with much motor weakness. The pulse and respiration steadily fail, death occurring from asphyxia. As in strychnine poisoning, the patient is conscious and clear-minded to the last. The only post-mortem signs are those of asphyxia. The treatment is to empty the stomach by tube or by inducing extreme vomiting.\n* Contact Poisoning - It may also be easily absorbed through the skin, and poisoning may occur through this route simply by picking the leaves without gloves. The toxin in the sap is absorbed through the skin. From practical experience, the sap oozing from eleven picked leaves will cause cardiac symptoms for a couple of hours. Tingling will start at the point of absorption, and extend up the arm to the shoulder, after which the heart will start to be affected. The tingling will be followed by numbness which is fairly unpleasant.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Trees"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Trees"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bamboo"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bamboo")
                      )
                    ),
                    Core.vx_new_string(":Birch"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Birch")
                      )
                    ),
                    Core.vx_new_string(":Cedar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cedar")
                      )
                    ),
                    Core.vx_new_string(":Ebony"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ebony"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A medium-sized evergreen, reaching 20-25 m tall. The fruit is a small berry 2 cm diameter, similar to a small persimmon.\n* Ebony heartwood is one of the most intensely black woods known, which, combined with its very high density (it is one of the very few woods that sink in water), fine texture, and ability to polish very smoothly, has made it very valuable as an ornamental wood.")
                      )
                    ),
                    Core.vx_new_string(":Larch"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Larch")
                      )
                    ),
                    Core.vx_new_string(":Pine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pine")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Spices"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Spices"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Salt"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Salt"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("A symbol of purity")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Plants"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Plants"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Black Lotus"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Black Lotus"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/BlackLotus.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Blue Lotus - Recent studies have shown Nymphaea caerulea to have psychedelic properties, and may have been used as a sacrament in ancient Egypt and certain ancient South American cultures.  Dosages of 5 to 10 grams of the flowers induces slight stimulation, a shift in thought processes, enhanced visual perception, and mild closed-eye visuals."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Black Lotus is a medium sized blue/black flower that has strong hallucinogenic and magical properties. Eating the petals of the Lotus creates pleasant hallucinations that are strongly addictive over time. The greatest danger of eating lotus petals is that the potency grows from mild euphoria at the tip of the petal to intense hallucinations, madness, and death near the flower.  The trick is to only eat the amount that will give you the effect you desire, but the flower is hard to get and the temptation is strong to go back for more. The desperately addicted Lotus-Eaters eventually use too much and go mad or die.\n* Black Lotus grows only in deep swamps such as those near the city of [Fiaqua] (the Flower on the Water) and must be cultivated to gain its full potential. The Lotus retains its potency for about a month after picking, but the petals wither shortly after being removed, so the flower is typically kept intact despite the dangers.")
                      )
                    ),
                    Core.vx_new_string("Black Rose"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Black Rose"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The Black Rose blooms once more! - LeBlanc, Runeterra\n* Another rose for the garden. - LeBlanc, Runeterra"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Black roses have often been associated with mystery, hatred, death, dishonor, tragic romance, and the supernatural in different cultures and traditions. In literature and art, they frequently symbolize tragic love or the darker aspects of human emotions. Despite their associations with darkness, black roses can also convey elegance, sophistication, and rebirth in some contexts. This dual symbolism has contributed to their enduring allure and cultural significance."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Rosa Black Baccara")
                      )
                    ),
                    Core.vx_new_string(":Devilroot"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Devilroot"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A rare species of plant recognizable by its forked leaves and crimson forked root. The powdered root is a deadly poison.")
                      )
                    ),
                    Core.vx_new_string(":K'Tallah"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("K'Tallah"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A rare swamp plant with gray-green leaves. It is also a highly addictive euphoric that can provide visions of the near future. After a half dozen uses, the user becomes hopelessly addicted and must consume a leaf each day or suffer horrible and ultimately fatal consequences. The first symptoms are stomach pains and the uneasy feeling that some is growing within. Next the snakelike tentrils of new K'Tallah plants sprout from the eyes, ears, and mouth. Death follows quickly. Heavy users, arguably the most wretched folk in existence, claim that leaves plucked from the body of a deceased addict are especially savory.")
                      )
                    ),
                    Core.vx_new_string(":Mandrake"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mandrake"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A long leaved (nearly a foot long) dark green plant with small greenish-yellow or purple bell-shaped flowers that grow on 3-4 inch stalks. It is best known for the large brown root, running 3 to 4 feet into the ground sometimes single and sometimes forked into two or three distinctive branches which gives the plant a rough resemblance to that of a human monster form.\n* It was supposed to grow under the feet of a hanged man where his semen dripped on to the earth; this would appear to be the reason for the methods employed by the alchemists who 'projected human seed into animal earth'. It could only be pulled from the ground after performing the necessary rituals. It was advisable to put wax in the ears before one attempted to do this: the mandrake would scream when pulled free and this could cause deafness.\n* A whole Mandrake root placed in the home, will give the house protection, fertility, and prosperity. Also, where there is Mandrake, demons cannot abide. Money placed beside the root is said to multiply. It was also recommended for discovering treasures, and as an ingredient for charm for pregnancy.")
                      )
                    ),
                    Core.vx_new_string(":Morphious"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Morphious"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A parasitic plant that grows amidst the branches of trees and bushes. The frangrance it produces causes intoxication, drowsiness, and sleep. Those who fall asleep under Morphious will not awake while they can smell the lovely Morphious. Eventually, they die and decompose feeding the plants that the Morphious preys upon. Morpious can be distilled into even more potent intoxicants, sleeping potions and powers."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Euphorica, Mantrap")
                      )
                    ),
                    Core.vx_new_string(":Skullcap"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skullcap"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A powerful hallucinogenic mushroom with a bone-white cap. It is said to be the cause of the Wildmen's irrational behavior.\n* Ingesting small amounts cause highly irrational and often violent behavior. Consuming a full dram is usually fatal in minutes.")
                      )
                    ),
                    Core.vx_new_string("Snow Lily"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snow Lily"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A delicate white flower that grows only in the coldest climates.\n* Consuming it delays the onset of frostbite. Brewed into an elixir, it allows the consumer's body temperature	to fall to below freezing with no ill effects.")
                      )
                    ),
                    Core.vx_new_string(":Stranglevine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stranglevine")
                      )
                    ),
                    Core.vx_new_string(":Stenchroot"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stenchroot"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A tuber with horribly, noxious smelling sap. When gathered into clay pots, the Stenchroot sap can make nausea inducing grenades.")
                      )
                    ),
                    Core.vx_new_string(":Tantalus"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tantalus"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A small leafy plant wih a tuberous, heart-shaped root. A powder formed from the dried root can make a powerful aphrodisiac.")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Arborian"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Arborian"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Treefolk, Verdure")
                      )
                    ),
                    Core.vx_new_string(":Creep"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Creep"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Creep is a vine growth that lives in [Jungle] Terrain that is not hostile per se, but it's aggressive growth can surround, entrap, and immobilize even giant creatures over time.  It often lives in symbiosis with opportunist predators. Fortunately, the Creep only grows during the day.")
                      )
                    ),
                    Core.vx_new_string("Creeping Mold"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Creeping Mold"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("*  I'm a goner already, Daddy.  Ain't I? I've got that stuff out of the meteor on me... and I'm gone.  Ain't I? - Jordy, Creepshow")
                      )
                    ),
                    Core.vx_new_string(":Deadwood"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Deadwood"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A corrupted spirit that resembles a twisted humanoid composed of dead decaying wood. Deadwood is created when a woodland area is exposed to powerful corruption. Once established in an area, it begins to absorb life energies from all living creatures around it. All vegetation around will become warped and withered. Living creatures will fall sick developing strange ailments. Meanwhile, the Deadwood grows in power.\n* Deadwood can control plant life and unliving wood. They cannot be destroyed except by enchanted weapons, fire, or by starving it by destroying the surrounding plant life."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Plant Demon, Wood Grue")
                      )
                    ),
                    Core.vx_new_string("Giant Fisher Plant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Fisher Plant"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A huge creeper vine plant that covers mulitple nearby trees and has enormous blossoms hanging from high branches. The plant attacks living creatures by dropping vines from the bottom of the blossums that entwine and drag prey into the canaopy above where they die of strangulation or dehydration and are eventually digested. Bones and bits of carcass are dropped below to lure more prey.")
                      )
                    ),
                    Core.vx_new_string(":Shambler"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shambler"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An animated pile of decaying vegetation.")
                      )
                    ),
                    Core.vx_new_string(":Slime"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Slime")
                      )
                    ),
                    Core.vx_new_string("Strangle Vine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Strangle Vine"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A large, creeper vine that waits attacks like a constrictor snake. They typically\nhang in jungles or caves and strike from above or slowly entwine immobile\n(e.g. sleeping) targets on the ground.")
                      )
                    ),
                    Core.vx_new_string(":Triffid"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Triffid")
                      )
                    ),
                    Core.vx_new_string("Venus Flytrap, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Venus Flytrap, Giant")
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
   * @function chapter_reptiles
   * @return {chapter}
   * (func chapter_reptiles)
   */
  public static interface Func_chapter_reptiles extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_reptiles();
  }

  public static class Class_chapter_reptiles extends Core.Class_base implements Func_chapter_reptiles {

    @Override
    public Func_chapter_reptiles vx_new(Object... vals) {
      Class_chapter_reptiles output = new Class_chapter_reptiles();
      return output;
    }

    @Override
    public Func_chapter_reptiles vx_copy(Object... vals) {
      Class_chapter_reptiles output = new Class_chapter_reptiles();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_reptiles", // name
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
    public Func_chapter_reptiles vx_empty() {return e_chapter_reptiles;}
    @Override
    public Func_chapter_reptiles vx_type() {return t_chapter_reptiles;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_reptiles();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_reptiles() {
      return Bestiary.f_chapter_reptiles();
    }

  }

  public static final Func_chapter_reptiles e_chapter_reptiles = new Bestiary.Class_chapter_reptiles();
  public static final Func_chapter_reptiles t_chapter_reptiles = new Bestiary.Class_chapter_reptiles();

  public static Base.Type_chapter f_chapter_reptiles() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Reptiles"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Alligators/Crocodiles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alligators/Crocodiles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Alligator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alligator")
                      )
                    ),
                    Core.vx_new_string(":Crocodile"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crocodile")
                      )
                    ),
                    Core.vx_new_string("Emperor Crocodile"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Emperor Crocodile")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Lizards"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Lizards"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Komodo Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Komodo Dragon")
                      )
                    ),
                    Core.vx_new_string(":Lizard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lizard")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Snakes"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Snakes"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Anaconda"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anaconda"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
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
                    Core.vx_new_string(":Asp"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Asp"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Asps. Very dangerous. You go first. - Raiders of the Lost Ark")
                      )
                    ),
                    Core.vx_new_string("Black Mamba"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Black Mamba"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The black mamba receives its name from the black coloration inside of its mouth, rather than their skin color which is a gray to olive tone. The black mamba is the fastest moving snake in the world, capable of moving up to 20 km/h(12.5 mph). However it uses this speed to evade danger, rather than catch prey.\n* Black mambas are among the ten most venomous snakes in the world. A single bite may inject enough venom to kill from 20-40 grown men. When cornered, they will readily attack. In fact, many snake experts have cited the black mamba as the world's most aggressive snake, noting tendency to actively attack without provocation. When warding off a threat, the black mamba usually delivers multiple strikes, injecting its potent neuro-and cardiotoxin with each strike, often attacking the body or head, unlike most other snakes.\n* Black mambas tend to live in their lairs for long periods of time, which are often vacated insect mounds or hollow trees. Black mambas are diurnal snakes that hunt prey actively day or night.\n* The black mamba is more than 3 times as venomous as the Cape Cobra, over 5 times as venomous as the King cobra and about 40 times as venomous as the Gaboon viper. Black mamba venom contains powerful, rapid-acting neurotoxins and cardiotoxins. The initial symptom of the bite is local pain in the bite area, although not as severe as snakes with hemotoxins. The victim then experiences a tingling sensation in the extremities, drooping eyelids, tunnel vision, sweating, excessive salivation, and lack of muscle control (specifically the mouth and tongue). If the victim does not receive medical attention, symptoms rapidly progress to nausea, shortness of breath, confusion, and paralysis. Eventually, the victim experiences convulsions, respiratory failure, and coma, and dies due to suffocation resulting from paralysis of the muscles used for breathing. Without treatment the mortality rate is 100%, the highest among all venomous snakes in the world.")
                      )
                    ),
                    Core.vx_new_string("Boa Constrictor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boa Constrictor")
                      )
                    ),
                    Core.vx_new_string(":Cobra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cobra")
                      )
                    ),
                    Core.vx_new_string("King Cobra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Cobra")
                      )
                    ),
                    Core.vx_new_string(":Python"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Python")
                      )
                    ),
                    Core.vx_new_string(":Viper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Viper")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Toads"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Toads"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Poisonous Toad"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poisonous Toad")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Reptiles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Reptiles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Balizard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Balizard"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A large, magical variety of lizard that survives in arctic climates. Its body temperature matches the surrounding. It has a special form of gaze ability where it can draw heat from any target it is facing into its nose and mouth. It uses this ability to freeze opponents before eating their icy remains.")
                      )
                    ),
                    Core.vx_new_string("Crocodile, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crocodile, Giant")
                      )
                    ),
                    Core.vx_new_string("Desert Strider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Desert Strider"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Striders are large bipedal desert creatures resembling a cross between a lizard and a flightless bird. Striders are perfectly acclimated to desert life. They can go for months without water, have protective lenses over their eyes, and actually process sunlight to supplement the insects and reptiles they normally consume. Conversely, they cannot survive outside a desert environment.")
                      )
                    ),
                    Core.vx_new_string("Lizard, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lizard, Giant")
                      )
                    ),
                    Core.vx_new_string("Serpent, Great"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Serpent, Great")
                      )
                    ),
                    Core.vx_new_string("Snake, Crypt Cobra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snake, Crypt Cobra")
                      )
                    ),
                    Core.vx_new_string("Snake, Swaying Cobra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snake, Swaying Cobra"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This seemingly normal Cobra has the enhanced ability to hypnotise its victim.\n* Hypnotism - By slowly swaying back and forth and removing all hostile intent from its mind, the Cobra creates the illusion that it is peaceful and harmless. Its victim becomes enthralled and simply watches as the Cobra slowly advances. When the Cobra is face to face with its victim, it attacks with lightning speed to bite the face or throat to deposit its venom near the victim's brain."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hypnotic Cobra")
                      )
                    ),
                    Core.vx_new_string("Tortoise, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tortoise, Giant")
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
   * @function chapter_shapeshifters
   * @return {chapter}
   * (func chapter_shapeshifters)
   */
  public static interface Func_chapter_shapeshifters extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_shapeshifters();
  }

  public static class Class_chapter_shapeshifters extends Core.Class_base implements Func_chapter_shapeshifters {

    @Override
    public Func_chapter_shapeshifters vx_new(Object... vals) {
      Class_chapter_shapeshifters output = new Class_chapter_shapeshifters();
      return output;
    }

    @Override
    public Func_chapter_shapeshifters vx_copy(Object... vals) {
      Class_chapter_shapeshifters output = new Class_chapter_shapeshifters();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_shapeshifters", // name
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
    public Func_chapter_shapeshifters vx_empty() {return e_chapter_shapeshifters;}
    @Override
    public Func_chapter_shapeshifters vx_type() {return t_chapter_shapeshifters;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_shapeshifters();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_shapeshifters() {
      return Bestiary.f_chapter_shapeshifters();
    }

  }

  public static final Func_chapter_shapeshifters e_chapter_shapeshifters = new Bestiary.Class_chapter_shapeshifters();
  public static final Func_chapter_shapeshifters t_chapter_shapeshifters = new Bestiary.Class_chapter_shapeshifters();

  public static Base.Type_chapter f_chapter_shapeshifters() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Shapeshifters"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Lycanthropes"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Lycanthropes"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Beauty and the Beast\n* The Howling\n* Underworld\n* Wolfen"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - A hereditary trait carried by humans and animals.\n* Personality - Their savagery is their greatest strength, but it threatens\nto consume them and leave only rage.\n* Some lycanthropes are more animal-like and hostile to humans.\n* [Vulnerability] to [Silver]\n* Loses control under the moon\n* Preferred Skills: [Lycanthropy], [Natural Weaponry]\n!Groups\n* Black Spirals - [[Corrupted]] Werewolves\n\nHistory\n* The Impergium - 8,000 years ago, humankind was becoming more organized and began systematically killing wolves or destroying their habitats. The Werewolves born from wolves decided that the humans were out of control and leading the world to chaos. They declared the open hunt (or culling) of humans called the 	Impergium. The Werewolves born from humans saw their own kin murdered by other Werewolves. Whatever the merits of the Impergium, it triggered a civil war between the Werewolf clans with mounting killings and atrocities. The other shapeshifters tried to stay out of the conflict but were quickly forced to take sides. The conflict only ended after the number of Shapeshifters across the world was decimated, especially those born to wolves. Since then the low birth rate of Shapeshifters has taken many races to the brink of extinction. The Impergium remains as a grim reminder of the dangers of letting ones [Rage] overcome reason. The Werewolves are embarassed by their clans' actions. The other Shapeshifters have never forgiven the Werewolves for their folly. Also, many of the Werewolves born of wolves hold deep hatred for the other Werewolves both for their betrayal and for the current state of the wolves in the world."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Werebat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Werebat")
                      )
                    ),
                    Core.vx_new_string(":Werebear"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Werebear")
                      )
                    ),
                    Core.vx_new_string(":Werecat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Werecat"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ModernFantasy/Lycanthrope_Weretiger.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Every time it happens... you tell yourself it's love.  But it isn't.  It's blood.  And death. - Cat People"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Rakshasa, Werepanther, Weretiger")
                      )
                    ),
                    Core.vx_new_string(":Werecrow"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Werecrow"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ModernFantasy/Lycanthrope_Tengu.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Able to fly, the Werecrows make terrific scouts and spies.  Their overwhelming curiousity is matched only by their tendency to gossip."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Tengu, Wereraven"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Feather Blades"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Feather Blades")
                                      )
                                    ),
                                    Core.vx_new_string("Feather Knives"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Feather Knives")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Hunting"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hunting"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Scouting"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Scouting")
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
                    Core.vx_new_string(":Wererat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wererat"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ModernFantasy/Lycanthrope_Wererat.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Stealth"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Werespider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Werespider"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Anasi, Arachne, Kumo"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Illusion"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Illusion"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Dazzling Beauty"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Dazzling Beauty")
                                      )
                                    ),
                                    Core.vx_new_string("Mirror Image"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mirror Image")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Venomous"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Venomous"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Poison Bite"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Poison Bite")
                                      )
                                    ),
                                    Core.vx_new_string("Poison Spit"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Poison Spit")
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
                    Core.vx_new_string(":Werewolf"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Werewolf"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ModernFantasy/Lycanthrope_Werewolf.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The crescent moon is a double-edged sword. Be wary, lest it cut you."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("French/Old English: Loup-garou, Japanese: Ookami otoko")
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
   * @function chapter_undead_creatures
   * @return {chapter}
   * (func chapter_undead_creatures)
   */
  public static interface Func_chapter_undead_creatures extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_undead_creatures();
  }

  public static class Class_chapter_undead_creatures extends Core.Class_base implements Func_chapter_undead_creatures {

    @Override
    public Func_chapter_undead_creatures vx_new(Object... vals) {
      Class_chapter_undead_creatures output = new Class_chapter_undead_creatures();
      return output;
    }

    @Override
    public Func_chapter_undead_creatures vx_copy(Object... vals) {
      Class_chapter_undead_creatures output = new Class_chapter_undead_creatures();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_undead_creatures", // name
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
    public Func_chapter_undead_creatures vx_empty() {return e_chapter_undead_creatures;}
    @Override
    public Func_chapter_undead_creatures vx_type() {return t_chapter_undead_creatures;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_undead_creatures();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_undead_creatures() {
      return Bestiary.f_chapter_undead_creatures();
    }

  }

  public static final Func_chapter_undead_creatures e_chapter_undead_creatures = new Bestiary.Class_chapter_undead_creatures();
  public static final Func_chapter_undead_creatures t_chapter_undead_creatures = new Bestiary.Class_chapter_undead_creatures();

  public static Base.Type_chapter f_chapter_undead_creatures() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Undead Creatures"),
        Core.vx_new_string(":reference"),
        Core.vx_new_string("* Seven Deadly Sins: Envy"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* Description - The dead are normally at rest, but under certain circumstances their spirits return from the [Spirit Realm] and they rise again. Created through different means, the Undead share a common trait. Their life is artificial, a soulless parody of true life. Above all they envy the life that they lack, and they may only maintain their unlife by taking life from others.\n* Personality - Despite their reputation, the Undead are not innately evil. They retain at least some of their original personalities, but their new existence often forces them to reevaluate their morals. Most of the more 'ethical' Undead end their own miserable existences.\n* Spirit - Undead cannot recover Spirit except by stealing it from the living. Slaying the living is always worth 1 extra [Spirit] to any undead. Note: Undead are more connected to the spirit world than the living world and therefore are permanently banished from the living world if their Spirit ever drops to zero. Without a [Spirit], they many never use any [Naturalism] or [Spiritualism] magics.\n\nTypes\n* Traumatic death - Focused completely on the trauma of their death, they are drawn to the living and end up reenacting their death with others. - Burning Dead, Drowned, Frozen Dead, Scarecrow, Wendigo.\n* Incomplete business - These are compelled to attempt to complete their goals. Sometimes the completion of the goal is enough to let them rest. Sometimes they continue endlessly trying to complete an impossible goal. - Shades, Poltergeists\n* Necromancy - Lich, Mummies, Night Terror, Skeletons, Zombies\n* Raised by another Undead - Ghoul, Skeleton Crew, Vampire."),
        Core.vx_new_string(":titles"),
        Core.vx_new_string("Restless, Restless Dead, Risen, Undeath, Unquiet"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Corporeal Undead"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Corporeal Undead"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Vulnerable: [Fire], [Impact]"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Barghest"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Barghest"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Black Shuck, Ghost Hound")
                      )
                    ),
                    Core.vx_new_string("Burning Dead"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Burning Dead"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The burning dead are those who died by fire. They appear as they did in death (as burning skeletons, burning corpses, or burning ash).\n* They are consumed by intense pain and confusion and cannot be reasoned with.\n* They seek help from the living and attempt to embrace them in an attempt to exinquish themselves. This only serves to immolate their victim who will often rise as Burning Dead themselves. Only estinquishing their flames or destroying their remains will put them to rest.\n* They always attack with a Grab and will do Fire damage each round they hold their victim.\n* All Melee [Criticals] are [Burning] damage."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Fire"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Close Combat"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Close Combat"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":unitspecialtymap"),
                                Core.f_new(
                                  Base.t_unitspecialtymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Grappling"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Grappling")
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
                    Core.vx_new_string("Dead of Night"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dead of Night"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Night Dead are reanimated corpses of thoses who have died in terror in darkness. They are desperate for light but their darkness powers consume light making normal light sources produce a fraction of their normal illumination. Magical light will expose them and stun them. Bathing in light is the only way to free their spirits and end their torment.")
                      )
                    ),
                    Core.vx_new_string("Dead of Winter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dead of Winter"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I know what it means to freeze to death, To lose a little life with every breath, To say goodbye to life on earth, And come around again, Lord have mercy on the frozen man - James Taylor, Frozen Man"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Frozen Dead are reanimated corpses of thoses who have died by cold or exposure. They are desperate for warmth and seek the living to share an icy embrace. They radiate cold which will douse small fires around them. They are drawn to large heat sources and will happily throw themselves into raging fires. Death by fire is the only way to free their spirits and end their torment."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Frigid, Frozen Dead, Frozen Man, Ice Man, Snowman"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Cold"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cold")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Dhampyr"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dhampyr"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* A dhampir in Balkan folklore is the child of a vampire father and a human mother, with vampire powers but none of the weaknesses. A dhampir is believed to have the unique ability to see vampires, even when these are invisible, and is unusually adept at killing them.\n** A dhampir is always paid well for his services. The amount of money varies, but there is never bickering over the price. Standard pay for a dhampir may also include a meal or a suit of clothing. Sometimes a dhampir is paid in cattle, jewelry or women.\n** Charlatans traveling the regions around the Carpathian Mountains, Balkans and elsewhere in Eastern Europe would claim to be dhampirs. They were believed to be the only ones who could see the spirit and would put on elaborate shows for villages. Once fear, grief and superstition took hold in a village following a recent death, the dhampir would 'come to the rescue'.\n* Blood: The Last Vampire\n* Vampire Hunter D\n* Blade\n* BloodRayne"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Dhampyrs, can function both day and night, although they find sunlight uncomfortable.\n* Dhampyrs are mortal but can live for centuries. Once mature, they age at roughly 1/10 the rate of humans.\n* They can breed with humans, but not with Kuei-jin or other dhampyrs.\n* They are not dead, so they must breath, eat, drink, and sleep. They may bleed, and they may die.\n* By using [Spirit], they can perform feats not possible for humans. They can regain [Spirit] through rest or by eating flesh (usually they cannot by drinking blood).\n* The [Beast] is weaker in a Dhampyr than in their Vampire kin, but this makes their powers weaker as well.")
                      )
                    ),
                    Core.vx_new_string(":Drowned"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Drowned"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The Ring"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Drowned are the spirits of those who have died by drowning. They are completely fixated on their drowning death and are compelled to reenact the experience with others."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Drowner, Kappa")
                      )
                    ),
                    Core.vx_new_string("Ghost Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ghost Ship"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Pirates of the Caribbean\n* The Fog\n* Pyaray - Elric of Melnibone"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ghost Ships are doomed ships crewed by the [Drowned]. When they encounter the living, they are compelled to kill them so they raise again to add to their crew."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Chaos Fleet, Skeleton Crew")
                      )
                    ),
                    Core.vx_new_string(":Ghoul"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ghoul"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Description - A ghoul is a reanimated corpse that perpetuates its undead existence by feeding on the living and the dead. They reek of charnel pits and they have shrivelled nightmarish features. Though frail and unhealthy looking, they possess fearsome strength. The teeth and claws also carry [Corpse Rot], an infection that slowly kills the victim if the Ghoul doesn't first. Victims of Ghouls often raise as Ghouls themselves if they are not cured or their corpse is not blessed or destroyed.\n* Japanese Gaki appear as gaunt-faced monsters with enormous, frog-like mouths and grossly distended bellies.\n* Morale - High\n* Units - Mob"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gaki, Hungry Dead, Necrophage"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3")
                              )
                            ),
                            Core.vx_new_string("Special Ability"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Special Ability"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Cannibal"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Cannibal")
                                      )
                                    ),
                                    Core.vx_new_string(":Savage"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Savage")
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
                    Core.vx_new_string(":Lich"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lich"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Lich.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A lich is a powerful animated corpse created by [Necromancy] through the use of [Lich Form]. The necromaner curses itself to a horrific undead existence in exchange for eternal 'life'. The lich retains most of the abilities of its former life and gains some additional undead powers as well.\n* Because of their solitary nature, a lich cannot gain social skills nor increase their existing skills. Further these skills have a tendency to degrade the longer the lich exists."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry")
                              )
                            ),
                            Core.vx_new_string(":Necromancy"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Necromancy")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Mummy"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mummy"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Mummy"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Created by Ancient Arcane ritual, Mummies are extremely powerful and exceptionally difficult to destroy.\n* Mummies regain Spirit by sucking the life from their victims through thier mouths, leaving only a descicated husk."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Longevity"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Longevity"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Reanimation"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Reanimation")
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
                    Core.vx_new_string("Night Terror"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Night Terror"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* A night terror is a sleep disorder characterized by extreme terror and a temporary inability to regain full consciousness. The subject wakes abruptly usually accompanied by gasping, moaning, or screaming.  It is often impossible to fully awaken the person, and after the episode the subject normally settles back to sleep without waking.\n* Night terrors are distinct from nightmares in several key ways. First, the subject is not fully awake when roused, and even when efforts are made to awaken the sleeper, he/she may continue to experience the night terror for ten to twenty minutes. Unlike nightmares, which occur during REM sleep, night terrors occur during slow-wave sleep, the deepest levels of non-REM sleep. Even if awakened, the subject often cannot remember the episode except for a sense of panic, while nightmares usually can be easily recalled. The subject often has no recollection of the incident.\n* Unlike nightmares, which are frequently dreams of a frightening nature, night terrors are not dreams. Usually there is no situation or event (scary or otherwise) that is dreamt, but rather the emotion of fear itself is felt. The lack of a dream itself leaves those awakened from a night terror in a state of disorientation much more severe than that caused by a normal nightmare. This can include a short period of amnesia during which the subjects may be unable to recall their names, locations, ages, or any other identifying features of themselves.\n* Children from age two to six are most prone to night terrors, and they affect about fifteen percent of all children."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Evil women who died in childbirth and now returned to slay children.\n* By day it may take the form of a shriveled old woman. At night it becomes a horrific corpse-like creature. In this form it sneaks into houses and sucks the breath from the lips of children, leaving them cold and lifeless.\n* It can only enter a house into which it has been invited, so during the day it poses as a woeful traveler to gain admittance to houses where babies live.\n* Night Terrors, being exclusively female, can only reproduce by mating with a male member of another species. The hag often slays her mate. The child born looks like a normal member of her species with black or blue hair and is often given into foster care by the hag disguised as a normal woman. When the young girl reaches puberty, the mother Night Hag might visit the child several times and, after several rituals, transforms her offspring into another hag."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Night Hag")
                      )
                    ),
                    Core.vx_new_string("Pestilence Horse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pestilence Horse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Pestience Horse is a zombie horse that carries deadly diseases. It's decaying body is not as fast as its original body, but may still trot fairly quickly. It is not as agressive as other undead, instead travelling around spreading disease and fleeing when confronted.")
                      )
                    ),
                    Core.vx_new_string(":Scarecrow"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scarecrow"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Headless Horseman\n* Great Pumpkin\n* Jack O' Lantern\n* Pumpkin King"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A scarecrow is a humanoid mass of twigs, straw, and old clothes that has been animated by an undead spirit. Some are actual scarecrows that have been possessed; others form out of pumpkin patches on moonless nights. Scarecrows hate all living things, but wish to do more than kill. They desire to frighten living beings as much as possible. A scarecrow can be created when someone calls for vengeance before their death. Sometimes they are killed by brigands, other times they starves to death because of blight or drought. The scarecrow then haunts the place of death, not ranging more than a mile from it. Sometimes entire families become scarecrows, and the victims of scarecrows occasionally join the haunting as well. Simply killing the body is not enough to end its haunting, as it reappears from another pumpkin on the next moonless night. To finally destroy a scarecrow, every scrap of every body must be burned, as well as any pumpkins or pumpkin vines. The land must then be tilled and planted with a new crop. Only then are the spirits forced to give up their vengeance and give up the mortal coil.\n* Scarecrows prefer to play with their prey, sneaking up on them and attempting to terrify them.  Scarecrows fight without regard to their own safety, as they know they are likely to return on another night if destroyed.")
                      )
                    ),
                    Core.vx_new_string("Skeletal Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skeletal Dragon")
                      )
                    ),
                    Core.vx_new_string("Skeletal Knight"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skeletal Knight"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Morale - High"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Death Knight"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Special Ability"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Special Ability"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Savage"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Savage")
                                      )
                                    ),
                                    Core.vx_new_string(":Skeletal"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Skeletal")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Riding"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Riding")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Skeleton"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skeleton"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Special Ability"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Special Ability"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Mindless"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mindless")
                                      )
                                    ),
                                    Core.vx_new_string(":Savage"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Savage")
                                      )
                                    ),
                                    Core.vx_new_string(":Skeletal"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Skeletal")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Defense"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Defense"),
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
                    Core.vx_new_string("Skeleton Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skeleton Warrior"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Special Ability"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Special Ability"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Mindless"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mindless")
                                      )
                                    ),
                                    Core.vx_new_string(":Savage"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Savage")
                                      )
                                    ),
                                    Core.vx_new_string(":Skeletal"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Skeletal")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Defense"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Defense"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Breast Plate"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Breast Plate")
                                      )
                                    ),
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
                    Core.vx_new_string("Slayer Dead"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Slayer Dead"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Jason Voorhees\n* Nightmare on Elm Street\n* Vinland Saga"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Slayer Dead are the spirits of those who have lived and died a life of killing. They are completely fixated on killing others in the same way they killed in life. Most were warriors who revelled in slaughter. Some were serial killers. Large numbers of them can appear when battles are fought near Ley Lines."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Murderous Dead, War Dead")
                      )
                    ),
                    Core.vx_new_string(":Wendigo"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wendigo"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wendigoes are the result of cannibalism in the forests of the north. It is a curse that causes the death of the person, and later they return as a huge cunning beast with the desire to consume human flesh. Wendigoes are thin and seven to ten feet tall, their hearts are made of ice and their claws are icicles. They are [Resistant] to [Cold] and often appear in the middle of a snowstorm to steal their victims."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Abominable Snowman, Yeti")
                      )
                    ),
                    Core.vx_new_string(":Wight"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wight"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Wight is an animated corpse like a zombie, but its eyes burn fiercely, showing their deep hatred of the living. They continue to pursue their goals in life, but these goals are always twisted into hatred and revenge against the living.\n* Wights are usually highly intelligent or cunning and have the patience to carefully plan their murders. Wights enjoy killing as well as inflicting pain and fear on their victims who they believe deserve what they get.\n* A Wight is created when an extremely driven, evil person is on the verge of death. Before death, it makes a bargain with a demonic force, and returns to unlife as a Wight.\n* Wights retain most of their abilities while living. Powerful Wights can be as powerful as Liches. In fact, the necromantic study of Wights led to the necromantic rituals responsible for Mummies and Liches.")
                      )
                    ),
                    Core.vx_new_string(":Zombie"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zombie"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Zombies are nearly mindless animated corpses.\n* They act irrationally and attack all living creatures with no sense of self preservation.\n* They have +2 Body, but because the do not protect themselves they suffer 2x criticals."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("2")
                              )
                            ),
                            Core.vx_new_string("Special Ability"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Special Ability"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Mindless"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mindless")
                                      )
                                    ),
                                    Core.vx_new_string(":Savage"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Savage")
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
            Core.vx_new_string("Noncorporeal Undead"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Noncorporeal Undead"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Haunt"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Haunt"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The Sixth Sense\n* Beetlejuice"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Haunts are lesser undead that remain near the places and people from their living life instead of moving on. Haunts attempt to interact with the living to maintain a semblance of their former lives. Haunts are generally not malicious, but their interactions inadvertently drain the [Will] of others over time. There are also cases of Haunts who impersonate loved ones to purposely drain their [Will].")
                      )
                    ),
                    Core.vx_new_string(":Lemure"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lemure"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The wandering and vengeful spirits of those not afforded proper burial or funeral rites."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Larvae, Lemur")
                      )
                    ),
                    Core.vx_new_string("Lost Soul"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lost Soul")
                      )
                    ),
                    Core.vx_new_string(":Phantom"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phantom"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Phantoms are the remnants of those who were lost in the Astral/Dream Realm. The Astral Realm is the realm of imagination, so those trapped here are gradually driven mad. Therefore, Phantoms have varying and unpredictable insanities.")
                      )
                    ),
                    Core.vx_new_string(":Poltergeist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poltergeist")
                      )
                    ),
                    Core.vx_new_string(":Reaper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Reaper"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Charon the Ferryman"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Reapers are dark, hooded entities that are terrifying to behold. Their arms are skeletal though though the rest of their bodies appear to be made of solid blackess. They carry large scythes which they can use to deadly effect. Their purpose appears to be to escort the sould of the recently dead to the afterlife, and their presense almost always means someone has died or will die soon.")
                      )
                    ),
                    Core.vx_new_string(":Shade"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shade"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Ring"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Description - lank and ghastly beings with no feet, floating suspended above the ground.\n* Shades are the spirits of those who died in suicide, accident, murder, or wrongful execution. They are bound to this plane by the anger they felt at their deaths.\n* Suicide and accident victims attempt to compel those most like their former selves to die in the same manner.\n* Murder and wrongful death victims attempt to revenge themselves upon the killer or his descendents."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aghast, Ghast, Ghastly, Shoryo")
                      )
                    ),
                    Core.vx_new_string(":Shadow"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shadow")
                      )
                    ),
                    Core.vx_new_string(":Sluagh"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sluagh"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The spirits of the sinners, or generally evil people who were welcome in neither heaven nor hell.\n* They were seen to fly in groups like flocks of birds, coming from the west, and were known to try to enter the house of a dying person in an effort to carry the soul away with them. West-facing windows were sometimes kept closed to keep them out. Some consider the Sluagh to also carry with them the souls of innocent people who were kidnapped by these destructive spirits."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Sluagh are thin, pale, snake-like, and grotesque, though they remain strangely compelling. They favor archaic, intricate, black clothing. Their joints can dislocate allowing them to slither our of bonds and into disquieting shapes.\n* They may only speak in whispers and dislike any social situations except among their own kind. They prefer to overserve other from hidden corners, and the secrets they obtain are their stock and trade.")
                      )
                    ),
                    Core.vx_new_string(":Spectre"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spectre"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Cenobites from Hellraiser"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Spectre is a malevolent Wraith that has been so traumatized that it is has become completely obscessed with its suffering and reenacting that suffering with others. The Spectre has fallen completely under the controlled of it's [Shadow].")
                      )
                    ),
                    Core.vx_new_string("Spectral Horse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spectral Horse")
                      )
                    ),
                    Core.vx_new_string(":Will-O-Wisp"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Will-O-Wisp")
                      )
                    ),
                    Core.vx_new_string(":Wraith"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wraith"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wraiths normally exist in the [Underworld] where their numbers are legion.\n* Those with strong connections to the world of the living can walk among the living but are [Invisible] and [Ethereal] and can indistinctly see the living world through the [Shroud]. Skilled Wraiths may even temporarily breech the [Shroud].\n!Abilities\n* Keening\n* Manifestation\n* Poltergeist\n* Possession"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Ghost")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Vampires"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Vampires"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Dracula\n* I died... so many years ago. You can make me feel like it isn't so. ... I know, I should go, but I follow you like a man possessed. There's a traitor here beneath my breast, and it hurts me more than you've ever guessed. If my heart could beat, it would break my chest. But I can see, that you're unimpressed, so leave me be and let me rest in peace. Let me get some sleep. Let me take my love and bury it six feet deep. - Spike, Buff the Vampire Slayer\n* Cause I’ve made some real big mistakes. But you make the worst one look fine. I should’ve known it was strange. You only come out at night. I used to think I was smart. But you made me look so naïve. The way you sold me for parts. As you sunk your teeth into me, oh. Bloodsucker, dreamcrusher. Bleeding me dry like a damn vampire - Olivia Rodrigo, Vampire\n* Victor: I need you to understand something very, very clearly. The place we're going, if you repeat in front of them that she knows about a 'thing', she's dead. Everyone she knows is dead. Anyone she might have texted is dead. So you're going to have to learn from this exact second, how to keep a secret. There's a little show we have to put on. You might call it a sort of masquerade that we all have to live into, that none of this is real. Never in your life did you think this is real, and is has been the entire time. So learn to lie to your girlfriend if you want to live. Nelli G: Or if you want to live. Jasper: That too. - L.A By Night\n* Annabelle: You seem reasonable. Why do you follow their orders?... Jasper: I follow his orders because if I don't, I get left in that sun that hurts so much... I work with them because if I don't, I get introduced to the dawn. I do a lot of things, so I get to keep living... It's a game we all play, so we get to keep doing this. Talking, living, walking. - L.A By Night"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - Among most powerful and feared of all undead, Vampires are among the oldest known undead creatures with legends that go back to the first intelligent humans. They possess the abilities that they had in life as well as gaining unique vampiric powers.\n* Feeding - Vampires regain Spirit only by drinking the blood of the living. Some Eastern Vampires eat the flesh of the living instead. As the Spirit of a Vampire decreases, the Vampire becomes more savage and beastial.\n* Morale - Normal, Low vs. Fire and Sunlight. Ironically, the one thing that truly terrifies these eternal, murderous beings is the end of their own cursed lives.\n* Vulnerability to Fire - The cleansing touch of Fire will rapidly consume a Vampire.\n* Vulnerability to Sunlight - The cleansing touch of Sunlight will ignite a Vampire on Fire. During daylight hours, Vampires fall into a deathlike sleep. Contrary to some sources, arificial sunlight has no effect on them.\n* Vulnerability to Silver - The cleansing touch of Silver will ignite a Vampire on Fire. Even their reflection is destroyed by Silver. Contrary to some sources, non-silver mirrors still reflect the image of a Vampire.\n* Immunity to Bleeding - Vampire blood can move on its own and will not leave the body without force.\n* Biology - Vampires are created when one Vampire drains a person to the brink of death and then feeds their own blood to the victim. This is called: The Embrace. At this moment, the victim has a chance to reject the Embrace, and die peacefully. If the victim accepts the Embrace, the blood will rapidly reach the victim's heart and the transformation to Vampire will immediately begin.\n* Nature - There is much conjecture about how a Vampire functions, but it is certain that the blood of a Vampire is the source of its unnatural existence. Some believe that the blood itself is a form of evil, magical, parasite centered on the heart that animates the Vampire's body.\n* Masquerade - During the day, Vampires are completely vulnerable. Therefore, they avoid drawing attention to themselves. They pretend to be normal people while manipulating from behind the scenes. Vampires appear as near perfect humans, but this too is a mask. Vampires pretend at being sophisticated and refined, but always behind this is their true, savage, bestial nature.\n* Sire - The vampire's creator.\n* Childer - The relationship of a vampire to a Sire.\n* Book of Nod - The vampiric history/bible.\n* Antitribu - Those who choose to oppose their clan, joining the Camarilla or Sabbat respectively."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Cainite, Kindred, Leech, Lick"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Vampires, Elder"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vampires, Elder"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Kali"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kali"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Tzimisce Methuselah")
                              )
                            ),
                            Core.vx_new_string(":Set"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Set"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Setite Methuselah")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Vampires, Anarchs"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vampires, Anarchs"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The strict caste system of the Camarilla does not favor new Vampires. Many newly embraced reject the machinations of the elders and live as they can on the fringe. Anarchs rely on each other to protect themselves from the actions of the Camarilla and the Sabbat. The larger organizations treat Anarchs like homeless people, largely ignoring them unless they get in their way. The Anarchs understand that the other groups are bound by rules, and they will use this to their advantage. In any situation, the Anarchs are wild cards, potentially able to shift a result one way or the other. The Anarchs have one crucial advantage over the Camarilla and Sabbat: they have nothing to lose.")
                      )
                    ),
                    Core.vx_new_string("Vampires, Camarilla"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vampires, Camarilla"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Neophyte, Elder, Prince, Sheriff"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Brujah"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brujah"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bully, Bruiser"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
                                      )
                                    ),
                                    Core.vx_new_string(":Strength"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Strength")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Gangrel"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gangrel"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Animal, Protector"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
                                      )
                                    ),
                                    Core.vx_new_string(":Animalism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Animalism")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Malkavian"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Malkavian"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cursed by Madness\n* Malkalv - The philosophic, antedeluvian sire of their clan. When he was destroyed with the First City. his childer began to gain the signature Madness. Some say his spirit continues through his blood and connects his childer. Others propose the preposterous notion that Malkav was a an embraced Angel.\n* Kinship - Unlike other tribes, the Malkavians have a natural understanding and kinship toward each other. It is rare that they outright betray one another."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Jester, Maniac, Nutcase, Prankster, Psychotic"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
                                      )
                                    ),
                                    Core.vx_new_string(":Dominiation"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Dominiation")
                                      )
                                    ),
                                    Core.vx_new_string(":Senses"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Senses")
                                      )
                                    ),
                                    Core.vx_new_string(":Madness"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Madness")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Stealth"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Stealth")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Nosferatu"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nosferatu"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Sewer Rat"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
                                      )
                                    ),
                                    Core.vx_new_string(":Invisibility"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Invisibility")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Stealth"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Stealth")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Toreador"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Toreador"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* We come into this stale and plain stale world. So we spend our time, searching for that one sublime revelation. To fill the void. To lose ourselves in beauty and perfection. Beauty can be elegant, seductive, full of pleasure, Raw, Violent, Lethal. Let me help us find it. To lose ourselves. Come closer. I am a beautiful way to die. - Vampire: Bloodlines 2\n* She'll only come out at nights. The lean and hungry type... I wouldn't if I were you. I know what she can do. She's deadly man, she could really rip your world apart. Mind over matter. Ooh, the beauty is there but a beast is in the heart. Oh, here she comes. Watch out boy she'll chew you up. Oh, here she comes. She's a maneater. - Hall and Oates/No Hard Feelings, Maneater"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Beauty is both a blessing and a curse\n* Toreadors were key to founding the Camarilla and are among the most powerful and influencial clans.\n* The Roses in the Garden - The Toreador who are obscessed with politics, conspiring on casual walks.\n* Founder - It is said that the Clan's founder, Arikel was a mortal painter and/or sculptress and twin sister of Malkav in the First City. Famed throughout the lands for her work, after her Embrace she painted a mural on which the past, present and future of Kindred society was depicted. When Caine saw a terrible future for his race, he cursed her with the affliction that affects Toreador today – the art that she loved most dearly would now be her obsession and distraction above all things.\n* Weakness - Fascination"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Artists, Clan of Roses, Degenerate, Gossips, Obsessives"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
                                      )
                                    ),
                                    Core.vx_new_string(":Quickness"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Quickness")
                                      )
                                    ),
                                    Core.vx_new_string(":Senses"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Senses")
                                      )
                                    ),
                                    Core.vx_new_string(":Presence"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Presence")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Tremere"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tremere"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("ModernFantasy/Vampire_Tremere.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Tremere is the second youngest clan having appeared in the Dark Ages.\n* History - The Tremere began as House Tremere, mages of the Order of Hermes named for their leader and founder, Tremere. At the end of the first millennium, the members of House Tremere realized the Hermetic arts were failing and found its immortality potions no longer working. House Tremere undertook numerous experiments, but it was Goratrix who devised a solution in his investigation of vampires. In 1022, Goratrix invited Tremere and six of the founder's closest advisers to participate in the completed ritual, which promised true immortality. Whether Goratrix knew what would happen is known only by him and, perhaps, Tremere, but at the completion of the ritual the participants fell unconscious and were reborn as vampires, their avatars destroyed and magical abilities lost. The mages had gained their immortality but lost the power they lived for. In time, the Tzimisce made war against House Tremere in retribution for the Fiends that had been made part of Goratrix's experiments. The Order of Hermes also became suspicious of diabolical practices being performed by the increasingly secretive House. In 1037 Tremere gathered the seven newly-made Cainites and forced the blood bond upon them. He then declared to them that House Tremere would be restructured with a new pyramid hierarchy, placing himself at the top as Primus of House and clan Tremere and his seven closest followers forming the Inner Council of Seven directly under him. They would slowly begin Embracing the rest of the House, with each initiate being bound to the Inner Council to ensure their loyalty. In time, all members of House Tremere would die or become vampires. While Tremere and Etrius pursued their own research throughout Europe in converting the hermetic arts into Thaumaturgy, Goratrix once again returned to his laboratories with his apprentices at hand. After years of experimentation on captured Tzimisce, Nosferatu, and Gangrel, he succeeded in creating a Gargoyle in 1121, and by 1125 the hybrids were serving as shock troops against the Fiends. Nevertheless, the Tremere found themselves third-class citizens among the undead. Whatever boldness Tremere had shown in entering the night was ignored by the staunchly traditionalist clans, and they were often forced from cities by princes who did not look kindly on their presumption. As he and Etrius rapidly acquired more vampiric lore they discovered the history of Caine and the Antediluvians, as well as the benefits of diablerie. Seeking to establish themselves as a clan proper, the Tremere sought a clan founder to diablerize and settled on Saulot, the enigmatic founder of the Salubri clan. In 1133, Tremere and the Inner Council discovered Saulot's tomb in the Anatolian desert. Tremere diablerized the Antediluvian and promptly entered torpor, leaving the Inner Council to lead the clan and destroy the remaining Salubri. As with everything else that the Tremere had done to this point, the result was a mixed blessing. The Tremere were entrenched in many Cainite courts, their services as mages making them indispensable to princes across Europe. They were now accepted as one of the Low Clans, albeit considered usurpers, distrusted warlocks, and known diablerists. In the early years of the 21st century, the Intellegence agencies of the United States managed to gain access to SchreckNet and gained firsthand knowledge of the existence of a race of undead bloodsuckers that were spread in all corners of the world. Sharing their knowledge with other intelligence agencies, the united secret services contacted the Vatican, whom they knew to have experience fighting the undead. After years of careful research, the Second Inquisition had targeted Vienna as the 'capital of vampires' and prepared a strike against their headquarters. In 2008, a united USSOCOM and Vatican ESOG force stormed the Vienna Chantry of Clan Tremere and destroyed it, blaming it to an ISIS terror attack to the public. London, Las Vegas, Paris, and Marseilles were largely cleared of vampiric activity, with numerous captured vampires being placed in black sites and experimented upon to discover their weaknesses. The Inner Council of Seven were slain and their Blood Bonds shattered. Since then the once monolithic Tremere structure has completely fallen apart."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Blood Sorcerer, Broken Clan, Pyramid, Usurpers, Warlock, Witch"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
                                      )
                                    ),
                                    Core.vx_new_string("Blood Magic"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Blood Magic")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Ventrue"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ventrue"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bluebloods, Manipulator, Know-it-all"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
                                      )
                                    ),
                                    Core.vx_new_string(":Domination"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Domination")
                                      )
                                    ),
                                    Core.vx_new_string(":Toughness"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Toughness")
                                      )
                                    )
                                  )
                                ),
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
                    ),
                    Core.vx_new_string("Vampires, Sabbat"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vampires, Sabbat"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Lasombra"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lasombra"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("ModernFantasy/Vampire_Lasombra.png"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dark Priest"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
                                      )
                                    )
                                  )
                                ),
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
                            Core.vx_new_string(":Tzimisce"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tzimisce"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("ModernFantasy/Vampire_Tzimisce.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Tzimisce take pleasure in shaping themselves into a variety of inhuman forms.  Distended skulls, elongated fingers, polychromatic mottling are often displayed to demonstrate their alien superiority."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Tzimisce's extensive use of Fleshcraft upon themselves, their servants, and their foes, have made them the most bizarre and alien of the Vampire clans. Fortunately, they are solitary by nature preferring isolated locale to practice their horrid techniques on their hapless prey.\n* Examples: Backroom Surgeon, Carny Folk, Dracula, Inquisitor, Kali, Mortician, Nazi Scientist, Tatoo Artist, Toturer, Vivisectionist"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Monster, Alien"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
                                      )
                                    ),
                                    Core.vx_new_string(":Fleshcraft"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Fleshcraft")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Intimidation"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Intimidation")
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
                    Core.vx_new_string("Vampires, Independent"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vampires, Independent"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Kuei-Jin"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kuei-Jin")
                              )
                            ),
                            Core.vx_new_string(":Setite"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Setite"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Vampirism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vampirism")
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
   * @function chapter_underground_creatures
   * @return {chapter}
   * (func chapter_underground_creatures)
   */
  public static interface Func_chapter_underground_creatures extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_underground_creatures();
  }

  public static class Class_chapter_underground_creatures extends Core.Class_base implements Func_chapter_underground_creatures {

    @Override
    public Func_chapter_underground_creatures vx_new(Object... vals) {
      Class_chapter_underground_creatures output = new Class_chapter_underground_creatures();
      return output;
    }

    @Override
    public Func_chapter_underground_creatures vx_copy(Object... vals) {
      Class_chapter_underground_creatures output = new Class_chapter_underground_creatures();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bestiary", // pkgname
        "chapter_underground_creatures", // name
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
    public Func_chapter_underground_creatures vx_empty() {return e_chapter_underground_creatures;}
    @Override
    public Func_chapter_underground_creatures vx_type() {return t_chapter_underground_creatures;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bestiary.f_chapter_underground_creatures();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_underground_creatures() {
      return Bestiary.f_chapter_underground_creatures();
    }

  }

  public static final Func_chapter_underground_creatures e_chapter_underground_creatures = new Bestiary.Class_chapter_underground_creatures();
  public static final Func_chapter_underground_creatures t_chapter_underground_creatures = new Bestiary.Class_chapter_underground_creatures();

  public static Base.Type_chapter f_chapter_underground_creatures() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Underground Creatures"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Centipedes"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Centipedes"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Poisonous Centipede"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poisonous Centipede")
                      )
                    ),
                    Core.vx_new_string("Amazonian Giant Centipede"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Amazonian Giant Centipede")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Worms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Worms"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Maggots"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Maggots")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Underground Creatures"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Underground Creatures"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bore Worms"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bore Worms"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Bring me... the Bore Worms. No! Not the BORE WORMS! - Klytus and Princess Aura, Flash Gordon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Small worms that dig through flesh as easily as earth. They are attracted to burrowing creatures.")
                      )
                    ),
                    Core.vx_new_string("False Hydra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("False Hydra"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An insane monster that grows under towns can erase memories. It is said that it is born of lies. Perhaps it is a [Curse].")
                      )
                    ),
                    Core.vx_new_string("Land Eel, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Land Eel, Giant"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Giant, sightless creatures related to the Giant Moray Eel, these creatures burrow underground."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Land Kra")
                      )
                    ),
                    Core.vx_new_string("Slug, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Slug, Giant")
                      )
                    ),
                    Core.vx_new_string("Snail, Giant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snail, Giant")
                      )
                    ),
                    Core.vx_new_string("Sand Worms"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sand Worms")
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
        "nx/tactics/books/bestiary", // pkgname
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
      output = Bestiary.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Bestiary.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Bestiary.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Bestiary.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Bestiary"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("FloraAndFauna.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Bestiary Overview"),
            Bestiary.f_chapter_bestiary_overview(),
            Core.vx_new_string("Amphibians"),
            Bestiary.f_chapter_amphibians(),
            Core.vx_new_string("Arthropods"),
            Bestiary.f_chapter_arthropods(),
            Core.vx_new_string("Avians"),
            Bestiary.f_chapter_avians(),
            Core.vx_new_string("Mammals/Marsupials"),
            Bestiary.f_chapter_mammals_marsupials(),
            Core.vx_new_string("Marine Creatures"),
            Bestiary.f_chapter_marine_creatures(),
            Core.vx_new_string("Reptiles"),
            Bestiary.f_chapter_reptiles(),
            Core.vx_new_string("Plants"),
            Bestiary.f_chapter_plants(),
            Core.vx_new_string("Microorganisms"),
            Bestiary.f_chapter_microorganisms(),
            Core.vx_new_string("Underground Creatures"),
            Bestiary.f_chapter_underground_creatures(),
            Core.vx_new_string("Humanoids"),
            Bestiary.f_chapter_humanoids(),
            Core.vx_new_string("Humanoids, Fantastic"),
            Bestiary.f_chapter_humanoids_fantastic(),
            Core.vx_new_string("Beastmen"),
            Bestiary.f_chapter_beastmen(),
            Core.vx_new_string("Constructs"),
            Bestiary.f_chapter_constructs(),
            Core.vx_new_string("Dragons"),
            Bestiary.f_chapter_dragons(),
            Core.vx_new_string("Elementals"),
            Bestiary.f_chapter_elementals(),
            Core.vx_new_string("Extra-Dimensional"),
            Bestiary.f_chapter_extra_dimensional(),
            Core.vx_new_string("Darkling"),
            Bestiary.f_chapter_darkling(),
            Core.vx_new_string("Giant Races"),
            Bestiary.f_chapter_giant_races(),
            Core.vx_new_string("Mythical Beasts"),
            Bestiary.f_chapter_mythical_beasts(),
            Core.vx_new_string("Shapeshifters"),
            Bestiary.f_chapter_shapeshifters(),
            Core.vx_new_string("Undead Creatures"),
            Bestiary.f_chapter_undead_creatures()
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
    mapfunc.put("chapter_amphibians", Bestiary.t_chapter_amphibians);
    mapfunc.put("chapter_arthropods", Bestiary.t_chapter_arthropods);
    mapfunc.put("chapter_avians", Bestiary.t_chapter_avians);
    mapfunc.put("chapter_beastmen", Bestiary.t_chapter_beastmen);
    mapfunc.put("chapter_bestiary_overview", Bestiary.t_chapter_bestiary_overview);
    mapfunc.put("chapter_constructs", Bestiary.t_chapter_constructs);
    mapfunc.put("chapter_darkling", Bestiary.t_chapter_darkling);
    mapfunc.put("chapter_dragons", Bestiary.t_chapter_dragons);
    mapfunc.put("chapter_elementals", Bestiary.t_chapter_elementals);
    mapfunc.put("chapter_extra-dimensional", Bestiary.t_chapter_extra_dimensional);
    mapfunc.put("chapter_giant_races", Bestiary.t_chapter_giant_races);
    mapfunc.put("chapter_humanoids", Bestiary.t_chapter_humanoids);
    mapfunc.put("chapter_humanoids_fantastic", Bestiary.t_chapter_humanoids_fantastic);
    mapfunc.put("chapter_mammals_marsupials", Bestiary.t_chapter_mammals_marsupials);
    mapfunc.put("chapter_marine_creatures", Bestiary.t_chapter_marine_creatures);
    mapfunc.put("chapter_microorganisms", Bestiary.t_chapter_microorganisms);
    mapfunc.put("chapter_mythical_beasts", Bestiary.t_chapter_mythical_beasts);
    mapfunc.put("chapter_plants", Bestiary.t_chapter_plants);
    mapfunc.put("chapter_reptiles", Bestiary.t_chapter_reptiles);
    mapfunc.put("chapter_shapeshifters", Bestiary.t_chapter_shapeshifters);
    mapfunc.put("chapter_undead_creatures", Bestiary.t_chapter_undead_creatures);
    mapfunc.put("chapter_underground_creatures", Bestiary.t_chapter_underground_creatures);
    mapfunc.put("tacticsbook", Bestiary.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/bestiary", maptype, mapconst, mapfunc);
  }

}
