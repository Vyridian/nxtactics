package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Bestiary {

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
            Core.f_new(
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
            ),
            Core.vx_new_string(":Amphibians"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Amphibians"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Arthropods"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Arthropods"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Avians"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Avians"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Mammals/Marsupials"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mammals/Marsupials"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Marine Creatures"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Marine Creatures"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Reptiles"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Reptiles"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Plants"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Plants"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Microorganisms"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Microorganisms"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Underground Creatures"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Underground Creatures"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Humanoids"),
            Core.f_new(
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
            ),
            Core.vx_new_string("Humanoids, Fantastic"),
            Core.f_new(
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
            ),
            Core.vx_new_string(":Beastmen"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Beastmen"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Constructs"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Constructs"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Dragons"),
            Core.f_new(
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
            ),
            Core.vx_new_string(":Elementals"),
            Core.f_new(
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
            ),
            Core.vx_new_string(":Extra-Dimensional"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Extra-Dimensional"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Darkling"),
            Core.f_new(
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
                                    Core.vx_new_string(":Melee"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Melee"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
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
            ),
            Core.vx_new_string("Giant Races"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Giant Races"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Mythical Beasts"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mythical Beasts"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Shapeshifters"),
            Core.f_new(
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
            ),
            Core.vx_new_string("Undead Creatures"),
            Core.f_new(
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
    mapfunc.put("tacticsbook", Bestiary.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/bestiary", maptype, mapconst, mapfunc);
  }

}
