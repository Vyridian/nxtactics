package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Gear {

  /**
   * @function chapter_gear_construction
   * @return {chapter}
   * (func chapter_gear_construction)
   */
  public static interface Func_chapter_gear_construction extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_gear_construction();
  }

  public static class Class_chapter_gear_construction extends Core.Class_base implements Func_chapter_gear_construction {

    @Override
    public Func_chapter_gear_construction vx_new(Object... vals) {
      Class_chapter_gear_construction output = new Class_chapter_gear_construction();
      return output;
    }

    @Override
    public Func_chapter_gear_construction vx_copy(Object... vals) {
      Class_chapter_gear_construction output = new Class_chapter_gear_construction();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/gear", // pkgname
        "chapter_gear_construction", // name
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
    public Func_chapter_gear_construction vx_empty() {return e_chapter_gear_construction;}
    @Override
    public Func_chapter_gear_construction vx_type() {return t_chapter_gear_construction;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Gear.f_chapter_gear_construction();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_gear_construction() {
      return Gear.f_chapter_gear_construction();
    }

  }

  public static final Func_chapter_gear_construction e_chapter_gear_construction = new Gear.Class_chapter_gear_construction();
  public static final Func_chapter_gear_construction t_chapter_gear_construction = new Gear.Class_chapter_gear_construction();

  public static Base.Type_chapter f_chapter_gear_construction() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Gear Construction")
      )
    );
    return output;
  }

  /**
   * @function chapter_gear_items
   * @return {chapter}
   * (func chapter_gear_items)
   */
  public static interface Func_chapter_gear_items extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_gear_items();
  }

  public static class Class_chapter_gear_items extends Core.Class_base implements Func_chapter_gear_items {

    @Override
    public Func_chapter_gear_items vx_new(Object... vals) {
      Class_chapter_gear_items output = new Class_chapter_gear_items();
      return output;
    }

    @Override
    public Func_chapter_gear_items vx_copy(Object... vals) {
      Class_chapter_gear_items output = new Class_chapter_gear_items();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/gear", // pkgname
        "chapter_gear_items", // name
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
    public Func_chapter_gear_items vx_empty() {return e_chapter_gear_items;}
    @Override
    public Func_chapter_gear_items vx_type() {return t_chapter_gear_items;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Gear.f_chapter_gear_items();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_gear_items() {
      return Gear.f_chapter_gear_items();
    }

  }

  public static final Func_chapter_gear_items e_chapter_gear_items = new Gear.Class_chapter_gear_items();
  public static final Func_chapter_gear_items t_chapter_gear_items = new Gear.Class_chapter_gear_items();

  public static Base.Type_chapter f_chapter_gear_items() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Gear Items"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Alchemical Devices"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alchemical Devices"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Alembic"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alembic")
                      )
                    ),
                    Core.vx_new_string(":Aludel"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aludel"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The philosophical vase of the alchemist.")
                      )
                    ),
                    Core.vx_new_string(":Athanor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Athanor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The philosophical furnace of the alchemist.")
                      )
                    ),
                    Core.vx_new_string(":Bellows"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bellows")
                      )
                    ),
                    Core.vx_new_string(":Blowtube"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blowtube")
                      )
                    ),
                    Core.vx_new_string(":Brazier"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brazier")
                      )
                    ),
                    Core.vx_new_string(":Cadeucus"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cadeucus")
                      )
                    ),
                    Core.vx_new_string(":Calcinator"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Calcinator")
                      )
                    ),
                    Core.vx_new_string(":Censer"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Censer")
                      )
                    ),
                    Core.vx_new_string(":Crucible"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crucible")
                      )
                    ),
                    Core.vx_new_string(":Glassware"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Glassware")
                      )
                    ),
                    Core.vx_new_string(":Hourglass"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hourglass")
                      )
                    ),
                    Core.vx_new_string(":Inkwell"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Inkwell")
                      )
                    ),
                    Core.vx_new_string("Mortar and Pestle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mortar and Pestle")
                      )
                    ),
                    Core.vx_new_string(":Piping"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Piping")
                      )
                    ),
                    Core.vx_new_string("Quill Pen"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quill Pen")
                      )
                    ),
                    Core.vx_new_string(":Retort"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Retort")
                      )
                    ),
                    Core.vx_new_string("Scrying Glass"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scrying Glass")
                      )
                    ),
                    Core.vx_new_string(":Tongs"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tongs")
                      )
                    ),
                    Core.vx_new_string(":Vial"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vial")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Poisons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Poisons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Narcotic Poison"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Narcotic Poison")
                      )
                    ),
                    Core.vx_new_string("Paralytic Poison"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Paralytic Poison")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Alchemical Substance"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alchemical Substance"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Alkahest"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alkahest"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The universal solvent, having the power to dissolve every substance into its\nconstituent elemental parts.  It cannot dissolve anything that is absolutely\npure."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Alchahest, Universal Solvent")
                      )
                    ),
                    Core.vx_new_string(":Aphrodisiac"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aphrodisiac")
                      )
                    ),
                    Core.vx_new_string("Aqua Fortis"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aqua Fortis"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Nitric acid.  Easier to make, lesser version of Aqua Regia."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Strong Water")
                      )
                    ),
                    Core.vx_new_string("Aqua Regia"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aqua Regia"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Highly corrosive acid made from Nitric and Hydrochloric acid.  It is one of the few reagents that dissolves gold\nand platinum."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Royal Water")
                      )
                    ),
                    Core.vx_new_string("Aqua Vitae"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aqua Vitae"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Magical liquid used to create artificial life, particularly the Homonculus."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Elixir of Vitality, Water of Life")
                      )
                    ),
                    Core.vx_new_string("Amber Crystal"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Amber Crystal")
                      )
                    ),
                    Core.vx_new_string("Antidote: Amnesia"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Amnesia")
                      )
                    ),
                    Core.vx_new_string("Antidote: Blindness"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Blindness")
                      )
                    ),
                    Core.vx_new_string("Antidote: Burns"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Burns")
                      )
                    ),
                    Core.vx_new_string("Antidote: Curse"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Curse")
                      )
                    ),
                    Core.vx_new_string("Antidote: Deafness"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Deafness")
                      )
                    ),
                    Core.vx_new_string("Antidote: Disease"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Disease")
                      )
                    ),
                    Core.vx_new_string("Antidote: Fear"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Fear")
                      )
                    ),
                    Core.vx_new_string("Antidote: Insanity"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Insanity")
                      )
                    ),
                    Core.vx_new_string("Antidote: Paralysis"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Paralysis")
                      )
                    ),
                    Core.vx_new_string("Antidote: Poison"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antidote: Poison")
                      )
                    ),
                    Core.vx_new_string("Devilroot Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Devilroot Powder")
                      )
                    ),
                    Core.vx_new_string(":Dipilatory"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dipilatory")
                      )
                    ),
                    Core.vx_new_string("Dream Essence"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dream Essence"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The elusive essence from which dreams are made.  It is gathered from a subject and\nthen distilled into a liquid.\n* The effects last for 2-8 hours and are very intense.\n* Effects vary by color:\n** Purple - Passion, Romance\n** Blue - Poignancy\n** Red - Violent Emotions\n** Silver - Imagination, Flights of Fancy\n** Gold - Prophetic Visions\n** Rainbow - Unpredictable\n** Black - Nightmares")
                      )
                    ),
                    Core.vx_new_string("Elixir of Clarity"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elixir of Clarity"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Effect]: [+1 Mind]")
                      )
                    ),
                    Core.vx_new_string("Elixir of Healing"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elixir of Healing")
                      )
                    ),
                    Core.vx_new_string("Elixir of Life"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elixir of Life"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Effect]: Extends lifespan by 10 years. Each use of this Elixir increases the difficulty of the next use.")
                      )
                    ),
                    Core.vx_new_string("Elixir of Regrowth"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elixir of Regrowth"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Effect: Drop into a coma and heals damage including repairing/regrowing damaged organs or\nlimbs.")
                      )
                    ),
                    Core.vx_new_string("Elixir of Strength"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elixir of Strength"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Effect]: [+1 Body]")
                      )
                    ),
                    Core.vx_new_string("Essense of Longing"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Essense of Longing"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Perfume of Attraction")
                      )
                    ),
                    Core.vx_new_string("Essential Quicksilver"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Essential Quicksilver"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("A magically animate liquid metal used in the crafting of enchanted weapons.")
                      )
                    ),
                    Core.vx_new_string(":Glowball"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Glowball"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A glass ball that will radiate light like a torch for [Level] hours without\nrequiring air.")
                      )
                    ),
                    Core.vx_new_string(":Homonculyte"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Homonculyte")
                      )
                    ),
                    Core.vx_new_string("Ice Crystals"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ice Crystals"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Intense cold captured into powdery crystal form.")
                      )
                    ),
                    Core.vx_new_string("Incense of Conjuration"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Incense of Conjuration"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: Burn for +1 [Conjuration] for the next 5 turns.")
                      )
                    ),
                    Core.vx_new_string("Incense of Divination"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Incense of Divination"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: Burn for +1 [Divination] for the next 5 turns.")
                      )
                    ),
                    Core.vx_new_string("Incense of Dreaming"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Incense of Dreaming"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: Burn for +1 [Dreaming] for the next 5 turns.")
                      )
                    ),
                    Core.vx_new_string("Incense of Shamanism"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Incense of Shamanism"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: Burn for +1 [Shamanism] for the next 5 turns.")
                      )
                    ),
                    Core.vx_new_string("Lightning in a Bottle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lightning in a Bottle")
                      )
                    ),
                    Core.vx_new_string("Lyrium Potion"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lyrium Potion"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Natural Lyrium is a white, radioactive dust extracted from Uranium mines.\n* Lyrium Ore - Direct contact with lyrium ore produces nausea, blistering of the skin,\nand dementia.\n* Lyrium Potions - Lyrium dust can be mixed into a potion that bestows resistance to\nmagic to those who use it regularly. However, Lyrium is extremely physically and\npsychologically addictive not unlike heroin.\n* Chantry Templars are all required to take Lyrium regularly. The addictive qualities of\nLyrium ensure that the Templars remain under Chantry control.\n* History - It is thought that Lyrium is created from Ley Lines (Dragon Lines) traveling\nthrough the earth.\n* [Passive]: +1 [Defense] vs. any magical effect and -1 [Action] when using any magical\neffect."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Radium")
                      )
                    ),
                    Core.vx_new_string("Makeup of Beauty"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Makeup of Beauty")
                      )
                    ),
                    Core.vx_new_string("Mandrake Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mandrake Powder")
                      )
                    ),
                    Core.vx_new_string("Oil of Slipperiness"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oil of Slipperiness")
                      )
                    ),
                    Core.vx_new_string(":Panacea"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Panacea")
                      )
                    ),
                    Core.vx_new_string("Philosopher's Stone"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philosopher's Stone"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A legendary alchemical substance said to be capable of turning base metals\nsuch as lead into gold (chrysopoeia) or silver. It was also sometimes believed\nto be an elixir of life, useful for rejuvenation and possibly for achieving\nimmortality. For many centuries, it was the most sought-after goal in alchemy.\nThe philosophers' stone is the central symbol of alchemy, symbolizing\nperfection at its finest, enlightenment, and heavenly bliss. Efforts to\ndiscover the philosophers' stone were known as the Magnum Opus ('Great Work').\n* The first component of the philosopher's stone is Prima Materia: 'the first\nmatter of the stone is the very same with the first matter of all things.'"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Magnum Opus, Great Work, Stone of the Philosopher, Variable Mercury")
                      )
                    ),
                    Core.vx_new_string("Philtre of Courage"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philtre of Courage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Effect]: [+1 Spirit]")
                      )
                    ),
                    Core.vx_new_string("Philtre of Fear"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philtre of Fear"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Effect]: [-1 Spirit]")
                      )
                    ),
                    Core.vx_new_string("Philtre of Hate"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philtre of Hate")
                      )
                    ),
                    Core.vx_new_string("Philtre of Loyalty"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philtre of Loyalty")
                      )
                    ),
                    Core.vx_new_string("Philtre of Love"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philtre of Love"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Love Potion #9"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Love Potion, Potion of Passion")
                      )
                    ),
                    Core.vx_new_string("Philtre of Mirth"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philtre of Mirth")
                      )
                    ),
                    Core.vx_new_string("Philtre of Sorrow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philtre of Sorrow")
                      )
                    ),
                    Core.vx_new_string("Philtre of Trechery"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philtre of Trechery")
                      )
                    ),
                    Core.vx_new_string("Philtre of Violence"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Philtre of Violence"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Berserk Potion")
                      )
                    ),
                    Core.vx_new_string("Potion of Fire Resistance"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Potion of Fire Resistance"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Effect: +1 [Defense] vs. [Fire].")
                      )
                    ),
                    Core.vx_new_string("Potion of Grounding"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Potion of Grounding"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Effect: +1 [Defense] vs. [Electricity].")
                      )
                    ),
                    Core.vx_new_string("Potion of Healing"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Potion of Healing")
                      )
                    ),
                    Core.vx_new_string("Potion of Regeneration"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Potion of Regeneration")
                      )
                    ),
                    Core.vx_new_string("Potion of Restoration"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Potion of Restoration")
                      )
                    ),
                    Core.vx_new_string("Potion of Strength"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Potion of Strength")
                      )
                    ),
                    Core.vx_new_string("Potion of Venom"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Potion of Venom"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Effect: Body becomes a deadly storehouse of caustic venoms.  The blood,\nsweat, tears, and spit are all deadly weapons.  User is immune to its own\neffects and is also resistant to all poison, acid, and disease.")
                      )
                    ),
                    Core.vx_new_string("Potion of Warmth"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Potion of Warmth"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Effect: +1 [Defense] vs. [Cold].")
                      )
                    ),
                    Core.vx_new_string("Potion of Water Breathing"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Potion of Water Breathing")
                      )
                    ),
                    Core.vx_new_string("Prima Materia"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prima Materia"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The primitive formless base of all matter, the primal substance that may be\nchanged into any other matter."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aether, Akasha, Ether, Proteus, Quintessence")
                      )
                    ),
                    Core.vx_new_string("Rare Earths"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rare Earths"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Rare Earths are the most important of all alchemical ingredients because they are the catalysts that unleash the\ninnate powers of other ingredients."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Antimony, Cinnabar, Pitchblend, various salts, and metal oxides")
                      )
                    ),
                    Core.vx_new_string("Sleeping Potion"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sleeping Potion"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Sleeping Beauty"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Soporific")
                      )
                    ),
                    Core.vx_new_string(":Smokestick"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Smokestick"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An alchemically treated wooden stick that creates thick, opaque smoke when\nignited.")
                      )
                    ),
                    Core.vx_new_string(":Soulstone"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Soulstone")
                      )
                    ),
                    Core.vx_new_string("Soverign Glue"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Soverign Glue"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Universal Adhesive")
                      )
                    ),
                    Core.vx_new_string("Storm Crystals"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Storm Crystals")
                      )
                    ),
                    Core.vx_new_string(":Thunderstone"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Thunderstone"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A stone that emits a deafening sound when it is first struck againsts a\nhard surface.")
                      )
                    ),
                    Core.vx_new_string(":Tindertwig"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tindertwig"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("A match"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A sulfurous substance that ignites when rubbed against a rough surface.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Artifacts"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Artifacts"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Icy Manipulator"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Icy Manipulator"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: Roll vs. [Mind]. If successful, target loses its next [Action].")
                      )
                    ),
                    Core.vx_new_string("Zuran Orb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zuran Orb"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I will go to any length to achieve my goal. Eternal life is worth any sacrifice.\n- Zur the Enchanter, Magic the Gathering"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: -1 [Spirit] permanently. -2 Damage, -1 Critical, -10 Age.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Artwork"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Artwork"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bronze Sculpture"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bronze Sculpture")
                      )
                    ),
                    Core.vx_new_string("Calligraphed Scroll"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Calligraphed Scroll")
                      )
                    ),
                    Core.vx_new_string(":Carving"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Carving")
                      )
                    ),
                    Core.vx_new_string("Cave Drawing"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cave Drawing")
                      )
                    ),
                    Core.vx_new_string("Ceramic Vase"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ceramic Vase")
                      )
                    ),
                    Core.vx_new_string("Clay Pot"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clay Pot")
                      )
                    ),
                    Core.vx_new_string(":Goblet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Goblet")
                      )
                    ),
                    Core.vx_new_string("Fine China"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fine China")
                      )
                    ),
                    Core.vx_new_string("Iron Sculpture"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron Sculpture")
                      )
                    ),
                    Core.vx_new_string("Oriental Carpet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oriental Carpet")
                      )
                    ),
                    Core.vx_new_string("Landscape Painting"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Landscape Painting")
                      )
                    ),
                    Core.vx_new_string("Marble Sculpture"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marble Sculpture")
                      )
                    ),
                    Core.vx_new_string("Painted Fan"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Painted Fan")
                      )
                    ),
                    Core.vx_new_string("Painted Folding Screen"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Painted Folding Screen")
                      )
                    ),
                    Core.vx_new_string("Painted Scroll"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Painted Scroll")
                      )
                    ),
                    Core.vx_new_string("Portrait Painting"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Portrait Painting")
                      )
                    ),
                    Core.vx_new_string(":Scrimshaw"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scrimshaw")
                      )
                    ),
                    Core.vx_new_string("Silver Bowl"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Silver Bowl")
                      )
                    ),
                    Core.vx_new_string("Silver Cup"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Silver Cup")
                      )
                    ),
                    Core.vx_new_string("Silver Plate"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Silver Plate")
                      )
                    ),
                    Core.vx_new_string(":Silverware"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Silverware")
                      )
                    ),
                    Core.vx_new_string("Still Life Painting"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Still Life Painting")
                      )
                    ),
                    Core.vx_new_string("Stone Sculpture"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stone Sculpture")
                      )
                    ),
                    Core.vx_new_string("Wooden Sculpture"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wooden Sculpture")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Book Types"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Book Types"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Book, Musings, Notes, Scroll, Writings"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Almanac"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Almanac")
                      )
                    ),
                    Core.vx_new_string("Atlas of Maps"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Atlas of Maps")
                      )
                    ),
                    Core.vx_new_string(":Biography"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Biography")
                      )
                    ),
                    Core.vx_new_string("Book of Shadows"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Book of Shadows"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("A private journal, history or core religious text kept by practitioners.")
                      )
                    ),
                    Core.vx_new_string(":Codex"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Codex")
                      )
                    ),
                    Core.vx_new_string(":Encyclopedia"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Encyclopedia")
                      )
                    ),
                    Core.vx_new_string(":Fragments"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fragments")
                      )
                    ),
                    Core.vx_new_string(":Grimoire"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Grimoire"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("A set of rules for doing something and is a journal kept by practitioners containing\ninformation and contributions relevant to their specific field of study.")
                      )
                    ),
                    Core.vx_new_string(":Manual"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Manual")
                      )
                    ),
                    Core.vx_new_string(":Memoir"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Memoir")
                      )
                    ),
                    Core.vx_new_string(":Poems"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poems")
                      )
                    ),
                    Core.vx_new_string(":Spellbook"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spellbook")
                      )
                    ),
                    Core.vx_new_string(":Tome"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tome")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Books, Unique"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Books, Unique"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Book of Enoch"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Book of Enoch")
                      )
                    ),
                    Core.vx_new_string("Book of the Law"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Book of the Law")
                      )
                    ),
                    Core.vx_new_string("Charge of the Goddess"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Charge of the Goddess")
                      )
                    ),
                    Core.vx_new_string("I Ching"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("I Ching")
                      )
                    ),
                    Core.vx_new_string("Lemegeton Clavicula Salomonis"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lemegeton Clavicula Salomonis"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Lesser Key of Solomon")
                      )
                    ),
                    Core.vx_new_string("Liber Legis"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Liber Legis")
                      )
                    ),
                    Core.vx_new_string("Liber Null"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Liber Null")
                      )
                    ),
                    Core.vx_new_string("Malleus Maleficarum"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Malleus Maleficarum"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("One of the most famous medieval treatises on witches."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Hammer of Witches, Hexenhammer")
                      )
                    ),
                    Core.vx_new_string("Tabula Rasa"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tabula Rasa"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A unique blank stone tablet of unknown origin vaguely connected to the legends of the River Lethe.\n* If a person writes a description of a memory on the tablet, then the text will slowly fade from\nthe tablet and as it does the memory will also permanently fade from the user's mind. This item can\nbe used to remove trauma as well as reset unwanted skills and abilities.")
                      )
                    ),
                    Core.vx_new_string("Wiccan Rede"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wiccan Rede")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Clothing"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Clothing"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bracers"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bracers")
                      )
                    ),
                    Core.vx_new_string(":Circlet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Circlet")
                      )
                    ),
                    Core.vx_new_string(":Cloak"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cloak")
                      )
                    ),
                    Core.vx_new_string(":Collar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Collar")
                      )
                    ),
                    Core.vx_new_string(":Coronal"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Coronal")
                      )
                    ),
                    Core.vx_new_string(":Headdress"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Headdress")
                      )
                    ),
                    Core.vx_new_string(":Leggings"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leggings")
                      )
                    ),
                    Core.vx_new_string(":Mantle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mantle")
                      )
                    ),
                    Core.vx_new_string(":Mask"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mask")
                      )
                    ),
                    Core.vx_new_string(":Rainment"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rainment")
                      )
                    ),
                    Core.vx_new_string(":Robe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Robe")
                      )
                    ),
                    Core.vx_new_string(":Torque"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Torque")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Drugs"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Drugs"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* We had two bags of grass, seventy-five pellets of mescaline, five sheets of high-powered blotter acid, a saltshaker\nhalf-full of cocaine, and a whole galaxy of multi-colored uppers, downers, screamers, laughers... Also, a quart of\ntequila, a quart of rum, a case of beer, a pint of raw ether, and two dozen amyls...The only thing that really worried\nme was the ether.  There is nothing in the world more helpless and irresponsible and depraved than a man in the depths\nof an ether binge, and I knew we'd get into that rotten stuff pretty soon. - Raoul Duke, Fear and Loathing in Las\nVegas"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Amphetamine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Amphetamine"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Crank, Speed, Uppers")
                      )
                    ),
                    Core.vx_new_string(":Anesthetic"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anesthetic")
                      )
                    ),
                    Core.vx_new_string(":Anti-Fungal"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Fungal")
                      )
                    ),
                    Core.vx_new_string(":Anti-Parasitic"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Parasitic")
                      )
                    ),
                    Core.vx_new_string(":Antiseptic"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antiseptic")
                      )
                    ),
                    Core.vx_new_string(":Atropine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Atropine")
                      )
                    ),
                    Core.vx_new_string("Birth Control"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Birth Control")
                      )
                    ),
                    Core.vx_new_string(":Cocaine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cocaine")
                      )
                    ),
                    Core.vx_new_string("Crack Cocaine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crack Cocaine")
                      )
                    ),
                    Core.vx_new_string(":Depresant"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Depresant"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Downers")
                      )
                    ),
                    Core.vx_new_string(":Ecstasy"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ecstasy"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("XTC")
                      )
                    ),
                    Core.vx_new_string("Fertility Drug"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fertility Drug")
                      )
                    ),
                    Core.vx_new_string(":Hallucinogen"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hallucinogen")
                      )
                    ),
                    Core.vx_new_string(":Hashish"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hashish")
                      )
                    ),
                    Core.vx_new_string(":Heroin"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heroin")
                      )
                    ),
                    Core.vx_new_string(":LSD"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("LSD"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Acid")
                      )
                    ),
                    Core.vx_new_string(":Marijuana"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marijuana")
                      )
                    ),
                    Core.vx_new_string(":Mescaline"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mescaline"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Derived from the [Peyote] Plant")
                      )
                    ),
                    Core.vx_new_string(":Morphine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Morphine")
                      )
                    ),
                    Core.vx_new_string(":Sedative"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sedative")
                      )
                    ),
                    Core.vx_new_string(":Steroid"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steroid")
                      )
                    ),
                    Core.vx_new_string(":Stimulant"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stimulant")
                      )
                    ),
                    Core.vx_new_string(":Tranquilizer"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tranquilizer")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Food and Drink"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Food and Drink"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Ale"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ale")
                      )
                    ),
                    Core.vx_new_string(":Beer"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beer")
                      )
                    ),
                    Core.vx_new_string("Blossom Wine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blossom Wine")
                      )
                    ),
                    Core.vx_new_string(":Grog"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Grog")
                      )
                    ),
                    Core.vx_new_string("Fire Ale"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fire Ale")
                      )
                    ),
                    Core.vx_new_string(":Mead"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mead"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Fermented Honey")
                      )
                    ),
                    Core.vx_new_string("Mushroom Ale"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mushroom Ale")
                      )
                    ),
                    Core.vx_new_string(":Nectar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nectar")
                      )
                    ),
                    Core.vx_new_string(":Whiskey"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Whiskey")
                      )
                    ),
                    Core.vx_new_string(":Wine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wine")
                      )
                    ),
                    Core.vx_new_string(":Vinesap"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vinesap")
                      )
                    ),
                    Core.vx_new_string(":Vodka"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vodka")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Jewelry"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Jewelry"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Amulet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Amulet")
                      )
                    ),
                    Core.vx_new_string(":Anklet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anklet")
                      )
                    ),
                    Core.vx_new_string(":Bracelet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bracelet")
                      )
                    ),
                    Core.vx_new_string(":Brooch"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brooch"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Decorative Pin")
                      )
                    ),
                    Core.vx_new_string(":Cameo"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cameo")
                      )
                    ),
                    Core.vx_new_string(":Earring"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Earring")
                      )
                    ),
                    Core.vx_new_string(":Ingot"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ingot")
                      )
                    ),
                    Core.vx_new_string(":Medallion"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medallion")
                      )
                    ),
                    Core.vx_new_string(":Necklace"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Necklace")
                      )
                    ),
                    Core.vx_new_string(":Pendant"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pendant")
                      )
                    ),
                    Core.vx_new_string(":Ring"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ring")
                      )
                    ),
                    Core.vx_new_string(":Tiara"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tiara")
                      )
                    ),
                    Core.vx_new_string(":Torc"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Torc")
                      )
                    ),
                    Core.vx_new_string(":Valknut"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Valknut"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Purpose - The valknut pendant is a magical symbol for warrior types. The Valknut pendant is used by those who swear allegiance to Odin in both life and death and want to fight alongside the gods during Ragnarok. When a valknut is found, Odin is also near. This is true for engravings of the valknut as well as for those who decide to wear Odin’s symbol.\n* Description - Valknut literally translates into 'the knot of the fallen warriors.' This symbol is also strongly connected to the deceased as is apparent in its linguistic meaning. The symbol itself represents the 9 worlds of existence. It is created through the fierce binding of three triangles. The Valknut also has the power over both life and death, as it weaves both into a knot."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Knot of the Fallen Warriors")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Materials"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Materials"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Animal Hide"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Animal Hide")
                      )
                    ),
                    Core.vx_new_string(":Brass"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brass")
                      )
                    ),
                    Core.vx_new_string(":Bronze"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bronze")
                      )
                    ),
                    Core.vx_new_string(":Ceramic"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ceramic")
                      )
                    ),
                    Core.vx_new_string(":Clay"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clay")
                      )
                    ),
                    Core.vx_new_string(":Gauze"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gauze")
                      )
                    ),
                    Core.vx_new_string(":Glass"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Glass")
                      )
                    ),
                    Core.vx_new_string(":Gossamer"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gossamer")
                      )
                    ),
                    Core.vx_new_string(":Ice"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ice")
                      )
                    ),
                    Core.vx_new_string(":Iron"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iron")
                      )
                    ),
                    Core.vx_new_string(":Linen"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Linen")
                      )
                    ),
                    Core.vx_new_string(":Obsidian"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Obsidian")
                      )
                    ),
                    Core.vx_new_string(":Quartz"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quartz")
                      )
                    ),
                    Core.vx_new_string(":Snow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snow")
                      )
                    ),
                    Core.vx_new_string(":Soil"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Soil")
                      )
                    ),
                    Core.vx_new_string(":Stone"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stone")
                      )
                    ),
                    Core.vx_new_string(":Water"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Water")
                      )
                    ),
                    Core.vx_new_string(":Wind"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wind")
                      )
                    ),
                    Core.vx_new_string(":Wood"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wood")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Mechanisms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mechanisms"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Secret Compartment"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Secret Compartment")
                      )
                    ),
                    Core.vx_new_string("Secret Door"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Secret Door")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Precious Materials"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Precious Materials"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Amber"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Amber")
                      )
                    ),
                    Core.vx_new_string(":Amethyst"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Amethyst")
                      )
                    ),
                    Core.vx_new_string("Blue Diamond"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blue Diamond")
                      )
                    ),
                    Core.vx_new_string(":Copper"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Copper")
                      )
                    ),
                    Core.vx_new_string(":Diamond"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Diamond")
                      )
                    ),
                    Core.vx_new_string(":Electrum"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Electrum"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Electrum is a naturally occurring alloy of gold and silver, with trace amounts of\ncopper and other metals.\n* The color of electrum is pale yellow or yellowish-white.\n* It is usually a good conductor of electricity.\n* Electrum is much better for coinage than gold, mostly because it is harder and more\ndurable."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("White Gold")
                      )
                    ),
                    Core.vx_new_string(":Emerald"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Emerald")
                      )
                    ),
                    Core.vx_new_string(":Gold"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gold")
                      )
                    ),
                    Core.vx_new_string(":Moonstone"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Moonstone")
                      )
                    ),
                    Core.vx_new_string(":Onyx"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Onyx")
                      )
                    ),
                    Core.vx_new_string(":Pearl"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pearl")
                      )
                    ),
                    Core.vx_new_string("Rose Gold"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rose Gold"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Rose gold is a gold and copper alloy.  The higher the copper content the redder the\ncolor."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Red Gold")
                      )
                    ),
                    Core.vx_new_string(":Ruby"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ruby")
                      )
                    ),
                    Core.vx_new_string(":Sapphire"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sapphire")
                      )
                    ),
                    Core.vx_new_string(":Silver"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Silver"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Silver is a brilliant white metal with a luster that can take a high degree of polish.\n* It is very ductile and malleable (slightly harder than gold).\n* It has the highest electrical conductivity of all metals, even higher than copper\n* Among metals, pure silver has the highest thermal conductivity (only the non-metal\ndiamond's is higher), whitest color, and the highest optical reflectivity.\n* Jewellery and silverware are traditionally made from Sterling silver (Standard silver) an\nalloy of 92.5 % silver with 7.5% copper.  Sterling silver is harder than pure silver,\nand has a lower melting point.\n* It has certain antimicrobial activity.  Dilute solutions of silver nitrate can be used\nas disinfectants.  Silver-ions and silver compounds show a toxic effect on some\nbacteria, viruses, algae and fungi.  Its germicidal effects make silver utensils valued,\nand increase its value as jewelry.  The exact process of silver's germicidal effect is\nstill not well understood.\n* The name of the United Kingdom monetary unit 'pound' originally had the value of one\ntroy pound of sterling silver.\n* The words for 'silver' and 'money' are the same in at least 14 languages.\n* Hippocrates, the father of modern medicine, wrote that silver had beneficial healing\nand anti-disease properties, and the Phoenicians used to store water, wine, and vinegar\nin silver bottles to prevent spoiling.  In the early 1900s people would put silver\ndollars in milk bottles to prolong the milk's freshness.\n* Silver was believed to be a repellent against vampires; also, mirrors were originally\npolished silver, and as such, vampires allegedly cannot be seen in them because they\nhave no soul) and it was also believed that a werewolf, in his bestial form, could only\nbe killed by a weapon or bullet made of silver.  This has given rise to the term 'silver\nbullet', which is used to describe things that very effectively deal with one specific\nproblem.")
                      )
                    ),
                    Core.vx_new_string("Tiger's Eye"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tiger's Eye")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantastic Precious Materials"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantastic Precious Materials"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Adamant"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Adamant"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Requires: 10 carats of powdered blue diamonds and 1 pound of silver to create\n1 pound of Adamant.")
                      )
                    ),
                    Core.vx_new_string("Black Diamond"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Black Diamond")
                      )
                    ),
                    Core.vx_new_string(":Mithril"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mithril"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A steel alloy that is as strong as steel with only half the weight.  It is extremely\ndifficult to forge even for master smiths, so it is extremely rare and valuable."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Elven Steel, Titanium Steel")
                      )
                    ),
                    Core.vx_new_string(":Orichalcum"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Orichalcum"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* A legendary metal mentioned in several ancient writings, most notably the\nstory of Atlantis.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Religious Items"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Religious Items"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Holy Water"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Holy Water"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Holy Water consists of water with salt added that has been blessed in a ritual. Both water and salt are symbol of cleansing and disinfecting.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Musical Instruments"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Musical Instruments"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Banjo"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Banjo")
                      )
                    ),
                    Core.vx_new_string(":Bells"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bells")
                      )
                    ),
                    Core.vx_new_string(":Chime"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chime")
                      )
                    ),
                    Core.vx_new_string(":Drums"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Drums")
                      )
                    ),
                    Core.vx_new_string("Drums, Koto"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Drums, Koto")
                      )
                    ),
                    Core.vx_new_string("Drums, Timpani"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Drums, Timpani")
                      )
                    ),
                    Core.vx_new_string(":Gong"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gong")
                      )
                    ),
                    Core.vx_new_string(":Guitar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Guitar")
                      )
                    ),
                    Core.vx_new_string("Guitar, 12 String"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Guitar, 12 String")
                      )
                    ),
                    Core.vx_new_string("Guitar, Electric"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Guitar, Electric")
                      )
                    ),
                    Core.vx_new_string(":Flute"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flute")
                      )
                    ),
                    Core.vx_new_string("Flute, Pan"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flute, Pan")
                      )
                    ),
                    Core.vx_new_string(":Harmonica"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Harmonica")
                      )
                    ),
                    Core.vx_new_string(":Harp"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Harp")
                      )
                    ),
                    Core.vx_new_string(":Harpsicord"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Harpsicord")
                      )
                    ),
                    Core.vx_new_string(":Horn"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Horn")
                      )
                    ),
                    Core.vx_new_string("Horn, French"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Horn, French")
                      )
                    ),
                    Core.vx_new_string(":Juiceharp"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Juiceharp")
                      )
                    ),
                    Core.vx_new_string(":Lute"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lute")
                      )
                    ),
                    Core.vx_new_string(":Mandolin"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mandolin")
                      )
                    ),
                    Core.vx_new_string(":Piano"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Piano")
                      )
                    ),
                    Core.vx_new_string(":Pipes"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pipes")
                      )
                    ),
                    Core.vx_new_string(":Recorder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Recorder")
                      )
                    ),
                    Core.vx_new_string(":Sitar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sitar")
                      )
                    ),
                    Core.vx_new_string(":Tambour"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tambour")
                      )
                    ),
                    Core.vx_new_string(":Trombone"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Trombone")
                      )
                    ),
                    Core.vx_new_string(":Trumpet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Trumpet")
                      )
                    ),
                    Core.vx_new_string(":Violin"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Violin")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Powders"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Powders"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Amnesia Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Amnesia Powder"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Powder of Forgetfulness")
                      )
                    ),
                    Core.vx_new_string("Blinding Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blinding Powder"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Temporarily Blind a target.")
                      )
                    ),
                    Core.vx_new_string("Confusing Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Confusing Powder")
                      )
                    ),
                    Core.vx_new_string("Dust of Disappearing Trail"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dust of Disappearing Trail"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Resettles an area to make it appear as if no one has been there in a long\ntime.")
                      )
                    ),
                    Core.vx_new_string("Dust of Dryness"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dust of Dryness"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Evaporates water on contact. Destroys up to level^2 liters of water.")
                      )
                    ),
                    Core.vx_new_string("Exploding Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Exploding Powder")
                      )
                    ),
                    Core.vx_new_string("Flash Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flash Powder"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: Place a [Smoke] Terrain with 1 Duration Token on this unit's space.")
                      )
                    ),
                    Core.vx_new_string("Freezing Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Freezing Powder")
                      )
                    ),
                    Core.vx_new_string("Hallucination Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hallucination Powder")
                      )
                    ),
                    Core.vx_new_string("Incendiary Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Incendiary Powder"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dragon's Breath")
                      )
                    ),
                    Core.vx_new_string("Iocaine Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iocaine Powder"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* What you do not smell is called iocane powder. It is odorless, tasteless, dissolves instantly in liquid,\nand is among the more deadlier poisons known to man. - Man in Black\n* Iocane comes from Australia, as everyone knows! And Australia is entirely peopled with criminals. - Vizzini"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Arcenic Trioxide")
                      )
                    ),
                    Core.vx_new_string("Irritating Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Irritating Powder"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Itching Powder")
                      )
                    ),
                    Core.vx_new_string("Noxious Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Noxious Powder"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Powder of Nausea")
                      )
                    ),
                    Core.vx_new_string("Paralysing Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Paralysing Powder")
                      )
                    ),
                    Core.vx_new_string("Poison Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poison Powder")
                      )
                    ),
                    Core.vx_new_string("Powder of Desire"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Powder of Desire"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aphrodisiac Powder")
                      )
                    ),
                    Core.vx_new_string("Powder of False Death"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Powder of False Death"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A more powerful version of Sleeping Powder, that simulates death.")
                      )
                    ),
                    Core.vx_new_string("Powder of Fear"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Powder of Fear")
                      )
                    ),
                    Core.vx_new_string("Powder of Rage"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Powder of Rage")
                      )
                    ),
                    Core.vx_new_string("Sleeping Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sleeping Powder"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Morphius Powder")
                      )
                    ),
                    Core.vx_new_string("Smoke Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Smoke Powder")
                      )
                    ),
                    Core.vx_new_string("Vertigo Powder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vertigo Powder")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Ritual Items"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Ritual Items"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* holy oil, lamp, bell\n* [Dreamcatcher] - hung above the bed, is then used as a charm to protect sleeping children from nightmares.  &quot;Only good dreams would be allowed to filter through . . . Bad dreams would stay in the net, disappearing with the light of day.&quot;\n* Medicine Bag\n* Phylactery - An amulet to protect the wearer from harm, enclosing magical text, herbs, or relics."),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Athame"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Athame"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("As a masculine principle, it is often used in combination with the cup or Graal, as\nfeminine principle, and evokes the act of procreation, as symbol of universal\ncreativity."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Symbolizes Air, the Mental, and Masculinity.  Air appears as nothing, can\nonly be felt with subtle senses and never gripped and commanded.\n				* A ritual dagger"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Swords")
                      )
                    ),
                    Core.vx_new_string(":Graal"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Graal"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Symbolizes Water, the Emotional, and Feminity.  The emotions are tidal like\nthe the ocean, flowing like rivers and streams.\n				* As a feminie principle, it is often used in combination with the dagger or\n				Athame, as masculine principle, and evokes the act of procreation, as symbol\n				of universal creativity."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cup, Grail")
                      )
                    ),
                    Core.vx_new_string("Mummified Hand"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mummified Hand")
                      )
                    ),
                    Core.vx_new_string(":Pentacle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pentacle"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Units/Equipment/Pentacle.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Symbolizes Earth and the Physical\n				An amulet used in magical evocation, generally made of parchment, paper or metal, on\n				which the symbol of a spirit or energy being evoked is drawn.  It is often worn around\n				the neck, or placed within the triangle of evocation.  Protective symbols may also be\n				included (sometimes on the reverse), a common one being the five-point Seal of Solomon.\n				The pentacle is always drawn in one continuous stroke, earning it the title the 'endless\n				knot'."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Disks, Endless Knot, Stone")
                      )
                    ),
                    Core.vx_new_string("Ritual Claw"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ritual Claw")
                      )
                    ),
                    Core.vx_new_string("Shrunken Head"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shrunken Head")
                      )
                    ),
                    Core.vx_new_string(":Thurible"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Thurible"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Censer")
                      )
                    ),
                    Core.vx_new_string(":Tool"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tool")
                      )
                    ),
                    Core.vx_new_string(":Wand"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wand"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Symbolizes Fire, Energy, and the Spirtual")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Tools"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Tools"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Astrolabe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Astrolabe"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Astronomical computer for solving problems relating to time and the position of the Sun and stars in the sky.\nTo use an astrolabe, you adjust the moveable components to a specific date and time.  Once set, the entire sky,\nboth visible and invisible, is represented on the face of the instrument.  This allows a great many astronomical\nproblems to be solved in a very visual way.\n* Typical uses of the astrolabe include finding the time during the day or night, finding the time of a celestial\nevent such as sunrise or sunset and as a handy reference of celestial positions.")
                      )
                    ),
                    Core.vx_new_string(":Compass"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Compass")
                      )
                    ),
                    Core.vx_new_string("Jeweler's Loop"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jeweler's Loop")
                      )
                    ),
                    Core.vx_new_string(":Key"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Key")
                      )
                    ),
                    Core.vx_new_string(":Lodestone"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lodestone")
                      )
                    ),
                    Core.vx_new_string("Magifying Glass"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Magifying Glass")
                      )
                    ),
                    Core.vx_new_string("Magifying Glasses"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Magifying Glasses")
                      )
                    ),
                    Core.vx_new_string("Magifying Lenses"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Magifying Lenses")
                      )
                    ),
                    Core.vx_new_string(":Monicle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Monicle")
                      )
                    ),
                    Core.vx_new_string(":Pendulum"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pendulum")
                      )
                    ),
                    Core.vx_new_string(":Prism"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prism")
                      )
                    ),
                    Core.vx_new_string(":Scales"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scales")
                      )
                    ),
                    Core.vx_new_string(":Sextant"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sextant")
                      )
                    ),
                    Core.vx_new_string(":Telescope"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Telescope"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Spy Glass")
                      )
                    ),
                    Core.vx_new_string(":Weathervane"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weathervane")
                      )
                    ),
                    Core.vx_new_string(":Whistle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Whistle")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Traps"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Traps"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Caltrops"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Caltrops")
                      )
                    ),
                    Core.vx_new_string("Nightengail Floor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nightengail Floor"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Nijo Castle - Kyoto, Japan"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Floors designed to make a chirping sound when walked upon assuring that none could sneak through the corridors\nundetected.  Dry boards naturally creak under pressure, but these floors were designed so that the flooring nails\nrubbed against a jacket or clamp, causing chirping noises."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Uguisubari")
                      )
                    ),
                    Core.vx_new_string("Pressure Plate"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pressure Plate")
                      )
                    ),
                    Core.vx_new_string(":Tanglewire"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tanglewire")
                      )
                    ),
                    Core.vx_new_string(":Trapdoor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Trapdoor")
                      )
                    ),
                    Core.vx_new_string(":Tripwire"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tripwire")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Airship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Airship")
                      )
                    ),
                    Core.vx_new_string(":Barge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Barge")
                      )
                    ),
                    Core.vx_new_string(":Coracle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Coracle")
                      )
                    ),
                    Core.vx_new_string(":Duneship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duneship")
                      )
                    ),
                    Core.vx_new_string("Ice Schooner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ice Schooner")
                      )
                    ),
                    Core.vx_new_string(":Palanquin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Palanquin")
                      )
                    ),
                    Core.vx_new_string(":Skiff"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skiff")
                      )
                    ),
                    Core.vx_new_string("Wagon, Enclosed"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wagon, Enclosed")
                      )
                    ),
                    Core.vx_new_string("Wagon, Open"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wagon, Open")
                      )
                    )
                  )
                )
              )
            ),
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
    );
    return output;
  }

  /**
   * @function chapter_gear_overview
   * @return {chapter}
   * (func chapter_gear_overview)
   */
  public static interface Func_chapter_gear_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_gear_overview();
  }

  public static class Class_chapter_gear_overview extends Core.Class_base implements Func_chapter_gear_overview {

    @Override
    public Func_chapter_gear_overview vx_new(Object... vals) {
      Class_chapter_gear_overview output = new Class_chapter_gear_overview();
      return output;
    }

    @Override
    public Func_chapter_gear_overview vx_copy(Object... vals) {
      Class_chapter_gear_overview output = new Class_chapter_gear_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/gear", // pkgname
        "chapter_gear_overview", // name
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
    public Func_chapter_gear_overview vx_empty() {return e_chapter_gear_overview;}
    @Override
    public Func_chapter_gear_overview vx_type() {return t_chapter_gear_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Gear.f_chapter_gear_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_gear_overview() {
      return Gear.f_chapter_gear_overview();
    }

  }

  public static final Func_chapter_gear_overview e_chapter_gear_overview = new Gear.Class_chapter_gear_overview();
  public static final Func_chapter_gear_overview t_chapter_gear_overview = new Gear.Class_chapter_gear_overview();

  public static Base.Type_chapter f_chapter_gear_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
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
            Gear.f_chapter_gear_overview(),
            Core.vx_new_string("Gear Construction"),
            Gear.f_chapter_gear_construction(),
            Core.vx_new_string("Gear Items"),
            Gear.f_chapter_gear_items()
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
    mapfunc.put("chapter_gear_construction", Gear.t_chapter_gear_construction);
    mapfunc.put("chapter_gear_items", Gear.t_chapter_gear_items);
    mapfunc.put("chapter_gear_overview", Gear.t_chapter_gear_overview);
    mapfunc.put("tacticsbook", Gear.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/gear", maptype, mapconst, mapfunc);
  }

}
