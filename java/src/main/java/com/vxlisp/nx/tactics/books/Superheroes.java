package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Superheroes {

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
        "nx/tactics/books/superheroes", // pkgname
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
      output = Superheroes.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Superheroes.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Superheroes.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Superheroes.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Superheroes"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Superpowers.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Superheroes Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Superheroes Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Why Tactics: Superheroes?"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Why Tactics: Superheroes?")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Superhero Characters"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Superhero Characters"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Superhero Rules"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Superhero Rules"),
                        Core.vx_new_string(":rulemap"),
                        Core.f_new(
                          Base.t_rulemap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Super Powers"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Super Powers"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Superhero characters do not have a maximum Body, but their Combat Skills are limited to level 10 since they rely\non their powers more than skill.\n* Superpowers include abilities from all other genres.  Particularly relevent sections are: Magic, Martial Arts,\nMentalism, Modern, and Ancients.")
                              )
                            ),
                            Core.vx_new_string(":Heroes"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heroes"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Heroes live a life removed from normal men, yet they risk their lives to help others and battle evil.  Their\nmotives vary, but they are united in these common goals.\n* Many heroes hold themselves to a high standard, feeling that they must be better than the villians they pursue.\nTheir reward is a greater acceptance and aid from the public, police, and other heroes.\n* Other heroes may use dubious tactics and may therefore be mistaken for villains.\n* Super Hero Teams - The most powerful of these may establish public bases.")
                              )
                            ),
                            Core.vx_new_string(":Villians"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Villians"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Villians, like heroes, are driven, but their desires are far different from herores.\n* Power lust, revenge, rage, greed, and insanity are the typical motivations for villians.\n* Super Villian Groups - Fortunately, the most powerful villians usually cannot get along, but many of the weaker\nvillians see strength in numbers.")
                              )
                            ),
                            Core.vx_new_string(":Organizations"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Organizations"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Military - The study of superbeings has greatly advanced military science, so expect military units to possess\nexceptional equipment.\n* Special Agents - As with military advances, special agencies around the world have learned to adapt the a world\nof superbeings.  Unlike the military, clandestine groups are not particularly effected by superbeings since their\nwork is generally more subtle.  Security, however, is difficult to maintain with powerful beings with telepathic\nand stealh powers roaming the world.\n* Crime - Criminal groups can gain huge advantages from villians, but that blade cuts both ways so any group\ndealing with such powerful allies always maintain contingency plans.")
                              )
                            ),
                            Core.vx_new_string(":Cliches"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cliches"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Here's the plan. We get the warhead and we hold the world ransom for... ONE MILLION DOLLARS! - Dr. Evil, Austin\nPowers\n* Wait, aren't you even going to watch them? They could get away! No no no, I'm going to leave them alone and not\nactually witness them dying, I'm just gonna assume it all went to plan. What? - Dr. Evil, Austin Powers\n* He starts monologuing! He starts like, this prepared speech about how 'feeble' I am compared to him, how\n'inevitable' my defeat is, how 'the world...will soon...be his'...I mean, the guy has me on a platter and he won't\nshut up! - Lucius, The Incredibles"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Superhero stories are loaded with cliches.  The whole heroic adventure is a bit of cliche itself.\n* Conquer the World - Become so powerful that none can stand against you.\n* Blackmail - Destroy cities unless their demands are met.\n* Heist - Money is almost as strong a motivator for villians as power.\n* Having Fun - Villians enjoy their power and are not afraid to use it.  Vandalism and displays of power give some\nvillians a particular thrill.\n* Matching Wits - Some of the most egotistical villians feel that their victories would be too easy without pitting\ntheir own abilities against the heroes, and will actually tip their hands to force a confrontation.\n* Death Trap - Villians hate to see a hero die too quickly.  Better to let them fully comprehend their defeat\nbefore they die.\n* Threatening Innocents - This is a favorite of villians as it underscores the difference between the heroes heroes\nand the villians.  Some villians, however, find hiding behind bystanders to be cowardly.\n* Playing Possum - Often a villian may seem defeated, but often have a last trick up their sleeve.\n* Killing Allies - Villians love to punish their own.  It shows how evil they are and is a great way to motivate\nothers by showing the price of failure or rebellion.\n* Monologing -\n* Escape Routes - Villians somehow manage to escape certain death on a regular basis.  They are always well\nprepared, and they also seem almost as lucky as the heroes.")
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
            Core.vx_new_string("DC Universe"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("DC Universe"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Villains"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Villains"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Brainiac"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brainiac"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Brainiac.png"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Mastermind"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mastermind")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Catwoman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Catwoman"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Catwoman.png")
                              )
                            ),
                            Core.vx_new_string(":Darkseid"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Darkseid"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Darkseid.png"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Mastermind"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mastermind")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Joker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Joker"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Joker.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* You won't kill me out of some misplaced sense of self-righteousness,\nand I won't kill you because you're just too much fun. I think you and\nI are destined to do this forever."),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Mastermind"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mastermind")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Sinestro"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sinestro"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Sinestro.png")
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
            Core.vx_new_string("Dragonball Z"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Dragonball Z"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Dragon Ball Villains"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dragon Ball Villains"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Cell"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cell"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Cell.png"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Cell Android"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Cell Android"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("32"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Imperfect Cell"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Imperfect Cell")
                                              )
                                            ),
                                            Core.vx_new_string("Second Form Cell"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Second Form Cell")
                                              )
                                            ),
                                            Core.vx_new_string("Perfect Cell"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Perfect Cell")
                                              )
                                            ),
                                            Core.vx_new_string("Super Perfect Cell"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Super Perfect Cell")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Spawning"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Spawning"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Copy Self"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Copy Self")
                                              )
                                            ),
                                            Core.vx_new_string(":Offspring"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Offspring")
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
                            Core.vx_new_string(":Cooler"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cooler"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Cooler.png"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Friezas"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Friezas"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("26"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Death Ball"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Death Ball")
                                              )
                                            ),
                                            Core.vx_new_string("Death Beam"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Death Beam")
                                              )
                                            ),
                                            Core.vx_new_string("Frieza Fourth Form"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Frieza Fourth Form")
                                              )
                                            ),
                                            Core.vx_new_string("Cooler Fifth Form"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Cooler Fifth Form")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Zenkai"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Zenkai"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Instant Transmission"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Instant Transmission")
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
                            Core.vx_new_string(":Frieza"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Frieza"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Frieza.png"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Friezas"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Friezas"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("25"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Death Ball"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Death Ball")
                                              )
                                            ),
                                            Core.vx_new_string("Death Beam"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Death Beam")
                                              )
                                            ),
                                            Core.vx_new_string("Frieza First Form"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Frieza First Form")
                                              )
                                            ),
                                            Core.vx_new_string("Frieza Second Form"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Frieza Second Form")
                                              )
                                            ),
                                            Core.vx_new_string("Frieza Third Form"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Frieza Third Form")
                                              )
                                            ),
                                            Core.vx_new_string("Frieza Fourth Form"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Frieza Fourth Form")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string("Mind Over Matter"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mind Over Matter"),
                                        Core.vx_new_string(":strength"),
                                        Core.vx_new_string("10Mtons")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Kid Buu"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kid Buu"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/KidBuu.png"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Flexible"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Flexible"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Arm Stretch"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Arm Stretch")
                                              )
                                            ),
                                            Core.vx_new_string("Body Stretch"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Body Stretch")
                                              )
                                            ),
                                            Core.vx_new_string("Bouncing Ball"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Bouncing Ball")
                                              )
                                            ),
                                            Core.vx_new_string(":Engulf"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Engulf")
                                              )
                                            ),
                                            Core.vx_new_string("Leg Stretch"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Leg Stretch")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Majins"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Majins"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("35"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Chocolate Beam"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Chocolate Beam")
                                              )
                                            ),
                                            Core.vx_new_string("Kid Buu Form"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Kid Buu Form")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Spawning"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Spawning"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Copy Self"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Copy Self")
                                              )
                                            ),
                                            Core.vx_new_string("Detach Body Parts"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Detach Body Parts")
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
                            Core.vx_new_string("Majin Buu"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Majin Buu"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/MajinBuu.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Buu, along with his creator Bibidi and Babidi have names that are most likely references to the magic words the\nfairy god mother uses in Cinderella, 'Bibidi, Babidi, Boo!'."),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Flexible"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Flexible"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Arm Stretch"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Arm Stretch")
                                              )
                                            ),
                                            Core.vx_new_string("Body Stretch"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Body Stretch")
                                              )
                                            ),
                                            Core.vx_new_string("Bouncing Ball"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Bouncing Ball")
                                              )
                                            ),
                                            Core.vx_new_string(":Engulf"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Engulf")
                                              )
                                            ),
                                            Core.vx_new_string("Leg Stretch"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Leg Stretch")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Majins"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Majins"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("33"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Chocolate Beam"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Chocolate Beam")
                                              )
                                            ),
                                            Core.vx_new_string("Fat Buu Form"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Fat Buu Form")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Spawning"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Spawning"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Copy Self"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Copy Self")
                                              )
                                            ),
                                            Core.vx_new_string("Detach Body Parts"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Detach Body Parts")
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
                            Core.vx_new_string(":Nappa"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nappa"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Saiyan"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Saiyan"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("17")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Omega Shenron"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Omega Shenron"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/OmegaShenron.png")
                              )
                            ),
                            Core.vx_new_string(":Raditz"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Raditz"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Saiyan"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Saiyan"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("15")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Saibaman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Saibaman"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Zenkai"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Zenkai"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("15")
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
            Core.vx_new_string("Marvel Universe"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Marvel Universe"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Marvel X-men"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marvel X-men"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Apocalypse"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Apocalypse"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Apocalypse.png"),
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
                                            Core.vx_new_string("Eternal Youth"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Eternal Youth")
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
                                    Core.vx_new_string(":Mastermind"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mastermind")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Black Queen"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Black Queen"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/BlackQueen.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Shaw: Did you have to kill all of them, Selene? Selene: No, I didn't, but I thought.. 'If I wasn't meant to eat people, I'm sure they would have been made less delicious.'... I don't want to live in a happy paradise. I don't want to be freed from my terrible curse. I want to eat people. - Sebatian Shaw and Selene - Fall of X"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Life-Force Absorption: by psionically draining the life forces of other human beings into herself, by physical touch. If she drained a person's entire life force from him or her, the victim dies and the victim's body crumbles into dust. It is unknown how often Selene must drain life force from another human in order to survive. It is known, that great expenditure of power causes Selene to age, but she can rejuvenate herself by absorbing more life force. Selene will not age as long as she maintains her supply of absorbed life force.\n* Psychic Vampire: If Selene drains only part of a victims life force, Selene achieves a measure of psychic control over her victim's mind. Through unknown means, Selene can cause a human being to become a psychic vampire like herself, but be subordinate to Selene's own will.\n* Physical Enhancement: Selene has physical strength, stamina, speed, and reaction time that are all several times greater than those of a normal woman.\n* Superhuman Speed: ability to momentarily move at speeds rivaling those of Quicksilver.\n* Shadow-Morphing: allowing her to dematerialize or use solid tendrills of darkness to manipulate objects\n* Telekinetic Animation: can cause inanimate objects to move according to her will by projecting part of her absorbed life force into them.\n* Inanimate Disintegration: She can cause inanimate objects in her presence to disintegrate. She cannot, however, rearrange the atomic or molecular structure of matter.\n* Pyrokinesis: can psionically generate and project intense heat and flame from and around her body or direct it at certain distances. She was also able to manipulate flame created from other sources and could magnify their intensity or snuff them. The flames Selene generated could also be illusory in effect; for example, she could focus the power on an object making it appear to be on fire while it was not being damaged by the flames at all. Selene instinctively created a psionic force field about her entire body that protected her from the effects of the heat and flame she created and from other sources as well\n* Telepathy: capable of displaying various psionic feats with the minds of others including reading and communicating with thoughts over vast distances.\n* Psi-Screen: possesses a psychic mental shield to protect her from psychic attacks.\n* Mental Bolts: can project psionic force bolts which have no physical effects but which can affect a victim's mind so as to cause the victim pain or unconsciousness.\n* Hypnotic Trance: can induce a momentary hypnotic trance state in people around her. Often used along with her speed to create the illusion of teleportation.\n* Immortal: her aging process is greatly retarded and she can apparently regenerate injured or missing cells from even near-fatal injuries.\n* Rapid Healing: ability to endure injuries (within unknown limits) without lasting harm or even feeling pain such as knife wounds.\n* Sorcery: possesses considerable magical abilities, having gained a great deal of mystical knowledge over the millennia. The number of magical effects that she can create has yet to be cataloged, but it is known that she can cast and counteract spells and summon extra-dimensional demons. Selene appears to age as she uses magic.\n* Teleportation:"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Selene Gallio"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Strength"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Strength"),
                                        Core.vx_new_string(":strength"),
                                        Core.vx_new_string("750kg")
                                      )
                                    ),
                                    Core.vx_new_string("Mind Over Matter"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mind Over Matter")
                                      )
                                    ),
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
                                            Core.vx_new_string("Eternal Youth"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Eternal Youth")
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
                            Core.vx_new_string("Cyclops, X-man"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cyclops, X-man"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Cyclops.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* His most powerful eye-blast is a beam 4 feet across which, at a distance of 50 feet, has a force of 500 pounds per square inch.\n* The beam's effective range is about 2,000 feet, at which point a 1-inch beam has spread out to 10 feet square, and then has a pressure of .38 pounds per square inch. Cyclops's maximum force is sufficient to tip over a filled 5,000 gallon tank at a distance of 20 feet, or puncture a 1-inch carbon-steel plate at a distance of 2 feet.")
                              )
                            ),
                            Core.vx_new_string("Emma Frost"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Emma Frost"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/WhiteQueen.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* There has never been a Scott who I couldn't make do whatever I wanted. - Emma Frost\n* Power is not what you are. Power is what you do. True queens are self-made, not appointed. And whether those who bestow the titles are gods, scientists or monarchs, Emma Frost kneels to no one... and everyone kneels to me. I am the divine Emma Frost and you've never been higher dying red-faced before me. - Emma Frost\n* Yes, WE rule the world. But the standard 'we' will go out of fashin soon enough... leaving the royal 'we' forever. - Emma Frost"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("White Queen")
                              )
                            ),
                            Core.vx_new_string(":Gambit"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gambit"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Gambit.png")
                              )
                            ),
                            Core.vx_new_string("Juggernaut, The"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Juggernaut, The"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Juggernaut.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I'm the Juggernaut, Bitch! - Juggernaut, X-men 2"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Strength"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Strength"),
                                        Core.vx_new_string(":strength"),
                                        Core.vx_new_string("100tons")
                                      )
                                    ),
                                    Core.vx_new_string(":Inertia"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Inertia"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Inertial Dampening"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Inertial Dampening")
                                              )
                                            ),
                                            Core.vx_new_string(":Unstoppable"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Unstoppable")
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
                            Core.vx_new_string(":Longshot"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Longshot"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Longshot.png")
                              )
                            ),
                            Core.vx_new_string(":Magneto"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magneto"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Magneto.png"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Magnetism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Magnetism"),
                                        Core.vx_new_string(":strength"),
                                        Core.vx_new_string("30ktons")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Mojo"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mojo"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Mojo.png"),
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
                                            Core.vx_new_string("Eternal Youth"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Eternal Youth")
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
                            Core.vx_new_string("Professor X"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Professor X"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/ProfessorX.png")
                              )
                            ),
                            Core.vx_new_string(":Psylocke"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Psylocke"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Psylocke.png")
                              )
                            ),
                            Core.vx_new_string("Rogue, X-man"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rogue, X-man"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Rogue.png"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Strength"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Strength"),
                                        Core.vx_new_string(":strength"),
                                        Core.vx_new_string("50tons")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Sabretooth"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sabretooth"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Sabretooth.png")
                              )
                            ),
                            Core.vx_new_string(":Spiral"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spiral"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Spiral.png"),
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
                                            Core.vx_new_string("Long Life"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Long Life")
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
                            Core.vx_new_string("Storm, X-man"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Storm, X-man"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Storm.png")
                              )
                            ),
                            Core.vx_new_string("Wolverine, The"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wolverine, The"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Superheroes/Wolverine.png"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Strength"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Strength"),
                                        Core.vx_new_string(":strength"),
                                        Core.vx_new_string("400kg")
                                      )
                                    ),
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
                                            Core.vx_new_string("Long Life"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Long Life")
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
            Core.vx_new_string("Original Groups"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Original Groups"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Extras"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Extras"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Samantha Hellerton"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Samantha Hellerton"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("I haven't been killed yet."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Miss Hellerton is an investigative reporter who will go to great lengths for a story. She has been kidnapped and shot at numerous times. She feels that getting directly involved gives her stories a personal and exclusive touch. She freelances for ABC radio and television in New York, and she makes a bundle for a good story. Her special reports are very popular, detailing her most recent adventures in the dangerous world of crime and power. To this end, she is always trying to top herself with increasingly risky and mindboggling news. Though she may seem sensationalist, she considers herself to be an excellent journalist and has no interest in altering or suppressing the facts. Her popularity and sincerity make her a favorite person to 'leak' information to. Her tendency to get into the thick of a situation maker her somewhat of a menace to superheroes.\n* She is very energetic and disorganized bordering on hyperactive. She has fantastic luck, great skill as a journalist, and some photographic talent.\n* She has many contacts around the world (not one of which is reliable). She dislikes her brother intensely."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Sammy")
                              )
                            ),
                            Core.vx_new_string("Samuel Timothy Hellerton"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Samuel Timothy Hellerton"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Let me get this straight ... Is is not true that? ... Just answer the question!"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Samuel Hellerton is a no-nonsense assistant D.A. He has built himself up from the bottom, is sickeningly straight, and is very dedicated to the Law.\n* He is generally calm and matter of fact. He nevers smile but is otherwise courteous and amiable. In court, however, he suddenly transforms into a merciless, abusive interrogator.\n* He does not get along well with his sister. He doesn't understand her, and she can't stand him. They are so used to fighting that they have rules about what is acceptable to throw at each other.\n* Samuel is a talented lawyer. He has mastered the give and take of the justice system. He is also skilled with the many firearms he keeps as a hobby (his house is like a gunlocker). He has many contacts: some rich, some powerful, many shady. Most are not reliable, but he knows which ones are."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Sam, Assistant District Attorney Hellerton")
                              )
                            ),
                            Core.vx_new_string("David Spencer Grant"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("David Spencer Grant"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Sergeant Grant is a middle-aged, highly decorated enigma. He has been a police officer for 23 years, a sergeant for 17, and has long ago given up on a promotion. Everyone on the force respects him, though few like him.\n* He has a macho image that he enforces to excess and is a card carrying male chauvanist pig. Socially, he can be obnoxious and irritating. For all his surly nature, he will do the right thing when the chips are down.\n* He is growing a pot belly, and he wears sunglasses even at night. He gave up smoking 2 years ago, but has never quite gotten over them."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Sergeant Grant")
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
    mapfunc.put("tacticsbook", Superheroes.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/superheroes", maptype, mapconst, mapfunc);
  }

}
